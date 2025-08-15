/*
 * MIT License
 *
 * Copyright (c) 2025 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

package overrungl.gen.file

import overrungl.gen.*
import java.nio.file.Files
import kotlin.io.path.Path
import kotlin.io.path.createParentDirectories

/**
 * the definition file is often suffixed with `.gen`.
 *
 * `#define`: this is not a real preprocessor. it defines how the macro will be represented in java field.
 *
 * @author squid233
 * @since 0.1.0
 */
class DefinitionFile(filename: String? = null, rawSourceString: String? = null) {
    val interpreter: Interpreter = Interpreter()

    init {
        if (filename == null && rawSourceString == null) error("filename or source can't be null")
        if (filename != null && rawSourceString != null) error("filename and source can't be both nonnull")
        if (filename != null) {
            (ClassLoader.getSystemResourceAsStream(filename) ?: error("can't load file $filename")).bufferedReader()
                .use {
                    val tokens = Lexer(it.readText()).tokenize()
                    val parse = Parser(tokens).parse()
                    interpreter.interpret(parse)
                }
        } else if (rawSourceString != null) {
            val tokens = Lexer(rawSourceString).tokenize()
            val parse = Parser(tokens).parse()
            interpreter.interpret(parse)
        }
    }

    private fun compileUpcall(
        fallbackPackageName: String,
        className: String,
        upcallType: UpcallType
    ) {
        val packageName = upcallType.packageName ?: fallbackPackageName
        val basePath = Path(packageName.replace('.', '/'), "$className.java")
        val path = Path("src/main/generated/").resolve(basePath)
        path.createParentDirectories()
        val sb = StringBuilder()
        sb.appendLine(commentedFileHeader)
        sb.appendLine(formatter_off)
        sb.appendLine(
            """
                |package $packageName;
                |
                |import java.lang.foreign.*;
                |import java.lang.invoke.*;
                |import overrungl.internal.*;
                |import overrungl.upcall.*;
                |import overrungl.util.*;
                |
                |/// ```
                |/// typedef ${upcallType.originalName};
                |/// ```
                |@FunctionalInterface
                |public interface $className extends Upcall {
            """.trimMargin()
        )

        // descriptor
        val hasDynamicValueType = upcallType.returnType is DynamicValueType
            || upcallType.parameters.any { it.memoryLayoutWithDimensions is DefTypeDynamicValueLayout }
        sb.appendLine("    /// The function descriptor.")
        sb.append("    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of")
        if (upcallType.returnType is VoidType) {
            sb.append("Void(")
        } else {
            sb.append("(${upcallType.returnType.memoryLayout.memoryLayout}")
            if (upcallType.parameters.isNotEmpty()) {
                sb.append(", ")
            }
        }
        sb.append(upcallType.parameters.joinToString { p -> p.memoryLayoutWithDimensions.memoryLayout!! })
        sb.appendLine(");")
        nativeImageUpcallDescriptors.add("$packageName.$className.DESCRIPTOR")

        // handle
        sb.appendLine(
            """
                |    /// The method handle of the target method.
                |    MethodHandle HANDLE = Upcall.findTarget($className.class, ${
                if (hasDynamicValueType) """RuntimeHelper.upcallTarget("invoke", DESCRIPTOR)"""
                else """"invoke_""""
            }, DESCRIPTOR);
                |
            """.trimMargin()
        )

        // allocate
        sb.appendLine(
            """
                |    /// Allocates `$className`.
                |    /// @param arena the arena
                |    /// @param func  the function
                |    /// @return the upcall stub
                |    static MemorySegment alloc(Arena arena, $className func) {
                |        if (func == null) return MemorySegment.NULL;
                |        return func.stub(arena);
                |    }
                |
            """.trimMargin()
        )

        // lambda
        sb.appendLine(
            """
                |    /// The target method of the upcall.
                |    ${upcallType.returnType.javaType} invoke(${upcallType.parameters.joinToString { p -> "${p.type.javaType} ${p.name}" }});
                |
            """.trimMargin()
        )
        if (!hasDynamicValueType) {
            sb.appendLine(
                """
                    |    /// The target method of the upcall.
                    |    default ${upcallType.returnType.memoryLayout.carrier(null)} invoke_(${
                    upcallType.parameters.joinToString { p ->
                        "${p.memoryLayoutWithDimensions.carrier(null)} ${p.name}"
                    }
                }) {
                """.trimMargin()
            )
            sb.append("        ")
            if (upcallType.returnType !is VoidType) {
                sb.append("return ")
            }
            sb.appendLine(
                "${
                    upcallType.returnType.processor.processDowncall(
                        "invoke(${
                            upcallType.parameters.joinToString { p -> p.type.processor.processUpcall(p.name) }
                        })")
                };")
            sb.appendLine("    }")
            sb.appendLine()
        }

        // target methods
        if (hasDynamicValueType) {
            // 1. collect layouts
            val memoryLayoutList = LinkedHashSet<DefTypeMemoryLayout>()
            memoryLayoutList.add(upcallType.returnType.memoryLayout)
            upcallType.parameters.forEach { p ->
                memoryLayoutList.add(p.memoryLayoutWithDimensions)
            }
            // 2. combine
            var mapList = mutableListOf<MutableMap<String?, String?>>()
            memoryLayoutList.forEach { layout ->
                val actualTypes = layout.possibleActualTypes
                // if we have actual types
                if (actualTypes != null) {
                    // build a new list
                    val addedLists = mutableListOf<MutableMap<String?, String?>>()
                    actualTypes.forEach { type ->
                        if (mapList.isEmpty()) {
                            // new map
                            mapList.add(mutableMapOf(layout.memoryLayout to type))
                        } else {
                            // write to the previous map
                            mapList.forEach {
                                val copy = it.toMutableMap()
                                copy[layout.memoryLayout] = type
                                addedLists.add(copy)
                            }
                        }
                    }
                    mapList = addedLists
                } else {
                    // no actual type: simply write to each map
                    if (mapList.isEmpty()) {
                        mapList.add(mutableMapOf(layout.memoryLayout to null))
                    } else {
                        mapList.forEach {
                            it[layout.memoryLayout] = null
                        }
                    }
                }
            }

            mapList.forEach { map ->
                sb.appendLine(
                    """
                    |    /// The target method of the upcall. Chosen at runtime.
                    |    default ${upcallType.returnType.memoryLayout.carrier(map[upcallType.returnType.memoryLayout.memoryLayout])} invoke${
                        buildString {
                            append(upcallType.returnType.memoryLayout.asChar(map[upcallType.returnType.memoryLayout.memoryLayout]))
                            upcallType.parameters.forEach { p ->
                                append(p.memoryLayoutWithDimensions.asChar(map[p.memoryLayoutWithDimensions.memoryLayout]))
                            }
                        }
                    }(${
                        upcallType.parameters.joinToString { p ->
                            "${p.memoryLayoutWithDimensions.carrier(map[p.memoryLayoutWithDimensions.memoryLayout])} ${p.name}"
                        }
                    }) {
                """.trimMargin()
                )
                sb.append("        ")
                if (upcallType.returnType !is VoidType) {
                    sb.append("return ")
                }
                sb.append("invoke(")
                sb.append(upcallType.parameters.joinToString { p ->
                    p.type.processor.processUpcall(p.name)
                })
                sb.appendLine(");")
                sb.appendLine("    }")
                sb.appendLine()
            }
        }

        // stub
        sb.appendLine(
            """
                |    @Override
                |    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }
                |
            """.trimMargin()
        )

        sb.appendLine("}")
        writeString(path, sb.toString())
    }

    private fun compileGroupClass(
        fallbackPackageName: String,
        className: String,
        groupClass: GroupLayoutType
    ) {
        val packageName = groupClass.packageName ?: fallbackPackageName
        val basePath = Path(packageName.replace('.', '/'), "$className.java")
        val path = Path("src/main/generated/").resolve(basePath)
        path.createParentDirectories()
        val sb = StringBuilder()
        sb.appendLine(commentedFileHeader)
        sb.appendLine(formatter_off)
        sb.appendLine(
            """
            |package $packageName;
            |
            |import java.lang.foreign.*;
            |import java.lang.foreign.MemoryLayout.PathElement;
            |import java.lang.invoke.*;
            |import java.util.function.*;
            |import org.jspecify.annotations.*;
            |import overrungl.struct.*;
            |import overrungl.util.*;
        """.trimMargin()
        )
        sb.appendLine()
        groupClass.imports.forEach {
            sb.appendLine("import $it;")
        }
        if (groupClass.imports.isNotEmpty()) {
            sb.appendLine()
        }
        sb.appendLine("/// Represents `${groupClass.name}`.")
        sb.appendLine("/// ## Layout")
        sb.appendLine("/// ```")
        sb.appendLine("/// ${groupClass.kind.typedef} ${groupClass.name} {")
        groupClass.members.forEach {
            sb.append(
                "///     ${it.pair.type.originalName} ${it.pair.name}${
                    if (it.pair.dimensions.isNotEmpty()) it.pair.dimensions.joinToString("") { d -> "[$d]" }
                    else ""
                }"
            )
            if (it.bits != null) {
                sb.append(" : ${it.bits}")
            }
            sb.appendLine(";")
        }
        sb.appendLine("/// };")
        sb.appendLine("/// ```")
        sb.appendLine("public final class $className extends GroupType {")

        // layout
        sb.appendLine("    /// The ${groupClass.kind.typedef} layout of `$className`.")
        sb.appendLine("    public static final ${groupClass.kind.memoryLayoutType} LAYOUT = ${groupClass.kind.layoutBuilder}(")
        groupClass.members.forEachIndexed { index, it ->
            sb.append("""        ${groupMemberLayout(it.pair).memoryLayout}.withName("${it.pair.name}")""")
            if (groupClass.kind == GroupTypeKind.BITFIELD) {
                sb.append(", ")
                if (it.bits != null) {
                    sb.append(it.bits)
                } else {
                    sb.append("-1")
                }
            }
            if (index + 1 == groupClass.members.size) {
                sb.appendLine()
            } else {
                sb.appendLine(",")
            }
        }
        sb.appendLine("    );")

        // var handles
        groupClass.members.forEach { member ->
            if (member.bits != null) {
                //TODO
                println("warning: skipping $className::${member.pair.name}")
                return@forEach
            }
            sb.appendLine("    /// The byte offset of `${member.pair.name}`.")
            sb.appendLine("""    public static final long OFFSET_${member.pair.name} = LAYOUT.byteOffset(PathElement.groupElement("${member.pair.name}"));""")
            sb.appendLine("    /// The memory layout of `${member.pair.name}`.")
            sb.appendLine("""    public static final MemoryLayout LAYOUT_${member.pair.name} = LAYOUT.select(PathElement.groupElement("${member.pair.name}"));""")
            if (member.pair.type !is GroupLayoutType) {
                sb.append("    /// The [VarHandle] of `${member.pair.name}` of type `(MemorySegment base, long baseOffset, long index")
                member.pair.dimensions.forEachIndexed { index, _ ->
                    sb.append(", long index$index")
                }
                sb.appendLine(")MemorySegment`.")
                sb.append("""    public static final VarHandle VH_${member.pair.name} = LAYOUT.arrayElementVarHandle(PathElement.groupElement("${member.pair.name}")""")
                member.pair.dimensions.forEach { _ ->
                    sb.append(", PathElement.sequenceElement()")
                }
                sb.appendLine(");")
            }
        }
        sb.appendLine()

        // constructor
        sb.appendLine(
            """
                |    /// Creates `$className` with the given segment.
                |    /// @param segment      the memory segment
                |    /// @param elementCount the element count of this ${groupClass.kind.typedef} buffer
                |    public $className(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }
                |
            """.trimMargin()
        )

        // allocator
        sb.appendLine(
            """
                |    /// Creates `$className` with the given segment.
                |    /// @param segment the memory segment
                |    /// @return the created instance or `null` if the segment is `NULL`
                |    public static $className of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new $className(segment, estimateCount(segment, LAYOUT)); }
                |
                |    /// Creates `$className` with the given segment.
                |    ///
                |    /// Reinterprets the segment if zero-length.
                |    /// @param segment the memory segment
                |    /// @return the created instance or `null` if the segment is `NULL`
                |    public static $className ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new $className(segment.reinterpret(LAYOUT.byteSize()), 1); }
                |
                |    /// Creates `$className` with the given segment.
                |    ///
                |    /// Reinterprets the segment if zero-length.
                |    /// @param segment the memory segment
                |    /// @param count   the count of the buffer
                |    /// @return the created instance or `null` if the segment is `NULL`
                |    public static $className ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new $className(segment.reinterpret(LAYOUT.scale(0, count)), count); }
                |
                |    /// Allocates a `$className` with the given segment allocator.
                |    /// @param allocator the segment allocator
                |    /// @return the allocated `$className`
                |    public static $className alloc(SegmentAllocator allocator) { return new $className(allocator.allocate(LAYOUT), 1); }
                |
                |    /// Allocates a `$className` with the given segment allocator and count.
                |    /// @param allocator the segment allocator
                |    /// @param count     the count
                |    /// @return the allocated `$className`
                |    public static $className alloc(SegmentAllocator allocator, long count) { return new $className(allocator.allocate(LAYOUT, count), count); }
                |
            """.trimMargin()
        )

        sb.appendLine(
            """
                |    /// Copies from the given source.
                |    /// @param src the source
                |    /// @return `this`
                |    public $className copyFrom($className src) { this.segment().copyFrom(src.segment()); return this; }

                |    /// Reinterprets this buffer with the given count.
                |    /// @param count the new count
                |    /// @return the reinterpreted buffer
                |    public $className reinterpret(long count) { return new $className(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }
                |
            """.trimMargin()
        )

        // members
        groupClass.members.forEach { member ->
            if (member.bits != null) {
                //TODO
                return@forEach
            }

            // static getters
            sb.appendLine(
                """
                    |    /// {@return `${member.pair.name}` at the given index}
                    |    /// @param segment the segment of the ${groupClass.kind.typedef}
                    |    /// @param index the index of the ${groupClass.kind.typedef} buffer
                """.trimMargin()
            )
            if (member.pair.type is GroupLayoutType || member.pair.dimensions.isNotEmpty()) {
                sb.appendLine("    public static MemorySegment ${member.pair.name}(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_${member.pair.name}, index), LAYOUT_${member.pair.name}); }")
                if (member.pair.type !is GroupLayoutType && member.pair.dimensions.isNotEmpty()) {
                    sb.appendLine(
                        """
                            |    /// {@return `${member.pair.name}` at the given index}
                            |    /// @param segment the segment of the ${groupClass.kind.typedef}
                            |    /// @param index the index of the ${groupClass.kind.typedef} buffer
                        """.trimMargin()
                    )
                    member.pair.dimensions.forEachIndexed { index, _ ->
                        sb.appendLine("    /// @param index$index the Index $index of the array")
                    }
                    sb.append("    public static ${member.pair.type.memoryLayout.carrier(null)} ${member.pair.name}(MemorySegment segment, long index")
                    member.pair.dimensions.forEachIndexed { index, _ ->
                        sb.append(", long index$index")
                    }
                    sb.append(") { return (${member.pair.type.memoryLayout.carrier(null)}) VH_${member.pair.name}.get(segment, 0L, index")
                    member.pair.dimensions.forEachIndexed { index, _ ->
                        sb.append(", index$index")
                    }
                    sb.appendLine("); }")
                }
            } else {
                sb.append("    public static ${member.pair.type.javaType} ${member.pair.name}(MemorySegment segment, long index) { return ")
                sb.append(member.pair.type.processor.processUpcall(buildString {
                    if (member.pair.type !is DynamicValueType) {
                        append("(${member.pair.type.memoryLayout.carrier(null)}) ")
                    }
                    append("VH_${member.pair.name}.get(segment, 0L, index)")
                }))
                sb.appendLine("; }")
            }

            // instance getters
            sb.appendLine("    /// {@return `${member.pair.name}`}")
            if (member.pair.type is GroupLayoutType || member.pair.dimensions.isNotEmpty()) {
                sb.appendLine("    public MemorySegment ${member.pair.name}() { return ${member.pair.name}(this.segment(), 0L); }")
                if (member.pair.type !is GroupLayoutType && member.pair.dimensions.isNotEmpty()) {
                    sb.appendLine("    /// {@return `${member.pair.name}`}")
                    member.pair.dimensions.forEachIndexed { index, _ ->
                        sb.appendLine("    /// @param index$index the Index $index of the array")
                    }
                    sb.append("    public ${member.pair.type.memoryLayout.carrier(null)} ${member.pair.name}(")
                    member.pair.dimensions.forEachIndexed { index, _ ->
                        if (index != 0) sb.append(", ")
                        sb.append("long index$index")
                    }
                    sb.append(") { return ${member.pair.name}(this.segment(), 0L")
                    member.pair.dimensions.forEachIndexed { index, _ ->
                        sb.append(", index$index")
                    }
                    sb.appendLine("); }")
                }
            } else {
                sb.appendLine("    public ${member.pair.type.javaType} ${member.pair.name}() { return ${member.pair.name}(this.segment(), 0L); }")
            }

            // static setters
            sb.appendLine(
                """
                    |    /// Sets `${member.pair.name}` with the given value at the given index.
                    |    /// @param segment the segment of the ${groupClass.kind.typedef}
                    |    /// @param index the index of the ${groupClass.kind.typedef} buffer
                    |    /// @param value the value
                """.trimMargin()
            )
            if (member.pair.type is GroupLayoutType || member.pair.dimensions.isNotEmpty()) {
                sb.appendLine("    public static void ${member.pair.name}(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_${member.pair.name}, index), LAYOUT_${member.pair.name}.byteSize()); }")
                if (member.pair.type !is GroupLayoutType && member.pair.dimensions.isNotEmpty()) {
                    sb.appendLine(
                        """
                            |    /// Sets `${member.pair.name}` with the given value at the given index.
                            |    /// @param segment the segment of the ${groupClass.kind.typedef}
                            |    /// @param index the index of the ${groupClass.kind.typedef} buffer
                        """.trimMargin()
                    )
                    member.pair.dimensions.forEachIndexed { index, _ ->
                        sb.appendLine("    /// @param index$index the Index $index of the array")
                    }
                    sb.appendLine("    /// @param value the value")
                    sb.append("    public static void ${member.pair.name}(MemorySegment segment, long index")
                    member.pair.dimensions.forEachIndexed { index, _ ->
                        sb.append(", long index$index")
                    }
                    sb.append(", ${member.pair.type.memoryLayout.carrier(null)} value) { VH_${member.pair.name}.set(segment, 0L, index")
                    member.pair.dimensions.forEachIndexed { index, _ ->
                        sb.append(", index$index")
                    }
                    sb.appendLine(", value); }")
                }
            } else {
                sb.append("    public static void ${member.pair.name}(MemorySegment segment, long index, ${member.pair.type.javaType} value) {")
                sb.appendLine(
                    " VH_${member.pair.name}.set(segment, 0L, index, ${
                        member.pair.type.processor.processDowncall(
                            "value"
                        )
                    }); }"
                )
            }

            // instance setters
            sb.appendLine(
                """
                    |    /// Sets `${member.pair.name}` with the given value.
                    |    /// @param value the value
                    |    /// @return `this`
                """.trimMargin()
            )
            if (member.pair.type is GroupLayoutType || member.pair.dimensions.isNotEmpty()) {
                sb.appendLine("    public $className ${member.pair.name}(MemorySegment value) { ${member.pair.name}(this.segment(), 0L, value); return this; }")
                if (member.pair.type !is GroupLayoutType && member.pair.dimensions.isNotEmpty()) {
                    sb.appendLine("    /// Sets `${member.pair.name}` with the given value.")
                    member.pair.dimensions.forEachIndexed { index, _ ->
                        sb.appendLine("    /// @param index$index the Index $index of the array")
                    }
                    sb.appendLine("    /// @param value the value")
                    sb.appendLine("    /// @return `this`")
                    sb.append("    public $className ${member.pair.name}(")
                    member.pair.dimensions.forEachIndexed { index, _ ->
                        if (index != 0) sb.append(", ")
                        sb.append("long index$index")
                    }
                    sb.append(", ${member.pair.type.memoryLayout.carrier(null)} value) { ${member.pair.name}(this.segment(), 0L")
                    member.pair.dimensions.forEachIndexed { index, _ ->
                        sb.append(", index$index")
                    }
                    sb.appendLine(", value); return this; }")
                }
                if (member.pair.type is GroupLayoutType) {
                    val typeJavaName =
                        "${if (member.pair.type.packageName != null) "${member.pair.type.packageName}." else ""}${member.pair.type.name}"
                    sb.appendLine(
                        """
                            |    /// Accepts `${member.pair.name}` with the given function.
                            |    /// @param func the function
                            |    /// @return `this`
                            |    public $className ${member.pair.name}(Consumer<$typeJavaName> func) { func.accept($typeJavaName.of(${member.pair.name}())); return this; }
                        """.trimMargin()
                    )
                }
            } else {
                sb.appendLine("    public $className ${member.pair.name}(${member.pair.type.javaType} value) { ${member.pair.name}(this.segment(), 0L, value); return this; }")
            }

            sb.appendLine()
        }

        // buffer

        // slice
        sb.appendLine(
            """
                |    /// Creates a slice of `$className`.
                |    /// @param index the index of the ${groupClass.kind.typedef} buffer
                |    /// @return the slice of `$className`
                |    public $className asSlice(long index) { return new $className(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

                |    /// Creates a slice of `$className`.
                |    /// @param index the index of the ${groupClass.kind.typedef} buffer
                |    /// @param count the count
                |    /// @return the slice of `$className`
                |    public $className asSlice(long index, long count) { return new $className(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
            """.trimMargin()
        )
        sb.appendLine()

        // consumer
        sb.appendLine(
            """
                |    /// Visits `$className` buffer at the given index.
                |    /// @param index the index of this buffer
                |    /// @param func  the function to run with the slice of this buffer
                |    /// @return `this`
                |    public $className at(long index, Consumer<$className> func) { func.accept(asSlice(index)); return this; }
            """.trimMargin()
        )
        sb.appendLine()

        groupClass.members.forEach { member ->
            if (member.bits != null) {
                // TODO
                return@forEach
            }

            // instance getters
            sb.appendLine(
                """
                    |    /// {@return `${member.pair.name}` at the given index}
                    |    /// @param index the index of the ${groupClass.kind.typedef} buffer
                """.trimMargin()
            )
            if (member.pair.type is GroupLayoutType || member.pair.dimensions.isNotEmpty()) {
                sb.appendLine("    public MemorySegment ${member.pair.name}At(long index) { return ${member.pair.name}(this.segment(), index); }")
                if (member.pair.type !is GroupLayoutType && member.pair.dimensions.isNotEmpty()) {
                    sb.appendLine(
                        """
                            |    /// {@return `${member.pair.name}` at the given index}
                            |    /// @param index the index of the ${groupClass.kind.typedef} buffer
                        """.trimMargin()
                    )
                    member.pair.dimensions.forEachIndexed { index, _ ->
                        sb.appendLine("    /// @param index$index the Index $index of the array")
                    }
                    sb.append("        public ${member.pair.type.memoryLayout.carrier(null)} ${member.pair.name}At(long index")
                    member.pair.dimensions.forEachIndexed { index, _ ->
                        sb.append(", long index$index")
                    }
                    sb.append(") { return ${member.pair.name}(this.segment(), index")
                    member.pair.dimensions.forEachIndexed { index, _ ->
                        sb.append(", index$index")
                    }
                    sb.appendLine("); }")
                }
            } else {
                sb.appendLine("    public ${member.pair.type.javaType} ${member.pair.name}At(long index) { return ${member.pair.name}(this.segment(), index); }")
            }

            // instance setters
            sb.appendLine(
                """
                    |    /// Sets `${member.pair.name}` with the given value at the given index.
                    |    /// @param index the index of the ${groupClass.kind.typedef} buffer
                    |    /// @param value the value
                    |    /// @return `this`
                """.trimMargin()
            )
            if (member.pair.type is GroupLayoutType || member.pair.dimensions.isNotEmpty()) {
                sb.appendLine("    public $className ${member.pair.name}At(long index, MemorySegment value) { ${member.pair.name}(this.segment(), index, value); return this; }")
                if (member.pair.type !is GroupLayoutType && member.pair.dimensions.isNotEmpty()) {
                    sb.appendLine(
                        """
                            |    /// Sets `${member.pair.name}` with the given value at the given index.
                            |    /// @param index the index of the ${groupClass.kind.typedef} buffer
                        """.trimMargin()
                    )
                    member.pair.dimensions.forEachIndexed { index, _ ->
                        sb.appendLine("    /// @param index$index the Index $index of the array")
                    }
                    sb.appendLine("    /// @param value the value")
                    sb.appendLine("    /// @return `this`")
                    sb.append("    public $className ${member.pair.name}At(long index")
                    member.pair.dimensions.forEachIndexed { index, _ ->
                        sb.append(", long index$index")
                    }
                    sb.append(", ${member.pair.type.memoryLayout.carrier(null)} value) { ${member.pair.name}(this.segment(), index")
                    member.pair.dimensions.forEachIndexed { index, _ ->
                        sb.append(", index$index")
                    }
                    sb.appendLine(", value); return this; }")
                }
                if (member.pair.type is GroupLayoutType) {
                    val typeJavaName =
                        "${if (member.pair.type.packageName != null) "${member.pair.type.packageName}." else ""}${member.pair.type.name}"
                    sb.appendLine(
                        """
                            |    /// Accepts `${member.pair.name}` with the given function.
                            |    /// @param index the index of the ${groupClass.kind.typedef} buffer
                            |    /// @param func the function
                            |    /// @return `this`
                            |    public $className ${member.pair.name}At(long index, Consumer<$typeJavaName> func) { func.accept($typeJavaName.of(${member.pair.name}At(index))); return this; }
                        """.trimMargin()
                    )
                }
            } else {
                sb.appendLine(
                    "    public $className ${member.pair.name}At(long index, ${member.pair.type.javaType} value) {" +
                        " ${member.pair.name}(this.segment(), index, value); return this; }"
                )
            }

            sb.appendLine()
        }

        sb.appendLine("}")
        writeString(path, sb.toString())
    }

    private fun groupMemberLayout(pair: DefTypeNamePair): DefTypeMemoryLayout {
        var layout = pair.type.memoryLayout
        pair.dimensions.forEach {
            layout = DefTypeSequenceLayout(it, layout)
        }
        return layout
    }

    private fun compileDowncall(
        packageName: String,
        className: String,
        symbolLookup: String,
        writeWholeFile: Boolean
    ) {
        val basePath = Path(packageName.replace('.', '/'), "$className.java")
        val path = (if (writeWholeFile) Path("src/main/generated/")
        else Path("src/main/java/")).resolve(basePath)
        path.createParentDirectories()
        val sb = StringBuilder()

        if (!writeWholeFile) {
            sb.append("    ")
        }
        sb.appendLine(formatter_off)

        // fields
        sb.appendLine("    //region Fields")
        interpreter.macros.values.forEach {
            sb.appendLine(
                "    public static final ${it.type} ${it.name} = ${it.value};"
            )
        }
        interpreter.enums.forEach { (name, value) ->
            sb.appendLine(
                "    public static final int $name = $value;"
            )
        }
        sb.appendLine("    //endregion")

        sb.appendLine("    /// Method handles.")
        sb.appendLine("    public static final class Handles {")
        // method handles
        interpreter.functions.forEach { (entrypoint, func) ->
            if (func.body == null) {
                sb.append("        /// The method handle of [`$entrypoint`][")
                writeFunctionAsJavadocRef(sb, func)
                sb.appendLine("].")
                val functionDescriptor = functionDescriptor(func)
                sb.appendLine("        public static final MethodHandle MH_$entrypoint = downcallHandle($functionDescriptor);")
                nativeImageDowncallDescriptors.add(functionDescriptor)
            }
        }
        // function addresses
        interpreter.functions.forEach { (entrypoint, func) ->
            if (func.body == null) {
                sb.append("        /// The function address of [`$entrypoint`][")
                writeFunctionAsJavadocRef(sb, func)
                sb.appendLine("].")
                sb.appendLine("        public final MemorySegment PFN_$entrypoint;")
            }
        }
        sb.appendLine()
        sb.appendLine("        private Handles() {")
        sb.appendLine("            var _lookup = $symbolLookup;")
        interpreter.functions.forEach { (entrypoint, func) ->
            if (func.body == null) {
                sb.append("            PFN_$entrypoint = _lookup.")
                if (func.optional) {
                    sb.appendLine("""find("$entrypoint").orElse(MemorySegment.NULL);""")
                } else {
                    sb.appendLine("""findOrThrow("$entrypoint");""")
                }
            }
        }
        sb.appendLine("        }")
        sb.appendLine()
        sb.appendLine(
            """
                |        /// {@return this}
                |        public static Handles get() {
                |            final class Holder {
                |                static final Handles instance = new Handles();
                |            }
                |            return Holder.instance;
                |        }
            """.trimMargin()
        )
        sb.appendLine("    }")
        sb.appendLine()

        // functions
        interpreter.functions.forEach { (_, func) ->
            writeFunction(sb, func)
        }

        if (!writeWholeFile) {
            sb.append("    ")
        }
        sb.appendLine(formatter_on)

        val finalString = if (writeWholeFile) {
            sb.toString()
        } else {
            replaceCode(Files.readString(path), sb.toString())
        }
        writeString(path, finalString)
    }

    fun compileUpcalls(upcallPackageName: String) {
        interpreter.upcalls.forEach {
            val value = it.value
            compileUpcall(upcallPackageName, value.name, value)
        }
    }

    fun compileStructs(structPackageName: String) {
        interpreter.structs.forEach {
            val value = it.value
            if (!value.opaque) {
                compileGroupClass(structPackageName, value.name, value)
            }
        }
    }

    fun compile(
        packageName: String,
        className: String,
        symbolLookup: String,
        writeWholeFile: Boolean = false,
        structPackageName: String = packageName,
        upcallPackageName: String = packageName
    ) {
        compileUpcalls(upcallPackageName)
        compileStructs(structPackageName)
        compileDowncall(packageName, className, symbolLookup, writeWholeFile)
    }
}

fun functionDescriptor(func: DefinitionFunction) = buildString {
    append("FunctionDescriptor.of")
    if (func.returnType is VoidType) {
        append("Void(${func.parameters.joinToString { it.memoryLayoutWithDimensions.memoryLayout!! }}")
    } else {
        append("(")
        append(func.returnType.memoryLayout.memoryLayout)
        func.parameters.forEach {
            append(", ")
            append(it.memoryLayoutWithDimensions.memoryLayout)
        }
    }
    append(")")
}

val typesWithoutAnnotation = hashMapOf(
    "boolean" to null,
    "char" to null,
    "byte" to null,
    "short" to null,
    "int" to null,
    "long" to null,
    "float" to null,
    "double" to null,
    "void" to null
)

fun insertNonNullAnnotation(type: String) =
    if (typesWithoutAnnotation.containsKey(type)) type else "@NonNull $type"

fun writeFunction(
    sb: StringBuilder,
    func: DefinitionFunction,
    handlesInstance: String = "Handles.get()",
    staticMethod: Boolean = true
) {
    val hasDynamicType = func.returnType is DynamicValueType ||
        func.parameters.any { it.memoryLayoutWithDimensions is DefTypeDynamicValueLayout }

    sb.appendLine(
        """
            |    /// Invokes `${func.entrypoint}`.
            |    /// ```
            |    /// ${func.returnType.originalName} ${func.entrypoint}(${
            func.parameters.joinToString { p ->
                "${p.type.originalName} ${p.name}${
                    if (p.dimensions.isNotEmpty()) p.dimensions.joinToString("") { "[$it]" }
                    else ""
                }"
            }
        });
            |    /// ```
        """.trimMargin()
    )
    sb.append("    public ")
    if (staticMethod) {
        sb.append("static ")
    }
    sb.appendLine(
        "${insertNonNullAnnotation(func.returnType.javaType)} ${func.name}(${
            if (func.requireAllocator) "@NonNull SegmentAllocator __allocator${if (func.parameters.isNotEmpty()) ", " else ""}"
            else ""
        }${
            func.parameters.joinToString { p ->
                "${insertNonNullAnnotation(if (p.dimensions.isNotEmpty()) "MemorySegment" else p.type.javaType)} ${p.name}"
            }
        }) {")
    if (func.body != null) {
        sb.appendLine(func.body.prependIndent("        "))
    } else {
        if (func.optional) {
            sb.appendLine("""        if (MemoryUtil.isNullPointer($handlesInstance.PFN_${func.entrypoint})) throw new ${func.symbolNotFoundError}("Symbol not found: ${func.entrypoint}");""")
        }
        sb.append("        try { if (TRACE_DOWNCALLS) { traceDowncall(\"${func.entrypoint}\"")
        if (func.requireAllocator) sb.append(", __allocator")
        sb.append(func.parameters.joinToString("") { ", ${it.name}" })
        sb.appendLine("); }")
        sb.append("        ")
        if (func.returnType !is VoidType) {
            sb.append("return ")
        }
        sb.append(func.returnType.processor.processUpcall(buildString {
            if (func.returnType !is VoidType) {
                if (func.returnType !is DynamicValueType) {
                    // the actual type doesn't matter
                    append("(${func.returnType.memoryLayout.carrier(null)}) ")
                }
            }
            append("Handles.MH_${func.entrypoint}.${if (hasDynamicType) "invoke" else "invokeExact"}($handlesInstance.PFN_${func.entrypoint}")
            if (func.requireAllocator) {
                append(", __allocator")
            }
            func.parameters.forEach { p ->
                append(", ")
                append(p.type.processor.processDowncall(p.name))
            }
            append(")")
        }))
        sb.appendLine("; }")
        sb.appendLine("""        catch (Throwable e) { throw new RuntimeException("error in ${func.name}", e); }""")
    }
    sb.appendLine("    }")
    sb.appendLine()
}

fun writeFunctionAsJavadocRef(
    sb: StringBuilder,
    func: DefinitionFunction
) {
    sb.append("#")
    sb.append(func.name)
}

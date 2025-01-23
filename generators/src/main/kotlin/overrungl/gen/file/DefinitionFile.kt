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
class DefinitionFile(filename: String) {
    private val interpreter: Interpreter

    init {
        ClassLoader.getSystemResourceAsStream(filename)!!.bufferedReader().use {
            val tokens = Lexer(it.readText()).tokenize()
            val parse = Parser(tokens).parse()
            interpreter = Interpreter()
            interpreter.interpret(parse)
        }
    }

    private fun compileUpcall(packageName: String, className: String, upcallType: UpcallType) {
        val path = Path(packageName.replace('.', '/'), "$className.java")
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
                |/// Signature:
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
            val memoryLayoutList = mutableListOf<DefTypeMemoryLayout>()
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

    private fun compileGroupClass(packageName: String, className: String, groupClass: GroupLayoutType) {
        val path = Path(packageName.replace('.', '/'), "$className.java")
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
            |import overrungl.struct.*;
            |import overrungl.util.*;
            |
        """.trimMargin()
        )
        sb.appendLine("/// ## Layout")
        sb.appendLine("/// ```")
        sb.appendLine("/// ${groupClass.kind.typedef} ${groupClass.originalName} {")
        groupClass.members.forEach {
            sb.appendLine(
                "///     ${it.type.originalName} ${it.name}${
                    if (it.dimensions.isNotEmpty()) it.dimensions.joinToString("") { d -> "[$d]" }
                    else ""
                };"
            )
        }
        sb.appendLine("/// };")
        sb.appendLine("/// ```")
        sb.appendLine("public sealed class $className extends GroupType {")

        // layout
        sb.appendLine("    /// The ${groupClass.kind.typedef} layout of `$className`.")
        sb.appendLine("    public static final GroupLayout LAYOUT = ${groupClass.kind.layoutBuilder}(")
        groupClass.members.forEachIndexed { index, it ->
            sb.append("""        ${groupMemberLayout(it).memoryLayout}.withName("${it.name}")""")
            if (index + 1 == groupClass.members.size) {
                sb.appendLine()
            } else {
                sb.appendLine(",")
            }
        }
        sb.appendLine("    );")

        // var handles
        groupClass.members.forEach { member ->
            sb.appendLine("    /// The byte offset of `${member.name}`.")
            sb.appendLine("""    public static final long OFFSET_${member.name} = LAYOUT.byteOffset(PathElement.groupElement("${member.name}"));""")
            sb.appendLine("    /// The memory layout of `${member.name}`.")
            sb.appendLine("""    public static final MemoryLayout LAYOUT_${member.name} = LAYOUT.select(PathElement.groupElement("${member.name}"));""")
            if (member.type !is GroupLayoutType) {
                sb.append("    /// The [VarHandle] of `${member.name}` of type `(MemorySegment base, long baseOffset, long index")
                member.dimensions.forEachIndexed { index, _ ->
                    sb.append(", long index$index")
                }
                sb.appendLine(")MemorySegment`.")
                sb.append("""    public static final VarHandle VH_${member.name} = LAYOUT.arrayElementVarHandle(PathElement.groupElement("${member.name}")""")
                member.dimensions.forEach { _ ->
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
                |    /// @param segment the memory segment
                |    public $className(MemorySegment segment) { super(segment, LAYOUT); }
                |
            """.trimMargin()
        )

        // allocator
        sb.appendLine(
            """
                |    /// Creates `$className` with the given segment.
                |    /// @param segment the memory segment
                |    /// @return the created instance or `null` if the segment is `NULL`
                |    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }
                |
                |    /// Creates `$className` with the given segment.
                |    ///
                |    /// Reinterprets the segment if zero-length.
                |    /// @param segment the memory segment
                |    /// @return the created instance or `null` if the segment is `NULL`
                |    public static $className ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new $className(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }
                |
                |    /// Creates `$className` with the given segment.
                |    ///
                |    /// Reinterprets the segment if zero-length.
                |    /// @param segment the memory segment
                |    /// @param count   the count of the buffer
                |    /// @return the created instance or `null` if the segment is `NULL`
                |    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }
                |
                |    /// Allocates a `$className` with the given segment allocator.
                |    /// @param allocator the segment allocator
                |    /// @return the allocated `$className`
                |    public static $className alloc(SegmentAllocator allocator) { return new $className(allocator.allocate(LAYOUT)); }
                |
                |    /// Allocates a `$className` with the given segment allocator and count.
                |    /// @param allocator the segment allocator
                |    /// @param count     the count
                |    /// @return the allocated `$className`
                |    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }
                |
            """.trimMargin()
        )

        sb.appendLine(
            """
                |    /// Copies from the given source.
                |    /// @param src the source
                |    /// @return `this`
                |    public $className copyFrom($className src) { this.segment().copyFrom(src.segment()); return this; }

                |    /// Converts this instance to a buffer.
                |    /// @return the buffer
                |    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }
                |
            """.trimMargin()
        )

        // members
        groupClass.members.forEach { member ->
            // static getters
            sb.appendLine(
                """
                    |    /// {@return `${member.name}` at the given index}
                    |    /// @param segment the segment of the ${groupClass.kind.typedef}
                    |    /// @param index the index of the ${groupClass.kind.typedef} buffer
                """.trimMargin()
            )
            if (member.type is GroupLayoutType || member.dimensions.isNotEmpty()) {
                sb.appendLine("    public static MemorySegment ${member.name}(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_${member.name}, index), LAYOUT_${member.name}); }")
                if (member.type !is GroupLayoutType && member.dimensions.isNotEmpty()) {
                    sb.appendLine(
                        """
                            |    /// {@return `${member.name}` at the given index}
                            |    /// @param segment the segment of the ${groupClass.kind.typedef}
                            |    /// @param index the index of the ${groupClass.kind.typedef} buffer
                        """.trimMargin()
                    )
                    member.dimensions.forEachIndexed { index, _ ->
                        sb.appendLine("    /// @param index$index the Index $index of the array")
                    }
                    sb.append("    public static ${member.type.memoryLayout.carrier(null)} ${member.name}(MemorySegment segment, long index")
                    member.dimensions.forEachIndexed { index, _ ->
                        sb.append(", long index$index")
                    }
                    sb.append(") { return (${member.type.memoryLayout.carrier(null)}) VH_${member.name}.get(segment, 0L, index")
                    member.dimensions.forEachIndexed { index, _ ->
                        sb.append(", index$index")
                    }
                    sb.appendLine("); }")
                }
            } else {
                sb.append("    public static ${member.type.javaType} ${member.name}(MemorySegment segment, long index) { return ")
                sb.append(member.type.processor.processUpcall(buildString {
                    if (member.type !is DynamicValueType) {
                        append("(${member.type.memoryLayout.carrier(null)}) ")
                    }
                    append("VH_${member.name}.get(segment, 0L, index)")
                }))
                sb.appendLine("; }")
            }

            // instance getters
            sb.appendLine("    /// {@return `${member.name}`}")
            if (member.type is GroupLayoutType || member.dimensions.isNotEmpty()) {
                sb.appendLine("    public MemorySegment ${member.name}() { return ${member.name}(this.segment(), 0L); }")
                if (member.type !is GroupLayoutType && member.dimensions.isNotEmpty()) {
                    sb.appendLine("    /// {@return `${member.name}`}")
                    member.dimensions.forEachIndexed { index, _ ->
                        sb.appendLine("    /// @param index$index the Index $index of the array")
                    }
                    sb.append("    public ${member.type.memoryLayout.carrier(null)} ${member.name}(")
                    member.dimensions.forEachIndexed { index, _ ->
                        if (index != 0) sb.append(", ")
                        sb.append("long index$index")
                    }
                    sb.append(") { return ${member.name}(this.segment(), 0L")
                    member.dimensions.forEachIndexed { index, _ ->
                        sb.append(", index$index")
                    }
                    sb.appendLine("); }")
                }
            } else {
                sb.appendLine("    public ${member.type.javaType} ${member.name}() { return ${member.name}(this.segment(), 0L); }")
            }

            // static setters
            sb.appendLine(
                """
                    |    /// Sets `${member.name}` with the given value at the given index.
                    |    /// @param segment the segment of the ${groupClass.kind.typedef}
                    |    /// @param index the index of the ${groupClass.kind.typedef} buffer
                    |    /// @param value the value
                """.trimMargin()
            )
            if (member.type is GroupLayoutType || member.dimensions.isNotEmpty()) {
                sb.appendLine("    public static void ${member.name}(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_${member.name}, index), LAYOUT_${member.name}.byteSize()); }")
                if (member.type !is GroupLayoutType && member.dimensions.isNotEmpty()) {
                    sb.appendLine(
                        """
                            |    /// Sets `${member.name}` with the given value at the given index.
                            |    /// @param segment the segment of the ${groupClass.kind.typedef}
                            |    /// @param index the index of the ${groupClass.kind.typedef} buffer
                        """.trimMargin()
                    )
                    member.dimensions.forEachIndexed { index, _ ->
                        sb.appendLine("    /// @param index$index the Index $index of the array")
                    }
                    sb.appendLine("    /// @param value the value")
                    sb.append("    public static void ${member.name}(MemorySegment segment, long index")
                    member.dimensions.forEachIndexed { index, _ ->
                        sb.append(", long index$index")
                    }
                    sb.append(", ${member.type.memoryLayout.carrier(null)} value) { VH_${member.name}.set(segment, 0L, index")
                    member.dimensions.forEachIndexed { index, _ ->
                        sb.append(", index$index")
                    }
                    sb.appendLine(", value); }")
                }
            } else {
                sb.append("    public static void ${member.name}(MemorySegment segment, long index, ${member.type.javaType} value) {")
                sb.appendLine(" VH_${member.name}.set(segment, 0L, index, ${member.type.processor.processDowncall("value")}); }")
            }

            // instance setters
            sb.appendLine(
                """
                    |    /// Sets `${member.name}` with the given value.
                    |    /// @param value the value
                    |    /// @return `this`
                """.trimMargin()
            )
            if (member.type is GroupLayoutType || member.dimensions.isNotEmpty()) {
                sb.appendLine("    public $className ${member.name}(MemorySegment value) { ${member.name}(this.segment(), 0L, value); return this; }")
                if (member.type !is GroupLayoutType && member.dimensions.isNotEmpty()) {
                    sb.appendLine("    /// Sets `${member.name}` with the given value.")
                    member.dimensions.forEachIndexed { index, _ ->
                        sb.appendLine("    /// @param index$index the Index $index of the array")
                    }
                    sb.appendLine("    /// @param value the value")
                    sb.appendLine("    /// @return `this`")
                    sb.append("    public $className ${member.name}(")
                    member.dimensions.forEachIndexed { index, _ ->
                        if (index != 0) sb.append(", ")
                        sb.append("long index$index")
                    }
                    sb.append(", ${member.type.memoryLayout.carrier(null)} value) { ${member.name}(this.segment(), 0L")
                    member.dimensions.forEachIndexed { index, _ ->
                        sb.append(", index$index")
                    }
                    sb.appendLine(", value); return this; }")
                }
            } else {
                sb.appendLine("    public $className ${member.name}(${member.type.javaType} value) { ${member.name}(this.segment(), 0L, value); return this; }")
            }

            sb.appendLine()
        }

        // buffer
        sb.appendLine("    /// A buffer of [$className].")
        sb.appendLine("    public static final class Buffer extends $className {")
        sb.appendLine("        private final long elementCount;")
        sb.appendLine()

        // constructor
        sb.appendLine(
            """
                |        /// Creates `$className.Buffer` with the given segment.
                |        /// @param segment      the memory segment
                |        /// @param elementCount the element count
                |        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }
            """.trimMargin()
        )
        sb.appendLine()

        sb.appendLine("        @Override public long estimateCount() { return elementCount; }")
        sb.appendLine()

        // slice
        sb.appendLine(
            """
                |        /// Creates a slice of `$className`.
                |        /// @param index the index of the ${groupClass.kind.typedef} buffer
                |        /// @return the slice of `$className`
                |        public $className asSlice(long index) { return new $className(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

                |        /// Creates a slice of `$className`.
                |        /// @param index the index of the ${groupClass.kind.typedef} buffer
                |        /// @param count the count
                |        /// @return the slice of `$className`
                |        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }
            """.trimMargin()
        )
        sb.appendLine()

        groupClass.members.forEach { member ->
            // instance getters
            sb.appendLine(
                """
                    |        /// {@return `${member.name}` at the given index}
                    |        /// @param index the index of the ${groupClass.kind.typedef} buffer
                """.trimMargin()
            )
            if (member.type is GroupLayoutType || member.dimensions.isNotEmpty()) {
                sb.appendLine("        public MemorySegment ${member.name}At(long index) { return ${member.name}(this.segment(), index); }")
                if (member.type !is GroupLayoutType && member.dimensions.isNotEmpty()) {
                    sb.appendLine(
                        """
                            |        /// {@return `${member.name}` at the given index}
                            |        /// @param index the index of the ${groupClass.kind.typedef} buffer
                        """.trimMargin()
                    )
                    member.dimensions.forEachIndexed { index, _ ->
                        sb.appendLine("        /// @param index$index the Index $index of the array")
                    }
                    sb.append("        public ${member.type.memoryLayout.carrier(null)} ${member.name}At(long index")
                    member.dimensions.forEachIndexed { index, _ ->
                        sb.append(", long index$index")
                    }
                    sb.append(") { return ${member.name}(this.segment(), index")
                    member.dimensions.forEachIndexed { index, _ ->
                        sb.append(", index$index")
                    }
                    sb.appendLine("); }")
                }
            } else {
                sb.appendLine("        public ${member.type.javaType} ${member.name}At(long index) { return ${member.name}(this.segment(), index); }")
            }

            // instance setters
            sb.appendLine(
                """
                    |        /// Sets `${member.name}` with the given value at the given index.
                    |        /// @param index the index of the ${groupClass.kind.typedef} buffer
                    |        /// @param value the value
                    |        /// @return `this`
                """.trimMargin()
            )
            if (member.type is GroupLayoutType || member.dimensions.isNotEmpty()) {
                sb.appendLine("        public Buffer ${member.name}At(long index, MemorySegment value) { ${member.name}(this.segment(), index, value); return this; }")
                if (member.type !is GroupLayoutType && member.dimensions.isNotEmpty()) {
                    sb.appendLine(
                        """
                            |        /// Sets `${member.name}` with the given value at the given index.
                            |        /// @param index the index of the ${groupClass.kind.typedef} buffer
                        """.trimMargin()
                    )
                    member.dimensions.forEachIndexed { index, _ ->
                        sb.appendLine("        /// @param index$index the Index $index of the array")
                    }
                    sb.appendLine("        /// @param value the value")
                    sb.appendLine("        /// @return `this`")
                    sb.append("        public Buffer ${member.name}At(long index")
                    member.dimensions.forEachIndexed { index, _ ->
                        sb.append(", long index$index")
                    }
                    sb.append(", ${member.type.memoryLayout.carrier(null)} value) { ${member.name}(this.segment(), index")
                    member.dimensions.forEachIndexed { index, _ ->
                        sb.append(", index$index")
                    }
                    sb.appendLine(", value); return this; }")
                }
            } else {
                sb.appendLine(
                    "        public Buffer ${member.name}At(long index, ${member.type.javaType} value) {" +
                        " ${member.name}(this.segment(), index, value); return this; }"
                )
            }

            sb.appendLine()
        }

        sb.appendLine("    }")

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

    private fun compileDowncall(packageName: String, className: String, symbolLookup: String, writeWholeFile: Boolean) {
        val path = Path(packageName.replace('.', '/'), "$className.java")
        path.createParentDirectories()
        val sb = StringBuilder()

        if (!writeWholeFile) {
            sb.append("    ")
        }
        sb.appendLine(formatter_off)

        // fields
        sb.appendLine("    //region Fields")
        interpreter.macros.forEach { (name, value) ->
            sb.appendLine(
                "    public static final ${interpreter.inferenceType(value)} $name = ${interpreter.stringify(value)};"
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
                sb.appendLine("        /// The method handle of `$entrypoint`.")
                val functionDescriptor = buildString {
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
                sb.appendLine("        public static final MethodHandle MH_$entrypoint = RuntimeHelper.downcall($functionDescriptor);")
                nativeImageDowncallDescriptors.add(functionDescriptor)
            }
        }
        // function addresses
        interpreter.functions.forEach { (entrypoint, func) ->
            if (func.body == null) {
                sb.appendLine("        /// The function address of `$entrypoint`.")
                sb.appendLine("        public final MemorySegment PFN_$entrypoint;")
            }
        }
        sb.appendLine("        private Handles() {")
        interpreter.functions.forEach { (entrypoint, func) ->
            if (func.body == null) {
                sb.append("            PFN_$entrypoint = $symbolLookup.")
                if (func.optional) {
                    sb.appendLine("""find("$entrypoint").orElse(MemorySegment.NULL);""")
                } else {
                    sb.appendLine("""findOrThrow("$entrypoint");""")
                }
            }
        }
        sb.appendLine("        }")
        sb.appendLine(
            """
                |        private static volatile Handles instance;
                |        private static Handles get() {
                |            if (instance == null) {
                |                synchronized (Handles.class) {
                |                    if (instance == null) { instance = new Handles(); }
                |                }
                |            }
                |            return instance;
                |        }
            """.trimMargin()
        )
        sb.appendLine("    }")
        sb.appendLine()

        // functions
        interpreter.functions.forEach { (entrypoint, func) ->
            val hasDynamicType = func.returnType is DynamicValueType ||
                func.parameters.any { it.memoryLayoutWithDimensions is DefTypeDynamicValueLayout }

            sb.appendLine(
                """
                    |    /// Signature:
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
            sb.appendLine(
                "    public static ${func.returnType.javaType} ${func.name}(${
                    func.parameters.joinToString { p -> "${p.type.javaType} ${p.name}" }
                }) {")
            if (func.body != null) {
                sb.appendLine(func.body.prependIndent("        "))
            } else {
                if (func.optional) {
                    sb.appendLine("""        if (MemoryUtil.isNullPointer(Handles.get().PFN_$entrypoint)) throw new SymbolNotFoundError("Symbol not found: $entrypoint");""")
                }
                sb.appendLine("        try {")
                sb.append("            ")
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
                    append("Handles.MH_$entrypoint.${if (hasDynamicType) "invoke" else "invokeExact"}(Handles.get().PFN_$entrypoint")
                    func.parameters.forEach { p ->
                        append(", ")
                        append(p.type.processor.processDowncall(p.name))
                    }
                    append(")")
                }))
                sb.appendLine(";")
                sb.appendLine("""        } catch (Throwable e) { throw new RuntimeException("error in ${func.name}", e); }""")
            }
            sb.appendLine("    }")
            sb.appendLine()
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

    fun compile(
        packageName: String,
        className: String,
        symbolLookup: String,
        writeWholeFile: Boolean = false,
        structPackageName: String = packageName,
        upcallPackageName: String = packageName
    ) {
        interpreter.upcalls.values.forEach {
            compileUpcall(upcallPackageName, it.name, it)
        }
        interpreter.structs.values.forEach {
            if (!it.opaque) {
                compileGroupClass(structPackageName, it.originalName, it)
            }
        }
        compileDowncall(packageName, className, symbolLookup, writeWholeFile)
    }
}

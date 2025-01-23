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
                |/// Signature
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
                |    static MemorySegment alloc(Arena arena, $className func) { return func.stub(arena); }
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
                sb.appendLine(
                    "    public static ${member.type.memoryLayout.carrier(null)} ${member.name}(MemorySegment segment, long index) {" +
                        " return (${member.type.memoryLayout.carrier(null)}) VH_${member.name}.get(segment, 0L, index); }"
                )
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
                sb.appendLine("    public ${member.type.memoryLayout.carrier(null)} ${member.name}() { return ${member.name}(this.segment(), 0L); }")
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
                sb.appendLine(
                    "    public static void ${member.name}(MemorySegment segment, long index, ${
                        member.type.memoryLayout.carrier(
                            null
                        )
                    } value) {" +
                        " VH_${member.name}.set(segment, 0L, index, value); }"
                )
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
                sb.appendLine("    public $className ${member.name}(${member.type.memoryLayout.carrier(null)} value) { ${member.name}(this.segment(), 0L, value); return this; }")
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
                sb.appendLine("        public ${member.type.memoryLayout.carrier(null)} ${member.name}At(long index) { return ${member.name}(this.segment(), index); }")
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
                    "        public Buffer ${member.name}At(long index, ${member.type.memoryLayout.carrier(null)} value) {" +
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
        sb.appendLine("    //endregion")

        sb.appendLine("    /// Method handles.")
        sb.appendLine("    public static final class Handles {")
        // method handles
        interpreter.functions.forEach { (name, func) ->
            sb.appendLine("        /// The method handle of `$name`.")
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
            sb.appendLine("        public static final MethodHandle MH_$name = RuntimeHelper.downcall($functionDescriptor);")
            nativeImageDowncallDescriptors.add(functionDescriptor)
        }
        // function addresses
        interpreter.functions.forEach { (name, _) ->
            sb.appendLine("        /// The function address of `$name`.")
            sb.appendLine("        public final MemorySegment PFN_$name;")
        }
        sb.appendLine("        private Handles() {")
        interpreter.functions.forEach { (name, func) ->
            sb.append("            PFN_$name = $symbolLookup.")
            if (func.optional) {
                sb.appendLine("""find("$name").orElse(MemorySegment.NULL);""")
            } else {
                sb.appendLine("""findOrThrow("$name");""")
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
        interpreter.functions.forEach { (name, func) ->
            val hasDynamicType = func.returnType is DynamicValueType ||
                func.parameters.any { it.memoryLayoutWithDimensions is DefTypeDynamicValueLayout }

            sb.appendLine(
                """
                    |    /// Signature:
                    |    /// ```
                    |    /// ${func.returnType.originalName} ${func.name}(${
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
                "    public static ${func.returnType.javaType} $name(${
                    func.parameters.joinToString { p -> "${p.type.javaType} ${p.name}" }
                }) {")
            if (func.optional) {
                sb.appendLine("""        if (MemoryUtil.isNullPointer(Handles.get().PFN_$name)) throw new SymbolNotFoundError("Symbol not found: $name");""")
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
                append("Handles.MH_$name.${if (hasDynamicType) "invokeWithArguments" else "invokeExact"}(Handles.get().PFN_$name")
                func.parameters.forEach { p ->
                    append(", ")
                    append(p.type.processor.processDowncall(p.name))
                }
                append(")")
            }))
            sb.appendLine(";")
            sb.appendLine("""        } catch (Throwable e) { throw new RuntimeException("error in $name", e); }""")
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

private val preprocessors = mapOf(
    "#define" to TokenType.DEFINE
)
private val keywords = mapOf(
    "const" to TokenType.CONST,
    "fn" to TokenType.FN,
    "java" to TokenType.JAVA,
    "opt" to TokenType.OPTIONAL,
    "struct" to TokenType.STRUCT,
    "upcall" to TokenType.UPCALL,
    "using" to TokenType.USING
)

private class Lexer(private val source: String) {
    private var start = 0
    private var current = 0
    private var line = 1
    private val tokens = mutableListOf<Token>()

    fun tokenize(): List<Token> {
        while (!isAtEnd()) {
            start = current
            scanTokens()
        }
        tokens.add(Token(TokenType.EOF, line, ""))
        return tokens
    }

    private fun isAtEnd(): Boolean = current == source.length
    private fun advance(): Int = if (isAtEnd()) -1 else source.codePointAt(current++)
    private fun peek(): Int = if (isAtEnd()) -1 else source.codePointAt(current)
    private fun peekNext(): Int = if (current + 1 >= source.length) -1 else source.codePointAt(current + 1)
    private fun previous(): Int = if (current < 1) -1 else source.codePointAt(current - 1)
    private fun match(ch: Int): Boolean {
        if (isAtEnd()) return false
        if (peek() != ch) return false
        current++
        return true
    }

    private fun addToken(type: TokenType) {
        tokens.add(Token(type, line, source.substring(start, current)))
    }

    private fun isDigit(ch: Int): Boolean = ch >= '0'.code && ch <= '9'.code
    private fun isHexDigit(ch: Int): Boolean =
        (ch >= '0'.code && ch <= '9'.code)
            || (ch >= 'A'.code && ch <= 'F'.code)
            || (ch >= 'a'.code && ch <= 'f'.code)

    private fun reportError(message: String): Nothing {
        error("$message at line $line")
    }

    fun scanTokens() {
        when (val ch = advance()) {
            '('.code -> addToken(TokenType.LEFT_PARENTHESIS)
            ')'.code -> addToken(TokenType.RIGHT_PARENTHESIS)
            '['.code -> addToken(TokenType.LEFT_BRACKET)
            ']'.code -> addToken(TokenType.RIGHT_BRACKET)
            '{'.code -> addToken(TokenType.LEFT_BRACE)
            '}'.code -> addToken(TokenType.RIGHT_BRACE)
            ':'.code -> addToken(TokenType.COLON)
            ';'.code -> addToken(TokenType.SEMICOLON)
            ','.code -> addToken(TokenType.COMMA)
            '.'.code -> addToken(TokenType.DOT)
            '-'.code -> addToken(TokenType.MINUS)
            '*'.code -> addToken(TokenType.STAR)
            '/'.code -> {
                if (match('/'.code)) {
                    while (peek() != '\n'.code && !isAtEnd()) {
                        advance()
                    }
                } else {
                    addToken(TokenType.SLASH)
                }
            }

            '|'.code -> addToken(TokenType.PIPE)
            '='.code -> addToken(TokenType.EQUAL)
            '#'.code -> scanPreprocessor()
            '\n'.code -> line++

            else -> {
                if (Character.isWhitespace(ch)) {
                    return
                } else if (isDigit(ch)) {
                    scanNumber()
                } else if (Character.isJavaIdentifierStart(ch)) {
                    scanIdentifier()
                } else {
                    reportError("unexpected char '${ch.toChar()}'")
                }
            }
        }
    }

    fun scanPreprocessor() {
        while (Character.isJavaIdentifierPart(peek())) {
            advance()
        }
        addToken(preprocessors[source.substring(start, current)]!!)
    }

    fun scanNumber() {
        var hex = false
        var floatingPoint = false
        if (previous() == '0'.code && (peek() == 'x'.code || peek() == 'X'.code) && isDigit(peekNext())) {
            advance()
            hex = true
        }
        if (hex) {
            while (isHexDigit(peek())) {
                advance()
            }
        } else {
            while (isDigit(peek())) {
                advance()
            }
        }
        if (peek() == '.'.code && isDigit(peekNext())) {
            if (!hex) {
                floatingPoint = true
                advance()
                while (isDigit(peek())) {
                    advance()
                }
            } else {
                reportError("can't combine floating point with hex")
            }
        }
        if (floatingPoint) {
            addToken(TokenType.FLOATING_POINT)
        } else if (hex) {
            addToken(TokenType.HEX_INTEGER)
        } else {
            addToken(TokenType.DEC_INTEGER)
        }
    }

    fun scanIdentifier() {
        while (Character.isJavaIdentifierPart(peek())) {
            advance()
        }
        addToken(keywords.getOrDefault(source.substring(start, current), TokenType.IDENTIFIER))
    }
}

private enum class TokenType {
    EOF,

    // characters
    LEFT_PARENTHESIS,
    RIGHT_PARENTHESIS,
    LEFT_BRACKET,
    RIGHT_BRACKET,
    LEFT_BRACE,
    RIGHT_BRACE,
    COLON,
    SEMICOLON,
    COMMA,
    DOT,

    // operators
    MINUS,
    STAR,
    SLASH,
    PIPE,
    EQUAL,

    // preprocessors
    DEFINE,

    // literals
    DEC_INTEGER,
    HEX_INTEGER,
    FLOATING_POINT,

    // keywords
    CONST,
    FN,
    JAVA,
    OPTIONAL,
    STRUCT,
    UPCALL,
    USING,

    // other
    IDENTIFIER,
}

private data class Token(val type: TokenType, val line: Int, val lexeme: String)


private class Parser(private val tokens: List<Token>) {
    private var current = 0

    fun parse(): List<Statement> {
        val list = mutableListOf<Statement>()
        while (!isAtEnd()) {
            list.add(declaration())
        }
        return list
    }

    private fun isAtEnd(): Boolean = current >= tokens.size || tokens[current].type == TokenType.EOF
    private fun advance(): Token? = if (isAtEnd()) null else tokens[current++]
    private fun peek(): Token? = if (isAtEnd()) null else tokens[current]
    private fun previous(): Token? = if (current < 1) null else tokens[current - 1]
    private fun check(type: TokenType): Boolean = peek()?.type == type
    private fun match(vararg types: TokenType): Boolean {
        types.forEach {
            if (check(it)) {
                advance()
                return true
            }
        }
        return false
    }

    private fun consume(message: String, vararg types: TokenType): Token {
        if (!match(*types)) {
            reportError(message)
        }
        return previous()!!
    }

    private fun reportError(message: String): Nothing {
        error("$message at ${peek()}")
    }

    private fun declaration(): Statement {
        if (match(TokenType.DEFINE)) return define()
        if (match(TokenType.USING)) return using()
        if (match(TokenType.FN)) return functionDeclaration()

        return statement()
    }

    private fun define(): Statement {
        val name = consume("expect identifier", TokenType.IDENTIFIER)
        val value = expression()
        return DefinePreprocessor(name, value)
    }

    private fun using(): Statement {
        // usingStatement = "using" identifier = typeExpression terminator
        val name = consume("expect identifier", TokenType.IDENTIFIER)
        consume("expect '='", TokenType.EQUAL)
        val type = typeExpression()
        consume("expect ';'", TokenType.SEMICOLON)
        return UsingStatement(name, type)
    }

    private fun functionDeclaration(): Statement {
        var optional = false
        if (match(TokenType.OPTIONAL)) {
            optional = true
        }
        val previous = current
        while (!isAtEnd() && !check(TokenType.LEFT_PARENTHESIS) && !check(TokenType.SEMICOLON)) {
            advance()
        }
        val funcNameIndex = current - 1
        current = previous
        val type = typeExpression(funcNameIndex)
        val name = consume("expect identifier", TokenType.IDENTIFIER)
        val parameters = parameterList()
        consume("expect ';'", TokenType.SEMICOLON)
        return FunctionDeclaration(type, name, parameters, optional)
    }

    private fun parameterList(): List<TypeNamePair> {
        consume("expect '('", TokenType.LEFT_PARENTHESIS)
        val parameters = mutableListOf<TypeNamePair>()
        if (!check(TokenType.RIGHT_PARENTHESIS)) {
            do {
                val startParamIndex = current
                while (!isAtEnd() && !check(TokenType.COMMA) && !check(TokenType.RIGHT_PARENTHESIS) && !check(TokenType.LEFT_BRACKET)) {
                    advance()
                }
                val paramNameIndex = current - 1
                current = startParamIndex
                val paramType = typeExpression(paramNameIndex)
                val paramName = consume("expect identifier", TokenType.IDENTIFIER)
                val dims = mutableListOf<Long>()
                while (match(TokenType.LEFT_BRACKET)) {
                    if (match(TokenType.DEC_INTEGER, TokenType.HEX_INTEGER)) {
                        val dim = previous()!!
                        when (dim.type) {
                            TokenType.DEC_INTEGER -> dims.add(dim.lexeme.toLong())
                            TokenType.HEX_INTEGER -> dims.add(dim.lexeme.toLong(16))
                            else -> error(dim)
                        }
                        consume("expect ']'", TokenType.RIGHT_BRACKET)
                    } else {
                        consume("expect ']'", TokenType.RIGHT_BRACKET)
                        ((paramType as TypeExpression).components as MutableList).add(PointerExpression)
                    }
                }
                parameters.add(TypeNamePair(paramType, paramName, dims))
            } while (match(TokenType.COMMA))
        }
        consume("expect ')'", TokenType.RIGHT_PARENTHESIS)
        return parameters
    }

    private fun statement(): Statement {
        return ExpressionStatement(expression())
    }

    private fun typeExpression(scanUntil: Int = tokens.size): Expression {
        // typeExpression = "const"? rawType ("const" | "*")*
        // we don't use const in Java, but we capture it to show in CType.

        val list = mutableListOf<Expression>()

        if (match(TokenType.CONST)) list.add(ConstExpression)
        list.add(rawType(scanUntil))
        while (match(TokenType.CONST, TokenType.STAR)) {
            val previous = previous()!!
            when (previous.type) {
                TokenType.CONST -> list.add(ConstExpression)
                TokenType.STAR -> list.add(PointerExpression)
                else -> TODO(previous.toString())
            }
        }

        return TypeExpression(list)
    }

    private fun rawType(scanUntil: Int = tokens.size): Expression {
        if (check(TokenType.IDENTIFIER)) {
            val sb = StringBuilder()
            var i = 0
            while (current < scanUntil && match(TokenType.IDENTIFIER)) {
                if (i > 0) sb.append(" ")
                sb.append(previous()!!.lexeme)
                i++
            }
            return TypeReferenceExpression(sb.toString())
        } else if (match(TokenType.STRUCT)) {
            return structExpression()
        } else if (match(TokenType.UPCALL)) {
            return upcallExpression()
        } else if (match(TokenType.JAVA)) {
            return JavaTypeExpression(consume("expect identifier", TokenType.IDENTIFIER))
        }
        reportError("expect identifier, 'struct', 'upcall' or 'java'")
    }

    private fun structExpression(): Expression {
        // structExpression = "struct" identifier memberList?
        // memberList = "{" member* "}"
        // member = typeExpression identifier dims? ";"
        val name = consume("expect identifier", TokenType.IDENTIFIER)
        var opaque = true
        val members = mutableListOf<TypeNamePair>()
        if (match(TokenType.LEFT_BRACE)) {
            opaque = false
            while (!isAtEnd() && !check(TokenType.RIGHT_BRACE)) {
                // name
                val previous = current
                while (!isAtEnd() && !check(TokenType.LEFT_BRACKET) && !check(TokenType.SEMICOLON) && !check(TokenType.LEFT_BRACE)) {
                    advance()
                }
                val memberNameIndex = current - 1
                current = previous
                val memberType = typeExpression(memberNameIndex)
                val memberName = consume("expect identifier", TokenType.IDENTIFIER)
                val dims = mutableListOf<Long>()
                while (match(TokenType.LEFT_BRACKET)) {
                    if (match(TokenType.DEC_INTEGER, TokenType.HEX_INTEGER)) {
                        val dim = previous()!!
                        when (dim.type) {
                            TokenType.DEC_INTEGER -> dims.add(dim.lexeme.toLong())
                            TokenType.HEX_INTEGER -> dims.add(dim.lexeme.toLong(16))
                            else -> error(dim)
                        }
                        consume("expect ']'", TokenType.RIGHT_BRACKET)
                    } else {
                        consume("expect ']'", TokenType.RIGHT_BRACKET)
                        ((memberType as TypeExpression).components as MutableList).add(PointerExpression)
                    }
                }
                consume("expect ';'", TokenType.SEMICOLON)
                members.add(TypeNamePair(memberType, memberName, dims))
            }
            consume("expect '}'", TokenType.RIGHT_BRACE)
        }
        return StructExpression(name, opaque, members)
    }

    private fun upcallExpression(): Expression {
        // upcallExpression = "upcall" typeExpression identifier "(" parameters? ")"
        val startUpcallIndex = current
        while (!isAtEnd() && !check(TokenType.LEFT_PARENTHESIS)) {
            advance()
        }
        val upcallNameIndex = current - 1
        current = startUpcallIndex
        val type = typeExpression(upcallNameIndex)
        val name = consume("expect identifier", TokenType.IDENTIFIER)
        val parameters = parameterList()
        return UpcallExpression(type, name, parameters)
    }

    private fun expression(): Expression {
        return bitwise()
    }

    private fun bitwise(): Expression {
        val left = unary()
        if (match(TokenType.PIPE)) {
            val operator = previous()!!
            val right = unary()
            return BinaryExpression(left, operator, right)
        }
        return left
    }

    private fun unary(): Expression {
        if (match(TokenType.MINUS)) {
            val operator = previous()!!
            val right = unary()
            return UnaryExpression(operator, right)
        }
        return primary()
    }

    private fun primary(): Expression {
        if (match(TokenType.DEC_INTEGER, TokenType.HEX_INTEGER)) {
            val previous = previous()!!
            return when (previous.type) {
                TokenType.DEC_INTEGER -> IntegerExpression(previous.lexeme, 10)
                TokenType.HEX_INTEGER -> IntegerExpression(previous.lexeme, 16)
                else -> throw AssertionError()
            }
        }
        if (match(TokenType.FLOATING_POINT)) return FloatingPointExpression(previous()!!.lexeme)
        if (match(TokenType.IDENTIFIER)) return ReferenceExpression(previous()!!.lexeme)

        if (match(TokenType.LEFT_PARENTHESIS)) {
            val expression = expression()
            consume("expect ')'", TokenType.RIGHT_PARENTHESIS)
            return ParenthesisExpression(expression)
        }

        reportError("expect expression")
    }
}

private sealed interface Statement
private data class DefinePreprocessor(val name: Token, val value: Expression) : Statement
private data class UsingStatement(val name: Token, val oldType: Expression) : Statement
private data class FunctionDeclaration(
    val returnType: Expression,
    val name: Token,
    val parameters: List<TypeNamePair>,
    val optional: Boolean
) : Statement

private data class ExpressionStatement(val expression: Expression) : Statement

private sealed interface Expression
private data class IntegerExpression(val lexeme: String, val radix: Int) : Expression
private data class FloatingPointExpression(val lexeme: String) : Expression
private data class ParenthesisExpression(val expression: Expression) : Expression
private data class UnaryExpression(val operator: Token, val right: Expression) : Expression
private data class BinaryExpression(val left: Expression, val operator: Token, val right: Expression) : Expression
private data class ReferenceExpression(val name: String) : Expression
private data object ConstExpression : Expression
private data object PointerExpression : Expression
private data class TypeReferenceExpression(val name: String) : Expression
private data class TypeExpression(val components: List<Expression>) : Expression
private data class StructExpression(val name: Token, val opaque: Boolean, val members: List<TypeNamePair>) : Expression
private data class UpcallExpression(
    val type: Expression,
    val name: Token,
    val parameters: List<TypeNamePair>
) : Expression

private data class JavaTypeExpression(val name: Token) : Expression

private data class TypeNamePair(val type: Expression, val name: Token, val dimensions: List<Long>)


private class Interpreter {
    val macros = mutableMapOf<String, Expression>()
    val using = mutableMapOf<String, DefinitionType>()
    val structs = mutableMapOf<String, GroupLayoutType>()
    val upcalls = mutableMapOf<String, UpcallType>()
    val functions = mutableMapOf<String, DefinitionFunction>()

    fun interpret(statements: List<Statement>) {
        statements.forEach { execute(it) }
    }

    private fun execute(statement: Statement) {
        when (statement) {
            is DefinePreprocessor -> macros[statement.name.lexeme] = statement.value
            is UsingStatement -> using[statement.name.lexeme] = evaluate(statement.oldType) as DefinitionType
            is FunctionDeclaration -> functions[statement.name.lexeme] = DefinitionFunction(
                evaluate(statement.returnType) as DefinitionType,
                statement.name.lexeme,
                statement.parameters.map(::convertTypeNamePair),
                statement.optional
            )

            is ExpressionStatement -> evaluate(statement.expression)
        }
    }

    fun stringify(expression: Expression): String {
        return when (expression) {
            is IntegerExpression -> expression.lexeme
            is FloatingPointExpression -> expression.lexeme
            is ParenthesisExpression -> "(${stringify(expression.expression)})"
            is UnaryExpression -> "${expression.operator.lexeme}${stringify(expression.right)}"
            is BinaryExpression -> "${stringify(expression.left)} ${expression.operator.lexeme} ${stringify(expression.right)}"
            is ReferenceExpression -> expression.name
            is ConstExpression -> "const"
            is PointerExpression -> "*"
            is TypeReferenceExpression -> expression.name
            is TypeExpression -> definitionType(expression.components).originalName
            is StructExpression -> expression.name.lexeme
            is UpcallExpression -> "${stringify(expression.type)} (*${expression.name.lexeme})(${
                expression.parameters.joinToString { p ->
                    "${stringify(p.type)} ${p.name.lexeme}"
                }
            })"

            is JavaTypeExpression -> registeredType[expression.name.lexeme]?.originalName
                ?: error("unknown type at ${expression.name}")
        }
    }

    fun inferenceType(expression: Expression): String {
        return when (expression) {
            is IntegerExpression -> "int" // TODO long
            is FloatingPointExpression -> "double" // TODO float
            is ParenthesisExpression -> inferenceType(expression.expression)
            is UnaryExpression -> inferenceType(expression.right)
            is BinaryExpression -> inferenceType(expression.left)
            is ReferenceExpression -> inferenceType(
                macros[expression.name] ?: error("symbol not found: ${expression.name}")
            )

            else -> TODO(expression.toString())
        }
    }

    private fun evaluate(expression: Expression): Any {
        return when (expression) {
            is TypeExpression -> definitionType(expression.components)

            else -> TODO(expression.toString())
        }
    }

    private fun definitionType(typeComponents: List<Expression>): DefinitionType {
        var previous: Expression? = null
        val originalNameComp = StringBuilder()
        var type: DefinitionType? = null
        typeComponents.forEach {
            val stringify = stringify(it)
            when (it) {
                ConstExpression -> {
                    when (previous) {
                        null -> {}
                        ConstExpression,
                        PointerExpression,
                        is TypeReferenceExpression,
                        is StructExpression,
                        is UpcallExpression -> originalNameComp.append(" ")

                        else -> TODO(previous.toString())
                    }
                    originalNameComp.append(stringify)
                }

                PointerExpression -> {
                    when (previous) {
                        null,
                        PointerExpression,
                        is TypeReferenceExpression -> {
                        }

                        ConstExpression,
                        is StructExpression -> originalNameComp.append(" ")

                        else -> TODO(previous.toString())
                    }
                    originalNameComp.append(stringify)
                    type = PointerType(originalNameComp.toString(), type!!)
                }

                is TypeReferenceExpression -> {
                    when (previous) {
                        null -> {}
                        ConstExpression -> originalNameComp.append(" ")
                        else -> TODO(previous.toString())
                    }
                    originalNameComp.append(stringify)
                    type = using.getOrElse(it.name) { findBuiltinType(it.name) } ?: error("unknown type ${it.name}")
                }

                is StructExpression -> {
                    when (previous) {
                        null -> {}
                        ConstExpression -> originalNameComp.append(" ")
                        else -> TODO(previous.toString())
                    }
                    originalNameComp.append(stringify)
                    val t = GroupLayoutType(
                        stringify,
                        it.opaque,
                        it.members.map(::convertTypeNamePair),
                        GroupTypeKind.STRUCT
                    )
                    type = t
                    structs[stringify] = t
                }

                is UpcallExpression -> {
                    when (previous) {
                        null -> {}
                        ConstExpression -> originalNameComp.append(" ")
                        else -> TODO(previous.toString())
                    }
                    originalNameComp.append(stringify)
                    val upcallType = UpcallType(
                        stringify,
                        it.name.lexeme,
                        evaluate(it.type) as DefinitionType,
                        it.parameters.map(::convertTypeNamePair)
                    )
                    type = upcallType
                    upcalls[stringify] = upcallType
                }

                is JavaTypeExpression -> type = registeredType[it.name.lexeme] ?: error("unknown type at ${it.name}")

                else -> TODO(it.toString())
            }
            previous = it
        }
        return type!!
    }

    private fun convertTypeNamePair(pair: TypeNamePair): DefTypeNamePair =
        DefTypeNamePair(
            evaluate(pair.type) as DefinitionType,
            pair.name.lexeme,
            pair.dimensions
        )
}

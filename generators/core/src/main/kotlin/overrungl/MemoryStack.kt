/*
 * MIT License
 *
 * Copyright (c) 2024-2025 Overrun Organization
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

package overrungl

import overrungl.gen.formatter_off
import overrungl.gen.formatter_on
import overrungl.gen.replaceCode
import overrungl.gen.writeString
import java.nio.file.Files
import kotlin.io.path.Path

fun memoryStack() {
    val path = Path("overrungl/util/MemoryStack.java")
    val src = Files.readString(path)
    val sb = StringBuilder()

    sb.append("    ")
    sb.appendLine(formatter_off)

    Type.entries.forEach {
        sb.appendLine(
            """
                |    /// Allocates `${it.typeName}`.
                |    ///
                |    /// @param value the value
                |    /// @return the allocated segment
                |    public MemorySegment ${it.methodName}(${it.typeName} value) {
                |        return this.allocateFrom(${it.layout}, value);
                |    }
                |
            """.trimMargin()
        )

        sb.appendLine(
            """
                |    /// Allocates `${it.typeName}`s.
                |    ///
                |    /// @param values the values
                |    /// @return the allocated segment
                |    public MemorySegment ${it.methodName}(${it.typeName}... values) {
                |        return MemoryUtil.allocArray(this, values);
                |    }
                |
            """.trimMargin()
        )
    }

    sb.append("    ")
    sb.appendLine(formatter_on)

    writeString(path, replaceCode(src, sb.toString()))
}

private enum class Type {
    CHAR,
    BYTE,
    SHORT,
    INT,
    LONG,
    FLOAT,
    DOUBLE,
    ADDRESS("MemorySegment", "addresses", "ValueLayout.ADDRESS", 1),
    ;

    val typeName: String
    val methodName: String
    val layout: String
    val count: Int

    constructor(typeName: String, methodName: String, layout: String, count: Int) {
        this.typeName = typeName
        this.methodName = methodName
        this.layout = layout
        this.count = count
    }

    constructor() {
        this.typeName = name.lowercase()
        this.methodName = "${typeName}s"
        this.layout = "ValueLayout.JAVA_$name"
        this.count = 4
    }
}

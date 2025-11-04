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

package overrungl.gen

import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.exists

// TODO
const val ACTUALLY_WRITE = false

fun replaceCode(originalCode: String, replacingCode: String): String {
    check(originalCode.indexOf(GENERATOR_BEGIN) != -1 && originalCode.indexOf(GENERATOR_END) != -1) { "Generator region not found" }
    val split = originalCode.split(GENERATOR_BEGIN, GENERATOR_END)
    return "${split[0]}$GENERATOR_BEGIN\n$replacingCode    $GENERATOR_END${split[2]}"
}

// do not write if contents are equal
fun writeString(path: Path, content: String) {
    if (path.exists() && Files.readString(path) == content) return
    if (ACTUALLY_WRITE) {
        Files.writeString(path, content)
    }
}

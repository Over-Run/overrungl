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

package overrungl.openal

import overrungl.gen.file.DefinitionFile
import overrungl.gen.file.char_boolean
import overrungl.gen.file.registerDefType
import overrungl.gen.generateLookupAccessor
import overrungl.gen.writeNativeImageRegistration

const val alPackage = "overrungl.openal"
const val alLookup = "OpenALLibrary.lookup()"

fun main() {
    registerDefType("ALboolean", char_boolean.copy(originalName = "ALboolean"))
    registerDefType("ALCboolean", char_boolean.copy(originalName = "ALCboolean"))

    val al = DefinitionFile("al.gen")
    val alc = DefinitionFile("alc.gen")
    val alext = DefinitionFile("alext.gen")
    al.compile(alPackage, "AL", alLookup)
    alc.compile(alPackage, "ALC", alLookup)
    alext.compile(alPackage, "ALExt", alLookup)

    writeNativeImageRegistration(alPackage)
    generateLookupAccessor(
        packageName = "openal",
        className = "OpenALLibrary",
        moduleName = "openal",
        basename = "openal",
        versionRef = "OPENAL_VERSION"
    )
}

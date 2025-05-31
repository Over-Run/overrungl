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

package overrungl.stb

import overrungl.gen.file.DefinitionFile
import overrungl.gen.file.int_boolean
import overrungl.gen.file.registerDefType
import overrungl.gen.writeNativeImageRegistration

const val stbPackage = "overrungl.stb"
const val stbLookup = "STBInternal.lookup()"

fun main() {
    registerDefType("STBbool", int_boolean)
    DefinitionFile("stb_easy_font.gen").compile(stbPackage, "STBEasyFont", stbLookup, newPath = true)
    DefinitionFile("stb_image.gen").compile(stbPackage, "STBImage", stbLookup, newPath = true)
    DefinitionFile("stb_image_resize2.gen").compile(stbPackage, "STBImageResize2", stbLookup, newPath = true)
    DefinitionFile("stb_image_write.gen").compile(stbPackage, "STBImageWrite", stbLookup, newPath = true)
    DefinitionFile("stb_perlin.gen").compile(stbPackage, "STBPerlin", stbLookup, newPath = true)
    DefinitionFile("stb_rect_pack.gen").compile(stbPackage, "STBRectPack", stbLookup, newPath = true)
    DefinitionFile("stb_truetype.gen").compile(stbPackage, "STBTruetype", stbLookup, newPath = true)
    DefinitionFile("stb_vorbis.gen").compile(stbPackage, "STBVorbis", stbLookup, newPath = true)

    writeNativeImageRegistration(stbPackage, newPath = true)
}

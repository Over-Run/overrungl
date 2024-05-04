/*
 * MIT License
 *
 * Copyright (c) 2024 Overrun Organization
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

package overrungl.stb;

import overrun.marshal.LayoutBuilder;
import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructAllocator;

import java.lang.invoke.MethodHandles;

/**
 * The following structure is defined publicly so you can declare one on
 * the stack or as a global or etc, but you should treat it as opaque.
 *
 * @author squid233
 * @since 0.1.0
 */
public interface STBTTFontInfo extends Struct<STBTTFontInfo> {
    /**
     * The allocator
     */
    StructAllocator<STBTTFontInfo> OF = new StructAllocator<>(
        MethodHandles.lookup(),
        LayoutBuilder.struct()
            .cAddress("userdata")
            .cAddress("data")
            .cInt("fontstart")
            .cInt("numGlyphs")
            .cInt("loca")
            .cInt("head")
            .cInt("glyf")
            .cInt("hhea")
            .cInt("hmtx")
            .cInt("kern")
            .cInt("gpos")
            .cInt("svg")
            .cInt("index_map")
            .cInt("indexToLocFormat")
            .cStruct("cff", STBTTBuf.LAYOUT)
            .cStruct("charstrings", STBTTBuf.LAYOUT)
            .cStruct("gsubrs", STBTTBuf.LAYOUT)
            .cStruct("subrs", STBTTBuf.LAYOUT)
            .cStruct("fontdicts", STBTTBuf.LAYOUT)
            .cStruct("fdselect", STBTTBuf.LAYOUT)
            .build()
    );
}

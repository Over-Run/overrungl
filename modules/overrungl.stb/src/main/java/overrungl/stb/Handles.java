/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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

import overrungl.Configurations;
import overrungl.OverrunGL;
import overrungl.internal.RuntimeHelper;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.foreign.ValueLayout;
import java.util.function.Supplier;

import static overrun.marshal.gen.processor.ProcessorTypes.registerStruct;

/**
 * The STB method handles.
 *
 * @author squid233
 * @since 0.1.0
 */
final class Handles {
    static final SymbolLookup lookup;
    static final MemorySegment stbi_write_tga_with_rle,
        stbi_write_png_compression_level,
        stbi_write_force_png_filter;

    static {
        registerStruct(STBIIoCallbacks.class, STBIIoCallbacks.OF);
        registerStruct(STBIRRESIZE.class, STBIRRESIZE.OF);
        registerStruct(STBRPContext.class, STBRPContext.OF);
        registerStruct(STBRPNode.class, STBRPNode.OF);
        registerStruct(STBRPRect.class, STBRPRect.OF);
        registerStruct(STBTTAlignedQuad.class, STBTTAlignedQuad.OF);
        registerStruct(STBTTBakedChar.class, STBTTBakedChar.OF);
        registerStruct(STBTTFontInfo.class, STBTTFontInfo.OF);
        registerStruct(STBTTKerningEntry.class, STBTTKerningEntry.OF);
        registerStruct(STBTTPackedChar.class, STBTTPackedChar.OF);
        registerStruct(STBTTPackRange.class, STBTTPackRange.OF);
        registerStruct(STBTTVertex.class, STBTTVertex.OF);
        registerStruct(STBVorbisAlloc.class, STBVorbisAlloc.OF);
        registerStruct(STBVorbisComment.class, STBVorbisComment.OF);
        registerStruct(STBVorbisInfo.class, STBVorbisInfo.OF);

        final Supplier<SymbolLookup> lib = () -> RuntimeHelper.load("stb", "stb", OverrunGL.STB_VERSION);
        final var function = Configurations.STB_SYMBOL_LOOKUP.get();
        lookup = function != null ? function.apply(lib) : lib.get();

        stbi_write_tga_with_rle = findIntOrThrow("stbi_write_tga_with_rle");
        stbi_write_png_compression_level = findIntOrThrow("stbi_write_png_compression_level");
        stbi_write_force_png_filter = findIntOrThrow("stbi_write_force_png_filter");
    }

    private static MemorySegment findIntOrThrow(String name) {
        return lookup.findOrThrow(name).reinterpret(ValueLayout.JAVA_INT.byteSize());
    }

    private Handles() {
        //no instance
    }
}

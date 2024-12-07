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

import overrun.marshal.DirectAccess;
import overrun.marshal.Downcall;
import overrun.marshal.gen.AsBool;
import overrun.marshal.gen.Convert;
import overrun.marshal.gen.Entrypoint;
import overrun.marshal.gen.Skip;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandles;

/**
 * The STB image writer.
 *
 * @author squid233
 * @since 0.1.0
 */
public interface STBImageWrite extends DirectAccess {
    /**
     * The instance of STBImageWrite.
     */
    STBImageWrite INSTANCE = Downcall.load(MethodHandles.lookup(), Handles.lookup);

    @Skip
    default boolean getWriteTgaWithRle() {
        return Handles.stbi_write_tga_with_rle.get(ValueLayout.JAVA_INT, 0L) != 0;
    }

    @Skip
    default void setWriteTgaWithRle(boolean rle) {
        Handles.stbi_write_tga_with_rle.set(ValueLayout.JAVA_INT, 0L, rle ? 1 : 0);
    }

    @Skip
    default int getWritePngCompressionLevel() {
        return Handles.stbi_write_png_compression_level.get(ValueLayout.JAVA_INT, 0L);
    }

    @Skip
    default void setWritePngCompressionLevel(int level) {
        Handles.stbi_write_png_compression_level.set(ValueLayout.JAVA_INT, 0L, level);
    }

    @Skip
    default int getWriteForcePngFilter() {
        return Handles.stbi_write_force_png_filter.get(ValueLayout.JAVA_INT, 0L);
    }

    @Skip
    default void setWriteForcePngFilter(int filter) {
        Handles.stbi_write_force_png_filter.set(ValueLayout.JAVA_INT, 0L, filter);
    }

    @Convert(AsBool.INT)
    @Entrypoint("stbi_write_png")
    boolean npng(MemorySegment filename, int w, int h, int comp, MemorySegment data, int strideInBytes);

    @Convert(AsBool.INT)
    @Entrypoint("stbi_write_bmp")
    boolean nbmp(MemorySegment filename, int w, int h, int comp, MemorySegment data);

    @Convert(AsBool.INT)
    @Entrypoint("stbi_write_tga")
    boolean ntga(MemorySegment filename, int w, int h, int comp, MemorySegment data);

    @Convert(AsBool.INT)
    @Entrypoint("stbi_write_hdr")
    boolean nhdr(MemorySegment filename, int w, int h, int comp, MemorySegment data);

    @Convert(AsBool.INT)
    @Entrypoint("stbi_write_jpg")
    boolean njpg(MemorySegment filename, int x, int y, int comp, MemorySegment data, int quality);

    @Convert(AsBool.INT)
    @Entrypoint("stbi_write_png")
    boolean png(String filename, int w, int h, int comp, MemorySegment data, int strideInBytes);

    @Convert(AsBool.INT)
    @Entrypoint("stbi_write_bmp")
    boolean bmp(String filename, int w, int h, int comp, MemorySegment data);

    @Convert(AsBool.INT)
    @Entrypoint("stbi_write_tga")
    boolean tga(String filename, int w, int h, int comp, MemorySegment data);

    @Convert(AsBool.INT)
    @Entrypoint("stbi_write_hdr")
    boolean hdr(SegmentAllocator allocator, String filename, int w, int h, int comp, float[] data);

    @Convert(AsBool.INT)
    @Entrypoint("stbi_write_jpg")
    boolean jpg(String filename, int x, int y, int comp, MemorySegment data, int quality);

    @Convert(AsBool.INT)
    @Entrypoint("stbi_write_png_to_func")
    boolean npngToFunc(MemorySegment func, MemorySegment context, int w, int h, int comp, MemorySegment data, int strideInBytes);

    @Convert(AsBool.INT)
    @Entrypoint("stbi_write_bmp_to_func")
    boolean nbmpToFunc(MemorySegment func, MemorySegment context, int w, int h, int comp, MemorySegment data);

    @Convert(AsBool.INT)
    @Entrypoint("stbi_write_tga_to_func")
    boolean ntgaToFunc(MemorySegment func, MemorySegment context, int w, int h, int comp, MemorySegment data);

    @Convert(AsBool.INT)
    @Entrypoint("stbi_write_hdr_to_func")
    boolean nhdrToFunc(MemorySegment func, MemorySegment context, int w, int h, int comp, MemorySegment data);

    @Convert(AsBool.INT)
    @Entrypoint("stbi_write_jpg_to_func")
    boolean njpgToFunc(MemorySegment func, MemorySegment context, int x, int y, int comp, MemorySegment data, int quality);

    @Convert(AsBool.INT)
    @Entrypoint("stbi_write_png_to_func")
    boolean pngToFunc(Arena arena, STBIWriteFunc func, MemorySegment context, int w, int h, int comp, MemorySegment data, int strideInBytes);

    @Convert(AsBool.INT)
    @Entrypoint("stbi_write_bmp_to_func")
    boolean bmpToFunc(Arena arena, STBIWriteFunc func, MemorySegment context, int w, int h, int comp, MemorySegment data);

    @Convert(AsBool.INT)
    @Entrypoint("stbi_write_tga_to_func")
    boolean tgaToFunc(Arena arena, STBIWriteFunc func, MemorySegment context, int w, int h, int comp, MemorySegment data);

    @Convert(AsBool.INT)
    @Entrypoint("stbi_write_hdr_to_func")
    boolean hdrToFunc(Arena arena, STBIWriteFunc func, MemorySegment context, int w, int h, int comp, float[] data);

    @Convert(AsBool.INT)
    @Entrypoint("stbi_write_jpg_to_func")
    boolean jpgToFunc(Arena arena, STBIWriteFunc func, MemorySegment context, int x, int y, int comp, MemorySegment data, int quality);

    @Entrypoint("stbi_flip_vertically_on_write")
    void flipVerticallyOnWrite(@Convert(AsBool.INT) boolean flip);

    @Entrypoint("stbi_write_png_to_mem")
    MemorySegment npngToMem(MemorySegment pixels, int strideInBytes, int x, int y, int n, MemorySegment outLen);

    @Entrypoint("stbi_write_png_to_mem")
    byte[] pngToMem(SegmentAllocator allocator, byte[] pixels, int strideInBytes, int x, int y, int n, int[] outLen);

    @Entrypoint("stbi_zlib_compress")
    MemorySegment nzlibCompress(MemorySegment data, int dataLen, MemorySegment outLen, int quality);

    @Entrypoint("stbi_zlib_compress")
    byte[] zlibCompress(SegmentAllocator allocator, byte[] data, int dataLen, int[] outLen, int quality);

    @Skip
    default byte[] zlibCompress(SegmentAllocator allocator, byte[] data, int[] outLen, int quality) {
        return zlibCompress(allocator, data, data.length, outLen, quality);
    }
}

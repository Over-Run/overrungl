/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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

import overrungl.RuntimeHelper;
import overrungl.util.MemoryStack;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static overrungl.FunctionDescriptors.*;
import static overrungl.stb.Handles.*;

/**
 * The STB image writer.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class STBImageWrite {
    private static MethodHandle
        stbi_flip_vertically_on_write, stbi_get_write_force_png_filter, stbi_get_write_png_compression_level,
        stbi_get_write_tga_with_rle, stbi_set_write_force_png_filter, stbi_set_write_png_compression_level,
        stbi_set_write_tga_with_rle, stbi_write_bmp, stbi_write_bmp_to_func, stbi_write_hdr, stbi_write_hdr_to_func,
        stbi_write_jpg, stbi_write_jpg_to_func, stbi_write_png, stbi_write_png_to_func, stbi_write_png_to_mem,
        stbi_write_tga, stbi_write_tga_to_func, stbi_zlib_compress;

    static {
        initialize();
        create();
    }

    private static void create() {
        stbi_flip_vertically_on_write = downcallTrivial("stbi_flip_vertically_on_write", IV);
        stbi_get_write_force_png_filter = downcallTrivial("stbi_get_write_force_png_filter", I);
        stbi_get_write_png_compression_level = downcallTrivial("stbi_get_write_png_compression_level", I);
        stbi_get_write_tga_with_rle = downcallTrivial("stbi_get_write_tga_with_rle", I);
        stbi_set_write_force_png_filter = downcallTrivial("stbi_set_write_force_png_filter", IV);
        stbi_set_write_png_compression_level = downcallTrivial("stbi_set_write_png_compression_level", IV);
        stbi_set_write_tga_with_rle = downcallTrivial("stbi_set_write_tga_with_rle", IV);
        stbi_write_bmp = downcall("stbi_write_bmp", PIIIPI);
        stbi_write_bmp_to_func = downcall("stbi_write_bmp_to_func", PPIIIP);
        stbi_write_hdr = downcall("stbi_write_hdr", PIIIPI);
        stbi_write_hdr_to_func = downcall("stbi_write_hdr_to_func", PPIIIP);
        stbi_write_jpg = downcall("stbi_write_jpg", PIIIPII);
        stbi_write_jpg_to_func = downcall("stbi_write_jpg_to_func", PPIIIPI);
        stbi_write_png = downcall("stbi_write_png", PIIIPII);
        stbi_write_png_to_func = downcall("stbi_write_png_to_func", PPIIIPI);
        stbi_write_png_to_mem = downcall("stbi_write_png_to_mem", PIIIIPp);
        stbi_write_tga = downcall("stbi_write_tga", PIIIP);
        stbi_write_tga_to_func = downcall("stbi_write_tga_to_func", PPIIIP);
        stbi_zlib_compress = downcall("stbi_zlib_compress", PIPIp);
    }

    private STBImageWrite() {
        throw new IllegalStateException("Do not construct instance");
    }

    public static boolean getWriteTgaWithRle() {
        try {
            return (int) stbi_get_write_tga_with_rle.invokeExact() != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getWritePngCompressionLevel() {
        try {
            return (int) stbi_get_write_png_compression_level.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getWriteForcePngFilter() {
        try {
            return (int) stbi_get_write_force_png_filter.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void setWriteTgaWithRle(boolean rle) {
        try {
            stbi_set_write_tga_with_rle.invokeExact(rle ? 1 : 0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void setWritePngCompressionLevel(int level) {
        try {
            stbi_set_write_png_compression_level.invokeExact(level);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void setWriteForcePngFilter(int filter) {
        try {
            stbi_set_write_force_png_filter.invokeExact(filter);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean npng(MemorySegment filename, int w, int h, int comp, MemorySegment data, int strideInBytes) {
        try {
            return (int) stbi_write_png.invokeExact(filename, w, h, comp, data, strideInBytes) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean nbmp(MemorySegment filename, int w, int h, int comp, MemorySegment data) {
        try {
            return (int) stbi_write_bmp.invokeExact(filename, w, h, comp, data) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean ntga(MemorySegment filename, int w, int h, int comp, MemorySegment data) {
        try {
            return (int) stbi_write_tga.invokeExact(filename, w, h, comp, data) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean nhdr(MemorySegment filename, int w, int h, int comp, MemorySegment data) {
        try {
            return (int) stbi_write_hdr.invokeExact(filename, w, h, comp, data) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean njpg(MemorySegment filename, int x, int y, int comp, MemorySegment data, int quality) {
        try {
            return (int) stbi_write_jpg.invokeExact(filename, x, y, comp, data, quality) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean png(String filename, int w, int h, int comp, MemorySegment data, int strideInBytes) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            return npng(stack.allocateUtf8String(filename), w, h, comp, data, strideInBytes);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static boolean bmp(String filename, int w, int h, int comp, MemorySegment data) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            return nbmp(stack.allocateUtf8String(filename), w, h, comp, data);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static boolean tga(String filename, int w, int h, int comp, MemorySegment data) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            return ntga(stack.allocateUtf8String(filename), w, h, comp, data);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static boolean hdr(SegmentAllocator allocator, String filename, int w, int h, int comp, float[] data) {
        return nhdr(allocator.allocateUtf8String(filename), w, h, comp, allocator.allocateArray(JAVA_FLOAT, data));
    }

    public static boolean jpg(String filename, int x, int y, int comp, MemorySegment data, int quality) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            return njpg(stack.allocateUtf8String(filename), x, y, comp, data, quality);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static boolean npngToFunc(MemorySegment func, MemorySegment context, int w, int h, int comp, MemorySegment data, int strideInBytes) {
        try {
            return (int) stbi_write_png_to_func.invokeExact(func, context, w, h, comp, data, strideInBytes) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean nbmpToFunc(MemorySegment func, MemorySegment context, int w, int h, int comp, MemorySegment data) {
        try {
            return (int) stbi_write_bmp_to_func.invokeExact(func, context, w, h, comp, data) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean ntgaToFunc(MemorySegment func, MemorySegment context, int w, int h, int comp, MemorySegment data) {
        try {
            return (int) stbi_write_tga_to_func.invokeExact(func, context, w, h, comp, data) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean nhdrToFunc(MemorySegment func, MemorySegment context, int w, int h, int comp, MemorySegment data) {
        try {
            return (int) stbi_write_hdr_to_func.invokeExact(func, context, w, h, comp, data) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean njpgToFunc(MemorySegment func, MemorySegment context, int x, int y, int comp, MemorySegment data, int quality) {
        try {
            return (int) stbi_write_jpg_to_func.invokeExact(func, context, x, y, comp, data, quality) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean pngToFunc(Arena arena, STBIWriteFunc func, MemorySegment context, int w, int h, int comp, MemorySegment data, int strideInBytes) {
        return npngToFunc(func.address(arena), context, w, h, comp, data, strideInBytes);
    }

    public static boolean bmpToFunc(Arena arena, STBIWriteFunc func, MemorySegment context, int w, int h, int comp, MemorySegment data) {
        return nbmpToFunc(func.address(arena), context, w, h, comp, data);
    }

    public static boolean tgaToFunc(Arena arena, STBIWriteFunc func, MemorySegment context, int w, int h, int comp, MemorySegment data) {
        return ntgaToFunc(func.address(arena), context, w, h, comp, data);
    }

    public static boolean hdrToFunc(Arena arena, STBIWriteFunc func, MemorySegment context, int w, int h, int comp, float[] data) {
        return nhdrToFunc(func.address(arena), context, w, h, comp, arena.allocateArray(JAVA_FLOAT, data));
    }

    public static boolean jpgToFunc(Arena arena, STBIWriteFunc func, MemorySegment context, int x, int y, int comp, MemorySegment data, int quality) {
        return njpgToFunc(func.address(arena), context, x, y, comp, data, quality);
    }

    public static void flipVerticallyOnWrite(boolean flip) {
        try {
            stbi_flip_vertically_on_write.invokeExact(flip ? 1 : 0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment npngToMem(MemorySegment pixels, int strideInBytes, int x, int y, int n, MemorySegment outLen) {
        try {
            return (MemorySegment) stbi_write_png_to_mem.invokeExact(pixels, strideInBytes, x, y, n, outLen);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static byte[] pngToMem(SegmentAllocator allocator, byte[] pixels, int strideInBytes, int x, int y, int n, int[] outLen) {
        var pl = allocator.allocate(JAVA_INT);
        var p = npngToMem(allocator.allocateArray(JAVA_BYTE, pixels), strideInBytes, x, y, n, pl);
        final int len = pl.get(JAVA_INT, 0);
        outLen[0] = len;
        return RuntimeHelper.toArray(p, new byte[len]);
    }

    public static MemorySegment nzlibCompress(MemorySegment data, int dataLen, MemorySegment outLen, int quality) {
        try {
            return (MemorySegment) stbi_zlib_compress.invokeExact(data, dataLen, outLen, quality);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static byte[] zlibCompress(SegmentAllocator allocator, byte[] data, int[] outLen, int quality) {
        var pl = allocator.allocate(JAVA_INT);
        var p = nzlibCompress(allocator.allocateArray(JAVA_BYTE, data), data.length, pl, quality);
        final int len = pl.get(JAVA_INT, 0);
        outLen[0] = len;
        return RuntimeHelper.toArray(p, new byte[len]);
    }
}

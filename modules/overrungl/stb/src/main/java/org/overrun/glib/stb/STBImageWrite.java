/*
 * MIT License
 *
 * Copyright (c) 2022 Overrun Organization
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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.overrun.glib.stb;

import org.overrun.glib.RuntimeHelper;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.stb.Handles.downcall;
import static org.overrun.glib.stb.Handles.initialize;

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
        stbi_flip_vertically_on_write = downcall("stbi_flip_vertically_on_write", IV);
        stbi_get_write_force_png_filter = downcall("stbi_get_write_force_png_filter", I);
        stbi_get_write_png_compression_level = downcall("stbi_get_write_png_compression_level", I);
        stbi_get_write_tga_with_rle = downcall("stbi_get_write_tga_with_rle", I);
        stbi_set_write_force_png_filter = downcall("stbi_set_write_force_png_filter", IV);
        stbi_set_write_png_compression_level = downcall("stbi_set_write_png_compression_level", IV);
        stbi_set_write_tga_with_rle = downcall("stbi_set_write_tga_with_rle", IV);
        stbi_write_bmp = downcall("stbi_write_bmp", PIIIP);
        stbi_write_bmp_to_func = downcall("stbi_write_bmp_to_func", PPIIIP);
        stbi_write_hdr = downcall("stbi_write_hdr", PIIIP);
        stbi_write_hdr_to_func = downcall("stbi_write_hdr_to_func", PPIIIP);
        stbi_write_jpg = downcall("stbi_write_jpg", PIIIPI);
        stbi_write_jpg_to_func = downcall("stbi_write_jpg_to_func", PPIIIPI);
        stbi_write_png = downcall("stbi_write_png", PIIIPI);
        stbi_write_png_to_func = downcall("stbi_write_png_to_func", PPIIIPI);
        stbi_write_png_to_mem = downcall("stbi_write_png_to_mem", PIIIIPP);
        stbi_write_tga = downcall("stbi_write_tga", PIIIP);
        stbi_write_tga_to_func = downcall("stbi_write_tga_to_func", PPIIIP);
        stbi_zlib_compress = downcall("stbi_zlib_compress", PIPIP);
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

    public static boolean npng(Addressable filename, int w, int h, int comp, Addressable data, int strideInBytes) {
        try {
            return (int) stbi_write_png.invokeExact(filename, w, h, comp, data, strideInBytes) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean nbmp(Addressable filename, int w, int h, int comp, Addressable data) {
        try {
            return (int) stbi_write_bmp.invokeExact(filename, w, h, comp, data) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean ntga(Addressable filename, int w, int h, int comp, Addressable data) {
        try {
            return (int) stbi_write_tga.invokeExact(filename, w, h, comp, data) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean nhdr(Addressable filename, int w, int h, int comp, Addressable data) {
        try {
            return (int) stbi_write_hdr.invokeExact(filename, w, h, comp, data) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean njpg(Addressable filename, int x, int y, int comp, Addressable data, int quality) {
        try {
            return (int) stbi_write_jpg.invokeExact(filename, x, y, comp, data, quality) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean png(SegmentAllocator allocator, String filename, int w, int h, int comp, Addressable data, int strideInBytes) {
        return npng(allocator.allocateUtf8String(filename), w, h, comp, data, strideInBytes);
    }

    public static boolean bmp(SegmentAllocator allocator, String filename, int w, int h, int comp, Addressable data) {
        return nbmp(allocator.allocateUtf8String(filename), w, h, comp, data);
    }

    public static boolean tga(SegmentAllocator allocator, String filename, int w, int h, int comp, Addressable data) {
        return ntga(allocator.allocateUtf8String(filename), w, h, comp, data);
    }

    public static boolean hdr(SegmentAllocator allocator, String filename, int w, int h, int comp, float[] data) {
        return nhdr(allocator.allocateUtf8String(filename), w, h, comp, allocator.allocateArray(JAVA_FLOAT, data));
    }

    public static boolean jpg(SegmentAllocator allocator, String filename, int x, int y, int comp, Addressable data, int quality) {
        return njpg(allocator.allocateUtf8String(filename), x, y, comp, data, quality);
    }

    public static boolean npngToFunc(Addressable func, Addressable context, int w, int h, int comp, Addressable data, int strideInBytes) {
        try {
            return (int) stbi_write_png_to_func.invokeExact(func, context, w, h, comp, data, strideInBytes) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean nbmpToFunc(Addressable func, Addressable context, int w, int h, int comp, Addressable data) {
        try {
            return (int) stbi_write_bmp_to_func.invokeExact(func, context, w, h, comp, data) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean ntgaToFunc(Addressable func, Addressable context, int w, int h, int comp, Addressable data) {
        try {
            return (int) stbi_write_tga_to_func.invokeExact(func, context, w, h, comp, data) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean nhdrToFunc(Addressable func, Addressable context, int w, int h, int comp, Addressable data) {
        try {
            return (int) stbi_write_hdr_to_func.invokeExact(func, context, w, h, comp, data) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean njpgToFunc(Addressable func, Addressable context, int x, int y, int comp, Addressable data, int quality) {
        try {
            return (int) stbi_write_jpg_to_func.invokeExact(func, context, x, y, comp, data, quality) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean pngToFunc(MemorySession scope, STBIWriteFunc func, Addressable context, int w, int h, int comp, Addressable data, int strideInBytes) {
        return npngToFunc(func.address(scope), context, w, h, comp, data, strideInBytes);
    }

    public static boolean bmpToFunc(MemorySession scope, STBIWriteFunc func, Addressable context, int w, int h, int comp, Addressable data) {
        return nbmpToFunc(func.address(scope), context, w, h, comp, data);
    }

    public static boolean tgaToFunc(MemorySession scope, STBIWriteFunc func, Addressable context, int w, int h, int comp, Addressable data) {
        return ntgaToFunc(func.address(scope), context, w, h, comp, data);
    }

    public static boolean hdrToFunc(MemorySession scope, STBIWriteFunc func, Addressable context, int w, int h, int comp, float[] data) {
        return nhdrToFunc(func.address(scope), context, w, h, comp, scope.allocateArray(JAVA_FLOAT, data));
    }

    public static boolean jpgToFunc(MemorySession scope, STBIWriteFunc func, Addressable context, int x, int y, int comp, Addressable data, int quality) {
        return njpgToFunc(func.address(scope), context, x, y, comp, data, quality);
    }

    public static void flipVerticallyOnWrite(boolean flip) {
        try {
            stbi_flip_vertically_on_write.invokeExact(flip ? 1 : 0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemoryAddress pngToMem(Addressable pixels, int strideInBytes, int x, int y, int n, Addressable outLen) {
        try {
            return (MemoryAddress) stbi_write_png_to_mem.invokeExact(pixels, strideInBytes, x, y, n, outLen);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static byte[] pngToMem(SegmentAllocator allocator, byte[] pixels, int strideInBytes, int x, int y, int n, int[] outLen) {
        var pl = allocator.allocate(JAVA_INT);
        var p = pngToMem(allocator.allocateArray(JAVA_BYTE, pixels), strideInBytes, x, y, n, pl);
        final int len = pl.get(JAVA_INT, 0);
        outLen[0] = len;
        return RuntimeHelper.toArray(p, new byte[len]);
    }

    public static MemoryAddress zlibCompress(Addressable data, int dataLen, Addressable outLen, int quality) {
        try {
            return (MemoryAddress) stbi_zlib_compress.invokeExact(data, dataLen, outLen, quality);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static byte[] zlibCompress(SegmentAllocator allocator, byte[] data, int[] outLen, int quality) {
        var pl = allocator.allocate(JAVA_INT);
        var p = zlibCompress(allocator.allocateArray(JAVA_BYTE, data), data.length, pl, quality);
        final int len = pl.get(JAVA_INT, 0);
        outLen[0] = len;
        return RuntimeHelper.toArray(p, new byte[len]);
    }
}

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
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.stb.Handles.*;

/**
 * The STB image writer.
 *
 * @author squid233
 * @since 0.1.0
 */
public class STBImageWrite {
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
        stbi_flip_vertically_on_write = downcallIV("stbi_flip_vertically_on_write");
        stbi_get_write_force_png_filter = downcallI("stbi_get_write_force_png_filter");
        stbi_get_write_png_compression_level = downcallI("stbi_get_write_png_compression_level");
        stbi_get_write_tga_with_rle = downcallI("stbi_get_write_tga_with_rle");
        stbi_set_write_force_png_filter = downcallIV("stbi_set_write_force_png_filter");
        stbi_set_write_png_compression_level = downcallIV("stbi_set_write_png_compression_level");
        stbi_set_write_tga_with_rle = downcallIV("stbi_set_write_tga_with_rle");
        stbi_write_bmp = downcallI("stbi_write_bmp", ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS);
        stbi_write_bmp_to_func = downcallI("stbi_write_bmp_to_func", ADDRESS, ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS);
        stbi_write_hdr = downcallI("stbi_write_hdr", ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS);
        stbi_write_hdr_to_func = downcallI("stbi_write_hdr_to_func", ADDRESS, ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS);
        stbi_write_jpg = downcallI("stbi_write_jpg", ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT);
        stbi_write_jpg_to_func = downcallI("stbi_write_jpg_to_func", ADDRESS, ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT);
        stbi_write_png = downcallI("stbi_write_png", ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT);
        stbi_write_png_to_func = downcallI("stbi_write_png_to_func", ADDRESS, ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT);
        stbi_write_png_to_mem = downcallP("stbi_write_png_to_mem", ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS);
        stbi_write_tga = downcallI("stbi_write_tga", ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS);
        stbi_write_tga_to_func = downcallI("stbi_write_tga_to_func", ADDRESS, ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS);
        stbi_zlib_compress = downcallP("stbi_zlib_compress", ADDRESS, JAVA_INT, ADDRESS, JAVA_INT);
    }

    protected STBImageWrite() {
        throw new IllegalStateException("Do not construct instance");
    }

    public static boolean getWriteTgaWithRle() {
        try {
            return (int) stbi_get_write_tga_with_rle.invoke() != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static int getWritePngCompressionLevel() {
        try {
            return (int) stbi_get_write_png_compression_level.invoke();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static int getWriteForcePngFilter() {
        try {
            return (int) stbi_get_write_force_png_filter.invoke();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void setWriteTgaWithRle(boolean rle) {
        try {
            stbi_set_write_tga_with_rle.invoke(rle ? 1 : 0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void setWritePngCompressionLevel(int level) {
        try {
            stbi_set_write_png_compression_level.invoke(level);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void setWriteForcePngFilter(int filter) {
        try {
            stbi_set_write_force_png_filter.invoke(filter);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static boolean npng(Addressable filename, int w, int h, int comp, Addressable data, int strideInBytes) {
        try {
            return (int) stbi_write_png.invoke(filename, w, h, comp, data, strideInBytes) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static boolean nbmp(Addressable filename, int w, int h, int comp, Addressable data) {
        try {
            return (int) stbi_write_bmp.invoke(filename, w, h, comp, data) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static boolean ntga(Addressable filename, int w, int h, int comp, Addressable data) {
        try {
            return (int) stbi_write_tga.invoke(filename, w, h, comp, data) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static boolean nhdr(Addressable filename, int w, int h, int comp, Addressable data) {
        try {
            return (int) stbi_write_hdr.invoke(filename, w, h, comp, data) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static boolean njpg(Addressable filename, int x, int y, int comp, Addressable data, int quality) {
        try {
            return (int) stbi_write_jpg.invoke(filename, x, y, comp, data, quality) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static boolean png(String filename, int w, int h, int comp, Addressable data, int strideInBytes) {
        try (var session = MemorySession.openShared()) {
            return npng(session.allocateUtf8String(filename), w, h, comp, data, strideInBytes);
        }
    }

    public static boolean bmp(String filename, int w, int h, int comp, Addressable data) {
        try (var session = MemorySession.openShared()) {
            return nbmp(session.allocateUtf8String(filename), w, h, comp, data);
        }
    }

    public static boolean tga(String filename, int w, int h, int comp, Addressable data) {
        try (var session = MemorySession.openShared()) {
            return ntga(session.allocateUtf8String(filename), w, h, comp, data);
        }
    }

    public static boolean hdr(String filename, int w, int h, int comp, float[] data) {
        try (var session = MemorySession.openShared()) {
            return nhdr(session.allocateUtf8String(filename), w, h, comp, session.allocateArray(JAVA_FLOAT, data));
        }
    }

    public static boolean jpg(String filename, int x, int y, int comp, Addressable data, int quality) {
        try (var session = MemorySession.openShared()) {
            return njpg(session.allocateUtf8String(filename), x, y, comp, data, quality);
        }
    }

    public static boolean npngToFunc(Addressable func, Addressable context, int w, int h, int comp, Addressable data, int strideInBytes) {
        try {
            return (int) stbi_write_png_to_func.invoke(func, context, w, h, comp, data, strideInBytes) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static boolean nbmpToFunc(Addressable func, Addressable context, int w, int h, int comp, Addressable data) {
        try {
            return (int) stbi_write_bmp_to_func.invoke(func, context, w, h, comp, data) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static boolean ntgaToFunc(Addressable func, Addressable context, int w, int h, int comp, Addressable data) {
        try {
            return (int) stbi_write_tga_to_func.invoke(func, context, w, h, comp, data) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static boolean nhdrToFunc(Addressable func, Addressable context, int w, int h, int comp, Addressable data) {
        try {
            return (int) stbi_write_hdr_to_func.invoke(func, context, w, h, comp, data) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static boolean njpgToFunc(Addressable func, Addressable context, int x, int y, int comp, Addressable data, int quality) {
        try {
            return (int) stbi_write_jpg_to_func.invoke(func, context, x, y, comp, data, quality) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static boolean pngToFunc(STBIWriteFunc func, Addressable context, int w, int h, int comp, Addressable data, int strideInBytes) {
        try (var session = MemorySession.openShared()) {
            return npngToFunc(func.address(session), context, w, h, comp, data, strideInBytes);
        }
    }

    public static boolean bmpToFunc(STBIWriteFunc func, Addressable context, int w, int h, int comp, Addressable data) {
        try (var session = MemorySession.openShared()) {
            return nbmpToFunc(func.address(session), context, w, h, comp, data);
        }
    }

    public static boolean tgaToFunc(STBIWriteFunc func, Addressable context, int w, int h, int comp, Addressable data) {
        try (var session = MemorySession.openShared()) {
            return ntgaToFunc(func.address(session), context, w, h, comp, data);
        }
    }

    public static boolean hdrToFunc(STBIWriteFunc func, Addressable context, int w, int h, int comp, float[] data) {
        try (var session = MemorySession.openShared()) {
            return nhdrToFunc(func.address(session), context, w, h, comp, session.allocateArray(JAVA_FLOAT, data));
        }
    }

    public static boolean jpgToFunc(STBIWriteFunc func, Addressable context, int x, int y, int comp, Addressable data, int quality) {
        try (var session = MemorySession.openShared()) {
            return njpgToFunc(func.address(session), context, x, y, comp, data, quality);
        }
    }

    public static void flipVerticallyOnWrite(boolean flip) {
        try {
            stbi_flip_vertically_on_write.invoke(flip ? 1 : 0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static MemoryAddress pngToMem(Addressable pixels, int strideInBytes, int x, int y, int n, Addressable outLen) {
        try {
            return (MemoryAddress) stbi_write_png_to_mem.invoke(pixels, strideInBytes, x, y, n, outLen);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static byte[] pngToMem(byte[] pixels, int strideInBytes, int x, int y, int n, int[] outLen) {
        try (var session = MemorySession.openShared()) {
            var pl = session.allocate(JAVA_INT);
            var p = pngToMem(session.allocateArray(JAVA_BYTE, pixels), strideInBytes, x, y, n, pl);
            final int len = pl.get(JAVA_INT, 0);
            outLen[0] = len;
            return RuntimeHelper.toArray(p, new byte[len]);
        }
    }

    public static MemoryAddress zlibCompress(Addressable data, int dataLen, Addressable outLen, int quality) {
        try {
            return (MemoryAddress) stbi_zlib_compress.invoke(data, dataLen, outLen, quality);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static byte[] zlibCompress(byte[] data, int[] outLen, int quality) {
        try (var session = MemorySession.openShared()) {
            var pl = session.allocate(JAVA_INT);
            var p = zlibCompress(session.allocateArray(JAVA_BYTE, data), data.length, pl, quality);
            final int len = pl.get(JAVA_INT, 0);
            outLen[0] = len;
            return RuntimeHelper.toArray(p, new byte[len]);
        }
    }
}

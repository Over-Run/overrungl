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

import org.jetbrains.annotations.Nullable;
import org.overrun.glib.RuntimeHelper;
import org.overrun.glib.util.MemoryStack;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.stb.Handles.downcall;
import static org.overrun.glib.stb.Handles.initialize;

/**
 * The STB image reader.
 *
 * @author squid233
 * @since 0.1.0
 */
public class STBImage {
    private static MethodHandle
        stbi__unpremultiply_on_load_thread, stbi_convert_iphone_png_to_rgb, stbi_convert_iphone_png_to_rgb_thread,
        stbi_failure_reason, stbi_hdr_to_ldr_gamma, stbi_hdr_to_ldr_scale, stbi_image_free, stbi_info,
        stbi_info_from_callbacks, stbi_info_from_file, stbi_info_from_memory, stbi_is_16_bit,
        stbi_is_16_bit_from_callbacks, stbi_is_16_bit_from_file, stbi_is_16_bit_from_memory, stbi_is_hdr,
        stbi_is_hdr_from_callbacks, stbi_is_hdr_from_file, stbi_is_hdr_from_memory, stbi_ldr_to_hdr_gamma,
        stbi_ldr_to_hdr_scale, stbi_load, stbi_load_16, stbi_load_16_from_callbacks, stbi_load_16_from_memory,
        stbi_load_from_callbacks, stbi_load_from_file, stbi_load_from_file_16, stbi_load_from_memory,
        stbi_load_gif_from_memory, stbi_loadf, stbi_loadf_from_callbacks, stbi_loadf_from_file, stbi_loadf_from_memory,
        stbi_set_flip_vertically_on_load, stbi_set_flip_vertically_on_load_thread, stbi_set_unpremultiply_on_load,
        stbi_zlib_decode_buffer, stbi_zlib_decode_malloc, stbi_zlib_decode_malloc_guesssize,
        stbi_zlib_decode_malloc_guesssize_headerflag, stbi_zlib_decode_noheader_buffer, stbi_zlib_decode_noheader_malloc;

    // only used for desiredChannels
    /**
     * Image channels
     */
    public static final int
        DEFAULT = 0,
        GREY = 1,
        GREY_ALPHA = 2,
        RGB = 3,
        RGB_ALPHA = 4;

    static {
        initialize();
        create();
    }

    private static void create() {
        stbi__unpremultiply_on_load_thread = downcall("stbi__unpremultiply_on_load_thread", IV);
        stbi_convert_iphone_png_to_rgb = downcall("stbi_convert_iphone_png_to_rgb", IV);
        stbi_convert_iphone_png_to_rgb_thread = downcall("stbi_convert_iphone_png_to_rgb_thread", IV);
        stbi_failure_reason = downcall("stbi_failure_reason", P);
        stbi_hdr_to_ldr_gamma = downcall("stbi_hdr_to_ldr_gamma", FV);
        stbi_hdr_to_ldr_scale = downcall("stbi_hdr_to_ldr_scale", FV);
        stbi_image_free = downcall("stbi_image_free", PV);
        stbi_info = downcall("stbi_info", PPPPI);
        stbi_info_from_callbacks = downcall("stbi_info_from_callbacks", PPPPPI);
        stbi_info_from_file = downcall("stbi_info_from_file", PPPPI);
        stbi_info_from_memory = downcall("stbi_info_from_memory", PIPPPI);
        stbi_is_16_bit = downcall("stbi_is_16_bit", fd_PI);
        stbi_is_16_bit_from_callbacks = downcall("stbi_is_16_bit_from_callbacks", PPI);
        stbi_is_16_bit_from_file = downcall("stbi_is_16_bit_from_file", fd_PI);
        stbi_is_16_bit_from_memory = downcall("stbi_is_16_bit_from_memory", PII);
        stbi_is_hdr = downcall("stbi_is_hdr", fd_PI);
        stbi_is_hdr_from_callbacks = downcall("stbi_is_hdr_from_callbacks", PPI);
        stbi_is_hdr_from_file = downcall("stbi_is_hdr_from_file", fd_PI);
        stbi_is_hdr_from_memory = downcall("stbi_is_hdr_from_memory", PII);
        stbi_ldr_to_hdr_gamma = downcall("stbi_ldr_to_hdr_gamma", FV);
        stbi_ldr_to_hdr_scale = downcall("stbi_ldr_to_hdr_scale", FV);
        stbi_load = downcall("stbi_load", PPPPIP);
        stbi_load_16 = downcall("stbi_load_16", PPPPIP);
        stbi_load_16_from_callbacks = downcall("stbi_load_16_from_callbacks", PPPPPIP);
        stbi_load_16_from_memory = downcall("stbi_load_16_from_memory", PIPPPIP);
        stbi_load_from_callbacks = downcall("stbi_load_from_callbacks", PPPPPIP);
        stbi_load_from_file = downcall("stbi_load_from_file", PPPPIP);
        stbi_load_from_file_16 = downcall("stbi_load_from_file_16", PPPPIP);
        stbi_load_from_memory = downcall("stbi_load_from_memory", PIPPPIP);
        stbi_load_gif_from_memory = downcall("stbi_load_gif_from_memory", PIPPPPPIP);
        stbi_loadf = downcall("stbi_loadf", PPPPIP);
        stbi_loadf_from_callbacks = downcall("stbi_loadf_from_callbacks", PPPPPIP);
        stbi_loadf_from_file = downcall("stbi_loadf_from_file", PPPPIP);
        stbi_loadf_from_memory = downcall("stbi_loadf_from_memory", PIPPPIP);
        stbi_set_flip_vertically_on_load = downcall("stbi_set_flip_vertically_on_load", IV);
        stbi_set_flip_vertically_on_load_thread = downcall("stbi_set_flip_vertically_on_load_thread", IV);
        stbi_set_unpremultiply_on_load = downcall("stbi_set_unpremultiply_on_load", IV);
        stbi_zlib_decode_buffer = downcall("stbi_zlib_decode_buffer", PIPII);
        stbi_zlib_decode_malloc = downcall("stbi_zlib_decode_malloc", PIPP);
        stbi_zlib_decode_malloc_guesssize = downcall("stbi_zlib_decode_malloc_guesssize", PIIPP);
        stbi_zlib_decode_malloc_guesssize_headerflag = downcall("stbi_zlib_decode_malloc_guesssize_headerflag", PIIPIP);
        stbi_zlib_decode_noheader_buffer = downcall("stbi_zlib_decode_noheader_buffer", PIPII);
        stbi_zlib_decode_noheader_malloc = downcall("stbi_zlib_decode_noheader_malloc", PIPP);
    }

    protected STBImage() {
        throw new IllegalStateException("Do not construct instance");
    }

    public static void setUnpremultiplyOnLoadThread(boolean flagTrueIfShouldUnpremultiply) {
        try {
            stbi__unpremultiply_on_load_thread.invokeExact(flagTrueIfShouldUnpremultiply ? 1 : 0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void convertIphonePngToRgb(boolean flagTrueIfShouldConvert) {
        try {
            stbi_convert_iphone_png_to_rgb.invokeExact(flagTrueIfShouldConvert ? 1 : 0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void convertIphonePngToRgbThread(boolean flagTrueIfShouldConvert) {
        try {
            stbi_convert_iphone_png_to_rgb_thread.invokeExact(flagTrueIfShouldConvert ? 1 : 0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemoryAddress nfailureReason() {
        try {
            return (MemoryAddress) stbi_failure_reason.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    @Nullable
    public static String failureReason() {
        var pReason = nfailureReason();
        return pReason != MemoryAddress.NULL ? pReason.getUtf8String(0) : null;
    }

    public static void hdrToLdrGamma(float gamma) {
        try {
            stbi_hdr_to_ldr_gamma.invokeExact(gamma);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void hdrToLdrScale(float scale) {
        try {
            stbi_hdr_to_ldr_scale.invokeExact(scale);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void free(Addressable retValFromLoad) {
        try {
            stbi_image_free.invokeExact(retValFromLoad);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean ninfo(Addressable filename, Addressable x, Addressable y, Addressable comp) {
        try {
            return (int) stbi_info.invokeExact(filename, x, y, comp) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean info(SegmentAllocator allocator, String filename, int[] x, int[] y, int[] comp) {
        var px = allocator.allocate(JAVA_INT);
        var py = allocator.allocate(JAVA_INT);
        var pc = allocator.allocate(JAVA_INT);
        boolean b = ninfo(allocator.allocateUtf8String(filename), px, py, pc);
        x[0] = px.get(JAVA_INT, 0);
        y[0] = py.get(JAVA_INT, 0);
        comp[0] = pc.get(JAVA_INT, 0);
        return b;
    }

    public static boolean ninfoFromCallbacks(Addressable clbk, Addressable user, Addressable x, Addressable y, Addressable comp) {
        try {
            return (int) stbi_info_from_callbacks.invokeExact(clbk, user, x, y, comp) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean infoFromCallbacks(STBIIoCallbacks clbk, Addressable user, int[] x, int[] y, int[] comp) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = stack.calloc(JAVA_INT);
            var py = stack.calloc(JAVA_INT);
            var pc = stack.calloc(JAVA_INT);
            boolean b = ninfoFromCallbacks(clbk.rawAddress(), user, px, py, pc);
            x[0] = px.get(JAVA_INT, 0);
            y[0] = py.get(JAVA_INT, 0);
            comp[0] = pc.get(JAVA_INT, 0);
            return b;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static boolean ninfoFromFile(Addressable f, Addressable x, Addressable y, Addressable comp) {
        try {
            return (int) stbi_info_from_file.invokeExact(f, x, y, comp) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean infoFromFile(Addressable f, int[] x, int[] y, int[] comp) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = stack.calloc(JAVA_INT);
            var py = stack.calloc(JAVA_INT);
            var pc = stack.calloc(JAVA_INT);
            boolean b = ninfoFromFile(f, px, py, pc);
            x[0] = px.get(JAVA_INT, 0);
            y[0] = py.get(JAVA_INT, 0);
            comp[0] = pc.get(JAVA_INT, 0);
            return b;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static boolean ninfoFromMemory(Addressable buffer, int len, Addressable x, Addressable y, Addressable comp) {
        try {
            return (int) stbi_info_from_memory.invokeExact(buffer, len, x, y, comp) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean infoFromMemory(MemorySegment buffer, int[] x, int[] y, int[] comp) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = stack.calloc(JAVA_INT);
            var py = stack.calloc(JAVA_INT);
            var pc = stack.calloc(JAVA_INT);
            boolean b = ninfoFromMemory(buffer, (int) buffer.byteSize(), px, py, pc);
            x[0] = px.get(JAVA_INT, 0);
            y[0] = py.get(JAVA_INT, 0);
            comp[0] = pc.get(JAVA_INT, 0);
            return b;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static boolean infoFromMemory(SegmentAllocator allocator, byte[] buffer, int[] x, int[] y, int[] comp) {
        return infoFromMemory(allocator.allocateArray(JAVA_BYTE, buffer), x, y, comp);
    }

    public static boolean nis16Bit(Addressable filename) {
        try {
            return (int) stbi_is_16_bit.invokeExact(filename) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean is16Bit(SegmentAllocator allocator, String filename) {
        return nis16Bit(allocator.allocateUtf8String(filename));
    }

    public static boolean nis16BitFromCallbacks(Addressable clbk, Addressable user) {
        try {
            return (int) stbi_is_16_bit_from_callbacks.invokeExact(clbk, user) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean is16BitFromCallbacks(STBIIoCallbacks clbk, Addressable user) {
        return nis16BitFromCallbacks(clbk.rawAddress(), user);
    }

    public static boolean is16BitFromFile(Addressable f) {
        try {
            return (int) stbi_is_16_bit_from_file.invokeExact(f) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean nis16BitFromMemory(Addressable buffer, int len) {
        try {
            return (int) stbi_is_16_bit_from_memory.invokeExact(buffer, len) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean is16BitFromMemory(MemorySegment buffer) {
        return nis16BitFromMemory(buffer, (int) buffer.byteSize());
    }

    public static boolean is16BitFromMemory(SegmentAllocator allocator, byte[] buffer) {
        return is16BitFromMemory(allocator.allocateArray(JAVA_BYTE, buffer));
    }

    public static boolean nisHdr(Addressable filename) {
        try {
            return (int) stbi_is_hdr.invokeExact(filename) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean isHdr(SegmentAllocator allocator, String filename) {
        return nisHdr(allocator.allocateUtf8String(filename));
    }

    public static boolean nisHdrFromCallbacks(Addressable clbk, Addressable user) {
        try {
            return (int) stbi_is_hdr_from_callbacks.invokeExact(clbk, user) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean isHdrFromCallbacks(STBIIoCallbacks clbk, Addressable user) {
        return nisHdrFromCallbacks(clbk.rawAddress(), user);
    }

    public static boolean isHdrFromFile(Addressable f) {
        try {
            return (int) stbi_is_hdr_from_file.invokeExact(f) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean nisHdrFromMemory(Addressable buffer, int len) {
        try {
            return (int) stbi_is_hdr_from_memory.invokeExact(buffer, len) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean isHdrFromMemory(MemorySegment buffer) {
        return nisHdrFromMemory(buffer, (int) buffer.byteSize());
    }

    public static boolean isHdrFromMemory(SegmentAllocator allocator, byte[] buffer) {
        return isHdrFromMemory(allocator.allocateArray(JAVA_BYTE, buffer));
    }

    public static void ldrToHdrGamma(float gamma) {
        try {
            stbi_ldr_to_hdr_gamma.invokeExact(gamma);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void ldrToHdrScale(float scale) {
        try {
            stbi_ldr_to_hdr_scale.invokeExact(scale);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemoryAddress nload(Addressable filename, Addressable x, Addressable y, Addressable channelsInFile, int desiredChannels) {
        try {
            return (MemoryAddress) stbi_load.invokeExact(filename, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemoryAddress load(SegmentAllocator allocator, String filename, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        var px = allocator.allocate(JAVA_INT);
        var py = allocator.allocate(JAVA_INT);
        var pc = allocator.allocate(JAVA_INT);
        var addr = nload(allocator.allocateUtf8String(filename), px, py, pc, desiredChannels);
        x[0] = px.get(JAVA_INT, 0);
        y[0] = py.get(JAVA_INT, 0);
        channelsInFile[0] = pc.get(JAVA_INT, 0);
        return addr;
    }

    public static MemoryAddress nload16(Addressable filename, Addressable x, Addressable y, Addressable channelsInFile, int desiredChannels) {
        try {
            return (MemoryAddress) stbi_load_16.invokeExact(filename, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemoryAddress load16(SegmentAllocator allocator, String filename, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        var px = allocator.allocate(JAVA_INT);
        var py = allocator.allocate(JAVA_INT);
        var pc = allocator.allocate(JAVA_INT);
        var addr = nload16(allocator.allocateUtf8String(filename), px, py, pc, desiredChannels);
        x[0] = px.get(JAVA_INT, 0);
        y[0] = py.get(JAVA_INT, 0);
        channelsInFile[0] = pc.get(JAVA_INT, 0);
        return addr;
    }

    public static MemoryAddress nload16FromCallbacks(Addressable clbk, Addressable user, Addressable x, Addressable y, Addressable channelsInFile, int desiredChannels) {
        try {
            return (MemoryAddress) stbi_load_16_from_callbacks.invokeExact(clbk, user, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemoryAddress load16FromCallbacks(STBIIoCallbacks clbk, Addressable user, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = stack.calloc(JAVA_INT);
            var py = stack.calloc(JAVA_INT);
            var pc = stack.calloc(JAVA_INT);
            var addr = nload16FromCallbacks(clbk.rawAddress(), user, px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0);
            y[0] = py.get(JAVA_INT, 0);
            channelsInFile[0] = pc.get(JAVA_INT, 0);
            return addr;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static MemoryAddress nload16FromMemory(Addressable buffer, int len, Addressable x, Addressable y, Addressable channelsInFile, int desiredChannels) {
        try {
            return (MemoryAddress) stbi_load_16_from_memory.invokeExact(buffer, len, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemoryAddress load16FromMemory(MemorySegment buffer, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = stack.calloc(JAVA_INT);
            var py = stack.calloc(JAVA_INT);
            var pc = stack.calloc(JAVA_INT);
            var addr = nload16FromMemory(buffer, (int) buffer.byteSize(), px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0);
            y[0] = py.get(JAVA_INT, 0);
            channelsInFile[0] = pc.get(JAVA_INT, 0);
            return addr;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static MemoryAddress load16FromMemory(SegmentAllocator allocator, byte[] buffer, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        return load16FromMemory(allocator.allocateArray(JAVA_BYTE, buffer), x, y, channelsInFile, desiredChannels);
    }

    public static MemoryAddress nloadFromCallbacks(Addressable clbk, Addressable user, Addressable x, Addressable y, Addressable channelsInFile, int desiredChannels) {
        try {
            return (MemoryAddress) stbi_load_from_callbacks.invokeExact(clbk, user, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemoryAddress loadFromCallbacks(STBIIoCallbacks clbk, Addressable user, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = stack.calloc(JAVA_INT);
            var py = stack.calloc(JAVA_INT);
            var pc = stack.calloc(JAVA_INT);
            var addr = nloadFromCallbacks(clbk.rawAddress(), user, px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0);
            y[0] = py.get(JAVA_INT, 0);
            channelsInFile[0] = pc.get(JAVA_INT, 0);
            return addr;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static MemoryAddress nloadFromFile(Addressable f, Addressable x, Addressable y, Addressable channelsInFile, int desiredChannels) {
        try {
            return (MemoryAddress) stbi_load_from_file.invokeExact(f, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemoryAddress loadFromFile(Addressable f, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = stack.calloc(JAVA_INT);
            var py = stack.calloc(JAVA_INT);
            var pc = stack.calloc(JAVA_INT);
            var addr = nloadFromFile(f, px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0);
            y[0] = py.get(JAVA_INT, 0);
            channelsInFile[0] = pc.get(JAVA_INT, 0);
            return addr;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static MemoryAddress nloadFromFile16(Addressable f, Addressable x, Addressable y, Addressable channelsInFile, int desiredChannels) {
        try {
            return (MemoryAddress) stbi_load_from_file_16.invokeExact(f, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemoryAddress loadFromFile16(Addressable f, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = stack.calloc(JAVA_INT);
            var py = stack.calloc(JAVA_INT);
            var pc = stack.calloc(JAVA_INT);
            var addr = nloadFromFile16(f, px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0);
            y[0] = py.get(JAVA_INT, 0);
            channelsInFile[0] = pc.get(JAVA_INT, 0);
            return addr;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static MemoryAddress nloadFromMemory(Addressable buffer, int len, Addressable x, Addressable y, Addressable channelsInFile, int desiredChannels) {
        try {
            return (MemoryAddress) stbi_load_from_memory.invokeExact(buffer, len, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemoryAddress loadFromMemory(MemorySegment buffer, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = stack.calloc(JAVA_INT);
            var py = stack.calloc(JAVA_INT);
            var pc = stack.calloc(JAVA_INT);
            var addr = nloadFromMemory(buffer, (int) buffer.byteSize(), px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0);
            y[0] = py.get(JAVA_INT, 0);
            channelsInFile[0] = pc.get(JAVA_INT, 0);
            return addr;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static MemoryAddress loadFromMemory(SegmentAllocator allocator, byte[] buffer, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        var px = allocator.allocate(JAVA_INT);
        var py = allocator.allocate(JAVA_INT);
        var pc = allocator.allocate(JAVA_INT);
        var addr = nloadFromMemory(allocator.allocateArray(JAVA_BYTE, buffer), buffer.length, px, py, pc, desiredChannels);
        x[0] = px.get(JAVA_INT, 0);
        y[0] = py.get(JAVA_INT, 0);
        channelsInFile[0] = pc.get(JAVA_INT, 0);
        return addr;
    }

    public static MemoryAddress nloadGifFromMemory(Addressable buffer, int len, Addressable delays, Addressable x, Addressable y, Addressable z, Addressable comp, int reqComp) {
        try {
            return (MemoryAddress) stbi_load_gif_from_memory.invokeExact(buffer, len, delays, x, y, z, comp, reqComp);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemoryAddress loadGifFromMemory(MemorySegment buffer, int[][] delays, int[] x, int[] y, int[] z, int[] comp, int reqComp) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var pd = stack.calloc(ADDRESS);
            var px = stack.calloc(JAVA_INT);
            var py = stack.calloc(JAVA_INT);
            var pz = stack.calloc(JAVA_INT);
            var pc = stack.calloc(JAVA_INT);
            var addr = nloadGifFromMemory(buffer, (int) buffer.byteSize(), pd, px, py, pz, pc, reqComp);
            x[0] = px.get(JAVA_INT, 0);
            y[0] = py.get(JAVA_INT, 0);
            final int layers = pz.get(JAVA_INT, 0);
            z[0] = layers;
            comp[0] = pc.get(JAVA_INT, 0);
            delays[0] = RuntimeHelper.toArray(pd.get(ADDRESS, 0), new int[layers]);
            return addr;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static MemoryAddress loadGifFromMemory(SegmentAllocator allocator, byte[] buffer, int[][] delays, int[] x, int[] y, int[] z, int[] comp, int reqComp) {
        return loadGifFromMemory(allocator.allocateArray(JAVA_BYTE, buffer), delays, x, y, z, comp, reqComp);
    }

    public static MemoryAddress nloadf(Addressable filename, Addressable x, Addressable y, Addressable channelsInFile, int desiredChannels) {
        try {
            return (MemoryAddress) stbi_loadf.invokeExact(filename, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemoryAddress loadf(SegmentAllocator allocator, String filename, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        var px = allocator.allocate(JAVA_INT);
        var py = allocator.allocate(JAVA_INT);
        var pc = allocator.allocate(JAVA_INT);
        var addr = nloadf(allocator.allocateUtf8String(filename), px, py, pc, desiredChannels);
        x[0] = px.get(JAVA_INT, 0);
        y[0] = py.get(JAVA_INT, 0);
        channelsInFile[0] = pc.get(JAVA_INT, 0);
        return addr;
    }

    public static MemoryAddress nloadfFromCallbacks(Addressable clbk, Addressable user, Addressable x, Addressable y, Addressable channelsInFile, int desiredChannels) {
        try {
            return (MemoryAddress) stbi_loadf_from_callbacks.invokeExact(clbk, user, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemoryAddress loadfFromCallbacks(STBIIoCallbacks clbk, Addressable user, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = stack.calloc(JAVA_INT);
            var py = stack.calloc(JAVA_INT);
            var pc = stack.calloc(JAVA_INT);
            var addr = nloadfFromCallbacks(clbk.rawAddress(), user, px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0);
            y[0] = py.get(JAVA_INT, 0);
            channelsInFile[0] = pc.get(JAVA_INT, 0);
            return addr;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static MemoryAddress nloadfFromFile(Addressable f, Addressable x, Addressable y, Addressable channelsInFile, int desiredChannels) {
        try {
            return (MemoryAddress) stbi_loadf_from_file.invokeExact(f, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemoryAddress loadfFromFile(Addressable f, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = stack.calloc(JAVA_INT);
            var py = stack.calloc(JAVA_INT);
            var pc = stack.calloc(JAVA_INT);
            var addr = nloadfFromFile(f, px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0);
            y[0] = py.get(JAVA_INT, 0);
            channelsInFile[0] = pc.get(JAVA_INT, 0);
            return addr;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static MemoryAddress nloadfFromMemory(Addressable buffer, int len, Addressable x, Addressable y, Addressable channelsInFile, int desiredChannels) {
        try {
            return (MemoryAddress) stbi_loadf_from_memory.invokeExact(buffer, len, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemoryAddress loadfFromMemory(MemorySegment buffer, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = stack.calloc(JAVA_INT);
            var py = stack.calloc(JAVA_INT);
            var pc = stack.calloc(JAVA_INT);
            var addr = nloadfFromMemory(buffer, (int) buffer.byteSize(), px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0);
            y[0] = py.get(JAVA_INT, 0);
            channelsInFile[0] = pc.get(JAVA_INT, 0);
            return addr;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static MemoryAddress loadfFromMemory(SegmentAllocator allocator, byte[] buffer, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        var px = allocator.allocate(JAVA_INT);
        var py = allocator.allocate(JAVA_INT);
        var pc = allocator.allocate(JAVA_INT);
        var addr = nloadfFromMemory(allocator.allocateArray(JAVA_BYTE, buffer), buffer.length, px, py, pc, desiredChannels);
        x[0] = px.get(JAVA_INT, 0);
        y[0] = py.get(JAVA_INT, 0);
        channelsInFile[0] = pc.get(JAVA_INT, 0);
        return addr;
    }

    public static void setFlipVerticallyOnLoad(boolean flagTrueIfShouldFlip) {
        try {
            stbi_set_flip_vertically_on_load.invokeExact(flagTrueIfShouldFlip ? 1 : 0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void setFlipVerticallyOnLoadThread(boolean flagTrueIfShouldFlip) {
        try {
            stbi_set_flip_vertically_on_load_thread.invokeExact(flagTrueIfShouldFlip ? 1 : 0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void setUnpremultiplyOnLoad(boolean flagTrueIfShouldUnpremultiply) {
        try {
            stbi_set_unpremultiply_on_load.invokeExact(flagTrueIfShouldUnpremultiply ? 1 : 0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int zlibDecodeBuffer(Addressable obuffer, int olen, Addressable ibuffer, int ilen) {
        try {
            return (int) stbi_zlib_decode_buffer.invokeExact(obuffer, olen, ibuffer, ilen);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemoryAddress zlibDecodeMalloc(Addressable buffer, int len, Addressable outLen) {
        try {
            return (MemoryAddress) stbi_zlib_decode_malloc.invokeExact(buffer, len, outLen);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemoryAddress zlibDecodeMallocGuesssize(Addressable buffer, int len, int initialSize, Addressable outLen) {
        try {
            return (MemoryAddress) stbi_zlib_decode_malloc_guesssize.invokeExact(buffer, len, initialSize, outLen);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemoryAddress zlibDecodeMallocGuesssizeHeaderflag(Addressable buffer, int len, int initialSize, Addressable outLen, int parseHeader) {
        try {
            return (MemoryAddress) stbi_zlib_decode_malloc_guesssize_headerflag.invokeExact(buffer, len, initialSize, outLen, parseHeader);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int zlibDecodeNoHeaderBuffer(Addressable obuffer, int olen, Addressable ibuffer, int ilen) {
        try {
            return (int) stbi_zlib_decode_noheader_buffer.invokeExact(obuffer, olen, ibuffer, ilen);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemoryAddress zlibDecodeNoheaderMalloc(Addressable buffer, int len, Addressable outLen) {
        try {
            return (MemoryAddress) stbi_zlib_decode_noheader_malloc.invokeExact(buffer, len, outLen);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}

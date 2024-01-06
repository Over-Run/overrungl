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

import org.jetbrains.annotations.Nullable;
import overrungl.internal.RuntimeHelper;
import overrungl.util.MemoryStack;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static overrungl.FunctionDescriptors.*;
import static overrungl.stb.Handles.*;

/**
 * The STB image reader.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class STBImage {
    private static final MethodHandle
        stbi_convert_iphone_png_to_rgb = downcall("stbi_convert_iphone_png_to_rgb", IV),
        stbi_convert_iphone_png_to_rgb_thread = downcall("stbi_convert_iphone_png_to_rgb_thread", IV),
        stbi_failure_reason = downcall("stbi_failure_reason", p),
        stbi_hdr_to_ldr_gamma = downcall("stbi_hdr_to_ldr_gamma", FV),
        stbi_hdr_to_ldr_scale = downcall("stbi_hdr_to_ldr_scale", FV),
        stbi_image_free = downcall("stbi_image_free", PV),
        stbi_info = downcall("stbi_info", PPPPI),
        stbi_info_from_callbacks = downcall("stbi_info_from_callbacks", PPPPPI),
        stbi_info_from_file = downcall("stbi_info_from_file", PPPPI),
        stbi_info_from_memory = downcall("stbi_info_from_memory", PIPPPI),
        stbi_is_16_bit = downcall("stbi_is_16_bit", fd_PI),
        stbi_is_16_bit_from_callbacks = downcall("stbi_is_16_bit_from_callbacks", PPI),
        stbi_is_16_bit_from_file = downcall("stbi_is_16_bit_from_file", fd_PI),
        stbi_is_16_bit_from_memory = downcall("stbi_is_16_bit_from_memory", PII),
        stbi_is_hdr = downcall("stbi_is_hdr", fd_PI),
        stbi_is_hdr_from_callbacks = downcall("stbi_is_hdr_from_callbacks", PPI),
        stbi_is_hdr_from_file = downcall("stbi_is_hdr_from_file", fd_PI),
        stbi_is_hdr_from_memory = downcall("stbi_is_hdr_from_memory", PII),
        stbi_ldr_to_hdr_gamma = downcall("stbi_ldr_to_hdr_gamma", FV),
        stbi_ldr_to_hdr_scale = downcall("stbi_ldr_to_hdr_scale", FV),
        stbi_load = downcall("stbi_load", PPPPIp),
        stbi_load_16 = downcall("stbi_load_16", PPPPIp),
        stbi_load_16_from_callbacks = downcall("stbi_load_16_from_callbacks", PPPPPIp),
        stbi_load_16_from_memory = downcall("stbi_load_16_from_memory", PIPPPIp),
        stbi_load_from_callbacks = downcall("stbi_load_from_callbacks", PPPPPIp),
        stbi_load_from_file = downcall("stbi_load_from_file", PPPPIp),
        stbi_load_from_file_16 = downcall("stbi_load_from_file_16", PPPPIp),
        stbi_load_from_memory = downcall("stbi_load_from_memory", PIPPPIp),
        stbi_load_gif_from_memory = downcall("stbi_load_gif_from_memory", PIPPPPPIp),
        stbi_loadf = downcall("stbi_loadf", PPPPIp),
        stbi_loadf_from_callbacks = downcall("stbi_loadf_from_callbacks", PPPPPIp),
        stbi_loadf_from_file = downcall("stbi_loadf_from_file", PPPPIp),
        stbi_loadf_from_memory = downcall("stbi_loadf_from_memory", PIPPPIp),
        stbi_set_flip_vertically_on_load = downcall("stbi_set_flip_vertically_on_load", IV),
        stbi_set_flip_vertically_on_load_thread = downcall("stbi_set_flip_vertically_on_load_thread", IV),
        stbi_set_unpremultiply_on_load = downcall("stbi_set_unpremultiply_on_load", IV),
        stbi_set_unpremultiply_on_load_thread = downcall("stbi_set_unpremultiply_on_load_thread", IV),
        stbi_zlib_decode_buffer = downcall("stbi_zlib_decode_buffer", PIPII),
        stbi_zlib_decode_malloc = downcall("stbi_zlib_decode_malloc", PIPp),
        stbi_zlib_decode_malloc_guesssize = downcall("stbi_zlib_decode_malloc_guesssize", PIIPp),
        stbi_zlib_decode_malloc_guesssize_headerflag = downcall("stbi_zlib_decode_malloc_guesssize_headerflag", PIIPIp),
        stbi_zlib_decode_noheader_buffer = downcall("stbi_zlib_decode_noheader_buffer", PIPII),
        stbi_zlib_decode_noheader_malloc = downcall("stbi_zlib_decode_noheader_malloc", PIPp);

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

    private STBImage() {
        throw new IllegalStateException("Do not construct instance");
    }

    public static void convertIphonePngToRgb(boolean shouldConvert) {
        try {
            stbi_convert_iphone_png_to_rgb.invokeExact(shouldConvert ? 1 : 0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void convertIphonePngToRgbThread(boolean shouldConvert) {
        try {
            stbi_convert_iphone_png_to_rgb_thread.invokeExact(shouldConvert ? 1 : 0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment nfailureReason() {
        try {
            return (MemorySegment) stbi_failure_reason.invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    @Nullable
    public static String failureReason() {
        var pReason = nfailureReason();
        return RuntimeHelper.isNullptr(pReason) ? null : pReason.getString(0);
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

    public static void free(MemorySegment retValFromLoad) {
        try {
            stbi_image_free.invokeExact(retValFromLoad);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean ninfo(MemorySegment filename, MemorySegment x, MemorySegment y, MemorySegment comp) {
        try {
            return (int) stbi_info.invokeExact(filename, x, y, comp) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean info(String filename, int[] x, int[] y, int[] comp) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            var px = stack.allocate(JAVA_INT);
            var py = stack.allocate(JAVA_INT);
            var pc = stack.allocate(JAVA_INT);
            boolean b = ninfo(stack.allocateFrom(filename), px, py, pc);
            x[0] = px.get(JAVA_INT, 0);
            y[0] = py.get(JAVA_INT, 0);
            comp[0] = pc.get(JAVA_INT, 0);
            return b;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static boolean ninfoFromCallbacks(MemorySegment clbk, MemorySegment user, MemorySegment x, MemorySegment y, MemorySegment comp) {
        try {
            return (int) stbi_info_from_callbacks.invokeExact(clbk, user, x, y, comp) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean infoFromCallbacks(STBIIoCallbacks clbk, MemorySegment user, int[] x, int[] y, int[] comp) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = stack.callocInt();
            var py = stack.callocInt();
            var pc = stack.callocInt();
            boolean b = ninfoFromCallbacks(clbk.address(), user, px, py, pc);
            x[0] = px.get(JAVA_INT, 0);
            y[0] = py.get(JAVA_INT, 0);
            comp[0] = pc.get(JAVA_INT, 0);
            return b;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static boolean ninfoFromFile(MemorySegment f, MemorySegment x, MemorySegment y, MemorySegment comp) {
        try {
            return (int) stbi_info_from_file.invokeExact(f, x, y, comp) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean infoFromFile(MemorySegment f, int[] x, int[] y, int[] comp) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = stack.callocInt();
            var py = stack.callocInt();
            var pc = stack.callocInt();
            boolean b = ninfoFromFile(f, px, py, pc);
            x[0] = px.get(JAVA_INT, 0);
            y[0] = py.get(JAVA_INT, 0);
            comp[0] = pc.get(JAVA_INT, 0);
            return b;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static boolean ninfoFromMemory(MemorySegment buffer, int len, MemorySegment x, MemorySegment y, MemorySegment comp) {
        try {
            return (int) stbi_info_from_memory.invokeExact(buffer, len, x, y, comp) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean infoFromMemory(MemorySegment buffer, MemorySegment x, MemorySegment y, MemorySegment comp) {
        return ninfoFromMemory(buffer, (int) buffer.byteSize(), x, y, comp);
    }

    public static boolean infoFromMemory(SegmentAllocator allocator, byte[] buffer, int[] x, int[] y, int[] comp) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = stack.callocInt();
            var py = stack.callocInt();
            var pc = stack.callocInt();
            boolean b = infoFromMemory(allocator.allocateFrom(JAVA_BYTE, buffer), px, py, pc);
            x[0] = px.get(JAVA_INT, 0);
            y[0] = py.get(JAVA_INT, 0);
            comp[0] = pc.get(JAVA_INT, 0);
            return b;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static boolean nis16Bit(MemorySegment filename) {
        try {
            return (int) stbi_is_16_bit.invokeExact(filename) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean is16Bit(String filename) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            return nis16Bit(stack.allocateFrom(filename));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static boolean nis16BitFromCallbacks(MemorySegment clbk, MemorySegment user) {
        try {
            return (int) stbi_is_16_bit_from_callbacks.invokeExact(clbk, user) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean is16BitFromCallbacks(STBIIoCallbacks clbk, MemorySegment user) {
        return nis16BitFromCallbacks(clbk.address(), user);
    }

    public static boolean is16BitFromFile(MemorySegment f) {
        try {
            return (int) stbi_is_16_bit_from_file.invokeExact(f) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean nis16BitFromMemory(MemorySegment buffer, int len) {
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
        return is16BitFromMemory(allocator.allocateFrom(JAVA_BYTE, buffer));
    }

    public static boolean nisHdr(MemorySegment filename) {
        try {
            return (int) stbi_is_hdr.invokeExact(filename) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean isHdr(String filename) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            return nisHdr(stack.allocateFrom(filename));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static boolean nisHdrFromCallbacks(MemorySegment clbk, MemorySegment user) {
        try {
            return (int) stbi_is_hdr_from_callbacks.invokeExact(clbk, user) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean isHdrFromCallbacks(STBIIoCallbacks clbk, MemorySegment user) {
        return nisHdrFromCallbacks(clbk.address(), user);
    }

    public static boolean isHdrFromFile(MemorySegment f) {
        try {
            return (int) stbi_is_hdr_from_file.invokeExact(f) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean nisHdrFromMemory(MemorySegment buffer, int len) {
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
        return isHdrFromMemory(allocator.allocateFrom(JAVA_BYTE, buffer));
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

    public static MemorySegment nload(MemorySegment filename, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels) {
        try {
            return (MemorySegment) stbi_load.invokeExact(filename, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment load(String filename, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            var px = stack.allocate(JAVA_INT);
            var py = stack.allocate(JAVA_INT);
            var pc = stack.allocate(JAVA_INT);
            var addr = nload(stack.allocateFrom(filename), px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0);
            y[0] = py.get(JAVA_INT, 0);
            channelsInFile[0] = pc.get(JAVA_INT, 0);
            return addr;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static MemorySegment nload16(MemorySegment filename, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels) {
        try {
            return (MemorySegment) stbi_load_16.invokeExact(filename, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment load16(String filename, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            var px = stack.allocate(JAVA_INT);
            var py = stack.allocate(JAVA_INT);
            var pc = stack.allocate(JAVA_INT);
            var addr = nload16(stack.allocateFrom(filename), px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0);
            y[0] = py.get(JAVA_INT, 0);
            channelsInFile[0] = pc.get(JAVA_INT, 0);
            return addr;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static MemorySegment nload16FromCallbacks(MemorySegment clbk, MemorySegment user, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels) {
        try {
            return (MemorySegment) stbi_load_16_from_callbacks.invokeExact(clbk, user, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment load16FromCallbacks(STBIIoCallbacks clbk, MemorySegment user, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = stack.callocInt();
            var py = stack.callocInt();
            var pc = stack.callocInt();
            var addr = nload16FromCallbacks(clbk.address(), user, px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0);
            y[0] = py.get(JAVA_INT, 0);
            channelsInFile[0] = pc.get(JAVA_INT, 0);
            return addr;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static MemorySegment nload16FromMemory(MemorySegment buffer, int len, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels) {
        try {
            return (MemorySegment) stbi_load_16_from_memory.invokeExact(buffer, len, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment load16FromMemory(MemorySegment buffer, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels) {
        return nload16FromMemory(buffer, (int) buffer.byteSize(), x, y, channelsInFile, desiredChannels);
    }

    public static MemorySegment load16FromMemory(SegmentAllocator allocator, byte[] buffer, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        var px = allocator.allocate(JAVA_INT);
        var py = allocator.allocate(JAVA_INT);
        var pc = allocator.allocate(JAVA_INT);
        var addr = load16FromMemory(allocator.allocateFrom(JAVA_BYTE, buffer), px, py, pc, desiredChannels);
        x[0] = px.get(JAVA_INT, 0);
        y[0] = py.get(JAVA_INT, 0);
        channelsInFile[0] = pc.get(JAVA_INT, 0);
        return addr;
    }

    public static MemorySegment nloadFromCallbacks(MemorySegment clbk, MemorySegment user, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels) {
        try {
            return (MemorySegment) stbi_load_from_callbacks.invokeExact(clbk, user, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment loadFromCallbacks(STBIIoCallbacks clbk, MemorySegment user, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = stack.callocInt();
            var py = stack.callocInt();
            var pc = stack.callocInt();
            var addr = nloadFromCallbacks(clbk.address(), user, px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0);
            y[0] = py.get(JAVA_INT, 0);
            channelsInFile[0] = pc.get(JAVA_INT, 0);
            return addr;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static MemorySegment nloadFromFile(MemorySegment f, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels) {
        try {
            return (MemorySegment) stbi_load_from_file.invokeExact(f, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment loadFromFile(MemorySegment f, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = stack.callocInt();
            var py = stack.callocInt();
            var pc = stack.callocInt();
            var addr = nloadFromFile(f, px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0);
            y[0] = py.get(JAVA_INT, 0);
            channelsInFile[0] = pc.get(JAVA_INT, 0);
            return addr;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static MemorySegment nloadFromFile16(MemorySegment f, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels) {
        try {
            return (MemorySegment) stbi_load_from_file_16.invokeExact(f, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment loadFromFile16(MemorySegment f, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = stack.callocInt();
            var py = stack.callocInt();
            var pc = stack.callocInt();
            var addr = nloadFromFile16(f, px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0);
            y[0] = py.get(JAVA_INT, 0);
            channelsInFile[0] = pc.get(JAVA_INT, 0);
            return addr;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static MemorySegment nloadFromMemory(MemorySegment buffer, int len, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels) {
        try {
            return (MemorySegment) stbi_load_from_memory.invokeExact(buffer, len, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment loadFromMemory(MemorySegment buffer, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels) {
        return nloadFromMemory(buffer, (int) buffer.byteSize(), x, y, channelsInFile, desiredChannels);
    }

    public static MemorySegment loadFromMemory(SegmentAllocator allocator, byte[] buffer, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        var px = allocator.allocate(JAVA_INT);
        var py = allocator.allocate(JAVA_INT);
        var pc = allocator.allocate(JAVA_INT);
        var addr = nloadFromMemory(allocator.allocateFrom(JAVA_BYTE, buffer), buffer.length, px, py, pc, desiredChannels);
        x[0] = px.get(JAVA_INT, 0);
        y[0] = py.get(JAVA_INT, 0);
        channelsInFile[0] = pc.get(JAVA_INT, 0);
        return addr;
    }

    public static MemorySegment nloadGifFromMemory(MemorySegment buffer, int len, MemorySegment delays, MemorySegment x, MemorySegment y, MemorySegment z, MemorySegment comp, int reqComp) {
        try {
            return (MemorySegment) stbi_load_gif_from_memory.invokeExact(buffer, len, delays, x, y, z, comp, reqComp);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment loadGifFromMemory(MemorySegment buffer, MemorySegment delays, MemorySegment x, MemorySegment y, MemorySegment z, MemorySegment comp, int reqComp) {
        return nloadGifFromMemory(buffer, (int) buffer.byteSize(), delays, x, y, z, comp, reqComp);
    }

    public static MemorySegment loadGifFromMemory(SegmentAllocator allocator, byte[] buffer, int[][] delays, int[] x, int[] y, int[] z, int[] comp, int reqComp) {
        var pd = allocator.allocate(ADDRESS);
        var px = allocator.allocate(JAVA_INT);
        var py = allocator.allocate(JAVA_INT);
        var pz = allocator.allocate(JAVA_INT);
        var pc = allocator.allocate(JAVA_INT);
        var addr = loadGifFromMemory(allocator.allocateFrom(JAVA_BYTE, buffer), pd, px, py, pz, pc, reqComp);
        x[0] = px.get(JAVA_INT, 0);
        y[0] = py.get(JAVA_INT, 0);
        final int layers = pz.get(JAVA_INT, 0);
        z[0] = layers;
        comp[0] = pc.get(JAVA_INT, 0);
        delays[0] = RuntimeHelper.toArray(pd.get(ADDRESS.withTargetLayout(MemoryLayout.sequenceLayout(layers, JAVA_INT)), 0), new int[layers]);
        return addr;
    }

    public static MemorySegment nloadf(MemorySegment filename, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels) {
        try {
            return (MemorySegment) stbi_loadf.invokeExact(filename, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment loadf(String filename, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            var px = stack.allocate(JAVA_INT);
            var py = stack.allocate(JAVA_INT);
            var pc = stack.allocate(JAVA_INT);
            var addr = nloadf(stack.allocateFrom(filename), px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0);
            y[0] = py.get(JAVA_INT, 0);
            channelsInFile[0] = pc.get(JAVA_INT, 0);
            return addr;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static MemorySegment nloadfFromCallbacks(MemorySegment clbk, MemorySegment user, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels) {
        try {
            return (MemorySegment) stbi_loadf_from_callbacks.invokeExact(clbk, user, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment loadfFromCallbacks(STBIIoCallbacks clbk, MemorySegment user, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = stack.callocInt();
            var py = stack.callocInt();
            var pc = stack.callocInt();
            var addr = nloadfFromCallbacks(clbk.address(), user, px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0);
            y[0] = py.get(JAVA_INT, 0);
            channelsInFile[0] = pc.get(JAVA_INT, 0);
            return addr;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static MemorySegment nloadfFromFile(MemorySegment f, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels) {
        try {
            return (MemorySegment) stbi_loadf_from_file.invokeExact(f, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment loadfFromFile(MemorySegment f, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var px = stack.callocInt();
            var py = stack.callocInt();
            var pc = stack.callocInt();
            var addr = nloadfFromFile(f, px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0);
            y[0] = py.get(JAVA_INT, 0);
            channelsInFile[0] = pc.get(JAVA_INT, 0);
            return addr;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static MemorySegment nloadfFromMemory(MemorySegment buffer, int len, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels) {
        try {
            return (MemorySegment) stbi_loadf_from_memory.invokeExact(buffer, len, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment loadfFromMemory(MemorySegment buffer, MemorySegment x, MemorySegment y, MemorySegment channelsInFile, int desiredChannels) {
        return nloadfFromMemory(buffer, (int) buffer.byteSize(), x, y, channelsInFile, desiredChannels);
    }

    public static MemorySegment loadfFromMemory(SegmentAllocator allocator, byte[] buffer, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        var px = allocator.allocate(JAVA_INT);
        var py = allocator.allocate(JAVA_INT);
        var pc = allocator.allocate(JAVA_INT);
        var addr = nloadfFromMemory(allocator.allocateFrom(JAVA_BYTE, buffer), buffer.length, px, py, pc, desiredChannels);
        x[0] = px.get(JAVA_INT, 0);
        y[0] = py.get(JAVA_INT, 0);
        channelsInFile[0] = pc.get(JAVA_INT, 0);
        return addr;
    }

    public static void setFlipVerticallyOnLoad(boolean shouldFlip) {
        try {
            stbi_set_flip_vertically_on_load.invokeExact(shouldFlip ? 1 : 0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void setFlipVerticallyOnLoadThread(boolean shouldFlip) {
        try {
            stbi_set_flip_vertically_on_load_thread.invokeExact(shouldFlip ? 1 : 0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void setUnpremultiplyOnLoad(boolean shouldUnpremultiply) {
        try {
            stbi_set_unpremultiply_on_load.invokeExact(shouldUnpremultiply ? 1 : 0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void setUnpremultiplyOnLoadThread(boolean shouldUnpremultiply) {
        try {
            stbi_set_unpremultiply_on_load_thread.invokeExact(shouldUnpremultiply ? 1 : 0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int zlibDecodeBuffer(MemorySegment obuffer, int olen, MemorySegment ibuffer, int ilen) {
        try {
            return (int) stbi_zlib_decode_buffer.invokeExact(obuffer, olen, ibuffer, ilen);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment zlibDecodeMalloc(MemorySegment buffer, int len, MemorySegment outLen) {
        try {
            return (MemorySegment) stbi_zlib_decode_malloc.invokeExact(buffer, len, outLen);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment zlibDecodeMallocGuesssize(MemorySegment buffer, int len, int initialSize, MemorySegment outLen) {
        try {
            return (MemorySegment) stbi_zlib_decode_malloc_guesssize.invokeExact(buffer, len, initialSize, outLen);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment zlibDecodeMallocGuesssizeHeaderflag(MemorySegment buffer, int len, int initialSize, MemorySegment outLen, int parseHeader) {
        try {
            return (MemorySegment) stbi_zlib_decode_malloc_guesssize_headerflag.invokeExact(buffer, len, initialSize, outLen, parseHeader);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int zlibDecodeNoHeaderBuffer(MemorySegment obuffer, int olen, MemorySegment ibuffer, int ilen) {
        try {
            return (int) stbi_zlib_decode_noheader_buffer.invokeExact(obuffer, olen, ibuffer, ilen);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment zlibDecodeNoheaderMalloc(MemorySegment buffer, int len, MemorySegment outLen) {
        try {
            return (MemorySegment) stbi_zlib_decode_noheader_malloc.invokeExact(buffer, len, outLen);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}

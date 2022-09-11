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

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.stb.Handles.*;

/**
 * The STB image reader.
 *
 * @author squid233
 * @since 0.1.0
 */
public class STBImage {
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
        create();
    }

    protected STBImage() {
        throw new IllegalStateException("Do not construct instance");
    }

    public static void setUnpremultiplyOnLoadThread(boolean flagTrueIfShouldUnpremultiply) {
        try {
            stbi__unpremultiply_on_load_thread.invoke(flagTrueIfShouldUnpremultiply ? 1 : 0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void convertIphonePngToRgb(boolean flagTrueIfShouldConvert) {
        try {
            stbi_convert_iphone_png_to_rgb.invoke(flagTrueIfShouldConvert ? 1 : 0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void convertIphonePngToRgbThread(boolean flagTrueIfShouldConvert) {
        try {
            stbi_convert_iphone_png_to_rgb_thread.invoke(flagTrueIfShouldConvert ? 1 : 0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static MemoryAddress nfailureReason() {
        try {
            return (MemoryAddress) stbi_failure_reason.invoke();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    @Nullable
    public static String failureReason() {
        var pReason = nfailureReason();
        return pReason != MemoryAddress.NULL ? pReason.getUtf8String(0L) : null;
    }

    public static void hdrToLdrGamma(float gamma) {
        try {
            stbi_hdr_to_ldr_gamma.invoke(gamma);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void hdrToLdrScale(float scale) {
        try {
            stbi_hdr_to_ldr_scale.invoke(scale);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void free(Addressable retValFromLoad) {
        try {
            stbi_image_free.invoke(retValFromLoad);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static boolean ninfo(Addressable filename, Addressable x, Addressable y, Addressable comp) {
        try {
            return (int) stbi_info.invoke(filename, x, y, comp) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static boolean info(String filename, int[] x, int[] y, int[] comp) {
        try (var session = MemorySession.openShared()) {
            var px = session.allocate(JAVA_INT);
            var py = session.allocate(JAVA_INT);
            var pc = session.allocate(JAVA_INT);
            boolean b = ninfo(session.allocateUtf8String(filename), px, py, pc);
            x[0] = px.get(JAVA_INT, 0L);
            y[0] = py.get(JAVA_INT, 0L);
            comp[0] = pc.get(JAVA_INT, 0L);
            return b;
        }
    }

    public static boolean ninfoFromCallbacks(Addressable clbk, Addressable user, Addressable x, Addressable y, Addressable comp) {
        try {
            return (int) stbi_info_from_callbacks.invoke(clbk, user, x, y, comp) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static boolean infoFromCallbacks(STBIIoCallbacks clbk, Addressable user, int[] x, int[] y, int[] comp) {
        try (var session = MemorySession.openShared()) {
            var px = session.allocate(JAVA_INT);
            var py = session.allocate(JAVA_INT);
            var pc = session.allocate(JAVA_INT);
            boolean b = ninfoFromCallbacks(clbk.rawAddress(), user, px, py, pc);
            x[0] = px.get(JAVA_INT, 0L);
            y[0] = py.get(JAVA_INT, 0L);
            comp[0] = pc.get(JAVA_INT, 0L);
            return b;
        }
    }

    public static boolean ninfoFromFile(Addressable f, Addressable x, Addressable y, Addressable comp) {
        try {
            return (int) stbi_info_from_file.invoke(f, x, y, comp) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static boolean infoFromFile(Addressable f, int[] x, int[] y, int[] comp) {
        try (var session = MemorySession.openShared()) {
            var px = session.allocate(JAVA_INT);
            var py = session.allocate(JAVA_INT);
            var pc = session.allocate(JAVA_INT);
            boolean b = ninfoFromFile(f, px, py, pc);
            x[0] = px.get(JAVA_INT, 0L);
            y[0] = py.get(JAVA_INT, 0L);
            comp[0] = pc.get(JAVA_INT, 0L);
            return b;
        }
    }

    public static boolean ninfoFromMemory(Addressable buffer, int len, Addressable x, Addressable y, Addressable comp) {
        try {
            return (int) stbi_info_from_memory.invoke(buffer, len, x, y, comp) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static boolean infoFromMemory(MemorySegment buffer, int[] x, int[] y, int[] comp) {
        try (var session = MemorySession.openShared()) {
            var px = session.allocate(JAVA_INT);
            var py = session.allocate(JAVA_INT);
            var pc = session.allocate(JAVA_INT);
            boolean b = ninfoFromMemory(buffer, (int) buffer.byteSize(), px, py, pc);
            x[0] = px.get(JAVA_INT, 0L);
            y[0] = py.get(JAVA_INT, 0L);
            comp[0] = pc.get(JAVA_INT, 0L);
            return b;
        }
    }

    public static boolean infoFromMemory(byte[] buffer, int[] x, int[] y, int[] comp) {
        try (var session = MemorySession.openShared()) {
            return infoFromMemory(session.allocateArray(JAVA_BYTE, buffer), x, y, comp);
        }
    }

    public static boolean nis16Bit(Addressable filename) {
        try {
            return (int) stbi_is_16_bit.invoke(filename) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static boolean is16Bit(String filename) {
        try (var session = MemorySession.openShared()) {
            return nis16Bit(session.allocateUtf8String(filename));
        }
    }

    public static boolean nis16BitFromCallbacks(Addressable clbk, Addressable user) {
        try {
            return (int) stbi_is_16_bit_from_callbacks.invoke(clbk, user) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static boolean is16BitFromCallbacks(STBIIoCallbacks clbk, Addressable user) {
        return nis16BitFromCallbacks(clbk.rawAddress(), user);
    }

    public static boolean is16BitFromFile(Addressable f) {
        try {
            return (int) stbi_is_16_bit_from_file.invoke(f) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static boolean nis16BitFromMemory(Addressable buffer, int len) {
        try {
            return (int) stbi_is_16_bit_from_memory.invoke(buffer, len) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static boolean is16BitFromMemory(MemorySegment buffer) {
        return nis16BitFromMemory(buffer, (int) buffer.byteSize());
    }

    public static boolean is16BitFromMemory(byte[] buffer) {
        try (var session = MemorySession.openShared()) {
            return is16BitFromMemory(session.allocateArray(JAVA_BYTE, buffer));
        }
    }

    public static boolean nisHdr(Addressable filename) {
        try {
            return (int) stbi_is_hdr.invoke(filename) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static boolean isHdr(String filename) {
        try (var session = MemorySession.openShared()) {
            return nisHdr(session.allocateUtf8String(filename));
        }
    }

    public static boolean nisHdrFromCallbacks(Addressable clbk, Addressable user) {
        try {
            return (int) stbi_is_hdr_from_callbacks.invoke(clbk, user) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static boolean isHdrFromCallbacks(STBIIoCallbacks clbk, Addressable user) {
        return nisHdrFromCallbacks(clbk.rawAddress(), user);
    }

    public static boolean isHdrFromFile(Addressable f) {
        try {
            return (int) stbi_is_hdr_from_file.invoke(f) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static boolean nisHdrFromMemory(Addressable buffer, int len) {
        try {
            return (int) stbi_is_hdr_from_memory.invoke(buffer, len) != 0;
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static boolean isHdrFromMemory(MemorySegment buffer) {
        return nisHdrFromMemory(buffer, (int) buffer.byteSize());
    }

    public static boolean isHdrFromMemory(byte[] buffer) {
        try (var session = MemorySession.openShared()) {
            return isHdrFromMemory(session.allocateArray(JAVA_BYTE, buffer));
        }
    }

    public static void ldrToHdrGamma(float gamma) {
        try {
            stbi_ldr_to_hdr_gamma.invoke(gamma);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void ldrToHdrScale(float scale) {
        try {
            stbi_ldr_to_hdr_scale.invoke(scale);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static MemoryAddress nload(Addressable filename, Addressable x, Addressable y, Addressable channelsInFile, int desiredChannels) {
        try {
            return (MemoryAddress) stbi_load.invoke(filename, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static MemoryAddress load(String filename, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        try (var session = MemorySession.openShared()) {
            var px = session.allocate(JAVA_INT);
            var py = session.allocate(JAVA_INT);
            var pc = session.allocate(JAVA_INT);
            var addr = nload(session.allocateUtf8String(filename), px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0L);
            y[0] = py.get(JAVA_INT, 0L);
            channelsInFile[0] = pc.get(JAVA_INT, 0L);
            return addr;
        }
    }

    public static MemoryAddress nload16(Addressable filename, Addressable x, Addressable y, Addressable channelsInFile, int desiredChannels) {
        try {
            return (MemoryAddress) stbi_load_16.invoke(filename, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static MemoryAddress load16(String filename, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        try (var session = MemorySession.openShared()) {
            var px = session.allocate(JAVA_INT);
            var py = session.allocate(JAVA_INT);
            var pc = session.allocate(JAVA_INT);
            var addr = nload16(session.allocateUtf8String(filename), px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0L);
            y[0] = py.get(JAVA_INT, 0L);
            channelsInFile[0] = pc.get(JAVA_INT, 0L);
            return addr;
        }
    }

    public static MemoryAddress nload16FromCallbacks(Addressable clbk, Addressable user, Addressable x, Addressable y, Addressable channelsInFile, int desiredChannels) {
        try {
            return (MemoryAddress) stbi_load_16_from_callbacks.invoke(clbk, user, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static MemoryAddress load16FromCallbacks(STBIIoCallbacks clbk, Addressable user, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        try (var session = MemorySession.openShared()) {
            var px = session.allocate(JAVA_INT);
            var py = session.allocate(JAVA_INT);
            var pc = session.allocate(JAVA_INT);
            var addr = nload16FromCallbacks(clbk.rawAddress(), user, px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0L);
            y[0] = py.get(JAVA_INT, 0L);
            channelsInFile[0] = pc.get(JAVA_INT, 0L);
            return addr;
        }
    }

    public static MemoryAddress nload16FromMemory(Addressable buffer, int len, Addressable x, Addressable y, Addressable channelsInFile, int desiredChannels) {
        try {
            return (MemoryAddress) stbi_load_16_from_memory.invoke(buffer, len, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static MemoryAddress load16FromMemory(MemorySegment buffer, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        try (var session = MemorySession.openShared()) {
            var px = session.allocate(JAVA_INT);
            var py = session.allocate(JAVA_INT);
            var pc = session.allocate(JAVA_INT);
            var addr = nload16FromMemory(buffer, (int) buffer.byteSize(), px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0L);
            y[0] = py.get(JAVA_INT, 0L);
            channelsInFile[0] = pc.get(JAVA_INT, 0L);
            return addr;
        }
    }

    public static MemoryAddress load16FromMemory(byte[] buffer, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        try (var session = MemorySession.openShared()) {
            return load16FromMemory(session.allocateArray(JAVA_BYTE, buffer), x, y, channelsInFile, desiredChannels);
        }
    }

    public static MemoryAddress nloadFromCallbacks(Addressable clbk, Addressable user, Addressable x, Addressable y, Addressable channelsInFile, int desiredChannels) {
        try {
            return (MemoryAddress) stbi_load_from_callbacks.invoke(clbk, user, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static MemoryAddress loadFromCallbacks(STBIIoCallbacks clbk, Addressable user, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        try (var session = MemorySession.openShared()) {
            var px = session.allocate(JAVA_INT);
            var py = session.allocate(JAVA_INT);
            var pc = session.allocate(JAVA_INT);
            var addr = nloadFromCallbacks(clbk.rawAddress(), user, px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0L);
            y[0] = py.get(JAVA_INT, 0L);
            channelsInFile[0] = pc.get(JAVA_INT, 0L);
            return addr;
        }
    }

    public static MemoryAddress nloadFromFile(Addressable f, Addressable x, Addressable y, Addressable channelsInFile, int desiredChannels) {
        try {
            return (MemoryAddress) stbi_load_from_file.invoke(f, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static MemoryAddress loadFromFile(Addressable f, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        try (var session = MemorySession.openShared()) {
            var px = session.allocate(JAVA_INT);
            var py = session.allocate(JAVA_INT);
            var pc = session.allocate(JAVA_INT);
            var addr = nloadFromFile(f, px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0L);
            y[0] = py.get(JAVA_INT, 0L);
            channelsInFile[0] = pc.get(JAVA_INT, 0L);
            return addr;
        }
    }

    public static MemoryAddress nloadFromFile16(Addressable f, Addressable x, Addressable y, Addressable channelsInFile, int desiredChannels) {
        try {
            return (MemoryAddress) stbi_load_from_file_16.invoke(f, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static MemoryAddress loadFromFile16(Addressable f, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        try (var session = MemorySession.openShared()) {
            var px = session.allocate(JAVA_INT);
            var py = session.allocate(JAVA_INT);
            var pc = session.allocate(JAVA_INT);
            var addr = nloadFromFile16(f, px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0L);
            y[0] = py.get(JAVA_INT, 0L);
            channelsInFile[0] = pc.get(JAVA_INT, 0L);
            return addr;
        }
    }

    public static MemoryAddress nloadFromMemory(Addressable buffer, int len, Addressable x, Addressable y, Addressable channelsInFile, int desiredChannels) {
        try {
            return (MemoryAddress) stbi_load_from_memory.invoke(buffer, len, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static MemoryAddress loadFromMemory(MemorySegment buffer, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        try (var session = MemorySession.openShared()) {
            var px = session.allocate(JAVA_INT);
            var py = session.allocate(JAVA_INT);
            var pc = session.allocate(JAVA_INT);
            var addr = nloadFromMemory(buffer, (int) buffer.byteSize(), px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0L);
            y[0] = py.get(JAVA_INT, 0L);
            channelsInFile[0] = pc.get(JAVA_INT, 0L);
            return addr;
        }
    }

    public static MemoryAddress loadFromMemory(byte[] buffer, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        try (var session = MemorySession.openShared()) {
            var px = session.allocate(JAVA_INT);
            var py = session.allocate(JAVA_INT);
            var pc = session.allocate(JAVA_INT);
            var addr = nloadFromMemory(session.allocateArray(JAVA_BYTE, buffer), buffer.length, px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0L);
            y[0] = py.get(JAVA_INT, 0L);
            channelsInFile[0] = pc.get(JAVA_INT, 0L);
            return addr;
        }
    }

    public static MemoryAddress nloadGifFromMemory(Addressable buffer, int len, Addressable delays, Addressable x, Addressable y, Addressable z, Addressable comp, int reqComp) {
        try {
            return (MemoryAddress) stbi_load_gif_from_memory.invoke(buffer, len, delays, x, y, z, comp, reqComp);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static MemoryAddress loadGifFromMemory(MemorySegment buffer, int[][] delays, int[] x, int[] y, int[] z, int[] comp, int reqComp) {
        try (var session = MemorySession.openShared()) {
            var pd = session.allocate(ADDRESS);
            var px = session.allocate(JAVA_INT);
            var py = session.allocate(JAVA_INT);
            var pz = session.allocate(JAVA_INT);
            var pc = session.allocate(JAVA_INT);
            var addr = nloadGifFromMemory(buffer, (int) buffer.byteSize(), pd, px, py, pz, pc, reqComp);
            x[0] = px.get(JAVA_INT, 0L);
            y[0] = py.get(JAVA_INT, 0L);
            final int layers = pz.get(JAVA_INT, 0L);
            z[0] = layers;
            comp[0] = pc.get(JAVA_INT, 0L);
            delays[0] = new int[layers];
            for (int i = 0; i < layers; i++) {
                delays[0][i] = pd.get(ADDRESS, 0L).getAtIndex(JAVA_INT, i);
            }
            return addr;
        }
    }

    public static MemoryAddress loadGifFromMemory(byte[] buffer, int[][] delays, int[] x, int[] y, int[] z, int[] comp, int reqComp) {
        try (var session = MemorySession.openShared()) {
            return loadGifFromMemory(session.allocateArray(JAVA_BYTE, buffer), delays, x, y, z, comp, reqComp);
        }
    }

    public static MemoryAddress nloadf(Addressable filename, Addressable x, Addressable y, Addressable channelsInFile, int desiredChannels) {
        try {
            return (MemoryAddress) stbi_loadf.invoke(filename, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static MemoryAddress loadf(String filename, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        try (var session = MemorySession.openShared()) {
            var px = session.allocate(JAVA_INT);
            var py = session.allocate(JAVA_INT);
            var pc = session.allocate(JAVA_INT);
            var addr = nloadf(session.allocateUtf8String(filename), px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0L);
            y[0] = py.get(JAVA_INT, 0L);
            channelsInFile[0] = pc.get(JAVA_INT, 0L);
            return addr;
        }
    }

    public static MemoryAddress nloadfFromCallbacks(Addressable clbk, Addressable user, Addressable x, Addressable y, Addressable channelsInFile, int desiredChannels) {
        try {
            return (MemoryAddress) stbi_loadf_from_callbacks.invoke(clbk, user, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static MemoryAddress loadfFromCallbacks(STBIIoCallbacks clbk, Addressable user, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        try (var session = MemorySession.openShared()) {
            var px = session.allocate(JAVA_INT);
            var py = session.allocate(JAVA_INT);
            var pc = session.allocate(JAVA_INT);
            var addr = nloadfFromCallbacks(clbk.rawAddress(), user, px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0L);
            y[0] = py.get(JAVA_INT, 0L);
            channelsInFile[0] = pc.get(JAVA_INT, 0L);
            return addr;
        }
    }

    public static MemoryAddress nloadfFromFile(Addressable f, Addressable x, Addressable y, Addressable channelsInFile, int desiredChannels) {
        try {
            return (MemoryAddress) stbi_loadf_from_file.invoke(f, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static MemoryAddress loadfFromFile(Addressable f, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        try (var session = MemorySession.openShared()) {
            var px = session.allocate(JAVA_INT);
            var py = session.allocate(JAVA_INT);
            var pc = session.allocate(JAVA_INT);
            var addr = nloadfFromFile(f, px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0L);
            y[0] = py.get(JAVA_INT, 0L);
            channelsInFile[0] = pc.get(JAVA_INT, 0L);
            return addr;
        }
    }

    public static MemoryAddress nloadfFromMemory(Addressable buffer, int len, Addressable x, Addressable y, Addressable channelsInFile, int desiredChannels) {
        try {
            return (MemoryAddress) stbi_loadf_from_memory.invoke(buffer, len, x, y, channelsInFile, desiredChannels);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static MemoryAddress loadfFromMemory(MemorySegment buffer, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        try (var session = MemorySession.openShared()) {
            var px = session.allocate(JAVA_INT);
            var py = session.allocate(JAVA_INT);
            var pc = session.allocate(JAVA_INT);
            var addr = nloadfFromMemory(buffer, (int) buffer.byteSize(), px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0L);
            y[0] = py.get(JAVA_INT, 0L);
            channelsInFile[0] = pc.get(JAVA_INT, 0L);
            return addr;
        }
    }

    public static MemoryAddress loadfFromMemory(byte[] buffer, int[] x, int[] y, int[] channelsInFile, int desiredChannels) {
        try (var session = MemorySession.openShared()) {
            var px = session.allocate(JAVA_INT);
            var py = session.allocate(JAVA_INT);
            var pc = session.allocate(JAVA_INT);
            var addr = nloadfFromMemory(session.allocateArray(JAVA_BYTE, buffer), buffer.length, px, py, pc, desiredChannels);
            x[0] = px.get(JAVA_INT, 0L);
            y[0] = py.get(JAVA_INT, 0L);
            channelsInFile[0] = pc.get(JAVA_INT, 0L);
            return addr;
        }
    }

    public static void setFlipVerticallyOnLoad(boolean flagTrueIfShouldFlip) {
        try {
            stbi_set_flip_vertically_on_load.invoke(flagTrueIfShouldFlip ? 1 : 0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void setFlipVerticallyOnLoadThread(boolean flagTrueIfShouldFlip) {
        try {
            stbi_set_flip_vertically_on_load_thread.invoke(flagTrueIfShouldFlip ? 1 : 0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static void setUnpremultiplyOnLoad(boolean flagTrueIfShouldUnpremultiply) {
        try {
            stbi_set_unpremultiply_on_load.invoke(flagTrueIfShouldUnpremultiply ? 1 : 0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static int zlibDecodeBuffer(Addressable obuffer, int olen, Addressable ibuffer, int ilen) {
        try {
            return (int) stbi_zlib_decode_buffer.invoke(obuffer, olen, ibuffer, ilen);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static MemoryAddress zlibDecodeMalloc(Addressable buffer, int len, Addressable outLen) {
        try {
            return (MemoryAddress) stbi_zlib_decode_malloc.invoke(buffer, len, outLen);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static MemoryAddress zlibDecodeMallocGuesssize(Addressable buffer, int len, int initialSize, Addressable outLen) {
        try {
            return (MemoryAddress) stbi_zlib_decode_malloc_guesssize.invoke(buffer, len, initialSize, outLen);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static MemoryAddress zlibDecodeMallocGuesssizeHeaderflag(Addressable buffer, int len, int initialSize, Addressable outLen, int parseHeader) {
        try {
            return (MemoryAddress) stbi_zlib_decode_malloc_guesssize_headerflag.invoke(buffer, len, initialSize, outLen, parseHeader);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static int zlibDecodeNoHeaderBuffer(Addressable obuffer, int olen, Addressable ibuffer, int ilen) {
        try {
            return (int) stbi_zlib_decode_noheader_buffer.invoke(obuffer, olen, ibuffer, ilen);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }

    public static MemoryAddress zlibDecodeNoheaderMalloc(Addressable buffer, int len, Addressable outLen) {
        try {
            return (MemoryAddress) stbi_zlib_decode_noheader_malloc.invoke(buffer, len, outLen);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here");
        }
    }
}

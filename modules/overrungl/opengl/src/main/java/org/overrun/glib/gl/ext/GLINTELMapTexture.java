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

package org.overrun.glib.gl.ext;

import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;
import org.overrun.glib.gl.GLLoader;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

import static org.overrun.glib.FunctionDescriptors.*;

/**
 * {@code GL_INTEL_map_texture}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLINTELMapTexture {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_INTEL_map_texture) return;
        ext.glMapTexture2DINTEL = load.invoke("glMapTexture2DINTEL", IIIPPP);
        ext.glSyncTextureINTEL = load.invoke("glSyncTextureINTEL", IV);
        ext.glUnmapTexture2DINTEL = load.invoke("glUnmapTexture2DINTEL", IIV);
    }

    public static MemoryAddress glMapTexture2DINTEL(int texture, int level, int access, Addressable stride, Addressable layout) {
        var ext = GLLoader.getExtCapabilities();
        try {
            return (MemoryAddress) GLLoader.check(ext.glMapTexture2DINTEL).invokeExact(texture, level, access, stride, layout);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemoryAddress glMapTexture2DINTEL(SegmentAllocator allocator, int texture, int level, int access, int[] stride, int[] layout) {
        var pStride = allocator.allocate(ValueLayout.JAVA_INT);
        var pLayout = allocator.allocate(ValueLayout.JAVA_INT);
        var result = glMapTexture2DINTEL(texture, level, access, pStride, pLayout);
        stride[0] = pStride.get(ValueLayout.JAVA_INT, 0);
        layout[0] = pLayout.get(ValueLayout.JAVA_INT, 0);
        return result;
    }

    public static void glSyncTextureINTEL(int texture) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glSyncTextureINTEL).invokeExact(texture);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glUnmapTexture2DINTEL(int texture, int level) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glUnmapTexture2DINTEL).invokeExact(texture, level);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}

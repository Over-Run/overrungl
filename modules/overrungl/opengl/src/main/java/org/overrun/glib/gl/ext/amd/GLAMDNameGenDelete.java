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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.overrun.glib.gl.ext.amd;

import org.overrun.glib.FunctionDescriptors;
import org.overrun.glib.RuntimeHelper;
import org.overrun.glib.gl.GLExtCaps;
import org.overrun.glib.gl.GLLoadFunc;
import org.overrun.glib.util.MemoryStack;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static org.overrun.glib.gl.GLLoader.check;
import static org.overrun.glib.gl.GLLoader.getExtCapabilities;

/**
 * {@code GL_AMD_name_gen_delete}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLAMDNameGenDelete {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_AMD_name_gen_delete) return;
        ext.glDeleteNamesAMD = load.invoke("glDeleteNamesAMD", FunctionDescriptors.IIPV);
        ext.glGenNamesAMD = load.invoke("glGenNamesAMD", FunctionDescriptors.IIPV);
        ext.glIsNameAMD = load.invoke("glIsNameAMD", FunctionDescriptors.IIZ);
    }

    public static void glDeleteNamesAMD(int identifier, int num, MemorySegment names) {
        var ext = getExtCapabilities();
        try {
            check(ext.glDeleteNamesAMD).invokeExact(identifier, num, names);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glDeleteNamesAMD(SegmentAllocator allocator, int identifier, int[] names) {
        glDeleteNamesAMD(identifier, names.length, allocator.allocateArray(JAVA_INT, names));
    }

    public static void glDeleteNameAMD(int identifier, int name) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            glDeleteNamesAMD(identifier, 1, stack.ints(name));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void glGenNamesAMD(int identifier, int num, MemorySegment names) {
        var ext = getExtCapabilities();
        try {
            check(ext.glGenNamesAMD).invokeExact(identifier, num, names);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glGenNamesAMD(SegmentAllocator allocator, int identifier, int[] names) {
        var seg = allocator.allocateArray(JAVA_INT, names.length);
        glGenNamesAMD(identifier, names.length, seg);
        RuntimeHelper.toArray(seg, names);
    }

    public static int glGenNameAMD(int identifier) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            glGenNamesAMD(identifier, 1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static boolean glIsNameAMD(int identifier, int name) {
        var ext = getExtCapabilities();
        try {
            return (boolean) check(ext.glIsNameAMD).invokeExact(identifier, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}

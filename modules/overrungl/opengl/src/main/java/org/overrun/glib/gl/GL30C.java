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

package org.overrun.glib.gl;

import org.jetbrains.annotations.Nullable;
import org.overrun.glib.RuntimeHelper;
import org.overrun.glib.util.MemoryStack;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.*;

/**
 * The OpenGL 3.0 core profile functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL30C extends GL21C permits GL31C {
    static boolean isSupported(GLCapabilities caps) {
        return checkAll(caps.glBeginConditionalRender, caps.glBeginTransformFeedback, caps.glBindBufferBase, caps.glBindBufferRange, caps.glBindFragDataLocation, caps.glBindFramebuffer,
            caps.glBindRenderbuffer, caps.glBindVertexArray, caps.glBlitFramebuffer, caps.glCheckFramebufferStatus, caps.glClampColor, caps.glClearBufferfi,
            caps.glClearBufferfv, caps.glClearBufferiv, caps.glClearBufferuiv, caps.glColorMaski, caps.glDeleteFramebuffers, caps.glDeleteRenderbuffers,
            caps.glDeleteVertexArrays, caps.glDisablei, caps.glEnablei, caps.glEndConditionalRender, caps.glEndTransformFeedback, caps.glFlushMappedBufferRange,
            caps.glFramebufferRenderbuffer, caps.glFramebufferTexture1D, caps.glFramebufferTexture2D, caps.glFramebufferTexture3D, caps.glFramebufferTextureLayer, caps.glGenFramebuffers,
            caps.glGenRenderbuffers, caps.glGenVertexArrays, caps.glGenerateMipmap, caps.glGetBooleani_v, caps.glGetFragDataLocation, caps.glGetFramebufferAttachmentParameteriv,
            caps.glGetIntegeri_v, caps.glGetRenderbufferParameteriv, caps.glGetStringi, caps.glGetTexParameterIiv, caps.glGetTexParameterIuiv, caps.glGetTransformFeedbackVarying,
            caps.glGetUniformuiv, caps.glGetVertexAttribIiv, caps.glGetVertexAttribIuiv, caps.glIsEnabledi, caps.glIsFramebuffer, caps.glIsRenderbuffer,
            caps.glIsVertexArray, caps.glMapBufferRange, caps.glRenderbufferStorage, caps.glRenderbufferStorageMultisample, caps.glTexParameterIiv, caps.glTexParameterIuiv,
            caps.glTransformFeedbackVaryings, caps.glUniform1ui, caps.glUniform1uiv, caps.glUniform2ui, caps.glUniform2uiv, caps.glUniform3ui,
            caps.glUniform3uiv, caps.glUniform4ui, caps.glUniform4uiv, caps.glVertexAttribI1i, caps.glVertexAttribI1iv, caps.glVertexAttribI1ui,
            caps.glVertexAttribI1uiv, caps.glVertexAttribI2i, caps.glVertexAttribI2iv, caps.glVertexAttribI2ui, caps.glVertexAttribI2uiv, caps.glVertexAttribI3i,
            caps.glVertexAttribI3iv, caps.glVertexAttribI3ui, caps.glVertexAttribI3uiv, caps.glVertexAttribI4bv, caps.glVertexAttribI4i, caps.glVertexAttribI4iv,
            caps.glVertexAttribI4sv, caps.glVertexAttribI4ubv, caps.glVertexAttribI4ui, caps.glVertexAttribI4uiv, caps.glVertexAttribI4usv, caps.glVertexAttribIPointer);
    }

    static void load(GLCapabilities caps, GLLoadFunc load) {
        caps.glBeginConditionalRender = load.invoke("glBeginConditionalRender", IIV);
        caps.glBeginTransformFeedback = load.invoke("glBeginTransformFeedback", IV);
        caps.glBindBufferBase = load.invoke("glBindBufferBase", IIIV);
        caps.glBindBufferRange = load.invoke("glBindBufferRange", IIIJJV);
        caps.glBindFragDataLocation = load.invoke("glBindFragDataLocation", IIPV);
        caps.glBindFramebuffer = load.invoke("glBindFramebuffer", IIV);
        caps.glBindRenderbuffer = load.invoke("glBindRenderbuffer", IIV);
        caps.glBindVertexArray = load.invoke("glBindVertexArray", IV);
        caps.glBlitFramebuffer = load.invoke("glBlitFramebuffer", IIIIIIIIIIV);
        caps.glCheckFramebufferStatus = load.invoke("glCheckFramebufferStatus", II);
        caps.glClampColor = load.invoke("glClampColor", IIV);
        caps.glClearBufferfi = load.invoke("glClearBufferfi", IIFIV);
        caps.glClearBufferfv = load.invoke("glClearBufferfv", IIPV);
        caps.glClearBufferiv = load.invoke("glClearBufferiv", IIPV);
        caps.glClearBufferuiv = load.invoke("glClearBufferuiv", IIPV);
        caps.glColorMaski = load.invoke("glColorMaski", IZZZZV);
        caps.glDeleteFramebuffers = load.invoke("glDeleteFramebuffers", IPV);
        caps.glDeleteRenderbuffers = load.invoke("glDeleteRenderbuffers", IPV);
        caps.glDeleteVertexArrays = load.invoke("glDeleteVertexArrays", IPV);
        caps.glDisablei = load.invoke("glDisablei", IIV);
        caps.glEnablei = load.invoke("glEnablei", IIV);
        caps.glEndConditionalRender = load.invoke("glEndConditionalRender", V);
        caps.glEndTransformFeedback = load.invoke("glEndTransformFeedback", V);
        caps.glFlushMappedBufferRange = load.invoke("glFlushMappedBufferRange", IJJV);
        caps.glFramebufferRenderbuffer = load.invoke("glFramebufferRenderbuffer", IIIIV);
        caps.glFramebufferTexture1D = load.invoke("glFramebufferTexture1D", IIIIIV);
        caps.glFramebufferTexture2D = load.invoke("glFramebufferTexture2D", IIIIIV);
        caps.glFramebufferTexture3D = load.invoke("glFramebufferTexture3D", IIIIIIV);
        caps.glFramebufferTextureLayer = load.invoke("glFramebufferTextureLayer", IIIIIV);
        caps.glGenFramebuffers = load.invoke("glGenFramebuffers", IPV);
        caps.glGenRenderbuffers = load.invoke("glGenRenderbuffers", IPV);
        caps.glGenVertexArrays = load.invoke("glGenVertexArrays", IPV);
        caps.glGenerateMipmap = load.invoke("glGenerateMipmap", IV);
        caps.glGetBooleani_v = load.invoke("glGetBooleani_v", IIPV);
        caps.glGetFragDataLocation = load.invoke("glGetFragDataLocation", IPI);
        caps.glGetFramebufferAttachmentParameteriv = load.invoke("glGetFramebufferAttachmentParameteriv", IIIPV);
        caps.glGetIntegeri_v = load.invoke("glGetIntegeri_v", IIPV);
        caps.glGetRenderbufferParameteriv = load.invoke("glGetRenderbufferParameteriv", IIPV);
        caps.glGetStringi = load.invoke("glGetStringi", IIp);
        caps.glGetTexParameterIiv = load.invoke("glGetTexParameterIiv", IIPV);
        caps.glGetTexParameterIuiv = load.invoke("glGetTexParameterIuiv", IIPV);
        caps.glGetTransformFeedbackVarying = load.invoke("glGetTransformFeedbackVarying", IIIPPPPV);
        caps.glGetUniformuiv = load.invoke("glGetUniformuiv", IIPV);
        caps.glGetVertexAttribIiv = load.invoke("glGetVertexAttribIiv", IIPV);
        caps.glGetVertexAttribIuiv = load.invoke("glGetVertexAttribIuiv", IIPV);
        caps.glIsEnabledi = load.invoke("glIsEnabledi", IIZ);
        caps.glIsFramebuffer = load.invoke("glIsFramebuffer", IZ);
        caps.glIsRenderbuffer = load.invoke("glIsRenderbuffer", IZ);
        caps.glIsVertexArray = load.invoke("glIsVertexArray", IZ);
        caps.glMapBufferRange = load.invoke("glMapBufferRange", IJJIP);
        caps.glRenderbufferStorage = load.invoke("glRenderbufferStorage", IIIIV);
        caps.glRenderbufferStorageMultisample = load.invoke("glRenderbufferStorageMultisample", IIIIIV);
        caps.glTexParameterIiv = load.invoke("glTexParameterIiv", IIPV);
        caps.glTexParameterIuiv = load.invoke("glTexParameterIuiv", IIPV);
        caps.glTransformFeedbackVaryings = load.invoke("glTransformFeedbackVaryings", IIPIV);
        caps.glUniform1ui = load.invoke("glUniform1ui", IIV);
        caps.glUniform1uiv = load.invoke("glUniform1uiv", IIPV);
        caps.glUniform2ui = load.invoke("glUniform2ui", IIIV);
        caps.glUniform2uiv = load.invoke("glUniform2uiv", IIPV);
        caps.glUniform3ui = load.invoke("glUniform3ui", IIIIV);
        caps.glUniform3uiv = load.invoke("glUniform3uiv", IIPV);
        caps.glUniform4ui = load.invoke("glUniform4ui", IIIIIV);
        caps.glUniform4uiv = load.invoke("glUniform4uiv", IIPV);
        caps.glVertexAttribI1i = load.invoke("glVertexAttribI1i", IIV);
        caps.glVertexAttribI1iv = load.invoke("glVertexAttribI1iv", IPV);
        caps.glVertexAttribI1ui = load.invoke("glVertexAttribI1ui", IIV);
        caps.glVertexAttribI1uiv = load.invoke("glVertexAttribI1uiv", IPV);
        caps.glVertexAttribI2i = load.invoke("glVertexAttribI2i", IIIV);
        caps.glVertexAttribI2iv = load.invoke("glVertexAttribI2iv", IPV);
        caps.glVertexAttribI2ui = load.invoke("glVertexAttribI2ui", IIIV);
        caps.glVertexAttribI2uiv = load.invoke("glVertexAttribI2uiv", IPV);
        caps.glVertexAttribI3i = load.invoke("glVertexAttribI3i", IIIIV);
        caps.glVertexAttribI3iv = load.invoke("glVertexAttribI3iv", IPV);
        caps.glVertexAttribI3ui = load.invoke("glVertexAttribI3ui", IIIIV);
        caps.glVertexAttribI3uiv = load.invoke("glVertexAttribI3uiv", IPV);
        caps.glVertexAttribI4bv = load.invoke("glVertexAttribI4bv", IPV);
        caps.glVertexAttribI4i = load.invoke("glVertexAttribI4i", IIIIIV);
        caps.glVertexAttribI4iv = load.invoke("glVertexAttribI4iv", IPV);
        caps.glVertexAttribI4sv = load.invoke("glVertexAttribI4sv", IPV);
        caps.glVertexAttribI4ubv = load.invoke("glVertexAttribI4ubv", IPV);
        caps.glVertexAttribI4ui = load.invoke("glVertexAttribI4ui", IIIIIV);
        caps.glVertexAttribI4uiv = load.invoke("glVertexAttribI4uiv", IPV);
        caps.glVertexAttribI4usv = load.invoke("glVertexAttribI4usv", IPV);
        caps.glVertexAttribIPointer = load.invoke("glVertexAttribIPointer", IIIIPV);
    }

    public static void beginConditionalRender(int id, int mode) {
        var caps = getCapabilities();
        try {
            check(caps.glBeginConditionalRender).invokeExact(id, mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void beginTransformFeedback(int primitiveMode) {
        var caps = getCapabilities();
        try {
            check(caps.glBeginTransformFeedback).invokeExact(primitiveMode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindBufferBase(int target, int index, int buffer) {
        var caps = getCapabilities();
        try {
            check(caps.glBindBufferBase).invokeExact(target, index, buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindBufferRange(int target, int index, int buffer, long offset, long size) {
        var caps = getCapabilities();
        try {
            check(caps.glBindBufferRange).invokeExact(target, index, buffer, offset, size);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindFragDataLocation(int program, int color, MemorySegment name) {
        var caps = getCapabilities();
        try {
            check(caps.glBindFragDataLocation).invokeExact(program, color, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindFragDataLocation(SegmentAllocator allocator, int program, int color, String name) {
        bindFragDataLocation(program, color, allocator.allocateUtf8String(name));
    }

    public static void bindFramebuffer(int target, int framebuffer) {
        var caps = getCapabilities();
        try {
            check(caps.glBindFramebuffer).invokeExact(target, framebuffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindRenderbuffer(int target, int renderbuffer) {
        var caps = getCapabilities();
        try {
            check(caps.glBindRenderbuffer).invokeExact(target, renderbuffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindVertexArray(int array) {
        var caps = getCapabilities();
        try {
            check(caps.glBindVertexArray).invokeExact(array);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void blitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        var caps = getCapabilities();
        try {
            check(caps.glBlitFramebuffer).invokeExact(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int checkFramebufferStatus(int target) {
        var caps = getCapabilities();
        try {
            return (int) check(caps.glCheckFramebufferStatus).invokeExact(target);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clampColor(int target, int clamp) {
        var caps = getCapabilities();
        try {
            check(caps.glClampColor).invokeExact(target, clamp);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearBufferfi(int buffer, int drawBuffer, float depth, int stencil) {
        var caps = getCapabilities();
        try {
            check(caps.glClearBufferfi).invokeExact(buffer, drawBuffer, depth, stencil);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearBufferfv(int buffer, int drawBuffer, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glClearBufferfv).invokeExact(buffer, drawBuffer, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearBufferfv(SegmentAllocator allocator, int buffer, int drawBuffer, float[] value) {
        clearBufferfv(buffer, drawBuffer, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void clearBufferiv(int buffer, int drawBuffer, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glClearBufferiv).invokeExact(buffer, drawBuffer, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearBufferiv(SegmentAllocator allocator, int buffer, int drawBuffer, int[] value) {
        clearBufferiv(buffer, drawBuffer, allocator.allocateArray(JAVA_INT, value));
    }

    public static void clearBufferuiv(int buffer, int drawBuffer, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glClearBufferuiv).invokeExact(buffer, drawBuffer, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearBufferuiv(SegmentAllocator allocator, int buffer, int drawBuffer, int[] value) {
        clearBufferuiv(buffer, drawBuffer, allocator.allocateArray(JAVA_INT, value));
    }

    public static void colorMaski(int index, boolean r, boolean g, boolean b, boolean a) {
        var caps = getCapabilities();
        try {
            check(caps.glColorMaski).invokeExact(index, r, g, b, a);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteFramebuffers(int n, MemorySegment framebuffers) {
        var caps = getCapabilities();
        try {
            check(caps.glDeleteFramebuffers).invokeExact(n, framebuffers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteFramebuffers(SegmentAllocator allocator, int[] framebuffers) {
        deleteFramebuffers(framebuffers.length, allocator.allocateArray(JAVA_INT, framebuffers));
    }

    public static void deleteFramebuffer(int framebuffer) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            deleteFramebuffers(1, stack.ints(framebuffer));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void deleteRenderbuffers(int n, MemorySegment renderbuffers) {
        var caps = getCapabilities();
        try {
            check(caps.glDeleteRenderbuffers).invokeExact(n, renderbuffers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteRenderbuffers(SegmentAllocator allocator, int[] renderbuffers) {
        deleteRenderbuffers(renderbuffers.length, allocator.allocateArray(JAVA_INT, renderbuffers));
    }

    public static void deleteRenderbuffer(int renderbuffer) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            deleteRenderbuffers(1, stack.ints(renderbuffer));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void deleteVertexArrays(int n, MemorySegment arrays) {
        var caps = getCapabilities();
        try {
            check(caps.glDeleteVertexArrays).invokeExact(n, arrays);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteVertexArrays(SegmentAllocator allocator, int[] arrays) {
        deleteVertexArrays(arrays.length, allocator.allocateArray(JAVA_INT, arrays));
    }

    public static void deleteVertexArray(int array) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            deleteVertexArrays(1, stack.ints(array));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void disablei(int target, int index) {
        var caps = getCapabilities();
        try {
            check(caps.glDisablei).invokeExact(target, index);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void enablei(int target, int index) {
        var caps = getCapabilities();
        try {
            check(caps.glEnablei).invokeExact(target, index);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void endConditionalRender() {
        var caps = getCapabilities();
        try {
            check(caps.glEndConditionalRender).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void endTransformFeedback() {
        var caps = getCapabilities();
        try {
            check(caps.glEndTransformFeedback).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void flushMappedBufferRange(int target, long offset, long length) {
        var caps = getCapabilities();
        try {
            check(caps.glFlushMappedBufferRange).invokeExact(target, offset, length);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void framebufferRenderbuffer(int target, int attachment, int renderbufferTarget, int renderbuffer) {
        var caps = getCapabilities();
        try {
            check(caps.glFramebufferRenderbuffer).invokeExact(target, attachment, renderbufferTarget, renderbuffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void framebufferTexture1D(int target, int attachment, int texTarget, int texture, int level) {
        var caps = getCapabilities();
        try {
            check(caps.glFramebufferTexture1D).invokeExact(target, attachment, texTarget, texture, level);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void framebufferTexture2D(int target, int attachment, int texTarget, int texture, int level) {
        var caps = getCapabilities();
        try {
            check(caps.glFramebufferTexture2D).invokeExact(target, attachment, texTarget, texture, level);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void framebufferTexture3D(int target, int attachment, int texTarget, int texture, int level, int zoffset) {
        var caps = getCapabilities();
        try {
            check(caps.glFramebufferTexture3D).invokeExact(target, attachment, texTarget, texture, level, zoffset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void framebufferTextureLayer(int target, int attachment, int texture, int level, int layer) {
        var caps = getCapabilities();
        try {
            check(caps.glFramebufferTextureLayer).invokeExact(target, attachment, texture, level, layer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void genFramebuffers(int n, MemorySegment framebuffers) {
        var caps = getCapabilities();
        try {
            check(caps.glGenFramebuffers).invokeExact(n, framebuffers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void genFramebuffers(SegmentAllocator allocator, int[] framebuffers) {
        var seg = allocator.allocateArray(JAVA_INT, framebuffers.length);
        genFramebuffers(framebuffers.length, seg);
        RuntimeHelper.toArray(seg, framebuffers);
    }

    public static int genFramebuffer() {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            genFramebuffers(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void genRenderbuffers(int n, MemorySegment renderbuffers) {
        var caps = getCapabilities();
        try {
            check(caps.glGenRenderbuffers).invokeExact(n, renderbuffers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void genRenderbuffers(SegmentAllocator allocator, int[] renderbuffers) {
        var seg = allocator.allocateArray(JAVA_INT, renderbuffers.length);
        genRenderbuffers(renderbuffers.length, seg);
        RuntimeHelper.toArray(seg, renderbuffers);
    }

    public static int genRenderbuffer() {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            genRenderbuffers(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void genVertexArrays(int n, MemorySegment arrays) {
        var caps = getCapabilities();
        try {
            check(caps.glGenVertexArrays).invokeExact(n, arrays);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void genVertexArrays(SegmentAllocator allocator, int[] arrays) {
        var seg = allocator.allocateArray(JAVA_INT, arrays.length);
        genVertexArrays(arrays.length, seg);
        RuntimeHelper.toArray(seg, arrays);
    }

    public static int genVertexArray() {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            genVertexArrays(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void generateMipmap(int target) {
        var caps = getCapabilities();
        try {
            check(caps.glGenerateMipmap).invokeExact(target);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getBooleani_v(int target, int index, MemorySegment data) {
        var caps = getCapabilities();
        try {
            check(caps.glGetBooleani_v).invokeExact(target, index, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getBooleani_v(SegmentAllocator allocator, int target, int index, boolean[] data) {
        var seg = allocator.allocateArray(JAVA_BOOLEAN, data.length);
        getBooleani_v(target, index, seg);
        RuntimeHelper.toArray(seg, data);
    }

    public static boolean getBooleani(int target, int index) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_BOOLEAN);
            getBooleani_v(target, index, seg);
            return seg.get(JAVA_BOOLEAN, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static int getFragDataLocation(int program, MemorySegment name) {
        var caps = getCapabilities();
        try {
            return (int) check(caps.glGetFragDataLocation).invokeExact(program, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getFragDataLocation(SegmentAllocator allocator, int program, String name) {
        return getFragDataLocation(program, allocator.allocateUtf8String(name));
    }

    public static void getFramebufferAttachmentParameteriv(int target, int attachment, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetFramebufferAttachmentParameteriv).invokeExact(target, attachment, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getFramebufferAttachmentParameteri(int target, int attachment, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getFramebufferAttachmentParameteriv(target, attachment, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getIntegeri_v(int target, int index, MemorySegment data) {
        var caps = getCapabilities();
        try {
            check(caps.glGetIntegeri_v).invokeExact(target, index, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getIntegeri_v(SegmentAllocator allocator, int target, int index, int[] data) {
        var seg = allocator.allocateArray(JAVA_INT, data.length);
        getIntegeri_v(target, index, seg);
        RuntimeHelper.toArray(seg, data);
    }

    public static int getIntegeri(int target, int index) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getIntegeri_v(target, index, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getRenderbufferParameteriv(int target, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetRenderbufferParameteriv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getRenderbufferParameteriv(int target, int pname, int[] params) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getRenderbufferParameteriv(target, pname, seg);
            params[0] = seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static int getRenderbufferParameteri(int target, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getRenderbufferParameteriv(target, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static MemorySegment ngetStringi(int pname, int index) {
        var caps = getCapabilities();
        try {
            return (MemorySegment) check(caps.glGetStringi).invokeExact(pname, index);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    @Nullable
    public static String getStringi(int pname, int index) {
        var pStr = ngetStringi(pname, index);
        return pStr != MemorySegment.NULL ? pStr.getUtf8String(0) : null;
    }

    public static void getTexParameterIiv(int target, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetTexParameterIiv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTexParameterIiv(SegmentAllocator allocator, int target, int pname, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        getTexParameterIiv(target, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static int getTexParameterIi(int target, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getTexParameterIiv(target, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getTexParameterIuiv(int target, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetTexParameterIuiv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTexParameterIuiv(SegmentAllocator allocator, int target, int pname, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        getTexParameterIuiv(target, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static int getTexParameterIui(int target, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getTexParameterIuiv(target, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getTransformFeedbackVarying(int program, int index, int bufSize, MemorySegment length, MemorySegment size, MemorySegment type, MemorySegment name) {
        var caps = getCapabilities();
        try {
            check(caps.glGetTransformFeedbackVarying).invokeExact(program, index, bufSize, length, size, type, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTransformFeedbackVarying(SegmentAllocator allocator, int program, int index, int bufSize, int @Nullable [] length, int[] size, int[] type, String[] name) {
        var pLen = length != null ? allocator.allocate(JAVA_INT) : MemorySegment.NULL;
        var pSz = allocator.allocate(JAVA_INT);
        var pType = allocator.allocate(JAVA_INT);
        var pName = allocator.allocateArray(JAVA_BYTE, bufSize);
        getTransformFeedbackVarying(program, index, bufSize, pLen, pSz, pType, pName);
        if (length != null && length.length > 0) {
            length[0] = pLen.get(JAVA_INT, 0);
        }
        size[0] = pSz.get(JAVA_INT, 0);
        type[0] = pType.get(JAVA_INT, 0);
        name[0] = pName.getUtf8String(0);
    }

    public static void getUniformuiv(int program, int location, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetUniformuiv).invokeExact(program, location, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getUniformuiv(SegmentAllocator allocator, int program, int location, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        getUniformuiv(program, location, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static int getUniformui(int program, int location) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getUniformuiv(program, location, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getVertexAttribIiv(int index, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetVertexAttribIiv).invokeExact(index, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getVertexAttribIiv(SegmentAllocator allocator, int index, int pname, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        getVertexAttribIiv(index, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static int getVertexAttribIi(int index, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getVertexAttribIiv(index, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getVertexAttribIuiv(int index, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetVertexAttribIuiv).invokeExact(index, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getVertexAttribIuiv(SegmentAllocator allocator, int index, int pname, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        getVertexAttribIuiv(index, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static int getVertexAttribIui(int index, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getVertexAttribIuiv(index, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static boolean isEnabledi(int target, int index) {
        var caps = getCapabilities();
        try {
            return (boolean) check(caps.glIsEnabledi).invokeExact(target, index);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean isFramebuffer(int framebuffer) {
        var caps = getCapabilities();
        try {
            return (boolean) check(caps.glIsFramebuffer).invokeExact(framebuffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean isRenderbuffer(int renderbuffer) {
        var caps = getCapabilities();
        try {
            return (boolean) check(caps.glIsRenderbuffer).invokeExact(renderbuffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean isVertexArray(int array) {
        var caps = getCapabilities();
        try {
            return (boolean) check(caps.glIsVertexArray).invokeExact(array);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment mapBufferRange(int target, long offset, long length, int access) {
        var caps = getCapabilities();
        try {
            return MemorySegment.ofAddress(((MemorySegment) check(caps.glMapBufferRange).invokeExact(target, offset, length, access)).address(), length);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void renderbufferStorage(int target, int internalFormat, int width, int height) {
        var caps = getCapabilities();
        try {
            check(caps.glRenderbufferStorage).invokeExact(target, internalFormat, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void renderbufferStorageMultisample(int target, int samples, int internalFormat, int width, int height) {
        var caps = getCapabilities();
        try {
            check(caps.glRenderbufferStorageMultisample).invokeExact(target, samples, internalFormat, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texParameterIiv(int target, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glTexParameterIiv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texParameterIiv(SegmentAllocator allocator, int target, int pname, int[] params) {
        texParameterIiv(target, pname, allocator.allocateArray(JAVA_INT, params));
    }

    public static void texParameterIuiv(int target, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glTexParameterIuiv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texParameterIuiv(SegmentAllocator allocator, int target, int pname, int[] params) {
        texParameterIuiv(target, pname, allocator.allocateArray(JAVA_INT, params));
    }

    public static void transformFeedbackVaryings(int program, int count, MemorySegment varyings, int bufferMode) {
        var caps = getCapabilities();
        try {
            check(caps.glTransformFeedbackVaryings).invokeExact(program, count, varyings, bufferMode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void transformFeedbackVaryings(SegmentAllocator allocator, int program, String[] varyings, int bufferMode) {
        var seg = allocator.allocateArray(ADDRESS, varyings.length);
        for (int i = 0; i < varyings.length; i++) {
            seg.setAtIndex(ADDRESS, i, allocator.allocateUtf8String(varyings[i]));
        }
        transformFeedbackVaryings(program, varyings.length, seg, bufferMode);
    }

    public static void uniform1ui(int location, int v0) {
        var caps = getCapabilities();
        try {
            check(caps.glUniform1ui).invokeExact(location, v0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform1uiv(int location, int count, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glUniform1uiv).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform1uiv(SegmentAllocator allocator, int location, int[] value) {
        uniform1uiv(location, value.length, allocator.allocateArray(JAVA_INT, value));
    }

    public static void uniform2ui(int location, int v0, int v1) {
        var caps = getCapabilities();
        try {
            check(caps.glUniform2ui).invokeExact(location, v0, v1);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform2uiv(int location, int count, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glUniform2uiv).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform2uiv(SegmentAllocator allocator, int location, int[] value) {
        uniform2uiv(location, value.length, allocator.allocateArray(JAVA_INT, value));
    }

    public static void uniform3ui(int location, int v0, int v1, int v2) {
        var caps = getCapabilities();
        try {
            check(caps.glUniform3ui).invokeExact(location, v0, v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform3uiv(int location, int count, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glUniform3uiv).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform3uiv(SegmentAllocator allocator, int location, int[] value) {
        uniform3uiv(location, value.length, allocator.allocateArray(JAVA_INT, value));
    }

    public static void uniform4ui(int location, int v0, int v1, int v2, int v3) {
        var caps = getCapabilities();
        try {
            check(caps.glUniform4ui).invokeExact(location, v0, v1, v2, v3);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform4uiv(int location, int count, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glUniform4uiv).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform4uiv(SegmentAllocator allocator, int location, int[] value) {
        uniform4uiv(location, value.length, allocator.allocateArray(JAVA_INT, value));
    }

    public static void vertexAttribI1i(int index, int x) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI1i).invokeExact(index, x);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI1iv(int index, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI1iv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI1iv(SegmentAllocator allocator, int index, int[] v) {
        vertexAttribI1iv(index, allocator.allocateArray(JAVA_INT, v));
    }

    public static void vertexAttribI1ui(int index, int x) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI1ui).invokeExact(index, x);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI1uiv(int index, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI1uiv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI1uiv(SegmentAllocator allocator, int index, int[] v) {
        vertexAttribI1uiv(index, allocator.allocateArray(JAVA_INT, v));
    }

    public static void vertexAttribI2i(int index, int x, int y) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI2i).invokeExact(index, x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI2iv(int index, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI2iv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI2iv(SegmentAllocator allocator, int index, int[] v) {
        vertexAttribI2iv(index, allocator.allocateArray(JAVA_INT, v));
    }

    public static void vertexAttribI2ui(int index, int x, int y) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI2ui).invokeExact(index, x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI2uiv(int index, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI2uiv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI2uiv(SegmentAllocator allocator, int index, int[] v) {
        vertexAttribI2uiv(index, allocator.allocateArray(JAVA_INT, v));
    }

    public static void vertexAttribI3i(int index, int x, int y, int z) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI3i).invokeExact(index, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI3iv(int index, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI3iv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI3iv(SegmentAllocator allocator, int index, int[] v) {
        vertexAttribI3iv(index, allocator.allocateArray(JAVA_INT, v));
    }

    public static void vertexAttribI3ui(int index, int x, int y, int z) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI3ui).invokeExact(index, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI3uiv(int index, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI3uiv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI3uiv(SegmentAllocator allocator, int index, int[] v) {
        vertexAttribI3uiv(index, allocator.allocateArray(JAVA_INT, v));
    }

    public static void vertexAttribI4bv(int index, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI4bv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI4bv(SegmentAllocator allocator, int index, byte[] v) {
        vertexAttribI4bv(index, allocator.allocateArray(JAVA_BYTE, v));
    }

    public static void vertexAttribI4i(int index, int x, int y, int z, int w) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI4i).invokeExact(index, x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI4iv(int index, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI4iv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI4iv(SegmentAllocator allocator, int index, int[] v) {
        vertexAttribI4iv(index, allocator.allocateArray(JAVA_INT, v));
    }

    public static void vertexAttribI4sv(int index, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI4sv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI4sv(SegmentAllocator allocator, int index, short[] v) {
        vertexAttribI4sv(index, allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void vertexAttribI4ubv(int index, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI4ubv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI4ubv(SegmentAllocator allocator, int index, byte[] v) {
        vertexAttribI4ubv(index, allocator.allocateArray(JAVA_BYTE, v));
    }

    public static void vertexAttribI4ui(int index, int x, int y, int z, int w) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI4ui).invokeExact(index, x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI4uiv(int index, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI4uiv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI4uiv(SegmentAllocator allocator, int index, int[] v) {
        vertexAttribI4uiv(index, allocator.allocateArray(JAVA_INT, v));
    }

    public static void vertexAttribI4usv(int index, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI4usv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI4usv(SegmentAllocator allocator, int index, short[] v) {
        vertexAttribI4usv(index, allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void vertexAttribIPointer(int index, int size, int type, int stride, MemorySegment pointer) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribIPointer).invokeExact(index, size, type, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribIPointer(SegmentAllocator allocator, int index, int size, int type, int stride, byte[] pointer) {
        vertexAttribIPointer(index, size, type, stride, allocator.allocateArray(JAVA_BYTE, pointer));
    }

    public static void vertexAttribIPointer(SegmentAllocator allocator, int index, int size, int type, int stride, short[] pointer) {
        vertexAttribIPointer(index, size, type, stride, allocator.allocateArray(JAVA_SHORT, pointer));
    }

    public static void vertexAttribIPointer(SegmentAllocator allocator, int index, int size, int type, int stride, int[] pointer) {
        vertexAttribIPointer(index, size, type, stride, allocator.allocateArray(JAVA_INT, pointer));
    }
}

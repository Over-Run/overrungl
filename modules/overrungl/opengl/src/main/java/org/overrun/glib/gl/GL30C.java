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

package org.overrun.glib.gl;

import org.jetbrains.annotations.Nullable;
import org.overrun.glib.RuntimeHelper;
import org.overrun.glib.util.MemoryStack;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLCaps.check;
import static org.overrun.glib.gl.GLCaps.checkAll;

/**
 * The OpenGL 3.0 core profile functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL30C extends GL21C permits GL31C {
    @Nullable
    public static MethodHandle
        glBeginConditionalRender, glBeginTransformFeedback, glBindBufferBase, glBindBufferRange, glBindFragDataLocation,
        glBindFramebuffer, glBindRenderbuffer, glBindVertexArray, glBlitFramebuffer, glCheckFramebufferStatus,
        glClampColor, glClearBufferfi, glClearBufferfv, glClearBufferiv, glClearBufferuiv, glColorMaski,
        glDeleteFramebuffers, glDeleteRenderbuffers, glDeleteVertexArrays, glDisablei, glEnablei,
        glEndConditionalRender, glEndTransformFeedback, glFlushMappedBufferRange, glFramebufferRenderbuffer,
        glFramebufferTexture1D, glFramebufferTexture2D, glFramebufferTexture3D, glFramebufferTextureLayer,
        glGenFramebuffers, glGenRenderbuffers, glGenVertexArrays, glGenerateMipmap, glGetBooleani_v,
        glGetFragDataLocation, glGetFramebufferAttachmentParameteriv, glGetIntegeri_v, glGetRenderbufferParameteriv,
        glGetStringi, glGetTexParameterIiv, glGetTexParameterIuiv, glGetTransformFeedbackVarying, glGetUniformuiv,
        glGetVertexAttribIiv, glGetVertexAttribIuiv, glIsEnabledi, glIsFramebuffer, glIsRenderbuffer, glIsVertexArray,
        glMapBufferRange, glRenderbufferStorage, glRenderbufferStorageMultisample, glTexParameterIiv,
        glTexParameterIuiv, glTransformFeedbackVaryings, glUniform1ui, glUniform1uiv, glUniform2ui, glUniform2uiv,
        glUniform3ui, glUniform3uiv, glUniform4ui, glUniform4uiv, glVertexAttribI1i, glVertexAttribI1iv,
        glVertexAttribI1ui, glVertexAttribI1uiv, glVertexAttribI2i, glVertexAttribI2iv, glVertexAttribI2ui,
        glVertexAttribI2uiv, glVertexAttribI3i, glVertexAttribI3iv, glVertexAttribI3ui, glVertexAttribI3uiv,
        glVertexAttribI4bv, glVertexAttribI4i, glVertexAttribI4iv, glVertexAttribI4sv, glVertexAttribI4ubv,
        glVertexAttribI4ui, glVertexAttribI4uiv, glVertexAttribI4usv, glVertexAttribIPointer;

    static boolean isSupported() {
        return checkAll(glBeginConditionalRender, glBeginTransformFeedback, glBindBufferBase, glBindBufferRange,
            glBindFragDataLocation, glBindFramebuffer, glBindRenderbuffer, glBindVertexArray, glBlitFramebuffer,
            glCheckFramebufferStatus, glClampColor, glClearBufferfi, glClearBufferfv, glClearBufferiv, glClearBufferuiv,
            glColorMaski, glDeleteFramebuffers, glDeleteRenderbuffers, glDeleteVertexArrays, glDisablei, glEnablei,
            glEndConditionalRender, glEndTransformFeedback, glFlushMappedBufferRange, glFramebufferRenderbuffer,
            glFramebufferTexture1D, glFramebufferTexture2D, glFramebufferTexture3D, glFramebufferTextureLayer,
            glGenFramebuffers, glGenRenderbuffers, glGenVertexArrays, glGenerateMipmap, glGetBooleani_v,
            glGetFragDataLocation, glGetFramebufferAttachmentParameteriv, glGetIntegeri_v, glGetRenderbufferParameteriv,
            glGetStringi, glGetTexParameterIiv, glGetTexParameterIuiv, glGetTransformFeedbackVarying, glGetUniformuiv,
            glGetVertexAttribIiv, glGetVertexAttribIuiv, glIsEnabledi, glIsFramebuffer, glIsRenderbuffer,
            glIsVertexArray, glMapBufferRange, glRenderbufferStorage, glRenderbufferStorageMultisample,
            glTexParameterIiv, glTexParameterIuiv, glTransformFeedbackVaryings, glUniform1ui, glUniform1uiv,
            glUniform2ui, glUniform2uiv, glUniform3ui, glUniform3uiv, glUniform4ui, glUniform4uiv, glVertexAttribI1i,
            glVertexAttribI1iv, glVertexAttribI1ui, glVertexAttribI1uiv, glVertexAttribI2i, glVertexAttribI2iv,
            glVertexAttribI2ui, glVertexAttribI2uiv, glVertexAttribI3i, glVertexAttribI3iv, glVertexAttribI3ui,
            glVertexAttribI3uiv, glVertexAttribI4bv, glVertexAttribI4i, glVertexAttribI4iv, glVertexAttribI4sv,
            glVertexAttribI4ubv, glVertexAttribI4ui, glVertexAttribI4uiv, glVertexAttribI4usv, glVertexAttribIPointer);
    }

    static void load(GLLoadFunc load) {
        glBeginConditionalRender = load.invoke("glBeginConditionalRender", IIV);
        glBeginTransformFeedback = load.invoke("glBeginTransformFeedback", IV);
        glBindBufferBase = load.invoke("glBindBufferBase", IIIV);
        glBindBufferRange = load.invoke("glBindBufferRange", IIIJJV);
        glBindFragDataLocation = load.invoke("glBindFragDataLocation", IIPV);
        glBindFramebuffer = load.invoke("glBindFramebuffer", IIV);
        glBindRenderbuffer = load.invoke("glBindRenderbuffer", IIV);
        glBindVertexArray = load.invoke("glBindVertexArray", IV);
        glBlitFramebuffer = load.invoke("glBlitFramebuffer", IIIIIIIIIIV);
        glCheckFramebufferStatus = load.invoke("glCheckFramebufferStatus", II);
        glClampColor = load.invoke("glClampColor", IIV);
        glClearBufferfi = load.invoke("glClearBufferfi", IIFIV);
        glClearBufferfv = load.invoke("glClearBufferfv", IIPV);
        glClearBufferiv = load.invoke("glClearBufferiv", IIPV);
        glClearBufferuiv = load.invoke("glClearBufferuiv", IIPV);
        glColorMaski = load.invoke("glColorMaski", IZZZZV);
        glDeleteFramebuffers = load.invoke("glDeleteFramebuffers", IPV);
        glDeleteRenderbuffers = load.invoke("glDeleteRenderbuffers", IPV);
        glDeleteVertexArrays = load.invoke("glDeleteVertexArrays", IPV);
        glDisablei = load.invoke("glDisablei", IIV);
        glEnablei = load.invoke("glEnablei", IIV);
        glEndConditionalRender = load.invoke("glEndConditionalRender", V);
        glEndTransformFeedback = load.invoke("glEndTransformFeedback", V);
        glFlushMappedBufferRange = load.invoke("glFlushMappedBufferRange", IJJV);
        glFramebufferRenderbuffer = load.invoke("glFramebufferRenderbuffer", IIIIV);
        glFramebufferTexture1D = load.invoke("glFramebufferTexture1D", IIIIIV);
        glFramebufferTexture2D = load.invoke("glFramebufferTexture2D", IIIIIV);
        glFramebufferTexture3D = load.invoke("glFramebufferTexture3D", IIIIIIV);
        glFramebufferTextureLayer = load.invoke("glFramebufferTextureLayer", IIIIIV);
        glGenFramebuffers = load.invoke("glGenFramebuffers", IPV);
        glGenRenderbuffers = load.invoke("glGenRenderbuffers", IPV);
        glGenVertexArrays = load.invoke("glGenVertexArrays", IPV);
        glGenerateMipmap = load.invoke("glGenerateMipmap", IV);
        glGetBooleani_v = load.invoke("glGetBooleani_v", IIPV);
        glGetFragDataLocation = load.invoke("glGetFragDataLocation", IPI);
        glGetFramebufferAttachmentParameteriv = load.invoke("glGetFramebufferAttachmentParameteriv", IIIPV);
        glGetIntegeri_v = load.invoke("glGetIntegeri_v", IIPV);
        glGetRenderbufferParameteriv = load.invoke("glGetRenderbufferParameteriv", IIPV);
        glGetStringi = load.invoke("glGetStringi", IIP);
        glGetTexParameterIiv = load.invoke("glGetTexParameterIiv", IIPV);
        glGetTexParameterIuiv = load.invoke("glGetTexParameterIuiv", IIPV);
        glGetTransformFeedbackVarying = load.invoke("glGetTransformFeedbackVarying", IIIPPPPV);
        glGetUniformuiv = load.invoke("glGetUniformuiv", IIPV);
        glGetVertexAttribIiv = load.invoke("glGetVertexAttribIiv", IIPV);
        glGetVertexAttribIuiv = load.invoke("glGetVertexAttribIuiv", IIPV);
        glIsEnabledi = load.invoke("glIsEnabledi", IIZ);
        glIsFramebuffer = load.invoke("glIsFramebuffer", IZ);
        glIsRenderbuffer = load.invoke("glIsRenderbuffer", IZ);
        glIsVertexArray = load.invoke("glIsVertexArray", IZ);
        glMapBufferRange = load.invoke("glMapBufferRange", IJJIP);
        glRenderbufferStorage = load.invoke("glRenderbufferStorage", IIIIV);
        glRenderbufferStorageMultisample = load.invoke("glRenderbufferStorageMultisample", IIIIIV);
        glTexParameterIiv = load.invoke("glTexParameterIiv", IIPV);
        glTexParameterIuiv = load.invoke("glTexParameterIuiv", IIPV);
        glTransformFeedbackVaryings = load.invoke("glTransformFeedbackVaryings", IIPIV);
        glUniform1ui = load.invoke("glUniform1ui", IIV);
        glUniform1uiv = load.invoke("glUniform1uiv", IIPV);
        glUniform2ui = load.invoke("glUniform2ui", IIIV);
        glUniform2uiv = load.invoke("glUniform2uiv", IIPV);
        glUniform3ui = load.invoke("glUniform3ui", IIIIV);
        glUniform3uiv = load.invoke("glUniform3uiv", IIPV);
        glUniform4ui = load.invoke("glUniform4ui", IIIIIV);
        glUniform4uiv = load.invoke("glUniform4uiv", IIPV);
        glVertexAttribI1i = load.invoke("glVertexAttribI1i", IIV);
        glVertexAttribI1iv = load.invoke("glVertexAttribI1iv", IPV);
        glVertexAttribI1ui = load.invoke("glVertexAttribI1ui", IIV);
        glVertexAttribI1uiv = load.invoke("glVertexAttribI1uiv", IPV);
        glVertexAttribI2i = load.invoke("glVertexAttribI2i", IIIV);
        glVertexAttribI2iv = load.invoke("glVertexAttribI2iv", IPV);
        glVertexAttribI2ui = load.invoke("glVertexAttribI2ui", IIIV);
        glVertexAttribI2uiv = load.invoke("glVertexAttribI2uiv", IPV);
        glVertexAttribI3i = load.invoke("glVertexAttribI3i", IIIIV);
        glVertexAttribI3iv = load.invoke("glVertexAttribI3iv", IPV);
        glVertexAttribI3ui = load.invoke("glVertexAttribI3ui", IIIIV);
        glVertexAttribI3uiv = load.invoke("glVertexAttribI3uiv", IPV);
        glVertexAttribI4bv = load.invoke("glVertexAttribI4bv", IPV);
        glVertexAttribI4i = load.invoke("glVertexAttribI4i", IIIIIV);
        glVertexAttribI4iv = load.invoke("glVertexAttribI4iv", IPV);
        glVertexAttribI4sv = load.invoke("glVertexAttribI4sv", IPV);
        glVertexAttribI4ubv = load.invoke("glVertexAttribI4ubv", IPV);
        glVertexAttribI4ui = load.invoke("glVertexAttribI4ui", IIIIIV);
        glVertexAttribI4uiv = load.invoke("glVertexAttribI4uiv", IPV);
        glVertexAttribI4usv = load.invoke("glVertexAttribI4usv", IPV);
        glVertexAttribIPointer = load.invoke("glVertexAttribIPointer", IIIIPV);
    }

    public static void beginConditionalRender(int id, int mode) {
        try {
            check(glBeginConditionalRender).invokeExact(id, mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void beginTransformFeedback(int primitiveMode) {
        try {
            check(glBeginTransformFeedback).invokeExact(primitiveMode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindBufferBase(int target, int index, int buffer) {
        try {
            check(glBindBufferBase).invokeExact(target, index, buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindBufferRange(int target, int index, int buffer, long offset, long size) {
        try {
            check(glBindBufferRange).invokeExact(target, index, buffer, offset, size);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindFragDataLocation(int program, int color, Addressable name) {
        try {
            check(glBindFragDataLocation).invokeExact(program, color, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindFragDataLocation(SegmentAllocator session, int program, int color, String name) {
        bindFragDataLocation(program, color, session.allocateUtf8String(name));
    }

    public static void bindFramebuffer(int target, int framebuffer) {
        try {
            check(glBindFramebuffer).invokeExact(target, framebuffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindRenderbuffer(int target, int renderbuffer) {
        try {
            check(glBindRenderbuffer).invokeExact(target, renderbuffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindVertexArray(int array) {
        try {
            check(glBindVertexArray).invokeExact(array);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void blitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        try {
            check(glBlitFramebuffer).invokeExact(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int checkFramebufferStatus(int target) {
        try {
            return (int) check(glCheckFramebufferStatus).invokeExact(target);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clampColor(int target, int clamp) {
        try {
            check(glClampColor).invokeExact(target, clamp);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearBufferfi(int buffer, int drawBuffer, float depth, int stencil) {
        try {
            check(glClearBufferfi).invokeExact(buffer, drawBuffer, depth, stencil);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearBufferfv(int buffer, int drawBuffer, Addressable value) {
        try {
            check(glClearBufferfv).invokeExact(buffer, drawBuffer, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearBufferfv(SegmentAllocator session, int buffer, int drawBuffer, float[] value) {
        clearBufferfv(buffer, drawBuffer, session.allocateArray(JAVA_FLOAT, value));
    }

    public static void clearBufferiv(int buffer, int drawBuffer, Addressable value) {
        try {
            check(glClearBufferiv).invokeExact(buffer, drawBuffer, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearBufferiv(SegmentAllocator session, int buffer, int drawBuffer, int[] value) {
        clearBufferiv(buffer, drawBuffer, session.allocateArray(JAVA_INT, value));
    }

    public static void clearBufferuiv(int buffer, int drawBuffer, Addressable value) {
        try {
            check(glClearBufferuiv).invokeExact(buffer, drawBuffer, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearBufferuiv(SegmentAllocator session, int buffer, int drawBuffer, int[] value) {
        clearBufferuiv(buffer, drawBuffer, session.allocateArray(JAVA_INT, value));
    }

    public static void colorMaski(int index, boolean r, boolean g, boolean b, boolean a) {
        try {
            check(glColorMaski).invokeExact(index, r, g, b, a);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteFramebuffers(int n, Addressable framebuffers) {
        try {
            check(glDeleteFramebuffers).invokeExact(n, framebuffers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteFramebuffers(SegmentAllocator session, int[] framebuffers) {
        deleteFramebuffers(framebuffers.length, session.allocateArray(JAVA_INT, framebuffers));
    }

    public static void deleteFramebuffer(int framebuffer) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var mem = stack.malloc(JAVA_INT);
            mem.set(JAVA_INT, 0, framebuffer);
            deleteFramebuffers(1, mem);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void deleteRenderbuffers(int n, Addressable renderbuffers) {
        try {
            check(glDeleteRenderbuffers).invokeExact(n, renderbuffers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteRenderbuffers(SegmentAllocator session, int[] renderbuffers) {
        deleteRenderbuffers(renderbuffers.length, session.allocateArray(JAVA_INT, renderbuffers));
    }

    public static void deleteRenderbuffer(int renderbuffer) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var mem = stack.malloc(JAVA_INT);
            mem.set(JAVA_INT, 0, renderbuffer);
            deleteRenderbuffers(1, mem);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void deleteVertexArrays(int n, Addressable arrays) {
        try {
            check(glDeleteVertexArrays).invokeExact(n, arrays);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteVertexArrays(SegmentAllocator session, int[] arrays) {
        deleteVertexArrays(arrays.length, session.allocateArray(JAVA_INT, arrays));
    }

    public static void deleteVertexArray(int array) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var mem = stack.malloc(JAVA_INT);
            mem.set(JAVA_INT, 0, array);
            deleteVertexArrays(1, mem);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void disablei(int target, int index) {
        try {
            check(glDisablei).invokeExact(target, index);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void enablei(int target, int index) {
        try {
            check(glEnablei).invokeExact(target, index);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void endConditionalRender() {
        try {
            check(glEndConditionalRender).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void endTransformFeedback() {
        try {
            check(glEndTransformFeedback).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void flushMappedBufferRange(int target, long offset, long length) {
        try {
            check(glFlushMappedBufferRange).invokeExact(target, offset, length);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void framebufferRenderbuffer(int target, int attachment, int renderbufferTarget, int renderbuffer) {
        try {
            check(glFramebufferRenderbuffer).invokeExact(target, attachment, renderbufferTarget, renderbuffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void framebufferTexture1D(int target, int attachment, int texTarget, int texture, int level) {
        try {
            check(glFramebufferTexture1D).invokeExact(target, attachment, texTarget, texture, level);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void framebufferTexture2D(int target, int attachment, int texTarget, int texture, int level) {
        try {
            check(glFramebufferTexture2D).invokeExact(target, attachment, texTarget, texture, level);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void framebufferTexture3D(int target, int attachment, int texTarget, int texture, int level, int zoffset) {
        try {
            check(glFramebufferTexture3D).invokeExact(target, attachment, texTarget, texture, level, zoffset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void framebufferTextureLayer(int target, int attachment, int texture, int level, int layer) {
        try {
            check(glFramebufferTextureLayer).invokeExact(target, attachment, texture, level, layer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void genFramebuffers(int n, Addressable framebuffers) {
        try {
            check(glGenFramebuffers).invokeExact(n, framebuffers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void genFramebuffers(SegmentAllocator session, int[] framebuffers) {
        var seg = session.allocateArray(JAVA_INT, framebuffers.length);
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

    public static void genRenderbuffers(int n, Addressable renderbuffers) {
        try {
            check(glGenRenderbuffers).invokeExact(n, renderbuffers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void genRenderbuffers(SegmentAllocator session, int[] renderbuffers) {
        var seg = session.allocateArray(JAVA_INT, renderbuffers.length);
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

    public static void genVertexArrays(int n, Addressable arrays) {
        try {
            check(glGenVertexArrays).invokeExact(n, arrays);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void genVertexArrays(SegmentAllocator session, int[] arrays) {
        var seg = session.allocateArray(JAVA_INT, arrays.length);
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
        try {
            check(glGenerateMipmap).invokeExact(target);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getBooleani_v(int target, int index, Addressable data) {
        try {
            check(glGetBooleani_v).invokeExact(target, index, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getBooleani_v(SegmentAllocator session, int target, int index, boolean[] data) {
        var seg = session.allocateArray(JAVA_BOOLEAN, data.length);
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

    public static int getFragDataLocation(int program, Addressable name) {
        try {
            return (int) check(glGetFragDataLocation).invokeExact(program, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getFragDataLocation(SegmentAllocator session, int program, String name) {
        return getFragDataLocation(program, session.allocateUtf8String(name));
    }

    public static void getFramebufferAttachmentParameteriv(int target, int attachment, int pname, Addressable params) {
        try {
            check(glGetFramebufferAttachmentParameteriv).invokeExact(target, attachment, pname, params);
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

    public static void getIntegeri_v(int target, int index, Addressable data) {
        try {
            check(glGetIntegeri_v).invokeExact(target, index, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getIntegeri_v(SegmentAllocator session, int target, int index, int[] data) {
        var seg = session.allocateArray(JAVA_INT, data.length);
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

    public static void getRenderbufferParameteriv(int target, int pname, Addressable params) {
        try {
            check(glGetRenderbufferParameteriv).invokeExact(target, pname, params);
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

    public static MemoryAddress ngetStringi(int pname, int index) {
        try {
            return (MemoryAddress) check(glGetStringi).invokeExact(pname, index);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    @Nullable
    public static String getStringi(int pname, int index) {
        var pStr = ngetStringi(pname, index);
        return pStr != MemoryAddress.NULL ? pStr.getUtf8String(0) : null;
    }

    public static void getTexParameterIiv(int target, int pname, Addressable params) {
        try {
            check(glGetTexParameterIiv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTexParameterIiv(SegmentAllocator session, int target, int pname, int[] params) {
        var seg = session.allocateArray(JAVA_INT, params.length);
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

    public static void getTexParameterIuiv(int target, int pname, Addressable params) {
        try {
            check(glGetTexParameterIuiv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTexParameterIuiv(SegmentAllocator session, int target, int pname, int[] params) {
        var seg = session.allocateArray(JAVA_INT, params.length);
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

    public static void getTransformFeedbackVarying(int program, int index, int bufSize, Addressable length, Addressable size, Addressable type, Addressable name) {
        try {
            check(glGetTransformFeedbackVarying).invokeExact(program, index, bufSize, length, size, type, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTransformFeedbackVarying(SegmentAllocator session, int program, int index, int bufSize, int @Nullable [] length, int[] size, int[] type, String[] name) {
        var pLen = length != null ? session.allocate(JAVA_INT) : MemoryAddress.NULL;
        var pSz = session.allocate(JAVA_INT);
        var pType = session.allocate(JAVA_INT);
        var pName = session.allocateArray(JAVA_BYTE, bufSize);
        getTransformFeedbackVarying(program, index, bufSize, pLen, pSz, pType, pName);
        if (length != null && length.length > 0) {
            length[0] = ((MemorySegment) pLen).get(JAVA_INT, 0);
        }
        size[0] = pSz.get(JAVA_INT, 0);
        type[0] = pType.get(JAVA_INT, 0);
        name[0] = pName.getUtf8String(0);
    }

    public static void getUniformuiv(int program, int location, Addressable params) {
        try {
            check(glGetUniformuiv).invokeExact(program, location, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getUniformuiv(SegmentAllocator session, int program, int location, int[] params) {
        var seg = session.allocateArray(JAVA_INT, params.length);
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

    public static void getVertexAttribIiv(int index, int pname, Addressable params) {
        try {
            check(glGetVertexAttribIiv).invokeExact(index, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getVertexAttribIiv(SegmentAllocator session, int index, int pname, int[] params) {
        var seg = session.allocateArray(JAVA_INT, params.length);
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

    public static void getVertexAttribIuiv(int index, int pname, Addressable params) {
        try {
            check(glGetVertexAttribIuiv).invokeExact(index, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getVertexAttribIuiv(SegmentAllocator session, int index, int pname, int[] params) {
        var seg = session.allocateArray(JAVA_INT, params.length);
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
        try {
            return (boolean) check(glIsEnabledi).invokeExact(target, index);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean isFramebuffer(int framebuffer) {
        try {
            return (boolean) check(glIsFramebuffer).invokeExact(framebuffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean isRenderbuffer(int renderbuffer) {
        try {
            return (boolean) check(glIsRenderbuffer).invokeExact(renderbuffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean isVertexArray(int array) {
        try {
            return (boolean) check(glIsVertexArray).invokeExact(array);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemoryAddress mapBufferRange(int target, long offset, long length, int access) {
        try {
            return (MemoryAddress) check(glMapBufferRange).invokeExact(target, offset, length, access);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void renderbufferStorage(int target, int internalFormat, int width, int height) {
        try {
            check(glRenderbufferStorage).invokeExact(target, internalFormat, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void renderbufferStorageMultisample(int target, int samples, int internalFormat, int width, int height) {
        try {
            check(glRenderbufferStorageMultisample).invokeExact(target, samples, internalFormat, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texParameterIiv(int target, int pname, Addressable params) {
        try {
            check(glTexParameterIiv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texParameterIiv(SegmentAllocator session, int target, int pname, int[] params) {
        texParameterIiv(target, pname, session.allocateArray(JAVA_INT, params));
    }

    public static void texParameterIuiv(int target, int pname, Addressable params) {
        try {
            check(glTexParameterIuiv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texParameterIuiv(SegmentAllocator session, int target, int pname, int[] params) {
        texParameterIuiv(target, pname, session.allocateArray(JAVA_INT, params));
    }

    public static void transformFeedbackVaryings(int program, int count, Addressable varyings, int bufferMode) {
        try {
            check(glTransformFeedbackVaryings).invokeExact(program, count, varyings, bufferMode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void transformFeedbackVaryings(SegmentAllocator session, int program, String[] varyings, int bufferMode) {
        var seg = session.allocateArray(ADDRESS, varyings.length);
        for (int i = 0; i < varyings.length; i++) {
            seg.setAtIndex(ADDRESS, i, session.allocateUtf8String(varyings[i]));
        }
        transformFeedbackVaryings(program, varyings.length, seg, bufferMode);
    }

    public static void uniform1ui(int location, int v0) {
        try {
            check(glUniform1ui).invokeExact(location, v0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform1uiv(int location, int count, Addressable value) {
        try {
            check(glUniform1uiv).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform1uiv(SegmentAllocator session, int location, int[] value) {
        uniform1uiv(location, value.length, session.allocateArray(JAVA_INT, value));
    }

    public static void uniform2ui(int location, int v0, int v1) {
        try {
            check(glUniform2ui).invokeExact(location, v0, v1);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform2uiv(int location, int count, Addressable value) {
        try {
            check(glUniform2uiv).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform2uiv(SegmentAllocator session, int location, int[] value) {
        uniform2uiv(location, value.length, session.allocateArray(JAVA_INT, value));
    }

    public static void uniform3ui(int location, int v0, int v1, int v2) {
        try {
            check(glUniform3ui).invokeExact(location, v0, v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform3uiv(int location, int count, Addressable value) {
        try {
            check(glUniform3uiv).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform3uiv(SegmentAllocator session, int location, int[] value) {
        uniform3uiv(location, value.length, session.allocateArray(JAVA_INT, value));
    }

    public static void uniform4ui(int location, int v0, int v1, int v2, int v3) {
        try {
            check(glUniform4ui).invokeExact(location, v0, v1, v2, v3);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform4uiv(int location, int count, Addressable value) {
        try {
            check(glUniform4uiv).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform4uiv(SegmentAllocator session, int location, int[] value) {
        uniform4uiv(location, value.length, session.allocateArray(JAVA_INT, value));
    }

    public static void vertexAttribI1i(int index, int x) {
        try {
            check(glVertexAttribI1i).invokeExact(index, x);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI1iv(int index, Addressable v) {
        try {
            check(glVertexAttribI1iv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI1iv(SegmentAllocator session, int index, int[] v) {
        vertexAttribI1iv(index, session.allocateArray(JAVA_INT, v));
    }

    public static void vertexAttribI1ui(int index, int x) {
        try {
            check(glVertexAttribI1ui).invokeExact(index, x);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI1uiv(int index, Addressable v) {
        try {
            check(glVertexAttribI1uiv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI1uiv(SegmentAllocator session, int index, int[] v) {
        vertexAttribI1uiv(index, session.allocateArray(JAVA_INT, v));
    }

    public static void vertexAttribI2i(int index, int x, int y) {
        try {
            check(glVertexAttribI2i).invokeExact(index, x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI2iv(int index, Addressable v) {
        try {
            check(glVertexAttribI2iv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI2iv(SegmentAllocator session, int index, int[] v) {
        vertexAttribI2iv(index, session.allocateArray(JAVA_INT, v));
    }

    public static void vertexAttribI2ui(int index, int x, int y) {
        try {
            check(glVertexAttribI2ui).invokeExact(index, x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI2uiv(int index, Addressable v) {
        try {
            check(glVertexAttribI2uiv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI2uiv(SegmentAllocator session, int index, int[] v) {
        vertexAttribI2uiv(index, session.allocateArray(JAVA_INT, v));
    }

    public static void vertexAttribI3i(int index, int x, int y, int z) {
        try {
            check(glVertexAttribI3i).invokeExact(index, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI3iv(int index, Addressable v) {
        try {
            check(glVertexAttribI3iv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI3iv(SegmentAllocator session, int index, int[] v) {
        vertexAttribI3iv(index, session.allocateArray(JAVA_INT, v));
    }

    public static void vertexAttribI3ui(int index, int x, int y, int z) {
        try {
            check(glVertexAttribI3ui).invokeExact(index, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI3uiv(int index, Addressable v) {
        try {
            check(glVertexAttribI3uiv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI3uiv(SegmentAllocator session, int index, int[] v) {
        vertexAttribI3uiv(index, session.allocateArray(JAVA_INT, v));
    }

    public static void vertexAttribI4bv(int index, Addressable v) {
        try {
            check(glVertexAttribI4bv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI4bv(SegmentAllocator session, int index, byte[] v) {
        vertexAttribI4bv(index, session.allocateArray(JAVA_BYTE, v));
    }

    public static void vertexAttribI4i(int index, int x, int y, int z, int w) {
        try {
            check(glVertexAttribI4i).invokeExact(index, x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI4iv(int index, Addressable v) {
        try {
            check(glVertexAttribI4iv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI4iv(SegmentAllocator session, int index, int[] v) {
        vertexAttribI4iv(index, session.allocateArray(JAVA_INT, v));
    }

    public static void vertexAttribI4sv(int index, Addressable v) {
        try {
            check(glVertexAttribI4sv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI4sv(SegmentAllocator session, int index, short[] v) {
        vertexAttribI4sv(index, session.allocateArray(JAVA_SHORT, v));
    }

    public static void vertexAttribI4ubv(int index, Addressable v) {
        try {
            check(glVertexAttribI4ubv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI4ubv(SegmentAllocator session, int index, byte[] v) {
        vertexAttribI4ubv(index, session.allocateArray(JAVA_BYTE, v));
    }

    public static void vertexAttribI4ui(int index, int x, int y, int z, int w) {
        try {
            check(glVertexAttribI4ui).invokeExact(index, x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI4uiv(int index, Addressable v) {
        try {
            check(glVertexAttribI4uiv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI4uiv(SegmentAllocator session, int index, int[] v) {
        vertexAttribI4uiv(index, session.allocateArray(JAVA_INT, v));
    }

    public static void vertexAttribI4usv(int index, Addressable v) {
        try {
            check(glVertexAttribI4usv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI4usv(SegmentAllocator session, int index, short[] v) {
        vertexAttribI4usv(index, session.allocateArray(JAVA_SHORT, v));
    }

    public static void vertexAttribIPointer(int index, int size, int type, int stride, Addressable pointer) {
        try {
            check(glVertexAttribIPointer).invokeExact(index, size, type, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribIPointer(SegmentAllocator session, int index, int size, int type, int stride, byte[] pointer) {
        vertexAttribIPointer(index, size, type, stride, session.allocateArray(JAVA_BYTE, pointer));
    }

    public static void vertexAttribIPointer(SegmentAllocator session, int index, int size, int type, int stride, short[] pointer) {
        vertexAttribIPointer(index, size, type, stride, session.allocateArray(JAVA_SHORT, pointer));
    }

    public static void vertexAttribIPointer(SegmentAllocator session, int index, int size, int type, int stride, int[] pointer) {
        vertexAttribIPointer(index, size, type, stride, session.allocateArray(JAVA_INT, pointer));
    }
}

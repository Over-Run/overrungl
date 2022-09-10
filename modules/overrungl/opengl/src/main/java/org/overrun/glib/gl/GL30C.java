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

import java.lang.foreign.Addressable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.gl.GLCaps.*;

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
        glBeginConditionalRender = downcallSafe(load.invoke("glBeginConditionalRender"), dIIV);
        glBeginTransformFeedback = downcallSafe(load.invoke("glBeginTransformFeedback"), dIV);
        glBindBufferBase = downcallSafe(load.invoke("glBindBufferBase"), dIIIV);
        glBindBufferRange = downcallSafe(load.invoke("glBindBufferRange"), dIIIJJV);
        glBindFragDataLocation = downcallSafe(load.invoke("glBindFragDataLocation"), dIIPV);
        glBindFramebuffer = downcallSafe(load.invoke("glBindFramebuffer"), dIIV);
        glBindRenderbuffer = downcallSafe(load.invoke("glBindRenderbuffer"), dIIV);
        glBindVertexArray = downcallSafe(load.invoke("glBindVertexArray"), dIV);
        glBlitFramebuffer = downcallSafe(load.invoke("glBlitFramebuffer"), dIIIIIIIIIIV);
        glCheckFramebufferStatus = downcallSafe(load.invoke("glCheckFramebufferStatus"), dII);
        glClampColor = downcallSafe(load.invoke("glClampColor"), dIIV);
        glClearBufferfi = downcallSafe(load.invoke("glClearBufferfi"), dIIFIV);
        glClearBufferfv = downcallSafe(load.invoke("glClearBufferfv"), dIIPV);
        glClearBufferiv = downcallSafe(load.invoke("glClearBufferiv"), dIIPV);
        glClearBufferuiv = downcallSafe(load.invoke("glClearBufferuiv"), dIIPV);
        glColorMaski = downcallSafe(load.invoke("glColorMaski"), dIZZZZV);
        glDeleteFramebuffers = downcallSafe(load.invoke("glDeleteFramebuffers"), dIPV);
        glDeleteRenderbuffers = downcallSafe(load.invoke("glDeleteRenderbuffers"), dIPV);
        glDeleteVertexArrays = downcallSafe(load.invoke("glDeleteVertexArrays"), dIPV);
        glDisablei = downcallSafe(load.invoke("glDisablei"), dIIV);
        glEnablei = downcallSafe(load.invoke("glEnablei"), dIIV);
        glEndConditionalRender = downcallSafe(load.invoke("glEndConditionalRender"), dV);
        glEndTransformFeedback = downcallSafe(load.invoke("glEndTransformFeedback"), dV);
        glFlushMappedBufferRange = downcallSafe(load.invoke("glFlushMappedBufferRange"), dIJJV);
        glFramebufferRenderbuffer = downcallSafe(load.invoke("glFramebufferRenderbuffer"), dIIIIV);
        glFramebufferTexture1D = downcallSafe(load.invoke("glFramebufferTexture1D"), dIIIIIV);
        glFramebufferTexture2D = downcallSafe(load.invoke("glFramebufferTexture2D"), dIIIIIV);
        glFramebufferTexture3D = downcallSafe(load.invoke("glFramebufferTexture3D"), dIIIIIIV);
        glFramebufferTextureLayer = downcallSafe(load.invoke("glFramebufferTextureLayer"), dIIIIIV);
        glGenFramebuffers = downcallSafe(load.invoke("glGenFramebuffers"), dIPV);
        glGenRenderbuffers = downcallSafe(load.invoke("glGenRenderbuffers"), dIPV);
        glGenVertexArrays = downcallSafe(load.invoke("glGenVertexArrays"), dIPV);
        glGenerateMipmap = downcallSafe(load.invoke("glGenerateMipmap"), dIV);
        glGetBooleani_v = downcallSafe(load.invoke("glGetBooleani_v"), dIIPV);
        glGetFragDataLocation = downcallSafe(load.invoke("glGetFragDataLocation"), dIPI);
        glGetFramebufferAttachmentParameteriv = downcallSafe(load.invoke("glGetFramebufferAttachmentParameteriv"), dIIIPV);
        glGetIntegeri_v = downcallSafe(load.invoke("glGetIntegeri_v"), dIIPV);
        glGetRenderbufferParameteriv = downcallSafe(load.invoke("glGetRenderbufferParameteriv"), dIIPV);
        glGetStringi = downcallSafe(load.invoke("glGetStringi"), dIIP);
        glGetTexParameterIiv = downcallSafe(load.invoke("glGetTexParameterIiv"), dIIPV);
        glGetTexParameterIuiv = downcallSafe(load.invoke("glGetTexParameterIuiv"), dIIPV);
        glGetTransformFeedbackVarying = downcallSafe(load.invoke("glGetTransformFeedbackVarying"), dIIIPPPPV);
        glGetUniformuiv = downcallSafe(load.invoke("glGetUniformuiv"), dIIPV);
        glGetVertexAttribIiv = downcallSafe(load.invoke("glGetVertexAttribIiv"), dIIPV);
        glGetVertexAttribIuiv = downcallSafe(load.invoke("glGetVertexAttribIuiv"), dIIPV);
        glIsEnabledi = downcallSafe(load.invoke("glIsEnabledi"), dIIZ);
        glIsFramebuffer = downcallSafe(load.invoke("glIsFramebuffer"), dIZ);
        glIsRenderbuffer = downcallSafe(load.invoke("glIsRenderbuffer"), dIZ);
        glIsVertexArray = downcallSafe(load.invoke("glIsVertexArray"), dIZ);
        glMapBufferRange = downcallSafe(load.invoke("glMapBufferRange"), dIJJIP);
        glRenderbufferStorage = downcallSafe(load.invoke("glRenderbufferStorage"), dIIIIV);
        glRenderbufferStorageMultisample = downcallSafe(load.invoke("glRenderbufferStorageMultisample"), dIIIIIV);
        glTexParameterIiv = downcallSafe(load.invoke("glTexParameterIiv"), dIIPV);
        glTexParameterIuiv = downcallSafe(load.invoke("glTexParameterIuiv"), dIIPV);
        glTransformFeedbackVaryings = downcallSafe(load.invoke("glTransformFeedbackVaryings"), dIIPIV);
        glUniform1ui = downcallSafe(load.invoke("glUniform1ui"), dIIV);
        glUniform1uiv = downcallSafe(load.invoke("glUniform1uiv"), dIIPV);
        glUniform2ui = downcallSafe(load.invoke("glUniform2ui"), dIIIV);
        glUniform2uiv = downcallSafe(load.invoke("glUniform2uiv"), dIIPV);
        glUniform3ui = downcallSafe(load.invoke("glUniform3ui"), dIIIIV);
        glUniform3uiv = downcallSafe(load.invoke("glUniform3uiv"), dIIPV);
        glUniform4ui = downcallSafe(load.invoke("glUniform4ui"), dIIIIIV);
        glUniform4uiv = downcallSafe(load.invoke("glUniform4uiv"), dIIPV);
        glVertexAttribI1i = downcallSafe(load.invoke("glVertexAttribI1i"), dIIV);
        glVertexAttribI1iv = downcallSafe(load.invoke("glVertexAttribI1iv"), dIPV);
        glVertexAttribI1ui = downcallSafe(load.invoke("glVertexAttribI1ui"), dIIV);
        glVertexAttribI1uiv = downcallSafe(load.invoke("glVertexAttribI1uiv"), dIPV);
        glVertexAttribI2i = downcallSafe(load.invoke("glVertexAttribI2i"), dIIIV);
        glVertexAttribI2iv = downcallSafe(load.invoke("glVertexAttribI2iv"), dIPV);
        glVertexAttribI2ui = downcallSafe(load.invoke("glVertexAttribI2ui"), dIIIV);
        glVertexAttribI2uiv = downcallSafe(load.invoke("glVertexAttribI2uiv"), dIPV);
        glVertexAttribI3i = downcallSafe(load.invoke("glVertexAttribI3i"), dIIIIV);
        glVertexAttribI3iv = downcallSafe(load.invoke("glVertexAttribI3iv"), dIPV);
        glVertexAttribI3ui = downcallSafe(load.invoke("glVertexAttribI3ui"), dIIIIV);
        glVertexAttribI3uiv = downcallSafe(load.invoke("glVertexAttribI3uiv"), dIPV);
        glVertexAttribI4bv = downcallSafe(load.invoke("glVertexAttribI4bv"), dIPV);
        glVertexAttribI4i = downcallSafe(load.invoke("glVertexAttribI4i"), dIIIIIV);
        glVertexAttribI4iv = downcallSafe(load.invoke("glVertexAttribI4iv"), dIPV);
        glVertexAttribI4sv = downcallSafe(load.invoke("glVertexAttribI4sv"), dIPV);
        glVertexAttribI4ubv = downcallSafe(load.invoke("glVertexAttribI4ubv"), dIPV);
        glVertexAttribI4ui = downcallSafe(load.invoke("glVertexAttribI4ui"), dIIIIIV);
        glVertexAttribI4uiv = downcallSafe(load.invoke("glVertexAttribI4uiv"), dIPV);
        glVertexAttribI4usv = downcallSafe(load.invoke("glVertexAttribI4usv"), dIPV);
        glVertexAttribIPointer = downcallSafe(load.invoke("glVertexAttribIPointer"), dIIIIPV);
    }

    public static void beginConditionalRender(int id, int mode) {
        try {
            check(glBeginConditionalRender).invoke(id, mode);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void beginTransformFeedback(int primitiveMode) {
        try {
            check(glBeginTransformFeedback).invoke(primitiveMode);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void bindBufferBase(int target, int index, int buffer) {
        try {
            check(glBindBufferBase).invoke(target, index, buffer);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void bindBufferRange(int target, int index, int buffer, long offset, long size) {
        try {
            check(glBindBufferRange).invoke(target, index, buffer, offset, size);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void bindFragDataLocation(int program, int color, Addressable name) {
        try {
            check(glBindFragDataLocation).invoke(program, color, name);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void bindFragDataLocation(int program, int color, String name) {
        try (var session = MemorySession.openShared()) {
            bindFragDataLocation(program, color, session.allocateUtf8String(name));
        }
    }

    public static void bindFramebuffer(int target, int framebuffer) {
        try {
            check(glBindFramebuffer).invoke(target, framebuffer);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void bindRenderbuffer(int target, int renderbuffer) {
        try {
            check(glBindRenderbuffer).invoke(target, renderbuffer);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void bindVertexArray(int array) {
        try {
            check(glBindVertexArray).invoke(array);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void blitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        try {
            check(glBlitFramebuffer).invoke(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static int checkFramebufferStatus(int target) {
        try {
            return (int) check(glCheckFramebufferStatus).invoke(target);
        } catch (Throwable e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static void clampColor(int target, int clamp) {
        try {
            check(glClampColor).invoke(target, clamp);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void clearBufferfi(int buffer, int drawBuffer, float depth, int stencil) {
        try {
            check(glClearBufferfi).invoke(buffer, drawBuffer, depth, stencil);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void clearBufferfv(int buffer, int drawBuffer, Addressable value) {
        try {
            check(glClearBufferfv).invoke(buffer, drawBuffer, value);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void clearBufferfv(int buffer, int drawBuffer, float[] value) {
        try (var session = MemorySession.openShared()) {
            clearBufferfv(buffer, drawBuffer, session.allocateArray(JAVA_FLOAT, value));
        }
    }

    public static void clearBufferiv(int buffer, int drawBuffer, Addressable value) {
        try {
            check(glClearBufferiv).invoke(buffer, drawBuffer, value);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void clearBufferiv(int buffer, int drawBuffer, int[] value) {
        try (var session = MemorySession.openShared()) {
            clearBufferiv(buffer, drawBuffer, session.allocateArray(JAVA_INT, value));
        }
    }

    public static void clearBufferuiv(int buffer, int drawBuffer, Addressable value) {
        try {
            check(glClearBufferuiv).invoke(buffer, drawBuffer, value);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void clearBufferuiv(int buffer, int drawBuffer, int[] value) {
        try (var session = MemorySession.openShared()) {
            clearBufferuiv(buffer, drawBuffer, session.allocateArray(JAVA_INT, value));
        }
    }

    public static void colorMaski(int index, boolean r, boolean g, boolean b, boolean a) {
        try {
            check(glColorMaski).invoke(index, r, g, b, a);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void deleteFramebuffers(int n, Addressable framebuffers) {
        try {
            check(glDeleteFramebuffers).invoke(n, framebuffers);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void deleteFramebuffers(int[] framebuffers) {
        try (var session = MemorySession.openShared()) {
            deleteFramebuffers(framebuffers.length, session.allocateArray(JAVA_INT, framebuffers));
        }
    }

    public static void deleteFramebuffer(int framebuffer) {
        try (var session = MemorySession.openShared()) {
            deleteFramebuffers(1, session.allocate(JAVA_INT, framebuffer));
        }
    }

    public static void deleteRenderbuffers(int n, Addressable renderbuffers) {
        try {
            check(glDeleteRenderbuffers).invoke(n, renderbuffers);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void deleteRenderbuffers(int[] renderbuffers) {
        try (var session = MemorySession.openShared()) {
            deleteRenderbuffers(renderbuffers.length, session.allocateArray(JAVA_INT, renderbuffers));
        }
    }

    public static void deleteRenderbuffer(int renderbuffer) {
        try (var session = MemorySession.openShared()) {
            deleteRenderbuffers(1, session.allocate(JAVA_INT, renderbuffer));
        }
    }

    public static void deleteVertexArrays(int n, Addressable arrays) {
        try {
            check(glDeleteVertexArrays).invoke(n, arrays);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void deleteVertexArrays(int[] arrays) {
        try (var session = MemorySession.openShared()) {
            deleteVertexArrays(arrays.length, session.allocateArray(JAVA_INT, arrays));
        }
    }

    public static void deleteVertexArray(int array) {
        try (var session = MemorySession.openShared()) {
            deleteVertexArrays(1, session.allocate(JAVA_INT, array));
        }
    }

    public static void disablei(int target, int index) {
        try {
            check(glDisablei).invoke(target, index);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void enablei(int target, int index) {
        try {
            check(glEnablei).invoke(target, index);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void endConditionalRender() {
        try {
            check(glEndConditionalRender).invoke();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void endTransformFeedback() {
        try {
            check(glEndTransformFeedback).invoke();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void flushMappedBufferRange(int target, long offset, long length) {
        try {
            check(glFlushMappedBufferRange).invoke(target, offset, length);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void framebufferRenderbuffer(int target, int attachment, int renderbufferTarget, int renderbuffer) {
        try {
            check(glFramebufferRenderbuffer).invoke(target, attachment, renderbufferTarget, renderbuffer);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void framebufferTexture1D(int target, int attachment, int texTarget, int texture, int level) {
        try {
            check(glFramebufferTexture1D).invoke(target, attachment, texTarget, texture, level);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void framebufferTexture2D(int target, int attachment, int texTarget, int texture, int level) {
        try {
            check(glFramebufferTexture2D).invoke(target, attachment, texTarget, texture, level);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void framebufferTexture3D(int target, int attachment, int texTarget, int texture, int level, int zoffset) {
        try {
            check(glFramebufferTexture3D).invoke(target, attachment, texTarget, texture, level, zoffset);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void framebufferTextureLayer(int target, int attachment, int texture, int level, int layer) {
        try {
            check(glFramebufferTextureLayer).invoke(target, attachment, texture, level, layer);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void genFramebuffers(int n, Addressable framebuffers) {
        try {
            check(glGenFramebuffers).invoke(n, framebuffers);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void genFramebuffers(int[] framebuffers) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, framebuffers.length);
            genFramebuffers(framebuffers.length, seg);
            for (int i = 0; i < framebuffers.length; i++) {
                framebuffers[i] = seg.getAtIndex(JAVA_INT, i);
            }
        }
    }

    public static int genFramebuffer() {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            genFramebuffers(1, seg);
            return seg.get(JAVA_INT, 0L);
        }
    }

    public static void genRenderbuffers(int n, Addressable renderbuffers) {
        try {
            check(glGenRenderbuffers).invoke(n, renderbuffers);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void genRenderbuffers(int[] renderbuffers) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, renderbuffers.length);
            genRenderbuffers(renderbuffers.length, seg);
            for (int i = 0; i < renderbuffers.length; i++) {
                renderbuffers[i] = seg.getAtIndex(JAVA_INT, i);
            }
        }
    }

    public static int genRenderbuffer() {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            genRenderbuffers(1, seg);
            return seg.get(JAVA_INT, 0L);
        }
    }

    public static void genVertexArrays(int n, Addressable arrays) {
        try {
            check(glGenVertexArrays).invoke(n, arrays);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void genVertexArrays(int[] arrays) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, arrays.length);
            genVertexArrays(arrays.length, seg);
            for (int i = 0; i < arrays.length; i++) {
                arrays[i] = seg.getAtIndex(JAVA_INT, i);
            }
        }
    }

    public static int genVertexArray() {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            genVertexArrays(1, seg);
            return seg.get(JAVA_INT, 0L);
        }
    }

    public static void generateMipmap(int target) {
        try {
            check(glGenerateMipmap).invoke(target);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getBooleani_v(int target, int index, Addressable data) {
        try {
            check(glGetBooleani_v).invoke(target, index, data);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getBooleani_v(int target, int index, boolean[] data) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_BOOLEAN, data.length);
            getBooleani_v(target, index, seg);
            for (int i = 0; i < data.length; i++) {
                data[i] = seg.get(JAVA_BOOLEAN, i);
            }
        }
    }

    public static boolean getBooleani(int target, int index) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_BOOLEAN);
            getBooleani_v(target, index, seg);
            return seg.get(JAVA_BOOLEAN, 0L);
        }
    }

    public static int getFragDataLocation(int program, Addressable name) {
        try {
            return (int) check(glGetFragDataLocation).invoke(program, name);
        } catch (Throwable e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static int getFragDataLocation(int program, String name) {
        try (var session = MemorySession.openShared()) {
            return getFragDataLocation(program, session.allocateUtf8String(name));
        }
    }

    public static void getFramebufferAttachmentParameteriv(int target, int attachment, int pname, Addressable params) {
        try {
            check(glGetFramebufferAttachmentParameteriv).invoke(target, attachment, pname, params);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getFramebufferAttachmentParameteriv(int target, int attachment, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getFramebufferAttachmentParameteriv(target, attachment, pname, seg);
            params[0] = seg.get(JAVA_INT, 0L);
        }
    }

    public static int getFramebufferAttachmentParameteri(int target, int attachment, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getFramebufferAttachmentParameteriv(target, attachment, pname, seg);
            return seg.get(JAVA_INT, 0L);
        }
    }

    public static void getIntegeri_v(int target, int index, Addressable data) {
        try {
            check(glGetIntegeri_v).invoke(target, index, data);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getIntegeri_v(int target, int index, int[] data) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, data.length);
            getIntegeri_v(target, index, seg);
            for (int i = 0; i < data.length; i++) {
                data[i] = seg.getAtIndex(JAVA_INT, i);
            }
        }
    }

    public static int getIntegeri(int target, int index) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getIntegeri_v(target, index, seg);
            return seg.get(JAVA_INT, 0L);
        }
    }

    public static void getRenderbufferParameteriv(int target, int pname, Addressable params) {
        try {
            check(glGetRenderbufferParameteriv).invoke(target, pname, params);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getRenderbufferParameteriv(int target, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getRenderbufferParameteriv(target, pname, seg);
            params[0] = seg.get(JAVA_INT, 0L);
        }
    }

    public static int getRenderbufferParameteri(int target, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getRenderbufferParameteriv(target, pname, seg);
            return seg.get(JAVA_INT, 0L);
        }
    }

    public static MemoryAddress ngetStringi(int pname, int index) {
        try {
            return (MemoryAddress) check(glGetStringi).invoke(pname, index);
        } catch (Throwable e) {
            e.printStackTrace();
            return MemoryAddress.NULL;
        }
    }

    @Nullable
    public static String getStringi(int pname, int index) {
        var pStr = ngetStringi(pname, index);
        return pStr != MemoryAddress.NULL ? pStr.getUtf8String(0L) : null;
    }

    public static void getTexParameterIiv(int target, int pname, Addressable params) {
        try {
            check(glGetTexParameterIiv).invoke(target, pname, params);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getTexParameterIiv(int target, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, params.length);
            getTexParameterIiv(target, pname, seg);
            for (int i = 0; i < params.length; i++) {
                params[i] = seg.getAtIndex(JAVA_INT, i);
            }
        }
    }

    public static int getTexParameterIiv(int target, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getTexParameterIiv(target, pname, seg);
            return seg.get(JAVA_INT, 0L);
        }
    }

    public static void getTexParameterIuiv(int target, int pname, Addressable params) {
        try {
            check(glGetTexParameterIuiv).invoke(target, pname, params);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getTexParameterIuiv(int target, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, params.length);
            getTexParameterIuiv(target, pname, seg);
            for (int i = 0; i < params.length; i++) {
                params[i] = seg.getAtIndex(JAVA_INT, i);
            }
        }
    }

    public static int getTexParameterIuiv(int target, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getTexParameterIuiv(target, pname, seg);
            return seg.get(JAVA_INT, 0L);
        }
    }

    public static void getTransformFeedbackVarying(int program, int index, int bufSize, Addressable length, Addressable size, Addressable type, Addressable name) {
        try {
            check(glGetTransformFeedbackVarying).invoke(program, index, bufSize, length, size, type, name);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getTransformFeedbackVarying(int program, int index, int bufSize, int @Nullable [] length, int[] size, int[] type, String[] name) {
        try (var session = MemorySession.openShared()) {
            var pLen = length != null ? session.allocate(JAVA_INT) : MemoryAddress.NULL;
            var pSz = session.allocate(JAVA_INT);
            var pType = session.allocate(JAVA_INT);
            var pName = session.allocateArray(JAVA_BYTE, bufSize);
            getTransformFeedbackVarying(program, index, bufSize, pLen, pSz, pType, pName);
            if (length != null && length.length > 0) {
                length[0] = ((MemorySegment) pLen).get(JAVA_INT, 0L);
            }
            size[0] = pSz.get(JAVA_INT, 0L);
            type[0] = pType.get(JAVA_INT, 0L);
            name[0] = pName.getUtf8String(0L);
        }
    }

    public static void getUniformuiv(int program, int location, Addressable params) {
        try {
            check(glGetUniformuiv).invoke(program, location, params);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getUniformuiv(int program, int location, int[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, params.length);
            getUniformuiv(program, location, seg);
            for (int i = 0; i < params.length; i++) {
                params[i] = seg.getAtIndex(JAVA_INT, i);
            }
        }
    }

    public static int getUniformui(int program, int location) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getUniformuiv(program, location, seg);
            return seg.get(JAVA_INT, 0L);
        }
    }

    public static void getVertexAttribIiv(int index, int pname, Addressable params) {
        try {
            check(glGetVertexAttribIiv).invoke(index, pname, params);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getVertexAttribIiv(int index, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, params.length);
            getVertexAttribIiv(index, pname, seg);
            for (int i = 0; i < params.length; i++) {
                params[i] = seg.getAtIndex(JAVA_INT, i);
            }
        }
    }

    public static int getVertexAttribIi(int index, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getVertexAttribIiv(index, pname, seg);
            return seg.get(JAVA_INT, 0L);
        }
    }

    public static void getVertexAttribIuiv(int index, int pname, Addressable params) {
        try {
            check(glGetVertexAttribIuiv).invoke(index, pname, params);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getVertexAttribIuiv(int index, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, params.length);
            getVertexAttribIuiv(index, pname, seg);
            for (int i = 0; i < params.length; i++) {
                params[i] = seg.getAtIndex(JAVA_INT, i);
            }
        }
    }

    public static int getVertexAttribIui(int index, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getVertexAttribIuiv(index, pname, seg);
            return seg.get(JAVA_INT, 0L);
        }
    }

    public static boolean isEnabledi(int target, int index) {
        try {
            return (boolean) check(glIsEnabledi).invoke(target, index);
        } catch (Throwable e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isFramebuffer(int framebuffer) {
        try {
            return (boolean) check(glIsFramebuffer).invoke(framebuffer);
        } catch (Throwable e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isRenderbuffer(int renderbuffer) {
        try {
            return (boolean) check(glIsRenderbuffer).invoke(renderbuffer);
        } catch (Throwable e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isVertexArray(int array) {
        try {
            return (boolean) check(glIsVertexArray).invoke(array);
        } catch (Throwable e) {
            e.printStackTrace();
            return false;
        }
    }

    public static MemoryAddress mapBufferRange(int target, long offset, long length, int access) {
        try {
            return (MemoryAddress) check(glMapBufferRange).invoke(target, offset, length, access);
        } catch (Throwable e) {
            e.printStackTrace();
            return MemoryAddress.NULL;
        }
    }

    public static void renderbufferStorage(int target, int internalFormat, int width, int height) {
        try {
            check(glRenderbufferStorage).invoke(target, internalFormat, width, height);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void renderbufferStorageMultisample(int target, int samples, int internalFormat, int width, int height) {
        try {
            check(glRenderbufferStorageMultisample).invoke(target, samples, internalFormat, width, height);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void texParameterIiv(int target, int pname, Addressable params) {
        try {
            check(glTexParameterIiv).invoke(target, pname, params);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void texParameterIiv(int target, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            texParameterIiv(target, pname, session.allocateArray(JAVA_INT, params));
        }
    }

    public static void texParameterIuiv(int target, int pname, Addressable params) {
        try {
            check(glTexParameterIuiv).invoke(target, pname, params);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void texParameterIuiv(int target, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            texParameterIuiv(target, pname, session.allocateArray(JAVA_INT, params));
        }
    }

    public static void transformFeedbackVaryings(int program, int count, Addressable varyings, int bufferMode) {
        try {
            check(glTransformFeedbackVaryings).invoke(program, count, varyings, bufferMode);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void transformFeedbackVaryings(int program, String[] varyings, int bufferMode) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(ADDRESS, varyings.length);
            for (int i = 0; i < varyings.length; i++) {
                seg.setAtIndex(ADDRESS, i, session.allocateUtf8String(varyings[i]));
            }
            transformFeedbackVaryings(program, varyings.length, seg, bufferMode);
        }
    }

    public static void uniform1ui(int location, int v0) {
        try {
            check(glUniform1ui).invoke(location, v0);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniform1uiv(int location, int count, Addressable value) {
        try {
            check(glUniform1uiv).invoke(location, count, value);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniform1uiv(int location, int[] value) {
        try (var session = MemorySession.openShared()) {
            uniform1uiv(location, value.length, session.allocateArray(JAVA_INT, value));
        }
    }

    public static void uniform2ui(int location, int v0, int v1) {
        try {
            check(glUniform2ui).invoke(location, v0, v1);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniform2uiv(int location, int count, Addressable value) {
        try {
            check(glUniform2uiv).invoke(location, count, value);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniform2uiv(int location, int[] value) {
        try (var session = MemorySession.openShared()) {
            uniform2uiv(location, value.length, session.allocateArray(JAVA_INT, value));
        }
    }

    public static void uniform3ui(int location, int v0, int v1, int v2) {
        try {
            check(glUniform3ui).invoke(location, v0, v1, v2);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniform3uiv(int location, int count, Addressable value) {
        try {
            check(glUniform3uiv).invoke(location, count, value);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniform3uiv(int location, int[] value) {
        try (var session = MemorySession.openShared()) {
            uniform3uiv(location, value.length, session.allocateArray(JAVA_INT, value));
        }
    }

    public static void uniform4ui(int location, int v0, int v1, int v2, int v3) {
        try {
            check(glUniform4ui).invoke(location, v0, v1, v2, v3);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniform4uiv(int location, int count, Addressable value) {
        try {
            check(glUniform4uiv).invoke(location, count, value);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniform4uiv(int location, int[] value) {
        try (var session = MemorySession.openShared()) {
            uniform4uiv(location, value.length, session.allocateArray(JAVA_INT, value));
        }
    }

    public static void vertexAttribI1i(int index, int x) {
        try {
            check(glVertexAttribI1i).invoke(index, x);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttribI1iv(int index, Addressable v) {
        try {
            check(glVertexAttribI1iv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttribI1iv(int index, int[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttribI1iv(index, session.allocateArray(JAVA_INT, v));
        }
    }

    public static void vertexAttribI1ui(int index, int x) {
        try {
            check(glVertexAttribI1ui).invoke(index, x);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttribI1uiv(int index, Addressable v) {
        try {
            check(glVertexAttribI1uiv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttribI1uiv(int index, int[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttribI1uiv(index, session.allocateArray(JAVA_INT, v));
        }
    }

    public static void vertexAttribI2i(int index, int x, int y) {
        try {
            check(glVertexAttribI2i).invoke(index, x, y);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttribI2iv(int index, Addressable v) {
        try {
            check(glVertexAttribI2iv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttribI2iv(int index, int[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttribI2iv(index, session.allocateArray(JAVA_INT, v));
        }
    }

    public static void vertexAttribI2ui(int index, int x, int y) {
        try {
            check(glVertexAttribI2ui).invoke(index, x, y);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttribI2uiv(int index, Addressable v) {
        try {
            check(glVertexAttribI2uiv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttribI2uiv(int index, int[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttribI2uiv(index, session.allocateArray(JAVA_INT, v));
        }
    }

    public static void vertexAttribI3i(int index, int x, int y, int z) {
        try {
            check(glVertexAttribI3i).invoke(index, x, y, z);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttribI3iv(int index, Addressable v) {
        try {
            check(glVertexAttribI3iv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttribI3iv(int index, int[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttribI3iv(index, session.allocateArray(JAVA_INT, v));
        }
    }

    public static void vertexAttribI3ui(int index, int x, int y, int z) {
        try {
            check(glVertexAttribI3ui).invoke(index, x, y, z);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttribI3uiv(int index, Addressable v) {
        try {
            check(glVertexAttribI3uiv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttribI3uiv(int index, int[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttribI3uiv(index, session.allocateArray(JAVA_INT, v));
        }
    }

    public static void vertexAttribI4bv(int index, Addressable v) {
        try {
            check(glVertexAttribI4bv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttribI4bv(int index, byte[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttribI4bv(index, session.allocateArray(JAVA_BYTE, v));
        }
    }

    public static void vertexAttribI4i(int index, int x, int y, int z, int w) {
        try {
            check(glVertexAttribI4i).invoke(index, x, y, z, w);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttribI4iv(int index, Addressable v) {
        try {
            check(glVertexAttribI4iv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttribI4iv(int index, int[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttribI4iv(index, session.allocateArray(JAVA_INT, v));
        }
    }

    public static void vertexAttribI4sv(int index, Addressable v) {
        try {
            check(glVertexAttribI4sv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttribI4sv(int index, short[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttribI4sv(index, session.allocateArray(JAVA_SHORT, v));
        }
    }

    public static void vertexAttribI4ubv(int index, Addressable v) {
        try {
            check(glVertexAttribI4ubv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttribI4ubv(int index, byte[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttribI4ubv(index, session.allocateArray(JAVA_BYTE, v));
        }
    }

    public static void vertexAttribI4ui(int index, int x, int y, int z, int w) {
        try {
            check(glVertexAttribI4ui).invoke(index, x, y, z, w);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttribI4uiv(int index, Addressable v) {
        try {
            check(glVertexAttribI4uiv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttribI4uiv(int index, int[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttribI4uiv(index, session.allocateArray(JAVA_INT, v));
        }
    }

    public static void vertexAttribI4usv(int index, Addressable v) {
        try {
            check(glVertexAttribI4usv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttribI4usv(int index, short[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttribI4usv(index, session.allocateArray(JAVA_SHORT, v));
        }
    }

    public static void vertexAttribIPointer(int index, int size, int type, int stride, Addressable pointer) {
        try {
            check(glVertexAttribIPointer).invoke(index, size, type, stride, pointer);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttribIPointer(int index, int size, int type, int stride, byte[] pointer) {
        try (var session = MemorySession.openShared()) {
            vertexAttribIPointer(index, size, type, stride, session.allocateArray(JAVA_BYTE, pointer));
        }
    }

    public static void vertexAttribIPointer(int index, int size, int type, int stride, short[] pointer) {
        try (var session = MemorySession.openShared()) {
            vertexAttribIPointer(index, size, type, stride, session.allocateArray(JAVA_SHORT, pointer));
        }
    }

    public static void vertexAttribIPointer(int index, int size, int type, int stride, int[] pointer) {
        try (var session = MemorySession.openShared()) {
            vertexAttribIPointer(index, size, type, stride, session.allocateArray(JAVA_INT, pointer));
        }
    }
}

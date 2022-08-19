package org.overrun.glib.gl;

import org.jetbrains.annotations.Nullable;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemorySession;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
import static java.lang.foreign.ValueLayout.JAVA_INT;
import static org.overrun.glib.gl.GL.*;

/**
 * The OpenGL 3.0 forward compatible functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GL30C extends GL21C {
    @Nullable
    public static MethodHandle
        glBeginConditionalRender,
        glBeginTransformFeedback,
        glBindBufferBase,
        glBindBufferRange,
        glBindFragDataLocation,
        glBindFramebuffer,
        glBindRenderbuffer,
        glBindVertexArray,
        glBlitFramebuffer,
        glCheckFramebufferStatus,
        glClampColor,
        glClearBufferfi,
        glClearBufferfv,
        glClearBufferiv,
        glClearBufferuiv,
        glColorMaski,
        glDeleteFramebuffers,
        glDeleteRenderbuffers,
        glDeleteVertexArrays,
        glDisablei,
        glEnablei,
        glEndConditionalRender,
        glEndTransformFeedback,
        glFlushMappedBufferRange,
        glFramebufferRenderbuffer,
        glFramebufferTexture1D,
        glFramebufferTexture2D,
        glFramebufferTexture3D,
        glFramebufferTextureLayer,
        glGenFramebuffers,
        glGenRenderbuffers,
        glGenVertexArrays,
        glGenerateMipmap,
        glGetBooleani_v,
        glGetFragDataLocation,
        glGetFramebufferAttachmentParameteriv,
        glGetIntegeri_v,
        glGetRenderbufferParameteriv,
        glGetStringi,
        glGetTexParameterIiv,
        glGetTexParameterIuiv,
        glGetTransformFeedbackVarying,
        glGetUniformuiv,
        glGetVertexAttribIiv,
        glGetVertexAttribIuiv,
        glIsEnabledi,
        glIsFramebuffer,
        glIsRenderbuffer,
        glIsVertexArray,
        glMapBufferRange,
        glRenderbufferStorage,
        glRenderbufferStorageMultisample,
        glTexParameterIiv,
        glTexParameterIuiv,
        glTransformFeedbackVaryings,
        glUniform1ui,
        glUniform1uiv,
        glUniform2ui,
        glUniform2uiv,
        glUniform3ui,
        glUniform3uiv,
        glUniform4ui,
        glUniform4uiv,
        glVertexAttribI1i,
        glVertexAttribI1iv,
        glVertexAttribI1ui,
        glVertexAttribI1uiv,
        glVertexAttribI2i,
        glVertexAttribI2iv,
        glVertexAttribI2ui,
        glVertexAttribI2uiv,
        glVertexAttribI3i,
        glVertexAttribI3iv,
        glVertexAttribI3ui,
        glVertexAttribI3uiv,
        glVertexAttribI4bv,
        glVertexAttribI4i,
        glVertexAttribI4iv,
        glVertexAttribI4sv,
        glVertexAttribI4ubv,
        glVertexAttribI4ui,
        glVertexAttribI4uiv,
        glVertexAttribI4usv,
        glVertexAttribIPointer;

    static void load(GLLoadFunc load) {
        if (!Ver30) return;
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
        glFramebufferTexture1D = downcallSafe(load.invoke("glFramebufferTexture1D"), );
        glFramebufferTexture2D = downcallSafe(load.invoke("glFramebufferTexture2D"), );
        glFramebufferTexture3D = downcallSafe(load.invoke("glFramebufferTexture3D"), );
        glFramebufferTextureLayer = downcallSafe(load.invoke("glFramebufferTextureLayer"), );
        glGenFramebuffers = downcallSafe(load.invoke("glGenFramebuffers"), );
        glGenRenderbuffers = downcallSafe(load.invoke("glGenRenderbuffers"), );
        glGenVertexArrays = downcallSafe(load.invoke("glGenVertexArrays"), );
        glGenerateMipmap = downcallSafe(load.invoke("glGenerateMipmap"), );
        glGetBooleani_v = downcallSafe(load.invoke("glGetBooleani_v"), );
        glGetFragDataLocation = downcallSafe(load.invoke("glGetFragDataLocation"), );
        glGetFramebufferAttachmentParameteriv = downcallSafe(load.invoke("glGetFramebufferAttachmentParameteriv"), );
        glGetIntegeri_v = downcallSafe(load.invoke("glGetIntegeri_v"), );
        glGetRenderbufferParameteriv = downcallSafe(load.invoke("glGetRenderbufferParameteriv"), );
        glGetStringi = downcallSafe(load.invoke("glGetStringi"), );
        glGetTexParameterIiv = downcallSafe(load.invoke("glGetTexParameterIiv"), );
        glGetTexParameterIuiv = downcallSafe(load.invoke("glGetTexParameterIuiv"), );
        glGetTransformFeedbackVarying = downcallSafe(load.invoke("glGetTransformFeedbackVarying"), );
        glGetUniformuiv = downcallSafe(load.invoke("glGetUniformuiv"), );
        glGetVertexAttribIiv = downcallSafe(load.invoke("glGetVertexAttribIiv"), );
        glGetVertexAttribIuiv = downcallSafe(load.invoke("glGetVertexAttribIuiv"), );
        glIsEnabledi = downcallSafe(load.invoke("glIsEnabledi"), );
        glIsFramebuffer = downcallSafe(load.invoke("glIsFramebuffer"), );
        glIsRenderbuffer = downcallSafe(load.invoke("glIsRenderbuffer"), );
        glIsVertexArray = downcallSafe(load.invoke("glIsVertexArray"), );
        glMapBufferRange = downcallSafe(load.invoke("glMapBufferRange"), );
        glRenderbufferStorage = downcallSafe(load.invoke("glRenderbufferStorage"), );
        glRenderbufferStorageMultisample = downcallSafe(load.invoke("glRenderbufferStorageMultisample"), );
        glTexParameterIiv = downcallSafe(load.invoke("glTexParameterIiv"), );
        glTexParameterIuiv = downcallSafe(load.invoke("glTexParameterIuiv"), );
        glTransformFeedbackVaryings = downcallSafe(load.invoke("glTransformFeedbackVaryings"), );
        glUniform1ui = downcallSafe(load.invoke("glUniform1ui"), );
        glUniform1uiv = downcallSafe(load.invoke("glUniform1uiv"), );
        glUniform2ui = downcallSafe(load.invoke("glUniform2ui"), );
        glUniform2uiv = downcallSafe(load.invoke("glUniform2uiv"), );
        glUniform3ui = downcallSafe(load.invoke("glUniform3ui"), );
        glUniform3uiv = downcallSafe(load.invoke("glUniform3uiv"), );
        glUniform4ui = downcallSafe(load.invoke("glUniform4ui"), );
        glUniform4uiv = downcallSafe(load.invoke("glUniform4uiv"), );
        glVertexAttribI1i = downcallSafe(load.invoke("glVertexAttribI1i"), );
        glVertexAttribI1iv = downcallSafe(load.invoke("glVertexAttribI1iv"), );
        glVertexAttribI1ui = downcallSafe(load.invoke("glVertexAttribI1ui"), );
        glVertexAttribI1uiv = downcallSafe(load.invoke("glVertexAttribI1uiv"), );
        glVertexAttribI2i = downcallSafe(load.invoke("glVertexAttribI2i"), );
        glVertexAttribI2iv = downcallSafe(load.invoke("glVertexAttribI2iv"), );
        glVertexAttribI2ui = downcallSafe(load.invoke("glVertexAttribI2ui"), );
        glVertexAttribI2uiv = downcallSafe(load.invoke("glVertexAttribI2uiv"), );
        glVertexAttribI3i = downcallSafe(load.invoke("glVertexAttribI3i"), );
        glVertexAttribI3iv = downcallSafe(load.invoke("glVertexAttribI3iv"), );
        glVertexAttribI3ui = downcallSafe(load.invoke("glVertexAttribI3ui"), );
        glVertexAttribI3uiv = downcallSafe(load.invoke("glVertexAttribI3uiv"), );
        glVertexAttribI4bv = downcallSafe(load.invoke("glVertexAttribI4bv"), );
        glVertexAttribI4i = downcallSafe(load.invoke("glVertexAttribI4i"), );
        glVertexAttribI4iv = downcallSafe(load.invoke("glVertexAttribI4iv"), );
        glVertexAttribI4sv = downcallSafe(load.invoke("glVertexAttribI4sv"), );
        glVertexAttribI4ubv = downcallSafe(load.invoke("glVertexAttribI4ubv"), );
        glVertexAttribI4ui = downcallSafe(load.invoke("glVertexAttribI4ui"), );
        glVertexAttribI4uiv = downcallSafe(load.invoke("glVertexAttribI4uiv"), );
        glVertexAttribI4usv = downcallSafe(load.invoke("glVertexAttribI4usv"), );
        glVertexAttribIPointer = downcallSafe(load.invoke("glVertexAttribIPointer"), );
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
}

package org.overrun.glib.gl;

import org.jetbrains.annotations.Nullable;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemorySession;
import java.lang.invoke.MethodHandle;

import static org.overrun.glib.gl.GL.*;

/**
 * The OpenGL 2.0 forward compatible functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GL20C extends GL15C {
    @Nullable
    public static MethodHandle
        glAttachShader,
        glBindAttribLocation, glBlendEquationSeparate,
        glCompileShader,
        glCreateProgram, glCreateShader,
        glDeleteProgram, glDeleteShader,
        glDetachShader, glDisableVertexAttribArray,
        glDrawBuffers,
        glEnableVertexAttribArray,
        glGetActiveAttrib, glGetActiveUniform,
        glGetAttachedShaders, glGetAttribLocation,
        glGetProgramInfoLog, glGetProgramiv,
        glGetShaderInfoLog, glGetShaderSource, glGetShaderiv,
        glGetUniformLocation, glGetUniformfv, glGetUniformiv,
        glGetVertexAttribPointerv, glGetVertexAttribdv,
        glGetVertexAttribfv, glGetVertexAttribiv,
        glIsProgram, glIsShader,
        glLinkProgram,
        glShaderSource,
        glStencilFuncSeparate, glStencilMaskSeparate, glStencilOpSeparate,
        glUniform1f, glUniform1fv,
        glUniform1i, glUniform1iv,
        glUniform2f, glUniform2fv,
        glUniform2i, glUniform2iv,
        glUniform3f, glUniform3fv,
        glUniform3i, glUniform3iv,
        glUniform4f, glUniform4fv,
        glUniform4i, glUniform4iv,
        glUniformMatrix2fv, glUniformMatrix3fv, glUniformMatrix4fv,
        glUseProgram,
        glValidateProgram,
        glVertexAttrib1d, glVertexAttrib1dv,
        glVertexAttrib1f, glVertexAttrib1fv,
        glVertexAttrib1s, glVertexAttrib1sv,
        glVertexAttrib2d, glVertexAttrib2dv,
        glVertexAttrib2f, glVertexAttrib2fv,
        glVertexAttrib2s, glVertexAttrib2sv,
        glVertexAttrib3d, glVertexAttrib3dv,
        glVertexAttrib3f, glVertexAttrib3fv,
        glVertexAttrib3s, glVertexAttrib3sv,
        glVertexAttrib4Nbv, glVertexAttrib4Niv, glVertexAttrib4Nsv,
        glVertexAttrib4Nub, glVertexAttrib4Nubv,
        glVertexAttrib4Nuiv, glVertexAttrib4Nusv, glVertexAttrib4bv,
        glVertexAttrib4d, glVertexAttrib4dv,
        glVertexAttrib4f, glVertexAttrib4fv, glVertexAttrib4iv,
        glVertexAttrib4s, glVertexAttrib4sv,
        glVertexAttrib4ubv, glVertexAttrib4uiv, glVertexAttrib4usv,
        glVertexAttribPointer;

    static void load(GLLoadFunc load) {
        if (!Ver20) return;
        glAttachShader = downcallSafe(load.invoke("glAttachShader"), dIIV);
        glBindAttribLocation = downcallSafe(load.invoke("glBindAttribLocation"), dIIPV);
        glBlendEquationSeparate = downcallSafe(load.invoke("glBlendEquationSeparate"), dIIV);
        glCompileShader = downcallSafe(load.invoke("glCompileShader"), dIV);
        glCreateProgram = downcallSafe(load.invoke("glCreateProgram"), );
        glCreateShader = downcallSafe(load.invoke("glCreateShader"), );
        glDeleteProgram = downcallSafe(load.invoke("glDeleteProgram"), );
        glDeleteShader = downcallSafe(load.invoke("glDeleteShader"), );
        glDetachShader = downcallSafe(load.invoke("glDetachShader"), );
        glDisableVertexAttribArray = downcallSafe(load.invoke("glDisableVertexAttribArray"), );
        glDrawBuffers = downcallSafe(load.invoke("glDrawBuffers"), );
        glEnableVertexAttribArray = downcallSafe(load.invoke("glEnableVertexAttribArray"), );
        glGetActiveAttrib = downcallSafe(load.invoke("glGetActiveAttrib"), );
        glGetActiveUniform = downcallSafe(load.invoke("glGetActiveUniform"), );
        glGetAttachedShaders = downcallSafe(load.invoke("glGetAttachedShaders"), );
        glGetAttribLocation = downcallSafe(load.invoke("glGetAttribLocation"), );
        glGetProgramInfoLog = downcallSafe(load.invoke("glGetProgramInfoLog"), );
        glGetProgramiv = downcallSafe(load.invoke("glGetProgramiv"), );
        glGetShaderInfoLog = downcallSafe(load.invoke("glGetShaderInfoLog"), );
        glGetShaderSource = downcallSafe(load.invoke("glGetShaderSource"), );
        glGetShaderiv = downcallSafe(load.invoke("glGetShaderiv"), );
        glGetUniformLocation = downcallSafe(load.invoke("glGetUniformLocation"), );
        glGetUniformfv = downcallSafe(load.invoke("glGetUniformfv"), );
        glGetUniformiv = downcallSafe(load.invoke("glGetUniformiv"), );
        glGetVertexAttribPointerv = downcallSafe(load.invoke("glGetVertexAttribPointerv"), );
        glGetVertexAttribdv = downcallSafe(load.invoke("glGetVertexAttribdv"), );
        glGetVertexAttribfv = downcallSafe(load.invoke("glGetVertexAttribfv"), );
        glGetVertexAttribiv = downcallSafe(load.invoke("glGetVertexAttribiv"), );
        glIsProgram = downcallSafe(load.invoke("glIsProgram"), );
        glIsShader = downcallSafe(load.invoke("glIsShader"), );
        glLinkProgram = downcallSafe(load.invoke("glLinkProgram"), );
        glShaderSource = downcallSafe(load.invoke("glShaderSource"), );
        glStencilFuncSeparate = downcallSafe(load.invoke("glStencilFuncSeparate"), );
        glStencilMaskSeparate = downcallSafe(load.invoke("glStencilMaskSeparate"), );
        glStencilOpSeparate = downcallSafe(load.invoke("glStencilOpSeparate"), );
        glUniform1f = downcallSafe(load.invoke("glUniform1f"), );
        glUniform1fv = downcallSafe(load.invoke("glUniform1fv"), );
        glUniform1i = downcallSafe(load.invoke("glUniform1i"), );
        glUniform1iv = downcallSafe(load.invoke("glUniform1iv"), );
        glUniform2f = downcallSafe(load.invoke("glUniform2f"), );
        glUniform2fv = downcallSafe(load.invoke("glUniform2fv"), );
        glUniform2i = downcallSafe(load.invoke("glUniform2i"), );
        glUniform2iv = downcallSafe(load.invoke("glUniform2iv"), );
        glUniform3f = downcallSafe(load.invoke("glUniform3f"), );
        glUniform3fv = downcallSafe(load.invoke("glUniform3fv"), );
        glUniform3i = downcallSafe(load.invoke("glUniform3i"), );
        glUniform3iv = downcallSafe(load.invoke("glUniform3iv"), );
        glUniform4f = downcallSafe(load.invoke("glUniform4f"), );
        glUniform4fv = downcallSafe(load.invoke("glUniform4fv"), );
        glUniform4i = downcallSafe(load.invoke("glUniform4i"), );
        glUniform4iv = downcallSafe(load.invoke("glUniform4iv"), );
        glUniformMatrix2fv = downcallSafe(load.invoke("glUniformMatrix2fv"), );
        glUniformMatrix3fv = downcallSafe(load.invoke("glUniformMatrix3fv"), );
        glUniformMatrix4fv = downcallSafe(load.invoke("glUniformMatrix4fv"), );
        glUseProgram = downcallSafe(load.invoke("glUseProgram"), );
        glValidateProgram = downcallSafe(load.invoke("glValidateProgram"), );
        glVertexAttrib1d = downcallSafe(load.invoke("glVertexAttrib1d"), );
        glVertexAttrib1dv = downcallSafe(load.invoke("glVertexAttrib1dv"), );
        glVertexAttrib1f = downcallSafe(load.invoke("glVertexAttrib1f"), );
        glVertexAttrib1fv = downcallSafe(load.invoke("glVertexAttrib1fv"), );
        glVertexAttrib1s = downcallSafe(load.invoke("glVertexAttrib1s"), );
        glVertexAttrib1sv = downcallSafe(load.invoke("glVertexAttrib1sv"), );
        glVertexAttrib2d = downcallSafe(load.invoke("glVertexAttrib2d"), );
        glVertexAttrib2dv = downcallSafe(load.invoke("glVertexAttrib2dv"), );
        glVertexAttrib2f = downcallSafe(load.invoke("glVertexAttrib2f"), );
        glVertexAttrib2fv = downcallSafe(load.invoke("glVertexAttrib2fv"), );
        glVertexAttrib2s = downcallSafe(load.invoke("glVertexAttrib2s"), );
        glVertexAttrib2sv = downcallSafe(load.invoke("glVertexAttrib2sv"), );
        glVertexAttrib3d = downcallSafe(load.invoke("glVertexAttrib3d"), );
        glVertexAttrib3dv = downcallSafe(load.invoke("glVertexAttrib3dv"), );
        glVertexAttrib3f = downcallSafe(load.invoke("glVertexAttrib3f"), );
        glVertexAttrib3fv = downcallSafe(load.invoke("glVertexAttrib3fv"), );
        glVertexAttrib3s = downcallSafe(load.invoke("glVertexAttrib3s"), );
        glVertexAttrib3sv = downcallSafe(load.invoke("glVertexAttrib3sv"), );
        glVertexAttrib4Nbv = downcallSafe(load.invoke("glVertexAttrib4Nbv"), );
        glVertexAttrib4Niv = downcallSafe(load.invoke("glVertexAttrib4Niv"), );
        glVertexAttrib4Nsv = downcallSafe(load.invoke("glVertexAttrib4Nsv"), );
        glVertexAttrib4Nub = downcallSafe(load.invoke("glVertexAttrib4Nub"), );
        glVertexAttrib4Nubv = downcallSafe(load.invoke("glVertexAttrib4Nubv"), );
        glVertexAttrib4Nuiv = downcallSafe(load.invoke("glVertexAttrib4Nuiv"), );
        glVertexAttrib4Nusv = downcallSafe(load.invoke("glVertexAttrib4Nusv"), );
        glVertexAttrib4bv = downcallSafe(load.invoke("glVertexAttrib4bv"), );
        glVertexAttrib4d = downcallSafe(load.invoke("glVertexAttrib4d"), );
        glVertexAttrib4dv = downcallSafe(load.invoke("glVertexAttrib4dv"), );
        glVertexAttrib4f = downcallSafe(load.invoke("glVertexAttrib4f"), );
        glVertexAttrib4fv = downcallSafe(load.invoke("glVertexAttrib4fv"), );
        glVertexAttrib4iv = downcallSafe(load.invoke("glVertexAttrib4iv"), );
        glVertexAttrib4s = downcallSafe(load.invoke("glVertexAttrib4s"), );
        glVertexAttrib4sv = downcallSafe(load.invoke("glVertexAttrib4sv"), );
        glVertexAttrib4ubv = downcallSafe(load.invoke("glVertexAttrib4ubv"), );
        glVertexAttrib4uiv = downcallSafe(load.invoke("glVertexAttrib4uiv"), );
        glVertexAttrib4usv = downcallSafe(load.invoke("glVertexAttrib4usv"), );
        glVertexAttribPointer = downcallSafe(load.invoke("glVertexAttribPointer"), );
    }

    public static void attachShader(int program, int shader) {
        try {
            check(glAttachShader).invoke(program, shader);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void bindAttribLocation(int program, int index, Addressable name) {
        try {
            check(glBindAttribLocation).invoke(program, index, name);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void bindAttribLocation(int program, int index, String name) {
        try (var session = MemorySession.openShared()) {
            bindAttribLocation(program, index, session.allocateUtf8String(name));
        }
    }

    public static void blendEquationSeparate(int modeRGB, int modeAlpha) {
        try {
            check(glBlendEquationSeparate).invoke(modeRGB, modeAlpha);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void compileShader(int shader) {
        try {
            check(glCompileShader).invoke(shader);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

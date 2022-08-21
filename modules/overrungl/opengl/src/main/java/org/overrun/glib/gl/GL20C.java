package org.overrun.glib.gl;

import org.jetbrains.annotations.Nullable;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.gl.GL.*;

/**
 * The OpenGL 2.0 forward compatible functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL20C extends GL15C permits GL21C {
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

    static boolean isSupported() {
        return checkAll(glAttachShader, glBindAttribLocation, glBlendEquationSeparate,
            glCompileShader, glCreateProgram, glCreateShader, glDeleteProgram, glDeleteShader,
            glDetachShader, glDisableVertexAttribArray, glDrawBuffers, glEnableVertexAttribArray,
            glGetActiveAttrib, glGetActiveUniform, glGetAttachedShaders, glGetAttribLocation,
            glGetProgramInfoLog, glGetProgramiv, glGetShaderInfoLog, glGetShaderSource,
            glGetShaderiv, glGetUniformLocation, glGetUniformfv, glGetUniformiv,
            glGetVertexAttribPointerv, glGetVertexAttribdv, glGetVertexAttribfv,
            glGetVertexAttribiv, glIsProgram, glIsShader, glLinkProgram, glShaderSource,
            glStencilFuncSeparate, glStencilMaskSeparate, glStencilOpSeparate, glUniform1f,
            glUniform1fv, glUniform1i, glUniform1iv, glUniform2f, glUniform2fv, glUniform2i,
            glUniform2iv, glUniform3f, glUniform3fv, glUniform3i, glUniform3iv, glUniform4f,
            glUniform4fv, glUniform4i, glUniform4iv, glUniformMatrix2fv, glUniformMatrix3fv,
            glUniformMatrix4fv, glUseProgram, glValidateProgram, glVertexAttrib1d,
            glVertexAttrib1dv, glVertexAttrib1f, glVertexAttrib1fv, glVertexAttrib1s,
            glVertexAttrib1sv, glVertexAttrib2d, glVertexAttrib2dv, glVertexAttrib2f,
            glVertexAttrib2fv, glVertexAttrib2s, glVertexAttrib2sv, glVertexAttrib3d,
            glVertexAttrib3dv, glVertexAttrib3f, glVertexAttrib3fv, glVertexAttrib3s,
            glVertexAttrib3sv, glVertexAttrib4Nbv, glVertexAttrib4Niv, glVertexAttrib4Nsv,
            glVertexAttrib4Nub, glVertexAttrib4Nubv, glVertexAttrib4Nuiv, glVertexAttrib4Nusv,
            glVertexAttrib4bv, glVertexAttrib4d, glVertexAttrib4dv, glVertexAttrib4f,
            glVertexAttrib4fv, glVertexAttrib4iv, glVertexAttrib4s, glVertexAttrib4sv,
            glVertexAttrib4ubv, glVertexAttrib4uiv, glVertexAttrib4usv, glVertexAttribPointer);
    }

    static void load(GLLoadFunc load) {
        glAttachShader = downcallSafe(load.invoke("glAttachShader"), dIIV);
        glBindAttribLocation = downcallSafe(load.invoke("glBindAttribLocation"), dIIPV);
        glBlendEquationSeparate = downcallSafe(load.invoke("glBlendEquationSeparate"), dIIV);
        glCompileShader = downcallSafe(load.invoke("glCompileShader"), dIV);
        glCreateProgram = downcallSafe(load.invoke("glCreateProgram"), dI);
        glCreateShader = downcallSafe(load.invoke("glCreateShader"), dII);
        glDeleteProgram = downcallSafe(load.invoke("glDeleteProgram"), dIV);
        glDeleteShader = downcallSafe(load.invoke("glDeleteShader"), dIV);
        glDetachShader = downcallSafe(load.invoke("glDetachShader"), dIIV);
        glDisableVertexAttribArray = downcallSafe(load.invoke("glDisableVertexAttribArray"), dIV);
        glDrawBuffers = downcallSafe(load.invoke("glDrawBuffers"), dIPV);
        glEnableVertexAttribArray = downcallSafe(load.invoke("glEnableVertexAttribArray"), dIV);
        glGetActiveAttrib = downcallSafe(load.invoke("glGetActiveAttrib"), dIIIPPPPV);
        glGetActiveUniform = downcallSafe(load.invoke("glGetActiveUniform"), dIIIPPPPV);
        glGetAttachedShaders = downcallSafe(load.invoke("glGetAttachedShaders"), dIIPPV);
        glGetAttribLocation = downcallSafe(load.invoke("glGetAttribLocation"), dIPI);
        glGetProgramInfoLog = downcallSafe(load.invoke("glGetProgramInfoLog"), dIIPPV);
        glGetProgramiv = downcallSafe(load.invoke("glGetProgramiv"), dIIPV);
        glGetShaderInfoLog = downcallSafe(load.invoke("glGetShaderInfoLog"), dIIPPV);
        glGetShaderSource = downcallSafe(load.invoke("glGetShaderSource"), dIIPV);
        glGetShaderiv = downcallSafe(load.invoke("glGetShaderiv"), dIIPV);
        glGetUniformLocation = downcallSafe(load.invoke("glGetUniformLocation"), dIPI);
        glGetUniformfv = downcallSafe(load.invoke("glGetUniformfv"), dIIPV);
        glGetUniformiv = downcallSafe(load.invoke("glGetUniformiv"), dIIPV);
        glGetVertexAttribPointerv = downcallSafe(load.invoke("glGetVertexAttribPointerv"), dIIPV);
        glGetVertexAttribdv = downcallSafe(load.invoke("glGetVertexAttribdv"), dIIPV);
        glGetVertexAttribfv = downcallSafe(load.invoke("glGetVertexAttribfv"), dIIPV);
        glGetVertexAttribiv = downcallSafe(load.invoke("glGetVertexAttribiv"), dIIPV);
        glIsProgram = downcallSafe(load.invoke("glIsProgram"), dIZ);
        glIsShader = downcallSafe(load.invoke("glIsShader"), dIZ);
        glLinkProgram = downcallSafe(load.invoke("glLinkProgram"), dIV);
        glShaderSource = downcallSafe(load.invoke("glShaderSource"), dIIPPV);
        glStencilFuncSeparate = downcallSafe(load.invoke("glStencilFuncSeparate"), dIIIIV);
        glStencilMaskSeparate = downcallSafe(load.invoke("glStencilMaskSeparate"), dIIV);
        glStencilOpSeparate = downcallSafe(load.invoke("glStencilOpSeparate"), dIIIIV);
        glUniform1f = downcallSafe(load.invoke("glUniform1f"), dIFV);
        glUniform1fv = downcallSafe(load.invoke("glUniform1fv"), dIIPV);
        glUniform1i = downcallSafe(load.invoke("glUniform1i"), dIIV);
        glUniform1iv = downcallSafe(load.invoke("glUniform1iv"), dIIPV);
        glUniform2f = downcallSafe(load.invoke("glUniform2f"), dIFFV);
        glUniform2fv = downcallSafe(load.invoke("glUniform2fv"), dIIPV);
        glUniform2i = downcallSafe(load.invoke("glUniform2i"), dIIIV);
        glUniform2iv = downcallSafe(load.invoke("glUniform2iv"), dIIPV);
        glUniform3f = downcallSafe(load.invoke("glUniform3f"), dIFFFV);
        glUniform3fv = downcallSafe(load.invoke("glUniform3fv"), dIIPV);
        glUniform3i = downcallSafe(load.invoke("glUniform3i"), dIIIIV);
        glUniform3iv = downcallSafe(load.invoke("glUniform3iv"), dIIPV);
        glUniform4f = downcallSafe(load.invoke("glUniform4f"), dIFFFFV);
        glUniform4fv = downcallSafe(load.invoke("glUniform4fv"), dIIPV);
        glUniform4i = downcallSafe(load.invoke("glUniform4i"), dIIIIIV);
        glUniform4iv = downcallSafe(load.invoke("glUniform4iv"), dIIPV);
        glUniformMatrix2fv = downcallSafe(load.invoke("glUniformMatrix2fv"), dIIZPV);
        glUniformMatrix3fv = downcallSafe(load.invoke("glUniformMatrix3fv"), dIIZPV);
        glUniformMatrix4fv = downcallSafe(load.invoke("glUniformMatrix4fv"), dIIZPV);
        glUseProgram = downcallSafe(load.invoke("glUseProgram"), dIV);
        glValidateProgram = downcallSafe(load.invoke("glValidateProgram"), dIV);
        glVertexAttrib1d = downcallSafe(load.invoke("glVertexAttrib1d"), dIDV);
        glVertexAttrib1dv = downcallSafe(load.invoke("glVertexAttrib1dv"), dIPV);
        glVertexAttrib1f = downcallSafe(load.invoke("glVertexAttrib1f"), dIFV);
        glVertexAttrib1fv = downcallSafe(load.invoke("glVertexAttrib1fv"), dIPV);
        glVertexAttrib1s = downcallSafe(load.invoke("glVertexAttrib1s"), dISV);
        glVertexAttrib1sv = downcallSafe(load.invoke("glVertexAttrib1sv"), dIPV);
        glVertexAttrib2d = downcallSafe(load.invoke("glVertexAttrib2d"), dIDDV);
        glVertexAttrib2dv = downcallSafe(load.invoke("glVertexAttrib2dv"), dIPV);
        glVertexAttrib2f = downcallSafe(load.invoke("glVertexAttrib2f"), dIFFV);
        glVertexAttrib2fv = downcallSafe(load.invoke("glVertexAttrib2fv"), dIPV);
        glVertexAttrib2s = downcallSafe(load.invoke("glVertexAttrib2s"), dISSV);
        glVertexAttrib2sv = downcallSafe(load.invoke("glVertexAttrib2sv"), dIPV);
        glVertexAttrib3d = downcallSafe(load.invoke("glVertexAttrib3d"), dIDDDV);
        glVertexAttrib3dv = downcallSafe(load.invoke("glVertexAttrib3dv"), dIPV);
        glVertexAttrib3f = downcallSafe(load.invoke("glVertexAttrib3f"), dIFFFV);
        glVertexAttrib3fv = downcallSafe(load.invoke("glVertexAttrib3fv"), dIPV);
        glVertexAttrib3s = downcallSafe(load.invoke("glVertexAttrib3s"), dISSSV);
        glVertexAttrib3sv = downcallSafe(load.invoke("glVertexAttrib3sv"), dIPV);
        glVertexAttrib4Nbv = downcallSafe(load.invoke("glVertexAttrib4Nbv"), dIPV);
        glVertexAttrib4Niv = downcallSafe(load.invoke("glVertexAttrib4Niv"), dIPV);
        glVertexAttrib4Nsv = downcallSafe(load.invoke("glVertexAttrib4Nsv"), dIPV);
        glVertexAttrib4Nub = downcallSafe(load.invoke("glVertexAttrib4Nub"), dIBBBBV);
        glVertexAttrib4Nubv = downcallSafe(load.invoke("glVertexAttrib4Nubv"), dIPV);
        glVertexAttrib4Nuiv = downcallSafe(load.invoke("glVertexAttrib4Nuiv"), dIPV);
        glVertexAttrib4Nusv = downcallSafe(load.invoke("glVertexAttrib4Nusv"), dIPV);
        glVertexAttrib4bv = downcallSafe(load.invoke("glVertexAttrib4bv"), dIPV);
        glVertexAttrib4d = downcallSafe(load.invoke("glVertexAttrib4d"), dIDDDV);
        glVertexAttrib4dv = downcallSafe(load.invoke("glVertexAttrib4dv"), dIPV);
        glVertexAttrib4f = downcallSafe(load.invoke("glVertexAttrib4f"), dIFFFV);
        glVertexAttrib4fv = downcallSafe(load.invoke("glVertexAttrib4fv"), dIPV);
        glVertexAttrib4iv = downcallSafe(load.invoke("glVertexAttrib4iv"), dIPV);
        glVertexAttrib4s = downcallSafe(load.invoke("glVertexAttrib4s"), dISSSV);
        glVertexAttrib4sv = downcallSafe(load.invoke("glVertexAttrib4sv"), dIPV);
        glVertexAttrib4ubv = downcallSafe(load.invoke("glVertexAttrib4ubv"), dIPV);
        glVertexAttrib4uiv = downcallSafe(load.invoke("glVertexAttrib4uiv"), dIPV);
        glVertexAttrib4usv = downcallSafe(load.invoke("glVertexAttrib4usv"), dIPV);
        glVertexAttribPointer = downcallSafe(load.invoke("glVertexAttribPointer"), dIIIZIPV);
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

    public static int createProgram() {
        try {
            return (int) check(glCreateProgram).invoke();
        } catch (Throwable e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int createShader(int type) {
        try {
            return (int) check(glCreateShader).invoke(type);
        } catch (Throwable e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static void deleteProgram(int program) {
        try {
            check(glDeleteProgram).invoke(program);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void deleteShader(int shader) {
        try {
            check(glDeleteShader).invoke(shader);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void detachShader(int program, int shader) {
        try {
            check(glDetachShader).invoke(program, shader);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void disableVertexAttribArray(int index) {
        try {
            check(glDisableVertexAttribArray).invoke(index);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void drawBuffers(int n, Addressable bufs) {
        try {
            check(glDrawBuffers).invoke(n, bufs);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void drawBuffers(int[] bufs) {
        try (var session = MemorySession.openShared()) {
            drawBuffers(bufs.length, session.allocateArray(JAVA_INT, bufs));
        }
    }

    public static void enableVertexAttribArray(int index) {
        try {
            check(glEnableVertexAttribArray).invoke(index);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getActiveAttrib(int program, int index, int bufSize, Addressable length, Addressable size, Addressable type, Addressable name) {
        try {
            check(glGetActiveAttrib).invoke(program, index, bufSize, length, size, type, name);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getActiveAttrib(int program, int index, int bufSize, int @Nullable [] length, int[] size, int[] type, String[] name) {
        try (var session = MemorySession.openShared()) {
            var pLen = length != null ? session.allocate(JAVA_INT) : MemoryAddress.NULL;
            var pSz = session.allocate(JAVA_INT);
            var pType = session.allocate(JAVA_INT);
            var pName = session.allocateArray(JAVA_BYTE, bufSize);
            getActiveAttrib(program, index, bufSize, pLen, pSz, pType, pName);
            if (length != null && length.length > 0) {
                length[0] = ((MemorySegment) pLen).get(JAVA_INT, 0L);
            }
            size[0] = pSz.get(JAVA_INT, 0L);
            type[0] = pType.get(JAVA_INT, 0L);
            name[0] = pName.getUtf8String(0L);
        }
    }

    public static void getActiveUniform(int program, int index, int bufSize, Addressable length, Addressable size, Addressable type, Addressable name) {
        try {
            check(glGetActiveUniform).invoke(program, index, bufSize, length, size, type, name);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getActiveUniform(int program, int index, int bufSize, int @Nullable [] length, int[] size, int[] type, String[] name) {
        try (var session = MemorySession.openShared()) {
            var pLen = length != null ? session.allocate(JAVA_INT) : MemoryAddress.NULL;
            var pSz = session.allocate(JAVA_INT);
            var pType = session.allocate(JAVA_INT);
            var pName = session.allocateArray(JAVA_BYTE, bufSize);
            getActiveUniform(program, index, bufSize, pLen, pSz, pType, pName);
            if (length != null && length.length > 0) {
                length[0] = ((MemorySegment) pLen).get(JAVA_INT, 0L);
            }
            size[0] = pSz.get(JAVA_INT, 0L);
            type[0] = pType.get(JAVA_INT, 0L);
            name[0] = pName.getUtf8String(0L);
        }
    }

    public static void getAttachedShaders(int program, int maxCount, Addressable count, Addressable shaders) {
        try {
            check(glGetAttachedShaders).invoke(program, maxCount, count, shaders);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getAttachedShaders(int program, int @Nullable [] count, int[] shaders) {
        try (var session = MemorySession.openShared()) {
            var pCount = count != null ? session.allocate(JAVA_INT) : MemoryAddress.NULL;
            var pShaders = session.allocateArray(JAVA_INT, shaders.length);
            getAttachedShaders(program, shaders.length, pCount, pShaders);
            if (count != null && count.length > 0) {
                count[0] = ((MemorySegment) pCount).get(JAVA_INT, 0L);
            }
            for (int i = 0; i < shaders.length; i++) {
                shaders[i] = pShaders.getAtIndex(JAVA_INT, i);
            }
        }
    }

    public static int getAttribLocation(int program, Addressable name) {
        try {
            return (int) check(glGetAttribLocation).invoke(program, name);
        } catch (Throwable e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static int getAttribLocation(int program, String name) {
        try (var session = MemorySession.openShared()) {
            return getAttribLocation(program, session.allocateUtf8String(name));
        }
    }

    public static void getProgramInfoLog(int program, int bufSize, Addressable length, Addressable infoLog) {
        try {
            check(glGetProgramInfoLog).invoke(program, bufSize, length, infoLog);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getProgramInfoLog(int program, int bufSize, int @Nullable [] length, String[] infoLog) {
        infoLog[0] = getProgramInfoLog(program, bufSize, length);
    }

    public static String getProgramInfoLog(int program, int bufSize, int @Nullable [] length) {
        try (var session = MemorySession.openShared()) {
            var pLen = length != null ? session.allocate(JAVA_INT) : MemoryAddress.NULL;
            var pLog = session.allocateArray(JAVA_BYTE, bufSize);
            getProgramInfoLog(program, bufSize, pLen, pLog);
            if (length != null && length.length > 0) {
                length[0] = ((MemorySegment) pLen).get(JAVA_INT, 0L);
            }
            return pLog.getUtf8String(0L);
        }
    }

    public static String getProgramInfoLog(int program) {
        return getProgramInfoLog(program, getProgrami(program, GLConstC.GL_INFO_LOG_LENGTH), null);
    }

    public static void getProgramiv(int program, int pname, Addressable params) {
        try {
            check(glGetProgramiv).invoke(program, pname, params);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getProgramiv(int program, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, params.length);
            getProgramiv(program, pname, seg);
            for (int i = 0; i < params.length; i++) {
                params[i] = seg.getAtIndex(JAVA_INT, i);
            }
        }
    }

    public static int getProgrami(int program, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getProgramiv(program, pname, seg);
            return seg.get(JAVA_INT, 0L);
        }
    }

    public static void getShaderInfoLog(int shader, int bufSize, Addressable length, Addressable infoLog) {
        try {
            check(glGetShaderInfoLog).invoke(shader, bufSize, length, infoLog);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getShaderInfoLog(int shader, int bufSize, int @Nullable [] length, String[] infoLog) {
        infoLog[0] = getShaderInfoLog(shader, bufSize, length);
    }

    public static String getShaderInfoLog(int shader, int bufSize, int @Nullable [] length) {
        try (var session = MemorySession.openShared()) {
            var pLen = length != null ? session.allocate(JAVA_INT) : MemoryAddress.NULL;
            var pLog = session.allocateArray(JAVA_BYTE, bufSize);
            getShaderInfoLog(shader, bufSize, pLen, pLog);
            if (length != null && length.length > 0) {
                length[0] = ((MemorySegment) pLen).get(JAVA_INT, 0L);
            }
            return pLog.getUtf8String(0L);
        }
    }

    public static String getShaderInfoLog(int shader) {
        return getShaderInfoLog(shader, getShaderi(shader, GLConstC.GL_INFO_LOG_LENGTH), null);
    }

    public static void getShaderSource(int shader, int bufSize, Addressable length, Addressable source) {
        try {
            check(glGetShaderSource).invoke(shader, bufSize, length, source);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getShaderSource(int shader, int bufSize, int @Nullable [] length, String[] source) {
        source[0] = getShaderSource(shader, bufSize, length);
    }

    public static String getShaderSource(int shader, int bufSize, int @Nullable [] length) {
        try (var session = MemorySession.openShared()) {
            var pLen = length != null ? session.allocate(JAVA_INT) : MemoryAddress.NULL;
            var pSrc = session.allocateArray(JAVA_BYTE, bufSize);
            getShaderSource(shader, bufSize, pLen, pSrc);
            if (length != null && length.length > 0) {
                length[0] = ((MemorySegment) pLen).get(JAVA_INT, 0L);
            }
            return pSrc.getUtf8String(0L);
        }
    }

    public static String getShaderSource(int shader) {
        return getShaderSource(shader, getShaderi(shader, GLConstC.GL_SHADER_SOURCE_LENGTH), null);
    }

    public static void getShaderiv(int shader, int pname, Addressable params) {
        try {
            check(glGetShaderiv).invoke(shader, pname, params);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getShaderiv(int shader, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, params.length);
            getShaderiv(shader, pname, seg);
            for (int i = 0; i < params.length; i++) {
                params[i] = seg.getAtIndex(JAVA_INT, i);
            }
        }
    }

    public static int getShaderi(int shader, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getShaderiv(shader, pname, seg);
            return seg.get(JAVA_INT, 0L);
        }
    }

    public static int getUniformLocation(int program, Addressable name) {
        try {
            return (int) check(glGetUniformLocation).invoke(program, name);
        } catch (Throwable e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static int getUniformLocation(int program, String name) {
        try (var session = MemorySession.openShared()) {
            return getUniformLocation(program, session.allocateUtf8String(name));
        }
    }

    public static void getUniformfv(int program, int location, Addressable params) {
        try {
            check(glGetUniformfv).invoke(program, location, params);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getUniformfv(int program, int location, float[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, params.length);
            getUniformfv(program, location, seg);
            for (int i = 0; i < params.length; i++) {
                params[i] = seg.getAtIndex(JAVA_FLOAT, i);
            }
        }
    }

    public static float getUniformf(int program, int location) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_FLOAT);
            getUniformfv(program, location, seg);
            return seg.get(JAVA_FLOAT, 0L);
        }
    }

    public static void getUniformiv(int program, int location, Addressable params) {
        try {
            check(glGetUniformiv).invoke(program, location, params);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getUniformiv(int program, int location, int[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, params.length);
            getUniformiv(program, location, seg);
            for (int i = 0; i < params.length; i++) {
                params[i] = seg.getAtIndex(JAVA_INT, i);
            }
        }
    }

    public static int getUniformi(int program, int location) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getUniformiv(program, location, seg);
            return seg.get(JAVA_INT, 0L);
        }
    }

    public static void getVertexAttribPointerv(int index, int pname, Addressable pointer) {
        try {
            check(glGetVertexAttribPointerv).invoke(index, pname, pointer);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getVertexAttribPointerv(int index, int pname, byte[] pointer) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_BYTE, pointer.length);
            getVertexAttribPointerv(index, pname, seg);
            for (int i = 0; i < pointer.length; i++) {
                pointer[i] = seg.get(JAVA_BYTE, i);
            }
        }
    }

    public static void getVertexAttribPointerv(int index, int pname, short[] pointer) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_SHORT, pointer.length);
            getVertexAttribPointerv(index, pname, seg);
            for (int i = 0; i < pointer.length; i++) {
                pointer[i] = seg.getAtIndex(JAVA_SHORT, i);
            }
        }
    }

    public static void getVertexAttribPointerv(int index, int pname, int[] pointer) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, pointer.length);
            getVertexAttribPointerv(index, pname, seg);
            for (int i = 0; i < pointer.length; i++) {
                pointer[i] = seg.getAtIndex(JAVA_INT, i);
            }
        }
    }

    public static void getVertexAttribPointerv(int index, int pname, float[] pointer) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, pointer.length);
            getVertexAttribPointerv(index, pname, seg);
            for (int i = 0; i < pointer.length; i++) {
                pointer[i] = seg.getAtIndex(JAVA_FLOAT, i);
            }
        }
    }

    public static void getVertexAttribPointerv(int index, int pname, double[] pointer) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_DOUBLE, pointer.length);
            getVertexAttribPointerv(index, pname, seg);
            for (int i = 0; i < pointer.length; i++) {
                pointer[i] = seg.getAtIndex(JAVA_DOUBLE, i);
            }
        }
    }

    public static void getVertexAttribdv(int index, int pname, Addressable params) {
        try {
            check(glGetVertexAttribdv).invoke(index, pname, params);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getVertexAttribdv(int index, int pname, double[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_DOUBLE, params.length);
            getVertexAttribdv(index, pname, seg);
            for (int i = 0; i < params.length; i++) {
                params[i] = seg.getAtIndex(JAVA_DOUBLE, i);
            }
        }
    }

    public static double getVertexAttribd(int index, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_DOUBLE);
            getVertexAttribdv(index, pname, seg);
            return seg.get(JAVA_DOUBLE, 0L);
        }
    }

    public static void getVertexAttribfv(int index, int pname, Addressable params) {
        try {
            check(glGetVertexAttribfv).invoke(index, pname, params);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getVertexAttribfv(int index, int pname, float[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_FLOAT, params.length);
            getVertexAttribfv(index, pname, seg);
            for (int i = 0; i < params.length; i++) {
                params[i] = seg.getAtIndex(JAVA_FLOAT, i);
            }
        }
    }

    public static float getVertexAttribf(int index, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_FLOAT);
            getVertexAttribfv(index, pname, seg);
            return seg.get(JAVA_FLOAT, 0L);
        }
    }

    public static void getVertexAttribiv(int index, int pname, Addressable params) {
        try {
            check(glGetVertexAttribiv).invoke(index, pname, params);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getVertexAttribiv(int index, int pname, int[] params) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, params.length);
            getVertexAttribiv(index, pname, seg);
            for (int i = 0; i < params.length; i++) {
                params[i] = seg.getAtIndex(JAVA_INT, i);
            }
        }
    }

    public static int getVertexAttribi(int index, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getVertexAttribiv(index, pname, seg);
            return seg.get(JAVA_INT, 0L);
        }
    }

    public static boolean isProgram(int program) {
        try {
            return (boolean) check(glIsProgram).invoke(program);
        } catch (Throwable e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isShader(int shader) {
        try {
            return (boolean) check(glIsShader).invoke(shader);
        } catch (Throwable e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void linkProgram(int program) {
        try {
            check(glLinkProgram).invoke(program);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void shaderSource(int shader, int count, Addressable string, Addressable length) {
        try {
            check(glShaderSource).invoke(shader, count, string, length);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void shaderSource(int shader, String[] string, int[] length) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(ADDRESS, string.length);
            for (int i = 0; i < string.length; i++) {
                seg.setAtIndex(ADDRESS, i, session.allocateUtf8String(string[i]));
            }
            shaderSource(shader, Math.min(string.length, length.length), seg, session.allocateArray(JAVA_INT, length));
        }
    }

    public static void shaderSource(int shader, String[] string) {
        try (var session = MemorySession.openShared()) {
            var pStr = session.allocateArray(ADDRESS, string.length);
            var pLen = session.allocateArray(JAVA_INT, string.length);
            for (int i = 0; i < string.length; i++) {
                pStr.setAtIndex(ADDRESS, i, session.allocateUtf8String(string[i]));
                pLen.setAtIndex(JAVA_INT, i, string[i].length());
            }
            shaderSource(shader, string.length, pStr, pLen);
        }
    }

    public static void shaderSource(int shader, String string) {
        try (var session = MemorySession.openShared()) {
            shaderSource(shader, 1, session.allocate(ADDRESS, session.allocateUtf8String(string)), session.allocate(JAVA_INT, string.length()));
        }
    }

    public static void stencilFuncSeparate(int face, int func, int ref, int mask) {
        try {
            check(glStencilFuncSeparate).invoke(face, func, ref, mask);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void stencilMaskSeparate(int face, int mask) {
        try {
            check(glStencilMaskSeparate).invoke(face, mask);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void stencilOpSeparate(int face, int sfail, int dpfail, int dppass) {
        try {
            check(glStencilOpSeparate).invoke(face, sfail, dpfail, dppass);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniform1f(int location, float v0) {
        try {
            check(glUniform1f).invoke(location, v0);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniform1fv(int location, int count, Addressable value) {
        try {
            check(glUniform1fv).invoke(location, count, value);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniform1fv(int location, float[] value) {
        try (var session = MemorySession.openShared()) {
            uniform1fv(location, value.length, session.allocateArray(JAVA_FLOAT, value));
        }
    }

    public static void uniform1i(int location, int v0) {
        try {
            check(glUniform1i).invoke(location, v0);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniform1iv(int location, int count, Addressable value) {
        try {
            check(glUniform1iv).invoke(location, count, value);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniform1iv(int location, int[] value) {
        try (var session = MemorySession.openShared()) {
            uniform1iv(location, value.length, session.allocateArray(JAVA_INT, value));
        }
    }

    public static void uniform2f(int location, float v0, float v1) {
        try {
            check(glUniform2f).invoke(location, v0, v1);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniform2fv(int location, int count, Addressable value) {
        try {
            check(glUniform2fv).invoke(location, count, value);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniform2fv(int location, float[] value) {
        try (var session = MemorySession.openShared()) {
            uniform2fv(location, value.length, session.allocateArray(JAVA_FLOAT, value));
        }
    }

    public static void uniform2i(int location, int v0, int v1) {
        try {
            check(glUniform2i).invoke(location, v0, v1);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniform2iv(int location, int count, Addressable value) {
        try {
            check(glUniform2iv).invoke(location, count, value);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniform2iv(int location, int[] value) {
        try (var session = MemorySession.openShared()) {
            uniform2iv(location, value.length, session.allocateArray(JAVA_INT, value));
        }
    }

    public static void uniform3f(int location, float v0, float v1, float v2) {
        try {
            check(glUniform3f).invoke(location, v0, v1, v2);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniform3fv(int location, int count, Addressable value) {
        try {
            check(glUniform3fv).invoke(location, count, value);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniform3fv(int location, float[] value) {
        try (var session = MemorySession.openShared()) {
            uniform3fv(location, value.length, session.allocateArray(JAVA_FLOAT, value));
        }
    }

    public static void uniform3i(int location, int v0, int v1, int v2) {
        try {
            check(glUniform3i).invoke(location, v0, v1, v2);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniform3iv(int location, int count, Addressable value) {
        try {
            check(glUniform3iv).invoke(location, count, value);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniform3iv(int location, int[] value) {
        try (var session = MemorySession.openShared()) {
            uniform3iv(location, value.length, session.allocateArray(JAVA_INT, value));
        }
    }

    public static void uniform4f(int location, float v0, float v1, float v2, float v3) {
        try {
            check(glUniform4f).invoke(location, v0, v1, v2, v3);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniform4fv(int location, int count, Addressable value) {
        try {
            check(glUniform4fv).invoke(location, count, value);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniform4fv(int location, float[] value) {
        try (var session = MemorySession.openShared()) {
            uniform4fv(location, value.length, session.allocateArray(JAVA_FLOAT, value));
        }
    }

    public static void uniform4i(int location, int v0, int v1, int v2, int v3) {
        try {
            check(glUniform4i).invoke(location, v0, v1, v2, v3);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniform4iv(int location, int count, Addressable value) {
        try {
            check(glUniform4iv).invoke(location, count, value);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniform4iv(int location, int[] value) {
        try (var session = MemorySession.openShared()) {
            uniform4iv(location, value.length, session.allocateArray(JAVA_INT, value));
        }
    }

    public static void uniformMatrix2fv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix2fv).invoke(location, count, transpose, value);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniformMatrix2fv(int location, int count, boolean transpose, float[] value) {
        try (var session = MemorySession.openShared()) {
            uniformMatrix2fv(location, count, transpose, session.allocateArray(JAVA_FLOAT, value));
        }
    }

    public static void uniformMatrix2fv(int location, boolean transpose, float[] value) {
        uniformMatrix2fv(location, value.length >> 2, transpose, value);
    }

    public static void uniformMatrix3fv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix3fv).invoke(location, count, transpose, value);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniformMatrix3fv(int location, int count, boolean transpose, float[] value) {
        try (var session = MemorySession.openShared()) {
            uniformMatrix3fv(location, count, transpose, session.allocateArray(JAVA_FLOAT, value));
        }
    }

    public static void uniformMatrix3fv(int location, boolean transpose, float[] value) {
        uniformMatrix3fv(location, value.length / 9, transpose, value);
    }

    public static void uniformMatrix4fv(int location, int count, boolean transpose, Addressable value) {
        try {
            check(glUniformMatrix4fv).invoke(location, count, transpose, value);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void uniformMatrix4fv(int location, int count, boolean transpose, float[] value) {
        try (var session = MemorySession.openShared()) {
            uniformMatrix4fv(location, count, transpose, session.allocateArray(JAVA_FLOAT, value));
        }
    }

    public static void uniformMatrix4fv(int location, boolean transpose, float[] value) {
        uniformMatrix4fv(location, value.length >> 4, transpose, value);
    }

    public static void useProgram(int program) {
        try {
            check(glUseProgram).invoke(program);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void validateProgram(int program) {
        try {
            check(glValidateProgram).invoke(program);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib1d(int index, double x) {
        try {
            check(glVertexAttrib1d).invoke(index, x);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib1dv(int index, Addressable v) {
        try {
            check(glVertexAttrib1dv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib1dv(int index, double[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttrib1dv(index, session.allocateArray(JAVA_DOUBLE, v));
        }
    }

    public static void vertexAttrib1f(int index, float x) {
        try {
            check(glVertexAttrib1f).invoke(index, x);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib1fv(int index, Addressable v) {
        try {
            check(glVertexAttrib1fv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib1fv(int index, float[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttrib1fv(index, session.allocateArray(JAVA_FLOAT, v));
        }
    }

    public static void vertexAttrib1s(int index, short x) {
        try {
            check(glVertexAttrib1s).invoke(index, x);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib1sv(int index, Addressable v) {
        try {
            check(glVertexAttrib1sv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib1sv(int index, short[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttrib1sv(index, session.allocateArray(JAVA_SHORT, v));
        }
    }

    public static void vertexAttrib2d(int index, double x, double y) {
        try {
            check(glVertexAttrib2d).invoke(index, x, y);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib2dv(int index, Addressable v) {
        try {
            check(glVertexAttrib2dv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib2dv(int index, double[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttrib2dv(index, session.allocateArray(JAVA_DOUBLE, v));
        }
    }

    public static void vertexAttrib2f(int index, float x, float y) {
        try {
            check(glVertexAttrib2f).invoke(index, x, y);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib2fv(int index, Addressable v) {
        try {
            check(glVertexAttrib2fv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib2fv(int index, float[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttrib2fv(index, session.allocateArray(JAVA_FLOAT, v));
        }
    }

    public static void vertexAttrib2s(int index, short x, short y) {
        try {
            check(glVertexAttrib2s).invoke(index, x, y);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib2sv(int index, Addressable v) {
        try {
            check(glVertexAttrib2sv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib2sv(int index, short[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttrib2sv(index, session.allocateArray(JAVA_SHORT, v));
        }
    }

    public static void vertexAttrib3d(int index, double x, double y, double z) {
        try {
            check(glVertexAttrib3d).invoke(index, x, y, z);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib3dv(int index, Addressable v) {
        try {
            check(glVertexAttrib3dv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib3dv(int index, double[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttrib3dv(index, session.allocateArray(JAVA_DOUBLE, v));
        }
    }

    public static void vertexAttrib3f(int index, float x, float y, float z) {
        try {
            check(glVertexAttrib3f).invoke(index, x, y, z);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib3fv(int index, Addressable v) {
        try {
            check(glVertexAttrib3fv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib3fv(int index, float[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttrib3fv(index, session.allocateArray(JAVA_FLOAT, v));
        }
    }

    public static void vertexAttrib3s(int index, short x, short y, short z) {
        try {
            check(glVertexAttrib3s).invoke(index, x, y, z);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib3sv(int index, Addressable v) {
        try {
            check(glVertexAttrib3sv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib3sv(int index, short[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttrib3sv(index, session.allocateArray(JAVA_SHORT, v));
        }
    }

    public static void vertexAttrib4Nbv(int index, Addressable v) {
        try {
            check(glVertexAttrib4Nbv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib4Nbv(int index, byte[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttrib4Nbv(index, session.allocateArray(JAVA_BYTE, v));
        }
    }

    public static void vertexAttrib4Niv(int index, Addressable v) {
        try {
            check(glVertexAttrib4Niv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib4Niv(int index, int[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttrib4Niv(index, session.allocateArray(JAVA_INT, v));
        }
    }

    public static void vertexAttrib4Nsv(int index, Addressable v) {
        try {
            check(glVertexAttrib4Nsv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib4Nsv(int index, short[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttrib4Nsv(index, session.allocateArray(JAVA_SHORT, v));
        }
    }

    public static void vertexAttrib4Nub(int index, byte x, byte y, byte z, byte w) {
        try {
            check(glVertexAttrib4Nub).invoke(index, x, y, z, w);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib4Nubv(int index, Addressable v) {
        try {
            check(glVertexAttrib4Nubv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib4Nubv(int index, byte[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttrib4Nubv(index, session.allocateArray(JAVA_BYTE, v));
        }
    }

    public static void vertexAttrib4Nuiv(int index, Addressable v) {
        try {
            check(glVertexAttrib4Nuiv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib4Nuiv(int index, int[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttrib4Nuiv(index, session.allocateArray(JAVA_INT, v));
        }
    }

    public static void vertexAttrib4Nusv(int index, Addressable v) {
        try {
            check(glVertexAttrib4Nusv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib4Nusv(int index, short[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttrib4Nusv(index, session.allocateArray(JAVA_SHORT, v));
        }
    }

    public static void vertexAttrib4bv(int index, Addressable v) {
        try {
            check(glVertexAttrib4bv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib4bv(int index, byte[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttrib4bv(index, session.allocateArray(JAVA_BYTE, v));
        }
    }

    public static void vertexAttrib4d(int index, double x, double y, double z, double w) {
        try {
            check(glVertexAttrib4d).invoke(index, x, y, z, w);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib4dv(int index, Addressable v) {
        try {
            check(glVertexAttrib4dv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib4dv(int index, double[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttrib4dv(index, session.allocateArray(JAVA_DOUBLE, v));
        }
    }

    public static void vertexAttrib4f(int index, float x, float y, float z, float w) {
        try {
            check(glVertexAttrib4f).invoke(index, x, y, z, w);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib4fv(int index, Addressable v) {
        try {
            check(glVertexAttrib4fv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib4fv(int index, float[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttrib4fv(index, session.allocateArray(JAVA_FLOAT, v));
        }
    }

    public static void vertexAttrib4iv(int index, Addressable v) {
        try {
            check(glVertexAttrib4iv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib4iv(int index, int[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttrib4iv(index, session.allocateArray(JAVA_INT, v));
        }
    }

    public static void vertexAttrib4s(int index, short x, short y, short z, short w) {
        try {
            check(glVertexAttrib4s).invoke(index, x, y, z, w);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib4sv(int index, Addressable v) {
        try {
            check(glVertexAttrib4sv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib4sv(int index, short[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttrib4sv(index, session.allocateArray(JAVA_SHORT, v));
        }
    }

    public static void vertexAttrib4ubv(int index, Addressable v) {
        try {
            check(glVertexAttrib4ubv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib4ubv(int index, byte[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttrib4ubv(index, session.allocateArray(JAVA_BYTE, v));
        }
    }

    public static void vertexAttrib4uiv(int index, Addressable v) {
        try {
            check(glVertexAttrib4uiv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib4uiv(int index, int[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttrib4uiv(index, session.allocateArray(JAVA_INT, v));
        }
    }

    public static void vertexAttrib4usv(int index, Addressable v) {
        try {
            check(glVertexAttrib4usv).invoke(index, v);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttrib4usv(int index, short[] v) {
        try (var session = MemorySession.openShared()) {
            vertexAttrib4usv(index, session.allocateArray(JAVA_SHORT, v));
        }
    }

    public static void vertexAttribPointer(int index, int size, int type, boolean normalized, int stride, Addressable pointer) {
        try {
            check(glVertexAttribPointer).invoke(index, size, type, normalized, stride, pointer);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void vertexAttribPointer(int index, int size, int type, boolean normalized, int stride, byte[] pointer) {
        try (var session = MemorySession.openShared()) {
            vertexAttribPointer(index, size, type, normalized, stride, session.allocateArray(JAVA_BYTE, pointer));
        }
    }

    public static void vertexAttribPointer(int index, int size, int type, boolean normalized, int stride, short[] pointer) {
        try (var session = MemorySession.openShared()) {
            vertexAttribPointer(index, size, type, normalized, stride, session.allocateArray(JAVA_SHORT, pointer));
        }
    }

    public static void vertexAttribPointer(int index, int size, int type, boolean normalized, int stride, int[] pointer) {
        try (var session = MemorySession.openShared()) {
            vertexAttribPointer(index, size, type, normalized, stride, session.allocateArray(JAVA_INT, pointer));
        }
    }

    public static void vertexAttribPointer(int index, int size, int type, boolean normalized, int stride, float[] pointer) {
        try (var session = MemorySession.openShared()) {
            vertexAttribPointer(index, size, type, normalized, stride, session.allocateArray(JAVA_FLOAT, pointer));
        }
    }

    public static void vertexAttribPointer(int index, int size, int type, boolean normalized, int stride, double[] pointer) {
        try (var session = MemorySession.openShared()) {
            vertexAttribPointer(index, size, type, normalized, stride, session.allocateArray(JAVA_DOUBLE, pointer));
        }
    }
}

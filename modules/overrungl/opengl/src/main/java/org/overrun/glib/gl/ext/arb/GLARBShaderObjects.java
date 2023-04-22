// this file is auto-generated. DO NOT EDIT!
package org.overrun.glib.gl.ext.arb;

import org.overrun.glib.*;
import org.overrun.glib.gl.*;
import java.lang.foreign.MemorySegment;
import static org.overrun.glib.FunctionDescriptors.*;

/**
 * {@code GL_ARB_shader_objects}
 */
public final class GLARBShaderObjects {
    public static final int GL_FLOAT_VEC4_ARB = 0x8B52;
    public static final int GL_FLOAT_MAT3_ARB = 0x8B5B;
    public static final int GL_OBJECT_ATTACHED_OBJECTS_ARB = 0x8B85;
    public static final int GL_BOOL_ARB = 0x8B56;
    public static final int GL_SAMPLER_2D_RECT_SHADOW_ARB = 0x8B64;
    public static final int GL_OBJECT_LINK_STATUS_ARB = 0x8B82;
    public static final int GL_OBJECT_ACTIVE_UNIFORM_MAX_LENGTH_ARB = 0x8B87;
    public static final int GL_OBJECT_INFO_LOG_LENGTH_ARB = 0x8B84;
    public static final int GL_FLOAT_MAT2_ARB = 0x8B5A;
    public static final int GL_FLOAT_VEC3_ARB = 0x8B51;
    public static final int GL_BOOL_VEC4_ARB = 0x8B59;
    public static final int GL_OBJECT_TYPE_ARB = 0x8B4E;
    public static final int GL_OBJECT_SHADER_SOURCE_LENGTH_ARB = 0x8B88;
    public static final int GL_INT_VEC4_ARB = 0x8B55;
    public static final int GL_OBJECT_VALIDATE_STATUS_ARB = 0x8B83;
    public static final int GL_SAMPLER_1D_ARB = 0x8B5D;
    public static final int GL_FLOAT_VEC2_ARB = 0x8B50;
    public static final int GL_BOOL_VEC3_ARB = 0x8B58;
    public static final int GL_SAMPLER_2D_RECT_ARB = 0x8B63;
    public static final int GL_SAMPLER_2D_ARB = 0x8B5E;
    public static final int GL_SAMPLER_3D_ARB = 0x8B5F;
    public static final int GL_INT_VEC3_ARB = 0x8B54;
    public static final int GL_SAMPLER_CUBE_ARB = 0x8B60;
    public static final int GL_BOOL_VEC2_ARB = 0x8B57;
    public static final int GL_OBJECT_COMPILE_STATUS_ARB = 0x8B81;
    public static final int GL_SHADER_OBJECT_ARB = 0x8B48;
    public static final int GL_INT_VEC2_ARB = 0x8B53;
    public static final int GL_SAMPLER_1D_SHADOW_ARB = 0x8B61;
    public static final int GL_OBJECT_DELETE_STATUS_ARB = 0x8B80;
    public static final int GL_FLOAT_MAT4_ARB = 0x8B5C;
    public static final int GL_SAMPLER_2D_SHADOW_ARB = 0x8B62;
    public static final int GL_OBJECT_ACTIVE_UNIFORMS_ARB = 0x8B86;
    public static final int GL_PROGRAM_OBJECT_ARB = 0x8B40;
    public static final int GL_OBJECT_SUBTYPE_ARB = 0x8B4F;

    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_shader_objects) return;
        ext.glDeleteObjectARB = load.invoke("glDeleteObjectARB", IV);
        ext.glGetHandleARB = load.invoke("glGetHandleARB", II);
        ext.glDetachObjectARB = load.invoke("glDetachObjectARB", IIV);
        ext.glCreateShaderObjectARB = load.invoke("glCreateShaderObjectARB", II);
        ext.glShaderSourceARB = load.invoke("glShaderSourceARB", IIPPV);
        ext.glCompileShaderARB = load.invoke("glCompileShaderARB", IV);
        ext.glCreateProgramObjectARB = load.invoke("glCreateProgramObjectARB", I);
        ext.glAttachObjectARB = load.invoke("glAttachObjectARB", IIV);
        ext.glLinkProgramARB = load.invoke("glLinkProgramARB", IV);
        ext.glUseProgramObjectARB = load.invoke("glUseProgramObjectARB", IV);
        ext.glValidateProgramARB = load.invoke("glValidateProgramARB", IV);
        ext.glUniform1fARB = load.invoke("glUniform1fARB", IFV);
        ext.glUniform2fARB = load.invoke("glUniform2fARB", IFFV);
        ext.glUniform3fARB = load.invoke("glUniform3fARB", IFFFV);
        ext.glUniform4fARB = load.invoke("glUniform4fARB", IFFFFV);
        ext.glUniform1iARB = load.invoke("glUniform1iARB", IIV);
        ext.glUniform2iARB = load.invoke("glUniform2iARB", IIIV);
        ext.glUniform3iARB = load.invoke("glUniform3iARB", IIIIV);
        ext.glUniform4iARB = load.invoke("glUniform4iARB", IIIIIV);
        ext.glUniform1fvARB = load.invoke("glUniform1fvARB", IIPV);
        ext.glUniform2fvARB = load.invoke("glUniform2fvARB", IIPV);
        ext.glUniform3fvARB = load.invoke("glUniform3fvARB", IIPV);
        ext.glUniform4fvARB = load.invoke("glUniform4fvARB", IIPV);
        ext.glUniform1ivARB = load.invoke("glUniform1ivARB", IIPV);
        ext.glUniform2ivARB = load.invoke("glUniform2ivARB", IIPV);
        ext.glUniform3ivARB = load.invoke("glUniform3ivARB", IIPV);
        ext.glUniform4ivARB = load.invoke("glUniform4ivARB", IIPV);
        ext.glUniformMatrix2fvARB = load.invoke("glUniformMatrix2fvARB", IIZPV);
        ext.glUniformMatrix3fvARB = load.invoke("glUniformMatrix3fvARB", IIZPV);
        ext.glUniformMatrix4fvARB = load.invoke("glUniformMatrix4fvARB", IIZPV);
        ext.glGetObjectParameterfvARB = load.invoke("glGetObjectParameterfvARB", IIPV);
        ext.glGetObjectParameterivARB = load.invoke("glGetObjectParameterivARB", IIPV);
        ext.glGetInfoLogARB = load.invoke("glGetInfoLogARB", IIPPV);
        ext.glGetAttachedObjectsARB = load.invoke("glGetAttachedObjectsARB", IIPPV);
        ext.glGetUniformLocationARB = load.invoke("glGetUniformLocationARB", IPI);
        ext.glGetActiveUniformARB = load.invoke("glGetActiveUniformARB", IIIPPPPV);
        ext.glGetUniformfvARB = load.invoke("glGetUniformfvARB", IIPV);
        ext.glGetUniformivARB = load.invoke("glGetUniformivARB", IIPV);
        ext.glGetShaderSourceARB = load.invoke("glGetShaderSourceARB", IIPPV);
    }

    public static void glDeleteObjectARB(int obj) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glDeleteObjectARB).invokeExact(obj);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static int glGetHandleARB(int pname) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            return (int) GLLoader.check(ext.glGetHandleARB).invokeExact(pname);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glDetachObjectARB(int containerObj, int attachedObj) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glDetachObjectARB).invokeExact(containerObj, attachedObj);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static int glCreateShaderObjectARB(int shaderType) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            return (int) GLLoader.check(ext.glCreateShaderObjectARB).invokeExact(shaderType);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glShaderSourceARB(int shaderObj, int count, MemorySegment string, MemorySegment length) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glShaderSourceARB).invokeExact(shaderObj, count, string, length);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glCompileShaderARB(int shaderObj) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glCompileShaderARB).invokeExact(shaderObj);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static int glCreateProgramObjectARB() {
        final var ext = GLLoader.getExtCapabilities();
        try {
            return (int) GLLoader.check(ext.glCreateProgramObjectARB).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glAttachObjectARB(int containerObj, int obj) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glAttachObjectARB).invokeExact(containerObj, obj);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glLinkProgramARB(int programObj) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glLinkProgramARB).invokeExact(programObj);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glUseProgramObjectARB(int programObj) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glUseProgramObjectARB).invokeExact(programObj);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glValidateProgramARB(int programObj) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glValidateProgramARB).invokeExact(programObj);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glUniform1fARB(int location, float v0) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glUniform1fARB).invokeExact(location, v0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glUniform2fARB(int location, float v0, float v1) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glUniform2fARB).invokeExact(location, v0, v1);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glUniform3fARB(int location, float v0, float v1, float v2) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glUniform3fARB).invokeExact(location, v0, v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glUniform4fARB(int location, float v0, float v1, float v2, float v3) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glUniform4fARB).invokeExact(location, v0, v1, v2, v3);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glUniform1iARB(int location, int v0) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glUniform1iARB).invokeExact(location, v0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glUniform2iARB(int location, int v0, int v1) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glUniform2iARB).invokeExact(location, v0, v1);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glUniform3iARB(int location, int v0, int v1, int v2) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glUniform3iARB).invokeExact(location, v0, v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glUniform4iARB(int location, int v0, int v1, int v2, int v3) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glUniform4iARB).invokeExact(location, v0, v1, v2, v3);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glUniform1fvARB(int location, int count, MemorySegment value) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glUniform1fvARB).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glUniform2fvARB(int location, int count, MemorySegment value) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glUniform2fvARB).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glUniform3fvARB(int location, int count, MemorySegment value) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glUniform3fvARB).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glUniform4fvARB(int location, int count, MemorySegment value) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glUniform4fvARB).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glUniform1ivARB(int location, int count, MemorySegment value) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glUniform1ivARB).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glUniform2ivARB(int location, int count, MemorySegment value) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glUniform2ivARB).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glUniform3ivARB(int location, int count, MemorySegment value) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glUniform3ivARB).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glUniform4ivARB(int location, int count, MemorySegment value) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glUniform4ivARB).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glUniformMatrix2fvARB(int location, int count, byte transpose, MemorySegment value) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glUniformMatrix2fvARB).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glUniformMatrix3fvARB(int location, int count, byte transpose, MemorySegment value) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glUniformMatrix3fvARB).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glUniformMatrix4fvARB(int location, int count, byte transpose, MemorySegment value) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glUniformMatrix4fvARB).invokeExact(location, count, transpose, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glGetObjectParameterfvARB(int obj, int pname, MemorySegment params) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetObjectParameterfvARB).invokeExact(obj, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glGetObjectParameterivARB(int obj, int pname, MemorySegment params) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetObjectParameterivARB).invokeExact(obj, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glGetInfoLogARB(int obj, int maxLength, MemorySegment length, MemorySegment infoLog) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetInfoLogARB).invokeExact(obj, maxLength, length, infoLog);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glGetAttachedObjectsARB(int containerObj, int maxCount, MemorySegment count, MemorySegment obj) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetAttachedObjectsARB).invokeExact(containerObj, maxCount, count, obj);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static int glGetUniformLocationARB(int programObj, MemorySegment name) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            return (int) GLLoader.check(ext.glGetUniformLocationARB).invokeExact(programObj, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glGetActiveUniformARB(int programObj, int index, int maxLength, MemorySegment length, MemorySegment size, MemorySegment type, MemorySegment name) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetActiveUniformARB).invokeExact(programObj, index, maxLength, length, size, type, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glGetUniformfvARB(int programObj, int location, MemorySegment params) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetUniformfvARB).invokeExact(programObj, location, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glGetUniformivARB(int programObj, int location, MemorySegment params) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetUniformivARB).invokeExact(programObj, location, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
    public static void glGetShaderSourceARB(int obj, int maxLength, MemorySegment length, MemorySegment source) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glGetShaderSourceARB).invokeExact(obj, maxLength, length, source);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}

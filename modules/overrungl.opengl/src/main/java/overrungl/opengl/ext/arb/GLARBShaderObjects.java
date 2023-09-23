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
 */

// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext.arb;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_ARB_shader_objects}
  */
public final class GLARBShaderObjects {
    public static final int GL_PROGRAM_OBJECT_ARB = 0x8B40;
    public static final int GL_SHADER_OBJECT_ARB = 0x8B48;
    public static final int GL_OBJECT_TYPE_ARB = 0x8B4E;
    public static final int GL_OBJECT_SUBTYPE_ARB = 0x8B4F;
    public static final int GL_FLOAT_VEC2_ARB = 0x8B50;
    public static final int GL_FLOAT_VEC3_ARB = 0x8B51;
    public static final int GL_FLOAT_VEC4_ARB = 0x8B52;
    public static final int GL_INT_VEC2_ARB = 0x8B53;
    public static final int GL_INT_VEC3_ARB = 0x8B54;
    public static final int GL_INT_VEC4_ARB = 0x8B55;
    public static final int GL_BOOL_ARB = 0x8B56;
    public static final int GL_BOOL_VEC2_ARB = 0x8B57;
    public static final int GL_BOOL_VEC3_ARB = 0x8B58;
    public static final int GL_BOOL_VEC4_ARB = 0x8B59;
    public static final int GL_FLOAT_MAT2_ARB = 0x8B5A;
    public static final int GL_FLOAT_MAT3_ARB = 0x8B5B;
    public static final int GL_FLOAT_MAT4_ARB = 0x8B5C;
    public static final int GL_SAMPLER_1D_ARB = 0x8B5D;
    public static final int GL_SAMPLER_2D_ARB = 0x8B5E;
    public static final int GL_SAMPLER_3D_ARB = 0x8B5F;
    public static final int GL_SAMPLER_CUBE_ARB = 0x8B60;
    public static final int GL_SAMPLER_1D_SHADOW_ARB = 0x8B61;
    public static final int GL_SAMPLER_2D_SHADOW_ARB = 0x8B62;
    public static final int GL_SAMPLER_2D_RECT_ARB = 0x8B63;
    public static final int GL_SAMPLER_2D_RECT_SHADOW_ARB = 0x8B64;
    public static final int GL_OBJECT_DELETE_STATUS_ARB = 0x8B80;
    public static final int GL_OBJECT_COMPILE_STATUS_ARB = 0x8B81;
    public static final int GL_OBJECT_LINK_STATUS_ARB = 0x8B82;
    public static final int GL_OBJECT_VALIDATE_STATUS_ARB = 0x8B83;
    public static final int GL_OBJECT_INFO_LOG_LENGTH_ARB = 0x8B84;
    public static final int GL_OBJECT_ATTACHED_OBJECTS_ARB = 0x8B85;
    public static final int GL_OBJECT_ACTIVE_UNIFORMS_ARB = 0x8B86;
    public static final int GL_OBJECT_ACTIVE_UNIFORM_MAX_LENGTH_ARB = 0x8B87;
    public static final int GL_OBJECT_SHADER_SOURCE_LENGTH_ARB = 0x8B88;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_shader_objects) return;
        ext.glDeleteObjectARB = load.invoke("glDeleteObjectARB", ofVoid(JAVA_INT));
        ext.glGetHandleARB = load.invoke("glGetHandleARB", of(JAVA_INT, JAVA_INT));
        ext.glDetachObjectARB = load.invoke("glDetachObjectARB", ofVoid(JAVA_INT, JAVA_INT));
        ext.glCreateShaderObjectARB = load.invoke("glCreateShaderObjectARB", of(JAVA_INT, JAVA_INT));
        ext.glShaderSourceARB = load.invoke("glShaderSourceARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, ADDRESS));
        ext.glCompileShaderARB = load.invoke("glCompileShaderARB", ofVoid(JAVA_INT));
        ext.glCreateProgramObjectARB = load.invoke("glCreateProgramObjectARB", of(JAVA_INT));
        ext.glAttachObjectARB = load.invoke("glAttachObjectARB", ofVoid(JAVA_INT, JAVA_INT));
        ext.glLinkProgramARB = load.invoke("glLinkProgramARB", ofVoid(JAVA_INT));
        ext.glUseProgramObjectARB = load.invoke("glUseProgramObjectARB", ofVoid(JAVA_INT));
        ext.glValidateProgramARB = load.invoke("glValidateProgramARB", ofVoid(JAVA_INT));
        ext.glUniform1fARB = load.invoke("glUniform1fARB", ofVoid(JAVA_INT, JAVA_FLOAT));
        ext.glUniform2fARB = load.invoke("glUniform2fARB", ofVoid(JAVA_INT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glUniform3fARB = load.invoke("glUniform3fARB", ofVoid(JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glUniform4fARB = load.invoke("glUniform4fARB", ofVoid(JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glUniform1iARB = load.invoke("glUniform1iARB", ofVoid(JAVA_INT, JAVA_INT));
        ext.glUniform2iARB = load.invoke("glUniform2iARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glUniform3iARB = load.invoke("glUniform3iARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glUniform4iARB = load.invoke("glUniform4iARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glUniform1fvARB = load.invoke("glUniform1fvARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glUniform2fvARB = load.invoke("glUniform2fvARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glUniform3fvARB = load.invoke("glUniform3fvARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glUniform4fvARB = load.invoke("glUniform4fvARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glUniform1ivARB = load.invoke("glUniform1ivARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glUniform2ivARB = load.invoke("glUniform2ivARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glUniform3ivARB = load.invoke("glUniform3ivARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glUniform4ivARB = load.invoke("glUniform4ivARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glUniformMatrix2fvARB = load.invoke("glUniformMatrix2fvARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_BYTE, ADDRESS));
        ext.glUniformMatrix3fvARB = load.invoke("glUniformMatrix3fvARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_BYTE, ADDRESS));
        ext.glUniformMatrix4fvARB = load.invoke("glUniformMatrix4fvARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_BYTE, ADDRESS));
        ext.glGetObjectParameterfvARB = load.invoke("glGetObjectParameterfvARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetObjectParameterivARB = load.invoke("glGetObjectParameterivARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetInfoLogARB = load.invoke("glGetInfoLogARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, ADDRESS));
        ext.glGetAttachedObjectsARB = load.invoke("glGetAttachedObjectsARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, ADDRESS));
        ext.glGetUniformLocationARB = load.invoke("glGetUniformLocationARB", of(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetActiveUniformARB = load.invoke("glGetActiveUniformARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, ADDRESS, ADDRESS, ADDRESS));
        ext.glGetUniformfvARB = load.invoke("glGetUniformfvARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetUniformivARB = load.invoke("glGetUniformivARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetShaderSourceARB = load.invoke("glGetShaderSourceARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, ADDRESS));
    }

    public static void glDeleteObjectARB(int obj) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeleteObjectARB).invokeExact(obj);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glGetHandleARB(int pname) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glGetHandleARB).invokeExact(pname);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDetachObjectARB(int containerObj, int attachedObj) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDetachObjectARB).invokeExact(containerObj, attachedObj);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glCreateShaderObjectARB(int shaderType) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glCreateShaderObjectARB).invokeExact(shaderType);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glShaderSourceARB(int shaderObj, int count, @NativeType("const GLcharARB**") MemorySegment string, @NativeType("const GLint*") MemorySegment length) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glShaderSourceARB).invokeExact(shaderObj, count, string, length);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCompileShaderARB(int shaderObj) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCompileShaderARB).invokeExact(shaderObj);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glCreateProgramObjectARB() {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glCreateProgramObjectARB).invokeExact();
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glAttachObjectARB(int containerObj, int obj) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glAttachObjectARB).invokeExact(containerObj, obj);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glLinkProgramARB(int programObj) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glLinkProgramARB).invokeExact(programObj);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUseProgramObjectARB(int programObj) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUseProgramObjectARB).invokeExact(programObj);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glValidateProgramARB(int programObj) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glValidateProgramARB).invokeExact(programObj);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform1fARB(int location, float v0) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform1fARB).invokeExact(location, v0);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform2fARB(int location, float v0, float v1) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform2fARB).invokeExact(location, v0, v1);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform3fARB(int location, float v0, float v1, float v2) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform3fARB).invokeExact(location, v0, v1, v2);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform4fARB(int location, float v0, float v1, float v2, float v3) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform4fARB).invokeExact(location, v0, v1, v2, v3);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform1iARB(int location, int v0) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform1iARB).invokeExact(location, v0);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform2iARB(int location, int v0, int v1) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform2iARB).invokeExact(location, v0, v1);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform3iARB(int location, int v0, int v1, int v2) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform3iARB).invokeExact(location, v0, v1, v2);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform4iARB(int location, int v0, int v1, int v2, int v3) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform4iARB).invokeExact(location, v0, v1, v2, v3);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform1fvARB(int location, int count, @NativeType("const GLfloat*") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform1fvARB).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform2fvARB(int location, int count, @NativeType("const GLfloat*") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform2fvARB).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform3fvARB(int location, int count, @NativeType("const GLfloat*") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform3fvARB).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform4fvARB(int location, int count, @NativeType("const GLfloat*") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform4fvARB).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform1ivARB(int location, int count, @NativeType("const GLint*") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform1ivARB).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform2ivARB(int location, int count, @NativeType("const GLint*") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform2ivARB).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform3ivARB(int location, int count, @NativeType("const GLint*") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform3ivARB).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniform4ivARB(int location, int count, @NativeType("const GLint*") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniform4ivARB).invokeExact(location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniformMatrix2fvARB(int location, int count, boolean transpose, @NativeType("const GLfloat*") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniformMatrix2fvARB).invokeExact(location, count, transpose, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniformMatrix3fvARB(int location, int count, boolean transpose, @NativeType("const GLfloat*") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniformMatrix3fvARB).invokeExact(location, count, transpose, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUniformMatrix4fvARB(int location, int count, boolean transpose, @NativeType("const GLfloat*") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUniformMatrix4fvARB).invokeExact(location, count, transpose, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetObjectParameterfvARB(int obj, int pname, @NativeType("GLfloat*") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetObjectParameterfvARB).invokeExact(obj, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetObjectParameterivARB(int obj, int pname, @NativeType("GLint*") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetObjectParameterivARB).invokeExact(obj, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetInfoLogARB(int obj, int maxLength, @NativeType("GLsizei*") MemorySegment length, @NativeType("GLcharARB*") MemorySegment infoLog) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetInfoLogARB).invokeExact(obj, maxLength, length, infoLog);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetAttachedObjectsARB(int containerObj, int maxCount, @NativeType("GLsizei*") MemorySegment count, @NativeType("GLhandleARB*") MemorySegment obj) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetAttachedObjectsARB).invokeExact(containerObj, maxCount, count, obj);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glGetUniformLocationARB(int programObj, @NativeType("const GLcharARB*") MemorySegment name) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glGetUniformLocationARB).invokeExact(programObj, name);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetActiveUniformARB(int programObj, int index, int maxLength, @NativeType("GLsizei*") MemorySegment length, @NativeType("GLint*") MemorySegment size, @NativeType("GLenum*") MemorySegment type, @NativeType("GLcharARB*") MemorySegment name) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetActiveUniformARB).invokeExact(programObj, index, maxLength, length, size, type, name);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetUniformfvARB(int programObj, int location, @NativeType("GLfloat*") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetUniformfvARB).invokeExact(programObj, location, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetUniformivARB(int programObj, int location, @NativeType("GLint*") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetUniformivARB).invokeExact(programObj, location, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetShaderSourceARB(int obj, int maxLength, @NativeType("GLsizei*") MemorySegment length, @NativeType("GLcharARB*") MemorySegment source) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetShaderSourceARB).invokeExact(obj, maxLength, length, source);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}

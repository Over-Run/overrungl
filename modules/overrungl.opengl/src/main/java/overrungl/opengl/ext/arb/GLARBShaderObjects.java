/*
 * MIT License
 *
 * Copyright (c) 2022-present Overrun Organization
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
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_ARB_shader_objects}
 */
public interface GLARBShaderObjects {
    int GL_PROGRAM_OBJECT_ARB = 0x8B40;
    int GL_SHADER_OBJECT_ARB = 0x8B48;
    int GL_OBJECT_TYPE_ARB = 0x8B4E;
    int GL_OBJECT_SUBTYPE_ARB = 0x8B4F;
    int GL_FLOAT_VEC2_ARB = 0x8B50;
    int GL_FLOAT_VEC3_ARB = 0x8B51;
    int GL_FLOAT_VEC4_ARB = 0x8B52;
    int GL_INT_VEC2_ARB = 0x8B53;
    int GL_INT_VEC3_ARB = 0x8B54;
    int GL_INT_VEC4_ARB = 0x8B55;
    int GL_BOOL_ARB = 0x8B56;
    int GL_BOOL_VEC2_ARB = 0x8B57;
    int GL_BOOL_VEC3_ARB = 0x8B58;
    int GL_BOOL_VEC4_ARB = 0x8B59;
    int GL_FLOAT_MAT2_ARB = 0x8B5A;
    int GL_FLOAT_MAT3_ARB = 0x8B5B;
    int GL_FLOAT_MAT4_ARB = 0x8B5C;
    int GL_SAMPLER_1D_ARB = 0x8B5D;
    int GL_SAMPLER_2D_ARB = 0x8B5E;
    int GL_SAMPLER_3D_ARB = 0x8B5F;
    int GL_SAMPLER_CUBE_ARB = 0x8B60;
    int GL_SAMPLER_1D_SHADOW_ARB = 0x8B61;
    int GL_SAMPLER_2D_SHADOW_ARB = 0x8B62;
    int GL_SAMPLER_2D_RECT_ARB = 0x8B63;
    int GL_SAMPLER_2D_RECT_SHADOW_ARB = 0x8B64;
    int GL_OBJECT_DELETE_STATUS_ARB = 0x8B80;
    int GL_OBJECT_COMPILE_STATUS_ARB = 0x8B81;
    int GL_OBJECT_LINK_STATUS_ARB = 0x8B82;
    int GL_OBJECT_VALIDATE_STATUS_ARB = 0x8B83;
    int GL_OBJECT_INFO_LOG_LENGTH_ARB = 0x8B84;
    int GL_OBJECT_ATTACHED_OBJECTS_ARB = 0x8B85;
    int GL_OBJECT_ACTIVE_UNIFORMS_ARB = 0x8B86;
    int GL_OBJECT_ACTIVE_UNIFORM_MAX_LENGTH_ARB = 0x8B87;
    int GL_OBJECT_SHADER_SOURCE_LENGTH_ARB = 0x8B88;

    void glDeleteObjectARB(int obj);
    int glGetHandleARB(int pname);
    void glDetachObjectARB(int containerObj, int attachedObj);
    int glCreateShaderObjectARB(int shaderType);
    void glShaderSourceARB(int shaderObj, int count, @NativeType("const GLcharARB**") MemorySegment string, @NativeType("const GLint*") MemorySegment length);
    void glCompileShaderARB(int shaderObj);
    int glCreateProgramObjectARB();
    void glAttachObjectARB(int containerObj, int obj);
    void glLinkProgramARB(int programObj);
    void glUseProgramObjectARB(int programObj);
    void glValidateProgramARB(int programObj);
    void glUniform1fARB(int location, float v0);
    void glUniform2fARB(int location, float v0, float v1);
    void glUniform3fARB(int location, float v0, float v1, float v2);
    void glUniform4fARB(int location, float v0, float v1, float v2, float v3);
    void glUniform1iARB(int location, int v0);
    void glUniform2iARB(int location, int v0, int v1);
    void glUniform3iARB(int location, int v0, int v1, int v2);
    void glUniform4iARB(int location, int v0, int v1, int v2, int v3);
    void glUniform1fvARB(int location, int count, @NativeType("const GLfloat*") MemorySegment value);
    void glUniform2fvARB(int location, int count, @NativeType("const GLfloat*") MemorySegment value);
    void glUniform3fvARB(int location, int count, @NativeType("const GLfloat*") MemorySegment value);
    void glUniform4fvARB(int location, int count, @NativeType("const GLfloat*") MemorySegment value);
    void glUniform1ivARB(int location, int count, @NativeType("const GLint*") MemorySegment value);
    void glUniform2ivARB(int location, int count, @NativeType("const GLint*") MemorySegment value);
    void glUniform3ivARB(int location, int count, @NativeType("const GLint*") MemorySegment value);
    void glUniform4ivARB(int location, int count, @NativeType("const GLint*") MemorySegment value);
    void glUniformMatrix2fvARB(int location, int count, boolean transpose, @NativeType("const GLfloat*") MemorySegment value);
    void glUniformMatrix3fvARB(int location, int count, boolean transpose, @NativeType("const GLfloat*") MemorySegment value);
    void glUniformMatrix4fvARB(int location, int count, boolean transpose, @NativeType("const GLfloat*") MemorySegment value);
    void glGetObjectParameterfvARB(int obj, int pname, @NativeType("GLfloat*") MemorySegment params);
    void glGetObjectParameterivARB(int obj, int pname, @NativeType("GLint*") MemorySegment params);
    void glGetInfoLogARB(int obj, int maxLength, @NativeType("GLsizei*") MemorySegment length, @NativeType("GLcharARB*") MemorySegment infoLog);
    void glGetAttachedObjectsARB(int containerObj, int maxCount, @NativeType("GLsizei*") MemorySegment count, @NativeType("GLhandleARB*") MemorySegment obj);
    int glGetUniformLocationARB(int programObj, @NativeType("const GLcharARB*") MemorySegment name);
    void glGetActiveUniformARB(int programObj, int index, int maxLength, @NativeType("GLsizei*") MemorySegment length, @NativeType("GLint*") MemorySegment size, @NativeType("GLenum*") MemorySegment type, @NativeType("GLcharARB*") MemorySegment name);
    void glGetUniformfvARB(int programObj, int location, @NativeType("GLfloat*") MemorySegment params);
    void glGetUniformivARB(int programObj, int location, @NativeType("GLint*") MemorySegment params);
    void glGetShaderSourceARB(int obj, int maxLength, @NativeType("GLsizei*") MemorySegment length, @NativeType("GLcharARB*") MemorySegment source);
}

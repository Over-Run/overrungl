/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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
package overrungl.opengl;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import static overrungl.internal.RuntimeHelper.*;
/// Constants and functions of OpenGL 2.0.
public class GL20 extends GL15 {
    public static final int GL_BLEND_EQUATION_RGB = 0x8009;
    public static final int GL_VERTEX_ATTRIB_ARRAY_ENABLED = 0x8622;
    public static final int GL_VERTEX_ATTRIB_ARRAY_SIZE = 0x8623;
    public static final int GL_VERTEX_ATTRIB_ARRAY_STRIDE = 0x8624;
    public static final int GL_VERTEX_ATTRIB_ARRAY_TYPE = 0x8625;
    public static final int GL_CURRENT_VERTEX_ATTRIB = 0x8626;
    public static final int GL_VERTEX_PROGRAM_POINT_SIZE = 0x8642;
    public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER = 0x8645;
    public static final int GL_STENCIL_BACK_FUNC = 0x8800;
    public static final int GL_STENCIL_BACK_FAIL = 0x8801;
    public static final int GL_STENCIL_BACK_PASS_DEPTH_FAIL = 0x8802;
    public static final int GL_STENCIL_BACK_PASS_DEPTH_PASS = 0x8803;
    public static final int GL_MAX_DRAW_BUFFERS = 0x8824;
    public static final int GL_DRAW_BUFFER0 = 0x8825;
    public static final int GL_DRAW_BUFFER1 = 0x8826;
    public static final int GL_DRAW_BUFFER2 = 0x8827;
    public static final int GL_DRAW_BUFFER3 = 0x8828;
    public static final int GL_DRAW_BUFFER4 = 0x8829;
    public static final int GL_DRAW_BUFFER5 = 0x882A;
    public static final int GL_DRAW_BUFFER6 = 0x882B;
    public static final int GL_DRAW_BUFFER7 = 0x882C;
    public static final int GL_DRAW_BUFFER8 = 0x882D;
    public static final int GL_DRAW_BUFFER9 = 0x882E;
    public static final int GL_DRAW_BUFFER10 = 0x882F;
    public static final int GL_DRAW_BUFFER11 = 0x8830;
    public static final int GL_DRAW_BUFFER12 = 0x8831;
    public static final int GL_DRAW_BUFFER13 = 0x8832;
    public static final int GL_DRAW_BUFFER14 = 0x8833;
    public static final int GL_DRAW_BUFFER15 = 0x8834;
    public static final int GL_BLEND_EQUATION_ALPHA = 0x883D;
    public static final int GL_MAX_VERTEX_ATTRIBS = 0x8869;
    public static final int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED = 0x886A;
    public static final int GL_MAX_TEXTURE_IMAGE_UNITS = 0x8872;
    public static final int GL_FRAGMENT_SHADER = 0x8B30;
    public static final int GL_VERTEX_SHADER = 0x8B31;
    public static final int GL_MAX_FRAGMENT_UNIFORM_COMPONENTS = 0x8B49;
    public static final int GL_MAX_VERTEX_UNIFORM_COMPONENTS = 0x8B4A;
    public static final int GL_MAX_VARYING_FLOATS = 0x8B4B;
    public static final int GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS = 0x8B4C;
    public static final int GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS = 0x8B4D;
    public static final int GL_SHADER_TYPE = 0x8B4F;
    public static final int GL_FLOAT_VEC2 = 0x8B50;
    public static final int GL_FLOAT_VEC3 = 0x8B51;
    public static final int GL_FLOAT_VEC4 = 0x8B52;
    public static final int GL_INT_VEC2 = 0x8B53;
    public static final int GL_INT_VEC3 = 0x8B54;
    public static final int GL_INT_VEC4 = 0x8B55;
    public static final int GL_BOOL = 0x8B56;
    public static final int GL_BOOL_VEC2 = 0x8B57;
    public static final int GL_BOOL_VEC3 = 0x8B58;
    public static final int GL_BOOL_VEC4 = 0x8B59;
    public static final int GL_FLOAT_MAT2 = 0x8B5A;
    public static final int GL_FLOAT_MAT3 = 0x8B5B;
    public static final int GL_FLOAT_MAT4 = 0x8B5C;
    public static final int GL_SAMPLER_1D = 0x8B5D;
    public static final int GL_SAMPLER_2D = 0x8B5E;
    public static final int GL_SAMPLER_3D = 0x8B5F;
    public static final int GL_SAMPLER_CUBE = 0x8B60;
    public static final int GL_SAMPLER_1D_SHADOW = 0x8B61;
    public static final int GL_SAMPLER_2D_SHADOW = 0x8B62;
    public static final int GL_DELETE_STATUS = 0x8B80;
    public static final int GL_COMPILE_STATUS = 0x8B81;
    public static final int GL_LINK_STATUS = 0x8B82;
    public static final int GL_VALIDATE_STATUS = 0x8B83;
    public static final int GL_INFO_LOG_LENGTH = 0x8B84;
    public static final int GL_ATTACHED_SHADERS = 0x8B85;
    public static final int GL_ACTIVE_UNIFORMS = 0x8B86;
    public static final int GL_ACTIVE_UNIFORM_MAX_LENGTH = 0x8B87;
    public static final int GL_SHADER_SOURCE_LENGTH = 0x8B88;
    public static final int GL_ACTIVE_ATTRIBUTES = 0x8B89;
    public static final int GL_ACTIVE_ATTRIBUTE_MAX_LENGTH = 0x8B8A;
    public static final int GL_FRAGMENT_SHADER_DERIVATIVE_HINT = 0x8B8B;
    public static final int GL_SHADING_LANGUAGE_VERSION = 0x8B8C;
    public static final int GL_CURRENT_PROGRAM = 0x8B8D;
    public static final int GL_POINT_SPRITE_COORD_ORIGIN = 0x8CA0;
    public static final int GL_LOWER_LEFT = 0x8CA1;
    public static final int GL_UPPER_LEFT = 0x8CA2;
    public static final int GL_STENCIL_BACK_REF = 0x8CA3;
    public static final int GL_STENCIL_BACK_VALUE_MASK = 0x8CA4;
    public static final int GL_STENCIL_BACK_WRITEMASK = 0x8CA5;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBlendEquationSeparate = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawBuffers = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glStencilOpSeparate = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glStencilFuncSeparate = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glStencilMaskSeparate = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glAttachShader = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBindAttribLocation = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompileShader = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCreateProgram = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCreateShader = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteProgram = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteShader = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDetachShader = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDisableVertexAttribArray = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glEnableVertexAttribArray = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetActiveAttrib = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetActiveUniform = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetAttachedShaders = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetAttribLocation = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramInfoLog = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetShaderiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetShaderInfoLog = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetShaderSource = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetUniformLocation = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetUniformfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetUniformiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribdv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribPointerv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsProgram = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glIsShader = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glLinkProgram = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glShaderSource = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUseProgram = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glUniform1f = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glUniform2f = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glUniform3f = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glUniform4f = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glUniform1i = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glUniform2i = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glUniform3i = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glUniform4i = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glUniform1fv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform2fv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform3fv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform4fv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform1iv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform2iv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform3iv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform4iv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformMatrix2fv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformMatrix3fv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniformMatrix4fv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glValidateProgram = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttrib1d = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttrib1dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib1f = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glVertexAttrib1fv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib1s = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexAttrib1sv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib2d = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttrib2dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib2f = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glVertexAttrib2fv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib2s = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexAttrib2sv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib3d = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttrib3dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib3f = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glVertexAttrib3fv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib3s = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexAttrib3sv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4Nbv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4Niv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4Nsv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4Nub = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glVertexAttrib4Nubv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4Nuiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4Nusv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4bv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4d = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexAttrib4dv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4f = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glVertexAttrib4fv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4iv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4s = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexAttrib4sv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4ubv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttrib4usv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribPointer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glBlendEquationSeparate;
        public final MemorySegment PFN_glDrawBuffers;
        public final MemorySegment PFN_glStencilOpSeparate;
        public final MemorySegment PFN_glStencilFuncSeparate;
        public final MemorySegment PFN_glStencilMaskSeparate;
        public final MemorySegment PFN_glAttachShader;
        public final MemorySegment PFN_glBindAttribLocation;
        public final MemorySegment PFN_glCompileShader;
        public final MemorySegment PFN_glCreateProgram;
        public final MemorySegment PFN_glCreateShader;
        public final MemorySegment PFN_glDeleteProgram;
        public final MemorySegment PFN_glDeleteShader;
        public final MemorySegment PFN_glDetachShader;
        public final MemorySegment PFN_glDisableVertexAttribArray;
        public final MemorySegment PFN_glEnableVertexAttribArray;
        public final MemorySegment PFN_glGetActiveAttrib;
        public final MemorySegment PFN_glGetActiveUniform;
        public final MemorySegment PFN_glGetAttachedShaders;
        public final MemorySegment PFN_glGetAttribLocation;
        public final MemorySegment PFN_glGetProgramiv;
        public final MemorySegment PFN_glGetProgramInfoLog;
        public final MemorySegment PFN_glGetShaderiv;
        public final MemorySegment PFN_glGetShaderInfoLog;
        public final MemorySegment PFN_glGetShaderSource;
        public final MemorySegment PFN_glGetUniformLocation;
        public final MemorySegment PFN_glGetUniformfv;
        public final MemorySegment PFN_glGetUniformiv;
        public final MemorySegment PFN_glGetVertexAttribdv;
        public final MemorySegment PFN_glGetVertexAttribfv;
        public final MemorySegment PFN_glGetVertexAttribiv;
        public final MemorySegment PFN_glGetVertexAttribPointerv;
        public final MemorySegment PFN_glIsProgram;
        public final MemorySegment PFN_glIsShader;
        public final MemorySegment PFN_glLinkProgram;
        public final MemorySegment PFN_glShaderSource;
        public final MemorySegment PFN_glUseProgram;
        public final MemorySegment PFN_glUniform1f;
        public final MemorySegment PFN_glUniform2f;
        public final MemorySegment PFN_glUniform3f;
        public final MemorySegment PFN_glUniform4f;
        public final MemorySegment PFN_glUniform1i;
        public final MemorySegment PFN_glUniform2i;
        public final MemorySegment PFN_glUniform3i;
        public final MemorySegment PFN_glUniform4i;
        public final MemorySegment PFN_glUniform1fv;
        public final MemorySegment PFN_glUniform2fv;
        public final MemorySegment PFN_glUniform3fv;
        public final MemorySegment PFN_glUniform4fv;
        public final MemorySegment PFN_glUniform1iv;
        public final MemorySegment PFN_glUniform2iv;
        public final MemorySegment PFN_glUniform3iv;
        public final MemorySegment PFN_glUniform4iv;
        public final MemorySegment PFN_glUniformMatrix2fv;
        public final MemorySegment PFN_glUniformMatrix3fv;
        public final MemorySegment PFN_glUniformMatrix4fv;
        public final MemorySegment PFN_glValidateProgram;
        public final MemorySegment PFN_glVertexAttrib1d;
        public final MemorySegment PFN_glVertexAttrib1dv;
        public final MemorySegment PFN_glVertexAttrib1f;
        public final MemorySegment PFN_glVertexAttrib1fv;
        public final MemorySegment PFN_glVertexAttrib1s;
        public final MemorySegment PFN_glVertexAttrib1sv;
        public final MemorySegment PFN_glVertexAttrib2d;
        public final MemorySegment PFN_glVertexAttrib2dv;
        public final MemorySegment PFN_glVertexAttrib2f;
        public final MemorySegment PFN_glVertexAttrib2fv;
        public final MemorySegment PFN_glVertexAttrib2s;
        public final MemorySegment PFN_glVertexAttrib2sv;
        public final MemorySegment PFN_glVertexAttrib3d;
        public final MemorySegment PFN_glVertexAttrib3dv;
        public final MemorySegment PFN_glVertexAttrib3f;
        public final MemorySegment PFN_glVertexAttrib3fv;
        public final MemorySegment PFN_glVertexAttrib3s;
        public final MemorySegment PFN_glVertexAttrib3sv;
        public final MemorySegment PFN_glVertexAttrib4Nbv;
        public final MemorySegment PFN_glVertexAttrib4Niv;
        public final MemorySegment PFN_glVertexAttrib4Nsv;
        public final MemorySegment PFN_glVertexAttrib4Nub;
        public final MemorySegment PFN_glVertexAttrib4Nubv;
        public final MemorySegment PFN_glVertexAttrib4Nuiv;
        public final MemorySegment PFN_glVertexAttrib4Nusv;
        public final MemorySegment PFN_glVertexAttrib4bv;
        public final MemorySegment PFN_glVertexAttrib4d;
        public final MemorySegment PFN_glVertexAttrib4dv;
        public final MemorySegment PFN_glVertexAttrib4f;
        public final MemorySegment PFN_glVertexAttrib4fv;
        public final MemorySegment PFN_glVertexAttrib4iv;
        public final MemorySegment PFN_glVertexAttrib4s;
        public final MemorySegment PFN_glVertexAttrib4sv;
        public final MemorySegment PFN_glVertexAttrib4ubv;
        public final MemorySegment PFN_glVertexAttrib4uiv;
        public final MemorySegment PFN_glVertexAttrib4usv;
        public final MemorySegment PFN_glVertexAttribPointer;
        private Handles(GLLoadFunc func) {
            PFN_glBlendEquationSeparate = func.invoke("glBlendEquationSeparate", "glBlendEquationSeparateEXT");
            PFN_glDrawBuffers = func.invoke("glDrawBuffers", "glDrawBuffersARB", "glDrawBuffersATI", "glDrawBuffersEXT");
            PFN_glStencilOpSeparate = func.invoke("glStencilOpSeparate", "glStencilOpSeparateATI");
            PFN_glStencilFuncSeparate = func.invoke("glStencilFuncSeparate");
            PFN_glStencilMaskSeparate = func.invoke("glStencilMaskSeparate");
            PFN_glAttachShader = func.invoke("glAttachShader", "glAttachObjectARB");
            PFN_glBindAttribLocation = func.invoke("glBindAttribLocation", "glBindAttribLocationARB");
            PFN_glCompileShader = func.invoke("glCompileShader", "glCompileShaderARB");
            PFN_glCreateProgram = func.invoke("glCreateProgram", "glCreateProgramObjectARB");
            PFN_glCreateShader = func.invoke("glCreateShader", "glCreateShaderObjectARB");
            PFN_glDeleteProgram = func.invoke("glDeleteProgram");
            PFN_glDeleteShader = func.invoke("glDeleteShader");
            PFN_glDetachShader = func.invoke("glDetachShader", "glDetachObjectARB");
            PFN_glDisableVertexAttribArray = func.invoke("glDisableVertexAttribArray", "glDisableVertexAttribArrayARB");
            PFN_glEnableVertexAttribArray = func.invoke("glEnableVertexAttribArray", "glEnableVertexAttribArrayARB");
            PFN_glGetActiveAttrib = func.invoke("glGetActiveAttrib", "glGetActiveAttribARB");
            PFN_glGetActiveUniform = func.invoke("glGetActiveUniform", "glGetActiveUniformARB");
            PFN_glGetAttachedShaders = func.invoke("glGetAttachedShaders");
            PFN_glGetAttribLocation = func.invoke("glGetAttribLocation", "glGetAttribLocationARB");
            PFN_glGetProgramiv = func.invoke("glGetProgramiv");
            PFN_glGetProgramInfoLog = func.invoke("glGetProgramInfoLog");
            PFN_glGetShaderiv = func.invoke("glGetShaderiv");
            PFN_glGetShaderInfoLog = func.invoke("glGetShaderInfoLog");
            PFN_glGetShaderSource = func.invoke("glGetShaderSource", "glGetShaderSourceARB");
            PFN_glGetUniformLocation = func.invoke("glGetUniformLocation", "glGetUniformLocationARB");
            PFN_glGetUniformfv = func.invoke("glGetUniformfv", "glGetUniformfvARB");
            PFN_glGetUniformiv = func.invoke("glGetUniformiv", "glGetUniformivARB");
            PFN_glGetVertexAttribdv = func.invoke("glGetVertexAttribdv", "glGetVertexAttribdvARB", "glGetVertexAttribdvNV");
            PFN_glGetVertexAttribfv = func.invoke("glGetVertexAttribfv", "glGetVertexAttribfvARB", "glGetVertexAttribfvNV");
            PFN_glGetVertexAttribiv = func.invoke("glGetVertexAttribiv", "glGetVertexAttribivARB", "glGetVertexAttribivNV");
            PFN_glGetVertexAttribPointerv = func.invoke("glGetVertexAttribPointerv", "glGetVertexAttribPointervARB", "glGetVertexAttribPointervNV");
            PFN_glIsProgram = func.invoke("glIsProgram");
            PFN_glIsShader = func.invoke("glIsShader");
            PFN_glLinkProgram = func.invoke("glLinkProgram", "glLinkProgramARB");
            PFN_glShaderSource = func.invoke("glShaderSource", "glShaderSourceARB");
            PFN_glUseProgram = func.invoke("glUseProgram", "glUseProgramObjectARB");
            PFN_glUniform1f = func.invoke("glUniform1f", "glUniform1fARB");
            PFN_glUniform2f = func.invoke("glUniform2f", "glUniform2fARB");
            PFN_glUniform3f = func.invoke("glUniform3f", "glUniform3fARB");
            PFN_glUniform4f = func.invoke("glUniform4f", "glUniform4fARB");
            PFN_glUniform1i = func.invoke("glUniform1i", "glUniform1iARB");
            PFN_glUniform2i = func.invoke("glUniform2i", "glUniform2iARB");
            PFN_glUniform3i = func.invoke("glUniform3i", "glUniform3iARB");
            PFN_glUniform4i = func.invoke("glUniform4i", "glUniform4iARB");
            PFN_glUniform1fv = func.invoke("glUniform1fv", "glUniform1fvARB");
            PFN_glUniform2fv = func.invoke("glUniform2fv", "glUniform2fvARB");
            PFN_glUniform3fv = func.invoke("glUniform3fv", "glUniform3fvARB");
            PFN_glUniform4fv = func.invoke("glUniform4fv", "glUniform4fvARB");
            PFN_glUniform1iv = func.invoke("glUniform1iv", "glUniform1ivARB");
            PFN_glUniform2iv = func.invoke("glUniform2iv", "glUniform2ivARB");
            PFN_glUniform3iv = func.invoke("glUniform3iv", "glUniform3ivARB");
            PFN_glUniform4iv = func.invoke("glUniform4iv", "glUniform4ivARB");
            PFN_glUniformMatrix2fv = func.invoke("glUniformMatrix2fv", "glUniformMatrix2fvARB");
            PFN_glUniformMatrix3fv = func.invoke("glUniformMatrix3fv", "glUniformMatrix3fvARB");
            PFN_glUniformMatrix4fv = func.invoke("glUniformMatrix4fv", "glUniformMatrix4fvARB");
            PFN_glValidateProgram = func.invoke("glValidateProgram", "glValidateProgramARB");
            PFN_glVertexAttrib1d = func.invoke("glVertexAttrib1d", "glVertexAttrib1dARB", "glVertexAttrib1dNV");
            PFN_glVertexAttrib1dv = func.invoke("glVertexAttrib1dv", "glVertexAttrib1dvARB", "glVertexAttrib1dvNV");
            PFN_glVertexAttrib1f = func.invoke("glVertexAttrib1f", "glVertexAttrib1fARB", "glVertexAttrib1fNV");
            PFN_glVertexAttrib1fv = func.invoke("glVertexAttrib1fv", "glVertexAttrib1fvARB", "glVertexAttrib1fvNV");
            PFN_glVertexAttrib1s = func.invoke("glVertexAttrib1s", "glVertexAttrib1sARB", "glVertexAttrib1sNV");
            PFN_glVertexAttrib1sv = func.invoke("glVertexAttrib1sv", "glVertexAttrib1svARB", "glVertexAttrib1svNV");
            PFN_glVertexAttrib2d = func.invoke("glVertexAttrib2d", "glVertexAttrib2dARB", "glVertexAttrib2dNV");
            PFN_glVertexAttrib2dv = func.invoke("glVertexAttrib2dv", "glVertexAttrib2dvARB", "glVertexAttrib2dvNV");
            PFN_glVertexAttrib2f = func.invoke("glVertexAttrib2f", "glVertexAttrib2fARB", "glVertexAttrib2fNV");
            PFN_glVertexAttrib2fv = func.invoke("glVertexAttrib2fv", "glVertexAttrib2fvARB", "glVertexAttrib2fvNV");
            PFN_glVertexAttrib2s = func.invoke("glVertexAttrib2s", "glVertexAttrib2sARB", "glVertexAttrib2sNV");
            PFN_glVertexAttrib2sv = func.invoke("glVertexAttrib2sv", "glVertexAttrib2svARB", "glVertexAttrib2svNV");
            PFN_glVertexAttrib3d = func.invoke("glVertexAttrib3d", "glVertexAttrib3dARB", "glVertexAttrib3dNV");
            PFN_glVertexAttrib3dv = func.invoke("glVertexAttrib3dv", "glVertexAttrib3dvARB", "glVertexAttrib3dvNV");
            PFN_glVertexAttrib3f = func.invoke("glVertexAttrib3f", "glVertexAttrib3fARB", "glVertexAttrib3fNV");
            PFN_glVertexAttrib3fv = func.invoke("glVertexAttrib3fv", "glVertexAttrib3fvARB", "glVertexAttrib3fvNV");
            PFN_glVertexAttrib3s = func.invoke("glVertexAttrib3s", "glVertexAttrib3sARB", "glVertexAttrib3sNV");
            PFN_glVertexAttrib3sv = func.invoke("glVertexAttrib3sv", "glVertexAttrib3svARB", "glVertexAttrib3svNV");
            PFN_glVertexAttrib4Nbv = func.invoke("glVertexAttrib4Nbv", "glVertexAttrib4NbvARB");
            PFN_glVertexAttrib4Niv = func.invoke("glVertexAttrib4Niv", "glVertexAttrib4NivARB");
            PFN_glVertexAttrib4Nsv = func.invoke("glVertexAttrib4Nsv", "glVertexAttrib4NsvARB");
            PFN_glVertexAttrib4Nub = func.invoke("glVertexAttrib4Nub", "glVertexAttrib4NubARB", "glVertexAttrib4ubNV");
            PFN_glVertexAttrib4Nubv = func.invoke("glVertexAttrib4Nubv", "glVertexAttrib4NubvARB", "glVertexAttrib4ubvNV");
            PFN_glVertexAttrib4Nuiv = func.invoke("glVertexAttrib4Nuiv", "glVertexAttrib4NuivARB");
            PFN_glVertexAttrib4Nusv = func.invoke("glVertexAttrib4Nusv", "glVertexAttrib4NusvARB");
            PFN_glVertexAttrib4bv = func.invoke("glVertexAttrib4bv", "glVertexAttrib4bvARB");
            PFN_glVertexAttrib4d = func.invoke("glVertexAttrib4d", "glVertexAttrib4dARB", "glVertexAttrib4dNV");
            PFN_glVertexAttrib4dv = func.invoke("glVertexAttrib4dv", "glVertexAttrib4dvARB", "glVertexAttrib4dvNV");
            PFN_glVertexAttrib4f = func.invoke("glVertexAttrib4f", "glVertexAttrib4fARB", "glVertexAttrib4fNV");
            PFN_glVertexAttrib4fv = func.invoke("glVertexAttrib4fv", "glVertexAttrib4fvARB", "glVertexAttrib4fvNV");
            PFN_glVertexAttrib4iv = func.invoke("glVertexAttrib4iv", "glVertexAttrib4ivARB");
            PFN_glVertexAttrib4s = func.invoke("glVertexAttrib4s", "glVertexAttrib4sARB", "glVertexAttrib4sNV");
            PFN_glVertexAttrib4sv = func.invoke("glVertexAttrib4sv", "glVertexAttrib4svARB", "glVertexAttrib4svNV");
            PFN_glVertexAttrib4ubv = func.invoke("glVertexAttrib4ubv", "glVertexAttrib4ubvARB");
            PFN_glVertexAttrib4uiv = func.invoke("glVertexAttrib4uiv", "glVertexAttrib4uivARB");
            PFN_glVertexAttrib4usv = func.invoke("glVertexAttrib4usv", "glVertexAttrib4usvARB");
            PFN_glVertexAttribPointer = func.invoke("glVertexAttribPointer", "glVertexAttribPointerARB");
        }
    }

    public GL20(GLLoadFunc func) {
        super(func);
        this.handles = new Handles(func);
    }

    /// Invokes `glBlendEquationSeparate`.
    /// ```
    /// void glBlendEquationSeparate((unsigned int) GLenum modeRGB, (unsigned int) GLenum modeAlpha);
    /// ```
    public void BlendEquationSeparate(int modeRGB, int modeAlpha) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlendEquationSeparate)) throw new GLSymbolNotFoundError("Symbol not found: glBlendEquationSeparate");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBlendEquationSeparate", modeRGB, modeAlpha); }
        Handles.MH_glBlendEquationSeparate.invokeExact(handles.PFN_glBlendEquationSeparate, modeRGB, modeAlpha); }
        catch (Throwable e) { throw new RuntimeException("error in BlendEquationSeparate", e); }
    }

    /// Invokes `glDrawBuffers`.
    /// ```
    /// void glDrawBuffers((int) GLsizei n, const GLenum* bufs);
    /// ```
    public void DrawBuffers(int n, @NonNull MemorySegment bufs) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawBuffers)) throw new GLSymbolNotFoundError("Symbol not found: glDrawBuffers");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawBuffers", n, bufs); }
        Handles.MH_glDrawBuffers.invokeExact(handles.PFN_glDrawBuffers, n, bufs); }
        catch (Throwable e) { throw new RuntimeException("error in DrawBuffers", e); }
    }

    /// Invokes `glStencilOpSeparate`.
    /// ```
    /// void glStencilOpSeparate((unsigned int) GLenum face, (unsigned int) GLenum sfail, (unsigned int) GLenum dpfail, (unsigned int) GLenum dppass);
    /// ```
    public void StencilOpSeparate(int face, int sfail, int dpfail, int dppass) {
        if (MemoryUtil.isNullPointer(handles.PFN_glStencilOpSeparate)) throw new GLSymbolNotFoundError("Symbol not found: glStencilOpSeparate");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glStencilOpSeparate", face, sfail, dpfail, dppass); }
        Handles.MH_glStencilOpSeparate.invokeExact(handles.PFN_glStencilOpSeparate, face, sfail, dpfail, dppass); }
        catch (Throwable e) { throw new RuntimeException("error in StencilOpSeparate", e); }
    }

    /// Invokes `glStencilFuncSeparate`.
    /// ```
    /// void glStencilFuncSeparate((unsigned int) GLenum face, (unsigned int) GLenum func, (int) GLint ref, (unsigned int) GLuint mask);
    /// ```
    public void StencilFuncSeparate(int face, int func, int ref, int mask) {
        if (MemoryUtil.isNullPointer(handles.PFN_glStencilFuncSeparate)) throw new GLSymbolNotFoundError("Symbol not found: glStencilFuncSeparate");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glStencilFuncSeparate", face, func, ref, mask); }
        Handles.MH_glStencilFuncSeparate.invokeExact(handles.PFN_glStencilFuncSeparate, face, func, ref, mask); }
        catch (Throwable e) { throw new RuntimeException("error in StencilFuncSeparate", e); }
    }

    /// Invokes `glStencilMaskSeparate`.
    /// ```
    /// void glStencilMaskSeparate((unsigned int) GLenum face, (unsigned int) GLuint mask);
    /// ```
    public void StencilMaskSeparate(int face, int mask) {
        if (MemoryUtil.isNullPointer(handles.PFN_glStencilMaskSeparate)) throw new GLSymbolNotFoundError("Symbol not found: glStencilMaskSeparate");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glStencilMaskSeparate", face, mask); }
        Handles.MH_glStencilMaskSeparate.invokeExact(handles.PFN_glStencilMaskSeparate, face, mask); }
        catch (Throwable e) { throw new RuntimeException("error in StencilMaskSeparate", e); }
    }

    /// Invokes `glAttachShader`.
    /// ```
    /// void glAttachShader((unsigned int) GLuint program, (unsigned int) GLuint shader);
    /// ```
    public void AttachShader(int program, int shader) {
        if (MemoryUtil.isNullPointer(handles.PFN_glAttachShader)) throw new GLSymbolNotFoundError("Symbol not found: glAttachShader");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glAttachShader", program, shader); }
        Handles.MH_glAttachShader.invokeExact(handles.PFN_glAttachShader, program, shader); }
        catch (Throwable e) { throw new RuntimeException("error in AttachShader", e); }
    }

    /// Invokes `glBindAttribLocation`.
    /// ```
    /// void glBindAttribLocation((unsigned int) GLuint program, (unsigned int) GLuint index, const GLchar* name);
    /// ```
    public void BindAttribLocation(int program, int index, @NonNull MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindAttribLocation)) throw new GLSymbolNotFoundError("Symbol not found: glBindAttribLocation");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindAttribLocation", program, index, name); }
        Handles.MH_glBindAttribLocation.invokeExact(handles.PFN_glBindAttribLocation, program, index, name); }
        catch (Throwable e) { throw new RuntimeException("error in BindAttribLocation", e); }
    }

    /// Invokes `glCompileShader`.
    /// ```
    /// void glCompileShader((unsigned int) GLuint shader);
    /// ```
    public void CompileShader(int shader) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompileShader)) throw new GLSymbolNotFoundError("Symbol not found: glCompileShader");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCompileShader", shader); }
        Handles.MH_glCompileShader.invokeExact(handles.PFN_glCompileShader, shader); }
        catch (Throwable e) { throw new RuntimeException("error in CompileShader", e); }
    }

    /// Invokes `glCreateProgram`.
    /// ```
    /// (unsigned int) GLuint glCreateProgram();
    /// ```
    public int CreateProgram() {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateProgram)) throw new GLSymbolNotFoundError("Symbol not found: glCreateProgram");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCreateProgram"); }
        return (int) Handles.MH_glCreateProgram.invokeExact(handles.PFN_glCreateProgram); }
        catch (Throwable e) { throw new RuntimeException("error in CreateProgram", e); }
    }

    /// Invokes `glCreateShader`.
    /// ```
    /// (unsigned int) GLuint glCreateShader((unsigned int) GLenum type);
    /// ```
    public int CreateShader(int type) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateShader)) throw new GLSymbolNotFoundError("Symbol not found: glCreateShader");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCreateShader", type); }
        return (int) Handles.MH_glCreateShader.invokeExact(handles.PFN_glCreateShader, type); }
        catch (Throwable e) { throw new RuntimeException("error in CreateShader", e); }
    }

    /// Invokes `glDeleteProgram`.
    /// ```
    /// void glDeleteProgram((unsigned int) GLuint program);
    /// ```
    public void DeleteProgram(int program) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteProgram)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteProgram");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteProgram", program); }
        Handles.MH_glDeleteProgram.invokeExact(handles.PFN_glDeleteProgram, program); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteProgram", e); }
    }

    /// Invokes `glDeleteShader`.
    /// ```
    /// void glDeleteShader((unsigned int) GLuint shader);
    /// ```
    public void DeleteShader(int shader) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteShader)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteShader");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteShader", shader); }
        Handles.MH_glDeleteShader.invokeExact(handles.PFN_glDeleteShader, shader); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteShader", e); }
    }

    /// Invokes `glDetachShader`.
    /// ```
    /// void glDetachShader((unsigned int) GLuint program, (unsigned int) GLuint shader);
    /// ```
    public void DetachShader(int program, int shader) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDetachShader)) throw new GLSymbolNotFoundError("Symbol not found: glDetachShader");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDetachShader", program, shader); }
        Handles.MH_glDetachShader.invokeExact(handles.PFN_glDetachShader, program, shader); }
        catch (Throwable e) { throw new RuntimeException("error in DetachShader", e); }
    }

    /// Invokes `glDisableVertexAttribArray`.
    /// ```
    /// void glDisableVertexAttribArray((unsigned int) GLuint index);
    /// ```
    public void DisableVertexAttribArray(int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDisableVertexAttribArray)) throw new GLSymbolNotFoundError("Symbol not found: glDisableVertexAttribArray");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDisableVertexAttribArray", index); }
        Handles.MH_glDisableVertexAttribArray.invokeExact(handles.PFN_glDisableVertexAttribArray, index); }
        catch (Throwable e) { throw new RuntimeException("error in DisableVertexAttribArray", e); }
    }

    /// Invokes `glEnableVertexAttribArray`.
    /// ```
    /// void glEnableVertexAttribArray((unsigned int) GLuint index);
    /// ```
    public void EnableVertexAttribArray(int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEnableVertexAttribArray)) throw new GLSymbolNotFoundError("Symbol not found: glEnableVertexAttribArray");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEnableVertexAttribArray", index); }
        Handles.MH_glEnableVertexAttribArray.invokeExact(handles.PFN_glEnableVertexAttribArray, index); }
        catch (Throwable e) { throw new RuntimeException("error in EnableVertexAttribArray", e); }
    }

    /// Invokes `glGetActiveAttrib`.
    /// ```
    /// void glGetActiveAttrib((unsigned int) GLuint program, (unsigned int) GLuint index, (int) GLsizei bufSize, GLsizei* length, GLint* size, GLenum* type, GLchar* name);
    /// ```
    public void GetActiveAttrib(int program, int index, int bufSize, @NonNull MemorySegment length, @NonNull MemorySegment size, @NonNull MemorySegment type, @NonNull MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetActiveAttrib)) throw new GLSymbolNotFoundError("Symbol not found: glGetActiveAttrib");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetActiveAttrib", program, index, bufSize, length, size, type, name); }
        Handles.MH_glGetActiveAttrib.invokeExact(handles.PFN_glGetActiveAttrib, program, index, bufSize, length, size, type, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetActiveAttrib", e); }
    }

    /// Invokes `glGetActiveUniform`.
    /// ```
    /// void glGetActiveUniform((unsigned int) GLuint program, (unsigned int) GLuint index, (int) GLsizei bufSize, GLsizei* length, GLint* size, GLenum* type, GLchar* name);
    /// ```
    public void GetActiveUniform(int program, int index, int bufSize, @NonNull MemorySegment length, @NonNull MemorySegment size, @NonNull MemorySegment type, @NonNull MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetActiveUniform)) throw new GLSymbolNotFoundError("Symbol not found: glGetActiveUniform");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetActiveUniform", program, index, bufSize, length, size, type, name); }
        Handles.MH_glGetActiveUniform.invokeExact(handles.PFN_glGetActiveUniform, program, index, bufSize, length, size, type, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetActiveUniform", e); }
    }

    /// Invokes `glGetAttachedShaders`.
    /// ```
    /// void glGetAttachedShaders((unsigned int) GLuint program, (int) GLsizei maxCount, GLsizei* count, GLuint* shaders);
    /// ```
    public void GetAttachedShaders(int program, int maxCount, @NonNull MemorySegment count, @NonNull MemorySegment shaders) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetAttachedShaders)) throw new GLSymbolNotFoundError("Symbol not found: glGetAttachedShaders");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetAttachedShaders", program, maxCount, count, shaders); }
        Handles.MH_glGetAttachedShaders.invokeExact(handles.PFN_glGetAttachedShaders, program, maxCount, count, shaders); }
        catch (Throwable e) { throw new RuntimeException("error in GetAttachedShaders", e); }
    }

    /// Invokes `glGetAttribLocation`.
    /// ```
    /// (int) GLint glGetAttribLocation((unsigned int) GLuint program, const GLchar* name);
    /// ```
    public int GetAttribLocation(int program, @NonNull MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetAttribLocation)) throw new GLSymbolNotFoundError("Symbol not found: glGetAttribLocation");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetAttribLocation", program, name); }
        return (int) Handles.MH_glGetAttribLocation.invokeExact(handles.PFN_glGetAttribLocation, program, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetAttribLocation", e); }
    }

    /// Invokes `glGetProgramiv`.
    /// ```
    /// void glGetProgramiv((unsigned int) GLuint program, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetProgramiv(int program, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramiv", program, pname, params); }
        Handles.MH_glGetProgramiv.invokeExact(handles.PFN_glGetProgramiv, program, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramiv", e); }
    }

    /// Invokes `glGetProgramInfoLog`.
    /// ```
    /// void glGetProgramInfoLog((unsigned int) GLuint program, (int) GLsizei bufSize, GLsizei* length, GLchar* infoLog);
    /// ```
    public void GetProgramInfoLog(int program, int bufSize, @NonNull MemorySegment length, @NonNull MemorySegment infoLog) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramInfoLog)) throw new GLSymbolNotFoundError("Symbol not found: glGetProgramInfoLog");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetProgramInfoLog", program, bufSize, length, infoLog); }
        Handles.MH_glGetProgramInfoLog.invokeExact(handles.PFN_glGetProgramInfoLog, program, bufSize, length, infoLog); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramInfoLog", e); }
    }

    /// Invokes `glGetShaderiv`.
    /// ```
    /// void glGetShaderiv((unsigned int) GLuint shader, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetShaderiv(int shader, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetShaderiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetShaderiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetShaderiv", shader, pname, params); }
        Handles.MH_glGetShaderiv.invokeExact(handles.PFN_glGetShaderiv, shader, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetShaderiv", e); }
    }

    /// Invokes `glGetShaderInfoLog`.
    /// ```
    /// void glGetShaderInfoLog((unsigned int) GLuint shader, (int) GLsizei bufSize, GLsizei* length, GLchar* infoLog);
    /// ```
    public void GetShaderInfoLog(int shader, int bufSize, @NonNull MemorySegment length, @NonNull MemorySegment infoLog) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetShaderInfoLog)) throw new GLSymbolNotFoundError("Symbol not found: glGetShaderInfoLog");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetShaderInfoLog", shader, bufSize, length, infoLog); }
        Handles.MH_glGetShaderInfoLog.invokeExact(handles.PFN_glGetShaderInfoLog, shader, bufSize, length, infoLog); }
        catch (Throwable e) { throw new RuntimeException("error in GetShaderInfoLog", e); }
    }

    /// Invokes `glGetShaderSource`.
    /// ```
    /// void glGetShaderSource((unsigned int) GLuint shader, (int) GLsizei bufSize, GLsizei* length, GLchar* source);
    /// ```
    public void GetShaderSource(int shader, int bufSize, @NonNull MemorySegment length, @NonNull MemorySegment source) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetShaderSource)) throw new GLSymbolNotFoundError("Symbol not found: glGetShaderSource");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetShaderSource", shader, bufSize, length, source); }
        Handles.MH_glGetShaderSource.invokeExact(handles.PFN_glGetShaderSource, shader, bufSize, length, source); }
        catch (Throwable e) { throw new RuntimeException("error in GetShaderSource", e); }
    }

    /// Invokes `glGetUniformLocation`.
    /// ```
    /// (int) GLint glGetUniformLocation((unsigned int) GLuint program, const GLchar* name);
    /// ```
    public int GetUniformLocation(int program, @NonNull MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetUniformLocation)) throw new GLSymbolNotFoundError("Symbol not found: glGetUniformLocation");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetUniformLocation", program, name); }
        return (int) Handles.MH_glGetUniformLocation.invokeExact(handles.PFN_glGetUniformLocation, program, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetUniformLocation", e); }
    }

    /// Invokes `glGetUniformfv`.
    /// ```
    /// void glGetUniformfv((unsigned int) GLuint program, (int) GLint location, GLfloat* params);
    /// ```
    public void GetUniformfv(int program, int location, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetUniformfv)) throw new GLSymbolNotFoundError("Symbol not found: glGetUniformfv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetUniformfv", program, location, params); }
        Handles.MH_glGetUniformfv.invokeExact(handles.PFN_glGetUniformfv, program, location, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetUniformfv", e); }
    }

    /// Invokes `glGetUniformiv`.
    /// ```
    /// void glGetUniformiv((unsigned int) GLuint program, (int) GLint location, GLint* params);
    /// ```
    public void GetUniformiv(int program, int location, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetUniformiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetUniformiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetUniformiv", program, location, params); }
        Handles.MH_glGetUniformiv.invokeExact(handles.PFN_glGetUniformiv, program, location, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetUniformiv", e); }
    }

    /// Invokes `glGetVertexAttribdv`.
    /// ```
    /// void glGetVertexAttribdv((unsigned int) GLuint index, (unsigned int) GLenum pname, GLdouble* params);
    /// ```
    public void GetVertexAttribdv(int index, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribdv)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribdv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexAttribdv", index, pname, params); }
        Handles.MH_glGetVertexAttribdv.invokeExact(handles.PFN_glGetVertexAttribdv, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribdv", e); }
    }

    /// Invokes `glGetVertexAttribfv`.
    /// ```
    /// void glGetVertexAttribfv((unsigned int) GLuint index, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetVertexAttribfv(int index, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribfv)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribfv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexAttribfv", index, pname, params); }
        Handles.MH_glGetVertexAttribfv.invokeExact(handles.PFN_glGetVertexAttribfv, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribfv", e); }
    }

    /// Invokes `glGetVertexAttribiv`.
    /// ```
    /// void glGetVertexAttribiv((unsigned int) GLuint index, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetVertexAttribiv(int index, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexAttribiv", index, pname, params); }
        Handles.MH_glGetVertexAttribiv.invokeExact(handles.PFN_glGetVertexAttribiv, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribiv", e); }
    }

    /// Invokes `glGetVertexAttribPointerv`.
    /// ```
    /// void glGetVertexAttribPointerv((unsigned int) GLuint index, (unsigned int) GLenum pname, void** pointer);
    /// ```
    public void GetVertexAttribPointerv(int index, int pname, @NonNull MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribPointerv)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribPointerv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexAttribPointerv", index, pname, pointer); }
        Handles.MH_glGetVertexAttribPointerv.invokeExact(handles.PFN_glGetVertexAttribPointerv, index, pname, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribPointerv", e); }
    }

    /// Invokes `glIsProgram`.
    /// ```
    /// GLboolean glIsProgram((unsigned int) GLuint program);
    /// ```
    public boolean IsProgram(int program) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsProgram)) throw new GLSymbolNotFoundError("Symbol not found: glIsProgram");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsProgram", program); }
        return (((byte) Handles.MH_glIsProgram.invokeExact(handles.PFN_glIsProgram, program)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsProgram", e); }
    }

    /// Invokes `glIsShader`.
    /// ```
    /// GLboolean glIsShader((unsigned int) GLuint shader);
    /// ```
    public boolean IsShader(int shader) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsShader)) throw new GLSymbolNotFoundError("Symbol not found: glIsShader");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsShader", shader); }
        return (((byte) Handles.MH_glIsShader.invokeExact(handles.PFN_glIsShader, shader)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsShader", e); }
    }

    /// Invokes `glLinkProgram`.
    /// ```
    /// void glLinkProgram((unsigned int) GLuint program);
    /// ```
    public void LinkProgram(int program) {
        if (MemoryUtil.isNullPointer(handles.PFN_glLinkProgram)) throw new GLSymbolNotFoundError("Symbol not found: glLinkProgram");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glLinkProgram", program); }
        Handles.MH_glLinkProgram.invokeExact(handles.PFN_glLinkProgram, program); }
        catch (Throwable e) { throw new RuntimeException("error in LinkProgram", e); }
    }

    /// Invokes `glShaderSource`.
    /// ```
    /// void glShaderSource((unsigned int) GLuint shader, (int) GLsizei count, const GLchar* const * string, const GLint* length);
    /// ```
    public void ShaderSource(int shader, int count, @NonNull MemorySegment string, @NonNull MemorySegment length) {
        if (MemoryUtil.isNullPointer(handles.PFN_glShaderSource)) throw new GLSymbolNotFoundError("Symbol not found: glShaderSource");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glShaderSource", shader, count, string, length); }
        Handles.MH_glShaderSource.invokeExact(handles.PFN_glShaderSource, shader, count, string, length); }
        catch (Throwable e) { throw new RuntimeException("error in ShaderSource", e); }
    }

    /// Invokes `glUseProgram`.
    /// ```
    /// void glUseProgram((unsigned int) GLuint program);
    /// ```
    public void UseProgram(int program) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUseProgram)) throw new GLSymbolNotFoundError("Symbol not found: glUseProgram");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUseProgram", program); }
        Handles.MH_glUseProgram.invokeExact(handles.PFN_glUseProgram, program); }
        catch (Throwable e) { throw new RuntimeException("error in UseProgram", e); }
    }

    /// Invokes `glUniform1f`.
    /// ```
    /// void glUniform1f((int) GLint location, ((float) khronos_float_t) GLfloat v0);
    /// ```
    public void Uniform1f(int location, float v0) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform1f)) throw new GLSymbolNotFoundError("Symbol not found: glUniform1f");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform1f", location, v0); }
        Handles.MH_glUniform1f.invokeExact(handles.PFN_glUniform1f, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform1f", e); }
    }

    /// Invokes `glUniform2f`.
    /// ```
    /// void glUniform2f((int) GLint location, ((float) khronos_float_t) GLfloat v0, ((float) khronos_float_t) GLfloat v1);
    /// ```
    public void Uniform2f(int location, float v0, float v1) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform2f)) throw new GLSymbolNotFoundError("Symbol not found: glUniform2f");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform2f", location, v0, v1); }
        Handles.MH_glUniform2f.invokeExact(handles.PFN_glUniform2f, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform2f", e); }
    }

    /// Invokes `glUniform3f`.
    /// ```
    /// void glUniform3f((int) GLint location, ((float) khronos_float_t) GLfloat v0, ((float) khronos_float_t) GLfloat v1, ((float) khronos_float_t) GLfloat v2);
    /// ```
    public void Uniform3f(int location, float v0, float v1, float v2) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform3f)) throw new GLSymbolNotFoundError("Symbol not found: glUniform3f");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform3f", location, v0, v1, v2); }
        Handles.MH_glUniform3f.invokeExact(handles.PFN_glUniform3f, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform3f", e); }
    }

    /// Invokes `glUniform4f`.
    /// ```
    /// void glUniform4f((int) GLint location, ((float) khronos_float_t) GLfloat v0, ((float) khronos_float_t) GLfloat v1, ((float) khronos_float_t) GLfloat v2, ((float) khronos_float_t) GLfloat v3);
    /// ```
    public void Uniform4f(int location, float v0, float v1, float v2, float v3) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform4f)) throw new GLSymbolNotFoundError("Symbol not found: glUniform4f");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform4f", location, v0, v1, v2, v3); }
        Handles.MH_glUniform4f.invokeExact(handles.PFN_glUniform4f, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform4f", e); }
    }

    /// Invokes `glUniform1i`.
    /// ```
    /// void glUniform1i((int) GLint location, (int) GLint v0);
    /// ```
    public void Uniform1i(int location, int v0) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform1i)) throw new GLSymbolNotFoundError("Symbol not found: glUniform1i");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform1i", location, v0); }
        Handles.MH_glUniform1i.invokeExact(handles.PFN_glUniform1i, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform1i", e); }
    }

    /// Invokes `glUniform2i`.
    /// ```
    /// void glUniform2i((int) GLint location, (int) GLint v0, (int) GLint v1);
    /// ```
    public void Uniform2i(int location, int v0, int v1) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform2i)) throw new GLSymbolNotFoundError("Symbol not found: glUniform2i");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform2i", location, v0, v1); }
        Handles.MH_glUniform2i.invokeExact(handles.PFN_glUniform2i, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform2i", e); }
    }

    /// Invokes `glUniform3i`.
    /// ```
    /// void glUniform3i((int) GLint location, (int) GLint v0, (int) GLint v1, (int) GLint v2);
    /// ```
    public void Uniform3i(int location, int v0, int v1, int v2) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform3i)) throw new GLSymbolNotFoundError("Symbol not found: glUniform3i");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform3i", location, v0, v1, v2); }
        Handles.MH_glUniform3i.invokeExact(handles.PFN_glUniform3i, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform3i", e); }
    }

    /// Invokes `glUniform4i`.
    /// ```
    /// void glUniform4i((int) GLint location, (int) GLint v0, (int) GLint v1, (int) GLint v2, (int) GLint v3);
    /// ```
    public void Uniform4i(int location, int v0, int v1, int v2, int v3) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform4i)) throw new GLSymbolNotFoundError("Symbol not found: glUniform4i");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform4i", location, v0, v1, v2, v3); }
        Handles.MH_glUniform4i.invokeExact(handles.PFN_glUniform4i, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform4i", e); }
    }

    /// Invokes `glUniform1fv`.
    /// ```
    /// void glUniform1fv((int) GLint location, (int) GLsizei count, const GLfloat* value);
    /// ```
    public void Uniform1fv(int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform1fv)) throw new GLSymbolNotFoundError("Symbol not found: glUniform1fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform1fv", location, count, value); }
        Handles.MH_glUniform1fv.invokeExact(handles.PFN_glUniform1fv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform1fv", e); }
    }

    /// Invokes `glUniform2fv`.
    /// ```
    /// void glUniform2fv((int) GLint location, (int) GLsizei count, const GLfloat* value);
    /// ```
    public void Uniform2fv(int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform2fv)) throw new GLSymbolNotFoundError("Symbol not found: glUniform2fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform2fv", location, count, value); }
        Handles.MH_glUniform2fv.invokeExact(handles.PFN_glUniform2fv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform2fv", e); }
    }

    /// Invokes `glUniform3fv`.
    /// ```
    /// void glUniform3fv((int) GLint location, (int) GLsizei count, const GLfloat* value);
    /// ```
    public void Uniform3fv(int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform3fv)) throw new GLSymbolNotFoundError("Symbol not found: glUniform3fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform3fv", location, count, value); }
        Handles.MH_glUniform3fv.invokeExact(handles.PFN_glUniform3fv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform3fv", e); }
    }

    /// Invokes `glUniform4fv`.
    /// ```
    /// void glUniform4fv((int) GLint location, (int) GLsizei count, const GLfloat* value);
    /// ```
    public void Uniform4fv(int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform4fv)) throw new GLSymbolNotFoundError("Symbol not found: glUniform4fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform4fv", location, count, value); }
        Handles.MH_glUniform4fv.invokeExact(handles.PFN_glUniform4fv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform4fv", e); }
    }

    /// Invokes `glUniform1iv`.
    /// ```
    /// void glUniform1iv((int) GLint location, (int) GLsizei count, const GLint* value);
    /// ```
    public void Uniform1iv(int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform1iv)) throw new GLSymbolNotFoundError("Symbol not found: glUniform1iv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform1iv", location, count, value); }
        Handles.MH_glUniform1iv.invokeExact(handles.PFN_glUniform1iv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform1iv", e); }
    }

    /// Invokes `glUniform2iv`.
    /// ```
    /// void glUniform2iv((int) GLint location, (int) GLsizei count, const GLint* value);
    /// ```
    public void Uniform2iv(int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform2iv)) throw new GLSymbolNotFoundError("Symbol not found: glUniform2iv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform2iv", location, count, value); }
        Handles.MH_glUniform2iv.invokeExact(handles.PFN_glUniform2iv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform2iv", e); }
    }

    /// Invokes `glUniform3iv`.
    /// ```
    /// void glUniform3iv((int) GLint location, (int) GLsizei count, const GLint* value);
    /// ```
    public void Uniform3iv(int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform3iv)) throw new GLSymbolNotFoundError("Symbol not found: glUniform3iv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform3iv", location, count, value); }
        Handles.MH_glUniform3iv.invokeExact(handles.PFN_glUniform3iv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform3iv", e); }
    }

    /// Invokes `glUniform4iv`.
    /// ```
    /// void glUniform4iv((int) GLint location, (int) GLsizei count, const GLint* value);
    /// ```
    public void Uniform4iv(int location, int count, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform4iv)) throw new GLSymbolNotFoundError("Symbol not found: glUniform4iv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform4iv", location, count, value); }
        Handles.MH_glUniform4iv.invokeExact(handles.PFN_glUniform4iv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform4iv", e); }
    }

    /// Invokes `glUniformMatrix2fv`.
    /// ```
    /// void glUniformMatrix2fv((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void UniformMatrix2fv(int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix2fv)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix2fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix2fv", location, count, transpose, value); }
        Handles.MH_glUniformMatrix2fv.invokeExact(handles.PFN_glUniformMatrix2fv, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix2fv", e); }
    }

    /// Invokes `glUniformMatrix3fv`.
    /// ```
    /// void glUniformMatrix3fv((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void UniformMatrix3fv(int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix3fv)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix3fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix3fv", location, count, transpose, value); }
        Handles.MH_glUniformMatrix3fv.invokeExact(handles.PFN_glUniformMatrix3fv, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix3fv", e); }
    }

    /// Invokes `glUniformMatrix4fv`.
    /// ```
    /// void glUniformMatrix4fv((int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void UniformMatrix4fv(int location, int count, boolean transpose, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniformMatrix4fv)) throw new GLSymbolNotFoundError("Symbol not found: glUniformMatrix4fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniformMatrix4fv", location, count, transpose, value); }
        Handles.MH_glUniformMatrix4fv.invokeExact(handles.PFN_glUniformMatrix4fv, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in UniformMatrix4fv", e); }
    }

    /// Invokes `glValidateProgram`.
    /// ```
    /// void glValidateProgram((unsigned int) GLuint program);
    /// ```
    public void ValidateProgram(int program) {
        if (MemoryUtil.isNullPointer(handles.PFN_glValidateProgram)) throw new GLSymbolNotFoundError("Symbol not found: glValidateProgram");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glValidateProgram", program); }
        Handles.MH_glValidateProgram.invokeExact(handles.PFN_glValidateProgram, program); }
        catch (Throwable e) { throw new RuntimeException("error in ValidateProgram", e); }
    }

    /// Invokes `glVertexAttrib1d`.
    /// ```
    /// void glVertexAttrib1d((unsigned int) GLuint index, (double) GLdouble x);
    /// ```
    public void VertexAttrib1d(int index, double x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1d)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib1d");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib1d", index, x); }
        Handles.MH_glVertexAttrib1d.invokeExact(handles.PFN_glVertexAttrib1d, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1d", e); }
    }

    /// Invokes `glVertexAttrib1dv`.
    /// ```
    /// void glVertexAttrib1dv((unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttrib1dv(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1dv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib1dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib1dv", index, v); }
        Handles.MH_glVertexAttrib1dv.invokeExact(handles.PFN_glVertexAttrib1dv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1dv", e); }
    }

    /// Invokes `glVertexAttrib1f`.
    /// ```
    /// void glVertexAttrib1f((unsigned int) GLuint index, ((float) khronos_float_t) GLfloat x);
    /// ```
    public void VertexAttrib1f(int index, float x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1f)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib1f");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib1f", index, x); }
        Handles.MH_glVertexAttrib1f.invokeExact(handles.PFN_glVertexAttrib1f, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1f", e); }
    }

    /// Invokes `glVertexAttrib1fv`.
    /// ```
    /// void glVertexAttrib1fv((unsigned int) GLuint index, const GLfloat* v);
    /// ```
    public void VertexAttrib1fv(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1fv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib1fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib1fv", index, v); }
        Handles.MH_glVertexAttrib1fv.invokeExact(handles.PFN_glVertexAttrib1fv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1fv", e); }
    }

    /// Invokes `glVertexAttrib1s`.
    /// ```
    /// void glVertexAttrib1s((unsigned int) GLuint index, ((signed short) khronos_int16_t) GLshort x);
    /// ```
    public void VertexAttrib1s(int index, short x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1s)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib1s");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib1s", index, x); }
        Handles.MH_glVertexAttrib1s.invokeExact(handles.PFN_glVertexAttrib1s, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1s", e); }
    }

    /// Invokes `glVertexAttrib1sv`.
    /// ```
    /// void glVertexAttrib1sv((unsigned int) GLuint index, const GLshort* v);
    /// ```
    public void VertexAttrib1sv(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib1sv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib1sv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib1sv", index, v); }
        Handles.MH_glVertexAttrib1sv.invokeExact(handles.PFN_glVertexAttrib1sv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib1sv", e); }
    }

    /// Invokes `glVertexAttrib2d`.
    /// ```
    /// void glVertexAttrib2d((unsigned int) GLuint index, (double) GLdouble x, (double) GLdouble y);
    /// ```
    public void VertexAttrib2d(int index, double x, double y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2d)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib2d");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib2d", index, x, y); }
        Handles.MH_glVertexAttrib2d.invokeExact(handles.PFN_glVertexAttrib2d, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2d", e); }
    }

    /// Invokes `glVertexAttrib2dv`.
    /// ```
    /// void glVertexAttrib2dv((unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttrib2dv(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2dv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib2dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib2dv", index, v); }
        Handles.MH_glVertexAttrib2dv.invokeExact(handles.PFN_glVertexAttrib2dv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2dv", e); }
    }

    /// Invokes `glVertexAttrib2f`.
    /// ```
    /// void glVertexAttrib2f((unsigned int) GLuint index, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y);
    /// ```
    public void VertexAttrib2f(int index, float x, float y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2f)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib2f");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib2f", index, x, y); }
        Handles.MH_glVertexAttrib2f.invokeExact(handles.PFN_glVertexAttrib2f, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2f", e); }
    }

    /// Invokes `glVertexAttrib2fv`.
    /// ```
    /// void glVertexAttrib2fv((unsigned int) GLuint index, const GLfloat* v);
    /// ```
    public void VertexAttrib2fv(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2fv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib2fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib2fv", index, v); }
        Handles.MH_glVertexAttrib2fv.invokeExact(handles.PFN_glVertexAttrib2fv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2fv", e); }
    }

    /// Invokes `glVertexAttrib2s`.
    /// ```
    /// void glVertexAttrib2s((unsigned int) GLuint index, ((signed short) khronos_int16_t) GLshort x, ((signed short) khronos_int16_t) GLshort y);
    /// ```
    public void VertexAttrib2s(int index, short x, short y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2s)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib2s");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib2s", index, x, y); }
        Handles.MH_glVertexAttrib2s.invokeExact(handles.PFN_glVertexAttrib2s, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2s", e); }
    }

    /// Invokes `glVertexAttrib2sv`.
    /// ```
    /// void glVertexAttrib2sv((unsigned int) GLuint index, const GLshort* v);
    /// ```
    public void VertexAttrib2sv(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib2sv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib2sv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib2sv", index, v); }
        Handles.MH_glVertexAttrib2sv.invokeExact(handles.PFN_glVertexAttrib2sv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib2sv", e); }
    }

    /// Invokes `glVertexAttrib3d`.
    /// ```
    /// void glVertexAttrib3d((unsigned int) GLuint index, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z);
    /// ```
    public void VertexAttrib3d(int index, double x, double y, double z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3d)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib3d");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib3d", index, x, y, z); }
        Handles.MH_glVertexAttrib3d.invokeExact(handles.PFN_glVertexAttrib3d, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3d", e); }
    }

    /// Invokes `glVertexAttrib3dv`.
    /// ```
    /// void glVertexAttrib3dv((unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttrib3dv(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3dv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib3dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib3dv", index, v); }
        Handles.MH_glVertexAttrib3dv.invokeExact(handles.PFN_glVertexAttrib3dv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3dv", e); }
    }

    /// Invokes `glVertexAttrib3f`.
    /// ```
    /// void glVertexAttrib3f((unsigned int) GLuint index, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void VertexAttrib3f(int index, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3f)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib3f");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib3f", index, x, y, z); }
        Handles.MH_glVertexAttrib3f.invokeExact(handles.PFN_glVertexAttrib3f, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3f", e); }
    }

    /// Invokes `glVertexAttrib3fv`.
    /// ```
    /// void glVertexAttrib3fv((unsigned int) GLuint index, const GLfloat* v);
    /// ```
    public void VertexAttrib3fv(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3fv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib3fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib3fv", index, v); }
        Handles.MH_glVertexAttrib3fv.invokeExact(handles.PFN_glVertexAttrib3fv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3fv", e); }
    }

    /// Invokes `glVertexAttrib3s`.
    /// ```
    /// void glVertexAttrib3s((unsigned int) GLuint index, ((signed short) khronos_int16_t) GLshort x, ((signed short) khronos_int16_t) GLshort y, ((signed short) khronos_int16_t) GLshort z);
    /// ```
    public void VertexAttrib3s(int index, short x, short y, short z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3s)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib3s");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib3s", index, x, y, z); }
        Handles.MH_glVertexAttrib3s.invokeExact(handles.PFN_glVertexAttrib3s, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3s", e); }
    }

    /// Invokes `glVertexAttrib3sv`.
    /// ```
    /// void glVertexAttrib3sv((unsigned int) GLuint index, const GLshort* v);
    /// ```
    public void VertexAttrib3sv(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib3sv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib3sv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib3sv", index, v); }
        Handles.MH_glVertexAttrib3sv.invokeExact(handles.PFN_glVertexAttrib3sv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib3sv", e); }
    }

    /// Invokes `glVertexAttrib4Nbv`.
    /// ```
    /// void glVertexAttrib4Nbv((unsigned int) GLuint index, const GLbyte* v);
    /// ```
    public void VertexAttrib4Nbv(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4Nbv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4Nbv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4Nbv", index, v); }
        Handles.MH_glVertexAttrib4Nbv.invokeExact(handles.PFN_glVertexAttrib4Nbv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4Nbv", e); }
    }

    /// Invokes `glVertexAttrib4Niv`.
    /// ```
    /// void glVertexAttrib4Niv((unsigned int) GLuint index, const GLint* v);
    /// ```
    public void VertexAttrib4Niv(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4Niv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4Niv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4Niv", index, v); }
        Handles.MH_glVertexAttrib4Niv.invokeExact(handles.PFN_glVertexAttrib4Niv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4Niv", e); }
    }

    /// Invokes `glVertexAttrib4Nsv`.
    /// ```
    /// void glVertexAttrib4Nsv((unsigned int) GLuint index, const GLshort* v);
    /// ```
    public void VertexAttrib4Nsv(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4Nsv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4Nsv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4Nsv", index, v); }
        Handles.MH_glVertexAttrib4Nsv.invokeExact(handles.PFN_glVertexAttrib4Nsv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4Nsv", e); }
    }

    /// Invokes `glVertexAttrib4Nub`.
    /// ```
    /// void glVertexAttrib4Nub((unsigned int) GLuint index, ((unsigned char) khronos_uint8_t) GLubyte x, ((unsigned char) khronos_uint8_t) GLubyte y, ((unsigned char) khronos_uint8_t) GLubyte z, ((unsigned char) khronos_uint8_t) GLubyte w);
    /// ```
    public void VertexAttrib4Nub(int index, byte x, byte y, byte z, byte w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4Nub)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4Nub");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4Nub", index, x, y, z, w); }
        Handles.MH_glVertexAttrib4Nub.invokeExact(handles.PFN_glVertexAttrib4Nub, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4Nub", e); }
    }

    /// Invokes `glVertexAttrib4Nubv`.
    /// ```
    /// void glVertexAttrib4Nubv((unsigned int) GLuint index, const GLubyte* v);
    /// ```
    public void VertexAttrib4Nubv(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4Nubv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4Nubv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4Nubv", index, v); }
        Handles.MH_glVertexAttrib4Nubv.invokeExact(handles.PFN_glVertexAttrib4Nubv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4Nubv", e); }
    }

    /// Invokes `glVertexAttrib4Nuiv`.
    /// ```
    /// void glVertexAttrib4Nuiv((unsigned int) GLuint index, const GLuint* v);
    /// ```
    public void VertexAttrib4Nuiv(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4Nuiv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4Nuiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4Nuiv", index, v); }
        Handles.MH_glVertexAttrib4Nuiv.invokeExact(handles.PFN_glVertexAttrib4Nuiv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4Nuiv", e); }
    }

    /// Invokes `glVertexAttrib4Nusv`.
    /// ```
    /// void glVertexAttrib4Nusv((unsigned int) GLuint index, const GLushort* v);
    /// ```
    public void VertexAttrib4Nusv(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4Nusv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4Nusv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4Nusv", index, v); }
        Handles.MH_glVertexAttrib4Nusv.invokeExact(handles.PFN_glVertexAttrib4Nusv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4Nusv", e); }
    }

    /// Invokes `glVertexAttrib4bv`.
    /// ```
    /// void glVertexAttrib4bv((unsigned int) GLuint index, const GLbyte* v);
    /// ```
    public void VertexAttrib4bv(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4bv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4bv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4bv", index, v); }
        Handles.MH_glVertexAttrib4bv.invokeExact(handles.PFN_glVertexAttrib4bv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4bv", e); }
    }

    /// Invokes `glVertexAttrib4d`.
    /// ```
    /// void glVertexAttrib4d((unsigned int) GLuint index, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z, (double) GLdouble w);
    /// ```
    public void VertexAttrib4d(int index, double x, double y, double z, double w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4d)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4d");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4d", index, x, y, z, w); }
        Handles.MH_glVertexAttrib4d.invokeExact(handles.PFN_glVertexAttrib4d, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4d", e); }
    }

    /// Invokes `glVertexAttrib4dv`.
    /// ```
    /// void glVertexAttrib4dv((unsigned int) GLuint index, const GLdouble* v);
    /// ```
    public void VertexAttrib4dv(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4dv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4dv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4dv", index, v); }
        Handles.MH_glVertexAttrib4dv.invokeExact(handles.PFN_glVertexAttrib4dv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4dv", e); }
    }

    /// Invokes `glVertexAttrib4f`.
    /// ```
    /// void glVertexAttrib4f((unsigned int) GLuint index, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z, ((float) khronos_float_t) GLfloat w);
    /// ```
    public void VertexAttrib4f(int index, float x, float y, float z, float w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4f)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4f");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4f", index, x, y, z, w); }
        Handles.MH_glVertexAttrib4f.invokeExact(handles.PFN_glVertexAttrib4f, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4f", e); }
    }

    /// Invokes `glVertexAttrib4fv`.
    /// ```
    /// void glVertexAttrib4fv((unsigned int) GLuint index, const GLfloat* v);
    /// ```
    public void VertexAttrib4fv(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4fv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4fv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4fv", index, v); }
        Handles.MH_glVertexAttrib4fv.invokeExact(handles.PFN_glVertexAttrib4fv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4fv", e); }
    }

    /// Invokes `glVertexAttrib4iv`.
    /// ```
    /// void glVertexAttrib4iv((unsigned int) GLuint index, const GLint* v);
    /// ```
    public void VertexAttrib4iv(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4iv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4iv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4iv", index, v); }
        Handles.MH_glVertexAttrib4iv.invokeExact(handles.PFN_glVertexAttrib4iv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4iv", e); }
    }

    /// Invokes `glVertexAttrib4s`.
    /// ```
    /// void glVertexAttrib4s((unsigned int) GLuint index, ((signed short) khronos_int16_t) GLshort x, ((signed short) khronos_int16_t) GLshort y, ((signed short) khronos_int16_t) GLshort z, ((signed short) khronos_int16_t) GLshort w);
    /// ```
    public void VertexAttrib4s(int index, short x, short y, short z, short w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4s)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4s");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4s", index, x, y, z, w); }
        Handles.MH_glVertexAttrib4s.invokeExact(handles.PFN_glVertexAttrib4s, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4s", e); }
    }

    /// Invokes `glVertexAttrib4sv`.
    /// ```
    /// void glVertexAttrib4sv((unsigned int) GLuint index, const GLshort* v);
    /// ```
    public void VertexAttrib4sv(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4sv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4sv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4sv", index, v); }
        Handles.MH_glVertexAttrib4sv.invokeExact(handles.PFN_glVertexAttrib4sv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4sv", e); }
    }

    /// Invokes `glVertexAttrib4ubv`.
    /// ```
    /// void glVertexAttrib4ubv((unsigned int) GLuint index, const GLubyte* v);
    /// ```
    public void VertexAttrib4ubv(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4ubv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4ubv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4ubv", index, v); }
        Handles.MH_glVertexAttrib4ubv.invokeExact(handles.PFN_glVertexAttrib4ubv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4ubv", e); }
    }

    /// Invokes `glVertexAttrib4uiv`.
    /// ```
    /// void glVertexAttrib4uiv((unsigned int) GLuint index, const GLuint* v);
    /// ```
    public void VertexAttrib4uiv(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4uiv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4uiv", index, v); }
        Handles.MH_glVertexAttrib4uiv.invokeExact(handles.PFN_glVertexAttrib4uiv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4uiv", e); }
    }

    /// Invokes `glVertexAttrib4usv`.
    /// ```
    /// void glVertexAttrib4usv((unsigned int) GLuint index, const GLushort* v);
    /// ```
    public void VertexAttrib4usv(int index, @NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttrib4usv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttrib4usv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttrib4usv", index, v); }
        Handles.MH_glVertexAttrib4usv.invokeExact(handles.PFN_glVertexAttrib4usv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttrib4usv", e); }
    }

    /// Invokes `glVertexAttribPointer`.
    /// ```
    /// void glVertexAttribPointer((unsigned int) GLuint index, (int) GLint size, (unsigned int) GLenum type, GLboolean normalized, (int) GLsizei stride, const void* pointer);
    /// ```
    public void VertexAttribPointer(int index, int size, int type, boolean normalized, int stride, @NonNull MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribPointer)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribPointer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribPointer", index, size, type, normalized, stride, pointer); }
        Handles.MH_glVertexAttribPointer.invokeExact(handles.PFN_glVertexAttribPointer, index, size, type, ((normalized) ? (byte)1 : (byte)0), stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribPointer", e); }
    }

}

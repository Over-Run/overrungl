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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

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
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glBlendEquationSeparate = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDrawBuffers = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glStencilOpSeparate = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glStencilFuncSeparate = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glStencilMaskSeparate = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glAttachShader = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glBindAttribLocation = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCompileShader = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glCreateProgram = FunctionDescriptor.of(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glCreateShader = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDeleteProgram = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDeleteShader = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDetachShader = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDisableVertexAttribArray = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glEnableVertexAttribArray = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetActiveAttrib = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetActiveUniform = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetAttachedShaders = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetAttribLocation = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetProgramiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetProgramInfoLog = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetShaderiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetShaderInfoLog = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetShaderSource = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetUniformLocation = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetUniformfv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetUniformiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetVertexAttribdv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetVertexAttribfv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetVertexAttribiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetVertexAttribPointerv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glIsProgram = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glIsShader = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glLinkProgram = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glShaderSource = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUseProgram = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glUniform1f = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glUniform2f = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glUniform3f = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glUniform4f = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glUniform1i = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glUniform2i = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glUniform3i = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glUniform4i = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glUniform1fv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniform2fv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniform3fv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniform4fv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniform1iv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniform2iv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniform3iv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniform4iv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniformMatrix2fv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniformMatrix3fv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glUniformMatrix4fv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glValidateProgram = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexAttrib1d = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glVertexAttrib1dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttrib1f = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glVertexAttrib1fv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttrib1s = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT);
        public static final FunctionDescriptor FD_glVertexAttrib1sv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttrib2d = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glVertexAttrib2dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttrib2f = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glVertexAttrib2fv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttrib2s = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT);
        public static final FunctionDescriptor FD_glVertexAttrib2sv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttrib3d = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glVertexAttrib3dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttrib3f = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glVertexAttrib3fv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttrib3s = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT);
        public static final FunctionDescriptor FD_glVertexAttrib3sv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttrib4Nbv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttrib4Niv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttrib4Nsv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttrib4Nub = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE);
        public static final FunctionDescriptor FD_glVertexAttrib4Nubv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttrib4Nuiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttrib4Nusv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttrib4bv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttrib4d = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glVertexAttrib4dv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttrib4f = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glVertexAttrib4fv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttrib4iv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttrib4s = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT);
        public static final FunctionDescriptor FD_glVertexAttrib4sv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttrib4ubv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttrib4uiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttrib4usv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribPointer = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glBlendEquationSeparate,
            FD_glDrawBuffers,
            FD_glStencilOpSeparate,
            FD_glStencilFuncSeparate,
            FD_glStencilMaskSeparate,
            FD_glAttachShader,
            FD_glBindAttribLocation,
            FD_glCompileShader,
            FD_glCreateProgram,
            FD_glCreateShader,
            FD_glDeleteProgram,
            FD_glDeleteShader,
            FD_glDetachShader,
            FD_glDisableVertexAttribArray,
            FD_glEnableVertexAttribArray,
            FD_glGetActiveAttrib,
            FD_glGetActiveUniform,
            FD_glGetAttachedShaders,
            FD_glGetAttribLocation,
            FD_glGetProgramiv,
            FD_glGetProgramInfoLog,
            FD_glGetShaderiv,
            FD_glGetShaderInfoLog,
            FD_glGetShaderSource,
            FD_glGetUniformLocation,
            FD_glGetUniformfv,
            FD_glGetUniformiv,
            FD_glGetVertexAttribdv,
            FD_glGetVertexAttribfv,
            FD_glGetVertexAttribiv,
            FD_glGetVertexAttribPointerv,
            FD_glIsProgram,
            FD_glIsShader,
            FD_glLinkProgram,
            FD_glShaderSource,
            FD_glUseProgram,
            FD_glUniform1f,
            FD_glUniform2f,
            FD_glUniform3f,
            FD_glUniform4f,
            FD_glUniform1i,
            FD_glUniform2i,
            FD_glUniform3i,
            FD_glUniform4i,
            FD_glUniform1fv,
            FD_glUniform2fv,
            FD_glUniform3fv,
            FD_glUniform4fv,
            FD_glUniform1iv,
            FD_glUniform2iv,
            FD_glUniform3iv,
            FD_glUniform4iv,
            FD_glUniformMatrix2fv,
            FD_glUniformMatrix3fv,
            FD_glUniformMatrix4fv,
            FD_glValidateProgram,
            FD_glVertexAttrib1d,
            FD_glVertexAttrib1dv,
            FD_glVertexAttrib1f,
            FD_glVertexAttrib1fv,
            FD_glVertexAttrib1s,
            FD_glVertexAttrib1sv,
            FD_glVertexAttrib2d,
            FD_glVertexAttrib2dv,
            FD_glVertexAttrib2f,
            FD_glVertexAttrib2fv,
            FD_glVertexAttrib2s,
            FD_glVertexAttrib2sv,
            FD_glVertexAttrib3d,
            FD_glVertexAttrib3dv,
            FD_glVertexAttrib3f,
            FD_glVertexAttrib3fv,
            FD_glVertexAttrib3s,
            FD_glVertexAttrib3sv,
            FD_glVertexAttrib4Nbv,
            FD_glVertexAttrib4Niv,
            FD_glVertexAttrib4Nsv,
            FD_glVertexAttrib4Nub,
            FD_glVertexAttrib4Nubv,
            FD_glVertexAttrib4Nuiv,
            FD_glVertexAttrib4Nusv,
            FD_glVertexAttrib4bv,
            FD_glVertexAttrib4d,
            FD_glVertexAttrib4dv,
            FD_glVertexAttrib4f,
            FD_glVertexAttrib4fv,
            FD_glVertexAttrib4iv,
            FD_glVertexAttrib4s,
            FD_glVertexAttrib4sv,
            FD_glVertexAttrib4ubv,
            FD_glVertexAttrib4uiv,
            FD_glVertexAttrib4usv,
            FD_glVertexAttribPointer
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glBlendEquationSeparate = RuntimeHelper.downcall(Descriptors.FD_glBlendEquationSeparate);
        public static final MethodHandle MH_glDrawBuffers = RuntimeHelper.downcall(Descriptors.FD_glDrawBuffers);
        public static final MethodHandle MH_glStencilOpSeparate = RuntimeHelper.downcall(Descriptors.FD_glStencilOpSeparate);
        public static final MethodHandle MH_glStencilFuncSeparate = RuntimeHelper.downcall(Descriptors.FD_glStencilFuncSeparate);
        public static final MethodHandle MH_glStencilMaskSeparate = RuntimeHelper.downcall(Descriptors.FD_glStencilMaskSeparate);
        public static final MethodHandle MH_glAttachShader = RuntimeHelper.downcall(Descriptors.FD_glAttachShader);
        public static final MethodHandle MH_glBindAttribLocation = RuntimeHelper.downcall(Descriptors.FD_glBindAttribLocation);
        public static final MethodHandle MH_glCompileShader = RuntimeHelper.downcall(Descriptors.FD_glCompileShader);
        public static final MethodHandle MH_glCreateProgram = RuntimeHelper.downcall(Descriptors.FD_glCreateProgram);
        public static final MethodHandle MH_glCreateShader = RuntimeHelper.downcall(Descriptors.FD_glCreateShader);
        public static final MethodHandle MH_glDeleteProgram = RuntimeHelper.downcall(Descriptors.FD_glDeleteProgram);
        public static final MethodHandle MH_glDeleteShader = RuntimeHelper.downcall(Descriptors.FD_glDeleteShader);
        public static final MethodHandle MH_glDetachShader = RuntimeHelper.downcall(Descriptors.FD_glDetachShader);
        public static final MethodHandle MH_glDisableVertexAttribArray = RuntimeHelper.downcall(Descriptors.FD_glDisableVertexAttribArray);
        public static final MethodHandle MH_glEnableVertexAttribArray = RuntimeHelper.downcall(Descriptors.FD_glEnableVertexAttribArray);
        public static final MethodHandle MH_glGetActiveAttrib = RuntimeHelper.downcall(Descriptors.FD_glGetActiveAttrib);
        public static final MethodHandle MH_glGetActiveUniform = RuntimeHelper.downcall(Descriptors.FD_glGetActiveUniform);
        public static final MethodHandle MH_glGetAttachedShaders = RuntimeHelper.downcall(Descriptors.FD_glGetAttachedShaders);
        public static final MethodHandle MH_glGetAttribLocation = RuntimeHelper.downcall(Descriptors.FD_glGetAttribLocation);
        public static final MethodHandle MH_glGetProgramiv = RuntimeHelper.downcall(Descriptors.FD_glGetProgramiv);
        public static final MethodHandle MH_glGetProgramInfoLog = RuntimeHelper.downcall(Descriptors.FD_glGetProgramInfoLog);
        public static final MethodHandle MH_glGetShaderiv = RuntimeHelper.downcall(Descriptors.FD_glGetShaderiv);
        public static final MethodHandle MH_glGetShaderInfoLog = RuntimeHelper.downcall(Descriptors.FD_glGetShaderInfoLog);
        public static final MethodHandle MH_glGetShaderSource = RuntimeHelper.downcall(Descriptors.FD_glGetShaderSource);
        public static final MethodHandle MH_glGetUniformLocation = RuntimeHelper.downcall(Descriptors.FD_glGetUniformLocation);
        public static final MethodHandle MH_glGetUniformfv = RuntimeHelper.downcall(Descriptors.FD_glGetUniformfv);
        public static final MethodHandle MH_glGetUniformiv = RuntimeHelper.downcall(Descriptors.FD_glGetUniformiv);
        public static final MethodHandle MH_glGetVertexAttribdv = RuntimeHelper.downcall(Descriptors.FD_glGetVertexAttribdv);
        public static final MethodHandle MH_glGetVertexAttribfv = RuntimeHelper.downcall(Descriptors.FD_glGetVertexAttribfv);
        public static final MethodHandle MH_glGetVertexAttribiv = RuntimeHelper.downcall(Descriptors.FD_glGetVertexAttribiv);
        public static final MethodHandle MH_glGetVertexAttribPointerv = RuntimeHelper.downcall(Descriptors.FD_glGetVertexAttribPointerv);
        public static final MethodHandle MH_glIsProgram = RuntimeHelper.downcall(Descriptors.FD_glIsProgram);
        public static final MethodHandle MH_glIsShader = RuntimeHelper.downcall(Descriptors.FD_glIsShader);
        public static final MethodHandle MH_glLinkProgram = RuntimeHelper.downcall(Descriptors.FD_glLinkProgram);
        public static final MethodHandle MH_glShaderSource = RuntimeHelper.downcall(Descriptors.FD_glShaderSource);
        public static final MethodHandle MH_glUseProgram = RuntimeHelper.downcall(Descriptors.FD_glUseProgram);
        public static final MethodHandle MH_glUniform1f = RuntimeHelper.downcall(Descriptors.FD_glUniform1f);
        public static final MethodHandle MH_glUniform2f = RuntimeHelper.downcall(Descriptors.FD_glUniform2f);
        public static final MethodHandle MH_glUniform3f = RuntimeHelper.downcall(Descriptors.FD_glUniform3f);
        public static final MethodHandle MH_glUniform4f = RuntimeHelper.downcall(Descriptors.FD_glUniform4f);
        public static final MethodHandle MH_glUniform1i = RuntimeHelper.downcall(Descriptors.FD_glUniform1i);
        public static final MethodHandle MH_glUniform2i = RuntimeHelper.downcall(Descriptors.FD_glUniform2i);
        public static final MethodHandle MH_glUniform3i = RuntimeHelper.downcall(Descriptors.FD_glUniform3i);
        public static final MethodHandle MH_glUniform4i = RuntimeHelper.downcall(Descriptors.FD_glUniform4i);
        public static final MethodHandle MH_glUniform1fv = RuntimeHelper.downcall(Descriptors.FD_glUniform1fv);
        public static final MethodHandle MH_glUniform2fv = RuntimeHelper.downcall(Descriptors.FD_glUniform2fv);
        public static final MethodHandle MH_glUniform3fv = RuntimeHelper.downcall(Descriptors.FD_glUniform3fv);
        public static final MethodHandle MH_glUniform4fv = RuntimeHelper.downcall(Descriptors.FD_glUniform4fv);
        public static final MethodHandle MH_glUniform1iv = RuntimeHelper.downcall(Descriptors.FD_glUniform1iv);
        public static final MethodHandle MH_glUniform2iv = RuntimeHelper.downcall(Descriptors.FD_glUniform2iv);
        public static final MethodHandle MH_glUniform3iv = RuntimeHelper.downcall(Descriptors.FD_glUniform3iv);
        public static final MethodHandle MH_glUniform4iv = RuntimeHelper.downcall(Descriptors.FD_glUniform4iv);
        public static final MethodHandle MH_glUniformMatrix2fv = RuntimeHelper.downcall(Descriptors.FD_glUniformMatrix2fv);
        public static final MethodHandle MH_glUniformMatrix3fv = RuntimeHelper.downcall(Descriptors.FD_glUniformMatrix3fv);
        public static final MethodHandle MH_glUniformMatrix4fv = RuntimeHelper.downcall(Descriptors.FD_glUniformMatrix4fv);
        public static final MethodHandle MH_glValidateProgram = RuntimeHelper.downcall(Descriptors.FD_glValidateProgram);
        public static final MethodHandle MH_glVertexAttrib1d = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib1d);
        public static final MethodHandle MH_glVertexAttrib1dv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib1dv);
        public static final MethodHandle MH_glVertexAttrib1f = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib1f);
        public static final MethodHandle MH_glVertexAttrib1fv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib1fv);
        public static final MethodHandle MH_glVertexAttrib1s = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib1s);
        public static final MethodHandle MH_glVertexAttrib1sv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib1sv);
        public static final MethodHandle MH_glVertexAttrib2d = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib2d);
        public static final MethodHandle MH_glVertexAttrib2dv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib2dv);
        public static final MethodHandle MH_glVertexAttrib2f = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib2f);
        public static final MethodHandle MH_glVertexAttrib2fv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib2fv);
        public static final MethodHandle MH_glVertexAttrib2s = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib2s);
        public static final MethodHandle MH_glVertexAttrib2sv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib2sv);
        public static final MethodHandle MH_glVertexAttrib3d = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib3d);
        public static final MethodHandle MH_glVertexAttrib3dv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib3dv);
        public static final MethodHandle MH_glVertexAttrib3f = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib3f);
        public static final MethodHandle MH_glVertexAttrib3fv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib3fv);
        public static final MethodHandle MH_glVertexAttrib3s = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib3s);
        public static final MethodHandle MH_glVertexAttrib3sv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib3sv);
        public static final MethodHandle MH_glVertexAttrib4Nbv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib4Nbv);
        public static final MethodHandle MH_glVertexAttrib4Niv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib4Niv);
        public static final MethodHandle MH_glVertexAttrib4Nsv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib4Nsv);
        public static final MethodHandle MH_glVertexAttrib4Nub = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib4Nub);
        public static final MethodHandle MH_glVertexAttrib4Nubv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib4Nubv);
        public static final MethodHandle MH_glVertexAttrib4Nuiv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib4Nuiv);
        public static final MethodHandle MH_glVertexAttrib4Nusv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib4Nusv);
        public static final MethodHandle MH_glVertexAttrib4bv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib4bv);
        public static final MethodHandle MH_glVertexAttrib4d = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib4d);
        public static final MethodHandle MH_glVertexAttrib4dv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib4dv);
        public static final MethodHandle MH_glVertexAttrib4f = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib4f);
        public static final MethodHandle MH_glVertexAttrib4fv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib4fv);
        public static final MethodHandle MH_glVertexAttrib4iv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib4iv);
        public static final MethodHandle MH_glVertexAttrib4s = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib4s);
        public static final MethodHandle MH_glVertexAttrib4sv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib4sv);
        public static final MethodHandle MH_glVertexAttrib4ubv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib4ubv);
        public static final MethodHandle MH_glVertexAttrib4uiv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib4uiv);
        public static final MethodHandle MH_glVertexAttrib4usv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttrib4usv);
        public static final MethodHandle MH_glVertexAttribPointer = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribPointer);
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

    public void BlendEquationSeparate(@CType("GLenum") int modeRGB, @CType("GLenum") int modeAlpha) {
        if (Unmarshal.isNullPointer(handles.PFN_glBlendEquationSeparate)) throw new SymbolNotFoundError("Symbol not found: glBlendEquationSeparate");
        try { Handles.MH_glBlendEquationSeparate.invokeExact(handles.PFN_glBlendEquationSeparate, modeRGB, modeAlpha); }
        catch (Throwable e) { throw new RuntimeException("error in glBlendEquationSeparate", e); }
    }

    public void DrawBuffers(@CType("GLsizei") int n, @CType("const GLenum *") java.lang.foreign.MemorySegment bufs) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawBuffers)) throw new SymbolNotFoundError("Symbol not found: glDrawBuffers");
        try { Handles.MH_glDrawBuffers.invokeExact(handles.PFN_glDrawBuffers, n, bufs); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawBuffers", e); }
    }

    public void StencilOpSeparate(@CType("GLenum") int face, @CType("GLenum") int sfail, @CType("GLenum") int dpfail, @CType("GLenum") int dppass) {
        if (Unmarshal.isNullPointer(handles.PFN_glStencilOpSeparate)) throw new SymbolNotFoundError("Symbol not found: glStencilOpSeparate");
        try { Handles.MH_glStencilOpSeparate.invokeExact(handles.PFN_glStencilOpSeparate, face, sfail, dpfail, dppass); }
        catch (Throwable e) { throw new RuntimeException("error in glStencilOpSeparate", e); }
    }

    public void StencilFuncSeparate(@CType("GLenum") int face, @CType("GLenum") int func, @CType("GLint") int ref, @CType("GLuint") int mask) {
        if (Unmarshal.isNullPointer(handles.PFN_glStencilFuncSeparate)) throw new SymbolNotFoundError("Symbol not found: glStencilFuncSeparate");
        try { Handles.MH_glStencilFuncSeparate.invokeExact(handles.PFN_glStencilFuncSeparate, face, func, ref, mask); }
        catch (Throwable e) { throw new RuntimeException("error in glStencilFuncSeparate", e); }
    }

    public void StencilMaskSeparate(@CType("GLenum") int face, @CType("GLuint") int mask) {
        if (Unmarshal.isNullPointer(handles.PFN_glStencilMaskSeparate)) throw new SymbolNotFoundError("Symbol not found: glStencilMaskSeparate");
        try { Handles.MH_glStencilMaskSeparate.invokeExact(handles.PFN_glStencilMaskSeparate, face, mask); }
        catch (Throwable e) { throw new RuntimeException("error in glStencilMaskSeparate", e); }
    }

    public void AttachShader(@CType("GLuint") int program, @CType("GLuint") int shader) {
        if (Unmarshal.isNullPointer(handles.PFN_glAttachShader)) throw new SymbolNotFoundError("Symbol not found: glAttachShader");
        try { Handles.MH_glAttachShader.invokeExact(handles.PFN_glAttachShader, program, shader); }
        catch (Throwable e) { throw new RuntimeException("error in glAttachShader", e); }
    }

    public void BindAttribLocation(@CType("GLuint") int program, @CType("GLuint") int index, @CType("const GLchar *") java.lang.foreign.MemorySegment name) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindAttribLocation)) throw new SymbolNotFoundError("Symbol not found: glBindAttribLocation");
        try { Handles.MH_glBindAttribLocation.invokeExact(handles.PFN_glBindAttribLocation, program, index, name); }
        catch (Throwable e) { throw new RuntimeException("error in glBindAttribLocation", e); }
    }

    public void CompileShader(@CType("GLuint") int shader) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompileShader)) throw new SymbolNotFoundError("Symbol not found: glCompileShader");
        try { Handles.MH_glCompileShader.invokeExact(handles.PFN_glCompileShader, shader); }
        catch (Throwable e) { throw new RuntimeException("error in glCompileShader", e); }
    }

    public @CType("GLuint") int CreateProgram() {
        if (Unmarshal.isNullPointer(handles.PFN_glCreateProgram)) throw new SymbolNotFoundError("Symbol not found: glCreateProgram");
        try { return (int) Handles.MH_glCreateProgram.invokeExact(handles.PFN_glCreateProgram); }
        catch (Throwable e) { throw new RuntimeException("error in glCreateProgram", e); }
    }

    public @CType("GLuint") int CreateShader(@CType("GLenum") int type) {
        if (Unmarshal.isNullPointer(handles.PFN_glCreateShader)) throw new SymbolNotFoundError("Symbol not found: glCreateShader");
        try { return (int) Handles.MH_glCreateShader.invokeExact(handles.PFN_glCreateShader, type); }
        catch (Throwable e) { throw new RuntimeException("error in glCreateShader", e); }
    }

    public void DeleteProgram(@CType("GLuint") int program) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeleteProgram)) throw new SymbolNotFoundError("Symbol not found: glDeleteProgram");
        try { Handles.MH_glDeleteProgram.invokeExact(handles.PFN_glDeleteProgram, program); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteProgram", e); }
    }

    public void DeleteShader(@CType("GLuint") int shader) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeleteShader)) throw new SymbolNotFoundError("Symbol not found: glDeleteShader");
        try { Handles.MH_glDeleteShader.invokeExact(handles.PFN_glDeleteShader, shader); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteShader", e); }
    }

    public void DetachShader(@CType("GLuint") int program, @CType("GLuint") int shader) {
        if (Unmarshal.isNullPointer(handles.PFN_glDetachShader)) throw new SymbolNotFoundError("Symbol not found: glDetachShader");
        try { Handles.MH_glDetachShader.invokeExact(handles.PFN_glDetachShader, program, shader); }
        catch (Throwable e) { throw new RuntimeException("error in glDetachShader", e); }
    }

    public void DisableVertexAttribArray(@CType("GLuint") int index) {
        if (Unmarshal.isNullPointer(handles.PFN_glDisableVertexAttribArray)) throw new SymbolNotFoundError("Symbol not found: glDisableVertexAttribArray");
        try { Handles.MH_glDisableVertexAttribArray.invokeExact(handles.PFN_glDisableVertexAttribArray, index); }
        catch (Throwable e) { throw new RuntimeException("error in glDisableVertexAttribArray", e); }
    }

    public void EnableVertexAttribArray(@CType("GLuint") int index) {
        if (Unmarshal.isNullPointer(handles.PFN_glEnableVertexAttribArray)) throw new SymbolNotFoundError("Symbol not found: glEnableVertexAttribArray");
        try { Handles.MH_glEnableVertexAttribArray.invokeExact(handles.PFN_glEnableVertexAttribArray, index); }
        catch (Throwable e) { throw new RuntimeException("error in glEnableVertexAttribArray", e); }
    }

    public void GetActiveAttrib(@CType("GLuint") int program, @CType("GLuint") int index, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLint *") java.lang.foreign.MemorySegment size, @CType("GLenum *") java.lang.foreign.MemorySegment type, @CType("GLchar *") java.lang.foreign.MemorySegment name) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetActiveAttrib)) throw new SymbolNotFoundError("Symbol not found: glGetActiveAttrib");
        try { Handles.MH_glGetActiveAttrib.invokeExact(handles.PFN_glGetActiveAttrib, program, index, bufSize, length, size, type, name); }
        catch (Throwable e) { throw new RuntimeException("error in glGetActiveAttrib", e); }
    }

    public void GetActiveUniform(@CType("GLuint") int program, @CType("GLuint") int index, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLint *") java.lang.foreign.MemorySegment size, @CType("GLenum *") java.lang.foreign.MemorySegment type, @CType("GLchar *") java.lang.foreign.MemorySegment name) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetActiveUniform)) throw new SymbolNotFoundError("Symbol not found: glGetActiveUniform");
        try { Handles.MH_glGetActiveUniform.invokeExact(handles.PFN_glGetActiveUniform, program, index, bufSize, length, size, type, name); }
        catch (Throwable e) { throw new RuntimeException("error in glGetActiveUniform", e); }
    }

    public void GetAttachedShaders(@CType("GLuint") int program, @CType("GLsizei") int maxCount, @CType("GLsizei *") java.lang.foreign.MemorySegment count, @CType("GLuint *") java.lang.foreign.MemorySegment shaders) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetAttachedShaders)) throw new SymbolNotFoundError("Symbol not found: glGetAttachedShaders");
        try { Handles.MH_glGetAttachedShaders.invokeExact(handles.PFN_glGetAttachedShaders, program, maxCount, count, shaders); }
        catch (Throwable e) { throw new RuntimeException("error in glGetAttachedShaders", e); }
    }

    public @CType("GLint") int GetAttribLocation(@CType("GLuint") int program, @CType("const GLchar *") java.lang.foreign.MemorySegment name) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetAttribLocation)) throw new SymbolNotFoundError("Symbol not found: glGetAttribLocation");
        try { return (int) Handles.MH_glGetAttribLocation.invokeExact(handles.PFN_glGetAttribLocation, program, name); }
        catch (Throwable e) { throw new RuntimeException("error in glGetAttribLocation", e); }
    }

    public void GetProgramiv(@CType("GLuint") int program, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetProgramiv)) throw new SymbolNotFoundError("Symbol not found: glGetProgramiv");
        try { Handles.MH_glGetProgramiv.invokeExact(handles.PFN_glGetProgramiv, program, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramiv", e); }
    }

    public void GetProgramInfoLog(@CType("GLuint") int program, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLchar *") java.lang.foreign.MemorySegment infoLog) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetProgramInfoLog)) throw new SymbolNotFoundError("Symbol not found: glGetProgramInfoLog");
        try { Handles.MH_glGetProgramInfoLog.invokeExact(handles.PFN_glGetProgramInfoLog, program, bufSize, length, infoLog); }
        catch (Throwable e) { throw new RuntimeException("error in glGetProgramInfoLog", e); }
    }

    public void GetShaderiv(@CType("GLuint") int shader, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetShaderiv)) throw new SymbolNotFoundError("Symbol not found: glGetShaderiv");
        try { Handles.MH_glGetShaderiv.invokeExact(handles.PFN_glGetShaderiv, shader, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetShaderiv", e); }
    }

    public void GetShaderInfoLog(@CType("GLuint") int shader, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLchar *") java.lang.foreign.MemorySegment infoLog) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetShaderInfoLog)) throw new SymbolNotFoundError("Symbol not found: glGetShaderInfoLog");
        try { Handles.MH_glGetShaderInfoLog.invokeExact(handles.PFN_glGetShaderInfoLog, shader, bufSize, length, infoLog); }
        catch (Throwable e) { throw new RuntimeException("error in glGetShaderInfoLog", e); }
    }

    public void GetShaderSource(@CType("GLuint") int shader, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLchar *") java.lang.foreign.MemorySegment source) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetShaderSource)) throw new SymbolNotFoundError("Symbol not found: glGetShaderSource");
        try { Handles.MH_glGetShaderSource.invokeExact(handles.PFN_glGetShaderSource, shader, bufSize, length, source); }
        catch (Throwable e) { throw new RuntimeException("error in glGetShaderSource", e); }
    }

    public @CType("GLint") int GetUniformLocation(@CType("GLuint") int program, @CType("const GLchar *") java.lang.foreign.MemorySegment name) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetUniformLocation)) throw new SymbolNotFoundError("Symbol not found: glGetUniformLocation");
        try { return (int) Handles.MH_glGetUniformLocation.invokeExact(handles.PFN_glGetUniformLocation, program, name); }
        catch (Throwable e) { throw new RuntimeException("error in glGetUniformLocation", e); }
    }

    public void GetUniformfv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetUniformfv)) throw new SymbolNotFoundError("Symbol not found: glGetUniformfv");
        try { Handles.MH_glGetUniformfv.invokeExact(handles.PFN_glGetUniformfv, program, location, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetUniformfv", e); }
    }

    public void GetUniformiv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetUniformiv)) throw new SymbolNotFoundError("Symbol not found: glGetUniformiv");
        try { Handles.MH_glGetUniformiv.invokeExact(handles.PFN_glGetUniformiv, program, location, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetUniformiv", e); }
    }

    public void GetVertexAttribdv(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLdouble *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVertexAttribdv)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribdv");
        try { Handles.MH_glGetVertexAttribdv.invokeExact(handles.PFN_glGetVertexAttribdv, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribdv", e); }
    }

    public void GetVertexAttribfv(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVertexAttribfv)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribfv");
        try { Handles.MH_glGetVertexAttribfv.invokeExact(handles.PFN_glGetVertexAttribfv, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribfv", e); }
    }

    public void GetVertexAttribiv(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVertexAttribiv)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribiv");
        try { Handles.MH_glGetVertexAttribiv.invokeExact(handles.PFN_glGetVertexAttribiv, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribiv", e); }
    }

    public void GetVertexAttribPointerv(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("void **") java.lang.foreign.MemorySegment pointer) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVertexAttribPointerv)) throw new SymbolNotFoundError("Symbol not found: glGetVertexAttribPointerv");
        try { Handles.MH_glGetVertexAttribPointerv.invokeExact(handles.PFN_glGetVertexAttribPointerv, index, pname, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribPointerv", e); }
    }

    public @CType("GLboolean") boolean IsProgram(@CType("GLuint") int program) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsProgram)) throw new SymbolNotFoundError("Symbol not found: glIsProgram");
        try { return (boolean) Handles.MH_glIsProgram.invokeExact(handles.PFN_glIsProgram, program); }
        catch (Throwable e) { throw new RuntimeException("error in glIsProgram", e); }
    }

    public @CType("GLboolean") boolean IsShader(@CType("GLuint") int shader) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsShader)) throw new SymbolNotFoundError("Symbol not found: glIsShader");
        try { return (boolean) Handles.MH_glIsShader.invokeExact(handles.PFN_glIsShader, shader); }
        catch (Throwable e) { throw new RuntimeException("error in glIsShader", e); }
    }

    public void LinkProgram(@CType("GLuint") int program) {
        if (Unmarshal.isNullPointer(handles.PFN_glLinkProgram)) throw new SymbolNotFoundError("Symbol not found: glLinkProgram");
        try { Handles.MH_glLinkProgram.invokeExact(handles.PFN_glLinkProgram, program); }
        catch (Throwable e) { throw new RuntimeException("error in glLinkProgram", e); }
    }

    public void ShaderSource(@CType("GLuint") int shader, @CType("GLsizei") int count, @CType("const GLchar *const*") java.lang.foreign.MemorySegment string, @CType("const GLint *") java.lang.foreign.MemorySegment length) {
        if (Unmarshal.isNullPointer(handles.PFN_glShaderSource)) throw new SymbolNotFoundError("Symbol not found: glShaderSource");
        try { Handles.MH_glShaderSource.invokeExact(handles.PFN_glShaderSource, shader, count, string, length); }
        catch (Throwable e) { throw new RuntimeException("error in glShaderSource", e); }
    }

    public void UseProgram(@CType("GLuint") int program) {
        if (Unmarshal.isNullPointer(handles.PFN_glUseProgram)) throw new SymbolNotFoundError("Symbol not found: glUseProgram");
        try { Handles.MH_glUseProgram.invokeExact(handles.PFN_glUseProgram, program); }
        catch (Throwable e) { throw new RuntimeException("error in glUseProgram", e); }
    }

    public void Uniform1f(@CType("GLint") int location, @CType("GLfloat") float v0) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform1f)) throw new SymbolNotFoundError("Symbol not found: glUniform1f");
        try { Handles.MH_glUniform1f.invokeExact(handles.PFN_glUniform1f, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform1f", e); }
    }

    public void Uniform2f(@CType("GLint") int location, @CType("GLfloat") float v0, @CType("GLfloat") float v1) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform2f)) throw new SymbolNotFoundError("Symbol not found: glUniform2f");
        try { Handles.MH_glUniform2f.invokeExact(handles.PFN_glUniform2f, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform2f", e); }
    }

    public void Uniform3f(@CType("GLint") int location, @CType("GLfloat") float v0, @CType("GLfloat") float v1, @CType("GLfloat") float v2) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform3f)) throw new SymbolNotFoundError("Symbol not found: glUniform3f");
        try { Handles.MH_glUniform3f.invokeExact(handles.PFN_glUniform3f, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform3f", e); }
    }

    public void Uniform4f(@CType("GLint") int location, @CType("GLfloat") float v0, @CType("GLfloat") float v1, @CType("GLfloat") float v2, @CType("GLfloat") float v3) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform4f)) throw new SymbolNotFoundError("Symbol not found: glUniform4f");
        try { Handles.MH_glUniform4f.invokeExact(handles.PFN_glUniform4f, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform4f", e); }
    }

    public void Uniform1i(@CType("GLint") int location, @CType("GLint") int v0) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform1i)) throw new SymbolNotFoundError("Symbol not found: glUniform1i");
        try { Handles.MH_glUniform1i.invokeExact(handles.PFN_glUniform1i, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform1i", e); }
    }

    public void Uniform2i(@CType("GLint") int location, @CType("GLint") int v0, @CType("GLint") int v1) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform2i)) throw new SymbolNotFoundError("Symbol not found: glUniform2i");
        try { Handles.MH_glUniform2i.invokeExact(handles.PFN_glUniform2i, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform2i", e); }
    }

    public void Uniform3i(@CType("GLint") int location, @CType("GLint") int v0, @CType("GLint") int v1, @CType("GLint") int v2) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform3i)) throw new SymbolNotFoundError("Symbol not found: glUniform3i");
        try { Handles.MH_glUniform3i.invokeExact(handles.PFN_glUniform3i, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform3i", e); }
    }

    public void Uniform4i(@CType("GLint") int location, @CType("GLint") int v0, @CType("GLint") int v1, @CType("GLint") int v2, @CType("GLint") int v3) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform4i)) throw new SymbolNotFoundError("Symbol not found: glUniform4i");
        try { Handles.MH_glUniform4i.invokeExact(handles.PFN_glUniform4i, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform4i", e); }
    }

    public void Uniform1fv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform1fv)) throw new SymbolNotFoundError("Symbol not found: glUniform1fv");
        try { Handles.MH_glUniform1fv.invokeExact(handles.PFN_glUniform1fv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform1fv", e); }
    }

    public void Uniform2fv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform2fv)) throw new SymbolNotFoundError("Symbol not found: glUniform2fv");
        try { Handles.MH_glUniform2fv.invokeExact(handles.PFN_glUniform2fv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform2fv", e); }
    }

    public void Uniform3fv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform3fv)) throw new SymbolNotFoundError("Symbol not found: glUniform3fv");
        try { Handles.MH_glUniform3fv.invokeExact(handles.PFN_glUniform3fv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform3fv", e); }
    }

    public void Uniform4fv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform4fv)) throw new SymbolNotFoundError("Symbol not found: glUniform4fv");
        try { Handles.MH_glUniform4fv.invokeExact(handles.PFN_glUniform4fv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform4fv", e); }
    }

    public void Uniform1iv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform1iv)) throw new SymbolNotFoundError("Symbol not found: glUniform1iv");
        try { Handles.MH_glUniform1iv.invokeExact(handles.PFN_glUniform1iv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform1iv", e); }
    }

    public void Uniform2iv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform2iv)) throw new SymbolNotFoundError("Symbol not found: glUniform2iv");
        try { Handles.MH_glUniform2iv.invokeExact(handles.PFN_glUniform2iv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform2iv", e); }
    }

    public void Uniform3iv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform3iv)) throw new SymbolNotFoundError("Symbol not found: glUniform3iv");
        try { Handles.MH_glUniform3iv.invokeExact(handles.PFN_glUniform3iv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform3iv", e); }
    }

    public void Uniform4iv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniform4iv)) throw new SymbolNotFoundError("Symbol not found: glUniform4iv");
        try { Handles.MH_glUniform4iv.invokeExact(handles.PFN_glUniform4iv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniform4iv", e); }
    }

    public void UniformMatrix2fv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformMatrix2fv)) throw new SymbolNotFoundError("Symbol not found: glUniformMatrix2fv");
        try { Handles.MH_glUniformMatrix2fv.invokeExact(handles.PFN_glUniformMatrix2fv, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix2fv", e); }
    }

    public void UniformMatrix3fv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformMatrix3fv)) throw new SymbolNotFoundError("Symbol not found: glUniformMatrix3fv");
        try { Handles.MH_glUniformMatrix3fv.invokeExact(handles.PFN_glUniformMatrix3fv, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix3fv", e); }
    }

    public void UniformMatrix4fv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glUniformMatrix4fv)) throw new SymbolNotFoundError("Symbol not found: glUniformMatrix4fv");
        try { Handles.MH_glUniformMatrix4fv.invokeExact(handles.PFN_glUniformMatrix4fv, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glUniformMatrix4fv", e); }
    }

    public void ValidateProgram(@CType("GLuint") int program) {
        if (Unmarshal.isNullPointer(handles.PFN_glValidateProgram)) throw new SymbolNotFoundError("Symbol not found: glValidateProgram");
        try { Handles.MH_glValidateProgram.invokeExact(handles.PFN_glValidateProgram, program); }
        catch (Throwable e) { throw new RuntimeException("error in glValidateProgram", e); }
    }

    public void VertexAttrib1d(@CType("GLuint") int index, @CType("GLdouble") double x) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib1d)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib1d");
        try { Handles.MH_glVertexAttrib1d.invokeExact(handles.PFN_glVertexAttrib1d, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib1d", e); }
    }

    public void VertexAttrib1dv(@CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib1dv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib1dv");
        try { Handles.MH_glVertexAttrib1dv.invokeExact(handles.PFN_glVertexAttrib1dv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib1dv", e); }
    }

    public void VertexAttrib1f(@CType("GLuint") int index, @CType("GLfloat") float x) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib1f)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib1f");
        try { Handles.MH_glVertexAttrib1f.invokeExact(handles.PFN_glVertexAttrib1f, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib1f", e); }
    }

    public void VertexAttrib1fv(@CType("GLuint") int index, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib1fv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib1fv");
        try { Handles.MH_glVertexAttrib1fv.invokeExact(handles.PFN_glVertexAttrib1fv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib1fv", e); }
    }

    public void VertexAttrib1s(@CType("GLuint") int index, @CType("GLshort") short x) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib1s)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib1s");
        try { Handles.MH_glVertexAttrib1s.invokeExact(handles.PFN_glVertexAttrib1s, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib1s", e); }
    }

    public void VertexAttrib1sv(@CType("GLuint") int index, @CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib1sv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib1sv");
        try { Handles.MH_glVertexAttrib1sv.invokeExact(handles.PFN_glVertexAttrib1sv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib1sv", e); }
    }

    public void VertexAttrib2d(@CType("GLuint") int index, @CType("GLdouble") double x, @CType("GLdouble") double y) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib2d)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib2d");
        try { Handles.MH_glVertexAttrib2d.invokeExact(handles.PFN_glVertexAttrib2d, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib2d", e); }
    }

    public void VertexAttrib2dv(@CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib2dv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib2dv");
        try { Handles.MH_glVertexAttrib2dv.invokeExact(handles.PFN_glVertexAttrib2dv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib2dv", e); }
    }

    public void VertexAttrib2f(@CType("GLuint") int index, @CType("GLfloat") float x, @CType("GLfloat") float y) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib2f)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib2f");
        try { Handles.MH_glVertexAttrib2f.invokeExact(handles.PFN_glVertexAttrib2f, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib2f", e); }
    }

    public void VertexAttrib2fv(@CType("GLuint") int index, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib2fv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib2fv");
        try { Handles.MH_glVertexAttrib2fv.invokeExact(handles.PFN_glVertexAttrib2fv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib2fv", e); }
    }

    public void VertexAttrib2s(@CType("GLuint") int index, @CType("GLshort") short x, @CType("GLshort") short y) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib2s)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib2s");
        try { Handles.MH_glVertexAttrib2s.invokeExact(handles.PFN_glVertexAttrib2s, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib2s", e); }
    }

    public void VertexAttrib2sv(@CType("GLuint") int index, @CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib2sv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib2sv");
        try { Handles.MH_glVertexAttrib2sv.invokeExact(handles.PFN_glVertexAttrib2sv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib2sv", e); }
    }

    public void VertexAttrib3d(@CType("GLuint") int index, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib3d)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib3d");
        try { Handles.MH_glVertexAttrib3d.invokeExact(handles.PFN_glVertexAttrib3d, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib3d", e); }
    }

    public void VertexAttrib3dv(@CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib3dv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib3dv");
        try { Handles.MH_glVertexAttrib3dv.invokeExact(handles.PFN_glVertexAttrib3dv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib3dv", e); }
    }

    public void VertexAttrib3f(@CType("GLuint") int index, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib3f)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib3f");
        try { Handles.MH_glVertexAttrib3f.invokeExact(handles.PFN_glVertexAttrib3f, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib3f", e); }
    }

    public void VertexAttrib3fv(@CType("GLuint") int index, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib3fv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib3fv");
        try { Handles.MH_glVertexAttrib3fv.invokeExact(handles.PFN_glVertexAttrib3fv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib3fv", e); }
    }

    public void VertexAttrib3s(@CType("GLuint") int index, @CType("GLshort") short x, @CType("GLshort") short y, @CType("GLshort") short z) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib3s)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib3s");
        try { Handles.MH_glVertexAttrib3s.invokeExact(handles.PFN_glVertexAttrib3s, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib3s", e); }
    }

    public void VertexAttrib3sv(@CType("GLuint") int index, @CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib3sv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib3sv");
        try { Handles.MH_glVertexAttrib3sv.invokeExact(handles.PFN_glVertexAttrib3sv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib3sv", e); }
    }

    public void VertexAttrib4Nbv(@CType("GLuint") int index, @CType("const GLbyte *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4Nbv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4Nbv");
        try { Handles.MH_glVertexAttrib4Nbv.invokeExact(handles.PFN_glVertexAttrib4Nbv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4Nbv", e); }
    }

    public void VertexAttrib4Niv(@CType("GLuint") int index, @CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4Niv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4Niv");
        try { Handles.MH_glVertexAttrib4Niv.invokeExact(handles.PFN_glVertexAttrib4Niv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4Niv", e); }
    }

    public void VertexAttrib4Nsv(@CType("GLuint") int index, @CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4Nsv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4Nsv");
        try { Handles.MH_glVertexAttrib4Nsv.invokeExact(handles.PFN_glVertexAttrib4Nsv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4Nsv", e); }
    }

    public void VertexAttrib4Nub(@CType("GLuint") int index, @CType("GLubyte") byte x, @CType("GLubyte") byte y, @CType("GLubyte") byte z, @CType("GLubyte") byte w) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4Nub)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4Nub");
        try { Handles.MH_glVertexAttrib4Nub.invokeExact(handles.PFN_glVertexAttrib4Nub, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4Nub", e); }
    }

    public void VertexAttrib4Nubv(@CType("GLuint") int index, @CType("const GLubyte *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4Nubv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4Nubv");
        try { Handles.MH_glVertexAttrib4Nubv.invokeExact(handles.PFN_glVertexAttrib4Nubv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4Nubv", e); }
    }

    public void VertexAttrib4Nuiv(@CType("GLuint") int index, @CType("const GLuint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4Nuiv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4Nuiv");
        try { Handles.MH_glVertexAttrib4Nuiv.invokeExact(handles.PFN_glVertexAttrib4Nuiv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4Nuiv", e); }
    }

    public void VertexAttrib4Nusv(@CType("GLuint") int index, @CType("const GLushort *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4Nusv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4Nusv");
        try { Handles.MH_glVertexAttrib4Nusv.invokeExact(handles.PFN_glVertexAttrib4Nusv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4Nusv", e); }
    }

    public void VertexAttrib4bv(@CType("GLuint") int index, @CType("const GLbyte *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4bv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4bv");
        try { Handles.MH_glVertexAttrib4bv.invokeExact(handles.PFN_glVertexAttrib4bv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4bv", e); }
    }

    public void VertexAttrib4d(@CType("GLuint") int index, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z, @CType("GLdouble") double w) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4d)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4d");
        try { Handles.MH_glVertexAttrib4d.invokeExact(handles.PFN_glVertexAttrib4d, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4d", e); }
    }

    public void VertexAttrib4dv(@CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4dv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4dv");
        try { Handles.MH_glVertexAttrib4dv.invokeExact(handles.PFN_glVertexAttrib4dv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4dv", e); }
    }

    public void VertexAttrib4f(@CType("GLuint") int index, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z, @CType("GLfloat") float w) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4f)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4f");
        try { Handles.MH_glVertexAttrib4f.invokeExact(handles.PFN_glVertexAttrib4f, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4f", e); }
    }

    public void VertexAttrib4fv(@CType("GLuint") int index, @CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4fv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4fv");
        try { Handles.MH_glVertexAttrib4fv.invokeExact(handles.PFN_glVertexAttrib4fv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4fv", e); }
    }

    public void VertexAttrib4iv(@CType("GLuint") int index, @CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4iv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4iv");
        try { Handles.MH_glVertexAttrib4iv.invokeExact(handles.PFN_glVertexAttrib4iv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4iv", e); }
    }

    public void VertexAttrib4s(@CType("GLuint") int index, @CType("GLshort") short x, @CType("GLshort") short y, @CType("GLshort") short z, @CType("GLshort") short w) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4s)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4s");
        try { Handles.MH_glVertexAttrib4s.invokeExact(handles.PFN_glVertexAttrib4s, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4s", e); }
    }

    public void VertexAttrib4sv(@CType("GLuint") int index, @CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4sv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4sv");
        try { Handles.MH_glVertexAttrib4sv.invokeExact(handles.PFN_glVertexAttrib4sv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4sv", e); }
    }

    public void VertexAttrib4ubv(@CType("GLuint") int index, @CType("const GLubyte *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4ubv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4ubv");
        try { Handles.MH_glVertexAttrib4ubv.invokeExact(handles.PFN_glVertexAttrib4ubv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4ubv", e); }
    }

    public void VertexAttrib4uiv(@CType("GLuint") int index, @CType("const GLuint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4uiv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4uiv");
        try { Handles.MH_glVertexAttrib4uiv.invokeExact(handles.PFN_glVertexAttrib4uiv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4uiv", e); }
    }

    public void VertexAttrib4usv(@CType("GLuint") int index, @CType("const GLushort *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttrib4usv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttrib4usv");
        try { Handles.MH_glVertexAttrib4usv.invokeExact(handles.PFN_glVertexAttrib4usv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttrib4usv", e); }
    }

    public void VertexAttribPointer(@CType("GLuint") int index, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("GLsizei") int stride, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribPointer)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribPointer");
        try { Handles.MH_glVertexAttribPointer.invokeExact(handles.PFN_glVertexAttribPointer, index, size, type, normalized, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribPointer", e); }
    }

    // --- OverrunGL custom code ---
    public void BindAttribLocation(@CType("GLuint") int program, @CType("GLuint") int index, @CType("const GLchar *") String name) { try (var __stack = MemoryStack.pushLocal()) { BindAttribLocation(program, index, Marshal.marshal(__stack, name)); } }
    public int GetAttribLocation(@CType("GLuint") int program, @CType("const GLchar *") String name) { try (var __stack = MemoryStack.pushLocal()) { return GetAttribLocation(program, Marshal.marshal(__stack, name)); } }
    public int GetProgramiv(@CType("GLuint") int program, @CType("GLenum") int pname) { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); GetProgramiv(program, pname, p); return p.get(ValueLayout.JAVA_INT, 0); } }
    public String GetProgramInfoLog(@CType("GLuint") int program) { try (var __stack = MemoryStack.pushLocal()) { int sz = GetProgramiv(program, GL_INFO_LOG_LENGTH); if (sz == 0) return null; var p = __stack.allocate(ValueLayout.JAVA_BYTE, sz); GetProgramInfoLog(program, sz, MemorySegment.NULL, p); return Unmarshal.unmarshalAsString(p); } }
    public int GetShaderiv(@CType("GLuint") int shader, @CType("GLenum") int pname) { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); GetShaderiv(shader, pname, p); return p.get(ValueLayout.JAVA_INT, 0); } }
    public String GetShaderInfoLog(@CType("GLuint") int shader) { try (var __stack = MemoryStack.pushLocal()) { int sz = GetShaderiv(shader, GL_INFO_LOG_LENGTH); if (sz == 0) return null; var p = __stack.allocate(ValueLayout.JAVA_BYTE, sz); GetShaderInfoLog(shader, sz, MemorySegment.NULL, p); return Unmarshal.unmarshalAsString(p); } }
    public int GetUniformLocation(@CType("GLuint") int program, @CType("const GLchar *") String name) { try (var __stack = MemoryStack.pushLocal()) { return GetUniformLocation(program, Marshal.marshal(__stack, name)); } }
    public void ShaderSource(@CType("GLuint") int shader, String string) { try (var __stack = MemoryStack.pushLocal()) { ShaderSource(shader, 1, __stack.addresses(Marshal.marshal(__stack, string)), MemorySegment.NULL); } }
}

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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;

public class GL30 extends GL21 {
    public static final int GL_COMPARE_REF_TO_TEXTURE = 0x884E;
    public static final int GL_CLIP_DISTANCE0 = 0x3000;
    public static final int GL_CLIP_DISTANCE1 = 0x3001;
    public static final int GL_CLIP_DISTANCE2 = 0x3002;
    public static final int GL_CLIP_DISTANCE3 = 0x3003;
    public static final int GL_CLIP_DISTANCE4 = 0x3004;
    public static final int GL_CLIP_DISTANCE5 = 0x3005;
    public static final int GL_CLIP_DISTANCE6 = 0x3006;
    public static final int GL_CLIP_DISTANCE7 = 0x3007;
    public static final int GL_MAX_CLIP_DISTANCES = 0x0D32;
    public static final int GL_MAJOR_VERSION = 0x821B;
    public static final int GL_MINOR_VERSION = 0x821C;
    public static final int GL_NUM_EXTENSIONS = 0x821D;
    public static final int GL_CONTEXT_FLAGS = 0x821E;
    public static final int GL_COMPRESSED_RED = 0x8225;
    public static final int GL_COMPRESSED_RG = 0x8226;
    public static final int GL_CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT = 0x00000001;
    public static final int GL_RGBA32F = 0x8814;
    public static final int GL_RGB32F = 0x8815;
    public static final int GL_RGBA16F = 0x881A;
    public static final int GL_RGB16F = 0x881B;
    public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER = 0x88FD;
    public static final int GL_MAX_ARRAY_TEXTURE_LAYERS = 0x88FF;
    public static final int GL_MIN_PROGRAM_TEXEL_OFFSET = 0x8904;
    public static final int GL_MAX_PROGRAM_TEXEL_OFFSET = 0x8905;
    public static final int GL_CLAMP_READ_COLOR = 0x891C;
    public static final int GL_FIXED_ONLY = 0x891D;
    public static final int GL_MAX_VARYING_COMPONENTS = 0x8B4B;
    public static final int GL_TEXTURE_1D_ARRAY = 0x8C18;
    public static final int GL_PROXY_TEXTURE_1D_ARRAY = 0x8C19;
    public static final int GL_TEXTURE_2D_ARRAY = 0x8C1A;
    public static final int GL_PROXY_TEXTURE_2D_ARRAY = 0x8C1B;
    public static final int GL_TEXTURE_BINDING_1D_ARRAY = 0x8C1C;
    public static final int GL_TEXTURE_BINDING_2D_ARRAY = 0x8C1D;
    public static final int GL_R11F_G11F_B10F = 0x8C3A;
    public static final int GL_UNSIGNED_INT_10F_11F_11F_REV = 0x8C3B;
    public static final int GL_RGB9_E5 = 0x8C3D;
    public static final int GL_UNSIGNED_INT_5_9_9_9_REV = 0x8C3E;
    public static final int GL_TEXTURE_SHARED_SIZE = 0x8C3F;
    public static final int GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH = 0x8C76;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE = 0x8C7F;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS = 0x8C80;
    public static final int GL_TRANSFORM_FEEDBACK_VARYINGS = 0x8C83;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_START = 0x8C84;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE = 0x8C85;
    public static final int GL_PRIMITIVES_GENERATED = 0x8C87;
    public static final int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN = 0x8C88;
    public static final int GL_RASTERIZER_DISCARD = 0x8C89;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 0x8C8A;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS = 0x8C8B;
    public static final int GL_INTERLEAVED_ATTRIBS = 0x8C8C;
    public static final int GL_SEPARATE_ATTRIBS = 0x8C8D;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER = 0x8C8E;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING = 0x8C8F;
    public static final int GL_RGBA32UI = 0x8D70;
    public static final int GL_RGB32UI = 0x8D71;
    public static final int GL_RGBA16UI = 0x8D76;
    public static final int GL_RGB16UI = 0x8D77;
    public static final int GL_RGBA8UI = 0x8D7C;
    public static final int GL_RGB8UI = 0x8D7D;
    public static final int GL_RGBA32I = 0x8D82;
    public static final int GL_RGB32I = 0x8D83;
    public static final int GL_RGBA16I = 0x8D88;
    public static final int GL_RGB16I = 0x8D89;
    public static final int GL_RGBA8I = 0x8D8E;
    public static final int GL_RGB8I = 0x8D8F;
    public static final int GL_RED_INTEGER = 0x8D94;
    public static final int GL_GREEN_INTEGER = 0x8D95;
    public static final int GL_BLUE_INTEGER = 0x8D96;
    public static final int GL_RGB_INTEGER = 0x8D98;
    public static final int GL_RGBA_INTEGER = 0x8D99;
    public static final int GL_BGR_INTEGER = 0x8D9A;
    public static final int GL_BGRA_INTEGER = 0x8D9B;
    public static final int GL_SAMPLER_1D_ARRAY = 0x8DC0;
    public static final int GL_SAMPLER_2D_ARRAY = 0x8DC1;
    public static final int GL_SAMPLER_1D_ARRAY_SHADOW = 0x8DC3;
    public static final int GL_SAMPLER_2D_ARRAY_SHADOW = 0x8DC4;
    public static final int GL_SAMPLER_CUBE_SHADOW = 0x8DC5;
    public static final int GL_UNSIGNED_INT_VEC2 = 0x8DC6;
    public static final int GL_UNSIGNED_INT_VEC3 = 0x8DC7;
    public static final int GL_UNSIGNED_INT_VEC4 = 0x8DC8;
    public static final int GL_INT_SAMPLER_1D = 0x8DC9;
    public static final int GL_INT_SAMPLER_2D = 0x8DCA;
    public static final int GL_INT_SAMPLER_3D = 0x8DCB;
    public static final int GL_INT_SAMPLER_CUBE = 0x8DCC;
    public static final int GL_INT_SAMPLER_1D_ARRAY = 0x8DCE;
    public static final int GL_INT_SAMPLER_2D_ARRAY = 0x8DCF;
    public static final int GL_UNSIGNED_INT_SAMPLER_1D = 0x8DD1;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D = 0x8DD2;
    public static final int GL_UNSIGNED_INT_SAMPLER_3D = 0x8DD3;
    public static final int GL_UNSIGNED_INT_SAMPLER_CUBE = 0x8DD4;
    public static final int GL_UNSIGNED_INT_SAMPLER_1D_ARRAY = 0x8DD6;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_ARRAY = 0x8DD7;
    public static final int GL_QUERY_WAIT = 0x8E13;
    public static final int GL_QUERY_NO_WAIT = 0x8E14;
    public static final int GL_QUERY_BY_REGION_WAIT = 0x8E15;
    public static final int GL_QUERY_BY_REGION_NO_WAIT = 0x8E16;
    public static final int GL_BUFFER_ACCESS_FLAGS = 0x911F;
    public static final int GL_BUFFER_MAP_LENGTH = 0x9120;
    public static final int GL_BUFFER_MAP_OFFSET = 0x9121;
    public static final int GL_DEPTH_COMPONENT32F = 0x8CAC;
    public static final int GL_DEPTH32F_STENCIL8 = 0x8CAD;
    public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV = 0x8DAD;
    public static final int GL_INVALID_FRAMEBUFFER_OPERATION = 0x0506;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING = 0x8210;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE = 0x8211;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE = 0x8212;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE = 0x8213;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE = 0x8214;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE = 0x8215;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE = 0x8216;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE = 0x8217;
    public static final int GL_FRAMEBUFFER_DEFAULT = 0x8218;
    public static final int GL_FRAMEBUFFER_UNDEFINED = 0x8219;
    public static final int GL_DEPTH_STENCIL_ATTACHMENT = 0x821A;
    public static final int GL_MAX_RENDERBUFFER_SIZE = 0x84E8;
    public static final int GL_DEPTH_STENCIL = 0x84F9;
    public static final int GL_UNSIGNED_INT_24_8 = 0x84FA;
    public static final int GL_DEPTH24_STENCIL8 = 0x88F0;
    public static final int GL_TEXTURE_STENCIL_SIZE = 0x88F1;
    public static final int GL_TEXTURE_RED_TYPE = 0x8C10;
    public static final int GL_TEXTURE_GREEN_TYPE = 0x8C11;
    public static final int GL_TEXTURE_BLUE_TYPE = 0x8C12;
    public static final int GL_TEXTURE_ALPHA_TYPE = 0x8C13;
    public static final int GL_TEXTURE_DEPTH_TYPE = 0x8C16;
    public static final int GL_UNSIGNED_NORMALIZED = 0x8C17;
    public static final int GL_FRAMEBUFFER_BINDING = 0x8CA6;
    public static final int GL_DRAW_FRAMEBUFFER_BINDING = 0x8CA6;
    public static final int GL_RENDERBUFFER_BINDING = 0x8CA7;
    public static final int GL_READ_FRAMEBUFFER = 0x8CA8;
    public static final int GL_DRAW_FRAMEBUFFER = 0x8CA9;
    public static final int GL_READ_FRAMEBUFFER_BINDING = 0x8CAA;
    public static final int GL_RENDERBUFFER_SAMPLES = 0x8CAB;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 0x8CD0;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 0x8CD1;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 0x8CD2;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 0x8CD4;
    public static final int GL_FRAMEBUFFER_COMPLETE = 0x8CD5;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 0x8CD6;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x8CD7;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER = 0x8CDB;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER = 0x8CDC;
    public static final int GL_FRAMEBUFFER_UNSUPPORTED = 0x8CDD;
    public static final int GL_MAX_COLOR_ATTACHMENTS = 0x8CDF;
    public static final int GL_COLOR_ATTACHMENT0 = 0x8CE0;
    public static final int GL_COLOR_ATTACHMENT1 = 0x8CE1;
    public static final int GL_COLOR_ATTACHMENT2 = 0x8CE2;
    public static final int GL_COLOR_ATTACHMENT3 = 0x8CE3;
    public static final int GL_COLOR_ATTACHMENT4 = 0x8CE4;
    public static final int GL_COLOR_ATTACHMENT5 = 0x8CE5;
    public static final int GL_COLOR_ATTACHMENT6 = 0x8CE6;
    public static final int GL_COLOR_ATTACHMENT7 = 0x8CE7;
    public static final int GL_COLOR_ATTACHMENT8 = 0x8CE8;
    public static final int GL_COLOR_ATTACHMENT9 = 0x8CE9;
    public static final int GL_COLOR_ATTACHMENT10 = 0x8CEA;
    public static final int GL_COLOR_ATTACHMENT11 = 0x8CEB;
    public static final int GL_COLOR_ATTACHMENT12 = 0x8CEC;
    public static final int GL_COLOR_ATTACHMENT13 = 0x8CED;
    public static final int GL_COLOR_ATTACHMENT14 = 0x8CEE;
    public static final int GL_COLOR_ATTACHMENT15 = 0x8CEF;
    public static final int GL_COLOR_ATTACHMENT16 = 0x8CF0;
    public static final int GL_COLOR_ATTACHMENT17 = 0x8CF1;
    public static final int GL_COLOR_ATTACHMENT18 = 0x8CF2;
    public static final int GL_COLOR_ATTACHMENT19 = 0x8CF3;
    public static final int GL_COLOR_ATTACHMENT20 = 0x8CF4;
    public static final int GL_COLOR_ATTACHMENT21 = 0x8CF5;
    public static final int GL_COLOR_ATTACHMENT22 = 0x8CF6;
    public static final int GL_COLOR_ATTACHMENT23 = 0x8CF7;
    public static final int GL_COLOR_ATTACHMENT24 = 0x8CF8;
    public static final int GL_COLOR_ATTACHMENT25 = 0x8CF9;
    public static final int GL_COLOR_ATTACHMENT26 = 0x8CFA;
    public static final int GL_COLOR_ATTACHMENT27 = 0x8CFB;
    public static final int GL_COLOR_ATTACHMENT28 = 0x8CFC;
    public static final int GL_COLOR_ATTACHMENT29 = 0x8CFD;
    public static final int GL_COLOR_ATTACHMENT30 = 0x8CFE;
    public static final int GL_COLOR_ATTACHMENT31 = 0x8CFF;
    public static final int GL_DEPTH_ATTACHMENT = 0x8D00;
    public static final int GL_STENCIL_ATTACHMENT = 0x8D20;
    public static final int GL_FRAMEBUFFER = 0x8D40;
    public static final int GL_RENDERBUFFER = 0x8D41;
    public static final int GL_RENDERBUFFER_WIDTH = 0x8D42;
    public static final int GL_RENDERBUFFER_HEIGHT = 0x8D43;
    public static final int GL_RENDERBUFFER_INTERNAL_FORMAT = 0x8D44;
    public static final int GL_STENCIL_INDEX1 = 0x8D46;
    public static final int GL_STENCIL_INDEX4 = 0x8D47;
    public static final int GL_STENCIL_INDEX8 = 0x8D48;
    public static final int GL_STENCIL_INDEX16 = 0x8D49;
    public static final int GL_RENDERBUFFER_RED_SIZE = 0x8D50;
    public static final int GL_RENDERBUFFER_GREEN_SIZE = 0x8D51;
    public static final int GL_RENDERBUFFER_BLUE_SIZE = 0x8D52;
    public static final int GL_RENDERBUFFER_ALPHA_SIZE = 0x8D53;
    public static final int GL_RENDERBUFFER_DEPTH_SIZE = 0x8D54;
    public static final int GL_RENDERBUFFER_STENCIL_SIZE = 0x8D55;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE = 0x8D56;
    public static final int GL_MAX_SAMPLES = 0x8D57;
    public static final int GL_FRAMEBUFFER_SRGB = 0x8DB9;
    public static final int GL_HALF_FLOAT = 0x140B;
    public static final int GL_MAP_READ_BIT = 0x0001;
    public static final int GL_MAP_WRITE_BIT = 0x0002;
    public static final int GL_MAP_INVALIDATE_RANGE_BIT = 0x0004;
    public static final int GL_MAP_INVALIDATE_BUFFER_BIT = 0x0008;
    public static final int GL_MAP_FLUSH_EXPLICIT_BIT = 0x0010;
    public static final int GL_MAP_UNSYNCHRONIZED_BIT = 0x0020;
    public static final int GL_COMPRESSED_RED_RGTC1 = 0x8DBB;
    public static final int GL_COMPRESSED_SIGNED_RED_RGTC1 = 0x8DBC;
    public static final int GL_COMPRESSED_RG_RGTC2 = 0x8DBD;
    public static final int GL_COMPRESSED_SIGNED_RG_RGTC2 = 0x8DBE;
    public static final int GL_RG = 0x8227;
    public static final int GL_RG_INTEGER = 0x8228;
    public static final int GL_R8 = 0x8229;
    public static final int GL_R16 = 0x822A;
    public static final int GL_RG8 = 0x822B;
    public static final int GL_RG16 = 0x822C;
    public static final int GL_R16F = 0x822D;
    public static final int GL_R32F = 0x822E;
    public static final int GL_RG16F = 0x822F;
    public static final int GL_RG32F = 0x8230;
    public static final int GL_R8I = 0x8231;
    public static final int GL_R8UI = 0x8232;
    public static final int GL_R16I = 0x8233;
    public static final int GL_R16UI = 0x8234;
    public static final int GL_R32I = 0x8235;
    public static final int GL_R32UI = 0x8236;
    public static final int GL_RG8I = 0x8237;
    public static final int GL_RG8UI = 0x8238;
    public static final int GL_RG16I = 0x8239;
    public static final int GL_RG16UI = 0x823A;
    public static final int GL_RG32I = 0x823B;
    public static final int GL_RG32UI = 0x823C;
    public static final int GL_VERTEX_ARRAY_BINDING = 0x85B5;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glColorMaski = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glGetBooleani_v = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetIntegeri_v = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glEnablei = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDisablei = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glIsEnabledi = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBeginTransformFeedback = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glEndTransformFeedback = downcallHandle(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glBindBufferRange = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glBindBufferBase = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTransformFeedbackVaryings = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetTransformFeedbackVarying = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glClampColor = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBeginConditionalRender = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glEndConditionalRender = downcallHandle(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glVertexAttribIPointer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribIiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexAttribIuiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribI1i = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribI2i = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribI3i = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribI4i = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribI1ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribI2ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribI3ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribI4ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribI1iv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribI2iv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribI3iv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribI4iv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribI1uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribI2uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribI3uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribI4uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribI4bv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribI4sv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribI4ubv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribI4usv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetUniformuiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glBindFragDataLocation = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetFragDataLocation = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform1ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glUniform2ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glUniform3ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glUniform4ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glUniform1uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform2uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform3uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glUniform4uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexParameterIiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexParameterIuiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTexParameterIiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTexParameterIuiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glClearBufferiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glClearBufferuiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glClearBufferfv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glClearBufferfi = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetStringi = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glIsRenderbuffer = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBindRenderbuffer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteRenderbuffers = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenRenderbuffers = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glRenderbufferStorage = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetRenderbufferParameteriv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsFramebuffer = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBindFramebuffer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteFramebuffers = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenFramebuffers = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCheckFramebufferStatus = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFramebufferTexture1D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFramebufferTexture2D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFramebufferTexture3D = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFramebufferRenderbuffer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetFramebufferAttachmentParameteriv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenerateMipmap = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBlitFramebuffer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glRenderbufferStorageMultisample = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFramebufferTextureLayer = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMapBufferRange = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFlushMappedBufferRange = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glBindVertexArray = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDeleteVertexArrays = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenVertexArrays = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsVertexArray = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glColorMaski;
        public final MemorySegment PFN_glGetBooleani_v;
        public final MemorySegment PFN_glGetIntegeri_v;
        public final MemorySegment PFN_glEnablei;
        public final MemorySegment PFN_glDisablei;
        public final MemorySegment PFN_glIsEnabledi;
        public final MemorySegment PFN_glBeginTransformFeedback;
        public final MemorySegment PFN_glEndTransformFeedback;
        public final MemorySegment PFN_glBindBufferRange;
        public final MemorySegment PFN_glBindBufferBase;
        public final MemorySegment PFN_glTransformFeedbackVaryings;
        public final MemorySegment PFN_glGetTransformFeedbackVarying;
        public final MemorySegment PFN_glClampColor;
        public final MemorySegment PFN_glBeginConditionalRender;
        public final MemorySegment PFN_glEndConditionalRender;
        public final MemorySegment PFN_glVertexAttribIPointer;
        public final MemorySegment PFN_glGetVertexAttribIiv;
        public final MemorySegment PFN_glGetVertexAttribIuiv;
        public final MemorySegment PFN_glVertexAttribI1i;
        public final MemorySegment PFN_glVertexAttribI2i;
        public final MemorySegment PFN_glVertexAttribI3i;
        public final MemorySegment PFN_glVertexAttribI4i;
        public final MemorySegment PFN_glVertexAttribI1ui;
        public final MemorySegment PFN_glVertexAttribI2ui;
        public final MemorySegment PFN_glVertexAttribI3ui;
        public final MemorySegment PFN_glVertexAttribI4ui;
        public final MemorySegment PFN_glVertexAttribI1iv;
        public final MemorySegment PFN_glVertexAttribI2iv;
        public final MemorySegment PFN_glVertexAttribI3iv;
        public final MemorySegment PFN_glVertexAttribI4iv;
        public final MemorySegment PFN_glVertexAttribI1uiv;
        public final MemorySegment PFN_glVertexAttribI2uiv;
        public final MemorySegment PFN_glVertexAttribI3uiv;
        public final MemorySegment PFN_glVertexAttribI4uiv;
        public final MemorySegment PFN_glVertexAttribI4bv;
        public final MemorySegment PFN_glVertexAttribI4sv;
        public final MemorySegment PFN_glVertexAttribI4ubv;
        public final MemorySegment PFN_glVertexAttribI4usv;
        public final MemorySegment PFN_glGetUniformuiv;
        public final MemorySegment PFN_glBindFragDataLocation;
        public final MemorySegment PFN_glGetFragDataLocation;
        public final MemorySegment PFN_glUniform1ui;
        public final MemorySegment PFN_glUniform2ui;
        public final MemorySegment PFN_glUniform3ui;
        public final MemorySegment PFN_glUniform4ui;
        public final MemorySegment PFN_glUniform1uiv;
        public final MemorySegment PFN_glUniform2uiv;
        public final MemorySegment PFN_glUniform3uiv;
        public final MemorySegment PFN_glUniform4uiv;
        public final MemorySegment PFN_glTexParameterIiv;
        public final MemorySegment PFN_glTexParameterIuiv;
        public final MemorySegment PFN_glGetTexParameterIiv;
        public final MemorySegment PFN_glGetTexParameterIuiv;
        public final MemorySegment PFN_glClearBufferiv;
        public final MemorySegment PFN_glClearBufferuiv;
        public final MemorySegment PFN_glClearBufferfv;
        public final MemorySegment PFN_glClearBufferfi;
        public final MemorySegment PFN_glGetStringi;
        public final MemorySegment PFN_glIsRenderbuffer;
        public final MemorySegment PFN_glBindRenderbuffer;
        public final MemorySegment PFN_glDeleteRenderbuffers;
        public final MemorySegment PFN_glGenRenderbuffers;
        public final MemorySegment PFN_glRenderbufferStorage;
        public final MemorySegment PFN_glGetRenderbufferParameteriv;
        public final MemorySegment PFN_glIsFramebuffer;
        public final MemorySegment PFN_glBindFramebuffer;
        public final MemorySegment PFN_glDeleteFramebuffers;
        public final MemorySegment PFN_glGenFramebuffers;
        public final MemorySegment PFN_glCheckFramebufferStatus;
        public final MemorySegment PFN_glFramebufferTexture1D;
        public final MemorySegment PFN_glFramebufferTexture2D;
        public final MemorySegment PFN_glFramebufferTexture3D;
        public final MemorySegment PFN_glFramebufferRenderbuffer;
        public final MemorySegment PFN_glGetFramebufferAttachmentParameteriv;
        public final MemorySegment PFN_glGenerateMipmap;
        public final MemorySegment PFN_glBlitFramebuffer;
        public final MemorySegment PFN_glRenderbufferStorageMultisample;
        public final MemorySegment PFN_glFramebufferTextureLayer;
        public final MemorySegment PFN_glMapBufferRange;
        public final MemorySegment PFN_glFlushMappedBufferRange;
        public final MemorySegment PFN_glBindVertexArray;
        public final MemorySegment PFN_glDeleteVertexArrays;
        public final MemorySegment PFN_glGenVertexArrays;
        public final MemorySegment PFN_glIsVertexArray;
        private Handles(GLLoadFunc func) {
            PFN_glColorMaski = func.invoke("glColorMaski", "glColorMaskIndexedEXT", "glColorMaskiEXT", "glColorMaskiOES");
            PFN_glGetBooleani_v = func.invoke("glGetBooleani_v", "glGetBooleanIndexedvEXT");
            PFN_glGetIntegeri_v = func.invoke("glGetIntegeri_v", "glGetIntegerIndexedvEXT");
            PFN_glEnablei = func.invoke("glEnablei", "glEnableIndexedEXT", "glEnableiEXT", "glEnableiNV", "glEnableiOES");
            PFN_glDisablei = func.invoke("glDisablei", "glDisableIndexedEXT", "glDisableiEXT", "glDisableiNV", "glDisableiOES");
            PFN_glIsEnabledi = func.invoke("glIsEnabledi", "glIsEnabledIndexedEXT", "glIsEnablediEXT", "glIsEnablediNV", "glIsEnablediOES");
            PFN_glBeginTransformFeedback = func.invoke("glBeginTransformFeedback", "glBeginTransformFeedbackEXT", "glBeginTransformFeedbackNV");
            PFN_glEndTransformFeedback = func.invoke("glEndTransformFeedback", "glEndTransformFeedbackEXT", "glEndTransformFeedbackNV");
            PFN_glBindBufferRange = func.invoke("glBindBufferRange", "glBindBufferRangeEXT", "glBindBufferRangeNV");
            PFN_glBindBufferBase = func.invoke("glBindBufferBase", "glBindBufferBaseEXT", "glBindBufferBaseNV");
            PFN_glTransformFeedbackVaryings = func.invoke("glTransformFeedbackVaryings", "glTransformFeedbackVaryingsEXT");
            PFN_glGetTransformFeedbackVarying = func.invoke("glGetTransformFeedbackVarying", "glGetTransformFeedbackVaryingEXT");
            PFN_glClampColor = func.invoke("glClampColor", "glClampColorARB");
            PFN_glBeginConditionalRender = func.invoke("glBeginConditionalRender", "glBeginConditionalRenderNV");
            PFN_glEndConditionalRender = func.invoke("glEndConditionalRender", "glEndConditionalRenderNV", "glEndConditionalRenderNVX");
            PFN_glVertexAttribIPointer = func.invoke("glVertexAttribIPointer", "glVertexAttribIPointerEXT");
            PFN_glGetVertexAttribIiv = func.invoke("glGetVertexAttribIiv", "glGetVertexAttribIivEXT");
            PFN_glGetVertexAttribIuiv = func.invoke("glGetVertexAttribIuiv", "glGetVertexAttribIuivEXT");
            PFN_glVertexAttribI1i = func.invoke("glVertexAttribI1i", "glVertexAttribI1iEXT");
            PFN_glVertexAttribI2i = func.invoke("glVertexAttribI2i", "glVertexAttribI2iEXT");
            PFN_glVertexAttribI3i = func.invoke("glVertexAttribI3i", "glVertexAttribI3iEXT");
            PFN_glVertexAttribI4i = func.invoke("glVertexAttribI4i", "glVertexAttribI4iEXT");
            PFN_glVertexAttribI1ui = func.invoke("glVertexAttribI1ui", "glVertexAttribI1uiEXT");
            PFN_glVertexAttribI2ui = func.invoke("glVertexAttribI2ui", "glVertexAttribI2uiEXT");
            PFN_glVertexAttribI3ui = func.invoke("glVertexAttribI3ui", "glVertexAttribI3uiEXT");
            PFN_glVertexAttribI4ui = func.invoke("glVertexAttribI4ui", "glVertexAttribI4uiEXT");
            PFN_glVertexAttribI1iv = func.invoke("glVertexAttribI1iv", "glVertexAttribI1ivEXT");
            PFN_glVertexAttribI2iv = func.invoke("glVertexAttribI2iv", "glVertexAttribI2ivEXT");
            PFN_glVertexAttribI3iv = func.invoke("glVertexAttribI3iv", "glVertexAttribI3ivEXT");
            PFN_glVertexAttribI4iv = func.invoke("glVertexAttribI4iv", "glVertexAttribI4ivEXT");
            PFN_glVertexAttribI1uiv = func.invoke("glVertexAttribI1uiv", "glVertexAttribI1uivEXT");
            PFN_glVertexAttribI2uiv = func.invoke("glVertexAttribI2uiv", "glVertexAttribI2uivEXT");
            PFN_glVertexAttribI3uiv = func.invoke("glVertexAttribI3uiv", "glVertexAttribI3uivEXT");
            PFN_glVertexAttribI4uiv = func.invoke("glVertexAttribI4uiv", "glVertexAttribI4uivEXT");
            PFN_glVertexAttribI4bv = func.invoke("glVertexAttribI4bv", "glVertexAttribI4bvEXT");
            PFN_glVertexAttribI4sv = func.invoke("glVertexAttribI4sv", "glVertexAttribI4svEXT");
            PFN_glVertexAttribI4ubv = func.invoke("glVertexAttribI4ubv", "glVertexAttribI4ubvEXT");
            PFN_glVertexAttribI4usv = func.invoke("glVertexAttribI4usv", "glVertexAttribI4usvEXT");
            PFN_glGetUniformuiv = func.invoke("glGetUniformuiv", "glGetUniformuivEXT");
            PFN_glBindFragDataLocation = func.invoke("glBindFragDataLocation", "glBindFragDataLocationEXT");
            PFN_glGetFragDataLocation = func.invoke("glGetFragDataLocation", "glGetFragDataLocationEXT");
            PFN_glUniform1ui = func.invoke("glUniform1ui", "glUniform1uiEXT");
            PFN_glUniform2ui = func.invoke("glUniform2ui", "glUniform2uiEXT");
            PFN_glUniform3ui = func.invoke("glUniform3ui", "glUniform3uiEXT");
            PFN_glUniform4ui = func.invoke("glUniform4ui", "glUniform4uiEXT");
            PFN_glUniform1uiv = func.invoke("glUniform1uiv", "glUniform1uivEXT");
            PFN_glUniform2uiv = func.invoke("glUniform2uiv", "glUniform2uivEXT");
            PFN_glUniform3uiv = func.invoke("glUniform3uiv", "glUniform3uivEXT");
            PFN_glUniform4uiv = func.invoke("glUniform4uiv", "glUniform4uivEXT");
            PFN_glTexParameterIiv = func.invoke("glTexParameterIiv", "glTexParameterIivEXT", "glTexParameterIivOES");
            PFN_glTexParameterIuiv = func.invoke("glTexParameterIuiv", "glTexParameterIuivEXT", "glTexParameterIuivOES");
            PFN_glGetTexParameterIiv = func.invoke("glGetTexParameterIiv", "glGetTexParameterIivEXT", "glGetTexParameterIivOES");
            PFN_glGetTexParameterIuiv = func.invoke("glGetTexParameterIuiv", "glGetTexParameterIuivEXT", "glGetTexParameterIuivOES");
            PFN_glClearBufferiv = func.invoke("glClearBufferiv");
            PFN_glClearBufferuiv = func.invoke("glClearBufferuiv");
            PFN_glClearBufferfv = func.invoke("glClearBufferfv");
            PFN_glClearBufferfi = func.invoke("glClearBufferfi");
            PFN_glGetStringi = func.invoke("glGetStringi");
            PFN_glIsRenderbuffer = func.invoke("glIsRenderbuffer", "glIsRenderbufferEXT");
            PFN_glBindRenderbuffer = func.invoke("glBindRenderbuffer");
            PFN_glDeleteRenderbuffers = func.invoke("glDeleteRenderbuffers", "glDeleteRenderbuffersEXT");
            PFN_glGenRenderbuffers = func.invoke("glGenRenderbuffers", "glGenRenderbuffersEXT");
            PFN_glRenderbufferStorage = func.invoke("glRenderbufferStorage", "glRenderbufferStorageEXT");
            PFN_glGetRenderbufferParameteriv = func.invoke("glGetRenderbufferParameteriv", "glGetRenderbufferParameterivEXT");
            PFN_glIsFramebuffer = func.invoke("glIsFramebuffer", "glIsFramebufferEXT");
            PFN_glBindFramebuffer = func.invoke("glBindFramebuffer");
            PFN_glDeleteFramebuffers = func.invoke("glDeleteFramebuffers", "glDeleteFramebuffersEXT");
            PFN_glGenFramebuffers = func.invoke("glGenFramebuffers", "glGenFramebuffersEXT");
            PFN_glCheckFramebufferStatus = func.invoke("glCheckFramebufferStatus", "glCheckFramebufferStatusEXT");
            PFN_glFramebufferTexture1D = func.invoke("glFramebufferTexture1D", "glFramebufferTexture1DEXT");
            PFN_glFramebufferTexture2D = func.invoke("glFramebufferTexture2D", "glFramebufferTexture2DEXT");
            PFN_glFramebufferTexture3D = func.invoke("glFramebufferTexture3D", "glFramebufferTexture3DEXT");
            PFN_glFramebufferRenderbuffer = func.invoke("glFramebufferRenderbuffer", "glFramebufferRenderbufferEXT");
            PFN_glGetFramebufferAttachmentParameteriv = func.invoke("glGetFramebufferAttachmentParameteriv", "glGetFramebufferAttachmentParameterivEXT");
            PFN_glGenerateMipmap = func.invoke("glGenerateMipmap", "glGenerateMipmapEXT");
            PFN_glBlitFramebuffer = func.invoke("glBlitFramebuffer", "glBlitFramebufferEXT", "glBlitFramebufferNV");
            PFN_glRenderbufferStorageMultisample = func.invoke("glRenderbufferStorageMultisample", "glRenderbufferStorageMultisampleEXT", "glRenderbufferStorageMultisampleNV");
            PFN_glFramebufferTextureLayer = func.invoke("glFramebufferTextureLayer", "glFramebufferTextureLayerARB", "glFramebufferTextureLayerEXT");
            PFN_glMapBufferRange = func.invoke("glMapBufferRange", "glMapBufferRangeEXT");
            PFN_glFlushMappedBufferRange = func.invoke("glFlushMappedBufferRange", "glFlushMappedBufferRangeAPPLE", "glFlushMappedBufferRangeEXT");
            PFN_glBindVertexArray = func.invoke("glBindVertexArray", "glBindVertexArrayOES");
            PFN_glDeleteVertexArrays = func.invoke("glDeleteVertexArrays", "glDeleteVertexArraysAPPLE", "glDeleteVertexArraysOES");
            PFN_glGenVertexArrays = func.invoke("glGenVertexArrays", "glGenVertexArraysAPPLE", "glGenVertexArraysOES");
            PFN_glIsVertexArray = func.invoke("glIsVertexArray", "glIsVertexArrayAPPLE", "glIsVertexArrayOES");
        }
    }

    public GL30(GLLoadFunc func) {
        super(func);
        this.handles = new Handles(func);
    }

    /// ```
    /// void glColorMaski((unsigned int) GLuint index, GLboolean r, GLboolean g, GLboolean b, GLboolean a);
    /// ```
    public void ColorMaski(int index, boolean r, boolean g, boolean b, boolean a) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColorMaski)) throw new GLSymbolNotFoundError("Symbol not found: glColorMaski");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColorMaski", index, r, g, b, a); }
        Handles.MH_glColorMaski.invokeExact(handles.PFN_glColorMaski, index, ((r) ? (byte)1 : (byte)0), ((g) ? (byte)1 : (byte)0), ((b) ? (byte)1 : (byte)0), ((a) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in ColorMaski", e); }
    }

    /// ```
    /// void glGetBooleani_v((unsigned int) GLenum target, (unsigned int) GLuint index, GLboolean* data);
    /// ```
    public void GetBooleani_v(int target, int index, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetBooleani_v)) throw new GLSymbolNotFoundError("Symbol not found: glGetBooleani_v");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetBooleani_v", target, index, data); }
        Handles.MH_glGetBooleani_v.invokeExact(handles.PFN_glGetBooleani_v, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetBooleani_v", e); }
    }

    /// ```
    /// void glGetIntegeri_v((unsigned int) GLenum target, (unsigned int) GLuint index, GLint* data);
    /// ```
    public void GetIntegeri_v(int target, int index, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetIntegeri_v)) throw new GLSymbolNotFoundError("Symbol not found: glGetIntegeri_v");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetIntegeri_v", target, index, data); }
        Handles.MH_glGetIntegeri_v.invokeExact(handles.PFN_glGetIntegeri_v, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetIntegeri_v", e); }
    }

    /// ```
    /// void glEnablei((unsigned int) GLenum target, (unsigned int) GLuint index);
    /// ```
    public void Enablei(int target, int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEnablei)) throw new GLSymbolNotFoundError("Symbol not found: glEnablei");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEnablei", target, index); }
        Handles.MH_glEnablei.invokeExact(handles.PFN_glEnablei, target, index); }
        catch (Throwable e) { throw new RuntimeException("error in Enablei", e); }
    }

    /// ```
    /// void glDisablei((unsigned int) GLenum target, (unsigned int) GLuint index);
    /// ```
    public void Disablei(int target, int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDisablei)) throw new GLSymbolNotFoundError("Symbol not found: glDisablei");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDisablei", target, index); }
        Handles.MH_glDisablei.invokeExact(handles.PFN_glDisablei, target, index); }
        catch (Throwable e) { throw new RuntimeException("error in Disablei", e); }
    }

    /// ```
    /// GLboolean glIsEnabledi((unsigned int) GLenum target, (unsigned int) GLuint index);
    /// ```
    public boolean IsEnabledi(int target, int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsEnabledi)) throw new GLSymbolNotFoundError("Symbol not found: glIsEnabledi");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsEnabledi", target, index); }
        return (((byte) Handles.MH_glIsEnabledi.invokeExact(handles.PFN_glIsEnabledi, target, index)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsEnabledi", e); }
    }

    /// ```
    /// void glBeginTransformFeedback((unsigned int) GLenum primitiveMode);
    /// ```
    public void BeginTransformFeedback(int primitiveMode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBeginTransformFeedback)) throw new GLSymbolNotFoundError("Symbol not found: glBeginTransformFeedback");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBeginTransformFeedback", primitiveMode); }
        Handles.MH_glBeginTransformFeedback.invokeExact(handles.PFN_glBeginTransformFeedback, primitiveMode); }
        catch (Throwable e) { throw new RuntimeException("error in BeginTransformFeedback", e); }
    }

    /// ```
    /// void glEndTransformFeedback();
    /// ```
    public void EndTransformFeedback() {
        if (MemoryUtil.isNullPointer(handles.PFN_glEndTransformFeedback)) throw new GLSymbolNotFoundError("Symbol not found: glEndTransformFeedback");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEndTransformFeedback"); }
        Handles.MH_glEndTransformFeedback.invokeExact(handles.PFN_glEndTransformFeedback); }
        catch (Throwable e) { throw new RuntimeException("error in EndTransformFeedback", e); }
    }

    /// ```
    /// void glBindBufferRange((unsigned int) GLenum target, (unsigned int) GLuint index, (unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size);
    /// ```
    public void BindBufferRange(int target, int index, int buffer, long offset, long size) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindBufferRange)) throw new GLSymbolNotFoundError("Symbol not found: glBindBufferRange");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindBufferRange", target, index, buffer, offset, size); }
        Handles.MH_glBindBufferRange.invokeExact(handles.PFN_glBindBufferRange, target, index, buffer, offset, size); }
        catch (Throwable e) { throw new RuntimeException("error in BindBufferRange", e); }
    }

    /// ```
    /// void glBindBufferBase((unsigned int) GLenum target, (unsigned int) GLuint index, (unsigned int) GLuint buffer);
    /// ```
    public void BindBufferBase(int target, int index, int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindBufferBase)) throw new GLSymbolNotFoundError("Symbol not found: glBindBufferBase");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindBufferBase", target, index, buffer); }
        Handles.MH_glBindBufferBase.invokeExact(handles.PFN_glBindBufferBase, target, index, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in BindBufferBase", e); }
    }

    /// ```
    /// void glTransformFeedbackVaryings((unsigned int) GLuint program, (int) GLsizei count, const GLchar* const * varyings, (unsigned int) GLenum bufferMode);
    /// ```
    public void TransformFeedbackVaryings(int program, int count, MemorySegment varyings, int bufferMode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTransformFeedbackVaryings)) throw new GLSymbolNotFoundError("Symbol not found: glTransformFeedbackVaryings");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTransformFeedbackVaryings", program, count, varyings, bufferMode); }
        Handles.MH_glTransformFeedbackVaryings.invokeExact(handles.PFN_glTransformFeedbackVaryings, program, count, varyings, bufferMode); }
        catch (Throwable e) { throw new RuntimeException("error in TransformFeedbackVaryings", e); }
    }

    /// ```
    /// void glGetTransformFeedbackVarying((unsigned int) GLuint program, (unsigned int) GLuint index, (int) GLsizei bufSize, GLsizei* length, GLsizei* size, GLenum* type, GLchar* name);
    /// ```
    public void GetTransformFeedbackVarying(int program, int index, int bufSize, MemorySegment length, MemorySegment size, MemorySegment type, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTransformFeedbackVarying)) throw new GLSymbolNotFoundError("Symbol not found: glGetTransformFeedbackVarying");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTransformFeedbackVarying", program, index, bufSize, length, size, type, name); }
        Handles.MH_glGetTransformFeedbackVarying.invokeExact(handles.PFN_glGetTransformFeedbackVarying, program, index, bufSize, length, size, type, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetTransformFeedbackVarying", e); }
    }

    /// ```
    /// void glClampColor((unsigned int) GLenum target, (unsigned int) GLenum clamp);
    /// ```
    public void ClampColor(int target, int clamp) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClampColor)) throw new GLSymbolNotFoundError("Symbol not found: glClampColor");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClampColor", target, clamp); }
        Handles.MH_glClampColor.invokeExact(handles.PFN_glClampColor, target, clamp); }
        catch (Throwable e) { throw new RuntimeException("error in ClampColor", e); }
    }

    /// ```
    /// void glBeginConditionalRender((unsigned int) GLuint id, (unsigned int) GLenum mode);
    /// ```
    public void BeginConditionalRender(int id, int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBeginConditionalRender)) throw new GLSymbolNotFoundError("Symbol not found: glBeginConditionalRender");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBeginConditionalRender", id, mode); }
        Handles.MH_glBeginConditionalRender.invokeExact(handles.PFN_glBeginConditionalRender, id, mode); }
        catch (Throwable e) { throw new RuntimeException("error in BeginConditionalRender", e); }
    }

    /// ```
    /// void glEndConditionalRender();
    /// ```
    public void EndConditionalRender() {
        if (MemoryUtil.isNullPointer(handles.PFN_glEndConditionalRender)) throw new GLSymbolNotFoundError("Symbol not found: glEndConditionalRender");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glEndConditionalRender"); }
        Handles.MH_glEndConditionalRender.invokeExact(handles.PFN_glEndConditionalRender); }
        catch (Throwable e) { throw new RuntimeException("error in EndConditionalRender", e); }
    }

    /// ```
    /// void glVertexAttribIPointer((unsigned int) GLuint index, (int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride, const void* pointer);
    /// ```
    public void VertexAttribIPointer(int index, int size, int type, int stride, MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribIPointer)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribIPointer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribIPointer", index, size, type, stride, pointer); }
        Handles.MH_glVertexAttribIPointer.invokeExact(handles.PFN_glVertexAttribIPointer, index, size, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribIPointer", e); }
    }

    /// ```
    /// void glGetVertexAttribIiv((unsigned int) GLuint index, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetVertexAttribIiv(int index, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribIiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribIiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexAttribIiv", index, pname, params); }
        Handles.MH_glGetVertexAttribIiv.invokeExact(handles.PFN_glGetVertexAttribIiv, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribIiv", e); }
    }

    /// ```
    /// void glGetVertexAttribIuiv((unsigned int) GLuint index, (unsigned int) GLenum pname, GLuint* params);
    /// ```
    public void GetVertexAttribIuiv(int index, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexAttribIuiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexAttribIuiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetVertexAttribIuiv", index, pname, params); }
        Handles.MH_glGetVertexAttribIuiv.invokeExact(handles.PFN_glGetVertexAttribIuiv, index, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexAttribIuiv", e); }
    }

    /// ```
    /// void glVertexAttribI1i((unsigned int) GLuint index, (int) GLint x);
    /// ```
    public void VertexAttribI1i(int index, int x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI1i)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI1i");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI1i", index, x); }
        Handles.MH_glVertexAttribI1i.invokeExact(handles.PFN_glVertexAttribI1i, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI1i", e); }
    }

    /// ```
    /// void glVertexAttribI2i((unsigned int) GLuint index, (int) GLint x, (int) GLint y);
    /// ```
    public void VertexAttribI2i(int index, int x, int y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI2i)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI2i");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI2i", index, x, y); }
        Handles.MH_glVertexAttribI2i.invokeExact(handles.PFN_glVertexAttribI2i, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI2i", e); }
    }

    /// ```
    /// void glVertexAttribI3i((unsigned int) GLuint index, (int) GLint x, (int) GLint y, (int) GLint z);
    /// ```
    public void VertexAttribI3i(int index, int x, int y, int z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI3i)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI3i");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI3i", index, x, y, z); }
        Handles.MH_glVertexAttribI3i.invokeExact(handles.PFN_glVertexAttribI3i, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI3i", e); }
    }

    /// ```
    /// void glVertexAttribI4i((unsigned int) GLuint index, (int) GLint x, (int) GLint y, (int) GLint z, (int) GLint w);
    /// ```
    public void VertexAttribI4i(int index, int x, int y, int z, int w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI4i)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI4i");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI4i", index, x, y, z, w); }
        Handles.MH_glVertexAttribI4i.invokeExact(handles.PFN_glVertexAttribI4i, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI4i", e); }
    }

    /// ```
    /// void glVertexAttribI1ui((unsigned int) GLuint index, (unsigned int) GLuint x);
    /// ```
    public void VertexAttribI1ui(int index, int x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI1ui)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI1ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI1ui", index, x); }
        Handles.MH_glVertexAttribI1ui.invokeExact(handles.PFN_glVertexAttribI1ui, index, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI1ui", e); }
    }

    /// ```
    /// void glVertexAttribI2ui((unsigned int) GLuint index, (unsigned int) GLuint x, (unsigned int) GLuint y);
    /// ```
    public void VertexAttribI2ui(int index, int x, int y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI2ui)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI2ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI2ui", index, x, y); }
        Handles.MH_glVertexAttribI2ui.invokeExact(handles.PFN_glVertexAttribI2ui, index, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI2ui", e); }
    }

    /// ```
    /// void glVertexAttribI3ui((unsigned int) GLuint index, (unsigned int) GLuint x, (unsigned int) GLuint y, (unsigned int) GLuint z);
    /// ```
    public void VertexAttribI3ui(int index, int x, int y, int z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI3ui)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI3ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI3ui", index, x, y, z); }
        Handles.MH_glVertexAttribI3ui.invokeExact(handles.PFN_glVertexAttribI3ui, index, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI3ui", e); }
    }

    /// ```
    /// void glVertexAttribI4ui((unsigned int) GLuint index, (unsigned int) GLuint x, (unsigned int) GLuint y, (unsigned int) GLuint z, (unsigned int) GLuint w);
    /// ```
    public void VertexAttribI4ui(int index, int x, int y, int z, int w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI4ui)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI4ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI4ui", index, x, y, z, w); }
        Handles.MH_glVertexAttribI4ui.invokeExact(handles.PFN_glVertexAttribI4ui, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI4ui", e); }
    }

    /// ```
    /// void glVertexAttribI1iv((unsigned int) GLuint index, const GLint* v);
    /// ```
    public void VertexAttribI1iv(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI1iv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI1iv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI1iv", index, v); }
        Handles.MH_glVertexAttribI1iv.invokeExact(handles.PFN_glVertexAttribI1iv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI1iv", e); }
    }

    /// ```
    /// void glVertexAttribI2iv((unsigned int) GLuint index, const GLint* v);
    /// ```
    public void VertexAttribI2iv(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI2iv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI2iv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI2iv", index, v); }
        Handles.MH_glVertexAttribI2iv.invokeExact(handles.PFN_glVertexAttribI2iv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI2iv", e); }
    }

    /// ```
    /// void glVertexAttribI3iv((unsigned int) GLuint index, const GLint* v);
    /// ```
    public void VertexAttribI3iv(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI3iv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI3iv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI3iv", index, v); }
        Handles.MH_glVertexAttribI3iv.invokeExact(handles.PFN_glVertexAttribI3iv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI3iv", e); }
    }

    /// ```
    /// void glVertexAttribI4iv((unsigned int) GLuint index, const GLint* v);
    /// ```
    public void VertexAttribI4iv(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI4iv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI4iv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI4iv", index, v); }
        Handles.MH_glVertexAttribI4iv.invokeExact(handles.PFN_glVertexAttribI4iv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI4iv", e); }
    }

    /// ```
    /// void glVertexAttribI1uiv((unsigned int) GLuint index, const GLuint* v);
    /// ```
    public void VertexAttribI1uiv(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI1uiv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI1uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI1uiv", index, v); }
        Handles.MH_glVertexAttribI1uiv.invokeExact(handles.PFN_glVertexAttribI1uiv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI1uiv", e); }
    }

    /// ```
    /// void glVertexAttribI2uiv((unsigned int) GLuint index, const GLuint* v);
    /// ```
    public void VertexAttribI2uiv(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI2uiv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI2uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI2uiv", index, v); }
        Handles.MH_glVertexAttribI2uiv.invokeExact(handles.PFN_glVertexAttribI2uiv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI2uiv", e); }
    }

    /// ```
    /// void glVertexAttribI3uiv((unsigned int) GLuint index, const GLuint* v);
    /// ```
    public void VertexAttribI3uiv(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI3uiv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI3uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI3uiv", index, v); }
        Handles.MH_glVertexAttribI3uiv.invokeExact(handles.PFN_glVertexAttribI3uiv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI3uiv", e); }
    }

    /// ```
    /// void glVertexAttribI4uiv((unsigned int) GLuint index, const GLuint* v);
    /// ```
    public void VertexAttribI4uiv(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI4uiv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI4uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI4uiv", index, v); }
        Handles.MH_glVertexAttribI4uiv.invokeExact(handles.PFN_glVertexAttribI4uiv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI4uiv", e); }
    }

    /// ```
    /// void glVertexAttribI4bv((unsigned int) GLuint index, const GLbyte* v);
    /// ```
    public void VertexAttribI4bv(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI4bv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI4bv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI4bv", index, v); }
        Handles.MH_glVertexAttribI4bv.invokeExact(handles.PFN_glVertexAttribI4bv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI4bv", e); }
    }

    /// ```
    /// void glVertexAttribI4sv((unsigned int) GLuint index, const GLshort* v);
    /// ```
    public void VertexAttribI4sv(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI4sv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI4sv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI4sv", index, v); }
        Handles.MH_glVertexAttribI4sv.invokeExact(handles.PFN_glVertexAttribI4sv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI4sv", e); }
    }

    /// ```
    /// void glVertexAttribI4ubv((unsigned int) GLuint index, const GLubyte* v);
    /// ```
    public void VertexAttribI4ubv(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI4ubv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI4ubv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI4ubv", index, v); }
        Handles.MH_glVertexAttribI4ubv.invokeExact(handles.PFN_glVertexAttribI4ubv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI4ubv", e); }
    }

    /// ```
    /// void glVertexAttribI4usv((unsigned int) GLuint index, const GLushort* v);
    /// ```
    public void VertexAttribI4usv(int index, MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribI4usv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribI4usv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribI4usv", index, v); }
        Handles.MH_glVertexAttribI4usv.invokeExact(handles.PFN_glVertexAttribI4usv, index, v); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribI4usv", e); }
    }

    /// ```
    /// void glGetUniformuiv((unsigned int) GLuint program, (int) GLint location, GLuint* params);
    /// ```
    public void GetUniformuiv(int program, int location, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetUniformuiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetUniformuiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetUniformuiv", program, location, params); }
        Handles.MH_glGetUniformuiv.invokeExact(handles.PFN_glGetUniformuiv, program, location, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetUniformuiv", e); }
    }

    /// ```
    /// void glBindFragDataLocation((unsigned int) GLuint program, (unsigned int) GLuint color, const GLchar* name);
    /// ```
    public void BindFragDataLocation(int program, int color, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindFragDataLocation)) throw new GLSymbolNotFoundError("Symbol not found: glBindFragDataLocation");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindFragDataLocation", program, color, name); }
        Handles.MH_glBindFragDataLocation.invokeExact(handles.PFN_glBindFragDataLocation, program, color, name); }
        catch (Throwable e) { throw new RuntimeException("error in BindFragDataLocation", e); }
    }

    /// ```
    /// (int) GLint glGetFragDataLocation((unsigned int) GLuint program, const GLchar* name);
    /// ```
    public int GetFragDataLocation(int program, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFragDataLocation)) throw new GLSymbolNotFoundError("Symbol not found: glGetFragDataLocation");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetFragDataLocation", program, name); }
        return (int) Handles.MH_glGetFragDataLocation.invokeExact(handles.PFN_glGetFragDataLocation, program, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetFragDataLocation", e); }
    }

    /// ```
    /// void glUniform1ui((int) GLint location, (unsigned int) GLuint v0);
    /// ```
    public void Uniform1ui(int location, int v0) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform1ui)) throw new GLSymbolNotFoundError("Symbol not found: glUniform1ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform1ui", location, v0); }
        Handles.MH_glUniform1ui.invokeExact(handles.PFN_glUniform1ui, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform1ui", e); }
    }

    /// ```
    /// void glUniform2ui((int) GLint location, (unsigned int) GLuint v0, (unsigned int) GLuint v1);
    /// ```
    public void Uniform2ui(int location, int v0, int v1) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform2ui)) throw new GLSymbolNotFoundError("Symbol not found: glUniform2ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform2ui", location, v0, v1); }
        Handles.MH_glUniform2ui.invokeExact(handles.PFN_glUniform2ui, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform2ui", e); }
    }

    /// ```
    /// void glUniform3ui((int) GLint location, (unsigned int) GLuint v0, (unsigned int) GLuint v1, (unsigned int) GLuint v2);
    /// ```
    public void Uniform3ui(int location, int v0, int v1, int v2) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform3ui)) throw new GLSymbolNotFoundError("Symbol not found: glUniform3ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform3ui", location, v0, v1, v2); }
        Handles.MH_glUniform3ui.invokeExact(handles.PFN_glUniform3ui, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform3ui", e); }
    }

    /// ```
    /// void glUniform4ui((int) GLint location, (unsigned int) GLuint v0, (unsigned int) GLuint v1, (unsigned int) GLuint v2, (unsigned int) GLuint v3);
    /// ```
    public void Uniform4ui(int location, int v0, int v1, int v2, int v3) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform4ui)) throw new GLSymbolNotFoundError("Symbol not found: glUniform4ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform4ui", location, v0, v1, v2, v3); }
        Handles.MH_glUniform4ui.invokeExact(handles.PFN_glUniform4ui, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform4ui", e); }
    }

    /// ```
    /// void glUniform1uiv((int) GLint location, (int) GLsizei count, const GLuint* value);
    /// ```
    public void Uniform1uiv(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform1uiv)) throw new GLSymbolNotFoundError("Symbol not found: glUniform1uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform1uiv", location, count, value); }
        Handles.MH_glUniform1uiv.invokeExact(handles.PFN_glUniform1uiv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform1uiv", e); }
    }

    /// ```
    /// void glUniform2uiv((int) GLint location, (int) GLsizei count, const GLuint* value);
    /// ```
    public void Uniform2uiv(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform2uiv)) throw new GLSymbolNotFoundError("Symbol not found: glUniform2uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform2uiv", location, count, value); }
        Handles.MH_glUniform2uiv.invokeExact(handles.PFN_glUniform2uiv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform2uiv", e); }
    }

    /// ```
    /// void glUniform3uiv((int) GLint location, (int) GLsizei count, const GLuint* value);
    /// ```
    public void Uniform3uiv(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform3uiv)) throw new GLSymbolNotFoundError("Symbol not found: glUniform3uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform3uiv", location, count, value); }
        Handles.MH_glUniform3uiv.invokeExact(handles.PFN_glUniform3uiv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform3uiv", e); }
    }

    /// ```
    /// void glUniform4uiv((int) GLint location, (int) GLsizei count, const GLuint* value);
    /// ```
    public void Uniform4uiv(int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUniform4uiv)) throw new GLSymbolNotFoundError("Symbol not found: glUniform4uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glUniform4uiv", location, count, value); }
        Handles.MH_glUniform4uiv.invokeExact(handles.PFN_glUniform4uiv, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in Uniform4uiv", e); }
    }

    /// ```
    /// void glTexParameterIiv((unsigned int) GLenum target, (unsigned int) GLenum pname, const GLint* params);
    /// ```
    public void TexParameterIiv(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexParameterIiv)) throw new GLSymbolNotFoundError("Symbol not found: glTexParameterIiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexParameterIiv", target, pname, params); }
        Handles.MH_glTexParameterIiv.invokeExact(handles.PFN_glTexParameterIiv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in TexParameterIiv", e); }
    }

    /// ```
    /// void glTexParameterIuiv((unsigned int) GLenum target, (unsigned int) GLenum pname, const GLuint* params);
    /// ```
    public void TexParameterIuiv(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexParameterIuiv)) throw new GLSymbolNotFoundError("Symbol not found: glTexParameterIuiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexParameterIuiv", target, pname, params); }
        Handles.MH_glTexParameterIuiv.invokeExact(handles.PFN_glTexParameterIuiv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in TexParameterIuiv", e); }
    }

    /// ```
    /// void glGetTexParameterIiv((unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetTexParameterIiv(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTexParameterIiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetTexParameterIiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTexParameterIiv", target, pname, params); }
        Handles.MH_glGetTexParameterIiv.invokeExact(handles.PFN_glGetTexParameterIiv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTexParameterIiv", e); }
    }

    /// ```
    /// void glGetTexParameterIuiv((unsigned int) GLenum target, (unsigned int) GLenum pname, GLuint* params);
    /// ```
    public void GetTexParameterIuiv(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTexParameterIuiv)) throw new GLSymbolNotFoundError("Symbol not found: glGetTexParameterIuiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTexParameterIuiv", target, pname, params); }
        Handles.MH_glGetTexParameterIuiv.invokeExact(handles.PFN_glGetTexParameterIuiv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTexParameterIuiv", e); }
    }

    /// ```
    /// void glClearBufferiv((unsigned int) GLenum buffer, (int) GLint drawbuffer, const GLint* value);
    /// ```
    public void ClearBufferiv(int buffer, int drawbuffer, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearBufferiv)) throw new GLSymbolNotFoundError("Symbol not found: glClearBufferiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClearBufferiv", buffer, drawbuffer, value); }
        Handles.MH_glClearBufferiv.invokeExact(handles.PFN_glClearBufferiv, buffer, drawbuffer, value); }
        catch (Throwable e) { throw new RuntimeException("error in ClearBufferiv", e); }
    }

    /// ```
    /// void glClearBufferuiv((unsigned int) GLenum buffer, (int) GLint drawbuffer, const GLuint* value);
    /// ```
    public void ClearBufferuiv(int buffer, int drawbuffer, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearBufferuiv)) throw new GLSymbolNotFoundError("Symbol not found: glClearBufferuiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClearBufferuiv", buffer, drawbuffer, value); }
        Handles.MH_glClearBufferuiv.invokeExact(handles.PFN_glClearBufferuiv, buffer, drawbuffer, value); }
        catch (Throwable e) { throw new RuntimeException("error in ClearBufferuiv", e); }
    }

    /// ```
    /// void glClearBufferfv((unsigned int) GLenum buffer, (int) GLint drawbuffer, const GLfloat* value);
    /// ```
    public void ClearBufferfv(int buffer, int drawbuffer, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearBufferfv)) throw new GLSymbolNotFoundError("Symbol not found: glClearBufferfv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClearBufferfv", buffer, drawbuffer, value); }
        Handles.MH_glClearBufferfv.invokeExact(handles.PFN_glClearBufferfv, buffer, drawbuffer, value); }
        catch (Throwable e) { throw new RuntimeException("error in ClearBufferfv", e); }
    }

    /// ```
    /// void glClearBufferfi((unsigned int) GLenum buffer, (int) GLint drawbuffer, ((float) khronos_float_t) GLfloat depth, (int) GLint stencil);
    /// ```
    public void ClearBufferfi(int buffer, int drawbuffer, float depth, int stencil) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearBufferfi)) throw new GLSymbolNotFoundError("Symbol not found: glClearBufferfi");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClearBufferfi", buffer, drawbuffer, depth, stencil); }
        Handles.MH_glClearBufferfi.invokeExact(handles.PFN_glClearBufferfi, buffer, drawbuffer, depth, stencil); }
        catch (Throwable e) { throw new RuntimeException("error in ClearBufferfi", e); }
    }

    /// ```
    /// const GLubyte* glGetStringi((unsigned int) GLenum name, (unsigned int) GLuint index);
    /// ```
    public MemorySegment GetStringi(int name, int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetStringi)) throw new GLSymbolNotFoundError("Symbol not found: glGetStringi");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetStringi", name, index); }
        return (MemorySegment) Handles.MH_glGetStringi.invokeExact(handles.PFN_glGetStringi, name, index); }
        catch (Throwable e) { throw new RuntimeException("error in GetStringi", e); }
    }

    /// ```
    /// GLboolean glIsRenderbuffer((unsigned int) GLuint renderbuffer);
    /// ```
    public boolean IsRenderbuffer(int renderbuffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsRenderbuffer)) throw new GLSymbolNotFoundError("Symbol not found: glIsRenderbuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsRenderbuffer", renderbuffer); }
        return (((byte) Handles.MH_glIsRenderbuffer.invokeExact(handles.PFN_glIsRenderbuffer, renderbuffer)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsRenderbuffer", e); }
    }

    /// ```
    /// void glBindRenderbuffer((unsigned int) GLenum target, (unsigned int) GLuint renderbuffer);
    /// ```
    public void BindRenderbuffer(int target, int renderbuffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindRenderbuffer)) throw new GLSymbolNotFoundError("Symbol not found: glBindRenderbuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindRenderbuffer", target, renderbuffer); }
        Handles.MH_glBindRenderbuffer.invokeExact(handles.PFN_glBindRenderbuffer, target, renderbuffer); }
        catch (Throwable e) { throw new RuntimeException("error in BindRenderbuffer", e); }
    }

    /// ```
    /// void glDeleteRenderbuffers((int) GLsizei n, const GLuint* renderbuffers);
    /// ```
    public void DeleteRenderbuffers(int n, MemorySegment renderbuffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteRenderbuffers)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteRenderbuffers");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteRenderbuffers", n, renderbuffers); }
        Handles.MH_glDeleteRenderbuffers.invokeExact(handles.PFN_glDeleteRenderbuffers, n, renderbuffers); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteRenderbuffers", e); }
    }

    /// ```
    /// void glGenRenderbuffers((int) GLsizei n, GLuint* renderbuffers);
    /// ```
    public void GenRenderbuffers(int n, MemorySegment renderbuffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenRenderbuffers)) throw new GLSymbolNotFoundError("Symbol not found: glGenRenderbuffers");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenRenderbuffers", n, renderbuffers); }
        Handles.MH_glGenRenderbuffers.invokeExact(handles.PFN_glGenRenderbuffers, n, renderbuffers); }
        catch (Throwable e) { throw new RuntimeException("error in GenRenderbuffers", e); }
    }

    /// ```
    /// void glRenderbufferStorage((unsigned int) GLenum target, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void RenderbufferStorage(int target, int internalformat, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRenderbufferStorage)) throw new GLSymbolNotFoundError("Symbol not found: glRenderbufferStorage");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glRenderbufferStorage", target, internalformat, width, height); }
        Handles.MH_glRenderbufferStorage.invokeExact(handles.PFN_glRenderbufferStorage, target, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in RenderbufferStorage", e); }
    }

    /// ```
    /// void glGetRenderbufferParameteriv((unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetRenderbufferParameteriv(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetRenderbufferParameteriv)) throw new GLSymbolNotFoundError("Symbol not found: glGetRenderbufferParameteriv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetRenderbufferParameteriv", target, pname, params); }
        Handles.MH_glGetRenderbufferParameteriv.invokeExact(handles.PFN_glGetRenderbufferParameteriv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetRenderbufferParameteriv", e); }
    }

    /// ```
    /// GLboolean glIsFramebuffer((unsigned int) GLuint framebuffer);
    /// ```
    public boolean IsFramebuffer(int framebuffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsFramebuffer)) throw new GLSymbolNotFoundError("Symbol not found: glIsFramebuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsFramebuffer", framebuffer); }
        return (((byte) Handles.MH_glIsFramebuffer.invokeExact(handles.PFN_glIsFramebuffer, framebuffer)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsFramebuffer", e); }
    }

    /// ```
    /// void glBindFramebuffer((unsigned int) GLenum target, (unsigned int) GLuint framebuffer);
    /// ```
    public void BindFramebuffer(int target, int framebuffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindFramebuffer)) throw new GLSymbolNotFoundError("Symbol not found: glBindFramebuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindFramebuffer", target, framebuffer); }
        Handles.MH_glBindFramebuffer.invokeExact(handles.PFN_glBindFramebuffer, target, framebuffer); }
        catch (Throwable e) { throw new RuntimeException("error in BindFramebuffer", e); }
    }

    /// ```
    /// void glDeleteFramebuffers((int) GLsizei n, const GLuint* framebuffers);
    /// ```
    public void DeleteFramebuffers(int n, MemorySegment framebuffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteFramebuffers)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteFramebuffers");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteFramebuffers", n, framebuffers); }
        Handles.MH_glDeleteFramebuffers.invokeExact(handles.PFN_glDeleteFramebuffers, n, framebuffers); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteFramebuffers", e); }
    }

    /// ```
    /// void glGenFramebuffers((int) GLsizei n, GLuint* framebuffers);
    /// ```
    public void GenFramebuffers(int n, MemorySegment framebuffers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenFramebuffers)) throw new GLSymbolNotFoundError("Symbol not found: glGenFramebuffers");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenFramebuffers", n, framebuffers); }
        Handles.MH_glGenFramebuffers.invokeExact(handles.PFN_glGenFramebuffers, n, framebuffers); }
        catch (Throwable e) { throw new RuntimeException("error in GenFramebuffers", e); }
    }

    /// ```
    /// (unsigned int) GLenum glCheckFramebufferStatus((unsigned int) GLenum target);
    /// ```
    public int CheckFramebufferStatus(int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCheckFramebufferStatus)) throw new GLSymbolNotFoundError("Symbol not found: glCheckFramebufferStatus");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCheckFramebufferStatus", target); }
        return (int) Handles.MH_glCheckFramebufferStatus.invokeExact(handles.PFN_glCheckFramebufferStatus, target); }
        catch (Throwable e) { throw new RuntimeException("error in CheckFramebufferStatus", e); }
    }

    /// ```
    /// void glFramebufferTexture1D((unsigned int) GLenum target, (unsigned int) GLenum attachment, (unsigned int) GLenum textarget, (unsigned int) GLuint texture, (int) GLint level);
    /// ```
    public void FramebufferTexture1D(int target, int attachment, int textarget, int texture, int level) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferTexture1D)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferTexture1D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFramebufferTexture1D", target, attachment, textarget, texture, level); }
        Handles.MH_glFramebufferTexture1D.invokeExact(handles.PFN_glFramebufferTexture1D, target, attachment, textarget, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferTexture1D", e); }
    }

    /// ```
    /// void glFramebufferTexture2D((unsigned int) GLenum target, (unsigned int) GLenum attachment, (unsigned int) GLenum textarget, (unsigned int) GLuint texture, (int) GLint level);
    /// ```
    public void FramebufferTexture2D(int target, int attachment, int textarget, int texture, int level) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferTexture2D)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferTexture2D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFramebufferTexture2D", target, attachment, textarget, texture, level); }
        Handles.MH_glFramebufferTexture2D.invokeExact(handles.PFN_glFramebufferTexture2D, target, attachment, textarget, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferTexture2D", e); }
    }

    /// ```
    /// void glFramebufferTexture3D((unsigned int) GLenum target, (unsigned int) GLenum attachment, (unsigned int) GLenum textarget, (unsigned int) GLuint texture, (int) GLint level, (int) GLint zoffset);
    /// ```
    public void FramebufferTexture3D(int target, int attachment, int textarget, int texture, int level, int zoffset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferTexture3D)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferTexture3D");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFramebufferTexture3D", target, attachment, textarget, texture, level, zoffset); }
        Handles.MH_glFramebufferTexture3D.invokeExact(handles.PFN_glFramebufferTexture3D, target, attachment, textarget, texture, level, zoffset); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferTexture3D", e); }
    }

    /// ```
    /// void glFramebufferRenderbuffer((unsigned int) GLenum target, (unsigned int) GLenum attachment, (unsigned int) GLenum renderbuffertarget, (unsigned int) GLuint renderbuffer);
    /// ```
    public void FramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferRenderbuffer)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferRenderbuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFramebufferRenderbuffer", target, attachment, renderbuffertarget, renderbuffer); }
        Handles.MH_glFramebufferRenderbuffer.invokeExact(handles.PFN_glFramebufferRenderbuffer, target, attachment, renderbuffertarget, renderbuffer); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferRenderbuffer", e); }
    }

    /// ```
    /// void glGetFramebufferAttachmentParameteriv((unsigned int) GLenum target, (unsigned int) GLenum attachment, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetFramebufferAttachmentParameteriv(int target, int attachment, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFramebufferAttachmentParameteriv)) throw new GLSymbolNotFoundError("Symbol not found: glGetFramebufferAttachmentParameteriv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetFramebufferAttachmentParameteriv", target, attachment, pname, params); }
        Handles.MH_glGetFramebufferAttachmentParameteriv.invokeExact(handles.PFN_glGetFramebufferAttachmentParameteriv, target, attachment, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetFramebufferAttachmentParameteriv", e); }
    }

    /// ```
    /// void glGenerateMipmap((unsigned int) GLenum target);
    /// ```
    public void GenerateMipmap(int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenerateMipmap)) throw new GLSymbolNotFoundError("Symbol not found: glGenerateMipmap");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenerateMipmap", target); }
        Handles.MH_glGenerateMipmap.invokeExact(handles.PFN_glGenerateMipmap, target); }
        catch (Throwable e) { throw new RuntimeException("error in GenerateMipmap", e); }
    }

    /// ```
    /// void glBlitFramebuffer((int) GLint srcX0, (int) GLint srcY0, (int) GLint srcX1, (int) GLint srcY1, (int) GLint dstX0, (int) GLint dstY0, (int) GLint dstX1, (int) GLint dstY1, (unsigned int) GLbitfield mask, (unsigned int) GLenum filter);
    /// ```
    public void BlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBlitFramebuffer)) throw new GLSymbolNotFoundError("Symbol not found: glBlitFramebuffer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBlitFramebuffer", srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter); }
        Handles.MH_glBlitFramebuffer.invokeExact(handles.PFN_glBlitFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter); }
        catch (Throwable e) { throw new RuntimeException("error in BlitFramebuffer", e); }
    }

    /// ```
    /// void glRenderbufferStorageMultisample((unsigned int) GLenum target, (int) GLsizei samples, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void RenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRenderbufferStorageMultisample)) throw new GLSymbolNotFoundError("Symbol not found: glRenderbufferStorageMultisample");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glRenderbufferStorageMultisample", target, samples, internalformat, width, height); }
        Handles.MH_glRenderbufferStorageMultisample.invokeExact(handles.PFN_glRenderbufferStorageMultisample, target, samples, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in RenderbufferStorageMultisample", e); }
    }

    /// ```
    /// void glFramebufferTextureLayer((unsigned int) GLenum target, (unsigned int) GLenum attachment, (unsigned int) GLuint texture, (int) GLint level, (int) GLint layer);
    /// ```
    public void FramebufferTextureLayer(int target, int attachment, int texture, int level, int layer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferTextureLayer)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferTextureLayer");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFramebufferTextureLayer", target, attachment, texture, level, layer); }
        Handles.MH_glFramebufferTextureLayer.invokeExact(handles.PFN_glFramebufferTextureLayer, target, attachment, texture, level, layer); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferTextureLayer", e); }
    }

    /// ```
    /// void* glMapBufferRange((unsigned int) GLenum target, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr length, (unsigned int) GLbitfield access);
    /// ```
    public MemorySegment MapBufferRange(int target, long offset, long length, int access) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapBufferRange)) throw new GLSymbolNotFoundError("Symbol not found: glMapBufferRange");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMapBufferRange", target, offset, length, access); }
        return (MemorySegment) Handles.MH_glMapBufferRange.invokeExact(handles.PFN_glMapBufferRange, target, offset, length, access); }
        catch (Throwable e) { throw new RuntimeException("error in MapBufferRange", e); }
    }

    /// ```
    /// void glFlushMappedBufferRange((unsigned int) GLenum target, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr length);
    /// ```
    public void FlushMappedBufferRange(int target, long offset, long length) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFlushMappedBufferRange)) throw new GLSymbolNotFoundError("Symbol not found: glFlushMappedBufferRange");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFlushMappedBufferRange", target, offset, length); }
        Handles.MH_glFlushMappedBufferRange.invokeExact(handles.PFN_glFlushMappedBufferRange, target, offset, length); }
        catch (Throwable e) { throw new RuntimeException("error in FlushMappedBufferRange", e); }
    }

    /// ```
    /// void glBindVertexArray((unsigned int) GLuint array);
    /// ```
    public void BindVertexArray(int array) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindVertexArray)) throw new GLSymbolNotFoundError("Symbol not found: glBindVertexArray");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glBindVertexArray", array); }
        Handles.MH_glBindVertexArray.invokeExact(handles.PFN_glBindVertexArray, array); }
        catch (Throwable e) { throw new RuntimeException("error in BindVertexArray", e); }
    }

    /// ```
    /// void glDeleteVertexArrays((int) GLsizei n, const GLuint* arrays);
    /// ```
    public void DeleteVertexArrays(int n, MemorySegment arrays) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteVertexArrays)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteVertexArrays");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteVertexArrays", n, arrays); }
        Handles.MH_glDeleteVertexArrays.invokeExact(handles.PFN_glDeleteVertexArrays, n, arrays); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteVertexArrays", e); }
    }

    /// ```
    /// void glGenVertexArrays((int) GLsizei n, GLuint* arrays);
    /// ```
    public void GenVertexArrays(int n, MemorySegment arrays) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenVertexArrays)) throw new GLSymbolNotFoundError("Symbol not found: glGenVertexArrays");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGenVertexArrays", n, arrays); }
        Handles.MH_glGenVertexArrays.invokeExact(handles.PFN_glGenVertexArrays, n, arrays); }
        catch (Throwable e) { throw new RuntimeException("error in GenVertexArrays", e); }
    }

    /// ```
    /// GLboolean glIsVertexArray((unsigned int) GLuint array);
    /// ```
    public boolean IsVertexArray(int array) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsVertexArray)) throw new GLSymbolNotFoundError("Symbol not found: glIsVertexArray");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsVertexArray", array); }
        return (((byte) Handles.MH_glIsVertexArray.invokeExact(handles.PFN_glIsVertexArray, array)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsVertexArray", e); }
    }

}

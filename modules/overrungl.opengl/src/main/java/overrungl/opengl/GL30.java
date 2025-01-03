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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public sealed class GL30 extends GL21 permits GL31 {
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
    public static final MethodHandle MH_glColorMaski = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN));
    public final MemorySegment PFN_glColorMaski;
    public static final MethodHandle MH_glGetBooleani_v = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetBooleani_v;
    public static final MethodHandle MH_glGetIntegeri_v = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetIntegeri_v;
    public static final MethodHandle MH_glEnablei = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glEnablei;
    public static final MethodHandle MH_glDisablei = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDisablei;
    public static final MethodHandle MH_glIsEnabledi = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIsEnabledi;
    public static final MethodHandle MH_glBeginTransformFeedback = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBeginTransformFeedback;
    public static final MethodHandle MH_glEndTransformFeedback = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public final MemorySegment PFN_glEndTransformFeedback;
    public static final MethodHandle MH_glBindBufferRange = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glBindBufferRange;
    public static final MethodHandle MH_glBindBufferBase = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBindBufferBase;
    public static final MethodHandle MH_glTransformFeedbackVaryings = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTransformFeedbackVaryings;
    public static final MethodHandle MH_glGetTransformFeedbackVarying = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTransformFeedbackVarying;
    public static final MethodHandle MH_glClampColor = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glClampColor;
    public static final MethodHandle MH_glBeginConditionalRender = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBeginConditionalRender;
    public static final MethodHandle MH_glEndConditionalRender = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public final MemorySegment PFN_glEndConditionalRender;
    public static final MethodHandle MH_glVertexAttribIPointer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribIPointer;
    public static final MethodHandle MH_glGetVertexAttribIiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetVertexAttribIiv;
    public static final MethodHandle MH_glGetVertexAttribIuiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetVertexAttribIuiv;
    public static final MethodHandle MH_glVertexAttribI1i = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexAttribI1i;
    public static final MethodHandle MH_glVertexAttribI2i = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexAttribI2i;
    public static final MethodHandle MH_glVertexAttribI3i = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexAttribI3i;
    public static final MethodHandle MH_glVertexAttribI4i = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexAttribI4i;
    public static final MethodHandle MH_glVertexAttribI1ui = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexAttribI1ui;
    public static final MethodHandle MH_glVertexAttribI2ui = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexAttribI2ui;
    public static final MethodHandle MH_glVertexAttribI3ui = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexAttribI3ui;
    public static final MethodHandle MH_glVertexAttribI4ui = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexAttribI4ui;
    public static final MethodHandle MH_glVertexAttribI1iv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribI1iv;
    public static final MethodHandle MH_glVertexAttribI2iv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribI2iv;
    public static final MethodHandle MH_glVertexAttribI3iv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribI3iv;
    public static final MethodHandle MH_glVertexAttribI4iv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribI4iv;
    public static final MethodHandle MH_glVertexAttribI1uiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribI1uiv;
    public static final MethodHandle MH_glVertexAttribI2uiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribI2uiv;
    public static final MethodHandle MH_glVertexAttribI3uiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribI3uiv;
    public static final MethodHandle MH_glVertexAttribI4uiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribI4uiv;
    public static final MethodHandle MH_glVertexAttribI4bv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribI4bv;
    public static final MethodHandle MH_glVertexAttribI4sv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribI4sv;
    public static final MethodHandle MH_glVertexAttribI4ubv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribI4ubv;
    public static final MethodHandle MH_glVertexAttribI4usv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexAttribI4usv;
    public static final MethodHandle MH_glGetUniformuiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetUniformuiv;
    public static final MethodHandle MH_glBindFragDataLocation = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glBindFragDataLocation;
    public static final MethodHandle MH_glGetFragDataLocation = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetFragDataLocation;
    public static final MethodHandle MH_glUniform1ui = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glUniform1ui;
    public static final MethodHandle MH_glUniform2ui = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glUniform2ui;
    public static final MethodHandle MH_glUniform3ui = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glUniform3ui;
    public static final MethodHandle MH_glUniform4ui = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glUniform4ui;
    public static final MethodHandle MH_glUniform1uiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniform1uiv;
    public static final MethodHandle MH_glUniform2uiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniform2uiv;
    public static final MethodHandle MH_glUniform3uiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniform3uiv;
    public static final MethodHandle MH_glUniform4uiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glUniform4uiv;
    public static final MethodHandle MH_glTexParameterIiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTexParameterIiv;
    public static final MethodHandle MH_glTexParameterIuiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTexParameterIuiv;
    public static final MethodHandle MH_glGetTexParameterIiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTexParameterIiv;
    public static final MethodHandle MH_glGetTexParameterIuiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTexParameterIuiv;
    public static final MethodHandle MH_glClearBufferiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glClearBufferiv;
    public static final MethodHandle MH_glClearBufferuiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glClearBufferuiv;
    public static final MethodHandle MH_glClearBufferfv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glClearBufferfv;
    public static final MethodHandle MH_glClearBufferfi = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glClearBufferfi;
    public static final MethodHandle MH_glGetStringi = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glGetStringi;
    public static final MethodHandle MH_glIsRenderbuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIsRenderbuffer;
    public static final MethodHandle MH_glBindRenderbuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBindRenderbuffer;
    public static final MethodHandle MH_glDeleteRenderbuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDeleteRenderbuffers;
    public static final MethodHandle MH_glGenRenderbuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGenRenderbuffers;
    public static final MethodHandle MH_glRenderbufferStorage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glRenderbufferStorage;
    public static final MethodHandle MH_glGetRenderbufferParameteriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetRenderbufferParameteriv;
    public static final MethodHandle MH_glIsFramebuffer = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIsFramebuffer;
    public static final MethodHandle MH_glBindFramebuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBindFramebuffer;
    public static final MethodHandle MH_glDeleteFramebuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDeleteFramebuffers;
    public static final MethodHandle MH_glGenFramebuffers = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGenFramebuffers;
    public static final MethodHandle MH_glCheckFramebufferStatus = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCheckFramebufferStatus;
    public static final MethodHandle MH_glFramebufferTexture1D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glFramebufferTexture1D;
    public static final MethodHandle MH_glFramebufferTexture2D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glFramebufferTexture2D;
    public static final MethodHandle MH_glFramebufferTexture3D = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glFramebufferTexture3D;
    public static final MethodHandle MH_glFramebufferRenderbuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glFramebufferRenderbuffer;
    public static final MethodHandle MH_glGetFramebufferAttachmentParameteriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetFramebufferAttachmentParameteriv;
    public static final MethodHandle MH_glGenerateMipmap = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glGenerateMipmap;
    public static final MethodHandle MH_glBlitFramebuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBlitFramebuffer;
    public static final MethodHandle MH_glRenderbufferStorageMultisample = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glRenderbufferStorageMultisample;
    public static final MethodHandle MH_glFramebufferTextureLayer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glFramebufferTextureLayer;
    public static final MethodHandle MH_glMapBufferRange = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMapBufferRange;
    public static final MethodHandle MH_glFlushMappedBufferRange = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glFlushMappedBufferRange;
    public static final MethodHandle MH_glBindVertexArray = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBindVertexArray;
    public static final MethodHandle MH_glDeleteVertexArrays = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDeleteVertexArrays;
    public static final MethodHandle MH_glGenVertexArrays = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGenVertexArrays;
    public static final MethodHandle MH_glIsVertexArray = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIsVertexArray;

    public GL30(GLLoadFunc func) {
        super(func);
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

    public void ColorMaski(@CType("GLuint") int index, @CType("GLboolean") boolean r, @CType("GLboolean") boolean g, @CType("GLboolean") boolean b, @CType("GLboolean") boolean a) {
        try { if (!Unmarshal.isNullPointer(PFN_glColorMaski))
            MH_glColorMaski.invokeExact(PFN_glColorMaski, index, r, g, b, a);
        }
        catch (Throwable e) { throw new RuntimeException("error in glColorMaski", e); }
    }

    public void GetBooleani_v(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLboolean *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetBooleani_v))
            MH_glGetBooleani_v.invokeExact(PFN_glGetBooleani_v, target, index, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetBooleani_v", e); }
    }

    public void GetIntegeri_v(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLint *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetIntegeri_v))
            MH_glGetIntegeri_v.invokeExact(PFN_glGetIntegeri_v, target, index, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetIntegeri_v", e); }
    }

    public void Enablei(@CType("GLenum") int target, @CType("GLuint") int index) {
        try { if (!Unmarshal.isNullPointer(PFN_glEnablei))
            MH_glEnablei.invokeExact(PFN_glEnablei, target, index);
        }
        catch (Throwable e) { throw new RuntimeException("error in glEnablei", e); }
    }

    public void Disablei(@CType("GLenum") int target, @CType("GLuint") int index) {
        try { if (!Unmarshal.isNullPointer(PFN_glDisablei))
            MH_glDisablei.invokeExact(PFN_glDisablei, target, index);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDisablei", e); }
    }

    public @CType("GLboolean") boolean IsEnabledi(@CType("GLenum") int target, @CType("GLuint") int index) {
        try { if (!Unmarshal.isNullPointer(PFN_glIsEnabledi))
            return (boolean) MH_glIsEnabledi.invokeExact(PFN_glIsEnabledi, target, index);
            else return false;
        }
        catch (Throwable e) { throw new RuntimeException("error in glIsEnabledi", e); }
    }

    public void BeginTransformFeedback(@CType("GLenum") int primitiveMode) {
        try { if (!Unmarshal.isNullPointer(PFN_glBeginTransformFeedback))
            MH_glBeginTransformFeedback.invokeExact(PFN_glBeginTransformFeedback, primitiveMode);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBeginTransformFeedback", e); }
    }

    public void EndTransformFeedback() {
        try { if (!Unmarshal.isNullPointer(PFN_glEndTransformFeedback))
            MH_glEndTransformFeedback.invokeExact(PFN_glEndTransformFeedback);
        }
        catch (Throwable e) { throw new RuntimeException("error in glEndTransformFeedback", e); }
    }

    public void BindBufferRange(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindBufferRange))
            MH_glBindBufferRange.invokeExact(PFN_glBindBufferRange, target, index, buffer, offset, size);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindBufferRange", e); }
    }

    public void BindBufferBase(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint") int buffer) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindBufferBase))
            MH_glBindBufferBase.invokeExact(PFN_glBindBufferBase, target, index, buffer);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindBufferBase", e); }
    }

    public void TransformFeedbackVaryings(@CType("GLuint") int program, @CType("GLsizei") int count, @CType("const GLchar *const*") java.lang.foreign.MemorySegment varyings, @CType("GLenum") int bufferMode) {
        try { if (!Unmarshal.isNullPointer(PFN_glTransformFeedbackVaryings))
            MH_glTransformFeedbackVaryings.invokeExact(PFN_glTransformFeedbackVaryings, program, count, varyings, bufferMode);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTransformFeedbackVaryings", e); }
    }

    public void GetTransformFeedbackVarying(@CType("GLuint") int program, @CType("GLuint") int index, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLsizei *") java.lang.foreign.MemorySegment size, @CType("GLenum *") java.lang.foreign.MemorySegment type, @CType("GLchar *") java.lang.foreign.MemorySegment name) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetTransformFeedbackVarying))
            MH_glGetTransformFeedbackVarying.invokeExact(PFN_glGetTransformFeedbackVarying, program, index, bufSize, length, size, type, name);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetTransformFeedbackVarying", e); }
    }

    public void ClampColor(@CType("GLenum") int target, @CType("GLenum") int clamp) {
        try { if (!Unmarshal.isNullPointer(PFN_glClampColor))
            MH_glClampColor.invokeExact(PFN_glClampColor, target, clamp);
        }
        catch (Throwable e) { throw new RuntimeException("error in glClampColor", e); }
    }

    public void BeginConditionalRender(@CType("GLuint") int id, @CType("GLenum") int mode) {
        try { if (!Unmarshal.isNullPointer(PFN_glBeginConditionalRender))
            MH_glBeginConditionalRender.invokeExact(PFN_glBeginConditionalRender, id, mode);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBeginConditionalRender", e); }
    }

    public void EndConditionalRender() {
        try { if (!Unmarshal.isNullPointer(PFN_glEndConditionalRender))
            MH_glEndConditionalRender.invokeExact(PFN_glEndConditionalRender);
        }
        catch (Throwable e) { throw new RuntimeException("error in glEndConditionalRender", e); }
    }

    public void VertexAttribIPointer(@CType("GLuint") int index, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribIPointer))
            MH_glVertexAttribIPointer.invokeExact(PFN_glVertexAttribIPointer, index, size, type, stride, pointer);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribIPointer", e); }
    }

    public void GetVertexAttribIiv(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetVertexAttribIiv))
            MH_glGetVertexAttribIiv.invokeExact(PFN_glGetVertexAttribIiv, index, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribIiv", e); }
    }

    public void GetVertexAttribIuiv(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetVertexAttribIuiv))
            MH_glGetVertexAttribIuiv.invokeExact(PFN_glGetVertexAttribIuiv, index, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexAttribIuiv", e); }
    }

    public void VertexAttribI1i(@CType("GLuint") int index, @CType("GLint") int x) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribI1i))
            MH_glVertexAttribI1i.invokeExact(PFN_glVertexAttribI1i, index, x);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI1i", e); }
    }

    public void VertexAttribI2i(@CType("GLuint") int index, @CType("GLint") int x, @CType("GLint") int y) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribI2i))
            MH_glVertexAttribI2i.invokeExact(PFN_glVertexAttribI2i, index, x, y);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI2i", e); }
    }

    public void VertexAttribI3i(@CType("GLuint") int index, @CType("GLint") int x, @CType("GLint") int y, @CType("GLint") int z) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribI3i))
            MH_glVertexAttribI3i.invokeExact(PFN_glVertexAttribI3i, index, x, y, z);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI3i", e); }
    }

    public void VertexAttribI4i(@CType("GLuint") int index, @CType("GLint") int x, @CType("GLint") int y, @CType("GLint") int z, @CType("GLint") int w) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribI4i))
            MH_glVertexAttribI4i.invokeExact(PFN_glVertexAttribI4i, index, x, y, z, w);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4i", e); }
    }

    public void VertexAttribI1ui(@CType("GLuint") int index, @CType("GLuint") int x) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribI1ui))
            MH_glVertexAttribI1ui.invokeExact(PFN_glVertexAttribI1ui, index, x);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI1ui", e); }
    }

    public void VertexAttribI2ui(@CType("GLuint") int index, @CType("GLuint") int x, @CType("GLuint") int y) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribI2ui))
            MH_glVertexAttribI2ui.invokeExact(PFN_glVertexAttribI2ui, index, x, y);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI2ui", e); }
    }

    public void VertexAttribI3ui(@CType("GLuint") int index, @CType("GLuint") int x, @CType("GLuint") int y, @CType("GLuint") int z) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribI3ui))
            MH_glVertexAttribI3ui.invokeExact(PFN_glVertexAttribI3ui, index, x, y, z);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI3ui", e); }
    }

    public void VertexAttribI4ui(@CType("GLuint") int index, @CType("GLuint") int x, @CType("GLuint") int y, @CType("GLuint") int z, @CType("GLuint") int w) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribI4ui))
            MH_glVertexAttribI4ui.invokeExact(PFN_glVertexAttribI4ui, index, x, y, z, w);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4ui", e); }
    }

    public void VertexAttribI1iv(@CType("GLuint") int index, @CType("const GLint *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribI1iv))
            MH_glVertexAttribI1iv.invokeExact(PFN_glVertexAttribI1iv, index, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI1iv", e); }
    }

    public void VertexAttribI2iv(@CType("GLuint") int index, @CType("const GLint *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribI2iv))
            MH_glVertexAttribI2iv.invokeExact(PFN_glVertexAttribI2iv, index, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI2iv", e); }
    }

    public void VertexAttribI3iv(@CType("GLuint") int index, @CType("const GLint *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribI3iv))
            MH_glVertexAttribI3iv.invokeExact(PFN_glVertexAttribI3iv, index, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI3iv", e); }
    }

    public void VertexAttribI4iv(@CType("GLuint") int index, @CType("const GLint *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribI4iv))
            MH_glVertexAttribI4iv.invokeExact(PFN_glVertexAttribI4iv, index, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4iv", e); }
    }

    public void VertexAttribI1uiv(@CType("GLuint") int index, @CType("const GLuint *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribI1uiv))
            MH_glVertexAttribI1uiv.invokeExact(PFN_glVertexAttribI1uiv, index, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI1uiv", e); }
    }

    public void VertexAttribI2uiv(@CType("GLuint") int index, @CType("const GLuint *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribI2uiv))
            MH_glVertexAttribI2uiv.invokeExact(PFN_glVertexAttribI2uiv, index, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI2uiv", e); }
    }

    public void VertexAttribI3uiv(@CType("GLuint") int index, @CType("const GLuint *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribI3uiv))
            MH_glVertexAttribI3uiv.invokeExact(PFN_glVertexAttribI3uiv, index, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI3uiv", e); }
    }

    public void VertexAttribI4uiv(@CType("GLuint") int index, @CType("const GLuint *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribI4uiv))
            MH_glVertexAttribI4uiv.invokeExact(PFN_glVertexAttribI4uiv, index, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4uiv", e); }
    }

    public void VertexAttribI4bv(@CType("GLuint") int index, @CType("const GLbyte *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribI4bv))
            MH_glVertexAttribI4bv.invokeExact(PFN_glVertexAttribI4bv, index, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4bv", e); }
    }

    public void VertexAttribI4sv(@CType("GLuint") int index, @CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribI4sv))
            MH_glVertexAttribI4sv.invokeExact(PFN_glVertexAttribI4sv, index, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4sv", e); }
    }

    public void VertexAttribI4ubv(@CType("GLuint") int index, @CType("const GLubyte *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribI4ubv))
            MH_glVertexAttribI4ubv.invokeExact(PFN_glVertexAttribI4ubv, index, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4ubv", e); }
    }

    public void VertexAttribI4usv(@CType("GLuint") int index, @CType("const GLushort *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexAttribI4usv))
            MH_glVertexAttribI4usv.invokeExact(PFN_glVertexAttribI4usv, index, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribI4usv", e); }
    }

    public void GetUniformuiv(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetUniformuiv))
            MH_glGetUniformuiv.invokeExact(PFN_glGetUniformuiv, program, location, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetUniformuiv", e); }
    }

    public void BindFragDataLocation(@CType("GLuint") int program, @CType("GLuint") int color, @CType("const GLchar *") java.lang.foreign.MemorySegment name) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindFragDataLocation))
            MH_glBindFragDataLocation.invokeExact(PFN_glBindFragDataLocation, program, color, name);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindFragDataLocation", e); }
    }

    public @CType("GLint") int GetFragDataLocation(@CType("GLuint") int program, @CType("const GLchar *") java.lang.foreign.MemorySegment name) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetFragDataLocation))
            return (int) MH_glGetFragDataLocation.invokeExact(PFN_glGetFragDataLocation, program, name);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetFragDataLocation", e); }
    }

    public void Uniform1ui(@CType("GLint") int location, @CType("GLuint") int v0) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform1ui))
            MH_glUniform1ui.invokeExact(PFN_glUniform1ui, location, v0);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform1ui", e); }
    }

    public void Uniform2ui(@CType("GLint") int location, @CType("GLuint") int v0, @CType("GLuint") int v1) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform2ui))
            MH_glUniform2ui.invokeExact(PFN_glUniform2ui, location, v0, v1);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform2ui", e); }
    }

    public void Uniform3ui(@CType("GLint") int location, @CType("GLuint") int v0, @CType("GLuint") int v1, @CType("GLuint") int v2) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform3ui))
            MH_glUniform3ui.invokeExact(PFN_glUniform3ui, location, v0, v1, v2);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform3ui", e); }
    }

    public void Uniform4ui(@CType("GLint") int location, @CType("GLuint") int v0, @CType("GLuint") int v1, @CType("GLuint") int v2, @CType("GLuint") int v3) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform4ui))
            MH_glUniform4ui.invokeExact(PFN_glUniform4ui, location, v0, v1, v2, v3);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform4ui", e); }
    }

    public void Uniform1uiv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform1uiv))
            MH_glUniform1uiv.invokeExact(PFN_glUniform1uiv, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform1uiv", e); }
    }

    public void Uniform2uiv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform2uiv))
            MH_glUniform2uiv.invokeExact(PFN_glUniform2uiv, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform2uiv", e); }
    }

    public void Uniform3uiv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform3uiv))
            MH_glUniform3uiv.invokeExact(PFN_glUniform3uiv, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform3uiv", e); }
    }

    public void Uniform4uiv(@CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glUniform4uiv))
            MH_glUniform4uiv.invokeExact(PFN_glUniform4uiv, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glUniform4uiv", e); }
    }

    public void TexParameterIiv(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glTexParameterIiv))
            MH_glTexParameterIiv.invokeExact(PFN_glTexParameterIiv, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTexParameterIiv", e); }
    }

    public void TexParameterIuiv(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLuint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glTexParameterIuiv))
            MH_glTexParameterIuiv.invokeExact(PFN_glTexParameterIuiv, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTexParameterIuiv", e); }
    }

    public void GetTexParameterIiv(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetTexParameterIiv))
            MH_glGetTexParameterIiv.invokeExact(PFN_glGetTexParameterIiv, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetTexParameterIiv", e); }
    }

    public void GetTexParameterIuiv(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetTexParameterIuiv))
            MH_glGetTexParameterIuiv.invokeExact(PFN_glGetTexParameterIuiv, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetTexParameterIuiv", e); }
    }

    public void ClearBufferiv(@CType("GLenum") int buffer, @CType("GLint") int drawbuffer, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glClearBufferiv))
            MH_glClearBufferiv.invokeExact(PFN_glClearBufferiv, buffer, drawbuffer, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glClearBufferiv", e); }
    }

    public void ClearBufferuiv(@CType("GLenum") int buffer, @CType("GLint") int drawbuffer, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glClearBufferuiv))
            MH_glClearBufferuiv.invokeExact(PFN_glClearBufferuiv, buffer, drawbuffer, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glClearBufferuiv", e); }
    }

    public void ClearBufferfv(@CType("GLenum") int buffer, @CType("GLint") int drawbuffer, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glClearBufferfv))
            MH_glClearBufferfv.invokeExact(PFN_glClearBufferfv, buffer, drawbuffer, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glClearBufferfv", e); }
    }

    public void ClearBufferfi(@CType("GLenum") int buffer, @CType("GLint") int drawbuffer, @CType("GLfloat") float depth, @CType("GLint") int stencil) {
        try { if (!Unmarshal.isNullPointer(PFN_glClearBufferfi))
            MH_glClearBufferfi.invokeExact(PFN_glClearBufferfi, buffer, drawbuffer, depth, stencil);
        }
        catch (Throwable e) { throw new RuntimeException("error in glClearBufferfi", e); }
    }

    public @CType("const GLubyte *") java.lang.foreign.MemorySegment GetStringi(@CType("GLenum") int name, @CType("GLuint") int index) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetStringi))
            return (java.lang.foreign.MemorySegment) MH_glGetStringi.invokeExact(PFN_glGetStringi, name, index);
            else return MemorySegment.NULL;
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetStringi", e); }
    }

    public @CType("GLboolean") boolean IsRenderbuffer(@CType("GLuint") int renderbuffer) {
        try { if (!Unmarshal.isNullPointer(PFN_glIsRenderbuffer))
            return (boolean) MH_glIsRenderbuffer.invokeExact(PFN_glIsRenderbuffer, renderbuffer);
            else return false;
        }
        catch (Throwable e) { throw new RuntimeException("error in glIsRenderbuffer", e); }
    }

    public void BindRenderbuffer(@CType("GLenum") int target, @CType("GLuint") int renderbuffer) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindRenderbuffer))
            MH_glBindRenderbuffer.invokeExact(PFN_glBindRenderbuffer, target, renderbuffer);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindRenderbuffer", e); }
    }

    public void DeleteRenderbuffers(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment renderbuffers) {
        try { if (!Unmarshal.isNullPointer(PFN_glDeleteRenderbuffers))
            MH_glDeleteRenderbuffers.invokeExact(PFN_glDeleteRenderbuffers, n, renderbuffers);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteRenderbuffers", e); }
    }

    public void GenRenderbuffers(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment renderbuffers) {
        try { if (!Unmarshal.isNullPointer(PFN_glGenRenderbuffers))
            MH_glGenRenderbuffers.invokeExact(PFN_glGenRenderbuffers, n, renderbuffers);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGenRenderbuffers", e); }
    }

    public void RenderbufferStorage(@CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        try { if (!Unmarshal.isNullPointer(PFN_glRenderbufferStorage))
            MH_glRenderbufferStorage.invokeExact(PFN_glRenderbufferStorage, target, internalformat, width, height);
        }
        catch (Throwable e) { throw new RuntimeException("error in glRenderbufferStorage", e); }
    }

    public void GetRenderbufferParameteriv(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetRenderbufferParameteriv))
            MH_glGetRenderbufferParameteriv.invokeExact(PFN_glGetRenderbufferParameteriv, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetRenderbufferParameteriv", e); }
    }

    public @CType("GLboolean") boolean IsFramebuffer(@CType("GLuint") int framebuffer) {
        try { if (!Unmarshal.isNullPointer(PFN_glIsFramebuffer))
            return (boolean) MH_glIsFramebuffer.invokeExact(PFN_glIsFramebuffer, framebuffer);
            else return false;
        }
        catch (Throwable e) { throw new RuntimeException("error in glIsFramebuffer", e); }
    }

    public void BindFramebuffer(@CType("GLenum") int target, @CType("GLuint") int framebuffer) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindFramebuffer))
            MH_glBindFramebuffer.invokeExact(PFN_glBindFramebuffer, target, framebuffer);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindFramebuffer", e); }
    }

    public void DeleteFramebuffers(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment framebuffers) {
        try { if (!Unmarshal.isNullPointer(PFN_glDeleteFramebuffers))
            MH_glDeleteFramebuffers.invokeExact(PFN_glDeleteFramebuffers, n, framebuffers);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteFramebuffers", e); }
    }

    public void GenFramebuffers(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment framebuffers) {
        try { if (!Unmarshal.isNullPointer(PFN_glGenFramebuffers))
            MH_glGenFramebuffers.invokeExact(PFN_glGenFramebuffers, n, framebuffers);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGenFramebuffers", e); }
    }

    public @CType("GLenum") int CheckFramebufferStatus(@CType("GLenum") int target) {
        try { if (!Unmarshal.isNullPointer(PFN_glCheckFramebufferStatus))
            return (int) MH_glCheckFramebufferStatus.invokeExact(PFN_glCheckFramebufferStatus, target);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glCheckFramebufferStatus", e); }
    }

    public void FramebufferTexture1D(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLenum") int textarget, @CType("GLuint") int texture, @CType("GLint") int level) {
        try { if (!Unmarshal.isNullPointer(PFN_glFramebufferTexture1D))
            MH_glFramebufferTexture1D.invokeExact(PFN_glFramebufferTexture1D, target, attachment, textarget, texture, level);
        }
        catch (Throwable e) { throw new RuntimeException("error in glFramebufferTexture1D", e); }
    }

    public void FramebufferTexture2D(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLenum") int textarget, @CType("GLuint") int texture, @CType("GLint") int level) {
        try { if (!Unmarshal.isNullPointer(PFN_glFramebufferTexture2D))
            MH_glFramebufferTexture2D.invokeExact(PFN_glFramebufferTexture2D, target, attachment, textarget, texture, level);
        }
        catch (Throwable e) { throw new RuntimeException("error in glFramebufferTexture2D", e); }
    }

    public void FramebufferTexture3D(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLenum") int textarget, @CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int zoffset) {
        try { if (!Unmarshal.isNullPointer(PFN_glFramebufferTexture3D))
            MH_glFramebufferTexture3D.invokeExact(PFN_glFramebufferTexture3D, target, attachment, textarget, texture, level, zoffset);
        }
        catch (Throwable e) { throw new RuntimeException("error in glFramebufferTexture3D", e); }
    }

    public void FramebufferRenderbuffer(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLenum") int renderbuffertarget, @CType("GLuint") int renderbuffer) {
        try { if (!Unmarshal.isNullPointer(PFN_glFramebufferRenderbuffer))
            MH_glFramebufferRenderbuffer.invokeExact(PFN_glFramebufferRenderbuffer, target, attachment, renderbuffertarget, renderbuffer);
        }
        catch (Throwable e) { throw new RuntimeException("error in glFramebufferRenderbuffer", e); }
    }

    public void GetFramebufferAttachmentParameteriv(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetFramebufferAttachmentParameteriv))
            MH_glGetFramebufferAttachmentParameteriv.invokeExact(PFN_glGetFramebufferAttachmentParameteriv, target, attachment, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetFramebufferAttachmentParameteriv", e); }
    }

    public void GenerateMipmap(@CType("GLenum") int target) {
        try { if (!Unmarshal.isNullPointer(PFN_glGenerateMipmap))
            MH_glGenerateMipmap.invokeExact(PFN_glGenerateMipmap, target);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGenerateMipmap", e); }
    }

    public void BlitFramebuffer(@CType("GLint") int srcX0, @CType("GLint") int srcY0, @CType("GLint") int srcX1, @CType("GLint") int srcY1, @CType("GLint") int dstX0, @CType("GLint") int dstY0, @CType("GLint") int dstX1, @CType("GLint") int dstY1, @CType("GLbitfield") int mask, @CType("GLenum") int filter) {
        try { if (!Unmarshal.isNullPointer(PFN_glBlitFramebuffer))
            MH_glBlitFramebuffer.invokeExact(PFN_glBlitFramebuffer, srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBlitFramebuffer", e); }
    }

    public void RenderbufferStorageMultisample(@CType("GLenum") int target, @CType("GLsizei") int samples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        try { if (!Unmarshal.isNullPointer(PFN_glRenderbufferStorageMultisample))
            MH_glRenderbufferStorageMultisample.invokeExact(PFN_glRenderbufferStorageMultisample, target, samples, internalformat, width, height);
        }
        catch (Throwable e) { throw new RuntimeException("error in glRenderbufferStorageMultisample", e); }
    }

    public void FramebufferTextureLayer(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int layer) {
        try { if (!Unmarshal.isNullPointer(PFN_glFramebufferTextureLayer))
            MH_glFramebufferTextureLayer.invokeExact(PFN_glFramebufferTextureLayer, target, attachment, texture, level, layer);
        }
        catch (Throwable e) { throw new RuntimeException("error in glFramebufferTextureLayer", e); }
    }

    public @CType("void*") java.lang.foreign.MemorySegment MapBufferRange(@CType("GLenum") int target, @CType("GLintptr") long offset, @CType("GLsizeiptr") long length, @CType("GLbitfield") int access) {
        try { if (!Unmarshal.isNullPointer(PFN_glMapBufferRange))
            return (java.lang.foreign.MemorySegment) MH_glMapBufferRange.invokeExact(PFN_glMapBufferRange, target, offset, length, access);
            else return MemorySegment.NULL;
        }
        catch (Throwable e) { throw new RuntimeException("error in glMapBufferRange", e); }
    }

    public void FlushMappedBufferRange(@CType("GLenum") int target, @CType("GLintptr") long offset, @CType("GLsizeiptr") long length) {
        try { if (!Unmarshal.isNullPointer(PFN_glFlushMappedBufferRange))
            MH_glFlushMappedBufferRange.invokeExact(PFN_glFlushMappedBufferRange, target, offset, length);
        }
        catch (Throwable e) { throw new RuntimeException("error in glFlushMappedBufferRange", e); }
    }

    public void BindVertexArray(@CType("GLuint") int array) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindVertexArray))
            MH_glBindVertexArray.invokeExact(PFN_glBindVertexArray, array);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindVertexArray", e); }
    }

    public void DeleteVertexArrays(@CType("GLsizei") int n, @CType("const GLuint *") java.lang.foreign.MemorySegment arrays) {
        try { if (!Unmarshal.isNullPointer(PFN_glDeleteVertexArrays))
            MH_glDeleteVertexArrays.invokeExact(PFN_glDeleteVertexArrays, n, arrays);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteVertexArrays", e); }
    }

    public void GenVertexArrays(@CType("GLsizei") int n, @CType("GLuint *") java.lang.foreign.MemorySegment arrays) {
        try { if (!Unmarshal.isNullPointer(PFN_glGenVertexArrays))
            MH_glGenVertexArrays.invokeExact(PFN_glGenVertexArrays, n, arrays);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGenVertexArrays", e); }
    }

    public @CType("GLboolean") boolean IsVertexArray(@CType("GLuint") int array) {
        try { if (!Unmarshal.isNullPointer(PFN_glIsVertexArray))
            return (boolean) MH_glIsVertexArray.invokeExact(PFN_glIsVertexArray, array);
            else return false;
        }
        catch (Throwable e) { throw new RuntimeException("error in glIsVertexArray", e); }
    }

    // --- OverrunGL custom code ---
    public boolean GetBooleani_v(@CType("GLenum") int target, @CType("GLuint") int index) { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.bytes((byte) 0); GetBooleani_v(target, index, p); return p.get(ValueLayout.JAVA_BOOLEAN, 0); } }
    public int GetIntegeri_v(@CType("GLenum") int target, @CType("GLuint") int index) { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); GetIntegeri_v(target, index, p); return p.get(ValueLayout.JAVA_INT, 0); } }
    public void BindFragDataLocation(@CType("GLuint") int program, @CType("GLuint") int color, @CType("const GLchar *") String name) { try (var __stack = MemoryStack.pushLocal()) { BindFragDataLocation(program, color, Marshal.marshal(__stack, name)); } }
    public int GetFragDataLocation(@CType("GLuint") int program, @CType("const GLchar *") String name) { try (var __stack = MemoryStack.pushLocal()) { return GetFragDataLocation(program, Marshal.marshal(__stack, name)); } }
    public String GetStringi_(@CType("GLenum") int name, @CType("GLuint") int index) { return Unmarshal.unmarshalAsString(GetStringi(name, index)); }
    public void DeleteRenderbuffers(int renderbuffer) { try (var __stack = MemoryStack.pushLocal()) { DeleteRenderbuffers(1, __stack.ints(renderbuffer)); } }
    public int GenRenderbuffers() { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); GenRenderbuffers(1, p); return p.get(ValueLayout.JAVA_INT, 0); } }
    public int GetRenderbufferParameteriv(@CType("GLenum") int target, @CType("GLenum") int pname) { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); GetRenderbufferParameteriv(target, pname, p); return p.get(ValueLayout.JAVA_INT, 0); } }
    public void DeleteFramebuffers(int framebuffer) { try (var __stack = MemoryStack.pushLocal()) { DeleteFramebuffers(1, __stack.ints(framebuffer)); } }
    public int GenFramebuffers() { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); GenFramebuffers(1, p); return p.get(ValueLayout.JAVA_INT, 0); } }
    public int GetFramebufferAttachmentParameteriv(@CType("GLenum") int target, @CType("GLenum") int attachment, @CType("GLenum") int pname) { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); GetFramebufferAttachmentParameteriv(target, attachment, pname, p); return p.get(ValueLayout.JAVA_INT, 0); } }
    public void DeleteVertexArrays(int array) { try (var __stack = MemoryStack.pushLocal()) { DeleteVertexArrays(1, __stack.ints(array)); } }
    public int GenVertexArrays() { try (var __stack = MemoryStack.pushLocal()) { var p = __stack.ints(0); GenVertexArrays(1, p); return p.get(ValueLayout.JAVA_INT, 0); } }
}

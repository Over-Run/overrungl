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

package overrungl.opengl;

import org.jetbrains.annotations.Nullable;
import overrungl.opengl.ext.arb.GLARBColorBufferFloat;
import overrungl.opengl.ext.arb.GLARBTextureFloat;
import overrungl.internal.RuntimeHelper;
import overrungl.util.MemoryStack;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;
import static overrungl.FunctionDescriptors.*;
import static overrungl.opengl.GLLoader.*;

/**
 * The OpenGL 3.0 core profile functions.
 * <p>
 * These extensions are promoted in this version:
 * <ul>
 *     <li>{@linkplain GLARBColorBufferFloat GL_ARB_color_buffer_float}</li>
 *     <li>GL_ARB_framebuffer_object</li>
 *     <li>GL_ARB_map_buffer_range</li>
 *     <li>{@linkplain GLARBTextureFloat GL_ARB_texture_float}</li>
 *     <li>GL_ARB_vertex_array_object</li>
 * </ul>
 *
 * @sealedGraph
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL30C extends GL21C permits GL31C {
    public static final int COMPARE_REF_TO_TEXTURE = 0x884E;
    public static final int CLIP_DISTANCE0 = 0x3000;
    public static final int CLIP_DISTANCE1 = 0x3001;
    public static final int CLIP_DISTANCE2 = 0x3002;
    public static final int CLIP_DISTANCE3 = 0x3003;
    public static final int CLIP_DISTANCE4 = 0x3004;
    public static final int CLIP_DISTANCE5 = 0x3005;
    public static final int CLIP_DISTANCE6 = 0x3006;
    public static final int CLIP_DISTANCE7 = 0x3007;
    public static final int MAX_CLIP_DISTANCES = 0x0D32;
    public static final int MAJOR_VERSION = 0x821B;
    public static final int MINOR_VERSION = 0x821C;
    public static final int NUM_EXTENSIONS = 0x821D;
    public static final int CONTEXT_FLAGS = 0x821E;
    public static final int COMPRESSED_RED = 0x8225;
    public static final int COMPRESSED_RG = 0x8226;
    public static final int CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT = 0x00000001;
    public static final int RGBA32F = 0x8814;
    public static final int RGB32F = 0x8815;
    public static final int RGBA16F = 0x881A;
    public static final int RGB16F = 0x881B;
    public static final int VERTEX_ATTRIB_ARRAY_INTEGER = 0x88FD;
    public static final int MAX_ARRAY_TEXTURE_LAYERS = 0x88FF;
    public static final int MIN_PROGRAM_TEXEL_OFFSET = 0x8904;
    public static final int MAX_PROGRAM_TEXEL_OFFSET = 0x8905;
    public static final int CLAMP_READ_COLOR = 0x891C;
    public static final int FIXED_ONLY = 0x891D;
    public static final int MAX_VARYING_COMPONENTS = 0x8B4B;
    public static final int TEXTURE_1D_ARRAY = 0x8C18;
    public static final int PROXY_TEXTURE_1D_ARRAY = 0x8C19;
    public static final int TEXTURE_2D_ARRAY = 0x8C1A;
    public static final int PROXY_TEXTURE_2D_ARRAY = 0x8C1B;
    public static final int TEXTURE_BINDING_1D_ARRAY = 0x8C1C;
    public static final int TEXTURE_BINDING_2D_ARRAY = 0x8C1D;
    public static final int R11F_G11F_B10F = 0x8C3A;
    public static final int UNSIGNED_INT_10F_11F_11F_REV = 0x8C3B;
    public static final int RGB9_E5 = 0x8C3D;
    public static final int UNSIGNED_INT_5_9_9_9_REV = 0x8C3E;
    public static final int TEXTURE_SHARED_SIZE = 0x8C3F;
    public static final int TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH = 0x8C76;
    public static final int TRANSFORM_FEEDBACK_BUFFER_MODE = 0x8C7F;
    public static final int MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS = 0x8C80;
    public static final int TRANSFORM_FEEDBACK_VARYINGS = 0x8C83;
    public static final int TRANSFORM_FEEDBACK_BUFFER_START = 0x8C84;
    public static final int TRANSFORM_FEEDBACK_BUFFER_SIZE = 0x8C85;
    public static final int PRIMITIVES_GENERATED = 0x8C87;
    public static final int TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN = 0x8C88;
    public static final int RASTERIZER_DISCARD = 0x8C89;
    public static final int MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 0x8C8A;
    public static final int MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS = 0x8C8B;
    public static final int INTERLEAVED_ATTRIBS = 0x8C8C;
    public static final int SEPARATE_ATTRIBS = 0x8C8D;
    public static final int TRANSFORM_FEEDBACK_BUFFER = 0x8C8E;
    public static final int TRANSFORM_FEEDBACK_BUFFER_BINDING = 0x8C8F;
    public static final int RGBA32UI = 0x8D70;
    public static final int RGB32UI = 0x8D71;
    public static final int RGBA16UI = 0x8D76;
    public static final int RGB16UI = 0x8D77;
    public static final int RGBA8UI = 0x8D7C;
    public static final int RGB8UI = 0x8D7D;
    public static final int RGBA32I = 0x8D82;
    public static final int RGB32I = 0x8D83;
    public static final int RGBA16I = 0x8D88;
    public static final int RGB16I = 0x8D89;
    public static final int RGBA8I = 0x8D8E;
    public static final int RGB8I = 0x8D8F;
    public static final int RED_INTEGER = 0x8D94;
    public static final int GREEN_INTEGER = 0x8D95;
    public static final int BLUE_INTEGER = 0x8D96;
    public static final int RGB_INTEGER = 0x8D98;
    public static final int RGBA_INTEGER = 0x8D99;
    public static final int BGR_INTEGER = 0x8D9A;
    public static final int BGRA_INTEGER = 0x8D9B;
    public static final int SAMPLER_1D_ARRAY = 0x8DC0;
    public static final int SAMPLER_2D_ARRAY = 0x8DC1;
    public static final int SAMPLER_1D_ARRAY_SHADOW = 0x8DC3;
    public static final int SAMPLER_2D_ARRAY_SHADOW = 0x8DC4;
    public static final int SAMPLER_CUBE_SHADOW = 0x8DC5;
    public static final int UNSIGNED_INT_VEC2 = 0x8DC6;
    public static final int UNSIGNED_INT_VEC3 = 0x8DC7;
    public static final int UNSIGNED_INT_VEC4 = 0x8DC8;
    public static final int INT_SAMPLER_1D = 0x8DC9;
    public static final int INT_SAMPLER_2D = 0x8DCA;
    public static final int INT_SAMPLER_3D = 0x8DCB;
    public static final int INT_SAMPLER_CUBE = 0x8DCC;
    public static final int INT_SAMPLER_1D_ARRAY = 0x8DCE;
    public static final int INT_SAMPLER_2D_ARRAY = 0x8DCF;
    public static final int UNSIGNED_INT_SAMPLER_1D = 0x8DD1;
    public static final int UNSIGNED_INT_SAMPLER_2D = 0x8DD2;
    public static final int UNSIGNED_INT_SAMPLER_3D = 0x8DD3;
    public static final int UNSIGNED_INT_SAMPLER_CUBE = 0x8DD4;
    public static final int UNSIGNED_INT_SAMPLER_1D_ARRAY = 0x8DD6;
    public static final int UNSIGNED_INT_SAMPLER_2D_ARRAY = 0x8DD7;
    public static final int QUERY_WAIT = 0x8E13;
    public static final int QUERY_NO_WAIT = 0x8E14;
    public static final int QUERY_BY_REGION_WAIT = 0x8E15;
    public static final int QUERY_BY_REGION_NO_WAIT = 0x8E16;
    public static final int BUFFER_ACCESS_FLAGS = 0x911F;
    public static final int BUFFER_MAP_LENGTH = 0x9120;
    public static final int BUFFER_MAP_OFFSET = 0x9121;
    public static final int DEPTH_COMPONENT32F = 0x8CAC;
    public static final int DEPTH32F_STENCIL8 = 0x8CAD;
    public static final int FLOAT_32_UNSIGNED_INT_24_8_REV = 0x8DAD;
    public static final int INVALID_FRAMEBUFFER_OPERATION = 0x0506;
    public static final int FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING = 0x8210;
    public static final int FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE = 0x8211;
    public static final int FRAMEBUFFER_ATTACHMENT_RED_SIZE = 0x8212;
    public static final int FRAMEBUFFER_ATTACHMENT_GREEN_SIZE = 0x8213;
    public static final int FRAMEBUFFER_ATTACHMENT_BLUE_SIZE = 0x8214;
    public static final int FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE = 0x8215;
    public static final int FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE = 0x8216;
    public static final int FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE = 0x8217;
    public static final int FRAMEBUFFER_DEFAULT = 0x8218;
    public static final int FRAMEBUFFER_UNDEFINED = 0x8219;
    public static final int DEPTH_STENCIL_ATTACHMENT = 0x821A;
    public static final int MAX_RENDERBUFFER_SIZE = 0x84E8;
    public static final int DEPTH_STENCIL = 0x84F9;
    public static final int UNSIGNED_INT_24_8 = 0x84FA;
    public static final int DEPTH24_STENCIL8 = 0x88F0;
    public static final int TEXTURE_STENCIL_SIZE = 0x88F1;
    public static final int TEXTURE_RED_TYPE = 0x8C10;
    public static final int TEXTURE_GREEN_TYPE = 0x8C11;
    public static final int TEXTURE_BLUE_TYPE = 0x8C12;
    public static final int TEXTURE_ALPHA_TYPE = 0x8C13;
    public static final int TEXTURE_DEPTH_TYPE = 0x8C16;
    public static final int UNSIGNED_NORMALIZED = 0x8C17;
    public static final int FRAMEBUFFER_BINDING = 0x8CA6;
    public static final int DRAW_FRAMEBUFFER_BINDING = 0x8CA6;
    public static final int RENDERBUFFER_BINDING = 0x8CA7;
    public static final int READ_FRAMEBUFFER = 0x8CA8;
    public static final int DRAW_FRAMEBUFFER = 0x8CA9;
    public static final int READ_FRAMEBUFFER_BINDING = 0x8CAA;
    public static final int RENDERBUFFER_SAMPLES = 0x8CAB;
    public static final int FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 0x8CD0;
    public static final int FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 0x8CD1;
    public static final int FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 0x8CD2;
    public static final int FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3;
    public static final int FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 0x8CD4;
    public static final int FRAMEBUFFER_COMPLETE = 0x8CD5;
    public static final int FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 0x8CD6;
    public static final int FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x8CD7;
    public static final int FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER = 0x8CDB;
    public static final int FRAMEBUFFER_INCOMPLETE_READ_BUFFER = 0x8CDC;
    public static final int FRAMEBUFFER_UNSUPPORTED = 0x8CDD;
    public static final int MAX_COLOR_ATTACHMENTS = 0x8CDF;
    public static final int COLOR_ATTACHMENT0 = 0x8CE0;
    public static final int COLOR_ATTACHMENT1 = 0x8CE1;
    public static final int COLOR_ATTACHMENT2 = 0x8CE2;
    public static final int COLOR_ATTACHMENT3 = 0x8CE3;
    public static final int COLOR_ATTACHMENT4 = 0x8CE4;
    public static final int COLOR_ATTACHMENT5 = 0x8CE5;
    public static final int COLOR_ATTACHMENT6 = 0x8CE6;
    public static final int COLOR_ATTACHMENT7 = 0x8CE7;
    public static final int COLOR_ATTACHMENT8 = 0x8CE8;
    public static final int COLOR_ATTACHMENT9 = 0x8CE9;
    public static final int COLOR_ATTACHMENT10 = 0x8CEA;
    public static final int COLOR_ATTACHMENT11 = 0x8CEB;
    public static final int COLOR_ATTACHMENT12 = 0x8CEC;
    public static final int COLOR_ATTACHMENT13 = 0x8CED;
    public static final int COLOR_ATTACHMENT14 = 0x8CEE;
    public static final int COLOR_ATTACHMENT15 = 0x8CEF;
    public static final int COLOR_ATTACHMENT16 = 0x8CF0;
    public static final int COLOR_ATTACHMENT17 = 0x8CF1;
    public static final int COLOR_ATTACHMENT18 = 0x8CF2;
    public static final int COLOR_ATTACHMENT19 = 0x8CF3;
    public static final int COLOR_ATTACHMENT20 = 0x8CF4;
    public static final int COLOR_ATTACHMENT21 = 0x8CF5;
    public static final int COLOR_ATTACHMENT22 = 0x8CF6;
    public static final int COLOR_ATTACHMENT23 = 0x8CF7;
    public static final int COLOR_ATTACHMENT24 = 0x8CF8;
    public static final int COLOR_ATTACHMENT25 = 0x8CF9;
    public static final int COLOR_ATTACHMENT26 = 0x8CFA;
    public static final int COLOR_ATTACHMENT27 = 0x8CFB;
    public static final int COLOR_ATTACHMENT28 = 0x8CFC;
    public static final int COLOR_ATTACHMENT29 = 0x8CFD;
    public static final int COLOR_ATTACHMENT30 = 0x8CFE;
    public static final int COLOR_ATTACHMENT31 = 0x8CFF;
    public static final int DEPTH_ATTACHMENT = 0x8D00;
    public static final int STENCIL_ATTACHMENT = 0x8D20;
    public static final int FRAMEBUFFER = 0x8D40;
    public static final int RENDERBUFFER = 0x8D41;
    public static final int RENDERBUFFER_WIDTH = 0x8D42;
    public static final int RENDERBUFFER_HEIGHT = 0x8D43;
    public static final int RENDERBUFFER_INTERNAL_FORMAT = 0x8D44;
    public static final int STENCIL_INDEX1 = 0x8D46;
    public static final int STENCIL_INDEX4 = 0x8D47;
    public static final int STENCIL_INDEX8 = 0x8D48;
    public static final int STENCIL_INDEX16 = 0x8D49;
    public static final int RENDERBUFFER_RED_SIZE = 0x8D50;
    public static final int RENDERBUFFER_GREEN_SIZE = 0x8D51;
    public static final int RENDERBUFFER_BLUE_SIZE = 0x8D52;
    public static final int RENDERBUFFER_ALPHA_SIZE = 0x8D53;
    public static final int RENDERBUFFER_DEPTH_SIZE = 0x8D54;
    public static final int RENDERBUFFER_STENCIL_SIZE = 0x8D55;
    public static final int FRAMEBUFFER_INCOMPLETE_MULTISAMPLE = 0x8D56;
    public static final int MAX_SAMPLES = 0x8D57;
    public static final int FRAMEBUFFER_SRGB = 0x8DB9;
    public static final int HALF_FLOAT = 0x140B;
    public static final int MAP_READ_BIT = 0x0001;
    public static final int MAP_WRITE_BIT = 0x0002;
    public static final int MAP_INVALIDATE_RANGE_BIT = 0x0004;
    public static final int MAP_INVALIDATE_BUFFER_BIT = 0x0008;
    public static final int MAP_FLUSH_EXPLICIT_BIT = 0x0010;
    public static final int MAP_UNSYNCHRONIZED_BIT = 0x0020;
    public static final int COMPRESSED_RED_RGTC1 = 0x8DBB;
    public static final int COMPRESSED_SIGNED_RED_RGTC1 = 0x8DBC;
    public static final int COMPRESSED_RG_RGTC2 = 0x8DBD;
    public static final int COMPRESSED_SIGNED_RG_RGTC2 = 0x8DBE;
    public static final int RG = 0x8227;
    public static final int RG_INTEGER = 0x8228;
    public static final int R8 = 0x8229;
    public static final int R16 = 0x822A;
    public static final int RG8 = 0x822B;
    public static final int RG16 = 0x822C;
    public static final int R16F = 0x822D;
    public static final int R32F = 0x822E;
    public static final int RG16F = 0x822F;
    public static final int RG32F = 0x8230;
    public static final int R8I = 0x8231;
    public static final int R8UI = 0x8232;
    public static final int R16I = 0x8233;
    public static final int R16UI = 0x8234;
    public static final int R32I = 0x8235;
    public static final int R32UI = 0x8236;
    public static final int RG8I = 0x8237;
    public static final int RG8UI = 0x8238;
    public static final int RG16I = 0x8239;
    public static final int RG16UI = 0x823A;
    public static final int RG32I = 0x823B;
    public static final int RG32UI = 0x823C;
    public static final int VERTEX_ARRAY_BINDING = 0x85B5;

    static boolean isSupported(GLCapabilities caps) {
        return checkAll(caps.glBeginConditionalRender, caps.glBeginTransformFeedback, caps.glBindBufferBase, caps.glBindBufferRange, caps.glBindFragDataLocation, caps.glBindFramebuffer,
            caps.glBindRenderbuffer, caps.glBindVertexArray, caps.glBlitFramebuffer, caps.glCheckFramebufferStatus, caps.glClampColor, caps.glClearBufferfi,
            caps.glClearBufferfv, caps.glClearBufferiv, caps.glClearBufferuiv, caps.glColorMaski, caps.glDeleteFramebuffers, caps.glDeleteRenderbuffers,
            caps.glDeleteVertexArrays, caps.glDisablei, caps.glEnablei, caps.glEndConditionalRender, caps.glEndTransformFeedback, caps.glFlushMappedBufferRange,
            caps.glFramebufferRenderbuffer, caps.glFramebufferTexture1D, caps.glFramebufferTexture2D, caps.glFramebufferTexture3D, caps.glFramebufferTextureLayer, caps.glGenFramebuffers,
            caps.glGenRenderbuffers, caps.glGenVertexArrays, caps.glGenerateMipmap, caps.glGetBooleani_v, caps.glGetFragDataLocation, caps.glGetFramebufferAttachmentParameteriv,
            caps.glGetIntegeri_v, caps.glGetRenderbufferParameteriv, caps.glGetStringi, caps.glGetTexParameterIiv, caps.glGetTexParameterIuiv, caps.glGetTransformFeedbackVarying,
            caps.glGetUniformuiv, caps.glGetVertexAttribIiv, caps.glGetVertexAttribIuiv, caps.glIsEnabledi, caps.glIsFramebuffer, caps.glIsRenderbuffer,
            caps.glIsVertexArray, caps.glMapBufferRange, caps.glRenderbufferStorage, caps.glRenderbufferStorageMultisample, caps.glTexParameterIiv, caps.glTexParameterIuiv,
            caps.glTransformFeedbackVaryings, caps.glUniform1ui, caps.glUniform1uiv, caps.glUniform2ui, caps.glUniform2uiv, caps.glUniform3ui,
            caps.glUniform3uiv, caps.glUniform4ui, caps.glUniform4uiv, caps.glVertexAttribI1i, caps.glVertexAttribI1iv, caps.glVertexAttribI1ui,
            caps.glVertexAttribI1uiv, caps.glVertexAttribI2i, caps.glVertexAttribI2iv, caps.glVertexAttribI2ui, caps.glVertexAttribI2uiv, caps.glVertexAttribI3i,
            caps.glVertexAttribI3iv, caps.glVertexAttribI3ui, caps.glVertexAttribI3uiv, caps.glVertexAttribI4bv, caps.glVertexAttribI4i, caps.glVertexAttribI4iv,
            caps.glVertexAttribI4sv, caps.glVertexAttribI4ubv, caps.glVertexAttribI4ui, caps.glVertexAttribI4uiv, caps.glVertexAttribI4usv, caps.glVertexAttribIPointer);
    }

    static void load(GLCapabilities caps, GLLoadFunc load) {
        caps.glBeginConditionalRender = load.invoke("glBeginConditionalRender", IIV);
        caps.glBeginTransformFeedback = load.invoke("glBeginTransformFeedback", IV);
        caps.glBindBufferBase = load.invoke("glBindBufferBase", IIIV);
        caps.glBindBufferRange = load.invoke("glBindBufferRange", IIIJJV);
        caps.glBindFragDataLocation = load.invoke("glBindFragDataLocation", IIPV);
        caps.glBindFramebuffer = load.invoke("glBindFramebuffer", IIV);
        caps.glBindRenderbuffer = load.invoke("glBindRenderbuffer", IIV);
        caps.glBindVertexArray = load.invoke("glBindVertexArray", IV);
        caps.glBlitFramebuffer = load.invoke("glBlitFramebuffer", IIIIIIIIIIV);
        caps.glCheckFramebufferStatus = load.invoke("glCheckFramebufferStatus", II);
        caps.glClampColor = load.trivialHandle("glClampColor", IIV);
        caps.glClearBufferfi = load.invoke("glClearBufferfi", IIFIV);
        caps.glClearBufferfv = load.invoke("glClearBufferfv", IIPV);
        caps.glClearBufferiv = load.invoke("glClearBufferiv", IIPV);
        caps.glClearBufferuiv = load.invoke("glClearBufferuiv", IIPV);
        caps.glColorMaski = load.trivialHandle("glColorMaski", IZZZZV);
        caps.glDeleteFramebuffers = load.trivialHandle("glDeleteFramebuffers", IPV);
        caps.glDeleteRenderbuffers = load.trivialHandle("glDeleteRenderbuffers", IPV);
        caps.glDeleteVertexArrays = load.trivialHandle("glDeleteVertexArrays", IPV);
        caps.glDisablei = load.trivialHandle("glDisablei", IIV);
        caps.glEnablei = load.trivialHandle("glEnablei", IIV);
        caps.glEndConditionalRender = load.invoke("glEndConditionalRender", V);
        caps.glEndTransformFeedback = load.invoke("glEndTransformFeedback", V);
        caps.glFlushMappedBufferRange = load.invoke("glFlushMappedBufferRange", IJJV);
        caps.glFramebufferRenderbuffer = load.invoke("glFramebufferRenderbuffer", IIIIV);
        caps.glFramebufferTexture1D = load.invoke("glFramebufferTexture1D", IIIIIV);
        caps.glFramebufferTexture2D = load.invoke("glFramebufferTexture2D", IIIIIV);
        caps.glFramebufferTexture3D = load.invoke("glFramebufferTexture3D", IIIIIIV);
        caps.glFramebufferTextureLayer = load.invoke("glFramebufferTextureLayer", IIIIIV);
        caps.glGenFramebuffers = load.trivialHandle("glGenFramebuffers", IPV);
        caps.glGenRenderbuffers = load.trivialHandle("glGenRenderbuffers", IPV);
        caps.glGenVertexArrays = load.trivialHandle("glGenVertexArrays", IPV);
        caps.glGenerateMipmap = load.invoke("glGenerateMipmap", IV);
        caps.glGetBooleani_v = load.trivialHandle("glGetBooleani_v", IIPV);
        caps.glGetFragDataLocation = load.trivialHandle("glGetFragDataLocation", IPI);
        caps.glGetFramebufferAttachmentParameteriv = load.trivialHandle("glGetFramebufferAttachmentParameteriv", IIIPV);
        caps.glGetIntegeri_v = load.trivialHandle("glGetIntegeri_v", IIPV);
        caps.glGetRenderbufferParameteriv = load.trivialHandle("glGetRenderbufferParameteriv", IIPV);
        caps.glGetStringi = load.trivialHandle("glGetStringi", IIp);
        caps.glGetTexParameterIiv = load.trivialHandle("glGetTexParameterIiv", IIPV);
        caps.glGetTexParameterIuiv = load.trivialHandle("glGetTexParameterIuiv", IIPV);
        caps.glGetTransformFeedbackVarying = load.trivialHandle("glGetTransformFeedbackVarying", IIIPPPPV);
        caps.glGetUniformuiv = load.trivialHandle("glGetUniformuiv", IIPV);
        caps.glGetVertexAttribIiv = load.trivialHandle("glGetVertexAttribIiv", IIPV);
        caps.glGetVertexAttribIuiv = load.trivialHandle("glGetVertexAttribIuiv", IIPV);
        caps.glIsEnabledi = load.trivialHandle("glIsEnabledi", IIZ);
        caps.glIsFramebuffer = load.trivialHandle("glIsFramebuffer", IZ);
        caps.glIsRenderbuffer = load.trivialHandle("glIsRenderbuffer", IZ);
        caps.glIsVertexArray = load.trivialHandle("glIsVertexArray", IZ);
        caps.glMapBufferRange = load.invoke("glMapBufferRange", IJJIP);
        caps.glRenderbufferStorage = load.invoke("glRenderbufferStorage", IIIIV);
        caps.glRenderbufferStorageMultisample = load.invoke("glRenderbufferStorageMultisample", IIIIIV);
        caps.glTexParameterIiv = load.trivialHandle("glTexParameterIiv", IIPV);
        caps.glTexParameterIuiv = load.trivialHandle("glTexParameterIuiv", IIPV);
        caps.glTransformFeedbackVaryings = load.invoke("glTransformFeedbackVaryings", IIPIV);
        caps.glUniform1ui = load.invoke("glUniform1ui", IIV);
        caps.glUniform1uiv = load.invoke("glUniform1uiv", IIPV);
        caps.glUniform2ui = load.invoke("glUniform2ui", IIIV);
        caps.glUniform2uiv = load.invoke("glUniform2uiv", IIPV);
        caps.glUniform3ui = load.invoke("glUniform3ui", IIIIV);
        caps.glUniform3uiv = load.invoke("glUniform3uiv", IIPV);
        caps.glUniform4ui = load.invoke("glUniform4ui", IIIIIV);
        caps.glUniform4uiv = load.invoke("glUniform4uiv", IIPV);
        caps.glVertexAttribI1i = load.invoke("glVertexAttribI1i", IIV);
        caps.glVertexAttribI1iv = load.invoke("glVertexAttribI1iv", IPV);
        caps.glVertexAttribI1ui = load.invoke("glVertexAttribI1ui", IIV);
        caps.glVertexAttribI1uiv = load.invoke("glVertexAttribI1uiv", IPV);
        caps.glVertexAttribI2i = load.invoke("glVertexAttribI2i", IIIV);
        caps.glVertexAttribI2iv = load.invoke("glVertexAttribI2iv", IPV);
        caps.glVertexAttribI2ui = load.invoke("glVertexAttribI2ui", IIIV);
        caps.glVertexAttribI2uiv = load.invoke("glVertexAttribI2uiv", IPV);
        caps.glVertexAttribI3i = load.invoke("glVertexAttribI3i", IIIIV);
        caps.glVertexAttribI3iv = load.invoke("glVertexAttribI3iv", IPV);
        caps.glVertexAttribI3ui = load.invoke("glVertexAttribI3ui", IIIIV);
        caps.glVertexAttribI3uiv = load.invoke("glVertexAttribI3uiv", IPV);
        caps.glVertexAttribI4bv = load.invoke("glVertexAttribI4bv", IPV);
        caps.glVertexAttribI4i = load.invoke("glVertexAttribI4i", IIIIIV);
        caps.glVertexAttribI4iv = load.invoke("glVertexAttribI4iv", IPV);
        caps.glVertexAttribI4sv = load.invoke("glVertexAttribI4sv", IPV);
        caps.glVertexAttribI4ubv = load.invoke("glVertexAttribI4ubv", IPV);
        caps.glVertexAttribI4ui = load.invoke("glVertexAttribI4ui", IIIIIV);
        caps.glVertexAttribI4uiv = load.invoke("glVertexAttribI4uiv", IPV);
        caps.glVertexAttribI4usv = load.invoke("glVertexAttribI4usv", IPV);
        caps.glVertexAttribIPointer = load.invoke("glVertexAttribIPointer", IIIIPV);
    }

    public static void beginConditionalRender(int id, int mode) {
        var caps = getCapabilities();
        try {
            check(caps.glBeginConditionalRender).invokeExact(id, mode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void beginTransformFeedback(int primitiveMode) {
        var caps = getCapabilities();
        try {
            check(caps.glBeginTransformFeedback).invokeExact(primitiveMode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindBufferBase(int target, int index, int buffer) {
        var caps = getCapabilities();
        try {
            check(caps.glBindBufferBase).invokeExact(target, index, buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindBufferRange(int target, int index, int buffer, long offset, long size) {
        var caps = getCapabilities();
        try {
            check(caps.glBindBufferRange).invokeExact(target, index, buffer, offset, size);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindFragDataLocation(int program, int color, MemorySegment name) {
        var caps = getCapabilities();
        try {
            check(caps.glBindFragDataLocation).invokeExact(program, color, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindFragDataLocation(int program, int color, String name) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            bindFragDataLocation(program, color, stack.allocateUtf8String(name));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void bindFramebuffer(int target, int framebuffer) {
        var caps = getCapabilities();
        try {
            check(caps.glBindFramebuffer).invokeExact(target, framebuffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindRenderbuffer(int target, int renderbuffer) {
        var caps = getCapabilities();
        try {
            check(caps.glBindRenderbuffer).invokeExact(target, renderbuffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void bindVertexArray(int array) {
        var caps = getCapabilities();
        try {
            check(caps.glBindVertexArray).invokeExact(array);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void blitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        var caps = getCapabilities();
        try {
            check(caps.glBlitFramebuffer).invokeExact(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int checkFramebufferStatus(int target) {
        var caps = getCapabilities();
        try {
            return (int) check(caps.glCheckFramebufferStatus).invokeExact(target);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clampColor(int target, int clamp) {
        var caps = getCapabilities();
        try {
            check(caps.glClampColor).invokeExact(target, clamp);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearBufferfi(int buffer, int drawBuffer, float depth, int stencil) {
        var caps = getCapabilities();
        try {
            check(caps.glClearBufferfi).invokeExact(buffer, drawBuffer, depth, stencil);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearBufferfv(int buffer, int drawBuffer, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glClearBufferfv).invokeExact(buffer, drawBuffer, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearBufferfv(SegmentAllocator allocator, int buffer, int drawBuffer, float[] value) {
        clearBufferfv(buffer, drawBuffer, allocator.allocateArray(JAVA_FLOAT, value));
    }

    public static void clearBufferiv(int buffer, int drawBuffer, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glClearBufferiv).invokeExact(buffer, drawBuffer, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearBufferiv(SegmentAllocator allocator, int buffer, int drawBuffer, int[] value) {
        clearBufferiv(buffer, drawBuffer, allocator.allocateArray(JAVA_INT, value));
    }

    public static void clearBufferuiv(int buffer, int drawBuffer, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glClearBufferuiv).invokeExact(buffer, drawBuffer, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearBufferuiv(SegmentAllocator allocator, int buffer, int drawBuffer, int[] value) {
        clearBufferuiv(buffer, drawBuffer, allocator.allocateArray(JAVA_INT, value));
    }

    public static void colorMaski(int index, boolean r, boolean g, boolean b, boolean a) {
        var caps = getCapabilities();
        try {
            check(caps.glColorMaski).invokeExact(index, r, g, b, a);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteFramebuffers(int n, MemorySegment framebuffers) {
        var caps = getCapabilities();
        try {
            check(caps.glDeleteFramebuffers).invokeExact(n, framebuffers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteFramebuffers(SegmentAllocator allocator, int[] framebuffers) {
        deleteFramebuffers(framebuffers.length, allocator.allocateArray(JAVA_INT, framebuffers));
    }

    public static void deleteFramebuffer(int framebuffer) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            deleteFramebuffers(1, stack.ints(framebuffer));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void deleteRenderbuffers(int n, MemorySegment renderbuffers) {
        var caps = getCapabilities();
        try {
            check(caps.glDeleteRenderbuffers).invokeExact(n, renderbuffers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteRenderbuffers(SegmentAllocator allocator, int[] renderbuffers) {
        deleteRenderbuffers(renderbuffers.length, allocator.allocateArray(JAVA_INT, renderbuffers));
    }

    public static void deleteRenderbuffer(int renderbuffer) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            deleteRenderbuffers(1, stack.ints(renderbuffer));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void deleteVertexArrays(int n, MemorySegment arrays) {
        var caps = getCapabilities();
        try {
            check(caps.glDeleteVertexArrays).invokeExact(n, arrays);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void deleteVertexArrays(SegmentAllocator allocator, int[] arrays) {
        deleteVertexArrays(arrays.length, allocator.allocateArray(JAVA_INT, arrays));
    }

    public static void deleteVertexArray(int array) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            deleteVertexArrays(1, stack.ints(array));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void disablei(int target, int index) {
        var caps = getCapabilities();
        try {
            check(caps.glDisablei).invokeExact(target, index);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void enablei(int target, int index) {
        var caps = getCapabilities();
        try {
            check(caps.glEnablei).invokeExact(target, index);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void endConditionalRender() {
        var caps = getCapabilities();
        try {
            check(caps.glEndConditionalRender).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void endTransformFeedback() {
        var caps = getCapabilities();
        try {
            check(caps.glEndTransformFeedback).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void flushMappedBufferRange(int target, long offset, long length) {
        var caps = getCapabilities();
        try {
            check(caps.glFlushMappedBufferRange).invokeExact(target, offset, length);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void framebufferRenderbuffer(int target, int attachment, int renderbufferTarget, int renderbuffer) {
        var caps = getCapabilities();
        try {
            check(caps.glFramebufferRenderbuffer).invokeExact(target, attachment, renderbufferTarget, renderbuffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void framebufferTexture1D(int target, int attachment, int texTarget, int texture, int level) {
        var caps = getCapabilities();
        try {
            check(caps.glFramebufferTexture1D).invokeExact(target, attachment, texTarget, texture, level);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void framebufferTexture2D(int target, int attachment, int texTarget, int texture, int level) {
        var caps = getCapabilities();
        try {
            check(caps.glFramebufferTexture2D).invokeExact(target, attachment, texTarget, texture, level);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void framebufferTexture3D(int target, int attachment, int texTarget, int texture, int level, int zoffset) {
        var caps = getCapabilities();
        try {
            check(caps.glFramebufferTexture3D).invokeExact(target, attachment, texTarget, texture, level, zoffset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void framebufferTextureLayer(int target, int attachment, int texture, int level, int layer) {
        var caps = getCapabilities();
        try {
            check(caps.glFramebufferTextureLayer).invokeExact(target, attachment, texture, level, layer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void genFramebuffers(int n, MemorySegment framebuffers) {
        var caps = getCapabilities();
        try {
            check(caps.glGenFramebuffers).invokeExact(n, framebuffers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void genFramebuffers(SegmentAllocator allocator, int[] framebuffers) {
        var seg = allocator.allocateArray(JAVA_INT, framebuffers.length);
        genFramebuffers(framebuffers.length, seg);
        RuntimeHelper.toArray(seg, framebuffers);
    }

    public static int genFramebuffer() {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            genFramebuffers(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void genRenderbuffers(int n, MemorySegment renderbuffers) {
        var caps = getCapabilities();
        try {
            check(caps.glGenRenderbuffers).invokeExact(n, renderbuffers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void genRenderbuffers(SegmentAllocator allocator, int[] renderbuffers) {
        var seg = allocator.allocateArray(JAVA_INT, renderbuffers.length);
        genRenderbuffers(renderbuffers.length, seg);
        RuntimeHelper.toArray(seg, renderbuffers);
    }

    public static int genRenderbuffer() {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            genRenderbuffers(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void genVertexArrays(int n, MemorySegment arrays) {
        var caps = getCapabilities();
        try {
            check(caps.glGenVertexArrays).invokeExact(n, arrays);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void genVertexArrays(SegmentAllocator allocator, int[] arrays) {
        var seg = allocator.allocateArray(JAVA_INT, arrays.length);
        genVertexArrays(arrays.length, seg);
        RuntimeHelper.toArray(seg, arrays);
    }

    public static int genVertexArray() {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            genVertexArrays(1, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void generateMipmap(int target) {
        var caps = getCapabilities();
        try {
            check(caps.glGenerateMipmap).invokeExact(target);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getBooleani_v(int target, int index, MemorySegment data) {
        var caps = getCapabilities();
        try {
            check(caps.glGetBooleani_v).invokeExact(target, index, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getBooleani_v(SegmentAllocator allocator, int target, int index, boolean[] data) {
        var seg = allocator.allocateArray(JAVA_BOOLEAN, data.length);
        getBooleani_v(target, index, seg);
        RuntimeHelper.toArray(seg, data);
    }

    public static boolean getBooleani(int target, int index) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_BOOLEAN);
            getBooleani_v(target, index, seg);
            return seg.get(JAVA_BOOLEAN, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static int getFragDataLocation(int program, MemorySegment name) {
        var caps = getCapabilities();
        try {
            return (int) check(caps.glGetFragDataLocation).invokeExact(program, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getFragDataLocation(int program, String name) {
        final MemoryStack stack = MemoryStack.stackGet();
        final long stackPointer = stack.getPointer();
        try {
            return getFragDataLocation(program, stack.allocateUtf8String(name));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getFramebufferAttachmentParameteriv(int target, int attachment, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetFramebufferAttachmentParameteriv).invokeExact(target, attachment, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getFramebufferAttachmentParameteri(int target, int attachment, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getFramebufferAttachmentParameteriv(target, attachment, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getIntegeri_v(int target, int index, MemorySegment data) {
        var caps = getCapabilities();
        try {
            check(caps.glGetIntegeri_v).invokeExact(target, index, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getIntegeri_v(SegmentAllocator allocator, int target, int index, int[] data) {
        var seg = allocator.allocateArray(JAVA_INT, data.length);
        getIntegeri_v(target, index, seg);
        RuntimeHelper.toArray(seg, data);
    }

    public static int getIntegeri(int target, int index) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getIntegeri_v(target, index, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getRenderbufferParameteriv(int target, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetRenderbufferParameteriv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getRenderbufferParameteriv(int target, int pname, int[] params) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getRenderbufferParameteriv(target, pname, seg);
            params[0] = seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static int getRenderbufferParameteri(int target, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getRenderbufferParameteriv(target, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static MemorySegment ngetStringi(int pname, int index) {
        var caps = getCapabilities();
        try {
            return (MemorySegment) check(caps.glGetStringi).invokeExact(pname, index);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    @Nullable
    public static String getStringi(int pname, int index) {
        var pStr = ngetStringi(pname, index);
        return RuntimeHelper.isNullptr(pStr) ? null : pStr.getUtf8String(0);
    }

    public static void getTexParameterIiv(int target, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetTexParameterIiv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTexParameterIiv(SegmentAllocator allocator, int target, int pname, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        getTexParameterIiv(target, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static int getTexParameterIi(int target, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getTexParameterIiv(target, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getTexParameterIuiv(int target, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetTexParameterIuiv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTexParameterIuiv(SegmentAllocator allocator, int target, int pname, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        getTexParameterIuiv(target, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static int getTexParameterIui(int target, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getTexParameterIuiv(target, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getTransformFeedbackVarying(int program, int index, int bufSize, MemorySegment length, MemorySegment size, MemorySegment type, MemorySegment name) {
        var caps = getCapabilities();
        try {
            check(caps.glGetTransformFeedbackVarying).invokeExact(program, index, bufSize, length, size, type, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getTransformFeedbackVarying(SegmentAllocator allocator, int program, int index, int bufSize, int @Nullable [] length, int[] size, int[] type, String[] name) {
        var pLen = length != null ? allocator.allocate(JAVA_INT) : MemorySegment.NULL;
        var pSz = allocator.allocate(JAVA_INT);
        var pType = allocator.allocate(JAVA_INT);
        var pName = allocator.allocateArray(JAVA_BYTE, bufSize);
        getTransformFeedbackVarying(program, index, bufSize, pLen, pSz, pType, pName);
        if (length != null && length.length > 0) {
            length[0] = pLen.get(JAVA_INT, 0);
        }
        size[0] = pSz.get(JAVA_INT, 0);
        type[0] = pType.get(JAVA_INT, 0);
        name[0] = pName.getUtf8String(0);
    }

    public static void getUniformuiv(int program, int location, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetUniformuiv).invokeExact(program, location, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getUniformuiv(SegmentAllocator allocator, int program, int location, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        getUniformuiv(program, location, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static int getUniformui(int program, int location) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getUniformuiv(program, location, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getVertexAttribIiv(int index, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetVertexAttribIiv).invokeExact(index, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getVertexAttribIiv(SegmentAllocator allocator, int index, int pname, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        getVertexAttribIiv(index, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static int getVertexAttribIi(int index, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getVertexAttribIiv(index, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getVertexAttribIuiv(int index, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetVertexAttribIuiv).invokeExact(index, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getVertexAttribIuiv(SegmentAllocator allocator, int index, int pname, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        getVertexAttribIuiv(index, pname, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static int getVertexAttribIui(int index, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getVertexAttribIuiv(index, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static boolean isEnabledi(int target, int index) {
        var caps = getCapabilities();
        try {
            return (boolean) check(caps.glIsEnabledi).invokeExact(target, index);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean isFramebuffer(int framebuffer) {
        var caps = getCapabilities();
        try {
            return (boolean) check(caps.glIsFramebuffer).invokeExact(framebuffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean isRenderbuffer(int renderbuffer) {
        var caps = getCapabilities();
        try {
            return (boolean) check(caps.glIsRenderbuffer).invokeExact(renderbuffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static boolean isVertexArray(int array) {
        var caps = getCapabilities();
        try {
            return (boolean) check(caps.glIsVertexArray).invokeExact(array);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static MemorySegment mapBufferRange(int target, long offset, long length, int access) {
        var caps = getCapabilities();
        try {
            return ((MemorySegment) check(caps.glMapBufferRange).invokeExact(target, offset, length, access)).reinterpret(length);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void renderbufferStorage(int target, int internalFormat, int width, int height) {
        var caps = getCapabilities();
        try {
            check(caps.glRenderbufferStorage).invokeExact(target, internalFormat, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void renderbufferStorageMultisample(int target, int samples, int internalFormat, int width, int height) {
        var caps = getCapabilities();
        try {
            check(caps.glRenderbufferStorageMultisample).invokeExact(target, samples, internalFormat, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texParameterIiv(int target, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glTexParameterIiv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texParameterIiv(SegmentAllocator allocator, int target, int pname, int[] params) {
        texParameterIiv(target, pname, allocator.allocateArray(JAVA_INT, params));
    }

    public static void texParameterIuiv(int target, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glTexParameterIuiv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texParameterIuiv(SegmentAllocator allocator, int target, int pname, int[] params) {
        texParameterIuiv(target, pname, allocator.allocateArray(JAVA_INT, params));
    }

    public static void transformFeedbackVaryings(int program, int count, MemorySegment varyings, int bufferMode) {
        var caps = getCapabilities();
        try {
            check(caps.glTransformFeedbackVaryings).invokeExact(program, count, varyings, bufferMode);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void transformFeedbackVaryings(SegmentAllocator allocator, int program, String[] varyings, int bufferMode) {
        var seg = allocator.allocateArray(ADDRESS, varyings.length);
        for (int i = 0; i < varyings.length; i++) {
            seg.setAtIndex(ADDRESS, i, allocator.allocateUtf8String(varyings[i]));
        }
        transformFeedbackVaryings(program, varyings.length, seg, bufferMode);
    }

    public static void uniform1ui(int location, int v0) {
        var caps = getCapabilities();
        try {
            check(caps.glUniform1ui).invokeExact(location, v0);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform1uiv(int location, int count, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glUniform1uiv).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform1uiv(SegmentAllocator allocator, int location, int[] value) {
        uniform1uiv(location, value.length, allocator.allocateArray(JAVA_INT, value));
    }

    public static void uniform2ui(int location, int v0, int v1) {
        var caps = getCapabilities();
        try {
            check(caps.glUniform2ui).invokeExact(location, v0, v1);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform2uiv(int location, int count, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glUniform2uiv).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform2uiv(SegmentAllocator allocator, int location, int[] value) {
        uniform2uiv(location, value.length >> 1, allocator.allocateArray(JAVA_INT, value));
    }

    public static void uniform3ui(int location, int v0, int v1, int v2) {
        var caps = getCapabilities();
        try {
            check(caps.glUniform3ui).invokeExact(location, v0, v1, v2);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform3uiv(int location, int count, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glUniform3uiv).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform3uiv(SegmentAllocator allocator, int location, int[] value) {
        uniform3uiv(location, value.length / 3, allocator.allocateArray(JAVA_INT, value));
    }

    public static void uniform4ui(int location, int v0, int v1, int v2, int v3) {
        var caps = getCapabilities();
        try {
            check(caps.glUniform4ui).invokeExact(location, v0, v1, v2, v3);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform4uiv(int location, int count, MemorySegment value) {
        var caps = getCapabilities();
        try {
            check(caps.glUniform4uiv).invokeExact(location, count, value);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void uniform4uiv(SegmentAllocator allocator, int location, int[] value) {
        uniform4uiv(location, value.length >> 2, allocator.allocateArray(JAVA_INT, value));
    }

    public static void vertexAttribI1i(int index, int x) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI1i).invokeExact(index, x);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI1iv(int index, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI1iv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI1iv(SegmentAllocator allocator, int index, int[] v) {
        vertexAttribI1iv(index, allocator.allocateArray(JAVA_INT, v));
    }

    public static void vertexAttribI1ui(int index, int x) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI1ui).invokeExact(index, x);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI1uiv(int index, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI1uiv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI1uiv(SegmentAllocator allocator, int index, int[] v) {
        vertexAttribI1uiv(index, allocator.allocateArray(JAVA_INT, v));
    }

    public static void vertexAttribI2i(int index, int x, int y) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI2i).invokeExact(index, x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI2iv(int index, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI2iv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI2iv(SegmentAllocator allocator, int index, int[] v) {
        vertexAttribI2iv(index, allocator.allocateArray(JAVA_INT, v));
    }

    public static void vertexAttribI2ui(int index, int x, int y) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI2ui).invokeExact(index, x, y);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI2uiv(int index, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI2uiv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI2uiv(SegmentAllocator allocator, int index, int[] v) {
        vertexAttribI2uiv(index, allocator.allocateArray(JAVA_INT, v));
    }

    public static void vertexAttribI3i(int index, int x, int y, int z) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI3i).invokeExact(index, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI3iv(int index, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI3iv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI3iv(SegmentAllocator allocator, int index, int[] v) {
        vertexAttribI3iv(index, allocator.allocateArray(JAVA_INT, v));
    }

    public static void vertexAttribI3ui(int index, int x, int y, int z) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI3ui).invokeExact(index, x, y, z);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI3uiv(int index, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI3uiv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI3uiv(SegmentAllocator allocator, int index, int[] v) {
        vertexAttribI3uiv(index, allocator.allocateArray(JAVA_INT, v));
    }

    public static void vertexAttribI4bv(int index, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI4bv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI4bv(SegmentAllocator allocator, int index, byte[] v) {
        vertexAttribI4bv(index, allocator.allocateArray(JAVA_BYTE, v));
    }

    public static void vertexAttribI4i(int index, int x, int y, int z, int w) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI4i).invokeExact(index, x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI4iv(int index, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI4iv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI4iv(SegmentAllocator allocator, int index, int[] v) {
        vertexAttribI4iv(index, allocator.allocateArray(JAVA_INT, v));
    }

    public static void vertexAttribI4sv(int index, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI4sv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI4sv(SegmentAllocator allocator, int index, short[] v) {
        vertexAttribI4sv(index, allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void vertexAttribI4ubv(int index, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI4ubv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI4ubv(SegmentAllocator allocator, int index, byte[] v) {
        vertexAttribI4ubv(index, allocator.allocateArray(JAVA_BYTE, v));
    }

    public static void vertexAttribI4ui(int index, int x, int y, int z, int w) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI4ui).invokeExact(index, x, y, z, w);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI4uiv(int index, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI4uiv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI4uiv(SegmentAllocator allocator, int index, int[] v) {
        vertexAttribI4uiv(index, allocator.allocateArray(JAVA_INT, v));
    }

    public static void vertexAttribI4usv(int index, MemorySegment v) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribI4usv).invokeExact(index, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribI4usv(SegmentAllocator allocator, int index, short[] v) {
        vertexAttribI4usv(index, allocator.allocateArray(JAVA_SHORT, v));
    }

    public static void vertexAttribIPointer(int index, int size, int type, int stride, MemorySegment pointer) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribIPointer).invokeExact(index, size, type, stride, pointer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribIPointer(SegmentAllocator allocator, int index, int size, int type, int stride, byte[] pointer) {
        vertexAttribIPointer(index, size, type, stride, allocator.allocateArray(JAVA_BYTE, pointer));
    }

    public static void vertexAttribIPointer(SegmentAllocator allocator, int index, int size, int type, int stride, short[] pointer) {
        vertexAttribIPointer(index, size, type, stride, allocator.allocateArray(JAVA_SHORT, pointer));
    }

    public static void vertexAttribIPointer(SegmentAllocator allocator, int index, int size, int type, int stride, int[] pointer) {
        vertexAttribIPointer(index, size, type, stride, allocator.allocateArray(JAVA_INT, pointer));
    }
}

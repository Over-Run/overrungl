/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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
import overrun.marshal.Marshal;
import overrun.marshal.MemoryStack;
import overrun.marshal.Unmarshal;
import overrun.marshal.gen.Entrypoint;
import overrun.marshal.gen.Ref;
import overrun.marshal.gen.SizedSeg;
import overrun.marshal.gen.Skip;
import overrungl.opengl.ext.arb.GLARBColorBufferFloat;
import overrungl.opengl.ext.arb.GLARBTextureFloat;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;

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
 * @author squid233
 * @since 0.1.0
 */
public sealed interface GL30C extends GL21C permits GL30, GL31C {
    int COMPARE_REF_TO_TEXTURE = 0x884E;
    int CLIP_DISTANCE0 = 0x3000;
    int CLIP_DISTANCE1 = 0x3001;
    int CLIP_DISTANCE2 = 0x3002;
    int CLIP_DISTANCE3 = 0x3003;
    int CLIP_DISTANCE4 = 0x3004;
    int CLIP_DISTANCE5 = 0x3005;
    int CLIP_DISTANCE6 = 0x3006;
    int CLIP_DISTANCE7 = 0x3007;
    int MAX_CLIP_DISTANCES = 0x0D32;
    int MAJOR_VERSION = 0x821B;
    int MINOR_VERSION = 0x821C;
    int NUM_EXTENSIONS = 0x821D;
    int CONTEXT_FLAGS = 0x821E;
    int COMPRESSED_RED = 0x8225;
    int COMPRESSED_RG = 0x8226;
    int CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT = 0x00000001;
    int RGBA32F = 0x8814;
    int RGB32F = 0x8815;
    int RGBA16F = 0x881A;
    int RGB16F = 0x881B;
    int VERTEX_ATTRIB_ARRAY_INTEGER = 0x88FD;
    int MAX_ARRAY_TEXTURE_LAYERS = 0x88FF;
    int MIN_PROGRAM_TEXEL_OFFSET = 0x8904;
    int MAX_PROGRAM_TEXEL_OFFSET = 0x8905;
    int CLAMP_READ_COLOR = 0x891C;
    int FIXED_ONLY = 0x891D;
    int MAX_VARYING_COMPONENTS = 0x8B4B;
    int TEXTURE_1D_ARRAY = 0x8C18;
    int PROXY_TEXTURE_1D_ARRAY = 0x8C19;
    int TEXTURE_2D_ARRAY = 0x8C1A;
    int PROXY_TEXTURE_2D_ARRAY = 0x8C1B;
    int TEXTURE_BINDING_1D_ARRAY = 0x8C1C;
    int TEXTURE_BINDING_2D_ARRAY = 0x8C1D;
    int R11F_G11F_B10F = 0x8C3A;
    int UNSIGNED_INT_10F_11F_11F_REV = 0x8C3B;
    int RGB9_E5 = 0x8C3D;
    int UNSIGNED_INT_5_9_9_9_REV = 0x8C3E;
    int TEXTURE_SHARED_SIZE = 0x8C3F;
    int TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH = 0x8C76;
    int TRANSFORM_FEEDBACK_BUFFER_MODE = 0x8C7F;
    int MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS = 0x8C80;
    int TRANSFORM_FEEDBACK_VARYINGS = 0x8C83;
    int TRANSFORM_FEEDBACK_BUFFER_START = 0x8C84;
    int TRANSFORM_FEEDBACK_BUFFER_SIZE = 0x8C85;
    int PRIMITIVES_GENERATED = 0x8C87;
    int TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN = 0x8C88;
    int RASTERIZER_DISCARD = 0x8C89;
    int MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 0x8C8A;
    int MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS = 0x8C8B;
    int INTERLEAVED_ATTRIBS = 0x8C8C;
    int SEPARATE_ATTRIBS = 0x8C8D;
    int TRANSFORM_FEEDBACK_BUFFER = 0x8C8E;
    int TRANSFORM_FEEDBACK_BUFFER_BINDING = 0x8C8F;
    int RGBA32UI = 0x8D70;
    int RGB32UI = 0x8D71;
    int RGBA16UI = 0x8D76;
    int RGB16UI = 0x8D77;
    int RGBA8UI = 0x8D7C;
    int RGB8UI = 0x8D7D;
    int RGBA32I = 0x8D82;
    int RGB32I = 0x8D83;
    int RGBA16I = 0x8D88;
    int RGB16I = 0x8D89;
    int RGBA8I = 0x8D8E;
    int RGB8I = 0x8D8F;
    int RED_INTEGER = 0x8D94;
    int GREEN_INTEGER = 0x8D95;
    int BLUE_INTEGER = 0x8D96;
    int RGB_INTEGER = 0x8D98;
    int RGBA_INTEGER = 0x8D99;
    int BGR_INTEGER = 0x8D9A;
    int BGRA_INTEGER = 0x8D9B;
    int SAMPLER_1D_ARRAY = 0x8DC0;
    int SAMPLER_2D_ARRAY = 0x8DC1;
    int SAMPLER_1D_ARRAY_SHADOW = 0x8DC3;
    int SAMPLER_2D_ARRAY_SHADOW = 0x8DC4;
    int SAMPLER_CUBE_SHADOW = 0x8DC5;
    int UNSIGNED_INT_VEC2 = 0x8DC6;
    int UNSIGNED_INT_VEC3 = 0x8DC7;
    int UNSIGNED_INT_VEC4 = 0x8DC8;
    int INT_SAMPLER_1D = 0x8DC9;
    int INT_SAMPLER_2D = 0x8DCA;
    int INT_SAMPLER_3D = 0x8DCB;
    int INT_SAMPLER_CUBE = 0x8DCC;
    int INT_SAMPLER_1D_ARRAY = 0x8DCE;
    int INT_SAMPLER_2D_ARRAY = 0x8DCF;
    int UNSIGNED_INT_SAMPLER_1D = 0x8DD1;
    int UNSIGNED_INT_SAMPLER_2D = 0x8DD2;
    int UNSIGNED_INT_SAMPLER_3D = 0x8DD3;
    int UNSIGNED_INT_SAMPLER_CUBE = 0x8DD4;
    int UNSIGNED_INT_SAMPLER_1D_ARRAY = 0x8DD6;
    int UNSIGNED_INT_SAMPLER_2D_ARRAY = 0x8DD7;
    int QUERY_WAIT = 0x8E13;
    int QUERY_NO_WAIT = 0x8E14;
    int QUERY_BY_REGION_WAIT = 0x8E15;
    int QUERY_BY_REGION_NO_WAIT = 0x8E16;
    int BUFFER_ACCESS_FLAGS = 0x911F;
    int BUFFER_MAP_LENGTH = 0x9120;
    int BUFFER_MAP_OFFSET = 0x9121;
    int DEPTH_COMPONENT32F = 0x8CAC;
    int DEPTH32F_STENCIL8 = 0x8CAD;
    int FLOAT_32_UNSIGNED_INT_24_8_REV = 0x8DAD;
    int INVALID_FRAMEBUFFER_OPERATION = 0x0506;
    int FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING = 0x8210;
    int FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE = 0x8211;
    int FRAMEBUFFER_ATTACHMENT_RED_SIZE = 0x8212;
    int FRAMEBUFFER_ATTACHMENT_GREEN_SIZE = 0x8213;
    int FRAMEBUFFER_ATTACHMENT_BLUE_SIZE = 0x8214;
    int FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE = 0x8215;
    int FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE = 0x8216;
    int FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE = 0x8217;
    int FRAMEBUFFER_DEFAULT = 0x8218;
    int FRAMEBUFFER_UNDEFINED = 0x8219;
    int DEPTH_STENCIL_ATTACHMENT = 0x821A;
    int MAX_RENDERBUFFER_SIZE = 0x84E8;
    int DEPTH_STENCIL = 0x84F9;
    int UNSIGNED_INT_24_8 = 0x84FA;
    int DEPTH24_STENCIL8 = 0x88F0;
    int TEXTURE_STENCIL_SIZE = 0x88F1;
    int TEXTURE_RED_TYPE = 0x8C10;
    int TEXTURE_GREEN_TYPE = 0x8C11;
    int TEXTURE_BLUE_TYPE = 0x8C12;
    int TEXTURE_ALPHA_TYPE = 0x8C13;
    int TEXTURE_DEPTH_TYPE = 0x8C16;
    int UNSIGNED_NORMALIZED = 0x8C17;
    int FRAMEBUFFER_BINDING = 0x8CA6;
    int DRAW_FRAMEBUFFER_BINDING = 0x8CA6;
    int RENDERBUFFER_BINDING = 0x8CA7;
    int READ_FRAMEBUFFER = 0x8CA8;
    int DRAW_FRAMEBUFFER = 0x8CA9;
    int READ_FRAMEBUFFER_BINDING = 0x8CAA;
    int RENDERBUFFER_SAMPLES = 0x8CAB;
    int FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 0x8CD0;
    int FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 0x8CD1;
    int FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 0x8CD2;
    int FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3;
    int FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 0x8CD4;
    int FRAMEBUFFER_COMPLETE = 0x8CD5;
    int FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 0x8CD6;
    int FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x8CD7;
    int FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER = 0x8CDB;
    int FRAMEBUFFER_INCOMPLETE_READ_BUFFER = 0x8CDC;
    int FRAMEBUFFER_UNSUPPORTED = 0x8CDD;
    int MAX_COLOR_ATTACHMENTS = 0x8CDF;
    int COLOR_ATTACHMENT0 = 0x8CE0;
    int COLOR_ATTACHMENT1 = 0x8CE1;
    int COLOR_ATTACHMENT2 = 0x8CE2;
    int COLOR_ATTACHMENT3 = 0x8CE3;
    int COLOR_ATTACHMENT4 = 0x8CE4;
    int COLOR_ATTACHMENT5 = 0x8CE5;
    int COLOR_ATTACHMENT6 = 0x8CE6;
    int COLOR_ATTACHMENT7 = 0x8CE7;
    int COLOR_ATTACHMENT8 = 0x8CE8;
    int COLOR_ATTACHMENT9 = 0x8CE9;
    int COLOR_ATTACHMENT10 = 0x8CEA;
    int COLOR_ATTACHMENT11 = 0x8CEB;
    int COLOR_ATTACHMENT12 = 0x8CEC;
    int COLOR_ATTACHMENT13 = 0x8CED;
    int COLOR_ATTACHMENT14 = 0x8CEE;
    int COLOR_ATTACHMENT15 = 0x8CEF;
    int COLOR_ATTACHMENT16 = 0x8CF0;
    int COLOR_ATTACHMENT17 = 0x8CF1;
    int COLOR_ATTACHMENT18 = 0x8CF2;
    int COLOR_ATTACHMENT19 = 0x8CF3;
    int COLOR_ATTACHMENT20 = 0x8CF4;
    int COLOR_ATTACHMENT21 = 0x8CF5;
    int COLOR_ATTACHMENT22 = 0x8CF6;
    int COLOR_ATTACHMENT23 = 0x8CF7;
    int COLOR_ATTACHMENT24 = 0x8CF8;
    int COLOR_ATTACHMENT25 = 0x8CF9;
    int COLOR_ATTACHMENT26 = 0x8CFA;
    int COLOR_ATTACHMENT27 = 0x8CFB;
    int COLOR_ATTACHMENT28 = 0x8CFC;
    int COLOR_ATTACHMENT29 = 0x8CFD;
    int COLOR_ATTACHMENT30 = 0x8CFE;
    int COLOR_ATTACHMENT31 = 0x8CFF;
    int DEPTH_ATTACHMENT = 0x8D00;
    int STENCIL_ATTACHMENT = 0x8D20;
    int FRAMEBUFFER = 0x8D40;
    int RENDERBUFFER = 0x8D41;
    int RENDERBUFFER_WIDTH = 0x8D42;
    int RENDERBUFFER_HEIGHT = 0x8D43;
    int RENDERBUFFER_INTERNAL_FORMAT = 0x8D44;
    int STENCIL_INDEX1 = 0x8D46;
    int STENCIL_INDEX4 = 0x8D47;
    int STENCIL_INDEX8 = 0x8D48;
    int STENCIL_INDEX16 = 0x8D49;
    int RENDERBUFFER_RED_SIZE = 0x8D50;
    int RENDERBUFFER_GREEN_SIZE = 0x8D51;
    int RENDERBUFFER_BLUE_SIZE = 0x8D52;
    int RENDERBUFFER_ALPHA_SIZE = 0x8D53;
    int RENDERBUFFER_DEPTH_SIZE = 0x8D54;
    int RENDERBUFFER_STENCIL_SIZE = 0x8D55;
    int FRAMEBUFFER_INCOMPLETE_MULTISAMPLE = 0x8D56;
    int MAX_SAMPLES = 0x8D57;
    int FRAMEBUFFER_SRGB = 0x8DB9;
    int HALF_FLOAT = 0x140B;
    int MAP_READ_BIT = 0x0001;
    int MAP_WRITE_BIT = 0x0002;
    int MAP_INVALIDATE_RANGE_BIT = 0x0004;
    int MAP_INVALIDATE_BUFFER_BIT = 0x0008;
    int MAP_FLUSH_EXPLICIT_BIT = 0x0010;
    int MAP_UNSYNCHRONIZED_BIT = 0x0020;
    int COMPRESSED_RED_RGTC1 = 0x8DBB;
    int COMPRESSED_SIGNED_RED_RGTC1 = 0x8DBC;
    int COMPRESSED_RG_RGTC2 = 0x8DBD;
    int COMPRESSED_SIGNED_RG_RGTC2 = 0x8DBE;
    int RG = 0x8227;
    int RG_INTEGER = 0x8228;
    int R8 = 0x8229;
    int R16 = 0x822A;
    int RG8 = 0x822B;
    int RG16 = 0x822C;
    int R16F = 0x822D;
    int R32F = 0x822E;
    int RG16F = 0x822F;
    int RG32F = 0x8230;
    int R8I = 0x8231;
    int R8UI = 0x8232;
    int R16I = 0x8233;
    int R16UI = 0x8234;
    int R32I = 0x8235;
    int R32UI = 0x8236;
    int RG8I = 0x8237;
    int RG8UI = 0x8238;
    int RG16I = 0x8239;
    int RG16UI = 0x823A;
    int RG32I = 0x823B;
    int RG32UI = 0x823C;
    int VERTEX_ARRAY_BINDING = 0x85B5;

    @Entrypoint("glBeginConditionalRender")
    default void beginConditionalRender(int id, int mode) {
        throw new ContextException();
    }

    @Entrypoint("glBeginTransformFeedback")
    default void beginTransformFeedback(int primitiveMode) {
        throw new ContextException();
    }

    @Entrypoint("glBindBufferBase")
    default void bindBufferBase(int target, int index, int buffer) {
        throw new ContextException();
    }

    @Entrypoint("glBindBufferRange")
    default void bindBufferRange(int target, int index, int buffer, long offset, long size) {
        throw new ContextException();
    }

    @Entrypoint("glBindFragDataLocation")
    default void bindFragDataLocation(int program, int color, MemorySegment name) {
        throw new ContextException();
    }

    @Entrypoint("glBindFragDataLocation")
    default void bindFragDataLocation(int program, int color, String name) {
        throw new ContextException();
    }

    @Entrypoint("glBindFramebuffer")
    default void bindFramebuffer(int target, int framebuffer) {
        throw new ContextException();
    }

    @Entrypoint("glBindRenderbuffer")
    default void bindRenderbuffer(int target, int renderbuffer) {
        throw new ContextException();
    }

    @Entrypoint("glBindVertexArray")
    default void bindVertexArray(int array) {
        throw new ContextException();
    }

    @Entrypoint("glBlitFramebuffer")
    default void blitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter) {
        throw new ContextException();
    }

    @Entrypoint("glCheckFramebufferStatus")
    default int checkFramebufferStatus(int target) {
        throw new ContextException();
    }

    @Entrypoint("glClampColor")
    default void clampColor(int target, int clamp) {
        throw new ContextException();
    }

    @Entrypoint("glClearBufferfi")
    default void clearBufferfi(int buffer, int drawBuffer, float depth, int stencil) {
        throw new ContextException();
    }

    @Entrypoint("glClearBufferfv")
    default void clearBufferfv(int buffer, int drawBuffer, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glClearBufferfv")
    default void clearBufferfv(SegmentAllocator allocator, int buffer, int drawBuffer, float[] value) {
        throw new ContextException();
    }

    @Entrypoint("glClearBufferiv")
    default void clearBufferiv(int buffer, int drawBuffer, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glClearBufferiv")
    default void clearBufferiv(SegmentAllocator allocator, int buffer, int drawBuffer, int[] value) {
        throw new ContextException();
    }

    @Entrypoint("glClearBufferuiv")
    default void clearBufferuiv(int buffer, int drawBuffer, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glClearBufferuiv")
    default void clearBufferuiv(SegmentAllocator allocator, int buffer, int drawBuffer, int[] value) {
        throw new ContextException();
    }

    @Entrypoint("glColorMaski")
    default void colorMaski(int index, boolean r, boolean g, boolean b, boolean a) {
        throw new ContextException();
    }

    @Entrypoint("glDeleteFramebuffers")
    default void deleteFramebuffers(int n, MemorySegment framebuffers) {
        throw new ContextException();
    }

    @Skip
    default void deleteFramebuffers(int... framebuffers) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            deleteFramebuffers(framebuffers.length, Marshal.marshal(stack, framebuffers));
        }
    }

    @Entrypoint("glDeleteRenderbuffers")
    default void deleteRenderbuffers(int n, MemorySegment renderbuffers) {
        throw new ContextException();
    }

    @Skip
    default void deleteRenderbuffers(int... renderbuffers) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            deleteRenderbuffers(renderbuffers.length, Marshal.marshal(stack, renderbuffers));
        }
    }

    @Entrypoint("glDeleteVertexArrays")
    default void deleteVertexArrays(int n, MemorySegment arrays) {
        throw new ContextException();
    }

    @Skip
    default void deleteVertexArrays(int... arrays) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            deleteVertexArrays(arrays.length, Marshal.marshal(stack, arrays));
        }
    }

    @Entrypoint("glDisablei")
    default void disablei(int target, int index) {
        throw new ContextException();
    }

    @Entrypoint("glEnablei")
    default void enablei(int target, int index) {
        throw new ContextException();
    }

    @Entrypoint("glEndConditionalRender")
    default void endConditionalRender() {
        throw new ContextException();
    }

    @Entrypoint("glEndTransformFeedback")
    default void endTransformFeedback() {
        throw new ContextException();
    }

    @Entrypoint("glFlushMappedBufferRange")
    default void flushMappedBufferRange(int target, long offset, long length) {
        throw new ContextException();
    }

    @Entrypoint("glFramebufferRenderbuffer")
    default void framebufferRenderbuffer(int target, int attachment, int renderbufferTarget, int renderbuffer) {
        throw new ContextException();
    }

    @Entrypoint("glFramebufferTexture1D")
    default void framebufferTexture1D(int target, int attachment, int texTarget, int texture, int level) {
        throw new ContextException();
    }

    @Entrypoint("glFramebufferTexture2D")
    default void framebufferTexture2D(int target, int attachment, int texTarget, int texture, int level) {
        throw new ContextException();
    }

    @Entrypoint("glFramebufferTexture3D")
    default void framebufferTexture3D(int target, int attachment, int texTarget, int texture, int level, int zoffset) {
        throw new ContextException();
    }

    @Entrypoint("glFramebufferTextureLayer")
    default void framebufferTextureLayer(int target, int attachment, int texture, int level, int layer) {
        throw new ContextException();
    }

    @Entrypoint("glGenFramebuffers")
    default void genFramebuffers(int n, MemorySegment framebuffers) {
        throw new ContextException();
    }

    @Skip
    default void genFramebuffers(SegmentAllocator allocator, @Ref int[] framebuffers) {
        var seg = Marshal.marshal(allocator, framebuffers);
        genFramebuffers(framebuffers.length, seg);
        Unmarshal.copy(seg, framebuffers);
    }

    @Skip
    default int genFramebuffers() {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.ints(0);
            genFramebuffers(1, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGenRenderbuffers")
    default void genRenderbuffers(int n, MemorySegment renderbuffers) {
        throw new ContextException();
    }

    @Skip
    default void genRenderbuffers(SegmentAllocator allocator, @Ref int[] renderbuffers) {
        var seg = Marshal.marshal(allocator, renderbuffers);
        genRenderbuffers(renderbuffers.length, seg);
        Unmarshal.copy(seg, renderbuffers);
    }

    @Skip
    default int genRenderbuffers() {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.ints(0);
            genRenderbuffers(1, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGenVertexArrays")
    default void genVertexArrays(int n, MemorySegment arrays) {
        throw new ContextException();
    }

    @Skip
    default void genVertexArrays(SegmentAllocator allocator, @Ref int[] arrays) {
        var seg = Marshal.marshal(allocator, arrays);
        genVertexArrays(arrays.length, seg);
        Unmarshal.copy(seg, arrays);
    }

    @Skip
    default int genVertexArrays() {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.ints(0);
            genVertexArrays(1, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGenerateMipmap")
    default void generateMipmap(int target) {
        throw new ContextException();
    }

    @Entrypoint("glGetBooleani_v")
    default void getBooleani_v(int target, int index, MemorySegment data) {
        throw new ContextException();
    }

    @Entrypoint("glGetBooleani_v")
    default void getBooleani_v(SegmentAllocator allocator, int target, int index, @Ref boolean[] data) {
        throw new ContextException();
    }

    @Skip
    default boolean getBooleani_v(int target, int index) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.allocate(JAVA_BOOLEAN);
            getBooleani_v(target, index, seg);
            return seg.get(JAVA_BOOLEAN, 0);
        }
    }

    @Entrypoint("glGetFragDataLocation")
    default int getFragDataLocation(int program, MemorySegment name) {
        throw new ContextException();
    }

    @Entrypoint("glGetFragDataLocation")
    default int getFragDataLocation(int program, String name) {
        throw new ContextException();
    }

    @Entrypoint("glGetFramebufferAttachmentParameteriv")
    default void getFramebufferAttachmentParameteriv(int target, int attachment, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Skip
    default int getFramebufferAttachmentParameteriv(int target, int attachment, int pname) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.ints(0);
            getFramebufferAttachmentParameteriv(target, attachment, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetIntegeri_v")
    default void getIntegeri_v(int target, int index, MemorySegment data) {
        throw new ContextException();
    }

    @Entrypoint("glGetIntegeri_v")
    default void getIntegeri_v(SegmentAllocator allocator, int target, int index, @Ref int[] data) {
        throw new ContextException();
    }

    @Skip
    default int getIntegeri_v(int target, int index) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.ints(0);
            getIntegeri_v(target, index, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetRenderbufferParameteriv")
    default void getRenderbufferParameteriv(int target, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetRenderbufferParameteriv")
    default void getRenderbufferParameteriv(int target, int pname, @Ref int[] params) {
        throw new ContextException();
    }

    @Skip
    default int getRenderbufferParameteriv(int target, int pname) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.ints(0);
            getRenderbufferParameteriv(target, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetStringi")
    default MemorySegment ngetStringi(int pname, int index) {
        throw new ContextException();
    }

    @Entrypoint("glGetStringi")
    @Nullable
    @SizedSeg(Unmarshal.STR_SIZE)
    default String getStringi(int pname, int index) {
        throw new ContextException();
    }

    @Entrypoint("glGetTexParameterIiv")
    default void getTexParameterIiv(int target, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetTexParameterIiv")
    default void getTexParameterIiv(SegmentAllocator allocator, int target, int pname, @Ref int[] params) {
        throw new ContextException();
    }

    @Skip
    default int getTexParameterIiv(int target, int pname) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.ints(0);
            getTexParameterIiv(target, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetTexParameterIuiv")
    default void getTexParameterIuiv(int target, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetTexParameterIuiv")
    default void getTexParameterIuiv(SegmentAllocator allocator, int target, int pname, @Ref int[] params) {
        throw new ContextException();
    }

    @Skip
    default int getTexParameterIuiv(int target, int pname) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.ints(0);
            getTexParameterIuiv(target, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetTransformFeedbackVarying")
    default void getTransformFeedbackVarying(int program, int index, int bufSize, MemorySegment length, MemorySegment size, MemorySegment type, MemorySegment name) {
        throw new ContextException();
    }

    @Skip
    default void getTransformFeedbackVarying(SegmentAllocator allocator, int program, int index, int bufSize, @Ref int @Nullable [] length, @Ref int[] size, @Ref int[] type, @Ref String[] name) {
        var pLen = Marshal.marshal(allocator, length);
        var pSz = Marshal.marshal(allocator, size);
        var pType = Marshal.marshal(allocator, type);
        var pName = allocator.allocate(JAVA_BYTE, bufSize);
        getTransformFeedbackVarying(program, index, bufSize, pLen, pSz, pType, pName);
        Unmarshal.copy(pLen, length);
        Unmarshal.copy(pSz, size);
        Unmarshal.copy(pType, type);
        name[0] = pName.getString(0);
    }

    @Entrypoint("glGetUniformuiv")
    default void getUniformuiv(int program, int location, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetUniformuiv")
    default void getUniformuiv(SegmentAllocator allocator, int program, int location, @Ref int[] params) {
        throw new ContextException();
    }

    @Skip
    default int getUniformuiv(int program, int location) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.ints(0);
            getUniformuiv(program, location, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetVertexAttribIiv")
    default void getVertexAttribIiv(int index, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetVertexAttribIiv")
    default void getVertexAttribIiv(SegmentAllocator allocator, int index, int pname, @Ref int[] params) {
        throw new ContextException();
    }

    @Skip
    default int getVertexAttribIiv(int index, int pname) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.ints(0);
            getVertexAttribIiv(index, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetVertexAttribIuiv")
    default void getVertexAttribIuiv(int index, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetVertexAttribIuiv")
    default void getVertexAttribIuiv(SegmentAllocator allocator, int index, int pname, @Ref int[] params) {
        throw new ContextException();
    }

    @Skip
    default int getVertexAttribIuiv(int index, int pname) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.ints(0);
            getVertexAttribIuiv(index, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glIsEnabledi")
    default boolean isEnabledi(int target, int index) {
        throw new ContextException();
    }

    @Entrypoint("glIsFramebuffer")
    default boolean isFramebuffer(int framebuffer) {
        throw new ContextException();
    }

    @Entrypoint("glIsRenderbuffer")
    default boolean isRenderbuffer(int renderbuffer) {
        throw new ContextException();
    }

    @Entrypoint("glIsVertexArray")
    default boolean isVertexArray(int array) {
        throw new ContextException();
    }

    default MethodHandle glMapBufferRange() {
        throw new ContextException();
    }

    @Skip
    default MemorySegment mapBufferRange(int target, long offset, long length, int access) {
        try {
            return ((MemorySegment) glMapBufferRange().invokeExact(target, offset, length, access)).reinterpret(length);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    @Entrypoint("glRenderbufferStorage")
    default void renderbufferStorage(int target, int internalFormat, int width, int height) {
        throw new ContextException();
    }

    @Entrypoint("glRenderbufferStorageMultisample")
    default void renderbufferStorageMultisample(int target, int samples, int internalFormat, int width, int height) {
        throw new ContextException();
    }

    @Entrypoint("glTexParameterIiv")
    default void texParameterIiv(int target, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glTexParameterIiv")
    default void texParameterIiv(SegmentAllocator allocator, int target, int pname, int[] params) {
        throw new ContextException();
    }

    @Entrypoint("glTexParameterIuiv")
    default void texParameterIuiv(int target, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glTexParameterIuiv")
    default void texParameterIuiv(SegmentAllocator allocator, int target, int pname, int[] params) {
        throw new ContextException();
    }

    @Entrypoint("glTransformFeedbackVaryings")
    default void transformFeedbackVaryings(int program, int count, MemorySegment varyings, int bufferMode) {
        throw new ContextException();
    }

    @Skip
    default void transformFeedbackVaryings(SegmentAllocator allocator, int program, String[] varyings, int bufferMode) {
        transformFeedbackVaryings(program, varyings.length, Marshal.marshal(allocator, varyings), bufferMode);
    }

    @Entrypoint("glUniform1ui")
    default void uniform1ui(int location, int v0) {
        throw new ContextException();
    }

    @Entrypoint("glUniform1uiv")
    default void uniform1uiv(int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void uniform1uiv(SegmentAllocator allocator, int location, int[] value) {
        uniform1uiv(location, value.length, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glUniform2ui")
    default void uniform2ui(int location, int v0, int v1) {
        throw new ContextException();
    }

    @Entrypoint("glUniform2uiv")
    default void uniform2uiv(int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void uniform2uiv(SegmentAllocator allocator, int location, int[] value) {
        uniform2uiv(location, value.length >> 1, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glUniform3ui")
    default void uniform3ui(int location, int v0, int v1, int v2) {
        throw new ContextException();
    }

    @Entrypoint("glUniform3uiv")
    default void uniform3uiv(int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void uniform3uiv(SegmentAllocator allocator, int location, int[] value) {
        uniform3uiv(location, value.length / 3, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glUniform4ui")
    default void uniform4ui(int location, int v0, int v1, int v2, int v3) {
        throw new ContextException();
    }

    @Entrypoint("glUniform4uiv")
    default void uniform4uiv(int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void uniform4uiv(SegmentAllocator allocator, int location, int[] value) {
        uniform4uiv(location, value.length >> 2, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glVertexAttribI1i")
    default void vertexAttribI1i(int index, int x) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI1iv")
    default void vertexAttribI1iv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI1iv")
    default void vertexAttribI1iv(SegmentAllocator allocator, int index, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI1ui")
    default void vertexAttribI1ui(int index, int x) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI1uiv")
    default void vertexAttribI1uiv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI1uiv")
    default void vertexAttribI1uiv(SegmentAllocator allocator, int index, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI2i")
    default void vertexAttribI2i(int index, int x, int y) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI2iv")
    default void vertexAttribI2iv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI2iv")
    default void vertexAttribI2iv(SegmentAllocator allocator, int index, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI2ui")
    default void vertexAttribI2ui(int index, int x, int y) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI2uiv")
    default void vertexAttribI2uiv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI2uiv")
    default void vertexAttribI2uiv(SegmentAllocator allocator, int index, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI3i")
    default void vertexAttribI3i(int index, int x, int y, int z) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI3iv")
    default void vertexAttribI3iv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI3iv")
    default void vertexAttribI3iv(SegmentAllocator allocator, int index, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI3ui")
    default void vertexAttribI3ui(int index, int x, int y, int z) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI3uiv")
    default void vertexAttribI3uiv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI3uiv")
    default void vertexAttribI3uiv(SegmentAllocator allocator, int index, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI4bv")
    default void vertexAttribI4bv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI4bv")
    default void vertexAttribI4bv(SegmentAllocator allocator, int index, byte[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI4i")
    default void vertexAttribI4i(int index, int x, int y, int z, int w) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI4iv")
    default void vertexAttribI4iv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI4iv")
    default void vertexAttribI4iv(SegmentAllocator allocator, int index, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI4sv")
    default void vertexAttribI4sv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI4sv")
    default void vertexAttribI4sv(SegmentAllocator allocator, int index, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI4ubv")
    default void vertexAttribI4ubv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI4ubv")
    default void vertexAttribI4ubv(SegmentAllocator allocator, int index, byte[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI4ui")
    default void vertexAttribI4ui(int index, int x, int y, int z, int w) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI4uiv")
    default void vertexAttribI4uiv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI4uiv")
    default void vertexAttribI4uiv(SegmentAllocator allocator, int index, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI4usv")
    default void vertexAttribI4usv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribI4usv")
    default void vertexAttribI4usv(SegmentAllocator allocator, int index, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribIPointer")
    default void vertexAttribIPointer(int index, int size, int type, int stride, MemorySegment pointer) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribIPointer")
    default void vertexAttribIPointer(SegmentAllocator allocator, int index, int size, int type, int stride, byte[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribIPointer")
    default void vertexAttribIPointer(SegmentAllocator allocator, int index, int size, int type, int stride, short[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribIPointer")
    default void vertexAttribIPointer(SegmentAllocator allocator, int index, int size, int type, int stride, int[] pointer) {
        throw new ContextException();
    }
}

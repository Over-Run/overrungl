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

package org.overrun.glib.gl;

import org.jetbrains.annotations.Nullable;
import org.overrun.glib.RuntimeHelper;
import org.overrun.glib.util.MemoryStack;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SegmentScope;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLLoader.*;

/**
 * The OpenGL 4.3 core profile functions.
 * <p>
 * These extensions are promoted in this version:
 * <ul>
 *     <li>GL_ARB_clear_buffer_object</li>
 *     <li>GL_ARB_compute_shader</li>
 *     <li>GL_ARB_copy_image</li>
 *     <li>{@linkplain org.overrun.glib.gl.ext.arb.GLARBDebugOutput GL_ARB_debug_output}</li>
 *     <li>GL_ARB_framebuffer_no_attachments</li>
 *     <li>GL_ARB_internalformat_query2</li>
 *     <li>GL_ARB_invalidate_subdata</li>
 *     <li>GL_ARB_multi_draw_indirect</li>
 *     <li>GL_ARB_program_interface_query</li>
 *     <li>GL_ARB_shader_storage_buffer_object</li>
 *     <li>GL_ARB_texture_buffer_range</li>
 *     <li>GL_ARB_texture_storage_multisample</li>
 *     <li>GL_ARB_texture_view</li>
 *     <li>GL_ARB_vertex_attrib_binding</li>
 *     <li>GL_KHR_debug</li>
 * </ul>
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL43C extends GL42C permits GL44C {
    public static final int NUM_SHADING_LANGUAGE_VERSIONS = 0x82E9;
    public static final int VERTEX_ATTRIB_ARRAY_LONG = 0x874E;
    public static final int COMPRESSED_RGB8_ETC2 = 0x9274;
    public static final int COMPRESSED_SRGB8_ETC2 = 0x9275;
    public static final int COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9276;
    public static final int COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9277;
    public static final int COMPRESSED_RGBA8_ETC2_EAC = 0x9278;
    public static final int COMPRESSED_SRGB8_ALPHA8_ETC2_EAC = 0x9279;
    public static final int COMPRESSED_R11_EAC = 0x9270;
    public static final int COMPRESSED_SIGNED_R11_EAC = 0x9271;
    public static final int COMPRESSED_RG11_EAC = 0x9272;
    public static final int COMPRESSED_SIGNED_RG11_EAC = 0x9273;
    public static final int PRIMITIVE_RESTART_FIXED_INDEX = 0x8D69;
    public static final int ANY_SAMPLES_PASSED_CONSERVATIVE = 0x8D6A;
    public static final int MAX_ELEMENT_INDEX = 0x8D6B;
    public static final int COMPUTE_SHADER = 0x91B9;
    public static final int MAX_COMPUTE_UNIFORM_BLOCKS = 0x91BB;
    public static final int MAX_COMPUTE_TEXTURE_IMAGE_UNITS = 0x91BC;
    public static final int MAX_COMPUTE_IMAGE_UNIFORMS = 0x91BD;
    public static final int MAX_COMPUTE_SHARED_MEMORY_SIZE = 0x8262;
    public static final int MAX_COMPUTE_UNIFORM_COMPONENTS = 0x8263;
    public static final int MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS = 0x8264;
    public static final int MAX_COMPUTE_ATOMIC_COUNTERS = 0x8265;
    public static final int MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS = 0x8266;
    public static final int MAX_COMPUTE_WORK_GROUP_INVOCATIONS = 0x90EB;
    public static final int MAX_COMPUTE_WORK_GROUP_COUNT = 0x91BE;
    public static final int MAX_COMPUTE_WORK_GROUP_SIZE = 0x91BF;
    public static final int COMPUTE_WORK_GROUP_SIZE = 0x8267;
    public static final int UNIFORM_BLOCK_REFERENCED_BY_COMPUTE_SHADER = 0x90EC;
    public static final int ATOMIC_COUNTER_BUFFER_REFERENCED_BY_COMPUTE_SHADER = 0x90ED;
    public static final int DISPATCH_INDIRECT_BUFFER = 0x90EE;
    public static final int DISPATCH_INDIRECT_BUFFER_BINDING = 0x90EF;
    public static final int COMPUTE_SHADER_BIT = 0x00000020;
    public static final int DEBUG_OUTPUT_SYNCHRONOUS = 0x8242;
    public static final int DEBUG_NEXT_LOGGED_MESSAGE_LENGTH = 0x8243;
    public static final int DEBUG_CALLBACK_FUNCTION = 0x8244;
    public static final int DEBUG_CALLBACK_USER_PARAM = 0x8245;
    public static final int DEBUG_SOURCE_API = 0x8246;
    public static final int DEBUG_SOURCE_WINDOW_SYSTEM = 0x8247;
    public static final int DEBUG_SOURCE_SHADER_COMPILER = 0x8248;
    public static final int DEBUG_SOURCE_THIRD_PARTY = 0x8249;
    public static final int DEBUG_SOURCE_APPLICATION = 0x824A;
    public static final int DEBUG_SOURCE_OTHER = 0x824B;
    public static final int DEBUG_TYPE_ERROR = 0x824C;
    public static final int DEBUG_TYPE_DEPRECATED_BEHAVIOR = 0x824D;
    public static final int DEBUG_TYPE_UNDEFINED_BEHAVIOR = 0x824E;
    public static final int DEBUG_TYPE_PORTABILITY = 0x824F;
    public static final int DEBUG_TYPE_PERFORMANCE = 0x8250;
    public static final int DEBUG_TYPE_OTHER = 0x8251;
    public static final int MAX_DEBUG_MESSAGE_LENGTH = 0x9143;
    public static final int MAX_DEBUG_LOGGED_MESSAGES = 0x9144;
    public static final int DEBUG_LOGGED_MESSAGES = 0x9145;
    public static final int DEBUG_SEVERITY_HIGH = 0x9146;
    public static final int DEBUG_SEVERITY_MEDIUM = 0x9147;
    public static final int DEBUG_SEVERITY_LOW = 0x9148;
    public static final int DEBUG_TYPE_MARKER = 0x8268;
    public static final int DEBUG_TYPE_PUSH_GROUP = 0x8269;
    public static final int DEBUG_TYPE_POP_GROUP = 0x826A;
    public static final int DEBUG_SEVERITY_NOTIFICATION = 0x826B;
    public static final int MAX_DEBUG_GROUP_STACK_DEPTH = 0x826C;
    public static final int DEBUG_GROUP_STACK_DEPTH = 0x826D;
    public static final int BUFFER = 0x82E0;
    public static final int SHADER = 0x82E1;
    public static final int PROGRAM = 0x82E2;
    public static final int QUERY = 0x82E3;
    public static final int PROGRAM_PIPELINE = 0x82E4;
    public static final int SAMPLER = 0x82E6;
    public static final int MAX_LABEL_LENGTH = 0x82E8;
    public static final int DEBUG_OUTPUT = 0x92E0;
    public static final int CONTEXT_FLAG_DEBUG_BIT = 0x00000002;
    public static final int MAX_UNIFORM_LOCATIONS = 0x826E;
    public static final int FRAMEBUFFER_DEFAULT_WIDTH = 0x9310;
    public static final int FRAMEBUFFER_DEFAULT_HEIGHT = 0x9311;
    public static final int FRAMEBUFFER_DEFAULT_LAYERS = 0x9312;
    public static final int FRAMEBUFFER_DEFAULT_SAMPLES = 0x9313;
    public static final int FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS = 0x9314;
    public static final int MAX_FRAMEBUFFER_WIDTH = 0x9315;
    public static final int MAX_FRAMEBUFFER_HEIGHT = 0x9316;
    public static final int MAX_FRAMEBUFFER_LAYERS = 0x9317;
    public static final int MAX_FRAMEBUFFER_SAMPLES = 0x9318;
    public static final int INTERNALFORMAT_SUPPORTED = 0x826F;
    public static final int INTERNALFORMAT_PREFERRED = 0x8270;
    public static final int INTERNALFORMAT_RED_SIZE = 0x8271;
    public static final int INTERNALFORMAT_GREEN_SIZE = 0x8272;
    public static final int INTERNALFORMAT_BLUE_SIZE = 0x8273;
    public static final int INTERNALFORMAT_ALPHA_SIZE = 0x8274;
    public static final int INTERNALFORMAT_DEPTH_SIZE = 0x8275;
    public static final int INTERNALFORMAT_STENCIL_SIZE = 0x8276;
    public static final int INTERNALFORMAT_SHARED_SIZE = 0x8277;
    public static final int INTERNALFORMAT_RED_TYPE = 0x8278;
    public static final int INTERNALFORMAT_GREEN_TYPE = 0x8279;
    public static final int INTERNALFORMAT_BLUE_TYPE = 0x827A;
    public static final int INTERNALFORMAT_ALPHA_TYPE = 0x827B;
    public static final int INTERNALFORMAT_DEPTH_TYPE = 0x827C;
    public static final int INTERNALFORMAT_STENCIL_TYPE = 0x827D;
    public static final int MAX_WIDTH = 0x827E;
    public static final int MAX_HEIGHT = 0x827F;
    public static final int MAX_DEPTH = 0x8280;
    public static final int MAX_LAYERS = 0x8281;
    public static final int MAX_COMBINED_DIMENSIONS = 0x8282;
    public static final int COLOR_COMPONENTS = 0x8283;
    public static final int DEPTH_COMPONENTS = 0x8284;
    public static final int STENCIL_COMPONENTS = 0x8285;
    public static final int COLOR_RENDERABLE = 0x8286;
    public static final int DEPTH_RENDERABLE = 0x8287;
    public static final int STENCIL_RENDERABLE = 0x8288;
    public static final int FRAMEBUFFER_RENDERABLE = 0x8289;
    public static final int FRAMEBUFFER_RENDERABLE_LAYERED = 0x828A;
    public static final int FRAMEBUFFER_BLEND = 0x828B;
    public static final int READ_PIXELS = 0x828C;
    public static final int READ_PIXELS_FORMAT = 0x828D;
    public static final int READ_PIXELS_TYPE = 0x828E;
    public static final int TEXTURE_IMAGE_FORMAT = 0x828F;
    public static final int TEXTURE_IMAGE_TYPE = 0x8290;
    public static final int GET_TEXTURE_IMAGE_FORMAT = 0x8291;
    public static final int GET_TEXTURE_IMAGE_TYPE = 0x8292;
    public static final int MIPMAP = 0x8293;
    public static final int MANUAL_GENERATE_MIPMAP = 0x8294;
    public static final int AUTO_GENERATE_MIPMAP = 0x8295;
    public static final int COLOR_ENCODING = 0x8296;
    public static final int SRGB_READ = 0x8297;
    public static final int SRGB_WRITE = 0x8298;
    public static final int FILTER = 0x829A;
    public static final int VERTEX_TEXTURE = 0x829B;
    public static final int TESS_CONTROL_TEXTURE = 0x829C;
    public static final int TESS_EVALUATION_TEXTURE = 0x829D;
    public static final int GEOMETRY_TEXTURE = 0x829E;
    public static final int FRAGMENT_TEXTURE = 0x829F;
    public static final int COMPUTE_TEXTURE = 0x82A0;
    public static final int TEXTURE_SHADOW = 0x82A1;
    public static final int TEXTURE_GATHER = 0x82A2;
    public static final int TEXTURE_GATHER_SHADOW = 0x82A3;
    public static final int SHADER_IMAGE_LOAD = 0x82A4;
    public static final int SHADER_IMAGE_STORE = 0x82A5;
    public static final int SHADER_IMAGE_ATOMIC = 0x82A6;
    public static final int IMAGE_TEXEL_SIZE = 0x82A7;
    public static final int IMAGE_COMPATIBILITY_CLASS = 0x82A8;
    public static final int IMAGE_PIXEL_FORMAT = 0x82A9;
    public static final int IMAGE_PIXEL_TYPE = 0x82AA;
    public static final int SIMULTANEOUS_TEXTURE_AND_DEPTH_TEST = 0x82AC;
    public static final int SIMULTANEOUS_TEXTURE_AND_STENCIL_TEST = 0x82AD;
    public static final int SIMULTANEOUS_TEXTURE_AND_DEPTH_WRITE = 0x82AE;
    public static final int SIMULTANEOUS_TEXTURE_AND_STENCIL_WRITE = 0x82AF;
    public static final int TEXTURE_COMPRESSED_BLOCK_WIDTH = 0x82B1;
    public static final int TEXTURE_COMPRESSED_BLOCK_HEIGHT = 0x82B2;
    public static final int TEXTURE_COMPRESSED_BLOCK_SIZE = 0x82B3;
    public static final int CLEAR_BUFFER = 0x82B4;
    public static final int TEXTURE_VIEW = 0x82B5;
    public static final int VIEW_COMPATIBILITY_CLASS = 0x82B6;
    public static final int FULL_SUPPORT = 0x82B7;
    public static final int CAVEAT_SUPPORT = 0x82B8;
    public static final int IMAGE_CLASS_4_X_32 = 0x82B9;
    public static final int IMAGE_CLASS_2_X_32 = 0x82BA;
    public static final int IMAGE_CLASS_1_X_32 = 0x82BB;
    public static final int IMAGE_CLASS_4_X_16 = 0x82BC;
    public static final int IMAGE_CLASS_2_X_16 = 0x82BD;
    public static final int IMAGE_CLASS_1_X_16 = 0x82BE;
    public static final int IMAGE_CLASS_4_X_8 = 0x82BF;
    public static final int IMAGE_CLASS_2_X_8 = 0x82C0;
    public static final int IMAGE_CLASS_1_X_8 = 0x82C1;
    public static final int IMAGE_CLASS_11_11_10 = 0x82C2;
    public static final int IMAGE_CLASS_10_10_10_2 = 0x82C3;
    public static final int VIEW_CLASS_128_BITS = 0x82C4;
    public static final int VIEW_CLASS_96_BITS = 0x82C5;
    public static final int VIEW_CLASS_64_BITS = 0x82C6;
    public static final int VIEW_CLASS_48_BITS = 0x82C7;
    public static final int VIEW_CLASS_32_BITS = 0x82C8;
    public static final int VIEW_CLASS_24_BITS = 0x82C9;
    public static final int VIEW_CLASS_16_BITS = 0x82CA;
    public static final int VIEW_CLASS_8_BITS = 0x82CB;
    public static final int VIEW_CLASS_S3TC_DXT1_RGB = 0x82CC;
    public static final int VIEW_CLASS_S3TC_DXT1_RGBA = 0x82CD;
    public static final int VIEW_CLASS_S3TC_DXT3_RGBA = 0x82CE;
    public static final int VIEW_CLASS_S3TC_DXT5_RGBA = 0x82CF;
    public static final int VIEW_CLASS_RGTC1_RED = 0x82D0;
    public static final int VIEW_CLASS_RGTC2_RG = 0x82D1;
    public static final int VIEW_CLASS_BPTC_UNORM = 0x82D2;
    public static final int VIEW_CLASS_BPTC_FLOAT = 0x82D3;
    public static final int UNIFORM = 0x92E1;
    public static final int UNIFORM_BLOCK = 0x92E2;
    public static final int PROGRAM_INPUT = 0x92E3;
    public static final int PROGRAM_OUTPUT = 0x92E4;
    public static final int BUFFER_VARIABLE = 0x92E5;
    public static final int SHADER_STORAGE_BLOCK = 0x92E6;
    public static final int VERTEX_SUBROUTINE = 0x92E8;
    public static final int TESS_CONTROL_SUBROUTINE = 0x92E9;
    public static final int TESS_EVALUATION_SUBROUTINE = 0x92EA;
    public static final int GEOMETRY_SUBROUTINE = 0x92EB;
    public static final int FRAGMENT_SUBROUTINE = 0x92EC;
    public static final int COMPUTE_SUBROUTINE = 0x92ED;
    public static final int VERTEX_SUBROUTINE_UNIFORM = 0x92EE;
    public static final int TESS_CONTROL_SUBROUTINE_UNIFORM = 0x92EF;
    public static final int TESS_EVALUATION_SUBROUTINE_UNIFORM = 0x92F0;
    public static final int GEOMETRY_SUBROUTINE_UNIFORM = 0x92F1;
    public static final int FRAGMENT_SUBROUTINE_UNIFORM = 0x92F2;
    public static final int COMPUTE_SUBROUTINE_UNIFORM = 0x92F3;
    public static final int TRANSFORM_FEEDBACK_VARYING = 0x92F4;
    public static final int ACTIVE_RESOURCES = 0x92F5;
    public static final int MAX_NAME_LENGTH = 0x92F6;
    public static final int MAX_NUM_ACTIVE_VARIABLES = 0x92F7;
    public static final int MAX_NUM_COMPATIBLE_SUBROUTINES = 0x92F8;
    public static final int NAME_LENGTH = 0x92F9;
    public static final int TYPE = 0x92FA;
    public static final int ARRAY_SIZE = 0x92FB;
    public static final int OFFSET = 0x92FC;
    public static final int BLOCK_INDEX = 0x92FD;
    public static final int ARRAY_STRIDE = 0x92FE;
    public static final int MATRIX_STRIDE = 0x92FF;
    public static final int IS_ROW_MAJOR = 0x9300;
    public static final int ATOMIC_COUNTER_BUFFER_INDEX = 0x9301;
    public static final int BUFFER_BINDING = 0x9302;
    public static final int BUFFER_DATA_SIZE = 0x9303;
    public static final int NUM_ACTIVE_VARIABLES = 0x9304;
    public static final int ACTIVE_VARIABLES = 0x9305;
    public static final int REFERENCED_BY_VERTEX_SHADER = 0x9306;
    public static final int REFERENCED_BY_TESS_CONTROL_SHADER = 0x9307;
    public static final int REFERENCED_BY_TESS_EVALUATION_SHADER = 0x9308;
    public static final int REFERENCED_BY_GEOMETRY_SHADER = 0x9309;
    public static final int REFERENCED_BY_FRAGMENT_SHADER = 0x930A;
    public static final int REFERENCED_BY_COMPUTE_SHADER = 0x930B;
    public static final int TOP_LEVEL_ARRAY_SIZE = 0x930C;
    public static final int TOP_LEVEL_ARRAY_STRIDE = 0x930D;
    public static final int LOCATION = 0x930E;
    public static final int LOCATION_INDEX = 0x930F;
    public static final int IS_PER_PATCH = 0x92E7;
    public static final int SHADER_STORAGE_BUFFER = 0x90D2;
    public static final int SHADER_STORAGE_BUFFER_BINDING = 0x90D3;
    public static final int SHADER_STORAGE_BUFFER_START = 0x90D4;
    public static final int SHADER_STORAGE_BUFFER_SIZE = 0x90D5;
    public static final int MAX_VERTEX_SHADER_STORAGE_BLOCKS = 0x90D6;
    public static final int MAX_GEOMETRY_SHADER_STORAGE_BLOCKS = 0x90D7;
    public static final int MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS = 0x90D8;
    public static final int MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS = 0x90D9;
    public static final int MAX_FRAGMENT_SHADER_STORAGE_BLOCKS = 0x90DA;
    public static final int MAX_COMPUTE_SHADER_STORAGE_BLOCKS = 0x90DB;
    public static final int MAX_COMBINED_SHADER_STORAGE_BLOCKS = 0x90DC;
    public static final int MAX_SHADER_STORAGE_BUFFER_BINDINGS = 0x90DD;
    public static final int MAX_SHADER_STORAGE_BLOCK_SIZE = 0x90DE;
    public static final int SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT = 0x90DF;
    public static final int SHADER_STORAGE_BARRIER_BIT = 0x00002000;
    public static final int MAX_COMBINED_SHADER_OUTPUT_RESOURCES = 0x8F39;
    public static final int DEPTH_STENCIL_TEXTURE_MODE = 0x90EA;
    public static final int TEXTURE_BUFFER_OFFSET = 0x919D;
    public static final int TEXTURE_BUFFER_SIZE = 0x919E;
    public static final int TEXTURE_BUFFER_OFFSET_ALIGNMENT = 0x919F;
    public static final int TEXTURE_VIEW_MIN_LEVEL = 0x82DB;
    public static final int TEXTURE_VIEW_NUM_LEVELS = 0x82DC;
    public static final int TEXTURE_VIEW_MIN_LAYER = 0x82DD;
    public static final int TEXTURE_VIEW_NUM_LAYERS = 0x82DE;
    public static final int TEXTURE_IMMUTABLE_LEVELS = 0x82DF;
    public static final int VERTEX_ATTRIB_BINDING = 0x82D4;
    public static final int VERTEX_ATTRIB_RELATIVE_OFFSET = 0x82D5;
    public static final int VERTEX_BINDING_DIVISOR = 0x82D6;
    public static final int VERTEX_BINDING_OFFSET = 0x82D7;
    public static final int VERTEX_BINDING_STRIDE = 0x82D8;
    public static final int MAX_VERTEX_ATTRIB_RELATIVE_OFFSET = 0x82D9;
    public static final int MAX_VERTEX_ATTRIB_BINDINGS = 0x82DA;
    public static final int VERTEX_BINDING_BUFFER = 0x8F4F;

    static boolean isSupported(GLCapabilities caps) {
        return checkAll(caps.glBindVertexBuffer, caps.glClearBufferData, caps.glClearBufferSubData, caps.glCopyImageSubData, caps.glDebugMessageCallback, caps.glDebugMessageControl,
            caps.glDebugMessageInsert, caps.glDispatchCompute, caps.glDispatchComputeIndirect, caps.glFramebufferParameteri, caps.glGetDebugMessageLog, caps.glGetFramebufferParameteriv,
            caps.glGetInternalformati64v, caps.glGetObjectLabel, caps.glGetObjectPtrLabel, caps.glGetPointerv, caps.glGetProgramInterfaceiv, caps.glGetProgramResourceIndex,
            caps.glGetProgramResourceLocation, caps.glGetProgramResourceLocationIndex, caps.glGetProgramResourceName, caps.glGetProgramResourceiv, caps.glInvalidateBufferData, caps.glInvalidateBufferSubData,
            caps.glInvalidateFramebuffer, caps.glInvalidateSubFramebuffer, caps.glInvalidateTexImage, caps.glInvalidateTexSubImage, caps.glMultiDrawArraysIndirect, caps.glMultiDrawElementsIndirect,
            caps.glObjectLabel, caps.glObjectPtrLabel, caps.glPopDebugGroup, caps.glPushDebugGroup, caps.glShaderStorageBlockBinding, caps.glTexBufferRange,
            caps.glTexStorage2DMultisample, caps.glTexStorage3DMultisample, caps.glTextureView, caps.glVertexAttribBinding, caps.glVertexAttribFormat, caps.glVertexAttribIFormat,
            caps.glVertexAttribLFormat, caps.glVertexBindingDivisor);
    }

    static void load(GLCapabilities caps, GLLoadFunc load) {
        caps.glBindVertexBuffer = load.invoke("glBindVertexBuffer", IIJIV);
        caps.glClearBufferData = load.invoke("glClearBufferData", IIIIPV);
        caps.glClearBufferSubData = load.invoke("glClearBufferSubData", IIJJIIPV);
        caps.glCopyImageSubData = load.invoke("glCopyImageSubData", IIIIIIIIIIIIIIIV);
        caps.glDebugMessageCallback = load.invoke("glDebugMessageCallback", PPV);
        caps.glDebugMessageControl = load.invoke("glDebugMessageControl", IIIIPZV);
        caps.glDebugMessageInsert = load.invoke("glDebugMessageInsert", IIIIIPV);
        caps.glDispatchCompute = load.invoke("glDispatchCompute", IIIV);
        caps.glDispatchComputeIndirect = load.invoke("glDispatchComputeIndirect", JV);
        caps.glFramebufferParameteri = load.invoke("glFramebufferParameteri", IIIV);
        caps.glGetDebugMessageLog = load.invoke("glGetDebugMessageLog", IIPPPPPPI);
        caps.glGetFramebufferParameteriv = load.invoke("glGetFramebufferParameteriv", IIPV);
        caps.glGetInternalformati64v = load.invoke("glGetInternalformati64v", IIIIPV);
        caps.glGetObjectLabel = load.invoke("glGetObjectLabel", IIIPPV);
        caps.glGetObjectPtrLabel = load.invoke("glGetObjectPtrLabel", PIPPV);
        caps.glGetPointerv = load.invoke("glGetPointerv", IPV);
        caps.glGetProgramInterfaceiv = load.invoke("glGetProgramInterfaceiv", IIIPV);
        caps.glGetProgramResourceIndex = load.invoke("glGetProgramResourceIndex", IIPI);
        caps.glGetProgramResourceLocation = load.invoke("glGetProgramResourceLocation", IIPI);
        caps.glGetProgramResourceLocationIndex = load.invoke("glGetProgramResourceLocationIndex", IIPI);
        caps.glGetProgramResourceName = load.invoke("glGetProgramResourceName", IIIIPPV);
        caps.glGetProgramResourceiv = load.invoke("glGetProgramResourceiv", IIIIPIPPV);
        caps.glInvalidateBufferData = load.invoke("glInvalidateBufferData", IV);
        caps.glInvalidateBufferSubData = load.invoke("glInvalidateBufferSubData", IJJV);
        caps.glInvalidateFramebuffer = load.invoke("glInvalidateFramebuffer", IIPV);
        caps.glInvalidateSubFramebuffer = load.invoke("glInvalidateSubFramebuffer", IIPIIIIV);
        caps.glInvalidateTexImage = load.invoke("glInvalidateTexImage", IIV);
        caps.glInvalidateTexSubImage = load.invoke("glInvalidateTexSubImage", IIIIIIIIV);
        caps.glMultiDrawArraysIndirect = load.invoke("glMultiDrawArraysIndirect", IPIIV);
        caps.glMultiDrawElementsIndirect = load.invoke("glMultiDrawElementsIndirect", IIPIIV);
        caps.glObjectLabel = load.invoke("glObjectLabel", IIIPV);
        caps.glObjectPtrLabel = load.invoke("glObjectPtrLabel", PIPV);
        caps.glPopDebugGroup = load.invoke("glPopDebugGroup", V);
        caps.glPushDebugGroup = load.invoke("glPushDebugGroup", IIIPV);
        caps.glShaderStorageBlockBinding = load.invoke("glShaderStorageBlockBinding", IIIV);
        caps.glTexBufferRange = load.invoke("glTexBufferRange", IIIJJV);
        caps.glTexStorage2DMultisample = load.invoke("glTexStorage2DMultisample", IIIIIZV);
        caps.glTexStorage3DMultisample = load.invoke("glTexStorage3DMultisample", IIIIIIZV);
        caps.glTextureView = load.invoke("glTextureView", IIIIIIIIV);
        caps.glVertexAttribBinding = load.invoke("glVertexAttribBinding", IIV);
        caps.glVertexAttribFormat = load.invoke("glVertexAttribFormat", IIIZIV);
        caps.glVertexAttribIFormat = load.invoke("glVertexAttribIFormat", IIIIV);
        caps.glVertexAttribLFormat = load.invoke("glVertexAttribLFormat", IIIIV);
        caps.glVertexBindingDivisor = load.invoke("glVertexBindingDivisor", IIV);
    }

    public static void bindVertexBuffer(int bindingIndex, int buffer, long offset, int stride) {
        var caps = getCapabilities();
        try {
            check(caps.glBindVertexBuffer).invokeExact(bindingIndex, buffer, offset, stride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearBufferData(int target, int internalFormat, int format, int type, MemorySegment data) {
        var caps = getCapabilities();
        try {
            check(caps.glClearBufferData).invokeExact(target, internalFormat, format, type, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearBufferSubData(int target, int internalFormat, long offset, long size, int format, int type, MemorySegment data) {
        var caps = getCapabilities();
        try {
            check(caps.glClearBufferSubData).invokeExact(target, internalFormat, offset, size, format, type, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void copyImageSubData(int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth) {
        var caps = getCapabilities();
        try {
            check(caps.glCopyImageSubData).invokeExact(srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void debugMessageCallback(MemorySegment callback, MemorySegment userParam) {
        var caps = getCapabilities();
        try {
            check(caps.glDebugMessageCallback).invokeExact(callback, userParam);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void debugMessageCallback(SegmentScope scope, GLDebugProc callback, MemorySegment userParam) {
        debugMessageCallback(callback.address(scope), userParam);
    }

    public static void debugMessageControl(int source, int type, int severity, int count, MemorySegment ids, boolean enabled) {
        var caps = getCapabilities();
        try {
            check(caps.glDebugMessageControl).invokeExact(source, type, severity, count, ids, enabled);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void debugMessageControl(SegmentAllocator allocator, int source, int type, int severity, int count, int[] ids, boolean enabled) {
        debugMessageControl(source, type, severity, count, allocator.allocateArray(JAVA_INT, ids), enabled);
    }

    public static void debugMessageInsert(int source, int type, int id, int severity, int length, MemorySegment buf) {
        var caps = getCapabilities();
        try {
            check(caps.glDebugMessageInsert).invokeExact(source, type, id, severity, length, buf);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void debugMessageInsert(SegmentAllocator allocator, int source, int type, int id, int severity, String buf) {
        debugMessageInsert(source, type, id, severity, -1, allocator.allocateUtf8String(buf));
    }

    public static void dispatchCompute(int numGroupsX, int numGroupsY, int numGroupsZ) {
        var caps = getCapabilities();
        try {
            check(caps.glDispatchCompute).invokeExact(numGroupsX, numGroupsY, numGroupsZ);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void dispatchComputeIndirect(long indirect) {
        var caps = getCapabilities();
        try {
            check(caps.glDispatchComputeIndirect).invokeExact(indirect);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void framebufferParameteri(int target, int pname, int param) {
        var caps = getCapabilities();
        try {
            check(caps.glFramebufferParameteri).invokeExact(target, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getDebugMessageLog(int count, int bufSize, MemorySegment sources, MemorySegment types, MemorySegment ids, MemorySegment severities, MemorySegment lengths, MemorySegment messageLog) {
        var caps = getCapabilities();
        try {
            return (int) check(caps.glGetDebugMessageLog).invokeExact(count, bufSize, sources, types, ids, severities, lengths, messageLog);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getDebugMessageLog(int count, MemorySegment sources, MemorySegment types, MemorySegment ids, MemorySegment severities, MemorySegment lengths, MemorySegment messageLog) {
        return getDebugMessageLog(count, (int) messageLog.byteSize(), sources, types, ids, severities, lengths, messageLog);
    }

    public static int getDebugMessageLog(SegmentAllocator allocator, int count, int bufSize, int[] sources, int[] types, int[] ids, int[] severities, int[] lengths, String[] messageLog) {
        var pSrc = allocator.allocateArray(JAVA_INT, sources.length);
        var pTypes = allocator.allocateArray(JAVA_INT, types.length);
        var pIds = allocator.allocateArray(JAVA_INT, ids.length);
        var pSvr = allocator.allocateArray(JAVA_INT, severities.length);
        var pLen = allocator.allocateArray(JAVA_INT, lengths.length);
        var pLog = allocator.allocateArray(JAVA_BYTE, bufSize);
        int num = getDebugMessageLog(count, bufSize, pSrc, pTypes, pIds, pSvr, pLen, pLog);
        RuntimeHelper.toArray(pSrc, sources);
        RuntimeHelper.toArray(pTypes, types);
        RuntimeHelper.toArray(pIds, ids);
        RuntimeHelper.toArray(pSvr, severities);
        RuntimeHelper.toArray(pLen, lengths);
        messageLog[0] = pLog.getUtf8String(0);
        return num;
    }

    public static void getFramebufferParameteriv(int target, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetFramebufferParameteriv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getFramebufferParameteri(int target, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getFramebufferParameteriv(target, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getInternalformati64v(int target, int internalFormat, int pname, int count, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetInternalformati64v).invokeExact(target, internalFormat, pname, count, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getInternalformati64v(SegmentAllocator allocator, int target, int internalFormat, int pname, long[] params) {
        var seg = allocator.allocateArray(JAVA_LONG, params.length);
        getInternalformati64v(target, internalFormat, pname, params.length, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static long getInternalformati64(int target, int internalFormat, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_LONG);
            getInternalformati64v(target, internalFormat, pname, 1, seg);
            return seg.get(JAVA_LONG, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getObjectLabel(int identifier, int name, int bufSize, MemorySegment length, MemorySegment label) {
        var caps = getCapabilities();
        try {
            check(caps.glGetObjectLabel).invokeExact(identifier, name, bufSize, length, label);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getObjectLabel(int identifier, int name, MemorySegment length, MemorySegment label) {
        getObjectLabel(identifier, name, (int) label.byteSize(), length, label);
    }

    public static String getObjectLabel(SegmentAllocator allocator, int identifier, int name, int bufSize, int @Nullable [] length) {
        var seg = allocator.allocateArray(JAVA_BYTE, bufSize);
        var pLen = length != null ? allocator.allocate(JAVA_INT) : MemorySegment.NULL;
        getObjectLabel(identifier, name, bufSize, seg, pLen);
        if (length != null && length.length > 0) {
            length[0] = pLen.get(JAVA_INT, 0);
        }
        return seg.getUtf8String(0);
    }

    public static String getObjectLabel(SegmentAllocator allocator, int identifier, int name, int @Nullable [] length) {
        return getObjectLabel(allocator, identifier, name, 1024, length);
    }

    public static void getObjectPtrLabel(MemorySegment ptr, int bufSize, MemorySegment length, MemorySegment label) {
        var caps = getCapabilities();
        try {
            check(caps.glGetObjectPtrLabel).invokeExact(ptr, bufSize, length, label);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getObjectPtrLabel(MemorySegment ptr, MemorySegment length, MemorySegment label) {
        getObjectPtrLabel(ptr, (int) label.byteSize(), length, label);
    }

    public static String getObjectPtrLabel(SegmentAllocator allocator, MemorySegment ptr, int bufSize, int @Nullable [] length) {
        var seg = allocator.allocateArray(JAVA_BYTE, bufSize);
        var pLen = length != null ? allocator.allocate(JAVA_INT) : MemorySegment.NULL;
        getObjectPtrLabel(ptr, bufSize, seg, pLen);
        if (length != null && length.length > 0) {
            length[0] = pLen.get(JAVA_INT, 0);
        }
        return seg.getUtf8String(0);
    }

    public static String getObjectPtrLabel(SegmentAllocator allocator, MemorySegment ptr, int @Nullable [] length) {
        return getObjectPtrLabel(allocator, ptr, 1024, length);
    }

    public static void getProgramInterfaceiv(int program, int programInterface, int pname, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetProgramInterfaceiv).invokeExact(program, programInterface, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getProgramInterfacei(int program, int programInterface, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getProgramInterfaceiv(program, programInterface, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static int getProgramResourceIndex(int program, int programInterface, MemorySegment name) {
        var caps = getCapabilities();
        try {
            return (int) check(caps.glGetProgramResourceIndex).invokeExact(program, programInterface, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getProgramResourceIndex(SegmentAllocator allocator, int program, int programInterface, String name) {
        return getProgramResourceIndex(program, programInterface, allocator.allocateUtf8String(name));
    }

    public static int getProgramResourceLocation(int program, int programInterface, MemorySegment name) {
        var caps = getCapabilities();
        try {
            return (int) check(caps.glGetProgramResourceLocation).invokeExact(program, programInterface, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getProgramResourceLocation(SegmentAllocator allocator, int program, int programInterface, String name) {
        return getProgramResourceLocation(program, programInterface, allocator.allocateUtf8String(name));
    }

    public static int getProgramResourceLocationIndex(int program, int programInterface, MemorySegment name) {
        var caps = getCapabilities();
        try {
            return (int) check(caps.glGetProgramResourceLocationIndex).invokeExact(program, programInterface, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getProgramResourceLocationIndex(SegmentAllocator allocator, int program, int programInterface, String name) {
        return getProgramResourceLocationIndex(program, programInterface, allocator.allocateUtf8String(name));
    }

    public static void getProgramResourceName(int program, int programInterface, int index, int bufSize, MemorySegment length, MemorySegment name) {
        var caps = getCapabilities();
        try {
            check(caps.glGetProgramResourceName).invokeExact(program, programInterface, index, bufSize, length, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getProgramResourceName(int program, int programInterface, int index, MemorySegment length, MemorySegment name) {
        getProgramResourceName(program, programInterface, index, (int) name.byteSize(), length, name);
    }

    public static String getProgramResourceName(SegmentAllocator allocator, int program, int programInterface, int index, int bufSize, int @Nullable [] length) {
        var seg = allocator.allocateArray(JAVA_BYTE, bufSize);
        var pLen = length != null ? allocator.allocate(JAVA_INT) : MemorySegment.NULL;
        getProgramResourceName(program, programInterface, index, bufSize, pLen, seg);
        if (length != null && length.length > 0) {
            length[0] = pLen.get(JAVA_INT, 0);
        }
        return seg.getUtf8String(0);
    }

    public static String getProgramResourceName(SegmentAllocator allocator, int program, int programInterface, int index, int @Nullable [] length) {
        return getProgramResourceName(allocator, program, programInterface, index, 1024, length);
    }

    public static void getProgramResourceiv(int program, int programInterface, int index, int propCount, MemorySegment props, int count, MemorySegment length, MemorySegment params) {
        var caps = getCapabilities();
        try {
            check(caps.glGetProgramResourceiv).invokeExact(program, programInterface, index, propCount, props, count, length, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getProgramResourceiv(int program, int programInterface, int index, MemorySegment props, MemorySegment length, MemorySegment params) {
        getProgramResourceiv(program, programInterface, index, (int) (props.byteSize() >> 2), props, (int) params.byteSize(), length, params);
    }

    public static void getProgramResourceiv(SegmentAllocator allocator, int program, int programInterface, int index, int[] props, int @Nullable [] length, int[] params) {
        var seg = allocator.allocateArray(JAVA_INT, params.length);
        var pLen = length != null ? allocator.allocate(JAVA_INT) : MemorySegment.NULL;
        getProgramResourceiv(program, programInterface, index, props.length, allocator.allocateArray(JAVA_INT, props), params.length, pLen, seg);
        if (length != null && length.length > 0) {
            length[0] = pLen.get(JAVA_INT, 0);
        }
        RuntimeHelper.toArray(seg, params);
    }

    public static int getProgramResourceiv(SegmentAllocator allocator, int program, int programInterface, int index, int[] props) {
        var seg = allocator.allocate(JAVA_INT);
        getProgramResourceiv(program, programInterface, index, props.length, allocator.allocateArray(JAVA_INT, props), 1, MemorySegment.NULL, seg);
        return seg.get(JAVA_INT, 0);
    }

    public static void invalidateBufferData(int buffer) {
        var caps = getCapabilities();
        try {
            check(caps.glInvalidateBufferData).invokeExact(buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void invalidateBufferSubData(int buffer, long offset, long length) {
        var caps = getCapabilities();
        try {
            check(caps.glInvalidateBufferSubData).invokeExact(buffer, offset, length);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void invalidateFramebuffer(int target, int numAttachments, MemorySegment attachments) {
        var caps = getCapabilities();
        try {
            check(caps.glInvalidateFramebuffer).invokeExact(target, numAttachments, attachments);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void invalidateFramebuffer(SegmentAllocator allocator, int target, int[] attachments) {
        invalidateFramebuffer(target, attachments.length, allocator.allocateArray(JAVA_INT, attachments));
    }

    public static void invalidateFramebuffer(int target, int attachment) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            invalidateFramebuffer(target, 1, stack.ints(attachment));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void invalidateSubFramebuffer(int target, int numAttachments, MemorySegment attachments, int x, int y, int width, int height) {
        var caps = getCapabilities();
        try {
            check(caps.glInvalidateSubFramebuffer).invokeExact(target, numAttachments, attachments, x, y, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void invalidateSubFramebuffer(SegmentAllocator allocator, int target, int[] attachments, int x, int y, int width, int height) {
        invalidateSubFramebuffer(target, attachments.length, allocator.allocateArray(JAVA_INT, attachments), x, y, width, height);
    }

    public static void invalidateSubFramebuffer(int target, int attachment, int x, int y, int width, int height) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            invalidateSubFramebuffer(target, 1, stack.ints(attachment), x, y, width, height);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void invalidateTexImage(int texture, int level) {
        var caps = getCapabilities();
        try {
            check(caps.glInvalidateTexImage).invokeExact(texture, level);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void invalidateTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth) {
        var caps = getCapabilities();
        try {
            check(caps.glInvalidateTexSubImage).invokeExact(texture, level, xoffset, yoffset, zoffset, width, height, depth);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiDrawArraysIndirect(int mode, MemorySegment indirect, int drawCount, int stride) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiDrawArraysIndirect).invokeExact(mode, indirect, drawCount, stride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiDrawArraysIndirect(int mode, DrawArraysIndirectCommand.Buffer indirect, int drawCount, int stride) {
        multiDrawArraysIndirect(mode, indirect.address(), drawCount, stride);
    }

    public static void multiDrawElementsIndirect(int mode, int type, MemorySegment indirect, int drawCount, int stride) {
        var caps = getCapabilities();
        try {
            check(caps.glMultiDrawElementsIndirect).invokeExact(mode, type, indirect, drawCount, stride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiDrawElementsIndirect(int mode, int type, DrawElementsIndirectCommand.Buffer indirect, int drawCount, int stride) {
        multiDrawElementsIndirect(mode, type, indirect.address(), drawCount, stride);
    }

    public static void objectLabel(int identifier, int name, int length, MemorySegment label) {
        var caps = getCapabilities();
        try {
            check(caps.glObjectLabel).invokeExact(identifier, name, length, label);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void objectLabel(SegmentAllocator allocator, int identifier, int name, String label) {
        objectLabel(identifier, name, -1, allocator.allocateUtf8String(label));
    }

    public static void objectPtrLabel(MemorySegment ptr, int length, MemorySegment label) {
        var caps = getCapabilities();
        try {
            check(caps.glObjectPtrLabel).invokeExact(ptr, length, label);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void objectPtrLabel(SegmentAllocator allocator, MemorySegment ptr, String label) {
        objectPtrLabel(ptr, -1, allocator.allocateUtf8String(label));
    }

    public static void popDebugGroup() {
        var caps = getCapabilities();
        try {
            check(caps.glPopDebugGroup).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pushDebugGroup(int source, int id, int length, MemorySegment message) {
        var caps = getCapabilities();
        try {
            check(caps.glPushDebugGroup).invokeExact(source, id, length, message);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pushDebugGroup(SegmentAllocator allocator, int source, int id, String message) {
        pushDebugGroup(source, id, -1, allocator.allocateUtf8String(message));
    }

    public static void shaderStorageBlockBinding(int program, int storageBlockIndex, int storageBlockBinding) {
        var caps = getCapabilities();
        try {
            check(caps.glShaderStorageBlockBinding).invokeExact(program, storageBlockIndex, storageBlockBinding);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texBufferRange(int target, int internalFormat, int buffer, long offset, long size) {
        var caps = getCapabilities();
        try {
            check(caps.glTexBufferRange).invokeExact(target, internalFormat, buffer, offset, size);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texStorage2DMultisample(int target, int samples, int internalFormat, int width, int height, boolean fixedSampleLocations) {
        var caps = getCapabilities();
        try {
            check(caps.glTexStorage2DMultisample).invokeExact(target, samples, internalFormat, width, height, fixedSampleLocations);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texStorage3DMultisample(int target, int samples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations) {
        var caps = getCapabilities();
        try {
            check(caps.glTexStorage3DMultisample).invokeExact(target, samples, internalFormat, width, height, depth, fixedSampleLocations);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureView(int texture, int target, int origTexture, int internalFormat, int minLevel, int numLevels, int minLayer, int numLayers) {
        var caps = getCapabilities();
        try {
            check(caps.glTextureView).invokeExact(texture, target, origTexture, internalFormat, minLevel, numLevels, minLayer, numLayers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribBinding(int attribIndex, int bindingIndex) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribBinding).invokeExact(attribIndex, bindingIndex);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribFormat(int attribIndex, int size, int type, boolean normalized, int relativeOffset) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribFormat).invokeExact(attribIndex, size, type, normalized, relativeOffset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribIFormat(int attribIndex, int size, int type, int relativeOffset) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribIFormat).invokeExact(attribIndex, size, type, relativeOffset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribLFormat(int attribIndex, int size, int type, int relativeOffset) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexAttribLFormat).invokeExact(attribIndex, size, type, relativeOffset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexBindingDivisor(int bindingIndex, int divisor) {
        var caps = getCapabilities();
        try {
            check(caps.glVertexBindingDivisor).invokeExact(bindingIndex, divisor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}

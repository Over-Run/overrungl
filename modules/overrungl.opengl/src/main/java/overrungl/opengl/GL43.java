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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public class GL43 extends GL42 {
    public static final int GL_NUM_SHADING_LANGUAGE_VERSIONS = 0x82E9;
    public static final int GL_VERTEX_ATTRIB_ARRAY_LONG = 0x874E;
    public static final int GL_COMPRESSED_RGB8_ETC2 = 0x9274;
    public static final int GL_COMPRESSED_SRGB8_ETC2 = 0x9275;
    public static final int GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9276;
    public static final int GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9277;
    public static final int GL_COMPRESSED_RGBA8_ETC2_EAC = 0x9278;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC = 0x9279;
    public static final int GL_COMPRESSED_R11_EAC = 0x9270;
    public static final int GL_COMPRESSED_SIGNED_R11_EAC = 0x9271;
    public static final int GL_COMPRESSED_RG11_EAC = 0x9272;
    public static final int GL_COMPRESSED_SIGNED_RG11_EAC = 0x9273;
    public static final int GL_PRIMITIVE_RESTART_FIXED_INDEX = 0x8D69;
    public static final int GL_ANY_SAMPLES_PASSED_CONSERVATIVE = 0x8D6A;
    public static final int GL_MAX_ELEMENT_INDEX = 0x8D6B;
    public static final int GL_COMPUTE_SHADER = 0x91B9;
    public static final int GL_MAX_COMPUTE_UNIFORM_BLOCKS = 0x91BB;
    public static final int GL_MAX_COMPUTE_TEXTURE_IMAGE_UNITS = 0x91BC;
    public static final int GL_MAX_COMPUTE_IMAGE_UNIFORMS = 0x91BD;
    public static final int GL_MAX_COMPUTE_SHARED_MEMORY_SIZE = 0x8262;
    public static final int GL_MAX_COMPUTE_UNIFORM_COMPONENTS = 0x8263;
    public static final int GL_MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS = 0x8264;
    public static final int GL_MAX_COMPUTE_ATOMIC_COUNTERS = 0x8265;
    public static final int GL_MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS = 0x8266;
    public static final int GL_MAX_COMPUTE_WORK_GROUP_INVOCATIONS = 0x90EB;
    public static final int GL_MAX_COMPUTE_WORK_GROUP_COUNT = 0x91BE;
    public static final int GL_MAX_COMPUTE_WORK_GROUP_SIZE = 0x91BF;
    public static final int GL_COMPUTE_WORK_GROUP_SIZE = 0x8267;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_COMPUTE_SHADER = 0x90EC;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_COMPUTE_SHADER = 0x90ED;
    public static final int GL_DISPATCH_INDIRECT_BUFFER = 0x90EE;
    public static final int GL_DISPATCH_INDIRECT_BUFFER_BINDING = 0x90EF;
    public static final int GL_COMPUTE_SHADER_BIT = 0x00000020;
    public static final int GL_DEBUG_OUTPUT_SYNCHRONOUS = 0x8242;
    public static final int GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH = 0x8243;
    public static final int GL_DEBUG_CALLBACK_FUNCTION = 0x8244;
    public static final int GL_DEBUG_CALLBACK_USER_PARAM = 0x8245;
    public static final int GL_DEBUG_SOURCE_API = 0x8246;
    public static final int GL_DEBUG_SOURCE_WINDOW_SYSTEM = 0x8247;
    public static final int GL_DEBUG_SOURCE_SHADER_COMPILER = 0x8248;
    public static final int GL_DEBUG_SOURCE_THIRD_PARTY = 0x8249;
    public static final int GL_DEBUG_SOURCE_APPLICATION = 0x824A;
    public static final int GL_DEBUG_SOURCE_OTHER = 0x824B;
    public static final int GL_DEBUG_TYPE_ERROR = 0x824C;
    public static final int GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR = 0x824D;
    public static final int GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR = 0x824E;
    public static final int GL_DEBUG_TYPE_PORTABILITY = 0x824F;
    public static final int GL_DEBUG_TYPE_PERFORMANCE = 0x8250;
    public static final int GL_DEBUG_TYPE_OTHER = 0x8251;
    public static final int GL_MAX_DEBUG_MESSAGE_LENGTH = 0x9143;
    public static final int GL_MAX_DEBUG_LOGGED_MESSAGES = 0x9144;
    public static final int GL_DEBUG_LOGGED_MESSAGES = 0x9145;
    public static final int GL_DEBUG_SEVERITY_HIGH = 0x9146;
    public static final int GL_DEBUG_SEVERITY_MEDIUM = 0x9147;
    public static final int GL_DEBUG_SEVERITY_LOW = 0x9148;
    public static final int GL_DEBUG_TYPE_MARKER = 0x8268;
    public static final int GL_DEBUG_TYPE_PUSH_GROUP = 0x8269;
    public static final int GL_DEBUG_TYPE_POP_GROUP = 0x826A;
    public static final int GL_DEBUG_SEVERITY_NOTIFICATION = 0x826B;
    public static final int GL_MAX_DEBUG_GROUP_STACK_DEPTH = 0x826C;
    public static final int GL_DEBUG_GROUP_STACK_DEPTH = 0x826D;
    public static final int GL_BUFFER = 0x82E0;
    public static final int GL_SHADER = 0x82E1;
    public static final int GL_PROGRAM = 0x82E2;
    public static final int GL_VERTEX_ARRAY = 0x8074;
    public static final int GL_QUERY = 0x82E3;
    public static final int GL_PROGRAM_PIPELINE = 0x82E4;
    public static final int GL_SAMPLER = 0x82E6;
    public static final int GL_MAX_LABEL_LENGTH = 0x82E8;
    public static final int GL_DEBUG_OUTPUT = 0x92E0;
    public static final int GL_CONTEXT_FLAG_DEBUG_BIT = 0x00000002;
    public static final int GL_MAX_UNIFORM_LOCATIONS = 0x826E;
    public static final int GL_FRAMEBUFFER_DEFAULT_WIDTH = 0x9310;
    public static final int GL_FRAMEBUFFER_DEFAULT_HEIGHT = 0x9311;
    public static final int GL_FRAMEBUFFER_DEFAULT_LAYERS = 0x9312;
    public static final int GL_FRAMEBUFFER_DEFAULT_SAMPLES = 0x9313;
    public static final int GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS = 0x9314;
    public static final int GL_MAX_FRAMEBUFFER_WIDTH = 0x9315;
    public static final int GL_MAX_FRAMEBUFFER_HEIGHT = 0x9316;
    public static final int GL_MAX_FRAMEBUFFER_LAYERS = 0x9317;
    public static final int GL_MAX_FRAMEBUFFER_SAMPLES = 0x9318;
    public static final int GL_INTERNALFORMAT_SUPPORTED = 0x826F;
    public static final int GL_INTERNALFORMAT_PREFERRED = 0x8270;
    public static final int GL_INTERNALFORMAT_RED_SIZE = 0x8271;
    public static final int GL_INTERNALFORMAT_GREEN_SIZE = 0x8272;
    public static final int GL_INTERNALFORMAT_BLUE_SIZE = 0x8273;
    public static final int GL_INTERNALFORMAT_ALPHA_SIZE = 0x8274;
    public static final int GL_INTERNALFORMAT_DEPTH_SIZE = 0x8275;
    public static final int GL_INTERNALFORMAT_STENCIL_SIZE = 0x8276;
    public static final int GL_INTERNALFORMAT_SHARED_SIZE = 0x8277;
    public static final int GL_INTERNALFORMAT_RED_TYPE = 0x8278;
    public static final int GL_INTERNALFORMAT_GREEN_TYPE = 0x8279;
    public static final int GL_INTERNALFORMAT_BLUE_TYPE = 0x827A;
    public static final int GL_INTERNALFORMAT_ALPHA_TYPE = 0x827B;
    public static final int GL_INTERNALFORMAT_DEPTH_TYPE = 0x827C;
    public static final int GL_INTERNALFORMAT_STENCIL_TYPE = 0x827D;
    public static final int GL_MAX_WIDTH = 0x827E;
    public static final int GL_MAX_HEIGHT = 0x827F;
    public static final int GL_MAX_DEPTH = 0x8280;
    public static final int GL_MAX_LAYERS = 0x8281;
    public static final int GL_MAX_COMBINED_DIMENSIONS = 0x8282;
    public static final int GL_COLOR_COMPONENTS = 0x8283;
    public static final int GL_DEPTH_COMPONENTS = 0x8284;
    public static final int GL_STENCIL_COMPONENTS = 0x8285;
    public static final int GL_COLOR_RENDERABLE = 0x8286;
    public static final int GL_DEPTH_RENDERABLE = 0x8287;
    public static final int GL_STENCIL_RENDERABLE = 0x8288;
    public static final int GL_FRAMEBUFFER_RENDERABLE = 0x8289;
    public static final int GL_FRAMEBUFFER_RENDERABLE_LAYERED = 0x828A;
    public static final int GL_FRAMEBUFFER_BLEND = 0x828B;
    public static final int GL_READ_PIXELS = 0x828C;
    public static final int GL_READ_PIXELS_FORMAT = 0x828D;
    public static final int GL_READ_PIXELS_TYPE = 0x828E;
    public static final int GL_TEXTURE_IMAGE_FORMAT = 0x828F;
    public static final int GL_TEXTURE_IMAGE_TYPE = 0x8290;
    public static final int GL_GET_TEXTURE_IMAGE_FORMAT = 0x8291;
    public static final int GL_GET_TEXTURE_IMAGE_TYPE = 0x8292;
    public static final int GL_MIPMAP = 0x8293;
    public static final int GL_MANUAL_GENERATE_MIPMAP = 0x8294;
    public static final int GL_AUTO_GENERATE_MIPMAP = 0x8295;
    public static final int GL_COLOR_ENCODING = 0x8296;
    public static final int GL_SRGB_READ = 0x8297;
    public static final int GL_SRGB_WRITE = 0x8298;
    public static final int GL_FILTER = 0x829A;
    public static final int GL_VERTEX_TEXTURE = 0x829B;
    public static final int GL_TESS_CONTROL_TEXTURE = 0x829C;
    public static final int GL_TESS_EVALUATION_TEXTURE = 0x829D;
    public static final int GL_GEOMETRY_TEXTURE = 0x829E;
    public static final int GL_FRAGMENT_TEXTURE = 0x829F;
    public static final int GL_COMPUTE_TEXTURE = 0x82A0;
    public static final int GL_TEXTURE_SHADOW = 0x82A1;
    public static final int GL_TEXTURE_GATHER = 0x82A2;
    public static final int GL_TEXTURE_GATHER_SHADOW = 0x82A3;
    public static final int GL_SHADER_IMAGE_LOAD = 0x82A4;
    public static final int GL_SHADER_IMAGE_STORE = 0x82A5;
    public static final int GL_SHADER_IMAGE_ATOMIC = 0x82A6;
    public static final int GL_IMAGE_TEXEL_SIZE = 0x82A7;
    public static final int GL_IMAGE_COMPATIBILITY_CLASS = 0x82A8;
    public static final int GL_IMAGE_PIXEL_FORMAT = 0x82A9;
    public static final int GL_IMAGE_PIXEL_TYPE = 0x82AA;
    public static final int GL_SIMULTANEOUS_TEXTURE_AND_DEPTH_TEST = 0x82AC;
    public static final int GL_SIMULTANEOUS_TEXTURE_AND_STENCIL_TEST = 0x82AD;
    public static final int GL_SIMULTANEOUS_TEXTURE_AND_DEPTH_WRITE = 0x82AE;
    public static final int GL_SIMULTANEOUS_TEXTURE_AND_STENCIL_WRITE = 0x82AF;
    public static final int GL_TEXTURE_COMPRESSED_BLOCK_WIDTH = 0x82B1;
    public static final int GL_TEXTURE_COMPRESSED_BLOCK_HEIGHT = 0x82B2;
    public static final int GL_TEXTURE_COMPRESSED_BLOCK_SIZE = 0x82B3;
    public static final int GL_CLEAR_BUFFER = 0x82B4;
    public static final int GL_TEXTURE_VIEW = 0x82B5;
    public static final int GL_VIEW_COMPATIBILITY_CLASS = 0x82B6;
    public static final int GL_FULL_SUPPORT = 0x82B7;
    public static final int GL_CAVEAT_SUPPORT = 0x82B8;
    public static final int GL_IMAGE_CLASS_4_X_32 = 0x82B9;
    public static final int GL_IMAGE_CLASS_2_X_32 = 0x82BA;
    public static final int GL_IMAGE_CLASS_1_X_32 = 0x82BB;
    public static final int GL_IMAGE_CLASS_4_X_16 = 0x82BC;
    public static final int GL_IMAGE_CLASS_2_X_16 = 0x82BD;
    public static final int GL_IMAGE_CLASS_1_X_16 = 0x82BE;
    public static final int GL_IMAGE_CLASS_4_X_8 = 0x82BF;
    public static final int GL_IMAGE_CLASS_2_X_8 = 0x82C0;
    public static final int GL_IMAGE_CLASS_1_X_8 = 0x82C1;
    public static final int GL_IMAGE_CLASS_11_11_10 = 0x82C2;
    public static final int GL_IMAGE_CLASS_10_10_10_2 = 0x82C3;
    public static final int GL_VIEW_CLASS_128_BITS = 0x82C4;
    public static final int GL_VIEW_CLASS_96_BITS = 0x82C5;
    public static final int GL_VIEW_CLASS_64_BITS = 0x82C6;
    public static final int GL_VIEW_CLASS_48_BITS = 0x82C7;
    public static final int GL_VIEW_CLASS_32_BITS = 0x82C8;
    public static final int GL_VIEW_CLASS_24_BITS = 0x82C9;
    public static final int GL_VIEW_CLASS_16_BITS = 0x82CA;
    public static final int GL_VIEW_CLASS_8_BITS = 0x82CB;
    public static final int GL_VIEW_CLASS_S3TC_DXT1_RGB = 0x82CC;
    public static final int GL_VIEW_CLASS_S3TC_DXT1_RGBA = 0x82CD;
    public static final int GL_VIEW_CLASS_S3TC_DXT3_RGBA = 0x82CE;
    public static final int GL_VIEW_CLASS_S3TC_DXT5_RGBA = 0x82CF;
    public static final int GL_VIEW_CLASS_RGTC1_RED = 0x82D0;
    public static final int GL_VIEW_CLASS_RGTC2_RG = 0x82D1;
    public static final int GL_VIEW_CLASS_BPTC_UNORM = 0x82D2;
    public static final int GL_VIEW_CLASS_BPTC_FLOAT = 0x82D3;
    public static final int GL_UNIFORM = 0x92E1;
    public static final int GL_UNIFORM_BLOCK = 0x92E2;
    public static final int GL_PROGRAM_INPUT = 0x92E3;
    public static final int GL_PROGRAM_OUTPUT = 0x92E4;
    public static final int GL_BUFFER_VARIABLE = 0x92E5;
    public static final int GL_SHADER_STORAGE_BLOCK = 0x92E6;
    public static final int GL_VERTEX_SUBROUTINE = 0x92E8;
    public static final int GL_TESS_CONTROL_SUBROUTINE = 0x92E9;
    public static final int GL_TESS_EVALUATION_SUBROUTINE = 0x92EA;
    public static final int GL_GEOMETRY_SUBROUTINE = 0x92EB;
    public static final int GL_FRAGMENT_SUBROUTINE = 0x92EC;
    public static final int GL_COMPUTE_SUBROUTINE = 0x92ED;
    public static final int GL_VERTEX_SUBROUTINE_UNIFORM = 0x92EE;
    public static final int GL_TESS_CONTROL_SUBROUTINE_UNIFORM = 0x92EF;
    public static final int GL_TESS_EVALUATION_SUBROUTINE_UNIFORM = 0x92F0;
    public static final int GL_GEOMETRY_SUBROUTINE_UNIFORM = 0x92F1;
    public static final int GL_FRAGMENT_SUBROUTINE_UNIFORM = 0x92F2;
    public static final int GL_COMPUTE_SUBROUTINE_UNIFORM = 0x92F3;
    public static final int GL_TRANSFORM_FEEDBACK_VARYING = 0x92F4;
    public static final int GL_ACTIVE_RESOURCES = 0x92F5;
    public static final int GL_MAX_NAME_LENGTH = 0x92F6;
    public static final int GL_MAX_NUM_ACTIVE_VARIABLES = 0x92F7;
    public static final int GL_MAX_NUM_COMPATIBLE_SUBROUTINES = 0x92F8;
    public static final int GL_NAME_LENGTH = 0x92F9;
    public static final int GL_TYPE = 0x92FA;
    public static final int GL_ARRAY_SIZE = 0x92FB;
    public static final int GL_OFFSET = 0x92FC;
    public static final int GL_BLOCK_INDEX = 0x92FD;
    public static final int GL_ARRAY_STRIDE = 0x92FE;
    public static final int GL_MATRIX_STRIDE = 0x92FF;
    public static final int GL_IS_ROW_MAJOR = 0x9300;
    public static final int GL_ATOMIC_COUNTER_BUFFER_INDEX = 0x9301;
    public static final int GL_BUFFER_BINDING = 0x9302;
    public static final int GL_BUFFER_DATA_SIZE = 0x9303;
    public static final int GL_NUM_ACTIVE_VARIABLES = 0x9304;
    public static final int GL_ACTIVE_VARIABLES = 0x9305;
    public static final int GL_REFERENCED_BY_VERTEX_SHADER = 0x9306;
    public static final int GL_REFERENCED_BY_TESS_CONTROL_SHADER = 0x9307;
    public static final int GL_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x9308;
    public static final int GL_REFERENCED_BY_GEOMETRY_SHADER = 0x9309;
    public static final int GL_REFERENCED_BY_FRAGMENT_SHADER = 0x930A;
    public static final int GL_REFERENCED_BY_COMPUTE_SHADER = 0x930B;
    public static final int GL_TOP_LEVEL_ARRAY_SIZE = 0x930C;
    public static final int GL_TOP_LEVEL_ARRAY_STRIDE = 0x930D;
    public static final int GL_LOCATION = 0x930E;
    public static final int GL_LOCATION_INDEX = 0x930F;
    public static final int GL_IS_PER_PATCH = 0x92E7;
    public static final int GL_SHADER_STORAGE_BUFFER = 0x90D2;
    public static final int GL_SHADER_STORAGE_BUFFER_BINDING = 0x90D3;
    public static final int GL_SHADER_STORAGE_BUFFER_START = 0x90D4;
    public static final int GL_SHADER_STORAGE_BUFFER_SIZE = 0x90D5;
    public static final int GL_MAX_VERTEX_SHADER_STORAGE_BLOCKS = 0x90D6;
    public static final int GL_MAX_GEOMETRY_SHADER_STORAGE_BLOCKS = 0x90D7;
    public static final int GL_MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS = 0x90D8;
    public static final int GL_MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS = 0x90D9;
    public static final int GL_MAX_FRAGMENT_SHADER_STORAGE_BLOCKS = 0x90DA;
    public static final int GL_MAX_COMPUTE_SHADER_STORAGE_BLOCKS = 0x90DB;
    public static final int GL_MAX_COMBINED_SHADER_STORAGE_BLOCKS = 0x90DC;
    public static final int GL_MAX_SHADER_STORAGE_BUFFER_BINDINGS = 0x90DD;
    public static final int GL_MAX_SHADER_STORAGE_BLOCK_SIZE = 0x90DE;
    public static final int GL_SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT = 0x90DF;
    public static final int GL_SHADER_STORAGE_BARRIER_BIT = 0x00002000;
    public static final int GL_MAX_COMBINED_SHADER_OUTPUT_RESOURCES = 0x8F39;
    public static final int GL_DEPTH_STENCIL_TEXTURE_MODE = 0x90EA;
    public static final int GL_TEXTURE_BUFFER_OFFSET = 0x919D;
    public static final int GL_TEXTURE_BUFFER_SIZE = 0x919E;
    public static final int GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT = 0x919F;
    public static final int GL_TEXTURE_VIEW_MIN_LEVEL = 0x82DB;
    public static final int GL_TEXTURE_VIEW_NUM_LEVELS = 0x82DC;
    public static final int GL_TEXTURE_VIEW_MIN_LAYER = 0x82DD;
    public static final int GL_TEXTURE_VIEW_NUM_LAYERS = 0x82DE;
    public static final int GL_TEXTURE_IMMUTABLE_LEVELS = 0x82DF;
    public static final int GL_VERTEX_ATTRIB_BINDING = 0x82D4;
    public static final int GL_VERTEX_ATTRIB_RELATIVE_OFFSET = 0x82D5;
    public static final int GL_VERTEX_BINDING_DIVISOR = 0x82D6;
    public static final int GL_VERTEX_BINDING_OFFSET = 0x82D7;
    public static final int GL_VERTEX_BINDING_STRIDE = 0x82D8;
    public static final int GL_MAX_VERTEX_ATTRIB_RELATIVE_OFFSET = 0x82D9;
    public static final int GL_MAX_VERTEX_ATTRIB_BINDINGS = 0x82DA;
    public static final int GL_VERTEX_BINDING_BUFFER = 0x8F4F;
    public static final int GL_STACK_UNDERFLOW = 0x0504;
    public static final int GL_STACK_OVERFLOW = 0x0503;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glClearBufferData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glClearBufferSubData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDispatchCompute = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDispatchComputeIndirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glCopyImageSubData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFramebufferParameteri = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetFramebufferParameteriv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetInternalformati64v = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glInvalidateTexSubImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glInvalidateTexImage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glInvalidateBufferSubData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glInvalidateBufferData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glInvalidateFramebuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glInvalidateSubFramebuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiDrawArraysIndirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiDrawElementsIndirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetProgramInterfaceiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramResourceIndex = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramResourceName = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramResourceiv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramResourceLocation = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetProgramResourceLocationIndex = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glShaderStorageBlockBinding = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTexBufferRange = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glTexStorage2DMultisample = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glTexStorage3DMultisample = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glTextureView = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBindVertexBuffer = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribFormat = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribIFormat = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribLFormat = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribBinding = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexBindingDivisor = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDebugMessageControl = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glDebugMessageInsert = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDebugMessageCallback = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetDebugMessageLog = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPushDebugGroup = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glPopDebugGroup = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
        public static final MethodHandle MH_glObjectLabel = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetObjectLabel = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glObjectPtrLabel = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetObjectPtrLabel = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPointerv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glClearBufferData;
        public final MemorySegment PFN_glClearBufferSubData;
        public final MemorySegment PFN_glDispatchCompute;
        public final MemorySegment PFN_glDispatchComputeIndirect;
        public final MemorySegment PFN_glCopyImageSubData;
        public final MemorySegment PFN_glFramebufferParameteri;
        public final MemorySegment PFN_glGetFramebufferParameteriv;
        public final MemorySegment PFN_glGetInternalformati64v;
        public final MemorySegment PFN_glInvalidateTexSubImage;
        public final MemorySegment PFN_glInvalidateTexImage;
        public final MemorySegment PFN_glInvalidateBufferSubData;
        public final MemorySegment PFN_glInvalidateBufferData;
        public final MemorySegment PFN_glInvalidateFramebuffer;
        public final MemorySegment PFN_glInvalidateSubFramebuffer;
        public final MemorySegment PFN_glMultiDrawArraysIndirect;
        public final MemorySegment PFN_glMultiDrawElementsIndirect;
        public final MemorySegment PFN_glGetProgramInterfaceiv;
        public final MemorySegment PFN_glGetProgramResourceIndex;
        public final MemorySegment PFN_glGetProgramResourceName;
        public final MemorySegment PFN_glGetProgramResourceiv;
        public final MemorySegment PFN_glGetProgramResourceLocation;
        public final MemorySegment PFN_glGetProgramResourceLocationIndex;
        public final MemorySegment PFN_glShaderStorageBlockBinding;
        public final MemorySegment PFN_glTexBufferRange;
        public final MemorySegment PFN_glTexStorage2DMultisample;
        public final MemorySegment PFN_glTexStorage3DMultisample;
        public final MemorySegment PFN_glTextureView;
        public final MemorySegment PFN_glBindVertexBuffer;
        public final MemorySegment PFN_glVertexAttribFormat;
        public final MemorySegment PFN_glVertexAttribIFormat;
        public final MemorySegment PFN_glVertexAttribLFormat;
        public final MemorySegment PFN_glVertexAttribBinding;
        public final MemorySegment PFN_glVertexBindingDivisor;
        public final MemorySegment PFN_glDebugMessageControl;
        public final MemorySegment PFN_glDebugMessageInsert;
        public final MemorySegment PFN_glDebugMessageCallback;
        public final MemorySegment PFN_glGetDebugMessageLog;
        public final MemorySegment PFN_glPushDebugGroup;
        public final MemorySegment PFN_glPopDebugGroup;
        public final MemorySegment PFN_glObjectLabel;
        public final MemorySegment PFN_glGetObjectLabel;
        public final MemorySegment PFN_glObjectPtrLabel;
        public final MemorySegment PFN_glGetObjectPtrLabel;
        public final MemorySegment PFN_glGetPointerv;
        private Handles(GLLoadFunc func) {
            PFN_glClearBufferData = func.invoke("glClearBufferData");
            PFN_glClearBufferSubData = func.invoke("glClearBufferSubData");
            PFN_glDispatchCompute = func.invoke("glDispatchCompute");
            PFN_glDispatchComputeIndirect = func.invoke("glDispatchComputeIndirect");
            PFN_glCopyImageSubData = func.invoke("glCopyImageSubData", "glCopyImageSubDataEXT", "glCopyImageSubDataOES");
            PFN_glFramebufferParameteri = func.invoke("glFramebufferParameteri");
            PFN_glGetFramebufferParameteriv = func.invoke("glGetFramebufferParameteriv");
            PFN_glGetInternalformati64v = func.invoke("glGetInternalformati64v");
            PFN_glInvalidateTexSubImage = func.invoke("glInvalidateTexSubImage");
            PFN_glInvalidateTexImage = func.invoke("glInvalidateTexImage");
            PFN_glInvalidateBufferSubData = func.invoke("glInvalidateBufferSubData");
            PFN_glInvalidateBufferData = func.invoke("glInvalidateBufferData");
            PFN_glInvalidateFramebuffer = func.invoke("glInvalidateFramebuffer");
            PFN_glInvalidateSubFramebuffer = func.invoke("glInvalidateSubFramebuffer");
            PFN_glMultiDrawArraysIndirect = func.invoke("glMultiDrawArraysIndirect", "glMultiDrawArraysIndirectAMD", "glMultiDrawArraysIndirectEXT");
            PFN_glMultiDrawElementsIndirect = func.invoke("glMultiDrawElementsIndirect", "glMultiDrawElementsIndirectAMD", "glMultiDrawElementsIndirectEXT");
            PFN_glGetProgramInterfaceiv = func.invoke("glGetProgramInterfaceiv");
            PFN_glGetProgramResourceIndex = func.invoke("glGetProgramResourceIndex");
            PFN_glGetProgramResourceName = func.invoke("glGetProgramResourceName");
            PFN_glGetProgramResourceiv = func.invoke("glGetProgramResourceiv");
            PFN_glGetProgramResourceLocation = func.invoke("glGetProgramResourceLocation");
            PFN_glGetProgramResourceLocationIndex = func.invoke("glGetProgramResourceLocationIndex");
            PFN_glShaderStorageBlockBinding = func.invoke("glShaderStorageBlockBinding");
            PFN_glTexBufferRange = func.invoke("glTexBufferRange", "glTexBufferRangeEXT", "glTexBufferRangeOES");
            PFN_glTexStorage2DMultisample = func.invoke("glTexStorage2DMultisample");
            PFN_glTexStorage3DMultisample = func.invoke("glTexStorage3DMultisample", "glTexStorage3DMultisampleOES");
            PFN_glTextureView = func.invoke("glTextureView", "glTextureViewEXT", "glTextureViewOES");
            PFN_glBindVertexBuffer = func.invoke("glBindVertexBuffer");
            PFN_glVertexAttribFormat = func.invoke("glVertexAttribFormat");
            PFN_glVertexAttribIFormat = func.invoke("glVertexAttribIFormat");
            PFN_glVertexAttribLFormat = func.invoke("glVertexAttribLFormat");
            PFN_glVertexAttribBinding = func.invoke("glVertexAttribBinding");
            PFN_glVertexBindingDivisor = func.invoke("glVertexBindingDivisor");
            PFN_glDebugMessageControl = func.invoke("glDebugMessageControl", "glDebugMessageControlARB", "glDebugMessageControlKHR");
            PFN_glDebugMessageInsert = func.invoke("glDebugMessageInsert", "glDebugMessageInsertARB", "glDebugMessageInsertKHR");
            PFN_glDebugMessageCallback = func.invoke("glDebugMessageCallback", "glDebugMessageCallbackARB", "glDebugMessageCallbackKHR");
            PFN_glGetDebugMessageLog = func.invoke("glGetDebugMessageLog", "glGetDebugMessageLogARB", "glGetDebugMessageLogKHR");
            PFN_glPushDebugGroup = func.invoke("glPushDebugGroup", "glPushDebugGroupKHR");
            PFN_glPopDebugGroup = func.invoke("glPopDebugGroup", "glPopDebugGroupKHR");
            PFN_glObjectLabel = func.invoke("glObjectLabel", "glObjectLabelKHR");
            PFN_glGetObjectLabel = func.invoke("glGetObjectLabel", "glGetObjectLabelKHR");
            PFN_glObjectPtrLabel = func.invoke("glObjectPtrLabel", "glObjectPtrLabelKHR");
            PFN_glGetObjectPtrLabel = func.invoke("glGetObjectPtrLabel", "glGetObjectPtrLabelKHR");
            PFN_glGetPointerv = func.invoke("glGetPointerv", "glGetPointervEXT", "glGetPointervKHR");
        }
    }

    public GL43(GLLoadFunc func) {
        super(func);
        this.handles = new Handles(func);
    }

    /// ```
    /// void glClearBufferData((unsigned int) GLenum target, (unsigned int) GLenum internalformat, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* data);
    /// ```
    public void ClearBufferData(int target, int internalformat, int format, int type, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearBufferData)) throw new SymbolNotFoundError("Symbol not found: glClearBufferData");
        try { Handles.MH_glClearBufferData.invokeExact(handles.PFN_glClearBufferData, target, internalformat, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in ClearBufferData", e); }
    }

    /// ```
    /// void glClearBufferSubData((unsigned int) GLenum target, (unsigned int) GLenum internalformat, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* data);
    /// ```
    public void ClearBufferSubData(int target, int internalformat, long offset, long size, int format, int type, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearBufferSubData)) throw new SymbolNotFoundError("Symbol not found: glClearBufferSubData");
        try { Handles.MH_glClearBufferSubData.invokeExact(handles.PFN_glClearBufferSubData, target, internalformat, offset, size, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in ClearBufferSubData", e); }
    }

    /// ```
    /// void glDispatchCompute((unsigned int) GLuint num_groups_x, (unsigned int) GLuint num_groups_y, (unsigned int) GLuint num_groups_z);
    /// ```
    public void DispatchCompute(int num_groups_x, int num_groups_y, int num_groups_z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDispatchCompute)) throw new SymbolNotFoundError("Symbol not found: glDispatchCompute");
        try { Handles.MH_glDispatchCompute.invokeExact(handles.PFN_glDispatchCompute, num_groups_x, num_groups_y, num_groups_z); }
        catch (Throwable e) { throw new RuntimeException("error in DispatchCompute", e); }
    }

    /// ```
    /// void glDispatchComputeIndirect(((signed long long) khronos_intptr_t) GLintptr indirect);
    /// ```
    public void DispatchComputeIndirect(long indirect) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDispatchComputeIndirect)) throw new SymbolNotFoundError("Symbol not found: glDispatchComputeIndirect");
        try { Handles.MH_glDispatchComputeIndirect.invokeExact(handles.PFN_glDispatchComputeIndirect, indirect); }
        catch (Throwable e) { throw new RuntimeException("error in DispatchComputeIndirect", e); }
    }

    /// ```
    /// void glCopyImageSubData((unsigned int) GLuint srcName, (unsigned int) GLenum srcTarget, (int) GLint srcLevel, (int) GLint srcX, (int) GLint srcY, (int) GLint srcZ, (unsigned int) GLuint dstName, (unsigned int) GLenum dstTarget, (int) GLint dstLevel, (int) GLint dstX, (int) GLint dstY, (int) GLint dstZ, (int) GLsizei srcWidth, (int) GLsizei srcHeight, (int) GLsizei srcDepth);
    /// ```
    public void CopyImageSubData(int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyImageSubData)) throw new SymbolNotFoundError("Symbol not found: glCopyImageSubData");
        try { Handles.MH_glCopyImageSubData.invokeExact(handles.PFN_glCopyImageSubData, srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth); }
        catch (Throwable e) { throw new RuntimeException("error in CopyImageSubData", e); }
    }

    /// ```
    /// void glFramebufferParameteri((unsigned int) GLenum target, (unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void FramebufferParameteri(int target, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferParameteri)) throw new SymbolNotFoundError("Symbol not found: glFramebufferParameteri");
        try { Handles.MH_glFramebufferParameteri.invokeExact(handles.PFN_glFramebufferParameteri, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferParameteri", e); }
    }

    /// ```
    /// void glGetFramebufferParameteriv((unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetFramebufferParameteriv(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFramebufferParameteriv)) throw new SymbolNotFoundError("Symbol not found: glGetFramebufferParameteriv");
        try { Handles.MH_glGetFramebufferParameteriv.invokeExact(handles.PFN_glGetFramebufferParameteriv, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetFramebufferParameteriv", e); }
    }

    /// ```
    /// void glGetInternalformati64v((unsigned int) GLenum target, (unsigned int) GLenum internalformat, (unsigned int) GLenum pname, (int) GLsizei count, GLint64* params);
    /// ```
    public void GetInternalformati64v(int target, int internalformat, int pname, int count, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetInternalformati64v)) throw new SymbolNotFoundError("Symbol not found: glGetInternalformati64v");
        try { Handles.MH_glGetInternalformati64v.invokeExact(handles.PFN_glGetInternalformati64v, target, internalformat, pname, count, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetInternalformati64v", e); }
    }

    /// ```
    /// void glInvalidateTexSubImage((unsigned int) GLuint texture, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLint zoffset, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth);
    /// ```
    public void InvalidateTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth) {
        if (MemoryUtil.isNullPointer(handles.PFN_glInvalidateTexSubImage)) throw new SymbolNotFoundError("Symbol not found: glInvalidateTexSubImage");
        try { Handles.MH_glInvalidateTexSubImage.invokeExact(handles.PFN_glInvalidateTexSubImage, texture, level, xoffset, yoffset, zoffset, width, height, depth); }
        catch (Throwable e) { throw new RuntimeException("error in InvalidateTexSubImage", e); }
    }

    /// ```
    /// void glInvalidateTexImage((unsigned int) GLuint texture, (int) GLint level);
    /// ```
    public void InvalidateTexImage(int texture, int level) {
        if (MemoryUtil.isNullPointer(handles.PFN_glInvalidateTexImage)) throw new SymbolNotFoundError("Symbol not found: glInvalidateTexImage");
        try { Handles.MH_glInvalidateTexImage.invokeExact(handles.PFN_glInvalidateTexImage, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in InvalidateTexImage", e); }
    }

    /// ```
    /// void glInvalidateBufferSubData((unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr length);
    /// ```
    public void InvalidateBufferSubData(int buffer, long offset, long length) {
        if (MemoryUtil.isNullPointer(handles.PFN_glInvalidateBufferSubData)) throw new SymbolNotFoundError("Symbol not found: glInvalidateBufferSubData");
        try { Handles.MH_glInvalidateBufferSubData.invokeExact(handles.PFN_glInvalidateBufferSubData, buffer, offset, length); }
        catch (Throwable e) { throw new RuntimeException("error in InvalidateBufferSubData", e); }
    }

    /// ```
    /// void glInvalidateBufferData((unsigned int) GLuint buffer);
    /// ```
    public void InvalidateBufferData(int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glInvalidateBufferData)) throw new SymbolNotFoundError("Symbol not found: glInvalidateBufferData");
        try { Handles.MH_glInvalidateBufferData.invokeExact(handles.PFN_glInvalidateBufferData, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in InvalidateBufferData", e); }
    }

    /// ```
    /// void glInvalidateFramebuffer((unsigned int) GLenum target, (int) GLsizei numAttachments, const GLenum* attachments);
    /// ```
    public void InvalidateFramebuffer(int target, int numAttachments, MemorySegment attachments) {
        if (MemoryUtil.isNullPointer(handles.PFN_glInvalidateFramebuffer)) throw new SymbolNotFoundError("Symbol not found: glInvalidateFramebuffer");
        try { Handles.MH_glInvalidateFramebuffer.invokeExact(handles.PFN_glInvalidateFramebuffer, target, numAttachments, attachments); }
        catch (Throwable e) { throw new RuntimeException("error in InvalidateFramebuffer", e); }
    }

    /// ```
    /// void glInvalidateSubFramebuffer((unsigned int) GLenum target, (int) GLsizei numAttachments, const GLenum* attachments, (int) GLint x, (int) GLint y, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void InvalidateSubFramebuffer(int target, int numAttachments, MemorySegment attachments, int x, int y, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glInvalidateSubFramebuffer)) throw new SymbolNotFoundError("Symbol not found: glInvalidateSubFramebuffer");
        try { Handles.MH_glInvalidateSubFramebuffer.invokeExact(handles.PFN_glInvalidateSubFramebuffer, target, numAttachments, attachments, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in InvalidateSubFramebuffer", e); }
    }

    /// ```
    /// void glMultiDrawArraysIndirect((unsigned int) GLenum mode, const void* indirect, (int) GLsizei drawcount, (int) GLsizei stride);
    /// ```
    public void MultiDrawArraysIndirect(int mode, MemorySegment indirect, int drawcount, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawArraysIndirect)) throw new SymbolNotFoundError("Symbol not found: glMultiDrawArraysIndirect");
        try { Handles.MH_glMultiDrawArraysIndirect.invokeExact(handles.PFN_glMultiDrawArraysIndirect, mode, indirect, drawcount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawArraysIndirect", e); }
    }

    /// ```
    /// void glMultiDrawElementsIndirect((unsigned int) GLenum mode, (unsigned int) GLenum type, const void* indirect, (int) GLsizei drawcount, (int) GLsizei stride);
    /// ```
    public void MultiDrawElementsIndirect(int mode, int type, MemorySegment indirect, int drawcount, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawElementsIndirect)) throw new SymbolNotFoundError("Symbol not found: glMultiDrawElementsIndirect");
        try { Handles.MH_glMultiDrawElementsIndirect.invokeExact(handles.PFN_glMultiDrawElementsIndirect, mode, type, indirect, drawcount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawElementsIndirect", e); }
    }

    /// ```
    /// void glGetProgramInterfaceiv((unsigned int) GLuint program, (unsigned int) GLenum programInterface, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetProgramInterfaceiv(int program, int programInterface, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramInterfaceiv)) throw new SymbolNotFoundError("Symbol not found: glGetProgramInterfaceiv");
        try { Handles.MH_glGetProgramInterfaceiv.invokeExact(handles.PFN_glGetProgramInterfaceiv, program, programInterface, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramInterfaceiv", e); }
    }

    /// ```
    /// (unsigned int) GLuint glGetProgramResourceIndex((unsigned int) GLuint program, (unsigned int) GLenum programInterface, const GLchar* name);
    /// ```
    public int GetProgramResourceIndex(int program, int programInterface, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramResourceIndex)) throw new SymbolNotFoundError("Symbol not found: glGetProgramResourceIndex");
        try { return (int) Handles.MH_glGetProgramResourceIndex.invokeExact(handles.PFN_glGetProgramResourceIndex, program, programInterface, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramResourceIndex", e); }
    }

    /// ```
    /// void glGetProgramResourceName((unsigned int) GLuint program, (unsigned int) GLenum programInterface, (unsigned int) GLuint index, (int) GLsizei bufSize, GLsizei* length, GLchar* name);
    /// ```
    public void GetProgramResourceName(int program, int programInterface, int index, int bufSize, MemorySegment length, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramResourceName)) throw new SymbolNotFoundError("Symbol not found: glGetProgramResourceName");
        try { Handles.MH_glGetProgramResourceName.invokeExact(handles.PFN_glGetProgramResourceName, program, programInterface, index, bufSize, length, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramResourceName", e); }
    }

    /// ```
    /// void glGetProgramResourceiv((unsigned int) GLuint program, (unsigned int) GLenum programInterface, (unsigned int) GLuint index, (int) GLsizei propCount, const GLenum* props, (int) GLsizei count, GLsizei* length, GLint* params);
    /// ```
    public void GetProgramResourceiv(int program, int programInterface, int index, int propCount, MemorySegment props, int count, MemorySegment length, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramResourceiv)) throw new SymbolNotFoundError("Symbol not found: glGetProgramResourceiv");
        try { Handles.MH_glGetProgramResourceiv.invokeExact(handles.PFN_glGetProgramResourceiv, program, programInterface, index, propCount, props, count, length, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramResourceiv", e); }
    }

    /// ```
    /// (int) GLint glGetProgramResourceLocation((unsigned int) GLuint program, (unsigned int) GLenum programInterface, const GLchar* name);
    /// ```
    public int GetProgramResourceLocation(int program, int programInterface, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramResourceLocation)) throw new SymbolNotFoundError("Symbol not found: glGetProgramResourceLocation");
        try { return (int) Handles.MH_glGetProgramResourceLocation.invokeExact(handles.PFN_glGetProgramResourceLocation, program, programInterface, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramResourceLocation", e); }
    }

    /// ```
    /// (int) GLint glGetProgramResourceLocationIndex((unsigned int) GLuint program, (unsigned int) GLenum programInterface, const GLchar* name);
    /// ```
    public int GetProgramResourceLocationIndex(int program, int programInterface, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetProgramResourceLocationIndex)) throw new SymbolNotFoundError("Symbol not found: glGetProgramResourceLocationIndex");
        try { return (int) Handles.MH_glGetProgramResourceLocationIndex.invokeExact(handles.PFN_glGetProgramResourceLocationIndex, program, programInterface, name); }
        catch (Throwable e) { throw new RuntimeException("error in GetProgramResourceLocationIndex", e); }
    }

    /// ```
    /// void glShaderStorageBlockBinding((unsigned int) GLuint program, (unsigned int) GLuint storageBlockIndex, (unsigned int) GLuint storageBlockBinding);
    /// ```
    public void ShaderStorageBlockBinding(int program, int storageBlockIndex, int storageBlockBinding) {
        if (MemoryUtil.isNullPointer(handles.PFN_glShaderStorageBlockBinding)) throw new SymbolNotFoundError("Symbol not found: glShaderStorageBlockBinding");
        try { Handles.MH_glShaderStorageBlockBinding.invokeExact(handles.PFN_glShaderStorageBlockBinding, program, storageBlockIndex, storageBlockBinding); }
        catch (Throwable e) { throw new RuntimeException("error in ShaderStorageBlockBinding", e); }
    }

    /// ```
    /// void glTexBufferRange((unsigned int) GLenum target, (unsigned int) GLenum internalformat, (unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size);
    /// ```
    public void TexBufferRange(int target, int internalformat, int buffer, long offset, long size) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexBufferRange)) throw new SymbolNotFoundError("Symbol not found: glTexBufferRange");
        try { Handles.MH_glTexBufferRange.invokeExact(handles.PFN_glTexBufferRange, target, internalformat, buffer, offset, size); }
        catch (Throwable e) { throw new RuntimeException("error in TexBufferRange", e); }
    }

    /// ```
    /// void glTexStorage2DMultisample((unsigned int) GLenum target, (int) GLsizei samples, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, GLboolean fixedsamplelocations);
    /// ```
    public void TexStorage2DMultisample(int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexStorage2DMultisample)) throw new SymbolNotFoundError("Symbol not found: glTexStorage2DMultisample");
        try { Handles.MH_glTexStorage2DMultisample.invokeExact(handles.PFN_glTexStorage2DMultisample, target, samples, internalformat, width, height, ((fixedsamplelocations) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TexStorage2DMultisample", e); }
    }

    /// ```
    /// void glTexStorage3DMultisample((unsigned int) GLenum target, (int) GLsizei samples, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, GLboolean fixedsamplelocations);
    /// ```
    public void TexStorage3DMultisample(int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexStorage3DMultisample)) throw new SymbolNotFoundError("Symbol not found: glTexStorage3DMultisample");
        try { Handles.MH_glTexStorage3DMultisample.invokeExact(handles.PFN_glTexStorage3DMultisample, target, samples, internalformat, width, height, depth, ((fixedsamplelocations) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TexStorage3DMultisample", e); }
    }

    /// ```
    /// void glTextureView((unsigned int) GLuint texture, (unsigned int) GLenum target, (unsigned int) GLuint origtexture, (unsigned int) GLenum internalformat, (unsigned int) GLuint minlevel, (unsigned int) GLuint numlevels, (unsigned int) GLuint minlayer, (unsigned int) GLuint numlayers);
    /// ```
    public void TextureView(int texture, int target, int origtexture, int internalformat, int minlevel, int numlevels, int minlayer, int numlayers) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureView)) throw new SymbolNotFoundError("Symbol not found: glTextureView");
        try { Handles.MH_glTextureView.invokeExact(handles.PFN_glTextureView, texture, target, origtexture, internalformat, minlevel, numlevels, minlayer, numlayers); }
        catch (Throwable e) { throw new RuntimeException("error in TextureView", e); }
    }

    /// ```
    /// void glBindVertexBuffer((unsigned int) GLuint bindingindex, (unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, (int) GLsizei stride);
    /// ```
    public void BindVertexBuffer(int bindingindex, int buffer, long offset, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindVertexBuffer)) throw new SymbolNotFoundError("Symbol not found: glBindVertexBuffer");
        try { Handles.MH_glBindVertexBuffer.invokeExact(handles.PFN_glBindVertexBuffer, bindingindex, buffer, offset, stride); }
        catch (Throwable e) { throw new RuntimeException("error in BindVertexBuffer", e); }
    }

    /// ```
    /// void glVertexAttribFormat((unsigned int) GLuint attribindex, (int) GLint size, (unsigned int) GLenum type, GLboolean normalized, (unsigned int) GLuint relativeoffset);
    /// ```
    public void VertexAttribFormat(int attribindex, int size, int type, boolean normalized, int relativeoffset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribFormat)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribFormat");
        try { Handles.MH_glVertexAttribFormat.invokeExact(handles.PFN_glVertexAttribFormat, attribindex, size, type, ((normalized) ? (byte)1 : (byte)0), relativeoffset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribFormat", e); }
    }

    /// ```
    /// void glVertexAttribIFormat((unsigned int) GLuint attribindex, (int) GLint size, (unsigned int) GLenum type, (unsigned int) GLuint relativeoffset);
    /// ```
    public void VertexAttribIFormat(int attribindex, int size, int type, int relativeoffset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribIFormat)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribIFormat");
        try { Handles.MH_glVertexAttribIFormat.invokeExact(handles.PFN_glVertexAttribIFormat, attribindex, size, type, relativeoffset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribIFormat", e); }
    }

    /// ```
    /// void glVertexAttribLFormat((unsigned int) GLuint attribindex, (int) GLint size, (unsigned int) GLenum type, (unsigned int) GLuint relativeoffset);
    /// ```
    public void VertexAttribLFormat(int attribindex, int size, int type, int relativeoffset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribLFormat)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribLFormat");
        try { Handles.MH_glVertexAttribLFormat.invokeExact(handles.PFN_glVertexAttribLFormat, attribindex, size, type, relativeoffset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribLFormat", e); }
    }

    /// ```
    /// void glVertexAttribBinding((unsigned int) GLuint attribindex, (unsigned int) GLuint bindingindex);
    /// ```
    public void VertexAttribBinding(int attribindex, int bindingindex) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribBinding)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribBinding");
        try { Handles.MH_glVertexAttribBinding.invokeExact(handles.PFN_glVertexAttribBinding, attribindex, bindingindex); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribBinding", e); }
    }

    /// ```
    /// void glVertexBindingDivisor((unsigned int) GLuint bindingindex, (unsigned int) GLuint divisor);
    /// ```
    public void VertexBindingDivisor(int bindingindex, int divisor) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexBindingDivisor)) throw new SymbolNotFoundError("Symbol not found: glVertexBindingDivisor");
        try { Handles.MH_glVertexBindingDivisor.invokeExact(handles.PFN_glVertexBindingDivisor, bindingindex, divisor); }
        catch (Throwable e) { throw new RuntimeException("error in VertexBindingDivisor", e); }
    }

    /// ```
    /// void glDebugMessageControl((unsigned int) GLenum source, (unsigned int) GLenum type, (unsigned int) GLenum severity, (int) GLsizei count, const GLuint* ids, GLboolean enabled);
    /// ```
    public void DebugMessageControl(int source, int type, int severity, int count, MemorySegment ids, boolean enabled) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDebugMessageControl)) throw new SymbolNotFoundError("Symbol not found: glDebugMessageControl");
        try { Handles.MH_glDebugMessageControl.invokeExact(handles.PFN_glDebugMessageControl, source, type, severity, count, ids, ((enabled) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in DebugMessageControl", e); }
    }

    /// ```
    /// void glDebugMessageInsert((unsigned int) GLenum source, (unsigned int) GLenum type, (unsigned int) GLuint id, (unsigned int) GLenum severity, (int) GLsizei length, const GLchar* buf);
    /// ```
    public void DebugMessageInsert(int source, int type, int id, int severity, int length, MemorySegment buf) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDebugMessageInsert)) throw new SymbolNotFoundError("Symbol not found: glDebugMessageInsert");
        try { Handles.MH_glDebugMessageInsert.invokeExact(handles.PFN_glDebugMessageInsert, source, type, id, severity, length, buf); }
        catch (Throwable e) { throw new RuntimeException("error in DebugMessageInsert", e); }
    }

    /// ```
    /// void glDebugMessageCallback((void (*GLDebugProc)((unsigned int) GLenum source, (unsigned int) GLenum type, (unsigned int) GLuint id, (unsigned int) GLenum severity, (int) GLsizei length, const GLchar* message, const void* userParam)) GLDEBUGPROC callback, const void* userParam);
    /// ```
    public void DebugMessageCallback(MemorySegment callback, MemorySegment userParam) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDebugMessageCallback)) throw new SymbolNotFoundError("Symbol not found: glDebugMessageCallback");
        try { Handles.MH_glDebugMessageCallback.invokeExact(handles.PFN_glDebugMessageCallback, callback, userParam); }
        catch (Throwable e) { throw new RuntimeException("error in DebugMessageCallback", e); }
    }

    /// ```
    /// (unsigned int) GLuint glGetDebugMessageLog((unsigned int) GLuint count, (int) GLsizei bufSize, GLenum* sources, GLenum* types, GLuint* ids, GLenum* severities, GLsizei* lengths, GLchar* messageLog);
    /// ```
    public int GetDebugMessageLog(int count, int bufSize, MemorySegment sources, MemorySegment types, MemorySegment ids, MemorySegment severities, MemorySegment lengths, MemorySegment messageLog) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetDebugMessageLog)) throw new SymbolNotFoundError("Symbol not found: glGetDebugMessageLog");
        try { return (int) Handles.MH_glGetDebugMessageLog.invokeExact(handles.PFN_glGetDebugMessageLog, count, bufSize, sources, types, ids, severities, lengths, messageLog); }
        catch (Throwable e) { throw new RuntimeException("error in GetDebugMessageLog", e); }
    }

    /// ```
    /// void glPushDebugGroup((unsigned int) GLenum source, (unsigned int) GLuint id, (int) GLsizei length, const GLchar* message);
    /// ```
    public void PushDebugGroup(int source, int id, int length, MemorySegment message) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPushDebugGroup)) throw new SymbolNotFoundError("Symbol not found: glPushDebugGroup");
        try { Handles.MH_glPushDebugGroup.invokeExact(handles.PFN_glPushDebugGroup, source, id, length, message); }
        catch (Throwable e) { throw new RuntimeException("error in PushDebugGroup", e); }
    }

    /// ```
    /// void glPopDebugGroup();
    /// ```
    public void PopDebugGroup() {
        if (MemoryUtil.isNullPointer(handles.PFN_glPopDebugGroup)) throw new SymbolNotFoundError("Symbol not found: glPopDebugGroup");
        try { Handles.MH_glPopDebugGroup.invokeExact(handles.PFN_glPopDebugGroup); }
        catch (Throwable e) { throw new RuntimeException("error in PopDebugGroup", e); }
    }

    /// ```
    /// void glObjectLabel((unsigned int) GLenum identifier, (unsigned int) GLuint name, (int) GLsizei length, const GLchar* label);
    /// ```
    public void ObjectLabel(int identifier, int name, int length, MemorySegment label) {
        if (MemoryUtil.isNullPointer(handles.PFN_glObjectLabel)) throw new SymbolNotFoundError("Symbol not found: glObjectLabel");
        try { Handles.MH_glObjectLabel.invokeExact(handles.PFN_glObjectLabel, identifier, name, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in ObjectLabel", e); }
    }

    /// ```
    /// void glGetObjectLabel((unsigned int) GLenum identifier, (unsigned int) GLuint name, (int) GLsizei bufSize, GLsizei* length, GLchar* label);
    /// ```
    public void GetObjectLabel(int identifier, int name, int bufSize, MemorySegment length, MemorySegment label) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetObjectLabel)) throw new SymbolNotFoundError("Symbol not found: glGetObjectLabel");
        try { Handles.MH_glGetObjectLabel.invokeExact(handles.PFN_glGetObjectLabel, identifier, name, bufSize, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in GetObjectLabel", e); }
    }

    /// ```
    /// void glObjectPtrLabel(const void* ptr, (int) GLsizei length, const GLchar* label);
    /// ```
    public void ObjectPtrLabel(MemorySegment ptr, int length, MemorySegment label) {
        if (MemoryUtil.isNullPointer(handles.PFN_glObjectPtrLabel)) throw new SymbolNotFoundError("Symbol not found: glObjectPtrLabel");
        try { Handles.MH_glObjectPtrLabel.invokeExact(handles.PFN_glObjectPtrLabel, ptr, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in ObjectPtrLabel", e); }
    }

    /// ```
    /// void glGetObjectPtrLabel(const void* ptr, (int) GLsizei bufSize, GLsizei* length, GLchar* label);
    /// ```
    public void GetObjectPtrLabel(MemorySegment ptr, int bufSize, MemorySegment length, MemorySegment label) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetObjectPtrLabel)) throw new SymbolNotFoundError("Symbol not found: glGetObjectPtrLabel");
        try { Handles.MH_glGetObjectPtrLabel.invokeExact(handles.PFN_glGetObjectPtrLabel, ptr, bufSize, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in GetObjectPtrLabel", e); }
    }

    /// ```
    /// void glGetPointerv((unsigned int) GLenum pname, void** params);
    /// ```
    public void GetPointerv(int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPointerv)) throw new SymbolNotFoundError("Symbol not found: glGetPointerv");
        try { Handles.MH_glGetPointerv.invokeExact(handles.PFN_glGetPointerv, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetPointerv", e); }
    }

}

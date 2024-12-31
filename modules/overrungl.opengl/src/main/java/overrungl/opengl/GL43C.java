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
import overrun.marshal.DirectAccess;
import overrun.marshal.Marshal;
import overrun.marshal.Unmarshal;
import overrun.marshal.gen.Entrypoint;
import overrun.marshal.gen.Ref;
import overrun.marshal.gen.Skip;
import overrungl.opengl.ext.arb.GLARBDebugOutput;
import overrungl.opengl.ext.arb.GLARBInternalformatQuery2;
import overrungl.util.MemoryStack;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;

/**
 * The OpenGL 4.3 core profile functions.
 * <p>
 * These extensions are promoted in this version:
 * <ul>
 *     <li>GL_ARB_clear_buffer_object</li>
 *     <li>GL_ARB_compute_shader</li>
 *     <li>GL_ARB_copy_image</li>
 *     <li>{@linkplain GLARBDebugOutput GL_ARB_debug_output}</li>
 *     <li>GL_ARB_framebuffer_no_attachments</li>
 *     <li>{@linkplain GLARBInternalformatQuery2 GL_ARB_internalformat_query2}</li>
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
public interface GL43C extends DirectAccess {
    int NUM_SHADING_LANGUAGE_VERSIONS = 0x82E9;
    int VERTEX_ATTRIB_ARRAY_LONG = 0x874E;
    int COMPRESSED_RGB8_ETC2 = 0x9274;
    int COMPRESSED_SRGB8_ETC2 = 0x9275;
    int COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9276;
    int COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9277;
    int COMPRESSED_RGBA8_ETC2_EAC = 0x9278;
    int COMPRESSED_SRGB8_ALPHA8_ETC2_EAC = 0x9279;
    int COMPRESSED_R11_EAC = 0x9270;
    int COMPRESSED_SIGNED_R11_EAC = 0x9271;
    int COMPRESSED_RG11_EAC = 0x9272;
    int COMPRESSED_SIGNED_RG11_EAC = 0x9273;
    int PRIMITIVE_RESTART_FIXED_INDEX = 0x8D69;
    int ANY_SAMPLES_PASSED_CONSERVATIVE = 0x8D6A;
    int MAX_ELEMENT_INDEX = 0x8D6B;
    int COMPUTE_SHADER = 0x91B9;
    int MAX_COMPUTE_UNIFORM_BLOCKS = 0x91BB;
    int MAX_COMPUTE_TEXTURE_IMAGE_UNITS = 0x91BC;
    int MAX_COMPUTE_IMAGE_UNIFORMS = 0x91BD;
    int MAX_COMPUTE_SHARED_MEMORY_SIZE = 0x8262;
    int MAX_COMPUTE_UNIFORM_COMPONENTS = 0x8263;
    int MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS = 0x8264;
    int MAX_COMPUTE_ATOMIC_COUNTERS = 0x8265;
    int MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS = 0x8266;
    int MAX_COMPUTE_WORK_GROUP_INVOCATIONS = 0x90EB;
    int MAX_COMPUTE_WORK_GROUP_COUNT = 0x91BE;
    int MAX_COMPUTE_WORK_GROUP_SIZE = 0x91BF;
    int COMPUTE_WORK_GROUP_SIZE = 0x8267;
    int UNIFORM_BLOCK_REFERENCED_BY_COMPUTE_SHADER = 0x90EC;
    int ATOMIC_COUNTER_BUFFER_REFERENCED_BY_COMPUTE_SHADER = 0x90ED;
    int DISPATCH_INDIRECT_BUFFER = 0x90EE;
    int DISPATCH_INDIRECT_BUFFER_BINDING = 0x90EF;
    int COMPUTE_SHADER_BIT = 0x00000020;
    int DEBUG_OUTPUT_SYNCHRONOUS = 0x8242;
    int DEBUG_NEXT_LOGGED_MESSAGE_LENGTH = 0x8243;
    int DEBUG_CALLBACK_FUNCTION = 0x8244;
    int DEBUG_CALLBACK_USER_PARAM = 0x8245;
    int DEBUG_SOURCE_API = 0x8246;
    int DEBUG_SOURCE_WINDOW_SYSTEM = 0x8247;
    int DEBUG_SOURCE_SHADER_COMPILER = 0x8248;
    int DEBUG_SOURCE_THIRD_PARTY = 0x8249;
    int DEBUG_SOURCE_APPLICATION = 0x824A;
    int DEBUG_SOURCE_OTHER = 0x824B;
    int DEBUG_TYPE_ERROR = 0x824C;
    int DEBUG_TYPE_DEPRECATED_BEHAVIOR = 0x824D;
    int DEBUG_TYPE_UNDEFINED_BEHAVIOR = 0x824E;
    int DEBUG_TYPE_PORTABILITY = 0x824F;
    int DEBUG_TYPE_PERFORMANCE = 0x8250;
    int DEBUG_TYPE_OTHER = 0x8251;
    int MAX_DEBUG_MESSAGE_LENGTH = 0x9143;
    int MAX_DEBUG_LOGGED_MESSAGES = 0x9144;
    int DEBUG_LOGGED_MESSAGES = 0x9145;
    int DEBUG_SEVERITY_HIGH = 0x9146;
    int DEBUG_SEVERITY_MEDIUM = 0x9147;
    int DEBUG_SEVERITY_LOW = 0x9148;
    int DEBUG_TYPE_MARKER = 0x8268;
    int DEBUG_TYPE_PUSH_GROUP = 0x8269;
    int DEBUG_TYPE_POP_GROUP = 0x826A;
    int DEBUG_SEVERITY_NOTIFICATION = 0x826B;
    int MAX_DEBUG_GROUP_STACK_DEPTH = 0x826C;
    int DEBUG_GROUP_STACK_DEPTH = 0x826D;
    int BUFFER = 0x82E0;
    int SHADER = 0x82E1;
    int PROGRAM = 0x82E2;
    int QUERY = 0x82E3;
    int PROGRAM_PIPELINE = 0x82E4;
    int SAMPLER = 0x82E6;
    int MAX_LABEL_LENGTH = 0x82E8;
    int DEBUG_OUTPUT = 0x92E0;
    int CONTEXT_FLAG_DEBUG_BIT = 0x00000002;
    int MAX_UNIFORM_LOCATIONS = 0x826E;
    int FRAMEBUFFER_DEFAULT_WIDTH = 0x9310;
    int FRAMEBUFFER_DEFAULT_HEIGHT = 0x9311;
    int FRAMEBUFFER_DEFAULT_LAYERS = 0x9312;
    int FRAMEBUFFER_DEFAULT_SAMPLES = 0x9313;
    int FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS = 0x9314;
    int MAX_FRAMEBUFFER_WIDTH = 0x9315;
    int MAX_FRAMEBUFFER_HEIGHT = 0x9316;
    int MAX_FRAMEBUFFER_LAYERS = 0x9317;
    int MAX_FRAMEBUFFER_SAMPLES = 0x9318;
    int INTERNALFORMAT_SUPPORTED = 0x826F;
    int INTERNALFORMAT_PREFERRED = 0x8270;
    int INTERNALFORMAT_RED_SIZE = 0x8271;
    int INTERNALFORMAT_GREEN_SIZE = 0x8272;
    int INTERNALFORMAT_BLUE_SIZE = 0x8273;
    int INTERNALFORMAT_ALPHA_SIZE = 0x8274;
    int INTERNALFORMAT_DEPTH_SIZE = 0x8275;
    int INTERNALFORMAT_STENCIL_SIZE = 0x8276;
    int INTERNALFORMAT_SHARED_SIZE = 0x8277;
    int INTERNALFORMAT_RED_TYPE = 0x8278;
    int INTERNALFORMAT_GREEN_TYPE = 0x8279;
    int INTERNALFORMAT_BLUE_TYPE = 0x827A;
    int INTERNALFORMAT_ALPHA_TYPE = 0x827B;
    int INTERNALFORMAT_DEPTH_TYPE = 0x827C;
    int INTERNALFORMAT_STENCIL_TYPE = 0x827D;
    int MAX_WIDTH = 0x827E;
    int MAX_HEIGHT = 0x827F;
    int MAX_DEPTH = 0x8280;
    int MAX_LAYERS = 0x8281;
    int MAX_COMBINED_DIMENSIONS = 0x8282;
    int COLOR_COMPONENTS = 0x8283;
    int DEPTH_COMPONENTS = 0x8284;
    int STENCIL_COMPONENTS = 0x8285;
    int COLOR_RENDERABLE = 0x8286;
    int DEPTH_RENDERABLE = 0x8287;
    int STENCIL_RENDERABLE = 0x8288;
    int FRAMEBUFFER_RENDERABLE = 0x8289;
    int FRAMEBUFFER_RENDERABLE_LAYERED = 0x828A;
    int FRAMEBUFFER_BLEND = 0x828B;
    int READ_PIXELS = 0x828C;
    int READ_PIXELS_FORMAT = 0x828D;
    int READ_PIXELS_TYPE = 0x828E;
    int TEXTURE_IMAGE_FORMAT = 0x828F;
    int TEXTURE_IMAGE_TYPE = 0x8290;
    int GET_TEXTURE_IMAGE_FORMAT = 0x8291;
    int GET_TEXTURE_IMAGE_TYPE = 0x8292;
    int MIPMAP = 0x8293;
    int MANUAL_GENERATE_MIPMAP = 0x8294;
    int AUTO_GENERATE_MIPMAP = 0x8295;
    int COLOR_ENCODING = 0x8296;
    int SRGB_READ = 0x8297;
    int SRGB_WRITE = 0x8298;
    int FILTER = 0x829A;
    int VERTEX_TEXTURE = 0x829B;
    int TESS_CONTROL_TEXTURE = 0x829C;
    int TESS_EVALUATION_TEXTURE = 0x829D;
    int GEOMETRY_TEXTURE = 0x829E;
    int FRAGMENT_TEXTURE = 0x829F;
    int COMPUTE_TEXTURE = 0x82A0;
    int TEXTURE_SHADOW = 0x82A1;
    int TEXTURE_GATHER = 0x82A2;
    int TEXTURE_GATHER_SHADOW = 0x82A3;
    int SHADER_IMAGE_LOAD = 0x82A4;
    int SHADER_IMAGE_STORE = 0x82A5;
    int SHADER_IMAGE_ATOMIC = 0x82A6;
    int IMAGE_TEXEL_SIZE = 0x82A7;
    int IMAGE_COMPATIBILITY_CLASS = 0x82A8;
    int IMAGE_PIXEL_FORMAT = 0x82A9;
    int IMAGE_PIXEL_TYPE = 0x82AA;
    int SIMULTANEOUS_TEXTURE_AND_DEPTH_TEST = 0x82AC;
    int SIMULTANEOUS_TEXTURE_AND_STENCIL_TEST = 0x82AD;
    int SIMULTANEOUS_TEXTURE_AND_DEPTH_WRITE = 0x82AE;
    int SIMULTANEOUS_TEXTURE_AND_STENCIL_WRITE = 0x82AF;
    int TEXTURE_COMPRESSED_BLOCK_WIDTH = 0x82B1;
    int TEXTURE_COMPRESSED_BLOCK_HEIGHT = 0x82B2;
    int TEXTURE_COMPRESSED_BLOCK_SIZE = 0x82B3;
    int CLEAR_BUFFER = 0x82B4;
    int TEXTURE_VIEW = 0x82B5;
    int VIEW_COMPATIBILITY_CLASS = 0x82B6;
    int FULL_SUPPORT = 0x82B7;
    int CAVEAT_SUPPORT = 0x82B8;
    int IMAGE_CLASS_4_X_32 = 0x82B9;
    int IMAGE_CLASS_2_X_32 = 0x82BA;
    int IMAGE_CLASS_1_X_32 = 0x82BB;
    int IMAGE_CLASS_4_X_16 = 0x82BC;
    int IMAGE_CLASS_2_X_16 = 0x82BD;
    int IMAGE_CLASS_1_X_16 = 0x82BE;
    int IMAGE_CLASS_4_X_8 = 0x82BF;
    int IMAGE_CLASS_2_X_8 = 0x82C0;
    int IMAGE_CLASS_1_X_8 = 0x82C1;
    int IMAGE_CLASS_11_11_10 = 0x82C2;
    int IMAGE_CLASS_10_10_10_2 = 0x82C3;
    int VIEW_CLASS_128_BITS = 0x82C4;
    int VIEW_CLASS_96_BITS = 0x82C5;
    int VIEW_CLASS_64_BITS = 0x82C6;
    int VIEW_CLASS_48_BITS = 0x82C7;
    int VIEW_CLASS_32_BITS = 0x82C8;
    int VIEW_CLASS_24_BITS = 0x82C9;
    int VIEW_CLASS_16_BITS = 0x82CA;
    int VIEW_CLASS_8_BITS = 0x82CB;
    int VIEW_CLASS_S3TC_DXT1_RGB = 0x82CC;
    int VIEW_CLASS_S3TC_DXT1_RGBA = 0x82CD;
    int VIEW_CLASS_S3TC_DXT3_RGBA = 0x82CE;
    int VIEW_CLASS_S3TC_DXT5_RGBA = 0x82CF;
    int VIEW_CLASS_RGTC1_RED = 0x82D0;
    int VIEW_CLASS_RGTC2_RG = 0x82D1;
    int VIEW_CLASS_BPTC_UNORM = 0x82D2;
    int VIEW_CLASS_BPTC_FLOAT = 0x82D3;
    int UNIFORM = 0x92E1;
    int UNIFORM_BLOCK = 0x92E2;
    int PROGRAM_INPUT = 0x92E3;
    int PROGRAM_OUTPUT = 0x92E4;
    int BUFFER_VARIABLE = 0x92E5;
    int SHADER_STORAGE_BLOCK = 0x92E6;
    int VERTEX_SUBROUTINE = 0x92E8;
    int TESS_CONTROL_SUBROUTINE = 0x92E9;
    int TESS_EVALUATION_SUBROUTINE = 0x92EA;
    int GEOMETRY_SUBROUTINE = 0x92EB;
    int FRAGMENT_SUBROUTINE = 0x92EC;
    int COMPUTE_SUBROUTINE = 0x92ED;
    int VERTEX_SUBROUTINE_UNIFORM = 0x92EE;
    int TESS_CONTROL_SUBROUTINE_UNIFORM = 0x92EF;
    int TESS_EVALUATION_SUBROUTINE_UNIFORM = 0x92F0;
    int GEOMETRY_SUBROUTINE_UNIFORM = 0x92F1;
    int FRAGMENT_SUBROUTINE_UNIFORM = 0x92F2;
    int COMPUTE_SUBROUTINE_UNIFORM = 0x92F3;
    int TRANSFORM_FEEDBACK_VARYING = 0x92F4;
    int ACTIVE_RESOURCES = 0x92F5;
    int MAX_NAME_LENGTH = 0x92F6;
    int MAX_NUM_ACTIVE_VARIABLES = 0x92F7;
    int MAX_NUM_COMPATIBLE_SUBROUTINES = 0x92F8;
    int NAME_LENGTH = 0x92F9;
    int TYPE = 0x92FA;
    int ARRAY_SIZE = 0x92FB;
    int OFFSET = 0x92FC;
    int BLOCK_INDEX = 0x92FD;
    int ARRAY_STRIDE = 0x92FE;
    int MATRIX_STRIDE = 0x92FF;
    int IS_ROW_MAJOR = 0x9300;
    int ATOMIC_COUNTER_BUFFER_INDEX = 0x9301;
    int BUFFER_BINDING = 0x9302;
    int BUFFER_DATA_SIZE = 0x9303;
    int NUM_ACTIVE_VARIABLES = 0x9304;
    int ACTIVE_VARIABLES = 0x9305;
    int REFERENCED_BY_VERTEX_SHADER = 0x9306;
    int REFERENCED_BY_TESS_CONTROL_SHADER = 0x9307;
    int REFERENCED_BY_TESS_EVALUATION_SHADER = 0x9308;
    int REFERENCED_BY_GEOMETRY_SHADER = 0x9309;
    int REFERENCED_BY_FRAGMENT_SHADER = 0x930A;
    int REFERENCED_BY_COMPUTE_SHADER = 0x930B;
    int TOP_LEVEL_ARRAY_SIZE = 0x930C;
    int TOP_LEVEL_ARRAY_STRIDE = 0x930D;
    int LOCATION = 0x930E;
    int LOCATION_INDEX = 0x930F;
    int IS_PER_PATCH = 0x92E7;
    int SHADER_STORAGE_BUFFER = 0x90D2;
    int SHADER_STORAGE_BUFFER_BINDING = 0x90D3;
    int SHADER_STORAGE_BUFFER_START = 0x90D4;
    int SHADER_STORAGE_BUFFER_SIZE = 0x90D5;
    int MAX_VERTEX_SHADER_STORAGE_BLOCKS = 0x90D6;
    int MAX_GEOMETRY_SHADER_STORAGE_BLOCKS = 0x90D7;
    int MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS = 0x90D8;
    int MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS = 0x90D9;
    int MAX_FRAGMENT_SHADER_STORAGE_BLOCKS = 0x90DA;
    int MAX_COMPUTE_SHADER_STORAGE_BLOCKS = 0x90DB;
    int MAX_COMBINED_SHADER_STORAGE_BLOCKS = 0x90DC;
    int MAX_SHADER_STORAGE_BUFFER_BINDINGS = 0x90DD;
    int MAX_SHADER_STORAGE_BLOCK_SIZE = 0x90DE;
    int SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT = 0x90DF;
    int SHADER_STORAGE_BARRIER_BIT = 0x00002000;
    int MAX_COMBINED_SHADER_OUTPUT_RESOURCES = 0x8F39;
    int DEPTH_STENCIL_TEXTURE_MODE = 0x90EA;
    int TEXTURE_BUFFER_OFFSET = 0x919D;
    int TEXTURE_BUFFER_SIZE = 0x919E;
    int TEXTURE_BUFFER_OFFSET_ALIGNMENT = 0x919F;
    int TEXTURE_VIEW_MIN_LEVEL = 0x82DB;
    int TEXTURE_VIEW_NUM_LEVELS = 0x82DC;
    int TEXTURE_VIEW_MIN_LAYER = 0x82DD;
    int TEXTURE_VIEW_NUM_LAYERS = 0x82DE;
    int TEXTURE_IMMUTABLE_LEVELS = 0x82DF;
    int VERTEX_ATTRIB_BINDING = 0x82D4;
    int VERTEX_ATTRIB_RELATIVE_OFFSET = 0x82D5;
    int VERTEX_BINDING_DIVISOR = 0x82D6;
    int VERTEX_BINDING_OFFSET = 0x82D7;
    int VERTEX_BINDING_STRIDE = 0x82D8;
    int MAX_VERTEX_ATTRIB_RELATIVE_OFFSET = 0x82D9;
    int MAX_VERTEX_ATTRIB_BINDINGS = 0x82DA;
    int VERTEX_BINDING_BUFFER = 0x8F4F;

    @Entrypoint("glBindVertexBuffer")
    default void bindVertexBuffer(int bindingIndex, int buffer, long offset, int stride) {
        throw new ContextException();
    }

    @Entrypoint("glClearBufferData")
    default void clearBufferData(int target, int internalFormat, int format, int type, MemorySegment data) {
        throw new ContextException();
    }

    @Entrypoint("glClearBufferSubData")
    default void clearBufferSubData(int target, int internalFormat, long offset, long size, int format, int type, MemorySegment data) {
        throw new ContextException();
    }

    @Entrypoint("glCopyImageSubData")
    default void copyImageSubData(int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth) {
        throw new ContextException();
    }

    @Entrypoint("glDebugMessageCallback")
    default void debugMessageCallback(MemorySegment callback, MemorySegment userParam) {
        throw new ContextException();
    }

    @Entrypoint("glDebugMessageCallback")
    default void debugMessageCallback(Arena arena, GLDebugProc callback, MemorySegment userParam) {
        throw new ContextException();
    }

    @Entrypoint("glDebugMessageControl")
    default void debugMessageControl(int source, int type, int severity, int count, MemorySegment ids, boolean enabled) {
        throw new ContextException();
    }

    @Entrypoint("glDebugMessageControl")
    default void debugMessageControl(SegmentAllocator allocator, int source, int type, int severity, int count, int[] ids, boolean enabled) {
        throw new ContextException();
    }

    @Entrypoint("glDebugMessageInsert")
    default void debugMessageInsert(int source, int type, int id, int severity, int length, MemorySegment buf) {
        throw new ContextException();
    }

    @Skip
    default void debugMessageInsert(int source, int type, int id, int severity, String buf) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            debugMessageInsert(source, type, id, severity, -1, Marshal.marshal(stack, buf));
        }
    }

    @Entrypoint("glDispatchCompute")
    default void dispatchCompute(int numGroupsX, int numGroupsY, int numGroupsZ) {
        throw new ContextException();
    }

    @Entrypoint("glDispatchComputeIndirect")
    default void dispatchComputeIndirect(long indirect) {
        throw new ContextException();
    }

    @Entrypoint("glFramebufferParameteri")
    default void framebufferParameteri(int target, int pname, int param) {
        throw new ContextException();
    }

    @Entrypoint("glGetDebugMessageLog")
    default int getDebugMessageLog(int count, int bufSize, MemorySegment sources, MemorySegment types, MemorySegment ids, MemorySegment severities, MemorySegment lengths, MemorySegment messageLog) {
        throw new ContextException();
    }

    @Skip
    default int getDebugMessageLog(int count, MemorySegment sources, MemorySegment types, MemorySegment ids, MemorySegment severities, MemorySegment lengths, MemorySegment messageLog) {
        return getDebugMessageLog(count, Math.toIntExact(messageLog.byteSize()), sources, types, ids, severities, lengths, messageLog);
    }

    @Skip
    default int getDebugMessageLog(SegmentAllocator allocator, int count, int bufSize, @Ref int[] sources, @Ref int[] types, @Ref int[] ids, @Ref int[] severities, @Ref int[] lengths, @Ref String[] messageLog) {
        var pSrc = Marshal.marshal(allocator, sources);
        var pTypes = Marshal.marshal(allocator, types);
        var pIds = Marshal.marshal(allocator, ids);
        var pSvr = Marshal.marshal(allocator, severities);
        var pLen = Marshal.marshal(allocator, lengths);
        var pLog = allocator.allocate(JAVA_BYTE, bufSize);
        int num = getDebugMessageLog(count, bufSize, pSrc, pTypes, pIds, pSvr, pLen, pLog);
        Unmarshal.copy(pSrc, sources);
        Unmarshal.copy(pTypes, types);
        Unmarshal.copy(pIds, ids);
        Unmarshal.copy(pSvr, severities);
        Unmarshal.copy(pLen, lengths);
        Unmarshal.copy(pLog, messageLog);
        return num;
    }

    @Entrypoint("glGetFramebufferParameteriv")
    default void getFramebufferParameteriv(int target, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Skip
    default int getFramebufferParameteriv(int target, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(JAVA_INT);
            getFramebufferParameteriv(target, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetInternalformati64v")
    default void getInternalformati64v(int target, int internalFormat, int pname, int count, MemorySegment params) {
        throw new ContextException();
    }

    @Skip
    default void getInternalformati64v(SegmentAllocator allocator, int target, int internalFormat, int pname, @Ref long[] params) {
        var seg = Marshal.marshal(allocator, params);
        getInternalformati64v(target, internalFormat, pname, params.length, seg);
        Unmarshal.copy(seg, params);
    }

    @Skip
    default long getInternalformati64v(int target, int internalFormat, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(JAVA_LONG);
            getInternalformati64v(target, internalFormat, pname, 1, seg);
            return seg.get(JAVA_LONG, 0);
        }
    }

    @Entrypoint("glGetObjectLabel")
    default void getObjectLabel(int identifier, int name, int bufSize, MemorySegment length, MemorySegment label) {
        throw new ContextException();
    }

    @Skip
    default void getObjectLabel(int identifier, int name, MemorySegment length, MemorySegment label) {
        getObjectLabel(identifier, name, Math.toIntExact(label.byteSize()), length, label);
    }

    @Skip
    default String getObjectLabel(SegmentAllocator allocator, int identifier, int name, int bufSize, @Ref int @Nullable [] length) {
        var seg = allocator.allocate(JAVA_BYTE, bufSize);
        var pLen = Marshal.marshal(allocator, length);
        getObjectLabel(identifier, name, bufSize, seg, pLen);
        Unmarshal.copy(pLen, length);
        return Unmarshal.unmarshalAsString(seg);
    }

    @Skip
    default String getObjectLabel(SegmentAllocator allocator, int identifier, int name, @Ref int @Nullable [] length) {
        return getObjectLabel(allocator, identifier, name, 1024, length);
    }

    @Entrypoint("glGetObjectPtrLabel")
    default void getObjectPtrLabel(MemorySegment ptr, int bufSize, MemorySegment length, MemorySegment label) {
        throw new ContextException();
    }

    @Skip
    default void getObjectPtrLabel(MemorySegment ptr, MemorySegment length, MemorySegment label) {
        getObjectPtrLabel(ptr, Math.toIntExact(label.byteSize()), length, label);
    }

    @Skip
    default String getObjectPtrLabel(SegmentAllocator allocator, MemorySegment ptr, int bufSize, @Ref int @Nullable [] length) {
        var seg = allocator.allocate(JAVA_BYTE, bufSize);
        var pLen = Marshal.marshal(allocator, length);
        getObjectPtrLabel(ptr, bufSize, seg, pLen);
        Unmarshal.copy(pLen, length);
        return Unmarshal.unmarshalAsString(seg);
    }

    @Skip
    default String getObjectPtrLabel(SegmentAllocator allocator, MemorySegment ptr, @Ref int @Nullable [] length) {
        return getObjectPtrLabel(allocator, ptr, 1024, length);
    }

    @Entrypoint("glGetProgramInterfaceiv")
    default void getProgramInterfaceiv(int program, int programInterface, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Skip
    default int getProgramInterfaceiv(int program, int programInterface, int pname) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            var seg = stack.allocate(JAVA_INT);
            getProgramInterfaceiv(program, programInterface, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetProgramResourceIndex")
    default int getProgramResourceIndex(int program, int programInterface, MemorySegment name) {
        throw new ContextException();
    }

    @Entrypoint("glGetProgramResourceIndex")
    default int getProgramResourceIndex(int program, int programInterface, String name) {
        throw new ContextException();
    }

    @Entrypoint("glGetProgramResourceLocation")
    default int getProgramResourceLocation(int program, int programInterface, MemorySegment name) {
        throw new ContextException();
    }

    @Entrypoint("glGetProgramResourceLocation")
    default int getProgramResourceLocation(int program, int programInterface, String name) {
        throw new ContextException();
    }

    @Entrypoint("glGetProgramResourceLocationIndex")
    default int getProgramResourceLocationIndex(int program, int programInterface, MemorySegment name) {
        throw new ContextException();
    }

    @Entrypoint("glGetProgramResourceLocationIndex")
    default int getProgramResourceLocationIndex(int program, int programInterface, String name) {
        throw new ContextException();
    }

    @Entrypoint("glGetProgramResourceName")
    default void getProgramResourceName(int program, int programInterface, int index, int bufSize, MemorySegment length, MemorySegment name) {
        throw new ContextException();
    }

    @Skip
    default void getProgramResourceName(int program, int programInterface, int index, MemorySegment length, MemorySegment name) {
        getProgramResourceName(program, programInterface, index, Math.toIntExact(name.byteSize()), length, name);
    }

    @Skip
    default String getProgramResourceName(SegmentAllocator allocator, int program, int programInterface, int index, int bufSize, @Ref int @Nullable [] length) {
        var seg = allocator.allocate(JAVA_BYTE, bufSize);
        var pLen = Marshal.marshal(allocator, length);
        getProgramResourceName(program, programInterface, index, bufSize, pLen, seg);
        Unmarshal.copy(pLen, length);
        return Unmarshal.unmarshalAsString(seg);
    }

    @Skip
    default String getProgramResourceName(SegmentAllocator allocator, int program, int programInterface, int index, @Ref int @Nullable [] length) {
        return getProgramResourceName(allocator, program, programInterface, index, 1024, length);
    }

    @Entrypoint("glGetProgramResourceiv")
    default void getProgramResourceiv(int program, int programInterface, int index, int propCount, MemorySegment props, int bufSize, MemorySegment length, MemorySegment params) {
        throw new ContextException();
    }

    @Skip
    default void getProgramResourceiv(int program, int programInterface, int index, MemorySegment props, int bufSize, MemorySegment length, MemorySegment params) {
        getProgramResourceiv(program, programInterface, index, Math.toIntExact(props.byteSize() >> 2), props, bufSize, length, params);
    }

    @Skip
    default void getProgramResourceiv(SegmentAllocator allocator, int program, int programInterface, int index, int[] props, int bufSize, @Ref int @Nullable [] length, @Ref int[] params) {
        var seg = Marshal.marshal(allocator, params);
        var pLen = Marshal.marshal(allocator, length);
        getProgramResourceiv(program, programInterface, index, props.length, allocator.allocateFrom(JAVA_INT, props), bufSize, pLen, seg);
        Unmarshal.copy(pLen, length);
        Unmarshal.copy(seg, params);
    }

    @Skip
    default int getProgramResourceiv(SegmentAllocator allocator, int program, int programInterface, int index, int[] props, int bufSize) {
        var seg = allocator.allocate(JAVA_INT);
        getProgramResourceiv(program, programInterface, index, props.length, Marshal.marshal(allocator, props), bufSize, MemorySegment.NULL, seg);
        return seg.get(JAVA_INT, 0);
    }

    @Entrypoint("glInvalidateBufferData")
    default void invalidateBufferData(int buffer) {
        throw new ContextException();
    }

    @Entrypoint("glInvalidateBufferSubData")
    default void invalidateBufferSubData(int buffer, long offset, long length) {
        throw new ContextException();
    }

    @Entrypoint("glInvalidateFramebuffer")
    default void invalidateFramebuffer(int target, int numAttachments, MemorySegment attachments) {
        throw new ContextException();
    }

    @Skip
    default void invalidateFramebuffer(int target, int... attachments) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            invalidateFramebuffer(target, attachments.length, Marshal.marshal(stack, attachments));
        }
    }

    @Entrypoint("glInvalidateSubFramebuffer")
    default void invalidateSubFramebuffer(int target, int numAttachments, MemorySegment attachments, int x, int y, int width, int height) {
        throw new ContextException();
    }

    @Skip
    default void invalidateSubFramebuffer(SegmentAllocator allocator, int target, int[] attachments, int x, int y, int width, int height) {
        invalidateSubFramebuffer(target, attachments.length, Marshal.marshal(allocator, attachments), x, y, width, height);
    }

    @Skip
    default void invalidateSubFramebuffer(int target, int attachment, int x, int y, int width, int height) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            invalidateSubFramebuffer(target, 1, stack.allocateFrom(JAVA_INT, attachment), x, y, width, height);
        }
    }

    @Entrypoint("glInvalidateTexImage")
    default void invalidateTexImage(int texture, int level) {
        throw new ContextException();
    }

    @Entrypoint("glInvalidateTexSubImage")
    default void invalidateTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth) {
        throw new ContextException();
    }

    @Entrypoint("glMultiDrawArraysIndirect")
    default void multiDrawArraysIndirect(int mode, MemorySegment indirect, int drawCount, int stride) {
        throw new ContextException();
    }

    @Entrypoint("glMultiDrawArraysIndirect")
    default void multiDrawArraysIndirect(int mode, DrawArraysIndirectCommand indirect, int drawCount, int stride) {
        throw new ContextException();
    }

    @Entrypoint("glMultiDrawElementsIndirect")
    default void multiDrawElementsIndirect(int mode, int type, MemorySegment indirect, int drawCount, int stride) {
        throw new ContextException();
    }

    @Entrypoint("glMultiDrawElementsIndirect")
    default void multiDrawElementsIndirect(int mode, int type, DrawElementsIndirectCommand indirect, int drawCount, int stride) {
        throw new ContextException();
    }

    @Entrypoint("glObjectLabel")
    default void objectLabel(int identifier, int name, int length, MemorySegment label) {
        throw new ContextException();
    }

    @Skip
    default void objectLabel(int identifier, int name, String label) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            objectLabel(identifier, name, -1, Marshal.marshal(stack, label));
        }
    }

    @Entrypoint("glObjectPtrLabel")
    default void objectPtrLabel(MemorySegment ptr, int length, MemorySegment label) {
        throw new ContextException();
    }

    @Skip
    default void objectPtrLabel(MemorySegment ptr, String label) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            objectPtrLabel(ptr, -1, Marshal.marshal(stack, label));
        }
    }

    @Entrypoint("glPopDebugGroup")
    default void popDebugGroup() {
        throw new ContextException();
    }

    @Entrypoint("glPushDebugGroup")
    default void pushDebugGroup(int source, int id, int length, MemorySegment message) {
        throw new ContextException();
    }

    @Skip
    default void pushDebugGroup(int source, int id, String message) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            pushDebugGroup(source, id, -1, Marshal.marshal(stack, message));
        }
    }

    @Entrypoint("glShaderStorageBlockBinding")
    default void shaderStorageBlockBinding(int program, int storageBlockIndex, int storageBlockBinding) {
        throw new ContextException();
    }

    @Entrypoint("glTexBufferRange")
    default void texBufferRange(int target, int internalFormat, int buffer, long offset, long size) {
        throw new ContextException();
    }

    @Entrypoint("glTexStorage2DMultisample")
    default void texStorage2DMultisample(int target, int samples, int internalFormat, int width, int height, boolean fixedSampleLocations) {
        throw new ContextException();
    }

    @Entrypoint("glTexStorage3DMultisample")
    default void texStorage3DMultisample(int target, int samples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations) {
        throw new ContextException();
    }

    @Entrypoint("glTextureView")
    default void textureView(int texture, int target, int origTexture, int internalFormat, int minLevel, int numLevels, int minLayer, int numLayers) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribBinding")
    default void vertexAttribBinding(int attribIndex, int bindingIndex) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribFormat")
    default void vertexAttribFormat(int attribIndex, int size, int type, boolean normalized, int relativeOffset) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribIFormat")
    default void vertexAttribIFormat(int attribIndex, int size, int type, int relativeOffset) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribLFormat")
    default void vertexAttribLFormat(int attribIndex, int size, int type, int relativeOffset) {
        throw new ContextException();
    }

    @Entrypoint("glVertexBindingDivisor")
    default void vertexBindingDivisor(int bindingIndex, int divisor) {
        throw new ContextException();
    }
}

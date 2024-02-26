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
import overrun.marshal.MemoryStack;
import overrun.marshal.Unmarshal;
import overrun.marshal.gen.Entrypoint;
import overrun.marshal.gen.Ref;
import overrun.marshal.gen.Skip;
import overrungl.opengl.ext.arb.GLARBViewportArray;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;

/**
 * The OpenGL 4.1 core profile functions.
 * <p>
 * These extensions are promoted in this version:
 * <ul>
 *     <li>GL_ARB_ES2_compatibility</li>
 *     <li>GL_ARB_get_program_binary</li>
 *     <li>GL_ARB_separate_shader_objects</li>
 *     <li>GL_ARB_vertex_attrib_64bit</li>
 *     <li>{@link GLARBViewportArray GL_ARB_viewport_array}</li>
 * </ul>
 *
 * @author squid233
 * @since 0.1.0
 */
public interface GL41C extends DirectAccess {
    int FIXED = 0x140C;
    int IMPLEMENTATION_COLOR_READ_TYPE = 0x8B9A;
    int IMPLEMENTATION_COLOR_READ_FORMAT = 0x8B9B;
    int LOW_FLOAT = 0x8DF0;
    int MEDIUM_FLOAT = 0x8DF1;
    int HIGH_FLOAT = 0x8DF2;
    int LOW_INT = 0x8DF3;
    int MEDIUM_INT = 0x8DF4;
    int HIGH_INT = 0x8DF5;
    int SHADER_COMPILER = 0x8DFA;
    int SHADER_BINARY_FORMATS = 0x8DF8;
    int NUM_SHADER_BINARY_FORMATS = 0x8DF9;
    int MAX_VERTEX_UNIFORM_VECTORS = 0x8DFB;
    int MAX_VARYING_VECTORS = 0x8DFC;
    int MAX_FRAGMENT_UNIFORM_VECTORS = 0x8DFD;
    int RGB565 = 0x8D62;
    int PROGRAM_BINARY_RETRIEVABLE_HINT = 0x8257;
    int PROGRAM_BINARY_LENGTH = 0x8741;
    int NUM_PROGRAM_BINARY_FORMATS = 0x87FE;
    int PROGRAM_BINARY_FORMATS = 0x87FF;
    int VERTEX_SHADER_BIT = 0x00000001;
    int FRAGMENT_SHADER_BIT = 0x00000002;
    int GEOMETRY_SHADER_BIT = 0x00000004;
    int TESS_CONTROL_SHADER_BIT = 0x00000008;
    int TESS_EVALUATION_SHADER_BIT = 0x00000010;
    int ALL_SHADER_BITS = 0xFFFFFFFF;
    int PROGRAM_SEPARABLE = 0x8258;
    int ACTIVE_PROGRAM = 0x8259;
    int PROGRAM_PIPELINE_BINDING = 0x825A;
    int MAX_VIEWPORTS = 0x825B;
    int VIEWPORT_SUBPIXEL_BITS = 0x825C;
    int VIEWPORT_BOUNDS_RANGE = 0x825D;
    int LAYER_PROVOKING_VERTEX = 0x825E;
    int VIEWPORT_INDEX_PROVOKING_VERTEX = 0x825F;
    int UNDEFINED_VERTEX = 0x8260;

    @Entrypoint("glActiveShaderProgram")
    default void activeShaderProgram(int pipeline, int program) {
        throw new ContextException();
    }

    @Entrypoint("glBindProgramPipeline")
    default void bindProgramPipeline(int pipeline) {
        throw new ContextException();
    }

    @Entrypoint("glClearDepthf")
    default void clearDepthf(float d) {
        throw new ContextException();
    }

    @Entrypoint("glCreateShaderProgramv")
    default int createShaderProgramv(int type, int count, MemorySegment strings) {
        throw new ContextException();
    }

    @Skip
    default int createShaderProgramv(SegmentAllocator allocator, int type, String[] strings) {
        return createShaderProgramv(type, strings.length, Marshal.marshal(allocator, strings));
    }

    @Skip
    default int createShaderProgramv(int type, String string) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            return createShaderProgramv(type, 1, stack.allocateFrom(ADDRESS, Marshal.marshal(stack, string)));
        }
    }

    @Entrypoint("glDeleteProgramPipelines")
    default void deleteProgramPipelines(int n, MemorySegment pipelines) {
        throw new ContextException();
    }

    @Skip
    default void deleteProgramPipelines(int... pipelines) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            deleteProgramPipelines(pipelines.length, Marshal.marshal(stack, pipelines));
        }
    }

    @Entrypoint("glDepthRangeArrayv")
    default void depthRangeArrayv(int first, int count, MemorySegment v) {
        throw new ContextException();
    }

    @Skip
    default void depthRangeArrayv(SegmentAllocator allocator, int first, double[] v) {
        depthRangeArrayv(first, v.length, Marshal.marshal(allocator, v));
    }

    @Entrypoint("glDepthRangeIndexed")
    default void depthRangeIndexed(int index, double n, double f) {
        throw new ContextException();
    }

    @Entrypoint("glDepthRangef")
    default void depthRangef(float n, float f) {
        throw new ContextException();
    }

    @Entrypoint("glGenProgramPipelines")
    default void genProgramPipelines(int n, MemorySegment pipelines) {
        throw new ContextException();
    }

    @Skip
    default void genProgramPipelines(SegmentAllocator allocator, @Ref int[] pipelines) {
        var seg = Marshal.marshal(allocator, pipelines);
        genProgramPipelines(pipelines.length, seg);
        Unmarshal.copy(seg, pipelines);
    }

    @Skip
    default int genProgramPipelines() {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.ints(0);
            genProgramPipelines(1, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetDoublei_v")
    default void getDoublei_v(int target, int index, MemorySegment data) {
        throw new ContextException();
    }

    @Entrypoint("glGetDoublei_v")
    default void getDoublei_v(SegmentAllocator allocator, int target, int index, @Ref double[] data) {
        throw new ContextException();
    }

    @Skip
    default double getDoublei_v(int target, int index) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.doubles(0D);
            getDoublei_v(target, index, seg);
            return seg.get(JAVA_DOUBLE, 0);
        }
    }

    @Entrypoint("glGetFloati_v")
    default void getFloati_v(int target, int index, MemorySegment data) {
        throw new ContextException();
    }

    @Entrypoint("glGetFloati_v")
    default void getFloati_v(SegmentAllocator allocator, int target, int index, @Ref float[] data) {
        throw new ContextException();
    }

    @Skip
    default float getFloati_v(int target, int index) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.floats(0F);
            getFloati_v(target, index, seg);
            return seg.get(JAVA_FLOAT, 0);
        }
    }

    @Entrypoint("glGetProgramBinary")
    default void getProgramBinary(int program, int bufSize, MemorySegment length, MemorySegment binaryFormat, MemorySegment binary) {
        throw new ContextException();
    }

    @Entrypoint("glGetProgramBinary")
    default void getProgramBinary(int program, int bufSize, @Ref int @Nullable [] length, @Ref int[] binaryFormat, MemorySegment binary) {
        throw new ContextException();
    }

    @Skip
    default void getProgramBinary(int program, @Ref int @Nullable [] length, @Ref int[] binaryFormat, MemorySegment binary) {
        getProgramBinary(program, Math.toIntExact(binary.byteSize()), length, binaryFormat, binary);
    }

    @Entrypoint("glGetProgramPipelineInfoLog")
    default void getProgramPipelineInfoLog(int pipeline, int bufSize, MemorySegment length, MemorySegment infoLog) {
        throw new ContextException();
    }

    @Skip
    default void getProgramPipelineInfoLog(SegmentAllocator allocator, int pipeline, int bufSize, @Ref int @Nullable [] length, @Ref String[] infoLog) {
        var pl = Marshal.marshal(allocator, length);
        var pi = allocator.allocate(JAVA_BYTE, bufSize);
        getProgramPipelineInfoLog(pipeline, bufSize, pl, pi);
        Unmarshal.copy(pl, length);
        infoLog[0] = pi.getString(0);
    }

    @Skip
    default String getProgramPipelineInfoLog(SegmentAllocator allocator, int pipeline) {
        final int sz = getProgramPipelineiv(pipeline, GL20C.INFO_LOG_LENGTH);
        var pi = allocator.allocate(JAVA_BYTE, sz);
        getProgramPipelineInfoLog(pipeline, sz, MemorySegment.NULL, pi);
        return pi.getString(0);
    }

    @Entrypoint("glGetProgramPipelineiv")
    default void getProgramPipelineiv(int pipeline, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Skip
    default int getProgramPipelineiv(int pipeline, int pname) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.ints(0);
            getProgramPipelineiv(pipeline, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetShaderPrecisionFormat")
    default void getShaderPrecisionFormat(int shaderType, int precisionType, MemorySegment range, MemorySegment precision) {
        throw new ContextException();
    }

    @Entrypoint("glGetShaderPrecisionFormat")
    default void getShaderPrecisionFormat(SegmentAllocator allocator, int shaderType, int precisionType, @Ref int[] range, @Ref int[] precision) {
        throw new ContextException();
    }

    @Entrypoint("glGetVertexAttribLdv")
    default void getVertexAttribLdv(int index, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetVertexAttribLdv")
    default void getVertexAttribLdv(SegmentAllocator allocator, int index, int pname, @Ref double[] params) {
        throw new ContextException();
    }

    @Entrypoint("glIsProgramPipeline")
    default boolean isProgramPipeline(int pipeline) {
        throw new ContextException();
    }

    @Entrypoint("glProgramBinary")
    default void programBinary(int program, int binaryFormat, MemorySegment binary, int length) {
        throw new ContextException();
    }

    @Skip
    default void programBinary(int program, int binaryFormat, MemorySegment binary) {
        programBinary(program, binaryFormat, binary, Math.toIntExact(binary.byteSize()));
    }

    @Entrypoint("glProgramParameteri")
    default void programParameteri(int program, int pname, int value) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniform1d")
    default void programUniform1d(int program, int location, double v0) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniform1dv")
    default void programUniform1dv(int program, int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void programUniform1dv(SegmentAllocator allocator, int program, int location, double[] value) {
        programUniform1dv(program, location, value.length, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glProgramUniform1f")
    default void programUniform1f(int program, int location, float v0) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniform1fv")
    default void programUniform1fv(int program, int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void programUniform1fv(SegmentAllocator allocator, int program, int location, float[] value) {
        programUniform1fv(program, location, value.length, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glProgramUniform1i")
    default void programUniform1i(int program, int location, int v0) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniform1iv")
    default void programUniform1iv(int program, int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void programUniform1iv(SegmentAllocator allocator, int program, int location, int[] value) {
        programUniform1iv(program, location, value.length, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glProgramUniform1ui")
    default void programUniform1ui(int program, int location, int v0) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniform1uiv")
    default void programUniform1uiv(int program, int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void programUniform1uiv(SegmentAllocator allocator, int program, int location, int[] value) {
        programUniform1uiv(program, location, value.length, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glProgramUniform2d")
    default void programUniform2d(int program, int location, double v0, double v1) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniform2dv")
    default void programUniform2dv(int program, int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void programUniform2dv(SegmentAllocator allocator, int program, int location, double[] value) {
        programUniform2dv(program, location, value.length >> 2, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glProgramUniform2f")
    default void programUniform2f(int program, int location, float v0, float v1) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniform2fv")
    default void programUniform2fv(int program, int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void programUniform2fv(SegmentAllocator allocator, int program, int location, float[] value) {
        programUniform2fv(program, location, value.length >> 2, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glProgramUniform2i")
    default void programUniform2i(int program, int location, int v0, int v1) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniform2iv")
    default void programUniform2iv(int program, int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void programUniform2iv(SegmentAllocator allocator, int program, int location, int[] value) {
        programUniform2iv(program, location, value.length >> 2, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glProgramUniform2ui")
    default void programUniform2ui(int program, int location, int v0, int v1) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniform2uiv")
    default void programUniform2uiv(int program, int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void programUniform2uiv(SegmentAllocator allocator, int program, int location, int[] value) {
        programUniform2uiv(program, location, value.length >> 2, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glProgramUniform3d")
    default void programUniform3d(int program, int location, double v0, double v1, double v2) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniform3dv")
    default void programUniform3dv(int program, int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void programUniform3dv(SegmentAllocator allocator, int program, int location, double[] value) {
        programUniform3dv(program, location, value.length / 3, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glProgramUniform3f")
    default void programUniform3f(int program, int location, float v0, float v1, float v2) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniform3fv")
    default void programUniform3fv(int program, int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void programUniform3fv(SegmentAllocator allocator, int program, int location, float[] value) {
        programUniform3fv(program, location, value.length / 3, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glProgramUniform3i")
    default void programUniform3i(int program, int location, int v0, int v1, int v2) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniform3iv")
    default void programUniform3iv(int program, int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void programUniform3iv(SegmentAllocator allocator, int program, int location, int[] value) {
        programUniform3iv(program, location, value.length / 3, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glProgramUniform3ui")
    default void programUniform3ui(int program, int location, int v0, int v1, int v2) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniform3uiv")
    default void programUniform3uiv(int program, int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void programUniform3uiv(SegmentAllocator allocator, int program, int location, int[] value) {
        programUniform3uiv(program, location, value.length / 3, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glProgramUniform4d")
    default void programUniform4d(int program, int location, double v0, double v1, double v2, double v3) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniform4dv")
    default void programUniform4dv(int program, int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void programUniform4dv(SegmentAllocator allocator, int program, int location, double[] value) {
        programUniform4dv(program, location, value.length >> 2, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glProgramUniform4f")
    default void programUniform4f(int program, int location, float v0, float v1, float v2, float v3) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniform4fv")
    default void programUniform4fv(int program, int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void programUniform4fv(SegmentAllocator allocator, int program, int location, float[] value) {
        programUniform4fv(program, location, value.length >> 2, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glProgramUniform4i")
    default void programUniform4i(int program, int location, int v0, int v1, int v2, int v3) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniform4iv")
    default void programUniform4iv(int program, int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void programUniform4iv(SegmentAllocator allocator, int program, int location, int[] value) {
        programUniform4iv(program, location, value.length >> 2, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glProgramUniform4ui")
    default void programUniform4ui(int program, int location, int v0, int v1, int v2, int v3) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniform4uiv")
    default void programUniform4uiv(int program, int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void programUniform4uiv(SegmentAllocator allocator, int program, int location, int[] value) {
        programUniform4uiv(program, location, value.length >> 2, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glProgramUniformMatrix2dv")
    default void programUniformMatrix2dv(int program, int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniformMatrix2dv")
    default void programUniformMatrix2dv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, double[] value) {
        throw new ContextException();
    }

    @Skip
    default void programUniformMatrix2dv(SegmentAllocator allocator, int program, int location, boolean transpose, double[] value) {
        programUniformMatrix2dv(allocator, program, location, value.length >> 2, transpose, value);
    }

    @Entrypoint("glProgramUniformMatrix2fv")
    default void programUniformMatrix2fv(int program, int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniformMatrix2fv")
    default void programUniformMatrix2fv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, float[] value) {
        throw new ContextException();
    }

    @Skip
    default void programUniformMatrix2fv(SegmentAllocator allocator, int program, int location, boolean transpose, float[] value) {
        programUniformMatrix2fv(allocator, program, location, value.length >> 2, transpose, value);
    }

    @Entrypoint("glProgramUniformMatrix2x3dv")
    default void programUniformMatrix2x3dv(int program, int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniformMatrix2x3dv")
    default void programUniformMatrix2x3dv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, double[] value) {
        throw new ContextException();
    }

    @Skip
    default void programUniformMatrix2x3dv(SegmentAllocator allocator, int program, int location, boolean transpose, double[] value) {
        programUniformMatrix2x3dv(allocator, program, location, value.length / 6, transpose, value);
    }

    @Entrypoint("glProgramUniformMatrix2x3fv")
    default void programUniformMatrix2x3fv(int program, int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniformMatrix2x3fv")
    default void programUniformMatrix2x3fv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, float[] value) {
        throw new ContextException();
    }

    @Skip
    default void programUniformMatrix2x3fv(SegmentAllocator allocator, int program, int location, boolean transpose, float[] value) {
        programUniformMatrix2x3fv(allocator, program, location, value.length / 6, transpose, value);
    }

    @Entrypoint("glProgramUniformMatrix2x4dv")
    default void programUniformMatrix2x4dv(int program, int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniformMatrix2x4dv")
    default void programUniformMatrix2x4dv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, double[] value) {
        throw new ContextException();
    }

    @Skip
    default void programUniformMatrix2x4dv(SegmentAllocator allocator, int program, int location, boolean transpose, double[] value) {
        programUniformMatrix2x4dv(allocator, program, location, value.length >> 3, transpose, value);
    }

    @Entrypoint("glProgramUniformMatrix2x4fv")
    default void programUniformMatrix2x4fv(int program, int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniformMatrix2x4fv")
    default void programUniformMatrix2x4fv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, float[] value) {
        throw new ContextException();
    }

    @Skip
    default void programUniformMatrix2x4fv(SegmentAllocator allocator, int program, int location, boolean transpose, float[] value) {
        programUniformMatrix2x4fv(allocator, program, location, value.length >> 3, transpose, value);
    }

    @Entrypoint("glProgramUniformMatrix3dv")
    default void programUniformMatrix3dv(int program, int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniformMatrix3dv")
    default void programUniformMatrix3dv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, double[] value) {
        throw new ContextException();
    }

    @Skip
    default void programUniformMatrix3dv(SegmentAllocator allocator, int program, int location, boolean transpose, double[] value) {
        programUniformMatrix3dv(allocator, program, location, value.length / 9, transpose, value);
    }

    @Entrypoint("glProgramUniformMatrix3fv")
    default void programUniformMatrix3fv(int program, int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniformMatrix3fv")
    default void programUniformMatrix3fv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, float[] value) {
        throw new ContextException();
    }

    @Skip
    default void programUniformMatrix3fv(SegmentAllocator allocator, int program, int location, boolean transpose, float[] value) {
        programUniformMatrix3fv(allocator, program, location, value.length / 9, transpose, value);
    }

    @Entrypoint("glProgramUniformMatrix3x2dv")
    default void programUniformMatrix3x2dv(int program, int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniformMatrix3x2dv")
    default void programUniformMatrix3x2dv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, double[] value) {
        throw new ContextException();
    }

    @Skip
    default void programUniformMatrix3x2dv(SegmentAllocator allocator, int program, int location, boolean transpose, double[] value) {
        programUniformMatrix3x2dv(allocator, program, location, value.length / 6, transpose, value);
    }

    @Entrypoint("glProgramUniformMatrix3x2fv")
    default void programUniformMatrix3x2fv(int program, int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniformMatrix3x2fv")
    default void programUniformMatrix3x2fv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, float[] value) {
        throw new ContextException();
    }

    @Skip
    default void programUniformMatrix3x2fv(SegmentAllocator allocator, int program, int location, boolean transpose, float[] value) {
        programUniformMatrix3x2fv(allocator, program, location, value.length / 6, transpose, value);
    }

    @Entrypoint("glProgramUniformMatrix3x4dv")
    default void programUniformMatrix3x4dv(int program, int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniformMatrix3x4dv")
    default void programUniformMatrix3x4dv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, double[] value) {
        throw new ContextException();
    }

    @Skip
    default void programUniformMatrix3x4dv(SegmentAllocator allocator, int program, int location, boolean transpose, double[] value) {
        programUniformMatrix3x4dv(allocator, program, location, value.length / 12, transpose, value);
    }

    @Entrypoint("glProgramUniformMatrix3x4fv")
    default void programUniformMatrix3x4fv(int program, int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniformMatrix3x4fv")
    default void programUniformMatrix3x4fv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, float[] value) {
        throw new ContextException();
    }

    @Skip
    default void programUniformMatrix3x4fv(SegmentAllocator allocator, int program, int location, boolean transpose, float[] value) {
        programUniformMatrix3x4fv(allocator, program, location, value.length / 12, transpose, value);
    }

    @Entrypoint("glProgramUniformMatrix4dv")
    default void programUniformMatrix4dv(int program, int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniformMatrix4dv")
    default void programUniformMatrix4dv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, double[] value) {
        throw new ContextException();
    }

    @Skip
    default void programUniformMatrix4dv(SegmentAllocator allocator, int program, int location, boolean transpose, double[] value) {
        programUniformMatrix4dv(allocator, program, location, value.length >> 4, transpose, value);
    }

    @Entrypoint("glProgramUniformMatrix4fv")
    default void programUniformMatrix4fv(int program, int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniformMatrix4fv")
    default void programUniformMatrix4fv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, float[] value) {
        throw new ContextException();
    }

    @Skip
    default void programUniformMatrix4fv(SegmentAllocator allocator, int program, int location, boolean transpose, float[] value) {
        programUniformMatrix4fv(allocator, program, location, value.length >> 4, transpose, value);
    }

    @Entrypoint("glProgramUniformMatrix4x2dv")
    default void programUniformMatrix4x2dv(int program, int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniformMatrix4x2dv")
    default void programUniformMatrix4x2dv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, double[] value) {
        throw new ContextException();
    }

    @Skip
    default void programUniformMatrix4x2dv(SegmentAllocator allocator, int program, int location, boolean transpose, double[] value) {
        programUniformMatrix4x2dv(allocator, program, location, value.length >> 3, transpose, value);
    }

    @Entrypoint("glProgramUniformMatrix4x2fv")
    default void programUniformMatrix4x2fv(int program, int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniformMatrix4x2fv")
    default void programUniformMatrix4x2fv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, float[] value) {
        throw new ContextException();
    }

    @Skip
    default void programUniformMatrix4x2fv(SegmentAllocator allocator, int program, int location, boolean transpose, float[] value) {
        programUniformMatrix4x2fv(allocator, program, location, value.length >> 3, transpose, value);
    }

    @Entrypoint("glProgramUniformMatrix4x3dv")
    default void programUniformMatrix4x3dv(int program, int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniformMatrix4x3dv")
    default void programUniformMatrix4x3dv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, double[] value) {
        throw new ContextException();
    }

    @Skip
    default void programUniformMatrix4x3dv(SegmentAllocator allocator, int program, int location, boolean transpose, double[] value) {
        programUniformMatrix4x3dv(allocator, program, location, value.length / 12, transpose, value);
    }

    @Entrypoint("glProgramUniformMatrix4x3fv")
    default void programUniformMatrix4x3fv(int program, int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Entrypoint("glProgramUniformMatrix4x3fv")
    default void programUniformMatrix4x3fv(SegmentAllocator allocator, int program, int location, int count, boolean transpose, float[] value) {
        throw new ContextException();
    }

    @Skip
    default void programUniformMatrix4x3fv(SegmentAllocator allocator, int program, int location, boolean transpose, float[] value) {
        programUniformMatrix4x3fv(allocator, program, location, value.length / 12, transpose, value);
    }

    @Entrypoint("glReleaseShaderCompiler")
    default void releaseShaderCompiler() {
        throw new ContextException();
    }

    @Entrypoint("glScissorArrayv")
    default void scissorArrayv(int first, int count, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glScissorArrayv")
    default void scissorArrayv(SegmentAllocator allocator, int first, int count, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glScissorIndexed")
    default void scissorIndexed(int index, int left, int bottom, int width, int height) {
        throw new ContextException();
    }

    @Entrypoint("glScissorIndexedv")
    default void scissorIndexedv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glScissorIndexedv")
    default void scissorIndexedv(SegmentAllocator allocator, int index, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glShaderBinary")
    default void shaderBinary(int count, MemorySegment shaders, int binaryFormat, MemorySegment binary, int length) {
        throw new ContextException();
    }

    @Skip
    default void shaderBinary(SegmentAllocator allocator, int[] shaders, int binaryFormat, MemorySegment binary, int length) {
        shaderBinary(shaders.length, Marshal.marshal(allocator, shaders), binaryFormat, binary, length);
    }

    @Skip
    default void shaderBinary(SegmentAllocator allocator, int[] shaders, int binaryFormat, MemorySegment binary) {
        shaderBinary(allocator, shaders, binaryFormat, binary, Math.toIntExact(binary.byteSize()));
    }

    @Entrypoint("glUseProgramStages")
    default void useProgramStages(int pipeline, int stages, int program) {
        throw new ContextException();
    }

    @Entrypoint("glValidateProgramPipeline")
    default void validateProgramPipeline(int pipeline) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribL1d")
    default void vertexAttribL1d(int index, double x) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribL1dv")
    default void vertexAttribL1dv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribL1dv")
    default void vertexAttribL1dv(SegmentAllocator allocator, int index, double[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribL2d")
    default void vertexAttribL2d(int index, double x, double y) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribL2dv")
    default void vertexAttribL2dv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribL2dv")
    default void vertexAttribL2dv(SegmentAllocator allocator, int index, double[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribL3d")
    default void vertexAttribL3d(int index, double x, double y, double z) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribL3dv")
    default void vertexAttribL3dv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribL3dv")
    default void vertexAttribL3dv(SegmentAllocator allocator, int index, double[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribL4d")
    default void vertexAttribL4d(int index, double x, double y, double z, double w) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribL4dv")
    default void vertexAttribL4dv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribL4dv")
    default void vertexAttribL4dv(SegmentAllocator allocator, int index, double[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribLPointer")
    default void vertexAttribLPointer(int index, int size, int type, int stride, MemorySegment pointer) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribLPointer")
    default void vertexAttribLPointer(SegmentAllocator allocator, int index, int size, int type, int stride, double[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glViewportArrayv")
    default void viewportArrayv(int first, int count, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glViewportArrayv")
    default void viewportArrayv(SegmentAllocator allocator, int first, int count, float[] v) {
        throw new ContextException();
    }

    @Entrypoint("glViewportIndexedf")
    default void viewportIndexedf(int index, float x, float y, float w, float h) {
        throw new ContextException();
    }

    @Entrypoint("glViewportIndexedfv")
    default void viewportIndexedfv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glViewportIndexedfv")
    default void viewportIndexedfv(SegmentAllocator allocator, int index, float[] v) {
        throw new ContextException();
    }
}

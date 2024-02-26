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
import overrungl.opengl.ext.arb.GLARBDrawBuffers;
import overrungl.opengl.ext.arb.GLARBFragmentProgram;
import overrungl.opengl.ext.arb.GLARBShaderObjects;
import overrungl.opengl.ext.arb.GLARBVertexProgram;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

import static java.lang.foreign.ValueLayout.*;

/**
 * The OpenGL 2.0 forward compatible functions.
 * <p>
 * These extensions are promoted in this version:
 * <ul>
 *     <li>{@linkplain GLARBDrawBuffers GL_ARB_draw_buffers}</li>
 *     <li>{@linkplain GLARBFragmentProgram GL_ARB_fragment_program}</li>
 *     <li>{@linkplain GLARBShaderObjects GL_ARB_shader_objects}</li>
 *     <li>{@linkplain GLARBVertexProgram GL_ARB_vertex_program}</li>
 * </ul>
 *
 * @author squid233
 * @since 0.1.0
 */
public interface GL20C extends DirectAccess {
    int BLEND_EQUATION_RGB = 0x8009;
    int VERTEX_ATTRIB_ARRAY_ENABLED = 0x8622;
    int VERTEX_ATTRIB_ARRAY_SIZE = 0x8623;
    int VERTEX_ATTRIB_ARRAY_STRIDE = 0x8624;
    int VERTEX_ATTRIB_ARRAY_TYPE = 0x8625;
    int CURRENT_VERTEX_ATTRIB = 0x8626;
    int VERTEX_PROGRAM_POINT_SIZE = 0x8642;
    int VERTEX_ATTRIB_ARRAY_POINTER = 0x8645;
    int STENCIL_BACK_FUNC = 0x8800;
    int STENCIL_BACK_FAIL = 0x8801;
    int STENCIL_BACK_PASS_DEPTH_FAIL = 0x8802;
    int STENCIL_BACK_PASS_DEPTH_PASS = 0x8803;
    int MAX_DRAW_BUFFERS = 0x8824;
    int DRAW_BUFFER0 = 0x8825;
    int DRAW_BUFFER1 = 0x8826;
    int DRAW_BUFFER2 = 0x8827;
    int DRAW_BUFFER3 = 0x8828;
    int DRAW_BUFFER4 = 0x8829;
    int DRAW_BUFFER5 = 0x882A;
    int DRAW_BUFFER6 = 0x882B;
    int DRAW_BUFFER7 = 0x882C;
    int DRAW_BUFFER8 = 0x882D;
    int DRAW_BUFFER9 = 0x882E;
    int DRAW_BUFFER10 = 0x882F;
    int DRAW_BUFFER11 = 0x8830;
    int DRAW_BUFFER12 = 0x8831;
    int DRAW_BUFFER13 = 0x8832;
    int DRAW_BUFFER14 = 0x8833;
    int DRAW_BUFFER15 = 0x8834;
    int BLEND_EQUATION_ALPHA = 0x883D;
    int MAX_VERTEX_ATTRIBS = 0x8869;
    int VERTEX_ATTRIB_ARRAY_NORMALIZED = 0x886A;
    int MAX_TEXTURE_IMAGE_UNITS = 0x8872;
    int FRAGMENT_SHADER = 0x8B30;
    int VERTEX_SHADER = 0x8B31;
    int MAX_FRAGMENT_UNIFORM_COMPONENTS = 0x8B49;
    int MAX_VERTEX_UNIFORM_COMPONENTS = 0x8B4A;
    int MAX_VARYING_FLOATS = 0x8B4B;
    int MAX_VERTEX_TEXTURE_IMAGE_UNITS = 0x8B4C;
    int MAX_COMBINED_TEXTURE_IMAGE_UNITS = 0x8B4D;
    int SHADER_TYPE = 0x8B4F;
    int FLOAT_VEC2 = 0x8B50;
    int FLOAT_VEC3 = 0x8B51;
    int FLOAT_VEC4 = 0x8B52;
    int INT_VEC2 = 0x8B53;
    int INT_VEC3 = 0x8B54;
    int INT_VEC4 = 0x8B55;
    int BOOL = 0x8B56;
    int BOOL_VEC2 = 0x8B57;
    int BOOL_VEC3 = 0x8B58;
    int BOOL_VEC4 = 0x8B59;
    int FLOAT_MAT2 = 0x8B5A;
    int FLOAT_MAT3 = 0x8B5B;
    int FLOAT_MAT4 = 0x8B5C;
    int SAMPLER_1D = 0x8B5D;
    int SAMPLER_2D = 0x8B5E;
    int SAMPLER_3D = 0x8B5F;
    int SAMPLER_CUBE = 0x8B60;
    int SAMPLER_1D_SHADOW = 0x8B61;
    int SAMPLER_2D_SHADOW = 0x8B62;
    int DELETE_STATUS = 0x8B80;
    int COMPILE_STATUS = 0x8B81;
    int LINK_STATUS = 0x8B82;
    int VALIDATE_STATUS = 0x8B83;
    int INFO_LOG_LENGTH = 0x8B84;
    int ATTACHED_SHADERS = 0x8B85;
    int ACTIVE_UNIFORMS = 0x8B86;
    int ACTIVE_UNIFORM_MAX_LENGTH = 0x8B87;
    int SHADER_SOURCE_LENGTH = 0x8B88;
    int ACTIVE_ATTRIBUTES = 0x8B89;
    int ACTIVE_ATTRIBUTE_MAX_LENGTH = 0x8B8A;
    int FRAGMENT_SHADER_DERIVATIVE_HINT = 0x8B8B;
    int SHADING_LANGUAGE_VERSION = 0x8B8C;
    int CURRENT_PROGRAM = 0x8B8D;
    int POINT_SPRITE_COORD_ORIGIN = 0x8CA0;
    int LOWER_LEFT = 0x8CA1;
    int UPPER_LEFT = 0x8CA2;
    int STENCIL_BACK_REF = 0x8CA3;
    int STENCIL_BACK_VALUE_MASK = 0x8CA4;
    int STENCIL_BACK_WRITEMASK = 0x8CA5;

    @Entrypoint("glAttachShader")
    default void attachShader(int program, int shader) {
        throw new ContextException();
    }

    @Entrypoint("glBindAttribLocation")
    default void bindAttribLocation(int program, int index, MemorySegment name) {
        throw new ContextException();
    }

    @Entrypoint("glBindAttribLocation")
    default void bindAttribLocation(int program, int index, String name) {
        throw new ContextException();
    }

    @Entrypoint("glBlendEquationSeparate")
    default void blendEquationSeparate(int modeRGB, int modeAlpha) {
        throw new ContextException();
    }

    @Entrypoint("glCompileShader")
    default void compileShader(int shader) {
        throw new ContextException();
    }

    @Entrypoint("glCreateProgram")
    default int createProgram() {
        throw new ContextException();
    }

    @Entrypoint("glCreateShader")
    default int createShader(int type) {
        throw new ContextException();
    }

    @Entrypoint("glDeleteProgram")
    default void deleteProgram(int program) {
        throw new ContextException();
    }

    @Entrypoint("glDeleteShader")
    default void deleteShader(int shader) {
        throw new ContextException();
    }

    @Entrypoint("glDetachShader")
    default void detachShader(int program, int shader) {
        throw new ContextException();
    }

    @Entrypoint("glDisableVertexAttribArray")
    default void disableVertexAttribArray(int index) {
        throw new ContextException();
    }

    @Entrypoint("glDrawBuffers")
    default void drawBuffers(int n, MemorySegment bufs) {
        throw new ContextException();
    }

    @Skip
    default void drawBuffers(SegmentAllocator allocator, int[] bufs) {
        drawBuffers(bufs.length, Marshal.marshal(allocator, bufs));
    }

    @Entrypoint("glEnableVertexAttribArray")
    default void enableVertexAttribArray(int index) {
        throw new ContextException();
    }

    @Entrypoint("glGetActiveAttrib")
    default void getActiveAttrib(int program, int index, int bufSize, MemorySegment length, MemorySegment size, MemorySegment type, MemorySegment name) {
        throw new ContextException();
    }

    @Skip
    default void getActiveAttrib(SegmentAllocator allocator, int program, int index, int bufSize, @Ref int @Nullable [] length, @Ref int[] size, @Ref int[] type, @Ref String[] name) {
        var pLen = Marshal.marshal(allocator, length);
        var pSz = Marshal.marshal(allocator, size);
        var pType = Marshal.marshal(allocator, type);
        var pName = allocator.allocate(JAVA_BYTE, bufSize);
        getActiveAttrib(program, index, bufSize, pLen, pSz, pType, pName);
        Unmarshal.copy(pLen, length);
        Unmarshal.copy(pSz, size);
        Unmarshal.copy(pType, type);
        name[0] = pName.getString(0);
    }

    @Entrypoint("glGetActiveUniform")
    default void getActiveUniform(int program, int index, int bufSize, MemorySegment length, MemorySegment size, MemorySegment type, MemorySegment name) {
        throw new ContextException();
    }

    @Skip
    default void getActiveUniform(SegmentAllocator allocator, int program, int index, int bufSize, @Ref int @Nullable [] length, @Ref int[] size, @Ref int[] type, @Ref String[] name) {
        var pLen = Marshal.marshal(allocator, length);
        var pSz = Marshal.marshal(allocator, size);
        var pType = Marshal.marshal(allocator, type);
        var pName = allocator.allocate(JAVA_BYTE, bufSize);
        getActiveUniform(program, index, bufSize, pLen, pSz, pType, pName);
        Unmarshal.copy(pLen, length);
        Unmarshal.copy(pSz, size);
        Unmarshal.copy(pType, type);
        name[0] = pName.getString(0);
    }

    @Entrypoint("glGetAttachedShaders")
    default void getAttachedShaders(int program, int maxCount, MemorySegment count, MemorySegment shaders) {
        throw new ContextException();
    }

    @Entrypoint("glGetAttachedShaders")
    default void getAttachedShaders(SegmentAllocator allocator, int program, int maxCount, @Ref int @Nullable [] count, @Ref int[] shaders) {
        throw new ContextException();
    }

    @Entrypoint("glGetAttribLocation")
    default int getAttribLocation(int program, MemorySegment name) {
        throw new ContextException();
    }

    @Entrypoint("glGetAttribLocation")
    default int getAttribLocation(int program, String name) {
        throw new ContextException();
    }

    @Entrypoint("glGetProgramInfoLog")
    default void getProgramInfoLog(int program, int bufSize, MemorySegment length, MemorySegment infoLog) {
        throw new ContextException();
    }

    @Skip
    default String getProgramInfoLog(int program, int bufSize, @Ref int @Nullable [] length) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var pLen = Marshal.marshal(stack, length);
            var pLog = stack.allocate(JAVA_BYTE, bufSize);
            getProgramInfoLog(program, bufSize, pLen, pLog);
            Unmarshal.copy(pLen, length);
            return pLog.getString(0);
        }
    }

    @Skip
    default String getProgramInfoLog(int program) {
        return getProgramInfoLog(program, getProgramiv(program, INFO_LOG_LENGTH), null);
    }

    @Entrypoint("glGetProgramiv")
    default void getProgramiv(int program, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetProgramiv")
    default void getProgramiv(SegmentAllocator allocator, int program, int pname, @Ref int[] params) {
        throw new ContextException();
    }

    @Skip
    default int getProgramiv(int program, int pname) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.ints(0);
            getProgramiv(program, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetShaderInfoLog")
    default void getShaderInfoLog(int shader, int bufSize, MemorySegment length, MemorySegment infoLog) {
        throw new ContextException();
    }

    @Skip
    default String getShaderInfoLog(int shader, int bufSize, @Ref int @Nullable [] length) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var pLen = Marshal.marshal(stack, length);
            var pLog = stack.allocate(JAVA_BYTE, bufSize);
            getShaderInfoLog(shader, bufSize, pLen, pLog);
            Unmarshal.copy(pLen, length);
            return pLog.getString(0);
        }
    }

    @Skip
    default String getShaderInfoLog(int shader) {
        return getShaderInfoLog(shader, getShaderiv(shader, INFO_LOG_LENGTH), null);
    }

    @Entrypoint("glGetShaderSource")
    default void getShaderSource(int shader, int bufSize, MemorySegment length, MemorySegment source) {
        throw new ContextException();
    }

    @Skip
    default String getShaderSource(int shader, int bufSize, @Ref int @Nullable [] length) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var pLen = Marshal.marshal(stack, length);
            var pSrc = stack.allocate(JAVA_BYTE, bufSize);
            getShaderSource(shader, bufSize, pLen, pSrc);
            Unmarshal.copy(pLen, length);
            return pSrc.getString(0);
        }
    }

    @Skip
    default String getShaderSource(int shader) {
        return getShaderSource(shader, getShaderiv(shader, SHADER_SOURCE_LENGTH), null);
    }

    @Entrypoint("glGetShaderiv")
    default void getShaderiv(int shader, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetShaderiv")
    default void getShaderiv(SegmentAllocator allocator, int shader, int pname, @Ref int[] params) {
        throw new ContextException();
    }

    @Skip
    default int getShaderiv(int shader, int pname) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.ints(0);
            getShaderiv(shader, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetUniformLocation")
    default int getUniformLocation(int program, MemorySegment name) {
        throw new ContextException();
    }

    @Entrypoint("glGetUniformLocation")
    default int getUniformLocation(int program, String name) {
        throw new ContextException();
    }

    @Entrypoint("glGetUniformfv")
    default void getUniformfv(int program, int location, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetUniformfv")
    default void getUniformfv(SegmentAllocator allocator, int program, int location, @Ref float[] params) {
        throw new ContextException();
    }

    @Skip
    default float getUniformfv(int program, int location) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.floats(0F);
            getUniformfv(program, location, seg);
            return seg.get(JAVA_FLOAT, 0);
        }
    }

    @Entrypoint("glGetUniformiv")
    default void getUniformiv(int program, int location, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetUniformiv")
    default void getUniformiv(SegmentAllocator allocator, int program, int location, @Ref int[] params) {
        throw new ContextException();
    }

    @Skip
    default int getUniformiv(int program, int location) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.ints(0);
            getUniformiv(program, location, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glGetVertexAttribPointerv")
    default void getVertexAttribPointerv(int index, int pname, MemorySegment pointer) {
        throw new ContextException();
    }

    @Entrypoint("glGetVertexAttribPointerv")
    default void getVertexAttribPointerv(SegmentAllocator allocator, int index, int pname, @Ref byte[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glGetVertexAttribPointerv")
    default void getVertexAttribPointerv(SegmentAllocator allocator, int index, int pname, @Ref short[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glGetVertexAttribPointerv")
    default void getVertexAttribPointerv(SegmentAllocator allocator, int index, int pname, @Ref int[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glGetVertexAttribPointerv")
    default void getVertexAttribPointerv(SegmentAllocator allocator, int index, int pname, @Ref float[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glGetVertexAttribPointerv")
    default void getVertexAttribPointerv(SegmentAllocator allocator, int index, int pname, @Ref double[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glGetVertexAttribdv")
    default void getVertexAttribdv(int index, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetVertexAttribdv")
    default void getVertexAttribdv(SegmentAllocator allocator, int index, int pname, @Ref double[] params) {
        throw new ContextException();
    }

    @Skip
    default double getVertexAttribdv(int index, int pname) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.doubles(0D);
            getVertexAttribdv(index, pname, seg);
            return seg.get(JAVA_DOUBLE, 0);
        }
    }

    @Entrypoint("glGetVertexAttribfv")
    default void getVertexAttribfv(int index, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetVertexAttribfv")
    default void getVertexAttribfv(SegmentAllocator allocator, int index, int pname, @Ref float[] params) {
        throw new ContextException();
    }

    @Skip
    default float getVertexAttribfv(int index, int pname) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.floats(0F);
            getVertexAttribfv(index, pname, seg);
            return seg.get(JAVA_FLOAT, 0);
        }
    }

    @Entrypoint("glGetVertexAttribiv")
    default void getVertexAttribiv(int index, int pname, MemorySegment params) {
        throw new ContextException();
    }

    @Entrypoint("glGetVertexAttribiv")
    default void getVertexAttribiv(SegmentAllocator allocator, int index, int pname, @Ref int[] params) {
        throw new ContextException();
    }

    @Skip
    default int getVertexAttribiv(int index, int pname) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            var seg = stack.ints(0);
            getVertexAttribiv(index, pname, seg);
            return seg.get(JAVA_INT, 0);
        }
    }

    @Entrypoint("glIsProgram")
    default boolean isProgram(int program) {
        throw new ContextException();
    }

    @Entrypoint("glIsShader")
    default boolean isShader(int shader) {
        throw new ContextException();
    }

    @Entrypoint("glLinkProgram")
    default void linkProgram(int program) {
        throw new ContextException();
    }

    @Entrypoint("glShaderSource")
    default void shaderSource(int shader, int count, MemorySegment string, MemorySegment length) {
        throw new ContextException();
    }

    @Skip
    default void shaderSource(SegmentAllocator allocator, int shader, String[] string) {
        shaderSource(shader, string.length, Marshal.marshal(allocator, string), MemorySegment.NULL);
    }

    @Skip
    default void shaderSource(int shader, String string) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            shaderSource(shader, 1, stack.allocateFrom(ADDRESS, Marshal.marshal(stack, string)), MemorySegment.NULL);
        }
    }

    @Entrypoint("glStencilFuncSeparate")
    default void stencilFuncSeparate(int face, int func, int ref, int mask) {
        throw new ContextException();
    }

    @Entrypoint("glStencilMaskSeparate")
    default void stencilMaskSeparate(int face, int mask) {
        throw new ContextException();
    }

    @Entrypoint("glStencilOpSeparate")
    default void stencilOpSeparate(int face, int sfail, int dpfail, int dppass) {
        throw new ContextException();
    }

    @Entrypoint("glUniform1f")
    default void uniform1f(int location, float v0) {
        throw new ContextException();
    }

    @Entrypoint("glUniform1fv")
    default void uniform1fv(int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void uniform1fv(SegmentAllocator allocator, int location, float[] value) {
        uniform1fv(location, value.length, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glUniform1i")
    default void uniform1i(int location, int v0) {
        throw new ContextException();
    }

    @Entrypoint("glUniform1iv")
    default void uniform1iv(int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void uniform1iv(SegmentAllocator allocator, int location, int[] value) {
        uniform1iv(location, value.length, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glUniform2f")
    default void uniform2f(int location, float v0, float v1) {
        throw new ContextException();
    }

    @Entrypoint("glUniform2fv")
    default void uniform2fv(int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void uniform2fv(SegmentAllocator allocator, int location, float[] value) {
        uniform2fv(location, value.length >> 1, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glUniform2i")
    default void uniform2i(int location, int v0, int v1) {
        throw new ContextException();
    }

    @Entrypoint("glUniform2iv")
    default void uniform2iv(int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void uniform2iv(SegmentAllocator allocator, int location, int[] value) {
        uniform2iv(location, value.length >> 1, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glUniform3f")
    default void uniform3f(int location, float v0, float v1, float v2) {
        throw new ContextException();
    }

    @Entrypoint("glUniform3fv")
    default void uniform3fv(int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void uniform3fv(SegmentAllocator allocator, int location, float[] value) {
        uniform3fv(location, value.length / 3, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glUniform3i")
    default void uniform3i(int location, int v0, int v1, int v2) {
        throw new ContextException();
    }

    @Entrypoint("glUniform3iv")
    default void uniform3iv(int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void uniform3iv(SegmentAllocator allocator, int location, int[] value) {
        uniform3iv(location, value.length / 3, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glUniform4f")
    default void uniform4f(int location, float v0, float v1, float v2, float v3) {
        throw new ContextException();
    }

    @Entrypoint("glUniform4fv")
    default void uniform4fv(int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void uniform4fv(SegmentAllocator allocator, int location, float[] value) {
        uniform4fv(location, value.length >> 2, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glUniform4i")
    default void uniform4i(int location, int v0, int v1, int v2, int v3) {
        throw new ContextException();
    }

    @Entrypoint("glUniform4iv")
    default void uniform4iv(int location, int count, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void uniform4iv(SegmentAllocator allocator, int location, int[] value) {
        uniform4iv(location, value.length >> 2, Marshal.marshal(allocator, value));
    }

    @Entrypoint("glUniformMatrix2fv")
    default void uniformMatrix2fv(int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void uniformMatrix2fv(SegmentAllocator allocator, int location, int count, boolean transpose, float[] value) {
        uniformMatrix2fv(location, count, transpose, Marshal.marshal(allocator, value));
    }

    @Skip
    default void uniformMatrix2fv(SegmentAllocator allocator, int location, boolean transpose, float[] value) {
        uniformMatrix2fv(allocator, location, value.length >> 2, transpose, value);
    }

    @Entrypoint("glUniformMatrix3fv")
    default void uniformMatrix3fv(int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void uniformMatrix3fv(SegmentAllocator allocator, int location, int count, boolean transpose, float[] value) {
        uniformMatrix3fv(location, count, transpose, Marshal.marshal(allocator, value));
    }

    @Skip
    default void uniformMatrix3fv(SegmentAllocator allocator, int location, boolean transpose, float[] value) {
        uniformMatrix3fv(allocator, location, value.length / 9, transpose, value);
    }

    @Entrypoint("glUniformMatrix4fv")
    default void uniformMatrix4fv(int location, int count, boolean transpose, MemorySegment value) {
        throw new ContextException();
    }

    @Skip
    default void uniformMatrix4fv(SegmentAllocator allocator, int location, int count, boolean transpose, float[] value) {
        uniformMatrix4fv(location, count, transpose, Marshal.marshal(allocator, value));
    }

    @Skip
    default void uniformMatrix4fv(SegmentAllocator allocator, int location, boolean transpose, float[] value) {
        uniformMatrix4fv(allocator, location, value.length >> 4, transpose, value);
    }

    @Entrypoint("glUseProgram")
    default void useProgram(int program) {
        throw new ContextException();
    }

    @Entrypoint("glValidateProgram")
    default void validateProgram(int program) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib1d")
    default void vertexAttrib1d(int index, double x) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib1dv")
    default void vertexAttrib1dv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib1dv")
    default void vertexAttrib1dv(SegmentAllocator allocator, int index, double[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib1f")
    default void vertexAttrib1f(int index, float x) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib1fv")
    default void vertexAttrib1fv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib1fv")
    default void vertexAttrib1fv(SegmentAllocator allocator, int index, float[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib1s")
    default void vertexAttrib1s(int index, short x) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib1sv")
    default void vertexAttrib1sv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib1sv")
    default void vertexAttrib1sv(SegmentAllocator allocator, int index, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib2d")
    default void vertexAttrib2d(int index, double x, double y) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib2dv")
    default void vertexAttrib2dv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib2dv")
    default void vertexAttrib2dv(SegmentAllocator allocator, int index, double[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib2f")
    default void vertexAttrib2f(int index, float x, float y) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib2fv")
    default void vertexAttrib2fv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib2fv")
    default void vertexAttrib2fv(SegmentAllocator allocator, int index, float[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib2s")
    default void vertexAttrib2s(int index, short x, short y) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib2sv")
    default void vertexAttrib2sv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib2sv")
    default void vertexAttrib2sv(SegmentAllocator allocator, int index, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib3d")
    default void vertexAttrib3d(int index, double x, double y, double z) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib3dv")
    default void vertexAttrib3dv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib3dv")
    default void vertexAttrib3dv(SegmentAllocator allocator, int index, double[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib3f")
    default void vertexAttrib3f(int index, float x, float y, float z) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib3fv")
    default void vertexAttrib3fv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib3fv")
    default void vertexAttrib3fv(SegmentAllocator allocator, int index, float[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib3s")
    default void vertexAttrib3s(int index, short x, short y, short z) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib3sv")
    default void vertexAttrib3sv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib3sv")
    default void vertexAttrib3sv(SegmentAllocator allocator, int index, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4Nbv")
    default void vertexAttrib4Nbv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4Nbv")
    default void vertexAttrib4Nbv(SegmentAllocator allocator, int index, byte[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4Niv")
    default void vertexAttrib4Niv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4Niv")
    default void vertexAttrib4Niv(SegmentAllocator allocator, int index, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4Nsv")
    default void vertexAttrib4Nsv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4Nsv")
    default void vertexAttrib4Nsv(SegmentAllocator allocator, int index, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4Nub")
    default void vertexAttrib4Nub(int index, byte x, byte y, byte z, byte w) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4Nubv")
    default void vertexAttrib4Nubv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4Nubv")
    default void vertexAttrib4Nubv(SegmentAllocator allocator, int index, byte[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4Nuiv")
    default void vertexAttrib4Nuiv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4Nuiv")
    default void vertexAttrib4Nuiv(SegmentAllocator allocator, int index, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4Nusv")
    default void vertexAttrib4Nusv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4Nusv")
    default void vertexAttrib4Nusv(SegmentAllocator allocator, int index, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4bv")
    default void vertexAttrib4bv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4bv")
    default void vertexAttrib4bv(SegmentAllocator allocator, int index, byte[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4d")
    default void vertexAttrib4d(int index, double x, double y, double z, double w) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4dv")
    default void vertexAttrib4dv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4dv")
    default void vertexAttrib4dv(SegmentAllocator allocator, int index, double[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4f")
    default void vertexAttrib4f(int index, float x, float y, float z, float w) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4fv")
    default void vertexAttrib4fv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4fv")
    default void vertexAttrib4fv(SegmentAllocator allocator, int index, float[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4iv")
    default void vertexAttrib4iv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4iv")
    default void vertexAttrib4iv(SegmentAllocator allocator, int index, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4s")
    default void vertexAttrib4s(int index, short x, short y, short z, short w) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4sv")
    default void vertexAttrib4sv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4sv")
    default void vertexAttrib4sv(SegmentAllocator allocator, int index, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4ubv")
    default void vertexAttrib4ubv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4ubv")
    default void vertexAttrib4ubv(SegmentAllocator allocator, int index, byte[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4uiv")
    default void vertexAttrib4uiv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4uiv")
    default void vertexAttrib4uiv(SegmentAllocator allocator, int index, int[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4usv")
    default void vertexAttrib4usv(int index, MemorySegment v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttrib4usv")
    default void vertexAttrib4usv(SegmentAllocator allocator, int index, short[] v) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribPointer")
    default void vertexAttribPointer(int index, int size, int type, boolean normalized, int stride, MemorySegment pointer) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribPointer")
    default void vertexAttribPointer(SegmentAllocator allocator, int index, int size, int type, boolean normalized, int stride, byte[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribPointer")
    default void vertexAttribPointer(SegmentAllocator allocator, int index, int size, int type, boolean normalized, int stride, short[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribPointer")
    default void vertexAttribPointer(SegmentAllocator allocator, int index, int size, int type, boolean normalized, int stride, int[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribPointer")
    default void vertexAttribPointer(SegmentAllocator allocator, int index, int size, int type, boolean normalized, int stride, float[] pointer) {
        throw new ContextException();
    }

    @Entrypoint("glVertexAttribPointer")
    default void vertexAttribPointer(SegmentAllocator allocator, int index, int size, int type, boolean normalized, int stride, double[] pointer) {
        throw new ContextException();
    }
}

/*
 * MIT License
 *
 * Copyright (c) 2022-present Overrun Organization
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
package overrungl.opengl.ext.nv;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_NV_command_list}
 */
public final class GLNVCommandList {
    public static final int GL_TERMINATE_SEQUENCE_COMMAND_NV = 0x0000;
    public static final int GL_NOP_COMMAND_NV = 0x0001;
    public static final int GL_DRAW_ELEMENTS_COMMAND_NV = 0x0002;
    public static final int GL_DRAW_ARRAYS_COMMAND_NV = 0x0003;
    public static final int GL_DRAW_ELEMENTS_STRIP_COMMAND_NV = 0x0004;
    public static final int GL_DRAW_ARRAYS_STRIP_COMMAND_NV = 0x0005;
    public static final int GL_DRAW_ELEMENTS_INSTANCED_COMMAND_NV = 0x0006;
    public static final int GL_DRAW_ARRAYS_INSTANCED_COMMAND_NV = 0x0007;
    public static final int GL_ELEMENT_ADDRESS_COMMAND_NV = 0x0008;
    public static final int GL_ATTRIBUTE_ADDRESS_COMMAND_NV = 0x0009;
    public static final int GL_UNIFORM_ADDRESS_COMMAND_NV = 0x000A;
    public static final int GL_BLEND_COLOR_COMMAND_NV = 0x000B;
    public static final int GL_STENCIL_REF_COMMAND_NV = 0x000C;
    public static final int GL_LINE_WIDTH_COMMAND_NV = 0x000D;
    public static final int GL_POLYGON_OFFSET_COMMAND_NV = 0x000E;
    public static final int GL_ALPHA_REF_COMMAND_NV = 0x000F;
    public static final int GL_VIEWPORT_COMMAND_NV = 0x0010;
    public static final int GL_SCISSOR_COMMAND_NV = 0x0011;
    public static final int GL_FRONT_FACE_COMMAND_NV = 0x0012;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_command_list) return;
        ext.glCreateStatesNV = load.invoke("glCreateStatesNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glDeleteStatesNV = load.invoke("glDeleteStatesNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glIsStateNV = load.invoke("glIsStateNV", of(JAVA_BYTE, JAVA_INT));
        ext.glStateCaptureNV = load.invoke("glStateCaptureNV", ofVoid(JAVA_INT, JAVA_INT));
        ext.glGetCommandHeaderNV = load.invoke("glGetCommandHeaderNV", of(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glGetStageIndexNV = load.invoke("glGetStageIndexNV", of(JAVA_SHORT, JAVA_INT));
        ext.glDrawCommandsNV = load.invoke("glDrawCommandsNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, ADDRESS, JAVA_INT));
        ext.glDrawCommandsAddressNV = load.invoke("glDrawCommandsAddressNV", ofVoid(JAVA_INT, ADDRESS, ADDRESS, JAVA_INT));
        ext.glDrawCommandsStatesNV = load.invoke("glDrawCommandsStatesNV", ofVoid(JAVA_INT, ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_INT));
        ext.glDrawCommandsStatesAddressNV = load.invoke("glDrawCommandsStatesAddressNV", ofVoid(ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_INT));
        ext.glCreateCommandListsNV = load.invoke("glCreateCommandListsNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glDeleteCommandListsNV = load.invoke("glDeleteCommandListsNV", ofVoid(JAVA_INT, ADDRESS));
        ext.glIsCommandListNV = load.invoke("glIsCommandListNV", of(JAVA_BYTE, JAVA_INT));
        ext.glListDrawCommandsStatesClientNV = load.invoke("glListDrawCommandsStatesClientNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, ADDRESS, ADDRESS, ADDRESS, JAVA_INT));
        ext.glCommandListSegmentsNV = load.invoke("glCommandListSegmentsNV", ofVoid(JAVA_INT, JAVA_INT));
        ext.glCompileCommandListNV = load.invoke("glCompileCommandListNV", ofVoid(JAVA_INT));
        ext.glCallCommandListNV = load.invoke("glCallCommandListNV", ofVoid(JAVA_INT));
    }

    public static void glCreateStatesNV(int n, @NativeType("GLuint *") MemorySegment states) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCreateStatesNV).invokeExact(n, states);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDeleteStatesNV(int n, @NativeType("const GLuint *") MemorySegment states) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeleteStatesNV).invokeExact(n, states);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsStateNV(int state) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsStateNV).invokeExact(state);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glStateCaptureNV(int state, int mode) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glStateCaptureNV).invokeExact(state, mode);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glGetCommandHeaderNV(int tokenID, int size) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glGetCommandHeaderNV).invokeExact(tokenID, size);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static short glGetStageIndexNV(int shadertype) {
        final var ext = getExtCapabilities();
        try {
            return (short)
            check(ext.glGetStageIndexNV).invokeExact(shadertype);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDrawCommandsNV(int primitiveMode, int buffer, @NativeType("const GLintptr *") MemorySegment indirects, @NativeType("const GLsizei *") MemorySegment sizes, int count) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDrawCommandsNV).invokeExact(primitiveMode, buffer, indirects, sizes, count);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDrawCommandsAddressNV(int primitiveMode, @NativeType("const GLuint64 *") MemorySegment indirects, @NativeType("const GLsizei *") MemorySegment sizes, int count) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDrawCommandsAddressNV).invokeExact(primitiveMode, indirects, sizes, count);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDrawCommandsStatesNV(int buffer, @NativeType("const GLintptr *") MemorySegment indirects, @NativeType("const GLsizei *") MemorySegment sizes, @NativeType("const GLuint *") MemorySegment states, @NativeType("const GLuint *") MemorySegment fbos, int count) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDrawCommandsStatesNV).invokeExact(buffer, indirects, sizes, states, fbos, count);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDrawCommandsStatesAddressNV(@NativeType("const GLuint64 *") MemorySegment indirects, @NativeType("const GLsizei *") MemorySegment sizes, @NativeType("const GLuint *") MemorySegment states, @NativeType("const GLuint *") MemorySegment fbos, int count) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDrawCommandsStatesAddressNV).invokeExact(indirects, sizes, states, fbos, count);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCreateCommandListsNV(int n, @NativeType("GLuint *") MemorySegment lists) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCreateCommandListsNV).invokeExact(n, lists);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDeleteCommandListsNV(int n, @NativeType("const GLuint *") MemorySegment lists) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeleteCommandListsNV).invokeExact(n, lists);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsCommandListNV(int list) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsCommandListNV).invokeExact(list);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glListDrawCommandsStatesClientNV(int list, int segment, @NativeType("const void **") MemorySegment indirects, @NativeType("const GLsizei *") MemorySegment sizes, @NativeType("const GLuint *") MemorySegment states, @NativeType("const GLuint *") MemorySegment fbos, int count) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glListDrawCommandsStatesClientNV).invokeExact(list, segment, indirects, sizes, states, fbos, count);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCommandListSegmentsNV(int list, int segments) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCommandListSegmentsNV).invokeExact(list, segments);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCompileCommandListNV(int list) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCompileCommandListNV).invokeExact(list);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCallCommandListNV(int list) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCallCommandListNV).invokeExact(list);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}

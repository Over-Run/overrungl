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
 * {@code GL_NV_video_capture}
 */
public final class GLNVVideoCapture {
    public static final int GL_VIDEO_BUFFER_NV = 0x9020;
    public static final int GL_VIDEO_BUFFER_BINDING_NV = 0x9021;
    public static final int GL_FIELD_UPPER_NV = 0x9022;
    public static final int GL_FIELD_LOWER_NV = 0x9023;
    public static final int GL_NUM_VIDEO_CAPTURE_STREAMS_NV = 0x9024;
    public static final int GL_NEXT_VIDEO_CAPTURE_BUFFER_STATUS_NV = 0x9025;
    public static final int GL_VIDEO_CAPTURE_TO_422_SUPPORTED_NV = 0x9026;
    public static final int GL_LAST_VIDEO_CAPTURE_STATUS_NV = 0x9027;
    public static final int GL_VIDEO_BUFFER_PITCH_NV = 0x9028;
    public static final int GL_VIDEO_COLOR_CONVERSION_MATRIX_NV = 0x9029;
    public static final int GL_VIDEO_COLOR_CONVERSION_MAX_NV = 0x902A;
    public static final int GL_VIDEO_COLOR_CONVERSION_MIN_NV = 0x902B;
    public static final int GL_VIDEO_COLOR_CONVERSION_OFFSET_NV = 0x902C;
    public static final int GL_VIDEO_BUFFER_INTERNAL_FORMAT_NV = 0x902D;
    public static final int GL_PARTIAL_SUCCESS_NV = 0x902E;
    public static final int GL_SUCCESS_NV = 0x902F;
    public static final int GL_FAILURE_NV = 0x9030;
    public static final int GL_YCBYCR8_422_NV = 0x9031;
    public static final int GL_YCBAYCR8A_4224_NV = 0x9032;
    public static final int GL_Z6Y10Z6CB10Z6Y10Z6CR10_422_NV = 0x9033;
    public static final int GL_Z6Y10Z6CB10Z6A10Z6Y10Z6CR10Z6A10_4224_NV = 0x9034;
    public static final int GL_Z4Y12Z4CB12Z4Y12Z4CR12_422_NV = 0x9035;
    public static final int GL_Z4Y12Z4CB12Z4A12Z4Y12Z4CR12Z4A12_4224_NV = 0x9036;
    public static final int GL_Z4Y12Z4CB12Z4CR12_444_NV = 0x9037;
    public static final int GL_VIDEO_CAPTURE_FRAME_WIDTH_NV = 0x9038;
    public static final int GL_VIDEO_CAPTURE_FRAME_HEIGHT_NV = 0x9039;
    public static final int GL_VIDEO_CAPTURE_FIELD_UPPER_HEIGHT_NV = 0x903A;
    public static final int GL_VIDEO_CAPTURE_FIELD_LOWER_HEIGHT_NV = 0x903B;
    public static final int GL_VIDEO_CAPTURE_SURFACE_ORIGIN_NV = 0x903C;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_video_capture) return;
        ext.glBeginVideoCaptureNV = load.invoke("glBeginVideoCaptureNV", ofVoid(JAVA_INT));
        ext.glBindVideoCaptureStreamBufferNV = load.invoke("glBindVideoCaptureStreamBufferNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glBindVideoCaptureStreamTextureNV = load.invoke("glBindVideoCaptureStreamTextureNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glEndVideoCaptureNV = load.invoke("glEndVideoCaptureNV", ofVoid(JAVA_INT));
        ext.glGetVideoCaptureivNV = load.invoke("glGetVideoCaptureivNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetVideoCaptureStreamivNV = load.invoke("glGetVideoCaptureStreamivNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetVideoCaptureStreamfvNV = load.invoke("glGetVideoCaptureStreamfvNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetVideoCaptureStreamdvNV = load.invoke("glGetVideoCaptureStreamdvNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glVideoCaptureNV = load.invoke("glVideoCaptureNV", of(JAVA_INT, JAVA_INT, ADDRESS, ADDRESS));
        ext.glVideoCaptureStreamParameterivNV = load.invoke("glVideoCaptureStreamParameterivNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glVideoCaptureStreamParameterfvNV = load.invoke("glVideoCaptureStreamParameterfvNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glVideoCaptureStreamParameterdvNV = load.invoke("glVideoCaptureStreamParameterdvNV", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glBeginVideoCaptureNV(int video_capture_slot) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBeginVideoCaptureNV).invokeExact(video_capture_slot);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBindVideoCaptureStreamBufferNV(int video_capture_slot, int stream, int frame_region, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBindVideoCaptureStreamBufferNV).invokeExact(video_capture_slot, stream, frame_region, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBindVideoCaptureStreamTextureNV(int video_capture_slot, int stream, int frame_region, int target, int texture) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBindVideoCaptureStreamTextureNV).invokeExact(video_capture_slot, stream, frame_region, target, texture);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glEndVideoCaptureNV(int video_capture_slot) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glEndVideoCaptureNV).invokeExact(video_capture_slot);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVideoCaptureivNV(int video_capture_slot, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVideoCaptureivNV).invokeExact(video_capture_slot, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVideoCaptureStreamivNV(int video_capture_slot, int stream, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVideoCaptureStreamivNV).invokeExact(video_capture_slot, stream, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVideoCaptureStreamfvNV(int video_capture_slot, int stream, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVideoCaptureStreamfvNV).invokeExact(video_capture_slot, stream, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVideoCaptureStreamdvNV(int video_capture_slot, int stream, int pname, @NativeType("GLdouble *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVideoCaptureStreamdvNV).invokeExact(video_capture_slot, stream, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glVideoCaptureNV(int video_capture_slot, @NativeType("GLuint *") MemorySegment sequence_num, @NativeType("GLuint64EXT *") MemorySegment capture_time) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glVideoCaptureNV).invokeExact(video_capture_slot, sequence_num, capture_time);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVideoCaptureStreamParameterivNV(int video_capture_slot, int stream, int pname, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVideoCaptureStreamParameterivNV).invokeExact(video_capture_slot, stream, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVideoCaptureStreamParameterfvNV(int video_capture_slot, int stream, int pname, @NativeType("const GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVideoCaptureStreamParameterfvNV).invokeExact(video_capture_slot, stream, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVideoCaptureStreamParameterdvNV(int video_capture_slot, int stream, int pname, @NativeType("const GLdouble *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVideoCaptureStreamParameterdvNV).invokeExact(video_capture_slot, stream, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}

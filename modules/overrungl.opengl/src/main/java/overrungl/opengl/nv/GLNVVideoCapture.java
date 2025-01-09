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
package overrungl.opengl.nv;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

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
    public static final MethodHandle MH_glBeginVideoCaptureNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glBindVideoCaptureStreamBufferNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public static final MethodHandle MH_glBindVideoCaptureStreamTextureNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glEndVideoCaptureNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glGetVideoCaptureivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetVideoCaptureStreamivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetVideoCaptureStreamfvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glGetVideoCaptureStreamdvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVideoCaptureNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVideoCaptureStreamParameterivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVideoCaptureStreamParameterfvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public static final MethodHandle MH_glVideoCaptureStreamParameterdvNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glBeginVideoCaptureNV;
    public final MemorySegment PFN_glBindVideoCaptureStreamBufferNV;
    public final MemorySegment PFN_glBindVideoCaptureStreamTextureNV;
    public final MemorySegment PFN_glEndVideoCaptureNV;
    public final MemorySegment PFN_glGetVideoCaptureivNV;
    public final MemorySegment PFN_glGetVideoCaptureStreamivNV;
    public final MemorySegment PFN_glGetVideoCaptureStreamfvNV;
    public final MemorySegment PFN_glGetVideoCaptureStreamdvNV;
    public final MemorySegment PFN_glVideoCaptureNV;
    public final MemorySegment PFN_glVideoCaptureStreamParameterivNV;
    public final MemorySegment PFN_glVideoCaptureStreamParameterfvNV;
    public final MemorySegment PFN_glVideoCaptureStreamParameterdvNV;

    public GLNVVideoCapture(overrungl.opengl.GLLoadFunc func) {
        PFN_glBeginVideoCaptureNV = func.invoke("glBeginVideoCaptureNV");
        PFN_glBindVideoCaptureStreamBufferNV = func.invoke("glBindVideoCaptureStreamBufferNV");
        PFN_glBindVideoCaptureStreamTextureNV = func.invoke("glBindVideoCaptureStreamTextureNV");
        PFN_glEndVideoCaptureNV = func.invoke("glEndVideoCaptureNV");
        PFN_glGetVideoCaptureivNV = func.invoke("glGetVideoCaptureivNV");
        PFN_glGetVideoCaptureStreamivNV = func.invoke("glGetVideoCaptureStreamivNV");
        PFN_glGetVideoCaptureStreamfvNV = func.invoke("glGetVideoCaptureStreamfvNV");
        PFN_glGetVideoCaptureStreamdvNV = func.invoke("glGetVideoCaptureStreamdvNV");
        PFN_glVideoCaptureNV = func.invoke("glVideoCaptureNV");
        PFN_glVideoCaptureStreamParameterivNV = func.invoke("glVideoCaptureStreamParameterivNV");
        PFN_glVideoCaptureStreamParameterfvNV = func.invoke("glVideoCaptureStreamParameterfvNV");
        PFN_glVideoCaptureStreamParameterdvNV = func.invoke("glVideoCaptureStreamParameterdvNV");
    }

    public void BeginVideoCaptureNV(@CType("GLuint") int video_capture_slot) {
        if (Unmarshal.isNullPointer(PFN_glBeginVideoCaptureNV)) throw new SymbolNotFoundError("Symbol not found: glBeginVideoCaptureNV");
        try { MH_glBeginVideoCaptureNV.invokeExact(PFN_glBeginVideoCaptureNV, video_capture_slot); }
        catch (Throwable e) { throw new RuntimeException("error in glBeginVideoCaptureNV", e); }
    }

    public void BindVideoCaptureStreamBufferNV(@CType("GLuint") int video_capture_slot, @CType("GLuint") int stream, @CType("GLenum") int frame_region, @CType("GLintptrARB") long offset) {
        if (Unmarshal.isNullPointer(PFN_glBindVideoCaptureStreamBufferNV)) throw new SymbolNotFoundError("Symbol not found: glBindVideoCaptureStreamBufferNV");
        try { MH_glBindVideoCaptureStreamBufferNV.invokeExact(PFN_glBindVideoCaptureStreamBufferNV, video_capture_slot, stream, frame_region, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glBindVideoCaptureStreamBufferNV", e); }
    }

    public void BindVideoCaptureStreamTextureNV(@CType("GLuint") int video_capture_slot, @CType("GLuint") int stream, @CType("GLenum") int frame_region, @CType("GLenum") int target, @CType("GLuint") int texture) {
        if (Unmarshal.isNullPointer(PFN_glBindVideoCaptureStreamTextureNV)) throw new SymbolNotFoundError("Symbol not found: glBindVideoCaptureStreamTextureNV");
        try { MH_glBindVideoCaptureStreamTextureNV.invokeExact(PFN_glBindVideoCaptureStreamTextureNV, video_capture_slot, stream, frame_region, target, texture); }
        catch (Throwable e) { throw new RuntimeException("error in glBindVideoCaptureStreamTextureNV", e); }
    }

    public void EndVideoCaptureNV(@CType("GLuint") int video_capture_slot) {
        if (Unmarshal.isNullPointer(PFN_glEndVideoCaptureNV)) throw new SymbolNotFoundError("Symbol not found: glEndVideoCaptureNV");
        try { MH_glEndVideoCaptureNV.invokeExact(PFN_glEndVideoCaptureNV, video_capture_slot); }
        catch (Throwable e) { throw new RuntimeException("error in glEndVideoCaptureNV", e); }
    }

    public void GetVideoCaptureivNV(@CType("GLuint") int video_capture_slot, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetVideoCaptureivNV)) throw new SymbolNotFoundError("Symbol not found: glGetVideoCaptureivNV");
        try { MH_glGetVideoCaptureivNV.invokeExact(PFN_glGetVideoCaptureivNV, video_capture_slot, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVideoCaptureivNV", e); }
    }

    public void GetVideoCaptureStreamivNV(@CType("GLuint") int video_capture_slot, @CType("GLuint") int stream, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetVideoCaptureStreamivNV)) throw new SymbolNotFoundError("Symbol not found: glGetVideoCaptureStreamivNV");
        try { MH_glGetVideoCaptureStreamivNV.invokeExact(PFN_glGetVideoCaptureStreamivNV, video_capture_slot, stream, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVideoCaptureStreamivNV", e); }
    }

    public void GetVideoCaptureStreamfvNV(@CType("GLuint") int video_capture_slot, @CType("GLuint") int stream, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetVideoCaptureStreamfvNV)) throw new SymbolNotFoundError("Symbol not found: glGetVideoCaptureStreamfvNV");
        try { MH_glGetVideoCaptureStreamfvNV.invokeExact(PFN_glGetVideoCaptureStreamfvNV, video_capture_slot, stream, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVideoCaptureStreamfvNV", e); }
    }

    public void GetVideoCaptureStreamdvNV(@CType("GLuint") int video_capture_slot, @CType("GLuint") int stream, @CType("GLenum") int pname, @CType("GLdouble *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glGetVideoCaptureStreamdvNV)) throw new SymbolNotFoundError("Symbol not found: glGetVideoCaptureStreamdvNV");
        try { MH_glGetVideoCaptureStreamdvNV.invokeExact(PFN_glGetVideoCaptureStreamdvNV, video_capture_slot, stream, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVideoCaptureStreamdvNV", e); }
    }

    public @CType("GLenum") int VideoCaptureNV(@CType("GLuint") int video_capture_slot, @CType("GLuint *") java.lang.foreign.MemorySegment sequence_num, @CType("GLuint64EXT *") java.lang.foreign.MemorySegment capture_time) {
        if (Unmarshal.isNullPointer(PFN_glVideoCaptureNV)) throw new SymbolNotFoundError("Symbol not found: glVideoCaptureNV");
        try { return (int) MH_glVideoCaptureNV.invokeExact(PFN_glVideoCaptureNV, video_capture_slot, sequence_num, capture_time); }
        catch (Throwable e) { throw new RuntimeException("error in glVideoCaptureNV", e); }
    }

    public void VideoCaptureStreamParameterivNV(@CType("GLuint") int video_capture_slot, @CType("GLuint") int stream, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glVideoCaptureStreamParameterivNV)) throw new SymbolNotFoundError("Symbol not found: glVideoCaptureStreamParameterivNV");
        try { MH_glVideoCaptureStreamParameterivNV.invokeExact(PFN_glVideoCaptureStreamParameterivNV, video_capture_slot, stream, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glVideoCaptureStreamParameterivNV", e); }
    }

    public void VideoCaptureStreamParameterfvNV(@CType("GLuint") int video_capture_slot, @CType("GLuint") int stream, @CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glVideoCaptureStreamParameterfvNV)) throw new SymbolNotFoundError("Symbol not found: glVideoCaptureStreamParameterfvNV");
        try { MH_glVideoCaptureStreamParameterfvNV.invokeExact(PFN_glVideoCaptureStreamParameterfvNV, video_capture_slot, stream, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glVideoCaptureStreamParameterfvNV", e); }
    }

    public void VideoCaptureStreamParameterdvNV(@CType("GLuint") int video_capture_slot, @CType("GLuint") int stream, @CType("GLenum") int pname, @CType("const GLdouble *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(PFN_glVideoCaptureStreamParameterdvNV)) throw new SymbolNotFoundError("Symbol not found: glVideoCaptureStreamParameterdvNV");
        try { MH_glVideoCaptureStreamParameterdvNV.invokeExact(PFN_glVideoCaptureStreamParameterdvNV, video_capture_slot, stream, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glVideoCaptureStreamParameterdvNV", e); }
    }

}

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
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_video_capture}
 */
public interface GLNVVideoCapture {
    int GL_VIDEO_BUFFER_NV = 0x9020;
    int GL_VIDEO_BUFFER_BINDING_NV = 0x9021;
    int GL_FIELD_UPPER_NV = 0x9022;
    int GL_FIELD_LOWER_NV = 0x9023;
    int GL_NUM_VIDEO_CAPTURE_STREAMS_NV = 0x9024;
    int GL_NEXT_VIDEO_CAPTURE_BUFFER_STATUS_NV = 0x9025;
    int GL_VIDEO_CAPTURE_TO_422_SUPPORTED_NV = 0x9026;
    int GL_LAST_VIDEO_CAPTURE_STATUS_NV = 0x9027;
    int GL_VIDEO_BUFFER_PITCH_NV = 0x9028;
    int GL_VIDEO_COLOR_CONVERSION_MATRIX_NV = 0x9029;
    int GL_VIDEO_COLOR_CONVERSION_MAX_NV = 0x902A;
    int GL_VIDEO_COLOR_CONVERSION_MIN_NV = 0x902B;
    int GL_VIDEO_COLOR_CONVERSION_OFFSET_NV = 0x902C;
    int GL_VIDEO_BUFFER_INTERNAL_FORMAT_NV = 0x902D;
    int GL_PARTIAL_SUCCESS_NV = 0x902E;
    int GL_SUCCESS_NV = 0x902F;
    int GL_FAILURE_NV = 0x9030;
    int GL_YCBYCR8_422_NV = 0x9031;
    int GL_YCBAYCR8A_4224_NV = 0x9032;
    int GL_Z6Y10Z6CB10Z6Y10Z6CR10_422_NV = 0x9033;
    int GL_Z6Y10Z6CB10Z6A10Z6Y10Z6CR10Z6A10_4224_NV = 0x9034;
    int GL_Z4Y12Z4CB12Z4Y12Z4CR12_422_NV = 0x9035;
    int GL_Z4Y12Z4CB12Z4A12Z4Y12Z4CR12Z4A12_4224_NV = 0x9036;
    int GL_Z4Y12Z4CB12Z4CR12_444_NV = 0x9037;
    int GL_VIDEO_CAPTURE_FRAME_WIDTH_NV = 0x9038;
    int GL_VIDEO_CAPTURE_FRAME_HEIGHT_NV = 0x9039;
    int GL_VIDEO_CAPTURE_FIELD_UPPER_HEIGHT_NV = 0x903A;
    int GL_VIDEO_CAPTURE_FIELD_LOWER_HEIGHT_NV = 0x903B;
    int GL_VIDEO_CAPTURE_SURFACE_ORIGIN_NV = 0x903C;

    void glBeginVideoCaptureNV(int video_capture_slot);
    void glBindVideoCaptureStreamBufferNV(int video_capture_slot, int stream, int frame_region, long offset);
    void glBindVideoCaptureStreamTextureNV(int video_capture_slot, int stream, int frame_region, int target, int texture);
    void glEndVideoCaptureNV(int video_capture_slot);
    void glGetVideoCaptureivNV(int video_capture_slot, int pname, @NativeType("GLint *") MemorySegment params);
    void glGetVideoCaptureStreamivNV(int video_capture_slot, int stream, int pname, @NativeType("GLint *") MemorySegment params);
    void glGetVideoCaptureStreamfvNV(int video_capture_slot, int stream, int pname, @NativeType("GLfloat *") MemorySegment params);
    void glGetVideoCaptureStreamdvNV(int video_capture_slot, int stream, int pname, @NativeType("GLdouble *") MemorySegment params);
    int glVideoCaptureNV(int video_capture_slot, @NativeType("GLuint *") MemorySegment sequence_num, @NativeType("GLuint64EXT *") MemorySegment capture_time);
    void glVideoCaptureStreamParameterivNV(int video_capture_slot, int stream, int pname, @NativeType("const GLint *") MemorySegment params);
    void glVideoCaptureStreamParameterfvNV(int video_capture_slot, int stream, int pname, @NativeType("const GLfloat *") MemorySegment params);
    void glVideoCaptureStreamParameterdvNV(int video_capture_slot, int stream, int pname, @NativeType("const GLdouble *") MemorySegment params);
}

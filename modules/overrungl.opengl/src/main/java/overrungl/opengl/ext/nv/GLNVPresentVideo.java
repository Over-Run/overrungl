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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_present_video}
 */
public interface GLNVPresentVideo {
    int GL_FRAME_NV = 0x8E26;
    int GL_FIELDS_NV = 0x8E27;
    int GL_CURRENT_TIME_NV = 0x8E28;
    int GL_NUM_FILL_STREAMS_NV = 0x8E29;
    int GL_PRESENT_TIME_NV = 0x8E2A;
    int GL_PRESENT_DURATION_NV = 0x8E2B;

    default void glPresentFrameKeyedNV(int video_slot, long minPresentTime, int beginPresentTimeId, int presentDurationId, int type, int target0, int fill0, int key0, int target1, int fill1, int key1) {
        throw new ContextException();
    }

    default void glPresentFrameDualFillNV(int video_slot, long minPresentTime, int beginPresentTimeId, int presentDurationId, int type, int target0, int fill0, int target1, int fill1, int target2, int fill2, int target3, int fill3) {
        throw new ContextException();
    }

    default void glGetVideoivNV(int video_slot, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetVideouivNV(int video_slot, int pname, @NativeType("GLuint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetVideoi64vNV(int video_slot, int pname, @NativeType("GLint64EXT *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetVideoui64vNV(int video_slot, int pname, @NativeType("GLuint64EXT *") MemorySegment params) {
        throw new ContextException();
    }

}

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
 * {@code GL_NV_present_video}
 */
public final class GLNVPresentVideo {
    public static final int GL_FRAME_NV = 0x8E26;
    public static final int GL_FIELDS_NV = 0x8E27;
    public static final int GL_CURRENT_TIME_NV = 0x8E28;
    public static final int GL_NUM_FILL_STREAMS_NV = 0x8E29;
    public static final int GL_PRESENT_TIME_NV = 0x8E2A;
    public static final int GL_PRESENT_DURATION_NV = 0x8E2B;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_NV_present_video) return;
        ext.glPresentFrameKeyedNV = load.invoke("glPresentFrameKeyedNV", ofVoid(JAVA_INT, JAVA_LONG, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glPresentFrameDualFillNV = load.invoke("glPresentFrameDualFillNV", ofVoid(JAVA_INT, JAVA_LONG, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glGetVideoivNV = load.invoke("glGetVideoivNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetVideouivNV = load.invoke("glGetVideouivNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetVideoi64vNV = load.invoke("glGetVideoi64vNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetVideoui64vNV = load.invoke("glGetVideoui64vNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glPresentFrameKeyedNV(int video_slot, long minPresentTime, int beginPresentTimeId, int presentDurationId, int type, int target0, int fill0, int key0, int target1, int fill1, int key1) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPresentFrameKeyedNV).invokeExact(video_slot, minPresentTime, beginPresentTimeId, presentDurationId, type, target0, fill0, key0, target1, fill1, key1);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPresentFrameDualFillNV(int video_slot, long minPresentTime, int beginPresentTimeId, int presentDurationId, int type, int target0, int fill0, int target1, int fill1, int target2, int fill2, int target3, int fill3) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPresentFrameDualFillNV).invokeExact(video_slot, minPresentTime, beginPresentTimeId, presentDurationId, type, target0, fill0, target1, fill1, target2, fill2, target3, fill3);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVideoivNV(int video_slot, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVideoivNV).invokeExact(video_slot, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVideouivNV(int video_slot, int pname, @NativeType("GLuint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVideouivNV).invokeExact(video_slot, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVideoi64vNV(int video_slot, int pname, @NativeType("GLint64EXT *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVideoi64vNV).invokeExact(video_slot, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVideoui64vNV(int video_slot, int pname, @NativeType("GLuint64EXT *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVideoui64vNV).invokeExact(video_slot, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}

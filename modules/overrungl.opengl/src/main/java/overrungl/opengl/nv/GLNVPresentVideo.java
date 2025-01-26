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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVPresentVideo {
    public static final int GL_FRAME_NV = 0x8E26;
    public static final int GL_FIELDS_NV = 0x8E27;
    public static final int GL_CURRENT_TIME_NV = 0x8E28;
    public static final int GL_NUM_FILL_STREAMS_NV = 0x8E29;
    public static final int GL_PRESENT_TIME_NV = 0x8E2A;
    public static final int GL_PRESENT_DURATION_NV = 0x8E2B;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glPresentFrameKeyedNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glPresentFrameDualFillNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetVideoivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVideouivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVideoi64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVideoui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glPresentFrameKeyedNV;
        public final MemorySegment PFN_glPresentFrameDualFillNV;
        public final MemorySegment PFN_glGetVideoivNV;
        public final MemorySegment PFN_glGetVideouivNV;
        public final MemorySegment PFN_glGetVideoi64vNV;
        public final MemorySegment PFN_glGetVideoui64vNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glPresentFrameKeyedNV = func.invoke("glPresentFrameKeyedNV");
            PFN_glPresentFrameDualFillNV = func.invoke("glPresentFrameDualFillNV");
            PFN_glGetVideoivNV = func.invoke("glGetVideoivNV");
            PFN_glGetVideouivNV = func.invoke("glGetVideouivNV");
            PFN_glGetVideoi64vNV = func.invoke("glGetVideoi64vNV");
            PFN_glGetVideoui64vNV = func.invoke("glGetVideoui64vNV");
        }
    }

    public GLNVPresentVideo(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glPresentFrameKeyedNV(GLuint video_slot, GLuint64EXT minPresentTime, GLuint beginPresentTimeId, GLuint presentDurationId, GLenum type, GLenum target0, GLuint fill0, GLuint key0, GLenum target1, GLuint fill1, GLuint key1);
    /// ```
    public void PresentFrameKeyedNV(int video_slot, long minPresentTime, int beginPresentTimeId, int presentDurationId, int type, int target0, int fill0, int key0, int target1, int fill1, int key1) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPresentFrameKeyedNV)) throw new SymbolNotFoundError("Symbol not found: glPresentFrameKeyedNV");
        try { Handles.MH_glPresentFrameKeyedNV.invokeExact(handles.PFN_glPresentFrameKeyedNV, video_slot, minPresentTime, beginPresentTimeId, presentDurationId, type, target0, fill0, key0, target1, fill1, key1); }
        catch (Throwable e) { throw new RuntimeException("error in PresentFrameKeyedNV", e); }
    }

    /// ```
    /// void glPresentFrameDualFillNV(GLuint video_slot, GLuint64EXT minPresentTime, GLuint beginPresentTimeId, GLuint presentDurationId, GLenum type, GLenum target0, GLuint fill0, GLenum target1, GLuint fill1, GLenum target2, GLuint fill2, GLenum target3, GLuint fill3);
    /// ```
    public void PresentFrameDualFillNV(int video_slot, long minPresentTime, int beginPresentTimeId, int presentDurationId, int type, int target0, int fill0, int target1, int fill1, int target2, int fill2, int target3, int fill3) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPresentFrameDualFillNV)) throw new SymbolNotFoundError("Symbol not found: glPresentFrameDualFillNV");
        try { Handles.MH_glPresentFrameDualFillNV.invokeExact(handles.PFN_glPresentFrameDualFillNV, video_slot, minPresentTime, beginPresentTimeId, presentDurationId, type, target0, fill0, target1, fill1, target2, fill2, target3, fill3); }
        catch (Throwable e) { throw new RuntimeException("error in PresentFrameDualFillNV", e); }
    }

    /// ```
    /// void glGetVideoivNV(GLuint video_slot, GLenum pname, GLint* params);
    /// ```
    public void GetVideoivNV(int video_slot, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVideoivNV)) throw new SymbolNotFoundError("Symbol not found: glGetVideoivNV");
        try { Handles.MH_glGetVideoivNV.invokeExact(handles.PFN_glGetVideoivNV, video_slot, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVideoivNV", e); }
    }

    /// ```
    /// void glGetVideouivNV(GLuint video_slot, GLenum pname, GLuint* params);
    /// ```
    public void GetVideouivNV(int video_slot, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVideouivNV)) throw new SymbolNotFoundError("Symbol not found: glGetVideouivNV");
        try { Handles.MH_glGetVideouivNV.invokeExact(handles.PFN_glGetVideouivNV, video_slot, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVideouivNV", e); }
    }

    /// ```
    /// void glGetVideoi64vNV(GLuint video_slot, GLenum pname, GLint64EXT* params);
    /// ```
    public void GetVideoi64vNV(int video_slot, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVideoi64vNV)) throw new SymbolNotFoundError("Symbol not found: glGetVideoi64vNV");
        try { Handles.MH_glGetVideoi64vNV.invokeExact(handles.PFN_glGetVideoi64vNV, video_slot, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVideoi64vNV", e); }
    }

    /// ```
    /// void glGetVideoui64vNV(GLuint video_slot, GLenum pname, GLuint64EXT* params);
    /// ```
    public void GetVideoui64vNV(int video_slot, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVideoui64vNV)) throw new SymbolNotFoundError("Symbol not found: glGetVideoui64vNV");
        try { Handles.MH_glGetVideoui64vNV.invokeExact(handles.PFN_glGetVideoui64vNV, video_slot, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVideoui64vNV", e); }
    }

}

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

public final class GLNVPresentVideo {
    public static final int GL_FRAME_NV = 0x8E26;
    public static final int GL_FIELDS_NV = 0x8E27;
    public static final int GL_CURRENT_TIME_NV = 0x8E28;
    public static final int GL_NUM_FILL_STREAMS_NV = 0x8E29;
    public static final int GL_PRESENT_TIME_NV = 0x8E2A;
    public static final int GL_PRESENT_DURATION_NV = 0x8E2B;
    public static final MethodHandle MH_glPresentFrameKeyedNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glPresentFrameKeyedNV;
    public static final MethodHandle MH_glPresentFrameDualFillNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glPresentFrameDualFillNV;
    public static final MethodHandle MH_glGetVideoivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetVideoivNV;
    public static final MethodHandle MH_glGetVideouivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetVideouivNV;
    public static final MethodHandle MH_glGetVideoi64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetVideoi64vNV;
    public static final MethodHandle MH_glGetVideoui64vNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetVideoui64vNV;

    public GLNVPresentVideo(overrungl.opengl.GLLoadFunc func) {
        PFN_glPresentFrameKeyedNV = func.invoke("glPresentFrameKeyedNV");
        PFN_glPresentFrameDualFillNV = func.invoke("glPresentFrameDualFillNV");
        PFN_glGetVideoivNV = func.invoke("glGetVideoivNV");
        PFN_glGetVideouivNV = func.invoke("glGetVideouivNV");
        PFN_glGetVideoi64vNV = func.invoke("glGetVideoi64vNV");
        PFN_glGetVideoui64vNV = func.invoke("glGetVideoui64vNV");
    }

    public void PresentFrameKeyedNV(@CType("GLuint") int video_slot, @CType("GLuint64EXT") long minPresentTime, @CType("GLuint") int beginPresentTimeId, @CType("GLuint") int presentDurationId, @CType("GLenum") int type, @CType("GLenum") int target0, @CType("GLuint") int fill0, @CType("GLuint") int key0, @CType("GLenum") int target1, @CType("GLuint") int fill1, @CType("GLuint") int key1) {
        if (!Unmarshal.isNullPointer(PFN_glPresentFrameKeyedNV)) { try {
            MH_glPresentFrameKeyedNV.invokeExact(PFN_glPresentFrameKeyedNV, video_slot, minPresentTime, beginPresentTimeId, presentDurationId, type, target0, fill0, key0, target1, fill1, key1);
        } catch (Throwable e) { throw new RuntimeException("error in glPresentFrameKeyedNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glPresentFrameKeyedNV"); }
    }

    public void PresentFrameDualFillNV(@CType("GLuint") int video_slot, @CType("GLuint64EXT") long minPresentTime, @CType("GLuint") int beginPresentTimeId, @CType("GLuint") int presentDurationId, @CType("GLenum") int type, @CType("GLenum") int target0, @CType("GLuint") int fill0, @CType("GLenum") int target1, @CType("GLuint") int fill1, @CType("GLenum") int target2, @CType("GLuint") int fill2, @CType("GLenum") int target3, @CType("GLuint") int fill3) {
        if (!Unmarshal.isNullPointer(PFN_glPresentFrameDualFillNV)) { try {
            MH_glPresentFrameDualFillNV.invokeExact(PFN_glPresentFrameDualFillNV, video_slot, minPresentTime, beginPresentTimeId, presentDurationId, type, target0, fill0, target1, fill1, target2, fill2, target3, fill3);
        } catch (Throwable e) { throw new RuntimeException("error in glPresentFrameDualFillNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glPresentFrameDualFillNV"); }
    }

    public void GetVideoivNV(@CType("GLuint") int video_slot, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetVideoivNV)) { try {
            MH_glGetVideoivNV.invokeExact(PFN_glGetVideoivNV, video_slot, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetVideoivNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetVideoivNV"); }
    }

    public void GetVideouivNV(@CType("GLuint") int video_slot, @CType("GLenum") int pname, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetVideouivNV)) { try {
            MH_glGetVideouivNV.invokeExact(PFN_glGetVideouivNV, video_slot, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetVideouivNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetVideouivNV"); }
    }

    public void GetVideoi64vNV(@CType("GLuint") int video_slot, @CType("GLenum") int pname, @CType("GLint64EXT *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetVideoi64vNV)) { try {
            MH_glGetVideoi64vNV.invokeExact(PFN_glGetVideoi64vNV, video_slot, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetVideoi64vNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetVideoi64vNV"); }
    }

    public void GetVideoui64vNV(@CType("GLuint") int video_slot, @CType("GLenum") int pname, @CType("GLuint64EXT *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetVideoui64vNV)) { try {
            MH_glGetVideoui64vNV.invokeExact(PFN_glGetVideoui64vNV, video_slot, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetVideoui64vNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetVideoui64vNV"); }
    }

}

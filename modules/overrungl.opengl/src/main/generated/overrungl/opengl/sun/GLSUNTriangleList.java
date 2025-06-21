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
package overrungl.opengl.sun;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLSUNTriangleList {
    public static final int GL_RESTART_SUN = 0x0001;
    public static final int GL_REPLACE_MIDDLE_SUN = 0x0002;
    public static final int GL_REPLACE_OLDEST_SUN = 0x0003;
    public static final int GL_TRIANGLE_LIST_SUN = 0x81D7;
    public static final int GL_REPLACEMENT_CODE_SUN = 0x81D8;
    public static final int GL_REPLACEMENT_CODE_ARRAY_SUN = 0x85C0;
    public static final int GL_REPLACEMENT_CODE_ARRAY_TYPE_SUN = 0x85C1;
    public static final int GL_REPLACEMENT_CODE_ARRAY_STRIDE_SUN = 0x85C2;
    public static final int GL_REPLACEMENT_CODE_ARRAY_POINTER_SUN = 0x85C3;
    public static final int GL_R1UI_V3F_SUN = 0x85C4;
    public static final int GL_R1UI_C4UB_V3F_SUN = 0x85C5;
    public static final int GL_R1UI_C3F_V3F_SUN = 0x85C6;
    public static final int GL_R1UI_N3F_V3F_SUN = 0x85C7;
    public static final int GL_R1UI_C4F_N3F_V3F_SUN = 0x85C8;
    public static final int GL_R1UI_T2F_V3F_SUN = 0x85C9;
    public static final int GL_R1UI_T2F_N3F_V3F_SUN = 0x85CA;
    public static final int GL_R1UI_T2F_C4F_N3F_V3F_SUN = 0x85CB;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glReplacementCodeuiSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glReplacementCodeusSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glReplacementCodeubSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glReplacementCodeuivSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glReplacementCodeusvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glReplacementCodeubvSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glReplacementCodePointerSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glReplacementCodeuiSUN;
        public final MemorySegment PFN_glReplacementCodeusSUN;
        public final MemorySegment PFN_glReplacementCodeubSUN;
        public final MemorySegment PFN_glReplacementCodeuivSUN;
        public final MemorySegment PFN_glReplacementCodeusvSUN;
        public final MemorySegment PFN_glReplacementCodeubvSUN;
        public final MemorySegment PFN_glReplacementCodePointerSUN;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glReplacementCodeuiSUN = func.invoke("glReplacementCodeuiSUN");
            PFN_glReplacementCodeusSUN = func.invoke("glReplacementCodeusSUN");
            PFN_glReplacementCodeubSUN = func.invoke("glReplacementCodeubSUN");
            PFN_glReplacementCodeuivSUN = func.invoke("glReplacementCodeuivSUN");
            PFN_glReplacementCodeusvSUN = func.invoke("glReplacementCodeusvSUN");
            PFN_glReplacementCodeubvSUN = func.invoke("glReplacementCodeubvSUN");
            PFN_glReplacementCodePointerSUN = func.invoke("glReplacementCodePointerSUN");
        }
    }

    public GLSUNTriangleList(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glReplacementCodeuiSUN((unsigned int) GLuint code);
    /// ```
    public void ReplacementCodeuiSUN(int code) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuiSUN)) throw new GLSymbolNotFoundError("Symbol not found: glReplacementCodeuiSUN");
        try { Handles.MH_glReplacementCodeuiSUN.invokeExact(handles.PFN_glReplacementCodeuiSUN, code); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuiSUN", e); }
    }

    /// ```
    /// void glReplacementCodeusSUN(((unsigned short) khronos_uint16_t) GLushort code);
    /// ```
    public void ReplacementCodeusSUN(short code) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeusSUN)) throw new GLSymbolNotFoundError("Symbol not found: glReplacementCodeusSUN");
        try { Handles.MH_glReplacementCodeusSUN.invokeExact(handles.PFN_glReplacementCodeusSUN, code); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeusSUN", e); }
    }

    /// ```
    /// void glReplacementCodeubSUN(((unsigned char) khronos_uint8_t) GLubyte code);
    /// ```
    public void ReplacementCodeubSUN(byte code) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeubSUN)) throw new GLSymbolNotFoundError("Symbol not found: glReplacementCodeubSUN");
        try { Handles.MH_glReplacementCodeubSUN.invokeExact(handles.PFN_glReplacementCodeubSUN, code); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeubSUN", e); }
    }

    /// ```
    /// void glReplacementCodeuivSUN(const GLuint* code);
    /// ```
    public void ReplacementCodeuivSUN(MemorySegment code) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeuivSUN)) throw new GLSymbolNotFoundError("Symbol not found: glReplacementCodeuivSUN");
        try { Handles.MH_glReplacementCodeuivSUN.invokeExact(handles.PFN_glReplacementCodeuivSUN, code); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeuivSUN", e); }
    }

    /// ```
    /// void glReplacementCodeusvSUN(const GLushort* code);
    /// ```
    public void ReplacementCodeusvSUN(MemorySegment code) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeusvSUN)) throw new GLSymbolNotFoundError("Symbol not found: glReplacementCodeusvSUN");
        try { Handles.MH_glReplacementCodeusvSUN.invokeExact(handles.PFN_glReplacementCodeusvSUN, code); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeusvSUN", e); }
    }

    /// ```
    /// void glReplacementCodeubvSUN(const GLubyte* code);
    /// ```
    public void ReplacementCodeubvSUN(MemorySegment code) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodeubvSUN)) throw new GLSymbolNotFoundError("Symbol not found: glReplacementCodeubvSUN");
        try { Handles.MH_glReplacementCodeubvSUN.invokeExact(handles.PFN_glReplacementCodeubvSUN, code); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodeubvSUN", e); }
    }

    /// ```
    /// void glReplacementCodePointerSUN((unsigned int) GLenum type, (int) GLsizei stride, const void** pointer);
    /// ```
    public void ReplacementCodePointerSUN(int type, int stride, MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReplacementCodePointerSUN)) throw new GLSymbolNotFoundError("Symbol not found: glReplacementCodePointerSUN");
        try { Handles.MH_glReplacementCodePointerSUN.invokeExact(handles.PFN_glReplacementCodePointerSUN, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in ReplacementCodePointerSUN", e); }
    }

}

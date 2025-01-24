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
package overrungl.opengl.ext;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTHistogram {
    public static final int GL_HISTOGRAM_EXT = 0x8024;
    public static final int GL_PROXY_HISTOGRAM_EXT = 0x8025;
    public static final int GL_HISTOGRAM_WIDTH_EXT = 0x8026;
    public static final int GL_HISTOGRAM_FORMAT_EXT = 0x8027;
    public static final int GL_HISTOGRAM_RED_SIZE_EXT = 0x8028;
    public static final int GL_HISTOGRAM_GREEN_SIZE_EXT = 0x8029;
    public static final int GL_HISTOGRAM_BLUE_SIZE_EXT = 0x802A;
    public static final int GL_HISTOGRAM_ALPHA_SIZE_EXT = 0x802B;
    public static final int GL_HISTOGRAM_LUMINANCE_SIZE_EXT = 0x802C;
    public static final int GL_HISTOGRAM_SINK_EXT = 0x802D;
    public static final int GL_MINMAX_EXT = 0x802E;
    public static final int GL_MINMAX_FORMAT_EXT = 0x802F;
    public static final int GL_MINMAX_SINK_EXT = 0x8030;
    public static final int GL_TABLE_TOO_LARGE_EXT = 0x8031;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGetHistogramEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetHistogramParameterfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetHistogramParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetMinmaxEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetMinmaxParameterfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetMinmaxParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glHistogramEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glMinmaxEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glResetHistogramEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glResetMinmaxEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glGetHistogramEXT;
        public final MemorySegment PFN_glGetHistogramParameterfvEXT;
        public final MemorySegment PFN_glGetHistogramParameterivEXT;
        public final MemorySegment PFN_glGetMinmaxEXT;
        public final MemorySegment PFN_glGetMinmaxParameterfvEXT;
        public final MemorySegment PFN_glGetMinmaxParameterivEXT;
        public final MemorySegment PFN_glHistogramEXT;
        public final MemorySegment PFN_glMinmaxEXT;
        public final MemorySegment PFN_glResetHistogramEXT;
        public final MemorySegment PFN_glResetMinmaxEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glGetHistogramEXT = func.invoke("glGetHistogramEXT");
            PFN_glGetHistogramParameterfvEXT = func.invoke("glGetHistogramParameterfvEXT");
            PFN_glGetHistogramParameterivEXT = func.invoke("glGetHistogramParameterivEXT");
            PFN_glGetMinmaxEXT = func.invoke("glGetMinmaxEXT");
            PFN_glGetMinmaxParameterfvEXT = func.invoke("glGetMinmaxParameterfvEXT");
            PFN_glGetMinmaxParameterivEXT = func.invoke("glGetMinmaxParameterivEXT");
            PFN_glHistogramEXT = func.invoke("glHistogramEXT", "glHistogram");
            PFN_glMinmaxEXT = func.invoke("glMinmaxEXT", "glMinmax");
            PFN_glResetHistogramEXT = func.invoke("glResetHistogramEXT", "glResetHistogram");
            PFN_glResetMinmaxEXT = func.invoke("glResetMinmaxEXT", "glResetMinmax");
        }
    }

    public GLEXTHistogram(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glGetHistogramEXT(unsigned int target, GLboolean reset, unsigned int format, unsigned int type, void* values);
    /// ```
    public void GetHistogramEXT(int target, boolean reset, int format, int type, MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetHistogramEXT)) throw new SymbolNotFoundError("Symbol not found: glGetHistogramEXT");
        try { Handles.MH_glGetHistogramEXT.invokeExact(handles.PFN_glGetHistogramEXT, target, ((reset) ? (byte)1 : (byte)0), format, type, values); }
        catch (Throwable e) { throw new RuntimeException("error in GetHistogramEXT", e); }
    }

    /// ```
    /// void glGetHistogramParameterfvEXT(unsigned int target, unsigned int pname, GLfloat* params);
    /// ```
    public void GetHistogramParameterfvEXT(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetHistogramParameterfvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetHistogramParameterfvEXT");
        try { Handles.MH_glGetHistogramParameterfvEXT.invokeExact(handles.PFN_glGetHistogramParameterfvEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetHistogramParameterfvEXT", e); }
    }

    /// ```
    /// void glGetHistogramParameterivEXT(unsigned int target, unsigned int pname, GLint* params);
    /// ```
    public void GetHistogramParameterivEXT(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetHistogramParameterivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetHistogramParameterivEXT");
        try { Handles.MH_glGetHistogramParameterivEXT.invokeExact(handles.PFN_glGetHistogramParameterivEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetHistogramParameterivEXT", e); }
    }

    /// ```
    /// void glGetMinmaxEXT(unsigned int target, GLboolean reset, unsigned int format, unsigned int type, void* values);
    /// ```
    public void GetMinmaxEXT(int target, boolean reset, int format, int type, MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMinmaxEXT)) throw new SymbolNotFoundError("Symbol not found: glGetMinmaxEXT");
        try { Handles.MH_glGetMinmaxEXT.invokeExact(handles.PFN_glGetMinmaxEXT, target, ((reset) ? (byte)1 : (byte)0), format, type, values); }
        catch (Throwable e) { throw new RuntimeException("error in GetMinmaxEXT", e); }
    }

    /// ```
    /// void glGetMinmaxParameterfvEXT(unsigned int target, unsigned int pname, GLfloat* params);
    /// ```
    public void GetMinmaxParameterfvEXT(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMinmaxParameterfvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetMinmaxParameterfvEXT");
        try { Handles.MH_glGetMinmaxParameterfvEXT.invokeExact(handles.PFN_glGetMinmaxParameterfvEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetMinmaxParameterfvEXT", e); }
    }

    /// ```
    /// void glGetMinmaxParameterivEXT(unsigned int target, unsigned int pname, GLint* params);
    /// ```
    public void GetMinmaxParameterivEXT(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMinmaxParameterivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetMinmaxParameterivEXT");
        try { Handles.MH_glGetMinmaxParameterivEXT.invokeExact(handles.PFN_glGetMinmaxParameterivEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetMinmaxParameterivEXT", e); }
    }

    /// ```
    /// void glHistogramEXT(unsigned int target, int width, unsigned int internalformat, GLboolean sink);
    /// ```
    public void HistogramEXT(int target, int width, int internalformat, boolean sink) {
        if (MemoryUtil.isNullPointer(handles.PFN_glHistogramEXT)) throw new SymbolNotFoundError("Symbol not found: glHistogramEXT");
        try { Handles.MH_glHistogramEXT.invokeExact(handles.PFN_glHistogramEXT, target, width, internalformat, ((sink) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in HistogramEXT", e); }
    }

    /// ```
    /// void glMinmaxEXT(unsigned int target, unsigned int internalformat, GLboolean sink);
    /// ```
    public void MinmaxEXT(int target, int internalformat, boolean sink) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMinmaxEXT)) throw new SymbolNotFoundError("Symbol not found: glMinmaxEXT");
        try { Handles.MH_glMinmaxEXT.invokeExact(handles.PFN_glMinmaxEXT, target, internalformat, ((sink) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in MinmaxEXT", e); }
    }

    /// ```
    /// void glResetHistogramEXT(unsigned int target);
    /// ```
    public void ResetHistogramEXT(int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glResetHistogramEXT)) throw new SymbolNotFoundError("Symbol not found: glResetHistogramEXT");
        try { Handles.MH_glResetHistogramEXT.invokeExact(handles.PFN_glResetHistogramEXT, target); }
        catch (Throwable e) { throw new RuntimeException("error in ResetHistogramEXT", e); }
    }

    /// ```
    /// void glResetMinmaxEXT(unsigned int target);
    /// ```
    public void ResetMinmaxEXT(int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glResetMinmaxEXT)) throw new SymbolNotFoundError("Symbol not found: glResetMinmaxEXT");
        try { Handles.MH_glResetMinmaxEXT.invokeExact(handles.PFN_glResetMinmaxEXT, target); }
        catch (Throwable e) { throw new RuntimeException("error in ResetMinmaxEXT", e); }
    }

}

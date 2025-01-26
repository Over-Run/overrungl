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
package overrungl.opengl.oes;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLOESByteCoordinates {
    public static final int GL_BYTE = 0x1400;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glMultiTexCoord1bOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glMultiTexCoord1bvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord2bOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glMultiTexCoord2bvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord3bOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glMultiTexCoord3bvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoord4bOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glMultiTexCoord4bvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexCoord1bOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glTexCoord1bvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexCoord2bOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glTexCoord2bvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexCoord3bOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glTexCoord3bvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexCoord4bOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glTexCoord4bvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertex2bOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glVertex2bvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertex3bOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glVertex3bvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertex4bOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glVertex4bvOES = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public final MemorySegment PFN_glMultiTexCoord1bOES;
        public final MemorySegment PFN_glMultiTexCoord1bvOES;
        public final MemorySegment PFN_glMultiTexCoord2bOES;
        public final MemorySegment PFN_glMultiTexCoord2bvOES;
        public final MemorySegment PFN_glMultiTexCoord3bOES;
        public final MemorySegment PFN_glMultiTexCoord3bvOES;
        public final MemorySegment PFN_glMultiTexCoord4bOES;
        public final MemorySegment PFN_glMultiTexCoord4bvOES;
        public final MemorySegment PFN_glTexCoord1bOES;
        public final MemorySegment PFN_glTexCoord1bvOES;
        public final MemorySegment PFN_glTexCoord2bOES;
        public final MemorySegment PFN_glTexCoord2bvOES;
        public final MemorySegment PFN_glTexCoord3bOES;
        public final MemorySegment PFN_glTexCoord3bvOES;
        public final MemorySegment PFN_glTexCoord4bOES;
        public final MemorySegment PFN_glTexCoord4bvOES;
        public final MemorySegment PFN_glVertex2bOES;
        public final MemorySegment PFN_glVertex2bvOES;
        public final MemorySegment PFN_glVertex3bOES;
        public final MemorySegment PFN_glVertex3bvOES;
        public final MemorySegment PFN_glVertex4bOES;
        public final MemorySegment PFN_glVertex4bvOES;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glMultiTexCoord1bOES = func.invoke("glMultiTexCoord1bOES");
            PFN_glMultiTexCoord1bvOES = func.invoke("glMultiTexCoord1bvOES");
            PFN_glMultiTexCoord2bOES = func.invoke("glMultiTexCoord2bOES");
            PFN_glMultiTexCoord2bvOES = func.invoke("glMultiTexCoord2bvOES");
            PFN_glMultiTexCoord3bOES = func.invoke("glMultiTexCoord3bOES");
            PFN_glMultiTexCoord3bvOES = func.invoke("glMultiTexCoord3bvOES");
            PFN_glMultiTexCoord4bOES = func.invoke("glMultiTexCoord4bOES");
            PFN_glMultiTexCoord4bvOES = func.invoke("glMultiTexCoord4bvOES");
            PFN_glTexCoord1bOES = func.invoke("glTexCoord1bOES");
            PFN_glTexCoord1bvOES = func.invoke("glTexCoord1bvOES");
            PFN_glTexCoord2bOES = func.invoke("glTexCoord2bOES");
            PFN_glTexCoord2bvOES = func.invoke("glTexCoord2bvOES");
            PFN_glTexCoord3bOES = func.invoke("glTexCoord3bOES");
            PFN_glTexCoord3bvOES = func.invoke("glTexCoord3bvOES");
            PFN_glTexCoord4bOES = func.invoke("glTexCoord4bOES");
            PFN_glTexCoord4bvOES = func.invoke("glTexCoord4bvOES");
            PFN_glVertex2bOES = func.invoke("glVertex2bOES");
            PFN_glVertex2bvOES = func.invoke("glVertex2bvOES");
            PFN_glVertex3bOES = func.invoke("glVertex3bOES");
            PFN_glVertex3bvOES = func.invoke("glVertex3bvOES");
            PFN_glVertex4bOES = func.invoke("glVertex4bOES");
            PFN_glVertex4bvOES = func.invoke("glVertex4bvOES");
        }
    }

    public GLOESByteCoordinates(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glMultiTexCoord1bOES(GLenum texture, GLbyte s);
    /// ```
    public void MultiTexCoord1bOES(int texture, byte s) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord1bOES)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord1bOES");
        try { Handles.MH_glMultiTexCoord1bOES.invokeExact(handles.PFN_glMultiTexCoord1bOES, texture, s); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord1bOES", e); }
    }

    /// ```
    /// void glMultiTexCoord1bvOES(GLenum texture, const GLbyte* coords);
    /// ```
    public void MultiTexCoord1bvOES(int texture, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord1bvOES)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord1bvOES");
        try { Handles.MH_glMultiTexCoord1bvOES.invokeExact(handles.PFN_glMultiTexCoord1bvOES, texture, coords); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord1bvOES", e); }
    }

    /// ```
    /// void glMultiTexCoord2bOES(GLenum texture, GLbyte s, GLbyte t);
    /// ```
    public void MultiTexCoord2bOES(int texture, byte s, byte t) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord2bOES)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord2bOES");
        try { Handles.MH_glMultiTexCoord2bOES.invokeExact(handles.PFN_glMultiTexCoord2bOES, texture, s, t); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord2bOES", e); }
    }

    /// ```
    /// void glMultiTexCoord2bvOES(GLenum texture, const GLbyte* coords);
    /// ```
    public void MultiTexCoord2bvOES(int texture, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord2bvOES)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord2bvOES");
        try { Handles.MH_glMultiTexCoord2bvOES.invokeExact(handles.PFN_glMultiTexCoord2bvOES, texture, coords); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord2bvOES", e); }
    }

    /// ```
    /// void glMultiTexCoord3bOES(GLenum texture, GLbyte s, GLbyte t, GLbyte r);
    /// ```
    public void MultiTexCoord3bOES(int texture, byte s, byte t, byte r) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord3bOES)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord3bOES");
        try { Handles.MH_glMultiTexCoord3bOES.invokeExact(handles.PFN_glMultiTexCoord3bOES, texture, s, t, r); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord3bOES", e); }
    }

    /// ```
    /// void glMultiTexCoord3bvOES(GLenum texture, const GLbyte* coords);
    /// ```
    public void MultiTexCoord3bvOES(int texture, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord3bvOES)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord3bvOES");
        try { Handles.MH_glMultiTexCoord3bvOES.invokeExact(handles.PFN_glMultiTexCoord3bvOES, texture, coords); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord3bvOES", e); }
    }

    /// ```
    /// void glMultiTexCoord4bOES(GLenum texture, GLbyte s, GLbyte t, GLbyte r, GLbyte q);
    /// ```
    public void MultiTexCoord4bOES(int texture, byte s, byte t, byte r, byte q) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord4bOES)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord4bOES");
        try { Handles.MH_glMultiTexCoord4bOES.invokeExact(handles.PFN_glMultiTexCoord4bOES, texture, s, t, r, q); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord4bOES", e); }
    }

    /// ```
    /// void glMultiTexCoord4bvOES(GLenum texture, const GLbyte* coords);
    /// ```
    public void MultiTexCoord4bvOES(int texture, MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoord4bvOES)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoord4bvOES");
        try { Handles.MH_glMultiTexCoord4bvOES.invokeExact(handles.PFN_glMultiTexCoord4bvOES, texture, coords); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoord4bvOES", e); }
    }

    /// ```
    /// void glTexCoord1bOES(GLbyte s);
    /// ```
    public void TexCoord1bOES(byte s) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord1bOES)) throw new SymbolNotFoundError("Symbol not found: glTexCoord1bOES");
        try { Handles.MH_glTexCoord1bOES.invokeExact(handles.PFN_glTexCoord1bOES, s); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord1bOES", e); }
    }

    /// ```
    /// void glTexCoord1bvOES(const GLbyte* coords);
    /// ```
    public void TexCoord1bvOES(MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord1bvOES)) throw new SymbolNotFoundError("Symbol not found: glTexCoord1bvOES");
        try { Handles.MH_glTexCoord1bvOES.invokeExact(handles.PFN_glTexCoord1bvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord1bvOES", e); }
    }

    /// ```
    /// void glTexCoord2bOES(GLbyte s, GLbyte t);
    /// ```
    public void TexCoord2bOES(byte s, byte t) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2bOES)) throw new SymbolNotFoundError("Symbol not found: glTexCoord2bOES");
        try { Handles.MH_glTexCoord2bOES.invokeExact(handles.PFN_glTexCoord2bOES, s, t); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2bOES", e); }
    }

    /// ```
    /// void glTexCoord2bvOES(const GLbyte* coords);
    /// ```
    public void TexCoord2bvOES(MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord2bvOES)) throw new SymbolNotFoundError("Symbol not found: glTexCoord2bvOES");
        try { Handles.MH_glTexCoord2bvOES.invokeExact(handles.PFN_glTexCoord2bvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord2bvOES", e); }
    }

    /// ```
    /// void glTexCoord3bOES(GLbyte s, GLbyte t, GLbyte r);
    /// ```
    public void TexCoord3bOES(byte s, byte t, byte r) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord3bOES)) throw new SymbolNotFoundError("Symbol not found: glTexCoord3bOES");
        try { Handles.MH_glTexCoord3bOES.invokeExact(handles.PFN_glTexCoord3bOES, s, t, r); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord3bOES", e); }
    }

    /// ```
    /// void glTexCoord3bvOES(const GLbyte* coords);
    /// ```
    public void TexCoord3bvOES(MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord3bvOES)) throw new SymbolNotFoundError("Symbol not found: glTexCoord3bvOES");
        try { Handles.MH_glTexCoord3bvOES.invokeExact(handles.PFN_glTexCoord3bvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord3bvOES", e); }
    }

    /// ```
    /// void glTexCoord4bOES(GLbyte s, GLbyte t, GLbyte r, GLbyte q);
    /// ```
    public void TexCoord4bOES(byte s, byte t, byte r, byte q) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord4bOES)) throw new SymbolNotFoundError("Symbol not found: glTexCoord4bOES");
        try { Handles.MH_glTexCoord4bOES.invokeExact(handles.PFN_glTexCoord4bOES, s, t, r, q); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord4bOES", e); }
    }

    /// ```
    /// void glTexCoord4bvOES(const GLbyte* coords);
    /// ```
    public void TexCoord4bvOES(MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoord4bvOES)) throw new SymbolNotFoundError("Symbol not found: glTexCoord4bvOES");
        try { Handles.MH_glTexCoord4bvOES.invokeExact(handles.PFN_glTexCoord4bvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoord4bvOES", e); }
    }

    /// ```
    /// void glVertex2bOES(GLbyte x, GLbyte y);
    /// ```
    public void Vertex2bOES(byte x, byte y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex2bOES)) throw new SymbolNotFoundError("Symbol not found: glVertex2bOES");
        try { Handles.MH_glVertex2bOES.invokeExact(handles.PFN_glVertex2bOES, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex2bOES", e); }
    }

    /// ```
    /// void glVertex2bvOES(const GLbyte* coords);
    /// ```
    public void Vertex2bvOES(MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex2bvOES)) throw new SymbolNotFoundError("Symbol not found: glVertex2bvOES");
        try { Handles.MH_glVertex2bvOES.invokeExact(handles.PFN_glVertex2bvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex2bvOES", e); }
    }

    /// ```
    /// void glVertex3bOES(GLbyte x, GLbyte y, GLbyte z);
    /// ```
    public void Vertex3bOES(byte x, byte y, byte z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex3bOES)) throw new SymbolNotFoundError("Symbol not found: glVertex3bOES");
        try { Handles.MH_glVertex3bOES.invokeExact(handles.PFN_glVertex3bOES, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex3bOES", e); }
    }

    /// ```
    /// void glVertex3bvOES(const GLbyte* coords);
    /// ```
    public void Vertex3bvOES(MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex3bvOES)) throw new SymbolNotFoundError("Symbol not found: glVertex3bvOES");
        try { Handles.MH_glVertex3bvOES.invokeExact(handles.PFN_glVertex3bvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex3bvOES", e); }
    }

    /// ```
    /// void glVertex4bOES(GLbyte x, GLbyte y, GLbyte z, GLbyte w);
    /// ```
    public void Vertex4bOES(byte x, byte y, byte z, byte w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex4bOES)) throw new SymbolNotFoundError("Symbol not found: glVertex4bOES");
        try { Handles.MH_glVertex4bOES.invokeExact(handles.PFN_glVertex4bOES, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex4bOES", e); }
    }

    /// ```
    /// void glVertex4bvOES(const GLbyte* coords);
    /// ```
    public void Vertex4bvOES(MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertex4bvOES)) throw new SymbolNotFoundError("Symbol not found: glVertex4bvOES");
        try { Handles.MH_glVertex4bvOES.invokeExact(handles.PFN_glVertex4bvOES, coords); }
        catch (Throwable e) { throw new RuntimeException("error in Vertex4bvOES", e); }
    }

}

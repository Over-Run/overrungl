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
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_vertex_type_2_10_10_10_rev`
public final class GLARBVertexType2101010Rev {
    public static final int GL_UNSIGNED_INT_2_10_10_10_REV = 0x8368;
    public static final int GL_INT_2_10_10_10_REV = 0x8D9F;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glVertexAttribP1ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribP1uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribP2ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribP2uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribP3ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribP3uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexAttribP4ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexAttribP4uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexP2ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexP2uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexP3ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexP3uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexP4ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexP4uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexCoordP1ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTexCoordP1uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexCoordP2ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTexCoordP2uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexCoordP3ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTexCoordP3uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexCoordP4ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTexCoordP4uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoordP1ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiTexCoordP1uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoordP2ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiTexCoordP2uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoordP3ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiTexCoordP3uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexCoordP4ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiTexCoordP4uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNormalP3ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNormalP3uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glColorP3ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glColorP3uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glColorP4ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glColorP4uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glSecondaryColorP3ui = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glSecondaryColorP3uiv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glVertexAttribP1ui;
        public final MemorySegment PFN_glVertexAttribP1uiv;
        public final MemorySegment PFN_glVertexAttribP2ui;
        public final MemorySegment PFN_glVertexAttribP2uiv;
        public final MemorySegment PFN_glVertexAttribP3ui;
        public final MemorySegment PFN_glVertexAttribP3uiv;
        public final MemorySegment PFN_glVertexAttribP4ui;
        public final MemorySegment PFN_glVertexAttribP4uiv;
        public final MemorySegment PFN_glVertexP2ui;
        public final MemorySegment PFN_glVertexP2uiv;
        public final MemorySegment PFN_glVertexP3ui;
        public final MemorySegment PFN_glVertexP3uiv;
        public final MemorySegment PFN_glVertexP4ui;
        public final MemorySegment PFN_glVertexP4uiv;
        public final MemorySegment PFN_glTexCoordP1ui;
        public final MemorySegment PFN_glTexCoordP1uiv;
        public final MemorySegment PFN_glTexCoordP2ui;
        public final MemorySegment PFN_glTexCoordP2uiv;
        public final MemorySegment PFN_glTexCoordP3ui;
        public final MemorySegment PFN_glTexCoordP3uiv;
        public final MemorySegment PFN_glTexCoordP4ui;
        public final MemorySegment PFN_glTexCoordP4uiv;
        public final MemorySegment PFN_glMultiTexCoordP1ui;
        public final MemorySegment PFN_glMultiTexCoordP1uiv;
        public final MemorySegment PFN_glMultiTexCoordP2ui;
        public final MemorySegment PFN_glMultiTexCoordP2uiv;
        public final MemorySegment PFN_glMultiTexCoordP3ui;
        public final MemorySegment PFN_glMultiTexCoordP3uiv;
        public final MemorySegment PFN_glMultiTexCoordP4ui;
        public final MemorySegment PFN_glMultiTexCoordP4uiv;
        public final MemorySegment PFN_glNormalP3ui;
        public final MemorySegment PFN_glNormalP3uiv;
        public final MemorySegment PFN_glColorP3ui;
        public final MemorySegment PFN_glColorP3uiv;
        public final MemorySegment PFN_glColorP4ui;
        public final MemorySegment PFN_glColorP4uiv;
        public final MemorySegment PFN_glSecondaryColorP3ui;
        public final MemorySegment PFN_glSecondaryColorP3uiv;
        private Handles(GLLoadFunc func) {
            PFN_glVertexAttribP1ui = func.invoke("glVertexAttribP1ui");
            PFN_glVertexAttribP1uiv = func.invoke("glVertexAttribP1uiv");
            PFN_glVertexAttribP2ui = func.invoke("glVertexAttribP2ui");
            PFN_glVertexAttribP2uiv = func.invoke("glVertexAttribP2uiv");
            PFN_glVertexAttribP3ui = func.invoke("glVertexAttribP3ui");
            PFN_glVertexAttribP3uiv = func.invoke("glVertexAttribP3uiv");
            PFN_glVertexAttribP4ui = func.invoke("glVertexAttribP4ui");
            PFN_glVertexAttribP4uiv = func.invoke("glVertexAttribP4uiv");PFN_glVertexP2ui = func.invoke("glVertexP2ui");
            PFN_glVertexP2uiv = func.invoke("glVertexP2uiv");
            PFN_glVertexP3ui = func.invoke("glVertexP3ui");
            PFN_glVertexP3uiv = func.invoke("glVertexP3uiv");
            PFN_glVertexP4ui = func.invoke("glVertexP4ui");
            PFN_glVertexP4uiv = func.invoke("glVertexP4uiv");
            PFN_glTexCoordP1ui = func.invoke("glTexCoordP1ui");
            PFN_glTexCoordP1uiv = func.invoke("glTexCoordP1uiv");
            PFN_glTexCoordP2ui = func.invoke("glTexCoordP2ui");
            PFN_glTexCoordP2uiv = func.invoke("glTexCoordP2uiv");
            PFN_glTexCoordP3ui = func.invoke("glTexCoordP3ui");
            PFN_glTexCoordP3uiv = func.invoke("glTexCoordP3uiv");
            PFN_glTexCoordP4ui = func.invoke("glTexCoordP4ui");
            PFN_glTexCoordP4uiv = func.invoke("glTexCoordP4uiv");
            PFN_glMultiTexCoordP1ui = func.invoke("glMultiTexCoordP1ui");
            PFN_glMultiTexCoordP1uiv = func.invoke("glMultiTexCoordP1uiv");
            PFN_glMultiTexCoordP2ui = func.invoke("glMultiTexCoordP2ui");
            PFN_glMultiTexCoordP2uiv = func.invoke("glMultiTexCoordP2uiv");
            PFN_glMultiTexCoordP3ui = func.invoke("glMultiTexCoordP3ui");
            PFN_glMultiTexCoordP3uiv = func.invoke("glMultiTexCoordP3uiv");
            PFN_glMultiTexCoordP4ui = func.invoke("glMultiTexCoordP4ui");
            PFN_glMultiTexCoordP4uiv = func.invoke("glMultiTexCoordP4uiv");
            PFN_glNormalP3ui = func.invoke("glNormalP3ui");
            PFN_glNormalP3uiv = func.invoke("glNormalP3uiv");
            PFN_glColorP3ui = func.invoke("glColorP3ui");
            PFN_glColorP3uiv = func.invoke("glColorP3uiv");
            PFN_glColorP4ui = func.invoke("glColorP4ui");
            PFN_glColorP4uiv = func.invoke("glColorP4uiv");
            PFN_glSecondaryColorP3ui = func.invoke("glSecondaryColorP3ui");
            PFN_glSecondaryColorP3uiv = func.invoke("glSecondaryColorP3uiv");
        }
    }

    public GLARBVertexType2101010Rev(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glVertexAttribP1ui`.
    /// ```
    /// void glVertexAttribP1ui((unsigned int) GLuint index, (unsigned int) GLenum type, GLboolean normalized, (unsigned int) GLuint value);
    /// ```
    public void VertexAttribP1ui(int index, int type, boolean normalized, int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribP1ui)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribP1ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribP1ui", index, type, normalized, value); }
        Handles.MH_glVertexAttribP1ui.invokeExact(handles.PFN_glVertexAttribP1ui, index, type, ((normalized) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribP1ui", e); }
    }

    /// Invokes `glVertexAttribP1uiv`.
    /// ```
    /// void glVertexAttribP1uiv((unsigned int) GLuint index, (unsigned int) GLenum type, GLboolean normalized, const GLuint* value);
    /// ```
    public void VertexAttribP1uiv(int index, int type, boolean normalized, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribP1uiv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribP1uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribP1uiv", index, type, normalized, value); }
        Handles.MH_glVertexAttribP1uiv.invokeExact(handles.PFN_glVertexAttribP1uiv, index, type, ((normalized) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribP1uiv", e); }
    }

    /// Invokes `glVertexAttribP2ui`.
    /// ```
    /// void glVertexAttribP2ui((unsigned int) GLuint index, (unsigned int) GLenum type, GLboolean normalized, (unsigned int) GLuint value);
    /// ```
    public void VertexAttribP2ui(int index, int type, boolean normalized, int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribP2ui)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribP2ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribP2ui", index, type, normalized, value); }
        Handles.MH_glVertexAttribP2ui.invokeExact(handles.PFN_glVertexAttribP2ui, index, type, ((normalized) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribP2ui", e); }
    }

    /// Invokes `glVertexAttribP2uiv`.
    /// ```
    /// void glVertexAttribP2uiv((unsigned int) GLuint index, (unsigned int) GLenum type, GLboolean normalized, const GLuint* value);
    /// ```
    public void VertexAttribP2uiv(int index, int type, boolean normalized, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribP2uiv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribP2uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribP2uiv", index, type, normalized, value); }
        Handles.MH_glVertexAttribP2uiv.invokeExact(handles.PFN_glVertexAttribP2uiv, index, type, ((normalized) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribP2uiv", e); }
    }

    /// Invokes `glVertexAttribP3ui`.
    /// ```
    /// void glVertexAttribP3ui((unsigned int) GLuint index, (unsigned int) GLenum type, GLboolean normalized, (unsigned int) GLuint value);
    /// ```
    public void VertexAttribP3ui(int index, int type, boolean normalized, int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribP3ui)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribP3ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribP3ui", index, type, normalized, value); }
        Handles.MH_glVertexAttribP3ui.invokeExact(handles.PFN_glVertexAttribP3ui, index, type, ((normalized) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribP3ui", e); }
    }

    /// Invokes `glVertexAttribP3uiv`.
    /// ```
    /// void glVertexAttribP3uiv((unsigned int) GLuint index, (unsigned int) GLenum type, GLboolean normalized, const GLuint* value);
    /// ```
    public void VertexAttribP3uiv(int index, int type, boolean normalized, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribP3uiv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribP3uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribP3uiv", index, type, normalized, value); }
        Handles.MH_glVertexAttribP3uiv.invokeExact(handles.PFN_glVertexAttribP3uiv, index, type, ((normalized) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribP3uiv", e); }
    }

    /// Invokes `glVertexAttribP4ui`.
    /// ```
    /// void glVertexAttribP4ui((unsigned int) GLuint index, (unsigned int) GLenum type, GLboolean normalized, (unsigned int) GLuint value);
    /// ```
    public void VertexAttribP4ui(int index, int type, boolean normalized, int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribP4ui)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribP4ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribP4ui", index, type, normalized, value); }
        Handles.MH_glVertexAttribP4ui.invokeExact(handles.PFN_glVertexAttribP4ui, index, type, ((normalized) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribP4ui", e); }
    }

    /// Invokes `glVertexAttribP4uiv`.
    /// ```
    /// void glVertexAttribP4uiv((unsigned int) GLuint index, (unsigned int) GLenum type, GLboolean normalized, const GLuint* value);
    /// ```
    public void VertexAttribP4uiv(int index, int type, boolean normalized, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexAttribP4uiv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexAttribP4uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexAttribP4uiv", index, type, normalized, value); }
        Handles.MH_glVertexAttribP4uiv.invokeExact(handles.PFN_glVertexAttribP4uiv, index, type, ((normalized) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in VertexAttribP4uiv", e); }
    }

    /// Invokes `glVertexP2ui`.
    /// ```
    /// void glVertexP2ui((unsigned int) GLenum type, (unsigned int) GLuint value);
    /// ```
    public void VertexP2ui(int type, int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexP2ui)) throw new GLSymbolNotFoundError("Symbol not found: glVertexP2ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexP2ui", type, value); }
        Handles.MH_glVertexP2ui.invokeExact(handles.PFN_glVertexP2ui, type, value); }
        catch (Throwable e) { throw new RuntimeException("error in VertexP2ui", e); }
    }

    /// Invokes `glVertexP2uiv`.
    /// ```
    /// void glVertexP2uiv((unsigned int) GLenum type, const GLuint* value);
    /// ```
    public void VertexP2uiv(int type, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexP2uiv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexP2uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexP2uiv", type, value); }
        Handles.MH_glVertexP2uiv.invokeExact(handles.PFN_glVertexP2uiv, type, value); }
        catch (Throwable e) { throw new RuntimeException("error in VertexP2uiv", e); }
    }

    /// Invokes `glVertexP3ui`.
    /// ```
    /// void glVertexP3ui((unsigned int) GLenum type, (unsigned int) GLuint value);
    /// ```
    public void VertexP3ui(int type, int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexP3ui)) throw new GLSymbolNotFoundError("Symbol not found: glVertexP3ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexP3ui", type, value); }
        Handles.MH_glVertexP3ui.invokeExact(handles.PFN_glVertexP3ui, type, value); }
        catch (Throwable e) { throw new RuntimeException("error in VertexP3ui", e); }
    }

    /// Invokes `glVertexP3uiv`.
    /// ```
    /// void glVertexP3uiv((unsigned int) GLenum type, const GLuint* value);
    /// ```
    public void VertexP3uiv(int type, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexP3uiv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexP3uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexP3uiv", type, value); }
        Handles.MH_glVertexP3uiv.invokeExact(handles.PFN_glVertexP3uiv, type, value); }
        catch (Throwable e) { throw new RuntimeException("error in VertexP3uiv", e); }
    }

    /// Invokes `glVertexP4ui`.
    /// ```
    /// void glVertexP4ui((unsigned int) GLenum type, (unsigned int) GLuint value);
    /// ```
    public void VertexP4ui(int type, int value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexP4ui)) throw new GLSymbolNotFoundError("Symbol not found: glVertexP4ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexP4ui", type, value); }
        Handles.MH_glVertexP4ui.invokeExact(handles.PFN_glVertexP4ui, type, value); }
        catch (Throwable e) { throw new RuntimeException("error in VertexP4ui", e); }
    }

    /// Invokes `glVertexP4uiv`.
    /// ```
    /// void glVertexP4uiv((unsigned int) GLenum type, const GLuint* value);
    /// ```
    public void VertexP4uiv(int type, @NonNull MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexP4uiv)) throw new GLSymbolNotFoundError("Symbol not found: glVertexP4uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexP4uiv", type, value); }
        Handles.MH_glVertexP4uiv.invokeExact(handles.PFN_glVertexP4uiv, type, value); }
        catch (Throwable e) { throw new RuntimeException("error in VertexP4uiv", e); }
    }

    /// Invokes `glTexCoordP1ui`.
    /// ```
    /// void glTexCoordP1ui((unsigned int) GLenum type, (unsigned int) GLuint coords);
    /// ```
    public void TexCoordP1ui(int type, int coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoordP1ui)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoordP1ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoordP1ui", type, coords); }
        Handles.MH_glTexCoordP1ui.invokeExact(handles.PFN_glTexCoordP1ui, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoordP1ui", e); }
    }

    /// Invokes `glTexCoordP1uiv`.
    /// ```
    /// void glTexCoordP1uiv((unsigned int) GLenum type, const GLuint* coords);
    /// ```
    public void TexCoordP1uiv(int type, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoordP1uiv)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoordP1uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoordP1uiv", type, coords); }
        Handles.MH_glTexCoordP1uiv.invokeExact(handles.PFN_glTexCoordP1uiv, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoordP1uiv", e); }
    }

    /// Invokes `glTexCoordP2ui`.
    /// ```
    /// void glTexCoordP2ui((unsigned int) GLenum type, (unsigned int) GLuint coords);
    /// ```
    public void TexCoordP2ui(int type, int coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoordP2ui)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoordP2ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoordP2ui", type, coords); }
        Handles.MH_glTexCoordP2ui.invokeExact(handles.PFN_glTexCoordP2ui, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoordP2ui", e); }
    }

    /// Invokes `glTexCoordP2uiv`.
    /// ```
    /// void glTexCoordP2uiv((unsigned int) GLenum type, const GLuint* coords);
    /// ```
    public void TexCoordP2uiv(int type, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoordP2uiv)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoordP2uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoordP2uiv", type, coords); }
        Handles.MH_glTexCoordP2uiv.invokeExact(handles.PFN_glTexCoordP2uiv, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoordP2uiv", e); }
    }

    /// Invokes `glTexCoordP3ui`.
    /// ```
    /// void glTexCoordP3ui((unsigned int) GLenum type, (unsigned int) GLuint coords);
    /// ```
    public void TexCoordP3ui(int type, int coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoordP3ui)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoordP3ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoordP3ui", type, coords); }
        Handles.MH_glTexCoordP3ui.invokeExact(handles.PFN_glTexCoordP3ui, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoordP3ui", e); }
    }

    /// Invokes `glTexCoordP3uiv`.
    /// ```
    /// void glTexCoordP3uiv((unsigned int) GLenum type, const GLuint* coords);
    /// ```
    public void TexCoordP3uiv(int type, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoordP3uiv)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoordP3uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoordP3uiv", type, coords); }
        Handles.MH_glTexCoordP3uiv.invokeExact(handles.PFN_glTexCoordP3uiv, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoordP3uiv", e); }
    }

    /// Invokes `glTexCoordP4ui`.
    /// ```
    /// void glTexCoordP4ui((unsigned int) GLenum type, (unsigned int) GLuint coords);
    /// ```
    public void TexCoordP4ui(int type, int coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoordP4ui)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoordP4ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoordP4ui", type, coords); }
        Handles.MH_glTexCoordP4ui.invokeExact(handles.PFN_glTexCoordP4ui, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoordP4ui", e); }
    }

    /// Invokes `glTexCoordP4uiv`.
    /// ```
    /// void glTexCoordP4uiv((unsigned int) GLenum type, const GLuint* coords);
    /// ```
    public void TexCoordP4uiv(int type, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexCoordP4uiv)) throw new GLSymbolNotFoundError("Symbol not found: glTexCoordP4uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexCoordP4uiv", type, coords); }
        Handles.MH_glTexCoordP4uiv.invokeExact(handles.PFN_glTexCoordP4uiv, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in TexCoordP4uiv", e); }
    }

    /// Invokes `glMultiTexCoordP1ui`.
    /// ```
    /// void glMultiTexCoordP1ui((unsigned int) GLenum texture, (unsigned int) GLenum type, (unsigned int) GLuint coords);
    /// ```
    public void MultiTexCoordP1ui(int texture, int type, int coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoordP1ui)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoordP1ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoordP1ui", texture, type, coords); }
        Handles.MH_glMultiTexCoordP1ui.invokeExact(handles.PFN_glMultiTexCoordP1ui, texture, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoordP1ui", e); }
    }

    /// Invokes `glMultiTexCoordP1uiv`.
    /// ```
    /// void glMultiTexCoordP1uiv((unsigned int) GLenum texture, (unsigned int) GLenum type, const GLuint* coords);
    /// ```
    public void MultiTexCoordP1uiv(int texture, int type, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoordP1uiv)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoordP1uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoordP1uiv", texture, type, coords); }
        Handles.MH_glMultiTexCoordP1uiv.invokeExact(handles.PFN_glMultiTexCoordP1uiv, texture, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoordP1uiv", e); }
    }

    /// Invokes `glMultiTexCoordP2ui`.
    /// ```
    /// void glMultiTexCoordP2ui((unsigned int) GLenum texture, (unsigned int) GLenum type, (unsigned int) GLuint coords);
    /// ```
    public void MultiTexCoordP2ui(int texture, int type, int coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoordP2ui)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoordP2ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoordP2ui", texture, type, coords); }
        Handles.MH_glMultiTexCoordP2ui.invokeExact(handles.PFN_glMultiTexCoordP2ui, texture, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoordP2ui", e); }
    }

    /// Invokes `glMultiTexCoordP2uiv`.
    /// ```
    /// void glMultiTexCoordP2uiv((unsigned int) GLenum texture, (unsigned int) GLenum type, const GLuint* coords);
    /// ```
    public void MultiTexCoordP2uiv(int texture, int type, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoordP2uiv)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoordP2uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoordP2uiv", texture, type, coords); }
        Handles.MH_glMultiTexCoordP2uiv.invokeExact(handles.PFN_glMultiTexCoordP2uiv, texture, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoordP2uiv", e); }
    }

    /// Invokes `glMultiTexCoordP3ui`.
    /// ```
    /// void glMultiTexCoordP3ui((unsigned int) GLenum texture, (unsigned int) GLenum type, (unsigned int) GLuint coords);
    /// ```
    public void MultiTexCoordP3ui(int texture, int type, int coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoordP3ui)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoordP3ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoordP3ui", texture, type, coords); }
        Handles.MH_glMultiTexCoordP3ui.invokeExact(handles.PFN_glMultiTexCoordP3ui, texture, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoordP3ui", e); }
    }

    /// Invokes `glMultiTexCoordP3uiv`.
    /// ```
    /// void glMultiTexCoordP3uiv((unsigned int) GLenum texture, (unsigned int) GLenum type, const GLuint* coords);
    /// ```
    public void MultiTexCoordP3uiv(int texture, int type, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoordP3uiv)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoordP3uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoordP3uiv", texture, type, coords); }
        Handles.MH_glMultiTexCoordP3uiv.invokeExact(handles.PFN_glMultiTexCoordP3uiv, texture, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoordP3uiv", e); }
    }

    /// Invokes `glMultiTexCoordP4ui`.
    /// ```
    /// void glMultiTexCoordP4ui((unsigned int) GLenum texture, (unsigned int) GLenum type, (unsigned int) GLuint coords);
    /// ```
    public void MultiTexCoordP4ui(int texture, int type, int coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoordP4ui)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoordP4ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoordP4ui", texture, type, coords); }
        Handles.MH_glMultiTexCoordP4ui.invokeExact(handles.PFN_glMultiTexCoordP4ui, texture, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoordP4ui", e); }
    }

    /// Invokes `glMultiTexCoordP4uiv`.
    /// ```
    /// void glMultiTexCoordP4uiv((unsigned int) GLenum texture, (unsigned int) GLenum type, const GLuint* coords);
    /// ```
    public void MultiTexCoordP4uiv(int texture, int type, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoordP4uiv)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoordP4uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glMultiTexCoordP4uiv", texture, type, coords); }
        Handles.MH_glMultiTexCoordP4uiv.invokeExact(handles.PFN_glMultiTexCoordP4uiv, texture, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoordP4uiv", e); }
    }

    /// Invokes `glNormalP3ui`.
    /// ```
    /// void glNormalP3ui((unsigned int) GLenum type, (unsigned int) GLuint coords);
    /// ```
    public void NormalP3ui(int type, int coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormalP3ui)) throw new GLSymbolNotFoundError("Symbol not found: glNormalP3ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNormalP3ui", type, coords); }
        Handles.MH_glNormalP3ui.invokeExact(handles.PFN_glNormalP3ui, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in NormalP3ui", e); }
    }

    /// Invokes `glNormalP3uiv`.
    /// ```
    /// void glNormalP3uiv((unsigned int) GLenum type, const GLuint* coords);
    /// ```
    public void NormalP3uiv(int type, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormalP3uiv)) throw new GLSymbolNotFoundError("Symbol not found: glNormalP3uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNormalP3uiv", type, coords); }
        Handles.MH_glNormalP3uiv.invokeExact(handles.PFN_glNormalP3uiv, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in NormalP3uiv", e); }
    }

    /// Invokes `glColorP3ui`.
    /// ```
    /// void glColorP3ui((unsigned int) GLenum type, (unsigned int) GLuint color);
    /// ```
    public void ColorP3ui(int type, int color) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColorP3ui)) throw new GLSymbolNotFoundError("Symbol not found: glColorP3ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColorP3ui", type, color); }
        Handles.MH_glColorP3ui.invokeExact(handles.PFN_glColorP3ui, type, color); }
        catch (Throwable e) { throw new RuntimeException("error in ColorP3ui", e); }
    }

    /// Invokes `glColorP3uiv`.
    /// ```
    /// void glColorP3uiv((unsigned int) GLenum type, const GLuint* color);
    /// ```
    public void ColorP3uiv(int type, @NonNull MemorySegment color) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColorP3uiv)) throw new GLSymbolNotFoundError("Symbol not found: glColorP3uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColorP3uiv", type, color); }
        Handles.MH_glColorP3uiv.invokeExact(handles.PFN_glColorP3uiv, type, color); }
        catch (Throwable e) { throw new RuntimeException("error in ColorP3uiv", e); }
    }

    /// Invokes `glColorP4ui`.
    /// ```
    /// void glColorP4ui((unsigned int) GLenum type, (unsigned int) GLuint color);
    /// ```
    public void ColorP4ui(int type, int color) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColorP4ui)) throw new GLSymbolNotFoundError("Symbol not found: glColorP4ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColorP4ui", type, color); }
        Handles.MH_glColorP4ui.invokeExact(handles.PFN_glColorP4ui, type, color); }
        catch (Throwable e) { throw new RuntimeException("error in ColorP4ui", e); }
    }

    /// Invokes `glColorP4uiv`.
    /// ```
    /// void glColorP4uiv((unsigned int) GLenum type, const GLuint* color);
    /// ```
    public void ColorP4uiv(int type, @NonNull MemorySegment color) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColorP4uiv)) throw new GLSymbolNotFoundError("Symbol not found: glColorP4uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glColorP4uiv", type, color); }
        Handles.MH_glColorP4uiv.invokeExact(handles.PFN_glColorP4uiv, type, color); }
        catch (Throwable e) { throw new RuntimeException("error in ColorP4uiv", e); }
    }

    /// Invokes `glSecondaryColorP3ui`.
    /// ```
    /// void glSecondaryColorP3ui((unsigned int) GLenum type, (unsigned int) GLuint color);
    /// ```
    public void SecondaryColorP3ui(int type, int color) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColorP3ui)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColorP3ui");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColorP3ui", type, color); }
        Handles.MH_glSecondaryColorP3ui.invokeExact(handles.PFN_glSecondaryColorP3ui, type, color); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColorP3ui", e); }
    }

    /// Invokes `glSecondaryColorP3uiv`.
    /// ```
    /// void glSecondaryColorP3uiv((unsigned int) GLenum type, const GLuint* color);
    /// ```
    public void SecondaryColorP3uiv(int type, @NonNull MemorySegment color) {
        if (MemoryUtil.isNullPointer(handles.PFN_glSecondaryColorP3uiv)) throw new GLSymbolNotFoundError("Symbol not found: glSecondaryColorP3uiv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glSecondaryColorP3uiv", type, color); }
        Handles.MH_glSecondaryColorP3uiv.invokeExact(handles.PFN_glSecondaryColorP3uiv, type, color); }
        catch (Throwable e) { throw new RuntimeException("error in SecondaryColorP3uiv", e); }
    }

}

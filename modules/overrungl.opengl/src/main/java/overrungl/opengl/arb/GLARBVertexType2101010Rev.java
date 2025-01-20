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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBVertexType2101010Rev {
    public static final int GL_UNSIGNED_INT_2_10_10_10_REV = 0x8368;
    public static final int GL_INT_2_10_10_10_REV = 0x8D9F;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glVertexAttribP1ui = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexAttribP1uiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribP2ui = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexAttribP2uiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribP3ui = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexAttribP3uiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexAttribP4ui = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexAttribP4uiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexP2ui = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexP2uiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexP3ui = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexP3uiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexP4ui = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexP4uiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTexCoordP1ui = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTexCoordP1uiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTexCoordP2ui = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTexCoordP2uiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTexCoordP3ui = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTexCoordP3uiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTexCoordP4ui = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTexCoordP4uiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexCoordP1ui = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMultiTexCoordP1uiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexCoordP2ui = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMultiTexCoordP2uiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexCoordP3ui = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMultiTexCoordP3uiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexCoordP4ui = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMultiTexCoordP4uiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glNormalP3ui = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glNormalP3uiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glColorP3ui = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glColorP3uiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glColorP4ui = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glColorP4uiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glSecondaryColorP3ui = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glSecondaryColorP3uiv = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glVertexAttribP1ui = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribP1ui);
        public static final MethodHandle MH_glVertexAttribP1uiv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribP1uiv);
        public static final MethodHandle MH_glVertexAttribP2ui = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribP2ui);
        public static final MethodHandle MH_glVertexAttribP2uiv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribP2uiv);
        public static final MethodHandle MH_glVertexAttribP3ui = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribP3ui);
        public static final MethodHandle MH_glVertexAttribP3uiv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribP3uiv);
        public static final MethodHandle MH_glVertexAttribP4ui = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribP4ui);
        public static final MethodHandle MH_glVertexAttribP4uiv = RuntimeHelper.downcall(Descriptors.FD_glVertexAttribP4uiv);
        public static final MethodHandle MH_glVertexP2ui = RuntimeHelper.downcall(Descriptors.FD_glVertexP2ui);
        public static final MethodHandle MH_glVertexP2uiv = RuntimeHelper.downcall(Descriptors.FD_glVertexP2uiv);
        public static final MethodHandle MH_glVertexP3ui = RuntimeHelper.downcall(Descriptors.FD_glVertexP3ui);
        public static final MethodHandle MH_glVertexP3uiv = RuntimeHelper.downcall(Descriptors.FD_glVertexP3uiv);
        public static final MethodHandle MH_glVertexP4ui = RuntimeHelper.downcall(Descriptors.FD_glVertexP4ui);
        public static final MethodHandle MH_glVertexP4uiv = RuntimeHelper.downcall(Descriptors.FD_glVertexP4uiv);
        public static final MethodHandle MH_glTexCoordP1ui = RuntimeHelper.downcall(Descriptors.FD_glTexCoordP1ui);
        public static final MethodHandle MH_glTexCoordP1uiv = RuntimeHelper.downcall(Descriptors.FD_glTexCoordP1uiv);
        public static final MethodHandle MH_glTexCoordP2ui = RuntimeHelper.downcall(Descriptors.FD_glTexCoordP2ui);
        public static final MethodHandle MH_glTexCoordP2uiv = RuntimeHelper.downcall(Descriptors.FD_glTexCoordP2uiv);
        public static final MethodHandle MH_glTexCoordP3ui = RuntimeHelper.downcall(Descriptors.FD_glTexCoordP3ui);
        public static final MethodHandle MH_glTexCoordP3uiv = RuntimeHelper.downcall(Descriptors.FD_glTexCoordP3uiv);
        public static final MethodHandle MH_glTexCoordP4ui = RuntimeHelper.downcall(Descriptors.FD_glTexCoordP4ui);
        public static final MethodHandle MH_glTexCoordP4uiv = RuntimeHelper.downcall(Descriptors.FD_glTexCoordP4uiv);
        public static final MethodHandle MH_glMultiTexCoordP1ui = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoordP1ui);
        public static final MethodHandle MH_glMultiTexCoordP1uiv = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoordP1uiv);
        public static final MethodHandle MH_glMultiTexCoordP2ui = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoordP2ui);
        public static final MethodHandle MH_glMultiTexCoordP2uiv = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoordP2uiv);
        public static final MethodHandle MH_glMultiTexCoordP3ui = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoordP3ui);
        public static final MethodHandle MH_glMultiTexCoordP3uiv = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoordP3uiv);
        public static final MethodHandle MH_glMultiTexCoordP4ui = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoordP4ui);
        public static final MethodHandle MH_glMultiTexCoordP4uiv = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoordP4uiv);
        public static final MethodHandle MH_glNormalP3ui = RuntimeHelper.downcall(Descriptors.FD_glNormalP3ui);
        public static final MethodHandle MH_glNormalP3uiv = RuntimeHelper.downcall(Descriptors.FD_glNormalP3uiv);
        public static final MethodHandle MH_glColorP3ui = RuntimeHelper.downcall(Descriptors.FD_glColorP3ui);
        public static final MethodHandle MH_glColorP3uiv = RuntimeHelper.downcall(Descriptors.FD_glColorP3uiv);
        public static final MethodHandle MH_glColorP4ui = RuntimeHelper.downcall(Descriptors.FD_glColorP4ui);
        public static final MethodHandle MH_glColorP4uiv = RuntimeHelper.downcall(Descriptors.FD_glColorP4uiv);
        public static final MethodHandle MH_glSecondaryColorP3ui = RuntimeHelper.downcall(Descriptors.FD_glSecondaryColorP3ui);
        public static final MethodHandle MH_glSecondaryColorP3uiv = RuntimeHelper.downcall(Descriptors.FD_glSecondaryColorP3uiv);
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
        private Handles(overrungl.opengl.GLLoadFunc func) {
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

    public GLARBVertexType2101010Rev(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void VertexAttribP1ui(@CType("GLuint") int index, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("GLuint") int value) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribP1ui)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribP1ui");
        try { Handles.MH_glVertexAttribP1ui.invokeExact(handles.PFN_glVertexAttribP1ui, index, type, normalized, value); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribP1ui", e); }
    }

    public void VertexAttribP1uiv(@CType("GLuint") int index, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("const GLuint *") MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribP1uiv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribP1uiv");
        try { Handles.MH_glVertexAttribP1uiv.invokeExact(handles.PFN_glVertexAttribP1uiv, index, type, normalized, value); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribP1uiv", e); }
    }

    public void VertexAttribP2ui(@CType("GLuint") int index, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("GLuint") int value) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribP2ui)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribP2ui");
        try { Handles.MH_glVertexAttribP2ui.invokeExact(handles.PFN_glVertexAttribP2ui, index, type, normalized, value); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribP2ui", e); }
    }

    public void VertexAttribP2uiv(@CType("GLuint") int index, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("const GLuint *") MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribP2uiv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribP2uiv");
        try { Handles.MH_glVertexAttribP2uiv.invokeExact(handles.PFN_glVertexAttribP2uiv, index, type, normalized, value); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribP2uiv", e); }
    }

    public void VertexAttribP3ui(@CType("GLuint") int index, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("GLuint") int value) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribP3ui)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribP3ui");
        try { Handles.MH_glVertexAttribP3ui.invokeExact(handles.PFN_glVertexAttribP3ui, index, type, normalized, value); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribP3ui", e); }
    }

    public void VertexAttribP3uiv(@CType("GLuint") int index, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("const GLuint *") MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribP3uiv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribP3uiv");
        try { Handles.MH_glVertexAttribP3uiv.invokeExact(handles.PFN_glVertexAttribP3uiv, index, type, normalized, value); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribP3uiv", e); }
    }

    public void VertexAttribP4ui(@CType("GLuint") int index, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("GLuint") int value) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribP4ui)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribP4ui");
        try { Handles.MH_glVertexAttribP4ui.invokeExact(handles.PFN_glVertexAttribP4ui, index, type, normalized, value); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribP4ui", e); }
    }

    public void VertexAttribP4uiv(@CType("GLuint") int index, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("const GLuint *") MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexAttribP4uiv)) throw new SymbolNotFoundError("Symbol not found: glVertexAttribP4uiv");
        try { Handles.MH_glVertexAttribP4uiv.invokeExact(handles.PFN_glVertexAttribP4uiv, index, type, normalized, value); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexAttribP4uiv", e); }
    }

    public void VertexP2ui(@CType("GLenum") int type, @CType("GLuint") int value) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexP2ui)) throw new SymbolNotFoundError("Symbol not found: glVertexP2ui");
        try { Handles.MH_glVertexP2ui.invokeExact(handles.PFN_glVertexP2ui, type, value); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexP2ui", e); }
    }

    public void VertexP2uiv(@CType("GLenum") int type, @CType("const GLuint *") MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexP2uiv)) throw new SymbolNotFoundError("Symbol not found: glVertexP2uiv");
        try { Handles.MH_glVertexP2uiv.invokeExact(handles.PFN_glVertexP2uiv, type, value); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexP2uiv", e); }
    }

    public void VertexP3ui(@CType("GLenum") int type, @CType("GLuint") int value) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexP3ui)) throw new SymbolNotFoundError("Symbol not found: glVertexP3ui");
        try { Handles.MH_glVertexP3ui.invokeExact(handles.PFN_glVertexP3ui, type, value); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexP3ui", e); }
    }

    public void VertexP3uiv(@CType("GLenum") int type, @CType("const GLuint *") MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexP3uiv)) throw new SymbolNotFoundError("Symbol not found: glVertexP3uiv");
        try { Handles.MH_glVertexP3uiv.invokeExact(handles.PFN_glVertexP3uiv, type, value); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexP3uiv", e); }
    }

    public void VertexP4ui(@CType("GLenum") int type, @CType("GLuint") int value) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexP4ui)) throw new SymbolNotFoundError("Symbol not found: glVertexP4ui");
        try { Handles.MH_glVertexP4ui.invokeExact(handles.PFN_glVertexP4ui, type, value); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexP4ui", e); }
    }

    public void VertexP4uiv(@CType("GLenum") int type, @CType("const GLuint *") MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexP4uiv)) throw new SymbolNotFoundError("Symbol not found: glVertexP4uiv");
        try { Handles.MH_glVertexP4uiv.invokeExact(handles.PFN_glVertexP4uiv, type, value); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexP4uiv", e); }
    }

    public void TexCoordP1ui(@CType("GLenum") int type, @CType("GLuint") int coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoordP1ui)) throw new SymbolNotFoundError("Symbol not found: glTexCoordP1ui");
        try { Handles.MH_glTexCoordP1ui.invokeExact(handles.PFN_glTexCoordP1ui, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoordP1ui", e); }
    }

    public void TexCoordP1uiv(@CType("GLenum") int type, @CType("const GLuint *") MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoordP1uiv)) throw new SymbolNotFoundError("Symbol not found: glTexCoordP1uiv");
        try { Handles.MH_glTexCoordP1uiv.invokeExact(handles.PFN_glTexCoordP1uiv, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoordP1uiv", e); }
    }

    public void TexCoordP2ui(@CType("GLenum") int type, @CType("GLuint") int coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoordP2ui)) throw new SymbolNotFoundError("Symbol not found: glTexCoordP2ui");
        try { Handles.MH_glTexCoordP2ui.invokeExact(handles.PFN_glTexCoordP2ui, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoordP2ui", e); }
    }

    public void TexCoordP2uiv(@CType("GLenum") int type, @CType("const GLuint *") MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoordP2uiv)) throw new SymbolNotFoundError("Symbol not found: glTexCoordP2uiv");
        try { Handles.MH_glTexCoordP2uiv.invokeExact(handles.PFN_glTexCoordP2uiv, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoordP2uiv", e); }
    }

    public void TexCoordP3ui(@CType("GLenum") int type, @CType("GLuint") int coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoordP3ui)) throw new SymbolNotFoundError("Symbol not found: glTexCoordP3ui");
        try { Handles.MH_glTexCoordP3ui.invokeExact(handles.PFN_glTexCoordP3ui, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoordP3ui", e); }
    }

    public void TexCoordP3uiv(@CType("GLenum") int type, @CType("const GLuint *") MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoordP3uiv)) throw new SymbolNotFoundError("Symbol not found: glTexCoordP3uiv");
        try { Handles.MH_glTexCoordP3uiv.invokeExact(handles.PFN_glTexCoordP3uiv, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoordP3uiv", e); }
    }

    public void TexCoordP4ui(@CType("GLenum") int type, @CType("GLuint") int coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoordP4ui)) throw new SymbolNotFoundError("Symbol not found: glTexCoordP4ui");
        try { Handles.MH_glTexCoordP4ui.invokeExact(handles.PFN_glTexCoordP4ui, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoordP4ui", e); }
    }

    public void TexCoordP4uiv(@CType("GLenum") int type, @CType("const GLuint *") MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoordP4uiv)) throw new SymbolNotFoundError("Symbol not found: glTexCoordP4uiv");
        try { Handles.MH_glTexCoordP4uiv.invokeExact(handles.PFN_glTexCoordP4uiv, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoordP4uiv", e); }
    }

    public void MultiTexCoordP1ui(@CType("GLenum") int texture, @CType("GLenum") int type, @CType("GLuint") int coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoordP1ui)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoordP1ui");
        try { Handles.MH_glMultiTexCoordP1ui.invokeExact(handles.PFN_glMultiTexCoordP1ui, texture, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoordP1ui", e); }
    }

    public void MultiTexCoordP1uiv(@CType("GLenum") int texture, @CType("GLenum") int type, @CType("const GLuint *") MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoordP1uiv)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoordP1uiv");
        try { Handles.MH_glMultiTexCoordP1uiv.invokeExact(handles.PFN_glMultiTexCoordP1uiv, texture, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoordP1uiv", e); }
    }

    public void MultiTexCoordP2ui(@CType("GLenum") int texture, @CType("GLenum") int type, @CType("GLuint") int coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoordP2ui)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoordP2ui");
        try { Handles.MH_glMultiTexCoordP2ui.invokeExact(handles.PFN_glMultiTexCoordP2ui, texture, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoordP2ui", e); }
    }

    public void MultiTexCoordP2uiv(@CType("GLenum") int texture, @CType("GLenum") int type, @CType("const GLuint *") MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoordP2uiv)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoordP2uiv");
        try { Handles.MH_glMultiTexCoordP2uiv.invokeExact(handles.PFN_glMultiTexCoordP2uiv, texture, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoordP2uiv", e); }
    }

    public void MultiTexCoordP3ui(@CType("GLenum") int texture, @CType("GLenum") int type, @CType("GLuint") int coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoordP3ui)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoordP3ui");
        try { Handles.MH_glMultiTexCoordP3ui.invokeExact(handles.PFN_glMultiTexCoordP3ui, texture, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoordP3ui", e); }
    }

    public void MultiTexCoordP3uiv(@CType("GLenum") int texture, @CType("GLenum") int type, @CType("const GLuint *") MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoordP3uiv)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoordP3uiv");
        try { Handles.MH_glMultiTexCoordP3uiv.invokeExact(handles.PFN_glMultiTexCoordP3uiv, texture, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoordP3uiv", e); }
    }

    public void MultiTexCoordP4ui(@CType("GLenum") int texture, @CType("GLenum") int type, @CType("GLuint") int coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoordP4ui)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoordP4ui");
        try { Handles.MH_glMultiTexCoordP4ui.invokeExact(handles.PFN_glMultiTexCoordP4ui, texture, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoordP4ui", e); }
    }

    public void MultiTexCoordP4uiv(@CType("GLenum") int texture, @CType("GLenum") int type, @CType("const GLuint *") MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoordP4uiv)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoordP4uiv");
        try { Handles.MH_glMultiTexCoordP4uiv.invokeExact(handles.PFN_glMultiTexCoordP4uiv, texture, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoordP4uiv", e); }
    }

    public void NormalP3ui(@CType("GLenum") int type, @CType("GLuint") int coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glNormalP3ui)) throw new SymbolNotFoundError("Symbol not found: glNormalP3ui");
        try { Handles.MH_glNormalP3ui.invokeExact(handles.PFN_glNormalP3ui, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glNormalP3ui", e); }
    }

    public void NormalP3uiv(@CType("GLenum") int type, @CType("const GLuint *") MemorySegment coords) {
        if (Unmarshal.isNullPointer(handles.PFN_glNormalP3uiv)) throw new SymbolNotFoundError("Symbol not found: glNormalP3uiv");
        try { Handles.MH_glNormalP3uiv.invokeExact(handles.PFN_glNormalP3uiv, type, coords); }
        catch (Throwable e) { throw new RuntimeException("error in glNormalP3uiv", e); }
    }

    public void ColorP3ui(@CType("GLenum") int type, @CType("GLuint") int color) {
        if (Unmarshal.isNullPointer(handles.PFN_glColorP3ui)) throw new SymbolNotFoundError("Symbol not found: glColorP3ui");
        try { Handles.MH_glColorP3ui.invokeExact(handles.PFN_glColorP3ui, type, color); }
        catch (Throwable e) { throw new RuntimeException("error in glColorP3ui", e); }
    }

    public void ColorP3uiv(@CType("GLenum") int type, @CType("const GLuint *") MemorySegment color) {
        if (Unmarshal.isNullPointer(handles.PFN_glColorP3uiv)) throw new SymbolNotFoundError("Symbol not found: glColorP3uiv");
        try { Handles.MH_glColorP3uiv.invokeExact(handles.PFN_glColorP3uiv, type, color); }
        catch (Throwable e) { throw new RuntimeException("error in glColorP3uiv", e); }
    }

    public void ColorP4ui(@CType("GLenum") int type, @CType("GLuint") int color) {
        if (Unmarshal.isNullPointer(handles.PFN_glColorP4ui)) throw new SymbolNotFoundError("Symbol not found: glColorP4ui");
        try { Handles.MH_glColorP4ui.invokeExact(handles.PFN_glColorP4ui, type, color); }
        catch (Throwable e) { throw new RuntimeException("error in glColorP4ui", e); }
    }

    public void ColorP4uiv(@CType("GLenum") int type, @CType("const GLuint *") MemorySegment color) {
        if (Unmarshal.isNullPointer(handles.PFN_glColorP4uiv)) throw new SymbolNotFoundError("Symbol not found: glColorP4uiv");
        try { Handles.MH_glColorP4uiv.invokeExact(handles.PFN_glColorP4uiv, type, color); }
        catch (Throwable e) { throw new RuntimeException("error in glColorP4uiv", e); }
    }

    public void SecondaryColorP3ui(@CType("GLenum") int type, @CType("GLuint") int color) {
        if (Unmarshal.isNullPointer(handles.PFN_glSecondaryColorP3ui)) throw new SymbolNotFoundError("Symbol not found: glSecondaryColorP3ui");
        try { Handles.MH_glSecondaryColorP3ui.invokeExact(handles.PFN_glSecondaryColorP3ui, type, color); }
        catch (Throwable e) { throw new RuntimeException("error in glSecondaryColorP3ui", e); }
    }

    public void SecondaryColorP3uiv(@CType("GLenum") int type, @CType("const GLuint *") MemorySegment color) {
        if (Unmarshal.isNullPointer(handles.PFN_glSecondaryColorP3uiv)) throw new SymbolNotFoundError("Symbol not found: glSecondaryColorP3uiv");
        try { Handles.MH_glSecondaryColorP3uiv.invokeExact(handles.PFN_glSecondaryColorP3uiv, type, color); }
        catch (Throwable e) { throw new RuntimeException("error in glSecondaryColorP3uiv", e); }
    }

}

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
import overrungl.opengl.*;

public final class GLEXTDrawBuffers2 {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glColorMaskIndexedEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glGetBooleanIndexedvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetIntegerIndexedvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glEnableIndexedEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDisableIndexedEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glIsEnabledIndexedEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glColorMaskIndexedEXT;
        public final MemorySegment PFN_glGetBooleanIndexedvEXT;
        public final MemorySegment PFN_glGetIntegerIndexedvEXT;
        public final MemorySegment PFN_glEnableIndexedEXT;
        public final MemorySegment PFN_glDisableIndexedEXT;
        public final MemorySegment PFN_glIsEnabledIndexedEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glColorMaskIndexedEXT = func.invoke("glColorMaskIndexedEXT", "glColorMaski");
            PFN_glGetBooleanIndexedvEXT = func.invoke("glGetBooleanIndexedvEXT", "glGetBooleani_v");
            PFN_glGetIntegerIndexedvEXT = func.invoke("glGetIntegerIndexedvEXT", "glGetIntegeri_v");
            PFN_glEnableIndexedEXT = func.invoke("glEnableIndexedEXT", "glEnablei");
            PFN_glDisableIndexedEXT = func.invoke("glDisableIndexedEXT", "glDisablei");
            PFN_glIsEnabledIndexedEXT = func.invoke("glIsEnabledIndexedEXT", "glIsEnabledi");
        }
    }

    public GLEXTDrawBuffers2(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glColorMaskIndexedEXT((unsigned int) GLuint index, GLboolean r, GLboolean g, GLboolean b, GLboolean a);
    /// ```
    public void ColorMaskIndexedEXT(int index, boolean r, boolean g, boolean b, boolean a) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColorMaskIndexedEXT)) throw new GLSymbolNotFoundError("Symbol not found: glColorMaskIndexedEXT");
        try { Handles.MH_glColorMaskIndexedEXT.invokeExact(handles.PFN_glColorMaskIndexedEXT, index, ((r) ? (byte)1 : (byte)0), ((g) ? (byte)1 : (byte)0), ((b) ? (byte)1 : (byte)0), ((a) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in ColorMaskIndexedEXT", e); }
    }

    /// ```
    /// void glGetBooleanIndexedvEXT((unsigned int) GLenum target, (unsigned int) GLuint index, GLboolean* data);
    /// ```
    public void GetBooleanIndexedvEXT(int target, int index, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetBooleanIndexedvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetBooleanIndexedvEXT");
        try { Handles.MH_glGetBooleanIndexedvEXT.invokeExact(handles.PFN_glGetBooleanIndexedvEXT, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetBooleanIndexedvEXT", e); }
    }

    /// ```
    /// void glGetIntegerIndexedvEXT((unsigned int) GLenum target, (unsigned int) GLuint index, GLint* data);
    /// ```
    public void GetIntegerIndexedvEXT(int target, int index, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetIntegerIndexedvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetIntegerIndexedvEXT");
        try { Handles.MH_glGetIntegerIndexedvEXT.invokeExact(handles.PFN_glGetIntegerIndexedvEXT, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetIntegerIndexedvEXT", e); }
    }

    /// ```
    /// void glEnableIndexedEXT((unsigned int) GLenum target, (unsigned int) GLuint index);
    /// ```
    public void EnableIndexedEXT(int target, int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEnableIndexedEXT)) throw new GLSymbolNotFoundError("Symbol not found: glEnableIndexedEXT");
        try { Handles.MH_glEnableIndexedEXT.invokeExact(handles.PFN_glEnableIndexedEXT, target, index); }
        catch (Throwable e) { throw new RuntimeException("error in EnableIndexedEXT", e); }
    }

    /// ```
    /// void glDisableIndexedEXT((unsigned int) GLenum target, (unsigned int) GLuint index);
    /// ```
    public void DisableIndexedEXT(int target, int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDisableIndexedEXT)) throw new GLSymbolNotFoundError("Symbol not found: glDisableIndexedEXT");
        try { Handles.MH_glDisableIndexedEXT.invokeExact(handles.PFN_glDisableIndexedEXT, target, index); }
        catch (Throwable e) { throw new RuntimeException("error in DisableIndexedEXT", e); }
    }

    /// ```
    /// GLboolean glIsEnabledIndexedEXT((unsigned int) GLenum target, (unsigned int) GLuint index);
    /// ```
    public boolean IsEnabledIndexedEXT(int target, int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsEnabledIndexedEXT)) throw new GLSymbolNotFoundError("Symbol not found: glIsEnabledIndexedEXT");
        try { return (((byte) Handles.MH_glIsEnabledIndexedEXT.invokeExact(handles.PFN_glIsEnabledIndexedEXT, target, index)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsEnabledIndexedEXT", e); }
    }

}

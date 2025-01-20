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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTDrawBuffers2 {
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glColorMaskIndexedEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN);
        public static final FunctionDescriptor FD_glGetBooleanIndexedvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetIntegerIndexedvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glEnableIndexedEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDisableIndexedEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glIsEnabledIndexedEXT = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    }
    public static final class Handles {
        public static final MethodHandle MH_glColorMaskIndexedEXT = RuntimeHelper.downcall(Descriptors.FD_glColorMaskIndexedEXT);
        public static final MethodHandle MH_glGetBooleanIndexedvEXT = RuntimeHelper.downcall(Descriptors.FD_glGetBooleanIndexedvEXT);
        public static final MethodHandle MH_glGetIntegerIndexedvEXT = RuntimeHelper.downcall(Descriptors.FD_glGetIntegerIndexedvEXT);
        public static final MethodHandle MH_glEnableIndexedEXT = RuntimeHelper.downcall(Descriptors.FD_glEnableIndexedEXT);
        public static final MethodHandle MH_glDisableIndexedEXT = RuntimeHelper.downcall(Descriptors.FD_glDisableIndexedEXT);
        public static final MethodHandle MH_glIsEnabledIndexedEXT = RuntimeHelper.downcall(Descriptors.FD_glIsEnabledIndexedEXT);
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

    public void ColorMaskIndexedEXT(@CType("GLuint") int index, @CType("GLboolean") boolean r, @CType("GLboolean") boolean g, @CType("GLboolean") boolean b, @CType("GLboolean") boolean a) {
        if (Unmarshal.isNullPointer(handles.PFN_glColorMaskIndexedEXT)) throw new SymbolNotFoundError("Symbol not found: glColorMaskIndexedEXT");
        try { Handles.MH_glColorMaskIndexedEXT.invokeExact(handles.PFN_glColorMaskIndexedEXT, index, r, g, b, a); }
        catch (Throwable e) { throw new RuntimeException("error in glColorMaskIndexedEXT", e); }
    }

    public void GetBooleanIndexedvEXT(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLboolean *") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetBooleanIndexedvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetBooleanIndexedvEXT");
        try { Handles.MH_glGetBooleanIndexedvEXT.invokeExact(handles.PFN_glGetBooleanIndexedvEXT, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetBooleanIndexedvEXT", e); }
    }

    public void GetIntegerIndexedvEXT(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLint *") MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetIntegerIndexedvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetIntegerIndexedvEXT");
        try { Handles.MH_glGetIntegerIndexedvEXT.invokeExact(handles.PFN_glGetIntegerIndexedvEXT, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetIntegerIndexedvEXT", e); }
    }

    public void EnableIndexedEXT(@CType("GLenum") int target, @CType("GLuint") int index) {
        if (Unmarshal.isNullPointer(handles.PFN_glEnableIndexedEXT)) throw new SymbolNotFoundError("Symbol not found: glEnableIndexedEXT");
        try { Handles.MH_glEnableIndexedEXT.invokeExact(handles.PFN_glEnableIndexedEXT, target, index); }
        catch (Throwable e) { throw new RuntimeException("error in glEnableIndexedEXT", e); }
    }

    public void DisableIndexedEXT(@CType("GLenum") int target, @CType("GLuint") int index) {
        if (Unmarshal.isNullPointer(handles.PFN_glDisableIndexedEXT)) throw new SymbolNotFoundError("Symbol not found: glDisableIndexedEXT");
        try { Handles.MH_glDisableIndexedEXT.invokeExact(handles.PFN_glDisableIndexedEXT, target, index); }
        catch (Throwable e) { throw new RuntimeException("error in glDisableIndexedEXT", e); }
    }

    public @CType("GLboolean") boolean IsEnabledIndexedEXT(@CType("GLenum") int target, @CType("GLuint") int index) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsEnabledIndexedEXT)) throw new SymbolNotFoundError("Symbol not found: glIsEnabledIndexedEXT");
        try { return (boolean) Handles.MH_glIsEnabledIndexedEXT.invokeExact(handles.PFN_glIsEnabledIndexedEXT, target, index); }
        catch (Throwable e) { throw new RuntimeException("error in glIsEnabledIndexedEXT", e); }
    }

}

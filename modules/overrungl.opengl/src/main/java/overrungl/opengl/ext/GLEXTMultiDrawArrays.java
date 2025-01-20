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

public final class GLEXTMultiDrawArrays {
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glMultiDrawArraysEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMultiDrawElementsEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
    }
    public static final class Handles {
        public static final MethodHandle MH_glMultiDrawArraysEXT = RuntimeHelper.downcall(Descriptors.FD_glMultiDrawArraysEXT);
        public static final MethodHandle MH_glMultiDrawElementsEXT = RuntimeHelper.downcall(Descriptors.FD_glMultiDrawElementsEXT);
        public final MemorySegment PFN_glMultiDrawArraysEXT;
        public final MemorySegment PFN_glMultiDrawElementsEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glMultiDrawArraysEXT = func.invoke("glMultiDrawArraysEXT", "glMultiDrawArrays");
            PFN_glMultiDrawElementsEXT = func.invoke("glMultiDrawElementsEXT", "glMultiDrawElements");
        }
    }

    public GLEXTMultiDrawArrays(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void MultiDrawArraysEXT(@CType("GLenum") int mode, @CType("const GLint *") MemorySegment first, @CType("const GLsizei *") MemorySegment count, @CType("GLsizei") int primcount) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiDrawArraysEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiDrawArraysEXT");
        try { Handles.MH_glMultiDrawArraysEXT.invokeExact(handles.PFN_glMultiDrawArraysEXT, mode, first, count, primcount); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiDrawArraysEXT", e); }
    }

    public void MultiDrawElementsEXT(@CType("GLenum") int mode, @CType("const GLsizei *") MemorySegment count, @CType("GLenum") int type, @CType("const void *const*") MemorySegment indices, @CType("GLsizei") int primcount) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiDrawElementsEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiDrawElementsEXT");
        try { Handles.MH_glMultiDrawElementsEXT.invokeExact(handles.PFN_glMultiDrawElementsEXT, mode, count, type, indices, primcount); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiDrawElementsEXT", e); }
    }

}

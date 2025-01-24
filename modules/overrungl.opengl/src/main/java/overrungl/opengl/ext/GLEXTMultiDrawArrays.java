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

public final class GLEXTMultiDrawArrays {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glMultiDrawArraysEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiDrawElementsEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
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

    /// ```
    /// void glMultiDrawArraysEXT(unsigned int mode, const GLint* first, const GLsizei* count, int primcount);
    /// ```
    public void MultiDrawArraysEXT(int mode, MemorySegment first, MemorySegment count, int primcount) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawArraysEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiDrawArraysEXT");
        try { Handles.MH_glMultiDrawArraysEXT.invokeExact(handles.PFN_glMultiDrawArraysEXT, mode, first, count, primcount); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawArraysEXT", e); }
    }

    /// ```
    /// void glMultiDrawElementsEXT(unsigned int mode, const GLsizei* count, unsigned int type, const void* const * indices, int primcount);
    /// ```
    public void MultiDrawElementsEXT(int mode, MemorySegment count, int type, MemorySegment indices, int primcount) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawElementsEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiDrawElementsEXT");
        try { Handles.MH_glMultiDrawElementsEXT.invokeExact(handles.PFN_glMultiDrawElementsEXT, mode, count, type, indices, primcount); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawElementsEXT", e); }
    }

}

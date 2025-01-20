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

public final class GLEXTDrawInstanced {
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glDrawArraysInstancedEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDrawElementsInstancedEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
    }
    public static final class Handles {
        public static final MethodHandle MH_glDrawArraysInstancedEXT = RuntimeHelper.downcall(Descriptors.FD_glDrawArraysInstancedEXT);
        public static final MethodHandle MH_glDrawElementsInstancedEXT = RuntimeHelper.downcall(Descriptors.FD_glDrawElementsInstancedEXT);
        public final MemorySegment PFN_glDrawArraysInstancedEXT;
        public final MemorySegment PFN_glDrawElementsInstancedEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glDrawArraysInstancedEXT = func.invoke("glDrawArraysInstancedEXT", "glDrawArraysInstanced");
            PFN_glDrawElementsInstancedEXT = func.invoke("glDrawElementsInstancedEXT", "glDrawElementsInstanced");
        }
    }

    public GLEXTDrawInstanced(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void DrawArraysInstancedEXT(@CType("GLenum") int mode, @CType("GLint") int start, @CType("GLsizei") int count, @CType("GLsizei") int primcount) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawArraysInstancedEXT)) throw new SymbolNotFoundError("Symbol not found: glDrawArraysInstancedEXT");
        try { Handles.MH_glDrawArraysInstancedEXT.invokeExact(handles.PFN_glDrawArraysInstancedEXT, mode, start, count, primcount); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawArraysInstancedEXT", e); }
    }

    public void DrawElementsInstancedEXT(@CType("GLenum") int mode, @CType("GLsizei") int count, @CType("GLenum") int type, @CType("const void *") MemorySegment indices, @CType("GLsizei") int primcount) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawElementsInstancedEXT)) throw new SymbolNotFoundError("Symbol not found: glDrawElementsInstancedEXT");
        try { Handles.MH_glDrawElementsInstancedEXT.invokeExact(handles.PFN_glDrawElementsInstancedEXT, mode, count, type, indices, primcount); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawElementsInstancedEXT", e); }
    }

}

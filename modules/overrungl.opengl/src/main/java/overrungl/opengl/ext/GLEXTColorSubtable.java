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

public final class GLEXTColorSubtable {
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glColorSubTableEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCopyColorSubTableEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    }
    public static final class Handles {
        public static final MethodHandle MH_glColorSubTableEXT = RuntimeHelper.downcall(Descriptors.FD_glColorSubTableEXT);
        public static final MethodHandle MH_glCopyColorSubTableEXT = RuntimeHelper.downcall(Descriptors.FD_glCopyColorSubTableEXT);
        public final MemorySegment PFN_glColorSubTableEXT;
        public final MemorySegment PFN_glCopyColorSubTableEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glColorSubTableEXT = func.invoke("glColorSubTableEXT", "glColorSubTable");
            PFN_glCopyColorSubTableEXT = func.invoke("glCopyColorSubTableEXT", "glCopyColorSubTable");
        }
    }

    public GLEXTColorSubtable(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void ColorSubTableEXT(@CType("GLenum") int target, @CType("GLsizei") int start, @CType("GLsizei") int count, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glColorSubTableEXT)) throw new SymbolNotFoundError("Symbol not found: glColorSubTableEXT");
        try { Handles.MH_glColorSubTableEXT.invokeExact(handles.PFN_glColorSubTableEXT, target, start, count, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in glColorSubTableEXT", e); }
    }

    public void CopyColorSubTableEXT(@CType("GLenum") int target, @CType("GLsizei") int start, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyColorSubTableEXT)) throw new SymbolNotFoundError("Symbol not found: glCopyColorSubTableEXT");
        try { Handles.MH_glCopyColorSubTableEXT.invokeExact(handles.PFN_glCopyColorSubTableEXT, target, start, x, y, width); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyColorSubTableEXT", e); }
    }

}

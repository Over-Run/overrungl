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

public final class GLEXTColorSubtable {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glColorSubTableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCopyColorSubTableEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
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

    /// ```
    /// void glColorSubTableEXT((unsigned int) GLenum target, (int) GLsizei start, (int) GLsizei count, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* data);
    /// ```
    public void ColorSubTableEXT(int target, int start, int count, int format, int type, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glColorSubTableEXT)) throw new GLSymbolNotFoundError("Symbol not found: glColorSubTableEXT");
        try { Handles.MH_glColorSubTableEXT.invokeExact(handles.PFN_glColorSubTableEXT, target, start, count, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in ColorSubTableEXT", e); }
    }

    /// ```
    /// void glCopyColorSubTableEXT((unsigned int) GLenum target, (int) GLsizei start, (int) GLint x, (int) GLint y, (int) GLsizei width);
    /// ```
    public void CopyColorSubTableEXT(int target, int start, int x, int y, int width) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyColorSubTableEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCopyColorSubTableEXT");
        try { Handles.MH_glCopyColorSubTableEXT.invokeExact(handles.PFN_glCopyColorSubTableEXT, target, start, x, y, width); }
        catch (Throwable e) { throw new RuntimeException("error in CopyColorSubTableEXT", e); }
    }

}

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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_draw_instanced`
public final class GLEXTDrawInstanced {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDrawArraysInstancedEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawElementsInstancedEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glDrawArraysInstancedEXT;
        public final MemorySegment PFN_glDrawElementsInstancedEXT;
        private Handles(GLLoadFunc func) {
            PFN_glDrawArraysInstancedEXT = func.invoke("glDrawArraysInstancedEXT", "glDrawArraysInstanced");
            PFN_glDrawElementsInstancedEXT = func.invoke("glDrawElementsInstancedEXT", "glDrawElementsInstanced");
        }
    }

    public GLEXTDrawInstanced(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glDrawArraysInstancedEXT`.
    /// ```
    /// void glDrawArraysInstancedEXT((unsigned int) GLenum mode, (int) GLint start, (int) GLsizei count, (int) GLsizei primcount);
    /// ```
    public void DrawArraysInstancedEXT(int mode, int start, int count, int primcount) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawArraysInstancedEXT)) throw new GLSymbolNotFoundError("Symbol not found: glDrawArraysInstancedEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawArraysInstancedEXT", mode, start, count, primcount); }
        Handles.MH_glDrawArraysInstancedEXT.invokeExact(handles.PFN_glDrawArraysInstancedEXT, mode, start, count, primcount); }
        catch (Throwable e) { throw new RuntimeException("error in DrawArraysInstancedEXT", e); }
    }

    /// Invokes `glDrawElementsInstancedEXT`.
    /// ```
    /// void glDrawElementsInstancedEXT((unsigned int) GLenum mode, (int) GLsizei count, (unsigned int) GLenum type, const void* indices, (int) GLsizei primcount);
    /// ```
    public void DrawElementsInstancedEXT(int mode, int count, int type, @NonNull MemorySegment indices, int primcount) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawElementsInstancedEXT)) throw new GLSymbolNotFoundError("Symbol not found: glDrawElementsInstancedEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawElementsInstancedEXT", mode, count, type, indices, primcount); }
        Handles.MH_glDrawElementsInstancedEXT.invokeExact(handles.PFN_glDrawElementsInstancedEXT, mode, count, type, indices, primcount); }
        catch (Throwable e) { throw new RuntimeException("error in DrawElementsInstancedEXT", e); }
    }

}

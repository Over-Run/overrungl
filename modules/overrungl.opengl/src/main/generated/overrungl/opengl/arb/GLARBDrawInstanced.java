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
/// `GL_ARB_draw_instanced`
public final class GLARBDrawInstanced {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDrawArraysInstancedARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDrawElementsInstancedARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glDrawArraysInstancedARB;
        public final MemorySegment PFN_glDrawElementsInstancedARB;
        private Handles(GLLoadFunc func) {
            PFN_glDrawArraysInstancedARB = func.invoke("glDrawArraysInstancedARB", "glDrawArraysInstanced");
            PFN_glDrawElementsInstancedARB = func.invoke("glDrawElementsInstancedARB", "glDrawElementsInstanced");
        }
    }

    public GLARBDrawInstanced(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glDrawArraysInstancedARB`.
    /// ```
    /// void glDrawArraysInstancedARB((unsigned int) GLenum mode, (int) GLint first, (int) GLsizei count, (int) GLsizei primcount);
    /// ```
    public void DrawArraysInstancedARB(int mode, int first, int count, int primcount) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawArraysInstancedARB)) throw new GLSymbolNotFoundError("Symbol not found: glDrawArraysInstancedARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawArraysInstancedARB", mode, first, count, primcount); }
        Handles.MH_glDrawArraysInstancedARB.invokeExact(handles.PFN_glDrawArraysInstancedARB, mode, first, count, primcount); }
        catch (Throwable e) { throw new RuntimeException("error in DrawArraysInstancedARB", e); }
    }

    /// Invokes `glDrawElementsInstancedARB`.
    /// ```
    /// void glDrawElementsInstancedARB((unsigned int) GLenum mode, (int) GLsizei count, (unsigned int) GLenum type, const void* indices, (int) GLsizei primcount);
    /// ```
    public void DrawElementsInstancedARB(int mode, int count, int type, @NonNull MemorySegment indices, int primcount) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawElementsInstancedARB)) throw new GLSymbolNotFoundError("Symbol not found: glDrawElementsInstancedARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDrawElementsInstancedARB", mode, count, type, indices, primcount); }
        Handles.MH_glDrawElementsInstancedARB.invokeExact(handles.PFN_glDrawElementsInstancedARB, mode, count, type, indices, primcount); }
        catch (Throwable e) { throw new RuntimeException("error in DrawElementsInstancedARB", e); }
    }

}

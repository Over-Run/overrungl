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

public final class GLARBDrawInstanced {
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glDrawArraysInstancedARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDrawElementsInstancedARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
    }
    public static final class Handles {
        public static final MethodHandle MH_glDrawArraysInstancedARB = RuntimeHelper.downcall(Descriptors.FD_glDrawArraysInstancedARB);
        public static final MethodHandle MH_glDrawElementsInstancedARB = RuntimeHelper.downcall(Descriptors.FD_glDrawElementsInstancedARB);
        public final MemorySegment PFN_glDrawArraysInstancedARB;
        public final MemorySegment PFN_glDrawElementsInstancedARB;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glDrawArraysInstancedARB = func.invoke("glDrawArraysInstancedARB", "glDrawArraysInstanced");
            PFN_glDrawElementsInstancedARB = func.invoke("glDrawElementsInstancedARB", "glDrawElementsInstanced");
        }
    }

    public GLARBDrawInstanced(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void DrawArraysInstancedARB(@CType("GLenum") int mode, @CType("GLint") int first, @CType("GLsizei") int count, @CType("GLsizei") int primcount) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawArraysInstancedARB)) throw new SymbolNotFoundError("Symbol not found: glDrawArraysInstancedARB");
        try { Handles.MH_glDrawArraysInstancedARB.invokeExact(handles.PFN_glDrawArraysInstancedARB, mode, first, count, primcount); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawArraysInstancedARB", e); }
    }

    public void DrawElementsInstancedARB(@CType("GLenum") int mode, @CType("GLsizei") int count, @CType("GLenum") int type, @CType("const void *") MemorySegment indices, @CType("GLsizei") int primcount) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawElementsInstancedARB)) throw new SymbolNotFoundError("Symbol not found: glDrawElementsInstancedARB");
        try { Handles.MH_glDrawElementsInstancedARB.invokeExact(handles.PFN_glDrawElementsInstancedARB, mode, count, type, indices, primcount); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawElementsInstancedARB", e); }
    }

}

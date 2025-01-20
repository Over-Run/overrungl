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

public final class GLARBMultiDrawIndirect {
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glMultiDrawArraysIndirect = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMultiDrawElementsIndirect = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    }
    public static final class Handles {
        public static final MethodHandle MH_glMultiDrawArraysIndirect = RuntimeHelper.downcall(Descriptors.FD_glMultiDrawArraysIndirect);
        public static final MethodHandle MH_glMultiDrawElementsIndirect = RuntimeHelper.downcall(Descriptors.FD_glMultiDrawElementsIndirect);
        public final MemorySegment PFN_glMultiDrawArraysIndirect;
        public final MemorySegment PFN_glMultiDrawElementsIndirect;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glMultiDrawArraysIndirect = func.invoke("glMultiDrawArraysIndirect");
            PFN_glMultiDrawElementsIndirect = func.invoke("glMultiDrawElementsIndirect");
        }
    }

    public GLARBMultiDrawIndirect(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void MultiDrawArraysIndirect(@CType("GLenum") int mode, @CType("const void *") java.lang.foreign.MemorySegment indirect, @CType("GLsizei") int drawcount, @CType("GLsizei") int stride) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiDrawArraysIndirect)) throw new SymbolNotFoundError("Symbol not found: glMultiDrawArraysIndirect");
        try { Handles.MH_glMultiDrawArraysIndirect.invokeExact(handles.PFN_glMultiDrawArraysIndirect, mode, indirect, drawcount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiDrawArraysIndirect", e); }
    }

    public void MultiDrawElementsIndirect(@CType("GLenum") int mode, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment indirect, @CType("GLsizei") int drawcount, @CType("GLsizei") int stride) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiDrawElementsIndirect)) throw new SymbolNotFoundError("Symbol not found: glMultiDrawElementsIndirect");
        try { Handles.MH_glMultiDrawElementsIndirect.invokeExact(handles.PFN_glMultiDrawElementsIndirect, mode, type, indirect, drawcount, stride); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiDrawElementsIndirect", e); }
    }

}

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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBDrawIndirect {
    public static final int GL_DRAW_INDIRECT_BUFFER = 0x8F3F;
    public static final int GL_DRAW_INDIRECT_BUFFER_BINDING = 0x8F43;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glDrawArraysIndirect = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glDrawElementsIndirect = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glDrawArraysIndirect,
            FD_glDrawElementsIndirect
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glDrawArraysIndirect = RuntimeHelper.downcall(Descriptors.FD_glDrawArraysIndirect);
        public static final MethodHandle MH_glDrawElementsIndirect = RuntimeHelper.downcall(Descriptors.FD_glDrawElementsIndirect);
        public final MemorySegment PFN_glDrawArraysIndirect;
        public final MemorySegment PFN_glDrawElementsIndirect;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glDrawArraysIndirect = func.invoke("glDrawArraysIndirect");
            PFN_glDrawElementsIndirect = func.invoke("glDrawElementsIndirect");
        }
    }

    public GLARBDrawIndirect(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void DrawArraysIndirect(@CType("GLenum") int mode, @CType("const void *") java.lang.foreign.MemorySegment indirect) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawArraysIndirect)) throw new SymbolNotFoundError("Symbol not found: glDrawArraysIndirect");
        try { Handles.MH_glDrawArraysIndirect.invokeExact(handles.PFN_glDrawArraysIndirect, mode, indirect); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawArraysIndirect", e); }
    }

    public void DrawElementsIndirect(@CType("GLenum") int mode, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment indirect) {
        if (Unmarshal.isNullPointer(handles.PFN_glDrawElementsIndirect)) throw new SymbolNotFoundError("Symbol not found: glDrawElementsIndirect");
        try { Handles.MH_glDrawElementsIndirect.invokeExact(handles.PFN_glDrawElementsIndirect, mode, type, indirect); }
        catch (Throwable e) { throw new RuntimeException("error in glDrawElementsIndirect", e); }
    }

}

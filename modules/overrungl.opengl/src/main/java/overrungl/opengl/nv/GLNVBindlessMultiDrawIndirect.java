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
package overrungl.opengl.nv;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVBindlessMultiDrawIndirect {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glMultiDrawArraysIndirectBindlessNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiDrawElementsIndirectBindlessNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glMultiDrawArraysIndirectBindlessNV;
        public final MemorySegment PFN_glMultiDrawElementsIndirectBindlessNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glMultiDrawArraysIndirectBindlessNV = func.invoke("glMultiDrawArraysIndirectBindlessNV");
            PFN_glMultiDrawElementsIndirectBindlessNV = func.invoke("glMultiDrawElementsIndirectBindlessNV");
        }
    }

    public GLNVBindlessMultiDrawIndirect(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glMultiDrawArraysIndirectBindlessNV(unsigned int mode, const void* indirect, int drawCount, int stride, int vertexBufferCount);
    /// ```
    public void MultiDrawArraysIndirectBindlessNV(int mode, MemorySegment indirect, int drawCount, int stride, int vertexBufferCount) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawArraysIndirectBindlessNV)) throw new SymbolNotFoundError("Symbol not found: glMultiDrawArraysIndirectBindlessNV");
        try { Handles.MH_glMultiDrawArraysIndirectBindlessNV.invokeExact(handles.PFN_glMultiDrawArraysIndirectBindlessNV, mode, indirect, drawCount, stride, vertexBufferCount); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawArraysIndirectBindlessNV", e); }
    }

    /// ```
    /// void glMultiDrawElementsIndirectBindlessNV(unsigned int mode, unsigned int type, const void* indirect, int drawCount, int stride, int vertexBufferCount);
    /// ```
    public void MultiDrawElementsIndirectBindlessNV(int mode, int type, MemorySegment indirect, int drawCount, int stride, int vertexBufferCount) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiDrawElementsIndirectBindlessNV)) throw new SymbolNotFoundError("Symbol not found: glMultiDrawElementsIndirectBindlessNV");
        try { Handles.MH_glMultiDrawElementsIndirectBindlessNV.invokeExact(handles.PFN_glMultiDrawElementsIndirectBindlessNV, mode, type, indirect, drawCount, stride, vertexBufferCount); }
        catch (Throwable e) { throw new RuntimeException("error in MultiDrawElementsIndirectBindlessNV", e); }
    }

}

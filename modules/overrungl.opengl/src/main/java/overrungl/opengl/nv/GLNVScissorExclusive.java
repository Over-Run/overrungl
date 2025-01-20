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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVScissorExclusive {
    public static final int GL_SCISSOR_TEST_EXCLUSIVE_NV = 0x9555;
    public static final int GL_SCISSOR_BOX_EXCLUSIVE_NV = 0x9556;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glScissorExclusiveNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glScissorExclusiveArrayvNV = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glScissorExclusiveNV = RuntimeHelper.downcall(Descriptors.FD_glScissorExclusiveNV);
        public static final MethodHandle MH_glScissorExclusiveArrayvNV = RuntimeHelper.downcall(Descriptors.FD_glScissorExclusiveArrayvNV);
        public final MemorySegment PFN_glScissorExclusiveNV;
        public final MemorySegment PFN_glScissorExclusiveArrayvNV;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glScissorExclusiveNV = func.invoke("glScissorExclusiveNV");
            PFN_glScissorExclusiveArrayvNV = func.invoke("glScissorExclusiveArrayvNV");
        }
    }

    public GLNVScissorExclusive(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void ScissorExclusiveNV(@CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glScissorExclusiveNV)) throw new SymbolNotFoundError("Symbol not found: glScissorExclusiveNV");
        try { Handles.MH_glScissorExclusiveNV.invokeExact(handles.PFN_glScissorExclusiveNV, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glScissorExclusiveNV", e); }
    }

    public void ScissorExclusiveArrayvNV(@CType("GLuint") int first, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glScissorExclusiveArrayvNV)) throw new SymbolNotFoundError("Symbol not found: glScissorExclusiveArrayvNV");
        try { Handles.MH_glScissorExclusiveArrayvNV.invokeExact(handles.PFN_glScissorExclusiveArrayvNV, first, count, v); }
        catch (Throwable e) { throw new RuntimeException("error in glScissorExclusiveArrayvNV", e); }
    }

}

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
package overrungl.opengl.ati;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLATIEnvmapBumpmap {
    public static final int GL_BUMP_ROT_MATRIX_ATI = 0x8775;
    public static final int GL_BUMP_ROT_MATRIX_SIZE_ATI = 0x8776;
    public static final int GL_BUMP_NUM_TEX_UNITS_ATI = 0x8777;
    public static final int GL_BUMP_TEX_UNITS_ATI = 0x8778;
    public static final int GL_DUDV_ATI = 0x8779;
    public static final int GL_DU8DV8_ATI = 0x877A;
    public static final int GL_BUMP_ENVMAP_ATI = 0x877B;
    public static final int GL_BUMP_TARGET_ATI = 0x877C;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glTexBumpParameterivATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexBumpParameterfvATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTexBumpParameterivATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTexBumpParameterfvATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glTexBumpParameterivATI;
        public final MemorySegment PFN_glTexBumpParameterfvATI;
        public final MemorySegment PFN_glGetTexBumpParameterivATI;
        public final MemorySegment PFN_glGetTexBumpParameterfvATI;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glTexBumpParameterivATI = func.invoke("glTexBumpParameterivATI");
            PFN_glTexBumpParameterfvATI = func.invoke("glTexBumpParameterfvATI");
            PFN_glGetTexBumpParameterivATI = func.invoke("glGetTexBumpParameterivATI");
            PFN_glGetTexBumpParameterfvATI = func.invoke("glGetTexBumpParameterfvATI");
        }
    }

    public GLATIEnvmapBumpmap(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void TexBumpParameterivATI(@CType("GLenum") int pname, @CType("const GLint *") MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexBumpParameterivATI)) throw new SymbolNotFoundError("Symbol not found: glTexBumpParameterivATI");
        try { Handles.MH_glTexBumpParameterivATI.invokeExact(handles.PFN_glTexBumpParameterivATI, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glTexBumpParameterivATI", e); }
    }

    public void TexBumpParameterfvATI(@CType("GLenum") int pname, @CType("const GLfloat *") MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexBumpParameterfvATI)) throw new SymbolNotFoundError("Symbol not found: glTexBumpParameterfvATI");
        try { Handles.MH_glTexBumpParameterfvATI.invokeExact(handles.PFN_glTexBumpParameterfvATI, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glTexBumpParameterfvATI", e); }
    }

    public void GetTexBumpParameterivATI(@CType("GLenum") int pname, @CType("GLint *") MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTexBumpParameterivATI)) throw new SymbolNotFoundError("Symbol not found: glGetTexBumpParameterivATI");
        try { Handles.MH_glGetTexBumpParameterivATI.invokeExact(handles.PFN_glGetTexBumpParameterivATI, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTexBumpParameterivATI", e); }
    }

    public void GetTexBumpParameterfvATI(@CType("GLenum") int pname, @CType("GLfloat *") MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTexBumpParameterfvATI)) throw new SymbolNotFoundError("Symbol not found: glGetTexBumpParameterfvATI");
        try { Handles.MH_glGetTexBumpParameterfvATI.invokeExact(handles.PFN_glGetTexBumpParameterfvATI, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTexBumpParameterfvATI", e); }
    }

}

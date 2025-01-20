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
package overrungl.opengl.sgix;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLSGIXSprite {
    public static final int GL_SPRITE_SGIX = 0x8148;
    public static final int GL_SPRITE_MODE_SGIX = 0x8149;
    public static final int GL_SPRITE_AXIS_SGIX = 0x814A;
    public static final int GL_SPRITE_TRANSLATION_SGIX = 0x814B;
    public static final int GL_SPRITE_AXIAL_SGIX = 0x814C;
    public static final int GL_SPRITE_OBJECT_ALIGNED_SGIX = 0x814D;
    public static final int GL_SPRITE_EYE_ALIGNED_SGIX = 0x814E;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glSpriteParameterfSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glSpriteParameterfvSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glSpriteParameteriSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glSpriteParameterivSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glSpriteParameterfSGIX,
            FD_glSpriteParameterfvSGIX,
            FD_glSpriteParameteriSGIX,
            FD_glSpriteParameterivSGIX
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glSpriteParameterfSGIX = RuntimeHelper.downcall(Descriptors.FD_glSpriteParameterfSGIX);
        public static final MethodHandle MH_glSpriteParameterfvSGIX = RuntimeHelper.downcall(Descriptors.FD_glSpriteParameterfvSGIX);
        public static final MethodHandle MH_glSpriteParameteriSGIX = RuntimeHelper.downcall(Descriptors.FD_glSpriteParameteriSGIX);
        public static final MethodHandle MH_glSpriteParameterivSGIX = RuntimeHelper.downcall(Descriptors.FD_glSpriteParameterivSGIX);
        public final MemorySegment PFN_glSpriteParameterfSGIX;
        public final MemorySegment PFN_glSpriteParameterfvSGIX;
        public final MemorySegment PFN_glSpriteParameteriSGIX;
        public final MemorySegment PFN_glSpriteParameterivSGIX;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glSpriteParameterfSGIX = func.invoke("glSpriteParameterfSGIX");
            PFN_glSpriteParameterfvSGIX = func.invoke("glSpriteParameterfvSGIX");
            PFN_glSpriteParameteriSGIX = func.invoke("glSpriteParameteriSGIX");
            PFN_glSpriteParameterivSGIX = func.invoke("glSpriteParameterivSGIX");
        }
    }

    public GLSGIXSprite(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void SpriteParameterfSGIX(@CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (Unmarshal.isNullPointer(handles.PFN_glSpriteParameterfSGIX)) throw new SymbolNotFoundError("Symbol not found: glSpriteParameterfSGIX");
        try { Handles.MH_glSpriteParameterfSGIX.invokeExact(handles.PFN_glSpriteParameterfSGIX, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glSpriteParameterfSGIX", e); }
    }

    public void SpriteParameterfvSGIX(@CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glSpriteParameterfvSGIX)) throw new SymbolNotFoundError("Symbol not found: glSpriteParameterfvSGIX");
        try { Handles.MH_glSpriteParameterfvSGIX.invokeExact(handles.PFN_glSpriteParameterfvSGIX, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glSpriteParameterfvSGIX", e); }
    }

    public void SpriteParameteriSGIX(@CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glSpriteParameteriSGIX)) throw new SymbolNotFoundError("Symbol not found: glSpriteParameteriSGIX");
        try { Handles.MH_glSpriteParameteriSGIX.invokeExact(handles.PFN_glSpriteParameteriSGIX, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glSpriteParameteriSGIX", e); }
    }

    public void SpriteParameterivSGIX(@CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glSpriteParameterivSGIX)) throw new SymbolNotFoundError("Symbol not found: glSpriteParameterivSGIX");
        try { Handles.MH_glSpriteParameterivSGIX.invokeExact(handles.PFN_glSpriteParameterivSGIX, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glSpriteParameterivSGIX", e); }
    }

}

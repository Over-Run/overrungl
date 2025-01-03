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
    public static final MethodHandle MH_glSpriteParameterfSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glSpriteParameterfSGIX;
    public static final MethodHandle MH_glSpriteParameterfvSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glSpriteParameterfvSGIX;
    public static final MethodHandle MH_glSpriteParameteriSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glSpriteParameteriSGIX;
    public static final MethodHandle MH_glSpriteParameterivSGIX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glSpriteParameterivSGIX;

    public GLSGIXSprite(overrungl.opengl.GLLoadFunc func) {
        PFN_glSpriteParameterfSGIX = func.invoke("glSpriteParameterfSGIX");
        PFN_glSpriteParameterfvSGIX = func.invoke("glSpriteParameterfvSGIX");
        PFN_glSpriteParameteriSGIX = func.invoke("glSpriteParameteriSGIX");
        PFN_glSpriteParameterivSGIX = func.invoke("glSpriteParameterivSGIX");
    }

    public void SpriteParameterfSGIX(@CType("GLenum") int pname, @CType("GLfloat") float param) {
        try { if (!Unmarshal.isNullPointer(PFN_glSpriteParameterfSGIX))
            MH_glSpriteParameterfSGIX.invokeExact(PFN_glSpriteParameterfSGIX, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glSpriteParameterfSGIX", e); }
    }

    public void SpriteParameterfvSGIX(@CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glSpriteParameterfvSGIX))
            MH_glSpriteParameterfvSGIX.invokeExact(PFN_glSpriteParameterfvSGIX, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glSpriteParameterfvSGIX", e); }
    }

    public void SpriteParameteriSGIX(@CType("GLenum") int pname, @CType("GLint") int param) {
        try { if (!Unmarshal.isNullPointer(PFN_glSpriteParameteriSGIX))
            MH_glSpriteParameteriSGIX.invokeExact(PFN_glSpriteParameteriSGIX, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glSpriteParameteriSGIX", e); }
    }

    public void SpriteParameterivSGIX(@CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glSpriteParameterivSGIX))
            MH_glSpriteParameterivSGIX.invokeExact(PFN_glSpriteParameterivSGIX, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glSpriteParameterivSGIX", e); }
    }

}

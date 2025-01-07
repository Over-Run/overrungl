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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTSecondaryColor {
    public static final int GL_COLOR_SUM_EXT = 0x8458;
    public static final int GL_CURRENT_SECONDARY_COLOR_EXT = 0x8459;
    public static final int GL_SECONDARY_COLOR_ARRAY_SIZE_EXT = 0x845A;
    public static final int GL_SECONDARY_COLOR_ARRAY_TYPE_EXT = 0x845B;
    public static final int GL_SECONDARY_COLOR_ARRAY_STRIDE_EXT = 0x845C;
    public static final int GL_SECONDARY_COLOR_ARRAY_POINTER_EXT = 0x845D;
    public static final int GL_SECONDARY_COLOR_ARRAY_EXT = 0x845E;
    public static final MethodHandle MH_glSecondaryColor3bEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
    public final MemorySegment PFN_glSecondaryColor3bEXT;
    public static final MethodHandle MH_glSecondaryColor3bvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glSecondaryColor3bvEXT;
    public static final MethodHandle MH_glSecondaryColor3dEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glSecondaryColor3dEXT;
    public static final MethodHandle MH_glSecondaryColor3dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glSecondaryColor3dvEXT;
    public static final MethodHandle MH_glSecondaryColor3fEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glSecondaryColor3fEXT;
    public static final MethodHandle MH_glSecondaryColor3fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glSecondaryColor3fvEXT;
    public static final MethodHandle MH_glSecondaryColor3iEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glSecondaryColor3iEXT;
    public static final MethodHandle MH_glSecondaryColor3ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glSecondaryColor3ivEXT;
    public static final MethodHandle MH_glSecondaryColor3sEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glSecondaryColor3sEXT;
    public static final MethodHandle MH_glSecondaryColor3svEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glSecondaryColor3svEXT;
    public static final MethodHandle MH_glSecondaryColor3ubEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
    public final MemorySegment PFN_glSecondaryColor3ubEXT;
    public static final MethodHandle MH_glSecondaryColor3ubvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glSecondaryColor3ubvEXT;
    public static final MethodHandle MH_glSecondaryColor3uiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glSecondaryColor3uiEXT;
    public static final MethodHandle MH_glSecondaryColor3uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glSecondaryColor3uivEXT;
    public static final MethodHandle MH_glSecondaryColor3usEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glSecondaryColor3usEXT;
    public static final MethodHandle MH_glSecondaryColor3usvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glSecondaryColor3usvEXT;
    public static final MethodHandle MH_glSecondaryColorPointerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glSecondaryColorPointerEXT;

    public GLEXTSecondaryColor(overrungl.opengl.GLLoadFunc func) {
        PFN_glSecondaryColor3bEXT = func.invoke("glSecondaryColor3bEXT", "glSecondaryColor3b");
        PFN_glSecondaryColor3bvEXT = func.invoke("glSecondaryColor3bvEXT", "glSecondaryColor3bv");
        PFN_glSecondaryColor3dEXT = func.invoke("glSecondaryColor3dEXT", "glSecondaryColor3d");
        PFN_glSecondaryColor3dvEXT = func.invoke("glSecondaryColor3dvEXT", "glSecondaryColor3dv");
        PFN_glSecondaryColor3fEXT = func.invoke("glSecondaryColor3fEXT", "glSecondaryColor3f");
        PFN_glSecondaryColor3fvEXT = func.invoke("glSecondaryColor3fvEXT", "glSecondaryColor3fv");
        PFN_glSecondaryColor3iEXT = func.invoke("glSecondaryColor3iEXT", "glSecondaryColor3i");
        PFN_glSecondaryColor3ivEXT = func.invoke("glSecondaryColor3ivEXT", "glSecondaryColor3iv");
        PFN_glSecondaryColor3sEXT = func.invoke("glSecondaryColor3sEXT", "glSecondaryColor3s");
        PFN_glSecondaryColor3svEXT = func.invoke("glSecondaryColor3svEXT", "glSecondaryColor3sv");
        PFN_glSecondaryColor3ubEXT = func.invoke("glSecondaryColor3ubEXT", "glSecondaryColor3ub");
        PFN_glSecondaryColor3ubvEXT = func.invoke("glSecondaryColor3ubvEXT", "glSecondaryColor3ubv");
        PFN_glSecondaryColor3uiEXT = func.invoke("glSecondaryColor3uiEXT", "glSecondaryColor3ui");
        PFN_glSecondaryColor3uivEXT = func.invoke("glSecondaryColor3uivEXT", "glSecondaryColor3uiv");
        PFN_glSecondaryColor3usEXT = func.invoke("glSecondaryColor3usEXT", "glSecondaryColor3us");
        PFN_glSecondaryColor3usvEXT = func.invoke("glSecondaryColor3usvEXT", "glSecondaryColor3usv");
        PFN_glSecondaryColorPointerEXT = func.invoke("glSecondaryColorPointerEXT", "glSecondaryColorPointer");
    }

    public void SecondaryColor3bEXT(@CType("GLbyte") byte red, @CType("GLbyte") byte green, @CType("GLbyte") byte blue) {
        if (!Unmarshal.isNullPointer(PFN_glSecondaryColor3bEXT)) { try {
            MH_glSecondaryColor3bEXT.invokeExact(PFN_glSecondaryColor3bEXT, red, green, blue);
        } catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3bEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3bEXT"); }
    }

    public void SecondaryColor3bvEXT(@CType("const GLbyte *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glSecondaryColor3bvEXT)) { try {
            MH_glSecondaryColor3bvEXT.invokeExact(PFN_glSecondaryColor3bvEXT, v);
        } catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3bvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3bvEXT"); }
    }

    public void SecondaryColor3dEXT(@CType("GLdouble") double red, @CType("GLdouble") double green, @CType("GLdouble") double blue) {
        if (!Unmarshal.isNullPointer(PFN_glSecondaryColor3dEXT)) { try {
            MH_glSecondaryColor3dEXT.invokeExact(PFN_glSecondaryColor3dEXT, red, green, blue);
        } catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3dEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3dEXT"); }
    }

    public void SecondaryColor3dvEXT(@CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glSecondaryColor3dvEXT)) { try {
            MH_glSecondaryColor3dvEXT.invokeExact(PFN_glSecondaryColor3dvEXT, v);
        } catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3dvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3dvEXT"); }
    }

    public void SecondaryColor3fEXT(@CType("GLfloat") float red, @CType("GLfloat") float green, @CType("GLfloat") float blue) {
        if (!Unmarshal.isNullPointer(PFN_glSecondaryColor3fEXT)) { try {
            MH_glSecondaryColor3fEXT.invokeExact(PFN_glSecondaryColor3fEXT, red, green, blue);
        } catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3fEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3fEXT"); }
    }

    public void SecondaryColor3fvEXT(@CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glSecondaryColor3fvEXT)) { try {
            MH_glSecondaryColor3fvEXT.invokeExact(PFN_glSecondaryColor3fvEXT, v);
        } catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3fvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3fvEXT"); }
    }

    public void SecondaryColor3iEXT(@CType("GLint") int red, @CType("GLint") int green, @CType("GLint") int blue) {
        if (!Unmarshal.isNullPointer(PFN_glSecondaryColor3iEXT)) { try {
            MH_glSecondaryColor3iEXT.invokeExact(PFN_glSecondaryColor3iEXT, red, green, blue);
        } catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3iEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3iEXT"); }
    }

    public void SecondaryColor3ivEXT(@CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glSecondaryColor3ivEXT)) { try {
            MH_glSecondaryColor3ivEXT.invokeExact(PFN_glSecondaryColor3ivEXT, v);
        } catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3ivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3ivEXT"); }
    }

    public void SecondaryColor3sEXT(@CType("GLshort") short red, @CType("GLshort") short green, @CType("GLshort") short blue) {
        if (!Unmarshal.isNullPointer(PFN_glSecondaryColor3sEXT)) { try {
            MH_glSecondaryColor3sEXT.invokeExact(PFN_glSecondaryColor3sEXT, red, green, blue);
        } catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3sEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3sEXT"); }
    }

    public void SecondaryColor3svEXT(@CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glSecondaryColor3svEXT)) { try {
            MH_glSecondaryColor3svEXT.invokeExact(PFN_glSecondaryColor3svEXT, v);
        } catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3svEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3svEXT"); }
    }

    public void SecondaryColor3ubEXT(@CType("GLubyte") byte red, @CType("GLubyte") byte green, @CType("GLubyte") byte blue) {
        if (!Unmarshal.isNullPointer(PFN_glSecondaryColor3ubEXT)) { try {
            MH_glSecondaryColor3ubEXT.invokeExact(PFN_glSecondaryColor3ubEXT, red, green, blue);
        } catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3ubEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3ubEXT"); }
    }

    public void SecondaryColor3ubvEXT(@CType("const GLubyte *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glSecondaryColor3ubvEXT)) { try {
            MH_glSecondaryColor3ubvEXT.invokeExact(PFN_glSecondaryColor3ubvEXT, v);
        } catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3ubvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3ubvEXT"); }
    }

    public void SecondaryColor3uiEXT(@CType("GLuint") int red, @CType("GLuint") int green, @CType("GLuint") int blue) {
        if (!Unmarshal.isNullPointer(PFN_glSecondaryColor3uiEXT)) { try {
            MH_glSecondaryColor3uiEXT.invokeExact(PFN_glSecondaryColor3uiEXT, red, green, blue);
        } catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3uiEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3uiEXT"); }
    }

    public void SecondaryColor3uivEXT(@CType("const GLuint *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glSecondaryColor3uivEXT)) { try {
            MH_glSecondaryColor3uivEXT.invokeExact(PFN_glSecondaryColor3uivEXT, v);
        } catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3uivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3uivEXT"); }
    }

    public void SecondaryColor3usEXT(@CType("GLushort") short red, @CType("GLushort") short green, @CType("GLushort") short blue) {
        if (!Unmarshal.isNullPointer(PFN_glSecondaryColor3usEXT)) { try {
            MH_glSecondaryColor3usEXT.invokeExact(PFN_glSecondaryColor3usEXT, red, green, blue);
        } catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3usEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3usEXT"); }
    }

    public void SecondaryColor3usvEXT(@CType("const GLushort *") java.lang.foreign.MemorySegment v) {
        if (!Unmarshal.isNullPointer(PFN_glSecondaryColor3usvEXT)) { try {
            MH_glSecondaryColor3usvEXT.invokeExact(PFN_glSecondaryColor3usvEXT, v);
        } catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3usvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3usvEXT"); }
    }

    public void SecondaryColorPointerEXT(@CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (!Unmarshal.isNullPointer(PFN_glSecondaryColorPointerEXT)) { try {
            MH_glSecondaryColorPointerEXT.invokeExact(PFN_glSecondaryColorPointerEXT, size, type, stride, pointer);
        } catch (Throwable e) { throw new RuntimeException("error in glSecondaryColorPointerEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glSecondaryColorPointerEXT"); }
    }

}

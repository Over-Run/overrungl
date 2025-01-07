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

public final class GLEXTPixelTransform {
    public static final int GL_PIXEL_TRANSFORM_2D_EXT = 0x8330;
    public static final int GL_PIXEL_MAG_FILTER_EXT = 0x8331;
    public static final int GL_PIXEL_MIN_FILTER_EXT = 0x8332;
    public static final int GL_PIXEL_CUBIC_WEIGHT_EXT = 0x8333;
    public static final int GL_CUBIC_EXT = 0x8334;
    public static final int GL_AVERAGE_EXT = 0x8335;
    public static final int GL_PIXEL_TRANSFORM_2D_STACK_DEPTH_EXT = 0x8336;
    public static final int GL_MAX_PIXEL_TRANSFORM_2D_STACK_DEPTH_EXT = 0x8337;
    public static final int GL_PIXEL_TRANSFORM_2D_MATRIX_EXT = 0x8338;
    public static final MethodHandle MH_glPixelTransformParameteriEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glPixelTransformParameteriEXT;
    public static final MethodHandle MH_glPixelTransformParameterfEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glPixelTransformParameterfEXT;
    public static final MethodHandle MH_glPixelTransformParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glPixelTransformParameterivEXT;
    public static final MethodHandle MH_glPixelTransformParameterfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glPixelTransformParameterfvEXT;
    public static final MethodHandle MH_glGetPixelTransformParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetPixelTransformParameterivEXT;
    public static final MethodHandle MH_glGetPixelTransformParameterfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetPixelTransformParameterfvEXT;

    public GLEXTPixelTransform(overrungl.opengl.GLLoadFunc func) {
        PFN_glPixelTransformParameteriEXT = func.invoke("glPixelTransformParameteriEXT");
        PFN_glPixelTransformParameterfEXT = func.invoke("glPixelTransformParameterfEXT");
        PFN_glPixelTransformParameterivEXT = func.invoke("glPixelTransformParameterivEXT");
        PFN_glPixelTransformParameterfvEXT = func.invoke("glPixelTransformParameterfvEXT");
        PFN_glGetPixelTransformParameterivEXT = func.invoke("glGetPixelTransformParameterivEXT");
        PFN_glGetPixelTransformParameterfvEXT = func.invoke("glGetPixelTransformParameterfvEXT");
    }

    public void PixelTransformParameteriEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint") int param) {
        if (!Unmarshal.isNullPointer(PFN_glPixelTransformParameteriEXT)) { try {
            MH_glPixelTransformParameteriEXT.invokeExact(PFN_glPixelTransformParameteriEXT, target, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glPixelTransformParameteriEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glPixelTransformParameteriEXT"); }
    }

    public void PixelTransformParameterfEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (!Unmarshal.isNullPointer(PFN_glPixelTransformParameterfEXT)) { try {
            MH_glPixelTransformParameterfEXT.invokeExact(PFN_glPixelTransformParameterfEXT, target, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glPixelTransformParameterfEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glPixelTransformParameterfEXT"); }
    }

    public void PixelTransformParameterivEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glPixelTransformParameterivEXT)) { try {
            MH_glPixelTransformParameterivEXT.invokeExact(PFN_glPixelTransformParameterivEXT, target, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glPixelTransformParameterivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glPixelTransformParameterivEXT"); }
    }

    public void PixelTransformParameterfvEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glPixelTransformParameterfvEXT)) { try {
            MH_glPixelTransformParameterfvEXT.invokeExact(PFN_glPixelTransformParameterfvEXT, target, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glPixelTransformParameterfvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glPixelTransformParameterfvEXT"); }
    }

    public void GetPixelTransformParameterivEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetPixelTransformParameterivEXT)) { try {
            MH_glGetPixelTransformParameterivEXT.invokeExact(PFN_glGetPixelTransformParameterivEXT, target, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetPixelTransformParameterivEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetPixelTransformParameterivEXT"); }
    }

    public void GetPixelTransformParameterfvEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetPixelTransformParameterfvEXT)) { try {
            MH_glGetPixelTransformParameterfvEXT.invokeExact(PFN_glGetPixelTransformParameterfvEXT, target, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetPixelTransformParameterfvEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetPixelTransformParameterfvEXT"); }
    }

}

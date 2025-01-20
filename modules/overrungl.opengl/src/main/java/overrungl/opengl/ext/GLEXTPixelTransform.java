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
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glPixelTransformParameteriEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glPixelTransformParameterfEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glPixelTransformParameterivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glPixelTransformParameterfvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetPixelTransformParameterivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetPixelTransformParameterfvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glPixelTransformParameteriEXT = RuntimeHelper.downcall(Descriptors.FD_glPixelTransformParameteriEXT);
        public static final MethodHandle MH_glPixelTransformParameterfEXT = RuntimeHelper.downcall(Descriptors.FD_glPixelTransformParameterfEXT);
        public static final MethodHandle MH_glPixelTransformParameterivEXT = RuntimeHelper.downcall(Descriptors.FD_glPixelTransformParameterivEXT);
        public static final MethodHandle MH_glPixelTransformParameterfvEXT = RuntimeHelper.downcall(Descriptors.FD_glPixelTransformParameterfvEXT);
        public static final MethodHandle MH_glGetPixelTransformParameterivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetPixelTransformParameterivEXT);
        public static final MethodHandle MH_glGetPixelTransformParameterfvEXT = RuntimeHelper.downcall(Descriptors.FD_glGetPixelTransformParameterfvEXT);
        public final MemorySegment PFN_glPixelTransformParameteriEXT;
        public final MemorySegment PFN_glPixelTransformParameterfEXT;
        public final MemorySegment PFN_glPixelTransformParameterivEXT;
        public final MemorySegment PFN_glPixelTransformParameterfvEXT;
        public final MemorySegment PFN_glGetPixelTransformParameterivEXT;
        public final MemorySegment PFN_glGetPixelTransformParameterfvEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glPixelTransformParameteriEXT = func.invoke("glPixelTransformParameteriEXT");
            PFN_glPixelTransformParameterfEXT = func.invoke("glPixelTransformParameterfEXT");
            PFN_glPixelTransformParameterivEXT = func.invoke("glPixelTransformParameterivEXT");
            PFN_glPixelTransformParameterfvEXT = func.invoke("glPixelTransformParameterfvEXT");
            PFN_glGetPixelTransformParameterivEXT = func.invoke("glGetPixelTransformParameterivEXT");
            PFN_glGetPixelTransformParameterfvEXT = func.invoke("glGetPixelTransformParameterfvEXT");
        }
    }

    public GLEXTPixelTransform(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void PixelTransformParameteriEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glPixelTransformParameteriEXT)) throw new SymbolNotFoundError("Symbol not found: glPixelTransformParameteriEXT");
        try { Handles.MH_glPixelTransformParameteriEXT.invokeExact(handles.PFN_glPixelTransformParameteriEXT, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glPixelTransformParameteriEXT", e); }
    }

    public void PixelTransformParameterfEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (Unmarshal.isNullPointer(handles.PFN_glPixelTransformParameterfEXT)) throw new SymbolNotFoundError("Symbol not found: glPixelTransformParameterfEXT");
        try { Handles.MH_glPixelTransformParameterfEXT.invokeExact(handles.PFN_glPixelTransformParameterfEXT, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glPixelTransformParameterfEXT", e); }
    }

    public void PixelTransformParameterivEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLint *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glPixelTransformParameterivEXT)) throw new SymbolNotFoundError("Symbol not found: glPixelTransformParameterivEXT");
        try { Handles.MH_glPixelTransformParameterivEXT.invokeExact(handles.PFN_glPixelTransformParameterivEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glPixelTransformParameterivEXT", e); }
    }

    public void PixelTransformParameterfvEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLfloat *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glPixelTransformParameterfvEXT)) throw new SymbolNotFoundError("Symbol not found: glPixelTransformParameterfvEXT");
        try { Handles.MH_glPixelTransformParameterfvEXT.invokeExact(handles.PFN_glPixelTransformParameterfvEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glPixelTransformParameterfvEXT", e); }
    }

    public void GetPixelTransformParameterivEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetPixelTransformParameterivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetPixelTransformParameterivEXT");
        try { Handles.MH_glGetPixelTransformParameterivEXT.invokeExact(handles.PFN_glGetPixelTransformParameterivEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetPixelTransformParameterivEXT", e); }
    }

    public void GetPixelTransformParameterfvEXT(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetPixelTransformParameterfvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetPixelTransformParameterfvEXT");
        try { Handles.MH_glGetPixelTransformParameterfvEXT.invokeExact(handles.PFN_glGetPixelTransformParameterfvEXT, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetPixelTransformParameterfvEXT", e); }
    }

}

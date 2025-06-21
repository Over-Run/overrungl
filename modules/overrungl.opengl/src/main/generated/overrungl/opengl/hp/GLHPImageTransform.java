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
package overrungl.opengl.hp;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLHPImageTransform {
    public static final int GL_IMAGE_SCALE_X_HP = 0x8155;
    public static final int GL_IMAGE_SCALE_Y_HP = 0x8156;
    public static final int GL_IMAGE_TRANSLATE_X_HP = 0x8157;
    public static final int GL_IMAGE_TRANSLATE_Y_HP = 0x8158;
    public static final int GL_IMAGE_ROTATE_ANGLE_HP = 0x8159;
    public static final int GL_IMAGE_ROTATE_ORIGIN_X_HP = 0x815A;
    public static final int GL_IMAGE_ROTATE_ORIGIN_Y_HP = 0x815B;
    public static final int GL_IMAGE_MAG_FILTER_HP = 0x815C;
    public static final int GL_IMAGE_MIN_FILTER_HP = 0x815D;
    public static final int GL_IMAGE_CUBIC_WEIGHT_HP = 0x815E;
    public static final int GL_CUBIC_HP = 0x815F;
    public static final int GL_AVERAGE_HP = 0x8160;
    public static final int GL_IMAGE_TRANSFORM_2D_HP = 0x8161;
    public static final int GL_POST_IMAGE_TRANSFORM_COLOR_TABLE_HP = 0x8162;
    public static final int GL_PROXY_POST_IMAGE_TRANSFORM_COLOR_TABLE_HP = 0x8163;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glImageTransformParameteriHP = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glImageTransformParameterfHP = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glImageTransformParameterivHP = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glImageTransformParameterfvHP = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetImageTransformParameterivHP = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetImageTransformParameterfvHP = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glImageTransformParameteriHP;
        public final MemorySegment PFN_glImageTransformParameterfHP;
        public final MemorySegment PFN_glImageTransformParameterivHP;
        public final MemorySegment PFN_glImageTransformParameterfvHP;
        public final MemorySegment PFN_glGetImageTransformParameterivHP;
        public final MemorySegment PFN_glGetImageTransformParameterfvHP;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glImageTransformParameteriHP = func.invoke("glImageTransformParameteriHP");
            PFN_glImageTransformParameterfHP = func.invoke("glImageTransformParameterfHP");
            PFN_glImageTransformParameterivHP = func.invoke("glImageTransformParameterivHP");
            PFN_glImageTransformParameterfvHP = func.invoke("glImageTransformParameterfvHP");
            PFN_glGetImageTransformParameterivHP = func.invoke("glGetImageTransformParameterivHP");
            PFN_glGetImageTransformParameterfvHP = func.invoke("glGetImageTransformParameterfvHP");
        }
    }

    public GLHPImageTransform(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glImageTransformParameteriHP((unsigned int) GLenum target, (unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void ImageTransformParameteriHP(int target, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glImageTransformParameteriHP)) throw new GLSymbolNotFoundError("Symbol not found: glImageTransformParameteriHP");
        try { Handles.MH_glImageTransformParameteriHP.invokeExact(handles.PFN_glImageTransformParameteriHP, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in ImageTransformParameteriHP", e); }
    }

    /// ```
    /// void glImageTransformParameterfHP((unsigned int) GLenum target, (unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat param);
    /// ```
    public void ImageTransformParameterfHP(int target, int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glImageTransformParameterfHP)) throw new GLSymbolNotFoundError("Symbol not found: glImageTransformParameterfHP");
        try { Handles.MH_glImageTransformParameterfHP.invokeExact(handles.PFN_glImageTransformParameterfHP, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in ImageTransformParameterfHP", e); }
    }

    /// ```
    /// void glImageTransformParameterivHP((unsigned int) GLenum target, (unsigned int) GLenum pname, const GLint* params);
    /// ```
    public void ImageTransformParameterivHP(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glImageTransformParameterivHP)) throw new GLSymbolNotFoundError("Symbol not found: glImageTransformParameterivHP");
        try { Handles.MH_glImageTransformParameterivHP.invokeExact(handles.PFN_glImageTransformParameterivHP, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in ImageTransformParameterivHP", e); }
    }

    /// ```
    /// void glImageTransformParameterfvHP((unsigned int) GLenum target, (unsigned int) GLenum pname, const GLfloat* params);
    /// ```
    public void ImageTransformParameterfvHP(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glImageTransformParameterfvHP)) throw new GLSymbolNotFoundError("Symbol not found: glImageTransformParameterfvHP");
        try { Handles.MH_glImageTransformParameterfvHP.invokeExact(handles.PFN_glImageTransformParameterfvHP, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in ImageTransformParameterfvHP", e); }
    }

    /// ```
    /// void glGetImageTransformParameterivHP((unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetImageTransformParameterivHP(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetImageTransformParameterivHP)) throw new GLSymbolNotFoundError("Symbol not found: glGetImageTransformParameterivHP");
        try { Handles.MH_glGetImageTransformParameterivHP.invokeExact(handles.PFN_glGetImageTransformParameterivHP, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetImageTransformParameterivHP", e); }
    }

    /// ```
    /// void glGetImageTransformParameterfvHP((unsigned int) GLenum target, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetImageTransformParameterfvHP(int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetImageTransformParameterfvHP)) throw new GLSymbolNotFoundError("Symbol not found: glGetImageTransformParameterfvHP");
        try { Handles.MH_glGetImageTransformParameterfvHP.invokeExact(handles.PFN_glGetImageTransformParameterfvHP, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetImageTransformParameterfvHP", e); }
    }

}

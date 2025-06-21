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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLATIVertexArrayObject {
    public static final int GL_STATIC_ATI = 0x8760;
    public static final int GL_DYNAMIC_ATI = 0x8761;
    public static final int GL_PRESERVE_ATI = 0x8762;
    public static final int GL_DISCARD_ATI = 0x8763;
    public static final int GL_OBJECT_BUFFER_SIZE_ATI = 0x8764;
    public static final int GL_OBJECT_BUFFER_USAGE_ATI = 0x8765;
    public static final int GL_ARRAY_OBJECT_BUFFER_ATI = 0x8766;
    public static final int GL_ARRAY_OBJECT_OFFSET_ATI = 0x8767;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glNewObjectBufferATI = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glIsObjectBufferATI = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glUpdateObjectBufferATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetObjectBufferfvATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetObjectBufferivATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glFreeObjectBufferATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glArrayObjectATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetArrayObjectfvATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetArrayObjectivATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVariantArrayObjectATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetVariantArrayObjectfvATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVariantArrayObjectivATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glNewObjectBufferATI;
        public final MemorySegment PFN_glIsObjectBufferATI;
        public final MemorySegment PFN_glUpdateObjectBufferATI;
        public final MemorySegment PFN_glGetObjectBufferfvATI;
        public final MemorySegment PFN_glGetObjectBufferivATI;
        public final MemorySegment PFN_glFreeObjectBufferATI;
        public final MemorySegment PFN_glArrayObjectATI;
        public final MemorySegment PFN_glGetArrayObjectfvATI;
        public final MemorySegment PFN_glGetArrayObjectivATI;
        public final MemorySegment PFN_glVariantArrayObjectATI;
        public final MemorySegment PFN_glGetVariantArrayObjectfvATI;
        public final MemorySegment PFN_glGetVariantArrayObjectivATI;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glNewObjectBufferATI = func.invoke("glNewObjectBufferATI");
            PFN_glIsObjectBufferATI = func.invoke("glIsObjectBufferATI");
            PFN_glUpdateObjectBufferATI = func.invoke("glUpdateObjectBufferATI");
            PFN_glGetObjectBufferfvATI = func.invoke("glGetObjectBufferfvATI");
            PFN_glGetObjectBufferivATI = func.invoke("glGetObjectBufferivATI");
            PFN_glFreeObjectBufferATI = func.invoke("glFreeObjectBufferATI");
            PFN_glArrayObjectATI = func.invoke("glArrayObjectATI");
            PFN_glGetArrayObjectfvATI = func.invoke("glGetArrayObjectfvATI");
            PFN_glGetArrayObjectivATI = func.invoke("glGetArrayObjectivATI");
            PFN_glVariantArrayObjectATI = func.invoke("glVariantArrayObjectATI");
            PFN_glGetVariantArrayObjectfvATI = func.invoke("glGetVariantArrayObjectfvATI");
            PFN_glGetVariantArrayObjectivATI = func.invoke("glGetVariantArrayObjectivATI");
        }
    }

    public GLATIVertexArrayObject(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// (unsigned int) GLuint glNewObjectBufferATI((int) GLsizei size, const void* pointer, (unsigned int) GLenum usage);
    /// ```
    public int NewObjectBufferATI(int size, MemorySegment pointer, int usage) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNewObjectBufferATI)) throw new GLSymbolNotFoundError("Symbol not found: glNewObjectBufferATI");
        try { return (int) Handles.MH_glNewObjectBufferATI.invokeExact(handles.PFN_glNewObjectBufferATI, size, pointer, usage); }
        catch (Throwable e) { throw new RuntimeException("error in NewObjectBufferATI", e); }
    }

    /// ```
    /// GLboolean glIsObjectBufferATI((unsigned int) GLuint buffer);
    /// ```
    public boolean IsObjectBufferATI(int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsObjectBufferATI)) throw new GLSymbolNotFoundError("Symbol not found: glIsObjectBufferATI");
        try { return (((byte) Handles.MH_glIsObjectBufferATI.invokeExact(handles.PFN_glIsObjectBufferATI, buffer)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsObjectBufferATI", e); }
    }

    /// ```
    /// void glUpdateObjectBufferATI((unsigned int) GLuint buffer, (unsigned int) GLuint offset, (int) GLsizei size, const void* pointer, (unsigned int) GLenum preserve);
    /// ```
    public void UpdateObjectBufferATI(int buffer, int offset, int size, MemorySegment pointer, int preserve) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUpdateObjectBufferATI)) throw new GLSymbolNotFoundError("Symbol not found: glUpdateObjectBufferATI");
        try { Handles.MH_glUpdateObjectBufferATI.invokeExact(handles.PFN_glUpdateObjectBufferATI, buffer, offset, size, pointer, preserve); }
        catch (Throwable e) { throw new RuntimeException("error in UpdateObjectBufferATI", e); }
    }

    /// ```
    /// void glGetObjectBufferfvATI((unsigned int) GLuint buffer, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetObjectBufferfvATI(int buffer, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetObjectBufferfvATI)) throw new GLSymbolNotFoundError("Symbol not found: glGetObjectBufferfvATI");
        try { Handles.MH_glGetObjectBufferfvATI.invokeExact(handles.PFN_glGetObjectBufferfvATI, buffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetObjectBufferfvATI", e); }
    }

    /// ```
    /// void glGetObjectBufferivATI((unsigned int) GLuint buffer, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetObjectBufferivATI(int buffer, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetObjectBufferivATI)) throw new GLSymbolNotFoundError("Symbol not found: glGetObjectBufferivATI");
        try { Handles.MH_glGetObjectBufferivATI.invokeExact(handles.PFN_glGetObjectBufferivATI, buffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetObjectBufferivATI", e); }
    }

    /// ```
    /// void glFreeObjectBufferATI((unsigned int) GLuint buffer);
    /// ```
    public void FreeObjectBufferATI(int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFreeObjectBufferATI)) throw new GLSymbolNotFoundError("Symbol not found: glFreeObjectBufferATI");
        try { Handles.MH_glFreeObjectBufferATI.invokeExact(handles.PFN_glFreeObjectBufferATI, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in FreeObjectBufferATI", e); }
    }

    /// ```
    /// void glArrayObjectATI((unsigned int) GLenum array, (int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride, (unsigned int) GLuint buffer, (unsigned int) GLuint offset);
    /// ```
    public void ArrayObjectATI(int array, int size, int type, int stride, int buffer, int offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glArrayObjectATI)) throw new GLSymbolNotFoundError("Symbol not found: glArrayObjectATI");
        try { Handles.MH_glArrayObjectATI.invokeExact(handles.PFN_glArrayObjectATI, array, size, type, stride, buffer, offset); }
        catch (Throwable e) { throw new RuntimeException("error in ArrayObjectATI", e); }
    }

    /// ```
    /// void glGetArrayObjectfvATI((unsigned int) GLenum array, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetArrayObjectfvATI(int array, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetArrayObjectfvATI)) throw new GLSymbolNotFoundError("Symbol not found: glGetArrayObjectfvATI");
        try { Handles.MH_glGetArrayObjectfvATI.invokeExact(handles.PFN_glGetArrayObjectfvATI, array, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetArrayObjectfvATI", e); }
    }

    /// ```
    /// void glGetArrayObjectivATI((unsigned int) GLenum array, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetArrayObjectivATI(int array, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetArrayObjectivATI)) throw new GLSymbolNotFoundError("Symbol not found: glGetArrayObjectivATI");
        try { Handles.MH_glGetArrayObjectivATI.invokeExact(handles.PFN_glGetArrayObjectivATI, array, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetArrayObjectivATI", e); }
    }

    /// ```
    /// void glVariantArrayObjectATI((unsigned int) GLuint id, (unsigned int) GLenum type, (int) GLsizei stride, (unsigned int) GLuint buffer, (unsigned int) GLuint offset);
    /// ```
    public void VariantArrayObjectATI(int id, int type, int stride, int buffer, int offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVariantArrayObjectATI)) throw new GLSymbolNotFoundError("Symbol not found: glVariantArrayObjectATI");
        try { Handles.MH_glVariantArrayObjectATI.invokeExact(handles.PFN_glVariantArrayObjectATI, id, type, stride, buffer, offset); }
        catch (Throwable e) { throw new RuntimeException("error in VariantArrayObjectATI", e); }
    }

    /// ```
    /// void glGetVariantArrayObjectfvATI((unsigned int) GLuint id, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetVariantArrayObjectfvATI(int id, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVariantArrayObjectfvATI)) throw new GLSymbolNotFoundError("Symbol not found: glGetVariantArrayObjectfvATI");
        try { Handles.MH_glGetVariantArrayObjectfvATI.invokeExact(handles.PFN_glGetVariantArrayObjectfvATI, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVariantArrayObjectfvATI", e); }
    }

    /// ```
    /// void glGetVariantArrayObjectivATI((unsigned int) GLuint id, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetVariantArrayObjectivATI(int id, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVariantArrayObjectivATI)) throw new GLSymbolNotFoundError("Symbol not found: glGetVariantArrayObjectivATI");
        try { Handles.MH_glGetVariantArrayObjectivATI.invokeExact(handles.PFN_glGetVariantArrayObjectivATI, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetVariantArrayObjectivATI", e); }
    }

}

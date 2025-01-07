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

public final class GLEXTVertexArray {
    public static final int GL_VERTEX_ARRAY_EXT = 0x8074;
    public static final int GL_NORMAL_ARRAY_EXT = 0x8075;
    public static final int GL_COLOR_ARRAY_EXT = 0x8076;
    public static final int GL_INDEX_ARRAY_EXT = 0x8077;
    public static final int GL_TEXTURE_COORD_ARRAY_EXT = 0x8078;
    public static final int GL_EDGE_FLAG_ARRAY_EXT = 0x8079;
    public static final int GL_VERTEX_ARRAY_SIZE_EXT = 0x807A;
    public static final int GL_VERTEX_ARRAY_TYPE_EXT = 0x807B;
    public static final int GL_VERTEX_ARRAY_STRIDE_EXT = 0x807C;
    public static final int GL_VERTEX_ARRAY_COUNT_EXT = 0x807D;
    public static final int GL_NORMAL_ARRAY_TYPE_EXT = 0x807E;
    public static final int GL_NORMAL_ARRAY_STRIDE_EXT = 0x807F;
    public static final int GL_NORMAL_ARRAY_COUNT_EXT = 0x8080;
    public static final int GL_COLOR_ARRAY_SIZE_EXT = 0x8081;
    public static final int GL_COLOR_ARRAY_TYPE_EXT = 0x8082;
    public static final int GL_COLOR_ARRAY_STRIDE_EXT = 0x8083;
    public static final int GL_COLOR_ARRAY_COUNT_EXT = 0x8084;
    public static final int GL_INDEX_ARRAY_TYPE_EXT = 0x8085;
    public static final int GL_INDEX_ARRAY_STRIDE_EXT = 0x8086;
    public static final int GL_INDEX_ARRAY_COUNT_EXT = 0x8087;
    public static final int GL_TEXTURE_COORD_ARRAY_SIZE_EXT = 0x8088;
    public static final int GL_TEXTURE_COORD_ARRAY_TYPE_EXT = 0x8089;
    public static final int GL_TEXTURE_COORD_ARRAY_STRIDE_EXT = 0x808A;
    public static final int GL_TEXTURE_COORD_ARRAY_COUNT_EXT = 0x808B;
    public static final int GL_EDGE_FLAG_ARRAY_STRIDE_EXT = 0x808C;
    public static final int GL_EDGE_FLAG_ARRAY_COUNT_EXT = 0x808D;
    public static final int GL_VERTEX_ARRAY_POINTER_EXT = 0x808E;
    public static final int GL_NORMAL_ARRAY_POINTER_EXT = 0x808F;
    public static final int GL_COLOR_ARRAY_POINTER_EXT = 0x8090;
    public static final int GL_INDEX_ARRAY_POINTER_EXT = 0x8091;
    public static final int GL_TEXTURE_COORD_ARRAY_POINTER_EXT = 0x8092;
    public static final int GL_EDGE_FLAG_ARRAY_POINTER_EXT = 0x8093;
    public static final MethodHandle MH_glArrayElementEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glArrayElementEXT;
    public static final MethodHandle MH_glColorPointerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glColorPointerEXT;
    public static final MethodHandle MH_glDrawArraysEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDrawArraysEXT;
    public static final MethodHandle MH_glEdgeFlagPointerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glEdgeFlagPointerEXT;
    public static final MethodHandle MH_glGetPointervEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetPointervEXT;
    public static final MethodHandle MH_glIndexPointerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glIndexPointerEXT;
    public static final MethodHandle MH_glNormalPointerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glNormalPointerEXT;
    public static final MethodHandle MH_glTexCoordPointerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTexCoordPointerEXT;
    public static final MethodHandle MH_glVertexPointerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexPointerEXT;

    public GLEXTVertexArray(overrungl.opengl.GLLoadFunc func) {
        PFN_glArrayElementEXT = func.invoke("glArrayElementEXT", "glArrayElement");
        PFN_glColorPointerEXT = func.invoke("glColorPointerEXT");
        PFN_glDrawArraysEXT = func.invoke("glDrawArraysEXT", "glDrawArrays");
        PFN_glEdgeFlagPointerEXT = func.invoke("glEdgeFlagPointerEXT");
        PFN_glGetPointervEXT = func.invoke("glGetPointervEXT", "glGetPointerv");
        PFN_glIndexPointerEXT = func.invoke("glIndexPointerEXT");
        PFN_glNormalPointerEXT = func.invoke("glNormalPointerEXT");
        PFN_glTexCoordPointerEXT = func.invoke("glTexCoordPointerEXT");
        PFN_glVertexPointerEXT = func.invoke("glVertexPointerEXT");
    }

    public void ArrayElementEXT(@CType("GLint") int i) {
        if (!Unmarshal.isNullPointer(PFN_glArrayElementEXT)) { try {
            MH_glArrayElementEXT.invokeExact(PFN_glArrayElementEXT, i);
        } catch (Throwable e) { throw new RuntimeException("error in glArrayElementEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glArrayElementEXT"); }
    }

    public void ColorPointerEXT(@CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLsizei") int count, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (!Unmarshal.isNullPointer(PFN_glColorPointerEXT)) { try {
            MH_glColorPointerEXT.invokeExact(PFN_glColorPointerEXT, size, type, stride, count, pointer);
        } catch (Throwable e) { throw new RuntimeException("error in glColorPointerEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glColorPointerEXT"); }
    }

    public void DrawArraysEXT(@CType("GLenum") int mode, @CType("GLint") int first, @CType("GLsizei") int count) {
        if (!Unmarshal.isNullPointer(PFN_glDrawArraysEXT)) { try {
            MH_glDrawArraysEXT.invokeExact(PFN_glDrawArraysEXT, mode, first, count);
        } catch (Throwable e) { throw new RuntimeException("error in glDrawArraysEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDrawArraysEXT"); }
    }

    public void EdgeFlagPointerEXT(@CType("GLsizei") int stride, @CType("GLsizei") int count, @CType("const GLboolean *") java.lang.foreign.MemorySegment pointer) {
        if (!Unmarshal.isNullPointer(PFN_glEdgeFlagPointerEXT)) { try {
            MH_glEdgeFlagPointerEXT.invokeExact(PFN_glEdgeFlagPointerEXT, stride, count, pointer);
        } catch (Throwable e) { throw new RuntimeException("error in glEdgeFlagPointerEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glEdgeFlagPointerEXT"); }
    }

    public void GetPointervEXT(@CType("GLenum") int pname, @CType("void **") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetPointervEXT)) { try {
            MH_glGetPointervEXT.invokeExact(PFN_glGetPointervEXT, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetPointervEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetPointervEXT"); }
    }

    public void IndexPointerEXT(@CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLsizei") int count, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (!Unmarshal.isNullPointer(PFN_glIndexPointerEXT)) { try {
            MH_glIndexPointerEXT.invokeExact(PFN_glIndexPointerEXT, type, stride, count, pointer);
        } catch (Throwable e) { throw new RuntimeException("error in glIndexPointerEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glIndexPointerEXT"); }
    }

    public void NormalPointerEXT(@CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLsizei") int count, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (!Unmarshal.isNullPointer(PFN_glNormalPointerEXT)) { try {
            MH_glNormalPointerEXT.invokeExact(PFN_glNormalPointerEXT, type, stride, count, pointer);
        } catch (Throwable e) { throw new RuntimeException("error in glNormalPointerEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glNormalPointerEXT"); }
    }

    public void TexCoordPointerEXT(@CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLsizei") int count, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (!Unmarshal.isNullPointer(PFN_glTexCoordPointerEXT)) { try {
            MH_glTexCoordPointerEXT.invokeExact(PFN_glTexCoordPointerEXT, size, type, stride, count, pointer);
        } catch (Throwable e) { throw new RuntimeException("error in glTexCoordPointerEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glTexCoordPointerEXT"); }
    }

    public void VertexPointerEXT(@CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLsizei") int count, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (!Unmarshal.isNullPointer(PFN_glVertexPointerEXT)) { try {
            MH_glVertexPointerEXT.invokeExact(PFN_glVertexPointerEXT, size, type, stride, count, pointer);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexPointerEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexPointerEXT"); }
    }

}

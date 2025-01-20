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
import java.util.*;
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
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glSecondaryColor3bEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE);
        public static final FunctionDescriptor FD_glSecondaryColor3bvEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glSecondaryColor3dEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glSecondaryColor3dvEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glSecondaryColor3fEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glSecondaryColor3fvEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glSecondaryColor3iEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glSecondaryColor3ivEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glSecondaryColor3sEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT);
        public static final FunctionDescriptor FD_glSecondaryColor3svEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glSecondaryColor3ubEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE);
        public static final FunctionDescriptor FD_glSecondaryColor3ubvEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glSecondaryColor3uiEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glSecondaryColor3uivEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glSecondaryColor3usEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT);
        public static final FunctionDescriptor FD_glSecondaryColor3usvEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glSecondaryColorPointerEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glSecondaryColor3bEXT,
            FD_glSecondaryColor3bvEXT,
            FD_glSecondaryColor3dEXT,
            FD_glSecondaryColor3dvEXT,
            FD_glSecondaryColor3fEXT,
            FD_glSecondaryColor3fvEXT,
            FD_glSecondaryColor3iEXT,
            FD_glSecondaryColor3ivEXT,
            FD_glSecondaryColor3sEXT,
            FD_glSecondaryColor3svEXT,
            FD_glSecondaryColor3ubEXT,
            FD_glSecondaryColor3ubvEXT,
            FD_glSecondaryColor3uiEXT,
            FD_glSecondaryColor3uivEXT,
            FD_glSecondaryColor3usEXT,
            FD_glSecondaryColor3usvEXT,
            FD_glSecondaryColorPointerEXT
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glSecondaryColor3bEXT = RuntimeHelper.downcall(Descriptors.FD_glSecondaryColor3bEXT);
        public static final MethodHandle MH_glSecondaryColor3bvEXT = RuntimeHelper.downcall(Descriptors.FD_glSecondaryColor3bvEXT);
        public static final MethodHandle MH_glSecondaryColor3dEXT = RuntimeHelper.downcall(Descriptors.FD_glSecondaryColor3dEXT);
        public static final MethodHandle MH_glSecondaryColor3dvEXT = RuntimeHelper.downcall(Descriptors.FD_glSecondaryColor3dvEXT);
        public static final MethodHandle MH_glSecondaryColor3fEXT = RuntimeHelper.downcall(Descriptors.FD_glSecondaryColor3fEXT);
        public static final MethodHandle MH_glSecondaryColor3fvEXT = RuntimeHelper.downcall(Descriptors.FD_glSecondaryColor3fvEXT);
        public static final MethodHandle MH_glSecondaryColor3iEXT = RuntimeHelper.downcall(Descriptors.FD_glSecondaryColor3iEXT);
        public static final MethodHandle MH_glSecondaryColor3ivEXT = RuntimeHelper.downcall(Descriptors.FD_glSecondaryColor3ivEXT);
        public static final MethodHandle MH_glSecondaryColor3sEXT = RuntimeHelper.downcall(Descriptors.FD_glSecondaryColor3sEXT);
        public static final MethodHandle MH_glSecondaryColor3svEXT = RuntimeHelper.downcall(Descriptors.FD_glSecondaryColor3svEXT);
        public static final MethodHandle MH_glSecondaryColor3ubEXT = RuntimeHelper.downcall(Descriptors.FD_glSecondaryColor3ubEXT);
        public static final MethodHandle MH_glSecondaryColor3ubvEXT = RuntimeHelper.downcall(Descriptors.FD_glSecondaryColor3ubvEXT);
        public static final MethodHandle MH_glSecondaryColor3uiEXT = RuntimeHelper.downcall(Descriptors.FD_glSecondaryColor3uiEXT);
        public static final MethodHandle MH_glSecondaryColor3uivEXT = RuntimeHelper.downcall(Descriptors.FD_glSecondaryColor3uivEXT);
        public static final MethodHandle MH_glSecondaryColor3usEXT = RuntimeHelper.downcall(Descriptors.FD_glSecondaryColor3usEXT);
        public static final MethodHandle MH_glSecondaryColor3usvEXT = RuntimeHelper.downcall(Descriptors.FD_glSecondaryColor3usvEXT);
        public static final MethodHandle MH_glSecondaryColorPointerEXT = RuntimeHelper.downcall(Descriptors.FD_glSecondaryColorPointerEXT);
        public final MemorySegment PFN_glSecondaryColor3bEXT;
        public final MemorySegment PFN_glSecondaryColor3bvEXT;
        public final MemorySegment PFN_glSecondaryColor3dEXT;
        public final MemorySegment PFN_glSecondaryColor3dvEXT;
        public final MemorySegment PFN_glSecondaryColor3fEXT;
        public final MemorySegment PFN_glSecondaryColor3fvEXT;
        public final MemorySegment PFN_glSecondaryColor3iEXT;
        public final MemorySegment PFN_glSecondaryColor3ivEXT;
        public final MemorySegment PFN_glSecondaryColor3sEXT;
        public final MemorySegment PFN_glSecondaryColor3svEXT;
        public final MemorySegment PFN_glSecondaryColor3ubEXT;
        public final MemorySegment PFN_glSecondaryColor3ubvEXT;
        public final MemorySegment PFN_glSecondaryColor3uiEXT;
        public final MemorySegment PFN_glSecondaryColor3uivEXT;
        public final MemorySegment PFN_glSecondaryColor3usEXT;
        public final MemorySegment PFN_glSecondaryColor3usvEXT;
        public final MemorySegment PFN_glSecondaryColorPointerEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
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
    }

    public GLEXTSecondaryColor(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void SecondaryColor3bEXT(@CType("GLbyte") byte red, @CType("GLbyte") byte green, @CType("GLbyte") byte blue) {
        if (Unmarshal.isNullPointer(handles.PFN_glSecondaryColor3bEXT)) throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3bEXT");
        try { Handles.MH_glSecondaryColor3bEXT.invokeExact(handles.PFN_glSecondaryColor3bEXT, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3bEXT", e); }
    }

    public void SecondaryColor3bvEXT(@CType("const GLbyte *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glSecondaryColor3bvEXT)) throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3bvEXT");
        try { Handles.MH_glSecondaryColor3bvEXT.invokeExact(handles.PFN_glSecondaryColor3bvEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3bvEXT", e); }
    }

    public void SecondaryColor3dEXT(@CType("GLdouble") double red, @CType("GLdouble") double green, @CType("GLdouble") double blue) {
        if (Unmarshal.isNullPointer(handles.PFN_glSecondaryColor3dEXT)) throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3dEXT");
        try { Handles.MH_glSecondaryColor3dEXT.invokeExact(handles.PFN_glSecondaryColor3dEXT, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3dEXT", e); }
    }

    public void SecondaryColor3dvEXT(@CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glSecondaryColor3dvEXT)) throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3dvEXT");
        try { Handles.MH_glSecondaryColor3dvEXT.invokeExact(handles.PFN_glSecondaryColor3dvEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3dvEXT", e); }
    }

    public void SecondaryColor3fEXT(@CType("GLfloat") float red, @CType("GLfloat") float green, @CType("GLfloat") float blue) {
        if (Unmarshal.isNullPointer(handles.PFN_glSecondaryColor3fEXT)) throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3fEXT");
        try { Handles.MH_glSecondaryColor3fEXT.invokeExact(handles.PFN_glSecondaryColor3fEXT, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3fEXT", e); }
    }

    public void SecondaryColor3fvEXT(@CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glSecondaryColor3fvEXT)) throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3fvEXT");
        try { Handles.MH_glSecondaryColor3fvEXT.invokeExact(handles.PFN_glSecondaryColor3fvEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3fvEXT", e); }
    }

    public void SecondaryColor3iEXT(@CType("GLint") int red, @CType("GLint") int green, @CType("GLint") int blue) {
        if (Unmarshal.isNullPointer(handles.PFN_glSecondaryColor3iEXT)) throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3iEXT");
        try { Handles.MH_glSecondaryColor3iEXT.invokeExact(handles.PFN_glSecondaryColor3iEXT, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3iEXT", e); }
    }

    public void SecondaryColor3ivEXT(@CType("const GLint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glSecondaryColor3ivEXT)) throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3ivEXT");
        try { Handles.MH_glSecondaryColor3ivEXT.invokeExact(handles.PFN_glSecondaryColor3ivEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3ivEXT", e); }
    }

    public void SecondaryColor3sEXT(@CType("GLshort") short red, @CType("GLshort") short green, @CType("GLshort") short blue) {
        if (Unmarshal.isNullPointer(handles.PFN_glSecondaryColor3sEXT)) throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3sEXT");
        try { Handles.MH_glSecondaryColor3sEXT.invokeExact(handles.PFN_glSecondaryColor3sEXT, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3sEXT", e); }
    }

    public void SecondaryColor3svEXT(@CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glSecondaryColor3svEXT)) throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3svEXT");
        try { Handles.MH_glSecondaryColor3svEXT.invokeExact(handles.PFN_glSecondaryColor3svEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3svEXT", e); }
    }

    public void SecondaryColor3ubEXT(@CType("GLubyte") byte red, @CType("GLubyte") byte green, @CType("GLubyte") byte blue) {
        if (Unmarshal.isNullPointer(handles.PFN_glSecondaryColor3ubEXT)) throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3ubEXT");
        try { Handles.MH_glSecondaryColor3ubEXT.invokeExact(handles.PFN_glSecondaryColor3ubEXT, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3ubEXT", e); }
    }

    public void SecondaryColor3ubvEXT(@CType("const GLubyte *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glSecondaryColor3ubvEXT)) throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3ubvEXT");
        try { Handles.MH_glSecondaryColor3ubvEXT.invokeExact(handles.PFN_glSecondaryColor3ubvEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3ubvEXT", e); }
    }

    public void SecondaryColor3uiEXT(@CType("GLuint") int red, @CType("GLuint") int green, @CType("GLuint") int blue) {
        if (Unmarshal.isNullPointer(handles.PFN_glSecondaryColor3uiEXT)) throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3uiEXT");
        try { Handles.MH_glSecondaryColor3uiEXT.invokeExact(handles.PFN_glSecondaryColor3uiEXT, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3uiEXT", e); }
    }

    public void SecondaryColor3uivEXT(@CType("const GLuint *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glSecondaryColor3uivEXT)) throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3uivEXT");
        try { Handles.MH_glSecondaryColor3uivEXT.invokeExact(handles.PFN_glSecondaryColor3uivEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3uivEXT", e); }
    }

    public void SecondaryColor3usEXT(@CType("GLushort") short red, @CType("GLushort") short green, @CType("GLushort") short blue) {
        if (Unmarshal.isNullPointer(handles.PFN_glSecondaryColor3usEXT)) throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3usEXT");
        try { Handles.MH_glSecondaryColor3usEXT.invokeExact(handles.PFN_glSecondaryColor3usEXT, red, green, blue); }
        catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3usEXT", e); }
    }

    public void SecondaryColor3usvEXT(@CType("const GLushort *") java.lang.foreign.MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glSecondaryColor3usvEXT)) throw new SymbolNotFoundError("Symbol not found: glSecondaryColor3usvEXT");
        try { Handles.MH_glSecondaryColor3usvEXT.invokeExact(handles.PFN_glSecondaryColor3usvEXT, v); }
        catch (Throwable e) { throw new RuntimeException("error in glSecondaryColor3usvEXT", e); }
    }

    public void SecondaryColorPointerEXT(@CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (Unmarshal.isNullPointer(handles.PFN_glSecondaryColorPointerEXT)) throw new SymbolNotFoundError("Symbol not found: glSecondaryColorPointerEXT");
        try { Handles.MH_glSecondaryColorPointerEXT.invokeExact(handles.PFN_glSecondaryColorPointerEXT, size, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glSecondaryColorPointerEXT", e); }
    }

}

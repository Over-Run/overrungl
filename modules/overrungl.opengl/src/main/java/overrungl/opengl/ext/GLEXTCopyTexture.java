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

public final class GLEXTCopyTexture {
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glCopyTexImage1DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glCopyTexImage2DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glCopyTexSubImage1DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glCopyTexSubImage2DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glCopyTexSubImage3DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    }
    public static final class Handles {
        public static final MethodHandle MH_glCopyTexImage1DEXT = RuntimeHelper.downcall(Descriptors.FD_glCopyTexImage1DEXT);
        public static final MethodHandle MH_glCopyTexImage2DEXT = RuntimeHelper.downcall(Descriptors.FD_glCopyTexImage2DEXT);
        public static final MethodHandle MH_glCopyTexSubImage1DEXT = RuntimeHelper.downcall(Descriptors.FD_glCopyTexSubImage1DEXT);
        public static final MethodHandle MH_glCopyTexSubImage2DEXT = RuntimeHelper.downcall(Descriptors.FD_glCopyTexSubImage2DEXT);
        public static final MethodHandle MH_glCopyTexSubImage3DEXT = RuntimeHelper.downcall(Descriptors.FD_glCopyTexSubImage3DEXT);
        public final MemorySegment PFN_glCopyTexImage1DEXT;
        public final MemorySegment PFN_glCopyTexImage2DEXT;
        public final MemorySegment PFN_glCopyTexSubImage1DEXT;
        public final MemorySegment PFN_glCopyTexSubImage2DEXT;
        public final MemorySegment PFN_glCopyTexSubImage3DEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glCopyTexImage1DEXT = func.invoke("glCopyTexImage1DEXT", "glCopyTexImage1D");
            PFN_glCopyTexImage2DEXT = func.invoke("glCopyTexImage2DEXT", "glCopyTexImage2D");
            PFN_glCopyTexSubImage1DEXT = func.invoke("glCopyTexSubImage1DEXT", "glCopyTexSubImage1D");
            PFN_glCopyTexSubImage2DEXT = func.invoke("glCopyTexSubImage2DEXT", "glCopyTexSubImage2D");
            PFN_glCopyTexSubImage3DEXT = func.invoke("glCopyTexSubImage3DEXT", "glCopyTexSubImage3D");
        }
    }

    public GLEXTCopyTexture(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void CopyTexImage1DEXT(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLint") int border) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyTexImage1DEXT)) throw new SymbolNotFoundError("Symbol not found: glCopyTexImage1DEXT");
        try { Handles.MH_glCopyTexImage1DEXT.invokeExact(handles.PFN_glCopyTexImage1DEXT, target, level, internalformat, x, y, width, border); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyTexImage1DEXT", e); }
    }

    public void CopyTexImage2DEXT(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLint") int border) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyTexImage2DEXT)) throw new SymbolNotFoundError("Symbol not found: glCopyTexImage2DEXT");
        try { Handles.MH_glCopyTexImage2DEXT.invokeExact(handles.PFN_glCopyTexImage2DEXT, target, level, internalformat, x, y, width, height, border); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyTexImage2DEXT", e); }
    }

    public void CopyTexSubImage1DEXT(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyTexSubImage1DEXT)) throw new SymbolNotFoundError("Symbol not found: glCopyTexSubImage1DEXT");
        try { Handles.MH_glCopyTexSubImage1DEXT.invokeExact(handles.PFN_glCopyTexSubImage1DEXT, target, level, xoffset, x, y, width); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyTexSubImage1DEXT", e); }
    }

    public void CopyTexSubImage2DEXT(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyTexSubImage2DEXT)) throw new SymbolNotFoundError("Symbol not found: glCopyTexSubImage2DEXT");
        try { Handles.MH_glCopyTexSubImage2DEXT.invokeExact(handles.PFN_glCopyTexSubImage2DEXT, target, level, xoffset, yoffset, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyTexSubImage2DEXT", e); }
    }

    public void CopyTexSubImage3DEXT(@CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyTexSubImage3DEXT)) throw new SymbolNotFoundError("Symbol not found: glCopyTexSubImage3DEXT");
        try { Handles.MH_glCopyTexSubImage3DEXT.invokeExact(handles.PFN_glCopyTexSubImage3DEXT, target, level, xoffset, yoffset, zoffset, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyTexSubImage3DEXT", e); }
    }

}

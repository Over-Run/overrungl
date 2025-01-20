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
package overrungl.opengl.arb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBClearTexture {
    public static final int GL_CLEAR_TEXTURE = 0x9365;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glClearTexImage = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glClearTexSubImage = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glClearTexImage,
            FD_glClearTexSubImage
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glClearTexImage = RuntimeHelper.downcall(Descriptors.FD_glClearTexImage);
        public static final MethodHandle MH_glClearTexSubImage = RuntimeHelper.downcall(Descriptors.FD_glClearTexSubImage);
        public final MemorySegment PFN_glClearTexImage;
        public final MemorySegment PFN_glClearTexSubImage;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glClearTexImage = func.invoke("glClearTexImage");
            PFN_glClearTexSubImage = func.invoke("glClearTexSubImage");
        }
    }

    public GLARBClearTexture(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void ClearTexImage(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glClearTexImage)) throw new SymbolNotFoundError("Symbol not found: glClearTexImage");
        try { Handles.MH_glClearTexImage.invokeExact(handles.PFN_glClearTexImage, texture, level, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in glClearTexImage", e); }
    }

    public void ClearTexSubImage(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glClearTexSubImage)) throw new SymbolNotFoundError("Symbol not found: glClearTexSubImage");
        try { Handles.MH_glClearTexSubImage.invokeExact(handles.PFN_glClearTexSubImage, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in glClearTexSubImage", e); }
    }

}

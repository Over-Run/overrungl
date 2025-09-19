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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_clear_texture`
public final class GLARBClearTexture {
    public static final int GL_CLEAR_TEXTURE = 0x9365;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glClearTexImage = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glClearTexSubImage = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glClearTexImage;
        public final MemorySegment PFN_glClearTexSubImage;
        private Handles(GLLoadFunc func) {
            PFN_glClearTexImage = func.invoke("glClearTexImage");
            PFN_glClearTexSubImage = func.invoke("glClearTexSubImage");
        }
    }

    public GLARBClearTexture(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glClearTexImage`.
    /// ```
    /// void glClearTexImage((unsigned int) GLuint texture, (int) GLint level, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* data);
    /// ```
    public void ClearTexImage(int texture, int level, int format, int type, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearTexImage)) throw new GLSymbolNotFoundError("Symbol not found: glClearTexImage");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClearTexImage", texture, level, format, type, data); }
        Handles.MH_glClearTexImage.invokeExact(handles.PFN_glClearTexImage, texture, level, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in ClearTexImage", e); }
    }

    /// Invokes `glClearTexSubImage`.
    /// ```
    /// void glClearTexSubImage((unsigned int) GLuint texture, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLint zoffset, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* data);
    /// ```
    public void ClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearTexSubImage)) throw new GLSymbolNotFoundError("Symbol not found: glClearTexSubImage");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClearTexSubImage", texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data); }
        Handles.MH_glClearTexSubImage.invokeExact(handles.PFN_glClearTexSubImage, texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in ClearTexSubImage", e); }
    }

}

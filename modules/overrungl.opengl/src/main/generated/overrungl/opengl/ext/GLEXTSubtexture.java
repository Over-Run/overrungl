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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_subtexture`
public final class GLEXTSubtexture {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glTexSubImage1DEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTexSubImage2DEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glTexSubImage1DEXT;
        public final MemorySegment PFN_glTexSubImage2DEXT;
        private Handles(GLLoadFunc func) {
            PFN_glTexSubImage1DEXT = func.invoke("glTexSubImage1DEXT", "glTexSubImage1D");
            PFN_glTexSubImage2DEXT = func.invoke("glTexSubImage2DEXT", "glTexSubImage2D");
        }
    }

    public GLEXTSubtexture(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glTexSubImage1DEXT`.
    /// ```
    /// void glTexSubImage1DEXT((unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLsizei width, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* pixels);
    /// ```
    public void TexSubImage1DEXT(int target, int level, int xoffset, int width, int format, int type, @NonNull MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexSubImage1DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTexSubImage1DEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexSubImage1DEXT", target, level, xoffset, width, format, type, pixels); }
        Handles.MH_glTexSubImage1DEXT.invokeExact(handles.PFN_glTexSubImage1DEXT, target, level, xoffset, width, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in TexSubImage1DEXT", e); }
    }

    /// Invokes `glTexSubImage2DEXT`.
    /// ```
    /// void glTexSubImage2DEXT((unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLsizei width, (int) GLsizei height, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* pixels);
    /// ```
    public void TexSubImage2DEXT(int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, @NonNull MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexSubImage2DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTexSubImage2DEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexSubImage2DEXT", target, level, xoffset, yoffset, width, height, format, type, pixels); }
        Handles.MH_glTexSubImage2DEXT.invokeExact(handles.PFN_glTexSubImage2DEXT, target, level, xoffset, yoffset, width, height, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in TexSubImage2DEXT", e); }
    }

}

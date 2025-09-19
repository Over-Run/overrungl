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
/// `GL_EXT_framebuffer_multisample`
public final class GLEXTFramebufferMultisample {
    public static final int GL_RENDERBUFFER_SAMPLES_EXT = 0x8CAB;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_EXT = 0x8D56;
    public static final int GL_MAX_SAMPLES_EXT = 0x8D57;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glRenderbufferStorageMultisampleEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glRenderbufferStorageMultisampleEXT;
        private Handles(GLLoadFunc func) {
            PFN_glRenderbufferStorageMultisampleEXT = func.invoke("glRenderbufferStorageMultisampleEXT", "glRenderbufferStorageMultisample");
        }
    }

    public GLEXTFramebufferMultisample(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glRenderbufferStorageMultisampleEXT`.
    /// ```
    /// void glRenderbufferStorageMultisampleEXT((unsigned int) GLenum target, (int) GLsizei samples, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void RenderbufferStorageMultisampleEXT(int target, int samples, int internalformat, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glRenderbufferStorageMultisampleEXT)) throw new GLSymbolNotFoundError("Symbol not found: glRenderbufferStorageMultisampleEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glRenderbufferStorageMultisampleEXT", target, samples, internalformat, width, height); }
        Handles.MH_glRenderbufferStorageMultisampleEXT.invokeExact(handles.PFN_glRenderbufferStorageMultisampleEXT, target, samples, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in RenderbufferStorageMultisampleEXT", e); }
    }

}

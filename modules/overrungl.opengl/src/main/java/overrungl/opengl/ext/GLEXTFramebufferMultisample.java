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

public final class GLEXTFramebufferMultisample {
    public static final int GL_RENDERBUFFER_SAMPLES_EXT = 0x8CAB;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE_EXT = 0x8D56;
    public static final int GL_MAX_SAMPLES_EXT = 0x8D57;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glRenderbufferStorageMultisampleEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glRenderbufferStorageMultisampleEXT
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glRenderbufferStorageMultisampleEXT = RuntimeHelper.downcall(Descriptors.FD_glRenderbufferStorageMultisampleEXT);
        public final MemorySegment PFN_glRenderbufferStorageMultisampleEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glRenderbufferStorageMultisampleEXT = func.invoke("glRenderbufferStorageMultisampleEXT", "glRenderbufferStorageMultisample");
        }
    }

    public GLEXTFramebufferMultisample(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void RenderbufferStorageMultisampleEXT(@CType("GLenum") int target, @CType("GLsizei") int samples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glRenderbufferStorageMultisampleEXT)) throw new SymbolNotFoundError("Symbol not found: glRenderbufferStorageMultisampleEXT");
        try { Handles.MH_glRenderbufferStorageMultisampleEXT.invokeExact(handles.PFN_glRenderbufferStorageMultisampleEXT, target, samples, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glRenderbufferStorageMultisampleEXT", e); }
    }

}

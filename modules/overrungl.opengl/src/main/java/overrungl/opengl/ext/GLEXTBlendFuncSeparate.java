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

public final class GLEXTBlendFuncSeparate {
    public static final int GL_BLEND_DST_RGB_EXT = 0x80C8;
    public static final int GL_BLEND_SRC_RGB_EXT = 0x80C9;
    public static final int GL_BLEND_DST_ALPHA_EXT = 0x80CA;
    public static final int GL_BLEND_SRC_ALPHA_EXT = 0x80CB;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glBlendFuncSeparateEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glBlendFuncSeparateEXT
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glBlendFuncSeparateEXT = RuntimeHelper.downcall(Descriptors.FD_glBlendFuncSeparateEXT);
        public final MemorySegment PFN_glBlendFuncSeparateEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBlendFuncSeparateEXT = func.invoke("glBlendFuncSeparateEXT", "glBlendFuncSeparate");
        }
    }

    public GLEXTBlendFuncSeparate(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void BlendFuncSeparateEXT(@CType("GLenum") int sfactorRGB, @CType("GLenum") int dfactorRGB, @CType("GLenum") int sfactorAlpha, @CType("GLenum") int dfactorAlpha) {
        if (Unmarshal.isNullPointer(handles.PFN_glBlendFuncSeparateEXT)) throw new SymbolNotFoundError("Symbol not found: glBlendFuncSeparateEXT");
        try { Handles.MH_glBlendFuncSeparateEXT.invokeExact(handles.PFN_glBlendFuncSeparateEXT, sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha); }
        catch (Throwable e) { throw new RuntimeException("error in glBlendFuncSeparateEXT", e); }
    }

}

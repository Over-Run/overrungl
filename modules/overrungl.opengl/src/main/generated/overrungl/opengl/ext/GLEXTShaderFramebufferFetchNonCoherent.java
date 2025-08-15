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
/// `GL_EXT_shader_framebuffer_fetch_non_coherent`
public final class GLEXTShaderFramebufferFetchNonCoherent {
    public static final int GL_FRAGMENT_SHADER_DISCARDS_SAMPLES_EXT = 0x8A52;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glFramebufferFetchBarrierEXT = downcallHandle(FunctionDescriptor.ofVoid());
        public final MemorySegment PFN_glFramebufferFetchBarrierEXT;
        private Handles(GLLoadFunc func) {
            PFN_glFramebufferFetchBarrierEXT = func.invoke("glFramebufferFetchBarrierEXT");
        }
    }

    public GLEXTShaderFramebufferFetchNonCoherent(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glFramebufferFetchBarrierEXT`.
    /// ```
    /// void glFramebufferFetchBarrierEXT();
    /// ```
    public void FramebufferFetchBarrierEXT() {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferFetchBarrierEXT)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferFetchBarrierEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFramebufferFetchBarrierEXT"); }
        Handles.MH_glFramebufferFetchBarrierEXT.invokeExact(handles.PFN_glFramebufferFetchBarrierEXT); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferFetchBarrierEXT", e); }
    }

}

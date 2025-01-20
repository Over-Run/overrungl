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

public final class GLEXTShaderFramebufferFetchNonCoherent {
    public static final int GL_FRAGMENT_SHADER_DISCARDS_SAMPLES_EXT = 0x8A52;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glFramebufferFetchBarrierEXT = FunctionDescriptor.ofVoid();
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glFramebufferFetchBarrierEXT
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glFramebufferFetchBarrierEXT = RuntimeHelper.downcall(Descriptors.FD_glFramebufferFetchBarrierEXT);
        public final MemorySegment PFN_glFramebufferFetchBarrierEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glFramebufferFetchBarrierEXT = func.invoke("glFramebufferFetchBarrierEXT");
        }
    }

    public GLEXTShaderFramebufferFetchNonCoherent(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void FramebufferFetchBarrierEXT() {
        if (Unmarshal.isNullPointer(handles.PFN_glFramebufferFetchBarrierEXT)) throw new SymbolNotFoundError("Symbol not found: glFramebufferFetchBarrierEXT");
        try { Handles.MH_glFramebufferFetchBarrierEXT.invokeExact(handles.PFN_glFramebufferFetchBarrierEXT); }
        catch (Throwable e) { throw new RuntimeException("error in glFramebufferFetchBarrierEXT", e); }
    }

}

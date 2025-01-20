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
package overrungl.opengl.threedfx;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GL3DFXTbuffer {
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glTbufferMask3DFX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glTbufferMask3DFX
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glTbufferMask3DFX = RuntimeHelper.downcall(Descriptors.FD_glTbufferMask3DFX);
        public final MemorySegment PFN_glTbufferMask3DFX;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glTbufferMask3DFX = func.invoke("glTbufferMask3DFX");
        }
    }

    public GL3DFXTbuffer(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void TbufferMask3DFX(@CType("GLuint") int mask) {
        if (Unmarshal.isNullPointer(handles.PFN_glTbufferMask3DFX)) throw new SymbolNotFoundError("Symbol not found: glTbufferMask3DFX");
        try { Handles.MH_glTbufferMask3DFX.invokeExact(handles.PFN_glTbufferMask3DFX, mask); }
        catch (Throwable e) { throw new RuntimeException("error in glTbufferMask3DFX", e); }
    }

}

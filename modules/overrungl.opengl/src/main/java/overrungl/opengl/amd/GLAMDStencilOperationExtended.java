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
package overrungl.opengl.amd;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLAMDStencilOperationExtended {
    public static final int GL_SET_AMD = 0x874A;
    public static final int GL_REPLACE_VALUE_AMD = 0x874B;
    public static final int GL_STENCIL_OP_VALUE_AMD = 0x874C;
    public static final int GL_STENCIL_BACK_OP_VALUE_AMD = 0x874D;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glStencilOpValueAMD = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glStencilOpValueAMD
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glStencilOpValueAMD = RuntimeHelper.downcall(Descriptors.FD_glStencilOpValueAMD);
        public final MemorySegment PFN_glStencilOpValueAMD;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glStencilOpValueAMD = func.invoke("glStencilOpValueAMD");
        }
    }

    public GLAMDStencilOperationExtended(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void StencilOpValueAMD(@CType("GLenum") int face, @CType("GLuint") int value) {
        if (Unmarshal.isNullPointer(handles.PFN_glStencilOpValueAMD)) throw new SymbolNotFoundError("Symbol not found: glStencilOpValueAMD");
        try { Handles.MH_glStencilOpValueAMD.invokeExact(handles.PFN_glStencilOpValueAMD, face, value); }
        catch (Throwable e) { throw new RuntimeException("error in glStencilOpValueAMD", e); }
    }

}

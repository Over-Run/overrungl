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
package overrungl.opengl.oes;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLOESQueryMatrix {
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glQueryMatrixxOES = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glQueryMatrixxOES
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glQueryMatrixxOES = RuntimeHelper.downcall(Descriptors.FD_glQueryMatrixxOES);
        public final MemorySegment PFN_glQueryMatrixxOES;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glQueryMatrixxOES = func.invoke("glQueryMatrixxOES");
        }
    }

    public GLOESQueryMatrix(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public @CType("GLbitfield") int QueryMatrixxOES(@CType("GLfixed *") java.lang.foreign.MemorySegment mantissa, @CType("GLint *") java.lang.foreign.MemorySegment exponent) {
        if (Unmarshal.isNullPointer(handles.PFN_glQueryMatrixxOES)) throw new SymbolNotFoundError("Symbol not found: glQueryMatrixxOES");
        try { return (int) Handles.MH_glQueryMatrixxOES.invokeExact(handles.PFN_glQueryMatrixxOES, mantissa, exponent); }
        catch (Throwable e) { throw new RuntimeException("error in glQueryMatrixxOES", e); }
    }

}

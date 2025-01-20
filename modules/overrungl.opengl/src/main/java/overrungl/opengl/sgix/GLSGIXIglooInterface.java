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
package overrungl.opengl.sgix;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLSGIXIglooInterface {
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glIglooInterfaceSGIX = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glIglooInterfaceSGIX
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glIglooInterfaceSGIX = RuntimeHelper.downcall(Descriptors.FD_glIglooInterfaceSGIX);
        public final MemorySegment PFN_glIglooInterfaceSGIX;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glIglooInterfaceSGIX = func.invoke("glIglooInterfaceSGIX");
        }
    }

    public GLSGIXIglooInterface(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void IglooInterfaceSGIX(@CType("GLenum") int pname, @CType("const void *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glIglooInterfaceSGIX)) throw new SymbolNotFoundError("Symbol not found: glIglooInterfaceSGIX");
        try { Handles.MH_glIglooInterfaceSGIX.invokeExact(handles.PFN_glIglooInterfaceSGIX, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glIglooInterfaceSGIX", e); }
    }

}

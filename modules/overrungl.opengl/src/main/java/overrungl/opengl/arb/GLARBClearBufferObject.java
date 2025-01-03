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
package overrungl.opengl.arb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBClearBufferObject {
    public static final MethodHandle MH_glClearBufferData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glClearBufferData;
    public static final MethodHandle MH_glClearBufferSubData = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glClearBufferSubData;

    public GLARBClearBufferObject(overrungl.opengl.GLLoadFunc func) {
        PFN_glClearBufferData = func.invoke("glClearBufferData");
        PFN_glClearBufferSubData = func.invoke("glClearBufferSubData");
    }

    public void ClearBufferData(@CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glClearBufferData))
            MH_glClearBufferData.invokeExact(PFN_glClearBufferData, target, internalformat, format, type, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glClearBufferData", e); }
    }

    public void ClearBufferSubData(@CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glClearBufferSubData))
            MH_glClearBufferSubData.invokeExact(PFN_glClearBufferSubData, target, internalformat, offset, size, format, type, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glClearBufferSubData", e); }
    }

}

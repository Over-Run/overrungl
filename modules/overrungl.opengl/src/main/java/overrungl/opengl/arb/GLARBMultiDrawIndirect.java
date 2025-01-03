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

public final class GLARBMultiDrawIndirect {
    public static final MethodHandle MH_glMultiDrawArraysIndirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMultiDrawArraysIndirect;
    public static final MethodHandle MH_glMultiDrawElementsIndirect = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMultiDrawElementsIndirect;

    public GLARBMultiDrawIndirect(overrungl.opengl.GLLoadFunc func) {
        PFN_glMultiDrawArraysIndirect = func.invoke("glMultiDrawArraysIndirect");
        PFN_glMultiDrawElementsIndirect = func.invoke("glMultiDrawElementsIndirect");
    }

    public void MultiDrawArraysIndirect(@CType("GLenum") int mode, @CType("const void *") java.lang.foreign.MemorySegment indirect, @CType("GLsizei") int drawcount, @CType("GLsizei") int stride) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiDrawArraysIndirect))
            MH_glMultiDrawArraysIndirect.invokeExact(PFN_glMultiDrawArraysIndirect, mode, indirect, drawcount, stride);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiDrawArraysIndirect", e); }
    }

    public void MultiDrawElementsIndirect(@CType("GLenum") int mode, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment indirect, @CType("GLsizei") int drawcount, @CType("GLsizei") int stride) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiDrawElementsIndirect))
            MH_glMultiDrawElementsIndirect.invokeExact(PFN_glMultiDrawElementsIndirect, mode, type, indirect, drawcount, stride);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiDrawElementsIndirect", e); }
    }

}

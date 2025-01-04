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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLAMDMultiDrawIndirect {
    public static final MethodHandle MH_glMultiDrawArraysIndirectAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMultiDrawArraysIndirectAMD;
    public static final MethodHandle MH_glMultiDrawElementsIndirectAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMultiDrawElementsIndirectAMD;

    public GLAMDMultiDrawIndirect(overrungl.opengl.GLLoadFunc func) {
        PFN_glMultiDrawArraysIndirectAMD = func.invoke("glMultiDrawArraysIndirectAMD", "glMultiDrawArraysIndirect");
        PFN_glMultiDrawElementsIndirectAMD = func.invoke("glMultiDrawElementsIndirectAMD", "glMultiDrawElementsIndirect");
    }

    public void MultiDrawArraysIndirectAMD(@CType("GLenum") int mode, @CType("const void *") java.lang.foreign.MemorySegment indirect, @CType("GLsizei") int primcount, @CType("GLsizei") int stride) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiDrawArraysIndirectAMD))
            MH_glMultiDrawArraysIndirectAMD.invokeExact(PFN_glMultiDrawArraysIndirectAMD, mode, indirect, primcount, stride);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiDrawArraysIndirectAMD", e); }
    }

    public void MultiDrawElementsIndirectAMD(@CType("GLenum") int mode, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment indirect, @CType("GLsizei") int primcount, @CType("GLsizei") int stride) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiDrawElementsIndirectAMD))
            MH_glMultiDrawElementsIndirectAMD.invokeExact(PFN_glMultiDrawElementsIndirectAMD, mode, type, indirect, primcount, stride);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiDrawElementsIndirectAMD", e); }
    }

}

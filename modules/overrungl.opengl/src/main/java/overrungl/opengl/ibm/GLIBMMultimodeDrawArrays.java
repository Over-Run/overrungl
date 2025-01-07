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
package overrungl.opengl.ibm;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLIBMMultimodeDrawArrays {
    public static final MethodHandle MH_glMultiModeDrawArraysIBM = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMultiModeDrawArraysIBM;
    public static final MethodHandle MH_glMultiModeDrawElementsIBM = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMultiModeDrawElementsIBM;

    public GLIBMMultimodeDrawArrays(overrungl.opengl.GLLoadFunc func) {
        PFN_glMultiModeDrawArraysIBM = func.invoke("glMultiModeDrawArraysIBM");
        PFN_glMultiModeDrawElementsIBM = func.invoke("glMultiModeDrawElementsIBM");
    }

    public void MultiModeDrawArraysIBM(@CType("const GLenum *") java.lang.foreign.MemorySegment mode, @CType("const GLint *") java.lang.foreign.MemorySegment first, @CType("const GLsizei *") java.lang.foreign.MemorySegment count, @CType("GLsizei") int primcount, @CType("GLint") int modestride) {
        if (!Unmarshal.isNullPointer(PFN_glMultiModeDrawArraysIBM)) { try {
            MH_glMultiModeDrawArraysIBM.invokeExact(PFN_glMultiModeDrawArraysIBM, mode, first, count, primcount, modestride);
        } catch (Throwable e) { throw new RuntimeException("error in glMultiModeDrawArraysIBM", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMultiModeDrawArraysIBM"); }
    }

    public void MultiModeDrawElementsIBM(@CType("const GLenum *") java.lang.foreign.MemorySegment mode, @CType("const GLsizei *") java.lang.foreign.MemorySegment count, @CType("GLenum") int type, @CType("const void *const*") java.lang.foreign.MemorySegment indices, @CType("GLsizei") int primcount, @CType("GLint") int modestride) {
        if (!Unmarshal.isNullPointer(PFN_glMultiModeDrawElementsIBM)) { try {
            MH_glMultiModeDrawElementsIBM.invokeExact(PFN_glMultiModeDrawElementsIBM, mode, count, type, indices, primcount, modestride);
        } catch (Throwable e) { throw new RuntimeException("error in glMultiModeDrawElementsIBM", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glMultiModeDrawElementsIBM"); }
    }

}

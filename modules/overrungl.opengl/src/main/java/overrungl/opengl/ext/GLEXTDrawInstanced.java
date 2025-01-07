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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTDrawInstanced {
    public static final MethodHandle MH_glDrawArraysInstancedEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDrawArraysInstancedEXT;
    public static final MethodHandle MH_glDrawElementsInstancedEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDrawElementsInstancedEXT;

    public GLEXTDrawInstanced(overrungl.opengl.GLLoadFunc func) {
        PFN_glDrawArraysInstancedEXT = func.invoke("glDrawArraysInstancedEXT", "glDrawArraysInstanced");
        PFN_glDrawElementsInstancedEXT = func.invoke("glDrawElementsInstancedEXT", "glDrawElementsInstanced");
    }

    public void DrawArraysInstancedEXT(@CType("GLenum") int mode, @CType("GLint") int start, @CType("GLsizei") int count, @CType("GLsizei") int primcount) {
        if (!Unmarshal.isNullPointer(PFN_glDrawArraysInstancedEXT)) { try {
            MH_glDrawArraysInstancedEXT.invokeExact(PFN_glDrawArraysInstancedEXT, mode, start, count, primcount);
        } catch (Throwable e) { throw new RuntimeException("error in glDrawArraysInstancedEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDrawArraysInstancedEXT"); }
    }

    public void DrawElementsInstancedEXT(@CType("GLenum") int mode, @CType("GLsizei") int count, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment indices, @CType("GLsizei") int primcount) {
        if (!Unmarshal.isNullPointer(PFN_glDrawElementsInstancedEXT)) { try {
            MH_glDrawElementsInstancedEXT.invokeExact(PFN_glDrawElementsInstancedEXT, mode, count, type, indices, primcount);
        } catch (Throwable e) { throw new RuntimeException("error in glDrawElementsInstancedEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDrawElementsInstancedEXT"); }
    }

}

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

public final class GLARBDrawInstanced {
    public static final MethodHandle MH_glDrawArraysInstancedARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDrawArraysInstancedARB;
    public static final MethodHandle MH_glDrawElementsInstancedARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDrawElementsInstancedARB;

    public GLARBDrawInstanced(overrungl.opengl.GLLoadFunc func) {
        PFN_glDrawArraysInstancedARB = func.invoke("glDrawArraysInstancedARB", "glDrawArraysInstanced");
        PFN_glDrawElementsInstancedARB = func.invoke("glDrawElementsInstancedARB", "glDrawElementsInstanced");
    }

    public void DrawArraysInstancedARB(@CType("GLenum") int mode, @CType("GLint") int first, @CType("GLsizei") int count, @CType("GLsizei") int primcount) {
        if (!Unmarshal.isNullPointer(PFN_glDrawArraysInstancedARB)) { try {
            MH_glDrawArraysInstancedARB.invokeExact(PFN_glDrawArraysInstancedARB, mode, first, count, primcount);
        } catch (Throwable e) { throw new RuntimeException("error in glDrawArraysInstancedARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDrawArraysInstancedARB"); }
    }

    public void DrawElementsInstancedARB(@CType("GLenum") int mode, @CType("GLsizei") int count, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment indices, @CType("GLsizei") int primcount) {
        if (!Unmarshal.isNullPointer(PFN_glDrawElementsInstancedARB)) { try {
            MH_glDrawElementsInstancedARB.invokeExact(PFN_glDrawElementsInstancedARB, mode, count, type, indices, primcount);
        } catch (Throwable e) { throw new RuntimeException("error in glDrawElementsInstancedARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDrawElementsInstancedARB"); }
    }

}

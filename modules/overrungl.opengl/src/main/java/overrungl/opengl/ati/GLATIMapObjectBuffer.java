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
package overrungl.opengl.ati;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLATIMapObjectBuffer {
    public static final MethodHandle MH_glMapObjectBufferATI = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public static final MethodHandle MH_glUnmapObjectBufferATI = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMapObjectBufferATI;
    public final MemorySegment PFN_glUnmapObjectBufferATI;

    public GLATIMapObjectBuffer(overrungl.opengl.GLLoadFunc func) {
        PFN_glMapObjectBufferATI = func.invoke("glMapObjectBufferATI");
        PFN_glUnmapObjectBufferATI = func.invoke("glUnmapObjectBufferATI");
    }

    public @CType("void*") java.lang.foreign.MemorySegment MapObjectBufferATI(@CType("GLuint") int buffer) {
        if (Unmarshal.isNullPointer(PFN_glMapObjectBufferATI)) throw new SymbolNotFoundError("Symbol not found: glMapObjectBufferATI");
        try { return (java.lang.foreign.MemorySegment) MH_glMapObjectBufferATI.invokeExact(PFN_glMapObjectBufferATI, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in glMapObjectBufferATI", e); }
    }

    public void UnmapObjectBufferATI(@CType("GLuint") int buffer) {
        if (Unmarshal.isNullPointer(PFN_glUnmapObjectBufferATI)) throw new SymbolNotFoundError("Symbol not found: glUnmapObjectBufferATI");
        try { MH_glUnmapObjectBufferATI.invokeExact(PFN_glUnmapObjectBufferATI, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in glUnmapObjectBufferATI", e); }
    }

}

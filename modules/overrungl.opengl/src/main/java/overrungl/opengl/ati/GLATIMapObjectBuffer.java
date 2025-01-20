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
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glMapObjectBufferATI = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glUnmapObjectBufferATI = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
    }
    public static final class Handles {
        public static final MethodHandle MH_glMapObjectBufferATI = RuntimeHelper.downcall(Descriptors.FD_glMapObjectBufferATI);
        public static final MethodHandle MH_glUnmapObjectBufferATI = RuntimeHelper.downcall(Descriptors.FD_glUnmapObjectBufferATI);
        public final MemorySegment PFN_glMapObjectBufferATI;
        public final MemorySegment PFN_glUnmapObjectBufferATI;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glMapObjectBufferATI = func.invoke("glMapObjectBufferATI");
            PFN_glUnmapObjectBufferATI = func.invoke("glUnmapObjectBufferATI");
        }
    }

    public GLATIMapObjectBuffer(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public @CType("void*") MemorySegment MapObjectBufferATI(@CType("GLuint") int buffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glMapObjectBufferATI)) throw new SymbolNotFoundError("Symbol not found: glMapObjectBufferATI");
        try { return (MemorySegment) Handles.MH_glMapObjectBufferATI.invokeExact(handles.PFN_glMapObjectBufferATI, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in glMapObjectBufferATI", e); }
    }

    public void UnmapObjectBufferATI(@CType("GLuint") int buffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glUnmapObjectBufferATI)) throw new SymbolNotFoundError("Symbol not found: glUnmapObjectBufferATI");
        try { Handles.MH_glUnmapObjectBufferATI.invokeExact(handles.PFN_glUnmapObjectBufferATI, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in glUnmapObjectBufferATI", e); }
    }

}

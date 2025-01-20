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
package overrungl.opengl.apple;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLAPPLEVertexArrayRange {
    public static final int GL_VERTEX_ARRAY_RANGE_APPLE = 0x851D;
    public static final int GL_VERTEX_ARRAY_RANGE_LENGTH_APPLE = 0x851E;
    public static final int GL_VERTEX_ARRAY_STORAGE_HINT_APPLE = 0x851F;
    public static final int GL_VERTEX_ARRAY_RANGE_POINTER_APPLE = 0x8521;
    public static final int GL_STORAGE_CLIENT_APPLE = 0x85B4;
    public static final int GL_STORAGE_CACHED_APPLE = 0x85BE;
    public static final int GL_STORAGE_SHARED_APPLE = 0x85BF;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glVertexArrayRangeAPPLE = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glFlushVertexArrayRangeAPPLE = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glVertexArrayParameteriAPPLE = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    }
    public static final class Handles {
        public static final MethodHandle MH_glVertexArrayRangeAPPLE = RuntimeHelper.downcall(Descriptors.FD_glVertexArrayRangeAPPLE);
        public static final MethodHandle MH_glFlushVertexArrayRangeAPPLE = RuntimeHelper.downcall(Descriptors.FD_glFlushVertexArrayRangeAPPLE);
        public static final MethodHandle MH_glVertexArrayParameteriAPPLE = RuntimeHelper.downcall(Descriptors.FD_glVertexArrayParameteriAPPLE);
        public final MemorySegment PFN_glVertexArrayRangeAPPLE;
        public final MemorySegment PFN_glFlushVertexArrayRangeAPPLE;
        public final MemorySegment PFN_glVertexArrayParameteriAPPLE;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glVertexArrayRangeAPPLE = func.invoke("glVertexArrayRangeAPPLE");
            PFN_glFlushVertexArrayRangeAPPLE = func.invoke("glFlushVertexArrayRangeAPPLE");
            PFN_glVertexArrayParameteriAPPLE = func.invoke("glVertexArrayParameteriAPPLE");
        }
    }

    public GLAPPLEVertexArrayRange(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void VertexArrayRangeAPPLE(@CType("GLsizei") int length, @CType("void*") MemorySegment pointer) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArrayRangeAPPLE)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayRangeAPPLE");
        try { Handles.MH_glVertexArrayRangeAPPLE.invokeExact(handles.PFN_glVertexArrayRangeAPPLE, length, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayRangeAPPLE", e); }
    }

    public void FlushVertexArrayRangeAPPLE(@CType("GLsizei") int length, @CType("void*") MemorySegment pointer) {
        if (Unmarshal.isNullPointer(handles.PFN_glFlushVertexArrayRangeAPPLE)) throw new SymbolNotFoundError("Symbol not found: glFlushVertexArrayRangeAPPLE");
        try { Handles.MH_glFlushVertexArrayRangeAPPLE.invokeExact(handles.PFN_glFlushVertexArrayRangeAPPLE, length, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glFlushVertexArrayRangeAPPLE", e); }
    }

    public void VertexArrayParameteriAPPLE(@CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArrayParameteriAPPLE)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayParameteriAPPLE");
        try { Handles.MH_glVertexArrayParameteriAPPLE.invokeExact(handles.PFN_glVertexArrayParameteriAPPLE, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayParameteriAPPLE", e); }
    }

}

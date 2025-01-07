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
    public static final MethodHandle MH_glVertexArrayRangeAPPLE = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glVertexArrayRangeAPPLE;
    public static final MethodHandle MH_glFlushVertexArrayRangeAPPLE = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glFlushVertexArrayRangeAPPLE;
    public static final MethodHandle MH_glVertexArrayParameteriAPPLE = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexArrayParameteriAPPLE;

    public GLAPPLEVertexArrayRange(overrungl.opengl.GLLoadFunc func) {
        PFN_glVertexArrayRangeAPPLE = func.invoke("glVertexArrayRangeAPPLE");
        PFN_glFlushVertexArrayRangeAPPLE = func.invoke("glFlushVertexArrayRangeAPPLE");
        PFN_glVertexArrayParameteriAPPLE = func.invoke("glVertexArrayParameteriAPPLE");
    }

    public void VertexArrayRangeAPPLE(@CType("GLsizei") int length, @CType("void*") java.lang.foreign.MemorySegment pointer) {
        if (!Unmarshal.isNullPointer(PFN_glVertexArrayRangeAPPLE)) { try {
            MH_glVertexArrayRangeAPPLE.invokeExact(PFN_glVertexArrayRangeAPPLE, length, pointer);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexArrayRangeAPPLE", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexArrayRangeAPPLE"); }
    }

    public void FlushVertexArrayRangeAPPLE(@CType("GLsizei") int length, @CType("void*") java.lang.foreign.MemorySegment pointer) {
        if (!Unmarshal.isNullPointer(PFN_glFlushVertexArrayRangeAPPLE)) { try {
            MH_glFlushVertexArrayRangeAPPLE.invokeExact(PFN_glFlushVertexArrayRangeAPPLE, length, pointer);
        } catch (Throwable e) { throw new RuntimeException("error in glFlushVertexArrayRangeAPPLE", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glFlushVertexArrayRangeAPPLE"); }
    }

    public void VertexArrayParameteriAPPLE(@CType("GLenum") int pname, @CType("GLint") int param) {
        if (!Unmarshal.isNullPointer(PFN_glVertexArrayParameteriAPPLE)) { try {
            MH_glVertexArrayParameteriAPPLE.invokeExact(PFN_glVertexArrayParameteriAPPLE, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexArrayParameteriAPPLE", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexArrayParameteriAPPLE"); }
    }

}

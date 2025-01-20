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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLAPPLEFlushBufferRange {
    public static final int GL_BUFFER_SERIALIZED_MODIFY_APPLE = 0x8A12;
    public static final int GL_BUFFER_FLUSHING_UNMAP_APPLE = 0x8A13;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glBufferParameteriAPPLE = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glFlushMappedBufferRangeAPPLE = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glBufferParameteriAPPLE,
            FD_glFlushMappedBufferRangeAPPLE
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glBufferParameteriAPPLE = RuntimeHelper.downcall(Descriptors.FD_glBufferParameteriAPPLE);
        public static final MethodHandle MH_glFlushMappedBufferRangeAPPLE = RuntimeHelper.downcall(Descriptors.FD_glFlushMappedBufferRangeAPPLE);
        public final MemorySegment PFN_glBufferParameteriAPPLE;
        public final MemorySegment PFN_glFlushMappedBufferRangeAPPLE;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBufferParameteriAPPLE = func.invoke("glBufferParameteriAPPLE");
            PFN_glFlushMappedBufferRangeAPPLE = func.invoke("glFlushMappedBufferRangeAPPLE", "glFlushMappedBufferRange");
        }
    }

    public GLAPPLEFlushBufferRange(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void BufferParameteriAPPLE(@CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glBufferParameteriAPPLE)) throw new SymbolNotFoundError("Symbol not found: glBufferParameteriAPPLE");
        try { Handles.MH_glBufferParameteriAPPLE.invokeExact(handles.PFN_glBufferParameteriAPPLE, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glBufferParameteriAPPLE", e); }
    }

    public void FlushMappedBufferRangeAPPLE(@CType("GLenum") int target, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size) {
        if (Unmarshal.isNullPointer(handles.PFN_glFlushMappedBufferRangeAPPLE)) throw new SymbolNotFoundError("Symbol not found: glFlushMappedBufferRangeAPPLE");
        try { Handles.MH_glFlushMappedBufferRangeAPPLE.invokeExact(handles.PFN_glFlushMappedBufferRangeAPPLE, target, offset, size); }
        catch (Throwable e) { throw new RuntimeException("error in glFlushMappedBufferRangeAPPLE", e); }
    }

}

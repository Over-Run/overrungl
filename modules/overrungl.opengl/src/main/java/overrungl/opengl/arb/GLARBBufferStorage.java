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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBBufferStorage {
    public static final int GL_MAP_READ_BIT = 0x0001;
    public static final int GL_MAP_WRITE_BIT = 0x0002;
    public static final int GL_MAP_PERSISTENT_BIT = 0x0040;
    public static final int GL_MAP_COHERENT_BIT = 0x0080;
    public static final int GL_DYNAMIC_STORAGE_BIT = 0x0100;
    public static final int GL_CLIENT_STORAGE_BIT = 0x0200;
    public static final int GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT = 0x00004000;
    public static final int GL_BUFFER_IMMUTABLE_STORAGE = 0x821F;
    public static final int GL_BUFFER_STORAGE_FLAGS = 0x8220;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glBufferStorage = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glBufferStorage;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glBufferStorage = func.invoke("glBufferStorage");
        }
    }

    public GLARBBufferStorage(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glBufferStorage(unsigned int target, signed long long size, const void* data, unsigned int flags);
    /// ```
    public void BufferStorage(int target, long size, MemorySegment data, int flags) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBufferStorage)) throw new SymbolNotFoundError("Symbol not found: glBufferStorage");
        try { Handles.MH_glBufferStorage.invokeExact(handles.PFN_glBufferStorage, target, size, data, flags); }
        catch (Throwable e) { throw new RuntimeException("error in BufferStorage", e); }
    }

}

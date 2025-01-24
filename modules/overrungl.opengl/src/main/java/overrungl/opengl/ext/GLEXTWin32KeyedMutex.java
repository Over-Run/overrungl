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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTWin32KeyedMutex {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glAcquireKeyedMutexWin32EXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glReleaseKeyedMutexWin32EXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public final MemorySegment PFN_glAcquireKeyedMutexWin32EXT;
        public final MemorySegment PFN_glReleaseKeyedMutexWin32EXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glAcquireKeyedMutexWin32EXT = func.invoke("glAcquireKeyedMutexWin32EXT");
            PFN_glReleaseKeyedMutexWin32EXT = func.invoke("glReleaseKeyedMutexWin32EXT");
        }
    }

    public GLEXTWin32KeyedMutex(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// GLboolean glAcquireKeyedMutexWin32EXT(unsigned int memory, uint64_t key, unsigned int timeout);
    /// ```
    public boolean AcquireKeyedMutexWin32EXT(int memory, long key, int timeout) {
        if (MemoryUtil.isNullPointer(handles.PFN_glAcquireKeyedMutexWin32EXT)) throw new SymbolNotFoundError("Symbol not found: glAcquireKeyedMutexWin32EXT");
        try { return (((byte) Handles.MH_glAcquireKeyedMutexWin32EXT.invokeExact(handles.PFN_glAcquireKeyedMutexWin32EXT, memory, key, timeout)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in AcquireKeyedMutexWin32EXT", e); }
    }

    /// ```
    /// GLboolean glReleaseKeyedMutexWin32EXT(unsigned int memory, uint64_t key);
    /// ```
    public boolean ReleaseKeyedMutexWin32EXT(int memory, long key) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReleaseKeyedMutexWin32EXT)) throw new SymbolNotFoundError("Symbol not found: glReleaseKeyedMutexWin32EXT");
        try { return (((byte) Handles.MH_glReleaseKeyedMutexWin32EXT.invokeExact(handles.PFN_glReleaseKeyedMutexWin32EXT, memory, key)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in ReleaseKeyedMutexWin32EXT", e); }
    }

}

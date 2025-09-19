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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_win32_keyed_mutex`
public final class GLEXTWin32KeyedMutex {
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glAcquireKeyedMutexWin32EXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glReleaseKeyedMutexWin32EXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public final MemorySegment PFN_glAcquireKeyedMutexWin32EXT;
        public final MemorySegment PFN_glReleaseKeyedMutexWin32EXT;
        private Handles(GLLoadFunc func) {
            PFN_glAcquireKeyedMutexWin32EXT = func.invoke("glAcquireKeyedMutexWin32EXT");
            PFN_glReleaseKeyedMutexWin32EXT = func.invoke("glReleaseKeyedMutexWin32EXT");
        }
    }

    public GLEXTWin32KeyedMutex(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glAcquireKeyedMutexWin32EXT`.
    /// ```
    /// GLboolean glAcquireKeyedMutexWin32EXT((unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 key, (unsigned int) GLuint timeout);
    /// ```
    public boolean AcquireKeyedMutexWin32EXT(int memory, long key, int timeout) {
        if (MemoryUtil.isNullPointer(handles.PFN_glAcquireKeyedMutexWin32EXT)) throw new GLSymbolNotFoundError("Symbol not found: glAcquireKeyedMutexWin32EXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glAcquireKeyedMutexWin32EXT", memory, key, timeout); }
        return (((byte) Handles.MH_glAcquireKeyedMutexWin32EXT.invokeExact(handles.PFN_glAcquireKeyedMutexWin32EXT, memory, key, timeout)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in AcquireKeyedMutexWin32EXT", e); }
    }

    /// Invokes `glReleaseKeyedMutexWin32EXT`.
    /// ```
    /// GLboolean glReleaseKeyedMutexWin32EXT((unsigned int) GLuint memory, ((uint64_t) khronos_uint64_t) GLuint64 key);
    /// ```
    public boolean ReleaseKeyedMutexWin32EXT(int memory, long key) {
        if (MemoryUtil.isNullPointer(handles.PFN_glReleaseKeyedMutexWin32EXT)) throw new GLSymbolNotFoundError("Symbol not found: glReleaseKeyedMutexWin32EXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glReleaseKeyedMutexWin32EXT", memory, key); }
        return (((byte) Handles.MH_glReleaseKeyedMutexWin32EXT.invokeExact(handles.PFN_glReleaseKeyedMutexWin32EXT, memory, key)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in ReleaseKeyedMutexWin32EXT", e); }
    }

}

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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTWin32KeyedMutex {
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glAcquireKeyedMutexWin32EXT = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glReleaseKeyedMutexWin32EXT = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glAcquireKeyedMutexWin32EXT,
            FD_glReleaseKeyedMutexWin32EXT
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glAcquireKeyedMutexWin32EXT = RuntimeHelper.downcall(Descriptors.FD_glAcquireKeyedMutexWin32EXT);
        public static final MethodHandle MH_glReleaseKeyedMutexWin32EXT = RuntimeHelper.downcall(Descriptors.FD_glReleaseKeyedMutexWin32EXT);
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

    public @CType("GLboolean") boolean AcquireKeyedMutexWin32EXT(@CType("GLuint") int memory, @CType("GLuint64") long key, @CType("GLuint") int timeout) {
        if (Unmarshal.isNullPointer(handles.PFN_glAcquireKeyedMutexWin32EXT)) throw new SymbolNotFoundError("Symbol not found: glAcquireKeyedMutexWin32EXT");
        try { return (boolean) Handles.MH_glAcquireKeyedMutexWin32EXT.invokeExact(handles.PFN_glAcquireKeyedMutexWin32EXT, memory, key, timeout); }
        catch (Throwable e) { throw new RuntimeException("error in glAcquireKeyedMutexWin32EXT", e); }
    }

    public @CType("GLboolean") boolean ReleaseKeyedMutexWin32EXT(@CType("GLuint") int memory, @CType("GLuint64") long key) {
        if (Unmarshal.isNullPointer(handles.PFN_glReleaseKeyedMutexWin32EXT)) throw new SymbolNotFoundError("Symbol not found: glReleaseKeyedMutexWin32EXT");
        try { return (boolean) Handles.MH_glReleaseKeyedMutexWin32EXT.invokeExact(handles.PFN_glReleaseKeyedMutexWin32EXT, memory, key); }
        catch (Throwable e) { throw new RuntimeException("error in glReleaseKeyedMutexWin32EXT", e); }
    }

}

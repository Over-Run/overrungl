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

public final class GLARBSync {
    public static final int GL_MAX_SERVER_WAIT_TIMEOUT = 0x9111;
    public static final int GL_OBJECT_TYPE = 0x9112;
    public static final int GL_SYNC_CONDITION = 0x9113;
    public static final int GL_SYNC_STATUS = 0x9114;
    public static final int GL_SYNC_FLAGS = 0x9115;
    public static final int GL_SYNC_FENCE = 0x9116;
    public static final int GL_SYNC_GPU_COMMANDS_COMPLETE = 0x9117;
    public static final int GL_UNSIGNALED = 0x9118;
    public static final int GL_SIGNALED = 0x9119;
    public static final int GL_ALREADY_SIGNALED = 0x911A;
    public static final int GL_TIMEOUT_EXPIRED = 0x911B;
    public static final int GL_CONDITION_SATISFIED = 0x911C;
    public static final int GL_WAIT_FAILED = 0x911D;
    public static final int GL_SYNC_FLUSH_COMMANDS_BIT = 0x00000001;
    public static final long GL_TIMEOUT_IGNORED = 0xFFFFFFFFFFFFFFFFL;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glFenceSync = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glIsSync = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glDeleteSync = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glClientWaitSync = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glWaitSync = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glGetInteger64v = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetSynciv = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glFenceSync = RuntimeHelper.downcall(Descriptors.FD_glFenceSync);
        public static final MethodHandle MH_glIsSync = RuntimeHelper.downcall(Descriptors.FD_glIsSync);
        public static final MethodHandle MH_glDeleteSync = RuntimeHelper.downcall(Descriptors.FD_glDeleteSync);
        public static final MethodHandle MH_glClientWaitSync = RuntimeHelper.downcall(Descriptors.FD_glClientWaitSync);
        public static final MethodHandle MH_glWaitSync = RuntimeHelper.downcall(Descriptors.FD_glWaitSync);
        public static final MethodHandle MH_glGetInteger64v = RuntimeHelper.downcall(Descriptors.FD_glGetInteger64v);
        public static final MethodHandle MH_glGetSynciv = RuntimeHelper.downcall(Descriptors.FD_glGetSynciv);
        public final MemorySegment PFN_glFenceSync;
        public final MemorySegment PFN_glIsSync;
        public final MemorySegment PFN_glDeleteSync;
        public final MemorySegment PFN_glClientWaitSync;
        public final MemorySegment PFN_glWaitSync;
        public final MemorySegment PFN_glGetInteger64v;
        public final MemorySegment PFN_glGetSynciv;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glFenceSync = func.invoke("glFenceSync");
            PFN_glIsSync = func.invoke("glIsSync");
            PFN_glDeleteSync = func.invoke("glDeleteSync");
            PFN_glClientWaitSync = func.invoke("glClientWaitSync");
            PFN_glWaitSync = func.invoke("glWaitSync");
            PFN_glGetInteger64v = func.invoke("glGetInteger64v");
            PFN_glGetSynciv = func.invoke("glGetSynciv");
        }
    }

    public GLARBSync(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public @CType("GLsync") java.lang.foreign.MemorySegment FenceSync(@CType("GLenum") int condition, @CType("GLbitfield") int flags) {
        if (Unmarshal.isNullPointer(handles.PFN_glFenceSync)) throw new SymbolNotFoundError("Symbol not found: glFenceSync");
        try { return (java.lang.foreign.MemorySegment) Handles.MH_glFenceSync.invokeExact(handles.PFN_glFenceSync, condition, flags); }
        catch (Throwable e) { throw new RuntimeException("error in glFenceSync", e); }
    }

    public @CType("GLboolean") boolean IsSync(@CType("GLsync") java.lang.foreign.MemorySegment sync) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsSync)) throw new SymbolNotFoundError("Symbol not found: glIsSync");
        try { return (boolean) Handles.MH_glIsSync.invokeExact(handles.PFN_glIsSync, sync); }
        catch (Throwable e) { throw new RuntimeException("error in glIsSync", e); }
    }

    public void DeleteSync(@CType("GLsync") java.lang.foreign.MemorySegment sync) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeleteSync)) throw new SymbolNotFoundError("Symbol not found: glDeleteSync");
        try { Handles.MH_glDeleteSync.invokeExact(handles.PFN_glDeleteSync, sync); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteSync", e); }
    }

    public @CType("GLenum") int ClientWaitSync(@CType("GLsync") java.lang.foreign.MemorySegment sync, @CType("GLbitfield") int flags, @CType("GLuint64") long timeout) {
        if (Unmarshal.isNullPointer(handles.PFN_glClientWaitSync)) throw new SymbolNotFoundError("Symbol not found: glClientWaitSync");
        try { return (int) Handles.MH_glClientWaitSync.invokeExact(handles.PFN_glClientWaitSync, sync, flags, timeout); }
        catch (Throwable e) { throw new RuntimeException("error in glClientWaitSync", e); }
    }

    public void WaitSync(@CType("GLsync") java.lang.foreign.MemorySegment sync, @CType("GLbitfield") int flags, @CType("GLuint64") long timeout) {
        if (Unmarshal.isNullPointer(handles.PFN_glWaitSync)) throw new SymbolNotFoundError("Symbol not found: glWaitSync");
        try { Handles.MH_glWaitSync.invokeExact(handles.PFN_glWaitSync, sync, flags, timeout); }
        catch (Throwable e) { throw new RuntimeException("error in glWaitSync", e); }
    }

    public void GetInteger64v(@CType("GLenum") int pname, @CType("GLint64 *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetInteger64v)) throw new SymbolNotFoundError("Symbol not found: glGetInteger64v");
        try { Handles.MH_glGetInteger64v.invokeExact(handles.PFN_glGetInteger64v, pname, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetInteger64v", e); }
    }

    public void GetSynciv(@CType("GLsync") java.lang.foreign.MemorySegment sync, @CType("GLenum") int pname, @CType("GLsizei") int count, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLint *") java.lang.foreign.MemorySegment values) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetSynciv)) throw new SymbolNotFoundError("Symbol not found: glGetSynciv");
        try { Handles.MH_glGetSynciv.invokeExact(handles.PFN_glGetSynciv, sync, pname, count, length, values); }
        catch (Throwable e) { throw new RuntimeException("error in glGetSynciv", e); }
    }

}

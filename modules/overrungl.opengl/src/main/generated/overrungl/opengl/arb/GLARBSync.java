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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_sync`
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
    public static final class Handles {
        public static final MethodHandle MH_glFenceSync = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glIsSync = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDeleteSync = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_glClientWaitSync = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glWaitSync = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glGetInteger64v = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetSynciv = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glFenceSync;
        public final MemorySegment PFN_glIsSync;
        public final MemorySegment PFN_glDeleteSync;
        public final MemorySegment PFN_glClientWaitSync;
        public final MemorySegment PFN_glWaitSync;
        public final MemorySegment PFN_glGetInteger64v;
        public final MemorySegment PFN_glGetSynciv;
        private Handles(GLLoadFunc func) {
            PFN_glFenceSync = func.invoke("glFenceSync");
            PFN_glIsSync = func.invoke("glIsSync");
            PFN_glDeleteSync = func.invoke("glDeleteSync");
            PFN_glClientWaitSync = func.invoke("glClientWaitSync");
            PFN_glWaitSync = func.invoke("glWaitSync");
            PFN_glGetInteger64v = func.invoke("glGetInteger64v");
            PFN_glGetSynciv = func.invoke("glGetSynciv");
        }
    }

    public GLARBSync(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glFenceSync`.
    /// ```
    /// (struct __GLsync *) GLsync glFenceSync((unsigned int) GLenum condition, (unsigned int) GLbitfield flags);
    /// ```
    public @NonNull MemorySegment FenceSync(int condition, int flags) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFenceSync)) throw new GLSymbolNotFoundError("Symbol not found: glFenceSync");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFenceSync", condition, flags); }
        return (MemorySegment) Handles.MH_glFenceSync.invokeExact(handles.PFN_glFenceSync, condition, flags); }
        catch (Throwable e) { throw new RuntimeException("error in FenceSync", e); }
    }

    /// Invokes `glIsSync`.
    /// ```
    /// GLboolean glIsSync((struct __GLsync *) GLsync sync);
    /// ```
    public boolean IsSync(@NonNull MemorySegment sync) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsSync)) throw new GLSymbolNotFoundError("Symbol not found: glIsSync");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsSync", sync); }
        return (((byte) Handles.MH_glIsSync.invokeExact(handles.PFN_glIsSync, sync)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsSync", e); }
    }

    /// Invokes `glDeleteSync`.
    /// ```
    /// void glDeleteSync((struct __GLsync *) GLsync sync);
    /// ```
    public void DeleteSync(@NonNull MemorySegment sync) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteSync)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteSync");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteSync", sync); }
        Handles.MH_glDeleteSync.invokeExact(handles.PFN_glDeleteSync, sync); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteSync", e); }
    }

    /// Invokes `glClientWaitSync`.
    /// ```
    /// (unsigned int) GLenum glClientWaitSync((struct __GLsync *) GLsync sync, (unsigned int) GLbitfield flags, ((uint64_t) khronos_uint64_t) GLuint64 timeout);
    /// ```
    public int ClientWaitSync(@NonNull MemorySegment sync, int flags, long timeout) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClientWaitSync)) throw new GLSymbolNotFoundError("Symbol not found: glClientWaitSync");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClientWaitSync", sync, flags, timeout); }
        return (int) Handles.MH_glClientWaitSync.invokeExact(handles.PFN_glClientWaitSync, sync, flags, timeout); }
        catch (Throwable e) { throw new RuntimeException("error in ClientWaitSync", e); }
    }

    /// Invokes `glWaitSync`.
    /// ```
    /// void glWaitSync((struct __GLsync *) GLsync sync, (unsigned int) GLbitfield flags, ((uint64_t) khronos_uint64_t) GLuint64 timeout);
    /// ```
    public void WaitSync(@NonNull MemorySegment sync, int flags, long timeout) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWaitSync)) throw new GLSymbolNotFoundError("Symbol not found: glWaitSync");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWaitSync", sync, flags, timeout); }
        Handles.MH_glWaitSync.invokeExact(handles.PFN_glWaitSync, sync, flags, timeout); }
        catch (Throwable e) { throw new RuntimeException("error in WaitSync", e); }
    }

    /// Invokes `glGetInteger64v`.
    /// ```
    /// void glGetInteger64v((unsigned int) GLenum pname, GLint64* data);
    /// ```
    public void GetInteger64v(int pname, @NonNull MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetInteger64v)) throw new GLSymbolNotFoundError("Symbol not found: glGetInteger64v");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetInteger64v", pname, data); }
        Handles.MH_glGetInteger64v.invokeExact(handles.PFN_glGetInteger64v, pname, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetInteger64v", e); }
    }

    /// Invokes `glGetSynciv`.
    /// ```
    /// void glGetSynciv((struct __GLsync *) GLsync sync, (unsigned int) GLenum pname, (int) GLsizei count, GLsizei* length, GLint* values);
    /// ```
    public void GetSynciv(@NonNull MemorySegment sync, int pname, int count, @NonNull MemorySegment length, @NonNull MemorySegment values) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetSynciv)) throw new GLSymbolNotFoundError("Symbol not found: glGetSynciv");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetSynciv", sync, pname, count, length, values); }
        Handles.MH_glGetSynciv.invokeExact(handles.PFN_glGetSynciv, sync, pname, count, length, values); }
        catch (Throwable e) { throw new RuntimeException("error in GetSynciv", e); }
    }

}

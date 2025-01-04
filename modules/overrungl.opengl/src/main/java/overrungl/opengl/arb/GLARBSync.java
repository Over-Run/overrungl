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
    public static final MethodHandle MH_glFenceSync = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glFenceSync;
    public static final MethodHandle MH_glIsSync = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glIsSync;
    public static final MethodHandle MH_glDeleteSync = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDeleteSync;
    public static final MethodHandle MH_glClientWaitSync = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glClientWaitSync;
    public static final MethodHandle MH_glWaitSync = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glWaitSync;
    public static final MethodHandle MH_glGetInteger64v = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetInteger64v;
    public static final MethodHandle MH_glGetSynciv = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetSynciv;

    public GLARBSync(overrungl.opengl.GLLoadFunc func) {
        PFN_glFenceSync = func.invoke("glFenceSync");
        PFN_glIsSync = func.invoke("glIsSync");
        PFN_glDeleteSync = func.invoke("glDeleteSync");
        PFN_glClientWaitSync = func.invoke("glClientWaitSync");
        PFN_glWaitSync = func.invoke("glWaitSync");
        PFN_glGetInteger64v = func.invoke("glGetInteger64v");
        PFN_glGetSynciv = func.invoke("glGetSynciv");
    }

    public @CType("GLsync") java.lang.foreign.MemorySegment FenceSync(@CType("GLenum") int condition, @CType("GLbitfield") int flags) {
        try { if (!Unmarshal.isNullPointer(PFN_glFenceSync))
            return (java.lang.foreign.MemorySegment) MH_glFenceSync.invokeExact(PFN_glFenceSync, condition, flags);
            else return MemorySegment.NULL;
        }
        catch (Throwable e) { throw new RuntimeException("error in glFenceSync", e); }
    }

    public @CType("GLboolean") boolean IsSync(@CType("GLsync") java.lang.foreign.MemorySegment sync) {
        try { if (!Unmarshal.isNullPointer(PFN_glIsSync))
            return (boolean) MH_glIsSync.invokeExact(PFN_glIsSync, sync);
            else return false;
        }
        catch (Throwable e) { throw new RuntimeException("error in glIsSync", e); }
    }

    public void DeleteSync(@CType("GLsync") java.lang.foreign.MemorySegment sync) {
        try { if (!Unmarshal.isNullPointer(PFN_glDeleteSync))
            MH_glDeleteSync.invokeExact(PFN_glDeleteSync, sync);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteSync", e); }
    }

    public @CType("GLenum") int ClientWaitSync(@CType("GLsync") java.lang.foreign.MemorySegment sync, @CType("GLbitfield") int flags, @CType("GLuint64") long timeout) {
        try { if (!Unmarshal.isNullPointer(PFN_glClientWaitSync))
            return (int) MH_glClientWaitSync.invokeExact(PFN_glClientWaitSync, sync, flags, timeout);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glClientWaitSync", e); }
    }

    public void WaitSync(@CType("GLsync") java.lang.foreign.MemorySegment sync, @CType("GLbitfield") int flags, @CType("GLuint64") long timeout) {
        try { if (!Unmarshal.isNullPointer(PFN_glWaitSync))
            MH_glWaitSync.invokeExact(PFN_glWaitSync, sync, flags, timeout);
        }
        catch (Throwable e) { throw new RuntimeException("error in glWaitSync", e); }
    }

    public void GetInteger64v(@CType("GLenum") int pname, @CType("GLint64 *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetInteger64v))
            MH_glGetInteger64v.invokeExact(PFN_glGetInteger64v, pname, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetInteger64v", e); }
    }

    public void GetSynciv(@CType("GLsync") java.lang.foreign.MemorySegment sync, @CType("GLenum") int pname, @CType("GLsizei") int count, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLint *") java.lang.foreign.MemorySegment values) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetSynciv))
            MH_glGetSynciv.invokeExact(PFN_glGetSynciv, sync, pname, count, length, values);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetSynciv", e); }
    }

}

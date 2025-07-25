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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLARBClEvent {
    public static final int GL_SYNC_CL_EVENT_ARB = 0x8240;
    public static final int GL_SYNC_CL_EVENT_COMPLETE_ARB = 0x8241;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glCreateSyncFromCLeventARB = downcallHandle(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glCreateSyncFromCLeventARB;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glCreateSyncFromCLeventARB = func.invoke("glCreateSyncFromCLeventARB");
        }
    }

    public GLARBClEvent(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// (struct __GLsync *) GLsync glCreateSyncFromCLeventARB(struct _cl_context * context, struct _cl_event * event, (unsigned int) GLbitfield flags);
    /// ```
    public MemorySegment CreateSyncFromCLeventARB(MemorySegment context, MemorySegment event, int flags) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCreateSyncFromCLeventARB)) throw new GLSymbolNotFoundError("Symbol not found: glCreateSyncFromCLeventARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCreateSyncFromCLeventARB", context, event, flags); }
        return (MemorySegment) Handles.MH_glCreateSyncFromCLeventARB.invokeExact(handles.PFN_glCreateSyncFromCLeventARB, context, event, flags); }
        catch (Throwable e) { throw new RuntimeException("error in CreateSyncFromCLeventARB", e); }
    }

}

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

public final class GLARBClEvent {
    public static final int GL_SYNC_CL_EVENT_ARB = 0x8240;
    public static final int GL_SYNC_CL_EVENT_COMPLETE_ARB = 0x8241;
    public static final MethodHandle MH_glCreateSyncFromCLeventARB = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCreateSyncFromCLeventARB;

    public GLARBClEvent(overrungl.opengl.GLLoadFunc func) {
        PFN_glCreateSyncFromCLeventARB = func.invoke("glCreateSyncFromCLeventARB");
    }

    public @CType("GLsync") java.lang.foreign.MemorySegment CreateSyncFromCLeventARB(@CType("struct _cl_context *") java.lang.foreign.MemorySegment context, @CType("struct _cl_event *") java.lang.foreign.MemorySegment event, @CType("GLbitfield") int flags) {
        if (!Unmarshal.isNullPointer(PFN_glCreateSyncFromCLeventARB)) { try {
            return (java.lang.foreign.MemorySegment) MH_glCreateSyncFromCLeventARB.invokeExact(PFN_glCreateSyncFromCLeventARB, context, event, flags);
        } catch (Throwable e) { throw new RuntimeException("error in glCreateSyncFromCLeventARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCreateSyncFromCLeventARB"); }
    }

}

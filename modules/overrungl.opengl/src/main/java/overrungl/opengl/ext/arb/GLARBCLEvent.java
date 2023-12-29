/*
 * MIT License
 *
 * Copyright (c) 2022-present Overrun Organization
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
package overrungl.opengl.ext.arb;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_ARB_cl_event}
 */
public final class GLARBCLEvent {
    public static final int GL_SYNC_CL_EVENT_ARB = 0x8240;
    public static final int GL_SYNC_CL_EVENT_COMPLETE_ARB = 0x8241;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_cl_event) return;
        ext.glCreateSyncFromCLeventARB = load.invoke("glCreateSyncFromCLeventARB", of(ADDRESS, ADDRESS, ADDRESS, JAVA_INT));
    }

    public static @NativeType("GLsync") MemorySegment glCreateSyncFromCLeventARB(@NativeType("struct _cl_context *") MemorySegment context, @NativeType("struct _cl_event *") MemorySegment event, int flags) {
        final var ext = getExtCapabilities();
        try {
            return (MemorySegment)
            check(ext.glCreateSyncFromCLeventARB).invokeExact(context, event, flags);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}

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
import overrungl.opengl.*;

public final class GLEXTX11SyncObject {
    public static final int GL_SYNC_X11_FENCE_EXT = 0x90E1;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glImportSyncEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glImportSyncEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glImportSyncEXT = func.invoke("glImportSyncEXT");
        }
    }

    public GLEXTX11SyncObject(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// (struct __GLsync *) GLsync glImportSyncEXT((unsigned int) GLenum external_sync_type, ((signed long long) khronos_intptr_t) GLintptr external_sync, (unsigned int) GLbitfield flags);
    /// ```
    public MemorySegment ImportSyncEXT(int external_sync_type, long external_sync, int flags) {
        if (MemoryUtil.isNullPointer(handles.PFN_glImportSyncEXT)) throw new GLSymbolNotFoundError("Symbol not found: glImportSyncEXT");
        try { return (MemorySegment) Handles.MH_glImportSyncEXT.invokeExact(handles.PFN_glImportSyncEXT, external_sync_type, external_sync, flags); }
        catch (Throwable e) { throw new RuntimeException("error in ImportSyncEXT", e); }
    }

}

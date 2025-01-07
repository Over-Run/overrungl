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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTX11SyncObject {
    public static final int GL_SYNC_X11_FENCE_EXT = 0x90E1;
    public static final MethodHandle MH_glImportSyncEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glImportSyncEXT;

    public GLEXTX11SyncObject(overrungl.opengl.GLLoadFunc func) {
        PFN_glImportSyncEXT = func.invoke("glImportSyncEXT");
    }

    public @CType("GLsync") java.lang.foreign.MemorySegment ImportSyncEXT(@CType("GLenum") int external_sync_type, @CType("GLintptr") long external_sync, @CType("GLbitfield") int flags) {
        if (!Unmarshal.isNullPointer(PFN_glImportSyncEXT)) { try {
            return (java.lang.foreign.MemorySegment) MH_glImportSyncEXT.invokeExact(PFN_glImportSyncEXT, external_sync_type, external_sync, flags);
        } catch (Throwable e) { throw new RuntimeException("error in glImportSyncEXT", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glImportSyncEXT"); }
    }

}

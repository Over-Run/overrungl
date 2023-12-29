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
package overrungl.opengl.ext.ext;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_EXT_x11_sync_object}
 */
public final class GLEXTX11SyncObject {
    public static final int GL_SYNC_X11_FENCE_EXT = 0x90E1;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_x11_sync_object) return;
        ext.glImportSyncEXT = load.invoke("glImportSyncEXT", of(ADDRESS, JAVA_INT, JAVA_LONG, JAVA_INT));
    }

    public static @NativeType("GLsync") MemorySegment glImportSyncEXT(int external_sync_type, long external_sync, int flags) {
        final var ext = getExtCapabilities();
        try {
            return (MemorySegment)
            check(ext.glImportSyncEXT).invokeExact(external_sync_type, external_sync, flags);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}

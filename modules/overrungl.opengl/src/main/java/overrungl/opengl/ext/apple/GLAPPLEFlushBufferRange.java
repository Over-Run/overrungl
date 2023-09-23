/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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
package overrungl.opengl.ext.apple;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_APPLE_flush_buffer_range}
  */
public final class GLAPPLEFlushBufferRange {
    public static final int GL_BUFFER_SERIALIZED_MODIFY_APPLE = 0x8A12;
    public static final int GL_BUFFER_FLUSHING_UNMAP_APPLE = 0x8A13;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_APPLE_flush_buffer_range) return;
        ext.glBufferParameteriAPPLE = load.invoke("glBufferParameteriAPPLE", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glFlushMappedBufferRangeAPPLE = load.invoke("glFlushMappedBufferRangeAPPLE", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG));
    }

    public static void glBufferParameteriAPPLE(int target, int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBufferParameteriAPPLE).invokeExact(target, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFlushMappedBufferRangeAPPLE(int target, long offset, long size) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFlushMappedBufferRangeAPPLE).invokeExact(target, offset, size);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}

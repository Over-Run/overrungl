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
package overrungl.opengl.ext.ati;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_ATI_map_object_buffer}
  */
public final class GLATIMapObjectBuffer {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ATI_map_object_buffer) return;
        ext.glMapObjectBufferATI = load.invoke("glMapObjectBufferATI", of(ADDRESS, JAVA_INT));
        ext.glUnmapObjectBufferATI = load.invoke("glUnmapObjectBufferATI", ofVoid(JAVA_INT));
    }

    public static @NativeType("void*") MemorySegment glMapObjectBufferATI(int buffer) {
        final var ext = getExtCapabilities();
        try {
            return (MemorySegment)
            check(ext.glMapObjectBufferATI).invokeExact(buffer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUnmapObjectBufferATI(int buffer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUnmapObjectBufferATI).invokeExact(buffer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}

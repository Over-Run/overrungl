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
package overrungl.opengl.ext.intel;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_INTEL_map_texture}
  */
public final class GLINTELMapTexture {
    public static final int GL_TEXTURE_MEMORY_LAYOUT_INTEL = 0x83FF;
    public static final int GL_LAYOUT_DEFAULT_INTEL = 0;
    public static final int GL_LAYOUT_LINEAR_INTEL = 1;
    public static final int GL_LAYOUT_LINEAR_CPU_CACHED_INTEL = 2;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_INTEL_map_texture) return;
        ext.glSyncTextureINTEL = load.invoke("glSyncTextureINTEL", ofVoid(JAVA_INT));
        ext.glUnmapTexture2DINTEL = load.invoke("glUnmapTexture2DINTEL", ofVoid(JAVA_INT, JAVA_INT));
        ext.glMapTexture2DINTEL = load.invoke("glMapTexture2DINTEL", of(ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, ADDRESS));
    }

    public static void glSyncTextureINTEL(int texture) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glSyncTextureINTEL).invokeExact(texture);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glUnmapTexture2DINTEL(int texture, int level) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glUnmapTexture2DINTEL).invokeExact(texture, level);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static @NativeType("void*") MemorySegment glMapTexture2DINTEL(int texture, int level, int access, @NativeType("GLint *") MemorySegment stride, @NativeType("GLenum *") MemorySegment layout) {
        final var ext = getExtCapabilities();
        try {
            return (MemorySegment)
            check(ext.glMapTexture2DINTEL).invokeExact(texture, level, access, stride, layout);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}

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
package overrungl.opengl.ext.intel;

import overrungl.*;
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_INTEL_map_texture}
 */
public interface GLINTELMapTexture {
    int GL_TEXTURE_MEMORY_LAYOUT_INTEL = 0x83FF;
    int GL_LAYOUT_DEFAULT_INTEL = 0;
    int GL_LAYOUT_LINEAR_INTEL = 1;
    int GL_LAYOUT_LINEAR_CPU_CACHED_INTEL = 2;

    void glSyncTextureINTEL(int texture);
    void glUnmapTexture2DINTEL(int texture, int level);
    @NativeType("void*") MemorySegment glMapTexture2DINTEL(int texture, int level, int access, @NativeType("GLint *") MemorySegment stride, @NativeType("GLenum *") MemorySegment layout);
}

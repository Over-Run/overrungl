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
package overrungl.opengl.ext.apple;

import overrungl.*;
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_APPLE_texture_range}
 */
public interface GLAPPLETextureRange {
    int GL_TEXTURE_RANGE_LENGTH_APPLE = 0x85B7;
    int GL_TEXTURE_RANGE_POINTER_APPLE = 0x85B8;
    int GL_TEXTURE_STORAGE_HINT_APPLE = 0x85BC;
    int GL_STORAGE_PRIVATE_APPLE = 0x85BD;
    int GL_STORAGE_CACHED_APPLE = 0x85BE;
    int GL_STORAGE_SHARED_APPLE = 0x85BF;

    void glTextureRangeAPPLE(int target, int length, @NativeType("const void *") MemorySegment pointer);
    void glGetTexParameterPointervAPPLE(int target, int pname, @NativeType("void **") MemorySegment params);
}

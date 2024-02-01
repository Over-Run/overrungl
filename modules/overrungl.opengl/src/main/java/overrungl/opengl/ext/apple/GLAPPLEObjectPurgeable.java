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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_APPLE_object_purgeable}
 */
public interface GLAPPLEObjectPurgeable {
    int GL_BUFFER_OBJECT_APPLE = 0x85B3;
    int GL_RELEASED_APPLE = 0x8A19;
    int GL_VOLATILE_APPLE = 0x8A1A;
    int GL_RETAINED_APPLE = 0x8A1B;
    int GL_UNDEFINED_APPLE = 0x8A1C;
    int GL_PURGEABLE_APPLE = 0x8A1D;

    default int glObjectPurgeableAPPLE(int objectType, int name, int option) {
        throw new ContextException();
    }

    default int glObjectUnpurgeableAPPLE(int objectType, int name, int option) {
        throw new ContextException();
    }

    default void glGetObjectParameterivAPPLE(int objectType, int name, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

}

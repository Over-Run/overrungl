/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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
 * {@code GL_APPLE_flush_buffer_range}
 */
public interface GLAPPLEFlushBufferRange extends overrun.marshal.DirectAccess {
    int GL_BUFFER_SERIALIZED_MODIFY_APPLE = 0x8A12;
    int GL_BUFFER_FLUSHING_UNMAP_APPLE = 0x8A13;

    default void glBufferParameteriAPPLE(int target, int pname, int param) {
        throw new ContextException();
    }

    default void glFlushMappedBufferRangeAPPLE(int target, long offset, long size) {
        throw new ContextException();
    }

}

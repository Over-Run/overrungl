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
 * {@code GL_APPLE_element_array}
 */
public interface GLAPPLEElementArray extends overrun.marshal.DirectAccess {
    int GL_ELEMENT_ARRAY_APPLE = 0x8A0C;
    int GL_ELEMENT_ARRAY_TYPE_APPLE = 0x8A0D;
    int GL_ELEMENT_ARRAY_POINTER_APPLE = 0x8A0E;

    default void glElementPointerAPPLE(int type, @NativeType("const void *") MemorySegment pointer) {
        throw new ContextException();
    }

    default void glDrawElementArrayAPPLE(int mode, int first, int count) {
        throw new ContextException();
    }

    default void glDrawRangeElementArrayAPPLE(int mode, int start, int end, int first, int count) {
        throw new ContextException();
    }

    default void glMultiDrawElementArrayAPPLE(int mode, @NativeType("const GLint *") MemorySegment first, @NativeType("const GLsizei *") MemorySegment count, int primcount) {
        throw new ContextException();
    }

    default void glMultiDrawRangeElementArrayAPPLE(int mode, int start, int end, @NativeType("const GLint *") MemorySegment first, @NativeType("const GLsizei *") MemorySegment count, int primcount) {
        throw new ContextException();
    }

}

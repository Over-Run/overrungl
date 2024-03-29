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
package overrungl.opengl.ext.ati;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_ATI_element_array}
 */
public interface GLATIElementArray extends overrun.marshal.DirectAccess {
    int GL_ELEMENT_ARRAY_ATI = 0x8768;
    int GL_ELEMENT_ARRAY_TYPE_ATI = 0x8769;
    int GL_ELEMENT_ARRAY_POINTER_ATI = 0x876A;

    default void glElementPointerATI(int type, @NativeType("const void *") MemorySegment pointer) {
        throw new ContextException();
    }

    default void glDrawElementArrayATI(int mode, int count) {
        throw new ContextException();
    }

    default void glDrawRangeElementArrayATI(int mode, int start, int end, int count) {
        throw new ContextException();
    }

}

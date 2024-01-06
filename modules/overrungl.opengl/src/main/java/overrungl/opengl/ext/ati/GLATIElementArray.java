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
 * {@code GL_ATI_element_array}
 */
public final class GLATIElementArray {
    public static final int GL_ELEMENT_ARRAY_ATI = 0x8768;
    public static final int GL_ELEMENT_ARRAY_TYPE_ATI = 0x8769;
    public static final int GL_ELEMENT_ARRAY_POINTER_ATI = 0x876A;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ATI_element_array) return;
        ext.glElementPointerATI = load.invoke("glElementPointerATI", ofVoid(JAVA_INT, ADDRESS));
        ext.glDrawElementArrayATI = load.invoke("glDrawElementArrayATI", ofVoid(JAVA_INT, JAVA_INT));
        ext.glDrawRangeElementArrayATI = load.invoke("glDrawRangeElementArrayATI", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
    }

    public static void glElementPointerATI(int type, @NativeType("const void *") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glElementPointerATI).invokeExact(type, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDrawElementArrayATI(int mode, int count) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDrawElementArrayATI).invokeExact(mode, count);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDrawRangeElementArrayATI(int mode, int start, int end, int count) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDrawRangeElementArrayATI).invokeExact(mode, start, end, count);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}

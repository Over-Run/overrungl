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
  * {@code GL_APPLE_element_array}
  */
public final class GLAPPLEElementArray {
    public static final int GL_ELEMENT_ARRAY_APPLE = 0x8A0C;
    public static final int GL_ELEMENT_ARRAY_TYPE_APPLE = 0x8A0D;
    public static final int GL_ELEMENT_ARRAY_POINTER_APPLE = 0x8A0E;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_APPLE_element_array) return;
        ext.glElementPointerAPPLE = load.invoke("glElementPointerAPPLE", ofVoid(JAVA_INT, ADDRESS));
        ext.glDrawElementArrayAPPLE = load.invoke("glDrawElementArrayAPPLE", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glDrawRangeElementArrayAPPLE = load.invoke("glDrawRangeElementArrayAPPLE", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glMultiDrawElementArrayAPPLE = load.invoke("glMultiDrawElementArrayAPPLE", ofVoid(JAVA_INT, ADDRESS, ADDRESS, JAVA_INT));
        ext.glMultiDrawRangeElementArrayAPPLE = load.invoke("glMultiDrawRangeElementArrayAPPLE", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS, ADDRESS, JAVA_INT));
    }

    public static void glElementPointerAPPLE(int type, @NativeType("const void *") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glElementPointerAPPLE).invokeExact(type, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDrawElementArrayAPPLE(int mode, int first, int count) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDrawElementArrayAPPLE).invokeExact(mode, first, count);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDrawRangeElementArrayAPPLE(int mode, int start, int end, int first, int count) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDrawRangeElementArrayAPPLE).invokeExact(mode, start, end, first, count);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiDrawElementArrayAPPLE(int mode, @NativeType("const GLint *") MemorySegment first, @NativeType("const GLsizei *") MemorySegment count, int primcount) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiDrawElementArrayAPPLE).invokeExact(mode, first, count, primcount);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiDrawRangeElementArrayAPPLE(int mode, int start, int end, @NativeType("const GLint *") MemorySegment first, @NativeType("const GLsizei *") MemorySegment count, int primcount) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiDrawRangeElementArrayAPPLE).invokeExact(mode, start, end, first, count, primcount);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}

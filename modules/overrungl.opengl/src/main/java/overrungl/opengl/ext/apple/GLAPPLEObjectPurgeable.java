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
  * {@code GL_APPLE_object_purgeable}
  */
public final class GLAPPLEObjectPurgeable {
    public static final int GL_BUFFER_OBJECT_APPLE = 0x85B3;
    public static final int GL_RELEASED_APPLE = 0x8A19;
    public static final int GL_VOLATILE_APPLE = 0x8A1A;
    public static final int GL_RETAINED_APPLE = 0x8A1B;
    public static final int GL_UNDEFINED_APPLE = 0x8A1C;
    public static final int GL_PURGEABLE_APPLE = 0x8A1D;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_APPLE_object_purgeable) return;
        ext.glObjectPurgeableAPPLE = load.invoke("glObjectPurgeableAPPLE", of(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glObjectUnpurgeableAPPLE = load.invoke("glObjectUnpurgeableAPPLE", of(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glGetObjectParameterivAPPLE = load.invoke("glGetObjectParameterivAPPLE", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static int glObjectPurgeableAPPLE(int objectType, int name, int option) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glObjectPurgeableAPPLE).invokeExact(objectType, name, option);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glObjectUnpurgeableAPPLE(int objectType, int name, int option) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glObjectUnpurgeableAPPLE).invokeExact(objectType, name, option);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetObjectParameterivAPPLE(int objectType, int name, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetObjectParameterivAPPLE).invokeExact(objectType, name, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}

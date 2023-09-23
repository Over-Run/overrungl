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
package overrungl.opengl.ext.oes;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_OES_byte_coordinates}
  */
public final class GLOESByteCoordinates {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_OES_byte_coordinates) return;
        ext.glMultiTexCoord1bOES = load.invoke("glMultiTexCoord1bOES", ofVoid(JAVA_INT, JAVA_BYTE));
        ext.glMultiTexCoord1bvOES = load.invoke("glMultiTexCoord1bvOES", ofVoid(JAVA_INT, ADDRESS));
        ext.glMultiTexCoord2bOES = load.invoke("glMultiTexCoord2bOES", ofVoid(JAVA_INT, JAVA_BYTE, JAVA_BYTE));
        ext.glMultiTexCoord2bvOES = load.invoke("glMultiTexCoord2bvOES", ofVoid(JAVA_INT, ADDRESS));
        ext.glMultiTexCoord3bOES = load.invoke("glMultiTexCoord3bOES", ofVoid(JAVA_INT, JAVA_BYTE, JAVA_BYTE, JAVA_BYTE));
        ext.glMultiTexCoord3bvOES = load.invoke("glMultiTexCoord3bvOES", ofVoid(JAVA_INT, ADDRESS));
        ext.glMultiTexCoord4bOES = load.invoke("glMultiTexCoord4bOES", ofVoid(JAVA_INT, JAVA_BYTE, JAVA_BYTE, JAVA_BYTE, JAVA_BYTE));
        ext.glMultiTexCoord4bvOES = load.invoke("glMultiTexCoord4bvOES", ofVoid(JAVA_INT, ADDRESS));
        ext.glTexCoord1bOES = load.invoke("glTexCoord1bOES", ofVoid(JAVA_BYTE));
        ext.glTexCoord1bvOES = load.invoke("glTexCoord1bvOES", ofVoid(ADDRESS));
        ext.glTexCoord2bOES = load.invoke("glTexCoord2bOES", ofVoid(JAVA_BYTE, JAVA_BYTE));
        ext.glTexCoord2bvOES = load.invoke("glTexCoord2bvOES", ofVoid(ADDRESS));
        ext.glTexCoord3bOES = load.invoke("glTexCoord3bOES", ofVoid(JAVA_BYTE, JAVA_BYTE, JAVA_BYTE));
        ext.glTexCoord3bvOES = load.invoke("glTexCoord3bvOES", ofVoid(ADDRESS));
        ext.glTexCoord4bOES = load.invoke("glTexCoord4bOES", ofVoid(JAVA_BYTE, JAVA_BYTE, JAVA_BYTE, JAVA_BYTE));
        ext.glTexCoord4bvOES = load.invoke("glTexCoord4bvOES", ofVoid(ADDRESS));
        ext.glVertex2bOES = load.invoke("glVertex2bOES", ofVoid(JAVA_BYTE, JAVA_BYTE));
        ext.glVertex2bvOES = load.invoke("glVertex2bvOES", ofVoid(ADDRESS));
        ext.glVertex3bOES = load.invoke("glVertex3bOES", ofVoid(JAVA_BYTE, JAVA_BYTE, JAVA_BYTE));
        ext.glVertex3bvOES = load.invoke("glVertex3bvOES", ofVoid(ADDRESS));
        ext.glVertex4bOES = load.invoke("glVertex4bOES", ofVoid(JAVA_BYTE, JAVA_BYTE, JAVA_BYTE, JAVA_BYTE));
        ext.glVertex4bvOES = load.invoke("glVertex4bvOES", ofVoid(ADDRESS));
    }

    public static void glMultiTexCoord1bOES(int texture, byte s) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord1bOES).invokeExact(texture, s);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexCoord1bvOES(int texture, @NativeType("const GLbyte *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord1bvOES).invokeExact(texture, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexCoord2bOES(int texture, byte s, byte t) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord2bOES).invokeExact(texture, s, t);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexCoord2bvOES(int texture, @NativeType("const GLbyte *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord2bvOES).invokeExact(texture, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexCoord3bOES(int texture, byte s, byte t, byte r) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord3bOES).invokeExact(texture, s, t, r);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexCoord3bvOES(int texture, @NativeType("const GLbyte *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord3bvOES).invokeExact(texture, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexCoord4bOES(int texture, byte s, byte t, byte r, byte q) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord4bOES).invokeExact(texture, s, t, r, q);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexCoord4bvOES(int texture, @NativeType("const GLbyte *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoord4bvOES).invokeExact(texture, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord1bOES(byte s) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord1bOES).invokeExact(s);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord1bvOES(@NativeType("const GLbyte *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord1bvOES).invokeExact(coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord2bOES(byte s, byte t) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord2bOES).invokeExact(s, t);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord2bvOES(@NativeType("const GLbyte *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord2bvOES).invokeExact(coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord3bOES(byte s, byte t, byte r) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord3bOES).invokeExact(s, t, r);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord3bvOES(@NativeType("const GLbyte *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord3bvOES).invokeExact(coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord4bOES(byte s, byte t, byte r, byte q) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord4bOES).invokeExact(s, t, r, q);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexCoord4bvOES(@NativeType("const GLbyte *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexCoord4bvOES).invokeExact(coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertex2bOES(byte x, byte y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertex2bOES).invokeExact(x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertex2bvOES(@NativeType("const GLbyte *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertex2bvOES).invokeExact(coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertex3bOES(byte x, byte y, byte z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertex3bOES).invokeExact(x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertex3bvOES(@NativeType("const GLbyte *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertex3bvOES).invokeExact(coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertex4bOES(byte x, byte y, byte z, byte w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertex4bOES).invokeExact(x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertex4bvOES(@NativeType("const GLbyte *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertex4bvOES).invokeExact(coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}

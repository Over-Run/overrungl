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
 * {@code GL_ATI_vertex_streams}
 */
public final class GLATIVertexStreams {
    public static final int GL_MAX_VERTEX_STREAMS_ATI = 0x876B;
    public static final int GL_VERTEX_STREAM0_ATI = 0x876C;
    public static final int GL_VERTEX_STREAM1_ATI = 0x876D;
    public static final int GL_VERTEX_STREAM2_ATI = 0x876E;
    public static final int GL_VERTEX_STREAM3_ATI = 0x876F;
    public static final int GL_VERTEX_STREAM4_ATI = 0x8770;
    public static final int GL_VERTEX_STREAM5_ATI = 0x8771;
    public static final int GL_VERTEX_STREAM6_ATI = 0x8772;
    public static final int GL_VERTEX_STREAM7_ATI = 0x8773;
    public static final int GL_VERTEX_SOURCE_ATI = 0x8774;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ATI_vertex_streams) return;
        ext.glVertexStream1sATI = load.invoke("glVertexStream1sATI", ofVoid(JAVA_INT, JAVA_SHORT));
        ext.glVertexStream1svATI = load.invoke("glVertexStream1svATI", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexStream1iATI = load.invoke("glVertexStream1iATI", ofVoid(JAVA_INT, JAVA_INT));
        ext.glVertexStream1ivATI = load.invoke("glVertexStream1ivATI", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexStream1fATI = load.invoke("glVertexStream1fATI", ofVoid(JAVA_INT, JAVA_FLOAT));
        ext.glVertexStream1fvATI = load.invoke("glVertexStream1fvATI", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexStream1dATI = load.invoke("glVertexStream1dATI", ofVoid(JAVA_INT, JAVA_DOUBLE));
        ext.glVertexStream1dvATI = load.invoke("glVertexStream1dvATI", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexStream2sATI = load.invoke("glVertexStream2sATI", ofVoid(JAVA_INT, JAVA_SHORT, JAVA_SHORT));
        ext.glVertexStream2svATI = load.invoke("glVertexStream2svATI", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexStream2iATI = load.invoke("glVertexStream2iATI", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glVertexStream2ivATI = load.invoke("glVertexStream2ivATI", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexStream2fATI = load.invoke("glVertexStream2fATI", ofVoid(JAVA_INT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glVertexStream2fvATI = load.invoke("glVertexStream2fvATI", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexStream2dATI = load.invoke("glVertexStream2dATI", ofVoid(JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glVertexStream2dvATI = load.invoke("glVertexStream2dvATI", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexStream3sATI = load.invoke("glVertexStream3sATI", ofVoid(JAVA_INT, JAVA_SHORT, JAVA_SHORT, JAVA_SHORT));
        ext.glVertexStream3svATI = load.invoke("glVertexStream3svATI", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexStream3iATI = load.invoke("glVertexStream3iATI", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glVertexStream3ivATI = load.invoke("glVertexStream3ivATI", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexStream3fATI = load.invoke("glVertexStream3fATI", ofVoid(JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glVertexStream3fvATI = load.invoke("glVertexStream3fvATI", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexStream3dATI = load.invoke("glVertexStream3dATI", ofVoid(JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glVertexStream3dvATI = load.invoke("glVertexStream3dvATI", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexStream4sATI = load.invoke("glVertexStream4sATI", ofVoid(JAVA_INT, JAVA_SHORT, JAVA_SHORT, JAVA_SHORT, JAVA_SHORT));
        ext.glVertexStream4svATI = load.invoke("glVertexStream4svATI", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexStream4iATI = load.invoke("glVertexStream4iATI", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glVertexStream4ivATI = load.invoke("glVertexStream4ivATI", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexStream4fATI = load.invoke("glVertexStream4fATI", ofVoid(JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glVertexStream4fvATI = load.invoke("glVertexStream4fvATI", ofVoid(JAVA_INT, ADDRESS));
        ext.glVertexStream4dATI = load.invoke("glVertexStream4dATI", ofVoid(JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glVertexStream4dvATI = load.invoke("glVertexStream4dvATI", ofVoid(JAVA_INT, ADDRESS));
        ext.glNormalStream3bATI = load.invoke("glNormalStream3bATI", ofVoid(JAVA_INT, JAVA_BYTE, JAVA_BYTE, JAVA_BYTE));
        ext.glNormalStream3bvATI = load.invoke("glNormalStream3bvATI", ofVoid(JAVA_INT, ADDRESS));
        ext.glNormalStream3sATI = load.invoke("glNormalStream3sATI", ofVoid(JAVA_INT, JAVA_SHORT, JAVA_SHORT, JAVA_SHORT));
        ext.glNormalStream3svATI = load.invoke("glNormalStream3svATI", ofVoid(JAVA_INT, ADDRESS));
        ext.glNormalStream3iATI = load.invoke("glNormalStream3iATI", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glNormalStream3ivATI = load.invoke("glNormalStream3ivATI", ofVoid(JAVA_INT, ADDRESS));
        ext.glNormalStream3fATI = load.invoke("glNormalStream3fATI", ofVoid(JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glNormalStream3fvATI = load.invoke("glNormalStream3fvATI", ofVoid(JAVA_INT, ADDRESS));
        ext.glNormalStream3dATI = load.invoke("glNormalStream3dATI", ofVoid(JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glNormalStream3dvATI = load.invoke("glNormalStream3dvATI", ofVoid(JAVA_INT, ADDRESS));
        ext.glClientActiveVertexStreamATI = load.invoke("glClientActiveVertexStreamATI", ofVoid(JAVA_INT));
        ext.glVertexBlendEnviATI = load.invoke("glVertexBlendEnviATI", ofVoid(JAVA_INT, JAVA_INT));
        ext.glVertexBlendEnvfATI = load.invoke("glVertexBlendEnvfATI", ofVoid(JAVA_INT, JAVA_FLOAT));
    }

    public static void glVertexStream1sATI(int stream, short x) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream1sATI).invokeExact(stream, x);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream1svATI(int stream, @NativeType("const GLshort *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream1svATI).invokeExact(stream, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream1iATI(int stream, int x) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream1iATI).invokeExact(stream, x);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream1ivATI(int stream, @NativeType("const GLint *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream1ivATI).invokeExact(stream, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream1fATI(int stream, float x) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream1fATI).invokeExact(stream, x);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream1fvATI(int stream, @NativeType("const GLfloat *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream1fvATI).invokeExact(stream, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream1dATI(int stream, double x) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream1dATI).invokeExact(stream, x);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream1dvATI(int stream, @NativeType("const GLdouble *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream1dvATI).invokeExact(stream, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream2sATI(int stream, short x, short y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream2sATI).invokeExact(stream, x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream2svATI(int stream, @NativeType("const GLshort *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream2svATI).invokeExact(stream, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream2iATI(int stream, int x, int y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream2iATI).invokeExact(stream, x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream2ivATI(int stream, @NativeType("const GLint *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream2ivATI).invokeExact(stream, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream2fATI(int stream, float x, float y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream2fATI).invokeExact(stream, x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream2fvATI(int stream, @NativeType("const GLfloat *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream2fvATI).invokeExact(stream, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream2dATI(int stream, double x, double y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream2dATI).invokeExact(stream, x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream2dvATI(int stream, @NativeType("const GLdouble *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream2dvATI).invokeExact(stream, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream3sATI(int stream, short x, short y, short z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream3sATI).invokeExact(stream, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream3svATI(int stream, @NativeType("const GLshort *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream3svATI).invokeExact(stream, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream3iATI(int stream, int x, int y, int z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream3iATI).invokeExact(stream, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream3ivATI(int stream, @NativeType("const GLint *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream3ivATI).invokeExact(stream, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream3fATI(int stream, float x, float y, float z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream3fATI).invokeExact(stream, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream3fvATI(int stream, @NativeType("const GLfloat *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream3fvATI).invokeExact(stream, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream3dATI(int stream, double x, double y, double z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream3dATI).invokeExact(stream, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream3dvATI(int stream, @NativeType("const GLdouble *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream3dvATI).invokeExact(stream, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream4sATI(int stream, short x, short y, short z, short w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream4sATI).invokeExact(stream, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream4svATI(int stream, @NativeType("const GLshort *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream4svATI).invokeExact(stream, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream4iATI(int stream, int x, int y, int z, int w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream4iATI).invokeExact(stream, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream4ivATI(int stream, @NativeType("const GLint *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream4ivATI).invokeExact(stream, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream4fATI(int stream, float x, float y, float z, float w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream4fATI).invokeExact(stream, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream4fvATI(int stream, @NativeType("const GLfloat *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream4fvATI).invokeExact(stream, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream4dATI(int stream, double x, double y, double z, double w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream4dATI).invokeExact(stream, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexStream4dvATI(int stream, @NativeType("const GLdouble *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexStream4dvATI).invokeExact(stream, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNormalStream3bATI(int stream, byte nx, byte ny, byte nz) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNormalStream3bATI).invokeExact(stream, nx, ny, nz);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNormalStream3bvATI(int stream, @NativeType("const GLbyte *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNormalStream3bvATI).invokeExact(stream, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNormalStream3sATI(int stream, short nx, short ny, short nz) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNormalStream3sATI).invokeExact(stream, nx, ny, nz);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNormalStream3svATI(int stream, @NativeType("const GLshort *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNormalStream3svATI).invokeExact(stream, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNormalStream3iATI(int stream, int nx, int ny, int nz) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNormalStream3iATI).invokeExact(stream, nx, ny, nz);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNormalStream3ivATI(int stream, @NativeType("const GLint *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNormalStream3ivATI).invokeExact(stream, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNormalStream3fATI(int stream, float nx, float ny, float nz) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNormalStream3fATI).invokeExact(stream, nx, ny, nz);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNormalStream3fvATI(int stream, @NativeType("const GLfloat *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNormalStream3fvATI).invokeExact(stream, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNormalStream3dATI(int stream, double nx, double ny, double nz) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNormalStream3dATI).invokeExact(stream, nx, ny, nz);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNormalStream3dvATI(int stream, @NativeType("const GLdouble *") MemorySegment coords) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNormalStream3dvATI).invokeExact(stream, coords);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glClientActiveVertexStreamATI(int stream) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glClientActiveVertexStreamATI).invokeExact(stream);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexBlendEnviATI(int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexBlendEnviATI).invokeExact(pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexBlendEnvfATI(int pname, float param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexBlendEnvfATI).invokeExact(pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}

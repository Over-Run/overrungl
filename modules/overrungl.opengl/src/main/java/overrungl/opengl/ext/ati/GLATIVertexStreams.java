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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_ATI_vertex_streams}
 */
public interface GLATIVertexStreams {
    int GL_MAX_VERTEX_STREAMS_ATI = 0x876B;
    int GL_VERTEX_STREAM0_ATI = 0x876C;
    int GL_VERTEX_STREAM1_ATI = 0x876D;
    int GL_VERTEX_STREAM2_ATI = 0x876E;
    int GL_VERTEX_STREAM3_ATI = 0x876F;
    int GL_VERTEX_STREAM4_ATI = 0x8770;
    int GL_VERTEX_STREAM5_ATI = 0x8771;
    int GL_VERTEX_STREAM6_ATI = 0x8772;
    int GL_VERTEX_STREAM7_ATI = 0x8773;
    int GL_VERTEX_SOURCE_ATI = 0x8774;

    default void glVertexStream1sATI(int stream, short x) {
        throw new ContextException();
    }

    default void glVertexStream1svATI(int stream, @NativeType("const GLshort *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glVertexStream1iATI(int stream, int x) {
        throw new ContextException();
    }

    default void glVertexStream1ivATI(int stream, @NativeType("const GLint *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glVertexStream1fATI(int stream, float x) {
        throw new ContextException();
    }

    default void glVertexStream1fvATI(int stream, @NativeType("const GLfloat *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glVertexStream1dATI(int stream, double x) {
        throw new ContextException();
    }

    default void glVertexStream1dvATI(int stream, @NativeType("const GLdouble *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glVertexStream2sATI(int stream, short x, short y) {
        throw new ContextException();
    }

    default void glVertexStream2svATI(int stream, @NativeType("const GLshort *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glVertexStream2iATI(int stream, int x, int y) {
        throw new ContextException();
    }

    default void glVertexStream2ivATI(int stream, @NativeType("const GLint *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glVertexStream2fATI(int stream, float x, float y) {
        throw new ContextException();
    }

    default void glVertexStream2fvATI(int stream, @NativeType("const GLfloat *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glVertexStream2dATI(int stream, double x, double y) {
        throw new ContextException();
    }

    default void glVertexStream2dvATI(int stream, @NativeType("const GLdouble *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glVertexStream3sATI(int stream, short x, short y, short z) {
        throw new ContextException();
    }

    default void glVertexStream3svATI(int stream, @NativeType("const GLshort *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glVertexStream3iATI(int stream, int x, int y, int z) {
        throw new ContextException();
    }

    default void glVertexStream3ivATI(int stream, @NativeType("const GLint *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glVertexStream3fATI(int stream, float x, float y, float z) {
        throw new ContextException();
    }

    default void glVertexStream3fvATI(int stream, @NativeType("const GLfloat *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glVertexStream3dATI(int stream, double x, double y, double z) {
        throw new ContextException();
    }

    default void glVertexStream3dvATI(int stream, @NativeType("const GLdouble *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glVertexStream4sATI(int stream, short x, short y, short z, short w) {
        throw new ContextException();
    }

    default void glVertexStream4svATI(int stream, @NativeType("const GLshort *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glVertexStream4iATI(int stream, int x, int y, int z, int w) {
        throw new ContextException();
    }

    default void glVertexStream4ivATI(int stream, @NativeType("const GLint *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glVertexStream4fATI(int stream, float x, float y, float z, float w) {
        throw new ContextException();
    }

    default void glVertexStream4fvATI(int stream, @NativeType("const GLfloat *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glVertexStream4dATI(int stream, double x, double y, double z, double w) {
        throw new ContextException();
    }

    default void glVertexStream4dvATI(int stream, @NativeType("const GLdouble *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glNormalStream3bATI(int stream, byte nx, byte ny, byte nz) {
        throw new ContextException();
    }

    default void glNormalStream3bvATI(int stream, @NativeType("const GLbyte *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glNormalStream3sATI(int stream, short nx, short ny, short nz) {
        throw new ContextException();
    }

    default void glNormalStream3svATI(int stream, @NativeType("const GLshort *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glNormalStream3iATI(int stream, int nx, int ny, int nz) {
        throw new ContextException();
    }

    default void glNormalStream3ivATI(int stream, @NativeType("const GLint *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glNormalStream3fATI(int stream, float nx, float ny, float nz) {
        throw new ContextException();
    }

    default void glNormalStream3fvATI(int stream, @NativeType("const GLfloat *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glNormalStream3dATI(int stream, double nx, double ny, double nz) {
        throw new ContextException();
    }

    default void glNormalStream3dvATI(int stream, @NativeType("const GLdouble *") MemorySegment coords) {
        throw new ContextException();
    }

    default void glClientActiveVertexStreamATI(int stream) {
        throw new ContextException();
    }

    default void glVertexBlendEnviATI(int pname, int param) {
        throw new ContextException();
    }

    default void glVertexBlendEnvfATI(int pname, float param) {
        throw new ContextException();
    }

}

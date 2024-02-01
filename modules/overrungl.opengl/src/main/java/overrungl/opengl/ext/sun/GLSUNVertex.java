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
package overrungl.opengl.ext.sun;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_SUN_vertex}
 */
public interface GLSUNVertex {

    default void glColor4ubVertex2fSUN(byte r, byte g, byte b, byte a, float x, float y) {
        throw new ContextException();
    }

    default void glColor4ubVertex2fvSUN(@NativeType("const GLubyte *") MemorySegment c, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glColor4ubVertex3fSUN(byte r, byte g, byte b, byte a, float x, float y, float z) {
        throw new ContextException();
    }

    default void glColor4ubVertex3fvSUN(@NativeType("const GLubyte *") MemorySegment c, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glColor3fVertex3fSUN(float r, float g, float b, float x, float y, float z) {
        throw new ContextException();
    }

    default void glColor3fVertex3fvSUN(@NativeType("const GLfloat *") MemorySegment c, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glNormal3fVertex3fSUN(float nx, float ny, float nz, float x, float y, float z) {
        throw new ContextException();
    }

    default void glNormal3fVertex3fvSUN(@NativeType("const GLfloat *") MemorySegment n, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glColor4fNormal3fVertex3fSUN(float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z) {
        throw new ContextException();
    }

    default void glColor4fNormal3fVertex3fvSUN(@NativeType("const GLfloat *") MemorySegment c, @NativeType("const GLfloat *") MemorySegment n, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glTexCoord2fVertex3fSUN(float s, float t, float x, float y, float z) {
        throw new ContextException();
    }

    default void glTexCoord2fVertex3fvSUN(@NativeType("const GLfloat *") MemorySegment tc, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glTexCoord4fVertex4fSUN(float s, float t, float p, float q, float x, float y, float z, float w) {
        throw new ContextException();
    }

    default void glTexCoord4fVertex4fvSUN(@NativeType("const GLfloat *") MemorySegment tc, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glTexCoord2fColor4ubVertex3fSUN(float s, float t, byte r, byte g, byte b, byte a, float x, float y, float z) {
        throw new ContextException();
    }

    default void glTexCoord2fColor4ubVertex3fvSUN(@NativeType("const GLfloat *") MemorySegment tc, @NativeType("const GLubyte *") MemorySegment c, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glTexCoord2fColor3fVertex3fSUN(float s, float t, float r, float g, float b, float x, float y, float z) {
        throw new ContextException();
    }

    default void glTexCoord2fColor3fVertex3fvSUN(@NativeType("const GLfloat *") MemorySegment tc, @NativeType("const GLfloat *") MemorySegment c, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glTexCoord2fNormal3fVertex3fSUN(float s, float t, float nx, float ny, float nz, float x, float y, float z) {
        throw new ContextException();
    }

    default void glTexCoord2fNormal3fVertex3fvSUN(@NativeType("const GLfloat *") MemorySegment tc, @NativeType("const GLfloat *") MemorySegment n, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glTexCoord2fColor4fNormal3fVertex3fSUN(float s, float t, float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z) {
        throw new ContextException();
    }

    default void glTexCoord2fColor4fNormal3fVertex3fvSUN(@NativeType("const GLfloat *") MemorySegment tc, @NativeType("const GLfloat *") MemorySegment c, @NativeType("const GLfloat *") MemorySegment n, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glTexCoord4fColor4fNormal3fVertex4fSUN(float s, float t, float p, float q, float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z, float w) {
        throw new ContextException();
    }

    default void glTexCoord4fColor4fNormal3fVertex4fvSUN(@NativeType("const GLfloat *") MemorySegment tc, @NativeType("const GLfloat *") MemorySegment c, @NativeType("const GLfloat *") MemorySegment n, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glReplacementCodeuiVertex3fSUN(int rc, float x, float y, float z) {
        throw new ContextException();
    }

    default void glReplacementCodeuiVertex3fvSUN(@NativeType("const GLuint *") MemorySegment rc, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glReplacementCodeuiColor4ubVertex3fSUN(int rc, byte r, byte g, byte b, byte a, float x, float y, float z) {
        throw new ContextException();
    }

    default void glReplacementCodeuiColor4ubVertex3fvSUN(@NativeType("const GLuint *") MemorySegment rc, @NativeType("const GLubyte *") MemorySegment c, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glReplacementCodeuiColor3fVertex3fSUN(int rc, float r, float g, float b, float x, float y, float z) {
        throw new ContextException();
    }

    default void glReplacementCodeuiColor3fVertex3fvSUN(@NativeType("const GLuint *") MemorySegment rc, @NativeType("const GLfloat *") MemorySegment c, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glReplacementCodeuiNormal3fVertex3fSUN(int rc, float nx, float ny, float nz, float x, float y, float z) {
        throw new ContextException();
    }

    default void glReplacementCodeuiNormal3fVertex3fvSUN(@NativeType("const GLuint *") MemorySegment rc, @NativeType("const GLfloat *") MemorySegment n, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glReplacementCodeuiColor4fNormal3fVertex3fSUN(int rc, float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z) {
        throw new ContextException();
    }

    default void glReplacementCodeuiColor4fNormal3fVertex3fvSUN(@NativeType("const GLuint *") MemorySegment rc, @NativeType("const GLfloat *") MemorySegment c, @NativeType("const GLfloat *") MemorySegment n, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glReplacementCodeuiTexCoord2fVertex3fSUN(int rc, float s, float t, float x, float y, float z) {
        throw new ContextException();
    }

    default void glReplacementCodeuiTexCoord2fVertex3fvSUN(@NativeType("const GLuint *") MemorySegment rc, @NativeType("const GLfloat *") MemorySegment tc, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN(int rc, float s, float t, float nx, float ny, float nz, float x, float y, float z) {
        throw new ContextException();
    }

    default void glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN(@NativeType("const GLuint *") MemorySegment rc, @NativeType("const GLfloat *") MemorySegment tc, @NativeType("const GLfloat *") MemorySegment n, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN(int rc, float s, float t, float r, float g, float b, float a, float nx, float ny, float nz, float x, float y, float z) {
        throw new ContextException();
    }

    default void glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN(@NativeType("const GLuint *") MemorySegment rc, @NativeType("const GLfloat *") MemorySegment tc, @NativeType("const GLfloat *") MemorySegment c, @NativeType("const GLfloat *") MemorySegment n, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

}

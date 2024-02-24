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
package overrungl.opengl.ext.ext;
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_EXT_direct_state_access}
 */
public interface GLEXTDirectStateAccess extends overrun.marshal.DirectAccess {
    int GL_PROGRAM_MATRIX_EXT = 0x8E2D;
    int GL_TRANSPOSE_PROGRAM_MATRIX_EXT = 0x8E2E;
    int GL_PROGRAM_MATRIX_STACK_DEPTH_EXT = 0x8E2F;

    default void glMatrixLoadfEXT(int mode, @NativeType("const GLfloat *") MemorySegment m) {
        throw new ContextException();
    }

    default void glMatrixLoaddEXT(int mode, @NativeType("const GLdouble *") MemorySegment m) {
        throw new ContextException();
    }

    default void glMatrixMultfEXT(int mode, @NativeType("const GLfloat *") MemorySegment m) {
        throw new ContextException();
    }

    default void glMatrixMultdEXT(int mode, @NativeType("const GLdouble *") MemorySegment m) {
        throw new ContextException();
    }

    default void glMatrixLoadIdentityEXT(int mode) {
        throw new ContextException();
    }

    default void glMatrixRotatefEXT(int mode, float angle, float x, float y, float z) {
        throw new ContextException();
    }

    default void glMatrixRotatedEXT(int mode, double angle, double x, double y, double z) {
        throw new ContextException();
    }

    default void glMatrixScalefEXT(int mode, float x, float y, float z) {
        throw new ContextException();
    }

    default void glMatrixScaledEXT(int mode, double x, double y, double z) {
        throw new ContextException();
    }

    default void glMatrixTranslatefEXT(int mode, float x, float y, float z) {
        throw new ContextException();
    }

    default void glMatrixTranslatedEXT(int mode, double x, double y, double z) {
        throw new ContextException();
    }

    default void glMatrixFrustumEXT(int mode, double left, double right, double bottom, double top, double zNear, double zFar) {
        throw new ContextException();
    }

    default void glMatrixOrthoEXT(int mode, double left, double right, double bottom, double top, double zNear, double zFar) {
        throw new ContextException();
    }

    default void glMatrixPopEXT(int mode) {
        throw new ContextException();
    }

    default void glMatrixPushEXT(int mode) {
        throw new ContextException();
    }

    default void glClientAttribDefaultEXT(int mask) {
        throw new ContextException();
    }

    default void glPushClientAttribDefaultEXT(int mask) {
        throw new ContextException();
    }

    default void glTextureParameterfEXT(int texture, int target, int pname, float param) {
        throw new ContextException();
    }

    default void glTextureParameterfvEXT(int texture, int target, int pname, @NativeType("const GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glTextureParameteriEXT(int texture, int target, int pname, int param) {
        throw new ContextException();
    }

    default void glTextureParameterivEXT(int texture, int target, int pname, @NativeType("const GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        throw new ContextException();
    }

    default void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        throw new ContextException();
    }

    default void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        throw new ContextException();
    }

    default void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        throw new ContextException();
    }

    default void glCopyTextureImage1DEXT(int texture, int target, int level, int internalformat, int x, int y, int width, int border) {
        throw new ContextException();
    }

    default void glCopyTextureImage2DEXT(int texture, int target, int level, int internalformat, int x, int y, int width, int height, int border) {
        throw new ContextException();
    }

    default void glCopyTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int x, int y, int width) {
        throw new ContextException();
    }

    default void glCopyTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        throw new ContextException();
    }

    default void glGetTextureImageEXT(int texture, int target, int level, int format, int type, @NativeType("void *") MemorySegment pixels) {
        throw new ContextException();
    }

    default void glGetTextureParameterfvEXT(int texture, int target, int pname, @NativeType("GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetTextureParameterivEXT(int texture, int target, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetTextureLevelParameterfvEXT(int texture, int target, int level, int pname, @NativeType("GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetTextureLevelParameterivEXT(int texture, int target, int level, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        throw new ContextException();
    }

    default void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        throw new ContextException();
    }

    default void glCopyTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
        throw new ContextException();
    }

    default void glBindMultiTextureEXT(int texunit, int target, int texture) {
        throw new ContextException();
    }

    default void glMultiTexCoordPointerEXT(int texunit, int size, int type, int stride, @NativeType("const void *") MemorySegment pointer) {
        throw new ContextException();
    }

    default void glMultiTexEnvfEXT(int texunit, int target, int pname, float param) {
        throw new ContextException();
    }

    default void glMultiTexEnvfvEXT(int texunit, int target, int pname, @NativeType("const GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glMultiTexEnviEXT(int texunit, int target, int pname, int param) {
        throw new ContextException();
    }

    default void glMultiTexEnvivEXT(int texunit, int target, int pname, @NativeType("const GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glMultiTexGendEXT(int texunit, int coord, int pname, double param) {
        throw new ContextException();
    }

    default void glMultiTexGendvEXT(int texunit, int coord, int pname, @NativeType("const GLdouble *") MemorySegment params) {
        throw new ContextException();
    }

    default void glMultiTexGenfEXT(int texunit, int coord, int pname, float param) {
        throw new ContextException();
    }

    default void glMultiTexGenfvEXT(int texunit, int coord, int pname, @NativeType("const GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glMultiTexGeniEXT(int texunit, int coord, int pname, int param) {
        throw new ContextException();
    }

    default void glMultiTexGenivEXT(int texunit, int coord, int pname, @NativeType("const GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetMultiTexEnvfvEXT(int texunit, int target, int pname, @NativeType("GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetMultiTexEnvivEXT(int texunit, int target, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetMultiTexGendvEXT(int texunit, int coord, int pname, @NativeType("GLdouble *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetMultiTexGenfvEXT(int texunit, int coord, int pname, @NativeType("GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetMultiTexGenivEXT(int texunit, int coord, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glMultiTexParameteriEXT(int texunit, int target, int pname, int param) {
        throw new ContextException();
    }

    default void glMultiTexParameterivEXT(int texunit, int target, int pname, @NativeType("const GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glMultiTexParameterfEXT(int texunit, int target, int pname, float param) {
        throw new ContextException();
    }

    default void glMultiTexParameterfvEXT(int texunit, int target, int pname, @NativeType("const GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        throw new ContextException();
    }

    default void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        throw new ContextException();
    }

    default void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        throw new ContextException();
    }

    default void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        throw new ContextException();
    }

    default void glCopyMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int x, int y, int width, int border) {
        throw new ContextException();
    }

    default void glCopyMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int x, int y, int width, int height, int border) {
        throw new ContextException();
    }

    default void glCopyMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int x, int y, int width) {
        throw new ContextException();
    }

    default void glCopyMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        throw new ContextException();
    }

    default void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, @NativeType("void *") MemorySegment pixels) {
        throw new ContextException();
    }

    default void glGetMultiTexParameterfvEXT(int texunit, int target, int pname, @NativeType("GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetMultiTexParameterivEXT(int texunit, int target, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetMultiTexLevelParameterfvEXT(int texunit, int target, int level, int pname, @NativeType("GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetMultiTexLevelParameterivEXT(int texunit, int target, int level, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        throw new ContextException();
    }

    default void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        throw new ContextException();
    }

    default void glCopyMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
        throw new ContextException();
    }

    default void glEnableClientStateIndexedEXT(int array, int index) {
        throw new ContextException();
    }

    default void glDisableClientStateIndexedEXT(int array, int index) {
        throw new ContextException();
    }

    default void glGetFloatIndexedvEXT(int target, int index, @NativeType("GLfloat *") MemorySegment data) {
        throw new ContextException();
    }

    default void glGetDoubleIndexedvEXT(int target, int index, @NativeType("GLdouble *") MemorySegment data) {
        throw new ContextException();
    }

    default void glGetPointerIndexedvEXT(int target, int index, @NativeType("void **") MemorySegment data) {
        throw new ContextException();
    }

    default void glEnableIndexedEXT(int target, int index) {
        throw new ContextException();
    }

    default void glDisableIndexedEXT(int target, int index) {
        throw new ContextException();
    }

    default boolean glIsEnabledIndexedEXT(int target, int index) {
        throw new ContextException();
    }

    default void glGetIntegerIndexedvEXT(int target, int index, @NativeType("GLint *") MemorySegment data) {
        throw new ContextException();
    }

    default void glGetBooleanIndexedvEXT(int target, int index, @NativeType("GLboolean *") MemorySegment data) {
        throw new ContextException();
    }

    default void glCompressedTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, @NativeType("const void *") MemorySegment bits) {
        throw new ContextException();
    }

    default void glCompressedTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int imageSize, @NativeType("const void *") MemorySegment bits) {
        throw new ContextException();
    }

    default void glCompressedTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int imageSize, @NativeType("const void *") MemorySegment bits) {
        throw new ContextException();
    }

    default void glCompressedTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, @NativeType("const void *") MemorySegment bits) {
        throw new ContextException();
    }

    default void glCompressedTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, @NativeType("const void *") MemorySegment bits) {
        throw new ContextException();
    }

    default void glCompressedTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int imageSize, @NativeType("const void *") MemorySegment bits) {
        throw new ContextException();
    }

    default void glGetCompressedTextureImageEXT(int texture, int target, int lod, @NativeType("void *") MemorySegment img) {
        throw new ContextException();
    }

    default void glCompressedMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, @NativeType("const void *") MemorySegment bits) {
        throw new ContextException();
    }

    default void glCompressedMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int imageSize, @NativeType("const void *") MemorySegment bits) {
        throw new ContextException();
    }

    default void glCompressedMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int imageSize, @NativeType("const void *") MemorySegment bits) {
        throw new ContextException();
    }

    default void glCompressedMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, @NativeType("const void *") MemorySegment bits) {
        throw new ContextException();
    }

    default void glCompressedMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, @NativeType("const void *") MemorySegment bits) {
        throw new ContextException();
    }

    default void glCompressedMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int imageSize, @NativeType("const void *") MemorySegment bits) {
        throw new ContextException();
    }

    default void glGetCompressedMultiTexImageEXT(int texunit, int target, int lod, @NativeType("void *") MemorySegment img) {
        throw new ContextException();
    }

    default void glMatrixLoadTransposefEXT(int mode, @NativeType("const GLfloat *") MemorySegment m) {
        throw new ContextException();
    }

    default void glMatrixLoadTransposedEXT(int mode, @NativeType("const GLdouble *") MemorySegment m) {
        throw new ContextException();
    }

    default void glMatrixMultTransposefEXT(int mode, @NativeType("const GLfloat *") MemorySegment m) {
        throw new ContextException();
    }

    default void glMatrixMultTransposedEXT(int mode, @NativeType("const GLdouble *") MemorySegment m) {
        throw new ContextException();
    }

    default void glNamedBufferDataEXT(int buffer, long size, @NativeType("const void *") MemorySegment data, int usage) {
        throw new ContextException();
    }

    default void glNamedBufferSubDataEXT(int buffer, long offset, long size, @NativeType("const void *") MemorySegment data) {
        throw new ContextException();
    }

    @NativeType("void *") default MemorySegment glMapNamedBufferEXT(int buffer, int access) {
        throw new ContextException();
    }

    default boolean glUnmapNamedBufferEXT(int buffer) {
        throw new ContextException();
    }

    default void glGetNamedBufferParameterivEXT(int buffer, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetNamedBufferPointervEXT(int buffer, int pname, @NativeType("void **") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetNamedBufferSubDataEXT(int buffer, long offset, long size, @NativeType("void *") MemorySegment data) {
        throw new ContextException();
    }

    default void glProgramUniform1fEXT(int program, int location, float v0) {
        throw new ContextException();
    }

    default void glProgramUniform2fEXT(int program, int location, float v0, float v1) {
        throw new ContextException();
    }

    default void glProgramUniform3fEXT(int program, int location, float v0, float v1, float v2) {
        throw new ContextException();
    }

    default void glProgramUniform4fEXT(int program, int location, float v0, float v1, float v2, float v3) {
        throw new ContextException();
    }

    default void glProgramUniform1iEXT(int program, int location, int v0) {
        throw new ContextException();
    }

    default void glProgramUniform2iEXT(int program, int location, int v0, int v1) {
        throw new ContextException();
    }

    default void glProgramUniform3iEXT(int program, int location, int v0, int v1, int v2) {
        throw new ContextException();
    }

    default void glProgramUniform4iEXT(int program, int location, int v0, int v1, int v2, int v3) {
        throw new ContextException();
    }

    default void glProgramUniform1fvEXT(int program, int location, int count, @NativeType("const GLfloat *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniform2fvEXT(int program, int location, int count, @NativeType("const GLfloat *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniform3fvEXT(int program, int location, int count, @NativeType("const GLfloat *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniform4fvEXT(int program, int location, int count, @NativeType("const GLfloat *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniform1ivEXT(int program, int location, int count, @NativeType("const GLint *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniform2ivEXT(int program, int location, int count, @NativeType("const GLint *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniform3ivEXT(int program, int location, int count, @NativeType("const GLint *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniform4ivEXT(int program, int location, int count, @NativeType("const GLint *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniformMatrix2fvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLfloat *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniformMatrix3fvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLfloat *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniformMatrix4fvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLfloat *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniformMatrix2x3fvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLfloat *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniformMatrix3x2fvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLfloat *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniformMatrix2x4fvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLfloat *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniformMatrix4x2fvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLfloat *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniformMatrix3x4fvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLfloat *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniformMatrix4x3fvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLfloat *") MemorySegment value) {
        throw new ContextException();
    }

    default void glTextureBufferEXT(int texture, int target, int internalformat, int buffer) {
        throw new ContextException();
    }

    default void glMultiTexBufferEXT(int texunit, int target, int internalformat, int buffer) {
        throw new ContextException();
    }

    default void glTextureParameterIivEXT(int texture, int target, int pname, @NativeType("const GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glTextureParameterIuivEXT(int texture, int target, int pname, @NativeType("const GLuint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetTextureParameterIivEXT(int texture, int target, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetTextureParameterIuivEXT(int texture, int target, int pname, @NativeType("GLuint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glMultiTexParameterIivEXT(int texunit, int target, int pname, @NativeType("const GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glMultiTexParameterIuivEXT(int texunit, int target, int pname, @NativeType("const GLuint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetMultiTexParameterIivEXT(int texunit, int target, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetMultiTexParameterIuivEXT(int texunit, int target, int pname, @NativeType("GLuint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glProgramUniform1uiEXT(int program, int location, int v0) {
        throw new ContextException();
    }

    default void glProgramUniform2uiEXT(int program, int location, int v0, int v1) {
        throw new ContextException();
    }

    default void glProgramUniform3uiEXT(int program, int location, int v0, int v1, int v2) {
        throw new ContextException();
    }

    default void glProgramUniform4uiEXT(int program, int location, int v0, int v1, int v2, int v3) {
        throw new ContextException();
    }

    default void glProgramUniform1uivEXT(int program, int location, int count, @NativeType("const GLuint *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniform2uivEXT(int program, int location, int count, @NativeType("const GLuint *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniform3uivEXT(int program, int location, int count, @NativeType("const GLuint *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniform4uivEXT(int program, int location, int count, @NativeType("const GLuint *") MemorySegment value) {
        throw new ContextException();
    }

    default void glNamedProgramLocalParameters4fvEXT(int program, int target, int index, int count, @NativeType("const GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glNamedProgramLocalParameterI4iEXT(int program, int target, int index, int x, int y, int z, int w) {
        throw new ContextException();
    }

    default void glNamedProgramLocalParameterI4ivEXT(int program, int target, int index, @NativeType("const GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glNamedProgramLocalParametersI4ivEXT(int program, int target, int index, int count, @NativeType("const GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glNamedProgramLocalParameterI4uiEXT(int program, int target, int index, int x, int y, int z, int w) {
        throw new ContextException();
    }

    default void glNamedProgramLocalParameterI4uivEXT(int program, int target, int index, @NativeType("const GLuint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glNamedProgramLocalParametersI4uivEXT(int program, int target, int index, int count, @NativeType("const GLuint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetNamedProgramLocalParameterIivEXT(int program, int target, int index, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetNamedProgramLocalParameterIuivEXT(int program, int target, int index, @NativeType("GLuint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glEnableClientStateiEXT(int array, int index) {
        throw new ContextException();
    }

    default void glDisableClientStateiEXT(int array, int index) {
        throw new ContextException();
    }

    default void glGetFloati_vEXT(int pname, int index, @NativeType("GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetDoublei_vEXT(int pname, int index, @NativeType("GLdouble *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetPointeri_vEXT(int pname, int index, @NativeType("void **") MemorySegment params) {
        throw new ContextException();
    }

    default void glNamedProgramStringEXT(int program, int target, int format, int len, @NativeType("const void *") MemorySegment string) {
        throw new ContextException();
    }

    default void glNamedProgramLocalParameter4dEXT(int program, int target, int index, double x, double y, double z, double w) {
        throw new ContextException();
    }

    default void glNamedProgramLocalParameter4dvEXT(int program, int target, int index, @NativeType("const GLdouble *") MemorySegment params) {
        throw new ContextException();
    }

    default void glNamedProgramLocalParameter4fEXT(int program, int target, int index, float x, float y, float z, float w) {
        throw new ContextException();
    }

    default void glNamedProgramLocalParameter4fvEXT(int program, int target, int index, @NativeType("const GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetNamedProgramLocalParameterdvEXT(int program, int target, int index, @NativeType("GLdouble *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetNamedProgramLocalParameterfvEXT(int program, int target, int index, @NativeType("GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetNamedProgramivEXT(int program, int target, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetNamedProgramStringEXT(int program, int target, int pname, @NativeType("void *") MemorySegment string) {
        throw new ContextException();
    }

    default void glNamedRenderbufferStorageEXT(int renderbuffer, int internalformat, int width, int height) {
        throw new ContextException();
    }

    default void glGetNamedRenderbufferParameterivEXT(int renderbuffer, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glNamedRenderbufferStorageMultisampleEXT(int renderbuffer, int samples, int internalformat, int width, int height) {
        throw new ContextException();
    }

    default void glNamedRenderbufferStorageMultisampleCoverageEXT(int renderbuffer, int coverageSamples, int colorSamples, int internalformat, int width, int height) {
        throw new ContextException();
    }

    default int glCheckNamedFramebufferStatusEXT(int framebuffer, int target) {
        throw new ContextException();
    }

    default void glNamedFramebufferTexture1DEXT(int framebuffer, int attachment, int textarget, int texture, int level) {
        throw new ContextException();
    }

    default void glNamedFramebufferTexture2DEXT(int framebuffer, int attachment, int textarget, int texture, int level) {
        throw new ContextException();
    }

    default void glNamedFramebufferTexture3DEXT(int framebuffer, int attachment, int textarget, int texture, int level, int zoffset) {
        throw new ContextException();
    }

    default void glNamedFramebufferRenderbufferEXT(int framebuffer, int attachment, int renderbuffertarget, int renderbuffer) {
        throw new ContextException();
    }

    default void glGetNamedFramebufferAttachmentParameterivEXT(int framebuffer, int attachment, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGenerateTextureMipmapEXT(int texture, int target) {
        throw new ContextException();
    }

    default void glGenerateMultiTexMipmapEXT(int texunit, int target) {
        throw new ContextException();
    }

    default void glFramebufferDrawBufferEXT(int framebuffer, int mode) {
        throw new ContextException();
    }

    default void glFramebufferDrawBuffersEXT(int framebuffer, int n, @NativeType("const GLenum *") MemorySegment bufs) {
        throw new ContextException();
    }

    default void glFramebufferReadBufferEXT(int framebuffer, int mode) {
        throw new ContextException();
    }

    default void glGetFramebufferParameterivEXT(int framebuffer, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glNamedCopyBufferSubDataEXT(int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size) {
        throw new ContextException();
    }

    default void glNamedFramebufferTextureEXT(int framebuffer, int attachment, int texture, int level) {
        throw new ContextException();
    }

    default void glNamedFramebufferTextureLayerEXT(int framebuffer, int attachment, int texture, int level, int layer) {
        throw new ContextException();
    }

    default void glNamedFramebufferTextureFaceEXT(int framebuffer, int attachment, int texture, int level, int face) {
        throw new ContextException();
    }

    default void glTextureRenderbufferEXT(int texture, int target, int renderbuffer) {
        throw new ContextException();
    }

    default void glMultiTexRenderbufferEXT(int texunit, int target, int renderbuffer) {
        throw new ContextException();
    }

    default void glVertexArrayVertexOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset) {
        throw new ContextException();
    }

    default void glVertexArrayColorOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset) {
        throw new ContextException();
    }

    default void glVertexArrayEdgeFlagOffsetEXT(int vaobj, int buffer, int stride, long offset) {
        throw new ContextException();
    }

    default void glVertexArrayIndexOffsetEXT(int vaobj, int buffer, int type, int stride, long offset) {
        throw new ContextException();
    }

    default void glVertexArrayNormalOffsetEXT(int vaobj, int buffer, int type, int stride, long offset) {
        throw new ContextException();
    }

    default void glVertexArrayTexCoordOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset) {
        throw new ContextException();
    }

    default void glVertexArrayMultiTexCoordOffsetEXT(int vaobj, int buffer, int texunit, int size, int type, int stride, long offset) {
        throw new ContextException();
    }

    default void glVertexArrayFogCoordOffsetEXT(int vaobj, int buffer, int type, int stride, long offset) {
        throw new ContextException();
    }

    default void glVertexArraySecondaryColorOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset) {
        throw new ContextException();
    }

    default void glVertexArrayVertexAttribOffsetEXT(int vaobj, int buffer, int index, int size, int type, boolean normalized, int stride, long offset) {
        throw new ContextException();
    }

    default void glVertexArrayVertexAttribIOffsetEXT(int vaobj, int buffer, int index, int size, int type, int stride, long offset) {
        throw new ContextException();
    }

    default void glEnableVertexArrayEXT(int vaobj, int array) {
        throw new ContextException();
    }

    default void glDisableVertexArrayEXT(int vaobj, int array) {
        throw new ContextException();
    }

    default void glEnableVertexArrayAttribEXT(int vaobj, int index) {
        throw new ContextException();
    }

    default void glDisableVertexArrayAttribEXT(int vaobj, int index) {
        throw new ContextException();
    }

    default void glGetVertexArrayIntegervEXT(int vaobj, int pname, @NativeType("GLint *") MemorySegment param) {
        throw new ContextException();
    }

    default void glGetVertexArrayPointervEXT(int vaobj, int pname, @NativeType("void **") MemorySegment param) {
        throw new ContextException();
    }

    default void glGetVertexArrayIntegeri_vEXT(int vaobj, int index, int pname, @NativeType("GLint *") MemorySegment param) {
        throw new ContextException();
    }

    default void glGetVertexArrayPointeri_vEXT(int vaobj, int index, int pname, @NativeType("void **") MemorySegment param) {
        throw new ContextException();
    }

    default void glMapNamedBufferRangeEXT(int buffer, long offset, long length, int access) {
        throw new ContextException();
    }

    default void glFlushMappedNamedBufferRangeEXT(int buffer, long offset, long length) {
        throw new ContextException();
    }

    default void glNamedBufferStorageEXT(int buffer, long size, @NativeType("const void *") MemorySegment data, int flags) {
        throw new ContextException();
    }

    default void glClearNamedBufferDataEXT(int buffer, int internalformat, int format, int type, @NativeType("const void *") MemorySegment data) {
        throw new ContextException();
    }

    default void glClearNamedBufferSubDataEXT(int buffer, int internalformat, long offset, long size, int format, int type, @NativeType("const void *") MemorySegment data) {
        throw new ContextException();
    }

    default void glNamedFramebufferParameteriEXT(int framebuffer, int pname, int param) {
        throw new ContextException();
    }

    default void glGetNamedFramebufferParameterivEXT(int framebuffer, int pname, @NativeType("GLint *") MemorySegment params) {
        throw new ContextException();
    }

    default void glProgramUniform1dEXT(int program, int location, double x) {
        throw new ContextException();
    }

    default void glProgramUniform2dEXT(int program, int location, double x, double y) {
        throw new ContextException();
    }

    default void glProgramUniform3dEXT(int program, int location, double x, double y, double z) {
        throw new ContextException();
    }

    default void glProgramUniform4dEXT(int program, int location, double x, double y, double z, double w) {
        throw new ContextException();
    }

    default void glProgramUniform1dvEXT(int program, int location, int count, @NativeType("const GLdouble *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniform2dvEXT(int program, int location, int count, @NativeType("const GLdouble *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniform3dvEXT(int program, int location, int count, @NativeType("const GLdouble *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniform4dvEXT(int program, int location, int count, @NativeType("const GLdouble *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniformMatrix2dvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLdouble *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniformMatrix3dvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLdouble *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniformMatrix4dvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLdouble *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniformMatrix2x3dvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLdouble *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniformMatrix2x4dvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLdouble *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniformMatrix3x2dvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLdouble *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniformMatrix3x4dvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLdouble *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniformMatrix4x2dvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLdouble *") MemorySegment value) {
        throw new ContextException();
    }

    default void glProgramUniformMatrix4x3dvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLdouble *") MemorySegment value) {
        throw new ContextException();
    }

    default void glTextureBufferRangeEXT(int texture, int target, int internalformat, int buffer, long offset, long size) {
        throw new ContextException();
    }

    default void glTextureStorage1DEXT(int texture, int target, int levels, int internalformat, int width) {
        throw new ContextException();
    }

    default void glTextureStorage2DEXT(int texture, int target, int levels, int internalformat, int width, int height) {
        throw new ContextException();
    }

    default void glTextureStorage3DEXT(int texture, int target, int levels, int internalformat, int width, int height, int depth) {
        throw new ContextException();
    }

    default void glTextureStorage2DMultisampleEXT(int texture, int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
        throw new ContextException();
    }

    default void glTextureStorage3DMultisampleEXT(int texture, int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
        throw new ContextException();
    }

    default void glVertexArrayBindVertexBufferEXT(int vaobj, int bindingindex, int buffer, long offset, int stride) {
        throw new ContextException();
    }

    default void glVertexArrayVertexAttribFormatEXT(int vaobj, int attribindex, int size, int type, boolean normalized, int relativeoffset) {
        throw new ContextException();
    }

    default void glVertexArrayVertexAttribIFormatEXT(int vaobj, int attribindex, int size, int type, int relativeoffset) {
        throw new ContextException();
    }

    default void glVertexArrayVertexAttribLFormatEXT(int vaobj, int attribindex, int size, int type, int relativeoffset) {
        throw new ContextException();
    }

    default void glVertexArrayVertexAttribBindingEXT(int vaobj, int attribindex, int bindingindex) {
        throw new ContextException();
    }

    default void glVertexArrayVertexBindingDivisorEXT(int vaobj, int bindingindex, int divisor) {
        throw new ContextException();
    }

    default void glVertexArrayVertexAttribLOffsetEXT(int vaobj, int buffer, int index, int size, int type, int stride, long offset) {
        throw new ContextException();
    }

    default void glTexturePageCommitmentEXT(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, boolean commit) {
        throw new ContextException();
    }

    default void glVertexArrayVertexAttribDivisorEXT(int vaobj, int index, int divisor) {
        throw new ContextException();
    }

}

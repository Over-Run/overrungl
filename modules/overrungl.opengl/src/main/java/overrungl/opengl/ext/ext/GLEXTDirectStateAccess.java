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
package overrungl.opengl.ext.ext;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
 * {@code GL_EXT_direct_state_access}
 */
public final class GLEXTDirectStateAccess {
    public static final int GL_PROGRAM_MATRIX_EXT = 0x8E2D;
    public static final int GL_TRANSPOSE_PROGRAM_MATRIX_EXT = 0x8E2E;
    public static final int GL_PROGRAM_MATRIX_STACK_DEPTH_EXT = 0x8E2F;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_EXT_direct_state_access) return;
        ext.glMatrixLoadfEXT = load.invoke("glMatrixLoadfEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glMatrixLoaddEXT = load.invoke("glMatrixLoaddEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glMatrixMultfEXT = load.invoke("glMatrixMultfEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glMatrixMultdEXT = load.invoke("glMatrixMultdEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glMatrixLoadIdentityEXT = load.invoke("glMatrixLoadIdentityEXT", ofVoid(JAVA_INT));
        ext.glMatrixRotatefEXT = load.invoke("glMatrixRotatefEXT", ofVoid(JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glMatrixRotatedEXT = load.invoke("glMatrixRotatedEXT", ofVoid(JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glMatrixScalefEXT = load.invoke("glMatrixScalefEXT", ofVoid(JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glMatrixScaledEXT = load.invoke("glMatrixScaledEXT", ofVoid(JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glMatrixTranslatefEXT = load.invoke("glMatrixTranslatefEXT", ofVoid(JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glMatrixTranslatedEXT = load.invoke("glMatrixTranslatedEXT", ofVoid(JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glMatrixFrustumEXT = load.invoke("glMatrixFrustumEXT", ofVoid(JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glMatrixOrthoEXT = load.invoke("glMatrixOrthoEXT", ofVoid(JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glMatrixPopEXT = load.invoke("glMatrixPopEXT", ofVoid(JAVA_INT));
        ext.glMatrixPushEXT = load.invoke("glMatrixPushEXT", ofVoid(JAVA_INT));
        ext.glClientAttribDefaultEXT = load.invoke("glClientAttribDefaultEXT", ofVoid(JAVA_INT));
        ext.glPushClientAttribDefaultEXT = load.invoke("glPushClientAttribDefaultEXT", ofVoid(JAVA_INT));
        ext.glTextureParameterfEXT = load.invoke("glTextureParameterfEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_FLOAT));
        ext.glTextureParameterfvEXT = load.invoke("glTextureParameterfvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glTextureParameteriEXT = load.invoke("glTextureParameteriEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glTextureParameterivEXT = load.invoke("glTextureParameterivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glTextureImage1DEXT = load.invoke("glTextureImage1DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glTextureImage2DEXT = load.invoke("glTextureImage2DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glTextureSubImage1DEXT = load.invoke("glTextureSubImage1DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glTextureSubImage2DEXT = load.invoke("glTextureSubImage2DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glCopyTextureImage1DEXT = load.invoke("glCopyTextureImage1DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glCopyTextureImage2DEXT = load.invoke("glCopyTextureImage2DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glCopyTextureSubImage1DEXT = load.invoke("glCopyTextureSubImage1DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glCopyTextureSubImage2DEXT = load.invoke("glCopyTextureSubImage2DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glGetTextureImageEXT = load.invoke("glGetTextureImageEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetTextureParameterfvEXT = load.invoke("glGetTextureParameterfvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetTextureParameterivEXT = load.invoke("glGetTextureParameterivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetTextureLevelParameterfvEXT = load.invoke("glGetTextureLevelParameterfvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetTextureLevelParameterivEXT = load.invoke("glGetTextureLevelParameterivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glTextureImage3DEXT = load.invoke("glTextureImage3DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glTextureSubImage3DEXT = load.invoke("glTextureSubImage3DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glCopyTextureSubImage3DEXT = load.invoke("glCopyTextureSubImage3DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glBindMultiTextureEXT = load.invoke("glBindMultiTextureEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glMultiTexCoordPointerEXT = load.invoke("glMultiTexCoordPointerEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glMultiTexEnvfEXT = load.invoke("glMultiTexEnvfEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_FLOAT));
        ext.glMultiTexEnvfvEXT = load.invoke("glMultiTexEnvfvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glMultiTexEnviEXT = load.invoke("glMultiTexEnviEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glMultiTexEnvivEXT = load.invoke("glMultiTexEnvivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glMultiTexGendEXT = load.invoke("glMultiTexGendEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_DOUBLE));
        ext.glMultiTexGendvEXT = load.invoke("glMultiTexGendvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glMultiTexGenfEXT = load.invoke("glMultiTexGenfEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_FLOAT));
        ext.glMultiTexGenfvEXT = load.invoke("glMultiTexGenfvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glMultiTexGeniEXT = load.invoke("glMultiTexGeniEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glMultiTexGenivEXT = load.invoke("glMultiTexGenivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetMultiTexEnvfvEXT = load.invoke("glGetMultiTexEnvfvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetMultiTexEnvivEXT = load.invoke("glGetMultiTexEnvivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetMultiTexGendvEXT = load.invoke("glGetMultiTexGendvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetMultiTexGenfvEXT = load.invoke("glGetMultiTexGenfvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetMultiTexGenivEXT = load.invoke("glGetMultiTexGenivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glMultiTexParameteriEXT = load.invoke("glMultiTexParameteriEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glMultiTexParameterivEXT = load.invoke("glMultiTexParameterivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glMultiTexParameterfEXT = load.invoke("glMultiTexParameterfEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_FLOAT));
        ext.glMultiTexParameterfvEXT = load.invoke("glMultiTexParameterfvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glMultiTexImage1DEXT = load.invoke("glMultiTexImage1DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glMultiTexImage2DEXT = load.invoke("glMultiTexImage2DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glMultiTexSubImage1DEXT = load.invoke("glMultiTexSubImage1DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glMultiTexSubImage2DEXT = load.invoke("glMultiTexSubImage2DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glCopyMultiTexImage1DEXT = load.invoke("glCopyMultiTexImage1DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glCopyMultiTexImage2DEXT = load.invoke("glCopyMultiTexImage2DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glCopyMultiTexSubImage1DEXT = load.invoke("glCopyMultiTexSubImage1DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glCopyMultiTexSubImage2DEXT = load.invoke("glCopyMultiTexSubImage2DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glGetMultiTexImageEXT = load.invoke("glGetMultiTexImageEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetMultiTexParameterfvEXT = load.invoke("glGetMultiTexParameterfvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetMultiTexParameterivEXT = load.invoke("glGetMultiTexParameterivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetMultiTexLevelParameterfvEXT = load.invoke("glGetMultiTexLevelParameterfvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetMultiTexLevelParameterivEXT = load.invoke("glGetMultiTexLevelParameterivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glMultiTexImage3DEXT = load.invoke("glMultiTexImage3DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glMultiTexSubImage3DEXT = load.invoke("glMultiTexSubImage3DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glCopyMultiTexSubImage3DEXT = load.invoke("glCopyMultiTexSubImage3DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glEnableClientStateIndexedEXT = load.invoke("glEnableClientStateIndexedEXT", ofVoid(JAVA_INT, JAVA_INT));
        ext.glDisableClientStateIndexedEXT = load.invoke("glDisableClientStateIndexedEXT", ofVoid(JAVA_INT, JAVA_INT));
        ext.glGetFloatIndexedvEXT = load.invoke("glGetFloatIndexedvEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetDoubleIndexedvEXT = load.invoke("glGetDoubleIndexedvEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetPointerIndexedvEXT = load.invoke("glGetPointerIndexedvEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glEnableIndexedEXT = load.invoke("glEnableIndexedEXT", ofVoid(JAVA_INT, JAVA_INT));
        ext.glDisableIndexedEXT = load.invoke("glDisableIndexedEXT", ofVoid(JAVA_INT, JAVA_INT));
        ext.glIsEnabledIndexedEXT = load.invoke("glIsEnabledIndexedEXT", of(JAVA_BYTE, JAVA_INT, JAVA_INT));
        ext.glGetIntegerIndexedvEXT = load.invoke("glGetIntegerIndexedvEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetBooleanIndexedvEXT = load.invoke("glGetBooleanIndexedvEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glCompressedTextureImage3DEXT = load.invoke("glCompressedTextureImage3DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glCompressedTextureImage2DEXT = load.invoke("glCompressedTextureImage2DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glCompressedTextureImage1DEXT = load.invoke("glCompressedTextureImage1DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glCompressedTextureSubImage3DEXT = load.invoke("glCompressedTextureSubImage3DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glCompressedTextureSubImage2DEXT = load.invoke("glCompressedTextureSubImage2DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glCompressedTextureSubImage1DEXT = load.invoke("glCompressedTextureSubImage1DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetCompressedTextureImageEXT = load.invoke("glGetCompressedTextureImageEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glCompressedMultiTexImage3DEXT = load.invoke("glCompressedMultiTexImage3DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glCompressedMultiTexImage2DEXT = load.invoke("glCompressedMultiTexImage2DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glCompressedMultiTexImage1DEXT = load.invoke("glCompressedMultiTexImage1DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glCompressedMultiTexSubImage3DEXT = load.invoke("glCompressedMultiTexSubImage3DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glCompressedMultiTexSubImage2DEXT = load.invoke("glCompressedMultiTexSubImage2DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glCompressedMultiTexSubImage1DEXT = load.invoke("glCompressedMultiTexSubImage1DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetCompressedMultiTexImageEXT = load.invoke("glGetCompressedMultiTexImageEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glMatrixLoadTransposefEXT = load.invoke("glMatrixLoadTransposefEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glMatrixLoadTransposedEXT = load.invoke("glMatrixLoadTransposedEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glMatrixMultTransposefEXT = load.invoke("glMatrixMultTransposefEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glMatrixMultTransposedEXT = load.invoke("glMatrixMultTransposedEXT", ofVoid(JAVA_INT, ADDRESS));
        ext.glNamedBufferDataEXT = load.invoke("glNamedBufferDataEXT", ofVoid(JAVA_INT, JAVA_LONG, ADDRESS, JAVA_INT));
        ext.glNamedBufferSubDataEXT = load.invoke("glNamedBufferSubDataEXT", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG, ADDRESS));
        ext.glMapNamedBufferEXT = load.invoke("glMapNamedBufferEXT", of(ADDRESS, JAVA_INT, JAVA_INT));
        ext.glUnmapNamedBufferEXT = load.invoke("glUnmapNamedBufferEXT", of(JAVA_BYTE, JAVA_INT));
        ext.glGetNamedBufferParameterivEXT = load.invoke("glGetNamedBufferParameterivEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetNamedBufferPointervEXT = load.invoke("glGetNamedBufferPointervEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetNamedBufferSubDataEXT = load.invoke("glGetNamedBufferSubDataEXT", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG, ADDRESS));
        ext.glProgramUniform1fEXT = load.invoke("glProgramUniform1fEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_FLOAT));
        ext.glProgramUniform2fEXT = load.invoke("glProgramUniform2fEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glProgramUniform3fEXT = load.invoke("glProgramUniform3fEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glProgramUniform4fEXT = load.invoke("glProgramUniform4fEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glProgramUniform1iEXT = load.invoke("glProgramUniform1iEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glProgramUniform2iEXT = load.invoke("glProgramUniform2iEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glProgramUniform3iEXT = load.invoke("glProgramUniform3iEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glProgramUniform4iEXT = load.invoke("glProgramUniform4iEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glProgramUniform1fvEXT = load.invoke("glProgramUniform1fvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform2fvEXT = load.invoke("glProgramUniform2fvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform3fvEXT = load.invoke("glProgramUniform3fvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform4fvEXT = load.invoke("glProgramUniform4fvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform1ivEXT = load.invoke("glProgramUniform1ivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform2ivEXT = load.invoke("glProgramUniform2ivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform3ivEXT = load.invoke("glProgramUniform3ivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform4ivEXT = load.invoke("glProgramUniform4ivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniformMatrix2fvEXT = load.invoke("glProgramUniformMatrix2fvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, ADDRESS));
        ext.glProgramUniformMatrix3fvEXT = load.invoke("glProgramUniformMatrix3fvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, ADDRESS));
        ext.glProgramUniformMatrix4fvEXT = load.invoke("glProgramUniformMatrix4fvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, ADDRESS));
        ext.glProgramUniformMatrix2x3fvEXT = load.invoke("glProgramUniformMatrix2x3fvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, ADDRESS));
        ext.glProgramUniformMatrix3x2fvEXT = load.invoke("glProgramUniformMatrix3x2fvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, ADDRESS));
        ext.glProgramUniformMatrix2x4fvEXT = load.invoke("glProgramUniformMatrix2x4fvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, ADDRESS));
        ext.glProgramUniformMatrix4x2fvEXT = load.invoke("glProgramUniformMatrix4x2fvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, ADDRESS));
        ext.glProgramUniformMatrix3x4fvEXT = load.invoke("glProgramUniformMatrix3x4fvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, ADDRESS));
        ext.glProgramUniformMatrix4x3fvEXT = load.invoke("glProgramUniformMatrix4x3fvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, ADDRESS));
        ext.glTextureBufferEXT = load.invoke("glTextureBufferEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glMultiTexBufferEXT = load.invoke("glMultiTexBufferEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glTextureParameterIivEXT = load.invoke("glTextureParameterIivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glTextureParameterIuivEXT = load.invoke("glTextureParameterIuivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetTextureParameterIivEXT = load.invoke("glGetTextureParameterIivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetTextureParameterIuivEXT = load.invoke("glGetTextureParameterIuivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glMultiTexParameterIivEXT = load.invoke("glMultiTexParameterIivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glMultiTexParameterIuivEXT = load.invoke("glMultiTexParameterIuivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetMultiTexParameterIivEXT = load.invoke("glGetMultiTexParameterIivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetMultiTexParameterIuivEXT = load.invoke("glGetMultiTexParameterIuivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform1uiEXT = load.invoke("glProgramUniform1uiEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glProgramUniform2uiEXT = load.invoke("glProgramUniform2uiEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glProgramUniform3uiEXT = load.invoke("glProgramUniform3uiEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glProgramUniform4uiEXT = load.invoke("glProgramUniform4uiEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glProgramUniform1uivEXT = load.invoke("glProgramUniform1uivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform2uivEXT = load.invoke("glProgramUniform2uivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform3uivEXT = load.invoke("glProgramUniform3uivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform4uivEXT = load.invoke("glProgramUniform4uivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glNamedProgramLocalParameters4fvEXT = load.invoke("glNamedProgramLocalParameters4fvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glNamedProgramLocalParameterI4iEXT = load.invoke("glNamedProgramLocalParameterI4iEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glNamedProgramLocalParameterI4ivEXT = load.invoke("glNamedProgramLocalParameterI4ivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glNamedProgramLocalParametersI4ivEXT = load.invoke("glNamedProgramLocalParametersI4ivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glNamedProgramLocalParameterI4uiEXT = load.invoke("glNamedProgramLocalParameterI4uiEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glNamedProgramLocalParameterI4uivEXT = load.invoke("glNamedProgramLocalParameterI4uivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glNamedProgramLocalParametersI4uivEXT = load.invoke("glNamedProgramLocalParametersI4uivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetNamedProgramLocalParameterIivEXT = load.invoke("glGetNamedProgramLocalParameterIivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetNamedProgramLocalParameterIuivEXT = load.invoke("glGetNamedProgramLocalParameterIuivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glEnableClientStateiEXT = load.invoke("glEnableClientStateiEXT", ofVoid(JAVA_INT, JAVA_INT));
        ext.glDisableClientStateiEXT = load.invoke("glDisableClientStateiEXT", ofVoid(JAVA_INT, JAVA_INT));
        ext.glGetFloati_vEXT = load.invoke("glGetFloati_vEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetDoublei_vEXT = load.invoke("glGetDoublei_vEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetPointeri_vEXT = load.invoke("glGetPointeri_vEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glNamedProgramStringEXT = load.invoke("glNamedProgramStringEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glNamedProgramLocalParameter4dEXT = load.invoke("glNamedProgramLocalParameter4dEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glNamedProgramLocalParameter4dvEXT = load.invoke("glNamedProgramLocalParameter4dvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glNamedProgramLocalParameter4fEXT = load.invoke("glNamedProgramLocalParameter4fEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT));
        ext.glNamedProgramLocalParameter4fvEXT = load.invoke("glNamedProgramLocalParameter4fvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetNamedProgramLocalParameterdvEXT = load.invoke("glGetNamedProgramLocalParameterdvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetNamedProgramLocalParameterfvEXT = load.invoke("glGetNamedProgramLocalParameterfvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetNamedProgramivEXT = load.invoke("glGetNamedProgramivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetNamedProgramStringEXT = load.invoke("glGetNamedProgramStringEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glNamedRenderbufferStorageEXT = load.invoke("glNamedRenderbufferStorageEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glGetNamedRenderbufferParameterivEXT = load.invoke("glGetNamedRenderbufferParameterivEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glNamedRenderbufferStorageMultisampleEXT = load.invoke("glNamedRenderbufferStorageMultisampleEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glNamedRenderbufferStorageMultisampleCoverageEXT = load.invoke("glNamedRenderbufferStorageMultisampleCoverageEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glCheckNamedFramebufferStatusEXT = load.invoke("glCheckNamedFramebufferStatusEXT", of(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glNamedFramebufferTexture1DEXT = load.invoke("glNamedFramebufferTexture1DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glNamedFramebufferTexture2DEXT = load.invoke("glNamedFramebufferTexture2DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glNamedFramebufferTexture3DEXT = load.invoke("glNamedFramebufferTexture3DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glNamedFramebufferRenderbufferEXT = load.invoke("glNamedFramebufferRenderbufferEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glGetNamedFramebufferAttachmentParameterivEXT = load.invoke("glGetNamedFramebufferAttachmentParameterivEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGenerateTextureMipmapEXT = load.invoke("glGenerateTextureMipmapEXT", ofVoid(JAVA_INT, JAVA_INT));
        ext.glGenerateMultiTexMipmapEXT = load.invoke("glGenerateMultiTexMipmapEXT", ofVoid(JAVA_INT, JAVA_INT));
        ext.glFramebufferDrawBufferEXT = load.invoke("glFramebufferDrawBufferEXT", ofVoid(JAVA_INT, JAVA_INT));
        ext.glFramebufferDrawBuffersEXT = load.invoke("glFramebufferDrawBuffersEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glFramebufferReadBufferEXT = load.invoke("glFramebufferReadBufferEXT", ofVoid(JAVA_INT, JAVA_INT));
        ext.glGetFramebufferParameterivEXT = load.invoke("glGetFramebufferParameterivEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glNamedCopyBufferSubDataEXT = load.invoke("glNamedCopyBufferSubDataEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_LONG));
        ext.glNamedFramebufferTextureEXT = load.invoke("glNamedFramebufferTextureEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glNamedFramebufferTextureLayerEXT = load.invoke("glNamedFramebufferTextureLayerEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glNamedFramebufferTextureFaceEXT = load.invoke("glNamedFramebufferTextureFaceEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glTextureRenderbufferEXT = load.invoke("glTextureRenderbufferEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glMultiTexRenderbufferEXT = load.invoke("glMultiTexRenderbufferEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glVertexArrayVertexOffsetEXT = load.invoke("glVertexArrayVertexOffsetEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glVertexArrayColorOffsetEXT = load.invoke("glVertexArrayColorOffsetEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glVertexArrayEdgeFlagOffsetEXT = load.invoke("glVertexArrayEdgeFlagOffsetEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glVertexArrayIndexOffsetEXT = load.invoke("glVertexArrayIndexOffsetEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glVertexArrayNormalOffsetEXT = load.invoke("glVertexArrayNormalOffsetEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glVertexArrayTexCoordOffsetEXT = load.invoke("glVertexArrayTexCoordOffsetEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glVertexArrayMultiTexCoordOffsetEXT = load.invoke("glVertexArrayMultiTexCoordOffsetEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glVertexArrayFogCoordOffsetEXT = load.invoke("glVertexArrayFogCoordOffsetEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glVertexArraySecondaryColorOffsetEXT = load.invoke("glVertexArraySecondaryColorOffsetEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glVertexArrayVertexAttribOffsetEXT = load.invoke("glVertexArrayVertexAttribOffsetEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, JAVA_INT, JAVA_LONG));
        ext.glVertexArrayVertexAttribIOffsetEXT = load.invoke("glVertexArrayVertexAttribIOffsetEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glEnableVertexArrayEXT = load.invoke("glEnableVertexArrayEXT", ofVoid(JAVA_INT, JAVA_INT));
        ext.glDisableVertexArrayEXT = load.invoke("glDisableVertexArrayEXT", ofVoid(JAVA_INT, JAVA_INT));
        ext.glEnableVertexArrayAttribEXT = load.invoke("glEnableVertexArrayAttribEXT", ofVoid(JAVA_INT, JAVA_INT));
        ext.glDisableVertexArrayAttribEXT = load.invoke("glDisableVertexArrayAttribEXT", ofVoid(JAVA_INT, JAVA_INT));
        ext.glGetVertexArrayIntegervEXT = load.invoke("glGetVertexArrayIntegervEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetVertexArrayPointervEXT = load.invoke("glGetVertexArrayPointervEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetVertexArrayIntegeri_vEXT = load.invoke("glGetVertexArrayIntegeri_vEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glGetVertexArrayPointeri_vEXT = load.invoke("glGetVertexArrayPointeri_vEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glMapNamedBufferRangeEXT = load.invoke("glMapNamedBufferRangeEXT", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_INT));
        ext.glFlushMappedNamedBufferRangeEXT = load.invoke("glFlushMappedNamedBufferRangeEXT", ofVoid(JAVA_INT, JAVA_LONG, JAVA_LONG));
        ext.glNamedBufferStorageEXT = load.invoke("glNamedBufferStorageEXT", ofVoid(JAVA_INT, JAVA_LONG, ADDRESS, JAVA_INT));
        ext.glClearNamedBufferDataEXT = load.invoke("glClearNamedBufferDataEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glClearNamedBufferSubDataEXT = load.invoke("glClearNamedBufferSubDataEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glNamedFramebufferParameteriEXT = load.invoke("glNamedFramebufferParameteriEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glGetNamedFramebufferParameterivEXT = load.invoke("glGetNamedFramebufferParameterivEXT", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform1dEXT = load.invoke("glProgramUniform1dEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_DOUBLE));
        ext.glProgramUniform2dEXT = load.invoke("glProgramUniform2dEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glProgramUniform3dEXT = load.invoke("glProgramUniform3dEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glProgramUniform4dEXT = load.invoke("glProgramUniform4dEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE));
        ext.glProgramUniform1dvEXT = load.invoke("glProgramUniform1dvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform2dvEXT = load.invoke("glProgramUniform2dvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform3dvEXT = load.invoke("glProgramUniform3dvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniform4dvEXT = load.invoke("glProgramUniform4dvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glProgramUniformMatrix2dvEXT = load.invoke("glProgramUniformMatrix2dvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, ADDRESS));
        ext.glProgramUniformMatrix3dvEXT = load.invoke("glProgramUniformMatrix3dvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, ADDRESS));
        ext.glProgramUniformMatrix4dvEXT = load.invoke("glProgramUniformMatrix4dvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, ADDRESS));
        ext.glProgramUniformMatrix2x3dvEXT = load.invoke("glProgramUniformMatrix2x3dvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, ADDRESS));
        ext.glProgramUniformMatrix2x4dvEXT = load.invoke("glProgramUniformMatrix2x4dvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, ADDRESS));
        ext.glProgramUniformMatrix3x2dvEXT = load.invoke("glProgramUniformMatrix3x2dvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, ADDRESS));
        ext.glProgramUniformMatrix3x4dvEXT = load.invoke("glProgramUniformMatrix3x4dvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, ADDRESS));
        ext.glProgramUniformMatrix4x2dvEXT = load.invoke("glProgramUniformMatrix4x2dvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, ADDRESS));
        ext.glProgramUniformMatrix4x3dvEXT = load.invoke("glProgramUniformMatrix4x3dvEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, ADDRESS));
        ext.glTextureBufferRangeEXT = load.invoke("glTextureBufferRangeEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG));
        ext.glTextureStorage1DEXT = load.invoke("glTextureStorage1DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glTextureStorage2DEXT = load.invoke("glTextureStorage2DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glTextureStorage3DEXT = load.invoke("glTextureStorage3DEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glTextureStorage2DMultisampleEXT = load.invoke("glTextureStorage2DMultisampleEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE));
        ext.glTextureStorage3DMultisampleEXT = load.invoke("glTextureStorage3DMultisampleEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE));
        ext.glVertexArrayBindVertexBufferEXT = load.invoke("glVertexArrayBindVertexBufferEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_INT));
        ext.glVertexArrayVertexAttribFormatEXT = load.invoke("glVertexArrayVertexAttribFormatEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, JAVA_INT));
        ext.glVertexArrayVertexAttribIFormatEXT = load.invoke("glVertexArrayVertexAttribIFormatEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glVertexArrayVertexAttribLFormatEXT = load.invoke("glVertexArrayVertexAttribLFormatEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glVertexArrayVertexAttribBindingEXT = load.invoke("glVertexArrayVertexAttribBindingEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glVertexArrayVertexBindingDivisorEXT = load.invoke("glVertexArrayVertexBindingDivisorEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
        ext.glVertexArrayVertexAttribLOffsetEXT = load.invoke("glVertexArrayVertexAttribLOffsetEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG));
        ext.glTexturePageCommitmentEXT = load.invoke("glTexturePageCommitmentEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE));
        ext.glVertexArrayVertexAttribDivisorEXT = load.invoke("glVertexArrayVertexAttribDivisorEXT", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT));
    }

    public static void glMatrixLoadfEXT(int mode, @NativeType("const GLfloat *") MemorySegment m) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixLoadfEXT).invokeExact(mode, m);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMatrixLoaddEXT(int mode, @NativeType("const GLdouble *") MemorySegment m) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixLoaddEXT).invokeExact(mode, m);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMatrixMultfEXT(int mode, @NativeType("const GLfloat *") MemorySegment m) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixMultfEXT).invokeExact(mode, m);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMatrixMultdEXT(int mode, @NativeType("const GLdouble *") MemorySegment m) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixMultdEXT).invokeExact(mode, m);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMatrixLoadIdentityEXT(int mode) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixLoadIdentityEXT).invokeExact(mode);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMatrixRotatefEXT(int mode, float angle, float x, float y, float z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixRotatefEXT).invokeExact(mode, angle, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMatrixRotatedEXT(int mode, double angle, double x, double y, double z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixRotatedEXT).invokeExact(mode, angle, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMatrixScalefEXT(int mode, float x, float y, float z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixScalefEXT).invokeExact(mode, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMatrixScaledEXT(int mode, double x, double y, double z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixScaledEXT).invokeExact(mode, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMatrixTranslatefEXT(int mode, float x, float y, float z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixTranslatefEXT).invokeExact(mode, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMatrixTranslatedEXT(int mode, double x, double y, double z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixTranslatedEXT).invokeExact(mode, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMatrixFrustumEXT(int mode, double left, double right, double bottom, double top, double zNear, double zFar) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixFrustumEXT).invokeExact(mode, left, right, bottom, top, zNear, zFar);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMatrixOrthoEXT(int mode, double left, double right, double bottom, double top, double zNear, double zFar) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixOrthoEXT).invokeExact(mode, left, right, bottom, top, zNear, zFar);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMatrixPopEXT(int mode) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixPopEXT).invokeExact(mode);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMatrixPushEXT(int mode) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixPushEXT).invokeExact(mode);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glClientAttribDefaultEXT(int mask) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glClientAttribDefaultEXT).invokeExact(mask);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glPushClientAttribDefaultEXT(int mask) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glPushClientAttribDefaultEXT).invokeExact(mask);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureParameterfEXT(int texture, int target, int pname, float param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureParameterfEXT).invokeExact(texture, target, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureParameterfvEXT(int texture, int target, int pname, @NativeType("const GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureParameterfvEXT).invokeExact(texture, target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureParameteriEXT(int texture, int target, int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureParameteriEXT).invokeExact(texture, target, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureParameterivEXT(int texture, int target, int pname, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureParameterivEXT).invokeExact(texture, target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureImage1DEXT).invokeExact(texture, target, level, internalformat, width, border, format, type, pixels);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureImage2DEXT).invokeExact(texture, target, level, internalformat, width, height, border, format, type, pixels);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureSubImage1DEXT).invokeExact(texture, target, level, xoffset, width, format, type, pixels);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureSubImage2DEXT).invokeExact(texture, target, level, xoffset, yoffset, width, height, format, type, pixels);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCopyTextureImage1DEXT(int texture, int target, int level, int internalformat, int x, int y, int width, int border) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCopyTextureImage1DEXT).invokeExact(texture, target, level, internalformat, x, y, width, border);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCopyTextureImage2DEXT(int texture, int target, int level, int internalformat, int x, int y, int width, int height, int border) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCopyTextureImage2DEXT).invokeExact(texture, target, level, internalformat, x, y, width, height, border);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCopyTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int x, int y, int width) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCopyTextureSubImage1DEXT).invokeExact(texture, target, level, xoffset, x, y, width);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCopyTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCopyTextureSubImage2DEXT).invokeExact(texture, target, level, xoffset, yoffset, x, y, width, height);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetTextureImageEXT(int texture, int target, int level, int format, int type, @NativeType("void *") MemorySegment pixels) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetTextureImageEXT).invokeExact(texture, target, level, format, type, pixels);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetTextureParameterfvEXT(int texture, int target, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetTextureParameterfvEXT).invokeExact(texture, target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetTextureParameterivEXT(int texture, int target, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetTextureParameterivEXT).invokeExact(texture, target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetTextureLevelParameterfvEXT(int texture, int target, int level, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetTextureLevelParameterfvEXT).invokeExact(texture, target, level, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetTextureLevelParameterivEXT(int texture, int target, int level, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetTextureLevelParameterivEXT).invokeExact(texture, target, level, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureImage3DEXT).invokeExact(texture, target, level, internalformat, width, height, depth, border, format, type, pixels);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureSubImage3DEXT).invokeExact(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCopyTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCopyTextureSubImage3DEXT).invokeExact(texture, target, level, xoffset, yoffset, zoffset, x, y, width, height);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glBindMultiTextureEXT(int texunit, int target, int texture) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glBindMultiTextureEXT).invokeExact(texunit, target, texture);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexCoordPointerEXT(int texunit, int size, int type, int stride, @NativeType("const void *") MemorySegment pointer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexCoordPointerEXT).invokeExact(texunit, size, type, stride, pointer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexEnvfEXT(int texunit, int target, int pname, float param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexEnvfEXT).invokeExact(texunit, target, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexEnvfvEXT(int texunit, int target, int pname, @NativeType("const GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexEnvfvEXT).invokeExact(texunit, target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexEnviEXT(int texunit, int target, int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexEnviEXT).invokeExact(texunit, target, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexEnvivEXT(int texunit, int target, int pname, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexEnvivEXT).invokeExact(texunit, target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexGendEXT(int texunit, int coord, int pname, double param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexGendEXT).invokeExact(texunit, coord, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexGendvEXT(int texunit, int coord, int pname, @NativeType("const GLdouble *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexGendvEXT).invokeExact(texunit, coord, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexGenfEXT(int texunit, int coord, int pname, float param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexGenfEXT).invokeExact(texunit, coord, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexGenfvEXT(int texunit, int coord, int pname, @NativeType("const GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexGenfvEXT).invokeExact(texunit, coord, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexGeniEXT(int texunit, int coord, int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexGeniEXT).invokeExact(texunit, coord, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexGenivEXT(int texunit, int coord, int pname, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexGenivEXT).invokeExact(texunit, coord, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetMultiTexEnvfvEXT(int texunit, int target, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetMultiTexEnvfvEXT).invokeExact(texunit, target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetMultiTexEnvivEXT(int texunit, int target, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetMultiTexEnvivEXT).invokeExact(texunit, target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetMultiTexGendvEXT(int texunit, int coord, int pname, @NativeType("GLdouble *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetMultiTexGendvEXT).invokeExact(texunit, coord, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetMultiTexGenfvEXT(int texunit, int coord, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetMultiTexGenfvEXT).invokeExact(texunit, coord, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetMultiTexGenivEXT(int texunit, int coord, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetMultiTexGenivEXT).invokeExact(texunit, coord, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexParameteriEXT(int texunit, int target, int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexParameteriEXT).invokeExact(texunit, target, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexParameterivEXT(int texunit, int target, int pname, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexParameterivEXT).invokeExact(texunit, target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexParameterfEXT(int texunit, int target, int pname, float param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexParameterfEXT).invokeExact(texunit, target, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexParameterfvEXT(int texunit, int target, int pname, @NativeType("const GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexParameterfvEXT).invokeExact(texunit, target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexImage1DEXT).invokeExact(texunit, target, level, internalformat, width, border, format, type, pixels);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexImage2DEXT).invokeExact(texunit, target, level, internalformat, width, height, border, format, type, pixels);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexSubImage1DEXT).invokeExact(texunit, target, level, xoffset, width, format, type, pixels);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexSubImage2DEXT).invokeExact(texunit, target, level, xoffset, yoffset, width, height, format, type, pixels);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCopyMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int x, int y, int width, int border) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCopyMultiTexImage1DEXT).invokeExact(texunit, target, level, internalformat, x, y, width, border);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCopyMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int x, int y, int width, int height, int border) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCopyMultiTexImage2DEXT).invokeExact(texunit, target, level, internalformat, x, y, width, height, border);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCopyMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int x, int y, int width) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCopyMultiTexSubImage1DEXT).invokeExact(texunit, target, level, xoffset, x, y, width);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCopyMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCopyMultiTexSubImage2DEXT).invokeExact(texunit, target, level, xoffset, yoffset, x, y, width, height);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetMultiTexImageEXT(int texunit, int target, int level, int format, int type, @NativeType("void *") MemorySegment pixels) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetMultiTexImageEXT).invokeExact(texunit, target, level, format, type, pixels);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetMultiTexParameterfvEXT(int texunit, int target, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetMultiTexParameterfvEXT).invokeExact(texunit, target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetMultiTexParameterivEXT(int texunit, int target, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetMultiTexParameterivEXT).invokeExact(texunit, target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetMultiTexLevelParameterfvEXT(int texunit, int target, int level, int pname, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetMultiTexLevelParameterfvEXT).invokeExact(texunit, target, level, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetMultiTexLevelParameterivEXT(int texunit, int target, int level, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetMultiTexLevelParameterivEXT).invokeExact(texunit, target, level, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexImage3DEXT).invokeExact(texunit, target, level, internalformat, width, height, depth, border, format, type, pixels);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, @NativeType("const void *") MemorySegment pixels) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexSubImage3DEXT).invokeExact(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCopyMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCopyMultiTexSubImage3DEXT).invokeExact(texunit, target, level, xoffset, yoffset, zoffset, x, y, width, height);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glEnableClientStateIndexedEXT(int array, int index) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glEnableClientStateIndexedEXT).invokeExact(array, index);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDisableClientStateIndexedEXT(int array, int index) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDisableClientStateIndexedEXT).invokeExact(array, index);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetFloatIndexedvEXT(int target, int index, @NativeType("GLfloat *") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetFloatIndexedvEXT).invokeExact(target, index, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetDoubleIndexedvEXT(int target, int index, @NativeType("GLdouble *") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetDoubleIndexedvEXT).invokeExact(target, index, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPointerIndexedvEXT(int target, int index, @NativeType("void **") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPointerIndexedvEXT).invokeExact(target, index, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glEnableIndexedEXT(int target, int index) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glEnableIndexedEXT).invokeExact(target, index);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDisableIndexedEXT(int target, int index) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDisableIndexedEXT).invokeExact(target, index);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsEnabledIndexedEXT(int target, int index) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsEnabledIndexedEXT).invokeExact(target, index);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetIntegerIndexedvEXT(int target, int index, @NativeType("GLint *") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetIntegerIndexedvEXT).invokeExact(target, index, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetBooleanIndexedvEXT(int target, int index, @NativeType("GLboolean *") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetBooleanIndexedvEXT).invokeExact(target, index, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCompressedTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, @NativeType("const void *") MemorySegment bits) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCompressedTextureImage3DEXT).invokeExact(texture, target, level, internalformat, width, height, depth, border, imageSize, bits);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCompressedTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int imageSize, @NativeType("const void *") MemorySegment bits) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCompressedTextureImage2DEXT).invokeExact(texture, target, level, internalformat, width, height, border, imageSize, bits);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCompressedTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int imageSize, @NativeType("const void *") MemorySegment bits) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCompressedTextureImage1DEXT).invokeExact(texture, target, level, internalformat, width, border, imageSize, bits);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCompressedTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, @NativeType("const void *") MemorySegment bits) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCompressedTextureSubImage3DEXT).invokeExact(texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, bits);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCompressedTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, @NativeType("const void *") MemorySegment bits) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCompressedTextureSubImage2DEXT).invokeExact(texture, target, level, xoffset, yoffset, width, height, format, imageSize, bits);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCompressedTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int imageSize, @NativeType("const void *") MemorySegment bits) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCompressedTextureSubImage1DEXT).invokeExact(texture, target, level, xoffset, width, format, imageSize, bits);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetCompressedTextureImageEXT(int texture, int target, int lod, @NativeType("void *") MemorySegment img) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetCompressedTextureImageEXT).invokeExact(texture, target, lod, img);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCompressedMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, @NativeType("const void *") MemorySegment bits) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCompressedMultiTexImage3DEXT).invokeExact(texunit, target, level, internalformat, width, height, depth, border, imageSize, bits);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCompressedMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int imageSize, @NativeType("const void *") MemorySegment bits) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCompressedMultiTexImage2DEXT).invokeExact(texunit, target, level, internalformat, width, height, border, imageSize, bits);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCompressedMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int imageSize, @NativeType("const void *") MemorySegment bits) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCompressedMultiTexImage1DEXT).invokeExact(texunit, target, level, internalformat, width, border, imageSize, bits);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCompressedMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, @NativeType("const void *") MemorySegment bits) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCompressedMultiTexSubImage3DEXT).invokeExact(texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, bits);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCompressedMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, @NativeType("const void *") MemorySegment bits) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCompressedMultiTexSubImage2DEXT).invokeExact(texunit, target, level, xoffset, yoffset, width, height, format, imageSize, bits);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCompressedMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int imageSize, @NativeType("const void *") MemorySegment bits) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCompressedMultiTexSubImage1DEXT).invokeExact(texunit, target, level, xoffset, width, format, imageSize, bits);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetCompressedMultiTexImageEXT(int texunit, int target, int lod, @NativeType("void *") MemorySegment img) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetCompressedMultiTexImageEXT).invokeExact(texunit, target, lod, img);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMatrixLoadTransposefEXT(int mode, @NativeType("const GLfloat *") MemorySegment m) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixLoadTransposefEXT).invokeExact(mode, m);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMatrixLoadTransposedEXT(int mode, @NativeType("const GLdouble *") MemorySegment m) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixLoadTransposedEXT).invokeExact(mode, m);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMatrixMultTransposefEXT(int mode, @NativeType("const GLfloat *") MemorySegment m) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixMultTransposefEXT).invokeExact(mode, m);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMatrixMultTransposedEXT(int mode, @NativeType("const GLdouble *") MemorySegment m) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMatrixMultTransposedEXT).invokeExact(mode, m);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedBufferDataEXT(int buffer, long size, @NativeType("const void *") MemorySegment data, int usage) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedBufferDataEXT).invokeExact(buffer, size, data, usage);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedBufferSubDataEXT(int buffer, long offset, long size, @NativeType("const void *") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedBufferSubDataEXT).invokeExact(buffer, offset, size, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static @NativeType("void *") MemorySegment glMapNamedBufferEXT(int buffer, int access) {
        final var ext = getExtCapabilities();
        try {
            return (MemorySegment)
            check(ext.glMapNamedBufferEXT).invokeExact(buffer, access);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glUnmapNamedBufferEXT(int buffer) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glUnmapNamedBufferEXT).invokeExact(buffer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetNamedBufferParameterivEXT(int buffer, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetNamedBufferParameterivEXT).invokeExact(buffer, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetNamedBufferPointervEXT(int buffer, int pname, @NativeType("void **") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetNamedBufferPointervEXT).invokeExact(buffer, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetNamedBufferSubDataEXT(int buffer, long offset, long size, @NativeType("void *") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetNamedBufferSubDataEXT).invokeExact(buffer, offset, size, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform1fEXT(int program, int location, float v0) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform1fEXT).invokeExact(program, location, v0);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform2fEXT(int program, int location, float v0, float v1) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform2fEXT).invokeExact(program, location, v0, v1);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform3fEXT(int program, int location, float v0, float v1, float v2) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform3fEXT).invokeExact(program, location, v0, v1, v2);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform4fEXT(int program, int location, float v0, float v1, float v2, float v3) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform4fEXT).invokeExact(program, location, v0, v1, v2, v3);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform1iEXT(int program, int location, int v0) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform1iEXT).invokeExact(program, location, v0);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform2iEXT(int program, int location, int v0, int v1) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform2iEXT).invokeExact(program, location, v0, v1);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform3iEXT(int program, int location, int v0, int v1, int v2) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform3iEXT).invokeExact(program, location, v0, v1, v2);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform4iEXT(int program, int location, int v0, int v1, int v2, int v3) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform4iEXT).invokeExact(program, location, v0, v1, v2, v3);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform1fvEXT(int program, int location, int count, @NativeType("const GLfloat *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform1fvEXT).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform2fvEXT(int program, int location, int count, @NativeType("const GLfloat *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform2fvEXT).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform3fvEXT(int program, int location, int count, @NativeType("const GLfloat *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform3fvEXT).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform4fvEXT(int program, int location, int count, @NativeType("const GLfloat *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform4fvEXT).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform1ivEXT(int program, int location, int count, @NativeType("const GLint *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform1ivEXT).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform2ivEXT(int program, int location, int count, @NativeType("const GLint *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform2ivEXT).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform3ivEXT(int program, int location, int count, @NativeType("const GLint *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform3ivEXT).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform4ivEXT(int program, int location, int count, @NativeType("const GLint *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform4ivEXT).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniformMatrix2fvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLfloat *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniformMatrix2fvEXT).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniformMatrix3fvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLfloat *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniformMatrix3fvEXT).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniformMatrix4fvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLfloat *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniformMatrix4fvEXT).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniformMatrix2x3fvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLfloat *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniformMatrix2x3fvEXT).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniformMatrix3x2fvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLfloat *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniformMatrix3x2fvEXT).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniformMatrix2x4fvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLfloat *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniformMatrix2x4fvEXT).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniformMatrix4x2fvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLfloat *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniformMatrix4x2fvEXT).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniformMatrix3x4fvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLfloat *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniformMatrix3x4fvEXT).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniformMatrix4x3fvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLfloat *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniformMatrix4x3fvEXT).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureBufferEXT(int texture, int target, int internalformat, int buffer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureBufferEXT).invokeExact(texture, target, internalformat, buffer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexBufferEXT(int texunit, int target, int internalformat, int buffer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexBufferEXT).invokeExact(texunit, target, internalformat, buffer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureParameterIivEXT(int texture, int target, int pname, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureParameterIivEXT).invokeExact(texture, target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureParameterIuivEXT(int texture, int target, int pname, @NativeType("const GLuint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureParameterIuivEXT).invokeExact(texture, target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetTextureParameterIivEXT(int texture, int target, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetTextureParameterIivEXT).invokeExact(texture, target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetTextureParameterIuivEXT(int texture, int target, int pname, @NativeType("GLuint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetTextureParameterIuivEXT).invokeExact(texture, target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexParameterIivEXT(int texunit, int target, int pname, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexParameterIivEXT).invokeExact(texunit, target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexParameterIuivEXT(int texunit, int target, int pname, @NativeType("const GLuint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexParameterIuivEXT).invokeExact(texunit, target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetMultiTexParameterIivEXT(int texunit, int target, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetMultiTexParameterIivEXT).invokeExact(texunit, target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetMultiTexParameterIuivEXT(int texunit, int target, int pname, @NativeType("GLuint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetMultiTexParameterIuivEXT).invokeExact(texunit, target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform1uiEXT(int program, int location, int v0) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform1uiEXT).invokeExact(program, location, v0);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform2uiEXT(int program, int location, int v0, int v1) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform2uiEXT).invokeExact(program, location, v0, v1);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform3uiEXT(int program, int location, int v0, int v1, int v2) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform3uiEXT).invokeExact(program, location, v0, v1, v2);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform4uiEXT(int program, int location, int v0, int v1, int v2, int v3) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform4uiEXT).invokeExact(program, location, v0, v1, v2, v3);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform1uivEXT(int program, int location, int count, @NativeType("const GLuint *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform1uivEXT).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform2uivEXT(int program, int location, int count, @NativeType("const GLuint *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform2uivEXT).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform3uivEXT(int program, int location, int count, @NativeType("const GLuint *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform3uivEXT).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform4uivEXT(int program, int location, int count, @NativeType("const GLuint *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform4uivEXT).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedProgramLocalParameters4fvEXT(int program, int target, int index, int count, @NativeType("const GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedProgramLocalParameters4fvEXT).invokeExact(program, target, index, count, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedProgramLocalParameterI4iEXT(int program, int target, int index, int x, int y, int z, int w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedProgramLocalParameterI4iEXT).invokeExact(program, target, index, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedProgramLocalParameterI4ivEXT(int program, int target, int index, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedProgramLocalParameterI4ivEXT).invokeExact(program, target, index, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedProgramLocalParametersI4ivEXT(int program, int target, int index, int count, @NativeType("const GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedProgramLocalParametersI4ivEXT).invokeExact(program, target, index, count, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedProgramLocalParameterI4uiEXT(int program, int target, int index, int x, int y, int z, int w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedProgramLocalParameterI4uiEXT).invokeExact(program, target, index, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedProgramLocalParameterI4uivEXT(int program, int target, int index, @NativeType("const GLuint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedProgramLocalParameterI4uivEXT).invokeExact(program, target, index, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedProgramLocalParametersI4uivEXT(int program, int target, int index, int count, @NativeType("const GLuint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedProgramLocalParametersI4uivEXT).invokeExact(program, target, index, count, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetNamedProgramLocalParameterIivEXT(int program, int target, int index, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetNamedProgramLocalParameterIivEXT).invokeExact(program, target, index, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetNamedProgramLocalParameterIuivEXT(int program, int target, int index, @NativeType("GLuint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetNamedProgramLocalParameterIuivEXT).invokeExact(program, target, index, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glEnableClientStateiEXT(int array, int index) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glEnableClientStateiEXT).invokeExact(array, index);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDisableClientStateiEXT(int array, int index) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDisableClientStateiEXT).invokeExact(array, index);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetFloati_vEXT(int pname, int index, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetFloati_vEXT).invokeExact(pname, index, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetDoublei_vEXT(int pname, int index, @NativeType("GLdouble *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetDoublei_vEXT).invokeExact(pname, index, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetPointeri_vEXT(int pname, int index, @NativeType("void **") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetPointeri_vEXT).invokeExact(pname, index, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedProgramStringEXT(int program, int target, int format, int len, @NativeType("const void *") MemorySegment string) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedProgramStringEXT).invokeExact(program, target, format, len, string);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedProgramLocalParameter4dEXT(int program, int target, int index, double x, double y, double z, double w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedProgramLocalParameter4dEXT).invokeExact(program, target, index, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedProgramLocalParameter4dvEXT(int program, int target, int index, @NativeType("const GLdouble *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedProgramLocalParameter4dvEXT).invokeExact(program, target, index, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedProgramLocalParameter4fEXT(int program, int target, int index, float x, float y, float z, float w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedProgramLocalParameter4fEXT).invokeExact(program, target, index, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedProgramLocalParameter4fvEXT(int program, int target, int index, @NativeType("const GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedProgramLocalParameter4fvEXT).invokeExact(program, target, index, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetNamedProgramLocalParameterdvEXT(int program, int target, int index, @NativeType("GLdouble *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetNamedProgramLocalParameterdvEXT).invokeExact(program, target, index, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetNamedProgramLocalParameterfvEXT(int program, int target, int index, @NativeType("GLfloat *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetNamedProgramLocalParameterfvEXT).invokeExact(program, target, index, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetNamedProgramivEXT(int program, int target, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetNamedProgramivEXT).invokeExact(program, target, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetNamedProgramStringEXT(int program, int target, int pname, @NativeType("void *") MemorySegment string) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetNamedProgramStringEXT).invokeExact(program, target, pname, string);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedRenderbufferStorageEXT(int renderbuffer, int internalformat, int width, int height) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedRenderbufferStorageEXT).invokeExact(renderbuffer, internalformat, width, height);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetNamedRenderbufferParameterivEXT(int renderbuffer, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetNamedRenderbufferParameterivEXT).invokeExact(renderbuffer, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedRenderbufferStorageMultisampleEXT(int renderbuffer, int samples, int internalformat, int width, int height) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedRenderbufferStorageMultisampleEXT).invokeExact(renderbuffer, samples, internalformat, width, height);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedRenderbufferStorageMultisampleCoverageEXT(int renderbuffer, int coverageSamples, int colorSamples, int internalformat, int width, int height) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedRenderbufferStorageMultisampleCoverageEXT).invokeExact(renderbuffer, coverageSamples, colorSamples, internalformat, width, height);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static int glCheckNamedFramebufferStatusEXT(int framebuffer, int target) {
        final var ext = getExtCapabilities();
        try {
            return (int)
            check(ext.glCheckNamedFramebufferStatusEXT).invokeExact(framebuffer, target);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedFramebufferTexture1DEXT(int framebuffer, int attachment, int textarget, int texture, int level) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedFramebufferTexture1DEXT).invokeExact(framebuffer, attachment, textarget, texture, level);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedFramebufferTexture2DEXT(int framebuffer, int attachment, int textarget, int texture, int level) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedFramebufferTexture2DEXT).invokeExact(framebuffer, attachment, textarget, texture, level);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedFramebufferTexture3DEXT(int framebuffer, int attachment, int textarget, int texture, int level, int zoffset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedFramebufferTexture3DEXT).invokeExact(framebuffer, attachment, textarget, texture, level, zoffset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedFramebufferRenderbufferEXT(int framebuffer, int attachment, int renderbuffertarget, int renderbuffer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedFramebufferRenderbufferEXT).invokeExact(framebuffer, attachment, renderbuffertarget, renderbuffer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetNamedFramebufferAttachmentParameterivEXT(int framebuffer, int attachment, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetNamedFramebufferAttachmentParameterivEXT).invokeExact(framebuffer, attachment, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGenerateTextureMipmapEXT(int texture, int target) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGenerateTextureMipmapEXT).invokeExact(texture, target);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGenerateMultiTexMipmapEXT(int texunit, int target) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGenerateMultiTexMipmapEXT).invokeExact(texunit, target);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFramebufferDrawBufferEXT(int framebuffer, int mode) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFramebufferDrawBufferEXT).invokeExact(framebuffer, mode);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFramebufferDrawBuffersEXT(int framebuffer, int n, @NativeType("const GLenum *") MemorySegment bufs) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFramebufferDrawBuffersEXT).invokeExact(framebuffer, n, bufs);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFramebufferReadBufferEXT(int framebuffer, int mode) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFramebufferReadBufferEXT).invokeExact(framebuffer, mode);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetFramebufferParameterivEXT(int framebuffer, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetFramebufferParameterivEXT).invokeExact(framebuffer, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedCopyBufferSubDataEXT(int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedCopyBufferSubDataEXT).invokeExact(readBuffer, writeBuffer, readOffset, writeOffset, size);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedFramebufferTextureEXT(int framebuffer, int attachment, int texture, int level) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedFramebufferTextureEXT).invokeExact(framebuffer, attachment, texture, level);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedFramebufferTextureLayerEXT(int framebuffer, int attachment, int texture, int level, int layer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedFramebufferTextureLayerEXT).invokeExact(framebuffer, attachment, texture, level, layer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedFramebufferTextureFaceEXT(int framebuffer, int attachment, int texture, int level, int face) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedFramebufferTextureFaceEXT).invokeExact(framebuffer, attachment, texture, level, face);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureRenderbufferEXT(int texture, int target, int renderbuffer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureRenderbufferEXT).invokeExact(texture, target, renderbuffer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMultiTexRenderbufferEXT(int texunit, int target, int renderbuffer) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMultiTexRenderbufferEXT).invokeExact(texunit, target, renderbuffer);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexArrayVertexOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexArrayVertexOffsetEXT).invokeExact(vaobj, buffer, size, type, stride, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexArrayColorOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexArrayColorOffsetEXT).invokeExact(vaobj, buffer, size, type, stride, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexArrayEdgeFlagOffsetEXT(int vaobj, int buffer, int stride, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexArrayEdgeFlagOffsetEXT).invokeExact(vaobj, buffer, stride, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexArrayIndexOffsetEXT(int vaobj, int buffer, int type, int stride, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexArrayIndexOffsetEXT).invokeExact(vaobj, buffer, type, stride, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexArrayNormalOffsetEXT(int vaobj, int buffer, int type, int stride, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexArrayNormalOffsetEXT).invokeExact(vaobj, buffer, type, stride, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexArrayTexCoordOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexArrayTexCoordOffsetEXT).invokeExact(vaobj, buffer, size, type, stride, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexArrayMultiTexCoordOffsetEXT(int vaobj, int buffer, int texunit, int size, int type, int stride, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexArrayMultiTexCoordOffsetEXT).invokeExact(vaobj, buffer, texunit, size, type, stride, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexArrayFogCoordOffsetEXT(int vaobj, int buffer, int type, int stride, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexArrayFogCoordOffsetEXT).invokeExact(vaobj, buffer, type, stride, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexArraySecondaryColorOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexArraySecondaryColorOffsetEXT).invokeExact(vaobj, buffer, size, type, stride, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexArrayVertexAttribOffsetEXT(int vaobj, int buffer, int index, int size, int type, boolean normalized, int stride, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexArrayVertexAttribOffsetEXT).invokeExact(vaobj, buffer, index, size, type, normalized, stride, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexArrayVertexAttribIOffsetEXT(int vaobj, int buffer, int index, int size, int type, int stride, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexArrayVertexAttribIOffsetEXT).invokeExact(vaobj, buffer, index, size, type, stride, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glEnableVertexArrayEXT(int vaobj, int array) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glEnableVertexArrayEXT).invokeExact(vaobj, array);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDisableVertexArrayEXT(int vaobj, int array) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDisableVertexArrayEXT).invokeExact(vaobj, array);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glEnableVertexArrayAttribEXT(int vaobj, int index) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glEnableVertexArrayAttribEXT).invokeExact(vaobj, index);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDisableVertexArrayAttribEXT(int vaobj, int index) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDisableVertexArrayAttribEXT).invokeExact(vaobj, index);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVertexArrayIntegervEXT(int vaobj, int pname, @NativeType("GLint *") MemorySegment param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVertexArrayIntegervEXT).invokeExact(vaobj, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVertexArrayPointervEXT(int vaobj, int pname, @NativeType("void **") MemorySegment param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVertexArrayPointervEXT).invokeExact(vaobj, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVertexArrayIntegeri_vEXT(int vaobj, int index, int pname, @NativeType("GLint *") MemorySegment param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVertexArrayIntegeri_vEXT).invokeExact(vaobj, index, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetVertexArrayPointeri_vEXT(int vaobj, int index, int pname, @NativeType("void **") MemorySegment param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetVertexArrayPointeri_vEXT).invokeExact(vaobj, index, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glMapNamedBufferRangeEXT(int buffer, long offset, long length, int access) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMapNamedBufferRangeEXT).invokeExact(buffer, offset, length, access);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFlushMappedNamedBufferRangeEXT(int buffer, long offset, long length) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFlushMappedNamedBufferRangeEXT).invokeExact(buffer, offset, length);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedBufferStorageEXT(int buffer, long size, @NativeType("const void *") MemorySegment data, int flags) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedBufferStorageEXT).invokeExact(buffer, size, data, flags);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glClearNamedBufferDataEXT(int buffer, int internalformat, int format, int type, @NativeType("const void *") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glClearNamedBufferDataEXT).invokeExact(buffer, internalformat, format, type, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glClearNamedBufferSubDataEXT(int buffer, int internalformat, long offset, long size, int format, int type, @NativeType("const void *") MemorySegment data) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glClearNamedBufferSubDataEXT).invokeExact(buffer, internalformat, offset, size, format, type, data);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedFramebufferParameteriEXT(int framebuffer, int pname, int param) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedFramebufferParameteriEXT).invokeExact(framebuffer, pname, param);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetNamedFramebufferParameterivEXT(int framebuffer, int pname, @NativeType("GLint *") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetNamedFramebufferParameterivEXT).invokeExact(framebuffer, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform1dEXT(int program, int location, double x) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform1dEXT).invokeExact(program, location, x);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform2dEXT(int program, int location, double x, double y) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform2dEXT).invokeExact(program, location, x, y);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform3dEXT(int program, int location, double x, double y, double z) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform3dEXT).invokeExact(program, location, x, y, z);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform4dEXT(int program, int location, double x, double y, double z, double w) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform4dEXT).invokeExact(program, location, x, y, z, w);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform1dvEXT(int program, int location, int count, @NativeType("const GLdouble *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform1dvEXT).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform2dvEXT(int program, int location, int count, @NativeType("const GLdouble *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform2dvEXT).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform3dvEXT(int program, int location, int count, @NativeType("const GLdouble *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform3dvEXT).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniform4dvEXT(int program, int location, int count, @NativeType("const GLdouble *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniform4dvEXT).invokeExact(program, location, count, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniformMatrix2dvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLdouble *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniformMatrix2dvEXT).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniformMatrix3dvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLdouble *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniformMatrix3dvEXT).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniformMatrix4dvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLdouble *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniformMatrix4dvEXT).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniformMatrix2x3dvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLdouble *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniformMatrix2x3dvEXT).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniformMatrix2x4dvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLdouble *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniformMatrix2x4dvEXT).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniformMatrix3x2dvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLdouble *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniformMatrix3x2dvEXT).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniformMatrix3x4dvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLdouble *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniformMatrix3x4dvEXT).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniformMatrix4x2dvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLdouble *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniformMatrix4x2dvEXT).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glProgramUniformMatrix4x3dvEXT(int program, int location, int count, boolean transpose, @NativeType("const GLdouble *") MemorySegment value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glProgramUniformMatrix4x3dvEXT).invokeExact(program, location, count, transpose, value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureBufferRangeEXT(int texture, int target, int internalformat, int buffer, long offset, long size) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureBufferRangeEXT).invokeExact(texture, target, internalformat, buffer, offset, size);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureStorage1DEXT(int texture, int target, int levels, int internalformat, int width) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureStorage1DEXT).invokeExact(texture, target, levels, internalformat, width);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureStorage2DEXT(int texture, int target, int levels, int internalformat, int width, int height) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureStorage2DEXT).invokeExact(texture, target, levels, internalformat, width, height);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureStorage3DEXT(int texture, int target, int levels, int internalformat, int width, int height, int depth) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureStorage3DEXT).invokeExact(texture, target, levels, internalformat, width, height, depth);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureStorage2DMultisampleEXT(int texture, int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureStorage2DMultisampleEXT).invokeExact(texture, target, samples, internalformat, width, height, fixedsamplelocations);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTextureStorage3DMultisampleEXT(int texture, int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTextureStorage3DMultisampleEXT).invokeExact(texture, target, samples, internalformat, width, height, depth, fixedsamplelocations);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexArrayBindVertexBufferEXT(int vaobj, int bindingindex, int buffer, long offset, int stride) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexArrayBindVertexBufferEXT).invokeExact(vaobj, bindingindex, buffer, offset, stride);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexArrayVertexAttribFormatEXT(int vaobj, int attribindex, int size, int type, boolean normalized, int relativeoffset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexArrayVertexAttribFormatEXT).invokeExact(vaobj, attribindex, size, type, normalized, relativeoffset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexArrayVertexAttribIFormatEXT(int vaobj, int attribindex, int size, int type, int relativeoffset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexArrayVertexAttribIFormatEXT).invokeExact(vaobj, attribindex, size, type, relativeoffset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexArrayVertexAttribLFormatEXT(int vaobj, int attribindex, int size, int type, int relativeoffset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexArrayVertexAttribLFormatEXT).invokeExact(vaobj, attribindex, size, type, relativeoffset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexArrayVertexAttribBindingEXT(int vaobj, int attribindex, int bindingindex) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexArrayVertexAttribBindingEXT).invokeExact(vaobj, attribindex, bindingindex);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexArrayVertexBindingDivisorEXT(int vaobj, int bindingindex, int divisor) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexArrayVertexBindingDivisorEXT).invokeExact(vaobj, bindingindex, divisor);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexArrayVertexAttribLOffsetEXT(int vaobj, int buffer, int index, int size, int type, int stride, long offset) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexArrayVertexAttribLOffsetEXT).invokeExact(vaobj, buffer, index, size, type, stride, offset);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glTexturePageCommitmentEXT(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, boolean commit) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glTexturePageCommitmentEXT).invokeExact(texture, level, xoffset, yoffset, zoffset, width, height, depth, commit);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glVertexArrayVertexAttribDivisorEXT(int vaobj, int index, int divisor) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glVertexArrayVertexAttribDivisorEXT).invokeExact(vaobj, index, divisor);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}

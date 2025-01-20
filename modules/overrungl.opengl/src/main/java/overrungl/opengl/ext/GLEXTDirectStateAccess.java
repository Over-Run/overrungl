/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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
package overrungl.opengl.ext;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTDirectStateAccess {
    public static final int GL_PROGRAM_MATRIX_EXT = 0x8E2D;
    public static final int GL_TRANSPOSE_PROGRAM_MATRIX_EXT = 0x8E2E;
    public static final int GL_PROGRAM_MATRIX_STACK_DEPTH_EXT = 0x8E2F;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glMatrixLoadfEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMatrixLoaddEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMatrixMultfEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMatrixMultdEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMatrixLoadIdentityEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMatrixRotatefEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glMatrixRotatedEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glMatrixScalefEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glMatrixScaledEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glMatrixTranslatefEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glMatrixTranslatedEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glMatrixFrustumEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glMatrixOrthoEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glMatrixPopEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMatrixPushEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glClientAttribDefaultEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glPushClientAttribDefaultEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTextureParameterfEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glTextureParameterfvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTextureParameteriEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTextureParameterivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTextureImage1DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTextureImage2DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTextureSubImage1DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTextureSubImage2DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCopyTextureImage1DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glCopyTextureImage2DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glCopyTextureSubImage1DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glCopyTextureSubImage2DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetTextureImageEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetTextureParameterfvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetTextureParameterivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetTextureLevelParameterfvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetTextureLevelParameterivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTextureImage3DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTextureSubImage3DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCopyTextureSubImage3DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glBindMultiTextureEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMultiTexCoordPointerEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexEnvfEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glMultiTexEnvfvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexEnviEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMultiTexEnvivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexGendEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glMultiTexGendvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexGenfEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glMultiTexGenfvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexGeniEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMultiTexGenivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetMultiTexEnvfvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetMultiTexEnvivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetMultiTexGendvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetMultiTexGenfvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetMultiTexGenivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexParameteriEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMultiTexParameterivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexParameterfEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glMultiTexParameterfvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexImage1DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexImage2DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexSubImage1DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexSubImage2DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCopyMultiTexImage1DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glCopyMultiTexImage2DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glCopyMultiTexSubImage1DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glCopyMultiTexSubImage2DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetMultiTexImageEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetMultiTexParameterfvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetMultiTexParameterivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetMultiTexLevelParameterfvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetMultiTexLevelParameterivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexImage3DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexSubImage3DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCopyMultiTexSubImage3DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glEnableClientStateIndexedEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDisableClientStateIndexedEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetFloatIndexedvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetDoubleIndexedvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetPointerIndexedvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glEnableIndexedEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDisableIndexedEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glIsEnabledIndexedEXT = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetIntegerIndexedvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetBooleanIndexedvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCompressedTextureImage3DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCompressedTextureImage2DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCompressedTextureImage1DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCompressedTextureSubImage3DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCompressedTextureSubImage2DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCompressedTextureSubImage1DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetCompressedTextureImageEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCompressedMultiTexImage3DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCompressedMultiTexImage2DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCompressedMultiTexImage1DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCompressedMultiTexSubImage3DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCompressedMultiTexSubImage2DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCompressedMultiTexSubImage1DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetCompressedMultiTexImageEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMatrixLoadTransposefEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMatrixLoadTransposedEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMatrixMultTransposefEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMatrixMultTransposedEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glNamedBufferDataEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glNamedBufferSubDataEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMapNamedBufferEXT = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glUnmapNamedBufferEXT = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetNamedBufferParameterivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetNamedBufferPointervEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetNamedBufferSubDataEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform1fEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glProgramUniform2fEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glProgramUniform3fEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glProgramUniform4fEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glProgramUniform1iEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glProgramUniform2iEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glProgramUniform3iEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glProgramUniform4iEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glProgramUniform1fvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform2fvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform3fvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform4fvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform1ivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform2ivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform3ivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform4ivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix2fvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix3fvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix4fvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix2x3fvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix3x2fvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix2x4fvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix4x2fvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix3x4fvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix4x3fvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTextureBufferEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMultiTexBufferEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTextureParameterIivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTextureParameterIuivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetTextureParameterIivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetTextureParameterIuivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexParameterIivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMultiTexParameterIuivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetMultiTexParameterIivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetMultiTexParameterIuivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform1uiEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glProgramUniform2uiEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glProgramUniform3uiEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glProgramUniform4uiEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glProgramUniform1uivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform2uivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform3uivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform4uivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glNamedProgramLocalParameters4fvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glNamedProgramLocalParameterI4iEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glNamedProgramLocalParameterI4ivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glNamedProgramLocalParametersI4ivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glNamedProgramLocalParameterI4uiEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glNamedProgramLocalParameterI4uivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glNamedProgramLocalParametersI4uivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetNamedProgramLocalParameterIivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetNamedProgramLocalParameterIuivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glEnableClientStateiEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDisableClientStateiEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetFloati_vEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetDoublei_vEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetPointeri_vEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glNamedProgramStringEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glNamedProgramLocalParameter4dEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glNamedProgramLocalParameter4dvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glNamedProgramLocalParameter4fEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glNamedProgramLocalParameter4fvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetNamedProgramLocalParameterdvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetNamedProgramLocalParameterfvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetNamedProgramivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetNamedProgramStringEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glNamedRenderbufferStorageEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetNamedRenderbufferParameterivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glNamedRenderbufferStorageMultisampleEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glNamedRenderbufferStorageMultisampleCoverageEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glCheckNamedFramebufferStatusEXT = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glNamedFramebufferTexture1DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glNamedFramebufferTexture2DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glNamedFramebufferTexture3DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glNamedFramebufferRenderbufferEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetNamedFramebufferAttachmentParameterivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGenerateTextureMipmapEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGenerateMultiTexMipmapEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glFramebufferDrawBufferEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glFramebufferDrawBuffersEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glFramebufferReadBufferEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetFramebufferParameterivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glNamedCopyBufferSubDataEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glNamedFramebufferTextureEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glNamedFramebufferTextureLayerEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glNamedFramebufferTextureFaceEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTextureRenderbufferEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glMultiTexRenderbufferEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexArrayVertexOffsetEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glVertexArrayColorOffsetEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glVertexArrayEdgeFlagOffsetEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glVertexArrayIndexOffsetEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glVertexArrayNormalOffsetEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glVertexArrayTexCoordOffsetEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glVertexArrayMultiTexCoordOffsetEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glVertexArrayFogCoordOffsetEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glVertexArraySecondaryColorOffsetEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glVertexArrayVertexAttribOffsetEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glVertexArrayVertexAttribIOffsetEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glEnableVertexArrayEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDisableVertexArrayEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glEnableVertexArrayAttribEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glDisableVertexArrayAttribEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetVertexArrayIntegervEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetVertexArrayPointervEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetVertexArrayIntegeri_vEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetVertexArrayPointeri_vEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glMapNamedBufferRangeEXT = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glFlushMappedNamedBufferRangeEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glNamedBufferStorageEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glClearNamedBufferDataEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glClearNamedBufferSubDataEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glNamedFramebufferParameteriEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetNamedFramebufferParameterivEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform1dEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glProgramUniform2dEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glProgramUniform3dEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glProgramUniform4dEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
        public static final FunctionDescriptor FD_glProgramUniform1dvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform2dvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform3dvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniform4dvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix2dvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix3dvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix4dvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix2x3dvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix2x4dvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix3x2dvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix3x4dvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix4x2dvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glProgramUniformMatrix4x3dvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTextureBufferRangeEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glTextureStorage1DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTextureStorage2DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTextureStorage3DEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glTextureStorage2DMultisampleEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN);
        public static final FunctionDescriptor FD_glTextureStorage3DMultisampleEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN);
        public static final FunctionDescriptor FD_glVertexArrayBindVertexBufferEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexArrayVertexAttribFormatEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexArrayVertexAttribIFormatEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexArrayVertexAttribLFormatEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexArrayVertexAttribBindingEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexArrayVertexBindingDivisorEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glVertexArrayVertexAttribLOffsetEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG);
        public static final FunctionDescriptor FD_glTexturePageCommitmentEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN);
        public static final FunctionDescriptor FD_glVertexArrayVertexAttribDivisorEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    }
    public static final class Handles {
        public static final MethodHandle MH_glMatrixLoadfEXT = RuntimeHelper.downcall(Descriptors.FD_glMatrixLoadfEXT);
        public static final MethodHandle MH_glMatrixLoaddEXT = RuntimeHelper.downcall(Descriptors.FD_glMatrixLoaddEXT);
        public static final MethodHandle MH_glMatrixMultfEXT = RuntimeHelper.downcall(Descriptors.FD_glMatrixMultfEXT);
        public static final MethodHandle MH_glMatrixMultdEXT = RuntimeHelper.downcall(Descriptors.FD_glMatrixMultdEXT);
        public static final MethodHandle MH_glMatrixLoadIdentityEXT = RuntimeHelper.downcall(Descriptors.FD_glMatrixLoadIdentityEXT);
        public static final MethodHandle MH_glMatrixRotatefEXT = RuntimeHelper.downcall(Descriptors.FD_glMatrixRotatefEXT);
        public static final MethodHandle MH_glMatrixRotatedEXT = RuntimeHelper.downcall(Descriptors.FD_glMatrixRotatedEXT);
        public static final MethodHandle MH_glMatrixScalefEXT = RuntimeHelper.downcall(Descriptors.FD_glMatrixScalefEXT);
        public static final MethodHandle MH_glMatrixScaledEXT = RuntimeHelper.downcall(Descriptors.FD_glMatrixScaledEXT);
        public static final MethodHandle MH_glMatrixTranslatefEXT = RuntimeHelper.downcall(Descriptors.FD_glMatrixTranslatefEXT);
        public static final MethodHandle MH_glMatrixTranslatedEXT = RuntimeHelper.downcall(Descriptors.FD_glMatrixTranslatedEXT);
        public static final MethodHandle MH_glMatrixFrustumEXT = RuntimeHelper.downcall(Descriptors.FD_glMatrixFrustumEXT);
        public static final MethodHandle MH_glMatrixOrthoEXT = RuntimeHelper.downcall(Descriptors.FD_glMatrixOrthoEXT);
        public static final MethodHandle MH_glMatrixPopEXT = RuntimeHelper.downcall(Descriptors.FD_glMatrixPopEXT);
        public static final MethodHandle MH_glMatrixPushEXT = RuntimeHelper.downcall(Descriptors.FD_glMatrixPushEXT);
        public static final MethodHandle MH_glClientAttribDefaultEXT = RuntimeHelper.downcall(Descriptors.FD_glClientAttribDefaultEXT);
        public static final MethodHandle MH_glPushClientAttribDefaultEXT = RuntimeHelper.downcall(Descriptors.FD_glPushClientAttribDefaultEXT);
        public static final MethodHandle MH_glTextureParameterfEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureParameterfEXT);
        public static final MethodHandle MH_glTextureParameterfvEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureParameterfvEXT);
        public static final MethodHandle MH_glTextureParameteriEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureParameteriEXT);
        public static final MethodHandle MH_glTextureParameterivEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureParameterivEXT);
        public static final MethodHandle MH_glTextureImage1DEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureImage1DEXT);
        public static final MethodHandle MH_glTextureImage2DEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureImage2DEXT);
        public static final MethodHandle MH_glTextureSubImage1DEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureSubImage1DEXT);
        public static final MethodHandle MH_glTextureSubImage2DEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureSubImage2DEXT);
        public static final MethodHandle MH_glCopyTextureImage1DEXT = RuntimeHelper.downcall(Descriptors.FD_glCopyTextureImage1DEXT);
        public static final MethodHandle MH_glCopyTextureImage2DEXT = RuntimeHelper.downcall(Descriptors.FD_glCopyTextureImage2DEXT);
        public static final MethodHandle MH_glCopyTextureSubImage1DEXT = RuntimeHelper.downcall(Descriptors.FD_glCopyTextureSubImage1DEXT);
        public static final MethodHandle MH_glCopyTextureSubImage2DEXT = RuntimeHelper.downcall(Descriptors.FD_glCopyTextureSubImage2DEXT);
        public static final MethodHandle MH_glGetTextureImageEXT = RuntimeHelper.downcall(Descriptors.FD_glGetTextureImageEXT);
        public static final MethodHandle MH_glGetTextureParameterfvEXT = RuntimeHelper.downcall(Descriptors.FD_glGetTextureParameterfvEXT);
        public static final MethodHandle MH_glGetTextureParameterivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetTextureParameterivEXT);
        public static final MethodHandle MH_glGetTextureLevelParameterfvEXT = RuntimeHelper.downcall(Descriptors.FD_glGetTextureLevelParameterfvEXT);
        public static final MethodHandle MH_glGetTextureLevelParameterivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetTextureLevelParameterivEXT);
        public static final MethodHandle MH_glTextureImage3DEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureImage3DEXT);
        public static final MethodHandle MH_glTextureSubImage3DEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureSubImage3DEXT);
        public static final MethodHandle MH_glCopyTextureSubImage3DEXT = RuntimeHelper.downcall(Descriptors.FD_glCopyTextureSubImage3DEXT);
        public static final MethodHandle MH_glBindMultiTextureEXT = RuntimeHelper.downcall(Descriptors.FD_glBindMultiTextureEXT);
        public static final MethodHandle MH_glMultiTexCoordPointerEXT = RuntimeHelper.downcall(Descriptors.FD_glMultiTexCoordPointerEXT);
        public static final MethodHandle MH_glMultiTexEnvfEXT = RuntimeHelper.downcall(Descriptors.FD_glMultiTexEnvfEXT);
        public static final MethodHandle MH_glMultiTexEnvfvEXT = RuntimeHelper.downcall(Descriptors.FD_glMultiTexEnvfvEXT);
        public static final MethodHandle MH_glMultiTexEnviEXT = RuntimeHelper.downcall(Descriptors.FD_glMultiTexEnviEXT);
        public static final MethodHandle MH_glMultiTexEnvivEXT = RuntimeHelper.downcall(Descriptors.FD_glMultiTexEnvivEXT);
        public static final MethodHandle MH_glMultiTexGendEXT = RuntimeHelper.downcall(Descriptors.FD_glMultiTexGendEXT);
        public static final MethodHandle MH_glMultiTexGendvEXT = RuntimeHelper.downcall(Descriptors.FD_glMultiTexGendvEXT);
        public static final MethodHandle MH_glMultiTexGenfEXT = RuntimeHelper.downcall(Descriptors.FD_glMultiTexGenfEXT);
        public static final MethodHandle MH_glMultiTexGenfvEXT = RuntimeHelper.downcall(Descriptors.FD_glMultiTexGenfvEXT);
        public static final MethodHandle MH_glMultiTexGeniEXT = RuntimeHelper.downcall(Descriptors.FD_glMultiTexGeniEXT);
        public static final MethodHandle MH_glMultiTexGenivEXT = RuntimeHelper.downcall(Descriptors.FD_glMultiTexGenivEXT);
        public static final MethodHandle MH_glGetMultiTexEnvfvEXT = RuntimeHelper.downcall(Descriptors.FD_glGetMultiTexEnvfvEXT);
        public static final MethodHandle MH_glGetMultiTexEnvivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetMultiTexEnvivEXT);
        public static final MethodHandle MH_glGetMultiTexGendvEXT = RuntimeHelper.downcall(Descriptors.FD_glGetMultiTexGendvEXT);
        public static final MethodHandle MH_glGetMultiTexGenfvEXT = RuntimeHelper.downcall(Descriptors.FD_glGetMultiTexGenfvEXT);
        public static final MethodHandle MH_glGetMultiTexGenivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetMultiTexGenivEXT);
        public static final MethodHandle MH_glMultiTexParameteriEXT = RuntimeHelper.downcall(Descriptors.FD_glMultiTexParameteriEXT);
        public static final MethodHandle MH_glMultiTexParameterivEXT = RuntimeHelper.downcall(Descriptors.FD_glMultiTexParameterivEXT);
        public static final MethodHandle MH_glMultiTexParameterfEXT = RuntimeHelper.downcall(Descriptors.FD_glMultiTexParameterfEXT);
        public static final MethodHandle MH_glMultiTexParameterfvEXT = RuntimeHelper.downcall(Descriptors.FD_glMultiTexParameterfvEXT);
        public static final MethodHandle MH_glMultiTexImage1DEXT = RuntimeHelper.downcall(Descriptors.FD_glMultiTexImage1DEXT);
        public static final MethodHandle MH_glMultiTexImage2DEXT = RuntimeHelper.downcall(Descriptors.FD_glMultiTexImage2DEXT);
        public static final MethodHandle MH_glMultiTexSubImage1DEXT = RuntimeHelper.downcall(Descriptors.FD_glMultiTexSubImage1DEXT);
        public static final MethodHandle MH_glMultiTexSubImage2DEXT = RuntimeHelper.downcall(Descriptors.FD_glMultiTexSubImage2DEXT);
        public static final MethodHandle MH_glCopyMultiTexImage1DEXT = RuntimeHelper.downcall(Descriptors.FD_glCopyMultiTexImage1DEXT);
        public static final MethodHandle MH_glCopyMultiTexImage2DEXT = RuntimeHelper.downcall(Descriptors.FD_glCopyMultiTexImage2DEXT);
        public static final MethodHandle MH_glCopyMultiTexSubImage1DEXT = RuntimeHelper.downcall(Descriptors.FD_glCopyMultiTexSubImage1DEXT);
        public static final MethodHandle MH_glCopyMultiTexSubImage2DEXT = RuntimeHelper.downcall(Descriptors.FD_glCopyMultiTexSubImage2DEXT);
        public static final MethodHandle MH_glGetMultiTexImageEXT = RuntimeHelper.downcall(Descriptors.FD_glGetMultiTexImageEXT);
        public static final MethodHandle MH_glGetMultiTexParameterfvEXT = RuntimeHelper.downcall(Descriptors.FD_glGetMultiTexParameterfvEXT);
        public static final MethodHandle MH_glGetMultiTexParameterivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetMultiTexParameterivEXT);
        public static final MethodHandle MH_glGetMultiTexLevelParameterfvEXT = RuntimeHelper.downcall(Descriptors.FD_glGetMultiTexLevelParameterfvEXT);
        public static final MethodHandle MH_glGetMultiTexLevelParameterivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetMultiTexLevelParameterivEXT);
        public static final MethodHandle MH_glMultiTexImage3DEXT = RuntimeHelper.downcall(Descriptors.FD_glMultiTexImage3DEXT);
        public static final MethodHandle MH_glMultiTexSubImage3DEXT = RuntimeHelper.downcall(Descriptors.FD_glMultiTexSubImage3DEXT);
        public static final MethodHandle MH_glCopyMultiTexSubImage3DEXT = RuntimeHelper.downcall(Descriptors.FD_glCopyMultiTexSubImage3DEXT);
        public static final MethodHandle MH_glEnableClientStateIndexedEXT = RuntimeHelper.downcall(Descriptors.FD_glEnableClientStateIndexedEXT);
        public static final MethodHandle MH_glDisableClientStateIndexedEXT = RuntimeHelper.downcall(Descriptors.FD_glDisableClientStateIndexedEXT);
        public static final MethodHandle MH_glGetFloatIndexedvEXT = RuntimeHelper.downcall(Descriptors.FD_glGetFloatIndexedvEXT);
        public static final MethodHandle MH_glGetDoubleIndexedvEXT = RuntimeHelper.downcall(Descriptors.FD_glGetDoubleIndexedvEXT);
        public static final MethodHandle MH_glGetPointerIndexedvEXT = RuntimeHelper.downcall(Descriptors.FD_glGetPointerIndexedvEXT);
        public static final MethodHandle MH_glEnableIndexedEXT = RuntimeHelper.downcall(Descriptors.FD_glEnableIndexedEXT);
        public static final MethodHandle MH_glDisableIndexedEXT = RuntimeHelper.downcall(Descriptors.FD_glDisableIndexedEXT);
        public static final MethodHandle MH_glIsEnabledIndexedEXT = RuntimeHelper.downcall(Descriptors.FD_glIsEnabledIndexedEXT);
        public static final MethodHandle MH_glGetIntegerIndexedvEXT = RuntimeHelper.downcall(Descriptors.FD_glGetIntegerIndexedvEXT);
        public static final MethodHandle MH_glGetBooleanIndexedvEXT = RuntimeHelper.downcall(Descriptors.FD_glGetBooleanIndexedvEXT);
        public static final MethodHandle MH_glCompressedTextureImage3DEXT = RuntimeHelper.downcall(Descriptors.FD_glCompressedTextureImage3DEXT);
        public static final MethodHandle MH_glCompressedTextureImage2DEXT = RuntimeHelper.downcall(Descriptors.FD_glCompressedTextureImage2DEXT);
        public static final MethodHandle MH_glCompressedTextureImage1DEXT = RuntimeHelper.downcall(Descriptors.FD_glCompressedTextureImage1DEXT);
        public static final MethodHandle MH_glCompressedTextureSubImage3DEXT = RuntimeHelper.downcall(Descriptors.FD_glCompressedTextureSubImage3DEXT);
        public static final MethodHandle MH_glCompressedTextureSubImage2DEXT = RuntimeHelper.downcall(Descriptors.FD_glCompressedTextureSubImage2DEXT);
        public static final MethodHandle MH_glCompressedTextureSubImage1DEXT = RuntimeHelper.downcall(Descriptors.FD_glCompressedTextureSubImage1DEXT);
        public static final MethodHandle MH_glGetCompressedTextureImageEXT = RuntimeHelper.downcall(Descriptors.FD_glGetCompressedTextureImageEXT);
        public static final MethodHandle MH_glCompressedMultiTexImage3DEXT = RuntimeHelper.downcall(Descriptors.FD_glCompressedMultiTexImage3DEXT);
        public static final MethodHandle MH_glCompressedMultiTexImage2DEXT = RuntimeHelper.downcall(Descriptors.FD_glCompressedMultiTexImage2DEXT);
        public static final MethodHandle MH_glCompressedMultiTexImage1DEXT = RuntimeHelper.downcall(Descriptors.FD_glCompressedMultiTexImage1DEXT);
        public static final MethodHandle MH_glCompressedMultiTexSubImage3DEXT = RuntimeHelper.downcall(Descriptors.FD_glCompressedMultiTexSubImage3DEXT);
        public static final MethodHandle MH_glCompressedMultiTexSubImage2DEXT = RuntimeHelper.downcall(Descriptors.FD_glCompressedMultiTexSubImage2DEXT);
        public static final MethodHandle MH_glCompressedMultiTexSubImage1DEXT = RuntimeHelper.downcall(Descriptors.FD_glCompressedMultiTexSubImage1DEXT);
        public static final MethodHandle MH_glGetCompressedMultiTexImageEXT = RuntimeHelper.downcall(Descriptors.FD_glGetCompressedMultiTexImageEXT);
        public static final MethodHandle MH_glMatrixLoadTransposefEXT = RuntimeHelper.downcall(Descriptors.FD_glMatrixLoadTransposefEXT);
        public static final MethodHandle MH_glMatrixLoadTransposedEXT = RuntimeHelper.downcall(Descriptors.FD_glMatrixLoadTransposedEXT);
        public static final MethodHandle MH_glMatrixMultTransposefEXT = RuntimeHelper.downcall(Descriptors.FD_glMatrixMultTransposefEXT);
        public static final MethodHandle MH_glMatrixMultTransposedEXT = RuntimeHelper.downcall(Descriptors.FD_glMatrixMultTransposedEXT);
        public static final MethodHandle MH_glNamedBufferDataEXT = RuntimeHelper.downcall(Descriptors.FD_glNamedBufferDataEXT);
        public static final MethodHandle MH_glNamedBufferSubDataEXT = RuntimeHelper.downcall(Descriptors.FD_glNamedBufferSubDataEXT);
        public static final MethodHandle MH_glMapNamedBufferEXT = RuntimeHelper.downcall(Descriptors.FD_glMapNamedBufferEXT);
        public static final MethodHandle MH_glUnmapNamedBufferEXT = RuntimeHelper.downcall(Descriptors.FD_glUnmapNamedBufferEXT);
        public static final MethodHandle MH_glGetNamedBufferParameterivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetNamedBufferParameterivEXT);
        public static final MethodHandle MH_glGetNamedBufferPointervEXT = RuntimeHelper.downcall(Descriptors.FD_glGetNamedBufferPointervEXT);
        public static final MethodHandle MH_glGetNamedBufferSubDataEXT = RuntimeHelper.downcall(Descriptors.FD_glGetNamedBufferSubDataEXT);
        public static final MethodHandle MH_glProgramUniform1fEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform1fEXT);
        public static final MethodHandle MH_glProgramUniform2fEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform2fEXT);
        public static final MethodHandle MH_glProgramUniform3fEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform3fEXT);
        public static final MethodHandle MH_glProgramUniform4fEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform4fEXT);
        public static final MethodHandle MH_glProgramUniform1iEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform1iEXT);
        public static final MethodHandle MH_glProgramUniform2iEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform2iEXT);
        public static final MethodHandle MH_glProgramUniform3iEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform3iEXT);
        public static final MethodHandle MH_glProgramUniform4iEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform4iEXT);
        public static final MethodHandle MH_glProgramUniform1fvEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform1fvEXT);
        public static final MethodHandle MH_glProgramUniform2fvEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform2fvEXT);
        public static final MethodHandle MH_glProgramUniform3fvEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform3fvEXT);
        public static final MethodHandle MH_glProgramUniform4fvEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform4fvEXT);
        public static final MethodHandle MH_glProgramUniform1ivEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform1ivEXT);
        public static final MethodHandle MH_glProgramUniform2ivEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform2ivEXT);
        public static final MethodHandle MH_glProgramUniform3ivEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform3ivEXT);
        public static final MethodHandle MH_glProgramUniform4ivEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform4ivEXT);
        public static final MethodHandle MH_glProgramUniformMatrix2fvEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix2fvEXT);
        public static final MethodHandle MH_glProgramUniformMatrix3fvEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix3fvEXT);
        public static final MethodHandle MH_glProgramUniformMatrix4fvEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix4fvEXT);
        public static final MethodHandle MH_glProgramUniformMatrix2x3fvEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix2x3fvEXT);
        public static final MethodHandle MH_glProgramUniformMatrix3x2fvEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix3x2fvEXT);
        public static final MethodHandle MH_glProgramUniformMatrix2x4fvEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix2x4fvEXT);
        public static final MethodHandle MH_glProgramUniformMatrix4x2fvEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix4x2fvEXT);
        public static final MethodHandle MH_glProgramUniformMatrix3x4fvEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix3x4fvEXT);
        public static final MethodHandle MH_glProgramUniformMatrix4x3fvEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix4x3fvEXT);
        public static final MethodHandle MH_glTextureBufferEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureBufferEXT);
        public static final MethodHandle MH_glMultiTexBufferEXT = RuntimeHelper.downcall(Descriptors.FD_glMultiTexBufferEXT);
        public static final MethodHandle MH_glTextureParameterIivEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureParameterIivEXT);
        public static final MethodHandle MH_glTextureParameterIuivEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureParameterIuivEXT);
        public static final MethodHandle MH_glGetTextureParameterIivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetTextureParameterIivEXT);
        public static final MethodHandle MH_glGetTextureParameterIuivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetTextureParameterIuivEXT);
        public static final MethodHandle MH_glMultiTexParameterIivEXT = RuntimeHelper.downcall(Descriptors.FD_glMultiTexParameterIivEXT);
        public static final MethodHandle MH_glMultiTexParameterIuivEXT = RuntimeHelper.downcall(Descriptors.FD_glMultiTexParameterIuivEXT);
        public static final MethodHandle MH_glGetMultiTexParameterIivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetMultiTexParameterIivEXT);
        public static final MethodHandle MH_glGetMultiTexParameterIuivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetMultiTexParameterIuivEXT);
        public static final MethodHandle MH_glProgramUniform1uiEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform1uiEXT);
        public static final MethodHandle MH_glProgramUniform2uiEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform2uiEXT);
        public static final MethodHandle MH_glProgramUniform3uiEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform3uiEXT);
        public static final MethodHandle MH_glProgramUniform4uiEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform4uiEXT);
        public static final MethodHandle MH_glProgramUniform1uivEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform1uivEXT);
        public static final MethodHandle MH_glProgramUniform2uivEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform2uivEXT);
        public static final MethodHandle MH_glProgramUniform3uivEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform3uivEXT);
        public static final MethodHandle MH_glProgramUniform4uivEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform4uivEXT);
        public static final MethodHandle MH_glNamedProgramLocalParameters4fvEXT = RuntimeHelper.downcall(Descriptors.FD_glNamedProgramLocalParameters4fvEXT);
        public static final MethodHandle MH_glNamedProgramLocalParameterI4iEXT = RuntimeHelper.downcall(Descriptors.FD_glNamedProgramLocalParameterI4iEXT);
        public static final MethodHandle MH_glNamedProgramLocalParameterI4ivEXT = RuntimeHelper.downcall(Descriptors.FD_glNamedProgramLocalParameterI4ivEXT);
        public static final MethodHandle MH_glNamedProgramLocalParametersI4ivEXT = RuntimeHelper.downcall(Descriptors.FD_glNamedProgramLocalParametersI4ivEXT);
        public static final MethodHandle MH_glNamedProgramLocalParameterI4uiEXT = RuntimeHelper.downcall(Descriptors.FD_glNamedProgramLocalParameterI4uiEXT);
        public static final MethodHandle MH_glNamedProgramLocalParameterI4uivEXT = RuntimeHelper.downcall(Descriptors.FD_glNamedProgramLocalParameterI4uivEXT);
        public static final MethodHandle MH_glNamedProgramLocalParametersI4uivEXT = RuntimeHelper.downcall(Descriptors.FD_glNamedProgramLocalParametersI4uivEXT);
        public static final MethodHandle MH_glGetNamedProgramLocalParameterIivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetNamedProgramLocalParameterIivEXT);
        public static final MethodHandle MH_glGetNamedProgramLocalParameterIuivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetNamedProgramLocalParameterIuivEXT);
        public static final MethodHandle MH_glEnableClientStateiEXT = RuntimeHelper.downcall(Descriptors.FD_glEnableClientStateiEXT);
        public static final MethodHandle MH_glDisableClientStateiEXT = RuntimeHelper.downcall(Descriptors.FD_glDisableClientStateiEXT);
        public static final MethodHandle MH_glGetFloati_vEXT = RuntimeHelper.downcall(Descriptors.FD_glGetFloati_vEXT);
        public static final MethodHandle MH_glGetDoublei_vEXT = RuntimeHelper.downcall(Descriptors.FD_glGetDoublei_vEXT);
        public static final MethodHandle MH_glGetPointeri_vEXT = RuntimeHelper.downcall(Descriptors.FD_glGetPointeri_vEXT);
        public static final MethodHandle MH_glNamedProgramStringEXT = RuntimeHelper.downcall(Descriptors.FD_glNamedProgramStringEXT);
        public static final MethodHandle MH_glNamedProgramLocalParameter4dEXT = RuntimeHelper.downcall(Descriptors.FD_glNamedProgramLocalParameter4dEXT);
        public static final MethodHandle MH_glNamedProgramLocalParameter4dvEXT = RuntimeHelper.downcall(Descriptors.FD_glNamedProgramLocalParameter4dvEXT);
        public static final MethodHandle MH_glNamedProgramLocalParameter4fEXT = RuntimeHelper.downcall(Descriptors.FD_glNamedProgramLocalParameter4fEXT);
        public static final MethodHandle MH_glNamedProgramLocalParameter4fvEXT = RuntimeHelper.downcall(Descriptors.FD_glNamedProgramLocalParameter4fvEXT);
        public static final MethodHandle MH_glGetNamedProgramLocalParameterdvEXT = RuntimeHelper.downcall(Descriptors.FD_glGetNamedProgramLocalParameterdvEXT);
        public static final MethodHandle MH_glGetNamedProgramLocalParameterfvEXT = RuntimeHelper.downcall(Descriptors.FD_glGetNamedProgramLocalParameterfvEXT);
        public static final MethodHandle MH_glGetNamedProgramivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetNamedProgramivEXT);
        public static final MethodHandle MH_glGetNamedProgramStringEXT = RuntimeHelper.downcall(Descriptors.FD_glGetNamedProgramStringEXT);
        public static final MethodHandle MH_glNamedRenderbufferStorageEXT = RuntimeHelper.downcall(Descriptors.FD_glNamedRenderbufferStorageEXT);
        public static final MethodHandle MH_glGetNamedRenderbufferParameterivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetNamedRenderbufferParameterivEXT);
        public static final MethodHandle MH_glNamedRenderbufferStorageMultisampleEXT = RuntimeHelper.downcall(Descriptors.FD_glNamedRenderbufferStorageMultisampleEXT);
        public static final MethodHandle MH_glNamedRenderbufferStorageMultisampleCoverageEXT = RuntimeHelper.downcall(Descriptors.FD_glNamedRenderbufferStorageMultisampleCoverageEXT);
        public static final MethodHandle MH_glCheckNamedFramebufferStatusEXT = RuntimeHelper.downcall(Descriptors.FD_glCheckNamedFramebufferStatusEXT);
        public static final MethodHandle MH_glNamedFramebufferTexture1DEXT = RuntimeHelper.downcall(Descriptors.FD_glNamedFramebufferTexture1DEXT);
        public static final MethodHandle MH_glNamedFramebufferTexture2DEXT = RuntimeHelper.downcall(Descriptors.FD_glNamedFramebufferTexture2DEXT);
        public static final MethodHandle MH_glNamedFramebufferTexture3DEXT = RuntimeHelper.downcall(Descriptors.FD_glNamedFramebufferTexture3DEXT);
        public static final MethodHandle MH_glNamedFramebufferRenderbufferEXT = RuntimeHelper.downcall(Descriptors.FD_glNamedFramebufferRenderbufferEXT);
        public static final MethodHandle MH_glGetNamedFramebufferAttachmentParameterivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetNamedFramebufferAttachmentParameterivEXT);
        public static final MethodHandle MH_glGenerateTextureMipmapEXT = RuntimeHelper.downcall(Descriptors.FD_glGenerateTextureMipmapEXT);
        public static final MethodHandle MH_glGenerateMultiTexMipmapEXT = RuntimeHelper.downcall(Descriptors.FD_glGenerateMultiTexMipmapEXT);
        public static final MethodHandle MH_glFramebufferDrawBufferEXT = RuntimeHelper.downcall(Descriptors.FD_glFramebufferDrawBufferEXT);
        public static final MethodHandle MH_glFramebufferDrawBuffersEXT = RuntimeHelper.downcall(Descriptors.FD_glFramebufferDrawBuffersEXT);
        public static final MethodHandle MH_glFramebufferReadBufferEXT = RuntimeHelper.downcall(Descriptors.FD_glFramebufferReadBufferEXT);
        public static final MethodHandle MH_glGetFramebufferParameterivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetFramebufferParameterivEXT);
        public static final MethodHandle MH_glNamedCopyBufferSubDataEXT = RuntimeHelper.downcall(Descriptors.FD_glNamedCopyBufferSubDataEXT);
        public static final MethodHandle MH_glNamedFramebufferTextureEXT = RuntimeHelper.downcall(Descriptors.FD_glNamedFramebufferTextureEXT);
        public static final MethodHandle MH_glNamedFramebufferTextureLayerEXT = RuntimeHelper.downcall(Descriptors.FD_glNamedFramebufferTextureLayerEXT);
        public static final MethodHandle MH_glNamedFramebufferTextureFaceEXT = RuntimeHelper.downcall(Descriptors.FD_glNamedFramebufferTextureFaceEXT);
        public static final MethodHandle MH_glTextureRenderbufferEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureRenderbufferEXT);
        public static final MethodHandle MH_glMultiTexRenderbufferEXT = RuntimeHelper.downcall(Descriptors.FD_glMultiTexRenderbufferEXT);
        public static final MethodHandle MH_glVertexArrayVertexOffsetEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexArrayVertexOffsetEXT);
        public static final MethodHandle MH_glVertexArrayColorOffsetEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexArrayColorOffsetEXT);
        public static final MethodHandle MH_glVertexArrayEdgeFlagOffsetEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexArrayEdgeFlagOffsetEXT);
        public static final MethodHandle MH_glVertexArrayIndexOffsetEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexArrayIndexOffsetEXT);
        public static final MethodHandle MH_glVertexArrayNormalOffsetEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexArrayNormalOffsetEXT);
        public static final MethodHandle MH_glVertexArrayTexCoordOffsetEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexArrayTexCoordOffsetEXT);
        public static final MethodHandle MH_glVertexArrayMultiTexCoordOffsetEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexArrayMultiTexCoordOffsetEXT);
        public static final MethodHandle MH_glVertexArrayFogCoordOffsetEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexArrayFogCoordOffsetEXT);
        public static final MethodHandle MH_glVertexArraySecondaryColorOffsetEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexArraySecondaryColorOffsetEXT);
        public static final MethodHandle MH_glVertexArrayVertexAttribOffsetEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexArrayVertexAttribOffsetEXT);
        public static final MethodHandle MH_glVertexArrayVertexAttribIOffsetEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexArrayVertexAttribIOffsetEXT);
        public static final MethodHandle MH_glEnableVertexArrayEXT = RuntimeHelper.downcall(Descriptors.FD_glEnableVertexArrayEXT);
        public static final MethodHandle MH_glDisableVertexArrayEXT = RuntimeHelper.downcall(Descriptors.FD_glDisableVertexArrayEXT);
        public static final MethodHandle MH_glEnableVertexArrayAttribEXT = RuntimeHelper.downcall(Descriptors.FD_glEnableVertexArrayAttribEXT);
        public static final MethodHandle MH_glDisableVertexArrayAttribEXT = RuntimeHelper.downcall(Descriptors.FD_glDisableVertexArrayAttribEXT);
        public static final MethodHandle MH_glGetVertexArrayIntegervEXT = RuntimeHelper.downcall(Descriptors.FD_glGetVertexArrayIntegervEXT);
        public static final MethodHandle MH_glGetVertexArrayPointervEXT = RuntimeHelper.downcall(Descriptors.FD_glGetVertexArrayPointervEXT);
        public static final MethodHandle MH_glGetVertexArrayIntegeri_vEXT = RuntimeHelper.downcall(Descriptors.FD_glGetVertexArrayIntegeri_vEXT);
        public static final MethodHandle MH_glGetVertexArrayPointeri_vEXT = RuntimeHelper.downcall(Descriptors.FD_glGetVertexArrayPointeri_vEXT);
        public static final MethodHandle MH_glMapNamedBufferRangeEXT = RuntimeHelper.downcall(Descriptors.FD_glMapNamedBufferRangeEXT);
        public static final MethodHandle MH_glFlushMappedNamedBufferRangeEXT = RuntimeHelper.downcall(Descriptors.FD_glFlushMappedNamedBufferRangeEXT);
        public static final MethodHandle MH_glNamedBufferStorageEXT = RuntimeHelper.downcall(Descriptors.FD_glNamedBufferStorageEXT);
        public static final MethodHandle MH_glClearNamedBufferDataEXT = RuntimeHelper.downcall(Descriptors.FD_glClearNamedBufferDataEXT);
        public static final MethodHandle MH_glClearNamedBufferSubDataEXT = RuntimeHelper.downcall(Descriptors.FD_glClearNamedBufferSubDataEXT);
        public static final MethodHandle MH_glNamedFramebufferParameteriEXT = RuntimeHelper.downcall(Descriptors.FD_glNamedFramebufferParameteriEXT);
        public static final MethodHandle MH_glGetNamedFramebufferParameterivEXT = RuntimeHelper.downcall(Descriptors.FD_glGetNamedFramebufferParameterivEXT);
        public static final MethodHandle MH_glProgramUniform1dEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform1dEXT);
        public static final MethodHandle MH_glProgramUniform2dEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform2dEXT);
        public static final MethodHandle MH_glProgramUniform3dEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform3dEXT);
        public static final MethodHandle MH_glProgramUniform4dEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform4dEXT);
        public static final MethodHandle MH_glProgramUniform1dvEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform1dvEXT);
        public static final MethodHandle MH_glProgramUniform2dvEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform2dvEXT);
        public static final MethodHandle MH_glProgramUniform3dvEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform3dvEXT);
        public static final MethodHandle MH_glProgramUniform4dvEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniform4dvEXT);
        public static final MethodHandle MH_glProgramUniformMatrix2dvEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix2dvEXT);
        public static final MethodHandle MH_glProgramUniformMatrix3dvEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix3dvEXT);
        public static final MethodHandle MH_glProgramUniformMatrix4dvEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix4dvEXT);
        public static final MethodHandle MH_glProgramUniformMatrix2x3dvEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix2x3dvEXT);
        public static final MethodHandle MH_glProgramUniformMatrix2x4dvEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix2x4dvEXT);
        public static final MethodHandle MH_glProgramUniformMatrix3x2dvEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix3x2dvEXT);
        public static final MethodHandle MH_glProgramUniformMatrix3x4dvEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix3x4dvEXT);
        public static final MethodHandle MH_glProgramUniformMatrix4x2dvEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix4x2dvEXT);
        public static final MethodHandle MH_glProgramUniformMatrix4x3dvEXT = RuntimeHelper.downcall(Descriptors.FD_glProgramUniformMatrix4x3dvEXT);
        public static final MethodHandle MH_glTextureBufferRangeEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureBufferRangeEXT);
        public static final MethodHandle MH_glTextureStorage1DEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureStorage1DEXT);
        public static final MethodHandle MH_glTextureStorage2DEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureStorage2DEXT);
        public static final MethodHandle MH_glTextureStorage3DEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureStorage3DEXT);
        public static final MethodHandle MH_glTextureStorage2DMultisampleEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureStorage2DMultisampleEXT);
        public static final MethodHandle MH_glTextureStorage3DMultisampleEXT = RuntimeHelper.downcall(Descriptors.FD_glTextureStorage3DMultisampleEXT);
        public static final MethodHandle MH_glVertexArrayBindVertexBufferEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexArrayBindVertexBufferEXT);
        public static final MethodHandle MH_glVertexArrayVertexAttribFormatEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexArrayVertexAttribFormatEXT);
        public static final MethodHandle MH_glVertexArrayVertexAttribIFormatEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexArrayVertexAttribIFormatEXT);
        public static final MethodHandle MH_glVertexArrayVertexAttribLFormatEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexArrayVertexAttribLFormatEXT);
        public static final MethodHandle MH_glVertexArrayVertexAttribBindingEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexArrayVertexAttribBindingEXT);
        public static final MethodHandle MH_glVertexArrayVertexBindingDivisorEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexArrayVertexBindingDivisorEXT);
        public static final MethodHandle MH_glVertexArrayVertexAttribLOffsetEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexArrayVertexAttribLOffsetEXT);
        public static final MethodHandle MH_glTexturePageCommitmentEXT = RuntimeHelper.downcall(Descriptors.FD_glTexturePageCommitmentEXT);
        public static final MethodHandle MH_glVertexArrayVertexAttribDivisorEXT = RuntimeHelper.downcall(Descriptors.FD_glVertexArrayVertexAttribDivisorEXT);
        public final MemorySegment PFN_glMatrixLoadfEXT;
        public final MemorySegment PFN_glMatrixLoaddEXT;
        public final MemorySegment PFN_glMatrixMultfEXT;
        public final MemorySegment PFN_glMatrixMultdEXT;
        public final MemorySegment PFN_glMatrixLoadIdentityEXT;
        public final MemorySegment PFN_glMatrixRotatefEXT;
        public final MemorySegment PFN_glMatrixRotatedEXT;
        public final MemorySegment PFN_glMatrixScalefEXT;
        public final MemorySegment PFN_glMatrixScaledEXT;
        public final MemorySegment PFN_glMatrixTranslatefEXT;
        public final MemorySegment PFN_glMatrixTranslatedEXT;
        public final MemorySegment PFN_glMatrixFrustumEXT;
        public final MemorySegment PFN_glMatrixOrthoEXT;
        public final MemorySegment PFN_glMatrixPopEXT;
        public final MemorySegment PFN_glMatrixPushEXT;
        public final MemorySegment PFN_glClientAttribDefaultEXT;
        public final MemorySegment PFN_glPushClientAttribDefaultEXT;
        public final MemorySegment PFN_glTextureParameterfEXT;
        public final MemorySegment PFN_glTextureParameterfvEXT;
        public final MemorySegment PFN_glTextureParameteriEXT;
        public final MemorySegment PFN_glTextureParameterivEXT;
        public final MemorySegment PFN_glTextureImage1DEXT;
        public final MemorySegment PFN_glTextureImage2DEXT;
        public final MemorySegment PFN_glTextureSubImage1DEXT;
        public final MemorySegment PFN_glTextureSubImage2DEXT;
        public final MemorySegment PFN_glCopyTextureImage1DEXT;
        public final MemorySegment PFN_glCopyTextureImage2DEXT;
        public final MemorySegment PFN_glCopyTextureSubImage1DEXT;
        public final MemorySegment PFN_glCopyTextureSubImage2DEXT;
        public final MemorySegment PFN_glGetTextureImageEXT;
        public final MemorySegment PFN_glGetTextureParameterfvEXT;
        public final MemorySegment PFN_glGetTextureParameterivEXT;
        public final MemorySegment PFN_glGetTextureLevelParameterfvEXT;
        public final MemorySegment PFN_glGetTextureLevelParameterivEXT;
        public final MemorySegment PFN_glTextureImage3DEXT;
        public final MemorySegment PFN_glTextureSubImage3DEXT;
        public final MemorySegment PFN_glCopyTextureSubImage3DEXT;
        public final MemorySegment PFN_glBindMultiTextureEXT;
        public final MemorySegment PFN_glMultiTexCoordPointerEXT;
        public final MemorySegment PFN_glMultiTexEnvfEXT;
        public final MemorySegment PFN_glMultiTexEnvfvEXT;
        public final MemorySegment PFN_glMultiTexEnviEXT;
        public final MemorySegment PFN_glMultiTexEnvivEXT;
        public final MemorySegment PFN_glMultiTexGendEXT;
        public final MemorySegment PFN_glMultiTexGendvEXT;
        public final MemorySegment PFN_glMultiTexGenfEXT;
        public final MemorySegment PFN_glMultiTexGenfvEXT;
        public final MemorySegment PFN_glMultiTexGeniEXT;
        public final MemorySegment PFN_glMultiTexGenivEXT;
        public final MemorySegment PFN_glGetMultiTexEnvfvEXT;
        public final MemorySegment PFN_glGetMultiTexEnvivEXT;
        public final MemorySegment PFN_glGetMultiTexGendvEXT;
        public final MemorySegment PFN_glGetMultiTexGenfvEXT;
        public final MemorySegment PFN_glGetMultiTexGenivEXT;
        public final MemorySegment PFN_glMultiTexParameteriEXT;
        public final MemorySegment PFN_glMultiTexParameterivEXT;
        public final MemorySegment PFN_glMultiTexParameterfEXT;
        public final MemorySegment PFN_glMultiTexParameterfvEXT;
        public final MemorySegment PFN_glMultiTexImage1DEXT;
        public final MemorySegment PFN_glMultiTexImage2DEXT;
        public final MemorySegment PFN_glMultiTexSubImage1DEXT;
        public final MemorySegment PFN_glMultiTexSubImage2DEXT;
        public final MemorySegment PFN_glCopyMultiTexImage1DEXT;
        public final MemorySegment PFN_glCopyMultiTexImage2DEXT;
        public final MemorySegment PFN_glCopyMultiTexSubImage1DEXT;
        public final MemorySegment PFN_glCopyMultiTexSubImage2DEXT;
        public final MemorySegment PFN_glGetMultiTexImageEXT;
        public final MemorySegment PFN_glGetMultiTexParameterfvEXT;
        public final MemorySegment PFN_glGetMultiTexParameterivEXT;
        public final MemorySegment PFN_glGetMultiTexLevelParameterfvEXT;
        public final MemorySegment PFN_glGetMultiTexLevelParameterivEXT;
        public final MemorySegment PFN_glMultiTexImage3DEXT;
        public final MemorySegment PFN_glMultiTexSubImage3DEXT;
        public final MemorySegment PFN_glCopyMultiTexSubImage3DEXT;
        public final MemorySegment PFN_glEnableClientStateIndexedEXT;
        public final MemorySegment PFN_glDisableClientStateIndexedEXT;
        public final MemorySegment PFN_glGetFloatIndexedvEXT;
        public final MemorySegment PFN_glGetDoubleIndexedvEXT;
        public final MemorySegment PFN_glGetPointerIndexedvEXT;
        public final MemorySegment PFN_glEnableIndexedEXT;
        public final MemorySegment PFN_glDisableIndexedEXT;
        public final MemorySegment PFN_glIsEnabledIndexedEXT;
        public final MemorySegment PFN_glGetIntegerIndexedvEXT;
        public final MemorySegment PFN_glGetBooleanIndexedvEXT;
        public final MemorySegment PFN_glCompressedTextureImage3DEXT;
        public final MemorySegment PFN_glCompressedTextureImage2DEXT;
        public final MemorySegment PFN_glCompressedTextureImage1DEXT;
        public final MemorySegment PFN_glCompressedTextureSubImage3DEXT;
        public final MemorySegment PFN_glCompressedTextureSubImage2DEXT;
        public final MemorySegment PFN_glCompressedTextureSubImage1DEXT;
        public final MemorySegment PFN_glGetCompressedTextureImageEXT;
        public final MemorySegment PFN_glCompressedMultiTexImage3DEXT;
        public final MemorySegment PFN_glCompressedMultiTexImage2DEXT;
        public final MemorySegment PFN_glCompressedMultiTexImage1DEXT;
        public final MemorySegment PFN_glCompressedMultiTexSubImage3DEXT;
        public final MemorySegment PFN_glCompressedMultiTexSubImage2DEXT;
        public final MemorySegment PFN_glCompressedMultiTexSubImage1DEXT;
        public final MemorySegment PFN_glGetCompressedMultiTexImageEXT;
        public final MemorySegment PFN_glMatrixLoadTransposefEXT;
        public final MemorySegment PFN_glMatrixLoadTransposedEXT;
        public final MemorySegment PFN_glMatrixMultTransposefEXT;
        public final MemorySegment PFN_glMatrixMultTransposedEXT;
        public final MemorySegment PFN_glNamedBufferDataEXT;
        public final MemorySegment PFN_glNamedBufferSubDataEXT;
        public final MemorySegment PFN_glMapNamedBufferEXT;
        public final MemorySegment PFN_glUnmapNamedBufferEXT;
        public final MemorySegment PFN_glGetNamedBufferParameterivEXT;
        public final MemorySegment PFN_glGetNamedBufferPointervEXT;
        public final MemorySegment PFN_glGetNamedBufferSubDataEXT;
        public final MemorySegment PFN_glProgramUniform1fEXT;
        public final MemorySegment PFN_glProgramUniform2fEXT;
        public final MemorySegment PFN_glProgramUniform3fEXT;
        public final MemorySegment PFN_glProgramUniform4fEXT;
        public final MemorySegment PFN_glProgramUniform1iEXT;
        public final MemorySegment PFN_glProgramUniform2iEXT;
        public final MemorySegment PFN_glProgramUniform3iEXT;
        public final MemorySegment PFN_glProgramUniform4iEXT;
        public final MemorySegment PFN_glProgramUniform1fvEXT;
        public final MemorySegment PFN_glProgramUniform2fvEXT;
        public final MemorySegment PFN_glProgramUniform3fvEXT;
        public final MemorySegment PFN_glProgramUniform4fvEXT;
        public final MemorySegment PFN_glProgramUniform1ivEXT;
        public final MemorySegment PFN_glProgramUniform2ivEXT;
        public final MemorySegment PFN_glProgramUniform3ivEXT;
        public final MemorySegment PFN_glProgramUniform4ivEXT;
        public final MemorySegment PFN_glProgramUniformMatrix2fvEXT;
        public final MemorySegment PFN_glProgramUniformMatrix3fvEXT;
        public final MemorySegment PFN_glProgramUniformMatrix4fvEXT;
        public final MemorySegment PFN_glProgramUniformMatrix2x3fvEXT;
        public final MemorySegment PFN_glProgramUniformMatrix3x2fvEXT;
        public final MemorySegment PFN_glProgramUniformMatrix2x4fvEXT;
        public final MemorySegment PFN_glProgramUniformMatrix4x2fvEXT;
        public final MemorySegment PFN_glProgramUniformMatrix3x4fvEXT;
        public final MemorySegment PFN_glProgramUniformMatrix4x3fvEXT;
        public final MemorySegment PFN_glTextureBufferEXT;
        public final MemorySegment PFN_glMultiTexBufferEXT;
        public final MemorySegment PFN_glTextureParameterIivEXT;
        public final MemorySegment PFN_glTextureParameterIuivEXT;
        public final MemorySegment PFN_glGetTextureParameterIivEXT;
        public final MemorySegment PFN_glGetTextureParameterIuivEXT;
        public final MemorySegment PFN_glMultiTexParameterIivEXT;
        public final MemorySegment PFN_glMultiTexParameterIuivEXT;
        public final MemorySegment PFN_glGetMultiTexParameterIivEXT;
        public final MemorySegment PFN_glGetMultiTexParameterIuivEXT;
        public final MemorySegment PFN_glProgramUniform1uiEXT;
        public final MemorySegment PFN_glProgramUniform2uiEXT;
        public final MemorySegment PFN_glProgramUniform3uiEXT;
        public final MemorySegment PFN_glProgramUniform4uiEXT;
        public final MemorySegment PFN_glProgramUniform1uivEXT;
        public final MemorySegment PFN_glProgramUniform2uivEXT;
        public final MemorySegment PFN_glProgramUniform3uivEXT;
        public final MemorySegment PFN_glProgramUniform4uivEXT;
        public final MemorySegment PFN_glNamedProgramLocalParameters4fvEXT;
        public final MemorySegment PFN_glNamedProgramLocalParameterI4iEXT;
        public final MemorySegment PFN_glNamedProgramLocalParameterI4ivEXT;
        public final MemorySegment PFN_glNamedProgramLocalParametersI4ivEXT;
        public final MemorySegment PFN_glNamedProgramLocalParameterI4uiEXT;
        public final MemorySegment PFN_glNamedProgramLocalParameterI4uivEXT;
        public final MemorySegment PFN_glNamedProgramLocalParametersI4uivEXT;
        public final MemorySegment PFN_glGetNamedProgramLocalParameterIivEXT;
        public final MemorySegment PFN_glGetNamedProgramLocalParameterIuivEXT;
        public final MemorySegment PFN_glEnableClientStateiEXT;
        public final MemorySegment PFN_glDisableClientStateiEXT;
        public final MemorySegment PFN_glGetFloati_vEXT;
        public final MemorySegment PFN_glGetDoublei_vEXT;
        public final MemorySegment PFN_glGetPointeri_vEXT;
        public final MemorySegment PFN_glNamedProgramStringEXT;
        public final MemorySegment PFN_glNamedProgramLocalParameter4dEXT;
        public final MemorySegment PFN_glNamedProgramLocalParameter4dvEXT;
        public final MemorySegment PFN_glNamedProgramLocalParameter4fEXT;
        public final MemorySegment PFN_glNamedProgramLocalParameter4fvEXT;
        public final MemorySegment PFN_glGetNamedProgramLocalParameterdvEXT;
        public final MemorySegment PFN_glGetNamedProgramLocalParameterfvEXT;
        public final MemorySegment PFN_glGetNamedProgramivEXT;
        public final MemorySegment PFN_glGetNamedProgramStringEXT;
        public final MemorySegment PFN_glNamedRenderbufferStorageEXT;
        public final MemorySegment PFN_glGetNamedRenderbufferParameterivEXT;
        public final MemorySegment PFN_glNamedRenderbufferStorageMultisampleEXT;
        public final MemorySegment PFN_glNamedRenderbufferStorageMultisampleCoverageEXT;
        public final MemorySegment PFN_glCheckNamedFramebufferStatusEXT;
        public final MemorySegment PFN_glNamedFramebufferTexture1DEXT;
        public final MemorySegment PFN_glNamedFramebufferTexture2DEXT;
        public final MemorySegment PFN_glNamedFramebufferTexture3DEXT;
        public final MemorySegment PFN_glNamedFramebufferRenderbufferEXT;
        public final MemorySegment PFN_glGetNamedFramebufferAttachmentParameterivEXT;
        public final MemorySegment PFN_glGenerateTextureMipmapEXT;
        public final MemorySegment PFN_glGenerateMultiTexMipmapEXT;
        public final MemorySegment PFN_glFramebufferDrawBufferEXT;
        public final MemorySegment PFN_glFramebufferDrawBuffersEXT;
        public final MemorySegment PFN_glFramebufferReadBufferEXT;
        public final MemorySegment PFN_glGetFramebufferParameterivEXT;
        public final MemorySegment PFN_glNamedCopyBufferSubDataEXT;
        public final MemorySegment PFN_glNamedFramebufferTextureEXT;
        public final MemorySegment PFN_glNamedFramebufferTextureLayerEXT;
        public final MemorySegment PFN_glNamedFramebufferTextureFaceEXT;
        public final MemorySegment PFN_glTextureRenderbufferEXT;
        public final MemorySegment PFN_glMultiTexRenderbufferEXT;
        public final MemorySegment PFN_glVertexArrayVertexOffsetEXT;
        public final MemorySegment PFN_glVertexArrayColorOffsetEXT;
        public final MemorySegment PFN_glVertexArrayEdgeFlagOffsetEXT;
        public final MemorySegment PFN_glVertexArrayIndexOffsetEXT;
        public final MemorySegment PFN_glVertexArrayNormalOffsetEXT;
        public final MemorySegment PFN_glVertexArrayTexCoordOffsetEXT;
        public final MemorySegment PFN_glVertexArrayMultiTexCoordOffsetEXT;
        public final MemorySegment PFN_glVertexArrayFogCoordOffsetEXT;
        public final MemorySegment PFN_glVertexArraySecondaryColorOffsetEXT;
        public final MemorySegment PFN_glVertexArrayVertexAttribOffsetEXT;
        public final MemorySegment PFN_glVertexArrayVertexAttribIOffsetEXT;
        public final MemorySegment PFN_glEnableVertexArrayEXT;
        public final MemorySegment PFN_glDisableVertexArrayEXT;
        public final MemorySegment PFN_glEnableVertexArrayAttribEXT;
        public final MemorySegment PFN_glDisableVertexArrayAttribEXT;
        public final MemorySegment PFN_glGetVertexArrayIntegervEXT;
        public final MemorySegment PFN_glGetVertexArrayPointervEXT;
        public final MemorySegment PFN_glGetVertexArrayIntegeri_vEXT;
        public final MemorySegment PFN_glGetVertexArrayPointeri_vEXT;
        public final MemorySegment PFN_glMapNamedBufferRangeEXT;
        public final MemorySegment PFN_glFlushMappedNamedBufferRangeEXT;
        public final MemorySegment PFN_glNamedBufferStorageEXT;
        public final MemorySegment PFN_glClearNamedBufferDataEXT;
        public final MemorySegment PFN_glClearNamedBufferSubDataEXT;
        public final MemorySegment PFN_glNamedFramebufferParameteriEXT;
        public final MemorySegment PFN_glGetNamedFramebufferParameterivEXT;
        public final MemorySegment PFN_glProgramUniform1dEXT;
        public final MemorySegment PFN_glProgramUniform2dEXT;
        public final MemorySegment PFN_glProgramUniform3dEXT;
        public final MemorySegment PFN_glProgramUniform4dEXT;
        public final MemorySegment PFN_glProgramUniform1dvEXT;
        public final MemorySegment PFN_glProgramUniform2dvEXT;
        public final MemorySegment PFN_glProgramUniform3dvEXT;
        public final MemorySegment PFN_glProgramUniform4dvEXT;
        public final MemorySegment PFN_glProgramUniformMatrix2dvEXT;
        public final MemorySegment PFN_glProgramUniformMatrix3dvEXT;
        public final MemorySegment PFN_glProgramUniformMatrix4dvEXT;
        public final MemorySegment PFN_glProgramUniformMatrix2x3dvEXT;
        public final MemorySegment PFN_glProgramUniformMatrix2x4dvEXT;
        public final MemorySegment PFN_glProgramUniformMatrix3x2dvEXT;
        public final MemorySegment PFN_glProgramUniformMatrix3x4dvEXT;
        public final MemorySegment PFN_glProgramUniformMatrix4x2dvEXT;
        public final MemorySegment PFN_glProgramUniformMatrix4x3dvEXT;
        public final MemorySegment PFN_glTextureBufferRangeEXT;
        public final MemorySegment PFN_glTextureStorage1DEXT;
        public final MemorySegment PFN_glTextureStorage2DEXT;
        public final MemorySegment PFN_glTextureStorage3DEXT;
        public final MemorySegment PFN_glTextureStorage2DMultisampleEXT;
        public final MemorySegment PFN_glTextureStorage3DMultisampleEXT;
        public final MemorySegment PFN_glVertexArrayBindVertexBufferEXT;
        public final MemorySegment PFN_glVertexArrayVertexAttribFormatEXT;
        public final MemorySegment PFN_glVertexArrayVertexAttribIFormatEXT;
        public final MemorySegment PFN_glVertexArrayVertexAttribLFormatEXT;
        public final MemorySegment PFN_glVertexArrayVertexAttribBindingEXT;
        public final MemorySegment PFN_glVertexArrayVertexBindingDivisorEXT;
        public final MemorySegment PFN_glVertexArrayVertexAttribLOffsetEXT;
        public final MemorySegment PFN_glTexturePageCommitmentEXT;
        public final MemorySegment PFN_glVertexArrayVertexAttribDivisorEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glMatrixLoadfEXT = func.invoke("glMatrixLoadfEXT");
            PFN_glMatrixLoaddEXT = func.invoke("glMatrixLoaddEXT");
            PFN_glMatrixMultfEXT = func.invoke("glMatrixMultfEXT");
            PFN_glMatrixMultdEXT = func.invoke("glMatrixMultdEXT");
            PFN_glMatrixLoadIdentityEXT = func.invoke("glMatrixLoadIdentityEXT");
            PFN_glMatrixRotatefEXT = func.invoke("glMatrixRotatefEXT");
            PFN_glMatrixRotatedEXT = func.invoke("glMatrixRotatedEXT");
            PFN_glMatrixScalefEXT = func.invoke("glMatrixScalefEXT");
            PFN_glMatrixScaledEXT = func.invoke("glMatrixScaledEXT");
            PFN_glMatrixTranslatefEXT = func.invoke("glMatrixTranslatefEXT");
            PFN_glMatrixTranslatedEXT = func.invoke("glMatrixTranslatedEXT");
            PFN_glMatrixFrustumEXT = func.invoke("glMatrixFrustumEXT");
            PFN_glMatrixOrthoEXT = func.invoke("glMatrixOrthoEXT");
            PFN_glMatrixPopEXT = func.invoke("glMatrixPopEXT");
            PFN_glMatrixPushEXT = func.invoke("glMatrixPushEXT");PFN_glClientAttribDefaultEXT = func.invoke("glClientAttribDefaultEXT");
            PFN_glPushClientAttribDefaultEXT = func.invoke("glPushClientAttribDefaultEXT");PFN_glTextureParameterfEXT = func.invoke("glTextureParameterfEXT");
            PFN_glTextureParameterfvEXT = func.invoke("glTextureParameterfvEXT");
            PFN_glTextureParameteriEXT = func.invoke("glTextureParameteriEXT");
            PFN_glTextureParameterivEXT = func.invoke("glTextureParameterivEXT");
            PFN_glTextureImage1DEXT = func.invoke("glTextureImage1DEXT");
            PFN_glTextureImage2DEXT = func.invoke("glTextureImage2DEXT");
            PFN_glTextureSubImage1DEXT = func.invoke("glTextureSubImage1DEXT");
            PFN_glTextureSubImage2DEXT = func.invoke("glTextureSubImage2DEXT");
            PFN_glCopyTextureImage1DEXT = func.invoke("glCopyTextureImage1DEXT");
            PFN_glCopyTextureImage2DEXT = func.invoke("glCopyTextureImage2DEXT");
            PFN_glCopyTextureSubImage1DEXT = func.invoke("glCopyTextureSubImage1DEXT");
            PFN_glCopyTextureSubImage2DEXT = func.invoke("glCopyTextureSubImage2DEXT");
            PFN_glGetTextureImageEXT = func.invoke("glGetTextureImageEXT");
            PFN_glGetTextureParameterfvEXT = func.invoke("glGetTextureParameterfvEXT");
            PFN_glGetTextureParameterivEXT = func.invoke("glGetTextureParameterivEXT");
            PFN_glGetTextureLevelParameterfvEXT = func.invoke("glGetTextureLevelParameterfvEXT");
            PFN_glGetTextureLevelParameterivEXT = func.invoke("glGetTextureLevelParameterivEXT");PFN_glTextureImage3DEXT = func.invoke("glTextureImage3DEXT");
            PFN_glTextureSubImage3DEXT = func.invoke("glTextureSubImage3DEXT");
            PFN_glCopyTextureSubImage3DEXT = func.invoke("glCopyTextureSubImage3DEXT");PFN_glBindMultiTextureEXT = func.invoke("glBindMultiTextureEXT");
            PFN_glMultiTexCoordPointerEXT = func.invoke("glMultiTexCoordPointerEXT");
            PFN_glMultiTexEnvfEXT = func.invoke("glMultiTexEnvfEXT");
            PFN_glMultiTexEnvfvEXT = func.invoke("glMultiTexEnvfvEXT");
            PFN_glMultiTexEnviEXT = func.invoke("glMultiTexEnviEXT");
            PFN_glMultiTexEnvivEXT = func.invoke("glMultiTexEnvivEXT");
            PFN_glMultiTexGendEXT = func.invoke("glMultiTexGendEXT");
            PFN_glMultiTexGendvEXT = func.invoke("glMultiTexGendvEXT");
            PFN_glMultiTexGenfEXT = func.invoke("glMultiTexGenfEXT");
            PFN_glMultiTexGenfvEXT = func.invoke("glMultiTexGenfvEXT");
            PFN_glMultiTexGeniEXT = func.invoke("glMultiTexGeniEXT");
            PFN_glMultiTexGenivEXT = func.invoke("glMultiTexGenivEXT");
            PFN_glGetMultiTexEnvfvEXT = func.invoke("glGetMultiTexEnvfvEXT");
            PFN_glGetMultiTexEnvivEXT = func.invoke("glGetMultiTexEnvivEXT");
            PFN_glGetMultiTexGendvEXT = func.invoke("glGetMultiTexGendvEXT");
            PFN_glGetMultiTexGenfvEXT = func.invoke("glGetMultiTexGenfvEXT");
            PFN_glGetMultiTexGenivEXT = func.invoke("glGetMultiTexGenivEXT");
            PFN_glMultiTexParameteriEXT = func.invoke("glMultiTexParameteriEXT");
            PFN_glMultiTexParameterivEXT = func.invoke("glMultiTexParameterivEXT");
            PFN_glMultiTexParameterfEXT = func.invoke("glMultiTexParameterfEXT");
            PFN_glMultiTexParameterfvEXT = func.invoke("glMultiTexParameterfvEXT");
            PFN_glMultiTexImage1DEXT = func.invoke("glMultiTexImage1DEXT");
            PFN_glMultiTexImage2DEXT = func.invoke("glMultiTexImage2DEXT");
            PFN_glMultiTexSubImage1DEXT = func.invoke("glMultiTexSubImage1DEXT");
            PFN_glMultiTexSubImage2DEXT = func.invoke("glMultiTexSubImage2DEXT");
            PFN_glCopyMultiTexImage1DEXT = func.invoke("glCopyMultiTexImage1DEXT");
            PFN_glCopyMultiTexImage2DEXT = func.invoke("glCopyMultiTexImage2DEXT");
            PFN_glCopyMultiTexSubImage1DEXT = func.invoke("glCopyMultiTexSubImage1DEXT");
            PFN_glCopyMultiTexSubImage2DEXT = func.invoke("glCopyMultiTexSubImage2DEXT");
            PFN_glGetMultiTexImageEXT = func.invoke("glGetMultiTexImageEXT");
            PFN_glGetMultiTexParameterfvEXT = func.invoke("glGetMultiTexParameterfvEXT");
            PFN_glGetMultiTexParameterivEXT = func.invoke("glGetMultiTexParameterivEXT");
            PFN_glGetMultiTexLevelParameterfvEXT = func.invoke("glGetMultiTexLevelParameterfvEXT");
            PFN_glGetMultiTexLevelParameterivEXT = func.invoke("glGetMultiTexLevelParameterivEXT");
            PFN_glMultiTexImage3DEXT = func.invoke("glMultiTexImage3DEXT");
            PFN_glMultiTexSubImage3DEXT = func.invoke("glMultiTexSubImage3DEXT");
            PFN_glCopyMultiTexSubImage3DEXT = func.invoke("glCopyMultiTexSubImage3DEXT");PFN_glEnableClientStateIndexedEXT = func.invoke("glEnableClientStateIndexedEXT");
            PFN_glDisableClientStateIndexedEXT = func.invoke("glDisableClientStateIndexedEXT");PFN_glGetFloatIndexedvEXT = func.invoke("glGetFloatIndexedvEXT", "glGetFloati_v");
            PFN_glGetDoubleIndexedvEXT = func.invoke("glGetDoubleIndexedvEXT", "glGetDoublei_v");
            PFN_glGetPointerIndexedvEXT = func.invoke("glGetPointerIndexedvEXT");PFN_glEnableIndexedEXT = func.invoke("glEnableIndexedEXT", "glEnablei");
            PFN_glDisableIndexedEXT = func.invoke("glDisableIndexedEXT", "glDisablei");
            PFN_glIsEnabledIndexedEXT = func.invoke("glIsEnabledIndexedEXT", "glIsEnabledi");
            PFN_glGetIntegerIndexedvEXT = func.invoke("glGetIntegerIndexedvEXT", "glGetIntegeri_v");
            PFN_glGetBooleanIndexedvEXT = func.invoke("glGetBooleanIndexedvEXT", "glGetBooleani_v");PFN_glCompressedTextureImage3DEXT = func.invoke("glCompressedTextureImage3DEXT");
            PFN_glCompressedTextureImage2DEXT = func.invoke("glCompressedTextureImage2DEXT");
            PFN_glCompressedTextureImage1DEXT = func.invoke("glCompressedTextureImage1DEXT");
            PFN_glCompressedTextureSubImage3DEXT = func.invoke("glCompressedTextureSubImage3DEXT");
            PFN_glCompressedTextureSubImage2DEXT = func.invoke("glCompressedTextureSubImage2DEXT");
            PFN_glCompressedTextureSubImage1DEXT = func.invoke("glCompressedTextureSubImage1DEXT");
            PFN_glGetCompressedTextureImageEXT = func.invoke("glGetCompressedTextureImageEXT");PFN_glCompressedMultiTexImage3DEXT = func.invoke("glCompressedMultiTexImage3DEXT");
            PFN_glCompressedMultiTexImage2DEXT = func.invoke("glCompressedMultiTexImage2DEXT");
            PFN_glCompressedMultiTexImage1DEXT = func.invoke("glCompressedMultiTexImage1DEXT");
            PFN_glCompressedMultiTexSubImage3DEXT = func.invoke("glCompressedMultiTexSubImage3DEXT");
            PFN_glCompressedMultiTexSubImage2DEXT = func.invoke("glCompressedMultiTexSubImage2DEXT");
            PFN_glCompressedMultiTexSubImage1DEXT = func.invoke("glCompressedMultiTexSubImage1DEXT");
            PFN_glGetCompressedMultiTexImageEXT = func.invoke("glGetCompressedMultiTexImageEXT");PFN_glMatrixLoadTransposefEXT = func.invoke("glMatrixLoadTransposefEXT");
            PFN_glMatrixLoadTransposedEXT = func.invoke("glMatrixLoadTransposedEXT");
            PFN_glMatrixMultTransposefEXT = func.invoke("glMatrixMultTransposefEXT");
            PFN_glMatrixMultTransposedEXT = func.invoke("glMatrixMultTransposedEXT");PFN_glNamedBufferDataEXT = func.invoke("glNamedBufferDataEXT");
            PFN_glNamedBufferSubDataEXT = func.invoke("glNamedBufferSubDataEXT", "glNamedBufferSubData");
            PFN_glMapNamedBufferEXT = func.invoke("glMapNamedBufferEXT");
            PFN_glUnmapNamedBufferEXT = func.invoke("glUnmapNamedBufferEXT");
            PFN_glGetNamedBufferParameterivEXT = func.invoke("glGetNamedBufferParameterivEXT");
            PFN_glGetNamedBufferPointervEXT = func.invoke("glGetNamedBufferPointervEXT");
            PFN_glGetNamedBufferSubDataEXT = func.invoke("glGetNamedBufferSubDataEXT");PFN_glProgramUniform1fEXT = func.invoke("glProgramUniform1fEXT", "glProgramUniform1f");
            PFN_glProgramUniform2fEXT = func.invoke("glProgramUniform2fEXT", "glProgramUniform2f");
            PFN_glProgramUniform3fEXT = func.invoke("glProgramUniform3fEXT", "glProgramUniform3f");
            PFN_glProgramUniform4fEXT = func.invoke("glProgramUniform4fEXT", "glProgramUniform4f");
            PFN_glProgramUniform1iEXT = func.invoke("glProgramUniform1iEXT", "glProgramUniform1i");
            PFN_glProgramUniform2iEXT = func.invoke("glProgramUniform2iEXT", "glProgramUniform2i");
            PFN_glProgramUniform3iEXT = func.invoke("glProgramUniform3iEXT", "glProgramUniform3i");
            PFN_glProgramUniform4iEXT = func.invoke("glProgramUniform4iEXT", "glProgramUniform4i");
            PFN_glProgramUniform1fvEXT = func.invoke("glProgramUniform1fvEXT", "glProgramUniform1fv");
            PFN_glProgramUniform2fvEXT = func.invoke("glProgramUniform2fvEXT", "glProgramUniform2fv");
            PFN_glProgramUniform3fvEXT = func.invoke("glProgramUniform3fvEXT", "glProgramUniform3fv");
            PFN_glProgramUniform4fvEXT = func.invoke("glProgramUniform4fvEXT", "glProgramUniform4fv");
            PFN_glProgramUniform1ivEXT = func.invoke("glProgramUniform1ivEXT", "glProgramUniform1iv");
            PFN_glProgramUniform2ivEXT = func.invoke("glProgramUniform2ivEXT", "glProgramUniform2iv");
            PFN_glProgramUniform3ivEXT = func.invoke("glProgramUniform3ivEXT", "glProgramUniform3iv");
            PFN_glProgramUniform4ivEXT = func.invoke("glProgramUniform4ivEXT", "glProgramUniform4iv");
            PFN_glProgramUniformMatrix2fvEXT = func.invoke("glProgramUniformMatrix2fvEXT", "glProgramUniformMatrix2fv");
            PFN_glProgramUniformMatrix3fvEXT = func.invoke("glProgramUniformMatrix3fvEXT", "glProgramUniformMatrix3fv");
            PFN_glProgramUniformMatrix4fvEXT = func.invoke("glProgramUniformMatrix4fvEXT", "glProgramUniformMatrix4fv");PFN_glProgramUniformMatrix2x3fvEXT = func.invoke("glProgramUniformMatrix2x3fvEXT", "glProgramUniformMatrix2x3fv");
            PFN_glProgramUniformMatrix3x2fvEXT = func.invoke("glProgramUniformMatrix3x2fvEXT", "glProgramUniformMatrix3x2fv");
            PFN_glProgramUniformMatrix2x4fvEXT = func.invoke("glProgramUniformMatrix2x4fvEXT", "glProgramUniformMatrix2x4fv");
            PFN_glProgramUniformMatrix4x2fvEXT = func.invoke("glProgramUniformMatrix4x2fvEXT", "glProgramUniformMatrix4x2fv");
            PFN_glProgramUniformMatrix3x4fvEXT = func.invoke("glProgramUniformMatrix3x4fvEXT", "glProgramUniformMatrix3x4fv");
            PFN_glProgramUniformMatrix4x3fvEXT = func.invoke("glProgramUniformMatrix4x3fvEXT", "glProgramUniformMatrix4x3fv");PFN_glTextureBufferEXT = func.invoke("glTextureBufferEXT");
            PFN_glMultiTexBufferEXT = func.invoke("glMultiTexBufferEXT");PFN_glTextureParameterIivEXT = func.invoke("glTextureParameterIivEXT");
            PFN_glTextureParameterIuivEXT = func.invoke("glTextureParameterIuivEXT");
            PFN_glGetTextureParameterIivEXT = func.invoke("glGetTextureParameterIivEXT");
            PFN_glGetTextureParameterIuivEXT = func.invoke("glGetTextureParameterIuivEXT");
            PFN_glMultiTexParameterIivEXT = func.invoke("glMultiTexParameterIivEXT");
            PFN_glMultiTexParameterIuivEXT = func.invoke("glMultiTexParameterIuivEXT");
            PFN_glGetMultiTexParameterIivEXT = func.invoke("glGetMultiTexParameterIivEXT");
            PFN_glGetMultiTexParameterIuivEXT = func.invoke("glGetMultiTexParameterIuivEXT");PFN_glProgramUniform1uiEXT = func.invoke("glProgramUniform1uiEXT", "glProgramUniform1ui");
            PFN_glProgramUniform2uiEXT = func.invoke("glProgramUniform2uiEXT", "glProgramUniform2ui");
            PFN_glProgramUniform3uiEXT = func.invoke("glProgramUniform3uiEXT", "glProgramUniform3ui");
            PFN_glProgramUniform4uiEXT = func.invoke("glProgramUniform4uiEXT", "glProgramUniform4ui");
            PFN_glProgramUniform1uivEXT = func.invoke("glProgramUniform1uivEXT", "glProgramUniform1uiv");
            PFN_glProgramUniform2uivEXT = func.invoke("glProgramUniform2uivEXT", "glProgramUniform2uiv");
            PFN_glProgramUniform3uivEXT = func.invoke("glProgramUniform3uivEXT", "glProgramUniform3uiv");
            PFN_glProgramUniform4uivEXT = func.invoke("glProgramUniform4uivEXT", "glProgramUniform4uiv");PFN_glNamedProgramLocalParameters4fvEXT = func.invoke("glNamedProgramLocalParameters4fvEXT");PFN_glNamedProgramLocalParameterI4iEXT = func.invoke("glNamedProgramLocalParameterI4iEXT");
            PFN_glNamedProgramLocalParameterI4ivEXT = func.invoke("glNamedProgramLocalParameterI4ivEXT");
            PFN_glNamedProgramLocalParametersI4ivEXT = func.invoke("glNamedProgramLocalParametersI4ivEXT");
            PFN_glNamedProgramLocalParameterI4uiEXT = func.invoke("glNamedProgramLocalParameterI4uiEXT");
            PFN_glNamedProgramLocalParameterI4uivEXT = func.invoke("glNamedProgramLocalParameterI4uivEXT");
            PFN_glNamedProgramLocalParametersI4uivEXT = func.invoke("glNamedProgramLocalParametersI4uivEXT");
            PFN_glGetNamedProgramLocalParameterIivEXT = func.invoke("glGetNamedProgramLocalParameterIivEXT");
            PFN_glGetNamedProgramLocalParameterIuivEXT = func.invoke("glGetNamedProgramLocalParameterIuivEXT");PFN_glEnableClientStateiEXT = func.invoke("glEnableClientStateiEXT");
            PFN_glDisableClientStateiEXT = func.invoke("glDisableClientStateiEXT");PFN_glGetFloati_vEXT = func.invoke("glGetFloati_vEXT", "glGetFloati_v");
            PFN_glGetDoublei_vEXT = func.invoke("glGetDoublei_vEXT", "glGetDoublei_v");
            PFN_glGetPointeri_vEXT = func.invoke("glGetPointeri_vEXT");PFN_glNamedProgramStringEXT = func.invoke("glNamedProgramStringEXT");
            PFN_glNamedProgramLocalParameter4dEXT = func.invoke("glNamedProgramLocalParameter4dEXT");
            PFN_glNamedProgramLocalParameter4dvEXT = func.invoke("glNamedProgramLocalParameter4dvEXT");
            PFN_glNamedProgramLocalParameter4fEXT = func.invoke("glNamedProgramLocalParameter4fEXT");
            PFN_glNamedProgramLocalParameter4fvEXT = func.invoke("glNamedProgramLocalParameter4fvEXT");
            PFN_glGetNamedProgramLocalParameterdvEXT = func.invoke("glGetNamedProgramLocalParameterdvEXT");
            PFN_glGetNamedProgramLocalParameterfvEXT = func.invoke("glGetNamedProgramLocalParameterfvEXT");
            PFN_glGetNamedProgramivEXT = func.invoke("glGetNamedProgramivEXT");
            PFN_glGetNamedProgramStringEXT = func.invoke("glGetNamedProgramStringEXT");PFN_glNamedRenderbufferStorageEXT = func.invoke("glNamedRenderbufferStorageEXT");
            PFN_glGetNamedRenderbufferParameterivEXT = func.invoke("glGetNamedRenderbufferParameterivEXT");
            PFN_glNamedRenderbufferStorageMultisampleEXT = func.invoke("glNamedRenderbufferStorageMultisampleEXT");PFN_glNamedRenderbufferStorageMultisampleCoverageEXT = func.invoke("glNamedRenderbufferStorageMultisampleCoverageEXT");PFN_glCheckNamedFramebufferStatusEXT = func.invoke("glCheckNamedFramebufferStatusEXT");
            PFN_glNamedFramebufferTexture1DEXT = func.invoke("glNamedFramebufferTexture1DEXT");
            PFN_glNamedFramebufferTexture2DEXT = func.invoke("glNamedFramebufferTexture2DEXT");
            PFN_glNamedFramebufferTexture3DEXT = func.invoke("glNamedFramebufferTexture3DEXT");
            PFN_glNamedFramebufferRenderbufferEXT = func.invoke("glNamedFramebufferRenderbufferEXT");
            PFN_glGetNamedFramebufferAttachmentParameterivEXT = func.invoke("glGetNamedFramebufferAttachmentParameterivEXT");PFN_glGenerateTextureMipmapEXT = func.invoke("glGenerateTextureMipmapEXT");
            PFN_glGenerateMultiTexMipmapEXT = func.invoke("glGenerateMultiTexMipmapEXT");PFN_glFramebufferDrawBufferEXT = func.invoke("glFramebufferDrawBufferEXT");
            PFN_glFramebufferDrawBuffersEXT = func.invoke("glFramebufferDrawBuffersEXT");
            PFN_glFramebufferReadBufferEXT = func.invoke("glFramebufferReadBufferEXT");
            PFN_glGetFramebufferParameterivEXT = func.invoke("glGetFramebufferParameterivEXT");PFN_glNamedCopyBufferSubDataEXT = func.invoke("glNamedCopyBufferSubDataEXT");PFN_glNamedFramebufferTextureEXT = func.invoke("glNamedFramebufferTextureEXT");
            PFN_glNamedFramebufferTextureLayerEXT = func.invoke("glNamedFramebufferTextureLayerEXT");
            PFN_glNamedFramebufferTextureFaceEXT = func.invoke("glNamedFramebufferTextureFaceEXT");PFN_glTextureRenderbufferEXT = func.invoke("glTextureRenderbufferEXT");
            PFN_glMultiTexRenderbufferEXT = func.invoke("glMultiTexRenderbufferEXT");PFN_glVertexArrayVertexOffsetEXT = func.invoke("glVertexArrayVertexOffsetEXT");
            PFN_glVertexArrayColorOffsetEXT = func.invoke("glVertexArrayColorOffsetEXT");
            PFN_glVertexArrayEdgeFlagOffsetEXT = func.invoke("glVertexArrayEdgeFlagOffsetEXT");
            PFN_glVertexArrayIndexOffsetEXT = func.invoke("glVertexArrayIndexOffsetEXT");
            PFN_glVertexArrayNormalOffsetEXT = func.invoke("glVertexArrayNormalOffsetEXT");
            PFN_glVertexArrayTexCoordOffsetEXT = func.invoke("glVertexArrayTexCoordOffsetEXT");
            PFN_glVertexArrayMultiTexCoordOffsetEXT = func.invoke("glVertexArrayMultiTexCoordOffsetEXT");
            PFN_glVertexArrayFogCoordOffsetEXT = func.invoke("glVertexArrayFogCoordOffsetEXT");
            PFN_glVertexArraySecondaryColorOffsetEXT = func.invoke("glVertexArraySecondaryColorOffsetEXT");
            PFN_glVertexArrayVertexAttribOffsetEXT = func.invoke("glVertexArrayVertexAttribOffsetEXT");
            PFN_glVertexArrayVertexAttribIOffsetEXT = func.invoke("glVertexArrayVertexAttribIOffsetEXT");PFN_glEnableVertexArrayEXT = func.invoke("glEnableVertexArrayEXT");
            PFN_glDisableVertexArrayEXT = func.invoke("glDisableVertexArrayEXT");PFN_glEnableVertexArrayAttribEXT = func.invoke("glEnableVertexArrayAttribEXT");
            PFN_glDisableVertexArrayAttribEXT = func.invoke("glDisableVertexArrayAttribEXT");PFN_glGetVertexArrayIntegervEXT = func.invoke("glGetVertexArrayIntegervEXT");
            PFN_glGetVertexArrayPointervEXT = func.invoke("glGetVertexArrayPointervEXT");
            PFN_glGetVertexArrayIntegeri_vEXT = func.invoke("glGetVertexArrayIntegeri_vEXT");
            PFN_glGetVertexArrayPointeri_vEXT = func.invoke("glGetVertexArrayPointeri_vEXT");PFN_glMapNamedBufferRangeEXT = func.invoke("glMapNamedBufferRangeEXT");
            PFN_glFlushMappedNamedBufferRangeEXT = func.invoke("glFlushMappedNamedBufferRangeEXT");PFN_glNamedBufferStorageEXT = func.invoke("glNamedBufferStorageEXT", "glNamedBufferStorage");PFN_glClearNamedBufferDataEXT = func.invoke("glClearNamedBufferDataEXT");
            PFN_glClearNamedBufferSubDataEXT = func.invoke("glClearNamedBufferSubDataEXT");PFN_glNamedFramebufferParameteriEXT = func.invoke("glNamedFramebufferParameteriEXT");
            PFN_glGetNamedFramebufferParameterivEXT = func.invoke("glGetNamedFramebufferParameterivEXT");PFN_glProgramUniform1dEXT = func.invoke("glProgramUniform1dEXT");
            PFN_glProgramUniform2dEXT = func.invoke("glProgramUniform2dEXT");
            PFN_glProgramUniform3dEXT = func.invoke("glProgramUniform3dEXT");
            PFN_glProgramUniform4dEXT = func.invoke("glProgramUniform4dEXT");
            PFN_glProgramUniform1dvEXT = func.invoke("glProgramUniform1dvEXT");
            PFN_glProgramUniform2dvEXT = func.invoke("glProgramUniform2dvEXT");
            PFN_glProgramUniform3dvEXT = func.invoke("glProgramUniform3dvEXT");
            PFN_glProgramUniform4dvEXT = func.invoke("glProgramUniform4dvEXT");
            PFN_glProgramUniformMatrix2dvEXT = func.invoke("glProgramUniformMatrix2dvEXT");
            PFN_glProgramUniformMatrix3dvEXT = func.invoke("glProgramUniformMatrix3dvEXT");
            PFN_glProgramUniformMatrix4dvEXT = func.invoke("glProgramUniformMatrix4dvEXT");
            PFN_glProgramUniformMatrix2x3dvEXT = func.invoke("glProgramUniformMatrix2x3dvEXT");
            PFN_glProgramUniformMatrix2x4dvEXT = func.invoke("glProgramUniformMatrix2x4dvEXT");
            PFN_glProgramUniformMatrix3x2dvEXT = func.invoke("glProgramUniformMatrix3x2dvEXT");
            PFN_glProgramUniformMatrix3x4dvEXT = func.invoke("glProgramUniformMatrix3x4dvEXT");
            PFN_glProgramUniformMatrix4x2dvEXT = func.invoke("glProgramUniformMatrix4x2dvEXT");
            PFN_glProgramUniformMatrix4x3dvEXT = func.invoke("glProgramUniformMatrix4x3dvEXT");PFN_glTextureBufferRangeEXT = func.invoke("glTextureBufferRangeEXT");PFN_glTextureStorage1DEXT = func.invoke("glTextureStorage1DEXT");
            PFN_glTextureStorage2DEXT = func.invoke("glTextureStorage2DEXT");
            PFN_glTextureStorage3DEXT = func.invoke("glTextureStorage3DEXT");PFN_glTextureStorage2DMultisampleEXT = func.invoke("glTextureStorage2DMultisampleEXT");
            PFN_glTextureStorage3DMultisampleEXT = func.invoke("glTextureStorage3DMultisampleEXT");PFN_glVertexArrayBindVertexBufferEXT = func.invoke("glVertexArrayBindVertexBufferEXT");
            PFN_glVertexArrayVertexAttribFormatEXT = func.invoke("glVertexArrayVertexAttribFormatEXT");
            PFN_glVertexArrayVertexAttribIFormatEXT = func.invoke("glVertexArrayVertexAttribIFormatEXT");
            PFN_glVertexArrayVertexAttribLFormatEXT = func.invoke("glVertexArrayVertexAttribLFormatEXT");
            PFN_glVertexArrayVertexAttribBindingEXT = func.invoke("glVertexArrayVertexAttribBindingEXT");
            PFN_glVertexArrayVertexBindingDivisorEXT = func.invoke("glVertexArrayVertexBindingDivisorEXT");PFN_glVertexArrayVertexAttribLOffsetEXT = func.invoke("glVertexArrayVertexAttribLOffsetEXT");PFN_glTexturePageCommitmentEXT = func.invoke("glTexturePageCommitmentEXT");PFN_glVertexArrayVertexAttribDivisorEXT = func.invoke("glVertexArrayVertexAttribDivisorEXT");
        }
    }

    public GLEXTDirectStateAccess(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void MatrixLoadfEXT(@CType("GLenum") int mode, @CType("const GLfloat *") java.lang.foreign.MemorySegment m) {
        if (Unmarshal.isNullPointer(handles.PFN_glMatrixLoadfEXT)) throw new SymbolNotFoundError("Symbol not found: glMatrixLoadfEXT");
        try { Handles.MH_glMatrixLoadfEXT.invokeExact(handles.PFN_glMatrixLoadfEXT, mode, m); }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixLoadfEXT", e); }
    }

    public void MatrixLoaddEXT(@CType("GLenum") int mode, @CType("const GLdouble *") java.lang.foreign.MemorySegment m) {
        if (Unmarshal.isNullPointer(handles.PFN_glMatrixLoaddEXT)) throw new SymbolNotFoundError("Symbol not found: glMatrixLoaddEXT");
        try { Handles.MH_glMatrixLoaddEXT.invokeExact(handles.PFN_glMatrixLoaddEXT, mode, m); }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixLoaddEXT", e); }
    }

    public void MatrixMultfEXT(@CType("GLenum") int mode, @CType("const GLfloat *") java.lang.foreign.MemorySegment m) {
        if (Unmarshal.isNullPointer(handles.PFN_glMatrixMultfEXT)) throw new SymbolNotFoundError("Symbol not found: glMatrixMultfEXT");
        try { Handles.MH_glMatrixMultfEXT.invokeExact(handles.PFN_glMatrixMultfEXT, mode, m); }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixMultfEXT", e); }
    }

    public void MatrixMultdEXT(@CType("GLenum") int mode, @CType("const GLdouble *") java.lang.foreign.MemorySegment m) {
        if (Unmarshal.isNullPointer(handles.PFN_glMatrixMultdEXT)) throw new SymbolNotFoundError("Symbol not found: glMatrixMultdEXT");
        try { Handles.MH_glMatrixMultdEXT.invokeExact(handles.PFN_glMatrixMultdEXT, mode, m); }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixMultdEXT", e); }
    }

    public void MatrixLoadIdentityEXT(@CType("GLenum") int mode) {
        if (Unmarshal.isNullPointer(handles.PFN_glMatrixLoadIdentityEXT)) throw new SymbolNotFoundError("Symbol not found: glMatrixLoadIdentityEXT");
        try { Handles.MH_glMatrixLoadIdentityEXT.invokeExact(handles.PFN_glMatrixLoadIdentityEXT, mode); }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixLoadIdentityEXT", e); }
    }

    public void MatrixRotatefEXT(@CType("GLenum") int mode, @CType("GLfloat") float angle, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (Unmarshal.isNullPointer(handles.PFN_glMatrixRotatefEXT)) throw new SymbolNotFoundError("Symbol not found: glMatrixRotatefEXT");
        try { Handles.MH_glMatrixRotatefEXT.invokeExact(handles.PFN_glMatrixRotatefEXT, mode, angle, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixRotatefEXT", e); }
    }

    public void MatrixRotatedEXT(@CType("GLenum") int mode, @CType("GLdouble") double angle, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z) {
        if (Unmarshal.isNullPointer(handles.PFN_glMatrixRotatedEXT)) throw new SymbolNotFoundError("Symbol not found: glMatrixRotatedEXT");
        try { Handles.MH_glMatrixRotatedEXT.invokeExact(handles.PFN_glMatrixRotatedEXT, mode, angle, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixRotatedEXT", e); }
    }

    public void MatrixScalefEXT(@CType("GLenum") int mode, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (Unmarshal.isNullPointer(handles.PFN_glMatrixScalefEXT)) throw new SymbolNotFoundError("Symbol not found: glMatrixScalefEXT");
        try { Handles.MH_glMatrixScalefEXT.invokeExact(handles.PFN_glMatrixScalefEXT, mode, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixScalefEXT", e); }
    }

    public void MatrixScaledEXT(@CType("GLenum") int mode, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z) {
        if (Unmarshal.isNullPointer(handles.PFN_glMatrixScaledEXT)) throw new SymbolNotFoundError("Symbol not found: glMatrixScaledEXT");
        try { Handles.MH_glMatrixScaledEXT.invokeExact(handles.PFN_glMatrixScaledEXT, mode, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixScaledEXT", e); }
    }

    public void MatrixTranslatefEXT(@CType("GLenum") int mode, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (Unmarshal.isNullPointer(handles.PFN_glMatrixTranslatefEXT)) throw new SymbolNotFoundError("Symbol not found: glMatrixTranslatefEXT");
        try { Handles.MH_glMatrixTranslatefEXT.invokeExact(handles.PFN_glMatrixTranslatefEXT, mode, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixTranslatefEXT", e); }
    }

    public void MatrixTranslatedEXT(@CType("GLenum") int mode, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z) {
        if (Unmarshal.isNullPointer(handles.PFN_glMatrixTranslatedEXT)) throw new SymbolNotFoundError("Symbol not found: glMatrixTranslatedEXT");
        try { Handles.MH_glMatrixTranslatedEXT.invokeExact(handles.PFN_glMatrixTranslatedEXT, mode, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixTranslatedEXT", e); }
    }

    public void MatrixFrustumEXT(@CType("GLenum") int mode, @CType("GLdouble") double left, @CType("GLdouble") double right, @CType("GLdouble") double bottom, @CType("GLdouble") double top, @CType("GLdouble") double zNear, @CType("GLdouble") double zFar) {
        if (Unmarshal.isNullPointer(handles.PFN_glMatrixFrustumEXT)) throw new SymbolNotFoundError("Symbol not found: glMatrixFrustumEXT");
        try { Handles.MH_glMatrixFrustumEXT.invokeExact(handles.PFN_glMatrixFrustumEXT, mode, left, right, bottom, top, zNear, zFar); }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixFrustumEXT", e); }
    }

    public void MatrixOrthoEXT(@CType("GLenum") int mode, @CType("GLdouble") double left, @CType("GLdouble") double right, @CType("GLdouble") double bottom, @CType("GLdouble") double top, @CType("GLdouble") double zNear, @CType("GLdouble") double zFar) {
        if (Unmarshal.isNullPointer(handles.PFN_glMatrixOrthoEXT)) throw new SymbolNotFoundError("Symbol not found: glMatrixOrthoEXT");
        try { Handles.MH_glMatrixOrthoEXT.invokeExact(handles.PFN_glMatrixOrthoEXT, mode, left, right, bottom, top, zNear, zFar); }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixOrthoEXT", e); }
    }

    public void MatrixPopEXT(@CType("GLenum") int mode) {
        if (Unmarshal.isNullPointer(handles.PFN_glMatrixPopEXT)) throw new SymbolNotFoundError("Symbol not found: glMatrixPopEXT");
        try { Handles.MH_glMatrixPopEXT.invokeExact(handles.PFN_glMatrixPopEXT, mode); }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixPopEXT", e); }
    }

    public void MatrixPushEXT(@CType("GLenum") int mode) {
        if (Unmarshal.isNullPointer(handles.PFN_glMatrixPushEXT)) throw new SymbolNotFoundError("Symbol not found: glMatrixPushEXT");
        try { Handles.MH_glMatrixPushEXT.invokeExact(handles.PFN_glMatrixPushEXT, mode); }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixPushEXT", e); }
    }

    public void ClientAttribDefaultEXT(@CType("GLbitfield") int mask) {
        if (Unmarshal.isNullPointer(handles.PFN_glClientAttribDefaultEXT)) throw new SymbolNotFoundError("Symbol not found: glClientAttribDefaultEXT");
        try { Handles.MH_glClientAttribDefaultEXT.invokeExact(handles.PFN_glClientAttribDefaultEXT, mask); }
        catch (Throwable e) { throw new RuntimeException("error in glClientAttribDefaultEXT", e); }
    }

    public void PushClientAttribDefaultEXT(@CType("GLbitfield") int mask) {
        if (Unmarshal.isNullPointer(handles.PFN_glPushClientAttribDefaultEXT)) throw new SymbolNotFoundError("Symbol not found: glPushClientAttribDefaultEXT");
        try { Handles.MH_glPushClientAttribDefaultEXT.invokeExact(handles.PFN_glPushClientAttribDefaultEXT, mask); }
        catch (Throwable e) { throw new RuntimeException("error in glPushClientAttribDefaultEXT", e); }
    }

    public void TextureParameterfEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureParameterfEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureParameterfEXT");
        try { Handles.MH_glTextureParameterfEXT.invokeExact(handles.PFN_glTextureParameterfEXT, texture, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureParameterfEXT", e); }
    }

    public void TextureParameterfvEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureParameterfvEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureParameterfvEXT");
        try { Handles.MH_glTextureParameterfvEXT.invokeExact(handles.PFN_glTextureParameterfvEXT, texture, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureParameterfvEXT", e); }
    }

    public void TextureParameteriEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureParameteriEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureParameteriEXT");
        try { Handles.MH_glTextureParameteriEXT.invokeExact(handles.PFN_glTextureParameteriEXT, texture, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureParameteriEXT", e); }
    }

    public void TextureParameterivEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureParameterivEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureParameterivEXT");
        try { Handles.MH_glTextureParameterivEXT.invokeExact(handles.PFN_glTextureParameterivEXT, texture, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureParameterivEXT", e); }
    }

    public void TextureImage1DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int internalformat, @CType("GLsizei") int width, @CType("GLint") int border, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureImage1DEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureImage1DEXT");
        try { Handles.MH_glTextureImage1DEXT.invokeExact(handles.PFN_glTextureImage1DEXT, texture, target, level, internalformat, width, border, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureImage1DEXT", e); }
    }

    public void TextureImage2DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLint") int border, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureImage2DEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureImage2DEXT");
        try { Handles.MH_glTextureImage2DEXT.invokeExact(handles.PFN_glTextureImage2DEXT, texture, target, level, internalformat, width, height, border, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureImage2DEXT", e); }
    }

    public void TextureSubImage1DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLsizei") int width, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureSubImage1DEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureSubImage1DEXT");
        try { Handles.MH_glTextureSubImage1DEXT.invokeExact(handles.PFN_glTextureSubImage1DEXT, texture, target, level, xoffset, width, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureSubImage1DEXT", e); }
    }

    public void TextureSubImage2DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureSubImage2DEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureSubImage2DEXT");
        try { Handles.MH_glTextureSubImage2DEXT.invokeExact(handles.PFN_glTextureSubImage2DEXT, texture, target, level, xoffset, yoffset, width, height, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureSubImage2DEXT", e); }
    }

    public void CopyTextureImage1DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLint") int border) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyTextureImage1DEXT)) throw new SymbolNotFoundError("Symbol not found: glCopyTextureImage1DEXT");
        try { Handles.MH_glCopyTextureImage1DEXT.invokeExact(handles.PFN_glCopyTextureImage1DEXT, texture, target, level, internalformat, x, y, width, border); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyTextureImage1DEXT", e); }
    }

    public void CopyTextureImage2DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLint") int border) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyTextureImage2DEXT)) throw new SymbolNotFoundError("Symbol not found: glCopyTextureImage2DEXT");
        try { Handles.MH_glCopyTextureImage2DEXT.invokeExact(handles.PFN_glCopyTextureImage2DEXT, texture, target, level, internalformat, x, y, width, height, border); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyTextureImage2DEXT", e); }
    }

    public void CopyTextureSubImage1DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyTextureSubImage1DEXT)) throw new SymbolNotFoundError("Symbol not found: glCopyTextureSubImage1DEXT");
        try { Handles.MH_glCopyTextureSubImage1DEXT.invokeExact(handles.PFN_glCopyTextureSubImage1DEXT, texture, target, level, xoffset, x, y, width); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyTextureSubImage1DEXT", e); }
    }

    public void CopyTextureSubImage2DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyTextureSubImage2DEXT)) throw new SymbolNotFoundError("Symbol not found: glCopyTextureSubImage2DEXT");
        try { Handles.MH_glCopyTextureSubImage2DEXT.invokeExact(handles.PFN_glCopyTextureSubImage2DEXT, texture, target, level, xoffset, yoffset, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyTextureSubImage2DEXT", e); }
    }

    public void GetTextureImageEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int format, @CType("GLenum") int type, @CType("void*") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTextureImageEXT)) throw new SymbolNotFoundError("Symbol not found: glGetTextureImageEXT");
        try { Handles.MH_glGetTextureImageEXT.invokeExact(handles.PFN_glGetTextureImageEXT, texture, target, level, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureImageEXT", e); }
    }

    public void GetTextureParameterfvEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTextureParameterfvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetTextureParameterfvEXT");
        try { Handles.MH_glGetTextureParameterfvEXT.invokeExact(handles.PFN_glGetTextureParameterfvEXT, texture, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureParameterfvEXT", e); }
    }

    public void GetTextureParameterivEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTextureParameterivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetTextureParameterivEXT");
        try { Handles.MH_glGetTextureParameterivEXT.invokeExact(handles.PFN_glGetTextureParameterivEXT, texture, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureParameterivEXT", e); }
    }

    public void GetTextureLevelParameterfvEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTextureLevelParameterfvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetTextureLevelParameterfvEXT");
        try { Handles.MH_glGetTextureLevelParameterfvEXT.invokeExact(handles.PFN_glGetTextureLevelParameterfvEXT, texture, target, level, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureLevelParameterfvEXT", e); }
    }

    public void GetTextureLevelParameterivEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTextureLevelParameterivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetTextureLevelParameterivEXT");
        try { Handles.MH_glGetTextureLevelParameterivEXT.invokeExact(handles.PFN_glGetTextureLevelParameterivEXT, texture, target, level, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureLevelParameterivEXT", e); }
    }

    public void TextureImage3DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLint") int border, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureImage3DEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureImage3DEXT");
        try { Handles.MH_glTextureImage3DEXT.invokeExact(handles.PFN_glTextureImage3DEXT, texture, target, level, internalformat, width, height, depth, border, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureImage3DEXT", e); }
    }

    public void TextureSubImage3DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureSubImage3DEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureSubImage3DEXT");
        try { Handles.MH_glTextureSubImage3DEXT.invokeExact(handles.PFN_glTextureSubImage3DEXT, texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureSubImage3DEXT", e); }
    }

    public void CopyTextureSubImage3DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyTextureSubImage3DEXT)) throw new SymbolNotFoundError("Symbol not found: glCopyTextureSubImage3DEXT");
        try { Handles.MH_glCopyTextureSubImage3DEXT.invokeExact(handles.PFN_glCopyTextureSubImage3DEXT, texture, target, level, xoffset, yoffset, zoffset, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyTextureSubImage3DEXT", e); }
    }

    public void BindMultiTextureEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLuint") int texture) {
        if (Unmarshal.isNullPointer(handles.PFN_glBindMultiTextureEXT)) throw new SymbolNotFoundError("Symbol not found: glBindMultiTextureEXT");
        try { Handles.MH_glBindMultiTextureEXT.invokeExact(handles.PFN_glBindMultiTextureEXT, texunit, target, texture); }
        catch (Throwable e) { throw new RuntimeException("error in glBindMultiTextureEXT", e); }
    }

    public void MultiTexCoordPointerEXT(@CType("GLenum") int texunit, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexCoordPointerEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiTexCoordPointerEXT");
        try { Handles.MH_glMultiTexCoordPointerEXT.invokeExact(handles.PFN_glMultiTexCoordPointerEXT, texunit, size, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoordPointerEXT", e); }
    }

    public void MultiTexEnvfEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexEnvfEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiTexEnvfEXT");
        try { Handles.MH_glMultiTexEnvfEXT.invokeExact(handles.PFN_glMultiTexEnvfEXT, texunit, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexEnvfEXT", e); }
    }

    public void MultiTexEnvfvEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexEnvfvEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiTexEnvfvEXT");
        try { Handles.MH_glMultiTexEnvfvEXT.invokeExact(handles.PFN_glMultiTexEnvfvEXT, texunit, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexEnvfvEXT", e); }
    }

    public void MultiTexEnviEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexEnviEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiTexEnviEXT");
        try { Handles.MH_glMultiTexEnviEXT.invokeExact(handles.PFN_glMultiTexEnviEXT, texunit, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexEnviEXT", e); }
    }

    public void MultiTexEnvivEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexEnvivEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiTexEnvivEXT");
        try { Handles.MH_glMultiTexEnvivEXT.invokeExact(handles.PFN_glMultiTexEnvivEXT, texunit, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexEnvivEXT", e); }
    }

    public void MultiTexGendEXT(@CType("GLenum") int texunit, @CType("GLenum") int coord, @CType("GLenum") int pname, @CType("GLdouble") double param) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexGendEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiTexGendEXT");
        try { Handles.MH_glMultiTexGendEXT.invokeExact(handles.PFN_glMultiTexGendEXT, texunit, coord, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexGendEXT", e); }
    }

    public void MultiTexGendvEXT(@CType("GLenum") int texunit, @CType("GLenum") int coord, @CType("GLenum") int pname, @CType("const GLdouble *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexGendvEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiTexGendvEXT");
        try { Handles.MH_glMultiTexGendvEXT.invokeExact(handles.PFN_glMultiTexGendvEXT, texunit, coord, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexGendvEXT", e); }
    }

    public void MultiTexGenfEXT(@CType("GLenum") int texunit, @CType("GLenum") int coord, @CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexGenfEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiTexGenfEXT");
        try { Handles.MH_glMultiTexGenfEXT.invokeExact(handles.PFN_glMultiTexGenfEXT, texunit, coord, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexGenfEXT", e); }
    }

    public void MultiTexGenfvEXT(@CType("GLenum") int texunit, @CType("GLenum") int coord, @CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexGenfvEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiTexGenfvEXT");
        try { Handles.MH_glMultiTexGenfvEXT.invokeExact(handles.PFN_glMultiTexGenfvEXT, texunit, coord, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexGenfvEXT", e); }
    }

    public void MultiTexGeniEXT(@CType("GLenum") int texunit, @CType("GLenum") int coord, @CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexGeniEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiTexGeniEXT");
        try { Handles.MH_glMultiTexGeniEXT.invokeExact(handles.PFN_glMultiTexGeniEXT, texunit, coord, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexGeniEXT", e); }
    }

    public void MultiTexGenivEXT(@CType("GLenum") int texunit, @CType("GLenum") int coord, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexGenivEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiTexGenivEXT");
        try { Handles.MH_glMultiTexGenivEXT.invokeExact(handles.PFN_glMultiTexGenivEXT, texunit, coord, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexGenivEXT", e); }
    }

    public void GetMultiTexEnvfvEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetMultiTexEnvfvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetMultiTexEnvfvEXT");
        try { Handles.MH_glGetMultiTexEnvfvEXT.invokeExact(handles.PFN_glGetMultiTexEnvfvEXT, texunit, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetMultiTexEnvfvEXT", e); }
    }

    public void GetMultiTexEnvivEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetMultiTexEnvivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetMultiTexEnvivEXT");
        try { Handles.MH_glGetMultiTexEnvivEXT.invokeExact(handles.PFN_glGetMultiTexEnvivEXT, texunit, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetMultiTexEnvivEXT", e); }
    }

    public void GetMultiTexGendvEXT(@CType("GLenum") int texunit, @CType("GLenum") int coord, @CType("GLenum") int pname, @CType("GLdouble *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetMultiTexGendvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetMultiTexGendvEXT");
        try { Handles.MH_glGetMultiTexGendvEXT.invokeExact(handles.PFN_glGetMultiTexGendvEXT, texunit, coord, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetMultiTexGendvEXT", e); }
    }

    public void GetMultiTexGenfvEXT(@CType("GLenum") int texunit, @CType("GLenum") int coord, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetMultiTexGenfvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetMultiTexGenfvEXT");
        try { Handles.MH_glGetMultiTexGenfvEXT.invokeExact(handles.PFN_glGetMultiTexGenfvEXT, texunit, coord, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetMultiTexGenfvEXT", e); }
    }

    public void GetMultiTexGenivEXT(@CType("GLenum") int texunit, @CType("GLenum") int coord, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetMultiTexGenivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetMultiTexGenivEXT");
        try { Handles.MH_glGetMultiTexGenivEXT.invokeExact(handles.PFN_glGetMultiTexGenivEXT, texunit, coord, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetMultiTexGenivEXT", e); }
    }

    public void MultiTexParameteriEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexParameteriEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiTexParameteriEXT");
        try { Handles.MH_glMultiTexParameteriEXT.invokeExact(handles.PFN_glMultiTexParameteriEXT, texunit, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexParameteriEXT", e); }
    }

    public void MultiTexParameterivEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexParameterivEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiTexParameterivEXT");
        try { Handles.MH_glMultiTexParameterivEXT.invokeExact(handles.PFN_glMultiTexParameterivEXT, texunit, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexParameterivEXT", e); }
    }

    public void MultiTexParameterfEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat") float param) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexParameterfEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiTexParameterfEXT");
        try { Handles.MH_glMultiTexParameterfEXT.invokeExact(handles.PFN_glMultiTexParameterfEXT, texunit, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexParameterfEXT", e); }
    }

    public void MultiTexParameterfvEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexParameterfvEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiTexParameterfvEXT");
        try { Handles.MH_glMultiTexParameterfvEXT.invokeExact(handles.PFN_glMultiTexParameterfvEXT, texunit, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexParameterfvEXT", e); }
    }

    public void MultiTexImage1DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int internalformat, @CType("GLsizei") int width, @CType("GLint") int border, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexImage1DEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiTexImage1DEXT");
        try { Handles.MH_glMultiTexImage1DEXT.invokeExact(handles.PFN_glMultiTexImage1DEXT, texunit, target, level, internalformat, width, border, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexImage1DEXT", e); }
    }

    public void MultiTexImage2DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLint") int border, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexImage2DEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiTexImage2DEXT");
        try { Handles.MH_glMultiTexImage2DEXT.invokeExact(handles.PFN_glMultiTexImage2DEXT, texunit, target, level, internalformat, width, height, border, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexImage2DEXT", e); }
    }

    public void MultiTexSubImage1DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLsizei") int width, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexSubImage1DEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiTexSubImage1DEXT");
        try { Handles.MH_glMultiTexSubImage1DEXT.invokeExact(handles.PFN_glMultiTexSubImage1DEXT, texunit, target, level, xoffset, width, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexSubImage1DEXT", e); }
    }

    public void MultiTexSubImage2DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexSubImage2DEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiTexSubImage2DEXT");
        try { Handles.MH_glMultiTexSubImage2DEXT.invokeExact(handles.PFN_glMultiTexSubImage2DEXT, texunit, target, level, xoffset, yoffset, width, height, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexSubImage2DEXT", e); }
    }

    public void CopyMultiTexImage1DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLint") int border) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyMultiTexImage1DEXT)) throw new SymbolNotFoundError("Symbol not found: glCopyMultiTexImage1DEXT");
        try { Handles.MH_glCopyMultiTexImage1DEXT.invokeExact(handles.PFN_glCopyMultiTexImage1DEXT, texunit, target, level, internalformat, x, y, width, border); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyMultiTexImage1DEXT", e); }
    }

    public void CopyMultiTexImage2DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLint") int border) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyMultiTexImage2DEXT)) throw new SymbolNotFoundError("Symbol not found: glCopyMultiTexImage2DEXT");
        try { Handles.MH_glCopyMultiTexImage2DEXT.invokeExact(handles.PFN_glCopyMultiTexImage2DEXT, texunit, target, level, internalformat, x, y, width, height, border); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyMultiTexImage2DEXT", e); }
    }

    public void CopyMultiTexSubImage1DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyMultiTexSubImage1DEXT)) throw new SymbolNotFoundError("Symbol not found: glCopyMultiTexSubImage1DEXT");
        try { Handles.MH_glCopyMultiTexSubImage1DEXT.invokeExact(handles.PFN_glCopyMultiTexSubImage1DEXT, texunit, target, level, xoffset, x, y, width); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyMultiTexSubImage1DEXT", e); }
    }

    public void CopyMultiTexSubImage2DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyMultiTexSubImage2DEXT)) throw new SymbolNotFoundError("Symbol not found: glCopyMultiTexSubImage2DEXT");
        try { Handles.MH_glCopyMultiTexSubImage2DEXT.invokeExact(handles.PFN_glCopyMultiTexSubImage2DEXT, texunit, target, level, xoffset, yoffset, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyMultiTexSubImage2DEXT", e); }
    }

    public void GetMultiTexImageEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int format, @CType("GLenum") int type, @CType("void*") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetMultiTexImageEXT)) throw new SymbolNotFoundError("Symbol not found: glGetMultiTexImageEXT");
        try { Handles.MH_glGetMultiTexImageEXT.invokeExact(handles.PFN_glGetMultiTexImageEXT, texunit, target, level, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glGetMultiTexImageEXT", e); }
    }

    public void GetMultiTexParameterfvEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetMultiTexParameterfvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetMultiTexParameterfvEXT");
        try { Handles.MH_glGetMultiTexParameterfvEXT.invokeExact(handles.PFN_glGetMultiTexParameterfvEXT, texunit, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetMultiTexParameterfvEXT", e); }
    }

    public void GetMultiTexParameterivEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetMultiTexParameterivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetMultiTexParameterivEXT");
        try { Handles.MH_glGetMultiTexParameterivEXT.invokeExact(handles.PFN_glGetMultiTexParameterivEXT, texunit, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetMultiTexParameterivEXT", e); }
    }

    public void GetMultiTexLevelParameterfvEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetMultiTexLevelParameterfvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetMultiTexLevelParameterfvEXT");
        try { Handles.MH_glGetMultiTexLevelParameterfvEXT.invokeExact(handles.PFN_glGetMultiTexLevelParameterfvEXT, texunit, target, level, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetMultiTexLevelParameterfvEXT", e); }
    }

    public void GetMultiTexLevelParameterivEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetMultiTexLevelParameterivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetMultiTexLevelParameterivEXT");
        try { Handles.MH_glGetMultiTexLevelParameterivEXT.invokeExact(handles.PFN_glGetMultiTexLevelParameterivEXT, texunit, target, level, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetMultiTexLevelParameterivEXT", e); }
    }

    public void MultiTexImage3DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLint") int border, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexImage3DEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiTexImage3DEXT");
        try { Handles.MH_glMultiTexImage3DEXT.invokeExact(handles.PFN_glMultiTexImage3DEXT, texunit, target, level, internalformat, width, height, depth, border, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexImage3DEXT", e); }
    }

    public void MultiTexSubImage3DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexSubImage3DEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiTexSubImage3DEXT");
        try { Handles.MH_glMultiTexSubImage3DEXT.invokeExact(handles.PFN_glMultiTexSubImage3DEXT, texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexSubImage3DEXT", e); }
    }

    public void CopyMultiTexSubImage3DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glCopyMultiTexSubImage3DEXT)) throw new SymbolNotFoundError("Symbol not found: glCopyMultiTexSubImage3DEXT");
        try { Handles.MH_glCopyMultiTexSubImage3DEXT.invokeExact(handles.PFN_glCopyMultiTexSubImage3DEXT, texunit, target, level, xoffset, yoffset, zoffset, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glCopyMultiTexSubImage3DEXT", e); }
    }

    public void EnableClientStateIndexedEXT(@CType("GLenum") int array, @CType("GLuint") int index) {
        if (Unmarshal.isNullPointer(handles.PFN_glEnableClientStateIndexedEXT)) throw new SymbolNotFoundError("Symbol not found: glEnableClientStateIndexedEXT");
        try { Handles.MH_glEnableClientStateIndexedEXT.invokeExact(handles.PFN_glEnableClientStateIndexedEXT, array, index); }
        catch (Throwable e) { throw new RuntimeException("error in glEnableClientStateIndexedEXT", e); }
    }

    public void DisableClientStateIndexedEXT(@CType("GLenum") int array, @CType("GLuint") int index) {
        if (Unmarshal.isNullPointer(handles.PFN_glDisableClientStateIndexedEXT)) throw new SymbolNotFoundError("Symbol not found: glDisableClientStateIndexedEXT");
        try { Handles.MH_glDisableClientStateIndexedEXT.invokeExact(handles.PFN_glDisableClientStateIndexedEXT, array, index); }
        catch (Throwable e) { throw new RuntimeException("error in glDisableClientStateIndexedEXT", e); }
    }

    public void GetFloatIndexedvEXT(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLfloat *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetFloatIndexedvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetFloatIndexedvEXT");
        try { Handles.MH_glGetFloatIndexedvEXT.invokeExact(handles.PFN_glGetFloatIndexedvEXT, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetFloatIndexedvEXT", e); }
    }

    public void GetDoubleIndexedvEXT(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLdouble *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetDoubleIndexedvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetDoubleIndexedvEXT");
        try { Handles.MH_glGetDoubleIndexedvEXT.invokeExact(handles.PFN_glGetDoubleIndexedvEXT, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetDoubleIndexedvEXT", e); }
    }

    public void GetPointerIndexedvEXT(@CType("GLenum") int target, @CType("GLuint") int index, @CType("void **") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetPointerIndexedvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetPointerIndexedvEXT");
        try { Handles.MH_glGetPointerIndexedvEXT.invokeExact(handles.PFN_glGetPointerIndexedvEXT, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetPointerIndexedvEXT", e); }
    }

    public void EnableIndexedEXT(@CType("GLenum") int target, @CType("GLuint") int index) {
        if (Unmarshal.isNullPointer(handles.PFN_glEnableIndexedEXT)) throw new SymbolNotFoundError("Symbol not found: glEnableIndexedEXT");
        try { Handles.MH_glEnableIndexedEXT.invokeExact(handles.PFN_glEnableIndexedEXT, target, index); }
        catch (Throwable e) { throw new RuntimeException("error in glEnableIndexedEXT", e); }
    }

    public void DisableIndexedEXT(@CType("GLenum") int target, @CType("GLuint") int index) {
        if (Unmarshal.isNullPointer(handles.PFN_glDisableIndexedEXT)) throw new SymbolNotFoundError("Symbol not found: glDisableIndexedEXT");
        try { Handles.MH_glDisableIndexedEXT.invokeExact(handles.PFN_glDisableIndexedEXT, target, index); }
        catch (Throwable e) { throw new RuntimeException("error in glDisableIndexedEXT", e); }
    }

    public @CType("GLboolean") boolean IsEnabledIndexedEXT(@CType("GLenum") int target, @CType("GLuint") int index) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsEnabledIndexedEXT)) throw new SymbolNotFoundError("Symbol not found: glIsEnabledIndexedEXT");
        try { return (boolean) Handles.MH_glIsEnabledIndexedEXT.invokeExact(handles.PFN_glIsEnabledIndexedEXT, target, index); }
        catch (Throwable e) { throw new RuntimeException("error in glIsEnabledIndexedEXT", e); }
    }

    public void GetIntegerIndexedvEXT(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLint *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetIntegerIndexedvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetIntegerIndexedvEXT");
        try { Handles.MH_glGetIntegerIndexedvEXT.invokeExact(handles.PFN_glGetIntegerIndexedvEXT, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetIntegerIndexedvEXT", e); }
    }

    public void GetBooleanIndexedvEXT(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLboolean *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetBooleanIndexedvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetBooleanIndexedvEXT");
        try { Handles.MH_glGetBooleanIndexedvEXT.invokeExact(handles.PFN_glGetBooleanIndexedvEXT, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetBooleanIndexedvEXT", e); }
    }

    public void CompressedTextureImage3DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLint") int border, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment bits) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedTextureImage3DEXT)) throw new SymbolNotFoundError("Symbol not found: glCompressedTextureImage3DEXT");
        try { Handles.MH_glCompressedTextureImage3DEXT.invokeExact(handles.PFN_glCompressedTextureImage3DEXT, texture, target, level, internalformat, width, height, depth, border, imageSize, bits); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTextureImage3DEXT", e); }
    }

    public void CompressedTextureImage2DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLint") int border, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment bits) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedTextureImage2DEXT)) throw new SymbolNotFoundError("Symbol not found: glCompressedTextureImage2DEXT");
        try { Handles.MH_glCompressedTextureImage2DEXT.invokeExact(handles.PFN_glCompressedTextureImage2DEXT, texture, target, level, internalformat, width, height, border, imageSize, bits); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTextureImage2DEXT", e); }
    }

    public void CompressedTextureImage1DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLint") int border, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment bits) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedTextureImage1DEXT)) throw new SymbolNotFoundError("Symbol not found: glCompressedTextureImage1DEXT");
        try { Handles.MH_glCompressedTextureImage1DEXT.invokeExact(handles.PFN_glCompressedTextureImage1DEXT, texture, target, level, internalformat, width, border, imageSize, bits); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTextureImage1DEXT", e); }
    }

    public void CompressedTextureSubImage3DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment bits) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedTextureSubImage3DEXT)) throw new SymbolNotFoundError("Symbol not found: glCompressedTextureSubImage3DEXT");
        try { Handles.MH_glCompressedTextureSubImage3DEXT.invokeExact(handles.PFN_glCompressedTextureSubImage3DEXT, texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, bits); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTextureSubImage3DEXT", e); }
    }

    public void CompressedTextureSubImage2DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment bits) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedTextureSubImage2DEXT)) throw new SymbolNotFoundError("Symbol not found: glCompressedTextureSubImage2DEXT");
        try { Handles.MH_glCompressedTextureSubImage2DEXT.invokeExact(handles.PFN_glCompressedTextureSubImage2DEXT, texture, target, level, xoffset, yoffset, width, height, format, imageSize, bits); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTextureSubImage2DEXT", e); }
    }

    public void CompressedTextureSubImage1DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLsizei") int width, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment bits) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedTextureSubImage1DEXT)) throw new SymbolNotFoundError("Symbol not found: glCompressedTextureSubImage1DEXT");
        try { Handles.MH_glCompressedTextureSubImage1DEXT.invokeExact(handles.PFN_glCompressedTextureSubImage1DEXT, texture, target, level, xoffset, width, format, imageSize, bits); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTextureSubImage1DEXT", e); }
    }

    public void GetCompressedTextureImageEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int lod, @CType("void*") java.lang.foreign.MemorySegment img) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetCompressedTextureImageEXT)) throw new SymbolNotFoundError("Symbol not found: glGetCompressedTextureImageEXT");
        try { Handles.MH_glGetCompressedTextureImageEXT.invokeExact(handles.PFN_glGetCompressedTextureImageEXT, texture, target, lod, img); }
        catch (Throwable e) { throw new RuntimeException("error in glGetCompressedTextureImageEXT", e); }
    }

    public void CompressedMultiTexImage3DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLint") int border, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment bits) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedMultiTexImage3DEXT)) throw new SymbolNotFoundError("Symbol not found: glCompressedMultiTexImage3DEXT");
        try { Handles.MH_glCompressedMultiTexImage3DEXT.invokeExact(handles.PFN_glCompressedMultiTexImage3DEXT, texunit, target, level, internalformat, width, height, depth, border, imageSize, bits); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedMultiTexImage3DEXT", e); }
    }

    public void CompressedMultiTexImage2DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLint") int border, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment bits) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedMultiTexImage2DEXT)) throw new SymbolNotFoundError("Symbol not found: glCompressedMultiTexImage2DEXT");
        try { Handles.MH_glCompressedMultiTexImage2DEXT.invokeExact(handles.PFN_glCompressedMultiTexImage2DEXT, texunit, target, level, internalformat, width, height, border, imageSize, bits); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedMultiTexImage2DEXT", e); }
    }

    public void CompressedMultiTexImage1DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLint") int border, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment bits) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedMultiTexImage1DEXT)) throw new SymbolNotFoundError("Symbol not found: glCompressedMultiTexImage1DEXT");
        try { Handles.MH_glCompressedMultiTexImage1DEXT.invokeExact(handles.PFN_glCompressedMultiTexImage1DEXT, texunit, target, level, internalformat, width, border, imageSize, bits); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedMultiTexImage1DEXT", e); }
    }

    public void CompressedMultiTexSubImage3DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment bits) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedMultiTexSubImage3DEXT)) throw new SymbolNotFoundError("Symbol not found: glCompressedMultiTexSubImage3DEXT");
        try { Handles.MH_glCompressedMultiTexSubImage3DEXT.invokeExact(handles.PFN_glCompressedMultiTexSubImage3DEXT, texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, bits); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedMultiTexSubImage3DEXT", e); }
    }

    public void CompressedMultiTexSubImage2DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment bits) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedMultiTexSubImage2DEXT)) throw new SymbolNotFoundError("Symbol not found: glCompressedMultiTexSubImage2DEXT");
        try { Handles.MH_glCompressedMultiTexSubImage2DEXT.invokeExact(handles.PFN_glCompressedMultiTexSubImage2DEXT, texunit, target, level, xoffset, yoffset, width, height, format, imageSize, bits); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedMultiTexSubImage2DEXT", e); }
    }

    public void CompressedMultiTexSubImage1DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLsizei") int width, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment bits) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompressedMultiTexSubImage1DEXT)) throw new SymbolNotFoundError("Symbol not found: glCompressedMultiTexSubImage1DEXT");
        try { Handles.MH_glCompressedMultiTexSubImage1DEXT.invokeExact(handles.PFN_glCompressedMultiTexSubImage1DEXT, texunit, target, level, xoffset, width, format, imageSize, bits); }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedMultiTexSubImage1DEXT", e); }
    }

    public void GetCompressedMultiTexImageEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int lod, @CType("void*") java.lang.foreign.MemorySegment img) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetCompressedMultiTexImageEXT)) throw new SymbolNotFoundError("Symbol not found: glGetCompressedMultiTexImageEXT");
        try { Handles.MH_glGetCompressedMultiTexImageEXT.invokeExact(handles.PFN_glGetCompressedMultiTexImageEXT, texunit, target, lod, img); }
        catch (Throwable e) { throw new RuntimeException("error in glGetCompressedMultiTexImageEXT", e); }
    }

    public void MatrixLoadTransposefEXT(@CType("GLenum") int mode, @CType("const GLfloat *") java.lang.foreign.MemorySegment m) {
        if (Unmarshal.isNullPointer(handles.PFN_glMatrixLoadTransposefEXT)) throw new SymbolNotFoundError("Symbol not found: glMatrixLoadTransposefEXT");
        try { Handles.MH_glMatrixLoadTransposefEXT.invokeExact(handles.PFN_glMatrixLoadTransposefEXT, mode, m); }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixLoadTransposefEXT", e); }
    }

    public void MatrixLoadTransposedEXT(@CType("GLenum") int mode, @CType("const GLdouble *") java.lang.foreign.MemorySegment m) {
        if (Unmarshal.isNullPointer(handles.PFN_glMatrixLoadTransposedEXT)) throw new SymbolNotFoundError("Symbol not found: glMatrixLoadTransposedEXT");
        try { Handles.MH_glMatrixLoadTransposedEXT.invokeExact(handles.PFN_glMatrixLoadTransposedEXT, mode, m); }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixLoadTransposedEXT", e); }
    }

    public void MatrixMultTransposefEXT(@CType("GLenum") int mode, @CType("const GLfloat *") java.lang.foreign.MemorySegment m) {
        if (Unmarshal.isNullPointer(handles.PFN_glMatrixMultTransposefEXT)) throw new SymbolNotFoundError("Symbol not found: glMatrixMultTransposefEXT");
        try { Handles.MH_glMatrixMultTransposefEXT.invokeExact(handles.PFN_glMatrixMultTransposefEXT, mode, m); }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixMultTransposefEXT", e); }
    }

    public void MatrixMultTransposedEXT(@CType("GLenum") int mode, @CType("const GLdouble *") java.lang.foreign.MemorySegment m) {
        if (Unmarshal.isNullPointer(handles.PFN_glMatrixMultTransposedEXT)) throw new SymbolNotFoundError("Symbol not found: glMatrixMultTransposedEXT");
        try { Handles.MH_glMatrixMultTransposedEXT.invokeExact(handles.PFN_glMatrixMultTransposedEXT, mode, m); }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixMultTransposedEXT", e); }
    }

    public void NamedBufferDataEXT(@CType("GLuint") int buffer, @CType("GLsizeiptr") long size, @CType("const void *") java.lang.foreign.MemorySegment data, @CType("GLenum") int usage) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedBufferDataEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedBufferDataEXT");
        try { Handles.MH_glNamedBufferDataEXT.invokeExact(handles.PFN_glNamedBufferDataEXT, buffer, size, data, usage); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedBufferDataEXT", e); }
    }

    public void NamedBufferSubDataEXT(@CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedBufferSubDataEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedBufferSubDataEXT");
        try { Handles.MH_glNamedBufferSubDataEXT.invokeExact(handles.PFN_glNamedBufferSubDataEXT, buffer, offset, size, data); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedBufferSubDataEXT", e); }
    }

    public @CType("void*") java.lang.foreign.MemorySegment MapNamedBufferEXT(@CType("GLuint") int buffer, @CType("GLenum") int access) {
        if (Unmarshal.isNullPointer(handles.PFN_glMapNamedBufferEXT)) throw new SymbolNotFoundError("Symbol not found: glMapNamedBufferEXT");
        try { return (java.lang.foreign.MemorySegment) Handles.MH_glMapNamedBufferEXT.invokeExact(handles.PFN_glMapNamedBufferEXT, buffer, access); }
        catch (Throwable e) { throw new RuntimeException("error in glMapNamedBufferEXT", e); }
    }

    public @CType("GLboolean") boolean UnmapNamedBufferEXT(@CType("GLuint") int buffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glUnmapNamedBufferEXT)) throw new SymbolNotFoundError("Symbol not found: glUnmapNamedBufferEXT");
        try { return (boolean) Handles.MH_glUnmapNamedBufferEXT.invokeExact(handles.PFN_glUnmapNamedBufferEXT, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in glUnmapNamedBufferEXT", e); }
    }

    public void GetNamedBufferParameterivEXT(@CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedBufferParameterivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetNamedBufferParameterivEXT");
        try { Handles.MH_glGetNamedBufferParameterivEXT.invokeExact(handles.PFN_glGetNamedBufferParameterivEXT, buffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedBufferParameterivEXT", e); }
    }

    public void GetNamedBufferPointervEXT(@CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("void **") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedBufferPointervEXT)) throw new SymbolNotFoundError("Symbol not found: glGetNamedBufferPointervEXT");
        try { Handles.MH_glGetNamedBufferPointervEXT.invokeExact(handles.PFN_glGetNamedBufferPointervEXT, buffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedBufferPointervEXT", e); }
    }

    public void GetNamedBufferSubDataEXT(@CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("void*") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedBufferSubDataEXT)) throw new SymbolNotFoundError("Symbol not found: glGetNamedBufferSubDataEXT");
        try { Handles.MH_glGetNamedBufferSubDataEXT.invokeExact(handles.PFN_glGetNamedBufferSubDataEXT, buffer, offset, size, data); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedBufferSubDataEXT", e); }
    }

    public void ProgramUniform1fEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLfloat") float v0) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform1fEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1fEXT");
        try { Handles.MH_glProgramUniform1fEXT.invokeExact(handles.PFN_glProgramUniform1fEXT, program, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1fEXT", e); }
    }

    public void ProgramUniform2fEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLfloat") float v0, @CType("GLfloat") float v1) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform2fEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2fEXT");
        try { Handles.MH_glProgramUniform2fEXT.invokeExact(handles.PFN_glProgramUniform2fEXT, program, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2fEXT", e); }
    }

    public void ProgramUniform3fEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLfloat") float v0, @CType("GLfloat") float v1, @CType("GLfloat") float v2) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform3fEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3fEXT");
        try { Handles.MH_glProgramUniform3fEXT.invokeExact(handles.PFN_glProgramUniform3fEXT, program, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3fEXT", e); }
    }

    public void ProgramUniform4fEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLfloat") float v0, @CType("GLfloat") float v1, @CType("GLfloat") float v2, @CType("GLfloat") float v3) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform4fEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4fEXT");
        try { Handles.MH_glProgramUniform4fEXT.invokeExact(handles.PFN_glProgramUniform4fEXT, program, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4fEXT", e); }
    }

    public void ProgramUniform1iEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint") int v0) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform1iEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1iEXT");
        try { Handles.MH_glProgramUniform1iEXT.invokeExact(handles.PFN_glProgramUniform1iEXT, program, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1iEXT", e); }
    }

    public void ProgramUniform2iEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint") int v0, @CType("GLint") int v1) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform2iEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2iEXT");
        try { Handles.MH_glProgramUniform2iEXT.invokeExact(handles.PFN_glProgramUniform2iEXT, program, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2iEXT", e); }
    }

    public void ProgramUniform3iEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint") int v0, @CType("GLint") int v1, @CType("GLint") int v2) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform3iEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3iEXT");
        try { Handles.MH_glProgramUniform3iEXT.invokeExact(handles.PFN_glProgramUniform3iEXT, program, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3iEXT", e); }
    }

    public void ProgramUniform4iEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint") int v0, @CType("GLint") int v1, @CType("GLint") int v2, @CType("GLint") int v3) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform4iEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4iEXT");
        try { Handles.MH_glProgramUniform4iEXT.invokeExact(handles.PFN_glProgramUniform4iEXT, program, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4iEXT", e); }
    }

    public void ProgramUniform1fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform1fvEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1fvEXT");
        try { Handles.MH_glProgramUniform1fvEXT.invokeExact(handles.PFN_glProgramUniform1fvEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1fvEXT", e); }
    }

    public void ProgramUniform2fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform2fvEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2fvEXT");
        try { Handles.MH_glProgramUniform2fvEXT.invokeExact(handles.PFN_glProgramUniform2fvEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2fvEXT", e); }
    }

    public void ProgramUniform3fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform3fvEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3fvEXT");
        try { Handles.MH_glProgramUniform3fvEXT.invokeExact(handles.PFN_glProgramUniform3fvEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3fvEXT", e); }
    }

    public void ProgramUniform4fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform4fvEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4fvEXT");
        try { Handles.MH_glProgramUniform4fvEXT.invokeExact(handles.PFN_glProgramUniform4fvEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4fvEXT", e); }
    }

    public void ProgramUniform1ivEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform1ivEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1ivEXT");
        try { Handles.MH_glProgramUniform1ivEXT.invokeExact(handles.PFN_glProgramUniform1ivEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1ivEXT", e); }
    }

    public void ProgramUniform2ivEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform2ivEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2ivEXT");
        try { Handles.MH_glProgramUniform2ivEXT.invokeExact(handles.PFN_glProgramUniform2ivEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2ivEXT", e); }
    }

    public void ProgramUniform3ivEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform3ivEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3ivEXT");
        try { Handles.MH_glProgramUniform3ivEXT.invokeExact(handles.PFN_glProgramUniform3ivEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3ivEXT", e); }
    }

    public void ProgramUniform4ivEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform4ivEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4ivEXT");
        try { Handles.MH_glProgramUniform4ivEXT.invokeExact(handles.PFN_glProgramUniform4ivEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4ivEXT", e); }
    }

    public void ProgramUniformMatrix2fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix2fvEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix2fvEXT");
        try { Handles.MH_glProgramUniformMatrix2fvEXT.invokeExact(handles.PFN_glProgramUniformMatrix2fvEXT, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2fvEXT", e); }
    }

    public void ProgramUniformMatrix3fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix3fvEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix3fvEXT");
        try { Handles.MH_glProgramUniformMatrix3fvEXT.invokeExact(handles.PFN_glProgramUniformMatrix3fvEXT, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3fvEXT", e); }
    }

    public void ProgramUniformMatrix4fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix4fvEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix4fvEXT");
        try { Handles.MH_glProgramUniformMatrix4fvEXT.invokeExact(handles.PFN_glProgramUniformMatrix4fvEXT, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4fvEXT", e); }
    }

    public void ProgramUniformMatrix2x3fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix2x3fvEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix2x3fvEXT");
        try { Handles.MH_glProgramUniformMatrix2x3fvEXT.invokeExact(handles.PFN_glProgramUniformMatrix2x3fvEXT, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2x3fvEXT", e); }
    }

    public void ProgramUniformMatrix3x2fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix3x2fvEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix3x2fvEXT");
        try { Handles.MH_glProgramUniformMatrix3x2fvEXT.invokeExact(handles.PFN_glProgramUniformMatrix3x2fvEXT, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3x2fvEXT", e); }
    }

    public void ProgramUniformMatrix2x4fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix2x4fvEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix2x4fvEXT");
        try { Handles.MH_glProgramUniformMatrix2x4fvEXT.invokeExact(handles.PFN_glProgramUniformMatrix2x4fvEXT, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2x4fvEXT", e); }
    }

    public void ProgramUniformMatrix4x2fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix4x2fvEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix4x2fvEXT");
        try { Handles.MH_glProgramUniformMatrix4x2fvEXT.invokeExact(handles.PFN_glProgramUniformMatrix4x2fvEXT, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4x2fvEXT", e); }
    }

    public void ProgramUniformMatrix3x4fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix3x4fvEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix3x4fvEXT");
        try { Handles.MH_glProgramUniformMatrix3x4fvEXT.invokeExact(handles.PFN_glProgramUniformMatrix3x4fvEXT, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3x4fvEXT", e); }
    }

    public void ProgramUniformMatrix4x3fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix4x3fvEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix4x3fvEXT");
        try { Handles.MH_glProgramUniformMatrix4x3fvEXT.invokeExact(handles.PFN_glProgramUniformMatrix4x3fvEXT, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4x3fvEXT", e); }
    }

    public void TextureBufferEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLuint") int buffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureBufferEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureBufferEXT");
        try { Handles.MH_glTextureBufferEXT.invokeExact(handles.PFN_glTextureBufferEXT, texture, target, internalformat, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureBufferEXT", e); }
    }

    public void MultiTexBufferEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLuint") int buffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexBufferEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiTexBufferEXT");
        try { Handles.MH_glMultiTexBufferEXT.invokeExact(handles.PFN_glMultiTexBufferEXT, texunit, target, internalformat, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexBufferEXT", e); }
    }

    public void TextureParameterIivEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureParameterIivEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureParameterIivEXT");
        try { Handles.MH_glTextureParameterIivEXT.invokeExact(handles.PFN_glTextureParameterIivEXT, texture, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureParameterIivEXT", e); }
    }

    public void TextureParameterIuivEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLuint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureParameterIuivEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureParameterIuivEXT");
        try { Handles.MH_glTextureParameterIuivEXT.invokeExact(handles.PFN_glTextureParameterIuivEXT, texture, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureParameterIuivEXT", e); }
    }

    public void GetTextureParameterIivEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTextureParameterIivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetTextureParameterIivEXT");
        try { Handles.MH_glGetTextureParameterIivEXT.invokeExact(handles.PFN_glGetTextureParameterIivEXT, texture, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureParameterIivEXT", e); }
    }

    public void GetTextureParameterIuivEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetTextureParameterIuivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetTextureParameterIuivEXT");
        try { Handles.MH_glGetTextureParameterIuivEXT.invokeExact(handles.PFN_glGetTextureParameterIuivEXT, texture, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureParameterIuivEXT", e); }
    }

    public void MultiTexParameterIivEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexParameterIivEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiTexParameterIivEXT");
        try { Handles.MH_glMultiTexParameterIivEXT.invokeExact(handles.PFN_glMultiTexParameterIivEXT, texunit, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexParameterIivEXT", e); }
    }

    public void MultiTexParameterIuivEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLuint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexParameterIuivEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiTexParameterIuivEXT");
        try { Handles.MH_glMultiTexParameterIuivEXT.invokeExact(handles.PFN_glMultiTexParameterIuivEXT, texunit, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexParameterIuivEXT", e); }
    }

    public void GetMultiTexParameterIivEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetMultiTexParameterIivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetMultiTexParameterIivEXT");
        try { Handles.MH_glGetMultiTexParameterIivEXT.invokeExact(handles.PFN_glGetMultiTexParameterIivEXT, texunit, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetMultiTexParameterIivEXT", e); }
    }

    public void GetMultiTexParameterIuivEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetMultiTexParameterIuivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetMultiTexParameterIuivEXT");
        try { Handles.MH_glGetMultiTexParameterIuivEXT.invokeExact(handles.PFN_glGetMultiTexParameterIuivEXT, texunit, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetMultiTexParameterIuivEXT", e); }
    }

    public void ProgramUniform1uiEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint") int v0) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform1uiEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1uiEXT");
        try { Handles.MH_glProgramUniform1uiEXT.invokeExact(handles.PFN_glProgramUniform1uiEXT, program, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1uiEXT", e); }
    }

    public void ProgramUniform2uiEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint") int v0, @CType("GLuint") int v1) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform2uiEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2uiEXT");
        try { Handles.MH_glProgramUniform2uiEXT.invokeExact(handles.PFN_glProgramUniform2uiEXT, program, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2uiEXT", e); }
    }

    public void ProgramUniform3uiEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint") int v0, @CType("GLuint") int v1, @CType("GLuint") int v2) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform3uiEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3uiEXT");
        try { Handles.MH_glProgramUniform3uiEXT.invokeExact(handles.PFN_glProgramUniform3uiEXT, program, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3uiEXT", e); }
    }

    public void ProgramUniform4uiEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint") int v0, @CType("GLuint") int v1, @CType("GLuint") int v2, @CType("GLuint") int v3) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform4uiEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4uiEXT");
        try { Handles.MH_glProgramUniform4uiEXT.invokeExact(handles.PFN_glProgramUniform4uiEXT, program, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4uiEXT", e); }
    }

    public void ProgramUniform1uivEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform1uivEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1uivEXT");
        try { Handles.MH_glProgramUniform1uivEXT.invokeExact(handles.PFN_glProgramUniform1uivEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1uivEXT", e); }
    }

    public void ProgramUniform2uivEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform2uivEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2uivEXT");
        try { Handles.MH_glProgramUniform2uivEXT.invokeExact(handles.PFN_glProgramUniform2uivEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2uivEXT", e); }
    }

    public void ProgramUniform3uivEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform3uivEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3uivEXT");
        try { Handles.MH_glProgramUniform3uivEXT.invokeExact(handles.PFN_glProgramUniform3uivEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3uivEXT", e); }
    }

    public void ProgramUniform4uivEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform4uivEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4uivEXT");
        try { Handles.MH_glProgramUniform4uivEXT.invokeExact(handles.PFN_glProgramUniform4uivEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4uivEXT", e); }
    }

    public void NamedProgramLocalParameters4fvEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedProgramLocalParameters4fvEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedProgramLocalParameters4fvEXT");
        try { Handles.MH_glNamedProgramLocalParameters4fvEXT.invokeExact(handles.PFN_glNamedProgramLocalParameters4fvEXT, program, target, index, count, params); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedProgramLocalParameters4fvEXT", e); }
    }

    public void NamedProgramLocalParameterI4iEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("GLint") int x, @CType("GLint") int y, @CType("GLint") int z, @CType("GLint") int w) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedProgramLocalParameterI4iEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedProgramLocalParameterI4iEXT");
        try { Handles.MH_glNamedProgramLocalParameterI4iEXT.invokeExact(handles.PFN_glNamedProgramLocalParameterI4iEXT, program, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedProgramLocalParameterI4iEXT", e); }
    }

    public void NamedProgramLocalParameterI4ivEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedProgramLocalParameterI4ivEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedProgramLocalParameterI4ivEXT");
        try { Handles.MH_glNamedProgramLocalParameterI4ivEXT.invokeExact(handles.PFN_glNamedProgramLocalParameterI4ivEXT, program, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedProgramLocalParameterI4ivEXT", e); }
    }

    public void NamedProgramLocalParametersI4ivEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedProgramLocalParametersI4ivEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedProgramLocalParametersI4ivEXT");
        try { Handles.MH_glNamedProgramLocalParametersI4ivEXT.invokeExact(handles.PFN_glNamedProgramLocalParametersI4ivEXT, program, target, index, count, params); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedProgramLocalParametersI4ivEXT", e); }
    }

    public void NamedProgramLocalParameterI4uiEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint") int x, @CType("GLuint") int y, @CType("GLuint") int z, @CType("GLuint") int w) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedProgramLocalParameterI4uiEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedProgramLocalParameterI4uiEXT");
        try { Handles.MH_glNamedProgramLocalParameterI4uiEXT.invokeExact(handles.PFN_glNamedProgramLocalParameterI4uiEXT, program, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedProgramLocalParameterI4uiEXT", e); }
    }

    public void NamedProgramLocalParameterI4uivEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("const GLuint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedProgramLocalParameterI4uivEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedProgramLocalParameterI4uivEXT");
        try { Handles.MH_glNamedProgramLocalParameterI4uivEXT.invokeExact(handles.PFN_glNamedProgramLocalParameterI4uivEXT, program, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedProgramLocalParameterI4uivEXT", e); }
    }

    public void NamedProgramLocalParametersI4uivEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedProgramLocalParametersI4uivEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedProgramLocalParametersI4uivEXT");
        try { Handles.MH_glNamedProgramLocalParametersI4uivEXT.invokeExact(handles.PFN_glNamedProgramLocalParametersI4uivEXT, program, target, index, count, params); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedProgramLocalParametersI4uivEXT", e); }
    }

    public void GetNamedProgramLocalParameterIivEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedProgramLocalParameterIivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetNamedProgramLocalParameterIivEXT");
        try { Handles.MH_glGetNamedProgramLocalParameterIivEXT.invokeExact(handles.PFN_glGetNamedProgramLocalParameterIivEXT, program, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedProgramLocalParameterIivEXT", e); }
    }

    public void GetNamedProgramLocalParameterIuivEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedProgramLocalParameterIuivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetNamedProgramLocalParameterIuivEXT");
        try { Handles.MH_glGetNamedProgramLocalParameterIuivEXT.invokeExact(handles.PFN_glGetNamedProgramLocalParameterIuivEXT, program, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedProgramLocalParameterIuivEXT", e); }
    }

    public void EnableClientStateiEXT(@CType("GLenum") int array, @CType("GLuint") int index) {
        if (Unmarshal.isNullPointer(handles.PFN_glEnableClientStateiEXT)) throw new SymbolNotFoundError("Symbol not found: glEnableClientStateiEXT");
        try { Handles.MH_glEnableClientStateiEXT.invokeExact(handles.PFN_glEnableClientStateiEXT, array, index); }
        catch (Throwable e) { throw new RuntimeException("error in glEnableClientStateiEXT", e); }
    }

    public void DisableClientStateiEXT(@CType("GLenum") int array, @CType("GLuint") int index) {
        if (Unmarshal.isNullPointer(handles.PFN_glDisableClientStateiEXT)) throw new SymbolNotFoundError("Symbol not found: glDisableClientStateiEXT");
        try { Handles.MH_glDisableClientStateiEXT.invokeExact(handles.PFN_glDisableClientStateiEXT, array, index); }
        catch (Throwable e) { throw new RuntimeException("error in glDisableClientStateiEXT", e); }
    }

    public void GetFloati_vEXT(@CType("GLenum") int pname, @CType("GLuint") int index, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetFloati_vEXT)) throw new SymbolNotFoundError("Symbol not found: glGetFloati_vEXT");
        try { Handles.MH_glGetFloati_vEXT.invokeExact(handles.PFN_glGetFloati_vEXT, pname, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetFloati_vEXT", e); }
    }

    public void GetDoublei_vEXT(@CType("GLenum") int pname, @CType("GLuint") int index, @CType("GLdouble *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetDoublei_vEXT)) throw new SymbolNotFoundError("Symbol not found: glGetDoublei_vEXT");
        try { Handles.MH_glGetDoublei_vEXT.invokeExact(handles.PFN_glGetDoublei_vEXT, pname, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetDoublei_vEXT", e); }
    }

    public void GetPointeri_vEXT(@CType("GLenum") int pname, @CType("GLuint") int index, @CType("void **") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetPointeri_vEXT)) throw new SymbolNotFoundError("Symbol not found: glGetPointeri_vEXT");
        try { Handles.MH_glGetPointeri_vEXT.invokeExact(handles.PFN_glGetPointeri_vEXT, pname, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetPointeri_vEXT", e); }
    }

    public void NamedProgramStringEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLenum") int format, @CType("GLsizei") int len, @CType("const void *") java.lang.foreign.MemorySegment string) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedProgramStringEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedProgramStringEXT");
        try { Handles.MH_glNamedProgramStringEXT.invokeExact(handles.PFN_glNamedProgramStringEXT, program, target, format, len, string); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedProgramStringEXT", e); }
    }

    public void NamedProgramLocalParameter4dEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z, @CType("GLdouble") double w) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedProgramLocalParameter4dEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedProgramLocalParameter4dEXT");
        try { Handles.MH_glNamedProgramLocalParameter4dEXT.invokeExact(handles.PFN_glNamedProgramLocalParameter4dEXT, program, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedProgramLocalParameter4dEXT", e); }
    }

    public void NamedProgramLocalParameter4dvEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedProgramLocalParameter4dvEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedProgramLocalParameter4dvEXT");
        try { Handles.MH_glNamedProgramLocalParameter4dvEXT.invokeExact(handles.PFN_glNamedProgramLocalParameter4dvEXT, program, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedProgramLocalParameter4dvEXT", e); }
    }

    public void NamedProgramLocalParameter4fEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z, @CType("GLfloat") float w) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedProgramLocalParameter4fEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedProgramLocalParameter4fEXT");
        try { Handles.MH_glNamedProgramLocalParameter4fEXT.invokeExact(handles.PFN_glNamedProgramLocalParameter4fEXT, program, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedProgramLocalParameter4fEXT", e); }
    }

    public void NamedProgramLocalParameter4fvEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedProgramLocalParameter4fvEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedProgramLocalParameter4fvEXT");
        try { Handles.MH_glNamedProgramLocalParameter4fvEXT.invokeExact(handles.PFN_glNamedProgramLocalParameter4fvEXT, program, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedProgramLocalParameter4fvEXT", e); }
    }

    public void GetNamedProgramLocalParameterdvEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("GLdouble *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedProgramLocalParameterdvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetNamedProgramLocalParameterdvEXT");
        try { Handles.MH_glGetNamedProgramLocalParameterdvEXT.invokeExact(handles.PFN_glGetNamedProgramLocalParameterdvEXT, program, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedProgramLocalParameterdvEXT", e); }
    }

    public void GetNamedProgramLocalParameterfvEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedProgramLocalParameterfvEXT)) throw new SymbolNotFoundError("Symbol not found: glGetNamedProgramLocalParameterfvEXT");
        try { Handles.MH_glGetNamedProgramLocalParameterfvEXT.invokeExact(handles.PFN_glGetNamedProgramLocalParameterfvEXT, program, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedProgramLocalParameterfvEXT", e); }
    }

    public void GetNamedProgramivEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedProgramivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetNamedProgramivEXT");
        try { Handles.MH_glGetNamedProgramivEXT.invokeExact(handles.PFN_glGetNamedProgramivEXT, program, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedProgramivEXT", e); }
    }

    public void GetNamedProgramStringEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("void*") java.lang.foreign.MemorySegment string) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedProgramStringEXT)) throw new SymbolNotFoundError("Symbol not found: glGetNamedProgramStringEXT");
        try { Handles.MH_glGetNamedProgramStringEXT.invokeExact(handles.PFN_glGetNamedProgramStringEXT, program, target, pname, string); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedProgramStringEXT", e); }
    }

    public void NamedRenderbufferStorageEXT(@CType("GLuint") int renderbuffer, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedRenderbufferStorageEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedRenderbufferStorageEXT");
        try { Handles.MH_glNamedRenderbufferStorageEXT.invokeExact(handles.PFN_glNamedRenderbufferStorageEXT, renderbuffer, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedRenderbufferStorageEXT", e); }
    }

    public void GetNamedRenderbufferParameterivEXT(@CType("GLuint") int renderbuffer, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedRenderbufferParameterivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetNamedRenderbufferParameterivEXT");
        try { Handles.MH_glGetNamedRenderbufferParameterivEXT.invokeExact(handles.PFN_glGetNamedRenderbufferParameterivEXT, renderbuffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedRenderbufferParameterivEXT", e); }
    }

    public void NamedRenderbufferStorageMultisampleEXT(@CType("GLuint") int renderbuffer, @CType("GLsizei") int samples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedRenderbufferStorageMultisampleEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedRenderbufferStorageMultisampleEXT");
        try { Handles.MH_glNamedRenderbufferStorageMultisampleEXT.invokeExact(handles.PFN_glNamedRenderbufferStorageMultisampleEXT, renderbuffer, samples, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedRenderbufferStorageMultisampleEXT", e); }
    }

    public void NamedRenderbufferStorageMultisampleCoverageEXT(@CType("GLuint") int renderbuffer, @CType("GLsizei") int coverageSamples, @CType("GLsizei") int colorSamples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedRenderbufferStorageMultisampleCoverageEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedRenderbufferStorageMultisampleCoverageEXT");
        try { Handles.MH_glNamedRenderbufferStorageMultisampleCoverageEXT.invokeExact(handles.PFN_glNamedRenderbufferStorageMultisampleCoverageEXT, renderbuffer, coverageSamples, colorSamples, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedRenderbufferStorageMultisampleCoverageEXT", e); }
    }

    public @CType("GLenum") int CheckNamedFramebufferStatusEXT(@CType("GLuint") int framebuffer, @CType("GLenum") int target) {
        if (Unmarshal.isNullPointer(handles.PFN_glCheckNamedFramebufferStatusEXT)) throw new SymbolNotFoundError("Symbol not found: glCheckNamedFramebufferStatusEXT");
        try { return (int) Handles.MH_glCheckNamedFramebufferStatusEXT.invokeExact(handles.PFN_glCheckNamedFramebufferStatusEXT, framebuffer, target); }
        catch (Throwable e) { throw new RuntimeException("error in glCheckNamedFramebufferStatusEXT", e); }
    }

    public void NamedFramebufferTexture1DEXT(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLenum") int textarget, @CType("GLuint") int texture, @CType("GLint") int level) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedFramebufferTexture1DEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferTexture1DEXT");
        try { Handles.MH_glNamedFramebufferTexture1DEXT.invokeExact(handles.PFN_glNamedFramebufferTexture1DEXT, framebuffer, attachment, textarget, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferTexture1DEXT", e); }
    }

    public void NamedFramebufferTexture2DEXT(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLenum") int textarget, @CType("GLuint") int texture, @CType("GLint") int level) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedFramebufferTexture2DEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferTexture2DEXT");
        try { Handles.MH_glNamedFramebufferTexture2DEXT.invokeExact(handles.PFN_glNamedFramebufferTexture2DEXT, framebuffer, attachment, textarget, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferTexture2DEXT", e); }
    }

    public void NamedFramebufferTexture3DEXT(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLenum") int textarget, @CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int zoffset) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedFramebufferTexture3DEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferTexture3DEXT");
        try { Handles.MH_glNamedFramebufferTexture3DEXT.invokeExact(handles.PFN_glNamedFramebufferTexture3DEXT, framebuffer, attachment, textarget, texture, level, zoffset); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferTexture3DEXT", e); }
    }

    public void NamedFramebufferRenderbufferEXT(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLenum") int renderbuffertarget, @CType("GLuint") int renderbuffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedFramebufferRenderbufferEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferRenderbufferEXT");
        try { Handles.MH_glNamedFramebufferRenderbufferEXT.invokeExact(handles.PFN_glNamedFramebufferRenderbufferEXT, framebuffer, attachment, renderbuffertarget, renderbuffer); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferRenderbufferEXT", e); }
    }

    public void GetNamedFramebufferAttachmentParameterivEXT(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedFramebufferAttachmentParameterivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetNamedFramebufferAttachmentParameterivEXT");
        try { Handles.MH_glGetNamedFramebufferAttachmentParameterivEXT.invokeExact(handles.PFN_glGetNamedFramebufferAttachmentParameterivEXT, framebuffer, attachment, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedFramebufferAttachmentParameterivEXT", e); }
    }

    public void GenerateTextureMipmapEXT(@CType("GLuint") int texture, @CType("GLenum") int target) {
        if (Unmarshal.isNullPointer(handles.PFN_glGenerateTextureMipmapEXT)) throw new SymbolNotFoundError("Symbol not found: glGenerateTextureMipmapEXT");
        try { Handles.MH_glGenerateTextureMipmapEXT.invokeExact(handles.PFN_glGenerateTextureMipmapEXT, texture, target); }
        catch (Throwable e) { throw new RuntimeException("error in glGenerateTextureMipmapEXT", e); }
    }

    public void GenerateMultiTexMipmapEXT(@CType("GLenum") int texunit, @CType("GLenum") int target) {
        if (Unmarshal.isNullPointer(handles.PFN_glGenerateMultiTexMipmapEXT)) throw new SymbolNotFoundError("Symbol not found: glGenerateMultiTexMipmapEXT");
        try { Handles.MH_glGenerateMultiTexMipmapEXT.invokeExact(handles.PFN_glGenerateMultiTexMipmapEXT, texunit, target); }
        catch (Throwable e) { throw new RuntimeException("error in glGenerateMultiTexMipmapEXT", e); }
    }

    public void FramebufferDrawBufferEXT(@CType("GLuint") int framebuffer, @CType("GLenum") int mode) {
        if (Unmarshal.isNullPointer(handles.PFN_glFramebufferDrawBufferEXT)) throw new SymbolNotFoundError("Symbol not found: glFramebufferDrawBufferEXT");
        try { Handles.MH_glFramebufferDrawBufferEXT.invokeExact(handles.PFN_glFramebufferDrawBufferEXT, framebuffer, mode); }
        catch (Throwable e) { throw new RuntimeException("error in glFramebufferDrawBufferEXT", e); }
    }

    public void FramebufferDrawBuffersEXT(@CType("GLuint") int framebuffer, @CType("GLsizei") int n, @CType("const GLenum *") java.lang.foreign.MemorySegment bufs) {
        if (Unmarshal.isNullPointer(handles.PFN_glFramebufferDrawBuffersEXT)) throw new SymbolNotFoundError("Symbol not found: glFramebufferDrawBuffersEXT");
        try { Handles.MH_glFramebufferDrawBuffersEXT.invokeExact(handles.PFN_glFramebufferDrawBuffersEXT, framebuffer, n, bufs); }
        catch (Throwable e) { throw new RuntimeException("error in glFramebufferDrawBuffersEXT", e); }
    }

    public void FramebufferReadBufferEXT(@CType("GLuint") int framebuffer, @CType("GLenum") int mode) {
        if (Unmarshal.isNullPointer(handles.PFN_glFramebufferReadBufferEXT)) throw new SymbolNotFoundError("Symbol not found: glFramebufferReadBufferEXT");
        try { Handles.MH_glFramebufferReadBufferEXT.invokeExact(handles.PFN_glFramebufferReadBufferEXT, framebuffer, mode); }
        catch (Throwable e) { throw new RuntimeException("error in glFramebufferReadBufferEXT", e); }
    }

    public void GetFramebufferParameterivEXT(@CType("GLuint") int framebuffer, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetFramebufferParameterivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetFramebufferParameterivEXT");
        try { Handles.MH_glGetFramebufferParameterivEXT.invokeExact(handles.PFN_glGetFramebufferParameterivEXT, framebuffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetFramebufferParameterivEXT", e); }
    }

    public void NamedCopyBufferSubDataEXT(@CType("GLuint") int readBuffer, @CType("GLuint") int writeBuffer, @CType("GLintptr") long readOffset, @CType("GLintptr") long writeOffset, @CType("GLsizeiptr") long size) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedCopyBufferSubDataEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedCopyBufferSubDataEXT");
        try { Handles.MH_glNamedCopyBufferSubDataEXT.invokeExact(handles.PFN_glNamedCopyBufferSubDataEXT, readBuffer, writeBuffer, readOffset, writeOffset, size); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedCopyBufferSubDataEXT", e); }
    }

    public void NamedFramebufferTextureEXT(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLuint") int texture, @CType("GLint") int level) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedFramebufferTextureEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferTextureEXT");
        try { Handles.MH_glNamedFramebufferTextureEXT.invokeExact(handles.PFN_glNamedFramebufferTextureEXT, framebuffer, attachment, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferTextureEXT", e); }
    }

    public void NamedFramebufferTextureLayerEXT(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int layer) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedFramebufferTextureLayerEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferTextureLayerEXT");
        try { Handles.MH_glNamedFramebufferTextureLayerEXT.invokeExact(handles.PFN_glNamedFramebufferTextureLayerEXT, framebuffer, attachment, texture, level, layer); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferTextureLayerEXT", e); }
    }

    public void NamedFramebufferTextureFaceEXT(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLuint") int texture, @CType("GLint") int level, @CType("GLenum") int face) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedFramebufferTextureFaceEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferTextureFaceEXT");
        try { Handles.MH_glNamedFramebufferTextureFaceEXT.invokeExact(handles.PFN_glNamedFramebufferTextureFaceEXT, framebuffer, attachment, texture, level, face); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferTextureFaceEXT", e); }
    }

    public void TextureRenderbufferEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLuint") int renderbuffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureRenderbufferEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureRenderbufferEXT");
        try { Handles.MH_glTextureRenderbufferEXT.invokeExact(handles.PFN_glTextureRenderbufferEXT, texture, target, renderbuffer); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureRenderbufferEXT", e); }
    }

    public void MultiTexRenderbufferEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLuint") int renderbuffer) {
        if (Unmarshal.isNullPointer(handles.PFN_glMultiTexRenderbufferEXT)) throw new SymbolNotFoundError("Symbol not found: glMultiTexRenderbufferEXT");
        try { Handles.MH_glMultiTexRenderbufferEXT.invokeExact(handles.PFN_glMultiTexRenderbufferEXT, texunit, target, renderbuffer); }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexRenderbufferEXT", e); }
    }

    public void VertexArrayVertexOffsetEXT(@CType("GLuint") int vaobj, @CType("GLuint") int buffer, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLintptr") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArrayVertexOffsetEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayVertexOffsetEXT");
        try { Handles.MH_glVertexArrayVertexOffsetEXT.invokeExact(handles.PFN_glVertexArrayVertexOffsetEXT, vaobj, buffer, size, type, stride, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayVertexOffsetEXT", e); }
    }

    public void VertexArrayColorOffsetEXT(@CType("GLuint") int vaobj, @CType("GLuint") int buffer, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLintptr") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArrayColorOffsetEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayColorOffsetEXT");
        try { Handles.MH_glVertexArrayColorOffsetEXT.invokeExact(handles.PFN_glVertexArrayColorOffsetEXT, vaobj, buffer, size, type, stride, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayColorOffsetEXT", e); }
    }

    public void VertexArrayEdgeFlagOffsetEXT(@CType("GLuint") int vaobj, @CType("GLuint") int buffer, @CType("GLsizei") int stride, @CType("GLintptr") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArrayEdgeFlagOffsetEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayEdgeFlagOffsetEXT");
        try { Handles.MH_glVertexArrayEdgeFlagOffsetEXT.invokeExact(handles.PFN_glVertexArrayEdgeFlagOffsetEXT, vaobj, buffer, stride, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayEdgeFlagOffsetEXT", e); }
    }

    public void VertexArrayIndexOffsetEXT(@CType("GLuint") int vaobj, @CType("GLuint") int buffer, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLintptr") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArrayIndexOffsetEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayIndexOffsetEXT");
        try { Handles.MH_glVertexArrayIndexOffsetEXT.invokeExact(handles.PFN_glVertexArrayIndexOffsetEXT, vaobj, buffer, type, stride, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayIndexOffsetEXT", e); }
    }

    public void VertexArrayNormalOffsetEXT(@CType("GLuint") int vaobj, @CType("GLuint") int buffer, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLintptr") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArrayNormalOffsetEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayNormalOffsetEXT");
        try { Handles.MH_glVertexArrayNormalOffsetEXT.invokeExact(handles.PFN_glVertexArrayNormalOffsetEXT, vaobj, buffer, type, stride, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayNormalOffsetEXT", e); }
    }

    public void VertexArrayTexCoordOffsetEXT(@CType("GLuint") int vaobj, @CType("GLuint") int buffer, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLintptr") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArrayTexCoordOffsetEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayTexCoordOffsetEXT");
        try { Handles.MH_glVertexArrayTexCoordOffsetEXT.invokeExact(handles.PFN_glVertexArrayTexCoordOffsetEXT, vaobj, buffer, size, type, stride, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayTexCoordOffsetEXT", e); }
    }

    public void VertexArrayMultiTexCoordOffsetEXT(@CType("GLuint") int vaobj, @CType("GLuint") int buffer, @CType("GLenum") int texunit, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLintptr") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArrayMultiTexCoordOffsetEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayMultiTexCoordOffsetEXT");
        try { Handles.MH_glVertexArrayMultiTexCoordOffsetEXT.invokeExact(handles.PFN_glVertexArrayMultiTexCoordOffsetEXT, vaobj, buffer, texunit, size, type, stride, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayMultiTexCoordOffsetEXT", e); }
    }

    public void VertexArrayFogCoordOffsetEXT(@CType("GLuint") int vaobj, @CType("GLuint") int buffer, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLintptr") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArrayFogCoordOffsetEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayFogCoordOffsetEXT");
        try { Handles.MH_glVertexArrayFogCoordOffsetEXT.invokeExact(handles.PFN_glVertexArrayFogCoordOffsetEXT, vaobj, buffer, type, stride, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayFogCoordOffsetEXT", e); }
    }

    public void VertexArraySecondaryColorOffsetEXT(@CType("GLuint") int vaobj, @CType("GLuint") int buffer, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLintptr") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArraySecondaryColorOffsetEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexArraySecondaryColorOffsetEXT");
        try { Handles.MH_glVertexArraySecondaryColorOffsetEXT.invokeExact(handles.PFN_glVertexArraySecondaryColorOffsetEXT, vaobj, buffer, size, type, stride, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArraySecondaryColorOffsetEXT", e); }
    }

    public void VertexArrayVertexAttribOffsetEXT(@CType("GLuint") int vaobj, @CType("GLuint") int buffer, @CType("GLuint") int index, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("GLsizei") int stride, @CType("GLintptr") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArrayVertexAttribOffsetEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayVertexAttribOffsetEXT");
        try { Handles.MH_glVertexArrayVertexAttribOffsetEXT.invokeExact(handles.PFN_glVertexArrayVertexAttribOffsetEXT, vaobj, buffer, index, size, type, normalized, stride, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayVertexAttribOffsetEXT", e); }
    }

    public void VertexArrayVertexAttribIOffsetEXT(@CType("GLuint") int vaobj, @CType("GLuint") int buffer, @CType("GLuint") int index, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLintptr") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArrayVertexAttribIOffsetEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayVertexAttribIOffsetEXT");
        try { Handles.MH_glVertexArrayVertexAttribIOffsetEXT.invokeExact(handles.PFN_glVertexArrayVertexAttribIOffsetEXT, vaobj, buffer, index, size, type, stride, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayVertexAttribIOffsetEXT", e); }
    }

    public void EnableVertexArrayEXT(@CType("GLuint") int vaobj, @CType("GLenum") int array) {
        if (Unmarshal.isNullPointer(handles.PFN_glEnableVertexArrayEXT)) throw new SymbolNotFoundError("Symbol not found: glEnableVertexArrayEXT");
        try { Handles.MH_glEnableVertexArrayEXT.invokeExact(handles.PFN_glEnableVertexArrayEXT, vaobj, array); }
        catch (Throwable e) { throw new RuntimeException("error in glEnableVertexArrayEXT", e); }
    }

    public void DisableVertexArrayEXT(@CType("GLuint") int vaobj, @CType("GLenum") int array) {
        if (Unmarshal.isNullPointer(handles.PFN_glDisableVertexArrayEXT)) throw new SymbolNotFoundError("Symbol not found: glDisableVertexArrayEXT");
        try { Handles.MH_glDisableVertexArrayEXT.invokeExact(handles.PFN_glDisableVertexArrayEXT, vaobj, array); }
        catch (Throwable e) { throw new RuntimeException("error in glDisableVertexArrayEXT", e); }
    }

    public void EnableVertexArrayAttribEXT(@CType("GLuint") int vaobj, @CType("GLuint") int index) {
        if (Unmarshal.isNullPointer(handles.PFN_glEnableVertexArrayAttribEXT)) throw new SymbolNotFoundError("Symbol not found: glEnableVertexArrayAttribEXT");
        try { Handles.MH_glEnableVertexArrayAttribEXT.invokeExact(handles.PFN_glEnableVertexArrayAttribEXT, vaobj, index); }
        catch (Throwable e) { throw new RuntimeException("error in glEnableVertexArrayAttribEXT", e); }
    }

    public void DisableVertexArrayAttribEXT(@CType("GLuint") int vaobj, @CType("GLuint") int index) {
        if (Unmarshal.isNullPointer(handles.PFN_glDisableVertexArrayAttribEXT)) throw new SymbolNotFoundError("Symbol not found: glDisableVertexArrayAttribEXT");
        try { Handles.MH_glDisableVertexArrayAttribEXT.invokeExact(handles.PFN_glDisableVertexArrayAttribEXT, vaobj, index); }
        catch (Throwable e) { throw new RuntimeException("error in glDisableVertexArrayAttribEXT", e); }
    }

    public void GetVertexArrayIntegervEXT(@CType("GLuint") int vaobj, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVertexArrayIntegervEXT)) throw new SymbolNotFoundError("Symbol not found: glGetVertexArrayIntegervEXT");
        try { Handles.MH_glGetVertexArrayIntegervEXT.invokeExact(handles.PFN_glGetVertexArrayIntegervEXT, vaobj, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexArrayIntegervEXT", e); }
    }

    public void GetVertexArrayPointervEXT(@CType("GLuint") int vaobj, @CType("GLenum") int pname, @CType("void **") java.lang.foreign.MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVertexArrayPointervEXT)) throw new SymbolNotFoundError("Symbol not found: glGetVertexArrayPointervEXT");
        try { Handles.MH_glGetVertexArrayPointervEXT.invokeExact(handles.PFN_glGetVertexArrayPointervEXT, vaobj, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexArrayPointervEXT", e); }
    }

    public void GetVertexArrayIntegeri_vEXT(@CType("GLuint") int vaobj, @CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVertexArrayIntegeri_vEXT)) throw new SymbolNotFoundError("Symbol not found: glGetVertexArrayIntegeri_vEXT");
        try { Handles.MH_glGetVertexArrayIntegeri_vEXT.invokeExact(handles.PFN_glGetVertexArrayIntegeri_vEXT, vaobj, index, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexArrayIntegeri_vEXT", e); }
    }

    public void GetVertexArrayPointeri_vEXT(@CType("GLuint") int vaobj, @CType("GLuint") int index, @CType("GLenum") int pname, @CType("void **") java.lang.foreign.MemorySegment param) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetVertexArrayPointeri_vEXT)) throw new SymbolNotFoundError("Symbol not found: glGetVertexArrayPointeri_vEXT");
        try { Handles.MH_glGetVertexArrayPointeri_vEXT.invokeExact(handles.PFN_glGetVertexArrayPointeri_vEXT, vaobj, index, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexArrayPointeri_vEXT", e); }
    }

    public @CType("void*") java.lang.foreign.MemorySegment MapNamedBufferRangeEXT(@CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long length, @CType("GLbitfield") int access) {
        if (Unmarshal.isNullPointer(handles.PFN_glMapNamedBufferRangeEXT)) throw new SymbolNotFoundError("Symbol not found: glMapNamedBufferRangeEXT");
        try { return (java.lang.foreign.MemorySegment) Handles.MH_glMapNamedBufferRangeEXT.invokeExact(handles.PFN_glMapNamedBufferRangeEXT, buffer, offset, length, access); }
        catch (Throwable e) { throw new RuntimeException("error in glMapNamedBufferRangeEXT", e); }
    }

    public void FlushMappedNamedBufferRangeEXT(@CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long length) {
        if (Unmarshal.isNullPointer(handles.PFN_glFlushMappedNamedBufferRangeEXT)) throw new SymbolNotFoundError("Symbol not found: glFlushMappedNamedBufferRangeEXT");
        try { Handles.MH_glFlushMappedNamedBufferRangeEXT.invokeExact(handles.PFN_glFlushMappedNamedBufferRangeEXT, buffer, offset, length); }
        catch (Throwable e) { throw new RuntimeException("error in glFlushMappedNamedBufferRangeEXT", e); }
    }

    public void NamedBufferStorageEXT(@CType("GLuint") int buffer, @CType("GLsizeiptr") long size, @CType("const void *") java.lang.foreign.MemorySegment data, @CType("GLbitfield") int flags) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedBufferStorageEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedBufferStorageEXT");
        try { Handles.MH_glNamedBufferStorageEXT.invokeExact(handles.PFN_glNamedBufferStorageEXT, buffer, size, data, flags); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedBufferStorageEXT", e); }
    }

    public void ClearNamedBufferDataEXT(@CType("GLuint") int buffer, @CType("GLenum") int internalformat, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glClearNamedBufferDataEXT)) throw new SymbolNotFoundError("Symbol not found: glClearNamedBufferDataEXT");
        try { Handles.MH_glClearNamedBufferDataEXT.invokeExact(handles.PFN_glClearNamedBufferDataEXT, buffer, internalformat, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in glClearNamedBufferDataEXT", e); }
    }

    public void ClearNamedBufferSubDataEXT(@CType("GLuint") int buffer, @CType("GLenum") int internalformat, @CType("GLsizeiptr") long offset, @CType("GLsizeiptr") long size, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment data) {
        if (Unmarshal.isNullPointer(handles.PFN_glClearNamedBufferSubDataEXT)) throw new SymbolNotFoundError("Symbol not found: glClearNamedBufferSubDataEXT");
        try { Handles.MH_glClearNamedBufferSubDataEXT.invokeExact(handles.PFN_glClearNamedBufferSubDataEXT, buffer, internalformat, offset, size, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in glClearNamedBufferSubDataEXT", e); }
    }

    public void NamedFramebufferParameteriEXT(@CType("GLuint") int framebuffer, @CType("GLenum") int pname, @CType("GLint") int param) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedFramebufferParameteriEXT)) throw new SymbolNotFoundError("Symbol not found: glNamedFramebufferParameteriEXT");
        try { Handles.MH_glNamedFramebufferParameteriEXT.invokeExact(handles.PFN_glNamedFramebufferParameteriEXT, framebuffer, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferParameteriEXT", e); }
    }

    public void GetNamedFramebufferParameterivEXT(@CType("GLuint") int framebuffer, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedFramebufferParameterivEXT)) throw new SymbolNotFoundError("Symbol not found: glGetNamedFramebufferParameterivEXT");
        try { Handles.MH_glGetNamedFramebufferParameterivEXT.invokeExact(handles.PFN_glGetNamedFramebufferParameterivEXT, framebuffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedFramebufferParameterivEXT", e); }
    }

    public void ProgramUniform1dEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLdouble") double x) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform1dEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1dEXT");
        try { Handles.MH_glProgramUniform1dEXT.invokeExact(handles.PFN_glProgramUniform1dEXT, program, location, x); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1dEXT", e); }
    }

    public void ProgramUniform2dEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLdouble") double x, @CType("GLdouble") double y) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform2dEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2dEXT");
        try { Handles.MH_glProgramUniform2dEXT.invokeExact(handles.PFN_glProgramUniform2dEXT, program, location, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2dEXT", e); }
    }

    public void ProgramUniform3dEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform3dEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3dEXT");
        try { Handles.MH_glProgramUniform3dEXT.invokeExact(handles.PFN_glProgramUniform3dEXT, program, location, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3dEXT", e); }
    }

    public void ProgramUniform4dEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z, @CType("GLdouble") double w) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform4dEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4dEXT");
        try { Handles.MH_glProgramUniform4dEXT.invokeExact(handles.PFN_glProgramUniform4dEXT, program, location, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4dEXT", e); }
    }

    public void ProgramUniform1dvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform1dvEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform1dvEXT");
        try { Handles.MH_glProgramUniform1dvEXT.invokeExact(handles.PFN_glProgramUniform1dvEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1dvEXT", e); }
    }

    public void ProgramUniform2dvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform2dvEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform2dvEXT");
        try { Handles.MH_glProgramUniform2dvEXT.invokeExact(handles.PFN_glProgramUniform2dvEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2dvEXT", e); }
    }

    public void ProgramUniform3dvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform3dvEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform3dvEXT");
        try { Handles.MH_glProgramUniform3dvEXT.invokeExact(handles.PFN_glProgramUniform3dvEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3dvEXT", e); }
    }

    public void ProgramUniform4dvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniform4dvEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniform4dvEXT");
        try { Handles.MH_glProgramUniform4dvEXT.invokeExact(handles.PFN_glProgramUniform4dvEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4dvEXT", e); }
    }

    public void ProgramUniformMatrix2dvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix2dvEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix2dvEXT");
        try { Handles.MH_glProgramUniformMatrix2dvEXT.invokeExact(handles.PFN_glProgramUniformMatrix2dvEXT, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2dvEXT", e); }
    }

    public void ProgramUniformMatrix3dvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix3dvEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix3dvEXT");
        try { Handles.MH_glProgramUniformMatrix3dvEXT.invokeExact(handles.PFN_glProgramUniformMatrix3dvEXT, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3dvEXT", e); }
    }

    public void ProgramUniformMatrix4dvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix4dvEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix4dvEXT");
        try { Handles.MH_glProgramUniformMatrix4dvEXT.invokeExact(handles.PFN_glProgramUniformMatrix4dvEXT, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4dvEXT", e); }
    }

    public void ProgramUniformMatrix2x3dvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix2x3dvEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix2x3dvEXT");
        try { Handles.MH_glProgramUniformMatrix2x3dvEXT.invokeExact(handles.PFN_glProgramUniformMatrix2x3dvEXT, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2x3dvEXT", e); }
    }

    public void ProgramUniformMatrix2x4dvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix2x4dvEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix2x4dvEXT");
        try { Handles.MH_glProgramUniformMatrix2x4dvEXT.invokeExact(handles.PFN_glProgramUniformMatrix2x4dvEXT, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2x4dvEXT", e); }
    }

    public void ProgramUniformMatrix3x2dvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix3x2dvEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix3x2dvEXT");
        try { Handles.MH_glProgramUniformMatrix3x2dvEXT.invokeExact(handles.PFN_glProgramUniformMatrix3x2dvEXT, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3x2dvEXT", e); }
    }

    public void ProgramUniformMatrix3x4dvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix3x4dvEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix3x4dvEXT");
        try { Handles.MH_glProgramUniformMatrix3x4dvEXT.invokeExact(handles.PFN_glProgramUniformMatrix3x4dvEXT, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3x4dvEXT", e); }
    }

    public void ProgramUniformMatrix4x2dvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix4x2dvEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix4x2dvEXT");
        try { Handles.MH_glProgramUniformMatrix4x2dvEXT.invokeExact(handles.PFN_glProgramUniformMatrix4x2dvEXT, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4x2dvEXT", e); }
    }

    public void ProgramUniformMatrix4x3dvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        if (Unmarshal.isNullPointer(handles.PFN_glProgramUniformMatrix4x3dvEXT)) throw new SymbolNotFoundError("Symbol not found: glProgramUniformMatrix4x3dvEXT");
        try { Handles.MH_glProgramUniformMatrix4x3dvEXT.invokeExact(handles.PFN_glProgramUniformMatrix4x3dvEXT, program, location, count, transpose, value); }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4x3dvEXT", e); }
    }

    public void TextureBufferRangeEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureBufferRangeEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureBufferRangeEXT");
        try { Handles.MH_glTextureBufferRangeEXT.invokeExact(handles.PFN_glTextureBufferRangeEXT, texture, target, internalformat, buffer, offset, size); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureBufferRangeEXT", e); }
    }

    public void TextureStorage1DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureStorage1DEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureStorage1DEXT");
        try { Handles.MH_glTextureStorage1DEXT.invokeExact(handles.PFN_glTextureStorage1DEXT, texture, target, levels, internalformat, width); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorage1DEXT", e); }
    }

    public void TextureStorage2DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureStorage2DEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureStorage2DEXT");
        try { Handles.MH_glTextureStorage2DEXT.invokeExact(handles.PFN_glTextureStorage2DEXT, texture, target, levels, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorage2DEXT", e); }
    }

    public void TextureStorage3DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureStorage3DEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureStorage3DEXT");
        try { Handles.MH_glTextureStorage3DEXT.invokeExact(handles.PFN_glTextureStorage3DEXT, texture, target, levels, internalformat, width, height, depth); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorage3DEXT", e); }
    }

    public void TextureStorage2DMultisampleEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLsizei") int samples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLboolean") boolean fixedsamplelocations) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureStorage2DMultisampleEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureStorage2DMultisampleEXT");
        try { Handles.MH_glTextureStorage2DMultisampleEXT.invokeExact(handles.PFN_glTextureStorage2DMultisampleEXT, texture, target, samples, internalformat, width, height, fixedsamplelocations); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorage2DMultisampleEXT", e); }
    }

    public void TextureStorage3DMultisampleEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLsizei") int samples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLboolean") boolean fixedsamplelocations) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureStorage3DMultisampleEXT)) throw new SymbolNotFoundError("Symbol not found: glTextureStorage3DMultisampleEXT");
        try { Handles.MH_glTextureStorage3DMultisampleEXT.invokeExact(handles.PFN_glTextureStorage3DMultisampleEXT, texture, target, samples, internalformat, width, height, depth, fixedsamplelocations); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorage3DMultisampleEXT", e); }
    }

    public void VertexArrayBindVertexBufferEXT(@CType("GLuint") int vaobj, @CType("GLuint") int bindingindex, @CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizei") int stride) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArrayBindVertexBufferEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayBindVertexBufferEXT");
        try { Handles.MH_glVertexArrayBindVertexBufferEXT.invokeExact(handles.PFN_glVertexArrayBindVertexBufferEXT, vaobj, bindingindex, buffer, offset, stride); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayBindVertexBufferEXT", e); }
    }

    public void VertexArrayVertexAttribFormatEXT(@CType("GLuint") int vaobj, @CType("GLuint") int attribindex, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("GLuint") int relativeoffset) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArrayVertexAttribFormatEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayVertexAttribFormatEXT");
        try { Handles.MH_glVertexArrayVertexAttribFormatEXT.invokeExact(handles.PFN_glVertexArrayVertexAttribFormatEXT, vaobj, attribindex, size, type, normalized, relativeoffset); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayVertexAttribFormatEXT", e); }
    }

    public void VertexArrayVertexAttribIFormatEXT(@CType("GLuint") int vaobj, @CType("GLuint") int attribindex, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLuint") int relativeoffset) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArrayVertexAttribIFormatEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayVertexAttribIFormatEXT");
        try { Handles.MH_glVertexArrayVertexAttribIFormatEXT.invokeExact(handles.PFN_glVertexArrayVertexAttribIFormatEXT, vaobj, attribindex, size, type, relativeoffset); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayVertexAttribIFormatEXT", e); }
    }

    public void VertexArrayVertexAttribLFormatEXT(@CType("GLuint") int vaobj, @CType("GLuint") int attribindex, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLuint") int relativeoffset) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArrayVertexAttribLFormatEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayVertexAttribLFormatEXT");
        try { Handles.MH_glVertexArrayVertexAttribLFormatEXT.invokeExact(handles.PFN_glVertexArrayVertexAttribLFormatEXT, vaobj, attribindex, size, type, relativeoffset); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayVertexAttribLFormatEXT", e); }
    }

    public void VertexArrayVertexAttribBindingEXT(@CType("GLuint") int vaobj, @CType("GLuint") int attribindex, @CType("GLuint") int bindingindex) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArrayVertexAttribBindingEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayVertexAttribBindingEXT");
        try { Handles.MH_glVertexArrayVertexAttribBindingEXT.invokeExact(handles.PFN_glVertexArrayVertexAttribBindingEXT, vaobj, attribindex, bindingindex); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayVertexAttribBindingEXT", e); }
    }

    public void VertexArrayVertexBindingDivisorEXT(@CType("GLuint") int vaobj, @CType("GLuint") int bindingindex, @CType("GLuint") int divisor) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArrayVertexBindingDivisorEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayVertexBindingDivisorEXT");
        try { Handles.MH_glVertexArrayVertexBindingDivisorEXT.invokeExact(handles.PFN_glVertexArrayVertexBindingDivisorEXT, vaobj, bindingindex, divisor); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayVertexBindingDivisorEXT", e); }
    }

    public void VertexArrayVertexAttribLOffsetEXT(@CType("GLuint") int vaobj, @CType("GLuint") int buffer, @CType("GLuint") int index, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLintptr") long offset) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArrayVertexAttribLOffsetEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayVertexAttribLOffsetEXT");
        try { Handles.MH_glVertexArrayVertexAttribLOffsetEXT.invokeExact(handles.PFN_glVertexArrayVertexAttribLOffsetEXT, vaobj, buffer, index, size, type, stride, offset); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayVertexAttribLOffsetEXT", e); }
    }

    public void TexturePageCommitmentEXT(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLboolean") boolean commit) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexturePageCommitmentEXT)) throw new SymbolNotFoundError("Symbol not found: glTexturePageCommitmentEXT");
        try { Handles.MH_glTexturePageCommitmentEXT.invokeExact(handles.PFN_glTexturePageCommitmentEXT, texture, level, xoffset, yoffset, zoffset, width, height, depth, commit); }
        catch (Throwable e) { throw new RuntimeException("error in glTexturePageCommitmentEXT", e); }
    }

    public void VertexArrayVertexAttribDivisorEXT(@CType("GLuint") int vaobj, @CType("GLuint") int index, @CType("GLuint") int divisor) {
        if (Unmarshal.isNullPointer(handles.PFN_glVertexArrayVertexAttribDivisorEXT)) throw new SymbolNotFoundError("Symbol not found: glVertexArrayVertexAttribDivisorEXT");
        try { Handles.MH_glVertexArrayVertexAttribDivisorEXT.invokeExact(handles.PFN_glVertexArrayVertexAttribDivisorEXT, vaobj, index, divisor); }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayVertexAttribDivisorEXT", e); }
    }

}

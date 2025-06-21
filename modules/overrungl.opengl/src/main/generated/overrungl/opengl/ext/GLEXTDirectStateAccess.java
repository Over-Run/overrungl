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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLEXTDirectStateAccess {
    public static final int GL_PROGRAM_MATRIX_EXT = 0x8E2D;
    public static final int GL_TRANSPOSE_PROGRAM_MATRIX_EXT = 0x8E2E;
    public static final int GL_PROGRAM_MATRIX_STACK_DEPTH_EXT = 0x8E2F;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glMatrixLoadfEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMatrixLoaddEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMatrixMultfEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMatrixMultdEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMatrixLoadIdentityEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMatrixRotatefEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glMatrixRotatedEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glMatrixScalefEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glMatrixScaledEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glMatrixTranslatefEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glMatrixTranslatedEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glMatrixFrustumEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glMatrixOrthoEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glMatrixPopEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMatrixPushEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glClientAttribDefaultEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glPushClientAttribDefaultEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTextureParameterfEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glTextureParameterfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTextureParameteriEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTextureParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTextureImage1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTextureImage2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTextureSubImage1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTextureSubImage2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCopyTextureImage1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCopyTextureImage2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCopyTextureSubImage1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCopyTextureSubImage2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetTextureImageEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTextureParameterfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTextureParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTextureLevelParameterfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTextureLevelParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTextureImage3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTextureSubImage3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCopyTextureSubImage3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glBindMultiTextureEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiTexCoordPointerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexEnvfEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glMultiTexEnvfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexEnviEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiTexEnvivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexGendEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glMultiTexGendvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexGenfEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glMultiTexGenfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexGeniEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiTexGenivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetMultiTexEnvfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetMultiTexEnvivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetMultiTexGendvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetMultiTexGenfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetMultiTexGenivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexParameteriEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiTexParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexParameterfEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glMultiTexParameterfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexImage1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexImage2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexSubImage1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexSubImage2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCopyMultiTexImage1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCopyMultiTexImage2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCopyMultiTexSubImage1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCopyMultiTexSubImage2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetMultiTexImageEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetMultiTexParameterfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetMultiTexParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetMultiTexLevelParameterfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetMultiTexLevelParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexImage3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexSubImage3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCopyMultiTexSubImage3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glEnableClientStateIndexedEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDisableClientStateIndexedEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetFloatIndexedvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetDoubleIndexedvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPointerIndexedvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glEnableIndexedEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDisableIndexedEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glIsEnabledIndexedEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetIntegerIndexedvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetBooleanIndexedvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompressedTextureImage3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompressedTextureImage2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompressedTextureImage1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompressedTextureSubImage3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompressedTextureSubImage2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompressedTextureSubImage1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetCompressedTextureImageEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompressedMultiTexImage3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompressedMultiTexImage2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompressedMultiTexImage1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompressedMultiTexSubImage3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompressedMultiTexSubImage2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompressedMultiTexSubImage1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetCompressedMultiTexImageEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMatrixLoadTransposefEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMatrixLoadTransposedEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMatrixMultTransposefEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMatrixMultTransposedEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNamedBufferDataEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedBufferSubDataEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMapNamedBufferEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glUnmapNamedBufferEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetNamedBufferParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetNamedBufferPointervEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetNamedBufferSubDataEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform1fEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glProgramUniform2fEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glProgramUniform3fEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glProgramUniform4fEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glProgramUniform1iEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramUniform2iEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramUniform3iEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramUniform4iEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramUniform1fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform2fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform3fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform4fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform1ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform2ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform3ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform4ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix2fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix3fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix4fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix2x3fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix3x2fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix2x4fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix4x2fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix3x4fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix4x3fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTextureBufferEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiTexBufferEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTextureParameterIivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTextureParameterIuivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTextureParameterIivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetTextureParameterIuivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexParameterIivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMultiTexParameterIuivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetMultiTexParameterIivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetMultiTexParameterIuivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform1uiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramUniform2uiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramUniform3uiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramUniform4uiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glProgramUniform1uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform2uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform3uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform4uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNamedProgramLocalParameters4fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNamedProgramLocalParameterI4iEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedProgramLocalParameterI4ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNamedProgramLocalParametersI4ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNamedProgramLocalParameterI4uiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedProgramLocalParameterI4uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNamedProgramLocalParametersI4uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetNamedProgramLocalParameterIivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetNamedProgramLocalParameterIuivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glEnableClientStateiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDisableClientStateiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetFloati_vEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetDoublei_vEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetPointeri_vEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNamedProgramStringEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNamedProgramLocalParameter4dEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glNamedProgramLocalParameter4dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNamedProgramLocalParameter4fEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glNamedProgramLocalParameter4fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetNamedProgramLocalParameterdvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetNamedProgramLocalParameterfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetNamedProgramivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetNamedProgramStringEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNamedRenderbufferStorageEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetNamedRenderbufferParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNamedRenderbufferStorageMultisampleEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedRenderbufferStorageMultisampleCoverageEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glCheckNamedFramebufferStatusEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedFramebufferTexture1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedFramebufferTexture2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedFramebufferTexture3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedFramebufferRenderbufferEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetNamedFramebufferAttachmentParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGenerateTextureMipmapEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGenerateMultiTexMipmapEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFramebufferDrawBufferEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFramebufferDrawBuffersEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glFramebufferReadBufferEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetFramebufferParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNamedCopyBufferSubDataEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glNamedFramebufferTextureEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedFramebufferTextureLayerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedFramebufferTextureFaceEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTextureRenderbufferEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glMultiTexRenderbufferEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexArrayVertexOffsetEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glVertexArrayColorOffsetEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glVertexArrayEdgeFlagOffsetEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glVertexArrayIndexOffsetEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glVertexArrayNormalOffsetEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glVertexArrayTexCoordOffsetEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glVertexArrayMultiTexCoordOffsetEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glVertexArrayFogCoordOffsetEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glVertexArraySecondaryColorOffsetEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glVertexArrayVertexAttribOffsetEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glVertexArrayVertexAttribIOffsetEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glEnableVertexArrayEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDisableVertexArrayEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glEnableVertexArrayAttribEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glDisableVertexArrayAttribEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetVertexArrayIntegervEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexArrayPointervEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexArrayIntegeri_vEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetVertexArrayPointeri_vEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glMapNamedBufferRangeEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glFlushMappedNamedBufferRangeEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glNamedBufferStorageEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glClearNamedBufferDataEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glClearNamedBufferSubDataEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNamedFramebufferParameteriEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetNamedFramebufferParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform1dEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glProgramUniform2dEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glProgramUniform3dEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glProgramUniform4dEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glProgramUniform1dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform2dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform3dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniform4dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix2dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix3dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix4dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix2x3dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix2x4dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix3x2dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix3x4dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix4x2dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glProgramUniformMatrix4x3dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glTextureBufferRangeEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glTextureStorage1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTextureStorage2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTextureStorage3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glTextureStorage2DMultisampleEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glTextureStorage3DMultisampleEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glVertexArrayBindVertexBufferEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexArrayVertexAttribFormatEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexArrayVertexAttribIFormatEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexArrayVertexAttribLFormatEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexArrayVertexAttribBindingEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexArrayVertexBindingDivisorEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexArrayVertexAttribLOffsetEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_glTexturePageCommitmentEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glVertexArrayVertexAttribDivisorEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
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

    /// ```
    /// void glMatrixLoadfEXT((unsigned int) GLenum mode, const GLfloat* m);
    /// ```
    public void MatrixLoadfEXT(int mode, MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixLoadfEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixLoadfEXT");
        try { Handles.MH_glMatrixLoadfEXT.invokeExact(handles.PFN_glMatrixLoadfEXT, mode, m); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixLoadfEXT", e); }
    }

    /// ```
    /// void glMatrixLoaddEXT((unsigned int) GLenum mode, const GLdouble* m);
    /// ```
    public void MatrixLoaddEXT(int mode, MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixLoaddEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixLoaddEXT");
        try { Handles.MH_glMatrixLoaddEXT.invokeExact(handles.PFN_glMatrixLoaddEXT, mode, m); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixLoaddEXT", e); }
    }

    /// ```
    /// void glMatrixMultfEXT((unsigned int) GLenum mode, const GLfloat* m);
    /// ```
    public void MatrixMultfEXT(int mode, MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixMultfEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixMultfEXT");
        try { Handles.MH_glMatrixMultfEXT.invokeExact(handles.PFN_glMatrixMultfEXT, mode, m); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixMultfEXT", e); }
    }

    /// ```
    /// void glMatrixMultdEXT((unsigned int) GLenum mode, const GLdouble* m);
    /// ```
    public void MatrixMultdEXT(int mode, MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixMultdEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixMultdEXT");
        try { Handles.MH_glMatrixMultdEXT.invokeExact(handles.PFN_glMatrixMultdEXT, mode, m); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixMultdEXT", e); }
    }

    /// ```
    /// void glMatrixLoadIdentityEXT((unsigned int) GLenum mode);
    /// ```
    public void MatrixLoadIdentityEXT(int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixLoadIdentityEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixLoadIdentityEXT");
        try { Handles.MH_glMatrixLoadIdentityEXT.invokeExact(handles.PFN_glMatrixLoadIdentityEXT, mode); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixLoadIdentityEXT", e); }
    }

    /// ```
    /// void glMatrixRotatefEXT((unsigned int) GLenum mode, ((float) khronos_float_t) GLfloat angle, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void MatrixRotatefEXT(int mode, float angle, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixRotatefEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixRotatefEXT");
        try { Handles.MH_glMatrixRotatefEXT.invokeExact(handles.PFN_glMatrixRotatefEXT, mode, angle, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixRotatefEXT", e); }
    }

    /// ```
    /// void glMatrixRotatedEXT((unsigned int) GLenum mode, (double) GLdouble angle, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z);
    /// ```
    public void MatrixRotatedEXT(int mode, double angle, double x, double y, double z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixRotatedEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixRotatedEXT");
        try { Handles.MH_glMatrixRotatedEXT.invokeExact(handles.PFN_glMatrixRotatedEXT, mode, angle, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixRotatedEXT", e); }
    }

    /// ```
    /// void glMatrixScalefEXT((unsigned int) GLenum mode, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void MatrixScalefEXT(int mode, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixScalefEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixScalefEXT");
        try { Handles.MH_glMatrixScalefEXT.invokeExact(handles.PFN_glMatrixScalefEXT, mode, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixScalefEXT", e); }
    }

    /// ```
    /// void glMatrixScaledEXT((unsigned int) GLenum mode, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z);
    /// ```
    public void MatrixScaledEXT(int mode, double x, double y, double z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixScaledEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixScaledEXT");
        try { Handles.MH_glMatrixScaledEXT.invokeExact(handles.PFN_glMatrixScaledEXT, mode, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixScaledEXT", e); }
    }

    /// ```
    /// void glMatrixTranslatefEXT((unsigned int) GLenum mode, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void MatrixTranslatefEXT(int mode, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixTranslatefEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixTranslatefEXT");
        try { Handles.MH_glMatrixTranslatefEXT.invokeExact(handles.PFN_glMatrixTranslatefEXT, mode, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixTranslatefEXT", e); }
    }

    /// ```
    /// void glMatrixTranslatedEXT((unsigned int) GLenum mode, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z);
    /// ```
    public void MatrixTranslatedEXT(int mode, double x, double y, double z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixTranslatedEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixTranslatedEXT");
        try { Handles.MH_glMatrixTranslatedEXT.invokeExact(handles.PFN_glMatrixTranslatedEXT, mode, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixTranslatedEXT", e); }
    }

    /// ```
    /// void glMatrixFrustumEXT((unsigned int) GLenum mode, (double) GLdouble left, (double) GLdouble right, (double) GLdouble bottom, (double) GLdouble top, (double) GLdouble zNear, (double) GLdouble zFar);
    /// ```
    public void MatrixFrustumEXT(int mode, double left, double right, double bottom, double top, double zNear, double zFar) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixFrustumEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixFrustumEXT");
        try { Handles.MH_glMatrixFrustumEXT.invokeExact(handles.PFN_glMatrixFrustumEXT, mode, left, right, bottom, top, zNear, zFar); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixFrustumEXT", e); }
    }

    /// ```
    /// void glMatrixOrthoEXT((unsigned int) GLenum mode, (double) GLdouble left, (double) GLdouble right, (double) GLdouble bottom, (double) GLdouble top, (double) GLdouble zNear, (double) GLdouble zFar);
    /// ```
    public void MatrixOrthoEXT(int mode, double left, double right, double bottom, double top, double zNear, double zFar) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixOrthoEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixOrthoEXT");
        try { Handles.MH_glMatrixOrthoEXT.invokeExact(handles.PFN_glMatrixOrthoEXT, mode, left, right, bottom, top, zNear, zFar); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixOrthoEXT", e); }
    }

    /// ```
    /// void glMatrixPopEXT((unsigned int) GLenum mode);
    /// ```
    public void MatrixPopEXT(int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixPopEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixPopEXT");
        try { Handles.MH_glMatrixPopEXT.invokeExact(handles.PFN_glMatrixPopEXT, mode); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixPopEXT", e); }
    }

    /// ```
    /// void glMatrixPushEXT((unsigned int) GLenum mode);
    /// ```
    public void MatrixPushEXT(int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixPushEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixPushEXT");
        try { Handles.MH_glMatrixPushEXT.invokeExact(handles.PFN_glMatrixPushEXT, mode); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixPushEXT", e); }
    }

    /// ```
    /// void glClientAttribDefaultEXT((unsigned int) GLbitfield mask);
    /// ```
    public void ClientAttribDefaultEXT(int mask) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClientAttribDefaultEXT)) throw new GLSymbolNotFoundError("Symbol not found: glClientAttribDefaultEXT");
        try { Handles.MH_glClientAttribDefaultEXT.invokeExact(handles.PFN_glClientAttribDefaultEXT, mask); }
        catch (Throwable e) { throw new RuntimeException("error in ClientAttribDefaultEXT", e); }
    }

    /// ```
    /// void glPushClientAttribDefaultEXT((unsigned int) GLbitfield mask);
    /// ```
    public void PushClientAttribDefaultEXT(int mask) {
        if (MemoryUtil.isNullPointer(handles.PFN_glPushClientAttribDefaultEXT)) throw new GLSymbolNotFoundError("Symbol not found: glPushClientAttribDefaultEXT");
        try { Handles.MH_glPushClientAttribDefaultEXT.invokeExact(handles.PFN_glPushClientAttribDefaultEXT, mask); }
        catch (Throwable e) { throw new RuntimeException("error in PushClientAttribDefaultEXT", e); }
    }

    /// ```
    /// void glTextureParameterfEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat param);
    /// ```
    public void TextureParameterfEXT(int texture, int target, int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureParameterfEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureParameterfEXT");
        try { Handles.MH_glTextureParameterfEXT.invokeExact(handles.PFN_glTextureParameterfEXT, texture, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in TextureParameterfEXT", e); }
    }

    /// ```
    /// void glTextureParameterfvEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (unsigned int) GLenum pname, const GLfloat* params);
    /// ```
    public void TextureParameterfvEXT(int texture, int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureParameterfvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureParameterfvEXT");
        try { Handles.MH_glTextureParameterfvEXT.invokeExact(handles.PFN_glTextureParameterfvEXT, texture, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in TextureParameterfvEXT", e); }
    }

    /// ```
    /// void glTextureParameteriEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void TextureParameteriEXT(int texture, int target, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureParameteriEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureParameteriEXT");
        try { Handles.MH_glTextureParameteriEXT.invokeExact(handles.PFN_glTextureParameteriEXT, texture, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in TextureParameteriEXT", e); }
    }

    /// ```
    /// void glTextureParameterivEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (unsigned int) GLenum pname, const GLint* params);
    /// ```
    public void TextureParameterivEXT(int texture, int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureParameterivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureParameterivEXT");
        try { Handles.MH_glTextureParameterivEXT.invokeExact(handles.PFN_glTextureParameterivEXT, texture, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in TextureParameterivEXT", e); }
    }

    /// ```
    /// void glTextureImage1DEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLint level, (int) GLint internalformat, (int) GLsizei width, (int) GLint border, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* pixels);
    /// ```
    public void TextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int format, int type, MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureImage1DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureImage1DEXT");
        try { Handles.MH_glTextureImage1DEXT.invokeExact(handles.PFN_glTextureImage1DEXT, texture, target, level, internalformat, width, border, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in TextureImage1DEXT", e); }
    }

    /// ```
    /// void glTextureImage2DEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLint level, (int) GLint internalformat, (int) GLsizei width, (int) GLsizei height, (int) GLint border, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* pixels);
    /// ```
    public void TextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int format, int type, MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureImage2DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureImage2DEXT");
        try { Handles.MH_glTextureImage2DEXT.invokeExact(handles.PFN_glTextureImage2DEXT, texture, target, level, internalformat, width, height, border, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in TextureImage2DEXT", e); }
    }

    /// ```
    /// void glTextureSubImage1DEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLsizei width, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* pixels);
    /// ```
    public void TextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int type, MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureSubImage1DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureSubImage1DEXT");
        try { Handles.MH_glTextureSubImage1DEXT.invokeExact(handles.PFN_glTextureSubImage1DEXT, texture, target, level, xoffset, width, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in TextureSubImage1DEXT", e); }
    }

    /// ```
    /// void glTextureSubImage2DEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLsizei width, (int) GLsizei height, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* pixels);
    /// ```
    public void TextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureSubImage2DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureSubImage2DEXT");
        try { Handles.MH_glTextureSubImage2DEXT.invokeExact(handles.PFN_glTextureSubImage2DEXT, texture, target, level, xoffset, yoffset, width, height, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in TextureSubImage2DEXT", e); }
    }

    /// ```
    /// void glCopyTextureImage1DEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum internalformat, (int) GLint x, (int) GLint y, (int) GLsizei width, (int) GLint border);
    /// ```
    public void CopyTextureImage1DEXT(int texture, int target, int level, int internalformat, int x, int y, int width, int border) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyTextureImage1DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCopyTextureImage1DEXT");
        try { Handles.MH_glCopyTextureImage1DEXT.invokeExact(handles.PFN_glCopyTextureImage1DEXT, texture, target, level, internalformat, x, y, width, border); }
        catch (Throwable e) { throw new RuntimeException("error in CopyTextureImage1DEXT", e); }
    }

    /// ```
    /// void glCopyTextureImage2DEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum internalformat, (int) GLint x, (int) GLint y, (int) GLsizei width, (int) GLsizei height, (int) GLint border);
    /// ```
    public void CopyTextureImage2DEXT(int texture, int target, int level, int internalformat, int x, int y, int width, int height, int border) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyTextureImage2DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCopyTextureImage2DEXT");
        try { Handles.MH_glCopyTextureImage2DEXT.invokeExact(handles.PFN_glCopyTextureImage2DEXT, texture, target, level, internalformat, x, y, width, height, border); }
        catch (Throwable e) { throw new RuntimeException("error in CopyTextureImage2DEXT", e); }
    }

    /// ```
    /// void glCopyTextureSubImage1DEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLint x, (int) GLint y, (int) GLsizei width);
    /// ```
    public void CopyTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int x, int y, int width) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyTextureSubImage1DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCopyTextureSubImage1DEXT");
        try { Handles.MH_glCopyTextureSubImage1DEXT.invokeExact(handles.PFN_glCopyTextureSubImage1DEXT, texture, target, level, xoffset, x, y, width); }
        catch (Throwable e) { throw new RuntimeException("error in CopyTextureSubImage1DEXT", e); }
    }

    /// ```
    /// void glCopyTextureSubImage2DEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLint x, (int) GLint y, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void CopyTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyTextureSubImage2DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCopyTextureSubImage2DEXT");
        try { Handles.MH_glCopyTextureSubImage2DEXT.invokeExact(handles.PFN_glCopyTextureSubImage2DEXT, texture, target, level, xoffset, yoffset, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in CopyTextureSubImage2DEXT", e); }
    }

    /// ```
    /// void glGetTextureImageEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum format, (unsigned int) GLenum type, void* pixels);
    /// ```
    public void GetTextureImageEXT(int texture, int target, int level, int format, int type, MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureImageEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetTextureImageEXT");
        try { Handles.MH_glGetTextureImageEXT.invokeExact(handles.PFN_glGetTextureImageEXT, texture, target, level, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureImageEXT", e); }
    }

    /// ```
    /// void glGetTextureParameterfvEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetTextureParameterfvEXT(int texture, int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureParameterfvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetTextureParameterfvEXT");
        try { Handles.MH_glGetTextureParameterfvEXT.invokeExact(handles.PFN_glGetTextureParameterfvEXT, texture, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureParameterfvEXT", e); }
    }

    /// ```
    /// void glGetTextureParameterivEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetTextureParameterivEXT(int texture, int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureParameterivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetTextureParameterivEXT");
        try { Handles.MH_glGetTextureParameterivEXT.invokeExact(handles.PFN_glGetTextureParameterivEXT, texture, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureParameterivEXT", e); }
    }

    /// ```
    /// void glGetTextureLevelParameterfvEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetTextureLevelParameterfvEXT(int texture, int target, int level, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureLevelParameterfvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetTextureLevelParameterfvEXT");
        try { Handles.MH_glGetTextureLevelParameterfvEXT.invokeExact(handles.PFN_glGetTextureLevelParameterfvEXT, texture, target, level, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureLevelParameterfvEXT", e); }
    }

    /// ```
    /// void glGetTextureLevelParameterivEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetTextureLevelParameterivEXT(int texture, int target, int level, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureLevelParameterivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetTextureLevelParameterivEXT");
        try { Handles.MH_glGetTextureLevelParameterivEXT.invokeExact(handles.PFN_glGetTextureLevelParameterivEXT, texture, target, level, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureLevelParameterivEXT", e); }
    }

    /// ```
    /// void glTextureImage3DEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLint level, (int) GLint internalformat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (int) GLint border, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* pixels);
    /// ```
    public void TextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureImage3DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureImage3DEXT");
        try { Handles.MH_glTextureImage3DEXT.invokeExact(handles.PFN_glTextureImage3DEXT, texture, target, level, internalformat, width, height, depth, border, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in TextureImage3DEXT", e); }
    }

    /// ```
    /// void glTextureSubImage3DEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLint zoffset, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* pixels);
    /// ```
    public void TextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureSubImage3DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureSubImage3DEXT");
        try { Handles.MH_glTextureSubImage3DEXT.invokeExact(handles.PFN_glTextureSubImage3DEXT, texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in TextureSubImage3DEXT", e); }
    }

    /// ```
    /// void glCopyTextureSubImage3DEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLint zoffset, (int) GLint x, (int) GLint y, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void CopyTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyTextureSubImage3DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCopyTextureSubImage3DEXT");
        try { Handles.MH_glCopyTextureSubImage3DEXT.invokeExact(handles.PFN_glCopyTextureSubImage3DEXT, texture, target, level, xoffset, yoffset, zoffset, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in CopyTextureSubImage3DEXT", e); }
    }

    /// ```
    /// void glBindMultiTextureEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (unsigned int) GLuint texture);
    /// ```
    public void BindMultiTextureEXT(int texunit, int target, int texture) {
        if (MemoryUtil.isNullPointer(handles.PFN_glBindMultiTextureEXT)) throw new GLSymbolNotFoundError("Symbol not found: glBindMultiTextureEXT");
        try { Handles.MH_glBindMultiTextureEXT.invokeExact(handles.PFN_glBindMultiTextureEXT, texunit, target, texture); }
        catch (Throwable e) { throw new RuntimeException("error in BindMultiTextureEXT", e); }
    }

    /// ```
    /// void glMultiTexCoordPointerEXT((unsigned int) GLenum texunit, (int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride, const void* pointer);
    /// ```
    public void MultiTexCoordPointerEXT(int texunit, int size, int type, int stride, MemorySegment pointer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexCoordPointerEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexCoordPointerEXT");
        try { Handles.MH_glMultiTexCoordPointerEXT.invokeExact(handles.PFN_glMultiTexCoordPointerEXT, texunit, size, type, stride, pointer); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexCoordPointerEXT", e); }
    }

    /// ```
    /// void glMultiTexEnvfEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat param);
    /// ```
    public void MultiTexEnvfEXT(int texunit, int target, int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexEnvfEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexEnvfEXT");
        try { Handles.MH_glMultiTexEnvfEXT.invokeExact(handles.PFN_glMultiTexEnvfEXT, texunit, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexEnvfEXT", e); }
    }

    /// ```
    /// void glMultiTexEnvfvEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (unsigned int) GLenum pname, const GLfloat* params);
    /// ```
    public void MultiTexEnvfvEXT(int texunit, int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexEnvfvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexEnvfvEXT");
        try { Handles.MH_glMultiTexEnvfvEXT.invokeExact(handles.PFN_glMultiTexEnvfvEXT, texunit, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexEnvfvEXT", e); }
    }

    /// ```
    /// void glMultiTexEnviEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void MultiTexEnviEXT(int texunit, int target, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexEnviEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexEnviEXT");
        try { Handles.MH_glMultiTexEnviEXT.invokeExact(handles.PFN_glMultiTexEnviEXT, texunit, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexEnviEXT", e); }
    }

    /// ```
    /// void glMultiTexEnvivEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (unsigned int) GLenum pname, const GLint* params);
    /// ```
    public void MultiTexEnvivEXT(int texunit, int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexEnvivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexEnvivEXT");
        try { Handles.MH_glMultiTexEnvivEXT.invokeExact(handles.PFN_glMultiTexEnvivEXT, texunit, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexEnvivEXT", e); }
    }

    /// ```
    /// void glMultiTexGendEXT((unsigned int) GLenum texunit, (unsigned int) GLenum coord, (unsigned int) GLenum pname, (double) GLdouble param);
    /// ```
    public void MultiTexGendEXT(int texunit, int coord, int pname, double param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexGendEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexGendEXT");
        try { Handles.MH_glMultiTexGendEXT.invokeExact(handles.PFN_glMultiTexGendEXT, texunit, coord, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexGendEXT", e); }
    }

    /// ```
    /// void glMultiTexGendvEXT((unsigned int) GLenum texunit, (unsigned int) GLenum coord, (unsigned int) GLenum pname, const GLdouble* params);
    /// ```
    public void MultiTexGendvEXT(int texunit, int coord, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexGendvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexGendvEXT");
        try { Handles.MH_glMultiTexGendvEXT.invokeExact(handles.PFN_glMultiTexGendvEXT, texunit, coord, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexGendvEXT", e); }
    }

    /// ```
    /// void glMultiTexGenfEXT((unsigned int) GLenum texunit, (unsigned int) GLenum coord, (unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat param);
    /// ```
    public void MultiTexGenfEXT(int texunit, int coord, int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexGenfEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexGenfEXT");
        try { Handles.MH_glMultiTexGenfEXT.invokeExact(handles.PFN_glMultiTexGenfEXT, texunit, coord, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexGenfEXT", e); }
    }

    /// ```
    /// void glMultiTexGenfvEXT((unsigned int) GLenum texunit, (unsigned int) GLenum coord, (unsigned int) GLenum pname, const GLfloat* params);
    /// ```
    public void MultiTexGenfvEXT(int texunit, int coord, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexGenfvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexGenfvEXT");
        try { Handles.MH_glMultiTexGenfvEXT.invokeExact(handles.PFN_glMultiTexGenfvEXT, texunit, coord, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexGenfvEXT", e); }
    }

    /// ```
    /// void glMultiTexGeniEXT((unsigned int) GLenum texunit, (unsigned int) GLenum coord, (unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void MultiTexGeniEXT(int texunit, int coord, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexGeniEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexGeniEXT");
        try { Handles.MH_glMultiTexGeniEXT.invokeExact(handles.PFN_glMultiTexGeniEXT, texunit, coord, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexGeniEXT", e); }
    }

    /// ```
    /// void glMultiTexGenivEXT((unsigned int) GLenum texunit, (unsigned int) GLenum coord, (unsigned int) GLenum pname, const GLint* params);
    /// ```
    public void MultiTexGenivEXT(int texunit, int coord, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexGenivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexGenivEXT");
        try { Handles.MH_glMultiTexGenivEXT.invokeExact(handles.PFN_glMultiTexGenivEXT, texunit, coord, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexGenivEXT", e); }
    }

    /// ```
    /// void glGetMultiTexEnvfvEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetMultiTexEnvfvEXT(int texunit, int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMultiTexEnvfvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetMultiTexEnvfvEXT");
        try { Handles.MH_glGetMultiTexEnvfvEXT.invokeExact(handles.PFN_glGetMultiTexEnvfvEXT, texunit, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetMultiTexEnvfvEXT", e); }
    }

    /// ```
    /// void glGetMultiTexEnvivEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetMultiTexEnvivEXT(int texunit, int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMultiTexEnvivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetMultiTexEnvivEXT");
        try { Handles.MH_glGetMultiTexEnvivEXT.invokeExact(handles.PFN_glGetMultiTexEnvivEXT, texunit, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetMultiTexEnvivEXT", e); }
    }

    /// ```
    /// void glGetMultiTexGendvEXT((unsigned int) GLenum texunit, (unsigned int) GLenum coord, (unsigned int) GLenum pname, GLdouble* params);
    /// ```
    public void GetMultiTexGendvEXT(int texunit, int coord, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMultiTexGendvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetMultiTexGendvEXT");
        try { Handles.MH_glGetMultiTexGendvEXT.invokeExact(handles.PFN_glGetMultiTexGendvEXT, texunit, coord, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetMultiTexGendvEXT", e); }
    }

    /// ```
    /// void glGetMultiTexGenfvEXT((unsigned int) GLenum texunit, (unsigned int) GLenum coord, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetMultiTexGenfvEXT(int texunit, int coord, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMultiTexGenfvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetMultiTexGenfvEXT");
        try { Handles.MH_glGetMultiTexGenfvEXT.invokeExact(handles.PFN_glGetMultiTexGenfvEXT, texunit, coord, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetMultiTexGenfvEXT", e); }
    }

    /// ```
    /// void glGetMultiTexGenivEXT((unsigned int) GLenum texunit, (unsigned int) GLenum coord, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetMultiTexGenivEXT(int texunit, int coord, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMultiTexGenivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetMultiTexGenivEXT");
        try { Handles.MH_glGetMultiTexGenivEXT.invokeExact(handles.PFN_glGetMultiTexGenivEXT, texunit, coord, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetMultiTexGenivEXT", e); }
    }

    /// ```
    /// void glMultiTexParameteriEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void MultiTexParameteriEXT(int texunit, int target, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexParameteriEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexParameteriEXT");
        try { Handles.MH_glMultiTexParameteriEXT.invokeExact(handles.PFN_glMultiTexParameteriEXT, texunit, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexParameteriEXT", e); }
    }

    /// ```
    /// void glMultiTexParameterivEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (unsigned int) GLenum pname, const GLint* params);
    /// ```
    public void MultiTexParameterivEXT(int texunit, int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexParameterivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexParameterivEXT");
        try { Handles.MH_glMultiTexParameterivEXT.invokeExact(handles.PFN_glMultiTexParameterivEXT, texunit, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexParameterivEXT", e); }
    }

    /// ```
    /// void glMultiTexParameterfEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat param);
    /// ```
    public void MultiTexParameterfEXT(int texunit, int target, int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexParameterfEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexParameterfEXT");
        try { Handles.MH_glMultiTexParameterfEXT.invokeExact(handles.PFN_glMultiTexParameterfEXT, texunit, target, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexParameterfEXT", e); }
    }

    /// ```
    /// void glMultiTexParameterfvEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (unsigned int) GLenum pname, const GLfloat* params);
    /// ```
    public void MultiTexParameterfvEXT(int texunit, int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexParameterfvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexParameterfvEXT");
        try { Handles.MH_glMultiTexParameterfvEXT.invokeExact(handles.PFN_glMultiTexParameterfvEXT, texunit, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexParameterfvEXT", e); }
    }

    /// ```
    /// void glMultiTexImage1DEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (int) GLint level, (int) GLint internalformat, (int) GLsizei width, (int) GLint border, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* pixels);
    /// ```
    public void MultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int format, int type, MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexImage1DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexImage1DEXT");
        try { Handles.MH_glMultiTexImage1DEXT.invokeExact(handles.PFN_glMultiTexImage1DEXT, texunit, target, level, internalformat, width, border, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexImage1DEXT", e); }
    }

    /// ```
    /// void glMultiTexImage2DEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (int) GLint level, (int) GLint internalformat, (int) GLsizei width, (int) GLsizei height, (int) GLint border, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* pixels);
    /// ```
    public void MultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int format, int type, MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexImage2DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexImage2DEXT");
        try { Handles.MH_glMultiTexImage2DEXT.invokeExact(handles.PFN_glMultiTexImage2DEXT, texunit, target, level, internalformat, width, height, border, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexImage2DEXT", e); }
    }

    /// ```
    /// void glMultiTexSubImage1DEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLsizei width, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* pixels);
    /// ```
    public void MultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int type, MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexSubImage1DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexSubImage1DEXT");
        try { Handles.MH_glMultiTexSubImage1DEXT.invokeExact(handles.PFN_glMultiTexSubImage1DEXT, texunit, target, level, xoffset, width, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexSubImage1DEXT", e); }
    }

    /// ```
    /// void glMultiTexSubImage2DEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLsizei width, (int) GLsizei height, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* pixels);
    /// ```
    public void MultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int type, MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexSubImage2DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexSubImage2DEXT");
        try { Handles.MH_glMultiTexSubImage2DEXT.invokeExact(handles.PFN_glMultiTexSubImage2DEXT, texunit, target, level, xoffset, yoffset, width, height, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexSubImage2DEXT", e); }
    }

    /// ```
    /// void glCopyMultiTexImage1DEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum internalformat, (int) GLint x, (int) GLint y, (int) GLsizei width, (int) GLint border);
    /// ```
    public void CopyMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int x, int y, int width, int border) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyMultiTexImage1DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCopyMultiTexImage1DEXT");
        try { Handles.MH_glCopyMultiTexImage1DEXT.invokeExact(handles.PFN_glCopyMultiTexImage1DEXT, texunit, target, level, internalformat, x, y, width, border); }
        catch (Throwable e) { throw new RuntimeException("error in CopyMultiTexImage1DEXT", e); }
    }

    /// ```
    /// void glCopyMultiTexImage2DEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum internalformat, (int) GLint x, (int) GLint y, (int) GLsizei width, (int) GLsizei height, (int) GLint border);
    /// ```
    public void CopyMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int x, int y, int width, int height, int border) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyMultiTexImage2DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCopyMultiTexImage2DEXT");
        try { Handles.MH_glCopyMultiTexImage2DEXT.invokeExact(handles.PFN_glCopyMultiTexImage2DEXT, texunit, target, level, internalformat, x, y, width, height, border); }
        catch (Throwable e) { throw new RuntimeException("error in CopyMultiTexImage2DEXT", e); }
    }

    /// ```
    /// void glCopyMultiTexSubImage1DEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLint x, (int) GLint y, (int) GLsizei width);
    /// ```
    public void CopyMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int x, int y, int width) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyMultiTexSubImage1DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCopyMultiTexSubImage1DEXT");
        try { Handles.MH_glCopyMultiTexSubImage1DEXT.invokeExact(handles.PFN_glCopyMultiTexSubImage1DEXT, texunit, target, level, xoffset, x, y, width); }
        catch (Throwable e) { throw new RuntimeException("error in CopyMultiTexSubImage1DEXT", e); }
    }

    /// ```
    /// void glCopyMultiTexSubImage2DEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLint x, (int) GLint y, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void CopyMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int x, int y, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyMultiTexSubImage2DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCopyMultiTexSubImage2DEXT");
        try { Handles.MH_glCopyMultiTexSubImage2DEXT.invokeExact(handles.PFN_glCopyMultiTexSubImage2DEXT, texunit, target, level, xoffset, yoffset, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in CopyMultiTexSubImage2DEXT", e); }
    }

    /// ```
    /// void glGetMultiTexImageEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum format, (unsigned int) GLenum type, void* pixels);
    /// ```
    public void GetMultiTexImageEXT(int texunit, int target, int level, int format, int type, MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMultiTexImageEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetMultiTexImageEXT");
        try { Handles.MH_glGetMultiTexImageEXT.invokeExact(handles.PFN_glGetMultiTexImageEXT, texunit, target, level, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in GetMultiTexImageEXT", e); }
    }

    /// ```
    /// void glGetMultiTexParameterfvEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetMultiTexParameterfvEXT(int texunit, int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMultiTexParameterfvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetMultiTexParameterfvEXT");
        try { Handles.MH_glGetMultiTexParameterfvEXT.invokeExact(handles.PFN_glGetMultiTexParameterfvEXT, texunit, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetMultiTexParameterfvEXT", e); }
    }

    /// ```
    /// void glGetMultiTexParameterivEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetMultiTexParameterivEXT(int texunit, int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMultiTexParameterivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetMultiTexParameterivEXT");
        try { Handles.MH_glGetMultiTexParameterivEXT.invokeExact(handles.PFN_glGetMultiTexParameterivEXT, texunit, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetMultiTexParameterivEXT", e); }
    }

    /// ```
    /// void glGetMultiTexLevelParameterfvEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum pname, GLfloat* params);
    /// ```
    public void GetMultiTexLevelParameterfvEXT(int texunit, int target, int level, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMultiTexLevelParameterfvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetMultiTexLevelParameterfvEXT");
        try { Handles.MH_glGetMultiTexLevelParameterfvEXT.invokeExact(handles.PFN_glGetMultiTexLevelParameterfvEXT, texunit, target, level, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetMultiTexLevelParameterfvEXT", e); }
    }

    /// ```
    /// void glGetMultiTexLevelParameterivEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetMultiTexLevelParameterivEXT(int texunit, int target, int level, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMultiTexLevelParameterivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetMultiTexLevelParameterivEXT");
        try { Handles.MH_glGetMultiTexLevelParameterivEXT.invokeExact(handles.PFN_glGetMultiTexLevelParameterivEXT, texunit, target, level, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetMultiTexLevelParameterivEXT", e); }
    }

    /// ```
    /// void glMultiTexImage3DEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (int) GLint level, (int) GLint internalformat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (int) GLint border, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* pixels);
    /// ```
    public void MultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexImage3DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexImage3DEXT");
        try { Handles.MH_glMultiTexImage3DEXT.invokeExact(handles.PFN_glMultiTexImage3DEXT, texunit, target, level, internalformat, width, height, depth, border, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexImage3DEXT", e); }
    }

    /// ```
    /// void glMultiTexSubImage3DEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLint zoffset, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* pixels);
    /// ```
    public void MultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, MemorySegment pixels) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexSubImage3DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexSubImage3DEXT");
        try { Handles.MH_glMultiTexSubImage3DEXT.invokeExact(handles.PFN_glMultiTexSubImage3DEXT, texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexSubImage3DEXT", e); }
    }

    /// ```
    /// void glCopyMultiTexSubImage3DEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLint zoffset, (int) GLint x, (int) GLint y, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void CopyMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCopyMultiTexSubImage3DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCopyMultiTexSubImage3DEXT");
        try { Handles.MH_glCopyMultiTexSubImage3DEXT.invokeExact(handles.PFN_glCopyMultiTexSubImage3DEXT, texunit, target, level, xoffset, yoffset, zoffset, x, y, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in CopyMultiTexSubImage3DEXT", e); }
    }

    /// ```
    /// void glEnableClientStateIndexedEXT((unsigned int) GLenum array, (unsigned int) GLuint index);
    /// ```
    public void EnableClientStateIndexedEXT(int array, int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEnableClientStateIndexedEXT)) throw new GLSymbolNotFoundError("Symbol not found: glEnableClientStateIndexedEXT");
        try { Handles.MH_glEnableClientStateIndexedEXT.invokeExact(handles.PFN_glEnableClientStateIndexedEXT, array, index); }
        catch (Throwable e) { throw new RuntimeException("error in EnableClientStateIndexedEXT", e); }
    }

    /// ```
    /// void glDisableClientStateIndexedEXT((unsigned int) GLenum array, (unsigned int) GLuint index);
    /// ```
    public void DisableClientStateIndexedEXT(int array, int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDisableClientStateIndexedEXT)) throw new GLSymbolNotFoundError("Symbol not found: glDisableClientStateIndexedEXT");
        try { Handles.MH_glDisableClientStateIndexedEXT.invokeExact(handles.PFN_glDisableClientStateIndexedEXT, array, index); }
        catch (Throwable e) { throw new RuntimeException("error in DisableClientStateIndexedEXT", e); }
    }

    /// ```
    /// void glGetFloatIndexedvEXT((unsigned int) GLenum target, (unsigned int) GLuint index, GLfloat* data);
    /// ```
    public void GetFloatIndexedvEXT(int target, int index, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFloatIndexedvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetFloatIndexedvEXT");
        try { Handles.MH_glGetFloatIndexedvEXT.invokeExact(handles.PFN_glGetFloatIndexedvEXT, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetFloatIndexedvEXT", e); }
    }

    /// ```
    /// void glGetDoubleIndexedvEXT((unsigned int) GLenum target, (unsigned int) GLuint index, GLdouble* data);
    /// ```
    public void GetDoubleIndexedvEXT(int target, int index, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetDoubleIndexedvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetDoubleIndexedvEXT");
        try { Handles.MH_glGetDoubleIndexedvEXT.invokeExact(handles.PFN_glGetDoubleIndexedvEXT, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetDoubleIndexedvEXT", e); }
    }

    /// ```
    /// void glGetPointerIndexedvEXT((unsigned int) GLenum target, (unsigned int) GLuint index, void** data);
    /// ```
    public void GetPointerIndexedvEXT(int target, int index, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPointerIndexedvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetPointerIndexedvEXT");
        try { Handles.MH_glGetPointerIndexedvEXT.invokeExact(handles.PFN_glGetPointerIndexedvEXT, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetPointerIndexedvEXT", e); }
    }

    /// ```
    /// void glEnableIndexedEXT((unsigned int) GLenum target, (unsigned int) GLuint index);
    /// ```
    public void EnableIndexedEXT(int target, int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEnableIndexedEXT)) throw new GLSymbolNotFoundError("Symbol not found: glEnableIndexedEXT");
        try { Handles.MH_glEnableIndexedEXT.invokeExact(handles.PFN_glEnableIndexedEXT, target, index); }
        catch (Throwable e) { throw new RuntimeException("error in EnableIndexedEXT", e); }
    }

    /// ```
    /// void glDisableIndexedEXT((unsigned int) GLenum target, (unsigned int) GLuint index);
    /// ```
    public void DisableIndexedEXT(int target, int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDisableIndexedEXT)) throw new GLSymbolNotFoundError("Symbol not found: glDisableIndexedEXT");
        try { Handles.MH_glDisableIndexedEXT.invokeExact(handles.PFN_glDisableIndexedEXT, target, index); }
        catch (Throwable e) { throw new RuntimeException("error in DisableIndexedEXT", e); }
    }

    /// ```
    /// GLboolean glIsEnabledIndexedEXT((unsigned int) GLenum target, (unsigned int) GLuint index);
    /// ```
    public boolean IsEnabledIndexedEXT(int target, int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsEnabledIndexedEXT)) throw new GLSymbolNotFoundError("Symbol not found: glIsEnabledIndexedEXT");
        try { return (((byte) Handles.MH_glIsEnabledIndexedEXT.invokeExact(handles.PFN_glIsEnabledIndexedEXT, target, index)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsEnabledIndexedEXT", e); }
    }

    /// ```
    /// void glGetIntegerIndexedvEXT((unsigned int) GLenum target, (unsigned int) GLuint index, GLint* data);
    /// ```
    public void GetIntegerIndexedvEXT(int target, int index, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetIntegerIndexedvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetIntegerIndexedvEXT");
        try { Handles.MH_glGetIntegerIndexedvEXT.invokeExact(handles.PFN_glGetIntegerIndexedvEXT, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetIntegerIndexedvEXT", e); }
    }

    /// ```
    /// void glGetBooleanIndexedvEXT((unsigned int) GLenum target, (unsigned int) GLuint index, GLboolean* data);
    /// ```
    public void GetBooleanIndexedvEXT(int target, int index, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetBooleanIndexedvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetBooleanIndexedvEXT");
        try { Handles.MH_glGetBooleanIndexedvEXT.invokeExact(handles.PFN_glGetBooleanIndexedvEXT, target, index, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetBooleanIndexedvEXT", e); }
    }

    /// ```
    /// void glCompressedTextureImage3DEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (int) GLint border, (int) GLsizei imageSize, const void* bits);
    /// ```
    public void CompressedTextureImage3DEXT(int texture, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, MemorySegment bits) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedTextureImage3DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCompressedTextureImage3DEXT");
        try { Handles.MH_glCompressedTextureImage3DEXT.invokeExact(handles.PFN_glCompressedTextureImage3DEXT, texture, target, level, internalformat, width, height, depth, border, imageSize, bits); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedTextureImage3DEXT", e); }
    }

    /// ```
    /// void glCompressedTextureImage2DEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, (int) GLint border, (int) GLsizei imageSize, const void* bits);
    /// ```
    public void CompressedTextureImage2DEXT(int texture, int target, int level, int internalformat, int width, int height, int border, int imageSize, MemorySegment bits) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedTextureImage2DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCompressedTextureImage2DEXT");
        try { Handles.MH_glCompressedTextureImage2DEXT.invokeExact(handles.PFN_glCompressedTextureImage2DEXT, texture, target, level, internalformat, width, height, border, imageSize, bits); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedTextureImage2DEXT", e); }
    }

    /// ```
    /// void glCompressedTextureImage1DEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLint border, (int) GLsizei imageSize, const void* bits);
    /// ```
    public void CompressedTextureImage1DEXT(int texture, int target, int level, int internalformat, int width, int border, int imageSize, MemorySegment bits) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedTextureImage1DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCompressedTextureImage1DEXT");
        try { Handles.MH_glCompressedTextureImage1DEXT.invokeExact(handles.PFN_glCompressedTextureImage1DEXT, texture, target, level, internalformat, width, border, imageSize, bits); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedTextureImage1DEXT", e); }
    }

    /// ```
    /// void glCompressedTextureSubImage3DEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLint zoffset, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (unsigned int) GLenum format, (int) GLsizei imageSize, const void* bits);
    /// ```
    public void CompressedTextureSubImage3DEXT(int texture, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, MemorySegment bits) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedTextureSubImage3DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCompressedTextureSubImage3DEXT");
        try { Handles.MH_glCompressedTextureSubImage3DEXT.invokeExact(handles.PFN_glCompressedTextureSubImage3DEXT, texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, bits); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedTextureSubImage3DEXT", e); }
    }

    /// ```
    /// void glCompressedTextureSubImage2DEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLsizei width, (int) GLsizei height, (unsigned int) GLenum format, (int) GLsizei imageSize, const void* bits);
    /// ```
    public void CompressedTextureSubImage2DEXT(int texture, int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, MemorySegment bits) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedTextureSubImage2DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCompressedTextureSubImage2DEXT");
        try { Handles.MH_glCompressedTextureSubImage2DEXT.invokeExact(handles.PFN_glCompressedTextureSubImage2DEXT, texture, target, level, xoffset, yoffset, width, height, format, imageSize, bits); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedTextureSubImage2DEXT", e); }
    }

    /// ```
    /// void glCompressedTextureSubImage1DEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLsizei width, (unsigned int) GLenum format, (int) GLsizei imageSize, const void* bits);
    /// ```
    public void CompressedTextureSubImage1DEXT(int texture, int target, int level, int xoffset, int width, int format, int imageSize, MemorySegment bits) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedTextureSubImage1DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCompressedTextureSubImage1DEXT");
        try { Handles.MH_glCompressedTextureSubImage1DEXT.invokeExact(handles.PFN_glCompressedTextureSubImage1DEXT, texture, target, level, xoffset, width, format, imageSize, bits); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedTextureSubImage1DEXT", e); }
    }

    /// ```
    /// void glGetCompressedTextureImageEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLint lod, void* img);
    /// ```
    public void GetCompressedTextureImageEXT(int texture, int target, int lod, MemorySegment img) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetCompressedTextureImageEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetCompressedTextureImageEXT");
        try { Handles.MH_glGetCompressedTextureImageEXT.invokeExact(handles.PFN_glGetCompressedTextureImageEXT, texture, target, lod, img); }
        catch (Throwable e) { throw new RuntimeException("error in GetCompressedTextureImageEXT", e); }
    }

    /// ```
    /// void glCompressedMultiTexImage3DEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (int) GLint border, (int) GLsizei imageSize, const void* bits);
    /// ```
    public void CompressedMultiTexImage3DEXT(int texunit, int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, MemorySegment bits) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedMultiTexImage3DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCompressedMultiTexImage3DEXT");
        try { Handles.MH_glCompressedMultiTexImage3DEXT.invokeExact(handles.PFN_glCompressedMultiTexImage3DEXT, texunit, target, level, internalformat, width, height, depth, border, imageSize, bits); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedMultiTexImage3DEXT", e); }
    }

    /// ```
    /// void glCompressedMultiTexImage2DEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, (int) GLint border, (int) GLsizei imageSize, const void* bits);
    /// ```
    public void CompressedMultiTexImage2DEXT(int texunit, int target, int level, int internalformat, int width, int height, int border, int imageSize, MemorySegment bits) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedMultiTexImage2DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCompressedMultiTexImage2DEXT");
        try { Handles.MH_glCompressedMultiTexImage2DEXT.invokeExact(handles.PFN_glCompressedMultiTexImage2DEXT, texunit, target, level, internalformat, width, height, border, imageSize, bits); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedMultiTexImage2DEXT", e); }
    }

    /// ```
    /// void glCompressedMultiTexImage1DEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (int) GLint level, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLint border, (int) GLsizei imageSize, const void* bits);
    /// ```
    public void CompressedMultiTexImage1DEXT(int texunit, int target, int level, int internalformat, int width, int border, int imageSize, MemorySegment bits) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedMultiTexImage1DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCompressedMultiTexImage1DEXT");
        try { Handles.MH_glCompressedMultiTexImage1DEXT.invokeExact(handles.PFN_glCompressedMultiTexImage1DEXT, texunit, target, level, internalformat, width, border, imageSize, bits); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedMultiTexImage1DEXT", e); }
    }

    /// ```
    /// void glCompressedMultiTexSubImage3DEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLint zoffset, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, (unsigned int) GLenum format, (int) GLsizei imageSize, const void* bits);
    /// ```
    public void CompressedMultiTexSubImage3DEXT(int texunit, int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, MemorySegment bits) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedMultiTexSubImage3DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCompressedMultiTexSubImage3DEXT");
        try { Handles.MH_glCompressedMultiTexSubImage3DEXT.invokeExact(handles.PFN_glCompressedMultiTexSubImage3DEXT, texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, bits); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedMultiTexSubImage3DEXT", e); }
    }

    /// ```
    /// void glCompressedMultiTexSubImage2DEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLsizei width, (int) GLsizei height, (unsigned int) GLenum format, (int) GLsizei imageSize, const void* bits);
    /// ```
    public void CompressedMultiTexSubImage2DEXT(int texunit, int target, int level, int xoffset, int yoffset, int width, int height, int format, int imageSize, MemorySegment bits) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedMultiTexSubImage2DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCompressedMultiTexSubImage2DEXT");
        try { Handles.MH_glCompressedMultiTexSubImage2DEXT.invokeExact(handles.PFN_glCompressedMultiTexSubImage2DEXT, texunit, target, level, xoffset, yoffset, width, height, format, imageSize, bits); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedMultiTexSubImage2DEXT", e); }
    }

    /// ```
    /// void glCompressedMultiTexSubImage1DEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (int) GLint level, (int) GLint xoffset, (int) GLsizei width, (unsigned int) GLenum format, (int) GLsizei imageSize, const void* bits);
    /// ```
    public void CompressedMultiTexSubImage1DEXT(int texunit, int target, int level, int xoffset, int width, int format, int imageSize, MemorySegment bits) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompressedMultiTexSubImage1DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCompressedMultiTexSubImage1DEXT");
        try { Handles.MH_glCompressedMultiTexSubImage1DEXT.invokeExact(handles.PFN_glCompressedMultiTexSubImage1DEXT, texunit, target, level, xoffset, width, format, imageSize, bits); }
        catch (Throwable e) { throw new RuntimeException("error in CompressedMultiTexSubImage1DEXT", e); }
    }

    /// ```
    /// void glGetCompressedMultiTexImageEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (int) GLint lod, void* img);
    /// ```
    public void GetCompressedMultiTexImageEXT(int texunit, int target, int lod, MemorySegment img) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetCompressedMultiTexImageEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetCompressedMultiTexImageEXT");
        try { Handles.MH_glGetCompressedMultiTexImageEXT.invokeExact(handles.PFN_glGetCompressedMultiTexImageEXT, texunit, target, lod, img); }
        catch (Throwable e) { throw new RuntimeException("error in GetCompressedMultiTexImageEXT", e); }
    }

    /// ```
    /// void glMatrixLoadTransposefEXT((unsigned int) GLenum mode, const GLfloat* m);
    /// ```
    public void MatrixLoadTransposefEXT(int mode, MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixLoadTransposefEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixLoadTransposefEXT");
        try { Handles.MH_glMatrixLoadTransposefEXT.invokeExact(handles.PFN_glMatrixLoadTransposefEXT, mode, m); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixLoadTransposefEXT", e); }
    }

    /// ```
    /// void glMatrixLoadTransposedEXT((unsigned int) GLenum mode, const GLdouble* m);
    /// ```
    public void MatrixLoadTransposedEXT(int mode, MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixLoadTransposedEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixLoadTransposedEXT");
        try { Handles.MH_glMatrixLoadTransposedEXT.invokeExact(handles.PFN_glMatrixLoadTransposedEXT, mode, m); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixLoadTransposedEXT", e); }
    }

    /// ```
    /// void glMatrixMultTransposefEXT((unsigned int) GLenum mode, const GLfloat* m);
    /// ```
    public void MatrixMultTransposefEXT(int mode, MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixMultTransposefEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixMultTransposefEXT");
        try { Handles.MH_glMatrixMultTransposefEXT.invokeExact(handles.PFN_glMatrixMultTransposefEXT, mode, m); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixMultTransposefEXT", e); }
    }

    /// ```
    /// void glMatrixMultTransposedEXT((unsigned int) GLenum mode, const GLdouble* m);
    /// ```
    public void MatrixMultTransposedEXT(int mode, MemorySegment m) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMatrixMultTransposedEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMatrixMultTransposedEXT");
        try { Handles.MH_glMatrixMultTransposedEXT.invokeExact(handles.PFN_glMatrixMultTransposedEXT, mode, m); }
        catch (Throwable e) { throw new RuntimeException("error in MatrixMultTransposedEXT", e); }
    }

    /// ```
    /// void glNamedBufferDataEXT((unsigned int) GLuint buffer, ((signed long long) khronos_ssize_t) GLsizeiptr size, const void* data, (unsigned int) GLenum usage);
    /// ```
    public void NamedBufferDataEXT(int buffer, long size, MemorySegment data, int usage) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedBufferDataEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedBufferDataEXT");
        try { Handles.MH_glNamedBufferDataEXT.invokeExact(handles.PFN_glNamedBufferDataEXT, buffer, size, data, usage); }
        catch (Throwable e) { throw new RuntimeException("error in NamedBufferDataEXT", e); }
    }

    /// ```
    /// void glNamedBufferSubDataEXT((unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size, const void* data);
    /// ```
    public void NamedBufferSubDataEXT(int buffer, long offset, long size, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedBufferSubDataEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedBufferSubDataEXT");
        try { Handles.MH_glNamedBufferSubDataEXT.invokeExact(handles.PFN_glNamedBufferSubDataEXT, buffer, offset, size, data); }
        catch (Throwable e) { throw new RuntimeException("error in NamedBufferSubDataEXT", e); }
    }

    /// ```
    /// void* glMapNamedBufferEXT((unsigned int) GLuint buffer, (unsigned int) GLenum access);
    /// ```
    public MemorySegment MapNamedBufferEXT(int buffer, int access) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapNamedBufferEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMapNamedBufferEXT");
        try { return (MemorySegment) Handles.MH_glMapNamedBufferEXT.invokeExact(handles.PFN_glMapNamedBufferEXT, buffer, access); }
        catch (Throwable e) { throw new RuntimeException("error in MapNamedBufferEXT", e); }
    }

    /// ```
    /// GLboolean glUnmapNamedBufferEXT((unsigned int) GLuint buffer);
    /// ```
    public boolean UnmapNamedBufferEXT(int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glUnmapNamedBufferEXT)) throw new GLSymbolNotFoundError("Symbol not found: glUnmapNamedBufferEXT");
        try { return (((byte) Handles.MH_glUnmapNamedBufferEXT.invokeExact(handles.PFN_glUnmapNamedBufferEXT, buffer)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in UnmapNamedBufferEXT", e); }
    }

    /// ```
    /// void glGetNamedBufferParameterivEXT((unsigned int) GLuint buffer, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetNamedBufferParameterivEXT(int buffer, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedBufferParameterivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetNamedBufferParameterivEXT");
        try { Handles.MH_glGetNamedBufferParameterivEXT.invokeExact(handles.PFN_glGetNamedBufferParameterivEXT, buffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedBufferParameterivEXT", e); }
    }

    /// ```
    /// void glGetNamedBufferPointervEXT((unsigned int) GLuint buffer, (unsigned int) GLenum pname, void** params);
    /// ```
    public void GetNamedBufferPointervEXT(int buffer, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedBufferPointervEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetNamedBufferPointervEXT");
        try { Handles.MH_glGetNamedBufferPointervEXT.invokeExact(handles.PFN_glGetNamedBufferPointervEXT, buffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedBufferPointervEXT", e); }
    }

    /// ```
    /// void glGetNamedBufferSubDataEXT((unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size, void* data);
    /// ```
    public void GetNamedBufferSubDataEXT(int buffer, long offset, long size, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedBufferSubDataEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetNamedBufferSubDataEXT");
        try { Handles.MH_glGetNamedBufferSubDataEXT.invokeExact(handles.PFN_glGetNamedBufferSubDataEXT, buffer, offset, size, data); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedBufferSubDataEXT", e); }
    }

    /// ```
    /// void glProgramUniform1fEXT((unsigned int) GLuint program, (int) GLint location, ((float) khronos_float_t) GLfloat v0);
    /// ```
    public void ProgramUniform1fEXT(int program, int location, float v0) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1fEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform1fEXT");
        try { Handles.MH_glProgramUniform1fEXT.invokeExact(handles.PFN_glProgramUniform1fEXT, program, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1fEXT", e); }
    }

    /// ```
    /// void glProgramUniform2fEXT((unsigned int) GLuint program, (int) GLint location, ((float) khronos_float_t) GLfloat v0, ((float) khronos_float_t) GLfloat v1);
    /// ```
    public void ProgramUniform2fEXT(int program, int location, float v0, float v1) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2fEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform2fEXT");
        try { Handles.MH_glProgramUniform2fEXT.invokeExact(handles.PFN_glProgramUniform2fEXT, program, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2fEXT", e); }
    }

    /// ```
    /// void glProgramUniform3fEXT((unsigned int) GLuint program, (int) GLint location, ((float) khronos_float_t) GLfloat v0, ((float) khronos_float_t) GLfloat v1, ((float) khronos_float_t) GLfloat v2);
    /// ```
    public void ProgramUniform3fEXT(int program, int location, float v0, float v1, float v2) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3fEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform3fEXT");
        try { Handles.MH_glProgramUniform3fEXT.invokeExact(handles.PFN_glProgramUniform3fEXT, program, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3fEXT", e); }
    }

    /// ```
    /// void glProgramUniform4fEXT((unsigned int) GLuint program, (int) GLint location, ((float) khronos_float_t) GLfloat v0, ((float) khronos_float_t) GLfloat v1, ((float) khronos_float_t) GLfloat v2, ((float) khronos_float_t) GLfloat v3);
    /// ```
    public void ProgramUniform4fEXT(int program, int location, float v0, float v1, float v2, float v3) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4fEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform4fEXT");
        try { Handles.MH_glProgramUniform4fEXT.invokeExact(handles.PFN_glProgramUniform4fEXT, program, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4fEXT", e); }
    }

    /// ```
    /// void glProgramUniform1iEXT((unsigned int) GLuint program, (int) GLint location, (int) GLint v0);
    /// ```
    public void ProgramUniform1iEXT(int program, int location, int v0) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1iEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform1iEXT");
        try { Handles.MH_glProgramUniform1iEXT.invokeExact(handles.PFN_glProgramUniform1iEXT, program, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1iEXT", e); }
    }

    /// ```
    /// void glProgramUniform2iEXT((unsigned int) GLuint program, (int) GLint location, (int) GLint v0, (int) GLint v1);
    /// ```
    public void ProgramUniform2iEXT(int program, int location, int v0, int v1) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2iEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform2iEXT");
        try { Handles.MH_glProgramUniform2iEXT.invokeExact(handles.PFN_glProgramUniform2iEXT, program, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2iEXT", e); }
    }

    /// ```
    /// void glProgramUniform3iEXT((unsigned int) GLuint program, (int) GLint location, (int) GLint v0, (int) GLint v1, (int) GLint v2);
    /// ```
    public void ProgramUniform3iEXT(int program, int location, int v0, int v1, int v2) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3iEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform3iEXT");
        try { Handles.MH_glProgramUniform3iEXT.invokeExact(handles.PFN_glProgramUniform3iEXT, program, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3iEXT", e); }
    }

    /// ```
    /// void glProgramUniform4iEXT((unsigned int) GLuint program, (int) GLint location, (int) GLint v0, (int) GLint v1, (int) GLint v2, (int) GLint v3);
    /// ```
    public void ProgramUniform4iEXT(int program, int location, int v0, int v1, int v2, int v3) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4iEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform4iEXT");
        try { Handles.MH_glProgramUniform4iEXT.invokeExact(handles.PFN_glProgramUniform4iEXT, program, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4iEXT", e); }
    }

    /// ```
    /// void glProgramUniform1fvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLfloat* value);
    /// ```
    public void ProgramUniform1fvEXT(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform1fvEXT");
        try { Handles.MH_glProgramUniform1fvEXT.invokeExact(handles.PFN_glProgramUniform1fvEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1fvEXT", e); }
    }

    /// ```
    /// void glProgramUniform2fvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLfloat* value);
    /// ```
    public void ProgramUniform2fvEXT(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform2fvEXT");
        try { Handles.MH_glProgramUniform2fvEXT.invokeExact(handles.PFN_glProgramUniform2fvEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2fvEXT", e); }
    }

    /// ```
    /// void glProgramUniform3fvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLfloat* value);
    /// ```
    public void ProgramUniform3fvEXT(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform3fvEXT");
        try { Handles.MH_glProgramUniform3fvEXT.invokeExact(handles.PFN_glProgramUniform3fvEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3fvEXT", e); }
    }

    /// ```
    /// void glProgramUniform4fvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLfloat* value);
    /// ```
    public void ProgramUniform4fvEXT(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform4fvEXT");
        try { Handles.MH_glProgramUniform4fvEXT.invokeExact(handles.PFN_glProgramUniform4fvEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4fvEXT", e); }
    }

    /// ```
    /// void glProgramUniform1ivEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLint* value);
    /// ```
    public void ProgramUniform1ivEXT(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1ivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform1ivEXT");
        try { Handles.MH_glProgramUniform1ivEXT.invokeExact(handles.PFN_glProgramUniform1ivEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1ivEXT", e); }
    }

    /// ```
    /// void glProgramUniform2ivEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLint* value);
    /// ```
    public void ProgramUniform2ivEXT(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2ivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform2ivEXT");
        try { Handles.MH_glProgramUniform2ivEXT.invokeExact(handles.PFN_glProgramUniform2ivEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2ivEXT", e); }
    }

    /// ```
    /// void glProgramUniform3ivEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLint* value);
    /// ```
    public void ProgramUniform3ivEXT(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3ivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform3ivEXT");
        try { Handles.MH_glProgramUniform3ivEXT.invokeExact(handles.PFN_glProgramUniform3ivEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3ivEXT", e); }
    }

    /// ```
    /// void glProgramUniform4ivEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLint* value);
    /// ```
    public void ProgramUniform4ivEXT(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4ivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform4ivEXT");
        try { Handles.MH_glProgramUniform4ivEXT.invokeExact(handles.PFN_glProgramUniform4ivEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4ivEXT", e); }
    }

    /// ```
    /// void glProgramUniformMatrix2fvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix2fvEXT(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix2fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix2fvEXT");
        try { Handles.MH_glProgramUniformMatrix2fvEXT.invokeExact(handles.PFN_glProgramUniformMatrix2fvEXT, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix2fvEXT", e); }
    }

    /// ```
    /// void glProgramUniformMatrix3fvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix3fvEXT(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix3fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix3fvEXT");
        try { Handles.MH_glProgramUniformMatrix3fvEXT.invokeExact(handles.PFN_glProgramUniformMatrix3fvEXT, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix3fvEXT", e); }
    }

    /// ```
    /// void glProgramUniformMatrix4fvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix4fvEXT(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix4fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix4fvEXT");
        try { Handles.MH_glProgramUniformMatrix4fvEXT.invokeExact(handles.PFN_glProgramUniformMatrix4fvEXT, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix4fvEXT", e); }
    }

    /// ```
    /// void glProgramUniformMatrix2x3fvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix2x3fvEXT(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix2x3fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix2x3fvEXT");
        try { Handles.MH_glProgramUniformMatrix2x3fvEXT.invokeExact(handles.PFN_glProgramUniformMatrix2x3fvEXT, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix2x3fvEXT", e); }
    }

    /// ```
    /// void glProgramUniformMatrix3x2fvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix3x2fvEXT(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix3x2fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix3x2fvEXT");
        try { Handles.MH_glProgramUniformMatrix3x2fvEXT.invokeExact(handles.PFN_glProgramUniformMatrix3x2fvEXT, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix3x2fvEXT", e); }
    }

    /// ```
    /// void glProgramUniformMatrix2x4fvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix2x4fvEXT(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix2x4fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix2x4fvEXT");
        try { Handles.MH_glProgramUniformMatrix2x4fvEXT.invokeExact(handles.PFN_glProgramUniformMatrix2x4fvEXT, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix2x4fvEXT", e); }
    }

    /// ```
    /// void glProgramUniformMatrix4x2fvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix4x2fvEXT(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix4x2fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix4x2fvEXT");
        try { Handles.MH_glProgramUniformMatrix4x2fvEXT.invokeExact(handles.PFN_glProgramUniformMatrix4x2fvEXT, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix4x2fvEXT", e); }
    }

    /// ```
    /// void glProgramUniformMatrix3x4fvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix3x4fvEXT(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix3x4fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix3x4fvEXT");
        try { Handles.MH_glProgramUniformMatrix3x4fvEXT.invokeExact(handles.PFN_glProgramUniformMatrix3x4fvEXT, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix3x4fvEXT", e); }
    }

    /// ```
    /// void glProgramUniformMatrix4x3fvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLfloat* value);
    /// ```
    public void ProgramUniformMatrix4x3fvEXT(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix4x3fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix4x3fvEXT");
        try { Handles.MH_glProgramUniformMatrix4x3fvEXT.invokeExact(handles.PFN_glProgramUniformMatrix4x3fvEXT, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix4x3fvEXT", e); }
    }

    /// ```
    /// void glTextureBufferEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (unsigned int) GLenum internalformat, (unsigned int) GLuint buffer);
    /// ```
    public void TextureBufferEXT(int texture, int target, int internalformat, int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureBufferEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureBufferEXT");
        try { Handles.MH_glTextureBufferEXT.invokeExact(handles.PFN_glTextureBufferEXT, texture, target, internalformat, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in TextureBufferEXT", e); }
    }

    /// ```
    /// void glMultiTexBufferEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (unsigned int) GLenum internalformat, (unsigned int) GLuint buffer);
    /// ```
    public void MultiTexBufferEXT(int texunit, int target, int internalformat, int buffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexBufferEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexBufferEXT");
        try { Handles.MH_glMultiTexBufferEXT.invokeExact(handles.PFN_glMultiTexBufferEXT, texunit, target, internalformat, buffer); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexBufferEXT", e); }
    }

    /// ```
    /// void glTextureParameterIivEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (unsigned int) GLenum pname, const GLint* params);
    /// ```
    public void TextureParameterIivEXT(int texture, int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureParameterIivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureParameterIivEXT");
        try { Handles.MH_glTextureParameterIivEXT.invokeExact(handles.PFN_glTextureParameterIivEXT, texture, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in TextureParameterIivEXT", e); }
    }

    /// ```
    /// void glTextureParameterIuivEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (unsigned int) GLenum pname, const GLuint* params);
    /// ```
    public void TextureParameterIuivEXT(int texture, int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureParameterIuivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureParameterIuivEXT");
        try { Handles.MH_glTextureParameterIuivEXT.invokeExact(handles.PFN_glTextureParameterIuivEXT, texture, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in TextureParameterIuivEXT", e); }
    }

    /// ```
    /// void glGetTextureParameterIivEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetTextureParameterIivEXT(int texture, int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureParameterIivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetTextureParameterIivEXT");
        try { Handles.MH_glGetTextureParameterIivEXT.invokeExact(handles.PFN_glGetTextureParameterIivEXT, texture, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureParameterIivEXT", e); }
    }

    /// ```
    /// void glGetTextureParameterIuivEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (unsigned int) GLenum pname, GLuint* params);
    /// ```
    public void GetTextureParameterIuivEXT(int texture, int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTextureParameterIuivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetTextureParameterIuivEXT");
        try { Handles.MH_glGetTextureParameterIuivEXT.invokeExact(handles.PFN_glGetTextureParameterIuivEXT, texture, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetTextureParameterIuivEXT", e); }
    }

    /// ```
    /// void glMultiTexParameterIivEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (unsigned int) GLenum pname, const GLint* params);
    /// ```
    public void MultiTexParameterIivEXT(int texunit, int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexParameterIivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexParameterIivEXT");
        try { Handles.MH_glMultiTexParameterIivEXT.invokeExact(handles.PFN_glMultiTexParameterIivEXT, texunit, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexParameterIivEXT", e); }
    }

    /// ```
    /// void glMultiTexParameterIuivEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (unsigned int) GLenum pname, const GLuint* params);
    /// ```
    public void MultiTexParameterIuivEXT(int texunit, int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexParameterIuivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexParameterIuivEXT");
        try { Handles.MH_glMultiTexParameterIuivEXT.invokeExact(handles.PFN_glMultiTexParameterIuivEXT, texunit, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexParameterIuivEXT", e); }
    }

    /// ```
    /// void glGetMultiTexParameterIivEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetMultiTexParameterIivEXT(int texunit, int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMultiTexParameterIivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetMultiTexParameterIivEXT");
        try { Handles.MH_glGetMultiTexParameterIivEXT.invokeExact(handles.PFN_glGetMultiTexParameterIivEXT, texunit, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetMultiTexParameterIivEXT", e); }
    }

    /// ```
    /// void glGetMultiTexParameterIuivEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (unsigned int) GLenum pname, GLuint* params);
    /// ```
    public void GetMultiTexParameterIuivEXT(int texunit, int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetMultiTexParameterIuivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetMultiTexParameterIuivEXT");
        try { Handles.MH_glGetMultiTexParameterIuivEXT.invokeExact(handles.PFN_glGetMultiTexParameterIuivEXT, texunit, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetMultiTexParameterIuivEXT", e); }
    }

    /// ```
    /// void glProgramUniform1uiEXT((unsigned int) GLuint program, (int) GLint location, (unsigned int) GLuint v0);
    /// ```
    public void ProgramUniform1uiEXT(int program, int location, int v0) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1uiEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform1uiEXT");
        try { Handles.MH_glProgramUniform1uiEXT.invokeExact(handles.PFN_glProgramUniform1uiEXT, program, location, v0); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1uiEXT", e); }
    }

    /// ```
    /// void glProgramUniform2uiEXT((unsigned int) GLuint program, (int) GLint location, (unsigned int) GLuint v0, (unsigned int) GLuint v1);
    /// ```
    public void ProgramUniform2uiEXT(int program, int location, int v0, int v1) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2uiEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform2uiEXT");
        try { Handles.MH_glProgramUniform2uiEXT.invokeExact(handles.PFN_glProgramUniform2uiEXT, program, location, v0, v1); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2uiEXT", e); }
    }

    /// ```
    /// void glProgramUniform3uiEXT((unsigned int) GLuint program, (int) GLint location, (unsigned int) GLuint v0, (unsigned int) GLuint v1, (unsigned int) GLuint v2);
    /// ```
    public void ProgramUniform3uiEXT(int program, int location, int v0, int v1, int v2) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3uiEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform3uiEXT");
        try { Handles.MH_glProgramUniform3uiEXT.invokeExact(handles.PFN_glProgramUniform3uiEXT, program, location, v0, v1, v2); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3uiEXT", e); }
    }

    /// ```
    /// void glProgramUniform4uiEXT((unsigned int) GLuint program, (int) GLint location, (unsigned int) GLuint v0, (unsigned int) GLuint v1, (unsigned int) GLuint v2, (unsigned int) GLuint v3);
    /// ```
    public void ProgramUniform4uiEXT(int program, int location, int v0, int v1, int v2, int v3) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4uiEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform4uiEXT");
        try { Handles.MH_glProgramUniform4uiEXT.invokeExact(handles.PFN_glProgramUniform4uiEXT, program, location, v0, v1, v2, v3); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4uiEXT", e); }
    }

    /// ```
    /// void glProgramUniform1uivEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLuint* value);
    /// ```
    public void ProgramUniform1uivEXT(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1uivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform1uivEXT");
        try { Handles.MH_glProgramUniform1uivEXT.invokeExact(handles.PFN_glProgramUniform1uivEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1uivEXT", e); }
    }

    /// ```
    /// void glProgramUniform2uivEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLuint* value);
    /// ```
    public void ProgramUniform2uivEXT(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2uivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform2uivEXT");
        try { Handles.MH_glProgramUniform2uivEXT.invokeExact(handles.PFN_glProgramUniform2uivEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2uivEXT", e); }
    }

    /// ```
    /// void glProgramUniform3uivEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLuint* value);
    /// ```
    public void ProgramUniform3uivEXT(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3uivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform3uivEXT");
        try { Handles.MH_glProgramUniform3uivEXT.invokeExact(handles.PFN_glProgramUniform3uivEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3uivEXT", e); }
    }

    /// ```
    /// void glProgramUniform4uivEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLuint* value);
    /// ```
    public void ProgramUniform4uivEXT(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4uivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform4uivEXT");
        try { Handles.MH_glProgramUniform4uivEXT.invokeExact(handles.PFN_glProgramUniform4uivEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4uivEXT", e); }
    }

    /// ```
    /// void glNamedProgramLocalParameters4fvEXT((unsigned int) GLuint program, (unsigned int) GLenum target, (unsigned int) GLuint index, (int) GLsizei count, const GLfloat* params);
    /// ```
    public void NamedProgramLocalParameters4fvEXT(int program, int target, int index, int count, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedProgramLocalParameters4fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedProgramLocalParameters4fvEXT");
        try { Handles.MH_glNamedProgramLocalParameters4fvEXT.invokeExact(handles.PFN_glNamedProgramLocalParameters4fvEXT, program, target, index, count, params); }
        catch (Throwable e) { throw new RuntimeException("error in NamedProgramLocalParameters4fvEXT", e); }
    }

    /// ```
    /// void glNamedProgramLocalParameterI4iEXT((unsigned int) GLuint program, (unsigned int) GLenum target, (unsigned int) GLuint index, (int) GLint x, (int) GLint y, (int) GLint z, (int) GLint w);
    /// ```
    public void NamedProgramLocalParameterI4iEXT(int program, int target, int index, int x, int y, int z, int w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedProgramLocalParameterI4iEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedProgramLocalParameterI4iEXT");
        try { Handles.MH_glNamedProgramLocalParameterI4iEXT.invokeExact(handles.PFN_glNamedProgramLocalParameterI4iEXT, program, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in NamedProgramLocalParameterI4iEXT", e); }
    }

    /// ```
    /// void glNamedProgramLocalParameterI4ivEXT((unsigned int) GLuint program, (unsigned int) GLenum target, (unsigned int) GLuint index, const GLint* params);
    /// ```
    public void NamedProgramLocalParameterI4ivEXT(int program, int target, int index, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedProgramLocalParameterI4ivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedProgramLocalParameterI4ivEXT");
        try { Handles.MH_glNamedProgramLocalParameterI4ivEXT.invokeExact(handles.PFN_glNamedProgramLocalParameterI4ivEXT, program, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in NamedProgramLocalParameterI4ivEXT", e); }
    }

    /// ```
    /// void glNamedProgramLocalParametersI4ivEXT((unsigned int) GLuint program, (unsigned int) GLenum target, (unsigned int) GLuint index, (int) GLsizei count, const GLint* params);
    /// ```
    public void NamedProgramLocalParametersI4ivEXT(int program, int target, int index, int count, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedProgramLocalParametersI4ivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedProgramLocalParametersI4ivEXT");
        try { Handles.MH_glNamedProgramLocalParametersI4ivEXT.invokeExact(handles.PFN_glNamedProgramLocalParametersI4ivEXT, program, target, index, count, params); }
        catch (Throwable e) { throw new RuntimeException("error in NamedProgramLocalParametersI4ivEXT", e); }
    }

    /// ```
    /// void glNamedProgramLocalParameterI4uiEXT((unsigned int) GLuint program, (unsigned int) GLenum target, (unsigned int) GLuint index, (unsigned int) GLuint x, (unsigned int) GLuint y, (unsigned int) GLuint z, (unsigned int) GLuint w);
    /// ```
    public void NamedProgramLocalParameterI4uiEXT(int program, int target, int index, int x, int y, int z, int w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedProgramLocalParameterI4uiEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedProgramLocalParameterI4uiEXT");
        try { Handles.MH_glNamedProgramLocalParameterI4uiEXT.invokeExact(handles.PFN_glNamedProgramLocalParameterI4uiEXT, program, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in NamedProgramLocalParameterI4uiEXT", e); }
    }

    /// ```
    /// void glNamedProgramLocalParameterI4uivEXT((unsigned int) GLuint program, (unsigned int) GLenum target, (unsigned int) GLuint index, const GLuint* params);
    /// ```
    public void NamedProgramLocalParameterI4uivEXT(int program, int target, int index, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedProgramLocalParameterI4uivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedProgramLocalParameterI4uivEXT");
        try { Handles.MH_glNamedProgramLocalParameterI4uivEXT.invokeExact(handles.PFN_glNamedProgramLocalParameterI4uivEXT, program, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in NamedProgramLocalParameterI4uivEXT", e); }
    }

    /// ```
    /// void glNamedProgramLocalParametersI4uivEXT((unsigned int) GLuint program, (unsigned int) GLenum target, (unsigned int) GLuint index, (int) GLsizei count, const GLuint* params);
    /// ```
    public void NamedProgramLocalParametersI4uivEXT(int program, int target, int index, int count, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedProgramLocalParametersI4uivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedProgramLocalParametersI4uivEXT");
        try { Handles.MH_glNamedProgramLocalParametersI4uivEXT.invokeExact(handles.PFN_glNamedProgramLocalParametersI4uivEXT, program, target, index, count, params); }
        catch (Throwable e) { throw new RuntimeException("error in NamedProgramLocalParametersI4uivEXT", e); }
    }

    /// ```
    /// void glGetNamedProgramLocalParameterIivEXT((unsigned int) GLuint program, (unsigned int) GLenum target, (unsigned int) GLuint index, GLint* params);
    /// ```
    public void GetNamedProgramLocalParameterIivEXT(int program, int target, int index, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedProgramLocalParameterIivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetNamedProgramLocalParameterIivEXT");
        try { Handles.MH_glGetNamedProgramLocalParameterIivEXT.invokeExact(handles.PFN_glGetNamedProgramLocalParameterIivEXT, program, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedProgramLocalParameterIivEXT", e); }
    }

    /// ```
    /// void glGetNamedProgramLocalParameterIuivEXT((unsigned int) GLuint program, (unsigned int) GLenum target, (unsigned int) GLuint index, GLuint* params);
    /// ```
    public void GetNamedProgramLocalParameterIuivEXT(int program, int target, int index, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedProgramLocalParameterIuivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetNamedProgramLocalParameterIuivEXT");
        try { Handles.MH_glGetNamedProgramLocalParameterIuivEXT.invokeExact(handles.PFN_glGetNamedProgramLocalParameterIuivEXT, program, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedProgramLocalParameterIuivEXT", e); }
    }

    /// ```
    /// void glEnableClientStateiEXT((unsigned int) GLenum array, (unsigned int) GLuint index);
    /// ```
    public void EnableClientStateiEXT(int array, int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEnableClientStateiEXT)) throw new GLSymbolNotFoundError("Symbol not found: glEnableClientStateiEXT");
        try { Handles.MH_glEnableClientStateiEXT.invokeExact(handles.PFN_glEnableClientStateiEXT, array, index); }
        catch (Throwable e) { throw new RuntimeException("error in EnableClientStateiEXT", e); }
    }

    /// ```
    /// void glDisableClientStateiEXT((unsigned int) GLenum array, (unsigned int) GLuint index);
    /// ```
    public void DisableClientStateiEXT(int array, int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDisableClientStateiEXT)) throw new GLSymbolNotFoundError("Symbol not found: glDisableClientStateiEXT");
        try { Handles.MH_glDisableClientStateiEXT.invokeExact(handles.PFN_glDisableClientStateiEXT, array, index); }
        catch (Throwable e) { throw new RuntimeException("error in DisableClientStateiEXT", e); }
    }

    /// ```
    /// void glGetFloati_vEXT((unsigned int) GLenum pname, (unsigned int) GLuint index, GLfloat* params);
    /// ```
    public void GetFloati_vEXT(int pname, int index, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFloati_vEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetFloati_vEXT");
        try { Handles.MH_glGetFloati_vEXT.invokeExact(handles.PFN_glGetFloati_vEXT, pname, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetFloati_vEXT", e); }
    }

    /// ```
    /// void glGetDoublei_vEXT((unsigned int) GLenum pname, (unsigned int) GLuint index, GLdouble* params);
    /// ```
    public void GetDoublei_vEXT(int pname, int index, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetDoublei_vEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetDoublei_vEXT");
        try { Handles.MH_glGetDoublei_vEXT.invokeExact(handles.PFN_glGetDoublei_vEXT, pname, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetDoublei_vEXT", e); }
    }

    /// ```
    /// void glGetPointeri_vEXT((unsigned int) GLenum pname, (unsigned int) GLuint index, void** params);
    /// ```
    public void GetPointeri_vEXT(int pname, int index, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetPointeri_vEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetPointeri_vEXT");
        try { Handles.MH_glGetPointeri_vEXT.invokeExact(handles.PFN_glGetPointeri_vEXT, pname, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetPointeri_vEXT", e); }
    }

    /// ```
    /// void glNamedProgramStringEXT((unsigned int) GLuint program, (unsigned int) GLenum target, (unsigned int) GLenum format, (int) GLsizei len, const void* string);
    /// ```
    public void NamedProgramStringEXT(int program, int target, int format, int len, MemorySegment string) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedProgramStringEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedProgramStringEXT");
        try { Handles.MH_glNamedProgramStringEXT.invokeExact(handles.PFN_glNamedProgramStringEXT, program, target, format, len, string); }
        catch (Throwable e) { throw new RuntimeException("error in NamedProgramStringEXT", e); }
    }

    /// ```
    /// void glNamedProgramLocalParameter4dEXT((unsigned int) GLuint program, (unsigned int) GLenum target, (unsigned int) GLuint index, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z, (double) GLdouble w);
    /// ```
    public void NamedProgramLocalParameter4dEXT(int program, int target, int index, double x, double y, double z, double w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedProgramLocalParameter4dEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedProgramLocalParameter4dEXT");
        try { Handles.MH_glNamedProgramLocalParameter4dEXT.invokeExact(handles.PFN_glNamedProgramLocalParameter4dEXT, program, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in NamedProgramLocalParameter4dEXT", e); }
    }

    /// ```
    /// void glNamedProgramLocalParameter4dvEXT((unsigned int) GLuint program, (unsigned int) GLenum target, (unsigned int) GLuint index, const GLdouble* params);
    /// ```
    public void NamedProgramLocalParameter4dvEXT(int program, int target, int index, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedProgramLocalParameter4dvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedProgramLocalParameter4dvEXT");
        try { Handles.MH_glNamedProgramLocalParameter4dvEXT.invokeExact(handles.PFN_glNamedProgramLocalParameter4dvEXT, program, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in NamedProgramLocalParameter4dvEXT", e); }
    }

    /// ```
    /// void glNamedProgramLocalParameter4fEXT((unsigned int) GLuint program, (unsigned int) GLenum target, (unsigned int) GLuint index, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z, ((float) khronos_float_t) GLfloat w);
    /// ```
    public void NamedProgramLocalParameter4fEXT(int program, int target, int index, float x, float y, float z, float w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedProgramLocalParameter4fEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedProgramLocalParameter4fEXT");
        try { Handles.MH_glNamedProgramLocalParameter4fEXT.invokeExact(handles.PFN_glNamedProgramLocalParameter4fEXT, program, target, index, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in NamedProgramLocalParameter4fEXT", e); }
    }

    /// ```
    /// void glNamedProgramLocalParameter4fvEXT((unsigned int) GLuint program, (unsigned int) GLenum target, (unsigned int) GLuint index, const GLfloat* params);
    /// ```
    public void NamedProgramLocalParameter4fvEXT(int program, int target, int index, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedProgramLocalParameter4fvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedProgramLocalParameter4fvEXT");
        try { Handles.MH_glNamedProgramLocalParameter4fvEXT.invokeExact(handles.PFN_glNamedProgramLocalParameter4fvEXT, program, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in NamedProgramLocalParameter4fvEXT", e); }
    }

    /// ```
    /// void glGetNamedProgramLocalParameterdvEXT((unsigned int) GLuint program, (unsigned int) GLenum target, (unsigned int) GLuint index, GLdouble* params);
    /// ```
    public void GetNamedProgramLocalParameterdvEXT(int program, int target, int index, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedProgramLocalParameterdvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetNamedProgramLocalParameterdvEXT");
        try { Handles.MH_glGetNamedProgramLocalParameterdvEXT.invokeExact(handles.PFN_glGetNamedProgramLocalParameterdvEXT, program, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedProgramLocalParameterdvEXT", e); }
    }

    /// ```
    /// void glGetNamedProgramLocalParameterfvEXT((unsigned int) GLuint program, (unsigned int) GLenum target, (unsigned int) GLuint index, GLfloat* params);
    /// ```
    public void GetNamedProgramLocalParameterfvEXT(int program, int target, int index, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedProgramLocalParameterfvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetNamedProgramLocalParameterfvEXT");
        try { Handles.MH_glGetNamedProgramLocalParameterfvEXT.invokeExact(handles.PFN_glGetNamedProgramLocalParameterfvEXT, program, target, index, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedProgramLocalParameterfvEXT", e); }
    }

    /// ```
    /// void glGetNamedProgramivEXT((unsigned int) GLuint program, (unsigned int) GLenum target, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetNamedProgramivEXT(int program, int target, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedProgramivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetNamedProgramivEXT");
        try { Handles.MH_glGetNamedProgramivEXT.invokeExact(handles.PFN_glGetNamedProgramivEXT, program, target, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedProgramivEXT", e); }
    }

    /// ```
    /// void glGetNamedProgramStringEXT((unsigned int) GLuint program, (unsigned int) GLenum target, (unsigned int) GLenum pname, void* string);
    /// ```
    public void GetNamedProgramStringEXT(int program, int target, int pname, MemorySegment string) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedProgramStringEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetNamedProgramStringEXT");
        try { Handles.MH_glGetNamedProgramStringEXT.invokeExact(handles.PFN_glGetNamedProgramStringEXT, program, target, pname, string); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedProgramStringEXT", e); }
    }

    /// ```
    /// void glNamedRenderbufferStorageEXT((unsigned int) GLuint renderbuffer, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void NamedRenderbufferStorageEXT(int renderbuffer, int internalformat, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedRenderbufferStorageEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedRenderbufferStorageEXT");
        try { Handles.MH_glNamedRenderbufferStorageEXT.invokeExact(handles.PFN_glNamedRenderbufferStorageEXT, renderbuffer, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in NamedRenderbufferStorageEXT", e); }
    }

    /// ```
    /// void glGetNamedRenderbufferParameterivEXT((unsigned int) GLuint renderbuffer, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetNamedRenderbufferParameterivEXT(int renderbuffer, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedRenderbufferParameterivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetNamedRenderbufferParameterivEXT");
        try { Handles.MH_glGetNamedRenderbufferParameterivEXT.invokeExact(handles.PFN_glGetNamedRenderbufferParameterivEXT, renderbuffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedRenderbufferParameterivEXT", e); }
    }

    /// ```
    /// void glNamedRenderbufferStorageMultisampleEXT((unsigned int) GLuint renderbuffer, (int) GLsizei samples, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void NamedRenderbufferStorageMultisampleEXT(int renderbuffer, int samples, int internalformat, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedRenderbufferStorageMultisampleEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedRenderbufferStorageMultisampleEXT");
        try { Handles.MH_glNamedRenderbufferStorageMultisampleEXT.invokeExact(handles.PFN_glNamedRenderbufferStorageMultisampleEXT, renderbuffer, samples, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in NamedRenderbufferStorageMultisampleEXT", e); }
    }

    /// ```
    /// void glNamedRenderbufferStorageMultisampleCoverageEXT((unsigned int) GLuint renderbuffer, (int) GLsizei coverageSamples, (int) GLsizei colorSamples, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void NamedRenderbufferStorageMultisampleCoverageEXT(int renderbuffer, int coverageSamples, int colorSamples, int internalformat, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedRenderbufferStorageMultisampleCoverageEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedRenderbufferStorageMultisampleCoverageEXT");
        try { Handles.MH_glNamedRenderbufferStorageMultisampleCoverageEXT.invokeExact(handles.PFN_glNamedRenderbufferStorageMultisampleCoverageEXT, renderbuffer, coverageSamples, colorSamples, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in NamedRenderbufferStorageMultisampleCoverageEXT", e); }
    }

    /// ```
    /// (unsigned int) GLenum glCheckNamedFramebufferStatusEXT((unsigned int) GLuint framebuffer, (unsigned int) GLenum target);
    /// ```
    public int CheckNamedFramebufferStatusEXT(int framebuffer, int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCheckNamedFramebufferStatusEXT)) throw new GLSymbolNotFoundError("Symbol not found: glCheckNamedFramebufferStatusEXT");
        try { return (int) Handles.MH_glCheckNamedFramebufferStatusEXT.invokeExact(handles.PFN_glCheckNamedFramebufferStatusEXT, framebuffer, target); }
        catch (Throwable e) { throw new RuntimeException("error in CheckNamedFramebufferStatusEXT", e); }
    }

    /// ```
    /// void glNamedFramebufferTexture1DEXT((unsigned int) GLuint framebuffer, (unsigned int) GLenum attachment, (unsigned int) GLenum textarget, (unsigned int) GLuint texture, (int) GLint level);
    /// ```
    public void NamedFramebufferTexture1DEXT(int framebuffer, int attachment, int textarget, int texture, int level) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedFramebufferTexture1DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedFramebufferTexture1DEXT");
        try { Handles.MH_glNamedFramebufferTexture1DEXT.invokeExact(handles.PFN_glNamedFramebufferTexture1DEXT, framebuffer, attachment, textarget, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in NamedFramebufferTexture1DEXT", e); }
    }

    /// ```
    /// void glNamedFramebufferTexture2DEXT((unsigned int) GLuint framebuffer, (unsigned int) GLenum attachment, (unsigned int) GLenum textarget, (unsigned int) GLuint texture, (int) GLint level);
    /// ```
    public void NamedFramebufferTexture2DEXT(int framebuffer, int attachment, int textarget, int texture, int level) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedFramebufferTexture2DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedFramebufferTexture2DEXT");
        try { Handles.MH_glNamedFramebufferTexture2DEXT.invokeExact(handles.PFN_glNamedFramebufferTexture2DEXT, framebuffer, attachment, textarget, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in NamedFramebufferTexture2DEXT", e); }
    }

    /// ```
    /// void glNamedFramebufferTexture3DEXT((unsigned int) GLuint framebuffer, (unsigned int) GLenum attachment, (unsigned int) GLenum textarget, (unsigned int) GLuint texture, (int) GLint level, (int) GLint zoffset);
    /// ```
    public void NamedFramebufferTexture3DEXT(int framebuffer, int attachment, int textarget, int texture, int level, int zoffset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedFramebufferTexture3DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedFramebufferTexture3DEXT");
        try { Handles.MH_glNamedFramebufferTexture3DEXT.invokeExact(handles.PFN_glNamedFramebufferTexture3DEXT, framebuffer, attachment, textarget, texture, level, zoffset); }
        catch (Throwable e) { throw new RuntimeException("error in NamedFramebufferTexture3DEXT", e); }
    }

    /// ```
    /// void glNamedFramebufferRenderbufferEXT((unsigned int) GLuint framebuffer, (unsigned int) GLenum attachment, (unsigned int) GLenum renderbuffertarget, (unsigned int) GLuint renderbuffer);
    /// ```
    public void NamedFramebufferRenderbufferEXT(int framebuffer, int attachment, int renderbuffertarget, int renderbuffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedFramebufferRenderbufferEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedFramebufferRenderbufferEXT");
        try { Handles.MH_glNamedFramebufferRenderbufferEXT.invokeExact(handles.PFN_glNamedFramebufferRenderbufferEXT, framebuffer, attachment, renderbuffertarget, renderbuffer); }
        catch (Throwable e) { throw new RuntimeException("error in NamedFramebufferRenderbufferEXT", e); }
    }

    /// ```
    /// void glGetNamedFramebufferAttachmentParameterivEXT((unsigned int) GLuint framebuffer, (unsigned int) GLenum attachment, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetNamedFramebufferAttachmentParameterivEXT(int framebuffer, int attachment, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedFramebufferAttachmentParameterivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetNamedFramebufferAttachmentParameterivEXT");
        try { Handles.MH_glGetNamedFramebufferAttachmentParameterivEXT.invokeExact(handles.PFN_glGetNamedFramebufferAttachmentParameterivEXT, framebuffer, attachment, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedFramebufferAttachmentParameterivEXT", e); }
    }

    /// ```
    /// void glGenerateTextureMipmapEXT((unsigned int) GLuint texture, (unsigned int) GLenum target);
    /// ```
    public void GenerateTextureMipmapEXT(int texture, int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenerateTextureMipmapEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGenerateTextureMipmapEXT");
        try { Handles.MH_glGenerateTextureMipmapEXT.invokeExact(handles.PFN_glGenerateTextureMipmapEXT, texture, target); }
        catch (Throwable e) { throw new RuntimeException("error in GenerateTextureMipmapEXT", e); }
    }

    /// ```
    /// void glGenerateMultiTexMipmapEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target);
    /// ```
    public void GenerateMultiTexMipmapEXT(int texunit, int target) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGenerateMultiTexMipmapEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGenerateMultiTexMipmapEXT");
        try { Handles.MH_glGenerateMultiTexMipmapEXT.invokeExact(handles.PFN_glGenerateMultiTexMipmapEXT, texunit, target); }
        catch (Throwable e) { throw new RuntimeException("error in GenerateMultiTexMipmapEXT", e); }
    }

    /// ```
    /// void glFramebufferDrawBufferEXT((unsigned int) GLuint framebuffer, (unsigned int) GLenum mode);
    /// ```
    public void FramebufferDrawBufferEXT(int framebuffer, int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferDrawBufferEXT)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferDrawBufferEXT");
        try { Handles.MH_glFramebufferDrawBufferEXT.invokeExact(handles.PFN_glFramebufferDrawBufferEXT, framebuffer, mode); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferDrawBufferEXT", e); }
    }

    /// ```
    /// void glFramebufferDrawBuffersEXT((unsigned int) GLuint framebuffer, (int) GLsizei n, const GLenum* bufs);
    /// ```
    public void FramebufferDrawBuffersEXT(int framebuffer, int n, MemorySegment bufs) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferDrawBuffersEXT)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferDrawBuffersEXT");
        try { Handles.MH_glFramebufferDrawBuffersEXT.invokeExact(handles.PFN_glFramebufferDrawBuffersEXT, framebuffer, n, bufs); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferDrawBuffersEXT", e); }
    }

    /// ```
    /// void glFramebufferReadBufferEXT((unsigned int) GLuint framebuffer, (unsigned int) GLenum mode);
    /// ```
    public void FramebufferReadBufferEXT(int framebuffer, int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferReadBufferEXT)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferReadBufferEXT");
        try { Handles.MH_glFramebufferReadBufferEXT.invokeExact(handles.PFN_glFramebufferReadBufferEXT, framebuffer, mode); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferReadBufferEXT", e); }
    }

    /// ```
    /// void glGetFramebufferParameterivEXT((unsigned int) GLuint framebuffer, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetFramebufferParameterivEXT(int framebuffer, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetFramebufferParameterivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetFramebufferParameterivEXT");
        try { Handles.MH_glGetFramebufferParameterivEXT.invokeExact(handles.PFN_glGetFramebufferParameterivEXT, framebuffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetFramebufferParameterivEXT", e); }
    }

    /// ```
    /// void glNamedCopyBufferSubDataEXT((unsigned int) GLuint readBuffer, (unsigned int) GLuint writeBuffer, ((signed long long) khronos_intptr_t) GLintptr readOffset, ((signed long long) khronos_intptr_t) GLintptr writeOffset, ((signed long long) khronos_ssize_t) GLsizeiptr size);
    /// ```
    public void NamedCopyBufferSubDataEXT(int readBuffer, int writeBuffer, long readOffset, long writeOffset, long size) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedCopyBufferSubDataEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedCopyBufferSubDataEXT");
        try { Handles.MH_glNamedCopyBufferSubDataEXT.invokeExact(handles.PFN_glNamedCopyBufferSubDataEXT, readBuffer, writeBuffer, readOffset, writeOffset, size); }
        catch (Throwable e) { throw new RuntimeException("error in NamedCopyBufferSubDataEXT", e); }
    }

    /// ```
    /// void glNamedFramebufferTextureEXT((unsigned int) GLuint framebuffer, (unsigned int) GLenum attachment, (unsigned int) GLuint texture, (int) GLint level);
    /// ```
    public void NamedFramebufferTextureEXT(int framebuffer, int attachment, int texture, int level) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedFramebufferTextureEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedFramebufferTextureEXT");
        try { Handles.MH_glNamedFramebufferTextureEXT.invokeExact(handles.PFN_glNamedFramebufferTextureEXT, framebuffer, attachment, texture, level); }
        catch (Throwable e) { throw new RuntimeException("error in NamedFramebufferTextureEXT", e); }
    }

    /// ```
    /// void glNamedFramebufferTextureLayerEXT((unsigned int) GLuint framebuffer, (unsigned int) GLenum attachment, (unsigned int) GLuint texture, (int) GLint level, (int) GLint layer);
    /// ```
    public void NamedFramebufferTextureLayerEXT(int framebuffer, int attachment, int texture, int level, int layer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedFramebufferTextureLayerEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedFramebufferTextureLayerEXT");
        try { Handles.MH_glNamedFramebufferTextureLayerEXT.invokeExact(handles.PFN_glNamedFramebufferTextureLayerEXT, framebuffer, attachment, texture, level, layer); }
        catch (Throwable e) { throw new RuntimeException("error in NamedFramebufferTextureLayerEXT", e); }
    }

    /// ```
    /// void glNamedFramebufferTextureFaceEXT((unsigned int) GLuint framebuffer, (unsigned int) GLenum attachment, (unsigned int) GLuint texture, (int) GLint level, (unsigned int) GLenum face);
    /// ```
    public void NamedFramebufferTextureFaceEXT(int framebuffer, int attachment, int texture, int level, int face) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedFramebufferTextureFaceEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedFramebufferTextureFaceEXT");
        try { Handles.MH_glNamedFramebufferTextureFaceEXT.invokeExact(handles.PFN_glNamedFramebufferTextureFaceEXT, framebuffer, attachment, texture, level, face); }
        catch (Throwable e) { throw new RuntimeException("error in NamedFramebufferTextureFaceEXT", e); }
    }

    /// ```
    /// void glTextureRenderbufferEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (unsigned int) GLuint renderbuffer);
    /// ```
    public void TextureRenderbufferEXT(int texture, int target, int renderbuffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureRenderbufferEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureRenderbufferEXT");
        try { Handles.MH_glTextureRenderbufferEXT.invokeExact(handles.PFN_glTextureRenderbufferEXT, texture, target, renderbuffer); }
        catch (Throwable e) { throw new RuntimeException("error in TextureRenderbufferEXT", e); }
    }

    /// ```
    /// void glMultiTexRenderbufferEXT((unsigned int) GLenum texunit, (unsigned int) GLenum target, (unsigned int) GLuint renderbuffer);
    /// ```
    public void MultiTexRenderbufferEXT(int texunit, int target, int renderbuffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMultiTexRenderbufferEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMultiTexRenderbufferEXT");
        try { Handles.MH_glMultiTexRenderbufferEXT.invokeExact(handles.PFN_glMultiTexRenderbufferEXT, texunit, target, renderbuffer); }
        catch (Throwable e) { throw new RuntimeException("error in MultiTexRenderbufferEXT", e); }
    }

    /// ```
    /// void glVertexArrayVertexOffsetEXT((unsigned int) GLuint vaobj, (unsigned int) GLuint buffer, (int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride, ((signed long long) khronos_intptr_t) GLintptr offset);
    /// ```
    public void VertexArrayVertexOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayVertexOffsetEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayVertexOffsetEXT");
        try { Handles.MH_glVertexArrayVertexOffsetEXT.invokeExact(handles.PFN_glVertexArrayVertexOffsetEXT, vaobj, buffer, size, type, stride, offset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayVertexOffsetEXT", e); }
    }

    /// ```
    /// void glVertexArrayColorOffsetEXT((unsigned int) GLuint vaobj, (unsigned int) GLuint buffer, (int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride, ((signed long long) khronos_intptr_t) GLintptr offset);
    /// ```
    public void VertexArrayColorOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayColorOffsetEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayColorOffsetEXT");
        try { Handles.MH_glVertexArrayColorOffsetEXT.invokeExact(handles.PFN_glVertexArrayColorOffsetEXT, vaobj, buffer, size, type, stride, offset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayColorOffsetEXT", e); }
    }

    /// ```
    /// void glVertexArrayEdgeFlagOffsetEXT((unsigned int) GLuint vaobj, (unsigned int) GLuint buffer, (int) GLsizei stride, ((signed long long) khronos_intptr_t) GLintptr offset);
    /// ```
    public void VertexArrayEdgeFlagOffsetEXT(int vaobj, int buffer, int stride, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayEdgeFlagOffsetEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayEdgeFlagOffsetEXT");
        try { Handles.MH_glVertexArrayEdgeFlagOffsetEXT.invokeExact(handles.PFN_glVertexArrayEdgeFlagOffsetEXT, vaobj, buffer, stride, offset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayEdgeFlagOffsetEXT", e); }
    }

    /// ```
    /// void glVertexArrayIndexOffsetEXT((unsigned int) GLuint vaobj, (unsigned int) GLuint buffer, (unsigned int) GLenum type, (int) GLsizei stride, ((signed long long) khronos_intptr_t) GLintptr offset);
    /// ```
    public void VertexArrayIndexOffsetEXT(int vaobj, int buffer, int type, int stride, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayIndexOffsetEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayIndexOffsetEXT");
        try { Handles.MH_glVertexArrayIndexOffsetEXT.invokeExact(handles.PFN_glVertexArrayIndexOffsetEXT, vaobj, buffer, type, stride, offset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayIndexOffsetEXT", e); }
    }

    /// ```
    /// void glVertexArrayNormalOffsetEXT((unsigned int) GLuint vaobj, (unsigned int) GLuint buffer, (unsigned int) GLenum type, (int) GLsizei stride, ((signed long long) khronos_intptr_t) GLintptr offset);
    /// ```
    public void VertexArrayNormalOffsetEXT(int vaobj, int buffer, int type, int stride, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayNormalOffsetEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayNormalOffsetEXT");
        try { Handles.MH_glVertexArrayNormalOffsetEXT.invokeExact(handles.PFN_glVertexArrayNormalOffsetEXT, vaobj, buffer, type, stride, offset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayNormalOffsetEXT", e); }
    }

    /// ```
    /// void glVertexArrayTexCoordOffsetEXT((unsigned int) GLuint vaobj, (unsigned int) GLuint buffer, (int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride, ((signed long long) khronos_intptr_t) GLintptr offset);
    /// ```
    public void VertexArrayTexCoordOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayTexCoordOffsetEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayTexCoordOffsetEXT");
        try { Handles.MH_glVertexArrayTexCoordOffsetEXT.invokeExact(handles.PFN_glVertexArrayTexCoordOffsetEXT, vaobj, buffer, size, type, stride, offset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayTexCoordOffsetEXT", e); }
    }

    /// ```
    /// void glVertexArrayMultiTexCoordOffsetEXT((unsigned int) GLuint vaobj, (unsigned int) GLuint buffer, (unsigned int) GLenum texunit, (int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride, ((signed long long) khronos_intptr_t) GLintptr offset);
    /// ```
    public void VertexArrayMultiTexCoordOffsetEXT(int vaobj, int buffer, int texunit, int size, int type, int stride, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayMultiTexCoordOffsetEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayMultiTexCoordOffsetEXT");
        try { Handles.MH_glVertexArrayMultiTexCoordOffsetEXT.invokeExact(handles.PFN_glVertexArrayMultiTexCoordOffsetEXT, vaobj, buffer, texunit, size, type, stride, offset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayMultiTexCoordOffsetEXT", e); }
    }

    /// ```
    /// void glVertexArrayFogCoordOffsetEXT((unsigned int) GLuint vaobj, (unsigned int) GLuint buffer, (unsigned int) GLenum type, (int) GLsizei stride, ((signed long long) khronos_intptr_t) GLintptr offset);
    /// ```
    public void VertexArrayFogCoordOffsetEXT(int vaobj, int buffer, int type, int stride, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayFogCoordOffsetEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayFogCoordOffsetEXT");
        try { Handles.MH_glVertexArrayFogCoordOffsetEXT.invokeExact(handles.PFN_glVertexArrayFogCoordOffsetEXT, vaobj, buffer, type, stride, offset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayFogCoordOffsetEXT", e); }
    }

    /// ```
    /// void glVertexArraySecondaryColorOffsetEXT((unsigned int) GLuint vaobj, (unsigned int) GLuint buffer, (int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride, ((signed long long) khronos_intptr_t) GLintptr offset);
    /// ```
    public void VertexArraySecondaryColorOffsetEXT(int vaobj, int buffer, int size, int type, int stride, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArraySecondaryColorOffsetEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArraySecondaryColorOffsetEXT");
        try { Handles.MH_glVertexArraySecondaryColorOffsetEXT.invokeExact(handles.PFN_glVertexArraySecondaryColorOffsetEXT, vaobj, buffer, size, type, stride, offset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArraySecondaryColorOffsetEXT", e); }
    }

    /// ```
    /// void glVertexArrayVertexAttribOffsetEXT((unsigned int) GLuint vaobj, (unsigned int) GLuint buffer, (unsigned int) GLuint index, (int) GLint size, (unsigned int) GLenum type, GLboolean normalized, (int) GLsizei stride, ((signed long long) khronos_intptr_t) GLintptr offset);
    /// ```
    public void VertexArrayVertexAttribOffsetEXT(int vaobj, int buffer, int index, int size, int type, boolean normalized, int stride, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayVertexAttribOffsetEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayVertexAttribOffsetEXT");
        try { Handles.MH_glVertexArrayVertexAttribOffsetEXT.invokeExact(handles.PFN_glVertexArrayVertexAttribOffsetEXT, vaobj, buffer, index, size, type, ((normalized) ? (byte)1 : (byte)0), stride, offset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayVertexAttribOffsetEXT", e); }
    }

    /// ```
    /// void glVertexArrayVertexAttribIOffsetEXT((unsigned int) GLuint vaobj, (unsigned int) GLuint buffer, (unsigned int) GLuint index, (int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride, ((signed long long) khronos_intptr_t) GLintptr offset);
    /// ```
    public void VertexArrayVertexAttribIOffsetEXT(int vaobj, int buffer, int index, int size, int type, int stride, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayVertexAttribIOffsetEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayVertexAttribIOffsetEXT");
        try { Handles.MH_glVertexArrayVertexAttribIOffsetEXT.invokeExact(handles.PFN_glVertexArrayVertexAttribIOffsetEXT, vaobj, buffer, index, size, type, stride, offset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayVertexAttribIOffsetEXT", e); }
    }

    /// ```
    /// void glEnableVertexArrayEXT((unsigned int) GLuint vaobj, (unsigned int) GLenum array);
    /// ```
    public void EnableVertexArrayEXT(int vaobj, int array) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEnableVertexArrayEXT)) throw new GLSymbolNotFoundError("Symbol not found: glEnableVertexArrayEXT");
        try { Handles.MH_glEnableVertexArrayEXT.invokeExact(handles.PFN_glEnableVertexArrayEXT, vaobj, array); }
        catch (Throwable e) { throw new RuntimeException("error in EnableVertexArrayEXT", e); }
    }

    /// ```
    /// void glDisableVertexArrayEXT((unsigned int) GLuint vaobj, (unsigned int) GLenum array);
    /// ```
    public void DisableVertexArrayEXT(int vaobj, int array) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDisableVertexArrayEXT)) throw new GLSymbolNotFoundError("Symbol not found: glDisableVertexArrayEXT");
        try { Handles.MH_glDisableVertexArrayEXT.invokeExact(handles.PFN_glDisableVertexArrayEXT, vaobj, array); }
        catch (Throwable e) { throw new RuntimeException("error in DisableVertexArrayEXT", e); }
    }

    /// ```
    /// void glEnableVertexArrayAttribEXT((unsigned int) GLuint vaobj, (unsigned int) GLuint index);
    /// ```
    public void EnableVertexArrayAttribEXT(int vaobj, int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glEnableVertexArrayAttribEXT)) throw new GLSymbolNotFoundError("Symbol not found: glEnableVertexArrayAttribEXT");
        try { Handles.MH_glEnableVertexArrayAttribEXT.invokeExact(handles.PFN_glEnableVertexArrayAttribEXT, vaobj, index); }
        catch (Throwable e) { throw new RuntimeException("error in EnableVertexArrayAttribEXT", e); }
    }

    /// ```
    /// void glDisableVertexArrayAttribEXT((unsigned int) GLuint vaobj, (unsigned int) GLuint index);
    /// ```
    public void DisableVertexArrayAttribEXT(int vaobj, int index) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDisableVertexArrayAttribEXT)) throw new GLSymbolNotFoundError("Symbol not found: glDisableVertexArrayAttribEXT");
        try { Handles.MH_glDisableVertexArrayAttribEXT.invokeExact(handles.PFN_glDisableVertexArrayAttribEXT, vaobj, index); }
        catch (Throwable e) { throw new RuntimeException("error in DisableVertexArrayAttribEXT", e); }
    }

    /// ```
    /// void glGetVertexArrayIntegervEXT((unsigned int) GLuint vaobj, (unsigned int) GLenum pname, GLint* param);
    /// ```
    public void GetVertexArrayIntegervEXT(int vaobj, int pname, MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexArrayIntegervEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexArrayIntegervEXT");
        try { Handles.MH_glGetVertexArrayIntegervEXT.invokeExact(handles.PFN_glGetVertexArrayIntegervEXT, vaobj, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexArrayIntegervEXT", e); }
    }

    /// ```
    /// void glGetVertexArrayPointervEXT((unsigned int) GLuint vaobj, (unsigned int) GLenum pname, void** param);
    /// ```
    public void GetVertexArrayPointervEXT(int vaobj, int pname, MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexArrayPointervEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexArrayPointervEXT");
        try { Handles.MH_glGetVertexArrayPointervEXT.invokeExact(handles.PFN_glGetVertexArrayPointervEXT, vaobj, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexArrayPointervEXT", e); }
    }

    /// ```
    /// void glGetVertexArrayIntegeri_vEXT((unsigned int) GLuint vaobj, (unsigned int) GLuint index, (unsigned int) GLenum pname, GLint* param);
    /// ```
    public void GetVertexArrayIntegeri_vEXT(int vaobj, int index, int pname, MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexArrayIntegeri_vEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexArrayIntegeri_vEXT");
        try { Handles.MH_glGetVertexArrayIntegeri_vEXT.invokeExact(handles.PFN_glGetVertexArrayIntegeri_vEXT, vaobj, index, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexArrayIntegeri_vEXT", e); }
    }

    /// ```
    /// void glGetVertexArrayPointeri_vEXT((unsigned int) GLuint vaobj, (unsigned int) GLuint index, (unsigned int) GLenum pname, void** param);
    /// ```
    public void GetVertexArrayPointeri_vEXT(int vaobj, int index, int pname, MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetVertexArrayPointeri_vEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetVertexArrayPointeri_vEXT");
        try { Handles.MH_glGetVertexArrayPointeri_vEXT.invokeExact(handles.PFN_glGetVertexArrayPointeri_vEXT, vaobj, index, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in GetVertexArrayPointeri_vEXT", e); }
    }

    /// ```
    /// void* glMapNamedBufferRangeEXT((unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr length, (unsigned int) GLbitfield access);
    /// ```
    public MemorySegment MapNamedBufferRangeEXT(int buffer, long offset, long length, int access) {
        if (MemoryUtil.isNullPointer(handles.PFN_glMapNamedBufferRangeEXT)) throw new GLSymbolNotFoundError("Symbol not found: glMapNamedBufferRangeEXT");
        try { return (MemorySegment) Handles.MH_glMapNamedBufferRangeEXT.invokeExact(handles.PFN_glMapNamedBufferRangeEXT, buffer, offset, length, access); }
        catch (Throwable e) { throw new RuntimeException("error in MapNamedBufferRangeEXT", e); }
    }

    /// ```
    /// void glFlushMappedNamedBufferRangeEXT((unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr length);
    /// ```
    public void FlushMappedNamedBufferRangeEXT(int buffer, long offset, long length) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFlushMappedNamedBufferRangeEXT)) throw new GLSymbolNotFoundError("Symbol not found: glFlushMappedNamedBufferRangeEXT");
        try { Handles.MH_glFlushMappedNamedBufferRangeEXT.invokeExact(handles.PFN_glFlushMappedNamedBufferRangeEXT, buffer, offset, length); }
        catch (Throwable e) { throw new RuntimeException("error in FlushMappedNamedBufferRangeEXT", e); }
    }

    /// ```
    /// void glNamedBufferStorageEXT((unsigned int) GLuint buffer, ((signed long long) khronos_ssize_t) GLsizeiptr size, const void* data, (unsigned int) GLbitfield flags);
    /// ```
    public void NamedBufferStorageEXT(int buffer, long size, MemorySegment data, int flags) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedBufferStorageEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedBufferStorageEXT");
        try { Handles.MH_glNamedBufferStorageEXT.invokeExact(handles.PFN_glNamedBufferStorageEXT, buffer, size, data, flags); }
        catch (Throwable e) { throw new RuntimeException("error in NamedBufferStorageEXT", e); }
    }

    /// ```
    /// void glClearNamedBufferDataEXT((unsigned int) GLuint buffer, (unsigned int) GLenum internalformat, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* data);
    /// ```
    public void ClearNamedBufferDataEXT(int buffer, int internalformat, int format, int type, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearNamedBufferDataEXT)) throw new GLSymbolNotFoundError("Symbol not found: glClearNamedBufferDataEXT");
        try { Handles.MH_glClearNamedBufferDataEXT.invokeExact(handles.PFN_glClearNamedBufferDataEXT, buffer, internalformat, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in ClearNamedBufferDataEXT", e); }
    }

    /// ```
    /// void glClearNamedBufferSubDataEXT((unsigned int) GLuint buffer, (unsigned int) GLenum internalformat, ((signed long long) khronos_ssize_t) GLsizeiptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size, (unsigned int) GLenum format, (unsigned int) GLenum type, const void* data);
    /// ```
    public void ClearNamedBufferSubDataEXT(int buffer, int internalformat, long offset, long size, int format, int type, MemorySegment data) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClearNamedBufferSubDataEXT)) throw new GLSymbolNotFoundError("Symbol not found: glClearNamedBufferSubDataEXT");
        try { Handles.MH_glClearNamedBufferSubDataEXT.invokeExact(handles.PFN_glClearNamedBufferSubDataEXT, buffer, internalformat, offset, size, format, type, data); }
        catch (Throwable e) { throw new RuntimeException("error in ClearNamedBufferSubDataEXT", e); }
    }

    /// ```
    /// void glNamedFramebufferParameteriEXT((unsigned int) GLuint framebuffer, (unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void NamedFramebufferParameteriEXT(int framebuffer, int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedFramebufferParameteriEXT)) throw new GLSymbolNotFoundError("Symbol not found: glNamedFramebufferParameteriEXT");
        try { Handles.MH_glNamedFramebufferParameteriEXT.invokeExact(handles.PFN_glNamedFramebufferParameteriEXT, framebuffer, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in NamedFramebufferParameteriEXT", e); }
    }

    /// ```
    /// void glGetNamedFramebufferParameterivEXT((unsigned int) GLuint framebuffer, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetNamedFramebufferParameterivEXT(int framebuffer, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedFramebufferParameterivEXT)) throw new GLSymbolNotFoundError("Symbol not found: glGetNamedFramebufferParameterivEXT");
        try { Handles.MH_glGetNamedFramebufferParameterivEXT.invokeExact(handles.PFN_glGetNamedFramebufferParameterivEXT, framebuffer, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedFramebufferParameterivEXT", e); }
    }

    /// ```
    /// void glProgramUniform1dEXT((unsigned int) GLuint program, (int) GLint location, (double) GLdouble x);
    /// ```
    public void ProgramUniform1dEXT(int program, int location, double x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1dEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform1dEXT");
        try { Handles.MH_glProgramUniform1dEXT.invokeExact(handles.PFN_glProgramUniform1dEXT, program, location, x); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1dEXT", e); }
    }

    /// ```
    /// void glProgramUniform2dEXT((unsigned int) GLuint program, (int) GLint location, (double) GLdouble x, (double) GLdouble y);
    /// ```
    public void ProgramUniform2dEXT(int program, int location, double x, double y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2dEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform2dEXT");
        try { Handles.MH_glProgramUniform2dEXT.invokeExact(handles.PFN_glProgramUniform2dEXT, program, location, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2dEXT", e); }
    }

    /// ```
    /// void glProgramUniform3dEXT((unsigned int) GLuint program, (int) GLint location, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z);
    /// ```
    public void ProgramUniform3dEXT(int program, int location, double x, double y, double z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3dEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform3dEXT");
        try { Handles.MH_glProgramUniform3dEXT.invokeExact(handles.PFN_glProgramUniform3dEXT, program, location, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3dEXT", e); }
    }

    /// ```
    /// void glProgramUniform4dEXT((unsigned int) GLuint program, (int) GLint location, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z, (double) GLdouble w);
    /// ```
    public void ProgramUniform4dEXT(int program, int location, double x, double y, double z, double w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4dEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform4dEXT");
        try { Handles.MH_glProgramUniform4dEXT.invokeExact(handles.PFN_glProgramUniform4dEXT, program, location, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4dEXT", e); }
    }

    /// ```
    /// void glProgramUniform1dvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLdouble* value);
    /// ```
    public void ProgramUniform1dvEXT(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform1dvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform1dvEXT");
        try { Handles.MH_glProgramUniform1dvEXT.invokeExact(handles.PFN_glProgramUniform1dvEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform1dvEXT", e); }
    }

    /// ```
    /// void glProgramUniform2dvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLdouble* value);
    /// ```
    public void ProgramUniform2dvEXT(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform2dvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform2dvEXT");
        try { Handles.MH_glProgramUniform2dvEXT.invokeExact(handles.PFN_glProgramUniform2dvEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform2dvEXT", e); }
    }

    /// ```
    /// void glProgramUniform3dvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLdouble* value);
    /// ```
    public void ProgramUniform3dvEXT(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform3dvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform3dvEXT");
        try { Handles.MH_glProgramUniform3dvEXT.invokeExact(handles.PFN_glProgramUniform3dvEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform3dvEXT", e); }
    }

    /// ```
    /// void glProgramUniform4dvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, const GLdouble* value);
    /// ```
    public void ProgramUniform4dvEXT(int program, int location, int count, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniform4dvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniform4dvEXT");
        try { Handles.MH_glProgramUniform4dvEXT.invokeExact(handles.PFN_glProgramUniform4dvEXT, program, location, count, value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniform4dvEXT", e); }
    }

    /// ```
    /// void glProgramUniformMatrix2dvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void ProgramUniformMatrix2dvEXT(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix2dvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix2dvEXT");
        try { Handles.MH_glProgramUniformMatrix2dvEXT.invokeExact(handles.PFN_glProgramUniformMatrix2dvEXT, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix2dvEXT", e); }
    }

    /// ```
    /// void glProgramUniformMatrix3dvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void ProgramUniformMatrix3dvEXT(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix3dvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix3dvEXT");
        try { Handles.MH_glProgramUniformMatrix3dvEXT.invokeExact(handles.PFN_glProgramUniformMatrix3dvEXT, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix3dvEXT", e); }
    }

    /// ```
    /// void glProgramUniformMatrix4dvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void ProgramUniformMatrix4dvEXT(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix4dvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix4dvEXT");
        try { Handles.MH_glProgramUniformMatrix4dvEXT.invokeExact(handles.PFN_glProgramUniformMatrix4dvEXT, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix4dvEXT", e); }
    }

    /// ```
    /// void glProgramUniformMatrix2x3dvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void ProgramUniformMatrix2x3dvEXT(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix2x3dvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix2x3dvEXT");
        try { Handles.MH_glProgramUniformMatrix2x3dvEXT.invokeExact(handles.PFN_glProgramUniformMatrix2x3dvEXT, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix2x3dvEXT", e); }
    }

    /// ```
    /// void glProgramUniformMatrix2x4dvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void ProgramUniformMatrix2x4dvEXT(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix2x4dvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix2x4dvEXT");
        try { Handles.MH_glProgramUniformMatrix2x4dvEXT.invokeExact(handles.PFN_glProgramUniformMatrix2x4dvEXT, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix2x4dvEXT", e); }
    }

    /// ```
    /// void glProgramUniformMatrix3x2dvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void ProgramUniformMatrix3x2dvEXT(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix3x2dvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix3x2dvEXT");
        try { Handles.MH_glProgramUniformMatrix3x2dvEXT.invokeExact(handles.PFN_glProgramUniformMatrix3x2dvEXT, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix3x2dvEXT", e); }
    }

    /// ```
    /// void glProgramUniformMatrix3x4dvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void ProgramUniformMatrix3x4dvEXT(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix3x4dvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix3x4dvEXT");
        try { Handles.MH_glProgramUniformMatrix3x4dvEXT.invokeExact(handles.PFN_glProgramUniformMatrix3x4dvEXT, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix3x4dvEXT", e); }
    }

    /// ```
    /// void glProgramUniformMatrix4x2dvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void ProgramUniformMatrix4x2dvEXT(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix4x2dvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix4x2dvEXT");
        try { Handles.MH_glProgramUniformMatrix4x2dvEXT.invokeExact(handles.PFN_glProgramUniformMatrix4x2dvEXT, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix4x2dvEXT", e); }
    }

    /// ```
    /// void glProgramUniformMatrix4x3dvEXT((unsigned int) GLuint program, (int) GLint location, (int) GLsizei count, GLboolean transpose, const GLdouble* value);
    /// ```
    public void ProgramUniformMatrix4x3dvEXT(int program, int location, int count, boolean transpose, MemorySegment value) {
        if (MemoryUtil.isNullPointer(handles.PFN_glProgramUniformMatrix4x3dvEXT)) throw new GLSymbolNotFoundError("Symbol not found: glProgramUniformMatrix4x3dvEXT");
        try { Handles.MH_glProgramUniformMatrix4x3dvEXT.invokeExact(handles.PFN_glProgramUniformMatrix4x3dvEXT, program, location, count, ((transpose) ? (byte)1 : (byte)0), value); }
        catch (Throwable e) { throw new RuntimeException("error in ProgramUniformMatrix4x3dvEXT", e); }
    }

    /// ```
    /// void glTextureBufferRangeEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (unsigned int) GLenum internalformat, (unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, ((signed long long) khronos_ssize_t) GLsizeiptr size);
    /// ```
    public void TextureBufferRangeEXT(int texture, int target, int internalformat, int buffer, long offset, long size) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureBufferRangeEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureBufferRangeEXT");
        try { Handles.MH_glTextureBufferRangeEXT.invokeExact(handles.PFN_glTextureBufferRangeEXT, texture, target, internalformat, buffer, offset, size); }
        catch (Throwable e) { throw new RuntimeException("error in TextureBufferRangeEXT", e); }
    }

    /// ```
    /// void glTextureStorage1DEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLsizei levels, (unsigned int) GLenum internalformat, (int) GLsizei width);
    /// ```
    public void TextureStorage1DEXT(int texture, int target, int levels, int internalformat, int width) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorage1DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureStorage1DEXT");
        try { Handles.MH_glTextureStorage1DEXT.invokeExact(handles.PFN_glTextureStorage1DEXT, texture, target, levels, internalformat, width); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorage1DEXT", e); }
    }

    /// ```
    /// void glTextureStorage2DEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLsizei levels, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height);
    /// ```
    public void TextureStorage2DEXT(int texture, int target, int levels, int internalformat, int width, int height) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorage2DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureStorage2DEXT");
        try { Handles.MH_glTextureStorage2DEXT.invokeExact(handles.PFN_glTextureStorage2DEXT, texture, target, levels, internalformat, width, height); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorage2DEXT", e); }
    }

    /// ```
    /// void glTextureStorage3DEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLsizei levels, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth);
    /// ```
    public void TextureStorage3DEXT(int texture, int target, int levels, int internalformat, int width, int height, int depth) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorage3DEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureStorage3DEXT");
        try { Handles.MH_glTextureStorage3DEXT.invokeExact(handles.PFN_glTextureStorage3DEXT, texture, target, levels, internalformat, width, height, depth); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorage3DEXT", e); }
    }

    /// ```
    /// void glTextureStorage2DMultisampleEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLsizei samples, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, GLboolean fixedsamplelocations);
    /// ```
    public void TextureStorage2DMultisampleEXT(int texture, int target, int samples, int internalformat, int width, int height, boolean fixedsamplelocations) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorage2DMultisampleEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureStorage2DMultisampleEXT");
        try { Handles.MH_glTextureStorage2DMultisampleEXT.invokeExact(handles.PFN_glTextureStorage2DMultisampleEXT, texture, target, samples, internalformat, width, height, ((fixedsamplelocations) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorage2DMultisampleEXT", e); }
    }

    /// ```
    /// void glTextureStorage3DMultisampleEXT((unsigned int) GLuint texture, (unsigned int) GLenum target, (int) GLsizei samples, (unsigned int) GLenum internalformat, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, GLboolean fixedsamplelocations);
    /// ```
    public void TextureStorage3DMultisampleEXT(int texture, int target, int samples, int internalformat, int width, int height, int depth, boolean fixedsamplelocations) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTextureStorage3DMultisampleEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTextureStorage3DMultisampleEXT");
        try { Handles.MH_glTextureStorage3DMultisampleEXT.invokeExact(handles.PFN_glTextureStorage3DMultisampleEXT, texture, target, samples, internalformat, width, height, depth, ((fixedsamplelocations) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TextureStorage3DMultisampleEXT", e); }
    }

    /// ```
    /// void glVertexArrayBindVertexBufferEXT((unsigned int) GLuint vaobj, (unsigned int) GLuint bindingindex, (unsigned int) GLuint buffer, ((signed long long) khronos_intptr_t) GLintptr offset, (int) GLsizei stride);
    /// ```
    public void VertexArrayBindVertexBufferEXT(int vaobj, int bindingindex, int buffer, long offset, int stride) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayBindVertexBufferEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayBindVertexBufferEXT");
        try { Handles.MH_glVertexArrayBindVertexBufferEXT.invokeExact(handles.PFN_glVertexArrayBindVertexBufferEXT, vaobj, bindingindex, buffer, offset, stride); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayBindVertexBufferEXT", e); }
    }

    /// ```
    /// void glVertexArrayVertexAttribFormatEXT((unsigned int) GLuint vaobj, (unsigned int) GLuint attribindex, (int) GLint size, (unsigned int) GLenum type, GLboolean normalized, (unsigned int) GLuint relativeoffset);
    /// ```
    public void VertexArrayVertexAttribFormatEXT(int vaobj, int attribindex, int size, int type, boolean normalized, int relativeoffset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayVertexAttribFormatEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayVertexAttribFormatEXT");
        try { Handles.MH_glVertexArrayVertexAttribFormatEXT.invokeExact(handles.PFN_glVertexArrayVertexAttribFormatEXT, vaobj, attribindex, size, type, ((normalized) ? (byte)1 : (byte)0), relativeoffset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayVertexAttribFormatEXT", e); }
    }

    /// ```
    /// void glVertexArrayVertexAttribIFormatEXT((unsigned int) GLuint vaobj, (unsigned int) GLuint attribindex, (int) GLint size, (unsigned int) GLenum type, (unsigned int) GLuint relativeoffset);
    /// ```
    public void VertexArrayVertexAttribIFormatEXT(int vaobj, int attribindex, int size, int type, int relativeoffset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayVertexAttribIFormatEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayVertexAttribIFormatEXT");
        try { Handles.MH_glVertexArrayVertexAttribIFormatEXT.invokeExact(handles.PFN_glVertexArrayVertexAttribIFormatEXT, vaobj, attribindex, size, type, relativeoffset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayVertexAttribIFormatEXT", e); }
    }

    /// ```
    /// void glVertexArrayVertexAttribLFormatEXT((unsigned int) GLuint vaobj, (unsigned int) GLuint attribindex, (int) GLint size, (unsigned int) GLenum type, (unsigned int) GLuint relativeoffset);
    /// ```
    public void VertexArrayVertexAttribLFormatEXT(int vaobj, int attribindex, int size, int type, int relativeoffset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayVertexAttribLFormatEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayVertexAttribLFormatEXT");
        try { Handles.MH_glVertexArrayVertexAttribLFormatEXT.invokeExact(handles.PFN_glVertexArrayVertexAttribLFormatEXT, vaobj, attribindex, size, type, relativeoffset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayVertexAttribLFormatEXT", e); }
    }

    /// ```
    /// void glVertexArrayVertexAttribBindingEXT((unsigned int) GLuint vaobj, (unsigned int) GLuint attribindex, (unsigned int) GLuint bindingindex);
    /// ```
    public void VertexArrayVertexAttribBindingEXT(int vaobj, int attribindex, int bindingindex) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayVertexAttribBindingEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayVertexAttribBindingEXT");
        try { Handles.MH_glVertexArrayVertexAttribBindingEXT.invokeExact(handles.PFN_glVertexArrayVertexAttribBindingEXT, vaobj, attribindex, bindingindex); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayVertexAttribBindingEXT", e); }
    }

    /// ```
    /// void glVertexArrayVertexBindingDivisorEXT((unsigned int) GLuint vaobj, (unsigned int) GLuint bindingindex, (unsigned int) GLuint divisor);
    /// ```
    public void VertexArrayVertexBindingDivisorEXT(int vaobj, int bindingindex, int divisor) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayVertexBindingDivisorEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayVertexBindingDivisorEXT");
        try { Handles.MH_glVertexArrayVertexBindingDivisorEXT.invokeExact(handles.PFN_glVertexArrayVertexBindingDivisorEXT, vaobj, bindingindex, divisor); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayVertexBindingDivisorEXT", e); }
    }

    /// ```
    /// void glVertexArrayVertexAttribLOffsetEXT((unsigned int) GLuint vaobj, (unsigned int) GLuint buffer, (unsigned int) GLuint index, (int) GLint size, (unsigned int) GLenum type, (int) GLsizei stride, ((signed long long) khronos_intptr_t) GLintptr offset);
    /// ```
    public void VertexArrayVertexAttribLOffsetEXT(int vaobj, int buffer, int index, int size, int type, int stride, long offset) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayVertexAttribLOffsetEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayVertexAttribLOffsetEXT");
        try { Handles.MH_glVertexArrayVertexAttribLOffsetEXT.invokeExact(handles.PFN_glVertexArrayVertexAttribLOffsetEXT, vaobj, buffer, index, size, type, stride, offset); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayVertexAttribLOffsetEXT", e); }
    }

    /// ```
    /// void glTexturePageCommitmentEXT((unsigned int) GLuint texture, (int) GLint level, (int) GLint xoffset, (int) GLint yoffset, (int) GLint zoffset, (int) GLsizei width, (int) GLsizei height, (int) GLsizei depth, GLboolean commit);
    /// ```
    public void TexturePageCommitmentEXT(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, boolean commit) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexturePageCommitmentEXT)) throw new GLSymbolNotFoundError("Symbol not found: glTexturePageCommitmentEXT");
        try { Handles.MH_glTexturePageCommitmentEXT.invokeExact(handles.PFN_glTexturePageCommitmentEXT, texture, level, xoffset, yoffset, zoffset, width, height, depth, ((commit) ? (byte)1 : (byte)0)); }
        catch (Throwable e) { throw new RuntimeException("error in TexturePageCommitmentEXT", e); }
    }

    /// ```
    /// void glVertexArrayVertexAttribDivisorEXT((unsigned int) GLuint vaobj, (unsigned int) GLuint index, (unsigned int) GLuint divisor);
    /// ```
    public void VertexArrayVertexAttribDivisorEXT(int vaobj, int index, int divisor) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexArrayVertexAttribDivisorEXT)) throw new GLSymbolNotFoundError("Symbol not found: glVertexArrayVertexAttribDivisorEXT");
        try { Handles.MH_glVertexArrayVertexAttribDivisorEXT.invokeExact(handles.PFN_glVertexArrayVertexAttribDivisorEXT, vaobj, index, divisor); }
        catch (Throwable e) { throw new RuntimeException("error in VertexArrayVertexAttribDivisorEXT", e); }
    }

}

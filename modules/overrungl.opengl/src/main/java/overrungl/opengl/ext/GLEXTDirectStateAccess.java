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
    public static final MethodHandle MH_glMatrixLoadfEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMatrixLoadfEXT;
    public static final MethodHandle MH_glMatrixLoaddEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMatrixLoaddEXT;
    public static final MethodHandle MH_glMatrixMultfEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMatrixMultfEXT;
    public static final MethodHandle MH_glMatrixMultdEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMatrixMultdEXT;
    public static final MethodHandle MH_glMatrixLoadIdentityEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMatrixLoadIdentityEXT;
    public static final MethodHandle MH_glMatrixRotatefEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glMatrixRotatefEXT;
    public static final MethodHandle MH_glMatrixRotatedEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glMatrixRotatedEXT;
    public static final MethodHandle MH_glMatrixScalefEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glMatrixScalefEXT;
    public static final MethodHandle MH_glMatrixScaledEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glMatrixScaledEXT;
    public static final MethodHandle MH_glMatrixTranslatefEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glMatrixTranslatefEXT;
    public static final MethodHandle MH_glMatrixTranslatedEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glMatrixTranslatedEXT;
    public static final MethodHandle MH_glMatrixFrustumEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glMatrixFrustumEXT;
    public static final MethodHandle MH_glMatrixOrthoEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glMatrixOrthoEXT;
    public static final MethodHandle MH_glMatrixPopEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMatrixPopEXT;
    public static final MethodHandle MH_glMatrixPushEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMatrixPushEXT;
    public static final MethodHandle MH_glClientAttribDefaultEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glClientAttribDefaultEXT;
    public static final MethodHandle MH_glPushClientAttribDefaultEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glPushClientAttribDefaultEXT;
    public static final MethodHandle MH_glTextureParameterfEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glTextureParameterfEXT;
    public static final MethodHandle MH_glTextureParameterfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTextureParameterfvEXT;
    public static final MethodHandle MH_glTextureParameteriEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTextureParameteriEXT;
    public static final MethodHandle MH_glTextureParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTextureParameterivEXT;
    public static final MethodHandle MH_glTextureImage1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTextureImage1DEXT;
    public static final MethodHandle MH_glTextureImage2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTextureImage2DEXT;
    public static final MethodHandle MH_glTextureSubImage1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTextureSubImage1DEXT;
    public static final MethodHandle MH_glTextureSubImage2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTextureSubImage2DEXT;
    public static final MethodHandle MH_glCopyTextureImage1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCopyTextureImage1DEXT;
    public static final MethodHandle MH_glCopyTextureImage2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCopyTextureImage2DEXT;
    public static final MethodHandle MH_glCopyTextureSubImage1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCopyTextureSubImage1DEXT;
    public static final MethodHandle MH_glCopyTextureSubImage2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCopyTextureSubImage2DEXT;
    public static final MethodHandle MH_glGetTextureImageEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTextureImageEXT;
    public static final MethodHandle MH_glGetTextureParameterfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTextureParameterfvEXT;
    public static final MethodHandle MH_glGetTextureParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTextureParameterivEXT;
    public static final MethodHandle MH_glGetTextureLevelParameterfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTextureLevelParameterfvEXT;
    public static final MethodHandle MH_glGetTextureLevelParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTextureLevelParameterivEXT;
    public static final MethodHandle MH_glTextureImage3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTextureImage3DEXT;
    public static final MethodHandle MH_glTextureSubImage3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTextureSubImage3DEXT;
    public static final MethodHandle MH_glCopyTextureSubImage3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCopyTextureSubImage3DEXT;
    public static final MethodHandle MH_glBindMultiTextureEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glBindMultiTextureEXT;
    public static final MethodHandle MH_glMultiTexCoordPointerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiTexCoordPointerEXT;
    public static final MethodHandle MH_glMultiTexEnvfEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glMultiTexEnvfEXT;
    public static final MethodHandle MH_glMultiTexEnvfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiTexEnvfvEXT;
    public static final MethodHandle MH_glMultiTexEnviEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMultiTexEnviEXT;
    public static final MethodHandle MH_glMultiTexEnvivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiTexEnvivEXT;
    public static final MethodHandle MH_glMultiTexGendEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glMultiTexGendEXT;
    public static final MethodHandle MH_glMultiTexGendvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiTexGendvEXT;
    public static final MethodHandle MH_glMultiTexGenfEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glMultiTexGenfEXT;
    public static final MethodHandle MH_glMultiTexGenfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiTexGenfvEXT;
    public static final MethodHandle MH_glMultiTexGeniEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMultiTexGeniEXT;
    public static final MethodHandle MH_glMultiTexGenivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiTexGenivEXT;
    public static final MethodHandle MH_glGetMultiTexEnvfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetMultiTexEnvfvEXT;
    public static final MethodHandle MH_glGetMultiTexEnvivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetMultiTexEnvivEXT;
    public static final MethodHandle MH_glGetMultiTexGendvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetMultiTexGendvEXT;
    public static final MethodHandle MH_glGetMultiTexGenfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetMultiTexGenfvEXT;
    public static final MethodHandle MH_glGetMultiTexGenivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetMultiTexGenivEXT;
    public static final MethodHandle MH_glMultiTexParameteriEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMultiTexParameteriEXT;
    public static final MethodHandle MH_glMultiTexParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiTexParameterivEXT;
    public static final MethodHandle MH_glMultiTexParameterfEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glMultiTexParameterfEXT;
    public static final MethodHandle MH_glMultiTexParameterfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiTexParameterfvEXT;
    public static final MethodHandle MH_glMultiTexImage1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiTexImage1DEXT;
    public static final MethodHandle MH_glMultiTexImage2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiTexImage2DEXT;
    public static final MethodHandle MH_glMultiTexSubImage1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiTexSubImage1DEXT;
    public static final MethodHandle MH_glMultiTexSubImage2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiTexSubImage2DEXT;
    public static final MethodHandle MH_glCopyMultiTexImage1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCopyMultiTexImage1DEXT;
    public static final MethodHandle MH_glCopyMultiTexImage2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCopyMultiTexImage2DEXT;
    public static final MethodHandle MH_glCopyMultiTexSubImage1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCopyMultiTexSubImage1DEXT;
    public static final MethodHandle MH_glCopyMultiTexSubImage2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCopyMultiTexSubImage2DEXT;
    public static final MethodHandle MH_glGetMultiTexImageEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetMultiTexImageEXT;
    public static final MethodHandle MH_glGetMultiTexParameterfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetMultiTexParameterfvEXT;
    public static final MethodHandle MH_glGetMultiTexParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetMultiTexParameterivEXT;
    public static final MethodHandle MH_glGetMultiTexLevelParameterfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetMultiTexLevelParameterfvEXT;
    public static final MethodHandle MH_glGetMultiTexLevelParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetMultiTexLevelParameterivEXT;
    public static final MethodHandle MH_glMultiTexImage3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiTexImage3DEXT;
    public static final MethodHandle MH_glMultiTexSubImage3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiTexSubImage3DEXT;
    public static final MethodHandle MH_glCopyMultiTexSubImage3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCopyMultiTexSubImage3DEXT;
    public static final MethodHandle MH_glEnableClientStateIndexedEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glEnableClientStateIndexedEXT;
    public static final MethodHandle MH_glDisableClientStateIndexedEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDisableClientStateIndexedEXT;
    public static final MethodHandle MH_glGetFloatIndexedvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetFloatIndexedvEXT;
    public static final MethodHandle MH_glGetDoubleIndexedvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetDoubleIndexedvEXT;
    public static final MethodHandle MH_glGetPointerIndexedvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetPointerIndexedvEXT;
    public static final MethodHandle MH_glEnableIndexedEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glEnableIndexedEXT;
    public static final MethodHandle MH_glDisableIndexedEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDisableIndexedEXT;
    public static final MethodHandle MH_glIsEnabledIndexedEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIsEnabledIndexedEXT;
    public static final MethodHandle MH_glGetIntegerIndexedvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetIntegerIndexedvEXT;
    public static final MethodHandle MH_glGetBooleanIndexedvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetBooleanIndexedvEXT;
    public static final MethodHandle MH_glCompressedTextureImage3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCompressedTextureImage3DEXT;
    public static final MethodHandle MH_glCompressedTextureImage2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCompressedTextureImage2DEXT;
    public static final MethodHandle MH_glCompressedTextureImage1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCompressedTextureImage1DEXT;
    public static final MethodHandle MH_glCompressedTextureSubImage3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCompressedTextureSubImage3DEXT;
    public static final MethodHandle MH_glCompressedTextureSubImage2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCompressedTextureSubImage2DEXT;
    public static final MethodHandle MH_glCompressedTextureSubImage1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCompressedTextureSubImage1DEXT;
    public static final MethodHandle MH_glGetCompressedTextureImageEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetCompressedTextureImageEXT;
    public static final MethodHandle MH_glCompressedMultiTexImage3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCompressedMultiTexImage3DEXT;
    public static final MethodHandle MH_glCompressedMultiTexImage2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCompressedMultiTexImage2DEXT;
    public static final MethodHandle MH_glCompressedMultiTexImage1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCompressedMultiTexImage1DEXT;
    public static final MethodHandle MH_glCompressedMultiTexSubImage3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCompressedMultiTexSubImage3DEXT;
    public static final MethodHandle MH_glCompressedMultiTexSubImage2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCompressedMultiTexSubImage2DEXT;
    public static final MethodHandle MH_glCompressedMultiTexSubImage1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCompressedMultiTexSubImage1DEXT;
    public static final MethodHandle MH_glGetCompressedMultiTexImageEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetCompressedMultiTexImageEXT;
    public static final MethodHandle MH_glMatrixLoadTransposefEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMatrixLoadTransposefEXT;
    public static final MethodHandle MH_glMatrixLoadTransposedEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMatrixLoadTransposedEXT;
    public static final MethodHandle MH_glMatrixMultTransposefEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMatrixMultTransposefEXT;
    public static final MethodHandle MH_glMatrixMultTransposedEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMatrixMultTransposedEXT;
    public static final MethodHandle MH_glNamedBufferDataEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glNamedBufferDataEXT;
    public static final MethodHandle MH_glNamedBufferSubDataEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glNamedBufferSubDataEXT;
    public static final MethodHandle MH_glMapNamedBufferEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMapNamedBufferEXT;
    public static final MethodHandle MH_glUnmapNamedBufferEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glUnmapNamedBufferEXT;
    public static final MethodHandle MH_glGetNamedBufferParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetNamedBufferParameterivEXT;
    public static final MethodHandle MH_glGetNamedBufferPointervEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetNamedBufferPointervEXT;
    public static final MethodHandle MH_glGetNamedBufferSubDataEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetNamedBufferSubDataEXT;
    public static final MethodHandle MH_glProgramUniform1fEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glProgramUniform1fEXT;
    public static final MethodHandle MH_glProgramUniform2fEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glProgramUniform2fEXT;
    public static final MethodHandle MH_glProgramUniform3fEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glProgramUniform3fEXT;
    public static final MethodHandle MH_glProgramUniform4fEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glProgramUniform4fEXT;
    public static final MethodHandle MH_glProgramUniform1iEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramUniform1iEXT;
    public static final MethodHandle MH_glProgramUniform2iEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramUniform2iEXT;
    public static final MethodHandle MH_glProgramUniform3iEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramUniform3iEXT;
    public static final MethodHandle MH_glProgramUniform4iEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramUniform4iEXT;
    public static final MethodHandle MH_glProgramUniform1fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform1fvEXT;
    public static final MethodHandle MH_glProgramUniform2fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform2fvEXT;
    public static final MethodHandle MH_glProgramUniform3fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform3fvEXT;
    public static final MethodHandle MH_glProgramUniform4fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform4fvEXT;
    public static final MethodHandle MH_glProgramUniform1ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform1ivEXT;
    public static final MethodHandle MH_glProgramUniform2ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform2ivEXT;
    public static final MethodHandle MH_glProgramUniform3ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform3ivEXT;
    public static final MethodHandle MH_glProgramUniform4ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform4ivEXT;
    public static final MethodHandle MH_glProgramUniformMatrix2fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix2fvEXT;
    public static final MethodHandle MH_glProgramUniformMatrix3fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix3fvEXT;
    public static final MethodHandle MH_glProgramUniformMatrix4fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix4fvEXT;
    public static final MethodHandle MH_glProgramUniformMatrix2x3fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix2x3fvEXT;
    public static final MethodHandle MH_glProgramUniformMatrix3x2fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix3x2fvEXT;
    public static final MethodHandle MH_glProgramUniformMatrix2x4fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix2x4fvEXT;
    public static final MethodHandle MH_glProgramUniformMatrix4x2fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix4x2fvEXT;
    public static final MethodHandle MH_glProgramUniformMatrix3x4fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix3x4fvEXT;
    public static final MethodHandle MH_glProgramUniformMatrix4x3fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix4x3fvEXT;
    public static final MethodHandle MH_glTextureBufferEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTextureBufferEXT;
    public static final MethodHandle MH_glMultiTexBufferEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMultiTexBufferEXT;
    public static final MethodHandle MH_glTextureParameterIivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTextureParameterIivEXT;
    public static final MethodHandle MH_glTextureParameterIuivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glTextureParameterIuivEXT;
    public static final MethodHandle MH_glGetTextureParameterIivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTextureParameterIivEXT;
    public static final MethodHandle MH_glGetTextureParameterIuivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetTextureParameterIuivEXT;
    public static final MethodHandle MH_glMultiTexParameterIivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiTexParameterIivEXT;
    public static final MethodHandle MH_glMultiTexParameterIuivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glMultiTexParameterIuivEXT;
    public static final MethodHandle MH_glGetMultiTexParameterIivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetMultiTexParameterIivEXT;
    public static final MethodHandle MH_glGetMultiTexParameterIuivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetMultiTexParameterIuivEXT;
    public static final MethodHandle MH_glProgramUniform1uiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramUniform1uiEXT;
    public static final MethodHandle MH_glProgramUniform2uiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramUniform2uiEXT;
    public static final MethodHandle MH_glProgramUniform3uiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramUniform3uiEXT;
    public static final MethodHandle MH_glProgramUniform4uiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glProgramUniform4uiEXT;
    public static final MethodHandle MH_glProgramUniform1uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform1uivEXT;
    public static final MethodHandle MH_glProgramUniform2uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform2uivEXT;
    public static final MethodHandle MH_glProgramUniform3uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform3uivEXT;
    public static final MethodHandle MH_glProgramUniform4uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform4uivEXT;
    public static final MethodHandle MH_glNamedProgramLocalParameters4fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glNamedProgramLocalParameters4fvEXT;
    public static final MethodHandle MH_glNamedProgramLocalParameterI4iEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glNamedProgramLocalParameterI4iEXT;
    public static final MethodHandle MH_glNamedProgramLocalParameterI4ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glNamedProgramLocalParameterI4ivEXT;
    public static final MethodHandle MH_glNamedProgramLocalParametersI4ivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glNamedProgramLocalParametersI4ivEXT;
    public static final MethodHandle MH_glNamedProgramLocalParameterI4uiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glNamedProgramLocalParameterI4uiEXT;
    public static final MethodHandle MH_glNamedProgramLocalParameterI4uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glNamedProgramLocalParameterI4uivEXT;
    public static final MethodHandle MH_glNamedProgramLocalParametersI4uivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glNamedProgramLocalParametersI4uivEXT;
    public static final MethodHandle MH_glGetNamedProgramLocalParameterIivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetNamedProgramLocalParameterIivEXT;
    public static final MethodHandle MH_glGetNamedProgramLocalParameterIuivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetNamedProgramLocalParameterIuivEXT;
    public static final MethodHandle MH_glEnableClientStateiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glEnableClientStateiEXT;
    public static final MethodHandle MH_glDisableClientStateiEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDisableClientStateiEXT;
    public static final MethodHandle MH_glGetFloati_vEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetFloati_vEXT;
    public static final MethodHandle MH_glGetDoublei_vEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetDoublei_vEXT;
    public static final MethodHandle MH_glGetPointeri_vEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetPointeri_vEXT;
    public static final MethodHandle MH_glNamedProgramStringEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glNamedProgramStringEXT;
    public static final MethodHandle MH_glNamedProgramLocalParameter4dEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glNamedProgramLocalParameter4dEXT;
    public static final MethodHandle MH_glNamedProgramLocalParameter4dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glNamedProgramLocalParameter4dvEXT;
    public static final MethodHandle MH_glNamedProgramLocalParameter4fEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glNamedProgramLocalParameter4fEXT;
    public static final MethodHandle MH_glNamedProgramLocalParameter4fvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glNamedProgramLocalParameter4fvEXT;
    public static final MethodHandle MH_glGetNamedProgramLocalParameterdvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetNamedProgramLocalParameterdvEXT;
    public static final MethodHandle MH_glGetNamedProgramLocalParameterfvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetNamedProgramLocalParameterfvEXT;
    public static final MethodHandle MH_glGetNamedProgramivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetNamedProgramivEXT;
    public static final MethodHandle MH_glGetNamedProgramStringEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetNamedProgramStringEXT;
    public static final MethodHandle MH_glNamedRenderbufferStorageEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glNamedRenderbufferStorageEXT;
    public static final MethodHandle MH_glGetNamedRenderbufferParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetNamedRenderbufferParameterivEXT;
    public static final MethodHandle MH_glNamedRenderbufferStorageMultisampleEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glNamedRenderbufferStorageMultisampleEXT;
    public static final MethodHandle MH_glNamedRenderbufferStorageMultisampleCoverageEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glNamedRenderbufferStorageMultisampleCoverageEXT;
    public static final MethodHandle MH_glCheckNamedFramebufferStatusEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glCheckNamedFramebufferStatusEXT;
    public static final MethodHandle MH_glNamedFramebufferTexture1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glNamedFramebufferTexture1DEXT;
    public static final MethodHandle MH_glNamedFramebufferTexture2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glNamedFramebufferTexture2DEXT;
    public static final MethodHandle MH_glNamedFramebufferTexture3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glNamedFramebufferTexture3DEXT;
    public static final MethodHandle MH_glNamedFramebufferRenderbufferEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glNamedFramebufferRenderbufferEXT;
    public static final MethodHandle MH_glGetNamedFramebufferAttachmentParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetNamedFramebufferAttachmentParameterivEXT;
    public static final MethodHandle MH_glGenerateTextureMipmapEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glGenerateTextureMipmapEXT;
    public static final MethodHandle MH_glGenerateMultiTexMipmapEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glGenerateMultiTexMipmapEXT;
    public static final MethodHandle MH_glFramebufferDrawBufferEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glFramebufferDrawBufferEXT;
    public static final MethodHandle MH_glFramebufferDrawBuffersEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glFramebufferDrawBuffersEXT;
    public static final MethodHandle MH_glFramebufferReadBufferEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glFramebufferReadBufferEXT;
    public static final MethodHandle MH_glGetFramebufferParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetFramebufferParameterivEXT;
    public static final MethodHandle MH_glNamedCopyBufferSubDataEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glNamedCopyBufferSubDataEXT;
    public static final MethodHandle MH_glNamedFramebufferTextureEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glNamedFramebufferTextureEXT;
    public static final MethodHandle MH_glNamedFramebufferTextureLayerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glNamedFramebufferTextureLayerEXT;
    public static final MethodHandle MH_glNamedFramebufferTextureFaceEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glNamedFramebufferTextureFaceEXT;
    public static final MethodHandle MH_glTextureRenderbufferEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTextureRenderbufferEXT;
    public static final MethodHandle MH_glMultiTexRenderbufferEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMultiTexRenderbufferEXT;
    public static final MethodHandle MH_glVertexArrayVertexOffsetEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glVertexArrayVertexOffsetEXT;
    public static final MethodHandle MH_glVertexArrayColorOffsetEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glVertexArrayColorOffsetEXT;
    public static final MethodHandle MH_glVertexArrayEdgeFlagOffsetEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glVertexArrayEdgeFlagOffsetEXT;
    public static final MethodHandle MH_glVertexArrayIndexOffsetEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glVertexArrayIndexOffsetEXT;
    public static final MethodHandle MH_glVertexArrayNormalOffsetEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glVertexArrayNormalOffsetEXT;
    public static final MethodHandle MH_glVertexArrayTexCoordOffsetEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glVertexArrayTexCoordOffsetEXT;
    public static final MethodHandle MH_glVertexArrayMultiTexCoordOffsetEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glVertexArrayMultiTexCoordOffsetEXT;
    public static final MethodHandle MH_glVertexArrayFogCoordOffsetEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glVertexArrayFogCoordOffsetEXT;
    public static final MethodHandle MH_glVertexArraySecondaryColorOffsetEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glVertexArraySecondaryColorOffsetEXT;
    public static final MethodHandle MH_glVertexArrayVertexAttribOffsetEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glVertexArrayVertexAttribOffsetEXT;
    public static final MethodHandle MH_glVertexArrayVertexAttribIOffsetEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glVertexArrayVertexAttribIOffsetEXT;
    public static final MethodHandle MH_glEnableVertexArrayEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glEnableVertexArrayEXT;
    public static final MethodHandle MH_glDisableVertexArrayEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDisableVertexArrayEXT;
    public static final MethodHandle MH_glEnableVertexArrayAttribEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glEnableVertexArrayAttribEXT;
    public static final MethodHandle MH_glDisableVertexArrayAttribEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glDisableVertexArrayAttribEXT;
    public static final MethodHandle MH_glGetVertexArrayIntegervEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetVertexArrayIntegervEXT;
    public static final MethodHandle MH_glGetVertexArrayPointervEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetVertexArrayPointervEXT;
    public static final MethodHandle MH_glGetVertexArrayIntegeri_vEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetVertexArrayIntegeri_vEXT;
    public static final MethodHandle MH_glGetVertexArrayPointeri_vEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetVertexArrayPointeri_vEXT;
    public static final MethodHandle MH_glMapNamedBufferRangeEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glMapNamedBufferRangeEXT;
    public static final MethodHandle MH_glFlushMappedNamedBufferRangeEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glFlushMappedNamedBufferRangeEXT;
    public static final MethodHandle MH_glNamedBufferStorageEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glNamedBufferStorageEXT;
    public static final MethodHandle MH_glClearNamedBufferDataEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glClearNamedBufferDataEXT;
    public static final MethodHandle MH_glClearNamedBufferSubDataEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glClearNamedBufferSubDataEXT;
    public static final MethodHandle MH_glNamedFramebufferParameteriEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glNamedFramebufferParameteriEXT;
    public static final MethodHandle MH_glGetNamedFramebufferParameterivEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetNamedFramebufferParameterivEXT;
    public static final MethodHandle MH_glProgramUniform1dEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glProgramUniform1dEXT;
    public static final MethodHandle MH_glProgramUniform2dEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glProgramUniform2dEXT;
    public static final MethodHandle MH_glProgramUniform3dEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glProgramUniform3dEXT;
    public static final MethodHandle MH_glProgramUniform4dEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glProgramUniform4dEXT;
    public static final MethodHandle MH_glProgramUniform1dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform1dvEXT;
    public static final MethodHandle MH_glProgramUniform2dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform2dvEXT;
    public static final MethodHandle MH_glProgramUniform3dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform3dvEXT;
    public static final MethodHandle MH_glProgramUniform4dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniform4dvEXT;
    public static final MethodHandle MH_glProgramUniformMatrix2dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix2dvEXT;
    public static final MethodHandle MH_glProgramUniformMatrix3dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix3dvEXT;
    public static final MethodHandle MH_glProgramUniformMatrix4dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix4dvEXT;
    public static final MethodHandle MH_glProgramUniformMatrix2x3dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix2x3dvEXT;
    public static final MethodHandle MH_glProgramUniformMatrix2x4dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix2x4dvEXT;
    public static final MethodHandle MH_glProgramUniformMatrix3x2dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix3x2dvEXT;
    public static final MethodHandle MH_glProgramUniformMatrix3x4dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix3x4dvEXT;
    public static final MethodHandle MH_glProgramUniformMatrix4x2dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix4x2dvEXT;
    public static final MethodHandle MH_glProgramUniformMatrix4x3dvEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glProgramUniformMatrix4x3dvEXT;
    public static final MethodHandle MH_glTextureBufferRangeEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glTextureBufferRangeEXT;
    public static final MethodHandle MH_glTextureStorage1DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTextureStorage1DEXT;
    public static final MethodHandle MH_glTextureStorage2DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTextureStorage2DEXT;
    public static final MethodHandle MH_glTextureStorage3DEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glTextureStorage3DEXT;
    public static final MethodHandle MH_glTextureStorage2DMultisampleEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN));
    public final MemorySegment PFN_glTextureStorage2DMultisampleEXT;
    public static final MethodHandle MH_glTextureStorage3DMultisampleEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN));
    public final MemorySegment PFN_glTextureStorage3DMultisampleEXT;
    public static final MethodHandle MH_glVertexArrayBindVertexBufferEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexArrayBindVertexBufferEXT;
    public static final MethodHandle MH_glVertexArrayVertexAttribFormatEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexArrayVertexAttribFormatEXT;
    public static final MethodHandle MH_glVertexArrayVertexAttribIFormatEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexArrayVertexAttribIFormatEXT;
    public static final MethodHandle MH_glVertexArrayVertexAttribLFormatEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexArrayVertexAttribLFormatEXT;
    public static final MethodHandle MH_glVertexArrayVertexAttribBindingEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexArrayVertexAttribBindingEXT;
    public static final MethodHandle MH_glVertexArrayVertexBindingDivisorEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexArrayVertexBindingDivisorEXT;
    public static final MethodHandle MH_glVertexArrayVertexAttribLOffsetEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG));
    public final MemorySegment PFN_glVertexArrayVertexAttribLOffsetEXT;
    public static final MethodHandle MH_glTexturePageCommitmentEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN));
    public final MemorySegment PFN_glTexturePageCommitmentEXT;
    public static final MethodHandle MH_glVertexArrayVertexAttribDivisorEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexArrayVertexAttribDivisorEXT;

    public GLEXTDirectStateAccess(overrungl.opengl.GLLoadFunc func) {
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

    public void MatrixLoadfEXT(@CType("GLenum") int mode, @CType("const GLfloat *") java.lang.foreign.MemorySegment m) {
        try { if (!Unmarshal.isNullPointer(PFN_glMatrixLoadfEXT))
            MH_glMatrixLoadfEXT.invokeExact(PFN_glMatrixLoadfEXT, mode, m);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixLoadfEXT", e); }
    }

    public void MatrixLoaddEXT(@CType("GLenum") int mode, @CType("const GLdouble *") java.lang.foreign.MemorySegment m) {
        try { if (!Unmarshal.isNullPointer(PFN_glMatrixLoaddEXT))
            MH_glMatrixLoaddEXT.invokeExact(PFN_glMatrixLoaddEXT, mode, m);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixLoaddEXT", e); }
    }

    public void MatrixMultfEXT(@CType("GLenum") int mode, @CType("const GLfloat *") java.lang.foreign.MemorySegment m) {
        try { if (!Unmarshal.isNullPointer(PFN_glMatrixMultfEXT))
            MH_glMatrixMultfEXT.invokeExact(PFN_glMatrixMultfEXT, mode, m);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixMultfEXT", e); }
    }

    public void MatrixMultdEXT(@CType("GLenum") int mode, @CType("const GLdouble *") java.lang.foreign.MemorySegment m) {
        try { if (!Unmarshal.isNullPointer(PFN_glMatrixMultdEXT))
            MH_glMatrixMultdEXT.invokeExact(PFN_glMatrixMultdEXT, mode, m);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixMultdEXT", e); }
    }

    public void MatrixLoadIdentityEXT(@CType("GLenum") int mode) {
        try { if (!Unmarshal.isNullPointer(PFN_glMatrixLoadIdentityEXT))
            MH_glMatrixLoadIdentityEXT.invokeExact(PFN_glMatrixLoadIdentityEXT, mode);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixLoadIdentityEXT", e); }
    }

    public void MatrixRotatefEXT(@CType("GLenum") int mode, @CType("GLfloat") float angle, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        try { if (!Unmarshal.isNullPointer(PFN_glMatrixRotatefEXT))
            MH_glMatrixRotatefEXT.invokeExact(PFN_glMatrixRotatefEXT, mode, angle, x, y, z);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixRotatefEXT", e); }
    }

    public void MatrixRotatedEXT(@CType("GLenum") int mode, @CType("GLdouble") double angle, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z) {
        try { if (!Unmarshal.isNullPointer(PFN_glMatrixRotatedEXT))
            MH_glMatrixRotatedEXT.invokeExact(PFN_glMatrixRotatedEXT, mode, angle, x, y, z);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixRotatedEXT", e); }
    }

    public void MatrixScalefEXT(@CType("GLenum") int mode, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        try { if (!Unmarshal.isNullPointer(PFN_glMatrixScalefEXT))
            MH_glMatrixScalefEXT.invokeExact(PFN_glMatrixScalefEXT, mode, x, y, z);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixScalefEXT", e); }
    }

    public void MatrixScaledEXT(@CType("GLenum") int mode, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z) {
        try { if (!Unmarshal.isNullPointer(PFN_glMatrixScaledEXT))
            MH_glMatrixScaledEXT.invokeExact(PFN_glMatrixScaledEXT, mode, x, y, z);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixScaledEXT", e); }
    }

    public void MatrixTranslatefEXT(@CType("GLenum") int mode, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        try { if (!Unmarshal.isNullPointer(PFN_glMatrixTranslatefEXT))
            MH_glMatrixTranslatefEXT.invokeExact(PFN_glMatrixTranslatefEXT, mode, x, y, z);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixTranslatefEXT", e); }
    }

    public void MatrixTranslatedEXT(@CType("GLenum") int mode, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z) {
        try { if (!Unmarshal.isNullPointer(PFN_glMatrixTranslatedEXT))
            MH_glMatrixTranslatedEXT.invokeExact(PFN_glMatrixTranslatedEXT, mode, x, y, z);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixTranslatedEXT", e); }
    }

    public void MatrixFrustumEXT(@CType("GLenum") int mode, @CType("GLdouble") double left, @CType("GLdouble") double right, @CType("GLdouble") double bottom, @CType("GLdouble") double top, @CType("GLdouble") double zNear, @CType("GLdouble") double zFar) {
        try { if (!Unmarshal.isNullPointer(PFN_glMatrixFrustumEXT))
            MH_glMatrixFrustumEXT.invokeExact(PFN_glMatrixFrustumEXT, mode, left, right, bottom, top, zNear, zFar);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixFrustumEXT", e); }
    }

    public void MatrixOrthoEXT(@CType("GLenum") int mode, @CType("GLdouble") double left, @CType("GLdouble") double right, @CType("GLdouble") double bottom, @CType("GLdouble") double top, @CType("GLdouble") double zNear, @CType("GLdouble") double zFar) {
        try { if (!Unmarshal.isNullPointer(PFN_glMatrixOrthoEXT))
            MH_glMatrixOrthoEXT.invokeExact(PFN_glMatrixOrthoEXT, mode, left, right, bottom, top, zNear, zFar);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixOrthoEXT", e); }
    }

    public void MatrixPopEXT(@CType("GLenum") int mode) {
        try { if (!Unmarshal.isNullPointer(PFN_glMatrixPopEXT))
            MH_glMatrixPopEXT.invokeExact(PFN_glMatrixPopEXT, mode);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixPopEXT", e); }
    }

    public void MatrixPushEXT(@CType("GLenum") int mode) {
        try { if (!Unmarshal.isNullPointer(PFN_glMatrixPushEXT))
            MH_glMatrixPushEXT.invokeExact(PFN_glMatrixPushEXT, mode);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixPushEXT", e); }
    }

    public void ClientAttribDefaultEXT(@CType("GLbitfield") int mask) {
        try { if (!Unmarshal.isNullPointer(PFN_glClientAttribDefaultEXT))
            MH_glClientAttribDefaultEXT.invokeExact(PFN_glClientAttribDefaultEXT, mask);
        }
        catch (Throwable e) { throw new RuntimeException("error in glClientAttribDefaultEXT", e); }
    }

    public void PushClientAttribDefaultEXT(@CType("GLbitfield") int mask) {
        try { if (!Unmarshal.isNullPointer(PFN_glPushClientAttribDefaultEXT))
            MH_glPushClientAttribDefaultEXT.invokeExact(PFN_glPushClientAttribDefaultEXT, mask);
        }
        catch (Throwable e) { throw new RuntimeException("error in glPushClientAttribDefaultEXT", e); }
    }

    public void TextureParameterfEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat") float param) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureParameterfEXT))
            MH_glTextureParameterfEXT.invokeExact(PFN_glTextureParameterfEXT, texture, target, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureParameterfEXT", e); }
    }

    public void TextureParameterfvEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureParameterfvEXT))
            MH_glTextureParameterfvEXT.invokeExact(PFN_glTextureParameterfvEXT, texture, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureParameterfvEXT", e); }
    }

    public void TextureParameteriEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint") int param) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureParameteriEXT))
            MH_glTextureParameteriEXT.invokeExact(PFN_glTextureParameteriEXT, texture, target, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureParameteriEXT", e); }
    }

    public void TextureParameterivEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureParameterivEXT))
            MH_glTextureParameterivEXT.invokeExact(PFN_glTextureParameterivEXT, texture, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureParameterivEXT", e); }
    }

    public void TextureImage1DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int internalformat, @CType("GLsizei") int width, @CType("GLint") int border, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureImage1DEXT))
            MH_glTextureImage1DEXT.invokeExact(PFN_glTextureImage1DEXT, texture, target, level, internalformat, width, border, format, type, pixels);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureImage1DEXT", e); }
    }

    public void TextureImage2DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLint") int border, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureImage2DEXT))
            MH_glTextureImage2DEXT.invokeExact(PFN_glTextureImage2DEXT, texture, target, level, internalformat, width, height, border, format, type, pixels);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureImage2DEXT", e); }
    }

    public void TextureSubImage1DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLsizei") int width, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureSubImage1DEXT))
            MH_glTextureSubImage1DEXT.invokeExact(PFN_glTextureSubImage1DEXT, texture, target, level, xoffset, width, format, type, pixels);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureSubImage1DEXT", e); }
    }

    public void TextureSubImage2DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureSubImage2DEXT))
            MH_glTextureSubImage2DEXT.invokeExact(PFN_glTextureSubImage2DEXT, texture, target, level, xoffset, yoffset, width, height, format, type, pixels);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureSubImage2DEXT", e); }
    }

    public void CopyTextureImage1DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLint") int border) {
        try { if (!Unmarshal.isNullPointer(PFN_glCopyTextureImage1DEXT))
            MH_glCopyTextureImage1DEXT.invokeExact(PFN_glCopyTextureImage1DEXT, texture, target, level, internalformat, x, y, width, border);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCopyTextureImage1DEXT", e); }
    }

    public void CopyTextureImage2DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLint") int border) {
        try { if (!Unmarshal.isNullPointer(PFN_glCopyTextureImage2DEXT))
            MH_glCopyTextureImage2DEXT.invokeExact(PFN_glCopyTextureImage2DEXT, texture, target, level, internalformat, x, y, width, height, border);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCopyTextureImage2DEXT", e); }
    }

    public void CopyTextureSubImage1DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width) {
        try { if (!Unmarshal.isNullPointer(PFN_glCopyTextureSubImage1DEXT))
            MH_glCopyTextureSubImage1DEXT.invokeExact(PFN_glCopyTextureSubImage1DEXT, texture, target, level, xoffset, x, y, width);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCopyTextureSubImage1DEXT", e); }
    }

    public void CopyTextureSubImage2DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        try { if (!Unmarshal.isNullPointer(PFN_glCopyTextureSubImage2DEXT))
            MH_glCopyTextureSubImage2DEXT.invokeExact(PFN_glCopyTextureSubImage2DEXT, texture, target, level, xoffset, yoffset, x, y, width, height);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCopyTextureSubImage2DEXT", e); }
    }

    public void GetTextureImageEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int format, @CType("GLenum") int type, @CType("void*") java.lang.foreign.MemorySegment pixels) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetTextureImageEXT))
            MH_glGetTextureImageEXT.invokeExact(PFN_glGetTextureImageEXT, texture, target, level, format, type, pixels);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureImageEXT", e); }
    }

    public void GetTextureParameterfvEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetTextureParameterfvEXT))
            MH_glGetTextureParameterfvEXT.invokeExact(PFN_glGetTextureParameterfvEXT, texture, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureParameterfvEXT", e); }
    }

    public void GetTextureParameterivEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetTextureParameterivEXT))
            MH_glGetTextureParameterivEXT.invokeExact(PFN_glGetTextureParameterivEXT, texture, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureParameterivEXT", e); }
    }

    public void GetTextureLevelParameterfvEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetTextureLevelParameterfvEXT))
            MH_glGetTextureLevelParameterfvEXT.invokeExact(PFN_glGetTextureLevelParameterfvEXT, texture, target, level, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureLevelParameterfvEXT", e); }
    }

    public void GetTextureLevelParameterivEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetTextureLevelParameterivEXT))
            MH_glGetTextureLevelParameterivEXT.invokeExact(PFN_glGetTextureLevelParameterivEXT, texture, target, level, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureLevelParameterivEXT", e); }
    }

    public void TextureImage3DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLint") int border, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureImage3DEXT))
            MH_glTextureImage3DEXT.invokeExact(PFN_glTextureImage3DEXT, texture, target, level, internalformat, width, height, depth, border, format, type, pixels);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureImage3DEXT", e); }
    }

    public void TextureSubImage3DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureSubImage3DEXT))
            MH_glTextureSubImage3DEXT.invokeExact(PFN_glTextureSubImage3DEXT, texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureSubImage3DEXT", e); }
    }

    public void CopyTextureSubImage3DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        try { if (!Unmarshal.isNullPointer(PFN_glCopyTextureSubImage3DEXT))
            MH_glCopyTextureSubImage3DEXT.invokeExact(PFN_glCopyTextureSubImage3DEXT, texture, target, level, xoffset, yoffset, zoffset, x, y, width, height);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCopyTextureSubImage3DEXT", e); }
    }

    public void BindMultiTextureEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLuint") int texture) {
        try { if (!Unmarshal.isNullPointer(PFN_glBindMultiTextureEXT))
            MH_glBindMultiTextureEXT.invokeExact(PFN_glBindMultiTextureEXT, texunit, target, texture);
        }
        catch (Throwable e) { throw new RuntimeException("error in glBindMultiTextureEXT", e); }
    }

    public void MultiTexCoordPointerEXT(@CType("GLenum") int texunit, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("const void *") java.lang.foreign.MemorySegment pointer) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexCoordPointerEXT))
            MH_glMultiTexCoordPointerEXT.invokeExact(PFN_glMultiTexCoordPointerEXT, texunit, size, type, stride, pointer);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexCoordPointerEXT", e); }
    }

    public void MultiTexEnvfEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat") float param) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexEnvfEXT))
            MH_glMultiTexEnvfEXT.invokeExact(PFN_glMultiTexEnvfEXT, texunit, target, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexEnvfEXT", e); }
    }

    public void MultiTexEnvfvEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexEnvfvEXT))
            MH_glMultiTexEnvfvEXT.invokeExact(PFN_glMultiTexEnvfvEXT, texunit, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexEnvfvEXT", e); }
    }

    public void MultiTexEnviEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint") int param) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexEnviEXT))
            MH_glMultiTexEnviEXT.invokeExact(PFN_glMultiTexEnviEXT, texunit, target, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexEnviEXT", e); }
    }

    public void MultiTexEnvivEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexEnvivEXT))
            MH_glMultiTexEnvivEXT.invokeExact(PFN_glMultiTexEnvivEXT, texunit, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexEnvivEXT", e); }
    }

    public void MultiTexGendEXT(@CType("GLenum") int texunit, @CType("GLenum") int coord, @CType("GLenum") int pname, @CType("GLdouble") double param) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexGendEXT))
            MH_glMultiTexGendEXT.invokeExact(PFN_glMultiTexGendEXT, texunit, coord, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexGendEXT", e); }
    }

    public void MultiTexGendvEXT(@CType("GLenum") int texunit, @CType("GLenum") int coord, @CType("GLenum") int pname, @CType("const GLdouble *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexGendvEXT))
            MH_glMultiTexGendvEXT.invokeExact(PFN_glMultiTexGendvEXT, texunit, coord, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexGendvEXT", e); }
    }

    public void MultiTexGenfEXT(@CType("GLenum") int texunit, @CType("GLenum") int coord, @CType("GLenum") int pname, @CType("GLfloat") float param) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexGenfEXT))
            MH_glMultiTexGenfEXT.invokeExact(PFN_glMultiTexGenfEXT, texunit, coord, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexGenfEXT", e); }
    }

    public void MultiTexGenfvEXT(@CType("GLenum") int texunit, @CType("GLenum") int coord, @CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexGenfvEXT))
            MH_glMultiTexGenfvEXT.invokeExact(PFN_glMultiTexGenfvEXT, texunit, coord, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexGenfvEXT", e); }
    }

    public void MultiTexGeniEXT(@CType("GLenum") int texunit, @CType("GLenum") int coord, @CType("GLenum") int pname, @CType("GLint") int param) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexGeniEXT))
            MH_glMultiTexGeniEXT.invokeExact(PFN_glMultiTexGeniEXT, texunit, coord, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexGeniEXT", e); }
    }

    public void MultiTexGenivEXT(@CType("GLenum") int texunit, @CType("GLenum") int coord, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexGenivEXT))
            MH_glMultiTexGenivEXT.invokeExact(PFN_glMultiTexGenivEXT, texunit, coord, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexGenivEXT", e); }
    }

    public void GetMultiTexEnvfvEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetMultiTexEnvfvEXT))
            MH_glGetMultiTexEnvfvEXT.invokeExact(PFN_glGetMultiTexEnvfvEXT, texunit, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetMultiTexEnvfvEXT", e); }
    }

    public void GetMultiTexEnvivEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetMultiTexEnvivEXT))
            MH_glGetMultiTexEnvivEXT.invokeExact(PFN_glGetMultiTexEnvivEXT, texunit, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetMultiTexEnvivEXT", e); }
    }

    public void GetMultiTexGendvEXT(@CType("GLenum") int texunit, @CType("GLenum") int coord, @CType("GLenum") int pname, @CType("GLdouble *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetMultiTexGendvEXT))
            MH_glGetMultiTexGendvEXT.invokeExact(PFN_glGetMultiTexGendvEXT, texunit, coord, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetMultiTexGendvEXT", e); }
    }

    public void GetMultiTexGenfvEXT(@CType("GLenum") int texunit, @CType("GLenum") int coord, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetMultiTexGenfvEXT))
            MH_glGetMultiTexGenfvEXT.invokeExact(PFN_glGetMultiTexGenfvEXT, texunit, coord, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetMultiTexGenfvEXT", e); }
    }

    public void GetMultiTexGenivEXT(@CType("GLenum") int texunit, @CType("GLenum") int coord, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetMultiTexGenivEXT))
            MH_glGetMultiTexGenivEXT.invokeExact(PFN_glGetMultiTexGenivEXT, texunit, coord, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetMultiTexGenivEXT", e); }
    }

    public void MultiTexParameteriEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint") int param) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexParameteriEXT))
            MH_glMultiTexParameteriEXT.invokeExact(PFN_glMultiTexParameteriEXT, texunit, target, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexParameteriEXT", e); }
    }

    public void MultiTexParameterivEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexParameterivEXT))
            MH_glMultiTexParameterivEXT.invokeExact(PFN_glMultiTexParameterivEXT, texunit, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexParameterivEXT", e); }
    }

    public void MultiTexParameterfEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat") float param) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexParameterfEXT))
            MH_glMultiTexParameterfEXT.invokeExact(PFN_glMultiTexParameterfEXT, texunit, target, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexParameterfEXT", e); }
    }

    public void MultiTexParameterfvEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexParameterfvEXT))
            MH_glMultiTexParameterfvEXT.invokeExact(PFN_glMultiTexParameterfvEXT, texunit, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexParameterfvEXT", e); }
    }

    public void MultiTexImage1DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int internalformat, @CType("GLsizei") int width, @CType("GLint") int border, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexImage1DEXT))
            MH_glMultiTexImage1DEXT.invokeExact(PFN_glMultiTexImage1DEXT, texunit, target, level, internalformat, width, border, format, type, pixels);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexImage1DEXT", e); }
    }

    public void MultiTexImage2DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLint") int border, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexImage2DEXT))
            MH_glMultiTexImage2DEXT.invokeExact(PFN_glMultiTexImage2DEXT, texunit, target, level, internalformat, width, height, border, format, type, pixels);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexImage2DEXT", e); }
    }

    public void MultiTexSubImage1DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLsizei") int width, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexSubImage1DEXT))
            MH_glMultiTexSubImage1DEXT.invokeExact(PFN_glMultiTexSubImage1DEXT, texunit, target, level, xoffset, width, format, type, pixels);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexSubImage1DEXT", e); }
    }

    public void MultiTexSubImage2DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexSubImage2DEXT))
            MH_glMultiTexSubImage2DEXT.invokeExact(PFN_glMultiTexSubImage2DEXT, texunit, target, level, xoffset, yoffset, width, height, format, type, pixels);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexSubImage2DEXT", e); }
    }

    public void CopyMultiTexImage1DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLint") int border) {
        try { if (!Unmarshal.isNullPointer(PFN_glCopyMultiTexImage1DEXT))
            MH_glCopyMultiTexImage1DEXT.invokeExact(PFN_glCopyMultiTexImage1DEXT, texunit, target, level, internalformat, x, y, width, border);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCopyMultiTexImage1DEXT", e); }
    }

    public void CopyMultiTexImage2DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLint") int border) {
        try { if (!Unmarshal.isNullPointer(PFN_glCopyMultiTexImage2DEXT))
            MH_glCopyMultiTexImage2DEXT.invokeExact(PFN_glCopyMultiTexImage2DEXT, texunit, target, level, internalformat, x, y, width, height, border);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCopyMultiTexImage2DEXT", e); }
    }

    public void CopyMultiTexSubImage1DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width) {
        try { if (!Unmarshal.isNullPointer(PFN_glCopyMultiTexSubImage1DEXT))
            MH_glCopyMultiTexSubImage1DEXT.invokeExact(PFN_glCopyMultiTexSubImage1DEXT, texunit, target, level, xoffset, x, y, width);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCopyMultiTexSubImage1DEXT", e); }
    }

    public void CopyMultiTexSubImage2DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        try { if (!Unmarshal.isNullPointer(PFN_glCopyMultiTexSubImage2DEXT))
            MH_glCopyMultiTexSubImage2DEXT.invokeExact(PFN_glCopyMultiTexSubImage2DEXT, texunit, target, level, xoffset, yoffset, x, y, width, height);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCopyMultiTexSubImage2DEXT", e); }
    }

    public void GetMultiTexImageEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int format, @CType("GLenum") int type, @CType("void*") java.lang.foreign.MemorySegment pixels) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetMultiTexImageEXT))
            MH_glGetMultiTexImageEXT.invokeExact(PFN_glGetMultiTexImageEXT, texunit, target, level, format, type, pixels);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetMultiTexImageEXT", e); }
    }

    public void GetMultiTexParameterfvEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetMultiTexParameterfvEXT))
            MH_glGetMultiTexParameterfvEXT.invokeExact(PFN_glGetMultiTexParameterfvEXT, texunit, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetMultiTexParameterfvEXT", e); }
    }

    public void GetMultiTexParameterivEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetMultiTexParameterivEXT))
            MH_glGetMultiTexParameterivEXT.invokeExact(PFN_glGetMultiTexParameterivEXT, texunit, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetMultiTexParameterivEXT", e); }
    }

    public void GetMultiTexLevelParameterfvEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetMultiTexLevelParameterfvEXT))
            MH_glGetMultiTexLevelParameterfvEXT.invokeExact(PFN_glGetMultiTexLevelParameterfvEXT, texunit, target, level, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetMultiTexLevelParameterfvEXT", e); }
    }

    public void GetMultiTexLevelParameterivEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetMultiTexLevelParameterivEXT))
            MH_glGetMultiTexLevelParameterivEXT.invokeExact(PFN_glGetMultiTexLevelParameterivEXT, texunit, target, level, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetMultiTexLevelParameterivEXT", e); }
    }

    public void MultiTexImage3DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLint") int border, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexImage3DEXT))
            MH_glMultiTexImage3DEXT.invokeExact(PFN_glMultiTexImage3DEXT, texunit, target, level, internalformat, width, height, depth, border, format, type, pixels);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexImage3DEXT", e); }
    }

    public void MultiTexSubImage3DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment pixels) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexSubImage3DEXT))
            MH_glMultiTexSubImage3DEXT.invokeExact(PFN_glMultiTexSubImage3DEXT, texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexSubImage3DEXT", e); }
    }

    public void CopyMultiTexSubImage3DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLint") int x, @CType("GLint") int y, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        try { if (!Unmarshal.isNullPointer(PFN_glCopyMultiTexSubImage3DEXT))
            MH_glCopyMultiTexSubImage3DEXT.invokeExact(PFN_glCopyMultiTexSubImage3DEXT, texunit, target, level, xoffset, yoffset, zoffset, x, y, width, height);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCopyMultiTexSubImage3DEXT", e); }
    }

    public void EnableClientStateIndexedEXT(@CType("GLenum") int array, @CType("GLuint") int index) {
        try { if (!Unmarshal.isNullPointer(PFN_glEnableClientStateIndexedEXT))
            MH_glEnableClientStateIndexedEXT.invokeExact(PFN_glEnableClientStateIndexedEXT, array, index);
        }
        catch (Throwable e) { throw new RuntimeException("error in glEnableClientStateIndexedEXT", e); }
    }

    public void DisableClientStateIndexedEXT(@CType("GLenum") int array, @CType("GLuint") int index) {
        try { if (!Unmarshal.isNullPointer(PFN_glDisableClientStateIndexedEXT))
            MH_glDisableClientStateIndexedEXT.invokeExact(PFN_glDisableClientStateIndexedEXT, array, index);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDisableClientStateIndexedEXT", e); }
    }

    public void GetFloatIndexedvEXT(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLfloat *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetFloatIndexedvEXT))
            MH_glGetFloatIndexedvEXT.invokeExact(PFN_glGetFloatIndexedvEXT, target, index, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetFloatIndexedvEXT", e); }
    }

    public void GetDoubleIndexedvEXT(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLdouble *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetDoubleIndexedvEXT))
            MH_glGetDoubleIndexedvEXT.invokeExact(PFN_glGetDoubleIndexedvEXT, target, index, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetDoubleIndexedvEXT", e); }
    }

    public void GetPointerIndexedvEXT(@CType("GLenum") int target, @CType("GLuint") int index, @CType("void **") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetPointerIndexedvEXT))
            MH_glGetPointerIndexedvEXT.invokeExact(PFN_glGetPointerIndexedvEXT, target, index, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetPointerIndexedvEXT", e); }
    }

    public void EnableIndexedEXT(@CType("GLenum") int target, @CType("GLuint") int index) {
        try { if (!Unmarshal.isNullPointer(PFN_glEnableIndexedEXT))
            MH_glEnableIndexedEXT.invokeExact(PFN_glEnableIndexedEXT, target, index);
        }
        catch (Throwable e) { throw new RuntimeException("error in glEnableIndexedEXT", e); }
    }

    public void DisableIndexedEXT(@CType("GLenum") int target, @CType("GLuint") int index) {
        try { if (!Unmarshal.isNullPointer(PFN_glDisableIndexedEXT))
            MH_glDisableIndexedEXT.invokeExact(PFN_glDisableIndexedEXT, target, index);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDisableIndexedEXT", e); }
    }

    public @CType("GLboolean") boolean IsEnabledIndexedEXT(@CType("GLenum") int target, @CType("GLuint") int index) {
        try { if (!Unmarshal.isNullPointer(PFN_glIsEnabledIndexedEXT))
            return (boolean) MH_glIsEnabledIndexedEXT.invokeExact(PFN_glIsEnabledIndexedEXT, target, index);
            else return false;
        }
        catch (Throwable e) { throw new RuntimeException("error in glIsEnabledIndexedEXT", e); }
    }

    public void GetIntegerIndexedvEXT(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLint *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetIntegerIndexedvEXT))
            MH_glGetIntegerIndexedvEXT.invokeExact(PFN_glGetIntegerIndexedvEXT, target, index, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetIntegerIndexedvEXT", e); }
    }

    public void GetBooleanIndexedvEXT(@CType("GLenum") int target, @CType("GLuint") int index, @CType("GLboolean *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetBooleanIndexedvEXT))
            MH_glGetBooleanIndexedvEXT.invokeExact(PFN_glGetBooleanIndexedvEXT, target, index, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetBooleanIndexedvEXT", e); }
    }

    public void CompressedTextureImage3DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLint") int border, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment bits) {
        try { if (!Unmarshal.isNullPointer(PFN_glCompressedTextureImage3DEXT))
            MH_glCompressedTextureImage3DEXT.invokeExact(PFN_glCompressedTextureImage3DEXT, texture, target, level, internalformat, width, height, depth, border, imageSize, bits);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTextureImage3DEXT", e); }
    }

    public void CompressedTextureImage2DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLint") int border, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment bits) {
        try { if (!Unmarshal.isNullPointer(PFN_glCompressedTextureImage2DEXT))
            MH_glCompressedTextureImage2DEXT.invokeExact(PFN_glCompressedTextureImage2DEXT, texture, target, level, internalformat, width, height, border, imageSize, bits);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTextureImage2DEXT", e); }
    }

    public void CompressedTextureImage1DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLint") int border, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment bits) {
        try { if (!Unmarshal.isNullPointer(PFN_glCompressedTextureImage1DEXT))
            MH_glCompressedTextureImage1DEXT.invokeExact(PFN_glCompressedTextureImage1DEXT, texture, target, level, internalformat, width, border, imageSize, bits);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTextureImage1DEXT", e); }
    }

    public void CompressedTextureSubImage3DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment bits) {
        try { if (!Unmarshal.isNullPointer(PFN_glCompressedTextureSubImage3DEXT))
            MH_glCompressedTextureSubImage3DEXT.invokeExact(PFN_glCompressedTextureSubImage3DEXT, texture, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, bits);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTextureSubImage3DEXT", e); }
    }

    public void CompressedTextureSubImage2DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment bits) {
        try { if (!Unmarshal.isNullPointer(PFN_glCompressedTextureSubImage2DEXT))
            MH_glCompressedTextureSubImage2DEXT.invokeExact(PFN_glCompressedTextureSubImage2DEXT, texture, target, level, xoffset, yoffset, width, height, format, imageSize, bits);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTextureSubImage2DEXT", e); }
    }

    public void CompressedTextureSubImage1DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLsizei") int width, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment bits) {
        try { if (!Unmarshal.isNullPointer(PFN_glCompressedTextureSubImage1DEXT))
            MH_glCompressedTextureSubImage1DEXT.invokeExact(PFN_glCompressedTextureSubImage1DEXT, texture, target, level, xoffset, width, format, imageSize, bits);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedTextureSubImage1DEXT", e); }
    }

    public void GetCompressedTextureImageEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLint") int lod, @CType("void*") java.lang.foreign.MemorySegment img) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetCompressedTextureImageEXT))
            MH_glGetCompressedTextureImageEXT.invokeExact(PFN_glGetCompressedTextureImageEXT, texture, target, lod, img);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetCompressedTextureImageEXT", e); }
    }

    public void CompressedMultiTexImage3DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLint") int border, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment bits) {
        try { if (!Unmarshal.isNullPointer(PFN_glCompressedMultiTexImage3DEXT))
            MH_glCompressedMultiTexImage3DEXT.invokeExact(PFN_glCompressedMultiTexImage3DEXT, texunit, target, level, internalformat, width, height, depth, border, imageSize, bits);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedMultiTexImage3DEXT", e); }
    }

    public void CompressedMultiTexImage2DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLint") int border, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment bits) {
        try { if (!Unmarshal.isNullPointer(PFN_glCompressedMultiTexImage2DEXT))
            MH_glCompressedMultiTexImage2DEXT.invokeExact(PFN_glCompressedMultiTexImage2DEXT, texunit, target, level, internalformat, width, height, border, imageSize, bits);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedMultiTexImage2DEXT", e); }
    }

    public void CompressedMultiTexImage1DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLint") int border, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment bits) {
        try { if (!Unmarshal.isNullPointer(PFN_glCompressedMultiTexImage1DEXT))
            MH_glCompressedMultiTexImage1DEXT.invokeExact(PFN_glCompressedMultiTexImage1DEXT, texunit, target, level, internalformat, width, border, imageSize, bits);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedMultiTexImage1DEXT", e); }
    }

    public void CompressedMultiTexSubImage3DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment bits) {
        try { if (!Unmarshal.isNullPointer(PFN_glCompressedMultiTexSubImage3DEXT))
            MH_glCompressedMultiTexSubImage3DEXT.invokeExact(PFN_glCompressedMultiTexSubImage3DEXT, texunit, target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, bits);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedMultiTexSubImage3DEXT", e); }
    }

    public void CompressedMultiTexSubImage2DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment bits) {
        try { if (!Unmarshal.isNullPointer(PFN_glCompressedMultiTexSubImage2DEXT))
            MH_glCompressedMultiTexSubImage2DEXT.invokeExact(PFN_glCompressedMultiTexSubImage2DEXT, texunit, target, level, xoffset, yoffset, width, height, format, imageSize, bits);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedMultiTexSubImage2DEXT", e); }
    }

    public void CompressedMultiTexSubImage1DEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLsizei") int width, @CType("GLenum") int format, @CType("GLsizei") int imageSize, @CType("const void *") java.lang.foreign.MemorySegment bits) {
        try { if (!Unmarshal.isNullPointer(PFN_glCompressedMultiTexSubImage1DEXT))
            MH_glCompressedMultiTexSubImage1DEXT.invokeExact(PFN_glCompressedMultiTexSubImage1DEXT, texunit, target, level, xoffset, width, format, imageSize, bits);
        }
        catch (Throwable e) { throw new RuntimeException("error in glCompressedMultiTexSubImage1DEXT", e); }
    }

    public void GetCompressedMultiTexImageEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLint") int lod, @CType("void*") java.lang.foreign.MemorySegment img) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetCompressedMultiTexImageEXT))
            MH_glGetCompressedMultiTexImageEXT.invokeExact(PFN_glGetCompressedMultiTexImageEXT, texunit, target, lod, img);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetCompressedMultiTexImageEXT", e); }
    }

    public void MatrixLoadTransposefEXT(@CType("GLenum") int mode, @CType("const GLfloat *") java.lang.foreign.MemorySegment m) {
        try { if (!Unmarshal.isNullPointer(PFN_glMatrixLoadTransposefEXT))
            MH_glMatrixLoadTransposefEXT.invokeExact(PFN_glMatrixLoadTransposefEXT, mode, m);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixLoadTransposefEXT", e); }
    }

    public void MatrixLoadTransposedEXT(@CType("GLenum") int mode, @CType("const GLdouble *") java.lang.foreign.MemorySegment m) {
        try { if (!Unmarshal.isNullPointer(PFN_glMatrixLoadTransposedEXT))
            MH_glMatrixLoadTransposedEXT.invokeExact(PFN_glMatrixLoadTransposedEXT, mode, m);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixLoadTransposedEXT", e); }
    }

    public void MatrixMultTransposefEXT(@CType("GLenum") int mode, @CType("const GLfloat *") java.lang.foreign.MemorySegment m) {
        try { if (!Unmarshal.isNullPointer(PFN_glMatrixMultTransposefEXT))
            MH_glMatrixMultTransposefEXT.invokeExact(PFN_glMatrixMultTransposefEXT, mode, m);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixMultTransposefEXT", e); }
    }

    public void MatrixMultTransposedEXT(@CType("GLenum") int mode, @CType("const GLdouble *") java.lang.foreign.MemorySegment m) {
        try { if (!Unmarshal.isNullPointer(PFN_glMatrixMultTransposedEXT))
            MH_glMatrixMultTransposedEXT.invokeExact(PFN_glMatrixMultTransposedEXT, mode, m);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMatrixMultTransposedEXT", e); }
    }

    public void NamedBufferDataEXT(@CType("GLuint") int buffer, @CType("GLsizeiptr") long size, @CType("const void *") java.lang.foreign.MemorySegment data, @CType("GLenum") int usage) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedBufferDataEXT))
            MH_glNamedBufferDataEXT.invokeExact(PFN_glNamedBufferDataEXT, buffer, size, data, usage);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedBufferDataEXT", e); }
    }

    public void NamedBufferSubDataEXT(@CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("const void *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedBufferSubDataEXT))
            MH_glNamedBufferSubDataEXT.invokeExact(PFN_glNamedBufferSubDataEXT, buffer, offset, size, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedBufferSubDataEXT", e); }
    }

    public @CType("void*") java.lang.foreign.MemorySegment MapNamedBufferEXT(@CType("GLuint") int buffer, @CType("GLenum") int access) {
        try { if (!Unmarshal.isNullPointer(PFN_glMapNamedBufferEXT))
            return (java.lang.foreign.MemorySegment) MH_glMapNamedBufferEXT.invokeExact(PFN_glMapNamedBufferEXT, buffer, access);
            else return MemorySegment.NULL;
        }
        catch (Throwable e) { throw new RuntimeException("error in glMapNamedBufferEXT", e); }
    }

    public @CType("GLboolean") boolean UnmapNamedBufferEXT(@CType("GLuint") int buffer) {
        try { if (!Unmarshal.isNullPointer(PFN_glUnmapNamedBufferEXT))
            return (boolean) MH_glUnmapNamedBufferEXT.invokeExact(PFN_glUnmapNamedBufferEXT, buffer);
            else return false;
        }
        catch (Throwable e) { throw new RuntimeException("error in glUnmapNamedBufferEXT", e); }
    }

    public void GetNamedBufferParameterivEXT(@CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetNamedBufferParameterivEXT))
            MH_glGetNamedBufferParameterivEXT.invokeExact(PFN_glGetNamedBufferParameterivEXT, buffer, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedBufferParameterivEXT", e); }
    }

    public void GetNamedBufferPointervEXT(@CType("GLuint") int buffer, @CType("GLenum") int pname, @CType("void **") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetNamedBufferPointervEXT))
            MH_glGetNamedBufferPointervEXT.invokeExact(PFN_glGetNamedBufferPointervEXT, buffer, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedBufferPointervEXT", e); }
    }

    public void GetNamedBufferSubDataEXT(@CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size, @CType("void*") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetNamedBufferSubDataEXT))
            MH_glGetNamedBufferSubDataEXT.invokeExact(PFN_glGetNamedBufferSubDataEXT, buffer, offset, size, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedBufferSubDataEXT", e); }
    }

    public void ProgramUniform1fEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLfloat") float v0) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform1fEXT))
            MH_glProgramUniform1fEXT.invokeExact(PFN_glProgramUniform1fEXT, program, location, v0);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1fEXT", e); }
    }

    public void ProgramUniform2fEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLfloat") float v0, @CType("GLfloat") float v1) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform2fEXT))
            MH_glProgramUniform2fEXT.invokeExact(PFN_glProgramUniform2fEXT, program, location, v0, v1);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2fEXT", e); }
    }

    public void ProgramUniform3fEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLfloat") float v0, @CType("GLfloat") float v1, @CType("GLfloat") float v2) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform3fEXT))
            MH_glProgramUniform3fEXT.invokeExact(PFN_glProgramUniform3fEXT, program, location, v0, v1, v2);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3fEXT", e); }
    }

    public void ProgramUniform4fEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLfloat") float v0, @CType("GLfloat") float v1, @CType("GLfloat") float v2, @CType("GLfloat") float v3) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform4fEXT))
            MH_glProgramUniform4fEXT.invokeExact(PFN_glProgramUniform4fEXT, program, location, v0, v1, v2, v3);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4fEXT", e); }
    }

    public void ProgramUniform1iEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint") int v0) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform1iEXT))
            MH_glProgramUniform1iEXT.invokeExact(PFN_glProgramUniform1iEXT, program, location, v0);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1iEXT", e); }
    }

    public void ProgramUniform2iEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint") int v0, @CType("GLint") int v1) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform2iEXT))
            MH_glProgramUniform2iEXT.invokeExact(PFN_glProgramUniform2iEXT, program, location, v0, v1);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2iEXT", e); }
    }

    public void ProgramUniform3iEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint") int v0, @CType("GLint") int v1, @CType("GLint") int v2) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform3iEXT))
            MH_glProgramUniform3iEXT.invokeExact(PFN_glProgramUniform3iEXT, program, location, v0, v1, v2);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3iEXT", e); }
    }

    public void ProgramUniform4iEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLint") int v0, @CType("GLint") int v1, @CType("GLint") int v2, @CType("GLint") int v3) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform4iEXT))
            MH_glProgramUniform4iEXT.invokeExact(PFN_glProgramUniform4iEXT, program, location, v0, v1, v2, v3);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4iEXT", e); }
    }

    public void ProgramUniform1fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform1fvEXT))
            MH_glProgramUniform1fvEXT.invokeExact(PFN_glProgramUniform1fvEXT, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1fvEXT", e); }
    }

    public void ProgramUniform2fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform2fvEXT))
            MH_glProgramUniform2fvEXT.invokeExact(PFN_glProgramUniform2fvEXT, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2fvEXT", e); }
    }

    public void ProgramUniform3fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform3fvEXT))
            MH_glProgramUniform3fvEXT.invokeExact(PFN_glProgramUniform3fvEXT, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3fvEXT", e); }
    }

    public void ProgramUniform4fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform4fvEXT))
            MH_glProgramUniform4fvEXT.invokeExact(PFN_glProgramUniform4fvEXT, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4fvEXT", e); }
    }

    public void ProgramUniform1ivEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform1ivEXT))
            MH_glProgramUniform1ivEXT.invokeExact(PFN_glProgramUniform1ivEXT, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1ivEXT", e); }
    }

    public void ProgramUniform2ivEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform2ivEXT))
            MH_glProgramUniform2ivEXT.invokeExact(PFN_glProgramUniform2ivEXT, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2ivEXT", e); }
    }

    public void ProgramUniform3ivEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform3ivEXT))
            MH_glProgramUniform3ivEXT.invokeExact(PFN_glProgramUniform3ivEXT, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3ivEXT", e); }
    }

    public void ProgramUniform4ivEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform4ivEXT))
            MH_glProgramUniform4ivEXT.invokeExact(PFN_glProgramUniform4ivEXT, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4ivEXT", e); }
    }

    public void ProgramUniformMatrix2fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix2fvEXT))
            MH_glProgramUniformMatrix2fvEXT.invokeExact(PFN_glProgramUniformMatrix2fvEXT, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2fvEXT", e); }
    }

    public void ProgramUniformMatrix3fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix3fvEXT))
            MH_glProgramUniformMatrix3fvEXT.invokeExact(PFN_glProgramUniformMatrix3fvEXT, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3fvEXT", e); }
    }

    public void ProgramUniformMatrix4fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix4fvEXT))
            MH_glProgramUniformMatrix4fvEXT.invokeExact(PFN_glProgramUniformMatrix4fvEXT, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4fvEXT", e); }
    }

    public void ProgramUniformMatrix2x3fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix2x3fvEXT))
            MH_glProgramUniformMatrix2x3fvEXT.invokeExact(PFN_glProgramUniformMatrix2x3fvEXT, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2x3fvEXT", e); }
    }

    public void ProgramUniformMatrix3x2fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix3x2fvEXT))
            MH_glProgramUniformMatrix3x2fvEXT.invokeExact(PFN_glProgramUniformMatrix3x2fvEXT, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3x2fvEXT", e); }
    }

    public void ProgramUniformMatrix2x4fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix2x4fvEXT))
            MH_glProgramUniformMatrix2x4fvEXT.invokeExact(PFN_glProgramUniformMatrix2x4fvEXT, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2x4fvEXT", e); }
    }

    public void ProgramUniformMatrix4x2fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix4x2fvEXT))
            MH_glProgramUniformMatrix4x2fvEXT.invokeExact(PFN_glProgramUniformMatrix4x2fvEXT, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4x2fvEXT", e); }
    }

    public void ProgramUniformMatrix3x4fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix3x4fvEXT))
            MH_glProgramUniformMatrix3x4fvEXT.invokeExact(PFN_glProgramUniformMatrix3x4fvEXT, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3x4fvEXT", e); }
    }

    public void ProgramUniformMatrix4x3fvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLfloat *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix4x3fvEXT))
            MH_glProgramUniformMatrix4x3fvEXT.invokeExact(PFN_glProgramUniformMatrix4x3fvEXT, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4x3fvEXT", e); }
    }

    public void TextureBufferEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLuint") int buffer) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureBufferEXT))
            MH_glTextureBufferEXT.invokeExact(PFN_glTextureBufferEXT, texture, target, internalformat, buffer);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureBufferEXT", e); }
    }

    public void MultiTexBufferEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLuint") int buffer) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexBufferEXT))
            MH_glMultiTexBufferEXT.invokeExact(PFN_glMultiTexBufferEXT, texunit, target, internalformat, buffer);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexBufferEXT", e); }
    }

    public void TextureParameterIivEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureParameterIivEXT))
            MH_glTextureParameterIivEXT.invokeExact(PFN_glTextureParameterIivEXT, texture, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureParameterIivEXT", e); }
    }

    public void TextureParameterIuivEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLuint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureParameterIuivEXT))
            MH_glTextureParameterIuivEXT.invokeExact(PFN_glTextureParameterIuivEXT, texture, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureParameterIuivEXT", e); }
    }

    public void GetTextureParameterIivEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetTextureParameterIivEXT))
            MH_glGetTextureParameterIivEXT.invokeExact(PFN_glGetTextureParameterIivEXT, texture, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureParameterIivEXT", e); }
    }

    public void GetTextureParameterIuivEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetTextureParameterIuivEXT))
            MH_glGetTextureParameterIuivEXT.invokeExact(PFN_glGetTextureParameterIuivEXT, texture, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetTextureParameterIuivEXT", e); }
    }

    public void MultiTexParameterIivEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexParameterIivEXT))
            MH_glMultiTexParameterIivEXT.invokeExact(PFN_glMultiTexParameterIivEXT, texunit, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexParameterIivEXT", e); }
    }

    public void MultiTexParameterIuivEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("const GLuint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexParameterIuivEXT))
            MH_glMultiTexParameterIuivEXT.invokeExact(PFN_glMultiTexParameterIuivEXT, texunit, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexParameterIuivEXT", e); }
    }

    public void GetMultiTexParameterIivEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetMultiTexParameterIivEXT))
            MH_glGetMultiTexParameterIivEXT.invokeExact(PFN_glGetMultiTexParameterIivEXT, texunit, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetMultiTexParameterIivEXT", e); }
    }

    public void GetMultiTexParameterIuivEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetMultiTexParameterIuivEXT))
            MH_glGetMultiTexParameterIuivEXT.invokeExact(PFN_glGetMultiTexParameterIuivEXT, texunit, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetMultiTexParameterIuivEXT", e); }
    }

    public void ProgramUniform1uiEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint") int v0) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform1uiEXT))
            MH_glProgramUniform1uiEXT.invokeExact(PFN_glProgramUniform1uiEXT, program, location, v0);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1uiEXT", e); }
    }

    public void ProgramUniform2uiEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint") int v0, @CType("GLuint") int v1) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform2uiEXT))
            MH_glProgramUniform2uiEXT.invokeExact(PFN_glProgramUniform2uiEXT, program, location, v0, v1);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2uiEXT", e); }
    }

    public void ProgramUniform3uiEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint") int v0, @CType("GLuint") int v1, @CType("GLuint") int v2) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform3uiEXT))
            MH_glProgramUniform3uiEXT.invokeExact(PFN_glProgramUniform3uiEXT, program, location, v0, v1, v2);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3uiEXT", e); }
    }

    public void ProgramUniform4uiEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLuint") int v0, @CType("GLuint") int v1, @CType("GLuint") int v2, @CType("GLuint") int v3) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform4uiEXT))
            MH_glProgramUniform4uiEXT.invokeExact(PFN_glProgramUniform4uiEXT, program, location, v0, v1, v2, v3);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4uiEXT", e); }
    }

    public void ProgramUniform1uivEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform1uivEXT))
            MH_glProgramUniform1uivEXT.invokeExact(PFN_glProgramUniform1uivEXT, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1uivEXT", e); }
    }

    public void ProgramUniform2uivEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform2uivEXT))
            MH_glProgramUniform2uivEXT.invokeExact(PFN_glProgramUniform2uivEXT, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2uivEXT", e); }
    }

    public void ProgramUniform3uivEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform3uivEXT))
            MH_glProgramUniform3uivEXT.invokeExact(PFN_glProgramUniform3uivEXT, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3uivEXT", e); }
    }

    public void ProgramUniform4uivEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform4uivEXT))
            MH_glProgramUniform4uivEXT.invokeExact(PFN_glProgramUniform4uivEXT, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4uivEXT", e); }
    }

    public void NamedProgramLocalParameters4fvEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedProgramLocalParameters4fvEXT))
            MH_glNamedProgramLocalParameters4fvEXT.invokeExact(PFN_glNamedProgramLocalParameters4fvEXT, program, target, index, count, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedProgramLocalParameters4fvEXT", e); }
    }

    public void NamedProgramLocalParameterI4iEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("GLint") int x, @CType("GLint") int y, @CType("GLint") int z, @CType("GLint") int w) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedProgramLocalParameterI4iEXT))
            MH_glNamedProgramLocalParameterI4iEXT.invokeExact(PFN_glNamedProgramLocalParameterI4iEXT, program, target, index, x, y, z, w);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedProgramLocalParameterI4iEXT", e); }
    }

    public void NamedProgramLocalParameterI4ivEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedProgramLocalParameterI4ivEXT))
            MH_glNamedProgramLocalParameterI4ivEXT.invokeExact(PFN_glNamedProgramLocalParameterI4ivEXT, program, target, index, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedProgramLocalParameterI4ivEXT", e); }
    }

    public void NamedProgramLocalParametersI4ivEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedProgramLocalParametersI4ivEXT))
            MH_glNamedProgramLocalParametersI4ivEXT.invokeExact(PFN_glNamedProgramLocalParametersI4ivEXT, program, target, index, count, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedProgramLocalParametersI4ivEXT", e); }
    }

    public void NamedProgramLocalParameterI4uiEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint") int x, @CType("GLuint") int y, @CType("GLuint") int z, @CType("GLuint") int w) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedProgramLocalParameterI4uiEXT))
            MH_glNamedProgramLocalParameterI4uiEXT.invokeExact(PFN_glNamedProgramLocalParameterI4uiEXT, program, target, index, x, y, z, w);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedProgramLocalParameterI4uiEXT", e); }
    }

    public void NamedProgramLocalParameterI4uivEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("const GLuint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedProgramLocalParameterI4uivEXT))
            MH_glNamedProgramLocalParameterI4uivEXT.invokeExact(PFN_glNamedProgramLocalParameterI4uivEXT, program, target, index, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedProgramLocalParameterI4uivEXT", e); }
    }

    public void NamedProgramLocalParametersI4uivEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("GLsizei") int count, @CType("const GLuint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedProgramLocalParametersI4uivEXT))
            MH_glNamedProgramLocalParametersI4uivEXT.invokeExact(PFN_glNamedProgramLocalParametersI4uivEXT, program, target, index, count, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedProgramLocalParametersI4uivEXT", e); }
    }

    public void GetNamedProgramLocalParameterIivEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetNamedProgramLocalParameterIivEXT))
            MH_glGetNamedProgramLocalParameterIivEXT.invokeExact(PFN_glGetNamedProgramLocalParameterIivEXT, program, target, index, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedProgramLocalParameterIivEXT", e); }
    }

    public void GetNamedProgramLocalParameterIuivEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("GLuint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetNamedProgramLocalParameterIuivEXT))
            MH_glGetNamedProgramLocalParameterIuivEXT.invokeExact(PFN_glGetNamedProgramLocalParameterIuivEXT, program, target, index, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedProgramLocalParameterIuivEXT", e); }
    }

    public void EnableClientStateiEXT(@CType("GLenum") int array, @CType("GLuint") int index) {
        try { if (!Unmarshal.isNullPointer(PFN_glEnableClientStateiEXT))
            MH_glEnableClientStateiEXT.invokeExact(PFN_glEnableClientStateiEXT, array, index);
        }
        catch (Throwable e) { throw new RuntimeException("error in glEnableClientStateiEXT", e); }
    }

    public void DisableClientStateiEXT(@CType("GLenum") int array, @CType("GLuint") int index) {
        try { if (!Unmarshal.isNullPointer(PFN_glDisableClientStateiEXT))
            MH_glDisableClientStateiEXT.invokeExact(PFN_glDisableClientStateiEXT, array, index);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDisableClientStateiEXT", e); }
    }

    public void GetFloati_vEXT(@CType("GLenum") int pname, @CType("GLuint") int index, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetFloati_vEXT))
            MH_glGetFloati_vEXT.invokeExact(PFN_glGetFloati_vEXT, pname, index, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetFloati_vEXT", e); }
    }

    public void GetDoublei_vEXT(@CType("GLenum") int pname, @CType("GLuint") int index, @CType("GLdouble *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetDoublei_vEXT))
            MH_glGetDoublei_vEXT.invokeExact(PFN_glGetDoublei_vEXT, pname, index, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetDoublei_vEXT", e); }
    }

    public void GetPointeri_vEXT(@CType("GLenum") int pname, @CType("GLuint") int index, @CType("void **") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetPointeri_vEXT))
            MH_glGetPointeri_vEXT.invokeExact(PFN_glGetPointeri_vEXT, pname, index, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetPointeri_vEXT", e); }
    }

    public void NamedProgramStringEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLenum") int format, @CType("GLsizei") int len, @CType("const void *") java.lang.foreign.MemorySegment string) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedProgramStringEXT))
            MH_glNamedProgramStringEXT.invokeExact(PFN_glNamedProgramStringEXT, program, target, format, len, string);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedProgramStringEXT", e); }
    }

    public void NamedProgramLocalParameter4dEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z, @CType("GLdouble") double w) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedProgramLocalParameter4dEXT))
            MH_glNamedProgramLocalParameter4dEXT.invokeExact(PFN_glNamedProgramLocalParameter4dEXT, program, target, index, x, y, z, w);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedProgramLocalParameter4dEXT", e); }
    }

    public void NamedProgramLocalParameter4dvEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("const GLdouble *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedProgramLocalParameter4dvEXT))
            MH_glNamedProgramLocalParameter4dvEXT.invokeExact(PFN_glNamedProgramLocalParameter4dvEXT, program, target, index, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedProgramLocalParameter4dvEXT", e); }
    }

    public void NamedProgramLocalParameter4fEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z, @CType("GLfloat") float w) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedProgramLocalParameter4fEXT))
            MH_glNamedProgramLocalParameter4fEXT.invokeExact(PFN_glNamedProgramLocalParameter4fEXT, program, target, index, x, y, z, w);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedProgramLocalParameter4fEXT", e); }
    }

    public void NamedProgramLocalParameter4fvEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("const GLfloat *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedProgramLocalParameter4fvEXT))
            MH_glNamedProgramLocalParameter4fvEXT.invokeExact(PFN_glNamedProgramLocalParameter4fvEXT, program, target, index, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedProgramLocalParameter4fvEXT", e); }
    }

    public void GetNamedProgramLocalParameterdvEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("GLdouble *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetNamedProgramLocalParameterdvEXT))
            MH_glGetNamedProgramLocalParameterdvEXT.invokeExact(PFN_glGetNamedProgramLocalParameterdvEXT, program, target, index, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedProgramLocalParameterdvEXT", e); }
    }

    public void GetNamedProgramLocalParameterfvEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLuint") int index, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetNamedProgramLocalParameterfvEXT))
            MH_glGetNamedProgramLocalParameterfvEXT.invokeExact(PFN_glGetNamedProgramLocalParameterfvEXT, program, target, index, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedProgramLocalParameterfvEXT", e); }
    }

    public void GetNamedProgramivEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetNamedProgramivEXT))
            MH_glGetNamedProgramivEXT.invokeExact(PFN_glGetNamedProgramivEXT, program, target, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedProgramivEXT", e); }
    }

    public void GetNamedProgramStringEXT(@CType("GLuint") int program, @CType("GLenum") int target, @CType("GLenum") int pname, @CType("void*") java.lang.foreign.MemorySegment string) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetNamedProgramStringEXT))
            MH_glGetNamedProgramStringEXT.invokeExact(PFN_glGetNamedProgramStringEXT, program, target, pname, string);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedProgramStringEXT", e); }
    }

    public void NamedRenderbufferStorageEXT(@CType("GLuint") int renderbuffer, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedRenderbufferStorageEXT))
            MH_glNamedRenderbufferStorageEXT.invokeExact(PFN_glNamedRenderbufferStorageEXT, renderbuffer, internalformat, width, height);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedRenderbufferStorageEXT", e); }
    }

    public void GetNamedRenderbufferParameterivEXT(@CType("GLuint") int renderbuffer, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetNamedRenderbufferParameterivEXT))
            MH_glGetNamedRenderbufferParameterivEXT.invokeExact(PFN_glGetNamedRenderbufferParameterivEXT, renderbuffer, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedRenderbufferParameterivEXT", e); }
    }

    public void NamedRenderbufferStorageMultisampleEXT(@CType("GLuint") int renderbuffer, @CType("GLsizei") int samples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedRenderbufferStorageMultisampleEXT))
            MH_glNamedRenderbufferStorageMultisampleEXT.invokeExact(PFN_glNamedRenderbufferStorageMultisampleEXT, renderbuffer, samples, internalformat, width, height);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedRenderbufferStorageMultisampleEXT", e); }
    }

    public void NamedRenderbufferStorageMultisampleCoverageEXT(@CType("GLuint") int renderbuffer, @CType("GLsizei") int coverageSamples, @CType("GLsizei") int colorSamples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedRenderbufferStorageMultisampleCoverageEXT))
            MH_glNamedRenderbufferStorageMultisampleCoverageEXT.invokeExact(PFN_glNamedRenderbufferStorageMultisampleCoverageEXT, renderbuffer, coverageSamples, colorSamples, internalformat, width, height);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedRenderbufferStorageMultisampleCoverageEXT", e); }
    }

    public @CType("GLenum") int CheckNamedFramebufferStatusEXT(@CType("GLuint") int framebuffer, @CType("GLenum") int target) {
        try { if (!Unmarshal.isNullPointer(PFN_glCheckNamedFramebufferStatusEXT))
            return (int) MH_glCheckNamedFramebufferStatusEXT.invokeExact(PFN_glCheckNamedFramebufferStatusEXT, framebuffer, target);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glCheckNamedFramebufferStatusEXT", e); }
    }

    public void NamedFramebufferTexture1DEXT(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLenum") int textarget, @CType("GLuint") int texture, @CType("GLint") int level) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedFramebufferTexture1DEXT))
            MH_glNamedFramebufferTexture1DEXT.invokeExact(PFN_glNamedFramebufferTexture1DEXT, framebuffer, attachment, textarget, texture, level);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferTexture1DEXT", e); }
    }

    public void NamedFramebufferTexture2DEXT(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLenum") int textarget, @CType("GLuint") int texture, @CType("GLint") int level) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedFramebufferTexture2DEXT))
            MH_glNamedFramebufferTexture2DEXT.invokeExact(PFN_glNamedFramebufferTexture2DEXT, framebuffer, attachment, textarget, texture, level);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferTexture2DEXT", e); }
    }

    public void NamedFramebufferTexture3DEXT(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLenum") int textarget, @CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int zoffset) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedFramebufferTexture3DEXT))
            MH_glNamedFramebufferTexture3DEXT.invokeExact(PFN_glNamedFramebufferTexture3DEXT, framebuffer, attachment, textarget, texture, level, zoffset);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferTexture3DEXT", e); }
    }

    public void NamedFramebufferRenderbufferEXT(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLenum") int renderbuffertarget, @CType("GLuint") int renderbuffer) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedFramebufferRenderbufferEXT))
            MH_glNamedFramebufferRenderbufferEXT.invokeExact(PFN_glNamedFramebufferRenderbufferEXT, framebuffer, attachment, renderbuffertarget, renderbuffer);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferRenderbufferEXT", e); }
    }

    public void GetNamedFramebufferAttachmentParameterivEXT(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetNamedFramebufferAttachmentParameterivEXT))
            MH_glGetNamedFramebufferAttachmentParameterivEXT.invokeExact(PFN_glGetNamedFramebufferAttachmentParameterivEXT, framebuffer, attachment, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedFramebufferAttachmentParameterivEXT", e); }
    }

    public void GenerateTextureMipmapEXT(@CType("GLuint") int texture, @CType("GLenum") int target) {
        try { if (!Unmarshal.isNullPointer(PFN_glGenerateTextureMipmapEXT))
            MH_glGenerateTextureMipmapEXT.invokeExact(PFN_glGenerateTextureMipmapEXT, texture, target);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGenerateTextureMipmapEXT", e); }
    }

    public void GenerateMultiTexMipmapEXT(@CType("GLenum") int texunit, @CType("GLenum") int target) {
        try { if (!Unmarshal.isNullPointer(PFN_glGenerateMultiTexMipmapEXT))
            MH_glGenerateMultiTexMipmapEXT.invokeExact(PFN_glGenerateMultiTexMipmapEXT, texunit, target);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGenerateMultiTexMipmapEXT", e); }
    }

    public void FramebufferDrawBufferEXT(@CType("GLuint") int framebuffer, @CType("GLenum") int mode) {
        try { if (!Unmarshal.isNullPointer(PFN_glFramebufferDrawBufferEXT))
            MH_glFramebufferDrawBufferEXT.invokeExact(PFN_glFramebufferDrawBufferEXT, framebuffer, mode);
        }
        catch (Throwable e) { throw new RuntimeException("error in glFramebufferDrawBufferEXT", e); }
    }

    public void FramebufferDrawBuffersEXT(@CType("GLuint") int framebuffer, @CType("GLsizei") int n, @CType("const GLenum *") java.lang.foreign.MemorySegment bufs) {
        try { if (!Unmarshal.isNullPointer(PFN_glFramebufferDrawBuffersEXT))
            MH_glFramebufferDrawBuffersEXT.invokeExact(PFN_glFramebufferDrawBuffersEXT, framebuffer, n, bufs);
        }
        catch (Throwable e) { throw new RuntimeException("error in glFramebufferDrawBuffersEXT", e); }
    }

    public void FramebufferReadBufferEXT(@CType("GLuint") int framebuffer, @CType("GLenum") int mode) {
        try { if (!Unmarshal.isNullPointer(PFN_glFramebufferReadBufferEXT))
            MH_glFramebufferReadBufferEXT.invokeExact(PFN_glFramebufferReadBufferEXT, framebuffer, mode);
        }
        catch (Throwable e) { throw new RuntimeException("error in glFramebufferReadBufferEXT", e); }
    }

    public void GetFramebufferParameterivEXT(@CType("GLuint") int framebuffer, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetFramebufferParameterivEXT))
            MH_glGetFramebufferParameterivEXT.invokeExact(PFN_glGetFramebufferParameterivEXT, framebuffer, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetFramebufferParameterivEXT", e); }
    }

    public void NamedCopyBufferSubDataEXT(@CType("GLuint") int readBuffer, @CType("GLuint") int writeBuffer, @CType("GLintptr") long readOffset, @CType("GLintptr") long writeOffset, @CType("GLsizeiptr") long size) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedCopyBufferSubDataEXT))
            MH_glNamedCopyBufferSubDataEXT.invokeExact(PFN_glNamedCopyBufferSubDataEXT, readBuffer, writeBuffer, readOffset, writeOffset, size);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedCopyBufferSubDataEXT", e); }
    }

    public void NamedFramebufferTextureEXT(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLuint") int texture, @CType("GLint") int level) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedFramebufferTextureEXT))
            MH_glNamedFramebufferTextureEXT.invokeExact(PFN_glNamedFramebufferTextureEXT, framebuffer, attachment, texture, level);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferTextureEXT", e); }
    }

    public void NamedFramebufferTextureLayerEXT(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int layer) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedFramebufferTextureLayerEXT))
            MH_glNamedFramebufferTextureLayerEXT.invokeExact(PFN_glNamedFramebufferTextureLayerEXT, framebuffer, attachment, texture, level, layer);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferTextureLayerEXT", e); }
    }

    public void NamedFramebufferTextureFaceEXT(@CType("GLuint") int framebuffer, @CType("GLenum") int attachment, @CType("GLuint") int texture, @CType("GLint") int level, @CType("GLenum") int face) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedFramebufferTextureFaceEXT))
            MH_glNamedFramebufferTextureFaceEXT.invokeExact(PFN_glNamedFramebufferTextureFaceEXT, framebuffer, attachment, texture, level, face);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferTextureFaceEXT", e); }
    }

    public void TextureRenderbufferEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLuint") int renderbuffer) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureRenderbufferEXT))
            MH_glTextureRenderbufferEXT.invokeExact(PFN_glTextureRenderbufferEXT, texture, target, renderbuffer);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureRenderbufferEXT", e); }
    }

    public void MultiTexRenderbufferEXT(@CType("GLenum") int texunit, @CType("GLenum") int target, @CType("GLuint") int renderbuffer) {
        try { if (!Unmarshal.isNullPointer(PFN_glMultiTexRenderbufferEXT))
            MH_glMultiTexRenderbufferEXT.invokeExact(PFN_glMultiTexRenderbufferEXT, texunit, target, renderbuffer);
        }
        catch (Throwable e) { throw new RuntimeException("error in glMultiTexRenderbufferEXT", e); }
    }

    public void VertexArrayVertexOffsetEXT(@CType("GLuint") int vaobj, @CType("GLuint") int buffer, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLintptr") long offset) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexArrayVertexOffsetEXT))
            MH_glVertexArrayVertexOffsetEXT.invokeExact(PFN_glVertexArrayVertexOffsetEXT, vaobj, buffer, size, type, stride, offset);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayVertexOffsetEXT", e); }
    }

    public void VertexArrayColorOffsetEXT(@CType("GLuint") int vaobj, @CType("GLuint") int buffer, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLintptr") long offset) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexArrayColorOffsetEXT))
            MH_glVertexArrayColorOffsetEXT.invokeExact(PFN_glVertexArrayColorOffsetEXT, vaobj, buffer, size, type, stride, offset);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayColorOffsetEXT", e); }
    }

    public void VertexArrayEdgeFlagOffsetEXT(@CType("GLuint") int vaobj, @CType("GLuint") int buffer, @CType("GLsizei") int stride, @CType("GLintptr") long offset) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexArrayEdgeFlagOffsetEXT))
            MH_glVertexArrayEdgeFlagOffsetEXT.invokeExact(PFN_glVertexArrayEdgeFlagOffsetEXT, vaobj, buffer, stride, offset);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayEdgeFlagOffsetEXT", e); }
    }

    public void VertexArrayIndexOffsetEXT(@CType("GLuint") int vaobj, @CType("GLuint") int buffer, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLintptr") long offset) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexArrayIndexOffsetEXT))
            MH_glVertexArrayIndexOffsetEXT.invokeExact(PFN_glVertexArrayIndexOffsetEXT, vaobj, buffer, type, stride, offset);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayIndexOffsetEXT", e); }
    }

    public void VertexArrayNormalOffsetEXT(@CType("GLuint") int vaobj, @CType("GLuint") int buffer, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLintptr") long offset) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexArrayNormalOffsetEXT))
            MH_glVertexArrayNormalOffsetEXT.invokeExact(PFN_glVertexArrayNormalOffsetEXT, vaobj, buffer, type, stride, offset);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayNormalOffsetEXT", e); }
    }

    public void VertexArrayTexCoordOffsetEXT(@CType("GLuint") int vaobj, @CType("GLuint") int buffer, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLintptr") long offset) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexArrayTexCoordOffsetEXT))
            MH_glVertexArrayTexCoordOffsetEXT.invokeExact(PFN_glVertexArrayTexCoordOffsetEXT, vaobj, buffer, size, type, stride, offset);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayTexCoordOffsetEXT", e); }
    }

    public void VertexArrayMultiTexCoordOffsetEXT(@CType("GLuint") int vaobj, @CType("GLuint") int buffer, @CType("GLenum") int texunit, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLintptr") long offset) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexArrayMultiTexCoordOffsetEXT))
            MH_glVertexArrayMultiTexCoordOffsetEXT.invokeExact(PFN_glVertexArrayMultiTexCoordOffsetEXT, vaobj, buffer, texunit, size, type, stride, offset);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayMultiTexCoordOffsetEXT", e); }
    }

    public void VertexArrayFogCoordOffsetEXT(@CType("GLuint") int vaobj, @CType("GLuint") int buffer, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLintptr") long offset) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexArrayFogCoordOffsetEXT))
            MH_glVertexArrayFogCoordOffsetEXT.invokeExact(PFN_glVertexArrayFogCoordOffsetEXT, vaobj, buffer, type, stride, offset);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayFogCoordOffsetEXT", e); }
    }

    public void VertexArraySecondaryColorOffsetEXT(@CType("GLuint") int vaobj, @CType("GLuint") int buffer, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLintptr") long offset) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexArraySecondaryColorOffsetEXT))
            MH_glVertexArraySecondaryColorOffsetEXT.invokeExact(PFN_glVertexArraySecondaryColorOffsetEXT, vaobj, buffer, size, type, stride, offset);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArraySecondaryColorOffsetEXT", e); }
    }

    public void VertexArrayVertexAttribOffsetEXT(@CType("GLuint") int vaobj, @CType("GLuint") int buffer, @CType("GLuint") int index, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("GLsizei") int stride, @CType("GLintptr") long offset) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexArrayVertexAttribOffsetEXT))
            MH_glVertexArrayVertexAttribOffsetEXT.invokeExact(PFN_glVertexArrayVertexAttribOffsetEXT, vaobj, buffer, index, size, type, normalized, stride, offset);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayVertexAttribOffsetEXT", e); }
    }

    public void VertexArrayVertexAttribIOffsetEXT(@CType("GLuint") int vaobj, @CType("GLuint") int buffer, @CType("GLuint") int index, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLintptr") long offset) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexArrayVertexAttribIOffsetEXT))
            MH_glVertexArrayVertexAttribIOffsetEXT.invokeExact(PFN_glVertexArrayVertexAttribIOffsetEXT, vaobj, buffer, index, size, type, stride, offset);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayVertexAttribIOffsetEXT", e); }
    }

    public void EnableVertexArrayEXT(@CType("GLuint") int vaobj, @CType("GLenum") int array) {
        try { if (!Unmarshal.isNullPointer(PFN_glEnableVertexArrayEXT))
            MH_glEnableVertexArrayEXT.invokeExact(PFN_glEnableVertexArrayEXT, vaobj, array);
        }
        catch (Throwable e) { throw new RuntimeException("error in glEnableVertexArrayEXT", e); }
    }

    public void DisableVertexArrayEXT(@CType("GLuint") int vaobj, @CType("GLenum") int array) {
        try { if (!Unmarshal.isNullPointer(PFN_glDisableVertexArrayEXT))
            MH_glDisableVertexArrayEXT.invokeExact(PFN_glDisableVertexArrayEXT, vaobj, array);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDisableVertexArrayEXT", e); }
    }

    public void EnableVertexArrayAttribEXT(@CType("GLuint") int vaobj, @CType("GLuint") int index) {
        try { if (!Unmarshal.isNullPointer(PFN_glEnableVertexArrayAttribEXT))
            MH_glEnableVertexArrayAttribEXT.invokeExact(PFN_glEnableVertexArrayAttribEXT, vaobj, index);
        }
        catch (Throwable e) { throw new RuntimeException("error in glEnableVertexArrayAttribEXT", e); }
    }

    public void DisableVertexArrayAttribEXT(@CType("GLuint") int vaobj, @CType("GLuint") int index) {
        try { if (!Unmarshal.isNullPointer(PFN_glDisableVertexArrayAttribEXT))
            MH_glDisableVertexArrayAttribEXT.invokeExact(PFN_glDisableVertexArrayAttribEXT, vaobj, index);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDisableVertexArrayAttribEXT", e); }
    }

    public void GetVertexArrayIntegervEXT(@CType("GLuint") int vaobj, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment param) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetVertexArrayIntegervEXT))
            MH_glGetVertexArrayIntegervEXT.invokeExact(PFN_glGetVertexArrayIntegervEXT, vaobj, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexArrayIntegervEXT", e); }
    }

    public void GetVertexArrayPointervEXT(@CType("GLuint") int vaobj, @CType("GLenum") int pname, @CType("void **") java.lang.foreign.MemorySegment param) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetVertexArrayPointervEXT))
            MH_glGetVertexArrayPointervEXT.invokeExact(PFN_glGetVertexArrayPointervEXT, vaobj, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexArrayPointervEXT", e); }
    }

    public void GetVertexArrayIntegeri_vEXT(@CType("GLuint") int vaobj, @CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment param) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetVertexArrayIntegeri_vEXT))
            MH_glGetVertexArrayIntegeri_vEXT.invokeExact(PFN_glGetVertexArrayIntegeri_vEXT, vaobj, index, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexArrayIntegeri_vEXT", e); }
    }

    public void GetVertexArrayPointeri_vEXT(@CType("GLuint") int vaobj, @CType("GLuint") int index, @CType("GLenum") int pname, @CType("void **") java.lang.foreign.MemorySegment param) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetVertexArrayPointeri_vEXT))
            MH_glGetVertexArrayPointeri_vEXT.invokeExact(PFN_glGetVertexArrayPointeri_vEXT, vaobj, index, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetVertexArrayPointeri_vEXT", e); }
    }

    public @CType("void*") java.lang.foreign.MemorySegment MapNamedBufferRangeEXT(@CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long length, @CType("GLbitfield") int access) {
        try { if (!Unmarshal.isNullPointer(PFN_glMapNamedBufferRangeEXT))
            return (java.lang.foreign.MemorySegment) MH_glMapNamedBufferRangeEXT.invokeExact(PFN_glMapNamedBufferRangeEXT, buffer, offset, length, access);
            else return MemorySegment.NULL;
        }
        catch (Throwable e) { throw new RuntimeException("error in glMapNamedBufferRangeEXT", e); }
    }

    public void FlushMappedNamedBufferRangeEXT(@CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long length) {
        try { if (!Unmarshal.isNullPointer(PFN_glFlushMappedNamedBufferRangeEXT))
            MH_glFlushMappedNamedBufferRangeEXT.invokeExact(PFN_glFlushMappedNamedBufferRangeEXT, buffer, offset, length);
        }
        catch (Throwable e) { throw new RuntimeException("error in glFlushMappedNamedBufferRangeEXT", e); }
    }

    public void NamedBufferStorageEXT(@CType("GLuint") int buffer, @CType("GLsizeiptr") long size, @CType("const void *") java.lang.foreign.MemorySegment data, @CType("GLbitfield") int flags) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedBufferStorageEXT))
            MH_glNamedBufferStorageEXT.invokeExact(PFN_glNamedBufferStorageEXT, buffer, size, data, flags);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedBufferStorageEXT", e); }
    }

    public void ClearNamedBufferDataEXT(@CType("GLuint") int buffer, @CType("GLenum") int internalformat, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glClearNamedBufferDataEXT))
            MH_glClearNamedBufferDataEXT.invokeExact(PFN_glClearNamedBufferDataEXT, buffer, internalformat, format, type, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glClearNamedBufferDataEXT", e); }
    }

    public void ClearNamedBufferSubDataEXT(@CType("GLuint") int buffer, @CType("GLenum") int internalformat, @CType("GLsizeiptr") long offset, @CType("GLsizeiptr") long size, @CType("GLenum") int format, @CType("GLenum") int type, @CType("const void *") java.lang.foreign.MemorySegment data) {
        try { if (!Unmarshal.isNullPointer(PFN_glClearNamedBufferSubDataEXT))
            MH_glClearNamedBufferSubDataEXT.invokeExact(PFN_glClearNamedBufferSubDataEXT, buffer, internalformat, offset, size, format, type, data);
        }
        catch (Throwable e) { throw new RuntimeException("error in glClearNamedBufferSubDataEXT", e); }
    }

    public void NamedFramebufferParameteriEXT(@CType("GLuint") int framebuffer, @CType("GLenum") int pname, @CType("GLint") int param) {
        try { if (!Unmarshal.isNullPointer(PFN_glNamedFramebufferParameteriEXT))
            MH_glNamedFramebufferParameteriEXT.invokeExact(PFN_glNamedFramebufferParameteriEXT, framebuffer, pname, param);
        }
        catch (Throwable e) { throw new RuntimeException("error in glNamedFramebufferParameteriEXT", e); }
    }

    public void GetNamedFramebufferParameterivEXT(@CType("GLuint") int framebuffer, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetNamedFramebufferParameterivEXT))
            MH_glGetNamedFramebufferParameterivEXT.invokeExact(PFN_glGetNamedFramebufferParameterivEXT, framebuffer, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedFramebufferParameterivEXT", e); }
    }

    public void ProgramUniform1dEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLdouble") double x) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform1dEXT))
            MH_glProgramUniform1dEXT.invokeExact(PFN_glProgramUniform1dEXT, program, location, x);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1dEXT", e); }
    }

    public void ProgramUniform2dEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLdouble") double x, @CType("GLdouble") double y) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform2dEXT))
            MH_glProgramUniform2dEXT.invokeExact(PFN_glProgramUniform2dEXT, program, location, x, y);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2dEXT", e); }
    }

    public void ProgramUniform3dEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform3dEXT))
            MH_glProgramUniform3dEXT.invokeExact(PFN_glProgramUniform3dEXT, program, location, x, y, z);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3dEXT", e); }
    }

    public void ProgramUniform4dEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z, @CType("GLdouble") double w) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform4dEXT))
            MH_glProgramUniform4dEXT.invokeExact(PFN_glProgramUniform4dEXT, program, location, x, y, z, w);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4dEXT", e); }
    }

    public void ProgramUniform1dvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform1dvEXT))
            MH_glProgramUniform1dvEXT.invokeExact(PFN_glProgramUniform1dvEXT, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform1dvEXT", e); }
    }

    public void ProgramUniform2dvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform2dvEXT))
            MH_glProgramUniform2dvEXT.invokeExact(PFN_glProgramUniform2dvEXT, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform2dvEXT", e); }
    }

    public void ProgramUniform3dvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform3dvEXT))
            MH_glProgramUniform3dvEXT.invokeExact(PFN_glProgramUniform3dvEXT, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform3dvEXT", e); }
    }

    public void ProgramUniform4dvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniform4dvEXT))
            MH_glProgramUniform4dvEXT.invokeExact(PFN_glProgramUniform4dvEXT, program, location, count, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniform4dvEXT", e); }
    }

    public void ProgramUniformMatrix2dvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix2dvEXT))
            MH_glProgramUniformMatrix2dvEXT.invokeExact(PFN_glProgramUniformMatrix2dvEXT, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2dvEXT", e); }
    }

    public void ProgramUniformMatrix3dvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix3dvEXT))
            MH_glProgramUniformMatrix3dvEXT.invokeExact(PFN_glProgramUniformMatrix3dvEXT, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3dvEXT", e); }
    }

    public void ProgramUniformMatrix4dvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix4dvEXT))
            MH_glProgramUniformMatrix4dvEXT.invokeExact(PFN_glProgramUniformMatrix4dvEXT, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4dvEXT", e); }
    }

    public void ProgramUniformMatrix2x3dvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix2x3dvEXT))
            MH_glProgramUniformMatrix2x3dvEXT.invokeExact(PFN_glProgramUniformMatrix2x3dvEXT, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2x3dvEXT", e); }
    }

    public void ProgramUniformMatrix2x4dvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix2x4dvEXT))
            MH_glProgramUniformMatrix2x4dvEXT.invokeExact(PFN_glProgramUniformMatrix2x4dvEXT, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix2x4dvEXT", e); }
    }

    public void ProgramUniformMatrix3x2dvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix3x2dvEXT))
            MH_glProgramUniformMatrix3x2dvEXT.invokeExact(PFN_glProgramUniformMatrix3x2dvEXT, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3x2dvEXT", e); }
    }

    public void ProgramUniformMatrix3x4dvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix3x4dvEXT))
            MH_glProgramUniformMatrix3x4dvEXT.invokeExact(PFN_glProgramUniformMatrix3x4dvEXT, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix3x4dvEXT", e); }
    }

    public void ProgramUniformMatrix4x2dvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix4x2dvEXT))
            MH_glProgramUniformMatrix4x2dvEXT.invokeExact(PFN_glProgramUniformMatrix4x2dvEXT, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4x2dvEXT", e); }
    }

    public void ProgramUniformMatrix4x3dvEXT(@CType("GLuint") int program, @CType("GLint") int location, @CType("GLsizei") int count, @CType("GLboolean") boolean transpose, @CType("const GLdouble *") java.lang.foreign.MemorySegment value) {
        try { if (!Unmarshal.isNullPointer(PFN_glProgramUniformMatrix4x3dvEXT))
            MH_glProgramUniformMatrix4x3dvEXT.invokeExact(PFN_glProgramUniformMatrix4x3dvEXT, program, location, count, transpose, value);
        }
        catch (Throwable e) { throw new RuntimeException("error in glProgramUniformMatrix4x3dvEXT", e); }
    }

    public void TextureBufferRangeEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizeiptr") long size) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureBufferRangeEXT))
            MH_glTextureBufferRangeEXT.invokeExact(PFN_glTextureBufferRangeEXT, texture, target, internalformat, buffer, offset, size);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureBufferRangeEXT", e); }
    }

    public void TextureStorage1DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureStorage1DEXT))
            MH_glTextureStorage1DEXT.invokeExact(PFN_glTextureStorage1DEXT, texture, target, levels, internalformat, width);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorage1DEXT", e); }
    }

    public void TextureStorage2DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureStorage2DEXT))
            MH_glTextureStorage2DEXT.invokeExact(PFN_glTextureStorage2DEXT, texture, target, levels, internalformat, width, height);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorage2DEXT", e); }
    }

    public void TextureStorage3DEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLsizei") int levels, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureStorage3DEXT))
            MH_glTextureStorage3DEXT.invokeExact(PFN_glTextureStorage3DEXT, texture, target, levels, internalformat, width, height, depth);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorage3DEXT", e); }
    }

    public void TextureStorage2DMultisampleEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLsizei") int samples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLboolean") boolean fixedsamplelocations) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureStorage2DMultisampleEXT))
            MH_glTextureStorage2DMultisampleEXT.invokeExact(PFN_glTextureStorage2DMultisampleEXT, texture, target, samples, internalformat, width, height, fixedsamplelocations);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorage2DMultisampleEXT", e); }
    }

    public void TextureStorage3DMultisampleEXT(@CType("GLuint") int texture, @CType("GLenum") int target, @CType("GLsizei") int samples, @CType("GLenum") int internalformat, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLboolean") boolean fixedsamplelocations) {
        try { if (!Unmarshal.isNullPointer(PFN_glTextureStorage3DMultisampleEXT))
            MH_glTextureStorage3DMultisampleEXT.invokeExact(PFN_glTextureStorage3DMultisampleEXT, texture, target, samples, internalformat, width, height, depth, fixedsamplelocations);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTextureStorage3DMultisampleEXT", e); }
    }

    public void VertexArrayBindVertexBufferEXT(@CType("GLuint") int vaobj, @CType("GLuint") int bindingindex, @CType("GLuint") int buffer, @CType("GLintptr") long offset, @CType("GLsizei") int stride) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexArrayBindVertexBufferEXT))
            MH_glVertexArrayBindVertexBufferEXT.invokeExact(PFN_glVertexArrayBindVertexBufferEXT, vaobj, bindingindex, buffer, offset, stride);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayBindVertexBufferEXT", e); }
    }

    public void VertexArrayVertexAttribFormatEXT(@CType("GLuint") int vaobj, @CType("GLuint") int attribindex, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLboolean") boolean normalized, @CType("GLuint") int relativeoffset) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexArrayVertexAttribFormatEXT))
            MH_glVertexArrayVertexAttribFormatEXT.invokeExact(PFN_glVertexArrayVertexAttribFormatEXT, vaobj, attribindex, size, type, normalized, relativeoffset);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayVertexAttribFormatEXT", e); }
    }

    public void VertexArrayVertexAttribIFormatEXT(@CType("GLuint") int vaobj, @CType("GLuint") int attribindex, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLuint") int relativeoffset) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexArrayVertexAttribIFormatEXT))
            MH_glVertexArrayVertexAttribIFormatEXT.invokeExact(PFN_glVertexArrayVertexAttribIFormatEXT, vaobj, attribindex, size, type, relativeoffset);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayVertexAttribIFormatEXT", e); }
    }

    public void VertexArrayVertexAttribLFormatEXT(@CType("GLuint") int vaobj, @CType("GLuint") int attribindex, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLuint") int relativeoffset) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexArrayVertexAttribLFormatEXT))
            MH_glVertexArrayVertexAttribLFormatEXT.invokeExact(PFN_glVertexArrayVertexAttribLFormatEXT, vaobj, attribindex, size, type, relativeoffset);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayVertexAttribLFormatEXT", e); }
    }

    public void VertexArrayVertexAttribBindingEXT(@CType("GLuint") int vaobj, @CType("GLuint") int attribindex, @CType("GLuint") int bindingindex) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexArrayVertexAttribBindingEXT))
            MH_glVertexArrayVertexAttribBindingEXT.invokeExact(PFN_glVertexArrayVertexAttribBindingEXT, vaobj, attribindex, bindingindex);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayVertexAttribBindingEXT", e); }
    }

    public void VertexArrayVertexBindingDivisorEXT(@CType("GLuint") int vaobj, @CType("GLuint") int bindingindex, @CType("GLuint") int divisor) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexArrayVertexBindingDivisorEXT))
            MH_glVertexArrayVertexBindingDivisorEXT.invokeExact(PFN_glVertexArrayVertexBindingDivisorEXT, vaobj, bindingindex, divisor);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayVertexBindingDivisorEXT", e); }
    }

    public void VertexArrayVertexAttribLOffsetEXT(@CType("GLuint") int vaobj, @CType("GLuint") int buffer, @CType("GLuint") int index, @CType("GLint") int size, @CType("GLenum") int type, @CType("GLsizei") int stride, @CType("GLintptr") long offset) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexArrayVertexAttribLOffsetEXT))
            MH_glVertexArrayVertexAttribLOffsetEXT.invokeExact(PFN_glVertexArrayVertexAttribLOffsetEXT, vaobj, buffer, index, size, type, stride, offset);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayVertexAttribLOffsetEXT", e); }
    }

    public void TexturePageCommitmentEXT(@CType("GLuint") int texture, @CType("GLint") int level, @CType("GLint") int xoffset, @CType("GLint") int yoffset, @CType("GLint") int zoffset, @CType("GLsizei") int width, @CType("GLsizei") int height, @CType("GLsizei") int depth, @CType("GLboolean") boolean commit) {
        try { if (!Unmarshal.isNullPointer(PFN_glTexturePageCommitmentEXT))
            MH_glTexturePageCommitmentEXT.invokeExact(PFN_glTexturePageCommitmentEXT, texture, level, xoffset, yoffset, zoffset, width, height, depth, commit);
        }
        catch (Throwable e) { throw new RuntimeException("error in glTexturePageCommitmentEXT", e); }
    }

    public void VertexArrayVertexAttribDivisorEXT(@CType("GLuint") int vaobj, @CType("GLuint") int index, @CType("GLuint") int divisor) {
        try { if (!Unmarshal.isNullPointer(PFN_glVertexArrayVertexAttribDivisorEXT))
            MH_glVertexArrayVertexAttribDivisorEXT.invokeExact(PFN_glVertexArrayVertexAttribDivisorEXT, vaobj, index, divisor);
        }
        catch (Throwable e) { throw new RuntimeException("error in glVertexArrayVertexAttribDivisorEXT", e); }
    }

}

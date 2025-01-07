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
package overrungl.opengl.nv;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVInternalformatSampleQuery {
    public static final int GL_RENDERBUFFER = 0x8D41;
    public static final int GL_TEXTURE_2D_MULTISAMPLE = 0x9100;
    public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9102;
    public static final int GL_MULTISAMPLES_NV = 0x9371;
    public static final int GL_SUPERSAMPLE_SCALE_X_NV = 0x9372;
    public static final int GL_SUPERSAMPLE_SCALE_Y_NV = 0x9373;
    public static final int GL_CONFORMANT_NV = 0x9374;
    public static final MethodHandle MH_glGetInternalformatSampleivNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetInternalformatSampleivNV;

    public GLNVInternalformatSampleQuery(overrungl.opengl.GLLoadFunc func) {
        PFN_glGetInternalformatSampleivNV = func.invoke("glGetInternalformatSampleivNV");
    }

    public void GetInternalformatSampleivNV(@CType("GLenum") int target, @CType("GLenum") int internalformat, @CType("GLsizei") int samples, @CType("GLenum") int pname, @CType("GLsizei") int count, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetInternalformatSampleivNV)) { try {
            MH_glGetInternalformatSampleivNV.invokeExact(PFN_glGetInternalformatSampleivNV, target, internalformat, samples, pname, count, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetInternalformatSampleivNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetInternalformatSampleivNV"); }
    }

}

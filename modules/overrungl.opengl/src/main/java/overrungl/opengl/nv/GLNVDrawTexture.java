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

public final class GLNVDrawTexture {
    public static final MethodHandle MH_glDrawTextureNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glDrawTextureNV;

    public GLNVDrawTexture(overrungl.opengl.GLLoadFunc func) {
        PFN_glDrawTextureNV = func.invoke("glDrawTextureNV");
    }

    public void DrawTextureNV(@CType("GLuint") int texture, @CType("GLuint") int sampler, @CType("GLfloat") float x0, @CType("GLfloat") float y0, @CType("GLfloat") float x1, @CType("GLfloat") float y1, @CType("GLfloat") float z, @CType("GLfloat") float s0, @CType("GLfloat") float t0, @CType("GLfloat") float s1, @CType("GLfloat") float t1) {
        try { if (!Unmarshal.isNullPointer(PFN_glDrawTextureNV))
            MH_glDrawTextureNV.invokeExact(PFN_glDrawTextureNV, texture, sampler, x0, y0, x1, y1, z, s0, t0, s1, t1);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDrawTextureNV", e); }
    }

}

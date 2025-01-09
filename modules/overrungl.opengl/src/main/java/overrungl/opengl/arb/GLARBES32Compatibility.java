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
package overrungl.opengl.arb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBES32Compatibility {
    public static final int GL_PRIMITIVE_BOUNDING_BOX_ARB = 0x92BE;
    public static final int GL_MULTISAMPLE_LINE_WIDTH_RANGE_ARB = 0x9381;
    public static final int GL_MULTISAMPLE_LINE_WIDTH_GRANULARITY_ARB = 0x9382;
    public static final MethodHandle MH_glPrimitiveBoundingBoxARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glPrimitiveBoundingBoxARB;

    public GLARBES32Compatibility(overrungl.opengl.GLLoadFunc func) {
        PFN_glPrimitiveBoundingBoxARB = func.invoke("glPrimitiveBoundingBoxARB", "glPrimitiveBoundingBox");
    }

    public void PrimitiveBoundingBoxARB(@CType("GLfloat") float minX, @CType("GLfloat") float minY, @CType("GLfloat") float minZ, @CType("GLfloat") float minW, @CType("GLfloat") float maxX, @CType("GLfloat") float maxY, @CType("GLfloat") float maxZ, @CType("GLfloat") float maxW) {
        if (Unmarshal.isNullPointer(PFN_glPrimitiveBoundingBoxARB)) throw new SymbolNotFoundError("Symbol not found: glPrimitiveBoundingBoxARB");
        try { MH_glPrimitiveBoundingBoxARB.invokeExact(PFN_glPrimitiveBoundingBoxARB, minX, minY, minZ, minW, maxX, maxY, maxZ, maxW); }
        catch (Throwable e) { throw new RuntimeException("error in glPrimitiveBoundingBoxARB", e); }
    }

}

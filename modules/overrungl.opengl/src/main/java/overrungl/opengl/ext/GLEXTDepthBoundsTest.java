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

public final class GLEXTDepthBoundsTest {
    public static final int GL_DEPTH_BOUNDS_TEST_EXT = 0x8890;
    public static final int GL_DEPTH_BOUNDS_EXT = 0x8891;
    public static final MethodHandle MH_glDepthBoundsEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glDepthBoundsEXT;

    public GLEXTDepthBoundsTest(overrungl.opengl.GLLoadFunc func) {
        PFN_glDepthBoundsEXT = func.invoke("glDepthBoundsEXT");
    }

    public void DepthBoundsEXT(@CType("GLclampd") double zmin, @CType("GLclampd") double zmax) {
        if (Unmarshal.isNullPointer(PFN_glDepthBoundsEXT)) throw new SymbolNotFoundError("Symbol not found: glDepthBoundsEXT");
        try { MH_glDepthBoundsEXT.invokeExact(PFN_glDepthBoundsEXT, zmin, zmax); }
        catch (Throwable e) { throw new RuntimeException("error in glDepthBoundsEXT", e); }
    }

}

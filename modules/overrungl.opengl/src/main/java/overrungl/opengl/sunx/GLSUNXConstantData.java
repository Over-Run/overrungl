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
package overrungl.opengl.sunx;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLSUNXConstantData {
    public static final int GL_UNPACK_CONSTANT_DATA_SUNX = 0x81D5;
    public static final int GL_TEXTURE_CONSTANT_DATA_SUNX = 0x81D6;
    public static final MethodHandle MH_glFinishTextureSUNX = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public final MemorySegment PFN_glFinishTextureSUNX;

    public GLSUNXConstantData(overrungl.opengl.GLLoadFunc func) {
        PFN_glFinishTextureSUNX = func.invoke("glFinishTextureSUNX");
    }

    public void FinishTextureSUNX() {
        if (Unmarshal.isNullPointer(PFN_glFinishTextureSUNX)) throw new SymbolNotFoundError("Symbol not found: glFinishTextureSUNX");
        try { MH_glFinishTextureSUNX.invokeExact(PFN_glFinishTextureSUNX); }
        catch (Throwable e) { throw new RuntimeException("error in glFinishTextureSUNX", e); }
    }

}

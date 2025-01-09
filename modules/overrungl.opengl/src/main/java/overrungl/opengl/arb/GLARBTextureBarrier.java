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

public final class GLARBTextureBarrier {
    public static final MethodHandle MH_glTextureBarrier = RuntimeHelper.downcall(FunctionDescriptor.ofVoid());
    public final MemorySegment PFN_glTextureBarrier;

    public GLARBTextureBarrier(overrungl.opengl.GLLoadFunc func) {
        PFN_glTextureBarrier = func.invoke("glTextureBarrier");
    }

    public void TextureBarrier() {
        if (Unmarshal.isNullPointer(PFN_glTextureBarrier)) throw new SymbolNotFoundError("Symbol not found: glTextureBarrier");
        try { MH_glTextureBarrier.invokeExact(PFN_glTextureBarrier); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureBarrier", e); }
    }

}

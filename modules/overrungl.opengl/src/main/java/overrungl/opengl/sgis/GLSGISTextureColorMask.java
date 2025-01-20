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
package overrungl.opengl.sgis;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLSGISTextureColorMask {
    public static final int GL_TEXTURE_COLOR_WRITEMASK_SGIS = 0x81EF;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glTextureColorMaskSGIS = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN));
        public final MemorySegment PFN_glTextureColorMaskSGIS;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glTextureColorMaskSGIS = func.invoke("glTextureColorMaskSGIS");
        }
    }

    public GLSGISTextureColorMask(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void TextureColorMaskSGIS(@CType("GLboolean") boolean red, @CType("GLboolean") boolean green, @CType("GLboolean") boolean blue, @CType("GLboolean") boolean alpha) {
        if (Unmarshal.isNullPointer(handles.PFN_glTextureColorMaskSGIS)) throw new SymbolNotFoundError("Symbol not found: glTextureColorMaskSGIS");
        try { Handles.MH_glTextureColorMaskSGIS.invokeExact(handles.PFN_glTextureColorMaskSGIS, red, green, blue, alpha); }
        catch (Throwable e) { throw new RuntimeException("error in glTextureColorMaskSGIS", e); }
    }

}

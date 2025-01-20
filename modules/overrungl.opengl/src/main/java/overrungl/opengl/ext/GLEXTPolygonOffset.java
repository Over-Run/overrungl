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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTPolygonOffset {
    public static final int GL_POLYGON_OFFSET_EXT = 0x8037;
    public static final int GL_POLYGON_OFFSET_FACTOR_EXT = 0x8038;
    public static final int GL_POLYGON_OFFSET_BIAS_EXT = 0x8039;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glPolygonOffsetEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glPolygonOffsetEXT
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glPolygonOffsetEXT = RuntimeHelper.downcall(Descriptors.FD_glPolygonOffsetEXT);
        public final MemorySegment PFN_glPolygonOffsetEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glPolygonOffsetEXT = func.invoke("glPolygonOffsetEXT");
        }
    }

    public GLEXTPolygonOffset(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void PolygonOffsetEXT(@CType("GLfloat") float factor, @CType("GLfloat") float bias) {
        if (Unmarshal.isNullPointer(handles.PFN_glPolygonOffsetEXT)) throw new SymbolNotFoundError("Symbol not found: glPolygonOffsetEXT");
        try { Handles.MH_glPolygonOffsetEXT.invokeExact(handles.PFN_glPolygonOffsetEXT, factor, bias); }
        catch (Throwable e) { throw new RuntimeException("error in glPolygonOffsetEXT", e); }
    }

}

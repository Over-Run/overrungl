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
package overrungl.opengl.sun;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLSUNMeshArray {
    public static final int GL_QUAD_MESH_SUN = 0x8614;
    public static final int GL_TRIANGLE_MESH_SUN = 0x8615;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glDrawMeshArraysSUN = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glDrawMeshArraysSUN;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glDrawMeshArraysSUN = func.invoke("glDrawMeshArraysSUN");
        }
    }

    public GLSUNMeshArray(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glDrawMeshArraysSUN(unsigned int mode, int first, int count, int width);
    /// ```
    public void DrawMeshArraysSUN(int mode, int first, int count, int width) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDrawMeshArraysSUN)) throw new SymbolNotFoundError("Symbol not found: glDrawMeshArraysSUN");
        try { Handles.MH_glDrawMeshArraysSUN.invokeExact(handles.PFN_glDrawMeshArraysSUN, mode, first, count, width); }
        catch (Throwable e) { throw new RuntimeException("error in DrawMeshArraysSUN", e); }
    }

}

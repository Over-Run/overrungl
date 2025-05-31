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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTIndexMaterial {
    public static final int GL_INDEX_MATERIAL_EXT = 0x81B8;
    public static final int GL_INDEX_MATERIAL_PARAMETER_EXT = 0x81B9;
    public static final int GL_INDEX_MATERIAL_FACE_EXT = 0x81BA;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glIndexMaterialEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glIndexMaterialEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glIndexMaterialEXT = func.invoke("glIndexMaterialEXT");
        }
    }

    public GLEXTIndexMaterial(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glIndexMaterialEXT((unsigned int) GLenum face, (unsigned int) GLenum mode);
    /// ```
    public void IndexMaterialEXT(int face, int mode) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIndexMaterialEXT)) throw new SymbolNotFoundError("Symbol not found: glIndexMaterialEXT");
        try { Handles.MH_glIndexMaterialEXT.invokeExact(handles.PFN_glIndexMaterialEXT, face, mode); }
        catch (Throwable e) { throw new RuntimeException("error in IndexMaterialEXT", e); }
    }

}

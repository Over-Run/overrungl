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

public final class GLEXTIndexMaterial {
    public static final int GL_INDEX_MATERIAL_EXT = 0x81B8;
    public static final int GL_INDEX_MATERIAL_PARAMETER_EXT = 0x81B9;
    public static final int GL_INDEX_MATERIAL_FACE_EXT = 0x81BA;
    public static final MethodHandle MH_glIndexMaterialEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glIndexMaterialEXT;

    public GLEXTIndexMaterial(overrungl.opengl.GLLoadFunc func) {
        PFN_glIndexMaterialEXT = func.invoke("glIndexMaterialEXT");
    }

    public void IndexMaterialEXT(@CType("GLenum") int face, @CType("GLenum") int mode) {
        try { if (!Unmarshal.isNullPointer(PFN_glIndexMaterialEXT))
            MH_glIndexMaterialEXT.invokeExact(PFN_glIndexMaterialEXT, face, mode);
        }
        catch (Throwable e) { throw new RuntimeException("error in glIndexMaterialEXT", e); }
    }

}

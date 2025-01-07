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
package overrungl.opengl.amd;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLAMDInterleavedElements {
    public static final int GL_VERTEX_ELEMENT_SWIZZLE_AMD = 0x91A4;
    public static final int GL_VERTEX_ID_SWIZZLE_AMD = 0x91A5;
    public static final int GL_RED = 0x1903;
    public static final int GL_GREEN = 0x1904;
    public static final int GL_BLUE = 0x1905;
    public static final int GL_ALPHA = 0x1906;
    public static final int GL_RG8UI = 0x8238;
    public static final int GL_RG16UI = 0x823A;
    public static final int GL_RGBA8UI = 0x8D7C;
    public static final MethodHandle MH_glVertexAttribParameteriAMD = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glVertexAttribParameteriAMD;

    public GLAMDInterleavedElements(overrungl.opengl.GLLoadFunc func) {
        PFN_glVertexAttribParameteriAMD = func.invoke("glVertexAttribParameteriAMD");
    }

    public void VertexAttribParameteriAMD(@CType("GLuint") int index, @CType("GLenum") int pname, @CType("GLint") int param) {
        if (!Unmarshal.isNullPointer(PFN_glVertexAttribParameteriAMD)) { try {
            MH_glVertexAttribParameteriAMD.invokeExact(PFN_glVertexAttribParameteriAMD, index, pname, param);
        } catch (Throwable e) { throw new RuntimeException("error in glVertexAttribParameteriAMD", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glVertexAttribParameteriAMD"); }
    }

}

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
package overrungl.opengl.nv;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLNVQueryResource {
    public static final int GL_QUERY_RESOURCE_TYPE_VIDMEM_ALLOC_NV = 0x9540;
    public static final int GL_QUERY_RESOURCE_MEMTYPE_VIDMEM_NV = 0x9542;
    public static final int GL_QUERY_RESOURCE_SYS_RESERVED_NV = 0x9544;
    public static final int GL_QUERY_RESOURCE_TEXTURE_NV = 0x9545;
    public static final int GL_QUERY_RESOURCE_RENDERBUFFER_NV = 0x9546;
    public static final int GL_QUERY_RESOURCE_BUFFEROBJECT_NV = 0x9547;
    public static final MethodHandle MH_glQueryResourceNV = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glQueryResourceNV;

    public GLNVQueryResource(overrungl.opengl.GLLoadFunc func) {
        PFN_glQueryResourceNV = func.invoke("glQueryResourceNV");
    }

    public @CType("GLint") int QueryResourceNV(@CType("GLenum") int queryType, @CType("GLint") int tagId, @CType("GLuint") int count, @CType("GLint *") java.lang.foreign.MemorySegment buffer) {
        if (!Unmarshal.isNullPointer(PFN_glQueryResourceNV)) { try {
            return (int) MH_glQueryResourceNV.invokeExact(PFN_glQueryResourceNV, queryType, tagId, count, buffer);
        } catch (Throwable e) { throw new RuntimeException("error in glQueryResourceNV", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glQueryResourceNV"); }
    }

}

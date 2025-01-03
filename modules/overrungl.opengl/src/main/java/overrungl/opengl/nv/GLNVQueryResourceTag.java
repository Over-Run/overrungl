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

public final class GLNVQueryResourceTag {
    public static final MethodHandle MH_glGenQueryResourceTagNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGenQueryResourceTagNV;
    public static final MethodHandle MH_glDeleteQueryResourceTagNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDeleteQueryResourceTagNV;
    public static final MethodHandle MH_glQueryResourceTagNV = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glQueryResourceTagNV;

    public GLNVQueryResourceTag(overrungl.opengl.GLLoadFunc func) {
        PFN_glGenQueryResourceTagNV = func.invoke("glGenQueryResourceTagNV");
        PFN_glDeleteQueryResourceTagNV = func.invoke("glDeleteQueryResourceTagNV");
        PFN_glQueryResourceTagNV = func.invoke("glQueryResourceTagNV");
    }

    public void GenQueryResourceTagNV(@CType("GLsizei") int n, @CType("GLint *") java.lang.foreign.MemorySegment tagIds) {
        try { if (!Unmarshal.isNullPointer(PFN_glGenQueryResourceTagNV))
            MH_glGenQueryResourceTagNV.invokeExact(PFN_glGenQueryResourceTagNV, n, tagIds);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGenQueryResourceTagNV", e); }
    }

    public void DeleteQueryResourceTagNV(@CType("GLsizei") int n, @CType("const GLint *") java.lang.foreign.MemorySegment tagIds) {
        try { if (!Unmarshal.isNullPointer(PFN_glDeleteQueryResourceTagNV))
            MH_glDeleteQueryResourceTagNV.invokeExact(PFN_glDeleteQueryResourceTagNV, n, tagIds);
        }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteQueryResourceTagNV", e); }
    }

    public void QueryResourceTagNV(@CType("GLint") int tagId, @CType("const GLchar *") java.lang.foreign.MemorySegment tagString) {
        try { if (!Unmarshal.isNullPointer(PFN_glQueryResourceTagNV))
            MH_glQueryResourceTagNV.invokeExact(PFN_glQueryResourceTagNV, tagId, tagString);
        }
        catch (Throwable e) { throw new RuntimeException("error in glQueryResourceTagNV", e); }
    }

}

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
package overrungl.opengl.mesa;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLMESAWindowPos {
    public static final MethodHandle MH_glWindowPos2dMESA = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glWindowPos2dMESA;
    public static final MethodHandle MH_glWindowPos2dvMESA = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glWindowPos2dvMESA;
    public static final MethodHandle MH_glWindowPos2fMESA = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glWindowPos2fMESA;
    public static final MethodHandle MH_glWindowPos2fvMESA = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glWindowPos2fvMESA;
    public static final MethodHandle MH_glWindowPos2iMESA = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glWindowPos2iMESA;
    public static final MethodHandle MH_glWindowPos2ivMESA = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glWindowPos2ivMESA;
    public static final MethodHandle MH_glWindowPos2sMESA = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glWindowPos2sMESA;
    public static final MethodHandle MH_glWindowPos2svMESA = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glWindowPos2svMESA;
    public static final MethodHandle MH_glWindowPos3dMESA = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glWindowPos3dMESA;
    public static final MethodHandle MH_glWindowPos3dvMESA = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glWindowPos3dvMESA;
    public static final MethodHandle MH_glWindowPos3fMESA = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glWindowPos3fMESA;
    public static final MethodHandle MH_glWindowPos3fvMESA = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glWindowPos3fvMESA;
    public static final MethodHandle MH_glWindowPos3iMESA = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glWindowPos3iMESA;
    public static final MethodHandle MH_glWindowPos3ivMESA = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glWindowPos3ivMESA;
    public static final MethodHandle MH_glWindowPos3sMESA = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glWindowPos3sMESA;
    public static final MethodHandle MH_glWindowPos3svMESA = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glWindowPos3svMESA;
    public static final MethodHandle MH_glWindowPos4dMESA = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
    public final MemorySegment PFN_glWindowPos4dMESA;
    public static final MethodHandle MH_glWindowPos4dvMESA = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glWindowPos4dvMESA;
    public static final MethodHandle MH_glWindowPos4fMESA = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
    public final MemorySegment PFN_glWindowPos4fMESA;
    public static final MethodHandle MH_glWindowPos4fvMESA = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glWindowPos4fvMESA;
    public static final MethodHandle MH_glWindowPos4iMESA = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glWindowPos4iMESA;
    public static final MethodHandle MH_glWindowPos4ivMESA = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glWindowPos4ivMESA;
    public static final MethodHandle MH_glWindowPos4sMESA = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
    public final MemorySegment PFN_glWindowPos4sMESA;
    public static final MethodHandle MH_glWindowPos4svMESA = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public final MemorySegment PFN_glWindowPos4svMESA;

    public GLMESAWindowPos(overrungl.opengl.GLLoadFunc func) {
        PFN_glWindowPos2dMESA = func.invoke("glWindowPos2dMESA", "glWindowPos2d");
        PFN_glWindowPos2dvMESA = func.invoke("glWindowPos2dvMESA", "glWindowPos2dv");
        PFN_glWindowPos2fMESA = func.invoke("glWindowPos2fMESA", "glWindowPos2f");
        PFN_glWindowPos2fvMESA = func.invoke("glWindowPos2fvMESA", "glWindowPos2fv");
        PFN_glWindowPos2iMESA = func.invoke("glWindowPos2iMESA", "glWindowPos2i");
        PFN_glWindowPos2ivMESA = func.invoke("glWindowPos2ivMESA", "glWindowPos2iv");
        PFN_glWindowPos2sMESA = func.invoke("glWindowPos2sMESA", "glWindowPos2s");
        PFN_glWindowPos2svMESA = func.invoke("glWindowPos2svMESA", "glWindowPos2sv");
        PFN_glWindowPos3dMESA = func.invoke("glWindowPos3dMESA", "glWindowPos3d");
        PFN_glWindowPos3dvMESA = func.invoke("glWindowPos3dvMESA", "glWindowPos3dv");
        PFN_glWindowPos3fMESA = func.invoke("glWindowPos3fMESA", "glWindowPos3f");
        PFN_glWindowPos3fvMESA = func.invoke("glWindowPos3fvMESA", "glWindowPos3fv");
        PFN_glWindowPos3iMESA = func.invoke("glWindowPos3iMESA", "glWindowPos3i");
        PFN_glWindowPos3ivMESA = func.invoke("glWindowPos3ivMESA", "glWindowPos3iv");
        PFN_glWindowPos3sMESA = func.invoke("glWindowPos3sMESA", "glWindowPos3s");
        PFN_glWindowPos3svMESA = func.invoke("glWindowPos3svMESA", "glWindowPos3sv");
        PFN_glWindowPos4dMESA = func.invoke("glWindowPos4dMESA");
        PFN_glWindowPos4dvMESA = func.invoke("glWindowPos4dvMESA");
        PFN_glWindowPos4fMESA = func.invoke("glWindowPos4fMESA");
        PFN_glWindowPos4fvMESA = func.invoke("glWindowPos4fvMESA");
        PFN_glWindowPos4iMESA = func.invoke("glWindowPos4iMESA");
        PFN_glWindowPos4ivMESA = func.invoke("glWindowPos4ivMESA");
        PFN_glWindowPos4sMESA = func.invoke("glWindowPos4sMESA");
        PFN_glWindowPos4svMESA = func.invoke("glWindowPos4svMESA");
    }

    public void WindowPos2dMESA(@CType("GLdouble") double x, @CType("GLdouble") double y) {
        try { if (!Unmarshal.isNullPointer(PFN_glWindowPos2dMESA))
            MH_glWindowPos2dMESA.invokeExact(PFN_glWindowPos2dMESA, x, y);
        }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos2dMESA", e); }
    }

    public void WindowPos2dvMESA(@CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glWindowPos2dvMESA))
            MH_glWindowPos2dvMESA.invokeExact(PFN_glWindowPos2dvMESA, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos2dvMESA", e); }
    }

    public void WindowPos2fMESA(@CType("GLfloat") float x, @CType("GLfloat") float y) {
        try { if (!Unmarshal.isNullPointer(PFN_glWindowPos2fMESA))
            MH_glWindowPos2fMESA.invokeExact(PFN_glWindowPos2fMESA, x, y);
        }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos2fMESA", e); }
    }

    public void WindowPos2fvMESA(@CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glWindowPos2fvMESA))
            MH_glWindowPos2fvMESA.invokeExact(PFN_glWindowPos2fvMESA, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos2fvMESA", e); }
    }

    public void WindowPos2iMESA(@CType("GLint") int x, @CType("GLint") int y) {
        try { if (!Unmarshal.isNullPointer(PFN_glWindowPos2iMESA))
            MH_glWindowPos2iMESA.invokeExact(PFN_glWindowPos2iMESA, x, y);
        }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos2iMESA", e); }
    }

    public void WindowPos2ivMESA(@CType("const GLint *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glWindowPos2ivMESA))
            MH_glWindowPos2ivMESA.invokeExact(PFN_glWindowPos2ivMESA, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos2ivMESA", e); }
    }

    public void WindowPos2sMESA(@CType("GLshort") short x, @CType("GLshort") short y) {
        try { if (!Unmarshal.isNullPointer(PFN_glWindowPos2sMESA))
            MH_glWindowPos2sMESA.invokeExact(PFN_glWindowPos2sMESA, x, y);
        }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos2sMESA", e); }
    }

    public void WindowPos2svMESA(@CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glWindowPos2svMESA))
            MH_glWindowPos2svMESA.invokeExact(PFN_glWindowPos2svMESA, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos2svMESA", e); }
    }

    public void WindowPos3dMESA(@CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z) {
        try { if (!Unmarshal.isNullPointer(PFN_glWindowPos3dMESA))
            MH_glWindowPos3dMESA.invokeExact(PFN_glWindowPos3dMESA, x, y, z);
        }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos3dMESA", e); }
    }

    public void WindowPos3dvMESA(@CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glWindowPos3dvMESA))
            MH_glWindowPos3dvMESA.invokeExact(PFN_glWindowPos3dvMESA, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos3dvMESA", e); }
    }

    public void WindowPos3fMESA(@CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        try { if (!Unmarshal.isNullPointer(PFN_glWindowPos3fMESA))
            MH_glWindowPos3fMESA.invokeExact(PFN_glWindowPos3fMESA, x, y, z);
        }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos3fMESA", e); }
    }

    public void WindowPos3fvMESA(@CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glWindowPos3fvMESA))
            MH_glWindowPos3fvMESA.invokeExact(PFN_glWindowPos3fvMESA, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos3fvMESA", e); }
    }

    public void WindowPos3iMESA(@CType("GLint") int x, @CType("GLint") int y, @CType("GLint") int z) {
        try { if (!Unmarshal.isNullPointer(PFN_glWindowPos3iMESA))
            MH_glWindowPos3iMESA.invokeExact(PFN_glWindowPos3iMESA, x, y, z);
        }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos3iMESA", e); }
    }

    public void WindowPos3ivMESA(@CType("const GLint *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glWindowPos3ivMESA))
            MH_glWindowPos3ivMESA.invokeExact(PFN_glWindowPos3ivMESA, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos3ivMESA", e); }
    }

    public void WindowPos3sMESA(@CType("GLshort") short x, @CType("GLshort") short y, @CType("GLshort") short z) {
        try { if (!Unmarshal.isNullPointer(PFN_glWindowPos3sMESA))
            MH_glWindowPos3sMESA.invokeExact(PFN_glWindowPos3sMESA, x, y, z);
        }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos3sMESA", e); }
    }

    public void WindowPos3svMESA(@CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glWindowPos3svMESA))
            MH_glWindowPos3svMESA.invokeExact(PFN_glWindowPos3svMESA, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos3svMESA", e); }
    }

    public void WindowPos4dMESA(@CType("GLdouble") double x, @CType("GLdouble") double y, @CType("GLdouble") double z, @CType("GLdouble") double w) {
        try { if (!Unmarshal.isNullPointer(PFN_glWindowPos4dMESA))
            MH_glWindowPos4dMESA.invokeExact(PFN_glWindowPos4dMESA, x, y, z, w);
        }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos4dMESA", e); }
    }

    public void WindowPos4dvMESA(@CType("const GLdouble *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glWindowPos4dvMESA))
            MH_glWindowPos4dvMESA.invokeExact(PFN_glWindowPos4dvMESA, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos4dvMESA", e); }
    }

    public void WindowPos4fMESA(@CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z, @CType("GLfloat") float w) {
        try { if (!Unmarshal.isNullPointer(PFN_glWindowPos4fMESA))
            MH_glWindowPos4fMESA.invokeExact(PFN_glWindowPos4fMESA, x, y, z, w);
        }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos4fMESA", e); }
    }

    public void WindowPos4fvMESA(@CType("const GLfloat *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glWindowPos4fvMESA))
            MH_glWindowPos4fvMESA.invokeExact(PFN_glWindowPos4fvMESA, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos4fvMESA", e); }
    }

    public void WindowPos4iMESA(@CType("GLint") int x, @CType("GLint") int y, @CType("GLint") int z, @CType("GLint") int w) {
        try { if (!Unmarshal.isNullPointer(PFN_glWindowPos4iMESA))
            MH_glWindowPos4iMESA.invokeExact(PFN_glWindowPos4iMESA, x, y, z, w);
        }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos4iMESA", e); }
    }

    public void WindowPos4ivMESA(@CType("const GLint *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glWindowPos4ivMESA))
            MH_glWindowPos4ivMESA.invokeExact(PFN_glWindowPos4ivMESA, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos4ivMESA", e); }
    }

    public void WindowPos4sMESA(@CType("GLshort") short x, @CType("GLshort") short y, @CType("GLshort") short z, @CType("GLshort") short w) {
        try { if (!Unmarshal.isNullPointer(PFN_glWindowPos4sMESA))
            MH_glWindowPos4sMESA.invokeExact(PFN_glWindowPos4sMESA, x, y, z, w);
        }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos4sMESA", e); }
    }

    public void WindowPos4svMESA(@CType("const GLshort *") java.lang.foreign.MemorySegment v) {
        try { if (!Unmarshal.isNullPointer(PFN_glWindowPos4svMESA))
            MH_glWindowPos4svMESA.invokeExact(PFN_glWindowPos4svMESA, v);
        }
        catch (Throwable e) { throw new RuntimeException("error in glWindowPos4svMESA", e); }
    }

}

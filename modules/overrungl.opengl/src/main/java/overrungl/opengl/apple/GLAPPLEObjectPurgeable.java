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
package overrungl.opengl.apple;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLAPPLEObjectPurgeable {
    public static final int GL_BUFFER_OBJECT_APPLE = 0x85B3;
    public static final int GL_RELEASED_APPLE = 0x8A19;
    public static final int GL_VOLATILE_APPLE = 0x8A1A;
    public static final int GL_RETAINED_APPLE = 0x8A1B;
    public static final int GL_UNDEFINED_APPLE = 0x8A1C;
    public static final int GL_PURGEABLE_APPLE = 0x8A1D;
    public static final MethodHandle MH_glObjectPurgeableAPPLE = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glObjectPurgeableAPPLE;
    public static final MethodHandle MH_glObjectUnpurgeableAPPLE = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glObjectUnpurgeableAPPLE;
    public static final MethodHandle MH_glGetObjectParameterivAPPLE = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetObjectParameterivAPPLE;

    public GLAPPLEObjectPurgeable(overrungl.opengl.GLLoadFunc func) {
        PFN_glObjectPurgeableAPPLE = func.invoke("glObjectPurgeableAPPLE");
        PFN_glObjectUnpurgeableAPPLE = func.invoke("glObjectUnpurgeableAPPLE");
        PFN_glGetObjectParameterivAPPLE = func.invoke("glGetObjectParameterivAPPLE");
    }

    public @CType("GLenum") int ObjectPurgeableAPPLE(@CType("GLenum") int objectType, @CType("GLuint") int name, @CType("GLenum") int option) {
        try { if (!Unmarshal.isNullPointer(PFN_glObjectPurgeableAPPLE))
            return (int) MH_glObjectPurgeableAPPLE.invokeExact(PFN_glObjectPurgeableAPPLE, objectType, name, option);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glObjectPurgeableAPPLE", e); }
    }

    public @CType("GLenum") int ObjectUnpurgeableAPPLE(@CType("GLenum") int objectType, @CType("GLuint") int name, @CType("GLenum") int option) {
        try { if (!Unmarshal.isNullPointer(PFN_glObjectUnpurgeableAPPLE))
            return (int) MH_glObjectUnpurgeableAPPLE.invokeExact(PFN_glObjectUnpurgeableAPPLE, objectType, name, option);
            else return 0;
        }
        catch (Throwable e) { throw new RuntimeException("error in glObjectUnpurgeableAPPLE", e); }
    }

    public void GetObjectParameterivAPPLE(@CType("GLenum") int objectType, @CType("GLuint") int name, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetObjectParameterivAPPLE))
            MH_glGetObjectParameterivAPPLE.invokeExact(PFN_glGetObjectParameterivAPPLE, objectType, name, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetObjectParameterivAPPLE", e); }
    }

}

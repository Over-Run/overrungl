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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLAPPLEObjectPurgeable {
    public static final int GL_BUFFER_OBJECT_APPLE = 0x85B3;
    public static final int GL_RELEASED_APPLE = 0x8A19;
    public static final int GL_VOLATILE_APPLE = 0x8A1A;
    public static final int GL_RETAINED_APPLE = 0x8A1B;
    public static final int GL_UNDEFINED_APPLE = 0x8A1C;
    public static final int GL_PURGEABLE_APPLE = 0x8A1D;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glObjectPurgeableAPPLE = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glObjectUnpurgeableAPPLE = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glGetObjectParameterivAPPLE = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glObjectPurgeableAPPLE;
        public final MemorySegment PFN_glObjectUnpurgeableAPPLE;
        public final MemorySegment PFN_glGetObjectParameterivAPPLE;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glObjectPurgeableAPPLE = func.invoke("glObjectPurgeableAPPLE");
            PFN_glObjectUnpurgeableAPPLE = func.invoke("glObjectUnpurgeableAPPLE");
            PFN_glGetObjectParameterivAPPLE = func.invoke("glGetObjectParameterivAPPLE");
        }
    }

    public GLAPPLEObjectPurgeable(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// (unsigned int) GLenum glObjectPurgeableAPPLE((unsigned int) GLenum objectType, (unsigned int) GLuint name, (unsigned int) GLenum option);
    /// ```
    public int ObjectPurgeableAPPLE(int objectType, int name, int option) {
        if (MemoryUtil.isNullPointer(handles.PFN_glObjectPurgeableAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glObjectPurgeableAPPLE");
        try { return (int) Handles.MH_glObjectPurgeableAPPLE.invokeExact(handles.PFN_glObjectPurgeableAPPLE, objectType, name, option); }
        catch (Throwable e) { throw new RuntimeException("error in ObjectPurgeableAPPLE", e); }
    }

    /// ```
    /// (unsigned int) GLenum glObjectUnpurgeableAPPLE((unsigned int) GLenum objectType, (unsigned int) GLuint name, (unsigned int) GLenum option);
    /// ```
    public int ObjectUnpurgeableAPPLE(int objectType, int name, int option) {
        if (MemoryUtil.isNullPointer(handles.PFN_glObjectUnpurgeableAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glObjectUnpurgeableAPPLE");
        try { return (int) Handles.MH_glObjectUnpurgeableAPPLE.invokeExact(handles.PFN_glObjectUnpurgeableAPPLE, objectType, name, option); }
        catch (Throwable e) { throw new RuntimeException("error in ObjectUnpurgeableAPPLE", e); }
    }

    /// ```
    /// void glGetObjectParameterivAPPLE((unsigned int) GLenum objectType, (unsigned int) GLuint name, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetObjectParameterivAPPLE(int objectType, int name, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetObjectParameterivAPPLE)) throw new GLSymbolNotFoundError("Symbol not found: glGetObjectParameterivAPPLE");
        try { Handles.MH_glGetObjectParameterivAPPLE.invokeExact(handles.PFN_glGetObjectParameterivAPPLE, objectType, name, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetObjectParameterivAPPLE", e); }
    }

}

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
import java.util.*;
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
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glObjectPurgeableAPPLE = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glObjectUnpurgeableAPPLE = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glGetObjectParameterivAPPLE = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glObjectPurgeableAPPLE,
            FD_glObjectUnpurgeableAPPLE,
            FD_glGetObjectParameterivAPPLE
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glObjectPurgeableAPPLE = RuntimeHelper.downcall(Descriptors.FD_glObjectPurgeableAPPLE);
        public static final MethodHandle MH_glObjectUnpurgeableAPPLE = RuntimeHelper.downcall(Descriptors.FD_glObjectUnpurgeableAPPLE);
        public static final MethodHandle MH_glGetObjectParameterivAPPLE = RuntimeHelper.downcall(Descriptors.FD_glGetObjectParameterivAPPLE);
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

    public @CType("GLenum") int ObjectPurgeableAPPLE(@CType("GLenum") int objectType, @CType("GLuint") int name, @CType("GLenum") int option) {
        if (Unmarshal.isNullPointer(handles.PFN_glObjectPurgeableAPPLE)) throw new SymbolNotFoundError("Symbol not found: glObjectPurgeableAPPLE");
        try { return (int) Handles.MH_glObjectPurgeableAPPLE.invokeExact(handles.PFN_glObjectPurgeableAPPLE, objectType, name, option); }
        catch (Throwable e) { throw new RuntimeException("error in glObjectPurgeableAPPLE", e); }
    }

    public @CType("GLenum") int ObjectUnpurgeableAPPLE(@CType("GLenum") int objectType, @CType("GLuint") int name, @CType("GLenum") int option) {
        if (Unmarshal.isNullPointer(handles.PFN_glObjectUnpurgeableAPPLE)) throw new SymbolNotFoundError("Symbol not found: glObjectUnpurgeableAPPLE");
        try { return (int) Handles.MH_glObjectUnpurgeableAPPLE.invokeExact(handles.PFN_glObjectUnpurgeableAPPLE, objectType, name, option); }
        catch (Throwable e) { throw new RuntimeException("error in glObjectUnpurgeableAPPLE", e); }
    }

    public void GetObjectParameterivAPPLE(@CType("GLenum") int objectType, @CType("GLuint") int name, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetObjectParameterivAPPLE)) throw new SymbolNotFoundError("Symbol not found: glGetObjectParameterivAPPLE");
        try { Handles.MH_glGetObjectParameterivAPPLE.invokeExact(handles.PFN_glGetObjectParameterivAPPLE, objectType, name, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetObjectParameterivAPPLE", e); }
    }

}

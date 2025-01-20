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

public final class GLEXTCompiledVertexArray {
    public static final int GL_ARRAY_ELEMENT_LOCK_FIRST_EXT = 0x81A8;
    public static final int GL_ARRAY_ELEMENT_LOCK_COUNT_EXT = 0x81A9;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glLockArraysEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final FunctionDescriptor FD_glUnlockArraysEXT = FunctionDescriptor.ofVoid();
    }
    public static final class Handles {
        public static final MethodHandle MH_glLockArraysEXT = RuntimeHelper.downcall(Descriptors.FD_glLockArraysEXT);
        public static final MethodHandle MH_glUnlockArraysEXT = RuntimeHelper.downcall(Descriptors.FD_glUnlockArraysEXT);
        public final MemorySegment PFN_glLockArraysEXT;
        public final MemorySegment PFN_glUnlockArraysEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glLockArraysEXT = func.invoke("glLockArraysEXT");
            PFN_glUnlockArraysEXT = func.invoke("glUnlockArraysEXT");
        }
    }

    public GLEXTCompiledVertexArray(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void LockArraysEXT(@CType("GLint") int first, @CType("GLsizei") int count) {
        if (Unmarshal.isNullPointer(handles.PFN_glLockArraysEXT)) throw new SymbolNotFoundError("Symbol not found: glLockArraysEXT");
        try { Handles.MH_glLockArraysEXT.invokeExact(handles.PFN_glLockArraysEXT, first, count); }
        catch (Throwable e) { throw new RuntimeException("error in glLockArraysEXT", e); }
    }

    public void UnlockArraysEXT() {
        if (Unmarshal.isNullPointer(handles.PFN_glUnlockArraysEXT)) throw new SymbolNotFoundError("Symbol not found: glUnlockArraysEXT");
        try { Handles.MH_glUnlockArraysEXT.invokeExact(handles.PFN_glUnlockArraysEXT); }
        catch (Throwable e) { throw new RuntimeException("error in glUnlockArraysEXT", e); }
    }

}

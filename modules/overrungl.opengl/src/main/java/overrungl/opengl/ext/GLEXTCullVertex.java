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
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTCullVertex {
    public static final int GL_CULL_VERTEX_EXT = 0x81AA;
    public static final int GL_CULL_VERTEX_EYE_POSITION_EXT = 0x81AB;
    public static final int GL_CULL_VERTEX_OBJECT_POSITION_EXT = 0x81AC;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glCullParameterdvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCullParameterfvEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glCullParameterdvEXT,
            FD_glCullParameterfvEXT
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glCullParameterdvEXT = RuntimeHelper.downcall(Descriptors.FD_glCullParameterdvEXT);
        public static final MethodHandle MH_glCullParameterfvEXT = RuntimeHelper.downcall(Descriptors.FD_glCullParameterfvEXT);
        public final MemorySegment PFN_glCullParameterdvEXT;
        public final MemorySegment PFN_glCullParameterfvEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glCullParameterdvEXT = func.invoke("glCullParameterdvEXT");
            PFN_glCullParameterfvEXT = func.invoke("glCullParameterfvEXT");
        }
    }

    public GLEXTCullVertex(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void CullParameterdvEXT(@CType("GLenum") int pname, @CType("GLdouble *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glCullParameterdvEXT)) throw new SymbolNotFoundError("Symbol not found: glCullParameterdvEXT");
        try { Handles.MH_glCullParameterdvEXT.invokeExact(handles.PFN_glCullParameterdvEXT, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glCullParameterdvEXT", e); }
    }

    public void CullParameterfvEXT(@CType("GLenum") int pname, @CType("GLfloat *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glCullParameterfvEXT)) throw new SymbolNotFoundError("Symbol not found: glCullParameterfvEXT");
        try { Handles.MH_glCullParameterfvEXT.invokeExact(handles.PFN_glCullParameterfvEXT, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glCullParameterfvEXT", e); }
    }

}

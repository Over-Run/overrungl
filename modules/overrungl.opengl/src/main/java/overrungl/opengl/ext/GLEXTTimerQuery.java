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

public final class GLEXTTimerQuery {
    public static final int GL_TIME_ELAPSED_EXT = 0x88BF;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glGetQueryObjecti64vEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetQueryObjectui64vEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glGetQueryObjecti64vEXT = RuntimeHelper.downcall(Descriptors.FD_glGetQueryObjecti64vEXT);
        public static final MethodHandle MH_glGetQueryObjectui64vEXT = RuntimeHelper.downcall(Descriptors.FD_glGetQueryObjectui64vEXT);
        public final MemorySegment PFN_glGetQueryObjecti64vEXT;
        public final MemorySegment PFN_glGetQueryObjectui64vEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glGetQueryObjecti64vEXT = func.invoke("glGetQueryObjecti64vEXT", "glGetQueryObjecti64v");
            PFN_glGetQueryObjectui64vEXT = func.invoke("glGetQueryObjectui64vEXT", "glGetQueryObjectui64v");
        }
    }

    public GLEXTTimerQuery(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void GetQueryObjecti64vEXT(@CType("GLuint") int id, @CType("GLenum") int pname, @CType("GLint64 *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetQueryObjecti64vEXT)) throw new SymbolNotFoundError("Symbol not found: glGetQueryObjecti64vEXT");
        try { Handles.MH_glGetQueryObjecti64vEXT.invokeExact(handles.PFN_glGetQueryObjecti64vEXT, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetQueryObjecti64vEXT", e); }
    }

    public void GetQueryObjectui64vEXT(@CType("GLuint") int id, @CType("GLenum") int pname, @CType("GLuint64 *") MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetQueryObjectui64vEXT)) throw new SymbolNotFoundError("Symbol not found: glGetQueryObjectui64vEXT");
        try { Handles.MH_glGetQueryObjectui64vEXT.invokeExact(handles.PFN_glGetQueryObjectui64vEXT, id, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetQueryObjectui64vEXT", e); }
    }

}

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
    public static final MethodHandle MH_glGetQueryObjecti64vEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetQueryObjecti64vEXT;
    public static final MethodHandle MH_glGetQueryObjectui64vEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetQueryObjectui64vEXT;

    public GLEXTTimerQuery(overrungl.opengl.GLLoadFunc func) {
        PFN_glGetQueryObjecti64vEXT = func.invoke("glGetQueryObjecti64vEXT", "glGetQueryObjecti64v");
        PFN_glGetQueryObjectui64vEXT = func.invoke("glGetQueryObjectui64vEXT", "glGetQueryObjectui64v");
    }

    public void GetQueryObjecti64vEXT(@CType("GLuint") int id, @CType("GLenum") int pname, @CType("GLint64 *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetQueryObjecti64vEXT))
            MH_glGetQueryObjecti64vEXT.invokeExact(PFN_glGetQueryObjecti64vEXT, id, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetQueryObjecti64vEXT", e); }
    }

    public void GetQueryObjectui64vEXT(@CType("GLuint") int id, @CType("GLenum") int pname, @CType("GLuint64 *") java.lang.foreign.MemorySegment params) {
        try { if (!Unmarshal.isNullPointer(PFN_glGetQueryObjectui64vEXT))
            MH_glGetQueryObjectui64vEXT.invokeExact(PFN_glGetQueryObjectui64vEXT, id, pname, params);
        }
        catch (Throwable e) { throw new RuntimeException("error in glGetQueryObjectui64vEXT", e); }
    }

}

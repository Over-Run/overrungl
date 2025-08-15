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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_EXT_window_rectangles`
public final class GLEXTWindowRectangles {
    public static final int GL_INCLUSIVE_EXT = 0x8F10;
    public static final int GL_EXCLUSIVE_EXT = 0x8F11;
    public static final int GL_WINDOW_RECTANGLE_EXT = 0x8F12;
    public static final int GL_WINDOW_RECTANGLE_MODE_EXT = 0x8F13;
    public static final int GL_MAX_WINDOW_RECTANGLES_EXT = 0x8F14;
    public static final int GL_NUM_WINDOW_RECTANGLES_EXT = 0x8F15;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glWindowRectanglesEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glWindowRectanglesEXT;
        private Handles(GLLoadFunc func) {
            PFN_glWindowRectanglesEXT = func.invoke("glWindowRectanglesEXT");
        }
    }

    public GLEXTWindowRectangles(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glWindowRectanglesEXT`.
    /// ```
    /// void glWindowRectanglesEXT((unsigned int) GLenum mode, (int) GLsizei count, const GLint* box);
    /// ```
    public void WindowRectanglesEXT(int mode, int count, @NonNull MemorySegment box) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowRectanglesEXT)) throw new GLSymbolNotFoundError("Symbol not found: glWindowRectanglesEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWindowRectanglesEXT", mode, count, box); }
        Handles.MH_glWindowRectanglesEXT.invokeExact(handles.PFN_glWindowRectanglesEXT, mode, count, box); }
        catch (Throwable e) { throw new RuntimeException("error in WindowRectanglesEXT", e); }
    }

}

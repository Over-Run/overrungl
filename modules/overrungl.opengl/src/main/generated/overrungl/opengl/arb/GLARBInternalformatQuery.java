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
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_internalformat_query`
public final class GLARBInternalformatQuery {
    public static final int GL_NUM_SAMPLE_COUNTS = 0x9380;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glGetInternalformativ = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glGetInternalformativ;
        private Handles(GLLoadFunc func) {
            PFN_glGetInternalformativ = func.invoke("glGetInternalformativ");
        }
    }

    public GLARBInternalformatQuery(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glGetInternalformativ`.
    /// ```
    /// void glGetInternalformativ((unsigned int) GLenum target, (unsigned int) GLenum internalformat, (unsigned int) GLenum pname, (int) GLsizei count, GLint* params);
    /// ```
    public void GetInternalformativ(int target, int internalformat, int pname, int count, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetInternalformativ)) throw new GLSymbolNotFoundError("Symbol not found: glGetInternalformativ");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetInternalformativ", target, internalformat, pname, count, params); }
        Handles.MH_glGetInternalformativ.invokeExact(handles.PFN_glGetInternalformativ, target, internalformat, pname, count, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetInternalformativ", e); }
    }

}

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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLEXTSemaphoreFd {
    public static final int GL_HANDLE_TYPE_OPAQUE_FD_EXT = 0x9586;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glImportSemaphoreFdEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glImportSemaphoreFdEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glImportSemaphoreFdEXT = func.invoke("glImportSemaphoreFdEXT");
        }
    }

    public GLEXTSemaphoreFd(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glImportSemaphoreFdEXT((unsigned int) GLuint semaphore, (unsigned int) GLenum handleType, (int) GLint fd);
    /// ```
    public void ImportSemaphoreFdEXT(int semaphore, int handleType, int fd) {
        if (MemoryUtil.isNullPointer(handles.PFN_glImportSemaphoreFdEXT)) throw new GLSymbolNotFoundError("Symbol not found: glImportSemaphoreFdEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glImportSemaphoreFdEXT", semaphore, handleType, fd); }
        Handles.MH_glImportSemaphoreFdEXT.invokeExact(handles.PFN_glImportSemaphoreFdEXT, semaphore, handleType, fd); }
        catch (Throwable e) { throw new RuntimeException("error in ImportSemaphoreFdEXT", e); }
    }

}

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

public final class GLEXTSemaphoreFd {
    public static final int GL_HANDLE_TYPE_OPAQUE_FD_EXT = 0x9586;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glImportSemaphoreFdEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    }
    public static final class Handles {
        public static final MethodHandle MH_glImportSemaphoreFdEXT = RuntimeHelper.downcall(Descriptors.FD_glImportSemaphoreFdEXT);
        public final MemorySegment PFN_glImportSemaphoreFdEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glImportSemaphoreFdEXT = func.invoke("glImportSemaphoreFdEXT");
        }
    }

    public GLEXTSemaphoreFd(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void ImportSemaphoreFdEXT(@CType("GLuint") int semaphore, @CType("GLenum") int handleType, @CType("GLint") int fd) {
        if (Unmarshal.isNullPointer(handles.PFN_glImportSemaphoreFdEXT)) throw new SymbolNotFoundError("Symbol not found: glImportSemaphoreFdEXT");
        try { Handles.MH_glImportSemaphoreFdEXT.invokeExact(handles.PFN_glImportSemaphoreFdEXT, semaphore, handleType, fd); }
        catch (Throwable e) { throw new RuntimeException("error in glImportSemaphoreFdEXT", e); }
    }

}

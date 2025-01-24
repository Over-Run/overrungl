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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLEXTMemoryObjectFd {
    public static final int GL_HANDLE_TYPE_OPAQUE_FD_EXT = 0x9586;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glImportMemoryFdEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glImportMemoryFdEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glImportMemoryFdEXT = func.invoke("glImportMemoryFdEXT");
        }
    }

    public GLEXTMemoryObjectFd(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glImportMemoryFdEXT(unsigned int memory, uint64_t size, unsigned int handleType, int fd);
    /// ```
    public void ImportMemoryFdEXT(int memory, long size, int handleType, int fd) {
        if (MemoryUtil.isNullPointer(handles.PFN_glImportMemoryFdEXT)) throw new SymbolNotFoundError("Symbol not found: glImportMemoryFdEXT");
        try { Handles.MH_glImportMemoryFdEXT.invokeExact(handles.PFN_glImportMemoryFdEXT, memory, size, handleType, fd); }
        catch (Throwable e) { throw new RuntimeException("error in ImportMemoryFdEXT", e); }
    }

}

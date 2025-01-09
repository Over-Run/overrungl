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

public final class GLEXTMemoryObjectFd {
    public static final int GL_HANDLE_TYPE_OPAQUE_FD_EXT = 0x9586;
    public static final MethodHandle MH_glImportMemoryFdEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glImportMemoryFdEXT;

    public GLEXTMemoryObjectFd(overrungl.opengl.GLLoadFunc func) {
        PFN_glImportMemoryFdEXT = func.invoke("glImportMemoryFdEXT");
    }

    public void ImportMemoryFdEXT(@CType("GLuint") int memory, @CType("GLuint64") long size, @CType("GLenum") int handleType, @CType("GLint") int fd) {
        if (Unmarshal.isNullPointer(PFN_glImportMemoryFdEXT)) throw new SymbolNotFoundError("Symbol not found: glImportMemoryFdEXT");
        try { MH_glImportMemoryFdEXT.invokeExact(PFN_glImportMemoryFdEXT, memory, size, handleType, fd); }
        catch (Throwable e) { throw new RuntimeException("error in glImportMemoryFdEXT", e); }
    }

}

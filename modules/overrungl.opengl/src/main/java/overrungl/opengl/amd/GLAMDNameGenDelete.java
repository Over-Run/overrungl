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
package overrungl.opengl.amd;

import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLAMDNameGenDelete {
    public static final int GL_DATA_BUFFER_AMD = 0x9151;
    public static final int GL_PERFORMANCE_MONITOR_AMD = 0x9152;
    public static final int GL_QUERY_OBJECT_AMD = 0x9153;
    public static final int GL_VERTEX_ARRAY_OBJECT_AMD = 0x9154;
    public static final int GL_SAMPLER_OBJECT_AMD = 0x9155;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glGenNamesAMD = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glDeleteNamesAMD = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glIsNameAMD = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glGenNamesAMD,
            FD_glDeleteNamesAMD,
            FD_glIsNameAMD
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glGenNamesAMD = RuntimeHelper.downcall(Descriptors.FD_glGenNamesAMD);
        public static final MethodHandle MH_glDeleteNamesAMD = RuntimeHelper.downcall(Descriptors.FD_glDeleteNamesAMD);
        public static final MethodHandle MH_glIsNameAMD = RuntimeHelper.downcall(Descriptors.FD_glIsNameAMD);
        public final MemorySegment PFN_glGenNamesAMD;
        public final MemorySegment PFN_glDeleteNamesAMD;
        public final MemorySegment PFN_glIsNameAMD;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glGenNamesAMD = func.invoke("glGenNamesAMD");
            PFN_glDeleteNamesAMD = func.invoke("glDeleteNamesAMD");
            PFN_glIsNameAMD = func.invoke("glIsNameAMD");
        }
    }

    public GLAMDNameGenDelete(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void GenNamesAMD(@CType("GLenum") int identifier, @CType("GLuint") int num, @CType("GLuint *") java.lang.foreign.MemorySegment names) {
        if (Unmarshal.isNullPointer(handles.PFN_glGenNamesAMD)) throw new SymbolNotFoundError("Symbol not found: glGenNamesAMD");
        try { Handles.MH_glGenNamesAMD.invokeExact(handles.PFN_glGenNamesAMD, identifier, num, names); }
        catch (Throwable e) { throw new RuntimeException("error in glGenNamesAMD", e); }
    }

    public void DeleteNamesAMD(@CType("GLenum") int identifier, @CType("GLuint") int num, @CType("const GLuint *") java.lang.foreign.MemorySegment names) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeleteNamesAMD)) throw new SymbolNotFoundError("Symbol not found: glDeleteNamesAMD");
        try { Handles.MH_glDeleteNamesAMD.invokeExact(handles.PFN_glDeleteNamesAMD, identifier, num, names); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteNamesAMD", e); }
    }

    public @CType("GLboolean") boolean IsNameAMD(@CType("GLenum") int identifier, @CType("GLuint") int name) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsNameAMD)) throw new SymbolNotFoundError("Symbol not found: glIsNameAMD");
        try { return (boolean) Handles.MH_glIsNameAMD.invokeExact(handles.PFN_glIsNameAMD, identifier, name); }
        catch (Throwable e) { throw new RuntimeException("error in glIsNameAMD", e); }
    }

}

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

public final class GLEXTDebugLabel {
    public static final int GL_PROGRAM_PIPELINE_OBJECT_EXT = 0x8A4F;
    public static final int GL_PROGRAM_OBJECT_EXT = 0x8B40;
    public static final int GL_SHADER_OBJECT_EXT = 0x8B48;
    public static final int GL_BUFFER_OBJECT_EXT = 0x9151;
    public static final int GL_QUERY_OBJECT_EXT = 0x9153;
    public static final int GL_VERTEX_ARRAY_OBJECT_EXT = 0x9154;
    public static final int GL_SAMPLER = 0x82E6;
    public static final int GL_TRANSFORM_FEEDBACK = 0x8E22;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glLabelObjectEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetObjectLabelEXT = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_glLabelObjectEXT,
            FD_glGetObjectLabelEXT
        );
    }
    public static final class Handles {
        public static final MethodHandle MH_glLabelObjectEXT = RuntimeHelper.downcall(Descriptors.FD_glLabelObjectEXT);
        public static final MethodHandle MH_glGetObjectLabelEXT = RuntimeHelper.downcall(Descriptors.FD_glGetObjectLabelEXT);
        public final MemorySegment PFN_glLabelObjectEXT;
        public final MemorySegment PFN_glGetObjectLabelEXT;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glLabelObjectEXT = func.invoke("glLabelObjectEXT");
            PFN_glGetObjectLabelEXT = func.invoke("glGetObjectLabelEXT");
        }
    }

    public GLEXTDebugLabel(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void LabelObjectEXT(@CType("GLenum") int type, @CType("GLuint") int object, @CType("GLsizei") int length, @CType("const GLchar *") java.lang.foreign.MemorySegment label) {
        if (Unmarshal.isNullPointer(handles.PFN_glLabelObjectEXT)) throw new SymbolNotFoundError("Symbol not found: glLabelObjectEXT");
        try { Handles.MH_glLabelObjectEXT.invokeExact(handles.PFN_glLabelObjectEXT, type, object, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in glLabelObjectEXT", e); }
    }

    public void GetObjectLabelEXT(@CType("GLenum") int type, @CType("GLuint") int object, @CType("GLsizei") int bufSize, @CType("GLsizei *") java.lang.foreign.MemorySegment length, @CType("GLchar *") java.lang.foreign.MemorySegment label) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetObjectLabelEXT)) throw new SymbolNotFoundError("Symbol not found: glGetObjectLabelEXT");
        try { Handles.MH_glGetObjectLabelEXT.invokeExact(handles.PFN_glGetObjectLabelEXT, type, object, bufSize, length, label); }
        catch (Throwable e) { throw new RuntimeException("error in glGetObjectLabelEXT", e); }
    }

}

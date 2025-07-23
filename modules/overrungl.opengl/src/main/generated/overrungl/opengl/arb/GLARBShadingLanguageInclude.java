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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLARBShadingLanguageInclude {
    public static final int GL_SHADER_INCLUDE_ARB = 0x8DAE;
    public static final int GL_NAMED_STRING_LENGTH_ARB = 0x8DE9;
    public static final int GL_NAMED_STRING_TYPE_ARB = 0x8DEA;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glNamedStringARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDeleteNamedStringARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompileShaderIncludeARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsNamedStringARB = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetNamedStringARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetNamedStringivARB = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_glNamedStringARB;
        public final MemorySegment PFN_glDeleteNamedStringARB;
        public final MemorySegment PFN_glCompileShaderIncludeARB;
        public final MemorySegment PFN_glIsNamedStringARB;
        public final MemorySegment PFN_glGetNamedStringARB;
        public final MemorySegment PFN_glGetNamedStringivARB;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glNamedStringARB = func.invoke("glNamedStringARB");
            PFN_glDeleteNamedStringARB = func.invoke("glDeleteNamedStringARB");
            PFN_glCompileShaderIncludeARB = func.invoke("glCompileShaderIncludeARB");
            PFN_glIsNamedStringARB = func.invoke("glIsNamedStringARB");
            PFN_glGetNamedStringARB = func.invoke("glGetNamedStringARB");
            PFN_glGetNamedStringivARB = func.invoke("glGetNamedStringivARB");
        }
    }

    public GLARBShadingLanguageInclude(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glNamedStringARB((unsigned int) GLenum type, (int) GLint namelen, const GLchar* name, (int) GLint stringlen, const GLchar* string);
    /// ```
    public void NamedStringARB(int type, int namelen, MemorySegment name, int stringlen, MemorySegment string) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedStringARB)) throw new GLSymbolNotFoundError("Symbol not found: glNamedStringARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNamedStringARB", type, namelen, name, stringlen, string); }
        Handles.MH_glNamedStringARB.invokeExact(handles.PFN_glNamedStringARB, type, namelen, name, stringlen, string); }
        catch (Throwable e) { throw new RuntimeException("error in NamedStringARB", e); }
    }

    /// ```
    /// void glDeleteNamedStringARB((int) GLint namelen, const GLchar* name);
    /// ```
    public void DeleteNamedStringARB(int namelen, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteNamedStringARB)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteNamedStringARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteNamedStringARB", namelen, name); }
        Handles.MH_glDeleteNamedStringARB.invokeExact(handles.PFN_glDeleteNamedStringARB, namelen, name); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteNamedStringARB", e); }
    }

    /// ```
    /// void glCompileShaderIncludeARB((unsigned int) GLuint shader, (int) GLsizei count, const GLchar* const * path, const GLint* length);
    /// ```
    public void CompileShaderIncludeARB(int shader, int count, MemorySegment path, MemorySegment length) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompileShaderIncludeARB)) throw new GLSymbolNotFoundError("Symbol not found: glCompileShaderIncludeARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCompileShaderIncludeARB", shader, count, path, length); }
        Handles.MH_glCompileShaderIncludeARB.invokeExact(handles.PFN_glCompileShaderIncludeARB, shader, count, path, length); }
        catch (Throwable e) { throw new RuntimeException("error in CompileShaderIncludeARB", e); }
    }

    /// ```
    /// GLboolean glIsNamedStringARB((int) GLint namelen, const GLchar* name);
    /// ```
    public boolean IsNamedStringARB(int namelen, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsNamedStringARB)) throw new GLSymbolNotFoundError("Symbol not found: glIsNamedStringARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsNamedStringARB", namelen, name); }
        return (((byte) Handles.MH_glIsNamedStringARB.invokeExact(handles.PFN_glIsNamedStringARB, namelen, name)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsNamedStringARB", e); }
    }

    /// ```
    /// void glGetNamedStringARB((int) GLint namelen, const GLchar* name, (int) GLsizei bufSize, GLint* stringlen, GLchar* string);
    /// ```
    public void GetNamedStringARB(int namelen, MemorySegment name, int bufSize, MemorySegment stringlen, MemorySegment string) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedStringARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetNamedStringARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetNamedStringARB", namelen, name, bufSize, stringlen, string); }
        Handles.MH_glGetNamedStringARB.invokeExact(handles.PFN_glGetNamedStringARB, namelen, name, bufSize, stringlen, string); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedStringARB", e); }
    }

    /// ```
    /// void glGetNamedStringivARB((int) GLint namelen, const GLchar* name, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetNamedStringivARB(int namelen, MemorySegment name, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedStringivARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetNamedStringivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetNamedStringivARB", namelen, name, pname, params); }
        Handles.MH_glGetNamedStringivARB.invokeExact(handles.PFN_glGetNamedStringivARB, namelen, name, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedStringivARB", e); }
    }

}

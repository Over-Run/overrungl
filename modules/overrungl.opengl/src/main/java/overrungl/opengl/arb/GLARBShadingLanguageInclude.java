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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBShadingLanguageInclude {
    public static final int GL_SHADER_INCLUDE_ARB = 0x8DAE;
    public static final int GL_NAMED_STRING_LENGTH_ARB = 0x8DE9;
    public static final int GL_NAMED_STRING_TYPE_ARB = 0x8DEA;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glNamedStringARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glDeleteNamedStringARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glCompileShaderIncludeARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glIsNamedStringARB = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetNamedStringARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glGetNamedStringivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
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
    /// void glNamedStringARB(GLenum type, GLint namelen, const GLchar* name, GLint stringlen, const GLchar* string);
    /// ```
    public void NamedStringARB(int type, int namelen, MemorySegment name, int stringlen, MemorySegment string) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedStringARB)) throw new SymbolNotFoundError("Symbol not found: glNamedStringARB");
        try { Handles.MH_glNamedStringARB.invokeExact(handles.PFN_glNamedStringARB, type, namelen, name, stringlen, string); }
        catch (Throwable e) { throw new RuntimeException("error in NamedStringARB", e); }
    }

    /// ```
    /// void glDeleteNamedStringARB(GLint namelen, const GLchar* name);
    /// ```
    public void DeleteNamedStringARB(int namelen, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteNamedStringARB)) throw new SymbolNotFoundError("Symbol not found: glDeleteNamedStringARB");
        try { Handles.MH_glDeleteNamedStringARB.invokeExact(handles.PFN_glDeleteNamedStringARB, namelen, name); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteNamedStringARB", e); }
    }

    /// ```
    /// void glCompileShaderIncludeARB(GLuint shader, GLsizei count, const GLchar* const * path, const GLint* length);
    /// ```
    public void CompileShaderIncludeARB(int shader, int count, MemorySegment path, MemorySegment length) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompileShaderIncludeARB)) throw new SymbolNotFoundError("Symbol not found: glCompileShaderIncludeARB");
        try { Handles.MH_glCompileShaderIncludeARB.invokeExact(handles.PFN_glCompileShaderIncludeARB, shader, count, path, length); }
        catch (Throwable e) { throw new RuntimeException("error in CompileShaderIncludeARB", e); }
    }

    /// ```
    /// GLboolean glIsNamedStringARB(GLint namelen, const GLchar* name);
    /// ```
    public boolean IsNamedStringARB(int namelen, MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsNamedStringARB)) throw new SymbolNotFoundError("Symbol not found: glIsNamedStringARB");
        try { return (((byte) Handles.MH_glIsNamedStringARB.invokeExact(handles.PFN_glIsNamedStringARB, namelen, name)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsNamedStringARB", e); }
    }

    /// ```
    /// void glGetNamedStringARB(GLint namelen, const GLchar* name, GLsizei bufSize, GLint* stringlen, GLchar* string);
    /// ```
    public void GetNamedStringARB(int namelen, MemorySegment name, int bufSize, MemorySegment stringlen, MemorySegment string) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedStringARB)) throw new SymbolNotFoundError("Symbol not found: glGetNamedStringARB");
        try { Handles.MH_glGetNamedStringARB.invokeExact(handles.PFN_glGetNamedStringARB, namelen, name, bufSize, stringlen, string); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedStringARB", e); }
    }

    /// ```
    /// void glGetNamedStringivARB(GLint namelen, const GLchar* name, GLenum pname, GLint* params);
    /// ```
    public void GetNamedStringivARB(int namelen, MemorySegment name, int pname, MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedStringivARB)) throw new SymbolNotFoundError("Symbol not found: glGetNamedStringivARB");
        try { Handles.MH_glGetNamedStringivARB.invokeExact(handles.PFN_glGetNamedStringivARB, namelen, name, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedStringivARB", e); }
    }

}

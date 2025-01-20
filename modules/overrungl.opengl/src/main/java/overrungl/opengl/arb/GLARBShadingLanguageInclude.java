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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLARBShadingLanguageInclude {
    public static final int GL_SHADER_INCLUDE_ARB = 0x8DAE;
    public static final int GL_NAMED_STRING_LENGTH_ARB = 0x8DE9;
    public static final int GL_NAMED_STRING_TYPE_ARB = 0x8DEA;
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glNamedStringARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glDeleteNamedStringARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glCompileShaderIncludeARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glIsNamedStringARB = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetNamedStringARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glGetNamedStringivARB = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glNamedStringARB = RuntimeHelper.downcall(Descriptors.FD_glNamedStringARB);
        public static final MethodHandle MH_glDeleteNamedStringARB = RuntimeHelper.downcall(Descriptors.FD_glDeleteNamedStringARB);
        public static final MethodHandle MH_glCompileShaderIncludeARB = RuntimeHelper.downcall(Descriptors.FD_glCompileShaderIncludeARB);
        public static final MethodHandle MH_glIsNamedStringARB = RuntimeHelper.downcall(Descriptors.FD_glIsNamedStringARB);
        public static final MethodHandle MH_glGetNamedStringARB = RuntimeHelper.downcall(Descriptors.FD_glGetNamedStringARB);
        public static final MethodHandle MH_glGetNamedStringivARB = RuntimeHelper.downcall(Descriptors.FD_glGetNamedStringivARB);
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

    public void NamedStringARB(@CType("GLenum") int type, @CType("GLint") int namelen, @CType("const GLchar *") java.lang.foreign.MemorySegment name, @CType("GLint") int stringlen, @CType("const GLchar *") java.lang.foreign.MemorySegment string) {
        if (Unmarshal.isNullPointer(handles.PFN_glNamedStringARB)) throw new SymbolNotFoundError("Symbol not found: glNamedStringARB");
        try { Handles.MH_glNamedStringARB.invokeExact(handles.PFN_glNamedStringARB, type, namelen, name, stringlen, string); }
        catch (Throwable e) { throw new RuntimeException("error in glNamedStringARB", e); }
    }

    public void DeleteNamedStringARB(@CType("GLint") int namelen, @CType("const GLchar *") java.lang.foreign.MemorySegment name) {
        if (Unmarshal.isNullPointer(handles.PFN_glDeleteNamedStringARB)) throw new SymbolNotFoundError("Symbol not found: glDeleteNamedStringARB");
        try { Handles.MH_glDeleteNamedStringARB.invokeExact(handles.PFN_glDeleteNamedStringARB, namelen, name); }
        catch (Throwable e) { throw new RuntimeException("error in glDeleteNamedStringARB", e); }
    }

    public void CompileShaderIncludeARB(@CType("GLuint") int shader, @CType("GLsizei") int count, @CType("const GLchar *const*") java.lang.foreign.MemorySegment path, @CType("const GLint *") java.lang.foreign.MemorySegment length) {
        if (Unmarshal.isNullPointer(handles.PFN_glCompileShaderIncludeARB)) throw new SymbolNotFoundError("Symbol not found: glCompileShaderIncludeARB");
        try { Handles.MH_glCompileShaderIncludeARB.invokeExact(handles.PFN_glCompileShaderIncludeARB, shader, count, path, length); }
        catch (Throwable e) { throw new RuntimeException("error in glCompileShaderIncludeARB", e); }
    }

    public @CType("GLboolean") boolean IsNamedStringARB(@CType("GLint") int namelen, @CType("const GLchar *") java.lang.foreign.MemorySegment name) {
        if (Unmarshal.isNullPointer(handles.PFN_glIsNamedStringARB)) throw new SymbolNotFoundError("Symbol not found: glIsNamedStringARB");
        try { return (boolean) Handles.MH_glIsNamedStringARB.invokeExact(handles.PFN_glIsNamedStringARB, namelen, name); }
        catch (Throwable e) { throw new RuntimeException("error in glIsNamedStringARB", e); }
    }

    public void GetNamedStringARB(@CType("GLint") int namelen, @CType("const GLchar *") java.lang.foreign.MemorySegment name, @CType("GLsizei") int bufSize, @CType("GLint *") java.lang.foreign.MemorySegment stringlen, @CType("GLchar *") java.lang.foreign.MemorySegment string) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedStringARB)) throw new SymbolNotFoundError("Symbol not found: glGetNamedStringARB");
        try { Handles.MH_glGetNamedStringARB.invokeExact(handles.PFN_glGetNamedStringARB, namelen, name, bufSize, stringlen, string); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedStringARB", e); }
    }

    public void GetNamedStringivARB(@CType("GLint") int namelen, @CType("const GLchar *") java.lang.foreign.MemorySegment name, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (Unmarshal.isNullPointer(handles.PFN_glGetNamedStringivARB)) throw new SymbolNotFoundError("Symbol not found: glGetNamedStringivARB");
        try { Handles.MH_glGetNamedStringivARB.invokeExact(handles.PFN_glGetNamedStringivARB, namelen, name, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in glGetNamedStringivARB", e); }
    }

}

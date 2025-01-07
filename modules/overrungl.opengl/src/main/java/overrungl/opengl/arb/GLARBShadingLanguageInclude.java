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
    public static final MethodHandle MH_glNamedStringARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glNamedStringARB;
    public static final MethodHandle MH_glDeleteNamedStringARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glDeleteNamedStringARB;
    public static final MethodHandle MH_glCompileShaderIncludeARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glCompileShaderIncludeARB;
    public static final MethodHandle MH_glIsNamedStringARB = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glIsNamedStringARB;
    public static final MethodHandle MH_glGetNamedStringARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetNamedStringARB;
    public static final MethodHandle MH_glGetNamedStringivARB = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
    public final MemorySegment PFN_glGetNamedStringivARB;

    public GLARBShadingLanguageInclude(overrungl.opengl.GLLoadFunc func) {
        PFN_glNamedStringARB = func.invoke("glNamedStringARB");
        PFN_glDeleteNamedStringARB = func.invoke("glDeleteNamedStringARB");
        PFN_glCompileShaderIncludeARB = func.invoke("glCompileShaderIncludeARB");
        PFN_glIsNamedStringARB = func.invoke("glIsNamedStringARB");
        PFN_glGetNamedStringARB = func.invoke("glGetNamedStringARB");
        PFN_glGetNamedStringivARB = func.invoke("glGetNamedStringivARB");
    }

    public void NamedStringARB(@CType("GLenum") int type, @CType("GLint") int namelen, @CType("const GLchar *") java.lang.foreign.MemorySegment name, @CType("GLint") int stringlen, @CType("const GLchar *") java.lang.foreign.MemorySegment string) {
        if (!Unmarshal.isNullPointer(PFN_glNamedStringARB)) { try {
            MH_glNamedStringARB.invokeExact(PFN_glNamedStringARB, type, namelen, name, stringlen, string);
        } catch (Throwable e) { throw new RuntimeException("error in glNamedStringARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glNamedStringARB"); }
    }

    public void DeleteNamedStringARB(@CType("GLint") int namelen, @CType("const GLchar *") java.lang.foreign.MemorySegment name) {
        if (!Unmarshal.isNullPointer(PFN_glDeleteNamedStringARB)) { try {
            MH_glDeleteNamedStringARB.invokeExact(PFN_glDeleteNamedStringARB, namelen, name);
        } catch (Throwable e) { throw new RuntimeException("error in glDeleteNamedStringARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glDeleteNamedStringARB"); }
    }

    public void CompileShaderIncludeARB(@CType("GLuint") int shader, @CType("GLsizei") int count, @CType("const GLchar *const*") java.lang.foreign.MemorySegment path, @CType("const GLint *") java.lang.foreign.MemorySegment length) {
        if (!Unmarshal.isNullPointer(PFN_glCompileShaderIncludeARB)) { try {
            MH_glCompileShaderIncludeARB.invokeExact(PFN_glCompileShaderIncludeARB, shader, count, path, length);
        } catch (Throwable e) { throw new RuntimeException("error in glCompileShaderIncludeARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glCompileShaderIncludeARB"); }
    }

    public @CType("GLboolean") boolean IsNamedStringARB(@CType("GLint") int namelen, @CType("const GLchar *") java.lang.foreign.MemorySegment name) {
        if (!Unmarshal.isNullPointer(PFN_glIsNamedStringARB)) { try {
            return (boolean) MH_glIsNamedStringARB.invokeExact(PFN_glIsNamedStringARB, namelen, name);
        } catch (Throwable e) { throw new RuntimeException("error in glIsNamedStringARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glIsNamedStringARB"); }
    }

    public void GetNamedStringARB(@CType("GLint") int namelen, @CType("const GLchar *") java.lang.foreign.MemorySegment name, @CType("GLsizei") int bufSize, @CType("GLint *") java.lang.foreign.MemorySegment stringlen, @CType("GLchar *") java.lang.foreign.MemorySegment string) {
        if (!Unmarshal.isNullPointer(PFN_glGetNamedStringARB)) { try {
            MH_glGetNamedStringARB.invokeExact(PFN_glGetNamedStringARB, namelen, name, bufSize, stringlen, string);
        } catch (Throwable e) { throw new RuntimeException("error in glGetNamedStringARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetNamedStringARB"); }
    }

    public void GetNamedStringivARB(@CType("GLint") int namelen, @CType("const GLchar *") java.lang.foreign.MemorySegment name, @CType("GLenum") int pname, @CType("GLint *") java.lang.foreign.MemorySegment params) {
        if (!Unmarshal.isNullPointer(PFN_glGetNamedStringivARB)) { try {
            MH_glGetNamedStringivARB.invokeExact(PFN_glGetNamedStringivARB, namelen, name, pname, params);
        } catch (Throwable e) { throw new RuntimeException("error in glGetNamedStringivARB", e); }
        } else { throw new SymbolNotFoundError("Symbol not found: glGetNamedStringivARB"); }
    }

}

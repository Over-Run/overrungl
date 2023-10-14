/*
 * MIT License
 *
 * Copyright (c) 2022-present Overrun Organization
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
package overrungl.opengl.ext.arb;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.*;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_ARB_shading_language_include}
  */
public final class GLARBShadingLanguageInclude {
    public static final int GL_SHADER_INCLUDE_ARB = 0x8DAE;
    public static final int GL_NAMED_STRING_LENGTH_ARB = 0x8DE9;
    public static final int GL_NAMED_STRING_TYPE_ARB = 0x8DEA;
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_shading_language_include) return;
        ext.glNamedStringARB = load.invoke("glNamedStringARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, JAVA_INT, ADDRESS));
        ext.glDeleteNamedStringARB = load.invoke("glDeleteNamedStringARB", ofVoid(JAVA_INT, ADDRESS));
        ext.glCompileShaderIncludeARB = load.invoke("glCompileShaderIncludeARB", ofVoid(JAVA_INT, JAVA_INT, ADDRESS, ADDRESS));
        ext.glIsNamedStringARB = load.invoke("glIsNamedStringARB", of(JAVA_BYTE, JAVA_INT, ADDRESS));
        ext.glGetNamedStringARB = load.invoke("glGetNamedStringARB", ofVoid(JAVA_INT, ADDRESS, JAVA_INT, ADDRESS, ADDRESS));
        ext.glGetNamedStringivARB = load.invoke("glGetNamedStringivARB", ofVoid(JAVA_INT, ADDRESS, JAVA_INT, ADDRESS));
    }

    public static void glNamedStringARB(int type, int nameLen, @NativeType("const GLchar*") MemorySegment name, int stringLen, @NativeType("const GLchar*") MemorySegment string) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedStringARB).invokeExact(type, nameLen, name, stringLen, string);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDeleteNamedStringARB(int nameLen, @NativeType("const GLchar*") MemorySegment name) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDeleteNamedStringARB).invokeExact(nameLen, name);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glCompileShaderIncludeARB(int shader, int count, @NativeType("const GLchar *const*") MemorySegment path, @NativeType("const GLint*") MemorySegment length) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glCompileShaderIncludeARB).invokeExact(shader, count, path, length);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static boolean glIsNamedStringARB(int nameLen, @NativeType("const GLchar*") MemorySegment name) {
        final var ext = getExtCapabilities();
        try {
            return (boolean)
            check(ext.glIsNamedStringARB).invokeExact(nameLen, name);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetNamedStringARB(int nameLen, @NativeType("const GLchar*") MemorySegment name, int bufSize, @NativeType("GLint*") MemorySegment stringLen, @NativeType("GLchar*") MemorySegment string) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetNamedStringARB).invokeExact(nameLen, name, bufSize, stringLen, string);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glGetNamedStringivARB(int nameLen, @NativeType("const GLchar*") MemorySegment name, int pname, @NativeType("GLint*") MemorySegment params) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glGetNamedStringivARB).invokeExact(nameLen, name, pname, params);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}

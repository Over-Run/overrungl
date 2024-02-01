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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_ARB_shading_language_include}
 */
public interface GLARBShadingLanguageInclude {
    int GL_SHADER_INCLUDE_ARB = 0x8DAE;
    int GL_NAMED_STRING_LENGTH_ARB = 0x8DE9;
    int GL_NAMED_STRING_TYPE_ARB = 0x8DEA;

    default void glNamedStringARB(int type, int nameLen, @NativeType("const GLchar*") MemorySegment name, int stringLen, @NativeType("const GLchar*") MemorySegment string) {
        throw new ContextException();
    }

    default void glDeleteNamedStringARB(int nameLen, @NativeType("const GLchar*") MemorySegment name) {
        throw new ContextException();
    }

    default void glCompileShaderIncludeARB(int shader, int count, @NativeType("const GLchar *const*") MemorySegment path, @NativeType("const GLint*") MemorySegment length) {
        throw new ContextException();
    }

    default boolean glIsNamedStringARB(int nameLen, @NativeType("const GLchar*") MemorySegment name) {
        throw new ContextException();
    }

    default void glGetNamedStringARB(int nameLen, @NativeType("const GLchar*") MemorySegment name, int bufSize, @NativeType("GLint*") MemorySegment stringLen, @NativeType("GLchar*") MemorySegment string) {
        throw new ContextException();
    }

    default void glGetNamedStringivARB(int nameLen, @NativeType("const GLchar*") MemorySegment name, int pname, @NativeType("GLint*") MemorySegment params) {
        throw new ContextException();
    }

}

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
 * {@code GL_ARB_gl_spirv}
 */
public interface GLARBGLSpirv {
    int GL_SHADER_BINARY_FORMAT_SPIR_V_ARB = 0x9551;
    int GL_SPIR_V_BINARY_ARB = 0x9552;

    default void glSpecializeShaderARB(int shader, @NativeType("const GLchar *") MemorySegment pEntryPoint, int numSpecializationConstants, @NativeType("const GLuint *") MemorySegment pConstantIndex, @NativeType("const GLuint *") MemorySegment pConstantValue) {
        throw new ContextException();
    }

}

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
package overrungl.opengl.ext.nv;

import overrungl.*;
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_parameter_buffer_object}
 */
public interface GLNVParameterBufferObject {
    int GL_MAX_PROGRAM_PARAMETER_BUFFER_BINDINGS_NV = 0x8DA0;
    int GL_MAX_PROGRAM_PARAMETER_BUFFER_SIZE_NV = 0x8DA1;
    int GL_VERTEX_PROGRAM_PARAMETER_BUFFER_NV = 0x8DA2;
    int GL_GEOMETRY_PROGRAM_PARAMETER_BUFFER_NV = 0x8DA3;
    int GL_FRAGMENT_PROGRAM_PARAMETER_BUFFER_NV = 0x8DA4;

    void glProgramBufferParametersfvNV(int target, int bindingIndex, int wordIndex, int count, @NativeType("const GLfloat *") MemorySegment params);
    void glProgramBufferParametersIivNV(int target, int bindingIndex, int wordIndex, int count, @NativeType("const GLint *") MemorySegment params);
    void glProgramBufferParametersIuivNV(int target, int bindingIndex, int wordIndex, int count, @NativeType("const GLuint *") MemorySegment params);
}

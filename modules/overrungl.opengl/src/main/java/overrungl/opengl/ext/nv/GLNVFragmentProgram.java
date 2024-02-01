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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_NV_fragment_program}
 */
public interface GLNVFragmentProgram {
    int GL_MAX_FRAGMENT_PROGRAM_LOCAL_PARAMETERS_NV = 0x8868;
    int GL_FRAGMENT_PROGRAM_NV = 0x8870;
    int GL_MAX_TEXTURE_COORDS_NV = 0x8871;
    int GL_MAX_TEXTURE_IMAGE_UNITS_NV = 0x8872;
    int GL_FRAGMENT_PROGRAM_BINDING_NV = 0x8873;
    int GL_PROGRAM_ERROR_STRING_NV = 0x8874;

    default void glProgramNamedParameter4fNV(int id, int len, @NativeType("const GLubyte *") MemorySegment name, float x, float y, float z, float w) {
        throw new ContextException();
    }

    default void glProgramNamedParameter4fvNV(int id, int len, @NativeType("const GLubyte *") MemorySegment name, @NativeType("const GLfloat *") MemorySegment v) {
        throw new ContextException();
    }

    default void glProgramNamedParameter4dNV(int id, int len, @NativeType("const GLubyte *") MemorySegment name, double x, double y, double z, double w) {
        throw new ContextException();
    }

    default void glProgramNamedParameter4dvNV(int id, int len, @NativeType("const GLubyte *") MemorySegment name, @NativeType("const GLdouble *") MemorySegment v) {
        throw new ContextException();
    }

    default void glGetProgramNamedParameterfvNV(int id, int len, @NativeType("const GLubyte *") MemorySegment name, @NativeType("GLfloat *") MemorySegment params) {
        throw new ContextException();
    }

    default void glGetProgramNamedParameterdvNV(int id, int len, @NativeType("const GLubyte *") MemorySegment name, @NativeType("GLdouble *") MemorySegment params) {
        throw new ContextException();
    }

}

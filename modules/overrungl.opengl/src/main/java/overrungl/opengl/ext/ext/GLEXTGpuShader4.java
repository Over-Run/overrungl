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
package overrungl.opengl.ext.ext;

import overrungl.*;
import overrun.marshal.*;
import java.lang.foreign.*;

/**
 * {@code GL_EXT_gpu_shader4}
 */
public interface GLEXTGpuShader4 {
    int GL_SAMPLER_1D_ARRAY_EXT = 0x8DC0;
    int GL_SAMPLER_2D_ARRAY_EXT = 0x8DC1;
    int GL_SAMPLER_BUFFER_EXT = 0x8DC2;
    int GL_SAMPLER_1D_ARRAY_SHADOW_EXT = 0x8DC3;
    int GL_SAMPLER_2D_ARRAY_SHADOW_EXT = 0x8DC4;
    int GL_SAMPLER_CUBE_SHADOW_EXT = 0x8DC5;
    int GL_UNSIGNED_INT_VEC2_EXT = 0x8DC6;
    int GL_UNSIGNED_INT_VEC3_EXT = 0x8DC7;
    int GL_UNSIGNED_INT_VEC4_EXT = 0x8DC8;
    int GL_INT_SAMPLER_1D_EXT = 0x8DC9;
    int GL_INT_SAMPLER_2D_EXT = 0x8DCA;
    int GL_INT_SAMPLER_3D_EXT = 0x8DCB;
    int GL_INT_SAMPLER_CUBE_EXT = 0x8DCC;
    int GL_INT_SAMPLER_2D_RECT_EXT = 0x8DCD;
    int GL_INT_SAMPLER_1D_ARRAY_EXT = 0x8DCE;
    int GL_INT_SAMPLER_2D_ARRAY_EXT = 0x8DCF;
    int GL_INT_SAMPLER_BUFFER_EXT = 0x8DD0;
    int GL_UNSIGNED_INT_SAMPLER_1D_EXT = 0x8DD1;
    int GL_UNSIGNED_INT_SAMPLER_2D_EXT = 0x8DD2;
    int GL_UNSIGNED_INT_SAMPLER_3D_EXT = 0x8DD3;
    int GL_UNSIGNED_INT_SAMPLER_CUBE_EXT = 0x8DD4;
    int GL_UNSIGNED_INT_SAMPLER_2D_RECT_EXT = 0x8DD5;
    int GL_UNSIGNED_INT_SAMPLER_1D_ARRAY_EXT = 0x8DD6;
    int GL_UNSIGNED_INT_SAMPLER_2D_ARRAY_EXT = 0x8DD7;
    int GL_UNSIGNED_INT_SAMPLER_BUFFER_EXT = 0x8DD8;
    int GL_MIN_PROGRAM_TEXEL_OFFSET_EXT = 0x8904;
    int GL_MAX_PROGRAM_TEXEL_OFFSET_EXT = 0x8905;
    int GL_VERTEX_ATTRIB_ARRAY_INTEGER_EXT = 0x88FD;

    void glGetUniformuivEXT(int program, int location, @NativeType("GLuint *") MemorySegment params);
    void glBindFragDataLocationEXT(int program, int color, @NativeType("const GLchar *") MemorySegment name);
    int glGetFragDataLocationEXT(int program, @NativeType("const GLchar *") MemorySegment name);
    void glUniform1uiEXT(int location, int v0);
    void glUniform2uiEXT(int location, int v0, int v1);
    void glUniform3uiEXT(int location, int v0, int v1, int v2);
    void glUniform4uiEXT(int location, int v0, int v1, int v2, int v3);
    void glUniform1uivEXT(int location, int count, @NativeType("const GLuint *") MemorySegment value);
    void glUniform2uivEXT(int location, int count, @NativeType("const GLuint *") MemorySegment value);
    void glUniform3uivEXT(int location, int count, @NativeType("const GLuint *") MemorySegment value);
    void glUniform4uivEXT(int location, int count, @NativeType("const GLuint *") MemorySegment value);
    void glVertexAttribI1iEXT(int index, int x);
    void glVertexAttribI2iEXT(int index, int x, int y);
    void glVertexAttribI3iEXT(int index, int x, int y, int z);
    void glVertexAttribI4iEXT(int index, int x, int y, int z, int w);
    void glVertexAttribI1uiEXT(int index, int x);
    void glVertexAttribI2uiEXT(int index, int x, int y);
    void glVertexAttribI3uiEXT(int index, int x, int y, int z);
    void glVertexAttribI4uiEXT(int index, int x, int y, int z, int w);
    void glVertexAttribI1ivEXT(int index, @NativeType("const GLint *") MemorySegment v);
    void glVertexAttribI2ivEXT(int index, @NativeType("const GLint *") MemorySegment v);
    void glVertexAttribI3ivEXT(int index, @NativeType("const GLint *") MemorySegment v);
    void glVertexAttribI4ivEXT(int index, @NativeType("const GLint *") MemorySegment v);
    void glVertexAttribI1uivEXT(int index, @NativeType("const GLuint *") MemorySegment v);
    void glVertexAttribI2uivEXT(int index, @NativeType("const GLuint *") MemorySegment v);
    void glVertexAttribI3uivEXT(int index, @NativeType("const GLuint *") MemorySegment v);
    void glVertexAttribI4uivEXT(int index, @NativeType("const GLuint *") MemorySegment v);
    void glVertexAttribI4bvEXT(int index, @NativeType("const GLbyte *") MemorySegment v);
    void glVertexAttribI4svEXT(int index, @NativeType("const GLshort *") MemorySegment v);
    void glVertexAttribI4ubvEXT(int index, @NativeType("const GLubyte *") MemorySegment v);
    void glVertexAttribI4usvEXT(int index, @NativeType("const GLushort *") MemorySegment v);
    void glVertexAttribIPointerEXT(int index, int size, int type, int stride, @NativeType("const void *") MemorySegment pointer);
    void glGetVertexAttribIivEXT(int index, int pname, @NativeType("GLint *") MemorySegment params);
    void glGetVertexAttribIuivEXT(int index, int pname, @NativeType("GLuint *") MemorySegment params);
}

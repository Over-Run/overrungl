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
 * {@code GL_NV_command_list}
 */
public interface GLNVCommandList {
    int GL_TERMINATE_SEQUENCE_COMMAND_NV = 0x0000;
    int GL_NOP_COMMAND_NV = 0x0001;
    int GL_DRAW_ELEMENTS_COMMAND_NV = 0x0002;
    int GL_DRAW_ARRAYS_COMMAND_NV = 0x0003;
    int GL_DRAW_ELEMENTS_STRIP_COMMAND_NV = 0x0004;
    int GL_DRAW_ARRAYS_STRIP_COMMAND_NV = 0x0005;
    int GL_DRAW_ELEMENTS_INSTANCED_COMMAND_NV = 0x0006;
    int GL_DRAW_ARRAYS_INSTANCED_COMMAND_NV = 0x0007;
    int GL_ELEMENT_ADDRESS_COMMAND_NV = 0x0008;
    int GL_ATTRIBUTE_ADDRESS_COMMAND_NV = 0x0009;
    int GL_UNIFORM_ADDRESS_COMMAND_NV = 0x000A;
    int GL_BLEND_COLOR_COMMAND_NV = 0x000B;
    int GL_STENCIL_REF_COMMAND_NV = 0x000C;
    int GL_LINE_WIDTH_COMMAND_NV = 0x000D;
    int GL_POLYGON_OFFSET_COMMAND_NV = 0x000E;
    int GL_ALPHA_REF_COMMAND_NV = 0x000F;
    int GL_VIEWPORT_COMMAND_NV = 0x0010;
    int GL_SCISSOR_COMMAND_NV = 0x0011;
    int GL_FRONT_FACE_COMMAND_NV = 0x0012;

    void glCreateStatesNV(int n, @NativeType("GLuint *") MemorySegment states);
    void glDeleteStatesNV(int n, @NativeType("const GLuint *") MemorySegment states);
    boolean glIsStateNV(int state);
    void glStateCaptureNV(int state, int mode);
    int glGetCommandHeaderNV(int tokenID, int size);
    short glGetStageIndexNV(int shadertype);
    void glDrawCommandsNV(int primitiveMode, int buffer, @NativeType("const GLintptr *") MemorySegment indirects, @NativeType("const GLsizei *") MemorySegment sizes, int count);
    void glDrawCommandsAddressNV(int primitiveMode, @NativeType("const GLuint64 *") MemorySegment indirects, @NativeType("const GLsizei *") MemorySegment sizes, int count);
    void glDrawCommandsStatesNV(int buffer, @NativeType("const GLintptr *") MemorySegment indirects, @NativeType("const GLsizei *") MemorySegment sizes, @NativeType("const GLuint *") MemorySegment states, @NativeType("const GLuint *") MemorySegment fbos, int count);
    void glDrawCommandsStatesAddressNV(@NativeType("const GLuint64 *") MemorySegment indirects, @NativeType("const GLsizei *") MemorySegment sizes, @NativeType("const GLuint *") MemorySegment states, @NativeType("const GLuint *") MemorySegment fbos, int count);
    void glCreateCommandListsNV(int n, @NativeType("GLuint *") MemorySegment lists);
    void glDeleteCommandListsNV(int n, @NativeType("const GLuint *") MemorySegment lists);
    boolean glIsCommandListNV(int list);
    void glListDrawCommandsStatesClientNV(int list, int segment, @NativeType("const void **") MemorySegment indirects, @NativeType("const GLsizei *") MemorySegment sizes, @NativeType("const GLuint *") MemorySegment states, @NativeType("const GLuint *") MemorySegment fbos, int count);
    void glCommandListSegmentsNV(int list, int segments);
    void glCompileCommandListNV(int list);
    void glCallCommandListNV(int list);
}

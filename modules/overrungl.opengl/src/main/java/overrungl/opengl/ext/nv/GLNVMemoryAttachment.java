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
 * {@code GL_NV_memory_attachment}
 */
public interface GLNVMemoryAttachment {
    int GL_ATTACHED_MEMORY_OBJECT_NV = 0x95A4;
    int GL_ATTACHED_MEMORY_OFFSET_NV = 0x95A5;
    int GL_MEMORY_ATTACHABLE_ALIGNMENT_NV = 0x95A6;
    int GL_MEMORY_ATTACHABLE_SIZE_NV = 0x95A7;
    int GL_MEMORY_ATTACHABLE_NV = 0x95A8;
    int GL_DETACHED_MEMORY_INCARNATION_NV = 0x95A9;
    int GL_DETACHED_TEXTURES_NV = 0x95AA;
    int GL_DETACHED_BUFFERS_NV = 0x95AB;
    int GL_MAX_DETACHED_TEXTURES_NV = 0x95AC;
    int GL_MAX_DETACHED_BUFFERS_NV = 0x95AD;

    void glGetMemoryObjectDetachedResourcesuivNV(int memory, int pname, int first, int count, @NativeType("GLuint *") MemorySegment params);
    void glResetMemoryObjectParameterNV(int memory, int pname);
    void glTexAttachMemoryNV(int target, int memory, long offset);
    void glBufferAttachMemoryNV(int target, int memory, long offset);
    void glTextureAttachMemoryNV(int texture, int memory, long offset);
    void glNamedBufferAttachMemoryNV(int buffer, int memory, long offset);
}

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
 * {@code GL_NV_query_resource}
 */
public interface GLNVQueryResource {
    int GL_QUERY_RESOURCE_TYPE_VIDMEM_ALLOC_NV = 0x9540;
    int GL_QUERY_RESOURCE_MEMTYPE_VIDMEM_NV = 0x9542;
    int GL_QUERY_RESOURCE_SYS_RESERVED_NV = 0x9544;
    int GL_QUERY_RESOURCE_TEXTURE_NV = 0x9545;
    int GL_QUERY_RESOURCE_RENDERBUFFER_NV = 0x9546;
    int GL_QUERY_RESOURCE_BUFFEROBJECT_NV = 0x9547;

    default int glQueryResourceNV(int queryType, int tagId, int count, @NativeType("GLint *") MemorySegment buffer) {
        throw new ContextException();
    }

}

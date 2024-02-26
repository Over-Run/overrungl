/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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
import overrungl.NativeType;
import overrungl.opengl.*;
import java.lang.foreign.*;

/**
 * {@code GL_EXT_memory_object_win32}
 */
public interface GLEXTMemoryObjectWin32 extends overrun.marshal.DirectAccess {
    int GL_HANDLE_TYPE_OPAQUE_WIN32_EXT = 0x9587;
    int GL_HANDLE_TYPE_OPAQUE_WIN32_KMT_EXT = 0x9588;
    int GL_DEVICE_LUID_EXT = 0x9599;
    int GL_DEVICE_NODE_MASK_EXT = 0x959A;
    int GL_LUID_SIZE_EXT = 8;
    int GL_HANDLE_TYPE_D3D12_TILEPOOL_EXT = 0x9589;
    int GL_HANDLE_TYPE_D3D12_RESOURCE_EXT = 0x958A;
    int GL_HANDLE_TYPE_D3D11_IMAGE_EXT = 0x958B;
    int GL_HANDLE_TYPE_D3D11_IMAGE_KMT_EXT = 0x958C;

    default void glImportMemoryWin32HandleEXT(int memory, long size, int handleType, @NativeType("void *") MemorySegment handle) {
        throw new ContextException();
    }

    default void glImportMemoryWin32NameEXT(int memory, long size, int handleType, @NativeType("const void *") MemorySegment name) {
        throw new ContextException();
    }

}

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
 * {@code GL_EXT_semaphore_win32}
 */
public interface GLEXTSemaphoreWin32 {
    int GL_HANDLE_TYPE_D3D12_FENCE_EXT = 0x9594;
    int GL_D3D12_FENCE_VALUE_EXT = 0x9595;

    void glImportSemaphoreWin32HandleEXT(int semaphore, int handleType, @NativeType("void * ") MemorySegment handle);
    void glImportSemaphoreWin32NameEXT(int semaphore, int handleType, @NativeType("const void *") MemorySegment name);
}

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
 * {@code GL_NV_draw_vulkan_image}
 */
public interface GLNVDrawVulkanImage {

    void glDrawVkImageNV(long vkImage, int sampler, float x0, float y0, float x1, float y1, float z, float s0, float t0, float s1, float t1);
    @NativeType("GLVULKANPROCNV") MemorySegment glGetVkProcAddrNV(@NativeType("const GLchar *") MemorySegment name);
    void glWaitVkSemaphoreNV(long vkSemaphore);
    void glSignalVkSemaphoreNV(long vkSemaphore);
    void glSignalVkFenceNV(long vkFence);
}

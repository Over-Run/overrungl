/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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
package overrungl.vulkan.qnx;
import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKQNXExternalMemoryScreenBuffer {
    public static final int VK_QNX_EXTERNAL_MEMORY_SCREEN_BUFFER_SPEC_VERSION = 1;
    public static final String VK_QNX_EXTERNAL_MEMORY_SCREEN_BUFFER_EXTENSION_NAME = "VK_QNX_external_memory_screen_buffer";
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_SCREEN_BUFFER_BIT_QNX = 0x00004000;
    public static final int VK_STRUCTURE_TYPE_SCREEN_BUFFER_PROPERTIES_QNX = 1000529000;
    public static final int VK_STRUCTURE_TYPE_SCREEN_BUFFER_FORMAT_PROPERTIES_QNX = 1000529001;
    public static final int VK_STRUCTURE_TYPE_IMPORT_SCREEN_BUFFER_INFO_QNX = 1000529002;
    public static final int VK_STRUCTURE_TYPE_EXTERNAL_FORMAT_QNX = 1000529003;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_SCREEN_BUFFER_FEATURES_QNX = 1000529004;
    public static final class Handles {
        public static final MethodHandle MH_vkGetScreenBufferPropertiesQNX = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKQNXExternalMemoryScreenBuffer() {}

    /// ```
    /// (int) VkResult vkGetScreenBufferPropertiesQNX((struct VkDevice*) VkDevice device, const struct _screen_buffer * buffer, VkScreenBufferPropertiesQNX* pProperties);
    /// ```
    public static int vkGetScreenBufferPropertiesQNX(VkDevice device, MemorySegment buffer, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetScreenBufferPropertiesQNX)) throw new VKSymbolNotFoundError("Symbol not found: vkGetScreenBufferPropertiesQNX");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetScreenBufferPropertiesQNX", device, buffer, pProperties); }
        return (int) Handles.MH_vkGetScreenBufferPropertiesQNX.invokeExact(device.capabilities().PFN_vkGetScreenBufferPropertiesQNX, device.segment(), buffer, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetScreenBufferPropertiesQNX", e); }
    }

}

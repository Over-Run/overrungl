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
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKEXTExternalMemoryHost {
    public static final int VK_EXT_EXTERNAL_MEMORY_HOST_SPEC_VERSION = 1;
    public static final String VK_EXT_EXTERNAL_MEMORY_HOST_EXTENSION_NAME = "VK_EXT_external_memory_host";
    public static final int VK_STRUCTURE_TYPE_IMPORT_MEMORY_HOST_POINTER_INFO_EXT = 1000178000;
    public static final int VK_STRUCTURE_TYPE_MEMORY_HOST_POINTER_PROPERTIES_EXT = 1000178001;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_HOST_PROPERTIES_EXT = 1000178002;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT = 0x00000080;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT = 0x00000100;
    public static final class Handles {
        public static final MethodHandle MH_vkGetMemoryHostPointerPropertiesEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTExternalMemoryHost() {}

    /// ```
    /// (int) VkResult vkGetMemoryHostPointerPropertiesEXT((struct VkDevice*) VkDevice device, (int) VkExternalMemoryHandleTypeFlagBits handleType, const void* pHostPointer, VkMemoryHostPointerPropertiesEXT* pMemoryHostPointerProperties);
    /// ```
    public static int vkGetMemoryHostPointerPropertiesEXT(VkDevice device, int handleType, MemorySegment pHostPointer, MemorySegment pMemoryHostPointerProperties) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetMemoryHostPointerPropertiesEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetMemoryHostPointerPropertiesEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetMemoryHostPointerPropertiesEXT", device, handleType, pHostPointer, pMemoryHostPointerProperties); }
        return (int) Handles.MH_vkGetMemoryHostPointerPropertiesEXT.invokeExact(device.capabilities().PFN_vkGetMemoryHostPointerPropertiesEXT, device.segment(), handleType, pHostPointer, pMemoryHostPointerProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetMemoryHostPointerPropertiesEXT", e); }
    }

}

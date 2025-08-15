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
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_device_group_creation` - instance extension
public final class VKKHRDeviceGroupCreation {
    public static final int VK_KHR_DEVICE_GROUP_CREATION_SPEC_VERSION = 1;
    public static final String VK_KHR_DEVICE_GROUP_CREATION_EXTENSION_NAME = "VK_KHR_device_group_creation";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES_KHR = 1000070000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO_KHR = 1000070001;
    public static final int VK_MAX_DEVICE_GROUP_SIZE_KHR = 32;
    public static final int VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHR = 0x00000002;
    public static final class Handles {
        public static final MethodHandle MH_vkEnumeratePhysicalDeviceGroupsKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRDeviceGroupCreation() {}

    /// Invokes `vkEnumeratePhysicalDeviceGroupsKHR`.
    /// ```
    /// (int) VkResult vkEnumeratePhysicalDeviceGroupsKHR((struct VkInstance*) VkInstance instance, uint32_t* pPhysicalDeviceGroupCount, VkPhysicalDeviceGroupProperties* pPhysicalDeviceGroupProperties);
    /// ```
    public static int vkEnumeratePhysicalDeviceGroupsKHR(@NonNull VkInstance instance, @NonNull MemorySegment pPhysicalDeviceGroupCount, @NonNull MemorySegment pPhysicalDeviceGroupProperties) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkEnumeratePhysicalDeviceGroupsKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkEnumeratePhysicalDeviceGroupsKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkEnumeratePhysicalDeviceGroupsKHR", instance, pPhysicalDeviceGroupCount, pPhysicalDeviceGroupProperties); }
        return (int) Handles.MH_vkEnumeratePhysicalDeviceGroupsKHR.invokeExact(instance.capabilities().PFN_vkEnumeratePhysicalDeviceGroupsKHR, instance.segment(), pPhysicalDeviceGroupCount, pPhysicalDeviceGroupProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumeratePhysicalDeviceGroupsKHR", e); }
    }

}

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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.vulkan.VK11.*;
public class VKKHRDeviceGroupCreation {
    public static final int VK_KHR_DEVICE_GROUP_CREATION_SPEC_VERSION = 1;
    public static final String VK_KHR_DEVICE_GROUP_CREATION_EXTENSION_NAME = "VK_KHR_device_group_creation";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES_KHR = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES;
    public static final int VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO_KHR = VK_STRUCTURE_TYPE_DEVICE_GROUP_DEVICE_CREATE_INFO;
    public static final int VK_MAX_DEVICE_GROUP_SIZE_KHR = VK_MAX_DEVICE_GROUP_SIZE;
    public static final int VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHR = VK_MEMORY_HEAP_MULTI_INSTANCE_BIT;
    public static final MethodHandle MH_vkEnumeratePhysicalDeviceGroupsKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkEnumeratePhysicalDeviceGroupsKHR;

    public VKKHRDeviceGroupCreation(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
        PFN_vkEnumeratePhysicalDeviceGroupsKHR = func.invoke(instance, "vkEnumeratePhysicalDeviceGroupsKHR", "vkEnumeratePhysicalDeviceGroups");
    }

    public @CType("VkResult") int EnumeratePhysicalDeviceGroupsKHR(@CType("VkInstance") MemorySegment instance, @CType("uint32_t *") MemorySegment pPhysicalDeviceGroupCount, @CType("VkPhysicalDeviceGroupProperties *") MemorySegment pPhysicalDeviceGroupProperties) {
        if (Unmarshal.isNullPointer(PFN_vkEnumeratePhysicalDeviceGroupsKHR)) throw new SymbolNotFoundError("Symbol not found: vkEnumeratePhysicalDeviceGroupsKHR");
        try { return (int) MH_vkEnumeratePhysicalDeviceGroupsKHR.invokeExact(PFN_vkEnumeratePhysicalDeviceGroupsKHR, instance, pPhysicalDeviceGroupCount, pPhysicalDeviceGroupProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkEnumeratePhysicalDeviceGroupsKHR", e); }
    }

}

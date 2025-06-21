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
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKEXTPrivateData {
    public static final int VK_EXT_PRIVATE_DATA_SPEC_VERSION = 1;
    public static final String VK_EXT_PRIVATE_DATA_EXTENSION_NAME = "VK_EXT_private_data";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES_EXT = 1000295000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO_EXT = 1000295001;
    public static final int VK_STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO_EXT = 1000295002;
    public static final int VK_OBJECT_TYPE_PRIVATE_DATA_SLOT_EXT = 1000295000;
    public static final class Handles {
        public static final MethodHandle MH_vkCreatePrivateDataSlotEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyPrivateDataSlotEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkSetPrivateDataEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkGetPrivateDataEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTPrivateData() {}

    /// ```
    /// (int) VkResult vkCreatePrivateDataSlotEXT((struct VkDevice*) VkDevice device, const VkPrivateDataSlotCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkPrivateDataSlot* pPrivateDataSlot);
    /// ```
    public static int vkCreatePrivateDataSlotEXT(VkDevice device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pPrivateDataSlot) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreatePrivateDataSlotEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCreatePrivateDataSlotEXT");
        try { return (int) Handles.MH_vkCreatePrivateDataSlotEXT.invokeExact(device.capabilities().PFN_vkCreatePrivateDataSlotEXT, device.segment(), pCreateInfo, pAllocator, pPrivateDataSlot); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreatePrivateDataSlotEXT", e); }
    }

    /// ```
    /// void vkDestroyPrivateDataSlotEXT((struct VkDevice*) VkDevice device, (uint64_t) VkPrivateDataSlot privateDataSlot, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyPrivateDataSlotEXT(VkDevice device, long privateDataSlot, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyPrivateDataSlotEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyPrivateDataSlotEXT");
        try { Handles.MH_vkDestroyPrivateDataSlotEXT.invokeExact(device.capabilities().PFN_vkDestroyPrivateDataSlotEXT, device.segment(), privateDataSlot, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyPrivateDataSlotEXT", e); }
    }

    /// ```
    /// (int) VkResult vkSetPrivateDataEXT((struct VkDevice*) VkDevice device, (int) VkObjectType objectType, uint64_t objectHandle, (uint64_t) VkPrivateDataSlot privateDataSlot, uint64_t data);
    /// ```
    public static int vkSetPrivateDataEXT(VkDevice device, int objectType, long objectHandle, long privateDataSlot, long data) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkSetPrivateDataEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkSetPrivateDataEXT");
        try { return (int) Handles.MH_vkSetPrivateDataEXT.invokeExact(device.capabilities().PFN_vkSetPrivateDataEXT, device.segment(), objectType, objectHandle, privateDataSlot, data); }
        catch (Throwable e) { throw new RuntimeException("error in vkSetPrivateDataEXT", e); }
    }

    /// ```
    /// void vkGetPrivateDataEXT((struct VkDevice*) VkDevice device, (int) VkObjectType objectType, uint64_t objectHandle, (uint64_t) VkPrivateDataSlot privateDataSlot, uint64_t* pData);
    /// ```
    public static void vkGetPrivateDataEXT(VkDevice device, int objectType, long objectHandle, long privateDataSlot, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetPrivateDataEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPrivateDataEXT");
        try { Handles.MH_vkGetPrivateDataEXT.invokeExact(device.capabilities().PFN_vkGetPrivateDataEXT, device.segment(), objectType, objectHandle, privateDataSlot, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPrivateDataEXT", e); }
    }

}

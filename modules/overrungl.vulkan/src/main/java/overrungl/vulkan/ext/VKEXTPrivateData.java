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
public class VKEXTPrivateData {
    public static final int VK_EXT_PRIVATE_DATA_SPEC_VERSION = 1;
    public static final String VK_EXT_PRIVATE_DATA_EXTENSION_NAME = "VK_EXT_private_data";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES_EXT = 1000295000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO_EXT = 1000295001;
    public static final int VK_STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO_EXT = 1000295002;
    public static final int VK_OBJECT_TYPE_PRIVATE_DATA_SLOT_EXT = 1000295000;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCreatePrivateDataSlotEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyPrivateDataSlotEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkSetPrivateDataEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkGetPrivateDataEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkCreatePrivateDataSlotEXT;
        public final MemorySegment PFN_vkDestroyPrivateDataSlotEXT;
        public final MemorySegment PFN_vkSetPrivateDataEXT;
        public final MemorySegment PFN_vkGetPrivateDataEXT;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkCreatePrivateDataSlotEXT = func.invoke(device, "vkCreatePrivateDataSlotEXT", "vkCreatePrivateDataSlot");
            PFN_vkDestroyPrivateDataSlotEXT = func.invoke(device, "vkDestroyPrivateDataSlotEXT", "vkDestroyPrivateDataSlot");
            PFN_vkSetPrivateDataEXT = func.invoke(device, "vkSetPrivateDataEXT", "vkSetPrivateData");
            PFN_vkGetPrivateDataEXT = func.invoke(device, "vkGetPrivateDataEXT", "vkGetPrivateData");
        }
    }

    public VKEXTPrivateData(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// VkResult vkCreatePrivateDataSlotEXT(VkDevice device, const VkPrivateDataSlotCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkPrivateDataSlot* pPrivateDataSlot);
    /// ```
    public int CreatePrivateDataSlotEXT(MemorySegment device, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pPrivateDataSlot) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreatePrivateDataSlotEXT)) throw new SymbolNotFoundError("Symbol not found: vkCreatePrivateDataSlotEXT");
        try { return (int) Handles.MH_vkCreatePrivateDataSlotEXT.invokeExact(handles.PFN_vkCreatePrivateDataSlotEXT, device, pCreateInfo, pAllocator, pPrivateDataSlot); }
        catch (Throwable e) { throw new RuntimeException("error in CreatePrivateDataSlotEXT", e); }
    }

    /// ```
    /// void vkDestroyPrivateDataSlotEXT(VkDevice device, VkPrivateDataSlot privateDataSlot, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyPrivateDataSlotEXT(MemorySegment device, long privateDataSlot, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyPrivateDataSlotEXT)) throw new SymbolNotFoundError("Symbol not found: vkDestroyPrivateDataSlotEXT");
        try { Handles.MH_vkDestroyPrivateDataSlotEXT.invokeExact(handles.PFN_vkDestroyPrivateDataSlotEXT, device, privateDataSlot, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyPrivateDataSlotEXT", e); }
    }

    /// ```
    /// VkResult vkSetPrivateDataEXT(VkDevice device, VkObjectType objectType, uint64_t objectHandle, VkPrivateDataSlot privateDataSlot, uint64_t data);
    /// ```
    public int SetPrivateDataEXT(MemorySegment device, int objectType, long objectHandle, long privateDataSlot, long data) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkSetPrivateDataEXT)) throw new SymbolNotFoundError("Symbol not found: vkSetPrivateDataEXT");
        try { return (int) Handles.MH_vkSetPrivateDataEXT.invokeExact(handles.PFN_vkSetPrivateDataEXT, device, objectType, objectHandle, privateDataSlot, data); }
        catch (Throwable e) { throw new RuntimeException("error in SetPrivateDataEXT", e); }
    }

    /// ```
    /// void vkGetPrivateDataEXT(VkDevice device, VkObjectType objectType, uint64_t objectHandle, VkPrivateDataSlot privateDataSlot, uint64_t* pData);
    /// ```
    public void GetPrivateDataEXT(MemorySegment device, int objectType, long objectHandle, long privateDataSlot, MemorySegment pData) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetPrivateDataEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetPrivateDataEXT");
        try { Handles.MH_vkGetPrivateDataEXT.invokeExact(handles.PFN_vkGetPrivateDataEXT, device, objectType, objectHandle, privateDataSlot, pData); }
        catch (Throwable e) { throw new RuntimeException("error in GetPrivateDataEXT", e); }
    }

}

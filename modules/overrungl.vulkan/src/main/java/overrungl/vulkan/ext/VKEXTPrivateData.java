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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.vulkan.VK13.*;
public class VKEXTPrivateData {
    public static final int VK_EXT_PRIVATE_DATA_SPEC_VERSION = 1;
    public static final String VK_EXT_PRIVATE_DATA_EXTENSION_NAME = "VK_EXT_private_data";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES_EXT = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES;
    public static final int VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO_EXT = VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO_EXT = VK_STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO;
    public static final int VK_OBJECT_TYPE_PRIVATE_DATA_SLOT_EXT = VK_OBJECT_TYPE_PRIVATE_DATA_SLOT;
    public static final MethodHandle MH_vkCreatePrivateDataSlotEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkDestroyPrivateDataSlotEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkSetPrivateDataEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
    public static final MethodHandle MH_vkGetPrivateDataEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkCreatePrivateDataSlotEXT;
    public final MemorySegment PFN_vkDestroyPrivateDataSlotEXT;
    public final MemorySegment PFN_vkSetPrivateDataEXT;
    public final MemorySegment PFN_vkGetPrivateDataEXT;

    public VKEXTPrivateData(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkCreatePrivateDataSlotEXT = func.invoke(device, "vkCreatePrivateDataSlotEXT", "vkCreatePrivateDataSlot");
        PFN_vkDestroyPrivateDataSlotEXT = func.invoke(device, "vkDestroyPrivateDataSlotEXT", "vkDestroyPrivateDataSlot");
        PFN_vkSetPrivateDataEXT = func.invoke(device, "vkSetPrivateDataEXT", "vkSetPrivateData");
        PFN_vkGetPrivateDataEXT = func.invoke(device, "vkGetPrivateDataEXT", "vkGetPrivateData");
    }

    public @CType("VkResult") int CreatePrivateDataSlotEXT(@CType("VkDevice") MemorySegment device, @CType("const VkPrivateDataSlotCreateInfo *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkPrivateDataSlot *") MemorySegment pPrivateDataSlot) {
        if (Unmarshal.isNullPointer(PFN_vkCreatePrivateDataSlotEXT)) throw new SymbolNotFoundError("Symbol not found: vkCreatePrivateDataSlotEXT");
        try { return (int) MH_vkCreatePrivateDataSlotEXT.invokeExact(PFN_vkCreatePrivateDataSlotEXT, device, pCreateInfo, pAllocator, pPrivateDataSlot); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreatePrivateDataSlotEXT", e); }
    }

    public void DestroyPrivateDataSlotEXT(@CType("VkDevice") MemorySegment device, @CType("VkPrivateDataSlot") MemorySegment privateDataSlot, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroyPrivateDataSlotEXT)) throw new SymbolNotFoundError("Symbol not found: vkDestroyPrivateDataSlotEXT");
        try { MH_vkDestroyPrivateDataSlotEXT.invokeExact(PFN_vkDestroyPrivateDataSlotEXT, device, privateDataSlot, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyPrivateDataSlotEXT", e); }
    }

    public @CType("VkResult") int SetPrivateDataEXT(@CType("VkDevice") MemorySegment device, @CType("VkObjectType") int objectType, @CType("uint64_t") long objectHandle, @CType("VkPrivateDataSlot") MemorySegment privateDataSlot, @CType("uint64_t") long data) {
        if (Unmarshal.isNullPointer(PFN_vkSetPrivateDataEXT)) throw new SymbolNotFoundError("Symbol not found: vkSetPrivateDataEXT");
        try { return (int) MH_vkSetPrivateDataEXT.invokeExact(PFN_vkSetPrivateDataEXT, device, objectType, objectHandle, privateDataSlot, data); }
        catch (Throwable e) { throw new RuntimeException("error in vkSetPrivateDataEXT", e); }
    }

    public void GetPrivateDataEXT(@CType("VkDevice") MemorySegment device, @CType("VkObjectType") int objectType, @CType("uint64_t") long objectHandle, @CType("VkPrivateDataSlot") MemorySegment privateDataSlot, @CType("uint64_t *") MemorySegment pData) {
        if (Unmarshal.isNullPointer(PFN_vkGetPrivateDataEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetPrivateDataEXT");
        try { MH_vkGetPrivateDataEXT.invokeExact(PFN_vkGetPrivateDataEXT, device, objectType, objectHandle, privateDataSlot, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPrivateDataEXT", e); }
    }

}

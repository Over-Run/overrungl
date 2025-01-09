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
import static overrungl.vulkan.VK13.*;
public class VKKHRMaintenance4 {
    public static final int VK_KHR_MAINTENANCE_4_SPEC_VERSION = 2;
    public static final String VK_KHR_MAINTENANCE_4_EXTENSION_NAME = "VK_KHR_maintenance4";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES_KHR = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES_KHR = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES;
    public static final int VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS_KHR = VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS;
    public static final int VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS_KHR = VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS;
    public static final int VK_IMAGE_ASPECT_NONE_KHR = VK_IMAGE_ASPECT_NONE;
    public static final MethodHandle MH_vkGetDeviceBufferMemoryRequirementsKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetDeviceImageMemoryRequirementsKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkGetDeviceImageSparseMemoryRequirementsKHR = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkGetDeviceBufferMemoryRequirementsKHR;
    public final MemorySegment PFN_vkGetDeviceImageMemoryRequirementsKHR;
    public final MemorySegment PFN_vkGetDeviceImageSparseMemoryRequirementsKHR;

    public VKKHRMaintenance4(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkGetDeviceBufferMemoryRequirementsKHR = func.invoke(device, "vkGetDeviceBufferMemoryRequirementsKHR", "vkGetDeviceBufferMemoryRequirements");
        PFN_vkGetDeviceImageMemoryRequirementsKHR = func.invoke(device, "vkGetDeviceImageMemoryRequirementsKHR", "vkGetDeviceImageMemoryRequirements");
        PFN_vkGetDeviceImageSparseMemoryRequirementsKHR = func.invoke(device, "vkGetDeviceImageSparseMemoryRequirementsKHR", "vkGetDeviceImageSparseMemoryRequirements");
    }

    public void GetDeviceBufferMemoryRequirementsKHR(@CType("VkDevice") MemorySegment device, @CType("const VkDeviceBufferMemoryRequirements *") MemorySegment pInfo, @CType("VkMemoryRequirements2 *") MemorySegment pMemoryRequirements) {
        if (Unmarshal.isNullPointer(PFN_vkGetDeviceBufferMemoryRequirementsKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceBufferMemoryRequirementsKHR");
        try { MH_vkGetDeviceBufferMemoryRequirementsKHR.invokeExact(PFN_vkGetDeviceBufferMemoryRequirementsKHR, device, pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceBufferMemoryRequirementsKHR", e); }
    }

    public void GetDeviceImageMemoryRequirementsKHR(@CType("VkDevice") MemorySegment device, @CType("const VkDeviceImageMemoryRequirements *") MemorySegment pInfo, @CType("VkMemoryRequirements2 *") MemorySegment pMemoryRequirements) {
        if (Unmarshal.isNullPointer(PFN_vkGetDeviceImageMemoryRequirementsKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceImageMemoryRequirementsKHR");
        try { MH_vkGetDeviceImageMemoryRequirementsKHR.invokeExact(PFN_vkGetDeviceImageMemoryRequirementsKHR, device, pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceImageMemoryRequirementsKHR", e); }
    }

    public void GetDeviceImageSparseMemoryRequirementsKHR(@CType("VkDevice") MemorySegment device, @CType("const VkDeviceImageMemoryRequirements *") MemorySegment pInfo, @CType("uint32_t *") MemorySegment pSparseMemoryRequirementCount, @CType("VkSparseImageMemoryRequirements2 *") MemorySegment pSparseMemoryRequirements) {
        if (Unmarshal.isNullPointer(PFN_vkGetDeviceImageSparseMemoryRequirementsKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceImageSparseMemoryRequirementsKHR");
        try { MH_vkGetDeviceImageSparseMemoryRequirementsKHR.invokeExact(PFN_vkGetDeviceImageSparseMemoryRequirementsKHR, device, pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceImageSparseMemoryRequirementsKHR", e); }
    }

}
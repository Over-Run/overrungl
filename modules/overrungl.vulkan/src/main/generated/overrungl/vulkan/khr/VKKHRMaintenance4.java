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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKKHRMaintenance4 {
    public static final int VK_KHR_MAINTENANCE_4_SPEC_VERSION = 2;
    public static final String VK_KHR_MAINTENANCE_4_EXTENSION_NAME = "VK_KHR_maintenance4";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_FEATURES_KHR = 1000413000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_4_PROPERTIES_KHR = 1000413001;
    public static final int VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS_KHR = 1000413002;
    public static final int VK_STRUCTURE_TYPE_DEVICE_IMAGE_MEMORY_REQUIREMENTS_KHR = 1000413003;
    public static final int VK_IMAGE_ASPECT_NONE_KHR = 0;
    public static final class Handles {
        public static final MethodHandle MH_vkGetDeviceBufferMemoryRequirementsKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceImageMemoryRequirementsKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceImageSparseMemoryRequirementsKHR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRMaintenance4() {}

    /// ```
    /// void vkGetDeviceBufferMemoryRequirementsKHR((struct VkDevice*) VkDevice device, const VkDeviceBufferMemoryRequirements* pInfo, VkMemoryRequirements2* pMemoryRequirements);
    /// ```
    public static void vkGetDeviceBufferMemoryRequirementsKHR(VkDevice device, MemorySegment pInfo, MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceBufferMemoryRequirementsKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDeviceBufferMemoryRequirementsKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDeviceBufferMemoryRequirementsKHR", device, pInfo, pMemoryRequirements); }
        Handles.MH_vkGetDeviceBufferMemoryRequirementsKHR.invokeExact(device.capabilities().PFN_vkGetDeviceBufferMemoryRequirementsKHR, device.segment(), pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceBufferMemoryRequirementsKHR", e); }
    }

    /// ```
    /// void vkGetDeviceImageMemoryRequirementsKHR((struct VkDevice*) VkDevice device, const VkDeviceImageMemoryRequirements* pInfo, VkMemoryRequirements2* pMemoryRequirements);
    /// ```
    public static void vkGetDeviceImageMemoryRequirementsKHR(VkDevice device, MemorySegment pInfo, MemorySegment pMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceImageMemoryRequirementsKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDeviceImageMemoryRequirementsKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDeviceImageMemoryRequirementsKHR", device, pInfo, pMemoryRequirements); }
        Handles.MH_vkGetDeviceImageMemoryRequirementsKHR.invokeExact(device.capabilities().PFN_vkGetDeviceImageMemoryRequirementsKHR, device.segment(), pInfo, pMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceImageMemoryRequirementsKHR", e); }
    }

    /// ```
    /// void vkGetDeviceImageSparseMemoryRequirementsKHR((struct VkDevice*) VkDevice device, const VkDeviceImageMemoryRequirements* pInfo, uint32_t* pSparseMemoryRequirementCount, VkSparseImageMemoryRequirements2* pSparseMemoryRequirements);
    /// ```
    public static void vkGetDeviceImageSparseMemoryRequirementsKHR(VkDevice device, MemorySegment pInfo, MemorySegment pSparseMemoryRequirementCount, MemorySegment pSparseMemoryRequirements) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceImageSparseMemoryRequirementsKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDeviceImageSparseMemoryRequirementsKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDeviceImageSparseMemoryRequirementsKHR", device, pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements); }
        Handles.MH_vkGetDeviceImageSparseMemoryRequirementsKHR.invokeExact(device.capabilities().PFN_vkGetDeviceImageSparseMemoryRequirementsKHR, device.segment(), pInfo, pSparseMemoryRequirementCount, pSparseMemoryRequirements); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceImageSparseMemoryRequirementsKHR", e); }
    }

}

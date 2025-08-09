/*
 * MIT License
 *
 * Copyright (c) 2025 Overrun Organization
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

package overrungl.vma;

import overrungl.vulkan.VKCapabilitiesDevice;
import overrungl.vulkan.VKCapabilitiesInstance;
import overrungl.vulkan.VkDevice;
import overrungl.vulkan.VkInstance;

import java.lang.foreign.SegmentAllocator;

/// Useful utilities when creating memory allocator.
///
/// @author squid233
/// @since 0.1.0
public final class VmaUtil {
    private VmaUtil() {
    }

    /// Populates a [VmaAllocatorCreateInfo] structure with required Vulkan function pointers.
    ///
    /// This method configures the `pVulkanFunctions` field of the create info structure by
    /// extracting necessary function pointers from the given Vulkan instance and device capabilities.
    ///
    /// @param allocator the segment allocator used to allocate _`createInfo`_
    /// @param createInfo the [VmaAllocatorCreateInfo] to populate
    /// @param instance the Vulkan instance providing instance-level function pointers
    /// @param device the Vulkan device providing device-level function pointers
    /// @return _`createInfo`_
    public static VmaAllocatorCreateInfo fillAllocatorCreateInfo(
        SegmentAllocator allocator,
        VmaAllocatorCreateInfo createInfo,
        VkInstance instance,
        VkDevice device
    ) {
        VKCapabilitiesInstance ci = instance.capabilities();
        VKCapabilitiesDevice cd = device.capabilities();
        return createInfo.pVulkanFunctions(VmaVulkanFunctions.alloc(allocator)
            .vkGetInstanceProcAddr(ci.PFN_vkGetInstanceProcAddr)
            .vkGetDeviceProcAddr(cd.PFN_vkGetDeviceProcAddr)
            .vkGetPhysicalDeviceProperties(ci.PFN_vkGetPhysicalDeviceProperties)
            .vkGetPhysicalDeviceMemoryProperties(ci.PFN_vkGetPhysicalDeviceMemoryProperties)
            .vkAllocateMemory(cd.PFN_vkAllocateMemory)
            .vkFreeMemory(cd.PFN_vkFreeMemory)
            .vkMapMemory(cd.PFN_vkMapMemory)
            .vkUnmapMemory(cd.PFN_vkUnmapMemory)
            .vkFlushMappedMemoryRanges(cd.PFN_vkFlushMappedMemoryRanges)
            .vkInvalidateMappedMemoryRanges(cd.PFN_vkInvalidateMappedMemoryRanges)
            .vkBindBufferMemory(cd.PFN_vkBindBufferMemory)
            .vkBindImageMemory(cd.PFN_vkBindImageMemory)
            .vkGetBufferMemoryRequirements(cd.PFN_vkGetBufferMemoryRequirements)
            .vkGetImageMemoryRequirements(cd.PFN_vkGetImageMemoryRequirements)
            .vkCreateBuffer(cd.PFN_vkCreateBuffer)
            .vkDestroyBuffer(cd.PFN_vkDestroyBuffer)
            .vkCreateImage(cd.PFN_vkCreateImage)
            .vkDestroyImage(cd.PFN_vkDestroyImage)
            .vkCmdCopyBuffer(cd.PFN_vkCmdCopyBuffer)
            .vkGetBufferMemoryRequirements2KHR(cd.PFN_vkGetBufferMemoryRequirements2KHR)
            .vkGetImageMemoryRequirements2KHR(cd.PFN_vkGetImageMemoryRequirements2KHR)
            .vkBindBufferMemory2KHR(cd.PFN_vkBindBufferMemory2KHR)
            .vkBindImageMemory2KHR(cd.PFN_vkBindImageMemory2KHR)
            .vkGetPhysicalDeviceMemoryProperties2KHR(ci.PFN_vkGetPhysicalDeviceMemoryProperties2KHR)
            .vkGetDeviceBufferMemoryRequirements(cd.PFN_vkGetDeviceBufferMemoryRequirements)
            .vkGetDeviceImageMemoryRequirements(cd.PFN_vkGetDeviceImageMemoryRequirements)
            .vkGetMemoryWin32HandleKHR(cd.PFN_vkGetMemoryWin32HandleKHR)
            .segment());
    }
}

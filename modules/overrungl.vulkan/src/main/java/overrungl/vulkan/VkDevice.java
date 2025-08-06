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

package overrungl.vulkan;

import overrungl.util.MemoryStack;

import java.lang.foreign.MemorySegment;

/**
 * Wraps a Vulkan device dispatchable handle.
 *
 * @author squid233
 * @since 0.1.0
 */
public class VkDevice extends VkDispatchableHandleDevice {
    private final VkPhysicalDevice physicalDevice;

    /// Creates a `VkDevice` instance for the specified segment.
    ///
    /// @param segment        the `VkDevice` segment
    /// @param physicalDevice the physical device used to create the `VkDevice`
    public VkDevice(MemorySegment segment, VkPhysicalDevice physicalDevice) {
        super(segment, getDeviceCapabilities(segment, physicalDevice));
        this.physicalDevice = physicalDevice;
    }

    private static VKCapabilitiesDevice getDeviceCapabilities(MemorySegment segment, VkPhysicalDevice physicalDevice) {
        MemorySegment PFN_vkGetDeviceProcAddr;
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            PFN_vkGetDeviceProcAddr = VK10.vkGetInstanceProcAddr(physicalDevice.instance(), stack.allocateFrom("vkGetDeviceProcAddr"));
        }
        return new VKCapabilitiesDevice(segment, (device, name) -> {
            try {
                return (MemorySegment) VK10.Handles.MH_vkGetDeviceProcAddr.invokeExact(PFN_vkGetDeviceProcAddr, device, name);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        });
    }

    /// {@return the physical device on which this `VkDevice` was created}
    public VkPhysicalDevice physicalDevice() {
        return physicalDevice;
    }

    @Override
    public VKCapabilitiesInstance capabilitiesInstance() {
        return physicalDevice.capabilities();
    }
}

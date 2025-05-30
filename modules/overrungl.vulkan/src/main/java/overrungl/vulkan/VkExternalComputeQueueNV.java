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

import java.lang.foreign.MemorySegment;

/// Wraps a `VkExternalComputeQueueNV` dispatchable handle provided by [VK_NV_external_compute_queue][overrungl.vulkan.nv.VKNVExternalComputeQueue].
///
/// @author squid233
/// @since 0.1.0
public class VkExternalComputeQueueNV extends VkDispatchableHandleDevice {
    private final VkDevice device;

    /// Creates a `VkExternalComputeQueueNV` using the specified segment and device.
    ///
    /// @param segment the `VkExternalComputeQueueNV` segment
    /// @param device  the device on which the command buffer was created
    public VkExternalComputeQueueNV(MemorySegment segment, VkDevice device) {
        super(segment, device.capabilities());
        this.device = device;
    }

    /// @return the device on which this `VkExternalComputeQueueNV` was created.
    public VkDevice device() {
        return device;
    }

    @Override
    public VKCapabilitiesInstance capabilitiesInstance() {
        return device.capabilitiesInstance();
    }
}

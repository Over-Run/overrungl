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

/**
 * Wraps a Vulkan command buffer handle.
 *
 * @author squid233
 * @since 0.1.0
 */
public class VkCommandBuffer extends VkDispatchableHandleDevice {
    private final VkDevice device;

    /// Creates a `VkCommandBuffer` using the specified segment and device.
    ///
    /// @param segment the `VkCommandBuffer` segment
    /// @param device  the device on which the command buffer was created
    public VkCommandBuffer(MemorySegment segment, VkDevice device) {
        super(segment, device.capabilities());
        this.device = device;
    }

    /// @return the device on which this `VkCommandBuffer` was created.
    public VkDevice device() {
        return device;
    }

    @Override
    public VKCapabilitiesInstance capabilitiesInstance() {
        return device.capabilitiesInstance();
    }
}

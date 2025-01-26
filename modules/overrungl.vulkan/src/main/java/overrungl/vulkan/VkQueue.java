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
 * Wraps a Vulkan queue handle.
 *
 * @author squid233
 * @since 0.1.0
 */
public class VkQueue extends VkDispatchableHandleDevice {
    private final VkDevice device;

    /// Creates a `VkQueue` using the specified segment and device.
    ///
    /// @param segment the `VkQueue` segment
    /// @param device  the device from which the queue was retrieved
    public VkQueue(MemorySegment segment, VkDevice device) {
        super(segment, device.capabilities());
        this.device = device;
    }

    /// @return the device from which this `VkQueue` was retrieved.
    public VkDevice device() {
        return device;
    }

    @Override
    public VKCapabilitiesInstance capabilitiesInstance() {
        return device.capabilitiesInstance();
    }
}

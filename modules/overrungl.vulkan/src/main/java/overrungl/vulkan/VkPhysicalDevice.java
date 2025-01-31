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
 * Wraps a Vulkan physical device handle.
 *
 * @author squid233
 * @since 0.1.0
 */
public class VkPhysicalDevice extends VkDispatchableHandleInstance {
    private final VkInstance instance;

    /// Creates a `VkPhysicalDevice` using the specified segment and Vulkan instance.
    ///
    /// @param segment  the `VkDevice` segment
    /// @param instance the Vulkan instance from which the physical device was enumerated
    public VkPhysicalDevice(MemorySegment segment, VkInstance instance) {
        super(segment, instance.capabilities());
        this.instance = instance;
    }

    /// @return the Vulkan instance from which this physical device was enumerated.
    public VkInstance instance() {
        return instance;
    }
}

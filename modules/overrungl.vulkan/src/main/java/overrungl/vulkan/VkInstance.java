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
 * Wraps a Vulkan instance handle.
 *
 * @author squid233
 * @since 0.1.0
 */
public class VkInstance extends VkDispatchableHandleInstance {
    /// Creates a `VkInstance` instance for the specified segment.
    ///
    /// @param segment the `VkInstance` segment
    public VkInstance(MemorySegment segment) {
        super(segment, getInstanceCapabilities(segment));
    }

    private static VKCapabilitiesInstance getInstanceCapabilities(MemorySegment segment) {
        return new VKCapabilitiesInstance(segment, (instance, name) -> {
            try {
                return (MemorySegment) VK10.Handles.MH_vkGetInstanceProcAddr.invokeExact(VK.globalCommands().PFN_vkGetInstanceProcAddr, instance, name);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        });
    }
}

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

import overrungl.annotation.CType;

import java.lang.foreign.MemorySegment;

/**
 * The latest Vulkan functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public class VK extends VK14 {
    /// Creates an instance of Vulkan functions.
    ///
    /// @param instance the `VkInstance`
    /// @param func     the loading function
    public VK(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
        super(instance, func);
    }
}

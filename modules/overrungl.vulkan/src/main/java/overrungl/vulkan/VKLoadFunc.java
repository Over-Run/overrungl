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
import overrungl.util.MemoryUtil;

import java.lang.foreign.MemorySegment;

/// The Vulkan loading function.
///
/// ## Example
/// ```java
/// VKLoadFunc func = GLFW::glfwGetInstanceProcAddress;
/// pInstance = stack.allocate(ADDRESS);                           // VkInstance instance;
/// vkCreateInstance(func, createInfo.segment(), NULL, pInstance); // vkCreateInstance(createInfo, NULL,
/// instance = pInstance.get(ADDRESS, 0L);                         //     &instance);
/// vk = new VK(instance, func);
///```
///
/// ## Extensions
///
///
/// @author squid233
/// @since 0.1.0
public interface VKLoadFunc {
    /// Gets the function pointer of the given Vulkan function.
    ///
    /// @param segment the `VkInstance` or `VkDevice`
    /// @param name    the name of the function.
    /// @return the function pointer.
    MemorySegment invoke(MemorySegment segment, MemorySegment name);

    /// Gets the function pointer of the given Vulkan function.
    ///
    /// @param segment the `VkInstance` or `VkDevice`
    /// @param name    the name of the function.
    /// @return the function pointer.
    default MemorySegment invoke(MemorySegment segment, String name) {
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            return invoke(segment, MemoryUtil.allocString(stack, name));
        }
    }


    /// Gets the function pointer of the given Vulkan function.
    ///
    /// @param segment the `VkInstance` or `VkDevice`
    /// @param name    the name of the function.
    /// @param aliases the aliases to be used
    /// @return the function pointer.
    default MemorySegment invoke(MemorySegment segment, String name, String... aliases) {
        MemorySegment p = invoke(segment, name);
        if (!MemoryUtil.isNullPointer(p)) return p;
        for (String alias : aliases) {
            MemorySegment p1 = invoke(segment, alias);
            if (!MemoryUtil.isNullPointer(p1)) return p1;
            break;
        }
        return MemorySegment.NULL;
    }
}

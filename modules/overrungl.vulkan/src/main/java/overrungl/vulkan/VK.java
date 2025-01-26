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

/**
 * This class loads the Vulkan library into the JVM process.
 *
 * @author squid233
 * @see VKLoadFunc
 * @since 0.1.0
 */
public final class VK {
    private static VKLoadFunc loadFunc;
    private static GlobalCommands globalCommands;

    private VK() {
    }

    /// Loads necessary functions for Vulkan to create [VkInstance] with the given loading function.
    ///
    /// @param func a function that returns an address of a Vulkan function specified with the given name. this can be `GLFW::glfwGetInstanceProcAddress`
    public static void create(VKLoadFunc func) {
        if (loadFunc != null) {
            throw new IllegalStateException("Vulkan has already been created.");
        }
        loadFunc = func;
        globalCommands = new GlobalCommands(func);
    }

    /// Removes loaded functions.
    public static void destroy() {
        if (loadFunc == null) return;
        loadFunc = null;
        globalCommands = null;
    }

    /// {@return the function for which Vulkan function is acquired}
    public static VKLoadFunc functionLookup() {
        return loadFunc;
    }

    static final class GlobalCommands {
        final MemorySegment PFN_vkGetInstanceProcAddr;
        final MemorySegment PFN_vkCreateInstance;
        final MemorySegment PFN_vkEnumerateInstanceExtensionProperties;
        final MemorySegment PFN_vkEnumerateInstanceLayerProperties;
        final MemorySegment PFN_vkEnumerateInstanceVersion;

        private GlobalCommands(VKLoadFunc func) {
            PFN_vkGetInstanceProcAddr = func.invoke(MemorySegment.NULL, "vkGetInstanceProcAddr");
            if (MemoryUtil.isNullPointer(PFN_vkGetInstanceProcAddr)) {
                throw exception();
            }
            PFN_vkCreateInstance = getFunctionAddress("vkCreateInstance");
            PFN_vkEnumerateInstanceExtensionProperties = getFunctionAddress("vkEnumerateInstanceExtensionProperties");
            PFN_vkEnumerateInstanceLayerProperties = getFunctionAddress("vkEnumerateInstanceLayerProperties");
            PFN_vkEnumerateInstanceVersion = getFunctionAddress("PFN_vkEnumerateInstanceVersion", false);
        }

        private static IllegalArgumentException exception() {
            return new IllegalArgumentException("A critical function is missing. Make sure that Vulkan is available.");
        }

        private MemorySegment getFunctionAddress(String name) {
            return getFunctionAddress(name, true);
        }

        private MemorySegment getFunctionAddress(String name, boolean required) {
            MemorySegment segment;
            try (MemoryStack stack = MemoryStack.pushLocal()) {
                segment = (MemorySegment) VK10.Handles.MH_vkGetInstanceProcAddr.invokeExact(
                    PFN_vkGetInstanceProcAddr,
                    MemorySegment.NULL,
                    stack.allocateFrom(name)
                );
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
            if (MemoryUtil.isNullPointer(segment) && required) {
                throw exception();
            }
            return segment;
        }
    }

    static GlobalCommands globalCommands() {
        return globalCommands;
    }
}

/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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

// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKEXTDirectModeDisplay {
    public static final int VK_EXT_DIRECT_MODE_DISPLAY_SPEC_VERSION = 1;
    public static final String VK_EXT_DIRECT_MODE_DISPLAY_EXTENSION_NAME = "VK_EXT_direct_mode_display";
    public static final class Handles {
        public static final MethodHandle MH_vkReleaseDisplayEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG));
        private Handles() {}
    }

    private VKEXTDirectModeDisplay() {}

    /// ```
    /// (int) VkResult vkReleaseDisplayEXT((struct VkPhysicalDevice*) VkPhysicalDevice physicalDevice, (uint64_t) VkDisplayKHR display);
    /// ```
    public static int vkReleaseDisplayEXT(VkPhysicalDevice physicalDevice, long display) {
        if (MemoryUtil.isNullPointer(physicalDevice.capabilities().PFN_vkReleaseDisplayEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkReleaseDisplayEXT");
        try { return (int) Handles.MH_vkReleaseDisplayEXT.invokeExact(physicalDevice.capabilities().PFN_vkReleaseDisplayEXT, physicalDevice.segment(), display); }
        catch (Throwable e) { throw new RuntimeException("error in vkReleaseDisplayEXT", e); }
    }

}

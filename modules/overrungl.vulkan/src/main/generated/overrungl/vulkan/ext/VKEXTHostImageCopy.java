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
public final class VKEXTHostImageCopy {
    public static final int VK_EXT_HOST_IMAGE_COPY_SPEC_VERSION = 1;
    public static final String VK_EXT_HOST_IMAGE_COPY_EXTENSION_NAME = "VK_EXT_host_image_copy";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES_EXT = 1000270000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES_EXT = 1000270001;
    public static final int VK_STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY_EXT = 1000270002;
    public static final int VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY_EXT = 1000270003;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO_EXT = 1000270004;
    public static final int VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO_EXT = 1000270005;
    public static final int VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO_EXT = 1000270006;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO_EXT = 1000270007;
    public static final int VK_STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE_EXT = 1000270008;
    public static final int VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY_EXT = 1000270009;
    public static final int VK_IMAGE_USAGE_HOST_TRANSFER_BIT_EXT = 0x00400000;
    public static final long VK_FORMAT_FEATURE_2_HOST_IMAGE_TRANSFER_BIT_EXT = 0x400000000000L;
    public static final int VK_HOST_IMAGE_COPY_MEMCPY_EXT = 0x00000001;
    public static final class Handles {
        public static final MethodHandle MH_vkCopyMemoryToImageEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCopyImageToMemoryEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCopyImageToImageEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkTransitionImageLayoutEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetImageSubresourceLayout2EXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTHostImageCopy() {}

    /// ```
    /// (int) VkResult vkCopyMemoryToImageEXT((struct VkDevice*) VkDevice device, const VkCopyMemoryToImageInfo* pCopyMemoryToImageInfo);
    /// ```
    public static int vkCopyMemoryToImageEXT(VkDevice device, MemorySegment pCopyMemoryToImageInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCopyMemoryToImageEXT)) throw new SymbolNotFoundError("Symbol not found: vkCopyMemoryToImageEXT");
        try { return (int) Handles.MH_vkCopyMemoryToImageEXT.invokeExact(device.capabilities().PFN_vkCopyMemoryToImageEXT, device.segment(), pCopyMemoryToImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCopyMemoryToImageEXT", e); }
    }

    /// ```
    /// (int) VkResult vkCopyImageToMemoryEXT((struct VkDevice*) VkDevice device, const VkCopyImageToMemoryInfo* pCopyImageToMemoryInfo);
    /// ```
    public static int vkCopyImageToMemoryEXT(VkDevice device, MemorySegment pCopyImageToMemoryInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCopyImageToMemoryEXT)) throw new SymbolNotFoundError("Symbol not found: vkCopyImageToMemoryEXT");
        try { return (int) Handles.MH_vkCopyImageToMemoryEXT.invokeExact(device.capabilities().PFN_vkCopyImageToMemoryEXT, device.segment(), pCopyImageToMemoryInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCopyImageToMemoryEXT", e); }
    }

    /// ```
    /// (int) VkResult vkCopyImageToImageEXT((struct VkDevice*) VkDevice device, const VkCopyImageToImageInfo* pCopyImageToImageInfo);
    /// ```
    public static int vkCopyImageToImageEXT(VkDevice device, MemorySegment pCopyImageToImageInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCopyImageToImageEXT)) throw new SymbolNotFoundError("Symbol not found: vkCopyImageToImageEXT");
        try { return (int) Handles.MH_vkCopyImageToImageEXT.invokeExact(device.capabilities().PFN_vkCopyImageToImageEXT, device.segment(), pCopyImageToImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCopyImageToImageEXT", e); }
    }

    /// ```
    /// (int) VkResult vkTransitionImageLayoutEXT((struct VkDevice*) VkDevice device, uint32_t transitionCount, const VkHostImageLayoutTransitionInfo* pTransitions);
    /// ```
    public static int vkTransitionImageLayoutEXT(VkDevice device, int transitionCount, MemorySegment pTransitions) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkTransitionImageLayoutEXT)) throw new SymbolNotFoundError("Symbol not found: vkTransitionImageLayoutEXT");
        try { return (int) Handles.MH_vkTransitionImageLayoutEXT.invokeExact(device.capabilities().PFN_vkTransitionImageLayoutEXT, device.segment(), transitionCount, pTransitions); }
        catch (Throwable e) { throw new RuntimeException("error in vkTransitionImageLayoutEXT", e); }
    }

    /// ```
    /// void vkGetImageSubresourceLayout2EXT((struct VkDevice*) VkDevice device, (uint64_t) VkImage image, const VkImageSubresource2* pSubresource, VkSubresourceLayout2* pLayout);
    /// ```
    public static void vkGetImageSubresourceLayout2EXT(VkDevice device, long image, MemorySegment pSubresource, MemorySegment pLayout) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetImageSubresourceLayout2EXT)) throw new SymbolNotFoundError("Symbol not found: vkGetImageSubresourceLayout2EXT");
        try { Handles.MH_vkGetImageSubresourceLayout2EXT.invokeExact(device.capabilities().PFN_vkGetImageSubresourceLayout2EXT, device.segment(), image, pSubresource, pLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageSubresourceLayout2EXT", e); }
    }

}

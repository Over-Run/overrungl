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
public class VKEXTHostImageCopy {
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
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkCopyMemoryToImageEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCopyImageToMemoryEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCopyImageToImageEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkTransitionImageLayoutEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetImageSubresourceLayout2EXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkCopyMemoryToImageEXT;
        public final MemorySegment PFN_vkCopyImageToMemoryEXT;
        public final MemorySegment PFN_vkCopyImageToImageEXT;
        public final MemorySegment PFN_vkTransitionImageLayoutEXT;
        public final MemorySegment PFN_vkGetImageSubresourceLayout2EXT;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkCopyMemoryToImageEXT = func.invoke(device, "vkCopyMemoryToImageEXT", "vkCopyMemoryToImage");
            PFN_vkCopyImageToMemoryEXT = func.invoke(device, "vkCopyImageToMemoryEXT", "vkCopyImageToMemory");
            PFN_vkCopyImageToImageEXT = func.invoke(device, "vkCopyImageToImageEXT", "vkCopyImageToImage");
            PFN_vkTransitionImageLayoutEXT = func.invoke(device, "vkTransitionImageLayoutEXT", "vkTransitionImageLayout");
            PFN_vkGetImageSubresourceLayout2EXT = func.invoke(device, "vkGetImageSubresourceLayout2EXT", "vkGetImageSubresourceLayout2");
        }
    }

    public VKEXTHostImageCopy(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// VkResult vkCopyMemoryToImageEXT(VkDevice device, const VkCopyMemoryToImageInfo* pCopyMemoryToImageInfo);
    /// ```
    public int CopyMemoryToImageEXT(MemorySegment device, MemorySegment pCopyMemoryToImageInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCopyMemoryToImageEXT)) throw new SymbolNotFoundError("Symbol not found: vkCopyMemoryToImageEXT");
        try { return (int) Handles.MH_vkCopyMemoryToImageEXT.invokeExact(handles.PFN_vkCopyMemoryToImageEXT, device, pCopyMemoryToImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CopyMemoryToImageEXT", e); }
    }

    /// ```
    /// VkResult vkCopyImageToMemoryEXT(VkDevice device, const VkCopyImageToMemoryInfo* pCopyImageToMemoryInfo);
    /// ```
    public int CopyImageToMemoryEXT(MemorySegment device, MemorySegment pCopyImageToMemoryInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCopyImageToMemoryEXT)) throw new SymbolNotFoundError("Symbol not found: vkCopyImageToMemoryEXT");
        try { return (int) Handles.MH_vkCopyImageToMemoryEXT.invokeExact(handles.PFN_vkCopyImageToMemoryEXT, device, pCopyImageToMemoryInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CopyImageToMemoryEXT", e); }
    }

    /// ```
    /// VkResult vkCopyImageToImageEXT(VkDevice device, const VkCopyImageToImageInfo* pCopyImageToImageInfo);
    /// ```
    public int CopyImageToImageEXT(MemorySegment device, MemorySegment pCopyImageToImageInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCopyImageToImageEXT)) throw new SymbolNotFoundError("Symbol not found: vkCopyImageToImageEXT");
        try { return (int) Handles.MH_vkCopyImageToImageEXT.invokeExact(handles.PFN_vkCopyImageToImageEXT, device, pCopyImageToImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CopyImageToImageEXT", e); }
    }

    /// ```
    /// VkResult vkTransitionImageLayoutEXT(VkDevice device, uint32_t transitionCount, const VkHostImageLayoutTransitionInfo* pTransitions);
    /// ```
    public int TransitionImageLayoutEXT(MemorySegment device, int transitionCount, MemorySegment pTransitions) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkTransitionImageLayoutEXT)) throw new SymbolNotFoundError("Symbol not found: vkTransitionImageLayoutEXT");
        try { return (int) Handles.MH_vkTransitionImageLayoutEXT.invokeExact(handles.PFN_vkTransitionImageLayoutEXT, device, transitionCount, pTransitions); }
        catch (Throwable e) { throw new RuntimeException("error in TransitionImageLayoutEXT", e); }
    }

    /// ```
    /// void vkGetImageSubresourceLayout2EXT(VkDevice device, VkImage image, const VkImageSubresource2* pSubresource, VkSubresourceLayout2* pLayout);
    /// ```
    public void GetImageSubresourceLayout2EXT(MemorySegment device, long image, MemorySegment pSubresource, MemorySegment pLayout) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetImageSubresourceLayout2EXT)) throw new SymbolNotFoundError("Symbol not found: vkGetImageSubresourceLayout2EXT");
        try { Handles.MH_vkGetImageSubresourceLayout2EXT.invokeExact(handles.PFN_vkGetImageSubresourceLayout2EXT, device, image, pSubresource, pLayout); }
        catch (Throwable e) { throw new RuntimeException("error in GetImageSubresourceLayout2EXT", e); }
    }

}

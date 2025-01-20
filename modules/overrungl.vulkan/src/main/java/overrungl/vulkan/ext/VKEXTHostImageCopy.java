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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.vulkan.VK14.*;
public class VKEXTHostImageCopy {
    public static final int VK_EXT_HOST_IMAGE_COPY_SPEC_VERSION = 1;
    public static final String VK_EXT_HOST_IMAGE_COPY_EXTENSION_NAME = "VK_EXT_host_image_copy";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES_EXT = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES_EXT = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES;
    public static final int VK_STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY_EXT = VK_STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY;
    public static final int VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY_EXT = VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO_EXT = VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO;
    public static final int VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO_EXT = VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO;
    public static final int VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO_EXT = VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO;
    public static final int VK_STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO_EXT = VK_STRUCTURE_TYPE_COPY_IMAGE_TO_IMAGE_INFO;
    public static final int VK_STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE_EXT = VK_STRUCTURE_TYPE_SUBRESOURCE_HOST_MEMCPY_SIZE;
    public static final int VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY_EXT = VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY;
    public static final int VK_IMAGE_USAGE_HOST_TRANSFER_BIT_EXT = VK_IMAGE_USAGE_HOST_TRANSFER_BIT;
    public static final long VK_FORMAT_FEATURE_2_HOST_IMAGE_TRANSFER_BIT_EXT = VK_FORMAT_FEATURE_2_HOST_IMAGE_TRANSFER_BIT;
    public static final int VK_HOST_IMAGE_COPY_MEMCPY_EXT = VK_HOST_IMAGE_COPY_MEMCPY;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkCopyMemoryToImageEXT = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCopyImageToMemoryEXT = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkCopyImageToImageEXT = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkTransitionImageLayoutEXT = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetImageSubresourceLayout2EXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkCopyMemoryToImageEXT = RuntimeHelper.downcall(Descriptors.FD_vkCopyMemoryToImageEXT);
        public static final MethodHandle MH_vkCopyImageToMemoryEXT = RuntimeHelper.downcall(Descriptors.FD_vkCopyImageToMemoryEXT);
        public static final MethodHandle MH_vkCopyImageToImageEXT = RuntimeHelper.downcall(Descriptors.FD_vkCopyImageToImageEXT);
        public static final MethodHandle MH_vkTransitionImageLayoutEXT = RuntimeHelper.downcall(Descriptors.FD_vkTransitionImageLayoutEXT);
        public static final MethodHandle MH_vkGetImageSubresourceLayout2EXT = RuntimeHelper.downcall(Descriptors.FD_vkGetImageSubresourceLayout2EXT);
        public final MemorySegment PFN_vkCopyMemoryToImageEXT;
        public final MemorySegment PFN_vkCopyImageToMemoryEXT;
        public final MemorySegment PFN_vkCopyImageToImageEXT;
        public final MemorySegment PFN_vkTransitionImageLayoutEXT;
        public final MemorySegment PFN_vkGetImageSubresourceLayout2EXT;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkCopyMemoryToImageEXT = func.invoke(device, "vkCopyMemoryToImageEXT", "vkCopyMemoryToImage");
            PFN_vkCopyImageToMemoryEXT = func.invoke(device, "vkCopyImageToMemoryEXT", "vkCopyImageToMemory");
            PFN_vkCopyImageToImageEXT = func.invoke(device, "vkCopyImageToImageEXT", "vkCopyImageToImage");
            PFN_vkTransitionImageLayoutEXT = func.invoke(device, "vkTransitionImageLayoutEXT", "vkTransitionImageLayout");
            PFN_vkGetImageSubresourceLayout2EXT = func.invoke(device, "vkGetImageSubresourceLayout2EXT", "vkGetImageSubresourceLayout2");
        }
    }

    public VKEXTHostImageCopy(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkResult") int CopyMemoryToImageEXT(@CType("VkDevice") MemorySegment device, @CType("const VkCopyMemoryToImageInfo *") MemorySegment pCopyMemoryToImageInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCopyMemoryToImageEXT)) throw new SymbolNotFoundError("Symbol not found: vkCopyMemoryToImageEXT");
        try { return (int) Handles.MH_vkCopyMemoryToImageEXT.invokeExact(handles.PFN_vkCopyMemoryToImageEXT, device, pCopyMemoryToImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCopyMemoryToImageEXT", e); }
    }

    public @CType("VkResult") int CopyImageToMemoryEXT(@CType("VkDevice") MemorySegment device, @CType("const VkCopyImageToMemoryInfo *") MemorySegment pCopyImageToMemoryInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCopyImageToMemoryEXT)) throw new SymbolNotFoundError("Symbol not found: vkCopyImageToMemoryEXT");
        try { return (int) Handles.MH_vkCopyImageToMemoryEXT.invokeExact(handles.PFN_vkCopyImageToMemoryEXT, device, pCopyImageToMemoryInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCopyImageToMemoryEXT", e); }
    }

    public @CType("VkResult") int CopyImageToImageEXT(@CType("VkDevice") MemorySegment device, @CType("const VkCopyImageToImageInfo *") MemorySegment pCopyImageToImageInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCopyImageToImageEXT)) throw new SymbolNotFoundError("Symbol not found: vkCopyImageToImageEXT");
        try { return (int) Handles.MH_vkCopyImageToImageEXT.invokeExact(handles.PFN_vkCopyImageToImageEXT, device, pCopyImageToImageInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCopyImageToImageEXT", e); }
    }

    public @CType("VkResult") int TransitionImageLayoutEXT(@CType("VkDevice") MemorySegment device, @CType("uint32_t") int transitionCount, @CType("const VkHostImageLayoutTransitionInfo *") MemorySegment pTransitions) {
        if (Unmarshal.isNullPointer(handles.PFN_vkTransitionImageLayoutEXT)) throw new SymbolNotFoundError("Symbol not found: vkTransitionImageLayoutEXT");
        try { return (int) Handles.MH_vkTransitionImageLayoutEXT.invokeExact(handles.PFN_vkTransitionImageLayoutEXT, device, transitionCount, pTransitions); }
        catch (Throwable e) { throw new RuntimeException("error in vkTransitionImageLayoutEXT", e); }
    }

    public void GetImageSubresourceLayout2EXT(@CType("VkDevice") MemorySegment device, @CType("VkImage") MemorySegment image, @CType("const VkImageSubresource2 *") MemorySegment pSubresource, @CType("VkSubresourceLayout2 *") MemorySegment pLayout) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetImageSubresourceLayout2EXT)) throw new SymbolNotFoundError("Symbol not found: vkGetImageSubresourceLayout2EXT");
        try { Handles.MH_vkGetImageSubresourceLayout2EXT.invokeExact(handles.PFN_vkGetImageSubresourceLayout2EXT, device, image, pSubresource, pLayout); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageSubresourceLayout2EXT", e); }
    }

}

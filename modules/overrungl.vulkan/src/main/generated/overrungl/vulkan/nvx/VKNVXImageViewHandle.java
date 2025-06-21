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
package overrungl.vulkan.nvx;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKNVXImageViewHandle {
    public static final int VK_NVX_IMAGE_VIEW_HANDLE_SPEC_VERSION = 3;
    public static final String VK_NVX_IMAGE_VIEW_HANDLE_EXTENSION_NAME = "VK_NVX_image_view_handle";
    public static final int VK_STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX = 1000030000;
    public static final int VK_STRUCTURE_TYPE_IMAGE_VIEW_ADDRESS_PROPERTIES_NVX = 1000030001;
    public static final class Handles {
        public static final MethodHandle MH_vkGetImageViewHandleNVX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetImageViewHandle64NVX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetImageViewAddressNVX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKNVXImageViewHandle() {}

    /// ```
    /// uint32_t vkGetImageViewHandleNVX((struct VkDevice*) VkDevice device, const VkImageViewHandleInfoNVX* pInfo);
    /// ```
    public static int vkGetImageViewHandleNVX(VkDevice device, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetImageViewHandleNVX)) throw new VKSymbolNotFoundError("Symbol not found: vkGetImageViewHandleNVX");
        try { return (int) Handles.MH_vkGetImageViewHandleNVX.invokeExact(device.capabilities().PFN_vkGetImageViewHandleNVX, device.segment(), pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageViewHandleNVX", e); }
    }

    /// ```
    /// uint64_t vkGetImageViewHandle64NVX((struct VkDevice*) VkDevice device, const VkImageViewHandleInfoNVX* pInfo);
    /// ```
    public static long vkGetImageViewHandle64NVX(VkDevice device, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetImageViewHandle64NVX)) throw new VKSymbolNotFoundError("Symbol not found: vkGetImageViewHandle64NVX");
        try { return (long) Handles.MH_vkGetImageViewHandle64NVX.invokeExact(device.capabilities().PFN_vkGetImageViewHandle64NVX, device.segment(), pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageViewHandle64NVX", e); }
    }

    /// ```
    /// (int) VkResult vkGetImageViewAddressNVX((struct VkDevice*) VkDevice device, (uint64_t) VkImageView imageView, VkImageViewAddressPropertiesNVX* pProperties);
    /// ```
    public static int vkGetImageViewAddressNVX(VkDevice device, long imageView, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetImageViewAddressNVX)) throw new VKSymbolNotFoundError("Symbol not found: vkGetImageViewAddressNVX");
        try { return (int) Handles.MH_vkGetImageViewAddressNVX.invokeExact(device.capabilities().PFN_vkGetImageViewAddressNVX, device.segment(), imageView, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageViewAddressNVX", e); }
    }

}

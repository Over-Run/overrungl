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
public class VKNVXImageViewHandle {
    public static final int VK_NVX_IMAGE_VIEW_HANDLE_SPEC_VERSION = 3;
    public static final String VK_NVX_IMAGE_VIEW_HANDLE_EXTENSION_NAME = "VK_NVX_image_view_handle";
    public static final int VK_STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX = 1000030000;
    public static final int VK_STRUCTURE_TYPE_IMAGE_VIEW_ADDRESS_PROPERTIES_NVX = 1000030001;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkGetImageViewHandleNVX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetImageViewHandle64NVX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetImageViewAddressNVX = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkGetImageViewHandleNVX;
        public final MemorySegment PFN_vkGetImageViewHandle64NVX;
        public final MemorySegment PFN_vkGetImageViewAddressNVX;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkGetImageViewHandleNVX = func.invoke(device, "vkGetImageViewHandleNVX");
            PFN_vkGetImageViewHandle64NVX = func.invoke(device, "vkGetImageViewHandle64NVX");
            PFN_vkGetImageViewAddressNVX = func.invoke(device, "vkGetImageViewAddressNVX");
        }
    }

    public VKNVXImageViewHandle(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// uint32_t vkGetImageViewHandleNVX(VkDevice device, const VkImageViewHandleInfoNVX* pInfo);
    /// ```
    public int GetImageViewHandleNVX(MemorySegment device, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetImageViewHandleNVX)) throw new SymbolNotFoundError("Symbol not found: vkGetImageViewHandleNVX");
        try { return (int) Handles.MH_vkGetImageViewHandleNVX.invokeExact(handles.PFN_vkGetImageViewHandleNVX, device, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in GetImageViewHandleNVX", e); }
    }

    /// ```
    /// uint64_t vkGetImageViewHandle64NVX(VkDevice device, const VkImageViewHandleInfoNVX* pInfo);
    /// ```
    public long GetImageViewHandle64NVX(MemorySegment device, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetImageViewHandle64NVX)) throw new SymbolNotFoundError("Symbol not found: vkGetImageViewHandle64NVX");
        try { return (long) Handles.MH_vkGetImageViewHandle64NVX.invokeExact(handles.PFN_vkGetImageViewHandle64NVX, device, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in GetImageViewHandle64NVX", e); }
    }

    /// ```
    /// VkResult vkGetImageViewAddressNVX(VkDevice device, VkImageView imageView, VkImageViewAddressPropertiesNVX* pProperties);
    /// ```
    public int GetImageViewAddressNVX(MemorySegment device, long imageView, MemorySegment pProperties) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetImageViewAddressNVX)) throw new SymbolNotFoundError("Symbol not found: vkGetImageViewAddressNVX");
        try { return (int) Handles.MH_vkGetImageViewAddressNVX.invokeExact(handles.PFN_vkGetImageViewAddressNVX, device, imageView, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in GetImageViewAddressNVX", e); }
    }

}

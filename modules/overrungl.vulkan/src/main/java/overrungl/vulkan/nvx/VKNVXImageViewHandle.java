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
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
public class VKNVXImageViewHandle {
    public static final int VK_NVX_IMAGE_VIEW_HANDLE_SPEC_VERSION = 3;
    public static final String VK_NVX_IMAGE_VIEW_HANDLE_EXTENSION_NAME = "VK_NVX_image_view_handle";
    public static final int VK_STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX = 1000030000;
    public static final int VK_STRUCTURE_TYPE_IMAGE_VIEW_ADDRESS_PROPERTIES_NVX = 1000030001;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkGetImageViewHandleNVX = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetImageViewHandle64NVX = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkGetImageViewAddressNVX = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkGetImageViewHandleNVX = RuntimeHelper.downcall(Descriptors.FD_vkGetImageViewHandleNVX);
        public static final MethodHandle MH_vkGetImageViewHandle64NVX = RuntimeHelper.downcall(Descriptors.FD_vkGetImageViewHandle64NVX);
        public static final MethodHandle MH_vkGetImageViewAddressNVX = RuntimeHelper.downcall(Descriptors.FD_vkGetImageViewAddressNVX);
        public final MemorySegment PFN_vkGetImageViewHandleNVX;
        public final MemorySegment PFN_vkGetImageViewHandle64NVX;
        public final MemorySegment PFN_vkGetImageViewAddressNVX;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkGetImageViewHandleNVX = func.invoke(device, "vkGetImageViewHandleNVX");
            PFN_vkGetImageViewHandle64NVX = func.invoke(device, "vkGetImageViewHandle64NVX");
            PFN_vkGetImageViewAddressNVX = func.invoke(device, "vkGetImageViewAddressNVX");
        }
    }

    public VKNVXImageViewHandle(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("uint32_t") int GetImageViewHandleNVX(@CType("VkDevice") MemorySegment device, @CType("const VkImageViewHandleInfoNVX *") MemorySegment pInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetImageViewHandleNVX)) throw new SymbolNotFoundError("Symbol not found: vkGetImageViewHandleNVX");
        try { return (int) Handles.MH_vkGetImageViewHandleNVX.invokeExact(handles.PFN_vkGetImageViewHandleNVX, device, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageViewHandleNVX", e); }
    }

    public @CType("uint64_t") long GetImageViewHandle64NVX(@CType("VkDevice") MemorySegment device, @CType("const VkImageViewHandleInfoNVX *") MemorySegment pInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetImageViewHandle64NVX)) throw new SymbolNotFoundError("Symbol not found: vkGetImageViewHandle64NVX");
        try { return (long) Handles.MH_vkGetImageViewHandle64NVX.invokeExact(handles.PFN_vkGetImageViewHandle64NVX, device, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageViewHandle64NVX", e); }
    }

    public @CType("VkResult") int GetImageViewAddressNVX(@CType("VkDevice") MemorySegment device, @CType("VkImageView") MemorySegment imageView, @CType("VkImageViewAddressPropertiesNVX *") MemorySegment pProperties) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetImageViewAddressNVX)) throw new SymbolNotFoundError("Symbol not found: vkGetImageViewAddressNVX");
        try { return (int) Handles.MH_vkGetImageViewAddressNVX.invokeExact(handles.PFN_vkGetImageViewAddressNVX, device, imageView, pProperties); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetImageViewAddressNVX", e); }
    }

}

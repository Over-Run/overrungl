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
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.vulkan.VK12.*;
public class VKKHRBufferDeviceAddress {
    public static final int VK_KHR_BUFFER_DEVICE_ADDRESS_SPEC_VERSION = 1;
    public static final String VK_KHR_BUFFER_DEVICE_ADDRESS_EXTENSION_NAME = "VK_KHR_buffer_device_address";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_KHR = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES;
    public static final int VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO_KHR = VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO;
    public static final int VK_STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO_KHR = VK_STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO;
    public static final int VK_STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO_KHR = VK_STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO;
    public static final int VK_STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO_KHR = VK_STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO;
    public static final int VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT_KHR = VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT;
    public static final int VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR = VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT;
    public static final int VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT_KHR = VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT;
    public static final int VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR = VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT;
    public static final int VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR = VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkGetBufferDeviceAddressKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetBufferOpaqueCaptureAddressKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceMemoryOpaqueCaptureAddressKHR = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkGetBufferDeviceAddressKHR;
        public final MemorySegment PFN_vkGetBufferOpaqueCaptureAddressKHR;
        public final MemorySegment PFN_vkGetDeviceMemoryOpaqueCaptureAddressKHR;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkGetBufferDeviceAddressKHR = func.invoke(device, "vkGetBufferDeviceAddressKHR", "vkGetBufferDeviceAddress");
            PFN_vkGetBufferOpaqueCaptureAddressKHR = func.invoke(device, "vkGetBufferOpaqueCaptureAddressKHR", "vkGetBufferOpaqueCaptureAddress");
            PFN_vkGetDeviceMemoryOpaqueCaptureAddressKHR = func.invoke(device, "vkGetDeviceMemoryOpaqueCaptureAddressKHR", "vkGetDeviceMemoryOpaqueCaptureAddress");
        }
    }

    public VKKHRBufferDeviceAddress(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkDeviceAddress") long GetBufferDeviceAddressKHR(@CType("VkDevice") MemorySegment device, @CType("const VkBufferDeviceAddressInfo *") MemorySegment pInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetBufferDeviceAddressKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetBufferDeviceAddressKHR");
        try { return (long) Handles.MH_vkGetBufferDeviceAddressKHR.invokeExact(handles.PFN_vkGetBufferDeviceAddressKHR, device, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetBufferDeviceAddressKHR", e); }
    }

    public @CType("uint64_t") long GetBufferOpaqueCaptureAddressKHR(@CType("VkDevice") MemorySegment device, @CType("const VkBufferDeviceAddressInfo *") MemorySegment pInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetBufferOpaqueCaptureAddressKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetBufferOpaqueCaptureAddressKHR");
        try { return (long) Handles.MH_vkGetBufferOpaqueCaptureAddressKHR.invokeExact(handles.PFN_vkGetBufferOpaqueCaptureAddressKHR, device, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetBufferOpaqueCaptureAddressKHR", e); }
    }

    public @CType("uint64_t") long GetDeviceMemoryOpaqueCaptureAddressKHR(@CType("VkDevice") MemorySegment device, @CType("const VkDeviceMemoryOpaqueCaptureAddressInfo *") MemorySegment pInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetDeviceMemoryOpaqueCaptureAddressKHR)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceMemoryOpaqueCaptureAddressKHR");
        try { return (long) Handles.MH_vkGetDeviceMemoryOpaqueCaptureAddressKHR.invokeExact(handles.PFN_vkGetDeviceMemoryOpaqueCaptureAddressKHR, device, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceMemoryOpaqueCaptureAddressKHR", e); }
    }

}

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
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKKHRBufferDeviceAddress {
    public static final int VK_KHR_BUFFER_DEVICE_ADDRESS_SPEC_VERSION = 1;
    public static final String VK_KHR_BUFFER_DEVICE_ADDRESS_EXTENSION_NAME = "VK_KHR_buffer_device_address";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_KHR = 1000257000;
    public static final int VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO_KHR = 1000244001;
    public static final int VK_STRUCTURE_TYPE_BUFFER_OPAQUE_CAPTURE_ADDRESS_CREATE_INFO_KHR = 1000257002;
    public static final int VK_STRUCTURE_TYPE_MEMORY_OPAQUE_CAPTURE_ADDRESS_ALLOCATE_INFO_KHR = 1000257003;
    public static final int VK_STRUCTURE_TYPE_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS_INFO_KHR = 1000257004;
    public static final int VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT_KHR = 0x00020000;
    public static final int VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR = 0x00000010;
    public static final int VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT_KHR = 0x00000002;
    public static final int VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_KHR = 0x00000004;
    public static final int VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR = -1000257000;
    public static final class Handles {
        public static final MethodHandle MH_vkGetBufferDeviceAddressKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetBufferOpaqueCaptureAddressKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkGetDeviceMemoryOpaqueCaptureAddressKHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKKHRBufferDeviceAddress() {}

    /// ```
    /// (uint64_t) VkDeviceAddress vkGetBufferDeviceAddressKHR((struct VkDevice*) VkDevice device, const VkBufferDeviceAddressInfo* pInfo);
    /// ```
    public static long vkGetBufferDeviceAddressKHR(VkDevice device, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetBufferDeviceAddressKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetBufferDeviceAddressKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetBufferDeviceAddressKHR", device, pInfo); }
        return (long) Handles.MH_vkGetBufferDeviceAddressKHR.invokeExact(device.capabilities().PFN_vkGetBufferDeviceAddressKHR, device.segment(), pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetBufferDeviceAddressKHR", e); }
    }

    /// ```
    /// uint64_t vkGetBufferOpaqueCaptureAddressKHR((struct VkDevice*) VkDevice device, const VkBufferDeviceAddressInfo* pInfo);
    /// ```
    public static long vkGetBufferOpaqueCaptureAddressKHR(VkDevice device, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetBufferOpaqueCaptureAddressKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetBufferOpaqueCaptureAddressKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetBufferOpaqueCaptureAddressKHR", device, pInfo); }
        return (long) Handles.MH_vkGetBufferOpaqueCaptureAddressKHR.invokeExact(device.capabilities().PFN_vkGetBufferOpaqueCaptureAddressKHR, device.segment(), pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetBufferOpaqueCaptureAddressKHR", e); }
    }

    /// ```
    /// uint64_t vkGetDeviceMemoryOpaqueCaptureAddressKHR((struct VkDevice*) VkDevice device, const VkDeviceMemoryOpaqueCaptureAddressInfo* pInfo);
    /// ```
    public static long vkGetDeviceMemoryOpaqueCaptureAddressKHR(VkDevice device, MemorySegment pInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetDeviceMemoryOpaqueCaptureAddressKHR)) throw new VKSymbolNotFoundError("Symbol not found: vkGetDeviceMemoryOpaqueCaptureAddressKHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetDeviceMemoryOpaqueCaptureAddressKHR", device, pInfo); }
        return (long) Handles.MH_vkGetDeviceMemoryOpaqueCaptureAddressKHR.invokeExact(device.capabilities().PFN_vkGetDeviceMemoryOpaqueCaptureAddressKHR, device.segment(), pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetDeviceMemoryOpaqueCaptureAddressKHR", e); }
    }

}

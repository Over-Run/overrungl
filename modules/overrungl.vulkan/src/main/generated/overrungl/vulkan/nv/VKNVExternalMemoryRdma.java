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
package overrungl.vulkan.nv;
import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.vulkan.*;
public final class VKNVExternalMemoryRdma {
    public static final int VK_NV_EXTERNAL_MEMORY_RDMA_SPEC_VERSION = 1;
    public static final String VK_NV_EXTERNAL_MEMORY_RDMA_EXTENSION_NAME = "VK_NV_external_memory_rdma";
    public static final int VK_STRUCTURE_TYPE_MEMORY_GET_REMOTE_ADDRESS_INFO_NV = 1000371000;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_RDMA_FEATURES_NV = 1000371001;
    public static final int VK_MEMORY_PROPERTY_RDMA_CAPABLE_BIT_NV = 0x00000100;
    public static final int VK_EXTERNAL_MEMORY_HANDLE_TYPE_RDMA_ADDRESS_BIT_NV = 0x00001000;
    public static final class Handles {
        public static final MethodHandle MH_vkGetMemoryRemoteAddressNV = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKNVExternalMemoryRdma() {}

    /// ```
    /// (int) VkResult vkGetMemoryRemoteAddressNV((struct VkDevice*) VkDevice device, const VkMemoryGetRemoteAddressInfoNV* pMemoryGetRemoteAddressInfo, VkRemoteAddressNV* pAddress);
    /// ```
    public static int vkGetMemoryRemoteAddressNV(VkDevice device, MemorySegment pMemoryGetRemoteAddressInfo, MemorySegment pAddress) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetMemoryRemoteAddressNV)) throw new VKSymbolNotFoundError("Symbol not found: vkGetMemoryRemoteAddressNV");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetMemoryRemoteAddressNV", device, pMemoryGetRemoteAddressInfo, pAddress); }
        return (int) Handles.MH_vkGetMemoryRemoteAddressNV.invokeExact(device.capabilities().PFN_vkGetMemoryRemoteAddressNV, device.segment(), pMemoryGetRemoteAddressInfo, pAddress); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetMemoryRemoteAddressNV", e); }
    }

}

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
import static overrungl.vulkan.VK12.*;
import static overrungl.vulkan.ext.VKEXTBufferDeviceAddress.*;
public class VKEXTBufferDeviceAddress {
    public static final int VK_EXT_BUFFER_DEVICE_ADDRESS_SPEC_VERSION = 2;
    public static final String VK_EXT_BUFFER_DEVICE_ADDRESS_EXTENSION_NAME = "VK_EXT_buffer_device_address";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT = 1000244000;
    public static final int VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_CREATE_INFO_EXT = 1000244002;
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_ADDRESS_FEATURES_EXT = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_DEVICE_ADDRESS_FEATURES_EXT;
    public static final int VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO_EXT = VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_INFO;
    public static final int VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT_EXT = VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT;
    public static final int VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT = VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT;
    public static final int VK_ERROR_INVALID_DEVICE_ADDRESS_EXT = VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkGetBufferDeviceAddressEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkGetBufferDeviceAddressEXT;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkGetBufferDeviceAddressEXT = func.invoke(device, "vkGetBufferDeviceAddressEXT", "vkGetBufferDeviceAddress");
        }
    }

    public VKEXTBufferDeviceAddress(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public @CType("VkDeviceAddress") long GetBufferDeviceAddressEXT(@CType("VkDevice") MemorySegment device, @CType("const VkBufferDeviceAddressInfo *") MemorySegment pInfo) {
        if (Unmarshal.isNullPointer(handles.PFN_vkGetBufferDeviceAddressEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetBufferDeviceAddressEXT");
        try { return (long) Handles.MH_vkGetBufferDeviceAddressEXT.invokeExact(handles.PFN_vkGetBufferDeviceAddressEXT, device, pInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetBufferDeviceAddressEXT", e); }
    }

}

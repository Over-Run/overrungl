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
public class VKEXTDeviceFault {
    public static final int VK_DEVICE_FAULT_ADDRESS_TYPE_NONE_EXT = 0;
    public static final int VK_DEVICE_FAULT_ADDRESS_TYPE_READ_INVALID_EXT = 1;
    public static final int VK_DEVICE_FAULT_ADDRESS_TYPE_WRITE_INVALID_EXT = 2;
    public static final int VK_DEVICE_FAULT_ADDRESS_TYPE_EXECUTE_INVALID_EXT = 3;
    public static final int VK_DEVICE_FAULT_ADDRESS_TYPE_INSTRUCTION_POINTER_UNKNOWN_EXT = 4;
    public static final int VK_DEVICE_FAULT_ADDRESS_TYPE_INSTRUCTION_POINTER_INVALID_EXT = 5;
    public static final int VK_DEVICE_FAULT_ADDRESS_TYPE_INSTRUCTION_POINTER_FAULT_EXT = 6;
    public static final int VK_DEVICE_FAULT_VENDOR_BINARY_HEADER_VERSION_ONE_EXT = 1;
    public static final int VK_EXT_DEVICE_FAULT_SPEC_VERSION = 2;
    public static final String VK_EXT_DEVICE_FAULT_EXTENSION_NAME = "VK_EXT_device_fault";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FAULT_FEATURES_EXT = 1000341000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_FAULT_COUNTS_EXT = 1000341001;
    public static final int VK_STRUCTURE_TYPE_DEVICE_FAULT_INFO_EXT = 1000341002;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkGetDeviceFaultInfoEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkGetDeviceFaultInfoEXT;
        private Handles(MemorySegment device, VKLoadFunc func) {
            PFN_vkGetDeviceFaultInfoEXT = func.invoke(device, "vkGetDeviceFaultInfoEXT");
        }
    }

    public VKEXTDeviceFault(MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    /// ```
    /// VkResult vkGetDeviceFaultInfoEXT(VkDevice device, VkDeviceFaultCountsEXT* pFaultCounts, VkDeviceFaultInfoEXT* pFaultInfo);
    /// ```
    public int GetDeviceFaultInfoEXT(MemorySegment device, MemorySegment pFaultCounts, MemorySegment pFaultInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkGetDeviceFaultInfoEXT)) throw new SymbolNotFoundError("Symbol not found: vkGetDeviceFaultInfoEXT");
        try { return (int) Handles.MH_vkGetDeviceFaultInfoEXT.invokeExact(handles.PFN_vkGetDeviceFaultInfoEXT, device, pFaultCounts, pFaultInfo); }
        catch (Throwable e) { throw new RuntimeException("error in GetDeviceFaultInfoEXT", e); }
    }

}

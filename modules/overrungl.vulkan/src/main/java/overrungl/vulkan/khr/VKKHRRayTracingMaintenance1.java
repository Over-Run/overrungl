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
public class VKKHRRayTracingMaintenance1 {
    public static final int VK_KHR_RAY_TRACING_MAINTENANCE_1_SPEC_VERSION = 1;
    public static final String VK_KHR_RAY_TRACING_MAINTENANCE_1_EXTENSION_NAME = "VK_KHR_ray_tracing_maintenance1";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MAINTENANCE_1_FEATURES_KHR = 1000386000;
    public static final int VK_QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_BOTTOM_LEVEL_POINTERS_KHR = 1000386000;
    public static final int VK_QUERY_TYPE_ACCELERATION_STRUCTURE_SIZE_KHR = 1000386001;
    public static final long VK_PIPELINE_STAGE_2_ACCELERATION_STRUCTURE_COPY_BIT_KHR = 0x10000000L;
    public static final long VK_ACCESS_2_SHADER_BINDING_TABLE_READ_BIT_KHR = 0x10000000000L;
    public static final int VK_INDIRECT_COMMANDS_TOKEN_TYPE_TRACE_RAYS2_EXT = 1000386004;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkCmdTraceRaysIndirect2KHR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG);
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkCmdTraceRaysIndirect2KHR = RuntimeHelper.downcall(Descriptors.FD_vkCmdTraceRaysIndirect2KHR);
        public final MemorySegment PFN_vkCmdTraceRaysIndirect2KHR;
        private Handles(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
            PFN_vkCmdTraceRaysIndirect2KHR = func.invoke(device, "vkCmdTraceRaysIndirect2KHR");
        }
    }

    public VKKHRRayTracingMaintenance1(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        this.handles = new Handles(device, func);
    }

    public void CmdTraceRaysIndirect2KHR(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("VkDeviceAddress") long indirectDeviceAddress) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCmdTraceRaysIndirect2KHR)) throw new SymbolNotFoundError("Symbol not found: vkCmdTraceRaysIndirect2KHR");
        try { Handles.MH_vkCmdTraceRaysIndirect2KHR.invokeExact(handles.PFN_vkCmdTraceRaysIndirect2KHR, commandBuffer, indirectDeviceAddress); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdTraceRaysIndirect2KHR", e); }
    }

}

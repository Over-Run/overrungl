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
public class VKEXTDebugMarker {
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT = 0;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT = 1;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT = 2;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT = 3;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT = 4;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT = 5;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT = 6;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT = 7;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT = 8;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT = 9;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT = 10;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT = 11;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT = 12;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT = 13;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT = 14;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT = 15;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT = 16;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT = 17;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT = 18;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT = 19;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT = 20;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT = 21;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT = 22;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT = 23;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT = 24;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT = 25;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT = 26;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT = 27;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT = 28;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT = 29;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT = 30;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT = 33;
    public static final int VK_EXT_DEBUG_MARKER_SPEC_VERSION = 4;
    public static final String VK_EXT_DEBUG_MARKER_EXTENSION_NAME = "VK_EXT_debug_marker";
    public static final int VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT = 1000022000;
    public static final int VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT = 1000022001;
    public static final int VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT = 1000022002;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT = VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT = VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT;
    public static final MethodHandle MH_vkDebugMarkerSetObjectTagEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkDebugMarkerSetObjectNameEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdDebugMarkerBeginEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdDebugMarkerEndEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdDebugMarkerInsertEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public final MemorySegment PFN_vkDebugMarkerSetObjectTagEXT;
    public final MemorySegment PFN_vkDebugMarkerSetObjectNameEXT;
    public final MemorySegment PFN_vkCmdDebugMarkerBeginEXT;
    public final MemorySegment PFN_vkCmdDebugMarkerEndEXT;
    public final MemorySegment PFN_vkCmdDebugMarkerInsertEXT;

    public VKEXTDebugMarker(@CType("VkDevice") MemorySegment device, VKLoadFunc func) {
        PFN_vkDebugMarkerSetObjectTagEXT = func.invoke(device, "vkDebugMarkerSetObjectTagEXT");
        PFN_vkDebugMarkerSetObjectNameEXT = func.invoke(device, "vkDebugMarkerSetObjectNameEXT");
        PFN_vkCmdDebugMarkerBeginEXT = func.invoke(device, "vkCmdDebugMarkerBeginEXT");
        PFN_vkCmdDebugMarkerEndEXT = func.invoke(device, "vkCmdDebugMarkerEndEXT");
        PFN_vkCmdDebugMarkerInsertEXT = func.invoke(device, "vkCmdDebugMarkerInsertEXT");
    }

    public @CType("VkResult") int DebugMarkerSetObjectTagEXT(@CType("VkDevice") MemorySegment device, @CType("const VkDebugMarkerObjectTagInfoEXT *") MemorySegment pTagInfo) {
        if (Unmarshal.isNullPointer(PFN_vkDebugMarkerSetObjectTagEXT)) throw new SymbolNotFoundError("Symbol not found: vkDebugMarkerSetObjectTagEXT");
        try { return (int) MH_vkDebugMarkerSetObjectTagEXT.invokeExact(PFN_vkDebugMarkerSetObjectTagEXT, device, pTagInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkDebugMarkerSetObjectTagEXT", e); }
    }

    public @CType("VkResult") int DebugMarkerSetObjectNameEXT(@CType("VkDevice") MemorySegment device, @CType("const VkDebugMarkerObjectNameInfoEXT *") MemorySegment pNameInfo) {
        if (Unmarshal.isNullPointer(PFN_vkDebugMarkerSetObjectNameEXT)) throw new SymbolNotFoundError("Symbol not found: vkDebugMarkerSetObjectNameEXT");
        try { return (int) MH_vkDebugMarkerSetObjectNameEXT.invokeExact(PFN_vkDebugMarkerSetObjectNameEXT, device, pNameInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkDebugMarkerSetObjectNameEXT", e); }
    }

    public void CmdDebugMarkerBeginEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkDebugMarkerMarkerInfoEXT *") MemorySegment pMarkerInfo) {
        if (Unmarshal.isNullPointer(PFN_vkCmdDebugMarkerBeginEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdDebugMarkerBeginEXT");
        try { MH_vkCmdDebugMarkerBeginEXT.invokeExact(PFN_vkCmdDebugMarkerBeginEXT, commandBuffer, pMarkerInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDebugMarkerBeginEXT", e); }
    }

    public void CmdDebugMarkerEndEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer) {
        if (Unmarshal.isNullPointer(PFN_vkCmdDebugMarkerEndEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdDebugMarkerEndEXT");
        try { MH_vkCmdDebugMarkerEndEXT.invokeExact(PFN_vkCmdDebugMarkerEndEXT, commandBuffer); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDebugMarkerEndEXT", e); }
    }

    public void CmdDebugMarkerInsertEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkDebugMarkerMarkerInfoEXT *") MemorySegment pMarkerInfo) {
        if (Unmarshal.isNullPointer(PFN_vkCmdDebugMarkerInsertEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdDebugMarkerInsertEXT");
        try { MH_vkCmdDebugMarkerInsertEXT.invokeExact(PFN_vkCmdDebugMarkerInsertEXT, commandBuffer, pMarkerInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdDebugMarkerInsertEXT", e); }
    }

}

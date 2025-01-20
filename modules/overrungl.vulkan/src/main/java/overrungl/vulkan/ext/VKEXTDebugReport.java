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
import java.util.*;
import static overrungl.vulkan.ext.VKEXTDebugReport.*;
public class VKEXTDebugReport {
    public static final int VK_DEBUG_REPORT_INFORMATION_BIT_EXT = 0x00000001;
    public static final int VK_DEBUG_REPORT_WARNING_BIT_EXT = 0x00000002;
    public static final int VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT = 0x00000004;
    public static final int VK_DEBUG_REPORT_ERROR_BIT_EXT = 0x00000008;
    public static final int VK_DEBUG_REPORT_DEBUG_BIT_EXT = 0x00000010;
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
    public static final int VK_EXT_DEBUG_REPORT_SPEC_VERSION = 10;
    public static final String VK_EXT_DEBUG_REPORT_EXTENSION_NAME = "VK_EXT_debug_report";
    public static final int VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT = 1000011000;
    public static final int VK_ERROR_VALIDATION_FAILED_EXT = -1000011001;
    public static final int VK_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT = 1000011000;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_EXT = 1000011000;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_EXT = 1000011000;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT = VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT = VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT;
    public static final int VK_STRUCTURE_TYPE_DEBUG_REPORT_CREATE_INFO_EXT = VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT;
    private final Handles handles;
    public static final class Descriptors {
        public static final FunctionDescriptor FD_vkCreateDebugReportCallbackEXT = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDestroyDebugReportCallbackEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_vkDebugReportMessageEXT = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final List<FunctionDescriptor> LIST = List.of(
            FD_vkCreateDebugReportCallbackEXT,
            FD_vkDestroyDebugReportCallbackEXT,
            FD_vkDebugReportMessageEXT
        );
        private Descriptors() {}
    }
    public static final class Handles {
        public static final MethodHandle MH_vkCreateDebugReportCallbackEXT = RuntimeHelper.downcall(Descriptors.FD_vkCreateDebugReportCallbackEXT);
        public static final MethodHandle MH_vkDestroyDebugReportCallbackEXT = RuntimeHelper.downcall(Descriptors.FD_vkDestroyDebugReportCallbackEXT);
        public static final MethodHandle MH_vkDebugReportMessageEXT = RuntimeHelper.downcall(Descriptors.FD_vkDebugReportMessageEXT);
        public final MemorySegment PFN_vkCreateDebugReportCallbackEXT;
        public final MemorySegment PFN_vkDestroyDebugReportCallbackEXT;
        public final MemorySegment PFN_vkDebugReportMessageEXT;
        private Handles(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
            PFN_vkCreateDebugReportCallbackEXT = func.invoke(instance, "vkCreateDebugReportCallbackEXT");
            PFN_vkDestroyDebugReportCallbackEXT = func.invoke(instance, "vkDestroyDebugReportCallbackEXT");
            PFN_vkDebugReportMessageEXT = func.invoke(instance, "vkDebugReportMessageEXT");
        }
    }

    public VKEXTDebugReport(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
        this.handles = new Handles(instance, func);
    }

    public @CType("VkResult") int CreateDebugReportCallbackEXT(@CType("VkInstance") MemorySegment instance, @CType("const VkDebugReportCallbackCreateInfoEXT *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkDebugReportCallbackEXT *") MemorySegment pCallback) {
        if (Unmarshal.isNullPointer(handles.PFN_vkCreateDebugReportCallbackEXT)) throw new SymbolNotFoundError("Symbol not found: vkCreateDebugReportCallbackEXT");
        try { return (int) Handles.MH_vkCreateDebugReportCallbackEXT.invokeExact(handles.PFN_vkCreateDebugReportCallbackEXT, instance, pCreateInfo, pAllocator, pCallback); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDebugReportCallbackEXT", e); }
    }

    public void DestroyDebugReportCallbackEXT(@CType("VkInstance") MemorySegment instance, @CType("VkDebugReportCallbackEXT") MemorySegment callback, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDestroyDebugReportCallbackEXT)) throw new SymbolNotFoundError("Symbol not found: vkDestroyDebugReportCallbackEXT");
        try { Handles.MH_vkDestroyDebugReportCallbackEXT.invokeExact(handles.PFN_vkDestroyDebugReportCallbackEXT, instance, callback, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyDebugReportCallbackEXT", e); }
    }

    public void DebugReportMessageEXT(@CType("VkInstance") MemorySegment instance, @CType("VkDebugReportFlagsEXT") int flags, @CType("VkDebugReportObjectTypeEXT") int objectType, @CType("uint64_t") long object, @CType("size_t") long location, @CType("int32_t") int messageCode, @CType("const char *") MemorySegment pLayerPrefix, @CType("const char *") MemorySegment pMessage) {
        if (Unmarshal.isNullPointer(handles.PFN_vkDebugReportMessageEXT)) throw new SymbolNotFoundError("Symbol not found: vkDebugReportMessageEXT");
        try { Handles.MH_vkDebugReportMessageEXT.invokeExact(handles.PFN_vkDebugReportMessageEXT, instance, flags, objectType, object, location, messageCode, pLayerPrefix, pMessage); }
        catch (Throwable e) { throw new RuntimeException("error in vkDebugReportMessageEXT", e); }
    }

}

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
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_debug_report` - instance extension
public final class VKEXTDebugReport {
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
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT = 28;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT = 29;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT = 30;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT = 33;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT = 33;
    public static final int VK_EXT_DEBUG_REPORT_SPEC_VERSION = 10;
    public static final String VK_EXT_DEBUG_REPORT_EXTENSION_NAME = "VK_EXT_debug_report";
    public static final int VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT = 1000011000;
    public static final int VK_STRUCTURE_TYPE_DEBUG_REPORT_CREATE_INFO_EXT = 1000011000;
    public static final int VK_ERROR_VALIDATION_FAILED_EXT = -1000011001;
    public static final int VK_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT = 1000011000;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_EXT = 1000156000;
    public static final int VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_EXT = 1000011000;
    public static final class Handles {
        public static final MethodHandle MH_vkCreateDebugReportCallbackEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyDebugReportCallbackEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDebugReportMessageEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, CanonicalTypes.SIZE_T, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTDebugReport() {}

    /// Invokes `vkCreateDebugReportCallbackEXT`.
    /// ```
    /// (int) VkResult vkCreateDebugReportCallbackEXT((struct VkInstance*) VkInstance instance, const VkDebugReportCallbackCreateInfoEXT* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkDebugReportCallbackEXT* pCallback);
    /// ```
    public static int vkCreateDebugReportCallbackEXT(@NonNull VkInstance instance, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pCallback) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkCreateDebugReportCallbackEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateDebugReportCallbackEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateDebugReportCallbackEXT", instance, pCreateInfo, pAllocator, pCallback); }
        return (int) Handles.MH_vkCreateDebugReportCallbackEXT.invokeExact(instance.capabilities().PFN_vkCreateDebugReportCallbackEXT, instance.segment(), pCreateInfo, pAllocator, pCallback); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDebugReportCallbackEXT", e); }
    }

    /// Invokes `vkDestroyDebugReportCallbackEXT`.
    /// ```
    /// void vkDestroyDebugReportCallbackEXT((struct VkInstance*) VkInstance instance, (uint64_t) VkDebugReportCallbackEXT callback, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyDebugReportCallbackEXT(@NonNull VkInstance instance, long callback, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkDestroyDebugReportCallbackEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyDebugReportCallbackEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyDebugReportCallbackEXT", instance, callback, pAllocator); }
        Handles.MH_vkDestroyDebugReportCallbackEXT.invokeExact(instance.capabilities().PFN_vkDestroyDebugReportCallbackEXT, instance.segment(), callback, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyDebugReportCallbackEXT", e); }
    }

    /// Invokes `vkDebugReportMessageEXT`.
    /// ```
    /// void vkDebugReportMessageEXT((struct VkInstance*) VkInstance instance, ((uint32_t) VkFlags) VkDebugReportFlagsEXT flags, (int) VkDebugReportObjectTypeEXT objectType, uint64_t object, size_t location, int32_t messageCode, const char* pLayerPrefix, const char* pMessage);
    /// ```
    public static void vkDebugReportMessageEXT(@NonNull VkInstance instance, int flags, int objectType, long object, long location, int messageCode, @NonNull MemorySegment pLayerPrefix, @NonNull MemorySegment pMessage) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkDebugReportMessageEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkDebugReportMessageEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDebugReportMessageEXT", instance, flags, objectType, object, location, messageCode, pLayerPrefix, pMessage); }
        Handles.MH_vkDebugReportMessageEXT.invoke(instance.capabilities().PFN_vkDebugReportMessageEXT, instance.segment(), flags, objectType, object, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, location), messageCode, pLayerPrefix, pMessage); }
        catch (Throwable e) { throw new RuntimeException("error in vkDebugReportMessageEXT", e); }
    }

}

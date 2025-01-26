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
public class VKEXTDebugUtils {
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT = 0x00000001;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT = 0x00000010;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT = 0x00000100;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT = 0x00001000;
    public static final int VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT = 0x00000001;
    public static final int VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT = 0x00000002;
    public static final int VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT = 0x00000004;
    public static final int VK_EXT_DEBUG_UTILS_SPEC_VERSION = 2;
    public static final String VK_EXT_DEBUG_UTILS_EXTENSION_NAME = "VK_EXT_debug_utils";
    public static final int VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT = 1000128000;
    public static final int VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT = 1000128001;
    public static final int VK_STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT = 1000128002;
    public static final int VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT = 1000128003;
    public static final int VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT = 1000128004;
    public static final int VK_OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT = 1000128000;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_vkSetDebugUtilsObjectNameEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkSetDebugUtilsObjectTagEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkQueueBeginDebugUtilsLabelEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkQueueEndDebugUtilsLabelEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkQueueInsertDebugUtilsLabelEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBeginDebugUtilsLabelEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdEndDebugUtilsLabelEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdInsertDebugUtilsLabelEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateDebugUtilsMessengerEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyDebugUtilsMessengerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkSubmitDebugUtilsMessageEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public final MemorySegment PFN_vkSetDebugUtilsObjectNameEXT;
        public final MemorySegment PFN_vkSetDebugUtilsObjectTagEXT;
        public final MemorySegment PFN_vkQueueBeginDebugUtilsLabelEXT;
        public final MemorySegment PFN_vkQueueEndDebugUtilsLabelEXT;
        public final MemorySegment PFN_vkQueueInsertDebugUtilsLabelEXT;
        public final MemorySegment PFN_vkCmdBeginDebugUtilsLabelEXT;
        public final MemorySegment PFN_vkCmdEndDebugUtilsLabelEXT;
        public final MemorySegment PFN_vkCmdInsertDebugUtilsLabelEXT;
        public final MemorySegment PFN_vkCreateDebugUtilsMessengerEXT;
        public final MemorySegment PFN_vkDestroyDebugUtilsMessengerEXT;
        public final MemorySegment PFN_vkSubmitDebugUtilsMessageEXT;
        private Handles(MemorySegment instance, VKLoadFunc func) {
            PFN_vkSetDebugUtilsObjectNameEXT = func.invoke(instance, "vkSetDebugUtilsObjectNameEXT");
            PFN_vkSetDebugUtilsObjectTagEXT = func.invoke(instance, "vkSetDebugUtilsObjectTagEXT");
            PFN_vkQueueBeginDebugUtilsLabelEXT = func.invoke(instance, "vkQueueBeginDebugUtilsLabelEXT");
            PFN_vkQueueEndDebugUtilsLabelEXT = func.invoke(instance, "vkQueueEndDebugUtilsLabelEXT");
            PFN_vkQueueInsertDebugUtilsLabelEXT = func.invoke(instance, "vkQueueInsertDebugUtilsLabelEXT");
            PFN_vkCmdBeginDebugUtilsLabelEXT = func.invoke(instance, "vkCmdBeginDebugUtilsLabelEXT");
            PFN_vkCmdEndDebugUtilsLabelEXT = func.invoke(instance, "vkCmdEndDebugUtilsLabelEXT");
            PFN_vkCmdInsertDebugUtilsLabelEXT = func.invoke(instance, "vkCmdInsertDebugUtilsLabelEXT");
            PFN_vkCreateDebugUtilsMessengerEXT = func.invoke(instance, "vkCreateDebugUtilsMessengerEXT");
            PFN_vkDestroyDebugUtilsMessengerEXT = func.invoke(instance, "vkDestroyDebugUtilsMessengerEXT");
            PFN_vkSubmitDebugUtilsMessageEXT = func.invoke(instance, "vkSubmitDebugUtilsMessageEXT");
        }
    }

    public VKEXTDebugUtils(MemorySegment instance, VKLoadFunc func) {
        this.handles = new Handles(instance, func);
    }

    /// ```
    /// VkResult vkSetDebugUtilsObjectNameEXT(VkDevice device, const VkDebugUtilsObjectNameInfoEXT* pNameInfo);
    /// ```
    public int SetDebugUtilsObjectNameEXT(MemorySegment device, MemorySegment pNameInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkSetDebugUtilsObjectNameEXT)) throw new SymbolNotFoundError("Symbol not found: vkSetDebugUtilsObjectNameEXT");
        try { return (int) Handles.MH_vkSetDebugUtilsObjectNameEXT.invokeExact(handles.PFN_vkSetDebugUtilsObjectNameEXT, device, pNameInfo); }
        catch (Throwable e) { throw new RuntimeException("error in SetDebugUtilsObjectNameEXT", e); }
    }

    /// ```
    /// VkResult vkSetDebugUtilsObjectTagEXT(VkDevice device, const VkDebugUtilsObjectTagInfoEXT* pTagInfo);
    /// ```
    public int SetDebugUtilsObjectTagEXT(MemorySegment device, MemorySegment pTagInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkSetDebugUtilsObjectTagEXT)) throw new SymbolNotFoundError("Symbol not found: vkSetDebugUtilsObjectTagEXT");
        try { return (int) Handles.MH_vkSetDebugUtilsObjectTagEXT.invokeExact(handles.PFN_vkSetDebugUtilsObjectTagEXT, device, pTagInfo); }
        catch (Throwable e) { throw new RuntimeException("error in SetDebugUtilsObjectTagEXT", e); }
    }

    /// ```
    /// void vkQueueBeginDebugUtilsLabelEXT(VkQueue queue, const VkDebugUtilsLabelEXT* pLabelInfo);
    /// ```
    public void QueueBeginDebugUtilsLabelEXT(MemorySegment queue, MemorySegment pLabelInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkQueueBeginDebugUtilsLabelEXT)) throw new SymbolNotFoundError("Symbol not found: vkQueueBeginDebugUtilsLabelEXT");
        try { Handles.MH_vkQueueBeginDebugUtilsLabelEXT.invokeExact(handles.PFN_vkQueueBeginDebugUtilsLabelEXT, queue, pLabelInfo); }
        catch (Throwable e) { throw new RuntimeException("error in QueueBeginDebugUtilsLabelEXT", e); }
    }

    /// ```
    /// void vkQueueEndDebugUtilsLabelEXT(VkQueue queue);
    /// ```
    public void QueueEndDebugUtilsLabelEXT(MemorySegment queue) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkQueueEndDebugUtilsLabelEXT)) throw new SymbolNotFoundError("Symbol not found: vkQueueEndDebugUtilsLabelEXT");
        try { Handles.MH_vkQueueEndDebugUtilsLabelEXT.invokeExact(handles.PFN_vkQueueEndDebugUtilsLabelEXT, queue); }
        catch (Throwable e) { throw new RuntimeException("error in QueueEndDebugUtilsLabelEXT", e); }
    }

    /// ```
    /// void vkQueueInsertDebugUtilsLabelEXT(VkQueue queue, const VkDebugUtilsLabelEXT* pLabelInfo);
    /// ```
    public void QueueInsertDebugUtilsLabelEXT(MemorySegment queue, MemorySegment pLabelInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkQueueInsertDebugUtilsLabelEXT)) throw new SymbolNotFoundError("Symbol not found: vkQueueInsertDebugUtilsLabelEXT");
        try { Handles.MH_vkQueueInsertDebugUtilsLabelEXT.invokeExact(handles.PFN_vkQueueInsertDebugUtilsLabelEXT, queue, pLabelInfo); }
        catch (Throwable e) { throw new RuntimeException("error in QueueInsertDebugUtilsLabelEXT", e); }
    }

    /// ```
    /// void vkCmdBeginDebugUtilsLabelEXT(VkCommandBuffer commandBuffer, const VkDebugUtilsLabelEXT* pLabelInfo);
    /// ```
    public void CmdBeginDebugUtilsLabelEXT(MemorySegment commandBuffer, MemorySegment pLabelInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdBeginDebugUtilsLabelEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdBeginDebugUtilsLabelEXT");
        try { Handles.MH_vkCmdBeginDebugUtilsLabelEXT.invokeExact(handles.PFN_vkCmdBeginDebugUtilsLabelEXT, commandBuffer, pLabelInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdBeginDebugUtilsLabelEXT", e); }
    }

    /// ```
    /// void vkCmdEndDebugUtilsLabelEXT(VkCommandBuffer commandBuffer);
    /// ```
    public void CmdEndDebugUtilsLabelEXT(MemorySegment commandBuffer) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdEndDebugUtilsLabelEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdEndDebugUtilsLabelEXT");
        try { Handles.MH_vkCmdEndDebugUtilsLabelEXT.invokeExact(handles.PFN_vkCmdEndDebugUtilsLabelEXT, commandBuffer); }
        catch (Throwable e) { throw new RuntimeException("error in CmdEndDebugUtilsLabelEXT", e); }
    }

    /// ```
    /// void vkCmdInsertDebugUtilsLabelEXT(VkCommandBuffer commandBuffer, const VkDebugUtilsLabelEXT* pLabelInfo);
    /// ```
    public void CmdInsertDebugUtilsLabelEXT(MemorySegment commandBuffer, MemorySegment pLabelInfo) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCmdInsertDebugUtilsLabelEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdInsertDebugUtilsLabelEXT");
        try { Handles.MH_vkCmdInsertDebugUtilsLabelEXT.invokeExact(handles.PFN_vkCmdInsertDebugUtilsLabelEXT, commandBuffer, pLabelInfo); }
        catch (Throwable e) { throw new RuntimeException("error in CmdInsertDebugUtilsLabelEXT", e); }
    }

    /// ```
    /// VkResult vkCreateDebugUtilsMessengerEXT(VkInstance instance, const VkDebugUtilsMessengerCreateInfoEXT* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkDebugUtilsMessengerEXT* pMessenger);
    /// ```
    public int CreateDebugUtilsMessengerEXT(MemorySegment instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pMessenger) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkCreateDebugUtilsMessengerEXT)) throw new SymbolNotFoundError("Symbol not found: vkCreateDebugUtilsMessengerEXT");
        try { return (int) Handles.MH_vkCreateDebugUtilsMessengerEXT.invokeExact(handles.PFN_vkCreateDebugUtilsMessengerEXT, instance, pCreateInfo, pAllocator, pMessenger); }
        catch (Throwable e) { throw new RuntimeException("error in CreateDebugUtilsMessengerEXT", e); }
    }

    /// ```
    /// void vkDestroyDebugUtilsMessengerEXT(VkInstance instance, VkDebugUtilsMessengerEXT messenger, const VkAllocationCallbacks* pAllocator);
    /// ```
    public void DestroyDebugUtilsMessengerEXT(MemorySegment instance, long messenger, MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkDestroyDebugUtilsMessengerEXT)) throw new SymbolNotFoundError("Symbol not found: vkDestroyDebugUtilsMessengerEXT");
        try { Handles.MH_vkDestroyDebugUtilsMessengerEXT.invokeExact(handles.PFN_vkDestroyDebugUtilsMessengerEXT, instance, messenger, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in DestroyDebugUtilsMessengerEXT", e); }
    }

    /// ```
    /// void vkSubmitDebugUtilsMessageEXT(VkInstance instance, VkDebugUtilsMessageSeverityFlagBitsEXT messageSeverity, VkDebugUtilsMessageTypeFlagsEXT messageTypes, const VkDebugUtilsMessengerCallbackDataEXT* pCallbackData);
    /// ```
    public void SubmitDebugUtilsMessageEXT(MemorySegment instance, int messageSeverity, int messageTypes, MemorySegment pCallbackData) {
        if (MemoryUtil.isNullPointer(handles.PFN_vkSubmitDebugUtilsMessageEXT)) throw new SymbolNotFoundError("Symbol not found: vkSubmitDebugUtilsMessageEXT");
        try { Handles.MH_vkSubmitDebugUtilsMessageEXT.invokeExact(handles.PFN_vkSubmitDebugUtilsMessageEXT, instance, messageSeverity, messageTypes, pCallbackData); }
        catch (Throwable e) { throw new RuntimeException("error in SubmitDebugUtilsMessageEXT", e); }
    }

}

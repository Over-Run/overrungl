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
    public static final MethodHandle MH_vkSetDebugUtilsObjectNameEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkSetDebugUtilsObjectTagEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkQueueBeginDebugUtilsLabelEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkQueueEndDebugUtilsLabelEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkQueueInsertDebugUtilsLabelEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdBeginDebugUtilsLabelEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdEndDebugUtilsLabelEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCmdInsertDebugUtilsLabelEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkCreateDebugUtilsMessengerEXT = RuntimeHelper.downcall(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
    public static final MethodHandle MH_vkDestroyDebugUtilsMessengerEXT = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
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

    public VKEXTDebugUtils(@CType("VkInstance") MemorySegment instance, VKLoadFunc func) {
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

    public @CType("VkResult") int SetDebugUtilsObjectNameEXT(@CType("VkDevice") MemorySegment device, @CType("const VkDebugUtilsObjectNameInfoEXT *") MemorySegment pNameInfo) {
        if (Unmarshal.isNullPointer(PFN_vkSetDebugUtilsObjectNameEXT)) throw new SymbolNotFoundError("Symbol not found: vkSetDebugUtilsObjectNameEXT");
        try { return (int) MH_vkSetDebugUtilsObjectNameEXT.invokeExact(PFN_vkSetDebugUtilsObjectNameEXT, device, pNameInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkSetDebugUtilsObjectNameEXT", e); }
    }

    public @CType("VkResult") int SetDebugUtilsObjectTagEXT(@CType("VkDevice") MemorySegment device, @CType("const VkDebugUtilsObjectTagInfoEXT *") MemorySegment pTagInfo) {
        if (Unmarshal.isNullPointer(PFN_vkSetDebugUtilsObjectTagEXT)) throw new SymbolNotFoundError("Symbol not found: vkSetDebugUtilsObjectTagEXT");
        try { return (int) MH_vkSetDebugUtilsObjectTagEXT.invokeExact(PFN_vkSetDebugUtilsObjectTagEXT, device, pTagInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkSetDebugUtilsObjectTagEXT", e); }
    }

    public void QueueBeginDebugUtilsLabelEXT(@CType("VkQueue") MemorySegment queue, @CType("const VkDebugUtilsLabelEXT *") MemorySegment pLabelInfo) {
        if (Unmarshal.isNullPointer(PFN_vkQueueBeginDebugUtilsLabelEXT)) throw new SymbolNotFoundError("Symbol not found: vkQueueBeginDebugUtilsLabelEXT");
        try { MH_vkQueueBeginDebugUtilsLabelEXT.invokeExact(PFN_vkQueueBeginDebugUtilsLabelEXT, queue, pLabelInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkQueueBeginDebugUtilsLabelEXT", e); }
    }

    public void QueueEndDebugUtilsLabelEXT(@CType("VkQueue") MemorySegment queue) {
        if (Unmarshal.isNullPointer(PFN_vkQueueEndDebugUtilsLabelEXT)) throw new SymbolNotFoundError("Symbol not found: vkQueueEndDebugUtilsLabelEXT");
        try { MH_vkQueueEndDebugUtilsLabelEXT.invokeExact(PFN_vkQueueEndDebugUtilsLabelEXT, queue); }
        catch (Throwable e) { throw new RuntimeException("error in vkQueueEndDebugUtilsLabelEXT", e); }
    }

    public void QueueInsertDebugUtilsLabelEXT(@CType("VkQueue") MemorySegment queue, @CType("const VkDebugUtilsLabelEXT *") MemorySegment pLabelInfo) {
        if (Unmarshal.isNullPointer(PFN_vkQueueInsertDebugUtilsLabelEXT)) throw new SymbolNotFoundError("Symbol not found: vkQueueInsertDebugUtilsLabelEXT");
        try { MH_vkQueueInsertDebugUtilsLabelEXT.invokeExact(PFN_vkQueueInsertDebugUtilsLabelEXT, queue, pLabelInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkQueueInsertDebugUtilsLabelEXT", e); }
    }

    public void CmdBeginDebugUtilsLabelEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkDebugUtilsLabelEXT *") MemorySegment pLabelInfo) {
        if (Unmarshal.isNullPointer(PFN_vkCmdBeginDebugUtilsLabelEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdBeginDebugUtilsLabelEXT");
        try { MH_vkCmdBeginDebugUtilsLabelEXT.invokeExact(PFN_vkCmdBeginDebugUtilsLabelEXT, commandBuffer, pLabelInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginDebugUtilsLabelEXT", e); }
    }

    public void CmdEndDebugUtilsLabelEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer) {
        if (Unmarshal.isNullPointer(PFN_vkCmdEndDebugUtilsLabelEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdEndDebugUtilsLabelEXT");
        try { MH_vkCmdEndDebugUtilsLabelEXT.invokeExact(PFN_vkCmdEndDebugUtilsLabelEXT, commandBuffer); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndDebugUtilsLabelEXT", e); }
    }

    public void CmdInsertDebugUtilsLabelEXT(@CType("VkCommandBuffer") MemorySegment commandBuffer, @CType("const VkDebugUtilsLabelEXT *") MemorySegment pLabelInfo) {
        if (Unmarshal.isNullPointer(PFN_vkCmdInsertDebugUtilsLabelEXT)) throw new SymbolNotFoundError("Symbol not found: vkCmdInsertDebugUtilsLabelEXT");
        try { MH_vkCmdInsertDebugUtilsLabelEXT.invokeExact(PFN_vkCmdInsertDebugUtilsLabelEXT, commandBuffer, pLabelInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdInsertDebugUtilsLabelEXT", e); }
    }

    public @CType("VkResult") int CreateDebugUtilsMessengerEXT(@CType("VkInstance") MemorySegment instance, @CType("const VkDebugUtilsMessengerCreateInfoEXT *") MemorySegment pCreateInfo, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator, @CType("VkDebugUtilsMessengerEXT *") MemorySegment pMessenger) {
        if (Unmarshal.isNullPointer(PFN_vkCreateDebugUtilsMessengerEXT)) throw new SymbolNotFoundError("Symbol not found: vkCreateDebugUtilsMessengerEXT");
        try { return (int) MH_vkCreateDebugUtilsMessengerEXT.invokeExact(PFN_vkCreateDebugUtilsMessengerEXT, instance, pCreateInfo, pAllocator, pMessenger); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDebugUtilsMessengerEXT", e); }
    }

    public void DestroyDebugUtilsMessengerEXT(@CType("VkInstance") MemorySegment instance, @CType("VkDebugUtilsMessengerEXT") MemorySegment messenger, @CType("const VkAllocationCallbacks *") MemorySegment pAllocator) {
        if (Unmarshal.isNullPointer(PFN_vkDestroyDebugUtilsMessengerEXT)) throw new SymbolNotFoundError("Symbol not found: vkDestroyDebugUtilsMessengerEXT");
        try { MH_vkDestroyDebugUtilsMessengerEXT.invokeExact(PFN_vkDestroyDebugUtilsMessengerEXT, instance, messenger, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyDebugUtilsMessengerEXT", e); }
    }

    public void SubmitDebugUtilsMessageEXT(@CType("VkInstance") MemorySegment instance, @CType("VkDebugUtilsMessageSeverityFlagBitsEXT") int messageSeverity, @CType("VkDebugUtilsMessageTypeFlagsEXT") int messageTypes, @CType("const VkDebugUtilsMessengerCallbackDataEXT *") MemorySegment pCallbackData) {
        if (Unmarshal.isNullPointer(PFN_vkSubmitDebugUtilsMessageEXT)) throw new SymbolNotFoundError("Symbol not found: vkSubmitDebugUtilsMessageEXT");
        try { MH_vkSubmitDebugUtilsMessageEXT.invokeExact(PFN_vkSubmitDebugUtilsMessageEXT, instance, messageSeverity, messageTypes, pCallbackData); }
        catch (Throwable e) { throw new RuntimeException("error in vkSubmitDebugUtilsMessageEXT", e); }
    }

}

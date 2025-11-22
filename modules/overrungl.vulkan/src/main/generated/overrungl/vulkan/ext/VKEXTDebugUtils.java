// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_debug_utils` - instance extension
public final class VKEXTDebugUtils {
    public static final int VK_EXT_DEBUG_UTILS_SPEC_VERSION = 2;
    public static final String VK_EXT_DEBUG_UTILS_EXTENSION_NAME = "VK_EXT_debug_utils";
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT = 0x00000001;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT = 0x00000010;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT = 0x00000100;
    public static final int VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT = 0x00001000;
    public static final int VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT = 0x00000001;
    public static final int VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT = 0x00000002;
    public static final int VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT = 0x00000004;
    public static final int VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT = 1000128000;
    public static final int VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT = 1000128001;
    public static final int VK_STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT = 1000128002;
    public static final int VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT = 1000128003;
    public static final int VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT = 1000128004;
    public static final int VK_OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT = 1000128000;
    private VKEXTDebugUtils() {}
    public static final class Handles {
        public static final MethodHandle MH_vkSetDebugUtilsObjectNameEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkSetDebugUtilsObjectTagEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkQueueBeginDebugUtilsLabelEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkQueueEndDebugUtilsLabelEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkQueueInsertDebugUtilsLabelEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdBeginDebugUtilsLabelEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdEndDebugUtilsLabelEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCmdInsertDebugUtilsLabelEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkCreateDebugUtilsMessengerEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyDebugUtilsMessengerEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkSubmitDebugUtilsMessageEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkSetDebugUtilsObjectNameEXT`.
    /// ```
    /// VkResult vkSetDebugUtilsObjectNameEXT(VkDevice device, const VkDebugUtilsObjectNameInfoEXT* pNameInfo);
    /// ```
    public static int vkSetDebugUtilsObjectNameEXT(@NonNull VkDevice device, @NonNull MemorySegment pNameInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkSetDebugUtilsObjectNameEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkSetDebugUtilsObjectNameEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkSetDebugUtilsObjectNameEXT", device, pNameInfo); }
        return (int) Handles.MH_vkSetDebugUtilsObjectNameEXT.invokeExact(device.capabilities().PFN_vkSetDebugUtilsObjectNameEXT, device.segment(), pNameInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkSetDebugUtilsObjectNameEXT", e); }
    }

    /// Invokes `vkSetDebugUtilsObjectTagEXT`.
    /// ```
    /// VkResult vkSetDebugUtilsObjectTagEXT(VkDevice device, const VkDebugUtilsObjectTagInfoEXT* pTagInfo);
    /// ```
    public static int vkSetDebugUtilsObjectTagEXT(@NonNull VkDevice device, @NonNull MemorySegment pTagInfo) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkSetDebugUtilsObjectTagEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkSetDebugUtilsObjectTagEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkSetDebugUtilsObjectTagEXT", device, pTagInfo); }
        return (int) Handles.MH_vkSetDebugUtilsObjectTagEXT.invokeExact(device.capabilities().PFN_vkSetDebugUtilsObjectTagEXT, device.segment(), pTagInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkSetDebugUtilsObjectTagEXT", e); }
    }

    /// Invokes `vkQueueBeginDebugUtilsLabelEXT`.
    /// ```
    /// void vkQueueBeginDebugUtilsLabelEXT(VkQueue queue, const VkDebugUtilsLabelEXT* pLabelInfo);
    /// ```
    public static void vkQueueBeginDebugUtilsLabelEXT(@NonNull VkQueue queue, @NonNull MemorySegment pLabelInfo) {
        if (MemoryUtil.isNullPointer(queue.capabilities().PFN_vkQueueBeginDebugUtilsLabelEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkQueueBeginDebugUtilsLabelEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkQueueBeginDebugUtilsLabelEXT", queue, pLabelInfo); }
        Handles.MH_vkQueueBeginDebugUtilsLabelEXT.invokeExact(queue.capabilities().PFN_vkQueueBeginDebugUtilsLabelEXT, queue.segment(), pLabelInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkQueueBeginDebugUtilsLabelEXT", e); }
    }

    /// Invokes `vkQueueEndDebugUtilsLabelEXT`.
    /// ```
    /// void vkQueueEndDebugUtilsLabelEXT(VkQueue queue);
    /// ```
    public static void vkQueueEndDebugUtilsLabelEXT(@NonNull VkQueue queue) {
        if (MemoryUtil.isNullPointer(queue.capabilities().PFN_vkQueueEndDebugUtilsLabelEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkQueueEndDebugUtilsLabelEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkQueueEndDebugUtilsLabelEXT", queue); }
        Handles.MH_vkQueueEndDebugUtilsLabelEXT.invokeExact(queue.capabilities().PFN_vkQueueEndDebugUtilsLabelEXT, queue.segment()); }
        catch (Throwable e) { throw new RuntimeException("error in vkQueueEndDebugUtilsLabelEXT", e); }
    }

    /// Invokes `vkQueueInsertDebugUtilsLabelEXT`.
    /// ```
    /// void vkQueueInsertDebugUtilsLabelEXT(VkQueue queue, const VkDebugUtilsLabelEXT* pLabelInfo);
    /// ```
    public static void vkQueueInsertDebugUtilsLabelEXT(@NonNull VkQueue queue, @NonNull MemorySegment pLabelInfo) {
        if (MemoryUtil.isNullPointer(queue.capabilities().PFN_vkQueueInsertDebugUtilsLabelEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkQueueInsertDebugUtilsLabelEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkQueueInsertDebugUtilsLabelEXT", queue, pLabelInfo); }
        Handles.MH_vkQueueInsertDebugUtilsLabelEXT.invokeExact(queue.capabilities().PFN_vkQueueInsertDebugUtilsLabelEXT, queue.segment(), pLabelInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkQueueInsertDebugUtilsLabelEXT", e); }
    }

    /// Invokes `vkCmdBeginDebugUtilsLabelEXT`.
    /// ```
    /// void vkCmdBeginDebugUtilsLabelEXT(VkCommandBuffer commandBuffer, const VkDebugUtilsLabelEXT* pLabelInfo);
    /// ```
    public static void vkCmdBeginDebugUtilsLabelEXT(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pLabelInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdBeginDebugUtilsLabelEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdBeginDebugUtilsLabelEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdBeginDebugUtilsLabelEXT", commandBuffer, pLabelInfo); }
        Handles.MH_vkCmdBeginDebugUtilsLabelEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdBeginDebugUtilsLabelEXT, commandBuffer.segment(), pLabelInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdBeginDebugUtilsLabelEXT", e); }
    }

    /// Invokes `vkCmdEndDebugUtilsLabelEXT`.
    /// ```
    /// void vkCmdEndDebugUtilsLabelEXT(VkCommandBuffer commandBuffer);
    /// ```
    public static void vkCmdEndDebugUtilsLabelEXT(@NonNull VkCommandBuffer commandBuffer) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdEndDebugUtilsLabelEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdEndDebugUtilsLabelEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdEndDebugUtilsLabelEXT", commandBuffer); }
        Handles.MH_vkCmdEndDebugUtilsLabelEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdEndDebugUtilsLabelEXT, commandBuffer.segment()); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdEndDebugUtilsLabelEXT", e); }
    }

    /// Invokes `vkCmdInsertDebugUtilsLabelEXT`.
    /// ```
    /// void vkCmdInsertDebugUtilsLabelEXT(VkCommandBuffer commandBuffer, const VkDebugUtilsLabelEXT* pLabelInfo);
    /// ```
    public static void vkCmdInsertDebugUtilsLabelEXT(@NonNull VkCommandBuffer commandBuffer, @NonNull MemorySegment pLabelInfo) {
        if (MemoryUtil.isNullPointer(commandBuffer.capabilities().PFN_vkCmdInsertDebugUtilsLabelEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCmdInsertDebugUtilsLabelEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCmdInsertDebugUtilsLabelEXT", commandBuffer, pLabelInfo); }
        Handles.MH_vkCmdInsertDebugUtilsLabelEXT.invokeExact(commandBuffer.capabilities().PFN_vkCmdInsertDebugUtilsLabelEXT, commandBuffer.segment(), pLabelInfo); }
        catch (Throwable e) { throw new RuntimeException("error in vkCmdInsertDebugUtilsLabelEXT", e); }
    }

    /// Invokes `vkCreateDebugUtilsMessengerEXT`.
    /// ```
    /// VkResult vkCreateDebugUtilsMessengerEXT(VkInstance instance, const VkDebugUtilsMessengerCreateInfoEXT* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkDebugUtilsMessengerEXT* pMessenger);
    /// ```
    public static int vkCreateDebugUtilsMessengerEXT(@NonNull VkInstance instance, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pMessenger) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkCreateDebugUtilsMessengerEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCreateDebugUtilsMessengerEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreateDebugUtilsMessengerEXT", instance, pCreateInfo, pAllocator, pMessenger); }
        return (int) Handles.MH_vkCreateDebugUtilsMessengerEXT.invokeExact(instance.capabilities().PFN_vkCreateDebugUtilsMessengerEXT, instance.segment(), pCreateInfo, pAllocator, pMessenger); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreateDebugUtilsMessengerEXT", e); }
    }

    /// Invokes `vkDestroyDebugUtilsMessengerEXT`.
    /// ```
    /// void vkDestroyDebugUtilsMessengerEXT(VkInstance instance, VkDebugUtilsMessengerEXT messenger, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyDebugUtilsMessengerEXT(@NonNull VkInstance instance, long messenger, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkDestroyDebugUtilsMessengerEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyDebugUtilsMessengerEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyDebugUtilsMessengerEXT", instance, messenger, pAllocator); }
        Handles.MH_vkDestroyDebugUtilsMessengerEXT.invokeExact(instance.capabilities().PFN_vkDestroyDebugUtilsMessengerEXT, instance.segment(), messenger, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyDebugUtilsMessengerEXT", e); }
    }

    /// Invokes `vkSubmitDebugUtilsMessageEXT`.
    /// ```
    /// void vkSubmitDebugUtilsMessageEXT(VkInstance instance, VkDebugUtilsMessageSeverityFlagBitsEXT messageSeverity, VkDebugUtilsMessageTypeFlagsEXT messageTypes, const VkDebugUtilsMessengerCallbackDataEXT* pCallbackData);
    /// ```
    public static void vkSubmitDebugUtilsMessageEXT(@NonNull VkInstance instance, int messageSeverity, int messageTypes, @NonNull MemorySegment pCallbackData) {
        if (MemoryUtil.isNullPointer(instance.capabilities().PFN_vkSubmitDebugUtilsMessageEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkSubmitDebugUtilsMessageEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkSubmitDebugUtilsMessageEXT", instance, messageSeverity, messageTypes, pCallbackData); }
        Handles.MH_vkSubmitDebugUtilsMessageEXT.invokeExact(instance.capabilities().PFN_vkSubmitDebugUtilsMessageEXT, instance.segment(), messageSeverity, messageTypes, pCallbackData); }
        catch (Throwable e) { throw new RuntimeException("error in vkSubmitDebugUtilsMessageEXT", e); }
    }

}

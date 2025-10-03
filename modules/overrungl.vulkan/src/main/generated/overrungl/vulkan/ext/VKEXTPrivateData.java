// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.ext;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_EXT_private_data` - device extension
public final class VKEXTPrivateData {
    public static final int VK_EXT_PRIVATE_DATA_SPEC_VERSION = 1;
    public static final String VK_EXT_PRIVATE_DATA_EXTENSION_NAME = "VK_EXT_private_data";
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES_EXT = 1000295000;
    public static final int VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO_EXT = 1000295001;
    public static final int VK_STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO_EXT = 1000295002;
    public static final int VK_OBJECT_TYPE_PRIVATE_DATA_SLOT_EXT = 1000295000;
    public static final class Handles {
        public static final MethodHandle MH_vkCreatePrivateDataSlotEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkDestroyPrivateDataSlotEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkSetPrivateDataEXT = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG));
        public static final MethodHandle MH_vkGetPrivateDataEXT = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));
        private Handles() {}
    }

    private VKEXTPrivateData() {}

    /// Invokes `vkCreatePrivateDataSlotEXT`.
    /// ```
    /// (int) VkResult vkCreatePrivateDataSlotEXT((struct VkDevice*) VkDevice device, const VkPrivateDataSlotCreateInfo* pCreateInfo, const VkAllocationCallbacks* pAllocator, VkPrivateDataSlot* pPrivateDataSlot);
    /// ```
    public static int vkCreatePrivateDataSlotEXT(@NonNull VkDevice device, @NonNull MemorySegment pCreateInfo, @NonNull MemorySegment pAllocator, @NonNull MemorySegment pPrivateDataSlot) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkCreatePrivateDataSlotEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkCreatePrivateDataSlotEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkCreatePrivateDataSlotEXT", device, pCreateInfo, pAllocator, pPrivateDataSlot); }
        return (int) Handles.MH_vkCreatePrivateDataSlotEXT.invokeExact(device.capabilities().PFN_vkCreatePrivateDataSlotEXT, device.segment(), pCreateInfo, pAllocator, pPrivateDataSlot); }
        catch (Throwable e) { throw new RuntimeException("error in vkCreatePrivateDataSlotEXT", e); }
    }

    /// Invokes `vkDestroyPrivateDataSlotEXT`.
    /// ```
    /// void vkDestroyPrivateDataSlotEXT((struct VkDevice*) VkDevice device, (uint64_t) VkPrivateDataSlot privateDataSlot, const VkAllocationCallbacks* pAllocator);
    /// ```
    public static void vkDestroyPrivateDataSlotEXT(@NonNull VkDevice device, long privateDataSlot, @NonNull MemorySegment pAllocator) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkDestroyPrivateDataSlotEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkDestroyPrivateDataSlotEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkDestroyPrivateDataSlotEXT", device, privateDataSlot, pAllocator); }
        Handles.MH_vkDestroyPrivateDataSlotEXT.invokeExact(device.capabilities().PFN_vkDestroyPrivateDataSlotEXT, device.segment(), privateDataSlot, pAllocator); }
        catch (Throwable e) { throw new RuntimeException("error in vkDestroyPrivateDataSlotEXT", e); }
    }

    /// Invokes `vkSetPrivateDataEXT`.
    /// ```
    /// (int) VkResult vkSetPrivateDataEXT((struct VkDevice*) VkDevice device, (int) VkObjectType objectType, uint64_t objectHandle, (uint64_t) VkPrivateDataSlot privateDataSlot, uint64_t data);
    /// ```
    public static int vkSetPrivateDataEXT(@NonNull VkDevice device, int objectType, long objectHandle, long privateDataSlot, long data) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkSetPrivateDataEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkSetPrivateDataEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkSetPrivateDataEXT", device, objectType, objectHandle, privateDataSlot, data); }
        return (int) Handles.MH_vkSetPrivateDataEXT.invokeExact(device.capabilities().PFN_vkSetPrivateDataEXT, device.segment(), objectType, objectHandle, privateDataSlot, data); }
        catch (Throwable e) { throw new RuntimeException("error in vkSetPrivateDataEXT", e); }
    }

    /// Invokes `vkGetPrivateDataEXT`.
    /// ```
    /// void vkGetPrivateDataEXT((struct VkDevice*) VkDevice device, (int) VkObjectType objectType, uint64_t objectHandle, (uint64_t) VkPrivateDataSlot privateDataSlot, uint64_t* pData);
    /// ```
    public static void vkGetPrivateDataEXT(@NonNull VkDevice device, int objectType, long objectHandle, long privateDataSlot, @NonNull MemorySegment pData) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkGetPrivateDataEXT)) throw new VKSymbolNotFoundError("Symbol not found: vkGetPrivateDataEXT");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkGetPrivateDataEXT", device, objectType, objectHandle, privateDataSlot, pData); }
        Handles.MH_vkGetPrivateDataEXT.invokeExact(device.capabilities().PFN_vkGetPrivateDataEXT, device.segment(), objectType, objectHandle, privateDataSlot, pData); }
        catch (Throwable e) { throw new RuntimeException("error in vkGetPrivateDataEXT", e); }
    }

}

// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.khr;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.vulkan.*;
import static overrungl.internal.RuntimeHelper.*;
/// `VK_KHR_bind_memory2` - device extension
public final class VKKHRBindMemory2 {
    public static final int VK_KHR_BIND_MEMORY_2_SPEC_VERSION = 1;
    public static final String VK_KHR_BIND_MEMORY_2_EXTENSION_NAME = "VK_KHR_bind_memory2";
    public static final int VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO_KHR = 1000157000;
    public static final int VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO_KHR = 1000157001;
    public static final int VK_IMAGE_CREATE_ALIAS_BIT_KHR = 0x00000400;
    private VKKHRBindMemory2() {}
    public static final class Handles {
        public static final MethodHandle MH_vkBindBufferMemory2KHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_vkBindImageMemory2KHR = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        private Handles() {}
    }

    /// Invokes `vkBindBufferMemory2KHR`.
    /// ```
    /// VkResult vkBindBufferMemory2KHR(VkDevice device, uint32_t bindInfoCount, const VkBindBufferMemoryInfo* pBindInfos);
    /// ```
    public static int vkBindBufferMemory2KHR(@NonNull VkDevice device, int bindInfoCount, @NonNull MemorySegment pBindInfos) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkBindBufferMemory2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkBindBufferMemory2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkBindBufferMemory2KHR", device, bindInfoCount, pBindInfos); }
        return (int) Handles.MH_vkBindBufferMemory2KHR.invokeExact(device.capabilities().PFN_vkBindBufferMemory2KHR, device.segment(), bindInfoCount, pBindInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkBindBufferMemory2KHR", e); }
    }

    /// Invokes `vkBindImageMemory2KHR`.
    /// ```
    /// VkResult vkBindImageMemory2KHR(VkDevice device, uint32_t bindInfoCount, const VkBindImageMemoryInfo* pBindInfos);
    /// ```
    public static int vkBindImageMemory2KHR(@NonNull VkDevice device, int bindInfoCount, @NonNull MemorySegment pBindInfos) {
        if (MemoryUtil.isNullPointer(device.capabilities().PFN_vkBindImageMemory2KHR)) throw new VKSymbolNotFoundError("Symbol not found: vkBindImageMemory2KHR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("vkBindImageMemory2KHR", device, bindInfoCount, pBindInfos); }
        return (int) Handles.MH_vkBindImageMemory2KHR.invokeExact(device.capabilities().PFN_vkBindImageMemory2KHR, device.segment(), bindInfoCount, pBindInfos); }
        catch (Throwable e) { throw new RuntimeException("error in vkBindImageMemory2KHR", e); }
    }

}

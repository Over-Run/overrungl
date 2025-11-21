// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.upcall;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef void (VKAPI_PTR *PFN_vkDeviceMemoryReportCallbackEXT)(
///     const VkDeviceMemoryReportCallbackDataEXT*  pCallbackData,
///     void*                                       pUserData);
/// ```
@FunctionalInterface
public interface VkDeviceMemoryReportCallbackEXT extends Upcall {
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
    MethodHandle HANDLE = Upcall.findTarget(VkDeviceMemoryReportCallbackEXT.class, "invoke_", DESCRIPTOR);
    static MemorySegment alloc(Arena arena, VkDeviceMemoryReportCallbackEXT func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }
    void invoke(MemorySegment pCallbackData, MemorySegment pUserData);
    default void invoke_(MemorySegment pCallbackData, MemorySegment pUserData) {
        invoke(pCallbackData, pUserData);
    }
    @Override default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }
}

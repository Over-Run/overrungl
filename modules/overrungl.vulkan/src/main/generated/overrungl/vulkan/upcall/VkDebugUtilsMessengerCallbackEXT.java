// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.upcall;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef VkBool32 (VKAPI_PTR *PFN_vkDebugUtilsMessengerCallbackEXT)(
///     VkDebugUtilsMessageSeverityFlagBitsEXT           messageSeverity,
///     VkDebugUtilsMessageTypeFlagsEXT                  messageTypes,
///     const VkDebugUtilsMessengerCallbackDataEXT*      pCallbackData,
///     void*                                            pUserData);
/// ```
@FunctionalInterface
public interface VkDebugUtilsMessengerCallbackEXT extends Upcall {
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
    MethodHandle HANDLE = Upcall.findTarget(VkDebugUtilsMessengerCallbackEXT.class, "invoke_", DESCRIPTOR);
    static MemorySegment alloc(Arena arena, VkDebugUtilsMessengerCallbackEXT func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }
    int invoke(int messageSeverity, int messageTypes, MemorySegment pCallbackData, MemorySegment pUserData);
    default int invoke_(int messageSeverity, int messageTypes, MemorySegment pCallbackData, MemorySegment pUserData) {
        return invoke(messageSeverity, messageTypes, pCallbackData, pUserData);
    }
    @Override default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }
}

// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.upcall;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef VkBool32 (VKAPI_PTR *PFN_vkDebugReportCallbackEXT)(
///     VkDebugReportFlagsEXT                       flags,
///     VkDebugReportObjectTypeEXT                  objectType,
///     uint64_t                                    object,
///     size_t                                      location,
///     int32_t                                     messageCode,
///     const char*                                 pLayerPrefix,
///     const char*                                 pMessage,
///     void*                                       pUserData);
/// ```
@FunctionalInterface
public interface VkDebugReportCallbackEXT extends Upcall {
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, CanonicalTypes.SIZE_T, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
    MethodHandle HANDLE = Upcall.findTarget(VkDebugReportCallbackEXT.class, RuntimeHelper.upcallTarget2("invoke", DESCRIPTOR), DESCRIPTOR);
    static MemorySegment alloc(Arena arena, VkDebugReportCallbackEXT func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }
    int invoke(int flags, int objectType, long object, long location, int messageCode, MemorySegment pLayerPrefix, MemorySegment pMessage, MemorySegment pUserData);
    default int invokeI(int flags, int objectType, long object, long location, int messageCode, MemorySegment pLayerPrefix, MemorySegment pMessage, MemorySegment pUserData) {
        return invoke(flags, objectType, object, location, messageCode, pLayerPrefix, pMessage, pUserData);
    }
    default int invokeI(int flags, int objectType, long object, int location, int messageCode, MemorySegment pLayerPrefix, MemorySegment pMessage, MemorySegment pUserData) {
        return invoke(flags, objectType, object, location, messageCode, pLayerPrefix, pMessage, pUserData);
    }
    @Override default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }
}

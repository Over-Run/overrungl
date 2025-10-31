// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.upcall;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef (uint32_t) VkBool32 (*VkDebugReportCallbackEXT)(((uint32_t) VkFlags) VkDebugReportFlagsEXT flags, (int) VkDebugReportObjectTypeEXT objectType, uint64_t object, size_t location, int32_t messageCode, const char* pLayerPrefix, const char* pMessage, void* pUserData);
/// ```
@FunctionalInterface
public interface VkDebugReportCallbackEXT extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, CanonicalTypes.SIZE_T, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(VkDebugReportCallbackEXT.class, RuntimeHelper.upcallTarget("invoke", DESCRIPTOR), DESCRIPTOR);

    /// Allocates `VkDebugReportCallbackEXT`.
    /// @param arena the arena
    /// @param func  the function
    /// @return the upcall stub
    static MemorySegment alloc(Arena arena, VkDebugReportCallbackEXT func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }

    /// The target method of the upcall.
    int invoke(int flags, int objectType, long object, long location, int messageCode, MemorySegment pLayerPrefix, MemorySegment pMessage, MemorySegment pUserData);

    /// The target method of the upcall. Chosen at runtime.
    default int invokeIIIJIIPPP(int flags, int objectType, long object, int location, int messageCode, MemorySegment pLayerPrefix, MemorySegment pMessage, MemorySegment pUserData) {
        return invoke(flags, objectType, object, MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, location), messageCode, pLayerPrefix, pMessage, pUserData);
    }

    /// The target method of the upcall. Chosen at runtime.
    default int invokeIIIJJIPPP(int flags, int objectType, long object, long location, int messageCode, MemorySegment pLayerPrefix, MemorySegment pMessage, MemorySegment pUserData) {
        return invoke(flags, objectType, object, MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, location), messageCode, pLayerPrefix, pMessage, pUserData);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

}

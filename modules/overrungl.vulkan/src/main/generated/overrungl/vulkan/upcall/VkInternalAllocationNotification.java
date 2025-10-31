// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.upcall;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef void (*VkInternalAllocationNotification)(void* pUserData, size_t size, (int) VkInternalAllocationType allocationType, (int) VkSystemAllocationScope allocationScope);
/// ```
@FunctionalInterface
public interface VkInternalAllocationNotification extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CanonicalTypes.SIZE_T, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(VkInternalAllocationNotification.class, RuntimeHelper.upcallTarget("invoke", DESCRIPTOR), DESCRIPTOR);

    /// Allocates `VkInternalAllocationNotification`.
    /// @param arena the arena
    /// @param func  the function
    /// @return the upcall stub
    static MemorySegment alloc(Arena arena, VkInternalAllocationNotification func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }

    /// The target method of the upcall.
    void invoke(MemorySegment pUserData, long size, int allocationType, int allocationScope);

    /// The target method of the upcall. Chosen at runtime.
    default void invokeVPIII(MemorySegment pUserData, int size, int allocationType, int allocationScope) {
        invoke(pUserData, MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, size), allocationType, allocationScope);
    }

    /// The target method of the upcall. Chosen at runtime.
    default void invokeVPJII(MemorySegment pUserData, long size, int allocationType, int allocationScope) {
        invoke(pUserData, MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, size), allocationType, allocationScope);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

}

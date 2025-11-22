// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.upcall;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef void (VKAPI_PTR *PFN_vkInternalAllocationNotification)(
///     void*                                       pUserData,
///     size_t                                      size,
///     VkInternalAllocationType                    allocationType,
///     VkSystemAllocationScope                     allocationScope);
/// ```
@FunctionalInterface
public interface VkInternalAllocationNotification extends Upcall {
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, CanonicalTypes.SIZE_T, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    MethodHandle HANDLE = Upcall.findTarget(VkInternalAllocationNotification.class, RuntimeHelper.upcallTarget2("invoke", DESCRIPTOR), DESCRIPTOR);
    static MemorySegment alloc(Arena arena, VkInternalAllocationNotification func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }
    void invoke(MemorySegment pUserData, long size, int allocationType, int allocationScope);
    default void invokeV(MemorySegment pUserData, long size, int allocationType, int allocationScope) {
        invoke(pUserData, size, allocationType, allocationScope);
    }
    default void invokeV(MemorySegment pUserData, int size, int allocationType, int allocationScope) {
        invoke(pUserData, size, allocationType, allocationScope);
    }
    @Override default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }
}

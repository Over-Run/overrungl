// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.upcall;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef void* (VKAPI_PTR *PFN_vkReallocationFunction)(
///     void*                                       pUserData,
///     void*                                       pOriginal,
///     size_t                                      size,
///     size_t                                      alignment,
///     VkSystemAllocationScope                     allocationScope);
/// ```
@FunctionalInterface
public interface VkReallocationFunction extends Upcall {
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, CanonicalTypes.SIZE_T, CanonicalTypes.SIZE_T, ValueLayout.JAVA_INT);
    MethodHandle HANDLE = Upcall.findTarget(VkReallocationFunction.class, RuntimeHelper.upcallTarget2("invoke", DESCRIPTOR), DESCRIPTOR);
    static MemorySegment alloc(Arena arena, VkReallocationFunction func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }
    MemorySegment invoke(MemorySegment pUserData, MemorySegment pOriginal, long size, long alignment, int allocationScope);
    default MemorySegment invokeP(MemorySegment pUserData, MemorySegment pOriginal, long size, long alignment, int allocationScope) {
        return invoke(pUserData, pOriginal, size, alignment, allocationScope);
    }
    default MemorySegment invokeP(MemorySegment pUserData, MemorySegment pOriginal, int size, int alignment, int allocationScope) {
        return invoke(pUserData, pOriginal, size, alignment, allocationScope);
    }
    @Override default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }
}

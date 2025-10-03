// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vma;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef void (*VmaFreeDeviceMemoryFunction)((struct VmaAllocator *) VmaAllocator allocator, uint32_t memoryType, (uint64_t) VkDeviceMemory memory, (uint64_t) VkDeviceSize size, void* pUserData);
/// ```
@FunctionalInterface
public interface VmaFreeDeviceMemoryFunction extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(VmaFreeDeviceMemoryFunction.class, "invoke_", DESCRIPTOR);

    /// Allocates `VmaFreeDeviceMemoryFunction`.
    /// @param arena the arena
    /// @param func  the function
    /// @return the upcall stub
    static MemorySegment alloc(Arena arena, VmaFreeDeviceMemoryFunction func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }

    /// The target method of the upcall.
    void invoke(MemorySegment allocator, int memoryType, long memory, long size, MemorySegment pUserData);

    /// The target method of the upcall.
    default void invoke_(MemorySegment allocator, int memoryType, long memory, long size, MemorySegment pUserData) {
        invoke(allocator, memoryType, memory, size, pUserData);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

}

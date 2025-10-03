// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.upcall;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef void (*VkFreeFunction)(void* pUserData, void* pMemory);
/// ```
@FunctionalInterface
public interface VkFreeFunction extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(VkFreeFunction.class, "invoke_", DESCRIPTOR);

    /// Allocates `VkFreeFunction`.
    /// @param arena the arena
    /// @param func  the function
    /// @return the upcall stub
    static MemorySegment alloc(Arena arena, VkFreeFunction func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }

    /// The target method of the upcall.
    void invoke(MemorySegment pUserData, MemorySegment pMemory);

    /// The target method of the upcall.
    default void invoke_(MemorySegment pUserData, MemorySegment pMemory) {
        invoke(pUserData, pMemory);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

}

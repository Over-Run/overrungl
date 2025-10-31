// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.upcall;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef void (*VkVoidFunction)();
/// ```
@FunctionalInterface
public interface VkVoidFunction extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(VkVoidFunction.class, "invoke_", DESCRIPTOR);

    /// Allocates `VkVoidFunction`.
    /// @param arena the arena
    /// @param func  the function
    /// @return the upcall stub
    static MemorySegment alloc(Arena arena, VkVoidFunction func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }

    /// The target method of the upcall.
    void invoke();

    /// The target method of the upcall.
    default void invoke_() {
        invoke();
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

}

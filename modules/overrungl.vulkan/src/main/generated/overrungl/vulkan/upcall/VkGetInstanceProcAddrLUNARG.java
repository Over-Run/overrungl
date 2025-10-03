// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.upcall;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef (void (*VkVoidFunction)()) PFN_vkVoidFunction (*VkGetInstanceProcAddrLUNARG)((struct VkInstance*) VkInstance instance, const char* pName);
/// ```
@FunctionalInterface
public interface VkGetInstanceProcAddrLUNARG extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(VkGetInstanceProcAddrLUNARG.class, "invoke_", DESCRIPTOR);

    /// Allocates `VkGetInstanceProcAddrLUNARG`.
    /// @param arena the arena
    /// @param func  the function
    /// @return the upcall stub
    static MemorySegment alloc(Arena arena, VkGetInstanceProcAddrLUNARG func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }

    /// The target method of the upcall.
    MemorySegment invoke(MemorySegment instance, MemorySegment pName);

    /// The target method of the upcall.
    default MemorySegment invoke_(MemorySegment instance, MemorySegment pName) {
        return invoke(instance, pName);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

}

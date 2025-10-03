// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.upcall;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef void (*VkFaultCallbackFunction)((uint32_t) VkBool32 unrecordedFaults, uint32_t faultCount, const VkFaultData* pFaults);
/// ```
@FunctionalInterface
public interface VkFaultCallbackFunction extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(VkFaultCallbackFunction.class, "invoke_", DESCRIPTOR);

    /// Allocates `VkFaultCallbackFunction`.
    /// @param arena the arena
    /// @param func  the function
    /// @return the upcall stub
    static MemorySegment alloc(Arena arena, VkFaultCallbackFunction func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }

    /// The target method of the upcall.
    void invoke(int unrecordedFaults, int faultCount, MemorySegment pFaults);

    /// The target method of the upcall.
    default void invoke_(int unrecordedFaults, int faultCount, MemorySegment pFaults) {
        invoke(unrecordedFaults, faultCount, pFaults);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

}

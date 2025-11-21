// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.upcall;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef void (VKAPI_PTR *PFN_vkFaultCallbackFunction)(
///     VkBool32                                    unrecordedFaults,
///     uint32_t                                    faultCount,
///     const VkFaultData*                          pFaults);
/// ```
@FunctionalInterface
public interface VkFaultCallbackFunction extends Upcall {
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    MethodHandle HANDLE = Upcall.findTarget(VkFaultCallbackFunction.class, "invoke_", DESCRIPTOR);
    static MemorySegment alloc(Arena arena, VkFaultCallbackFunction func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }
    void invoke(int unrecordedFaults, int faultCount, MemorySegment pFaults);
    default void invoke_(int unrecordedFaults, int faultCount, MemorySegment pFaults) {
        invoke(unrecordedFaults, faultCount, pFaults);
    }
    @Override default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }
}

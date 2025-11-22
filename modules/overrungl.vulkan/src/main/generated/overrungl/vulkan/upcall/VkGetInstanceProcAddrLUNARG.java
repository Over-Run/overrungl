// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.upcall;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef PFN_vkVoidFunction (VKAPI_PTR *PFN_vkGetInstanceProcAddrLUNARG)(
///     VkInstance instance, const char* pName);
/// ```
@FunctionalInterface
public interface VkGetInstanceProcAddrLUNARG extends Upcall {
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
    MethodHandle HANDLE = Upcall.findTarget(VkGetInstanceProcAddrLUNARG.class, "invoke_", DESCRIPTOR);
    static MemorySegment alloc(Arena arena, VkGetInstanceProcAddrLUNARG func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }
    MemorySegment invoke(MemorySegment instance, MemorySegment pName);
    default MemorySegment invoke_(MemorySegment instance, MemorySegment pName) {
        return invoke(instance, pName);
    }
    @Override default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }
}

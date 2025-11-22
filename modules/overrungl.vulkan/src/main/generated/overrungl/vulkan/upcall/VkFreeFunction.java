// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.upcall;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef void (VKAPI_PTR *PFN_vkFreeFunction)(
///     void*                                       pUserData,
///     void*                                       pMemory);
/// ```
@FunctionalInterface
public interface VkFreeFunction extends Upcall {
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
    MethodHandle HANDLE = Upcall.findTarget(VkFreeFunction.class, "invoke_", DESCRIPTOR);
    static MemorySegment alloc(Arena arena, VkFreeFunction func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }
    void invoke(MemorySegment pUserData, MemorySegment pMemory);
    default void invoke_(MemorySegment pUserData, MemorySegment pMemory) {
        invoke(pUserData, pMemory);
    }
    @Override default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }
}

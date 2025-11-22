// This file is auto-generated. DO NOT EDIT!
package overrungl.vulkan.upcall;
import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef void (VKAPI_PTR *PFN_vkVoidFunction)(void);
/// ```
@FunctionalInterface
public interface VkVoidFunction extends Upcall {
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
    MethodHandle HANDLE = Upcall.findTarget(VkVoidFunction.class, "invoke_", DESCRIPTOR);
    static MemorySegment alloc(Arena arena, VkVoidFunction func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }
    void invoke();
    default void invoke_() {
        invoke();
    }
    @Override default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }
}

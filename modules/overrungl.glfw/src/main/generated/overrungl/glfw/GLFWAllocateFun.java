// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.glfw;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef void* (*GLFWAllocateFun)(size_t size, void* user);
/// ```
@FunctionalInterface
public interface GLFWAllocateFun extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(ValueLayout.ADDRESS, CanonicalTypes.SIZE_T, ValueLayout.ADDRESS);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(GLFWAllocateFun.class, RuntimeHelper.upcallTarget("invoke", DESCRIPTOR), DESCRIPTOR);

    /// Allocates `GLFWAllocateFun`.
    /// @param arena the arena
    /// @param func  the function
    /// @return the upcall stub
    static MemorySegment alloc(Arena arena, GLFWAllocateFun func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }

    /// The target method of the upcall.
    MemorySegment invoke(long size, MemorySegment user);

    /// The target method of the upcall. Chosen at runtime.
    default MemorySegment invokePIP(int size, MemorySegment user) {
        return invoke(MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, size), user);
    }

    /// The target method of the upcall. Chosen at runtime.
    default MemorySegment invokePJP(long size, MemorySegment user) {
        return invoke(MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, size), user);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

}

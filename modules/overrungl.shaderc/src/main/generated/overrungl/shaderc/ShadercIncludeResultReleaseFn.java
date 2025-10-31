// This file is auto-generated. DO NOT EDIT!
package overrungl.shaderc;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef void (*ShadercIncludeResultReleaseFn)(void* user_data, shaderc_include_result* include_result);
/// ```
@FunctionalInterface
public interface ShadercIncludeResultReleaseFn extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(ShadercIncludeResultReleaseFn.class, "invoke_", DESCRIPTOR);

    /// Allocates `ShadercIncludeResultReleaseFn`.
    /// @param arena the arena
    /// @param func  the function
    /// @return the upcall stub
    static MemorySegment alloc(Arena arena, ShadercIncludeResultReleaseFn func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }

    /// The target method of the upcall.
    void invoke(MemorySegment user_data, MemorySegment include_result);

    /// The target method of the upcall.
    default void invoke_(MemorySegment user_data, MemorySegment include_result) {
        invoke(user_data, include_result);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

}

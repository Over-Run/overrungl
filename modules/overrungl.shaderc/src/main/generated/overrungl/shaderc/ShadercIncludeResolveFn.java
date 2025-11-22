// This file is auto-generated. DO NOT EDIT!
package overrungl.shaderc;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef shaderc_include_result* (*ShadercIncludeResolveFn)(void* user_data, const char* requested_source, int type, const char* requesting_source, size_t include_depth);
/// ```
@FunctionalInterface
public interface ShadercIncludeResolveFn extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, CanonicalTypes.SIZE_T);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(ShadercIncludeResolveFn.class, RuntimeHelper.upcallTarget("invoke", DESCRIPTOR), DESCRIPTOR);

    /// Allocates `ShadercIncludeResolveFn`.
    /// @param arena the arena
    /// @param func  the function
    /// @return the upcall stub
    static MemorySegment alloc(Arena arena, ShadercIncludeResolveFn func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }

    /// The target method of the upcall.
    MemorySegment invoke(MemorySegment user_data, MemorySegment requested_source, int type, MemorySegment requesting_source, long include_depth);

    /// The target method of the upcall. Chosen at runtime.
    default MemorySegment invokeP(MemorySegment user_data, MemorySegment requested_source, int type, MemorySegment requesting_source, int include_depth) {
        return invoke(user_data, requested_source, type, requesting_source, MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, include_depth));
    }

    /// The target method of the upcall. Chosen at runtime.
    default MemorySegment invokeP(MemorySegment user_data, MemorySegment requested_source, int type, MemorySegment requesting_source, long include_depth) {
        return invoke(user_data, requested_source, type, requesting_source, MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, include_depth));
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

}

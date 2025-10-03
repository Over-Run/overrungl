// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vma;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef (uint32_t) VkBool32 (*VmaCheckDefragmentationBreakFunction)(void* pUserData);
/// ```
@FunctionalInterface
public interface VmaCheckDefragmentationBreakFunction extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(VmaCheckDefragmentationBreakFunction.class, "invoke_", DESCRIPTOR);

    /// Allocates `VmaCheckDefragmentationBreakFunction`.
    /// @param arena the arena
    /// @param func  the function
    /// @return the upcall stub
    static MemorySegment alloc(Arena arena, VmaCheckDefragmentationBreakFunction func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }

    /// The target method of the upcall.
    int invoke(MemorySegment pUserData);

    /// The target method of the upcall.
    default int invoke_(MemorySegment pUserData) {
        return invoke(pUserData);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

}

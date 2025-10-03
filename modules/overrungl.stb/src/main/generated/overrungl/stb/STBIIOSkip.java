// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.stb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef void (*STBIIOSkip)(void* user, int n);
/// ```
@FunctionalInterface
public interface STBIIOSkip extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(STBIIOSkip.class, "invoke_", DESCRIPTOR);

    /// Allocates `STBIIOSkip`.
    /// @param arena the arena
    /// @param func  the function
    /// @return the upcall stub
    static MemorySegment alloc(Arena arena, STBIIOSkip func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }

    /// The target method of the upcall.
    void invoke(MemorySegment user, int n);

    /// The target method of the upcall.
    default void invoke_(MemorySegment user, int n) {
        invoke(user, n);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

}

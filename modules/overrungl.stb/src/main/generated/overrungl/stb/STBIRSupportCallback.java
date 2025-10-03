// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.stb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef float (*STBIRSupportCallback)(float scale, void* user_data);
/// ```
@FunctionalInterface
public interface STBIRSupportCallback extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(STBIRSupportCallback.class, "invoke_", DESCRIPTOR);

    /// Allocates `STBIRSupportCallback`.
    /// @param arena the arena
    /// @param func  the function
    /// @return the upcall stub
    static MemorySegment alloc(Arena arena, STBIRSupportCallback func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }

    /// The target method of the upcall.
    float invoke(float scale, MemorySegment user_data);

    /// The target method of the upcall.
    default float invoke_(float scale, MemorySegment user_data) {
        return invoke(scale, user_data);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

}

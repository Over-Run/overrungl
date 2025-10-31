// This file is auto-generated. DO NOT EDIT!
package overrungl.stb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef void (*STBIROutputCallback)(void const * output_ptr, int num_pixels, int y, void* context);
/// ```
@FunctionalInterface
public interface STBIROutputCallback extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(STBIROutputCallback.class, "invoke_", DESCRIPTOR);

    /// Allocates `STBIROutputCallback`.
    /// @param arena the arena
    /// @param func  the function
    /// @return the upcall stub
    static MemorySegment alloc(Arena arena, STBIROutputCallback func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }

    /// The target method of the upcall.
    void invoke(MemorySegment output_ptr, int num_pixels, int y, MemorySegment context);

    /// The target method of the upcall.
    default void invoke_(MemorySegment output_ptr, int num_pixels, int y, MemorySegment context) {
        invoke(output_ptr, num_pixels, y, context);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

}

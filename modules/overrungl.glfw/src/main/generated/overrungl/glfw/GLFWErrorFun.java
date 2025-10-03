// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.glfw;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef void (*GLFWErrorFun)(int error_code, const char* description);
/// ```
@FunctionalInterface
public interface GLFWErrorFun extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(GLFWErrorFun.class, "invoke_", DESCRIPTOR);

    /// Allocates `GLFWErrorFun`.
    /// @param arena the arena
    /// @param func  the function
    /// @return the upcall stub
    static MemorySegment alloc(Arena arena, GLFWErrorFun func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }

    /// The target method of the upcall.
    void invoke(int error_code, MemorySegment description);

    /// The target method of the upcall.
    default void invoke_(int error_code, MemorySegment description) {
        invoke(error_code, description);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

}

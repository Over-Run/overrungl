// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.glfw;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef void (*GLFWWindowMaximizeFun)(GLFWwindow* window, (int) GLFWboolean maximized);
/// ```
@FunctionalInterface
public interface GLFWWindowMaximizeFun extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(GLFWWindowMaximizeFun.class, "invoke_", DESCRIPTOR);

    /// Allocates `GLFWWindowMaximizeFun`.
    /// @param arena the arena
    /// @param func  the function
    /// @return the upcall stub
    static MemorySegment alloc(Arena arena, GLFWWindowMaximizeFun func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }

    /// The target method of the upcall.
    void invoke(MemorySegment window, boolean maximized);

    /// The target method of the upcall.
    default void invoke_(MemorySegment window, int maximized) {
        invoke(window, ((maximized) != 0));
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

}

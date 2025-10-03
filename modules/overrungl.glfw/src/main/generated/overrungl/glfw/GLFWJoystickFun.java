// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.glfw;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef void (*GLFWJoystickFun)(int jid, int event);
/// ```
@FunctionalInterface
public interface GLFWJoystickFun extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(GLFWJoystickFun.class, "invoke_", DESCRIPTOR);

    /// Allocates `GLFWJoystickFun`.
    /// @param arena the arena
    /// @param func  the function
    /// @return the upcall stub
    static MemorySegment alloc(Arena arena, GLFWJoystickFun func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }

    /// The target method of the upcall.
    void invoke(int jid, int event);

    /// The target method of the upcall.
    default void invoke_(int jid, int event) {
        invoke(jid, event);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

}

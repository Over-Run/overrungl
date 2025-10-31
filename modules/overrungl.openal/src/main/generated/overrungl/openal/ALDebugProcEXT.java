// This file is auto-generated. DO NOT EDIT!
package overrungl.openal;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef void (*ALDebugProcEXT)((int) ALenum source, (int) ALenum type, (unsigned int) ALuint id, (int) ALenum severity, (int) ALsizei length, const ALchar* message, void* userParam);
/// ```
@FunctionalInterface
public interface ALDebugProcEXT extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(ALDebugProcEXT.class, "invoke_", DESCRIPTOR);

    /// Allocates `ALDebugProcEXT`.
    /// @param arena the arena
    /// @param func  the function
    /// @return the upcall stub
    static MemorySegment alloc(Arena arena, ALDebugProcEXT func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }

    /// The target method of the upcall.
    void invoke(int source, int type, int id, int severity, int length, MemorySegment message, MemorySegment userParam);

    /// The target method of the upcall.
    default void invoke_(int source, int type, int id, int severity, int length, MemorySegment message, MemorySegment userParam) {
        invoke(source, type, id, severity, length, message, userParam);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

}

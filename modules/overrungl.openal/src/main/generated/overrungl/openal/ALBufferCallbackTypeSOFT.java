// This file is auto-generated. DO NOT EDIT!
package overrungl.openal;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef (int) ALsizei (*ALBufferCallbackTypeSOFT)(ALvoid* userptr, ALvoid* sampledata, (int) ALsizei numbytes);
/// ```
@FunctionalInterface
public interface ALBufferCallbackTypeSOFT extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(ALBufferCallbackTypeSOFT.class, "invoke_", DESCRIPTOR);

    /// Allocates `ALBufferCallbackTypeSOFT`.
    /// @param arena the arena
    /// @param func  the function
    /// @return the upcall stub
    static MemorySegment alloc(Arena arena, ALBufferCallbackTypeSOFT func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }

    /// The target method of the upcall.
    int invoke(MemorySegment userptr, MemorySegment sampledata, int numbytes);

    /// The target method of the upcall.
    default int invoke_(MemorySegment userptr, MemorySegment sampledata, int numbytes) {
        return invoke(userptr, sampledata, numbytes);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

}

/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.openal;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// ```
/// typedef void (*ALCEventProcTypeSOFT)((int) ALCenum eventType, (int) ALCenum deviceType, ALCdevice* device, (int) ALCsizei length, const ALCchar* message, void* userParam);
/// ```
@FunctionalInterface
public interface ALCEventProcTypeSOFT extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(ALCEventProcTypeSOFT.class, "invoke_", DESCRIPTOR);

    /// Allocates `ALCEventProcTypeSOFT`.
    /// @param arena the arena
    /// @param func  the function
    /// @return the upcall stub
    static MemorySegment alloc(Arena arena, ALCEventProcTypeSOFT func) {
        if (func == null) return MemorySegment.NULL;
        return func.stub(arena);
    }

    /// The target method of the upcall.
    void invoke(int eventType, int deviceType, MemorySegment device, int length, MemorySegment message, MemorySegment userParam);

    /// The target method of the upcall.
    default void invoke_(int eventType, int deviceType, MemorySegment device, int length, MemorySegment message, MemorySegment userParam) {
        invoke(eventType, deviceType, device, length, message, userParam);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

}

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
package overrungl.openal;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.upcall.*;
import overrungl.util.*;

@FunctionalInterface
public interface ALCEventProcTypeSOFT extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(ALCEventProcTypeSOFT.class, "invoke", DESCRIPTOR);

    ///The target method of the upcall.
    void invoke(@CType("ALCenum") int eventType, @CType("ALCenum") int deviceType, @CType("ALCdevice *") java.lang.foreign.MemorySegment device, @CType("ALCsizei") int length, @CType("const ALCchar*") java.lang.foreign.MemorySegment message, @CType("void*") java.lang.foreign.MemorySegment userParam);

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

    ///A static invoker of the target method.
    ///@param stub the upcall stub
    static void invoke(MemorySegment stub, @CType("ALCenum") int eventType, @CType("ALCenum") int deviceType, @CType("ALCdevice *") java.lang.foreign.MemorySegment device, @CType("ALCsizei") int length, @CType("const ALCchar*") java.lang.foreign.MemorySegment message, @CType("void*") java.lang.foreign.MemorySegment userParam) {
        try { HANDLE.invokeExact(stub, eventType, deviceType, device, length, message, userParam); }
        catch (Throwable e) { throw new RuntimeException("error in ALCEventProcTypeSOFT::invoke (static invoker)", e); }
    }

    /// A wrapper for the target method.
    /// @param stub the upcall stub
    /// @return an instance that wraps the static invoker
    static ALCEventProcTypeSOFT wrap(MemorySegment stub) {
        return (eventType, deviceType, device, length, message, userParam) ->
            invoke(stub, eventType, deviceType, device, length, message, userParam);
    }
}

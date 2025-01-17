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
public interface ALDebugProcEXT extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, Unmarshal.STR_LAYOUT, ValueLayout.ADDRESS);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(ALDebugProcEXT.class, "invoke", DESCRIPTOR);

    /// The target method of the upcall.
    void invoke(@CType("ALenum") int source, @CType("ALenum") int type, @CType("ALuint") int id, @CType("ALenum") int severity, @CType("ALsizei") int length, @CType("const ALchar*") java.lang.foreign.MemorySegment message, @CType("void*") java.lang.foreign.MemorySegment userParam);

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

    /// A static invoker of the target method.
    /// @param stub the upcall stub
    static void invoke(MemorySegment stub, @CType("ALenum") int source, @CType("ALenum") int type, @CType("ALuint") int id, @CType("ALenum") int severity, @CType("ALsizei") int length, @CType("const ALchar*") java.lang.foreign.MemorySegment message, @CType("void*") java.lang.foreign.MemorySegment userParam) {
        try { HANDLE.invokeExact(stub, source, type, id, severity, length, message, userParam); }
        catch (Throwable e) { throw new RuntimeException("error in ALDebugProcEXT::invoke (static invoker)", e); }
    }

    /// A wrapper for the target method.
    /// @param stub the upcall stub
    /// @return an instance that wraps the static invoker
    static ALDebugProcEXT wrap(MemorySegment stub) {
        return (source, type, id, severity, length, message, userParam) ->
            invoke(stub, source, type, id, severity, length, message, userParam);
    }
}

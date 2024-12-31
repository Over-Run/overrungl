/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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
package overrungl.stb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// The skip callback
@FunctionalInterface
public interface STBIIOSkip extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(STBIIOSkip.class, "invoke", DESCRIPTOR);

    ///The target method of the upcall.
    ///
    ///skip the next 'n' bytes, or 'unget' the last -n bytes if negative
    void invoke(@CType("void*") java.lang.foreign.MemorySegment user, @CType("int") int n);

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

    ///A static invoker of the target method.
    ///
    ///skip the next 'n' bytes, or 'unget' the last -n bytes if negative
    ///@param stub the upcall stub
    static void invoke(MemorySegment stub, @CType("void*") java.lang.foreign.MemorySegment user, @CType("int") int n) {
        try { HANDLE.invokeExact(stub, user, n); }
        catch (Throwable e) { throw new RuntimeException("error in STBIIOSkip::invoke (static invoker)", e); }
    }

    /// A wrapper for the target method.
    /// @param stub the upcall stub
    /// @return an instance that wraps the static invoker
    static STBIIOSkip wrap(MemorySegment stub) {
        return (user, n) ->
            invoke(stub, user, n);
    }
}

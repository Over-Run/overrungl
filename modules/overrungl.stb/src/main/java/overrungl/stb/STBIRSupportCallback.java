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

/// callbacks for user installed filters
@FunctionalInterface
public interface STBIRSupportCallback extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(STBIRSupportCallback.class, "invoke", DESCRIPTOR);

    ///The target method of the upcall.
    @CType("float") float invoke(@CType("float") float scale, @CType("void*") java.lang.foreign.MemorySegment user_data);

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

    ///A static invoker of the target method.
    ///@param stub the upcall stub
    static @CType("float") float invoke(MemorySegment stub, @CType("float") float scale, @CType("void*") java.lang.foreign.MemorySegment user_data) {
        try { return (float) HANDLE.invokeExact(stub, scale, user_data); }
        catch (Throwable e) { throw new RuntimeException("error in STBIRSupportCallback::invoke (static invoker)", e); }
    }

    /// A wrapper for the target method.
    /// @param stub the upcall stub
    /// @return an instance that wraps the static invoker
    static STBIRSupportCallback wrap(MemorySegment stub) {
        return (scale, user_data) ->
            invoke(stub, scale, user_data);
    }
}

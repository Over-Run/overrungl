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
package overrungl.stb;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.upcall.*;
import overrungl.util.*;

@FunctionalInterface
public interface STBIWriteFunc extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(STBIWriteFunc.class, "invoke", DESCRIPTOR);

    ///The target method of the upcall.
    void invoke(@CType("void*") java.lang.foreign.MemorySegment context, @CType("void*") java.lang.foreign.MemorySegment data, @CType("int") int size);

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

    ///A static invoker of the target method.
    ///@param stub the upcall stub
    static void invoke(MemorySegment stub, @CType("void*") java.lang.foreign.MemorySegment context, @CType("void*") java.lang.foreign.MemorySegment data, @CType("int") int size) {
        try { HANDLE.invokeExact(stub, context, data, size); }
        catch (Throwable e) { throw new RuntimeException("error in STBIWriteFunc::invoke (static invoker)", e); }
    }

    /// A wrapper for the target method.
    /// @param stub the upcall stub
    /// @return an instance that wraps the static invoker
    static STBIWriteFunc wrap(MemorySegment stub) {
        return (context, data, size) ->
            invoke(stub, context, data, size);
    }
}

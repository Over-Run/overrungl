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
public interface STBIRInputCallback extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(STBIRInputCallback.class, "invoke", DESCRIPTOR);

    /// The target method of the upcall.
    @CType("void const *") MemorySegment invoke(@CType("void*") MemorySegment optional_output, @CType("void const *") MemorySegment input_ptr, @CType("int") int num_pixels, @CType("int") int x, @CType("int") int y, @CType("void*") MemorySegment context);

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

    /// A static invoker of the target method.
    /// @param stub the upcall stub
    static @CType("void const *") MemorySegment invoke(MemorySegment stub, @CType("void*") MemorySegment optional_output, @CType("void const *") MemorySegment input_ptr, @CType("int") int num_pixels, @CType("int") int x, @CType("int") int y, @CType("void*") MemorySegment context) {
        try { return (MemorySegment) HANDLE.invokeExact(stub, optional_output, input_ptr, num_pixels, x, y, context); }
        catch (Throwable e) { throw new RuntimeException("error in STBIRInputCallback::invoke (static invoker)", e); }
    }

    /// A wrapper for the target method.
    /// @param stub the upcall stub
    /// @return an instance that wraps the static invoker
    static STBIRInputCallback wrap(MemorySegment stub) {
        return (optional_output, input_ptr, num_pixels, x, y, context) ->
            invoke(stub, optional_output, input_ptr, num_pixels, x, y, context);
    }
}

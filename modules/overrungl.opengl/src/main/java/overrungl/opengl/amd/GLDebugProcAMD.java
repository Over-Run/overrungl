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
package overrungl.opengl.amd;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.upcall.*;
import overrungl.util.*;

@FunctionalInterface
public interface GLDebugProcAMD extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(GLDebugProcAMD.class, "invoke", DESCRIPTOR);

    /// The interface target method of the upcall.
    void invoke(@CType("GLuint") int id, @CType("GLenum") int category, @CType("GLenum") int severity, @CType("const GLchar *") java.lang.String message, @CType("void*") java.lang.foreign.MemorySegment userParam);

    /// The target method of the upcall.
    default void invoke(@CType("GLuint") int id, @CType("GLenum") int category, @CType("GLenum") int severity, @CType("GLsizei") int length, @CType("const GLchar *") java.lang.foreign.MemorySegment message, @CType("void*") java.lang.foreign.MemorySegment userParam) {
        invoke(id, category, severity, Unmarshal.unmarshalAsString(message), userParam);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

    /// A static invoker of the target method.
    /// @param stub the upcall stub
    static void invoke(MemorySegment stub, @CType("GLuint") int id, @CType("GLenum") int category, @CType("GLenum") int severity, @CType("GLsizei") int length, @CType("const GLchar *") java.lang.foreign.MemorySegment message, @CType("void*") java.lang.foreign.MemorySegment userParam) {
        try { HANDLE.invokeExact(stub, id, category, severity, length, message, userParam); }
        catch (Throwable e) { throw new RuntimeException("error in GLDebugProcAMD::invoke (static invoker)", e); }
    }

    /// A wrapper for the target method.
    /// @param stub the upcall stub
    /// @return an instance that wraps the static invoker
    static GLDebugProcAMD wrap(MemorySegment stub) {
        return (id, category, severity, message, userParam) -> { try (var stack = MemoryStack.pushLocal()) {
            var seg = Marshal.marshal(stack, message);
            invoke(stub, id, category, severity, Math.toIntExact(seg.byteSize()), seg, userParam);
        } };
    }
}

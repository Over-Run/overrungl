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
package overrungl.glfw;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.internal.*;
import overrungl.upcall.*;
import overrungl.util.*;

/// Signature
/// ```
/// typedef void (*GLFWScrollFun)(GLFWwindow* window, double xoffset, double yoffset);
/// ```
@FunctionalInterface
public interface GLFWScrollFun extends Upcall {
    /// The function descriptor.
    FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE);
    /// The method handle of the target method.
    MethodHandle HANDLE = Upcall.findTarget(GLFWScrollFun.class, "invoke_", DESCRIPTOR);

    /// Allocates `GLFWScrollFun`.
    /// @param arena the arena
    /// @param func  the function
    /// @return the upcall stub
    static MemorySegment alloc(Arena arena, GLFWScrollFun func) { return func.stub(arena); }

    /// The target method of the upcall.
    void invoke(MemorySegment window, double xoffset, double yoffset);

    /// The target method of the upcall.
    default void invoke_(MemorySegment window, double xoffset, double yoffset) {
        invoke(window, xoffset, yoffset);
    }

    @Override
    default MemorySegment stub(Arena arena) { return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, arena); }

}

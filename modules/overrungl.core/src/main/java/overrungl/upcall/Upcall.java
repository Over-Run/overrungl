/*
 * MIT License
 *
 * Copyright (c) 2024 Overrun Organization
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

package overrungl.upcall;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

/// An interface that represents an upcall i.e. codes to be invoked from native libraries.
///
/// The target method must **NOT** throw any exception, otherwise the JVM might crash.
///
/// Subclasses usually include an invoker method and a wrapper method
/// to conveniently convert an upcall stub to a Java instance.
///
/// It is recommended that subclasses be annotated as [FunctionalInterface] to indicate users to use lambda expressions.
///
/// @author squid233
/// @since 0.1.0
public interface Upcall {
    /// Creates an upcall stub associated with the given arena
    /// using [Linker::upcallStub][Linker#upcallStub(MethodHandle, FunctionDescriptor, Arena, Linker.Option...)].
    ///
    /// @param arena the arena to be associated with the upcall stub
    /// @return a zero-length segment whose address is the address of the upcall stub
    MemorySegment stub(Arena arena);

    /// Finds the target method specified with the given function descriptor.
    ///
    /// @param c          the class where the target method is
    /// @param name       the name of the target method
    /// @param descriptor the function descriptor of the target method
    /// @return the method handle of the target method
    static MethodHandle findTarget(Class<?> c, String name, FunctionDescriptor descriptor) {
        try {
            return MethodHandles.publicLookup().findVirtual(c, name, descriptor.toMethodType());
        } catch (NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException("Couldn't access method " + name + " with descriptor " + descriptor, e);
        }
    }
}

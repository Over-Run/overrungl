/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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

package overrungl;

import overrungl.internal.RuntimeHelper;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.function.Function;

/**
 * The upcall stub which can be passed to other foreign functions as a function pointer,
 * with the given arena.
 *
 * @author squid233
 * @since 0.1.0
 */
@Deprecated(since = "0.1.0")
public interface Callback {
    /**
     * Gets the address with the given arena.
     *
     * @param arena the arena.
     * @return the memory address.
     */
    default MemorySegment address(Arena arena) {
        return segment(arena, descriptor());
    }

    /**
     * {@return the function descriptor of this callback}
     */
    FunctionDescriptor descriptor();

    /**
     * Finds the method handle from the given method handles lookup.
     *
     * @param lookup the lookup
     * @return the method handle
     * @throws NoSuchMethodException  if the method does not exist
     * @throws IllegalAccessException if access checking fails, or if the method is {@code static}, or if the method's
     *                                variable arity modifier bit is set and {@code asVarargsCollector} fails
     */
    MethodHandle handle(MethodHandles.Lookup lookup) throws NoSuchMethodException, IllegalAccessException;

    /**
     * Creates a method handle that invokes a native function callback.
     *
     * @param segment the segment of the native function.
     * @return the method handle
     */
    default MethodHandle nativeHandle(MemorySegment segment) {
        return RuntimeHelper.LINKER.downcallHandle(segment, descriptor());
    }

    /**
     * Gets the memory segment of the upcall stub with the given arena.
     *
     * @param arena    the arena.
     * @param function the function descriptor.
     * @return the memory segment.
     */
    default MemorySegment segment(Arena arena, FunctionDescriptor function) {
        try {
            return RuntimeHelper.LINKER.upcallStub(handle(MethodHandles.publicLookup()).bindTo(this), function, arena);
        } catch (NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Method handle getter.
     *
     * @author squid233
     * @since 0.1.0
     */
    interface Native<T> extends Function<MemorySegment, T> {
    }
}

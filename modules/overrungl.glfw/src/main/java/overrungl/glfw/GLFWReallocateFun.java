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

package overrungl.glfw;

import overrun.marshal.Upcall;
import overrungl.util.MemoryUtil;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

/**
 * The function pointer type for memory reallocation callbacks.
 * <p>
 * This is the function pointer type for memory reallocation callbacks.
 * A memory reallocation callback function has the following signature:
 * {@snippet lang = java:
 * MemorySegment functionName(MemorySegment block, long size, MemorySegment user); // @link regex="functionName" target="#invoke"
 * }
 *
 * @author squid233
 * @see GLFWAllocator
 * @since 0.1.0
 */
@FunctionalInterface
public interface GLFWReallocateFun extends Upcall {
    /**
     * The type of the upcall.
     */
    Type<GLFWReallocateFun> TYPE = Upcall.type("invoke", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS));

    /**
     * This function must return a memory block at least {@code size} bytes long, or
     * {@link MemorySegment#NULL} if allocation failed.  Note that not all parts of GLFW handle allocation
     * failures gracefully yet.
     * <p>
     * This function must support being called during {@link GLFW#init} but before the library is
     * flagged as initialized, as well as during {@link GLFW#terminate} after the library is no
     * longer flagged as initialized.
     * <p>
     * Any memory allocated via this function will be deallocated via the same allocator
     * during library termination or earlier.
     * <p>
     * Any memory allocated via this function must be suitably aligned for any object type.
     * If you are using C99 or earlier, this alignment is platform-dependent but will be the
     * same as what {@link MemoryUtil#realloc} provides.  If you are using C11 or later, this is the value of
     * {@code alignof(max_align_t)}.
     * <p>
     * The block address will never be {@code NULL} and the size will always be greater than zero.
     * Reallocations of a block to size zero are converted into deallocations before reaching
     * the custom allocator.  Reallocations of {@code NULL} to a non-zero size are converted into
     * regular allocations before reaching the custom allocator.
     * <p>
     * If this function returns {@link MemorySegment#NULL}, GLFW will emit {@link GLFW#OUT_OF_MEMORY}.
     * <p>
     * This function must not call any GLFW function.
     *
     * @param block The address of the memory block to reallocate.
     * @param size  The new minimum size, in bytes, of the memory block.
     * @param user  The user-defined pointer from the allocator.
     * @return The address of the newly allocated or resized memory block, or
     * {@link MemorySegment#NULL} if an error occurred.
     * @glfw.pointer_lifetime The returned memory block must be valid at least until it
     * is deallocated.
     * @glfw.reentrancy This function should not call any GLFW function.
     * @glfw.thread_safety This function must support being called from any thread that calls GLFW
     * functions.
     */
    MemorySegment invoke(MemorySegment block, long size, MemorySegment user);

    /**
     * Downcall version of {@link #invoke(MemorySegment, long, MemorySegment)}
     *
     * @param stub  the upcall stub
     * @param block The address of the memory block to reallocate.
     * @param size  The new minimum size, in bytes, of the memory block.
     * @param user  The user-defined pointer from the allocator.
     * @return The address of the newly allocated or resized memory block, or
     * {@link MemorySegment#NULL} if an error occurred.
     */
    static MemorySegment invoke(MemorySegment stub, MemorySegment block, long size, MemorySegment user) {
        try {
            return (MemorySegment) TYPE.downcallTarget().invokeExact(stub, block, size, user);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Wraps the given upcall stub to this function.
     *
     * @param stub the upcall stub
     * @return the function instance
     */
    static GLFWReallocateFun wrap(MemorySegment stub) {
        return (block, size, user) -> invoke(stub, block, size, user);
    }

    @Override
    default MemorySegment stub(Arena arena) {
        return TYPE.of(arena, this);
    }
}

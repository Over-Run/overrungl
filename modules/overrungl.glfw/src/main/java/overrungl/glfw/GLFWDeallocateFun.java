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

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

/**
 * The function pointer type for memory deallocation callbacks.
 * <p>
 * This is the function pointer type for memory deallocation callbacks.
 * A memory deallocation callback function has the following signature:
 * {@snippet lang = java:
 * void functionName(MemorySegment block, MemorySegment user); // @link regex="functionName" target="#invoke"
 * }
 *
 * @author squid233
 * @see GLFWAllocator
 * @since 0.1.0
 */
@FunctionalInterface
public interface GLFWDeallocateFun extends Upcall {
    /**
     * The type of the upcall.
     */
    Type<GLFWDeallocateFun> TYPE = Upcall.type("invoke", FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS));

    /**
     * This function may deallocate the specified memory block.  This memory block
     * will have been allocated with the same allocator.
     * <p>
     * This function must support being called during {@link GLFW#init} but before the library is
     * flagged as initialized, as well as during {@link GLFW#terminate} after the library is no
     * longer flagged as initialized.
     * <p>
     * The block address will never be {@link MemorySegment#NULL}.  Deallocations of {@link MemorySegment#NULL} are filtered out
     * before reaching the custom allocator.
     * <p>
     * If this function returns {@link MemorySegment#NULL}, GLFW will emit {@link GLFW#OUT_OF_MEMORY}.
     * <p>
     * This function must not call any GLFW function.
     *
     * @param block The address of the memory block to deallocate.
     * @param user  The user-defined pointer from the allocator.
     * @glfw.pointer_lifetime The specified memory block will not be accessed by GLFW
     * after this function is called.
     * @glfw.reentrancy This function should not call any GLFW function.
     * @glfw.thread_safety This function must support being called from any thread that calls GLFW
     * functions.
     */
    void invoke(MemorySegment block, MemorySegment user);

    /**
     * Downcall version of {@link #invoke(MemorySegment, MemorySegment)}
     *
     * @param stub  the upcall stub
     * @param block The address of the memory block to deallocate.
     * @param user  The user-defined pointer from the allocator.
     */
    static void invoke(MemorySegment stub, MemorySegment block, MemorySegment user) {
        try {
            TYPE.downcallTarget().invokeExact(stub, block, user);
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
    static GLFWDeallocateFun wrap(MemorySegment stub) {
        return (block, user) -> invoke(stub, block, user);
    }

    @Override
    default MemorySegment stub(Arena arena) {
        return TYPE.of(arena, this);
    }
}

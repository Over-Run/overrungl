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

import overrun.marshal.LayoutBuilder;
import overrun.marshal.Marshal;
import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructAllocator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandles;

/**
 * Custom heap memory allocator.
 * <p>
 * This describes a custom heap memory allocator for GLFW.  To set an allocator, pass it
 * to {@link GLFW#initAllocator} before initializing the library.
 *
 * @author squid233
 * @see GLFW#initAllocator
 * @since 0.1.0
 */
public interface GLFWAllocator extends Struct<GLFWAllocator> {
    /**
     * The allocator
     */
    StructAllocator<GLFWAllocator> OF = new StructAllocator<>(
        MethodHandles.lookup(),
        LayoutBuilder.struct()
            .cAddress("allocate")
            .cAddress("reallocate")
            .cAddress("deallocate")
            .cAddress("user")
            .build()
    );

    /**
     * {@return the memory allocation function}
     * See {@link GLFWAllocateFun} for details about allocation function.
     */
    MemorySegment allocate();

    /**
     * Sets {@link #allocate()}.
     *
     * @param val the value
     * @return this
     */
    GLFWAllocator allocate(MemorySegment val);

    /**
     * {@return the memory reallocation function}
     * See {@link GLFWReallocateFun} for details about reallocation function.
     */
    MemorySegment reallocate();

    /**
     * Sets {@link #reallocate()}.
     *
     * @param val the value
     * @return this
     */
    GLFWAllocator reallocate(MemorySegment val);

    /**
     * {@return the memory deallocation function}
     * See {@link GLFWDeallocateFun} for details about deallocation function.
     */
    MemorySegment deallocate();

    /**
     * Sets {@link #deallocate()}.
     *
     * @param val the value
     * @return this
     */
    GLFWAllocator deallocate(MemorySegment val);

    /**
     * {@return the user pointer for this custom allocator}
     * This value will be passed to the allocator functions.
     */
    MemorySegment user();

    /**
     * Sets {@link #user()}.
     *
     * @param val the value
     * @return this
     */
    GLFWAllocator user(MemorySegment val);

    /**
     * {@return {@link #allocate()}}
     */
    default GLFWAllocateFun javaAllocate() {
        return GLFWAllocateFun.wrap(allocate());
    }

    /**
     * Sets {@link #allocate()}.
     *
     * @param arena the arena
     * @param val   the value
     * @return this
     */
    default GLFWAllocator javaAllocate(Arena arena, GLFWAllocateFun val) {
        return allocate(Marshal.marshal(arena, val));
    }

    /**
     * {@return {@link #reallocate()}}
     */
    default GLFWReallocateFun javaReallocate() {
        return GLFWReallocateFun.wrap(reallocate());
    }

    /**
     * Sets {@link #reallocate()}.
     *
     * @param arena the arena
     * @param val   the value
     * @return this
     */
    default GLFWAllocator javaReallocate(Arena arena, GLFWReallocateFun val) {
        return reallocate(Marshal.marshal(arena, val));
    }

    /**
     * {@return {@link #deallocate()}}
     */
    default GLFWDeallocateFun javaDeallocate() {
        return GLFWDeallocateFun.wrap(deallocate());
    }

    /**
     * Sets {@link #deallocate()}.
     *
     * @param arena the arena
     * @param val   the value
     * @return this
     */
    default GLFWAllocator javaDeallocate(Arena arena, GLFWDeallocateFun val) {
        return deallocate(Marshal.marshal(arena, val));
    }
}

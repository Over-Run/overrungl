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

import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructHandle;

import java.lang.foreign.*;

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
public final class GLFWAllocator extends Struct {
    /**
     * The layout of this struct.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        ValueLayout.ADDRESS.withName("allocate"),
        ValueLayout.ADDRESS.withName("reallocate"),
        ValueLayout.ADDRESS.withName("deallocate"),
        ValueLayout.ADDRESS.withName("user")
    );
    /**
     * The memory allocation function.  See {@link GLFWAllocateFun} for details about
     * allocation function.
     */
    public static final StructHandle.Upcall<GLFWAllocateFun> allocate = StructHandle.ofUpcall(LAYOUT, "allocate", GLFWAllocateFun::wrap);
    /**
     * The memory reallocation function.  See {@link GLFWReallocateFun} for details about
     * reallocation function.
     */
    public static final StructHandle.Upcall<GLFWReallocateFun> reallocate = StructHandle.ofUpcall(LAYOUT, "reallocate", GLFWReallocateFun::wrap);
    /**
     * The memory deallocation function.  See {@link GLFWDeallocateFun} for details about
     * deallocation function.
     */
    public static final StructHandle.Upcall<GLFWDeallocateFun> deallocate = StructHandle.ofUpcall(LAYOUT, "deallocate", GLFWDeallocateFun::wrap);
    /**
     * The user pointer for this custom allocator.  This value will be passed to the
     * allocator functions.
     */
    public static final StructHandle.Address user = StructHandle.ofAddress(LAYOUT, "user");

    /**
     * Creates a struct with the given layout.
     *
     * @param segment      the segment
     * @param elementCount the element count
     */
    public GLFWAllocator(MemorySegment segment, long elementCount) {
        super(segment, elementCount, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator    the allocator
     * @param elementCount the element count
     */
    public GLFWAllocator(SegmentAllocator allocator, long elementCount) {
        super(allocator, elementCount, LAYOUT);
    }

    /**
     * Creates a struct with the given layout.
     *
     * @param segment the segment
     */
    public GLFWAllocator(MemorySegment segment) {
        super(segment, LAYOUT);
    }

    /**
     * Allocates a struct with the given layout.
     *
     * @param allocator the allocator
     */
    public GLFWAllocator(SegmentAllocator allocator) {
        super(allocator, LAYOUT);
    }
}

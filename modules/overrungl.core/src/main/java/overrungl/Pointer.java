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

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

/**
 * A {@link MemorySegment} wrapper with a segment allocator.
 *
 * @author squid233
 * @since 0.1.0
 */
public class Pointer implements Addressable {
    /**
     * The pointer address.
     */
    protected final MemorySegment address;
    /**
     * The allocator of this pointer.
     */
    protected final SegmentAllocator allocator;
    /**
     * The managed native segment that is not zero-length.
     * <p>
     * This field is not modified with {@code final} since the layout might be null in construction.
     */
    protected MemorySegment managedSegment;

    /**
     * Create the pointer instance.
     *
     * @param address   the address.
     * @param allocator the allocator of this address.
     */
    public Pointer(MemorySegment address, SegmentAllocator allocator) {
        this.address = address;
        this.allocator = allocator;
    }

    @Override
    public MemorySegment address() {
        return address;
    }

    /**
     * {@return the allocator of this pointer}
     */
    public SegmentAllocator allocator() {
        return allocator;
    }

    /**
     * Gets the native segment of this pointer, or creates a new one if the segment of this pointer is zero-length.
     *
     * @param byteSize the byte size of the segment.
     * @return the memory segment.
     * @see #segment(MemoryLayout)
     */
    public MemorySegment segment(long byteSize) {
        if (managedSegment == null) {
            managedSegment = address().reinterpret(byteSize);
        }
        return managedSegment;
    }

    /**
     * Gets the native segment of this pointer, or creates a new one if the segment of this pointer is zero-length.
     *
     * @param layout the memory layout of the segment.
     * @return the memory segment.
     * @see #segment(long)
     */
    public MemorySegment segment(MemoryLayout layout) {
        return segment(layout.byteSize());
    }
}

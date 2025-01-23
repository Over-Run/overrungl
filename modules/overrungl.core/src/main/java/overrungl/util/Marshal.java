/*
 * MIT License
 *
 * Copyright (c) 2024-2025 Overrun Organization
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

package overrungl.util;

import org.jetbrains.annotations.Nullable;
import overrungl.upcall.Upcall;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.nio.charset.Charset;

import static java.lang.foreign.ValueLayout.*;

/**
 * Java-to-C helper.
 *
 * @author squid233
 * @since 0.1.0
 */
@Deprecated
public final class Marshal {
    private Marshal() {
    }

    /**
     * Converts the given string to a segment.
     *
     * @param allocator the allocator
     * @param string    the string
     * @return the segment
     */
    public static MemorySegment marshal(SegmentAllocator allocator, @Nullable String string) {
        if (string == null) return MemorySegment.NULL;
        return allocator.allocateFrom(string);
    }

    /**
     * Converts the given string to a segment.
     *
     * @param allocator the allocator
     * @param string    the string
     * @param charset   the charset
     * @return the segment
     */
    public static MemorySegment marshal(SegmentAllocator allocator, @Nullable String string, Charset charset) {
        if (string == null) return MemorySegment.NULL;
        return allocator.allocateFrom(string, charset);
    }

    /**
     * Converts the given addressable object to a segment.
     *
     * @param addressable the addressable object
     * @return the segment
     */
    public static MemorySegment marshal(@Nullable Addressable addressable) {
        if (addressable == null) return MemorySegment.NULL;
        return addressable.segment();
    }

    /**
     * Converts the given upcall to a segment.
     *
     * @param arena  the arena
     * @param upcall the upcall
     * @return the segment
     */
    public static MemorySegment marshal(Arena arena, @Nullable Upcall upcall) {
        if (upcall == null) return MemorySegment.NULL;
        return upcall.stub(arena);
    }

    /**
     * Converts the given array to a segment.
     *
     * @param allocator the allocator
     * @param arr       the array
     * @return the segment
     */
    public static MemorySegment marshal(SegmentAllocator allocator, byte @Nullable [] arr) {
        if (arr == null) return MemorySegment.NULL;
        return allocator.allocateFrom(JAVA_BYTE, arr);
    }

    /**
     * Converts the given array to a segment.
     *
     * @param allocator the allocator
     * @param arr       the array
     * @return the segment
     */
    public static MemorySegment marshal(SegmentAllocator allocator, int @Nullable [] arr) {
        if (arr == null) return MemorySegment.NULL;
        return allocator.allocateFrom(JAVA_INT, arr);
    }

    /**
     * Converts the given array to a segment.
     *
     * @param allocator the allocator
     * @param arr       the array
     * @return the segment
     */
    public static MemorySegment marshal(SegmentAllocator allocator, float @Nullable [] arr) {
        if (arr == null) return MemorySegment.NULL;
        return allocator.allocateFrom(JAVA_FLOAT, arr);
    }

    /**
     * Converts the given array to a segment.
     *
     * @param allocator the allocator
     * @param arr       the array
     * @return the segment
     */
    public static MemorySegment marshal(SegmentAllocator allocator, double @Nullable [] arr) {
        if (arr == null) return MemorySegment.NULL;
        return allocator.allocateFrom(JAVA_DOUBLE, arr);
    }
}

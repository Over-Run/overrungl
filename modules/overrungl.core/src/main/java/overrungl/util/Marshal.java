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

package overrungl.util;

import org.jetbrains.annotations.Nullable;
import overrungl.struct.Struct;
import overrungl.upcall.Upcall;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static java.lang.foreign.ValueLayout.*;

/**
 * Java-to-C helper.
 *
 * @author squid233
 * @since 0.1.0
 */
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
     * Converts the given struct to a segment.
     *
     * @param struct the struct
     * @return the segment
     */
    public static MemorySegment marshal(@Nullable Struct struct) {
        if (struct == null) return MemorySegment.NULL;
        return struct.segment();
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
    public static MemorySegment marshal(SegmentAllocator allocator, char @Nullable [] arr) {
        if (arr == null) return MemorySegment.NULL;
        return allocator.allocateFrom(JAVA_CHAR, arr);
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
    public static MemorySegment marshal(SegmentAllocator allocator, short @Nullable [] arr) {
        if (arr == null) return MemorySegment.NULL;
        return allocator.allocateFrom(JAVA_SHORT, arr);
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
    public static MemorySegment marshal(SegmentAllocator allocator, long @Nullable [] arr) {
        if (arr == null) return MemorySegment.NULL;
        return allocator.allocateFrom(JAVA_LONG, arr);
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

    /**
     * Converts the given array to a segment.
     *
     * @param allocator the allocator
     * @param arr       the array
     * @return the segment
     */
    public static MemorySegment marshal(SegmentAllocator allocator, String @Nullable [] arr) {
        return marshal(allocator, arr, StandardCharsets.UTF_8);
    }

    /**
     * Converts the given array to a segment.
     *
     * @param allocator the allocator
     * @param arr       the array
     * @param charset   the charset
     * @return the segment
     */
    public static MemorySegment marshal(SegmentAllocator allocator, String @Nullable [] arr, Charset charset) {
        if (arr == null) return MemorySegment.NULL;
        MemorySegment segment = allocator.allocate(ADDRESS, arr.length);
        for (int i = 0; i < arr.length; i++) {
            segment.setAtIndex(ADDRESS, i, marshal(allocator, arr[i], charset));
        }
        return segment;
    }

    /**
     * Converts the given array to a segment.
     *
     * @param allocator the allocator
     * @param arr       the array
     * @return the segment
     */
    public static MemorySegment marshal(SegmentAllocator allocator, MemorySegment @Nullable [] arr) {
        if (arr == null) return MemorySegment.NULL;
        MemorySegment segment = allocator.allocate(ADDRESS, arr.length);
        for (int i = 0; i < arr.length; i++) {
            segment.setAtIndex(ADDRESS, i, arr[i]);
        }
        return segment;
    }
}

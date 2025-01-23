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

package overrungl.test;

import org.junit.jupiter.api.Test;
import overrungl.util.MemoryUtil;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static overrungl.test.Util.TEST_STRING_U8;

/**
 * @author squid233
 * @since 0.1.0
 */
public class MemoryUtilTest {
    @Test
    void test_malloc() {
        MemorySegment segment = MemoryUtil.malloc(ValueLayout.JAVA_INT);
        segment.set(ValueLayout.JAVA_INT, 0L, 42);
        assertEquals(42, segment.get(ValueLayout.JAVA_INT, 0L));
        MemoryUtil.free(segment);
    }

    @Test
    void test_calloc() {
        MemorySegment segment = MemoryUtil.calloc(1, ValueLayout.JAVA_INT);
        assertEquals(0, segment.get(ValueLayout.JAVA_INT, 0L));
        segment.set(ValueLayout.JAVA_INT, 0L, 42);
        assertEquals(42, segment.get(ValueLayout.JAVA_INT, 0L));
        MemoryUtil.free(segment);
    }

    @Test
    void test_realloc() {
        MemorySegment segment = MemoryUtil.calloc(1, ValueLayout.JAVA_INT);
        assertEquals(4L, segment.byteSize());
        segment = MemoryUtil.realloc(segment, ValueLayout.JAVA_INT.scale(0L, 2L));
        assertEquals(8L, segment.byteSize());
        MemoryUtil.free(segment);
    }

    @Test
    void test_allocator() {
        MemorySegment.Scope scope;
        try (Arena arena = Arena.ofConfined()) {
            SegmentAllocator allocator = MemoryUtil.allocator(arena);
            MemorySegment segment = allocator.allocate(ValueLayout.JAVA_INT);
            scope = segment.scope();

            assertEquals(0, segment.get(ValueLayout.JAVA_INT, 0L));
            segment.set(ValueLayout.JAVA_INT, 0L, 42);
            assertEquals(42, segment.get(ValueLayout.JAVA_INT, 0L));
        }
        assertFalse(scope.isAlive());
    }

    @Test
    void nativeString() {
        try (Arena arena = Arena.ofConfined()) {
            MemorySegment segment = arena.allocateFrom(TEST_STRING_U8);
            assertEquals(TEST_STRING_U8, MemoryUtil.nativeString(segment));
        }
    }
}

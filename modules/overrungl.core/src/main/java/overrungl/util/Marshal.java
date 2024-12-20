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

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.nio.charset.Charset;

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
}

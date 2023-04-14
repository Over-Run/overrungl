/*
 * MIT License
 *
 * Copyright (c) 2023 Overrun Organization
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

package org.overrun.glib.util;

import org.overrun.glib.RuntimeHelper;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * A custom arena.
 *
 * @author squid233
 * @since 0.1.0
 */
public interface CustomArena extends SegmentAllocator, AutoCloseable {
    @Override
    MemorySegment allocate(long byteSize, long byteAlignment);

    /**
     * Reallocates a memory segment.
     *
     * @param segment  the memory segment.
     * @param byteSize the new byte size.
     * @return <i>{@code segment}</i> if <i>{@code byteSize}</i> is 0; or the new memory segment.
     */
    MemorySegment reallocate(MemorySegment segment, long byteSize);

    @Override
    void close();

    /**
     * Creates a custom arena with {@link MemoryUtil}.
     *
     * @return the custom arena.
     */
    static CustomArena standard() {
        return new CustomArena() {
            private final List<MemorySegment> segments = Collections.synchronizedList(new ArrayList<>());

            @Override
            public MemorySegment allocate(long byteSize, long byteAlignment) {
                RuntimeHelper.checkByteSize(byteSize);
                RuntimeHelper.checkAlignment(byteAlignment);
                final MemorySegment segment = MemoryUtil.calloc(1, byteSize);
                segments.add(segment);
                return segment;
            }

            @Override
            public MemorySegment reallocate(MemorySegment segment, long byteSize) {
                final MemorySegment realloc = MemoryUtil.realloc(segment, byteSize);
                if (segment != null && segments.remove(segment)) {
                    segments.add(realloc);
                }
                return realloc;
            }

            @Override
            public void close() {
                segments.forEach(MemoryUtil::free);
                segments.clear();
            }
        };
    }

    /**
     * Creates a custom arena delegated by the given allocator.
     * <p>
     * If <i>{@code allocator}</i> is {@link AutoCloseable}, the segments are auto-released after {@link #close()}.
     *
     * @param allocator the memory segment allocator e.g. {@link java.lang.foreign.Arena Arena}.
     * @return the custom arena.
     */
    static CustomArena delegated(SegmentAllocator allocator) {
        Objects.requireNonNull(allocator);
        return new CustomArena() {
            @Override
            public MemorySegment allocate(long byteSize, long byteAlignment) {
                return allocator.allocate(byteSize, byteAlignment);
            }

            @Override
            public MemorySegment reallocate(MemorySegment segment, long byteSize) {
                if (RuntimeHelper.isNullptr(segment)) return allocate(byteSize);
                if (byteSize == 0) return segment;
                final MemorySegment seg = allocator.allocate(byteSize);
                MemorySegment.copy(segment, 0, seg, 0, Math.min(byteSize, segment.byteSize()));
                return seg;
            }

            @Override
            public void close() {
                if (allocator instanceof AutoCloseable closeable) {
                    try {
                        closeable.close();
                    } catch (Exception e) {
                        throw new IllegalStateException("Failed to close the custom arena", e);
                    }
                }
            }
        };
    }
}

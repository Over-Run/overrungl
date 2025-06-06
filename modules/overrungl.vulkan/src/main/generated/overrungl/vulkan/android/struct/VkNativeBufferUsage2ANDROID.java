/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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

// This file is auto-generated. DO NOT EDIT!
//@formatter:off
package overrungl.vulkan.android.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkNativeBufferUsage2ANDROID {
///     uint64_t consumer;
///     uint64_t producer;
/// };
/// ```
public sealed class VkNativeBufferUsage2ANDROID extends GroupType {
    /// The struct layout of `VkNativeBufferUsage2ANDROID`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("consumer"),
        ValueLayout.JAVA_LONG.withName("producer")
    );
    /// The byte offset of `consumer`.
    public static final long OFFSET_consumer = LAYOUT.byteOffset(PathElement.groupElement("consumer"));
    /// The memory layout of `consumer`.
    public static final MemoryLayout LAYOUT_consumer = LAYOUT.select(PathElement.groupElement("consumer"));
    /// The [VarHandle] of `consumer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_consumer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("consumer"));
    /// The byte offset of `producer`.
    public static final long OFFSET_producer = LAYOUT.byteOffset(PathElement.groupElement("producer"));
    /// The memory layout of `producer`.
    public static final MemoryLayout LAYOUT_producer = LAYOUT.select(PathElement.groupElement("producer"));
    /// The [VarHandle] of `producer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_producer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("producer"));

    /// Creates `VkNativeBufferUsage2ANDROID` with the given segment.
    /// @param segment the memory segment
    public VkNativeBufferUsage2ANDROID(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkNativeBufferUsage2ANDROID` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkNativeBufferUsage2ANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkNativeBufferUsage2ANDROID ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkNativeBufferUsage2ANDROID(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkNativeBufferUsage2ANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkNativeBufferUsage2ANDROID` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkNativeBufferUsage2ANDROID`
    public static VkNativeBufferUsage2ANDROID alloc(SegmentAllocator allocator) { return new VkNativeBufferUsage2ANDROID(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkNativeBufferUsage2ANDROID` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkNativeBufferUsage2ANDROID`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkNativeBufferUsage2ANDROID` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param consumer `consumer`
    /// @param producer `producer`
    /// @return the allocated `VkNativeBufferUsage2ANDROID`
    public static VkNativeBufferUsage2ANDROID allocInit(SegmentAllocator allocator, long consumer, long producer) {
        return alloc(allocator).consumer(consumer).producer(producer);
    }

    /// Allocates a `VkNativeBufferUsage2ANDROID` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param consumer `consumer`
    /// @return the allocated `VkNativeBufferUsage2ANDROID`
    public static VkNativeBufferUsage2ANDROID allocInit(SegmentAllocator allocator, long consumer) {
        return alloc(allocator).consumer(consumer);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkNativeBufferUsage2ANDROID copyFrom(VkNativeBufferUsage2ANDROID src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `consumer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long consumer(MemorySegment segment, long index) { return (long) VH_consumer.get(segment, 0L, index); }
    /// {@return `consumer`}
    public long consumer() { return consumer(this.segment(), 0L); }
    /// Sets `consumer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void consumer(MemorySegment segment, long index, long value) { VH_consumer.set(segment, 0L, index, value); }
    /// Sets `consumer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkNativeBufferUsage2ANDROID consumer(long value) { consumer(this.segment(), 0L, value); return this; }

    /// {@return `producer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long producer(MemorySegment segment, long index) { return (long) VH_producer.get(segment, 0L, index); }
    /// {@return `producer`}
    public long producer() { return producer(this.segment(), 0L); }
    /// Sets `producer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void producer(MemorySegment segment, long index, long value) { VH_producer.set(segment, 0L, index, value); }
    /// Sets `producer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkNativeBufferUsage2ANDROID producer(long value) { producer(this.segment(), 0L, value); return this; }

    /// A buffer of [VkNativeBufferUsage2ANDROID].
    public static final class Buffer extends VkNativeBufferUsage2ANDROID {
        private final long elementCount;

        /// Creates `VkNativeBufferUsage2ANDROID.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkNativeBufferUsage2ANDROID`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkNativeBufferUsage2ANDROID`
        public VkNativeBufferUsage2ANDROID asSlice(long index) { return new VkNativeBufferUsage2ANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkNativeBufferUsage2ANDROID`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkNativeBufferUsage2ANDROID`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `consumer` at the given index}
        /// @param index the index of the struct buffer
        public long consumerAt(long index) { return consumer(this.segment(), index); }
        /// Sets `consumer` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer consumerAt(long index, long value) { consumer(this.segment(), index, value); return this; }

        /// {@return `producer` at the given index}
        /// @param index the index of the struct buffer
        public long producerAt(long index) { return producer(this.segment(), index); }
        /// Sets `producer` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer producerAt(long index, long value) { producer(this.segment(), index, value); return this; }

    }
}

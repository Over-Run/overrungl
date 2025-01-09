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
package overrungl.vulkan.android.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### consumer
/// [VarHandle][#VH_consumer] - [Getter][#consumer()] - [Setter][#consumer(long)]
/// ### producer
/// [VarHandle][#VH_producer] - [Getter][#producer()] - [Setter][#producer(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkNativeBufferUsage2ANDROID {
///     uint64_t consumer;
///     uint64_t producer;
/// } VkNativeBufferUsage2ANDROID;
/// ```
public final class VkNativeBufferUsage2ANDROID extends Struct {
    /// The struct layout of `VkNativeBufferUsage2ANDROID`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("consumer"),
        ValueLayout.JAVA_LONG.withName("producer")
    );
    /// The [VarHandle] of `consumer` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_consumer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("consumer"));
    /// The [VarHandle] of `producer` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_producer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("producer"));

    /// Creates `VkNativeBufferUsage2ANDROID` with the given segment.
    /// @param segment the memory segment
    public VkNativeBufferUsage2ANDROID(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkNativeBufferUsage2ANDROID` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkNativeBufferUsage2ANDROID of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkNativeBufferUsage2ANDROID(segment); }

    /// Creates `VkNativeBufferUsage2ANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkNativeBufferUsage2ANDROID ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkNativeBufferUsage2ANDROID(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkNativeBufferUsage2ANDROID` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkNativeBufferUsage2ANDROID ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkNativeBufferUsage2ANDROID(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkNativeBufferUsage2ANDROID` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkNativeBufferUsage2ANDROID`
    public static VkNativeBufferUsage2ANDROID alloc(SegmentAllocator allocator) { return new VkNativeBufferUsage2ANDROID(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkNativeBufferUsage2ANDROID` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkNativeBufferUsage2ANDROID`
    public static VkNativeBufferUsage2ANDROID alloc(SegmentAllocator allocator, long count) { return new VkNativeBufferUsage2ANDROID(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkNativeBufferUsage2ANDROID`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkNativeBufferUsage2ANDROID`
    public VkNativeBufferUsage2ANDROID asSlice(long index) { return new VkNativeBufferUsage2ANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkNativeBufferUsage2ANDROID`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkNativeBufferUsage2ANDROID`
    public VkNativeBufferUsage2ANDROID asSlice(long index, long count) { return new VkNativeBufferUsage2ANDROID(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `consumer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_consumer(MemorySegment segment, long index) { return (long) VH_consumer.get(segment, 0L, index); }
    /// {@return `consumer`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_consumer(MemorySegment segment) { return VkNativeBufferUsage2ANDROID.get_consumer(segment, 0L); }
    /// {@return `consumer` at the given index}
    /// @param index the index
    public @CType("uint64_t") long consumerAt(long index) { return VkNativeBufferUsage2ANDROID.get_consumer(this.segment(), index); }
    /// {@return `consumer`}
    public @CType("uint64_t") long consumer() { return VkNativeBufferUsage2ANDROID.get_consumer(this.segment()); }
    /// Sets `consumer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_consumer(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_consumer.set(segment, 0L, index, value); }
    /// Sets `consumer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_consumer(MemorySegment segment, @CType("uint64_t") long value) { VkNativeBufferUsage2ANDROID.set_consumer(segment, 0L, value); }
    /// Sets `consumer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkNativeBufferUsage2ANDROID consumerAt(long index, @CType("uint64_t") long value) { VkNativeBufferUsage2ANDROID.set_consumer(this.segment(), index, value); return this; }
    /// Sets `consumer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkNativeBufferUsage2ANDROID consumer(@CType("uint64_t") long value) { VkNativeBufferUsage2ANDROID.set_consumer(this.segment(), value); return this; }

    /// {@return `producer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_producer(MemorySegment segment, long index) { return (long) VH_producer.get(segment, 0L, index); }
    /// {@return `producer`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_producer(MemorySegment segment) { return VkNativeBufferUsage2ANDROID.get_producer(segment, 0L); }
    /// {@return `producer` at the given index}
    /// @param index the index
    public @CType("uint64_t") long producerAt(long index) { return VkNativeBufferUsage2ANDROID.get_producer(this.segment(), index); }
    /// {@return `producer`}
    public @CType("uint64_t") long producer() { return VkNativeBufferUsage2ANDROID.get_producer(this.segment()); }
    /// Sets `producer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_producer(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_producer.set(segment, 0L, index, value); }
    /// Sets `producer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_producer(MemorySegment segment, @CType("uint64_t") long value) { VkNativeBufferUsage2ANDROID.set_producer(segment, 0L, value); }
    /// Sets `producer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkNativeBufferUsage2ANDROID producerAt(long index, @CType("uint64_t") long value) { VkNativeBufferUsage2ANDROID.set_producer(this.segment(), index, value); return this; }
    /// Sets `producer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkNativeBufferUsage2ANDROID producer(@CType("uint64_t") long value) { VkNativeBufferUsage2ANDROID.set_producer(this.segment(), value); return this; }

}

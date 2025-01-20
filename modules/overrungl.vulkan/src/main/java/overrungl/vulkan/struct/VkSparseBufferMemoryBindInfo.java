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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### buffer
/// [VarHandle][#VH_buffer] - [Getter][#buffer()] - [Setter][#buffer(MemorySegment)]
/// ### bindCount
/// [VarHandle][#VH_bindCount] - [Getter][#bindCount()] - [Setter][#bindCount(int)]
/// ### pBinds
/// [VarHandle][#VH_pBinds] - [Getter][#pBinds()] - [Setter][#pBinds(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSparseBufferMemoryBindInfo {
///     VkBuffer buffer;
///     uint32_t bindCount;
///     const VkSparseMemoryBind * pBinds;
/// } VkSparseBufferMemoryBindInfo;
/// ```
public sealed class VkSparseBufferMemoryBindInfo extends Struct {
    /// The struct layout of `VkSparseBufferMemoryBindInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("buffer"),
        ValueLayout.JAVA_INT.withName("bindCount"),
        ValueLayout.ADDRESS.withName("pBinds")
    );
    /// The [VarHandle] of `buffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_buffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buffer"));
    /// The [VarHandle] of `bindCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bindCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bindCount"));
    /// The [VarHandle] of `pBinds` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pBinds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBinds"));

    /// Creates `VkSparseBufferMemoryBindInfo` with the given segment.
    /// @param segment the memory segment
    public VkSparseBufferMemoryBindInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSparseBufferMemoryBindInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseBufferMemoryBindInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSparseBufferMemoryBindInfo(segment); }

    /// Creates `VkSparseBufferMemoryBindInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSparseBufferMemoryBindInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseBufferMemoryBindInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSparseBufferMemoryBindInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSparseBufferMemoryBindInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSparseBufferMemoryBindInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSparseBufferMemoryBindInfo`
    public static VkSparseBufferMemoryBindInfo alloc(SegmentAllocator allocator) { return new VkSparseBufferMemoryBindInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSparseBufferMemoryBindInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSparseBufferMemoryBindInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSparseBufferMemoryBindInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSparseBufferMemoryBindInfo`
    public static VkSparseBufferMemoryBindInfo allocInit(SegmentAllocator allocator, @CType("VkBuffer") MemorySegment buffer, @CType("uint32_t") int bindCount, @CType("const VkSparseMemoryBind *") MemorySegment pBinds) { return alloc(allocator).buffer(buffer).bindCount(bindCount).pBinds(pBinds); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSparseBufferMemoryBindInfo copyFrom(VkSparseBufferMemoryBindInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `buffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBuffer") MemorySegment get_buffer(MemorySegment segment, long index) { return (MemorySegment) VH_buffer.get(segment, 0L, index); }
    /// {@return `buffer`}
    /// @param segment the segment of the struct
    public static @CType("VkBuffer") MemorySegment get_buffer(MemorySegment segment) { return VkSparseBufferMemoryBindInfo.get_buffer(segment, 0L); }
    /// {@return `buffer`}
    public @CType("VkBuffer") MemorySegment buffer() { return VkSparseBufferMemoryBindInfo.get_buffer(this.segment()); }
    /// Sets `buffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_buffer(MemorySegment segment, long index, @CType("VkBuffer") MemorySegment value) { VH_buffer.set(segment, 0L, index, value); }
    /// Sets `buffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_buffer(MemorySegment segment, @CType("VkBuffer") MemorySegment value) { VkSparseBufferMemoryBindInfo.set_buffer(segment, 0L, value); }
    /// Sets `buffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseBufferMemoryBindInfo buffer(@CType("VkBuffer") MemorySegment value) { VkSparseBufferMemoryBindInfo.set_buffer(this.segment(), value); return this; }

    /// {@return `bindCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_bindCount(MemorySegment segment, long index) { return (int) VH_bindCount.get(segment, 0L, index); }
    /// {@return `bindCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_bindCount(MemorySegment segment) { return VkSparseBufferMemoryBindInfo.get_bindCount(segment, 0L); }
    /// {@return `bindCount`}
    public @CType("uint32_t") int bindCount() { return VkSparseBufferMemoryBindInfo.get_bindCount(this.segment()); }
    /// Sets `bindCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bindCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_bindCount.set(segment, 0L, index, value); }
    /// Sets `bindCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bindCount(MemorySegment segment, @CType("uint32_t") int value) { VkSparseBufferMemoryBindInfo.set_bindCount(segment, 0L, value); }
    /// Sets `bindCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseBufferMemoryBindInfo bindCount(@CType("uint32_t") int value) { VkSparseBufferMemoryBindInfo.set_bindCount(this.segment(), value); return this; }

    /// {@return `pBinds` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSparseMemoryBind *") MemorySegment get_pBinds(MemorySegment segment, long index) { return (MemorySegment) VH_pBinds.get(segment, 0L, index); }
    /// {@return `pBinds`}
    /// @param segment the segment of the struct
    public static @CType("const VkSparseMemoryBind *") MemorySegment get_pBinds(MemorySegment segment) { return VkSparseBufferMemoryBindInfo.get_pBinds(segment, 0L); }
    /// {@return `pBinds`}
    public @CType("const VkSparseMemoryBind *") MemorySegment pBinds() { return VkSparseBufferMemoryBindInfo.get_pBinds(this.segment()); }
    /// Sets `pBinds` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pBinds(MemorySegment segment, long index, @CType("const VkSparseMemoryBind *") MemorySegment value) { VH_pBinds.set(segment, 0L, index, value); }
    /// Sets `pBinds` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pBinds(MemorySegment segment, @CType("const VkSparseMemoryBind *") MemorySegment value) { VkSparseBufferMemoryBindInfo.set_pBinds(segment, 0L, value); }
    /// Sets `pBinds` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseBufferMemoryBindInfo pBinds(@CType("const VkSparseMemoryBind *") MemorySegment value) { VkSparseBufferMemoryBindInfo.set_pBinds(this.segment(), value); return this; }

    /// A buffer of [VkSparseBufferMemoryBindInfo].
    public static final class Buffer extends VkSparseBufferMemoryBindInfo {
        private final long elementCount;

        /// Creates `VkSparseBufferMemoryBindInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSparseBufferMemoryBindInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSparseBufferMemoryBindInfo`
        public VkSparseBufferMemoryBindInfo asSlice(long index) { return new VkSparseBufferMemoryBindInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSparseBufferMemoryBindInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSparseBufferMemoryBindInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `buffer` at the given index}
        /// @param index the index
        public @CType("VkBuffer") MemorySegment bufferAt(long index) { return VkSparseBufferMemoryBindInfo.get_buffer(this.segment(), index); }
        /// Sets `buffer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bufferAt(long index, @CType("VkBuffer") MemorySegment value) { VkSparseBufferMemoryBindInfo.set_buffer(this.segment(), index, value); return this; }

        /// {@return `bindCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int bindCountAt(long index) { return VkSparseBufferMemoryBindInfo.get_bindCount(this.segment(), index); }
        /// Sets `bindCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bindCountAt(long index, @CType("uint32_t") int value) { VkSparseBufferMemoryBindInfo.set_bindCount(this.segment(), index, value); return this; }

        /// {@return `pBinds` at the given index}
        /// @param index the index
        public @CType("const VkSparseMemoryBind *") MemorySegment pBindsAt(long index) { return VkSparseBufferMemoryBindInfo.get_pBinds(this.segment(), index); }
        /// Sets `pBinds` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pBindsAt(long index, @CType("const VkSparseMemoryBind *") MemorySegment value) { VkSparseBufferMemoryBindInfo.set_pBinds(this.segment(), index, value); return this; }

    }
}

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
package overrungl.vulkan.amdx.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### nodeIndex
/// [VarHandle][#VH_nodeIndex] - [Getter][#nodeIndex()] - [Setter][#nodeIndex(int)]
/// ### payloadCount
/// [VarHandle][#VH_payloadCount] - [Getter][#payloadCount()] - [Setter][#payloadCount(int)]
/// ### payloads
/// [Byte offset][#OFFSET_payloads] - [Memory layout][#ML_payloads] - [Getter][#payloads()] - [Setter][#payloads(MemorySegment)]
/// ### payloadStride
/// [VarHandle][#VH_payloadStride] - [Getter][#payloadStride()] - [Setter][#payloadStride(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDispatchGraphInfoAMDX {
///     uint32_t nodeIndex;
///     uint32_t payloadCount;
///     VkDeviceOrHostAddressConstAMDX payloads;
///     uint64_t payloadStride;
/// } VkDispatchGraphInfoAMDX;
/// ```
public sealed class VkDispatchGraphInfoAMDX extends Struct {
    /// The struct layout of `VkDispatchGraphInfoAMDX`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("nodeIndex"),
        ValueLayout.JAVA_INT.withName("payloadCount"),
        overrungl.vulkan.amdx.union.VkDeviceOrHostAddressConstAMDX.LAYOUT.withName("payloads"),
        ValueLayout.JAVA_LONG.withName("payloadStride")
    );
    /// The [VarHandle] of `nodeIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_nodeIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nodeIndex"));
    /// The [VarHandle] of `payloadCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_payloadCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("payloadCount"));
    /// The byte offset of `payloads`.
    public static final long OFFSET_payloads = LAYOUT.byteOffset(PathElement.groupElement("payloads"));
    /// The memory layout of `payloads`.
    public static final MemoryLayout ML_payloads = LAYOUT.select(PathElement.groupElement("payloads"));
    /// The [VarHandle] of `payloadStride` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_payloadStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("payloadStride"));

    /// Creates `VkDispatchGraphInfoAMDX` with the given segment.
    /// @param segment the memory segment
    public VkDispatchGraphInfoAMDX(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDispatchGraphInfoAMDX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDispatchGraphInfoAMDX of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDispatchGraphInfoAMDX(segment); }

    /// Creates `VkDispatchGraphInfoAMDX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDispatchGraphInfoAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDispatchGraphInfoAMDX ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDispatchGraphInfoAMDX(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDispatchGraphInfoAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDispatchGraphInfoAMDX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDispatchGraphInfoAMDX`
    public static VkDispatchGraphInfoAMDX alloc(SegmentAllocator allocator) { return new VkDispatchGraphInfoAMDX(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDispatchGraphInfoAMDX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDispatchGraphInfoAMDX`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDispatchGraphInfoAMDX` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDispatchGraphInfoAMDX`
    public static VkDispatchGraphInfoAMDX allocInit(SegmentAllocator allocator, @CType("uint32_t") int nodeIndex, @CType("uint32_t") int payloadCount, @CType("VkDeviceOrHostAddressConstAMDX") MemorySegment payloads, @CType("uint64_t") long payloadStride) { return alloc(allocator).nodeIndex(nodeIndex).payloadCount(payloadCount).payloads(payloads).payloadStride(payloadStride); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDispatchGraphInfoAMDX copyFrom(VkDispatchGraphInfoAMDX src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `nodeIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_nodeIndex(MemorySegment segment, long index) { return (int) VH_nodeIndex.get(segment, 0L, index); }
    /// {@return `nodeIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_nodeIndex(MemorySegment segment) { return VkDispatchGraphInfoAMDX.get_nodeIndex(segment, 0L); }
    /// {@return `nodeIndex`}
    public @CType("uint32_t") int nodeIndex() { return VkDispatchGraphInfoAMDX.get_nodeIndex(this.segment()); }
    /// Sets `nodeIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_nodeIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_nodeIndex.set(segment, 0L, index, value); }
    /// Sets `nodeIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_nodeIndex(MemorySegment segment, @CType("uint32_t") int value) { VkDispatchGraphInfoAMDX.set_nodeIndex(segment, 0L, value); }
    /// Sets `nodeIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDispatchGraphInfoAMDX nodeIndex(@CType("uint32_t") int value) { VkDispatchGraphInfoAMDX.set_nodeIndex(this.segment(), value); return this; }

    /// {@return `payloadCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_payloadCount(MemorySegment segment, long index) { return (int) VH_payloadCount.get(segment, 0L, index); }
    /// {@return `payloadCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_payloadCount(MemorySegment segment) { return VkDispatchGraphInfoAMDX.get_payloadCount(segment, 0L); }
    /// {@return `payloadCount`}
    public @CType("uint32_t") int payloadCount() { return VkDispatchGraphInfoAMDX.get_payloadCount(this.segment()); }
    /// Sets `payloadCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_payloadCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_payloadCount.set(segment, 0L, index, value); }
    /// Sets `payloadCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_payloadCount(MemorySegment segment, @CType("uint32_t") int value) { VkDispatchGraphInfoAMDX.set_payloadCount(segment, 0L, value); }
    /// Sets `payloadCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDispatchGraphInfoAMDX payloadCount(@CType("uint32_t") int value) { VkDispatchGraphInfoAMDX.set_payloadCount(this.segment(), value); return this; }

    /// {@return `payloads` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceOrHostAddressConstAMDX") MemorySegment get_payloads(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_payloads, index), ML_payloads); }
    /// {@return `payloads`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceOrHostAddressConstAMDX") MemorySegment get_payloads(MemorySegment segment) { return VkDispatchGraphInfoAMDX.get_payloads(segment, 0L); }
    /// {@return `payloads`}
    public @CType("VkDeviceOrHostAddressConstAMDX") MemorySegment payloads() { return VkDispatchGraphInfoAMDX.get_payloads(this.segment()); }
    /// Sets `payloads` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_payloads(MemorySegment segment, long index, @CType("VkDeviceOrHostAddressConstAMDX") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_payloads, index), ML_payloads.byteSize()); }
    /// Sets `payloads` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_payloads(MemorySegment segment, @CType("VkDeviceOrHostAddressConstAMDX") MemorySegment value) { VkDispatchGraphInfoAMDX.set_payloads(segment, 0L, value); }
    /// Sets `payloads` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDispatchGraphInfoAMDX payloads(@CType("VkDeviceOrHostAddressConstAMDX") MemorySegment value) { VkDispatchGraphInfoAMDX.set_payloads(this.segment(), value); return this; }

    /// {@return `payloadStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_payloadStride(MemorySegment segment, long index) { return (long) VH_payloadStride.get(segment, 0L, index); }
    /// {@return `payloadStride`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_payloadStride(MemorySegment segment) { return VkDispatchGraphInfoAMDX.get_payloadStride(segment, 0L); }
    /// {@return `payloadStride`}
    public @CType("uint64_t") long payloadStride() { return VkDispatchGraphInfoAMDX.get_payloadStride(this.segment()); }
    /// Sets `payloadStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_payloadStride(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_payloadStride.set(segment, 0L, index, value); }
    /// Sets `payloadStride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_payloadStride(MemorySegment segment, @CType("uint64_t") long value) { VkDispatchGraphInfoAMDX.set_payloadStride(segment, 0L, value); }
    /// Sets `payloadStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDispatchGraphInfoAMDX payloadStride(@CType("uint64_t") long value) { VkDispatchGraphInfoAMDX.set_payloadStride(this.segment(), value); return this; }

    /// A buffer of [VkDispatchGraphInfoAMDX].
    public static final class Buffer extends VkDispatchGraphInfoAMDX {
        private final long elementCount;

        /// Creates `VkDispatchGraphInfoAMDX.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDispatchGraphInfoAMDX`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDispatchGraphInfoAMDX`
        public VkDispatchGraphInfoAMDX asSlice(long index) { return new VkDispatchGraphInfoAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDispatchGraphInfoAMDX`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDispatchGraphInfoAMDX`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `nodeIndex` at the given index}
        /// @param index the index
        public @CType("uint32_t") int nodeIndexAt(long index) { return VkDispatchGraphInfoAMDX.get_nodeIndex(this.segment(), index); }
        /// Sets `nodeIndex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer nodeIndexAt(long index, @CType("uint32_t") int value) { VkDispatchGraphInfoAMDX.set_nodeIndex(this.segment(), index, value); return this; }

        /// {@return `payloadCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int payloadCountAt(long index) { return VkDispatchGraphInfoAMDX.get_payloadCount(this.segment(), index); }
        /// Sets `payloadCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer payloadCountAt(long index, @CType("uint32_t") int value) { VkDispatchGraphInfoAMDX.set_payloadCount(this.segment(), index, value); return this; }

        /// {@return `payloads` at the given index}
        /// @param index the index
        public @CType("VkDeviceOrHostAddressConstAMDX") MemorySegment payloadsAt(long index) { return VkDispatchGraphInfoAMDX.get_payloads(this.segment(), index); }
        /// Sets `payloads` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer payloadsAt(long index, @CType("VkDeviceOrHostAddressConstAMDX") MemorySegment value) { VkDispatchGraphInfoAMDX.set_payloads(this.segment(), index, value); return this; }

        /// {@return `payloadStride` at the given index}
        /// @param index the index
        public @CType("uint64_t") long payloadStrideAt(long index) { return VkDispatchGraphInfoAMDX.get_payloadStride(this.segment(), index); }
        /// Sets `payloadStride` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer payloadStrideAt(long index, @CType("uint64_t") long value) { VkDispatchGraphInfoAMDX.set_payloadStride(this.segment(), index, value); return this; }

    }
}

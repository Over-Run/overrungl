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
/// ### count
/// [VarHandle][#VH_count] - [Getter][#count()] - [Setter][#count(int)]
/// ### infos
/// [Byte offset][#OFFSET_infos] - [Memory layout][#ML_infos] - [Getter][#infos()] - [Setter][#infos(java.lang.foreign.MemorySegment)]
/// ### stride
/// [VarHandle][#VH_stride] - [Getter][#stride()] - [Setter][#stride(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDispatchGraphCountInfoAMDX {
///     uint32_t count;
///     VkDeviceOrHostAddressConstAMDX infos;
///     uint64_t stride;
/// } VkDispatchGraphCountInfoAMDX;
/// ```
public sealed class VkDispatchGraphCountInfoAMDX extends Struct {
    /// The struct layout of `VkDispatchGraphCountInfoAMDX`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("count"),
        overrungl.vulkan.amdx.union.VkDeviceOrHostAddressConstAMDX.LAYOUT.withName("infos"),
        ValueLayout.JAVA_LONG.withName("stride")
    );
    /// The [VarHandle] of `count` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_count = LAYOUT.arrayElementVarHandle(PathElement.groupElement("count"));
    /// The byte offset of `infos`.
    public static final long OFFSET_infos = LAYOUT.byteOffset(PathElement.groupElement("infos"));
    /// The memory layout of `infos`.
    public static final MemoryLayout ML_infos = LAYOUT.select(PathElement.groupElement("infos"));
    /// The [VarHandle] of `stride` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));

    /// Creates `VkDispatchGraphCountInfoAMDX` with the given segment.
    /// @param segment the memory segment
    public VkDispatchGraphCountInfoAMDX(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDispatchGraphCountInfoAMDX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDispatchGraphCountInfoAMDX of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDispatchGraphCountInfoAMDX(segment); }

    /// Creates `VkDispatchGraphCountInfoAMDX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDispatchGraphCountInfoAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDispatchGraphCountInfoAMDX ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDispatchGraphCountInfoAMDX(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDispatchGraphCountInfoAMDX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkDispatchGraphCountInfoAMDX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDispatchGraphCountInfoAMDX`
    public static VkDispatchGraphCountInfoAMDX alloc(SegmentAllocator allocator) { return new VkDispatchGraphCountInfoAMDX(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDispatchGraphCountInfoAMDX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDispatchGraphCountInfoAMDX`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDispatchGraphCountInfoAMDX` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDispatchGraphCountInfoAMDX`
    public static VkDispatchGraphCountInfoAMDX allocInit(SegmentAllocator allocator, @CType("uint32_t") int count, @CType("VkDeviceOrHostAddressConstAMDX") java.lang.foreign.MemorySegment infos, @CType("uint64_t") long stride) { return alloc(allocator).count(count).infos(infos).stride(stride); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDispatchGraphCountInfoAMDX copyFrom(VkDispatchGraphCountInfoAMDX src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `count` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_count(MemorySegment segment, long index) { return (int) VH_count.get(segment, 0L, index); }
    /// {@return `count`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_count(MemorySegment segment) { return VkDispatchGraphCountInfoAMDX.get_count(segment, 0L); }
    /// {@return `count`}
    public @CType("uint32_t") int count() { return VkDispatchGraphCountInfoAMDX.get_count(this.segment()); }
    /// Sets `count` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_count(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_count.set(segment, 0L, index, value); }
    /// Sets `count` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_count(MemorySegment segment, @CType("uint32_t") int value) { VkDispatchGraphCountInfoAMDX.set_count(segment, 0L, value); }
    /// Sets `count` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDispatchGraphCountInfoAMDX count(@CType("uint32_t") int value) { VkDispatchGraphCountInfoAMDX.set_count(this.segment(), value); return this; }

    /// {@return `infos` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceOrHostAddressConstAMDX") java.lang.foreign.MemorySegment get_infos(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_infos, index), ML_infos); }
    /// {@return `infos`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceOrHostAddressConstAMDX") java.lang.foreign.MemorySegment get_infos(MemorySegment segment) { return VkDispatchGraphCountInfoAMDX.get_infos(segment, 0L); }
    /// {@return `infos`}
    public @CType("VkDeviceOrHostAddressConstAMDX") java.lang.foreign.MemorySegment infos() { return VkDispatchGraphCountInfoAMDX.get_infos(this.segment()); }
    /// Sets `infos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_infos(MemorySegment segment, long index, @CType("VkDeviceOrHostAddressConstAMDX") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_infos, index), ML_infos.byteSize()); }
    /// Sets `infos` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_infos(MemorySegment segment, @CType("VkDeviceOrHostAddressConstAMDX") java.lang.foreign.MemorySegment value) { VkDispatchGraphCountInfoAMDX.set_infos(segment, 0L, value); }
    /// Sets `infos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDispatchGraphCountInfoAMDX infos(@CType("VkDeviceOrHostAddressConstAMDX") java.lang.foreign.MemorySegment value) { VkDispatchGraphCountInfoAMDX.set_infos(this.segment(), value); return this; }

    /// {@return `stride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_stride(MemorySegment segment, long index) { return (long) VH_stride.get(segment, 0L, index); }
    /// {@return `stride`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_stride(MemorySegment segment) { return VkDispatchGraphCountInfoAMDX.get_stride(segment, 0L); }
    /// {@return `stride`}
    public @CType("uint64_t") long stride() { return VkDispatchGraphCountInfoAMDX.get_stride(this.segment()); }
    /// Sets `stride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stride(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_stride.set(segment, 0L, index, value); }
    /// Sets `stride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stride(MemorySegment segment, @CType("uint64_t") long value) { VkDispatchGraphCountInfoAMDX.set_stride(segment, 0L, value); }
    /// Sets `stride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDispatchGraphCountInfoAMDX stride(@CType("uint64_t") long value) { VkDispatchGraphCountInfoAMDX.set_stride(this.segment(), value); return this; }

    /// A buffer of [VkDispatchGraphCountInfoAMDX].
    public static final class Buffer extends VkDispatchGraphCountInfoAMDX {
        private final long elementCount;

        /// Creates `VkDispatchGraphCountInfoAMDX.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkDispatchGraphCountInfoAMDX`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkDispatchGraphCountInfoAMDX`
        public VkDispatchGraphCountInfoAMDX asSlice(long index) { return new VkDispatchGraphCountInfoAMDX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkDispatchGraphCountInfoAMDX`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkDispatchGraphCountInfoAMDX`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `count` at the given index}
        /// @param index the index
        public @CType("uint32_t") int countAt(long index) { return VkDispatchGraphCountInfoAMDX.get_count(this.segment(), index); }
        /// Sets `count` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer countAt(long index, @CType("uint32_t") int value) { VkDispatchGraphCountInfoAMDX.set_count(this.segment(), index, value); return this; }

        /// {@return `infos` at the given index}
        /// @param index the index
        public @CType("VkDeviceOrHostAddressConstAMDX") java.lang.foreign.MemorySegment infosAt(long index) { return VkDispatchGraphCountInfoAMDX.get_infos(this.segment(), index); }
        /// Sets `infos` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer infosAt(long index, @CType("VkDeviceOrHostAddressConstAMDX") java.lang.foreign.MemorySegment value) { VkDispatchGraphCountInfoAMDX.set_infos(this.segment(), index, value); return this; }

        /// {@return `stride` at the given index}
        /// @param index the index
        public @CType("uint64_t") long strideAt(long index) { return VkDispatchGraphCountInfoAMDX.get_stride(this.segment(), index); }
        /// Sets `stride` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer strideAt(long index, @CType("uint64_t") long value) { VkDispatchGraphCountInfoAMDX.set_stride(this.segment(), index, value); return this; }

    }
}

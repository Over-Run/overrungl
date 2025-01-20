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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### type
/// [VarHandle][#VH_type] - [Getter][#type()] - [Setter][#type(int)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### data
/// [Byte offset][#OFFSET_data] - [Memory layout][#ML_data] - [Getter][#data()] - [Setter][#data(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAccelerationStructureMotionInstanceNV {
///     VkAccelerationStructureMotionInstanceTypeNV type;
///     VkAccelerationStructureMotionInstanceFlagsNV flags;
///     VkAccelerationStructureMotionInstanceDataNV data;
/// } VkAccelerationStructureMotionInstanceNV;
/// ```
public sealed class VkAccelerationStructureMotionInstanceNV extends Struct {
    /// The struct layout of `VkAccelerationStructureMotionInstanceNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("flags"),
        overrungl.vulkan.nv.union.VkAccelerationStructureMotionInstanceDataNV.LAYOUT.withName("data")
    );
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `data`.
    public static final long OFFSET_data = LAYOUT.byteOffset(PathElement.groupElement("data"));
    /// The memory layout of `data`.
    public static final MemoryLayout ML_data = LAYOUT.select(PathElement.groupElement("data"));

    /// Creates `VkAccelerationStructureMotionInstanceNV` with the given segment.
    /// @param segment the memory segment
    public VkAccelerationStructureMotionInstanceNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAccelerationStructureMotionInstanceNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureMotionInstanceNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureMotionInstanceNV(segment); }

    /// Creates `VkAccelerationStructureMotionInstanceNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureMotionInstanceNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureMotionInstanceNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureMotionInstanceNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAccelerationStructureMotionInstanceNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkAccelerationStructureMotionInstanceNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureMotionInstanceNV`
    public static VkAccelerationStructureMotionInstanceNV alloc(SegmentAllocator allocator) { return new VkAccelerationStructureMotionInstanceNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAccelerationStructureMotionInstanceNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureMotionInstanceNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAccelerationStructureMotionInstanceNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureMotionInstanceNV`
    public static VkAccelerationStructureMotionInstanceNV allocInit(SegmentAllocator allocator, @CType("VkAccelerationStructureMotionInstanceTypeNV") int type, @CType("VkAccelerationStructureMotionInstanceFlagsNV") int flags, @CType("VkAccelerationStructureMotionInstanceDataNV") MemorySegment data) { return alloc(allocator).type(type).flags(flags).data(data); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureMotionInstanceNV copyFrom(VkAccelerationStructureMotionInstanceNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccelerationStructureMotionInstanceTypeNV") int get_type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    /// @param segment the segment of the struct
    public static @CType("VkAccelerationStructureMotionInstanceTypeNV") int get_type(MemorySegment segment) { return VkAccelerationStructureMotionInstanceNV.get_type(segment, 0L); }
    /// {@return `type`}
    public @CType("VkAccelerationStructureMotionInstanceTypeNV") int type() { return VkAccelerationStructureMotionInstanceNV.get_type(this.segment()); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_type(MemorySegment segment, long index, @CType("VkAccelerationStructureMotionInstanceTypeNV") int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_type(MemorySegment segment, @CType("VkAccelerationStructureMotionInstanceTypeNV") int value) { VkAccelerationStructureMotionInstanceNV.set_type(segment, 0L, value); }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMotionInstanceNV type(@CType("VkAccelerationStructureMotionInstanceTypeNV") int value) { VkAccelerationStructureMotionInstanceNV.set_type(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccelerationStructureMotionInstanceFlagsNV") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkAccelerationStructureMotionInstanceFlagsNV") int get_flags(MemorySegment segment) { return VkAccelerationStructureMotionInstanceNV.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkAccelerationStructureMotionInstanceFlagsNV") int flags() { return VkAccelerationStructureMotionInstanceNV.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkAccelerationStructureMotionInstanceFlagsNV") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkAccelerationStructureMotionInstanceFlagsNV") int value) { VkAccelerationStructureMotionInstanceNV.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMotionInstanceNV flags(@CType("VkAccelerationStructureMotionInstanceFlagsNV") int value) { VkAccelerationStructureMotionInstanceNV.set_flags(this.segment(), value); return this; }

    /// {@return `data` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccelerationStructureMotionInstanceDataNV") MemorySegment get_data(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_data, index), ML_data); }
    /// {@return `data`}
    /// @param segment the segment of the struct
    public static @CType("VkAccelerationStructureMotionInstanceDataNV") MemorySegment get_data(MemorySegment segment) { return VkAccelerationStructureMotionInstanceNV.get_data(segment, 0L); }
    /// {@return `data`}
    public @CType("VkAccelerationStructureMotionInstanceDataNV") MemorySegment data() { return VkAccelerationStructureMotionInstanceNV.get_data(this.segment()); }
    /// Sets `data` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_data(MemorySegment segment, long index, @CType("VkAccelerationStructureMotionInstanceDataNV") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_data, index), ML_data.byteSize()); }
    /// Sets `data` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_data(MemorySegment segment, @CType("VkAccelerationStructureMotionInstanceDataNV") MemorySegment value) { VkAccelerationStructureMotionInstanceNV.set_data(segment, 0L, value); }
    /// Sets `data` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMotionInstanceNV data(@CType("VkAccelerationStructureMotionInstanceDataNV") MemorySegment value) { VkAccelerationStructureMotionInstanceNV.set_data(this.segment(), value); return this; }

    /// A buffer of [VkAccelerationStructureMotionInstanceNV].
    public static final class Buffer extends VkAccelerationStructureMotionInstanceNV {
        private final long elementCount;

        /// Creates `VkAccelerationStructureMotionInstanceNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAccelerationStructureMotionInstanceNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkAccelerationStructureMotionInstanceNV`
        public VkAccelerationStructureMotionInstanceNV asSlice(long index) { return new VkAccelerationStructureMotionInstanceNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAccelerationStructureMotionInstanceNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkAccelerationStructureMotionInstanceNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `type` at the given index}
        /// @param index the index
        public @CType("VkAccelerationStructureMotionInstanceTypeNV") int typeAt(long index) { return VkAccelerationStructureMotionInstanceNV.get_type(this.segment(), index); }
        /// Sets `type` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer typeAt(long index, @CType("VkAccelerationStructureMotionInstanceTypeNV") int value) { VkAccelerationStructureMotionInstanceNV.set_type(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkAccelerationStructureMotionInstanceFlagsNV") int flagsAt(long index) { return VkAccelerationStructureMotionInstanceNV.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkAccelerationStructureMotionInstanceFlagsNV") int value) { VkAccelerationStructureMotionInstanceNV.set_flags(this.segment(), index, value); return this; }

        /// {@return `data` at the given index}
        /// @param index the index
        public @CType("VkAccelerationStructureMotionInstanceDataNV") MemorySegment dataAt(long index) { return VkAccelerationStructureMotionInstanceNV.get_data(this.segment(), index); }
        /// Sets `data` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dataAt(long index, @CType("VkAccelerationStructureMotionInstanceDataNV") MemorySegment value) { VkAccelerationStructureMotionInstanceNV.set_data(this.segment(), index, value); return this; }

    }
}

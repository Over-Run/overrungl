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
/// ### queueFlags
/// [VarHandle][#VH_queueFlags] - [Getter][#queueFlags()] - [Setter][#queueFlags(int)]
/// ### queueCount
/// [VarHandle][#VH_queueCount] - [Getter][#queueCount()] - [Setter][#queueCount(int)]
/// ### timestampValidBits
/// [VarHandle][#VH_timestampValidBits] - [Getter][#timestampValidBits()] - [Setter][#timestampValidBits(int)]
/// ### minImageTransferGranularity
/// [Byte offset][#OFFSET_minImageTransferGranularity] - [Memory layout][#ML_minImageTransferGranularity] - [Getter][#minImageTransferGranularity()] - [Setter][#minImageTransferGranularity(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkQueueFamilyProperties {
///     VkQueueFlags queueFlags;
///     uint32_t queueCount;
///     uint32_t timestampValidBits;
///     VkExtent3D minImageTransferGranularity;
/// } VkQueueFamilyProperties;
/// ```
public sealed class VkQueueFamilyProperties extends Struct {
    /// The struct layout of `VkQueueFamilyProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("queueFlags"),
        ValueLayout.JAVA_INT.withName("queueCount"),
        ValueLayout.JAVA_INT.withName("timestampValidBits"),
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("minImageTransferGranularity")
    );
    /// The [VarHandle] of `queueFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_queueFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFlags"));
    /// The [VarHandle] of `queueCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_queueCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueCount"));
    /// The [VarHandle] of `timestampValidBits` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_timestampValidBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timestampValidBits"));
    /// The byte offset of `minImageTransferGranularity`.
    public static final long OFFSET_minImageTransferGranularity = LAYOUT.byteOffset(PathElement.groupElement("minImageTransferGranularity"));
    /// The memory layout of `minImageTransferGranularity`.
    public static final MemoryLayout ML_minImageTransferGranularity = LAYOUT.select(PathElement.groupElement("minImageTransferGranularity"));

    /// Creates `VkQueueFamilyProperties` with the given segment.
    /// @param segment the memory segment
    public VkQueueFamilyProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkQueueFamilyProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkQueueFamilyProperties(segment); }

    /// Creates `VkQueueFamilyProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkQueueFamilyProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkQueueFamilyProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkQueueFamilyProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkQueueFamilyProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkQueueFamilyProperties`
    public static VkQueueFamilyProperties alloc(SegmentAllocator allocator) { return new VkQueueFamilyProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkQueueFamilyProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkQueueFamilyProperties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkQueueFamilyProperties` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkQueueFamilyProperties`
    public static VkQueueFamilyProperties allocInit(SegmentAllocator allocator, @CType("VkQueueFlags") int queueFlags, @CType("uint32_t") int queueCount, @CType("uint32_t") int timestampValidBits, @CType("VkExtent3D") MemorySegment minImageTransferGranularity) { return alloc(allocator).queueFlags(queueFlags).queueCount(queueCount).timestampValidBits(timestampValidBits).minImageTransferGranularity(minImageTransferGranularity); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkQueueFamilyProperties copyFrom(VkQueueFamilyProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `queueFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkQueueFlags") int get_queueFlags(MemorySegment segment, long index) { return (int) VH_queueFlags.get(segment, 0L, index); }
    /// {@return `queueFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkQueueFlags") int get_queueFlags(MemorySegment segment) { return VkQueueFamilyProperties.get_queueFlags(segment, 0L); }
    /// {@return `queueFlags`}
    public @CType("VkQueueFlags") int queueFlags() { return VkQueueFamilyProperties.get_queueFlags(this.segment()); }
    /// Sets `queueFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_queueFlags(MemorySegment segment, long index, @CType("VkQueueFlags") int value) { VH_queueFlags.set(segment, 0L, index, value); }
    /// Sets `queueFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_queueFlags(MemorySegment segment, @CType("VkQueueFlags") int value) { VkQueueFamilyProperties.set_queueFlags(segment, 0L, value); }
    /// Sets `queueFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyProperties queueFlags(@CType("VkQueueFlags") int value) { VkQueueFamilyProperties.set_queueFlags(this.segment(), value); return this; }

    /// {@return `queueCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_queueCount(MemorySegment segment, long index) { return (int) VH_queueCount.get(segment, 0L, index); }
    /// {@return `queueCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_queueCount(MemorySegment segment) { return VkQueueFamilyProperties.get_queueCount(segment, 0L); }
    /// {@return `queueCount`}
    public @CType("uint32_t") int queueCount() { return VkQueueFamilyProperties.get_queueCount(this.segment()); }
    /// Sets `queueCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_queueCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_queueCount.set(segment, 0L, index, value); }
    /// Sets `queueCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_queueCount(MemorySegment segment, @CType("uint32_t") int value) { VkQueueFamilyProperties.set_queueCount(segment, 0L, value); }
    /// Sets `queueCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyProperties queueCount(@CType("uint32_t") int value) { VkQueueFamilyProperties.set_queueCount(this.segment(), value); return this; }

    /// {@return `timestampValidBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_timestampValidBits(MemorySegment segment, long index) { return (int) VH_timestampValidBits.get(segment, 0L, index); }
    /// {@return `timestampValidBits`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_timestampValidBits(MemorySegment segment) { return VkQueueFamilyProperties.get_timestampValidBits(segment, 0L); }
    /// {@return `timestampValidBits`}
    public @CType("uint32_t") int timestampValidBits() { return VkQueueFamilyProperties.get_timestampValidBits(this.segment()); }
    /// Sets `timestampValidBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_timestampValidBits(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_timestampValidBits.set(segment, 0L, index, value); }
    /// Sets `timestampValidBits` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_timestampValidBits(MemorySegment segment, @CType("uint32_t") int value) { VkQueueFamilyProperties.set_timestampValidBits(segment, 0L, value); }
    /// Sets `timestampValidBits` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyProperties timestampValidBits(@CType("uint32_t") int value) { VkQueueFamilyProperties.set_timestampValidBits(this.segment(), value); return this; }

    /// {@return `minImageTransferGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent3D") MemorySegment get_minImageTransferGranularity(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_minImageTransferGranularity, index), ML_minImageTransferGranularity); }
    /// {@return `minImageTransferGranularity`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent3D") MemorySegment get_minImageTransferGranularity(MemorySegment segment) { return VkQueueFamilyProperties.get_minImageTransferGranularity(segment, 0L); }
    /// {@return `minImageTransferGranularity`}
    public @CType("VkExtent3D") MemorySegment minImageTransferGranularity() { return VkQueueFamilyProperties.get_minImageTransferGranularity(this.segment()); }
    /// Sets `minImageTransferGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minImageTransferGranularity(MemorySegment segment, long index, @CType("VkExtent3D") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_minImageTransferGranularity, index), ML_minImageTransferGranularity.byteSize()); }
    /// Sets `minImageTransferGranularity` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minImageTransferGranularity(MemorySegment segment, @CType("VkExtent3D") MemorySegment value) { VkQueueFamilyProperties.set_minImageTransferGranularity(segment, 0L, value); }
    /// Sets `minImageTransferGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyProperties minImageTransferGranularity(@CType("VkExtent3D") MemorySegment value) { VkQueueFamilyProperties.set_minImageTransferGranularity(this.segment(), value); return this; }

    /// A buffer of [VkQueueFamilyProperties].
    public static final class Buffer extends VkQueueFamilyProperties {
        private final long elementCount;

        /// Creates `VkQueueFamilyProperties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkQueueFamilyProperties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkQueueFamilyProperties`
        public VkQueueFamilyProperties asSlice(long index) { return new VkQueueFamilyProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkQueueFamilyProperties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkQueueFamilyProperties`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `queueFlags` at the given index}
        /// @param index the index
        public @CType("VkQueueFlags") int queueFlagsAt(long index) { return VkQueueFamilyProperties.get_queueFlags(this.segment(), index); }
        /// Sets `queueFlags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer queueFlagsAt(long index, @CType("VkQueueFlags") int value) { VkQueueFamilyProperties.set_queueFlags(this.segment(), index, value); return this; }

        /// {@return `queueCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int queueCountAt(long index) { return VkQueueFamilyProperties.get_queueCount(this.segment(), index); }
        /// Sets `queueCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer queueCountAt(long index, @CType("uint32_t") int value) { VkQueueFamilyProperties.set_queueCount(this.segment(), index, value); return this; }

        /// {@return `timestampValidBits` at the given index}
        /// @param index the index
        public @CType("uint32_t") int timestampValidBitsAt(long index) { return VkQueueFamilyProperties.get_timestampValidBits(this.segment(), index); }
        /// Sets `timestampValidBits` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer timestampValidBitsAt(long index, @CType("uint32_t") int value) { VkQueueFamilyProperties.set_timestampValidBits(this.segment(), index, value); return this; }

        /// {@return `minImageTransferGranularity` at the given index}
        /// @param index the index
        public @CType("VkExtent3D") MemorySegment minImageTransferGranularityAt(long index) { return VkQueueFamilyProperties.get_minImageTransferGranularity(this.segment(), index); }
        /// Sets `minImageTransferGranularity` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer minImageTransferGranularityAt(long index, @CType("VkExtent3D") MemorySegment value) { VkQueueFamilyProperties.set_minImageTransferGranularity(this.segment(), index, value); return this; }

    }
}

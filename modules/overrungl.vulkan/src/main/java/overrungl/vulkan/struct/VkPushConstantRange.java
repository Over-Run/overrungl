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
/// ### stageFlags
/// [VarHandle][#VH_stageFlags] - [Getter][#stageFlags()] - [Setter][#stageFlags(int)]
/// ### offset
/// [VarHandle][#VH_offset] - [Getter][#offset()] - [Setter][#offset(int)]
/// ### size
/// [VarHandle][#VH_size] - [Getter][#size()] - [Setter][#size(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPushConstantRange {
///     VkShaderStageFlags stageFlags;
///     uint32_t offset;
///     uint32_t size;
/// } VkPushConstantRange;
/// ```
public sealed class VkPushConstantRange extends Struct {
    /// The struct layout of `VkPushConstantRange`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.JAVA_INT.withName("offset"),
        ValueLayout.JAVA_INT.withName("size")
    );
    /// The [VarHandle] of `stageFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stageFlags"));
    /// The [VarHandle] of `offset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));

    /// Creates `VkPushConstantRange` with the given segment.
    /// @param segment the memory segment
    public VkPushConstantRange(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPushConstantRange` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPushConstantRange of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPushConstantRange(segment); }

    /// Creates `VkPushConstantRange` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPushConstantRange` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPushConstantRange ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPushConstantRange(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPushConstantRange` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPushConstantRange` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPushConstantRange`
    public static VkPushConstantRange alloc(SegmentAllocator allocator) { return new VkPushConstantRange(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPushConstantRange` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPushConstantRange`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPushConstantRange` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPushConstantRange`
    public static VkPushConstantRange allocInit(SegmentAllocator allocator, @CType("VkShaderStageFlags") int stageFlags, @CType("uint32_t") int offset, @CType("uint32_t") int size) { return alloc(allocator).stageFlags(stageFlags).offset(offset).size(size); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPushConstantRange copyFrom(VkPushConstantRange src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `stageFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderStageFlags") int get_stageFlags(MemorySegment segment, long index) { return (int) VH_stageFlags.get(segment, 0L, index); }
    /// {@return `stageFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderStageFlags") int get_stageFlags(MemorySegment segment) { return VkPushConstantRange.get_stageFlags(segment, 0L); }
    /// {@return `stageFlags`}
    public @CType("VkShaderStageFlags") int stageFlags() { return VkPushConstantRange.get_stageFlags(this.segment()); }
    /// Sets `stageFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stageFlags(MemorySegment segment, long index, @CType("VkShaderStageFlags") int value) { VH_stageFlags.set(segment, 0L, index, value); }
    /// Sets `stageFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stageFlags(MemorySegment segment, @CType("VkShaderStageFlags") int value) { VkPushConstantRange.set_stageFlags(segment, 0L, value); }
    /// Sets `stageFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushConstantRange stageFlags(@CType("VkShaderStageFlags") int value) { VkPushConstantRange.set_stageFlags(this.segment(), value); return this; }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_offset(MemorySegment segment, long index) { return (int) VH_offset.get(segment, 0L, index); }
    /// {@return `offset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_offset(MemorySegment segment) { return VkPushConstantRange.get_offset(segment, 0L); }
    /// {@return `offset`}
    public @CType("uint32_t") int offset() { return VkPushConstantRange.get_offset(this.segment()); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_offset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_offset.set(segment, 0L, index, value); }
    /// Sets `offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_offset(MemorySegment segment, @CType("uint32_t") int value) { VkPushConstantRange.set_offset(segment, 0L, value); }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushConstantRange offset(@CType("uint32_t") int value) { VkPushConstantRange.set_offset(this.segment(), value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_size(MemorySegment segment, long index) { return (int) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_size(MemorySegment segment) { return VkPushConstantRange.get_size(segment, 0L); }
    /// {@return `size`}
    public @CType("uint32_t") int size() { return VkPushConstantRange.get_size(this.segment()); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_size(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_size(MemorySegment segment, @CType("uint32_t") int value) { VkPushConstantRange.set_size(segment, 0L, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPushConstantRange size(@CType("uint32_t") int value) { VkPushConstantRange.set_size(this.segment(), value); return this; }

    /// A buffer of [VkPushConstantRange].
    public static final class Buffer extends VkPushConstantRange {
        private final long elementCount;

        /// Creates `VkPushConstantRange.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPushConstantRange`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPushConstantRange`
        public VkPushConstantRange asSlice(long index) { return new VkPushConstantRange(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPushConstantRange`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPushConstantRange`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `stageFlags` at the given index}
        /// @param index the index
        public @CType("VkShaderStageFlags") int stageFlagsAt(long index) { return VkPushConstantRange.get_stageFlags(this.segment(), index); }
        /// Sets `stageFlags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer stageFlagsAt(long index, @CType("VkShaderStageFlags") int value) { VkPushConstantRange.set_stageFlags(this.segment(), index, value); return this; }

        /// {@return `offset` at the given index}
        /// @param index the index
        public @CType("uint32_t") int offsetAt(long index) { return VkPushConstantRange.get_offset(this.segment(), index); }
        /// Sets `offset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer offsetAt(long index, @CType("uint32_t") int value) { VkPushConstantRange.set_offset(this.segment(), index, value); return this; }

        /// {@return `size` at the given index}
        /// @param index the index
        public @CType("uint32_t") int sizeAt(long index) { return VkPushConstantRange.get_size(this.segment(), index); }
        /// Sets `size` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sizeAt(long index, @CType("uint32_t") int value) { VkPushConstantRange.set_size(this.segment(), index, value); return this; }

    }
}

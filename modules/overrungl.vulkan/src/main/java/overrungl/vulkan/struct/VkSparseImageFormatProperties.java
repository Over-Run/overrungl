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
/// ### aspectMask
/// [VarHandle][#VH_aspectMask] - [Getter][#aspectMask()] - [Setter][#aspectMask(int)]
/// ### imageGranularity
/// [Byte offset][#OFFSET_imageGranularity] - [Memory layout][#ML_imageGranularity] - [Getter][#imageGranularity()] - [Setter][#imageGranularity(java.lang.foreign.MemorySegment)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSparseImageFormatProperties {
///     VkImageAspectFlags aspectMask;
///     VkExtent3D imageGranularity;
///     VkSparseImageFormatFlags flags;
/// } VkSparseImageFormatProperties;
/// ```
public sealed class VkSparseImageFormatProperties extends Struct {
    /// The struct layout of `VkSparseImageFormatProperties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("aspectMask"),
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("imageGranularity"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    /// The [VarHandle] of `aspectMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspectMask"));
    /// The byte offset of `imageGranularity`.
    public static final long OFFSET_imageGranularity = LAYOUT.byteOffset(PathElement.groupElement("imageGranularity"));
    /// The memory layout of `imageGranularity`.
    public static final MemoryLayout ML_imageGranularity = LAYOUT.select(PathElement.groupElement("imageGranularity"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    /// Creates `VkSparseImageFormatProperties` with the given segment.
    /// @param segment the memory segment
    public VkSparseImageFormatProperties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSparseImageFormatProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseImageFormatProperties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSparseImageFormatProperties(segment); }

    /// Creates `VkSparseImageFormatProperties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSparseImageFormatProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseImageFormatProperties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSparseImageFormatProperties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSparseImageFormatProperties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSparseImageFormatProperties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSparseImageFormatProperties`
    public static VkSparseImageFormatProperties alloc(SegmentAllocator allocator) { return new VkSparseImageFormatProperties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSparseImageFormatProperties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSparseImageFormatProperties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSparseImageFormatProperties` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSparseImageFormatProperties`
    public static VkSparseImageFormatProperties allocInit(SegmentAllocator allocator, @CType("VkImageAspectFlags") int aspectMask, @CType("VkExtent3D") java.lang.foreign.MemorySegment imageGranularity, @CType("VkSparseImageFormatFlags") int flags) { return alloc(allocator).aspectMask(aspectMask).imageGranularity(imageGranularity).flags(flags); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSparseImageFormatProperties copyFrom(VkSparseImageFormatProperties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `aspectMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageAspectFlags") int get_aspectMask(MemorySegment segment, long index) { return (int) VH_aspectMask.get(segment, 0L, index); }
    /// {@return `aspectMask`}
    /// @param segment the segment of the struct
    public static @CType("VkImageAspectFlags") int get_aspectMask(MemorySegment segment) { return VkSparseImageFormatProperties.get_aspectMask(segment, 0L); }
    /// {@return `aspectMask`}
    public @CType("VkImageAspectFlags") int aspectMask() { return VkSparseImageFormatProperties.get_aspectMask(this.segment()); }
    /// Sets `aspectMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_aspectMask(MemorySegment segment, long index, @CType("VkImageAspectFlags") int value) { VH_aspectMask.set(segment, 0L, index, value); }
    /// Sets `aspectMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_aspectMask(MemorySegment segment, @CType("VkImageAspectFlags") int value) { VkSparseImageFormatProperties.set_aspectMask(segment, 0L, value); }
    /// Sets `aspectMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageFormatProperties aspectMask(@CType("VkImageAspectFlags") int value) { VkSparseImageFormatProperties.set_aspectMask(this.segment(), value); return this; }

    /// {@return `imageGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent3D") java.lang.foreign.MemorySegment get_imageGranularity(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageGranularity, index), ML_imageGranularity); }
    /// {@return `imageGranularity`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent3D") java.lang.foreign.MemorySegment get_imageGranularity(MemorySegment segment) { return VkSparseImageFormatProperties.get_imageGranularity(segment, 0L); }
    /// {@return `imageGranularity`}
    public @CType("VkExtent3D") java.lang.foreign.MemorySegment imageGranularity() { return VkSparseImageFormatProperties.get_imageGranularity(this.segment()); }
    /// Sets `imageGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageGranularity(MemorySegment segment, long index, @CType("VkExtent3D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageGranularity, index), ML_imageGranularity.byteSize()); }
    /// Sets `imageGranularity` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageGranularity(MemorySegment segment, @CType("VkExtent3D") java.lang.foreign.MemorySegment value) { VkSparseImageFormatProperties.set_imageGranularity(segment, 0L, value); }
    /// Sets `imageGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageFormatProperties imageGranularity(@CType("VkExtent3D") java.lang.foreign.MemorySegment value) { VkSparseImageFormatProperties.set_imageGranularity(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSparseImageFormatFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkSparseImageFormatFlags") int get_flags(MemorySegment segment) { return VkSparseImageFormatProperties.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkSparseImageFormatFlags") int flags() { return VkSparseImageFormatProperties.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkSparseImageFormatFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkSparseImageFormatFlags") int value) { VkSparseImageFormatProperties.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageFormatProperties flags(@CType("VkSparseImageFormatFlags") int value) { VkSparseImageFormatProperties.set_flags(this.segment(), value); return this; }

    /// A buffer of [VkSparseImageFormatProperties].
    public static final class Buffer extends VkSparseImageFormatProperties {
        private final long elementCount;

        /// Creates `VkSparseImageFormatProperties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSparseImageFormatProperties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSparseImageFormatProperties`
        public VkSparseImageFormatProperties asSlice(long index) { return new VkSparseImageFormatProperties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSparseImageFormatProperties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSparseImageFormatProperties`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `aspectMask` at the given index}
        /// @param index the index
        public @CType("VkImageAspectFlags") int aspectMaskAt(long index) { return VkSparseImageFormatProperties.get_aspectMask(this.segment(), index); }
        /// Sets `aspectMask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer aspectMaskAt(long index, @CType("VkImageAspectFlags") int value) { VkSparseImageFormatProperties.set_aspectMask(this.segment(), index, value); return this; }

        /// {@return `imageGranularity` at the given index}
        /// @param index the index
        public @CType("VkExtent3D") java.lang.foreign.MemorySegment imageGranularityAt(long index) { return VkSparseImageFormatProperties.get_imageGranularity(this.segment(), index); }
        /// Sets `imageGranularity` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer imageGranularityAt(long index, @CType("VkExtent3D") java.lang.foreign.MemorySegment value) { VkSparseImageFormatProperties.set_imageGranularity(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkSparseImageFormatFlags") int flagsAt(long index) { return VkSparseImageFormatProperties.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkSparseImageFormatFlags") int value) { VkSparseImageFormatProperties.set_flags(this.segment(), index, value); return this; }

    }
}

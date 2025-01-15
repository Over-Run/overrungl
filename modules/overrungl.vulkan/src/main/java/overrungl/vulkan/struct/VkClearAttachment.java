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
/// ### colorAttachment
/// [VarHandle][#VH_colorAttachment] - [Getter][#colorAttachment()] - [Setter][#colorAttachment(int)]
/// ### clearValue
/// [Byte offset][#OFFSET_clearValue] - [Memory layout][#ML_clearValue] - [Getter][#clearValue()] - [Setter][#clearValue(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkClearAttachment {
///     VkImageAspectFlags aspectMask;
///     uint32_t colorAttachment;
///     VkClearValue clearValue;
/// } VkClearAttachment;
/// ```
public sealed class VkClearAttachment extends Struct {
    /// The struct layout of `VkClearAttachment`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("aspectMask"),
        ValueLayout.JAVA_INT.withName("colorAttachment"),
        overrungl.vulkan.union.VkClearValue.LAYOUT.withName("clearValue")
    );
    /// The [VarHandle] of `aspectMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_aspectMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("aspectMask"));
    /// The [VarHandle] of `colorAttachment` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_colorAttachment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("colorAttachment"));
    /// The byte offset of `clearValue`.
    public static final long OFFSET_clearValue = LAYOUT.byteOffset(PathElement.groupElement("clearValue"));
    /// The memory layout of `clearValue`.
    public static final MemoryLayout ML_clearValue = LAYOUT.select(PathElement.groupElement("clearValue"));

    /// Creates `VkClearAttachment` with the given segment.
    /// @param segment the memory segment
    public VkClearAttachment(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkClearAttachment` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClearAttachment of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkClearAttachment(segment); }

    /// Creates `VkClearAttachment` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkClearAttachment` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClearAttachment ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkClearAttachment(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkClearAttachment` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkClearAttachment` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkClearAttachment`
    public static VkClearAttachment alloc(SegmentAllocator allocator) { return new VkClearAttachment(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkClearAttachment` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkClearAttachment`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkClearAttachment` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkClearAttachment`
    public static VkClearAttachment allocInit(SegmentAllocator allocator, @CType("VkImageAspectFlags") int aspectMask, @CType("uint32_t") int colorAttachment, @CType("VkClearValue") java.lang.foreign.MemorySegment clearValue) { return alloc(allocator).aspectMask(aspectMask).colorAttachment(colorAttachment).clearValue(clearValue); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkClearAttachment copyFrom(VkClearAttachment src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `aspectMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageAspectFlags") int get_aspectMask(MemorySegment segment, long index) { return (int) VH_aspectMask.get(segment, 0L, index); }
    /// {@return `aspectMask`}
    /// @param segment the segment of the struct
    public static @CType("VkImageAspectFlags") int get_aspectMask(MemorySegment segment) { return VkClearAttachment.get_aspectMask(segment, 0L); }
    /// {@return `aspectMask`}
    public @CType("VkImageAspectFlags") int aspectMask() { return VkClearAttachment.get_aspectMask(this.segment()); }
    /// Sets `aspectMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_aspectMask(MemorySegment segment, long index, @CType("VkImageAspectFlags") int value) { VH_aspectMask.set(segment, 0L, index, value); }
    /// Sets `aspectMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_aspectMask(MemorySegment segment, @CType("VkImageAspectFlags") int value) { VkClearAttachment.set_aspectMask(segment, 0L, value); }
    /// Sets `aspectMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearAttachment aspectMask(@CType("VkImageAspectFlags") int value) { VkClearAttachment.set_aspectMask(this.segment(), value); return this; }

    /// {@return `colorAttachment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_colorAttachment(MemorySegment segment, long index) { return (int) VH_colorAttachment.get(segment, 0L, index); }
    /// {@return `colorAttachment`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_colorAttachment(MemorySegment segment) { return VkClearAttachment.get_colorAttachment(segment, 0L); }
    /// {@return `colorAttachment`}
    public @CType("uint32_t") int colorAttachment() { return VkClearAttachment.get_colorAttachment(this.segment()); }
    /// Sets `colorAttachment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_colorAttachment(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_colorAttachment.set(segment, 0L, index, value); }
    /// Sets `colorAttachment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_colorAttachment(MemorySegment segment, @CType("uint32_t") int value) { VkClearAttachment.set_colorAttachment(segment, 0L, value); }
    /// Sets `colorAttachment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearAttachment colorAttachment(@CType("uint32_t") int value) { VkClearAttachment.set_colorAttachment(this.segment(), value); return this; }

    /// {@return `clearValue` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkClearValue") java.lang.foreign.MemorySegment get_clearValue(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_clearValue, index), ML_clearValue); }
    /// {@return `clearValue`}
    /// @param segment the segment of the struct
    public static @CType("VkClearValue") java.lang.foreign.MemorySegment get_clearValue(MemorySegment segment) { return VkClearAttachment.get_clearValue(segment, 0L); }
    /// {@return `clearValue`}
    public @CType("VkClearValue") java.lang.foreign.MemorySegment clearValue() { return VkClearAttachment.get_clearValue(this.segment()); }
    /// Sets `clearValue` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_clearValue(MemorySegment segment, long index, @CType("VkClearValue") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_clearValue, index), ML_clearValue.byteSize()); }
    /// Sets `clearValue` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_clearValue(MemorySegment segment, @CType("VkClearValue") java.lang.foreign.MemorySegment value) { VkClearAttachment.set_clearValue(segment, 0L, value); }
    /// Sets `clearValue` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearAttachment clearValue(@CType("VkClearValue") java.lang.foreign.MemorySegment value) { VkClearAttachment.set_clearValue(this.segment(), value); return this; }

    /// A buffer of [VkClearAttachment].
    public static final class Buffer extends VkClearAttachment {
        private final long elementCount;

        /// Creates `VkClearAttachment.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkClearAttachment`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkClearAttachment`
        public VkClearAttachment asSlice(long index) { return new VkClearAttachment(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkClearAttachment`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkClearAttachment`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `aspectMask` at the given index}
        /// @param index the index
        public @CType("VkImageAspectFlags") int aspectMaskAt(long index) { return VkClearAttachment.get_aspectMask(this.segment(), index); }
        /// Sets `aspectMask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer aspectMaskAt(long index, @CType("VkImageAspectFlags") int value) { VkClearAttachment.set_aspectMask(this.segment(), index, value); return this; }

        /// {@return `colorAttachment` at the given index}
        /// @param index the index
        public @CType("uint32_t") int colorAttachmentAt(long index) { return VkClearAttachment.get_colorAttachment(this.segment(), index); }
        /// Sets `colorAttachment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer colorAttachmentAt(long index, @CType("uint32_t") int value) { VkClearAttachment.set_colorAttachment(this.segment(), index, value); return this; }

        /// {@return `clearValue` at the given index}
        /// @param index the index
        public @CType("VkClearValue") java.lang.foreign.MemorySegment clearValueAt(long index) { return VkClearAttachment.get_clearValue(this.segment(), index); }
        /// Sets `clearValue` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer clearValueAt(long index, @CType("VkClearValue") java.lang.foreign.MemorySegment value) { VkClearAttachment.set_clearValue(this.segment(), index, value); return this; }

    }
}

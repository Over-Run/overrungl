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
/// ### attachment
/// [VarHandle][#VH_attachment] - [Getter][#attachment()] - [Setter][#attachment(int)]
/// ### layout
/// [VarHandle][#VH_layout] - [Getter][#layout()] - [Setter][#layout(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAttachmentReference {
///     uint32_t attachment;
///     VkImageLayout layout;
/// } VkAttachmentReference;
/// ```
public sealed class VkAttachmentReference extends Struct {
    /// The struct layout of `VkAttachmentReference`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("attachment"),
        ValueLayout.JAVA_INT.withName("layout")
    );
    /// The [VarHandle] of `attachment` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_attachment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("attachment"));
    /// The [VarHandle] of `layout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_layout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layout"));

    /// Creates `VkAttachmentReference` with the given segment.
    /// @param segment the memory segment
    public VkAttachmentReference(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAttachmentReference` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentReference of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAttachmentReference(segment); }

    /// Creates `VkAttachmentReference` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAttachmentReference` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAttachmentReference ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAttachmentReference(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAttachmentReference` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkAttachmentReference` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAttachmentReference`
    public static VkAttachmentReference alloc(SegmentAllocator allocator) { return new VkAttachmentReference(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAttachmentReference` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAttachmentReference`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAttachmentReference` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAttachmentReference`
    public static VkAttachmentReference allocInit(SegmentAllocator allocator, @CType("uint32_t") int attachment, @CType("VkImageLayout") int layout) { return alloc(allocator).attachment(attachment).layout(layout); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAttachmentReference copyFrom(VkAttachmentReference src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `attachment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_attachment(MemorySegment segment, long index) { return (int) VH_attachment.get(segment, 0L, index); }
    /// {@return `attachment`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_attachment(MemorySegment segment) { return VkAttachmentReference.get_attachment(segment, 0L); }
    /// {@return `attachment`}
    public @CType("uint32_t") int attachment() { return VkAttachmentReference.get_attachment(this.segment()); }
    /// Sets `attachment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_attachment(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_attachment.set(segment, 0L, index, value); }
    /// Sets `attachment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_attachment(MemorySegment segment, @CType("uint32_t") int value) { VkAttachmentReference.set_attachment(segment, 0L, value); }
    /// Sets `attachment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentReference attachment(@CType("uint32_t") int value) { VkAttachmentReference.set_attachment(this.segment(), value); return this; }

    /// {@return `layout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageLayout") int get_layout(MemorySegment segment, long index) { return (int) VH_layout.get(segment, 0L, index); }
    /// {@return `layout`}
    /// @param segment the segment of the struct
    public static @CType("VkImageLayout") int get_layout(MemorySegment segment) { return VkAttachmentReference.get_layout(segment, 0L); }
    /// {@return `layout`}
    public @CType("VkImageLayout") int layout() { return VkAttachmentReference.get_layout(this.segment()); }
    /// Sets `layout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_layout(MemorySegment segment, long index, @CType("VkImageLayout") int value) { VH_layout.set(segment, 0L, index, value); }
    /// Sets `layout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_layout(MemorySegment segment, @CType("VkImageLayout") int value) { VkAttachmentReference.set_layout(segment, 0L, value); }
    /// Sets `layout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAttachmentReference layout(@CType("VkImageLayout") int value) { VkAttachmentReference.set_layout(this.segment(), value); return this; }

    /// A buffer of [VkAttachmentReference].
    public static final class Buffer extends VkAttachmentReference {
        private final long elementCount;

        /// Creates `VkAttachmentReference.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAttachmentReference`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkAttachmentReference`
        public VkAttachmentReference asSlice(long index) { return new VkAttachmentReference(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAttachmentReference`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkAttachmentReference`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `attachment` at the given index}
        /// @param index the index
        public @CType("uint32_t") int attachmentAt(long index) { return VkAttachmentReference.get_attachment(this.segment(), index); }
        /// Sets `attachment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer attachmentAt(long index, @CType("uint32_t") int value) { VkAttachmentReference.set_attachment(this.segment(), index, value); return this; }

        /// {@return `layout` at the given index}
        /// @param index the index
        public @CType("VkImageLayout") int layoutAt(long index) { return VkAttachmentReference.get_layout(this.segment(), index); }
        /// Sets `layout` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer layoutAt(long index, @CType("VkImageLayout") int value) { VkAttachmentReference.set_layout(this.segment(), index, value); return this; }

    }
}

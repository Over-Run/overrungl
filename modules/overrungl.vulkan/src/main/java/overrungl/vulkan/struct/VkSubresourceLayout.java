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
/// ### offset
/// [VarHandle][#VH_offset] - [Getter][#offset()] - [Setter][#offset(long)]
/// ### size
/// [VarHandle][#VH_size] - [Getter][#size()] - [Setter][#size(long)]
/// ### rowPitch
/// [VarHandle][#VH_rowPitch] - [Getter][#rowPitch()] - [Setter][#rowPitch(long)]
/// ### arrayPitch
/// [VarHandle][#VH_arrayPitch] - [Getter][#arrayPitch()] - [Setter][#arrayPitch(long)]
/// ### depthPitch
/// [VarHandle][#VH_depthPitch] - [Getter][#depthPitch()] - [Setter][#depthPitch(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSubresourceLayout {
///     VkDeviceSize offset;
///     VkDeviceSize size;
///     VkDeviceSize rowPitch;
///     VkDeviceSize arrayPitch;
///     VkDeviceSize depthPitch;
/// } VkSubresourceLayout;
/// ```
public sealed class VkSubresourceLayout extends Struct {
    /// The struct layout of `VkSubresourceLayout`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_LONG.withName("rowPitch"),
        ValueLayout.JAVA_LONG.withName("arrayPitch"),
        ValueLayout.JAVA_LONG.withName("depthPitch")
    );
    /// The [VarHandle] of `offset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    /// The [VarHandle] of `rowPitch` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_rowPitch = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rowPitch"));
    /// The [VarHandle] of `arrayPitch` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_arrayPitch = LAYOUT.arrayElementVarHandle(PathElement.groupElement("arrayPitch"));
    /// The [VarHandle] of `depthPitch` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_depthPitch = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthPitch"));

    /// Creates `VkSubresourceLayout` with the given segment.
    /// @param segment the memory segment
    public VkSubresourceLayout(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSubresourceLayout` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubresourceLayout of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSubresourceLayout(segment); }

    /// Creates `VkSubresourceLayout` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSubresourceLayout` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubresourceLayout ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSubresourceLayout(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSubresourceLayout` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSubresourceLayout` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubresourceLayout`
    public static VkSubresourceLayout alloc(SegmentAllocator allocator) { return new VkSubresourceLayout(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSubresourceLayout` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSubresourceLayout`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSubresourceLayout` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubresourceLayout`
    public static VkSubresourceLayout allocInit(SegmentAllocator allocator, @CType("VkDeviceSize") long offset, @CType("VkDeviceSize") long size, @CType("VkDeviceSize") long rowPitch, @CType("VkDeviceSize") long arrayPitch, @CType("VkDeviceSize") long depthPitch) { return alloc(allocator).offset(offset).size(size).rowPitch(rowPitch).arrayPitch(arrayPitch).depthPitch(depthPitch); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSubresourceLayout copyFrom(VkSubresourceLayout src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_offset(MemorySegment segment, long index) { return (long) VH_offset.get(segment, 0L, index); }
    /// {@return `offset`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_offset(MemorySegment segment) { return VkSubresourceLayout.get_offset(segment, 0L); }
    /// {@return `offset`}
    public @CType("VkDeviceSize") long offset() { return VkSubresourceLayout.get_offset(this.segment()); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_offset(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_offset.set(segment, 0L, index, value); }
    /// Sets `offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_offset(MemorySegment segment, @CType("VkDeviceSize") long value) { VkSubresourceLayout.set_offset(segment, 0L, value); }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubresourceLayout offset(@CType("VkDeviceSize") long value) { VkSubresourceLayout.set_offset(this.segment(), value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment, long index) { return (long) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment) { return VkSubresourceLayout.get_size(segment, 0L); }
    /// {@return `size`}
    public @CType("VkDeviceSize") long size() { return VkSubresourceLayout.get_size(this.segment()); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_size(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_size(MemorySegment segment, @CType("VkDeviceSize") long value) { VkSubresourceLayout.set_size(segment, 0L, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubresourceLayout size(@CType("VkDeviceSize") long value) { VkSubresourceLayout.set_size(this.segment(), value); return this; }

    /// {@return `rowPitch` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_rowPitch(MemorySegment segment, long index) { return (long) VH_rowPitch.get(segment, 0L, index); }
    /// {@return `rowPitch`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_rowPitch(MemorySegment segment) { return VkSubresourceLayout.get_rowPitch(segment, 0L); }
    /// {@return `rowPitch`}
    public @CType("VkDeviceSize") long rowPitch() { return VkSubresourceLayout.get_rowPitch(this.segment()); }
    /// Sets `rowPitch` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_rowPitch(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_rowPitch.set(segment, 0L, index, value); }
    /// Sets `rowPitch` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_rowPitch(MemorySegment segment, @CType("VkDeviceSize") long value) { VkSubresourceLayout.set_rowPitch(segment, 0L, value); }
    /// Sets `rowPitch` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubresourceLayout rowPitch(@CType("VkDeviceSize") long value) { VkSubresourceLayout.set_rowPitch(this.segment(), value); return this; }

    /// {@return `arrayPitch` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_arrayPitch(MemorySegment segment, long index) { return (long) VH_arrayPitch.get(segment, 0L, index); }
    /// {@return `arrayPitch`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_arrayPitch(MemorySegment segment) { return VkSubresourceLayout.get_arrayPitch(segment, 0L); }
    /// {@return `arrayPitch`}
    public @CType("VkDeviceSize") long arrayPitch() { return VkSubresourceLayout.get_arrayPitch(this.segment()); }
    /// Sets `arrayPitch` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_arrayPitch(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_arrayPitch.set(segment, 0L, index, value); }
    /// Sets `arrayPitch` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_arrayPitch(MemorySegment segment, @CType("VkDeviceSize") long value) { VkSubresourceLayout.set_arrayPitch(segment, 0L, value); }
    /// Sets `arrayPitch` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubresourceLayout arrayPitch(@CType("VkDeviceSize") long value) { VkSubresourceLayout.set_arrayPitch(this.segment(), value); return this; }

    /// {@return `depthPitch` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_depthPitch(MemorySegment segment, long index) { return (long) VH_depthPitch.get(segment, 0L, index); }
    /// {@return `depthPitch`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_depthPitch(MemorySegment segment) { return VkSubresourceLayout.get_depthPitch(segment, 0L); }
    /// {@return `depthPitch`}
    public @CType("VkDeviceSize") long depthPitch() { return VkSubresourceLayout.get_depthPitch(this.segment()); }
    /// Sets `depthPitch` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthPitch(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_depthPitch.set(segment, 0L, index, value); }
    /// Sets `depthPitch` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthPitch(MemorySegment segment, @CType("VkDeviceSize") long value) { VkSubresourceLayout.set_depthPitch(segment, 0L, value); }
    /// Sets `depthPitch` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubresourceLayout depthPitch(@CType("VkDeviceSize") long value) { VkSubresourceLayout.set_depthPitch(this.segment(), value); return this; }

    /// A buffer of [VkSubresourceLayout].
    public static final class Buffer extends VkSubresourceLayout {
        private final long elementCount;

        /// Creates `VkSubresourceLayout.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSubresourceLayout`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSubresourceLayout`
        public VkSubresourceLayout asSlice(long index) { return new VkSubresourceLayout(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSubresourceLayout`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSubresourceLayout`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `offset` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long offsetAt(long index) { return VkSubresourceLayout.get_offset(this.segment(), index); }
        /// Sets `offset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer offsetAt(long index, @CType("VkDeviceSize") long value) { VkSubresourceLayout.set_offset(this.segment(), index, value); return this; }

        /// {@return `size` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long sizeAt(long index) { return VkSubresourceLayout.get_size(this.segment(), index); }
        /// Sets `size` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sizeAt(long index, @CType("VkDeviceSize") long value) { VkSubresourceLayout.set_size(this.segment(), index, value); return this; }

        /// {@return `rowPitch` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long rowPitchAt(long index) { return VkSubresourceLayout.get_rowPitch(this.segment(), index); }
        /// Sets `rowPitch` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer rowPitchAt(long index, @CType("VkDeviceSize") long value) { VkSubresourceLayout.set_rowPitch(this.segment(), index, value); return this; }

        /// {@return `arrayPitch` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long arrayPitchAt(long index) { return VkSubresourceLayout.get_arrayPitch(this.segment(), index); }
        /// Sets `arrayPitch` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer arrayPitchAt(long index, @CType("VkDeviceSize") long value) { VkSubresourceLayout.set_arrayPitch(this.segment(), index, value); return this; }

        /// {@return `depthPitch` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long depthPitchAt(long index) { return VkSubresourceLayout.get_depthPitch(this.segment(), index); }
        /// Sets `depthPitch` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer depthPitchAt(long index, @CType("VkDeviceSize") long value) { VkSubresourceLayout.set_depthPitch(this.segment(), index, value); return this; }

    }
}

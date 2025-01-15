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
/// ### xcoeff
/// [VarHandle][#VH_xcoeff] - [Getter][#xcoeff()] - [Setter][#xcoeff(float)]
/// ### ycoeff
/// [VarHandle][#VH_ycoeff] - [Getter][#ycoeff()] - [Setter][#ycoeff(float)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkViewportWScalingNV {
///     float xcoeff;
///     float ycoeff;
/// } VkViewportWScalingNV;
/// ```
public sealed class VkViewportWScalingNV extends Struct {
    /// The struct layout of `VkViewportWScalingNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_FLOAT.withName("xcoeff"),
        ValueLayout.JAVA_FLOAT.withName("ycoeff")
    );
    /// The [VarHandle] of `xcoeff` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_xcoeff = LAYOUT.arrayElementVarHandle(PathElement.groupElement("xcoeff"));
    /// The [VarHandle] of `ycoeff` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_ycoeff = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ycoeff"));

    /// Creates `VkViewportWScalingNV` with the given segment.
    /// @param segment the memory segment
    public VkViewportWScalingNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkViewportWScalingNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkViewportWScalingNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkViewportWScalingNV(segment); }

    /// Creates `VkViewportWScalingNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkViewportWScalingNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkViewportWScalingNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkViewportWScalingNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkViewportWScalingNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkViewportWScalingNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkViewportWScalingNV`
    public static VkViewportWScalingNV alloc(SegmentAllocator allocator) { return new VkViewportWScalingNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkViewportWScalingNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkViewportWScalingNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkViewportWScalingNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkViewportWScalingNV`
    public static VkViewportWScalingNV allocInit(SegmentAllocator allocator, @CType("float") float xcoeff, @CType("float") float ycoeff) { return alloc(allocator).xcoeff(xcoeff).ycoeff(ycoeff); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkViewportWScalingNV copyFrom(VkViewportWScalingNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `xcoeff` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_xcoeff(MemorySegment segment, long index) { return (float) VH_xcoeff.get(segment, 0L, index); }
    /// {@return `xcoeff`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_xcoeff(MemorySegment segment) { return VkViewportWScalingNV.get_xcoeff(segment, 0L); }
    /// {@return `xcoeff`}
    public @CType("float") float xcoeff() { return VkViewportWScalingNV.get_xcoeff(this.segment()); }
    /// Sets `xcoeff` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_xcoeff(MemorySegment segment, long index, @CType("float") float value) { VH_xcoeff.set(segment, 0L, index, value); }
    /// Sets `xcoeff` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_xcoeff(MemorySegment segment, @CType("float") float value) { VkViewportWScalingNV.set_xcoeff(segment, 0L, value); }
    /// Sets `xcoeff` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViewportWScalingNV xcoeff(@CType("float") float value) { VkViewportWScalingNV.set_xcoeff(this.segment(), value); return this; }

    /// {@return `ycoeff` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_ycoeff(MemorySegment segment, long index) { return (float) VH_ycoeff.get(segment, 0L, index); }
    /// {@return `ycoeff`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_ycoeff(MemorySegment segment) { return VkViewportWScalingNV.get_ycoeff(segment, 0L); }
    /// {@return `ycoeff`}
    public @CType("float") float ycoeff() { return VkViewportWScalingNV.get_ycoeff(this.segment()); }
    /// Sets `ycoeff` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ycoeff(MemorySegment segment, long index, @CType("float") float value) { VH_ycoeff.set(segment, 0L, index, value); }
    /// Sets `ycoeff` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ycoeff(MemorySegment segment, @CType("float") float value) { VkViewportWScalingNV.set_ycoeff(segment, 0L, value); }
    /// Sets `ycoeff` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViewportWScalingNV ycoeff(@CType("float") float value) { VkViewportWScalingNV.set_ycoeff(this.segment(), value); return this; }

    /// A buffer of [VkViewportWScalingNV].
    public static final class Buffer extends VkViewportWScalingNV {
        private final long elementCount;

        /// Creates `VkViewportWScalingNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkViewportWScalingNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkViewportWScalingNV`
        public VkViewportWScalingNV asSlice(long index) { return new VkViewportWScalingNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkViewportWScalingNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkViewportWScalingNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `xcoeff` at the given index}
        /// @param index the index
        public @CType("float") float xcoeffAt(long index) { return VkViewportWScalingNV.get_xcoeff(this.segment(), index); }
        /// Sets `xcoeff` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer xcoeffAt(long index, @CType("float") float value) { VkViewportWScalingNV.set_xcoeff(this.segment(), index, value); return this; }

        /// {@return `ycoeff` at the given index}
        /// @param index the index
        public @CType("float") float ycoeffAt(long index) { return VkViewportWScalingNV.get_ycoeff(this.segment(), index); }
        /// Sets `ycoeff` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer ycoeffAt(long index, @CType("float") float value) { VkViewportWScalingNV.set_ycoeff(this.segment(), index, value); return this; }

    }
}

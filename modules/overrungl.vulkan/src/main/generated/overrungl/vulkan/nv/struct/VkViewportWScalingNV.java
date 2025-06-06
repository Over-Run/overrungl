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
//@formatter:off
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkViewportWScalingNV {
///     float xcoeff;
///     float ycoeff;
/// };
/// ```
public sealed class VkViewportWScalingNV extends GroupType {
    /// The struct layout of `VkViewportWScalingNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_FLOAT.withName("xcoeff"),
        ValueLayout.JAVA_FLOAT.withName("ycoeff")
    );
    /// The byte offset of `xcoeff`.
    public static final long OFFSET_xcoeff = LAYOUT.byteOffset(PathElement.groupElement("xcoeff"));
    /// The memory layout of `xcoeff`.
    public static final MemoryLayout LAYOUT_xcoeff = LAYOUT.select(PathElement.groupElement("xcoeff"));
    /// The [VarHandle] of `xcoeff` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_xcoeff = LAYOUT.arrayElementVarHandle(PathElement.groupElement("xcoeff"));
    /// The byte offset of `ycoeff`.
    public static final long OFFSET_ycoeff = LAYOUT.byteOffset(PathElement.groupElement("ycoeff"));
    /// The memory layout of `ycoeff`.
    public static final MemoryLayout LAYOUT_ycoeff = LAYOUT.select(PathElement.groupElement("ycoeff"));
    /// The [VarHandle] of `ycoeff` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_ycoeff = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ycoeff"));

    /// Creates `VkViewportWScalingNV` with the given segment.
    /// @param segment the memory segment
    public VkViewportWScalingNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkViewportWScalingNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkViewportWScalingNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkViewportWScalingNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkViewportWScalingNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkViewportWScalingNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkViewportWScalingNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkViewportWScalingNV`
    public static VkViewportWScalingNV alloc(SegmentAllocator allocator) { return new VkViewportWScalingNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkViewportWScalingNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkViewportWScalingNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkViewportWScalingNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param xcoeff `xcoeff`
    /// @param ycoeff `ycoeff`
    /// @return the allocated `VkViewportWScalingNV`
    public static VkViewportWScalingNV allocInit(SegmentAllocator allocator, float xcoeff, float ycoeff) {
        return alloc(allocator).xcoeff(xcoeff).ycoeff(ycoeff);
    }

    /// Allocates a `VkViewportWScalingNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param xcoeff `xcoeff`
    /// @return the allocated `VkViewportWScalingNV`
    public static VkViewportWScalingNV allocInit(SegmentAllocator allocator, float xcoeff) {
        return alloc(allocator).xcoeff(xcoeff);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkViewportWScalingNV copyFrom(VkViewportWScalingNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `xcoeff` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float xcoeff(MemorySegment segment, long index) { return (float) VH_xcoeff.get(segment, 0L, index); }
    /// {@return `xcoeff`}
    public float xcoeff() { return xcoeff(this.segment(), 0L); }
    /// Sets `xcoeff` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void xcoeff(MemorySegment segment, long index, float value) { VH_xcoeff.set(segment, 0L, index, value); }
    /// Sets `xcoeff` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViewportWScalingNV xcoeff(float value) { xcoeff(this.segment(), 0L, value); return this; }

    /// {@return `ycoeff` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static float ycoeff(MemorySegment segment, long index) { return (float) VH_ycoeff.get(segment, 0L, index); }
    /// {@return `ycoeff`}
    public float ycoeff() { return ycoeff(this.segment(), 0L); }
    /// Sets `ycoeff` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void ycoeff(MemorySegment segment, long index, float value) { VH_ycoeff.set(segment, 0L, index, value); }
    /// Sets `ycoeff` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViewportWScalingNV ycoeff(float value) { ycoeff(this.segment(), 0L, value); return this; }

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
        /// @param index the index of the struct buffer
        public float xcoeffAt(long index) { return xcoeff(this.segment(), index); }
        /// Sets `xcoeff` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer xcoeffAt(long index, float value) { xcoeff(this.segment(), index, value); return this; }

        /// {@return `ycoeff` at the given index}
        /// @param index the index of the struct buffer
        public float ycoeffAt(long index) { return ycoeff(this.segment(), index); }
        /// Sets `ycoeff` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer ycoeffAt(long index, float value) { ycoeff(this.segment(), index, value); return this; }

    }
}

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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkColorBlendAdvancedEXT {
///     (int) VkBlendOp advancedBlendOp;
///     (uint32_t) VkBool32 srcPremultiplied;
///     (uint32_t) VkBool32 dstPremultiplied;
///     (int) VkBlendOverlapEXT blendOverlap;
///     (uint32_t) VkBool32 clampResults;
/// };
/// ```
public sealed class VkColorBlendAdvancedEXT extends GroupType {
    /// The struct layout of `VkColorBlendAdvancedEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("advancedBlendOp"),
        ValueLayout.JAVA_INT.withName("srcPremultiplied"),
        ValueLayout.JAVA_INT.withName("dstPremultiplied"),
        ValueLayout.JAVA_INT.withName("blendOverlap"),
        ValueLayout.JAVA_INT.withName("clampResults")
    );
    /// The byte offset of `advancedBlendOp`.
    public static final long OFFSET_advancedBlendOp = LAYOUT.byteOffset(PathElement.groupElement("advancedBlendOp"));
    /// The memory layout of `advancedBlendOp`.
    public static final MemoryLayout LAYOUT_advancedBlendOp = LAYOUT.select(PathElement.groupElement("advancedBlendOp"));
    /// The [VarHandle] of `advancedBlendOp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_advancedBlendOp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("advancedBlendOp"));
    /// The byte offset of `srcPremultiplied`.
    public static final long OFFSET_srcPremultiplied = LAYOUT.byteOffset(PathElement.groupElement("srcPremultiplied"));
    /// The memory layout of `srcPremultiplied`.
    public static final MemoryLayout LAYOUT_srcPremultiplied = LAYOUT.select(PathElement.groupElement("srcPremultiplied"));
    /// The [VarHandle] of `srcPremultiplied` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcPremultiplied = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcPremultiplied"));
    /// The byte offset of `dstPremultiplied`.
    public static final long OFFSET_dstPremultiplied = LAYOUT.byteOffset(PathElement.groupElement("dstPremultiplied"));
    /// The memory layout of `dstPremultiplied`.
    public static final MemoryLayout LAYOUT_dstPremultiplied = LAYOUT.select(PathElement.groupElement("dstPremultiplied"));
    /// The [VarHandle] of `dstPremultiplied` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstPremultiplied = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstPremultiplied"));
    /// The byte offset of `blendOverlap`.
    public static final long OFFSET_blendOverlap = LAYOUT.byteOffset(PathElement.groupElement("blendOverlap"));
    /// The memory layout of `blendOverlap`.
    public static final MemoryLayout LAYOUT_blendOverlap = LAYOUT.select(PathElement.groupElement("blendOverlap"));
    /// The [VarHandle] of `blendOverlap` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_blendOverlap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blendOverlap"));
    /// The byte offset of `clampResults`.
    public static final long OFFSET_clampResults = LAYOUT.byteOffset(PathElement.groupElement("clampResults"));
    /// The memory layout of `clampResults`.
    public static final MemoryLayout LAYOUT_clampResults = LAYOUT.select(PathElement.groupElement("clampResults"));
    /// The [VarHandle] of `clampResults` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_clampResults = LAYOUT.arrayElementVarHandle(PathElement.groupElement("clampResults"));

    /// Creates `VkColorBlendAdvancedEXT` with the given segment.
    /// @param segment the memory segment
    public VkColorBlendAdvancedEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkColorBlendAdvancedEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkColorBlendAdvancedEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkColorBlendAdvancedEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkColorBlendAdvancedEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkColorBlendAdvancedEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkColorBlendAdvancedEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkColorBlendAdvancedEXT`
    public static VkColorBlendAdvancedEXT alloc(SegmentAllocator allocator) { return new VkColorBlendAdvancedEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkColorBlendAdvancedEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkColorBlendAdvancedEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkColorBlendAdvancedEXT copyFrom(VkColorBlendAdvancedEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `advancedBlendOp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int advancedBlendOp(MemorySegment segment, long index) { return (int) VH_advancedBlendOp.get(segment, 0L, index); }
    /// {@return `advancedBlendOp`}
    public int advancedBlendOp() { return advancedBlendOp(this.segment(), 0L); }
    /// Sets `advancedBlendOp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void advancedBlendOp(MemorySegment segment, long index, int value) { VH_advancedBlendOp.set(segment, 0L, index, value); }
    /// Sets `advancedBlendOp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkColorBlendAdvancedEXT advancedBlendOp(int value) { advancedBlendOp(this.segment(), 0L, value); return this; }

    /// {@return `srcPremultiplied` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int srcPremultiplied(MemorySegment segment, long index) { return (int) VH_srcPremultiplied.get(segment, 0L, index); }
    /// {@return `srcPremultiplied`}
    public int srcPremultiplied() { return srcPremultiplied(this.segment(), 0L); }
    /// Sets `srcPremultiplied` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcPremultiplied(MemorySegment segment, long index, int value) { VH_srcPremultiplied.set(segment, 0L, index, value); }
    /// Sets `srcPremultiplied` with the given value.
    /// @param value the value
    /// @return `this`
    public VkColorBlendAdvancedEXT srcPremultiplied(int value) { srcPremultiplied(this.segment(), 0L, value); return this; }

    /// {@return `dstPremultiplied` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dstPremultiplied(MemorySegment segment, long index) { return (int) VH_dstPremultiplied.get(segment, 0L, index); }
    /// {@return `dstPremultiplied`}
    public int dstPremultiplied() { return dstPremultiplied(this.segment(), 0L); }
    /// Sets `dstPremultiplied` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstPremultiplied(MemorySegment segment, long index, int value) { VH_dstPremultiplied.set(segment, 0L, index, value); }
    /// Sets `dstPremultiplied` with the given value.
    /// @param value the value
    /// @return `this`
    public VkColorBlendAdvancedEXT dstPremultiplied(int value) { dstPremultiplied(this.segment(), 0L, value); return this; }

    /// {@return `blendOverlap` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int blendOverlap(MemorySegment segment, long index) { return (int) VH_blendOverlap.get(segment, 0L, index); }
    /// {@return `blendOverlap`}
    public int blendOverlap() { return blendOverlap(this.segment(), 0L); }
    /// Sets `blendOverlap` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void blendOverlap(MemorySegment segment, long index, int value) { VH_blendOverlap.set(segment, 0L, index, value); }
    /// Sets `blendOverlap` with the given value.
    /// @param value the value
    /// @return `this`
    public VkColorBlendAdvancedEXT blendOverlap(int value) { blendOverlap(this.segment(), 0L, value); return this; }

    /// {@return `clampResults` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int clampResults(MemorySegment segment, long index) { return (int) VH_clampResults.get(segment, 0L, index); }
    /// {@return `clampResults`}
    public int clampResults() { return clampResults(this.segment(), 0L); }
    /// Sets `clampResults` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void clampResults(MemorySegment segment, long index, int value) { VH_clampResults.set(segment, 0L, index, value); }
    /// Sets `clampResults` with the given value.
    /// @param value the value
    /// @return `this`
    public VkColorBlendAdvancedEXT clampResults(int value) { clampResults(this.segment(), 0L, value); return this; }

    /// A buffer of [VkColorBlendAdvancedEXT].
    public static final class Buffer extends VkColorBlendAdvancedEXT {
        private final long elementCount;

        /// Creates `VkColorBlendAdvancedEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkColorBlendAdvancedEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkColorBlendAdvancedEXT`
        public VkColorBlendAdvancedEXT asSlice(long index) { return new VkColorBlendAdvancedEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkColorBlendAdvancedEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkColorBlendAdvancedEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `advancedBlendOp` at the given index}
        /// @param index the index of the struct buffer
        public int advancedBlendOpAt(long index) { return advancedBlendOp(this.segment(), index); }
        /// Sets `advancedBlendOp` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer advancedBlendOpAt(long index, int value) { advancedBlendOp(this.segment(), index, value); return this; }

        /// {@return `srcPremultiplied` at the given index}
        /// @param index the index of the struct buffer
        public int srcPremultipliedAt(long index) { return srcPremultiplied(this.segment(), index); }
        /// Sets `srcPremultiplied` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcPremultipliedAt(long index, int value) { srcPremultiplied(this.segment(), index, value); return this; }

        /// {@return `dstPremultiplied` at the given index}
        /// @param index the index of the struct buffer
        public int dstPremultipliedAt(long index) { return dstPremultiplied(this.segment(), index); }
        /// Sets `dstPremultiplied` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstPremultipliedAt(long index, int value) { dstPremultiplied(this.segment(), index, value); return this; }

        /// {@return `blendOverlap` at the given index}
        /// @param index the index of the struct buffer
        public int blendOverlapAt(long index) { return blendOverlap(this.segment(), index); }
        /// Sets `blendOverlap` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer blendOverlapAt(long index, int value) { blendOverlap(this.segment(), index, value); return this; }

        /// {@return `clampResults` at the given index}
        /// @param index the index of the struct buffer
        public int clampResultsAt(long index) { return clampResults(this.segment(), index); }
        /// Sets `clampResults` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer clampResultsAt(long index, int value) { clampResults(this.segment(), index, value); return this; }

    }
}

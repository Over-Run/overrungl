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
/// struct VkSwapchainPresentScalingCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkPresentScalingFlagsEXT scalingBehavior;
///     VkPresentGravityFlagsEXT presentGravityX;
///     VkPresentGravityFlagsEXT presentGravityY;
/// };
/// ```
public sealed class VkSwapchainPresentScalingCreateInfoEXT extends GroupType {
    /// The struct layout of `VkSwapchainPresentScalingCreateInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("scalingBehavior"),
        ValueLayout.JAVA_INT.withName("presentGravityX"),
        ValueLayout.JAVA_INT.withName("presentGravityY")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `scalingBehavior`.
    public static final long OFFSET_scalingBehavior = LAYOUT.byteOffset(PathElement.groupElement("scalingBehavior"));
    /// The memory layout of `scalingBehavior`.
    public static final MemoryLayout LAYOUT_scalingBehavior = LAYOUT.select(PathElement.groupElement("scalingBehavior"));
    /// The [VarHandle] of `scalingBehavior` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_scalingBehavior = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scalingBehavior"));
    /// The byte offset of `presentGravityX`.
    public static final long OFFSET_presentGravityX = LAYOUT.byteOffset(PathElement.groupElement("presentGravityX"));
    /// The memory layout of `presentGravityX`.
    public static final MemoryLayout LAYOUT_presentGravityX = LAYOUT.select(PathElement.groupElement("presentGravityX"));
    /// The [VarHandle] of `presentGravityX` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_presentGravityX = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentGravityX"));
    /// The byte offset of `presentGravityY`.
    public static final long OFFSET_presentGravityY = LAYOUT.byteOffset(PathElement.groupElement("presentGravityY"));
    /// The memory layout of `presentGravityY`.
    public static final MemoryLayout LAYOUT_presentGravityY = LAYOUT.select(PathElement.groupElement("presentGravityY"));
    /// The [VarHandle] of `presentGravityY` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_presentGravityY = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentGravityY"));

    /// Creates `VkSwapchainPresentScalingCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkSwapchainPresentScalingCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSwapchainPresentScalingCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSwapchainPresentScalingCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSwapchainPresentScalingCreateInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSwapchainPresentScalingCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSwapchainPresentScalingCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSwapchainPresentScalingCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSwapchainPresentScalingCreateInfoEXT`
    public static VkSwapchainPresentScalingCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkSwapchainPresentScalingCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSwapchainPresentScalingCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSwapchainPresentScalingCreateInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoEXT copyFrom(VkSwapchainPresentScalingCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `scalingBehavior` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int scalingBehavior(MemorySegment segment, long index) { return (int) VH_scalingBehavior.get(segment, 0L, index); }
    /// {@return `scalingBehavior`}
    public int scalingBehavior() { return scalingBehavior(this.segment(), 0L); }
    /// Sets `scalingBehavior` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void scalingBehavior(MemorySegment segment, long index, int value) { VH_scalingBehavior.set(segment, 0L, index, value); }
    /// Sets `scalingBehavior` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoEXT scalingBehavior(int value) { scalingBehavior(this.segment(), 0L, value); return this; }

    /// {@return `presentGravityX` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int presentGravityX(MemorySegment segment, long index) { return (int) VH_presentGravityX.get(segment, 0L, index); }
    /// {@return `presentGravityX`}
    public int presentGravityX() { return presentGravityX(this.segment(), 0L); }
    /// Sets `presentGravityX` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void presentGravityX(MemorySegment segment, long index, int value) { VH_presentGravityX.set(segment, 0L, index, value); }
    /// Sets `presentGravityX` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoEXT presentGravityX(int value) { presentGravityX(this.segment(), 0L, value); return this; }

    /// {@return `presentGravityY` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int presentGravityY(MemorySegment segment, long index) { return (int) VH_presentGravityY.get(segment, 0L, index); }
    /// {@return `presentGravityY`}
    public int presentGravityY() { return presentGravityY(this.segment(), 0L); }
    /// Sets `presentGravityY` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void presentGravityY(MemorySegment segment, long index, int value) { VH_presentGravityY.set(segment, 0L, index, value); }
    /// Sets `presentGravityY` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoEXT presentGravityY(int value) { presentGravityY(this.segment(), 0L, value); return this; }

    /// A buffer of [VkSwapchainPresentScalingCreateInfoEXT].
    public static final class Buffer extends VkSwapchainPresentScalingCreateInfoEXT {
        private final long elementCount;

        /// Creates `VkSwapchainPresentScalingCreateInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSwapchainPresentScalingCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSwapchainPresentScalingCreateInfoEXT`
        public VkSwapchainPresentScalingCreateInfoEXT asSlice(long index) { return new VkSwapchainPresentScalingCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSwapchainPresentScalingCreateInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSwapchainPresentScalingCreateInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `scalingBehavior` at the given index}
        /// @param index the index of the struct buffer
        public int scalingBehaviorAt(long index) { return scalingBehavior(this.segment(), index); }
        /// Sets `scalingBehavior` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer scalingBehaviorAt(long index, int value) { scalingBehavior(this.segment(), index, value); return this; }

        /// {@return `presentGravityX` at the given index}
        /// @param index the index of the struct buffer
        public int presentGravityXAt(long index) { return presentGravityX(this.segment(), index); }
        /// Sets `presentGravityX` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer presentGravityXAt(long index, int value) { presentGravityX(this.segment(), index, value); return this; }

        /// {@return `presentGravityY` at the given index}
        /// @param index the index of the struct buffer
        public int presentGravityYAt(long index) { return presentGravityY(this.segment(), index); }
        /// Sets `presentGravityY` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer presentGravityYAt(long index, int value) { presentGravityY(this.segment(), index, value); return this; }

    }
}

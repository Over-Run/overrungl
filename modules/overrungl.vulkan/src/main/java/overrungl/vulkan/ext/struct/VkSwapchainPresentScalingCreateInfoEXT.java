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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### scalingBehavior
/// [VarHandle][#VH_scalingBehavior] - [Getter][#scalingBehavior()] - [Setter][#scalingBehavior(int)]
/// ### presentGravityX
/// [VarHandle][#VH_presentGravityX] - [Getter][#presentGravityX()] - [Setter][#presentGravityX(int)]
/// ### presentGravityY
/// [VarHandle][#VH_presentGravityY] - [Getter][#presentGravityY()] - [Setter][#presentGravityY(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSwapchainPresentScalingCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkPresentScalingFlagsEXT scalingBehavior;
///     VkPresentGravityFlagsEXT presentGravityX;
///     VkPresentGravityFlagsEXT presentGravityY;
/// } VkSwapchainPresentScalingCreateInfoEXT;
/// ```
public sealed class VkSwapchainPresentScalingCreateInfoEXT extends Struct {
    /// The struct layout of `VkSwapchainPresentScalingCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("scalingBehavior"),
        ValueLayout.JAVA_INT.withName("presentGravityX"),
        ValueLayout.JAVA_INT.withName("presentGravityY")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `scalingBehavior` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_scalingBehavior = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scalingBehavior"));
    /// The [VarHandle] of `presentGravityX` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_presentGravityX = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentGravityX"));
    /// The [VarHandle] of `presentGravityY` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_presentGravityY = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentGravityY"));

    /// Creates `VkSwapchainPresentScalingCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkSwapchainPresentScalingCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSwapchainPresentScalingCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSwapchainPresentScalingCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSwapchainPresentScalingCreateInfoEXT(segment); }

    /// Creates `VkSwapchainPresentScalingCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSwapchainPresentScalingCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSwapchainPresentScalingCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSwapchainPresentScalingCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSwapchainPresentScalingCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSwapchainPresentScalingCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSwapchainPresentScalingCreateInfoEXT`
    public static VkSwapchainPresentScalingCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkSwapchainPresentScalingCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSwapchainPresentScalingCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSwapchainPresentScalingCreateInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSwapchainPresentScalingCreateInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSwapchainPresentScalingCreateInfoEXT`
    public static VkSwapchainPresentScalingCreateInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkPresentScalingFlagsEXT") int scalingBehavior, @CType("VkPresentGravityFlagsEXT") int presentGravityX, @CType("VkPresentGravityFlagsEXT") int presentGravityY) { return alloc(allocator).sType(sType).pNext(pNext).scalingBehavior(scalingBehavior).presentGravityX(presentGravityX).presentGravityY(presentGravityY); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoEXT copyFrom(VkSwapchainPresentScalingCreateInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSwapchainPresentScalingCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSwapchainPresentScalingCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSwapchainPresentScalingCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoEXT sType(@CType("VkStructureType") int value) { VkSwapchainPresentScalingCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSwapchainPresentScalingCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkSwapchainPresentScalingCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSwapchainPresentScalingCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkSwapchainPresentScalingCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `scalingBehavior` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPresentScalingFlagsEXT") int get_scalingBehavior(MemorySegment segment, long index) { return (int) VH_scalingBehavior.get(segment, 0L, index); }
    /// {@return `scalingBehavior`}
    /// @param segment the segment of the struct
    public static @CType("VkPresentScalingFlagsEXT") int get_scalingBehavior(MemorySegment segment) { return VkSwapchainPresentScalingCreateInfoEXT.get_scalingBehavior(segment, 0L); }
    /// {@return `scalingBehavior`}
    public @CType("VkPresentScalingFlagsEXT") int scalingBehavior() { return VkSwapchainPresentScalingCreateInfoEXT.get_scalingBehavior(this.segment()); }
    /// Sets `scalingBehavior` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_scalingBehavior(MemorySegment segment, long index, @CType("VkPresentScalingFlagsEXT") int value) { VH_scalingBehavior.set(segment, 0L, index, value); }
    /// Sets `scalingBehavior` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_scalingBehavior(MemorySegment segment, @CType("VkPresentScalingFlagsEXT") int value) { VkSwapchainPresentScalingCreateInfoEXT.set_scalingBehavior(segment, 0L, value); }
    /// Sets `scalingBehavior` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoEXT scalingBehavior(@CType("VkPresentScalingFlagsEXT") int value) { VkSwapchainPresentScalingCreateInfoEXT.set_scalingBehavior(this.segment(), value); return this; }

    /// {@return `presentGravityX` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPresentGravityFlagsEXT") int get_presentGravityX(MemorySegment segment, long index) { return (int) VH_presentGravityX.get(segment, 0L, index); }
    /// {@return `presentGravityX`}
    /// @param segment the segment of the struct
    public static @CType("VkPresentGravityFlagsEXT") int get_presentGravityX(MemorySegment segment) { return VkSwapchainPresentScalingCreateInfoEXT.get_presentGravityX(segment, 0L); }
    /// {@return `presentGravityX`}
    public @CType("VkPresentGravityFlagsEXT") int presentGravityX() { return VkSwapchainPresentScalingCreateInfoEXT.get_presentGravityX(this.segment()); }
    /// Sets `presentGravityX` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_presentGravityX(MemorySegment segment, long index, @CType("VkPresentGravityFlagsEXT") int value) { VH_presentGravityX.set(segment, 0L, index, value); }
    /// Sets `presentGravityX` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_presentGravityX(MemorySegment segment, @CType("VkPresentGravityFlagsEXT") int value) { VkSwapchainPresentScalingCreateInfoEXT.set_presentGravityX(segment, 0L, value); }
    /// Sets `presentGravityX` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoEXT presentGravityX(@CType("VkPresentGravityFlagsEXT") int value) { VkSwapchainPresentScalingCreateInfoEXT.set_presentGravityX(this.segment(), value); return this; }

    /// {@return `presentGravityY` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPresentGravityFlagsEXT") int get_presentGravityY(MemorySegment segment, long index) { return (int) VH_presentGravityY.get(segment, 0L, index); }
    /// {@return `presentGravityY`}
    /// @param segment the segment of the struct
    public static @CType("VkPresentGravityFlagsEXT") int get_presentGravityY(MemorySegment segment) { return VkSwapchainPresentScalingCreateInfoEXT.get_presentGravityY(segment, 0L); }
    /// {@return `presentGravityY`}
    public @CType("VkPresentGravityFlagsEXT") int presentGravityY() { return VkSwapchainPresentScalingCreateInfoEXT.get_presentGravityY(this.segment()); }
    /// Sets `presentGravityY` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_presentGravityY(MemorySegment segment, long index, @CType("VkPresentGravityFlagsEXT") int value) { VH_presentGravityY.set(segment, 0L, index, value); }
    /// Sets `presentGravityY` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_presentGravityY(MemorySegment segment, @CType("VkPresentGravityFlagsEXT") int value) { VkSwapchainPresentScalingCreateInfoEXT.set_presentGravityY(segment, 0L, value); }
    /// Sets `presentGravityY` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSwapchainPresentScalingCreateInfoEXT presentGravityY(@CType("VkPresentGravityFlagsEXT") int value) { VkSwapchainPresentScalingCreateInfoEXT.set_presentGravityY(this.segment(), value); return this; }

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
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkSwapchainPresentScalingCreateInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkSwapchainPresentScalingCreateInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSwapchainPresentScalingCreateInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSwapchainPresentScalingCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `scalingBehavior` at the given index}
        /// @param index the index
        public @CType("VkPresentScalingFlagsEXT") int scalingBehaviorAt(long index) { return VkSwapchainPresentScalingCreateInfoEXT.get_scalingBehavior(this.segment(), index); }
        /// Sets `scalingBehavior` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer scalingBehaviorAt(long index, @CType("VkPresentScalingFlagsEXT") int value) { VkSwapchainPresentScalingCreateInfoEXT.set_scalingBehavior(this.segment(), index, value); return this; }

        /// {@return `presentGravityX` at the given index}
        /// @param index the index
        public @CType("VkPresentGravityFlagsEXT") int presentGravityXAt(long index) { return VkSwapchainPresentScalingCreateInfoEXT.get_presentGravityX(this.segment(), index); }
        /// Sets `presentGravityX` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer presentGravityXAt(long index, @CType("VkPresentGravityFlagsEXT") int value) { VkSwapchainPresentScalingCreateInfoEXT.set_presentGravityX(this.segment(), index, value); return this; }

        /// {@return `presentGravityY` at the given index}
        /// @param index the index
        public @CType("VkPresentGravityFlagsEXT") int presentGravityYAt(long index) { return VkSwapchainPresentScalingCreateInfoEXT.get_presentGravityY(this.segment(), index); }
        /// Sets `presentGravityY` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer presentGravityYAt(long index, @CType("VkPresentGravityFlagsEXT") int value) { VkSwapchainPresentScalingCreateInfoEXT.set_presentGravityY(this.segment(), index, value); return this; }

    }
}

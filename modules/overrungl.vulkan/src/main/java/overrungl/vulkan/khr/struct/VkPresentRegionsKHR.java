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
package overrungl.vulkan.khr.struct;

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
/// ### swapchainCount
/// [VarHandle][#VH_swapchainCount] - [Getter][#swapchainCount()] - [Setter][#swapchainCount(int)]
/// ### pRegions
/// [VarHandle][#VH_pRegions] - [Getter][#pRegions()] - [Setter][#pRegions(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPresentRegionsKHR {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t swapchainCount;
///     const VkPresentRegionKHR * pRegions;
/// } VkPresentRegionsKHR;
/// ```
public sealed class VkPresentRegionsKHR extends Struct {
    /// The struct layout of `VkPresentRegionsKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withName("pRegions")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `swapchainCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_swapchainCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapchainCount"));
    /// The [VarHandle] of `pRegions` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pRegions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRegions"));

    /// Creates `VkPresentRegionsKHR` with the given segment.
    /// @param segment the memory segment
    public VkPresentRegionsKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPresentRegionsKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentRegionsKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPresentRegionsKHR(segment); }

    /// Creates `VkPresentRegionsKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPresentRegionsKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentRegionsKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPresentRegionsKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPresentRegionsKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPresentRegionsKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPresentRegionsKHR`
    public static VkPresentRegionsKHR alloc(SegmentAllocator allocator) { return new VkPresentRegionsKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPresentRegionsKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPresentRegionsKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPresentRegionsKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPresentRegionsKHR`
    public static VkPresentRegionsKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int swapchainCount, @CType("const VkPresentRegionKHR *") java.lang.foreign.MemorySegment pRegions) { return alloc(allocator).sType(sType).pNext(pNext).swapchainCount(swapchainCount).pRegions(pRegions); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPresentRegionsKHR copyFrom(VkPresentRegionsKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPresentRegionsKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPresentRegionsKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPresentRegionsKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentRegionsKHR sType(@CType("VkStructureType") int value) { VkPresentRegionsKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPresentRegionsKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPresentRegionsKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPresentRegionsKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentRegionsKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPresentRegionsKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `swapchainCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_swapchainCount(MemorySegment segment, long index) { return (int) VH_swapchainCount.get(segment, 0L, index); }
    /// {@return `swapchainCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_swapchainCount(MemorySegment segment) { return VkPresentRegionsKHR.get_swapchainCount(segment, 0L); }
    /// {@return `swapchainCount`}
    public @CType("uint32_t") int swapchainCount() { return VkPresentRegionsKHR.get_swapchainCount(this.segment()); }
    /// Sets `swapchainCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_swapchainCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_swapchainCount.set(segment, 0L, index, value); }
    /// Sets `swapchainCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_swapchainCount(MemorySegment segment, @CType("uint32_t") int value) { VkPresentRegionsKHR.set_swapchainCount(segment, 0L, value); }
    /// Sets `swapchainCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentRegionsKHR swapchainCount(@CType("uint32_t") int value) { VkPresentRegionsKHR.set_swapchainCount(this.segment(), value); return this; }

    /// {@return `pRegions` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkPresentRegionKHR *") java.lang.foreign.MemorySegment get_pRegions(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pRegions.get(segment, 0L, index); }
    /// {@return `pRegions`}
    /// @param segment the segment of the struct
    public static @CType("const VkPresentRegionKHR *") java.lang.foreign.MemorySegment get_pRegions(MemorySegment segment) { return VkPresentRegionsKHR.get_pRegions(segment, 0L); }
    /// {@return `pRegions`}
    public @CType("const VkPresentRegionKHR *") java.lang.foreign.MemorySegment pRegions() { return VkPresentRegionsKHR.get_pRegions(this.segment()); }
    /// Sets `pRegions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pRegions(MemorySegment segment, long index, @CType("const VkPresentRegionKHR *") java.lang.foreign.MemorySegment value) { VH_pRegions.set(segment, 0L, index, value); }
    /// Sets `pRegions` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pRegions(MemorySegment segment, @CType("const VkPresentRegionKHR *") java.lang.foreign.MemorySegment value) { VkPresentRegionsKHR.set_pRegions(segment, 0L, value); }
    /// Sets `pRegions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentRegionsKHR pRegions(@CType("const VkPresentRegionKHR *") java.lang.foreign.MemorySegment value) { VkPresentRegionsKHR.set_pRegions(this.segment(), value); return this; }

    /// A buffer of [VkPresentRegionsKHR].
    public static final class Buffer extends VkPresentRegionsKHR {
        private final long elementCount;

        /// Creates `VkPresentRegionsKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPresentRegionsKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPresentRegionsKHR`
        public VkPresentRegionsKHR asSlice(long index) { return new VkPresentRegionsKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPresentRegionsKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPresentRegionsKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkPresentRegionsKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkPresentRegionsKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPresentRegionsKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPresentRegionsKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `swapchainCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int swapchainCountAt(long index) { return VkPresentRegionsKHR.get_swapchainCount(this.segment(), index); }
        /// Sets `swapchainCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer swapchainCountAt(long index, @CType("uint32_t") int value) { VkPresentRegionsKHR.set_swapchainCount(this.segment(), index, value); return this; }

        /// {@return `pRegions` at the given index}
        /// @param index the index
        public @CType("const VkPresentRegionKHR *") java.lang.foreign.MemorySegment pRegionsAt(long index) { return VkPresentRegionsKHR.get_pRegions(this.segment(), index); }
        /// Sets `pRegions` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pRegionsAt(long index, @CType("const VkPresentRegionKHR *") java.lang.foreign.MemorySegment value) { VkPresentRegionsKHR.set_pRegions(this.segment(), index, value); return this; }

    }
}

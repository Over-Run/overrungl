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
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### presentModeCount
/// [VarHandle][#VH_presentModeCount] - [Getter][#presentModeCount()] - [Setter][#presentModeCount(int)]
/// ### pPresentModes
/// [VarHandle][#VH_pPresentModes] - [Getter][#pPresentModes()] - [Setter][#pPresentModes(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkLatencySurfaceCapabilitiesNV {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t presentModeCount;
///     VkPresentModeKHR * pPresentModes;
/// } VkLatencySurfaceCapabilitiesNV;
/// ```
public sealed class VkLatencySurfaceCapabilitiesNV extends Struct {
    /// The struct layout of `VkLatencySurfaceCapabilitiesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("presentModeCount"),
        ValueLayout.ADDRESS.withName("pPresentModes")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `presentModeCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_presentModeCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentModeCount"));
    /// The [VarHandle] of `pPresentModes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pPresentModes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPresentModes"));

    /// Creates `VkLatencySurfaceCapabilitiesNV` with the given segment.
    /// @param segment the memory segment
    public VkLatencySurfaceCapabilitiesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkLatencySurfaceCapabilitiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLatencySurfaceCapabilitiesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkLatencySurfaceCapabilitiesNV(segment); }

    /// Creates `VkLatencySurfaceCapabilitiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkLatencySurfaceCapabilitiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLatencySurfaceCapabilitiesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkLatencySurfaceCapabilitiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkLatencySurfaceCapabilitiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkLatencySurfaceCapabilitiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkLatencySurfaceCapabilitiesNV`
    public static VkLatencySurfaceCapabilitiesNV alloc(SegmentAllocator allocator) { return new VkLatencySurfaceCapabilitiesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkLatencySurfaceCapabilitiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkLatencySurfaceCapabilitiesNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkLatencySurfaceCapabilitiesNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkLatencySurfaceCapabilitiesNV`
    public static VkLatencySurfaceCapabilitiesNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("uint32_t") int presentModeCount, @CType("VkPresentModeKHR *") MemorySegment pPresentModes) { return alloc(allocator).sType(sType).pNext(pNext).presentModeCount(presentModeCount).pPresentModes(pPresentModes); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkLatencySurfaceCapabilitiesNV copyFrom(VkLatencySurfaceCapabilitiesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkLatencySurfaceCapabilitiesNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkLatencySurfaceCapabilitiesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkLatencySurfaceCapabilitiesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencySurfaceCapabilitiesNV sType(@CType("VkStructureType") int value) { VkLatencySurfaceCapabilitiesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkLatencySurfaceCapabilitiesNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkLatencySurfaceCapabilitiesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkLatencySurfaceCapabilitiesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencySurfaceCapabilitiesNV pNext(@CType("const void *") MemorySegment value) { VkLatencySurfaceCapabilitiesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `presentModeCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_presentModeCount(MemorySegment segment, long index) { return (int) VH_presentModeCount.get(segment, 0L, index); }
    /// {@return `presentModeCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_presentModeCount(MemorySegment segment) { return VkLatencySurfaceCapabilitiesNV.get_presentModeCount(segment, 0L); }
    /// {@return `presentModeCount`}
    public @CType("uint32_t") int presentModeCount() { return VkLatencySurfaceCapabilitiesNV.get_presentModeCount(this.segment()); }
    /// Sets `presentModeCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_presentModeCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_presentModeCount.set(segment, 0L, index, value); }
    /// Sets `presentModeCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_presentModeCount(MemorySegment segment, @CType("uint32_t") int value) { VkLatencySurfaceCapabilitiesNV.set_presentModeCount(segment, 0L, value); }
    /// Sets `presentModeCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencySurfaceCapabilitiesNV presentModeCount(@CType("uint32_t") int value) { VkLatencySurfaceCapabilitiesNV.set_presentModeCount(this.segment(), value); return this; }

    /// {@return `pPresentModes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPresentModeKHR *") MemorySegment get_pPresentModes(MemorySegment segment, long index) { return (MemorySegment) VH_pPresentModes.get(segment, 0L, index); }
    /// {@return `pPresentModes`}
    /// @param segment the segment of the struct
    public static @CType("VkPresentModeKHR *") MemorySegment get_pPresentModes(MemorySegment segment) { return VkLatencySurfaceCapabilitiesNV.get_pPresentModes(segment, 0L); }
    /// {@return `pPresentModes`}
    public @CType("VkPresentModeKHR *") MemorySegment pPresentModes() { return VkLatencySurfaceCapabilitiesNV.get_pPresentModes(this.segment()); }
    /// Sets `pPresentModes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pPresentModes(MemorySegment segment, long index, @CType("VkPresentModeKHR *") MemorySegment value) { VH_pPresentModes.set(segment, 0L, index, value); }
    /// Sets `pPresentModes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pPresentModes(MemorySegment segment, @CType("VkPresentModeKHR *") MemorySegment value) { VkLatencySurfaceCapabilitiesNV.set_pPresentModes(segment, 0L, value); }
    /// Sets `pPresentModes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencySurfaceCapabilitiesNV pPresentModes(@CType("VkPresentModeKHR *") MemorySegment value) { VkLatencySurfaceCapabilitiesNV.set_pPresentModes(this.segment(), value); return this; }

    /// A buffer of [VkLatencySurfaceCapabilitiesNV].
    public static final class Buffer extends VkLatencySurfaceCapabilitiesNV {
        private final long elementCount;

        /// Creates `VkLatencySurfaceCapabilitiesNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkLatencySurfaceCapabilitiesNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkLatencySurfaceCapabilitiesNV`
        public VkLatencySurfaceCapabilitiesNV asSlice(long index) { return new VkLatencySurfaceCapabilitiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkLatencySurfaceCapabilitiesNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkLatencySurfaceCapabilitiesNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkLatencySurfaceCapabilitiesNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkLatencySurfaceCapabilitiesNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkLatencySurfaceCapabilitiesNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkLatencySurfaceCapabilitiesNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `presentModeCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int presentModeCountAt(long index) { return VkLatencySurfaceCapabilitiesNV.get_presentModeCount(this.segment(), index); }
        /// Sets `presentModeCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer presentModeCountAt(long index, @CType("uint32_t") int value) { VkLatencySurfaceCapabilitiesNV.set_presentModeCount(this.segment(), index, value); return this; }

        /// {@return `pPresentModes` at the given index}
        /// @param index the index
        public @CType("VkPresentModeKHR *") MemorySegment pPresentModesAt(long index) { return VkLatencySurfaceCapabilitiesNV.get_pPresentModes(this.segment(), index); }
        /// Sets `pPresentModes` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pPresentModesAt(long index, @CType("VkPresentModeKHR *") MemorySegment value) { VkLatencySurfaceCapabilitiesNV.set_pPresentModes(this.segment(), index, value); return this; }

    }
}

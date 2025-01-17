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
/// ### sampleLocationsPerPixel
/// [VarHandle][#VH_sampleLocationsPerPixel] - [Getter][#sampleLocationsPerPixel()] - [Setter][#sampleLocationsPerPixel(int)]
/// ### sampleLocationGridSize
/// [Byte offset][#OFFSET_sampleLocationGridSize] - [Memory layout][#ML_sampleLocationGridSize] - [Getter][#sampleLocationGridSize()] - [Setter][#sampleLocationGridSize(java.lang.foreign.MemorySegment)]
/// ### sampleLocationsCount
/// [VarHandle][#VH_sampleLocationsCount] - [Getter][#sampleLocationsCount()] - [Setter][#sampleLocationsCount(int)]
/// ### pSampleLocations
/// [VarHandle][#VH_pSampleLocations] - [Getter][#pSampleLocations()] - [Setter][#pSampleLocations(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSampleLocationsInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkSampleCountFlagBits sampleLocationsPerPixel;
///     VkExtent2D sampleLocationGridSize;
///     uint32_t sampleLocationsCount;
///     const VkSampleLocationEXT * pSampleLocations;
/// } VkSampleLocationsInfoEXT;
/// ```
public sealed class VkSampleLocationsInfoEXT extends Struct {
    /// The struct layout of `VkSampleLocationsInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sampleLocationsPerPixel"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("sampleLocationGridSize"),
        ValueLayout.JAVA_INT.withName("sampleLocationsCount"),
        ValueLayout.ADDRESS.withName("pSampleLocations")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `sampleLocationsPerPixel` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sampleLocationsPerPixel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsPerPixel"));
    /// The byte offset of `sampleLocationGridSize`.
    public static final long OFFSET_sampleLocationGridSize = LAYOUT.byteOffset(PathElement.groupElement("sampleLocationGridSize"));
    /// The memory layout of `sampleLocationGridSize`.
    public static final MemoryLayout ML_sampleLocationGridSize = LAYOUT.select(PathElement.groupElement("sampleLocationGridSize"));
    /// The [VarHandle] of `sampleLocationsCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sampleLocationsCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleLocationsCount"));
    /// The [VarHandle] of `pSampleLocations` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pSampleLocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSampleLocations"));

    /// Creates `VkSampleLocationsInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkSampleLocationsInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSampleLocationsInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSampleLocationsInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSampleLocationsInfoEXT(segment); }

    /// Creates `VkSampleLocationsInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSampleLocationsInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSampleLocationsInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSampleLocationsInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSampleLocationsInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSampleLocationsInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSampleLocationsInfoEXT`
    public static VkSampleLocationsInfoEXT alloc(SegmentAllocator allocator) { return new VkSampleLocationsInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSampleLocationsInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSampleLocationsInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSampleLocationsInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSampleLocationsInfoEXT`
    public static VkSampleLocationsInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkSampleCountFlagBits") int sampleLocationsPerPixel, @CType("VkExtent2D") java.lang.foreign.MemorySegment sampleLocationGridSize, @CType("uint32_t") int sampleLocationsCount, @CType("const VkSampleLocationEXT *") java.lang.foreign.MemorySegment pSampleLocations) { return alloc(allocator).sType(sType).pNext(pNext).sampleLocationsPerPixel(sampleLocationsPerPixel).sampleLocationGridSize(sampleLocationGridSize).sampleLocationsCount(sampleLocationsCount).pSampleLocations(pSampleLocations); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSampleLocationsInfoEXT copyFrom(VkSampleLocationsInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSampleLocationsInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSampleLocationsInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSampleLocationsInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSampleLocationsInfoEXT sType(@CType("VkStructureType") int value) { VkSampleLocationsInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSampleLocationsInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkSampleLocationsInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSampleLocationsInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSampleLocationsInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkSampleLocationsInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `sampleLocationsPerPixel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampleCountFlagBits") int get_sampleLocationsPerPixel(MemorySegment segment, long index) { return (int) VH_sampleLocationsPerPixel.get(segment, 0L, index); }
    /// {@return `sampleLocationsPerPixel`}
    /// @param segment the segment of the struct
    public static @CType("VkSampleCountFlagBits") int get_sampleLocationsPerPixel(MemorySegment segment) { return VkSampleLocationsInfoEXT.get_sampleLocationsPerPixel(segment, 0L); }
    /// {@return `sampleLocationsPerPixel`}
    public @CType("VkSampleCountFlagBits") int sampleLocationsPerPixel() { return VkSampleLocationsInfoEXT.get_sampleLocationsPerPixel(this.segment()); }
    /// Sets `sampleLocationsPerPixel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sampleLocationsPerPixel(MemorySegment segment, long index, @CType("VkSampleCountFlagBits") int value) { VH_sampleLocationsPerPixel.set(segment, 0L, index, value); }
    /// Sets `sampleLocationsPerPixel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sampleLocationsPerPixel(MemorySegment segment, @CType("VkSampleCountFlagBits") int value) { VkSampleLocationsInfoEXT.set_sampleLocationsPerPixel(segment, 0L, value); }
    /// Sets `sampleLocationsPerPixel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSampleLocationsInfoEXT sampleLocationsPerPixel(@CType("VkSampleCountFlagBits") int value) { VkSampleLocationsInfoEXT.set_sampleLocationsPerPixel(this.segment(), value); return this; }

    /// {@return `sampleLocationGridSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_sampleLocationGridSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_sampleLocationGridSize, index), ML_sampleLocationGridSize); }
    /// {@return `sampleLocationGridSize`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_sampleLocationGridSize(MemorySegment segment) { return VkSampleLocationsInfoEXT.get_sampleLocationGridSize(segment, 0L); }
    /// {@return `sampleLocationGridSize`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment sampleLocationGridSize() { return VkSampleLocationsInfoEXT.get_sampleLocationGridSize(this.segment()); }
    /// Sets `sampleLocationGridSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sampleLocationGridSize(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_sampleLocationGridSize, index), ML_sampleLocationGridSize.byteSize()); }
    /// Sets `sampleLocationGridSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sampleLocationGridSize(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkSampleLocationsInfoEXT.set_sampleLocationGridSize(segment, 0L, value); }
    /// Sets `sampleLocationGridSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSampleLocationsInfoEXT sampleLocationGridSize(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkSampleLocationsInfoEXT.set_sampleLocationGridSize(this.segment(), value); return this; }

    /// {@return `sampleLocationsCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_sampleLocationsCount(MemorySegment segment, long index) { return (int) VH_sampleLocationsCount.get(segment, 0L, index); }
    /// {@return `sampleLocationsCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_sampleLocationsCount(MemorySegment segment) { return VkSampleLocationsInfoEXT.get_sampleLocationsCount(segment, 0L); }
    /// {@return `sampleLocationsCount`}
    public @CType("uint32_t") int sampleLocationsCount() { return VkSampleLocationsInfoEXT.get_sampleLocationsCount(this.segment()); }
    /// Sets `sampleLocationsCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sampleLocationsCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_sampleLocationsCount.set(segment, 0L, index, value); }
    /// Sets `sampleLocationsCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sampleLocationsCount(MemorySegment segment, @CType("uint32_t") int value) { VkSampleLocationsInfoEXT.set_sampleLocationsCount(segment, 0L, value); }
    /// Sets `sampleLocationsCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSampleLocationsInfoEXT sampleLocationsCount(@CType("uint32_t") int value) { VkSampleLocationsInfoEXT.set_sampleLocationsCount(this.segment(), value); return this; }

    /// {@return `pSampleLocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSampleLocationEXT *") java.lang.foreign.MemorySegment get_pSampleLocations(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pSampleLocations.get(segment, 0L, index); }
    /// {@return `pSampleLocations`}
    /// @param segment the segment of the struct
    public static @CType("const VkSampleLocationEXT *") java.lang.foreign.MemorySegment get_pSampleLocations(MemorySegment segment) { return VkSampleLocationsInfoEXT.get_pSampleLocations(segment, 0L); }
    /// {@return `pSampleLocations`}
    public @CType("const VkSampleLocationEXT *") java.lang.foreign.MemorySegment pSampleLocations() { return VkSampleLocationsInfoEXT.get_pSampleLocations(this.segment()); }
    /// Sets `pSampleLocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSampleLocations(MemorySegment segment, long index, @CType("const VkSampleLocationEXT *") java.lang.foreign.MemorySegment value) { VH_pSampleLocations.set(segment, 0L, index, value); }
    /// Sets `pSampleLocations` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSampleLocations(MemorySegment segment, @CType("const VkSampleLocationEXT *") java.lang.foreign.MemorySegment value) { VkSampleLocationsInfoEXT.set_pSampleLocations(segment, 0L, value); }
    /// Sets `pSampleLocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSampleLocationsInfoEXT pSampleLocations(@CType("const VkSampleLocationEXT *") java.lang.foreign.MemorySegment value) { VkSampleLocationsInfoEXT.set_pSampleLocations(this.segment(), value); return this; }

    /// A buffer of [VkSampleLocationsInfoEXT].
    public static final class Buffer extends VkSampleLocationsInfoEXT {
        private final long elementCount;

        /// Creates `VkSampleLocationsInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSampleLocationsInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSampleLocationsInfoEXT`
        public VkSampleLocationsInfoEXT asSlice(long index) { return new VkSampleLocationsInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSampleLocationsInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSampleLocationsInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkSampleLocationsInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkSampleLocationsInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSampleLocationsInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSampleLocationsInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `sampleLocationsPerPixel` at the given index}
        /// @param index the index
        public @CType("VkSampleCountFlagBits") int sampleLocationsPerPixelAt(long index) { return VkSampleLocationsInfoEXT.get_sampleLocationsPerPixel(this.segment(), index); }
        /// Sets `sampleLocationsPerPixel` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sampleLocationsPerPixelAt(long index, @CType("VkSampleCountFlagBits") int value) { VkSampleLocationsInfoEXT.set_sampleLocationsPerPixel(this.segment(), index, value); return this; }

        /// {@return `sampleLocationGridSize` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") java.lang.foreign.MemorySegment sampleLocationGridSizeAt(long index) { return VkSampleLocationsInfoEXT.get_sampleLocationGridSize(this.segment(), index); }
        /// Sets `sampleLocationGridSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sampleLocationGridSizeAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkSampleLocationsInfoEXT.set_sampleLocationGridSize(this.segment(), index, value); return this; }

        /// {@return `sampleLocationsCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int sampleLocationsCountAt(long index) { return VkSampleLocationsInfoEXT.get_sampleLocationsCount(this.segment(), index); }
        /// Sets `sampleLocationsCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sampleLocationsCountAt(long index, @CType("uint32_t") int value) { VkSampleLocationsInfoEXT.set_sampleLocationsCount(this.segment(), index, value); return this; }

        /// {@return `pSampleLocations` at the given index}
        /// @param index the index
        public @CType("const VkSampleLocationEXT *") java.lang.foreign.MemorySegment pSampleLocationsAt(long index) { return VkSampleLocationsInfoEXT.get_pSampleLocations(this.segment(), index); }
        /// Sets `pSampleLocations` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pSampleLocationsAt(long index, @CType("const VkSampleLocationEXT *") java.lang.foreign.MemorySegment value) { VkSampleLocationsInfoEXT.set_pSampleLocations(this.segment(), index, value); return this; }

    }
}

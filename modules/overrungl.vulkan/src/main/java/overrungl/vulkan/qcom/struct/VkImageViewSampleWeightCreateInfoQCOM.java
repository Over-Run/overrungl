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
package overrungl.vulkan.qcom.struct;

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
/// ### filterCenter
/// [Byte offset][#OFFSET_filterCenter] - [Memory layout][#ML_filterCenter] - [Getter][#filterCenter()] - [Setter][#filterCenter(MemorySegment)]
/// ### filterSize
/// [Byte offset][#OFFSET_filterSize] - [Memory layout][#ML_filterSize] - [Getter][#filterSize()] - [Setter][#filterSize(MemorySegment)]
/// ### numPhases
/// [VarHandle][#VH_numPhases] - [Getter][#numPhases()] - [Setter][#numPhases(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImageViewSampleWeightCreateInfoQCOM {
///     VkStructureType sType;
///     const void * pNext;
///     VkOffset2D filterCenter;
///     VkExtent2D filterSize;
///     uint32_t numPhases;
/// } VkImageViewSampleWeightCreateInfoQCOM;
/// ```
public sealed class VkImageViewSampleWeightCreateInfoQCOM extends Struct {
    /// The struct layout of `VkImageViewSampleWeightCreateInfoQCOM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("filterCenter"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("filterSize"),
        ValueLayout.JAVA_INT.withName("numPhases")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `filterCenter`.
    public static final long OFFSET_filterCenter = LAYOUT.byteOffset(PathElement.groupElement("filterCenter"));
    /// The memory layout of `filterCenter`.
    public static final MemoryLayout ML_filterCenter = LAYOUT.select(PathElement.groupElement("filterCenter"));
    /// The byte offset of `filterSize`.
    public static final long OFFSET_filterSize = LAYOUT.byteOffset(PathElement.groupElement("filterSize"));
    /// The memory layout of `filterSize`.
    public static final MemoryLayout ML_filterSize = LAYOUT.select(PathElement.groupElement("filterSize"));
    /// The [VarHandle] of `numPhases` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_numPhases = LAYOUT.arrayElementVarHandle(PathElement.groupElement("numPhases"));

    /// Creates `VkImageViewSampleWeightCreateInfoQCOM` with the given segment.
    /// @param segment the memory segment
    public VkImageViewSampleWeightCreateInfoQCOM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageViewSampleWeightCreateInfoQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageViewSampleWeightCreateInfoQCOM of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageViewSampleWeightCreateInfoQCOM(segment); }

    /// Creates `VkImageViewSampleWeightCreateInfoQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageViewSampleWeightCreateInfoQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageViewSampleWeightCreateInfoQCOM ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageViewSampleWeightCreateInfoQCOM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageViewSampleWeightCreateInfoQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkImageViewSampleWeightCreateInfoQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageViewSampleWeightCreateInfoQCOM`
    public static VkImageViewSampleWeightCreateInfoQCOM alloc(SegmentAllocator allocator) { return new VkImageViewSampleWeightCreateInfoQCOM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageViewSampleWeightCreateInfoQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageViewSampleWeightCreateInfoQCOM`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImageViewSampleWeightCreateInfoQCOM` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageViewSampleWeightCreateInfoQCOM`
    public static VkImageViewSampleWeightCreateInfoQCOM allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkOffset2D") MemorySegment filterCenter, @CType("VkExtent2D") MemorySegment filterSize, @CType("uint32_t") int numPhases) { return alloc(allocator).sType(sType).pNext(pNext).filterCenter(filterCenter).filterSize(filterSize).numPhases(numPhases); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageViewSampleWeightCreateInfoQCOM copyFrom(VkImageViewSampleWeightCreateInfoQCOM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImageViewSampleWeightCreateInfoQCOM.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImageViewSampleWeightCreateInfoQCOM.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImageViewSampleWeightCreateInfoQCOM.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewSampleWeightCreateInfoQCOM sType(@CType("VkStructureType") int value) { VkImageViewSampleWeightCreateInfoQCOM.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkImageViewSampleWeightCreateInfoQCOM.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkImageViewSampleWeightCreateInfoQCOM.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkImageViewSampleWeightCreateInfoQCOM.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewSampleWeightCreateInfoQCOM pNext(@CType("const void *") MemorySegment value) { VkImageViewSampleWeightCreateInfoQCOM.set_pNext(this.segment(), value); return this; }

    /// {@return `filterCenter` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkOffset2D") MemorySegment get_filterCenter(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_filterCenter, index), ML_filterCenter); }
    /// {@return `filterCenter`}
    /// @param segment the segment of the struct
    public static @CType("VkOffset2D") MemorySegment get_filterCenter(MemorySegment segment) { return VkImageViewSampleWeightCreateInfoQCOM.get_filterCenter(segment, 0L); }
    /// {@return `filterCenter`}
    public @CType("VkOffset2D") MemorySegment filterCenter() { return VkImageViewSampleWeightCreateInfoQCOM.get_filterCenter(this.segment()); }
    /// Sets `filterCenter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_filterCenter(MemorySegment segment, long index, @CType("VkOffset2D") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_filterCenter, index), ML_filterCenter.byteSize()); }
    /// Sets `filterCenter` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_filterCenter(MemorySegment segment, @CType("VkOffset2D") MemorySegment value) { VkImageViewSampleWeightCreateInfoQCOM.set_filterCenter(segment, 0L, value); }
    /// Sets `filterCenter` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewSampleWeightCreateInfoQCOM filterCenter(@CType("VkOffset2D") MemorySegment value) { VkImageViewSampleWeightCreateInfoQCOM.set_filterCenter(this.segment(), value); return this; }

    /// {@return `filterSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") MemorySegment get_filterSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_filterSize, index), ML_filterSize); }
    /// {@return `filterSize`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") MemorySegment get_filterSize(MemorySegment segment) { return VkImageViewSampleWeightCreateInfoQCOM.get_filterSize(segment, 0L); }
    /// {@return `filterSize`}
    public @CType("VkExtent2D") MemorySegment filterSize() { return VkImageViewSampleWeightCreateInfoQCOM.get_filterSize(this.segment()); }
    /// Sets `filterSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_filterSize(MemorySegment segment, long index, @CType("VkExtent2D") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_filterSize, index), ML_filterSize.byteSize()); }
    /// Sets `filterSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_filterSize(MemorySegment segment, @CType("VkExtent2D") MemorySegment value) { VkImageViewSampleWeightCreateInfoQCOM.set_filterSize(segment, 0L, value); }
    /// Sets `filterSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewSampleWeightCreateInfoQCOM filterSize(@CType("VkExtent2D") MemorySegment value) { VkImageViewSampleWeightCreateInfoQCOM.set_filterSize(this.segment(), value); return this; }

    /// {@return `numPhases` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_numPhases(MemorySegment segment, long index) { return (int) VH_numPhases.get(segment, 0L, index); }
    /// {@return `numPhases`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_numPhases(MemorySegment segment) { return VkImageViewSampleWeightCreateInfoQCOM.get_numPhases(segment, 0L); }
    /// {@return `numPhases`}
    public @CType("uint32_t") int numPhases() { return VkImageViewSampleWeightCreateInfoQCOM.get_numPhases(this.segment()); }
    /// Sets `numPhases` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_numPhases(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_numPhases.set(segment, 0L, index, value); }
    /// Sets `numPhases` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_numPhases(MemorySegment segment, @CType("uint32_t") int value) { VkImageViewSampleWeightCreateInfoQCOM.set_numPhases(segment, 0L, value); }
    /// Sets `numPhases` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewSampleWeightCreateInfoQCOM numPhases(@CType("uint32_t") int value) { VkImageViewSampleWeightCreateInfoQCOM.set_numPhases(this.segment(), value); return this; }

    /// A buffer of [VkImageViewSampleWeightCreateInfoQCOM].
    public static final class Buffer extends VkImageViewSampleWeightCreateInfoQCOM {
        private final long elementCount;

        /// Creates `VkImageViewSampleWeightCreateInfoQCOM.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImageViewSampleWeightCreateInfoQCOM`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImageViewSampleWeightCreateInfoQCOM`
        public VkImageViewSampleWeightCreateInfoQCOM asSlice(long index) { return new VkImageViewSampleWeightCreateInfoQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImageViewSampleWeightCreateInfoQCOM`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImageViewSampleWeightCreateInfoQCOM`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkImageViewSampleWeightCreateInfoQCOM.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkImageViewSampleWeightCreateInfoQCOM.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkImageViewSampleWeightCreateInfoQCOM.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkImageViewSampleWeightCreateInfoQCOM.set_pNext(this.segment(), index, value); return this; }

        /// {@return `filterCenter` at the given index}
        /// @param index the index
        public @CType("VkOffset2D") MemorySegment filterCenterAt(long index) { return VkImageViewSampleWeightCreateInfoQCOM.get_filterCenter(this.segment(), index); }
        /// Sets `filterCenter` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer filterCenterAt(long index, @CType("VkOffset2D") MemorySegment value) { VkImageViewSampleWeightCreateInfoQCOM.set_filterCenter(this.segment(), index, value); return this; }

        /// {@return `filterSize` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") MemorySegment filterSizeAt(long index) { return VkImageViewSampleWeightCreateInfoQCOM.get_filterSize(this.segment(), index); }
        /// Sets `filterSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer filterSizeAt(long index, @CType("VkExtent2D") MemorySegment value) { VkImageViewSampleWeightCreateInfoQCOM.set_filterSize(this.segment(), index, value); return this; }

        /// {@return `numPhases` at the given index}
        /// @param index the index
        public @CType("uint32_t") int numPhasesAt(long index) { return VkImageViewSampleWeightCreateInfoQCOM.get_numPhases(this.segment(), index); }
        /// Sets `numPhases` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer numPhasesAt(long index, @CType("uint32_t") int value) { VkImageViewSampleWeightCreateInfoQCOM.set_numPhases(this.segment(), index, value); return this; }

    }
}

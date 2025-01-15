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
/// ### quantizationMapTexelSize
/// [Byte offset][#OFFSET_quantizationMapTexelSize] - [Memory layout][#ML_quantizationMapTexelSize] - [Getter][#quantizationMapTexelSize()] - [Setter][#quantizationMapTexelSize(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoFormatQuantizationMapPropertiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkExtent2D quantizationMapTexelSize;
/// } VkVideoFormatQuantizationMapPropertiesKHR;
/// ```
public sealed class VkVideoFormatQuantizationMapPropertiesKHR extends Struct {
    /// The struct layout of `VkVideoFormatQuantizationMapPropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("quantizationMapTexelSize")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `quantizationMapTexelSize`.
    public static final long OFFSET_quantizationMapTexelSize = LAYOUT.byteOffset(PathElement.groupElement("quantizationMapTexelSize"));
    /// The memory layout of `quantizationMapTexelSize`.
    public static final MemoryLayout ML_quantizationMapTexelSize = LAYOUT.select(PathElement.groupElement("quantizationMapTexelSize"));

    /// Creates `VkVideoFormatQuantizationMapPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoFormatQuantizationMapPropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoFormatQuantizationMapPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoFormatQuantizationMapPropertiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoFormatQuantizationMapPropertiesKHR(segment); }

    /// Creates `VkVideoFormatQuantizationMapPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoFormatQuantizationMapPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoFormatQuantizationMapPropertiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoFormatQuantizationMapPropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoFormatQuantizationMapPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoFormatQuantizationMapPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoFormatQuantizationMapPropertiesKHR`
    public static VkVideoFormatQuantizationMapPropertiesKHR alloc(SegmentAllocator allocator) { return new VkVideoFormatQuantizationMapPropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoFormatQuantizationMapPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoFormatQuantizationMapPropertiesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoFormatQuantizationMapPropertiesKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoFormatQuantizationMapPropertiesKHR`
    public static VkVideoFormatQuantizationMapPropertiesKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkExtent2D") java.lang.foreign.MemorySegment quantizationMapTexelSize) { return alloc(allocator).sType(sType).pNext(pNext).quantizationMapTexelSize(quantizationMapTexelSize); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoFormatQuantizationMapPropertiesKHR copyFrom(VkVideoFormatQuantizationMapPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoFormatQuantizationMapPropertiesKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoFormatQuantizationMapPropertiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoFormatQuantizationMapPropertiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoFormatQuantizationMapPropertiesKHR sType(@CType("VkStructureType") int value) { VkVideoFormatQuantizationMapPropertiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoFormatQuantizationMapPropertiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkVideoFormatQuantizationMapPropertiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoFormatQuantizationMapPropertiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoFormatQuantizationMapPropertiesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkVideoFormatQuantizationMapPropertiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `quantizationMapTexelSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_quantizationMapTexelSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_quantizationMapTexelSize, index), ML_quantizationMapTexelSize); }
    /// {@return `quantizationMapTexelSize`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_quantizationMapTexelSize(MemorySegment segment) { return VkVideoFormatQuantizationMapPropertiesKHR.get_quantizationMapTexelSize(segment, 0L); }
    /// {@return `quantizationMapTexelSize`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment quantizationMapTexelSize() { return VkVideoFormatQuantizationMapPropertiesKHR.get_quantizationMapTexelSize(this.segment()); }
    /// Sets `quantizationMapTexelSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_quantizationMapTexelSize(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_quantizationMapTexelSize, index), ML_quantizationMapTexelSize.byteSize()); }
    /// Sets `quantizationMapTexelSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_quantizationMapTexelSize(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoFormatQuantizationMapPropertiesKHR.set_quantizationMapTexelSize(segment, 0L, value); }
    /// Sets `quantizationMapTexelSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoFormatQuantizationMapPropertiesKHR quantizationMapTexelSize(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoFormatQuantizationMapPropertiesKHR.set_quantizationMapTexelSize(this.segment(), value); return this; }

    /// A buffer of [VkVideoFormatQuantizationMapPropertiesKHR].
    public static final class Buffer extends VkVideoFormatQuantizationMapPropertiesKHR {
        private final long elementCount;

        /// Creates `VkVideoFormatQuantizationMapPropertiesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoFormatQuantizationMapPropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoFormatQuantizationMapPropertiesKHR`
        public VkVideoFormatQuantizationMapPropertiesKHR asSlice(long index) { return new VkVideoFormatQuantizationMapPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoFormatQuantizationMapPropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoFormatQuantizationMapPropertiesKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoFormatQuantizationMapPropertiesKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoFormatQuantizationMapPropertiesKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoFormatQuantizationMapPropertiesKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoFormatQuantizationMapPropertiesKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `quantizationMapTexelSize` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") java.lang.foreign.MemorySegment quantizationMapTexelSizeAt(long index) { return VkVideoFormatQuantizationMapPropertiesKHR.get_quantizationMapTexelSize(this.segment(), index); }
        /// Sets `quantizationMapTexelSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer quantizationMapTexelSizeAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoFormatQuantizationMapPropertiesKHR.set_quantizationMapTexelSize(this.segment(), index, value); return this; }

    }
}

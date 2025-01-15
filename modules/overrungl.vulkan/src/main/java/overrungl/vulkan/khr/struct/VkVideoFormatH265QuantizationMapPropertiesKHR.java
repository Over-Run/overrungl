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
/// ### compatibleCtbSizes
/// [VarHandle][#VH_compatibleCtbSizes] - [Getter][#compatibleCtbSizes()] - [Setter][#compatibleCtbSizes(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoFormatH265QuantizationMapPropertiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkVideoEncodeH265CtbSizeFlagsKHR compatibleCtbSizes;
/// } VkVideoFormatH265QuantizationMapPropertiesKHR;
/// ```
public sealed class VkVideoFormatH265QuantizationMapPropertiesKHR extends Struct {
    /// The struct layout of `VkVideoFormatH265QuantizationMapPropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("compatibleCtbSizes")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `compatibleCtbSizes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_compatibleCtbSizes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compatibleCtbSizes"));

    /// Creates `VkVideoFormatH265QuantizationMapPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoFormatH265QuantizationMapPropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoFormatH265QuantizationMapPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoFormatH265QuantizationMapPropertiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoFormatH265QuantizationMapPropertiesKHR(segment); }

    /// Creates `VkVideoFormatH265QuantizationMapPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoFormatH265QuantizationMapPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoFormatH265QuantizationMapPropertiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoFormatH265QuantizationMapPropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoFormatH265QuantizationMapPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoFormatH265QuantizationMapPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoFormatH265QuantizationMapPropertiesKHR`
    public static VkVideoFormatH265QuantizationMapPropertiesKHR alloc(SegmentAllocator allocator) { return new VkVideoFormatH265QuantizationMapPropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoFormatH265QuantizationMapPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoFormatH265QuantizationMapPropertiesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoFormatH265QuantizationMapPropertiesKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoFormatH265QuantizationMapPropertiesKHR`
    public static VkVideoFormatH265QuantizationMapPropertiesKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkVideoEncodeH265CtbSizeFlagsKHR") int compatibleCtbSizes) { return alloc(allocator).sType(sType).pNext(pNext).compatibleCtbSizes(compatibleCtbSizes); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoFormatH265QuantizationMapPropertiesKHR copyFrom(VkVideoFormatH265QuantizationMapPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoFormatH265QuantizationMapPropertiesKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoFormatH265QuantizationMapPropertiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoFormatH265QuantizationMapPropertiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoFormatH265QuantizationMapPropertiesKHR sType(@CType("VkStructureType") int value) { VkVideoFormatH265QuantizationMapPropertiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoFormatH265QuantizationMapPropertiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkVideoFormatH265QuantizationMapPropertiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoFormatH265QuantizationMapPropertiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoFormatH265QuantizationMapPropertiesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkVideoFormatH265QuantizationMapPropertiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `compatibleCtbSizes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeH265CtbSizeFlagsKHR") int get_compatibleCtbSizes(MemorySegment segment, long index) { return (int) VH_compatibleCtbSizes.get(segment, 0L, index); }
    /// {@return `compatibleCtbSizes`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeH265CtbSizeFlagsKHR") int get_compatibleCtbSizes(MemorySegment segment) { return VkVideoFormatH265QuantizationMapPropertiesKHR.get_compatibleCtbSizes(segment, 0L); }
    /// {@return `compatibleCtbSizes`}
    public @CType("VkVideoEncodeH265CtbSizeFlagsKHR") int compatibleCtbSizes() { return VkVideoFormatH265QuantizationMapPropertiesKHR.get_compatibleCtbSizes(this.segment()); }
    /// Sets `compatibleCtbSizes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_compatibleCtbSizes(MemorySegment segment, long index, @CType("VkVideoEncodeH265CtbSizeFlagsKHR") int value) { VH_compatibleCtbSizes.set(segment, 0L, index, value); }
    /// Sets `compatibleCtbSizes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_compatibleCtbSizes(MemorySegment segment, @CType("VkVideoEncodeH265CtbSizeFlagsKHR") int value) { VkVideoFormatH265QuantizationMapPropertiesKHR.set_compatibleCtbSizes(segment, 0L, value); }
    /// Sets `compatibleCtbSizes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoFormatH265QuantizationMapPropertiesKHR compatibleCtbSizes(@CType("VkVideoEncodeH265CtbSizeFlagsKHR") int value) { VkVideoFormatH265QuantizationMapPropertiesKHR.set_compatibleCtbSizes(this.segment(), value); return this; }

    /// A buffer of [VkVideoFormatH265QuantizationMapPropertiesKHR].
    public static final class Buffer extends VkVideoFormatH265QuantizationMapPropertiesKHR {
        private final long elementCount;

        /// Creates `VkVideoFormatH265QuantizationMapPropertiesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoFormatH265QuantizationMapPropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoFormatH265QuantizationMapPropertiesKHR`
        public VkVideoFormatH265QuantizationMapPropertiesKHR asSlice(long index) { return new VkVideoFormatH265QuantizationMapPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoFormatH265QuantizationMapPropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoFormatH265QuantizationMapPropertiesKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoFormatH265QuantizationMapPropertiesKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoFormatH265QuantizationMapPropertiesKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoFormatH265QuantizationMapPropertiesKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoFormatH265QuantizationMapPropertiesKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `compatibleCtbSizes` at the given index}
        /// @param index the index
        public @CType("VkVideoEncodeH265CtbSizeFlagsKHR") int compatibleCtbSizesAt(long index) { return VkVideoFormatH265QuantizationMapPropertiesKHR.get_compatibleCtbSizes(this.segment(), index); }
        /// Sets `compatibleCtbSizes` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer compatibleCtbSizesAt(long index, @CType("VkVideoEncodeH265CtbSizeFlagsKHR") int value) { VkVideoFormatH265QuantizationMapPropertiesKHR.set_compatibleCtbSizes(this.segment(), index, value); return this; }

    }
}

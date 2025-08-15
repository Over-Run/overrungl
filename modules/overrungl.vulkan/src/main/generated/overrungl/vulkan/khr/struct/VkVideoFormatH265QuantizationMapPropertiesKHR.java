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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoFormatH265QuantizationMapPropertiesKHR`.
/// ## Layout
/// ```
/// struct VkVideoFormatH265QuantizationMapPropertiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     ((uint32_t) VkFlags) VkVideoEncodeH265CtbSizeFlagsKHR compatibleCtbSizes;
/// };
/// ```
public final class VkVideoFormatH265QuantizationMapPropertiesKHR extends GroupType {
    /// The struct layout of `VkVideoFormatH265QuantizationMapPropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("compatibleCtbSizes")
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
    /// The byte offset of `compatibleCtbSizes`.
    public static final long OFFSET_compatibleCtbSizes = LAYOUT.byteOffset(PathElement.groupElement("compatibleCtbSizes"));
    /// The memory layout of `compatibleCtbSizes`.
    public static final MemoryLayout LAYOUT_compatibleCtbSizes = LAYOUT.select(PathElement.groupElement("compatibleCtbSizes"));
    /// The [VarHandle] of `compatibleCtbSizes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_compatibleCtbSizes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compatibleCtbSizes"));

    /// Creates `VkVideoFormatH265QuantizationMapPropertiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoFormatH265QuantizationMapPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoFormatH265QuantizationMapPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoFormatH265QuantizationMapPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoFormatH265QuantizationMapPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoFormatH265QuantizationMapPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoFormatH265QuantizationMapPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoFormatH265QuantizationMapPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoFormatH265QuantizationMapPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoFormatH265QuantizationMapPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoFormatH265QuantizationMapPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoFormatH265QuantizationMapPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoFormatH265QuantizationMapPropertiesKHR`
    public static VkVideoFormatH265QuantizationMapPropertiesKHR alloc(SegmentAllocator allocator) { return new VkVideoFormatH265QuantizationMapPropertiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoFormatH265QuantizationMapPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoFormatH265QuantizationMapPropertiesKHR`
    public static VkVideoFormatH265QuantizationMapPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoFormatH265QuantizationMapPropertiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoFormatH265QuantizationMapPropertiesKHR copyFrom(VkVideoFormatH265QuantizationMapPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoFormatH265QuantizationMapPropertiesKHR reinterpret(long count) { return new VkVideoFormatH265QuantizationMapPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoFormatH265QuantizationMapPropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoFormatH265QuantizationMapPropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `compatibleCtbSizes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int compatibleCtbSizes(MemorySegment segment, long index) { return (int) VH_compatibleCtbSizes.get(segment, 0L, index); }
    /// {@return `compatibleCtbSizes`}
    public int compatibleCtbSizes() { return compatibleCtbSizes(this.segment(), 0L); }
    /// Sets `compatibleCtbSizes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void compatibleCtbSizes(MemorySegment segment, long index, int value) { VH_compatibleCtbSizes.set(segment, 0L, index, value); }
    /// Sets `compatibleCtbSizes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoFormatH265QuantizationMapPropertiesKHR compatibleCtbSizes(int value) { compatibleCtbSizes(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoFormatH265QuantizationMapPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoFormatH265QuantizationMapPropertiesKHR`
    public VkVideoFormatH265QuantizationMapPropertiesKHR asSlice(long index) { return new VkVideoFormatH265QuantizationMapPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoFormatH265QuantizationMapPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoFormatH265QuantizationMapPropertiesKHR`
    public VkVideoFormatH265QuantizationMapPropertiesKHR asSlice(long index, long count) { return new VkVideoFormatH265QuantizationMapPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoFormatH265QuantizationMapPropertiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoFormatH265QuantizationMapPropertiesKHR at(long index, Consumer<VkVideoFormatH265QuantizationMapPropertiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoFormatH265QuantizationMapPropertiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoFormatH265QuantizationMapPropertiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `compatibleCtbSizes` at the given index}
    /// @param index the index of the struct buffer
    public int compatibleCtbSizesAt(long index) { return compatibleCtbSizes(this.segment(), index); }
    /// Sets `compatibleCtbSizes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoFormatH265QuantizationMapPropertiesKHR compatibleCtbSizesAt(long index, int value) { compatibleCtbSizes(this.segment(), index, value); return this; }

}

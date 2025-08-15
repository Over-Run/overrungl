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
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkTensorDescriptionARM`.
/// ## Layout
/// ```
/// struct VkTensorDescriptionARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkTensorTilingARM tiling;
///     (int) VkFormat format;
///     uint32_t dimensionCount;
///     const int64_t* pDimensions;
///     const int64_t* pStrides;
///     ((uint64_t) VkFlags64) VkTensorUsageFlagsARM usage;
/// };
/// ```
public final class VkTensorDescriptionARM extends GroupType {
    /// The struct layout of `VkTensorDescriptionARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("tiling"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("dimensionCount"),
        ValueLayout.ADDRESS.withName("pDimensions"),
        ValueLayout.ADDRESS.withName("pStrides"),
        ValueLayout.JAVA_LONG.withName("usage")
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
    /// The byte offset of `tiling`.
    public static final long OFFSET_tiling = LAYOUT.byteOffset(PathElement.groupElement("tiling"));
    /// The memory layout of `tiling`.
    public static final MemoryLayout LAYOUT_tiling = LAYOUT.select(PathElement.groupElement("tiling"));
    /// The [VarHandle] of `tiling` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tiling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tiling"));
    /// The byte offset of `format`.
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    /// The memory layout of `format`.
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    /// The byte offset of `dimensionCount`.
    public static final long OFFSET_dimensionCount = LAYOUT.byteOffset(PathElement.groupElement("dimensionCount"));
    /// The memory layout of `dimensionCount`.
    public static final MemoryLayout LAYOUT_dimensionCount = LAYOUT.select(PathElement.groupElement("dimensionCount"));
    /// The [VarHandle] of `dimensionCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dimensionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dimensionCount"));
    /// The byte offset of `pDimensions`.
    public static final long OFFSET_pDimensions = LAYOUT.byteOffset(PathElement.groupElement("pDimensions"));
    /// The memory layout of `pDimensions`.
    public static final MemoryLayout LAYOUT_pDimensions = LAYOUT.select(PathElement.groupElement("pDimensions"));
    /// The [VarHandle] of `pDimensions` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDimensions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDimensions"));
    /// The byte offset of `pStrides`.
    public static final long OFFSET_pStrides = LAYOUT.byteOffset(PathElement.groupElement("pStrides"));
    /// The memory layout of `pStrides`.
    public static final MemoryLayout LAYOUT_pStrides = LAYOUT.select(PathElement.groupElement("pStrides"));
    /// The [VarHandle] of `pStrides` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pStrides = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStrides"));
    /// The byte offset of `usage`.
    public static final long OFFSET_usage = LAYOUT.byteOffset(PathElement.groupElement("usage"));
    /// The memory layout of `usage`.
    public static final MemoryLayout LAYOUT_usage = LAYOUT.select(PathElement.groupElement("usage"));
    /// The [VarHandle] of `usage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_usage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usage"));

    /// Creates `VkTensorDescriptionARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkTensorDescriptionARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkTensorDescriptionARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTensorDescriptionARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorDescriptionARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkTensorDescriptionARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTensorDescriptionARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorDescriptionARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkTensorDescriptionARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTensorDescriptionARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorDescriptionARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkTensorDescriptionARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkTensorDescriptionARM`
    public static VkTensorDescriptionARM alloc(SegmentAllocator allocator) { return new VkTensorDescriptionARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkTensorDescriptionARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkTensorDescriptionARM`
    public static VkTensorDescriptionARM alloc(SegmentAllocator allocator, long count) { return new VkTensorDescriptionARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkTensorDescriptionARM copyFrom(VkTensorDescriptionARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkTensorDescriptionARM reinterpret(long count) { return new VkTensorDescriptionARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkTensorDescriptionARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkTensorDescriptionARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `tiling` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tiling(MemorySegment segment, long index) { return (int) VH_tiling.get(segment, 0L, index); }
    /// {@return `tiling`}
    public int tiling() { return tiling(this.segment(), 0L); }
    /// Sets `tiling` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tiling(MemorySegment segment, long index, int value) { VH_tiling.set(segment, 0L, index, value); }
    /// Sets `tiling` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTensorDescriptionARM tiling(int value) { tiling(this.segment(), 0L, value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    public int format() { return format(this.segment(), 0L); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void format(MemorySegment segment, long index, int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTensorDescriptionARM format(int value) { format(this.segment(), 0L, value); return this; }

    /// {@return `dimensionCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dimensionCount(MemorySegment segment, long index) { return (int) VH_dimensionCount.get(segment, 0L, index); }
    /// {@return `dimensionCount`}
    public int dimensionCount() { return dimensionCount(this.segment(), 0L); }
    /// Sets `dimensionCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dimensionCount(MemorySegment segment, long index, int value) { VH_dimensionCount.set(segment, 0L, index, value); }
    /// Sets `dimensionCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTensorDescriptionARM dimensionCount(int value) { dimensionCount(this.segment(), 0L, value); return this; }

    /// {@return `pDimensions` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDimensions(MemorySegment segment, long index) { return (MemorySegment) VH_pDimensions.get(segment, 0L, index); }
    /// {@return `pDimensions`}
    public MemorySegment pDimensions() { return pDimensions(this.segment(), 0L); }
    /// Sets `pDimensions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDimensions(MemorySegment segment, long index, MemorySegment value) { VH_pDimensions.set(segment, 0L, index, value); }
    /// Sets `pDimensions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTensorDescriptionARM pDimensions(MemorySegment value) { pDimensions(this.segment(), 0L, value); return this; }

    /// {@return `pStrides` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pStrides(MemorySegment segment, long index) { return (MemorySegment) VH_pStrides.get(segment, 0L, index); }
    /// {@return `pStrides`}
    public MemorySegment pStrides() { return pStrides(this.segment(), 0L); }
    /// Sets `pStrides` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pStrides(MemorySegment segment, long index, MemorySegment value) { VH_pStrides.set(segment, 0L, index, value); }
    /// Sets `pStrides` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTensorDescriptionARM pStrides(MemorySegment value) { pStrides(this.segment(), 0L, value); return this; }

    /// {@return `usage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long usage(MemorySegment segment, long index) { return (long) VH_usage.get(segment, 0L, index); }
    /// {@return `usage`}
    public long usage() { return usage(this.segment(), 0L); }
    /// Sets `usage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void usage(MemorySegment segment, long index, long value) { VH_usage.set(segment, 0L, index, value); }
    /// Sets `usage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTensorDescriptionARM usage(long value) { usage(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkTensorDescriptionARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkTensorDescriptionARM`
    public VkTensorDescriptionARM asSlice(long index) { return new VkTensorDescriptionARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkTensorDescriptionARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkTensorDescriptionARM`
    public VkTensorDescriptionARM asSlice(long index, long count) { return new VkTensorDescriptionARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkTensorDescriptionARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkTensorDescriptionARM at(long index, Consumer<VkTensorDescriptionARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorDescriptionARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorDescriptionARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `tiling` at the given index}
    /// @param index the index of the struct buffer
    public int tilingAt(long index) { return tiling(this.segment(), index); }
    /// Sets `tiling` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorDescriptionARM tilingAt(long index, int value) { tiling(this.segment(), index, value); return this; }

    /// {@return `format` at the given index}
    /// @param index the index of the struct buffer
    public int formatAt(long index) { return format(this.segment(), index); }
    /// Sets `format` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorDescriptionARM formatAt(long index, int value) { format(this.segment(), index, value); return this; }

    /// {@return `dimensionCount` at the given index}
    /// @param index the index of the struct buffer
    public int dimensionCountAt(long index) { return dimensionCount(this.segment(), index); }
    /// Sets `dimensionCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorDescriptionARM dimensionCountAt(long index, int value) { dimensionCount(this.segment(), index, value); return this; }

    /// {@return `pDimensions` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDimensionsAt(long index) { return pDimensions(this.segment(), index); }
    /// Sets `pDimensions` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorDescriptionARM pDimensionsAt(long index, MemorySegment value) { pDimensions(this.segment(), index, value); return this; }

    /// {@return `pStrides` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pStridesAt(long index) { return pStrides(this.segment(), index); }
    /// Sets `pStrides` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorDescriptionARM pStridesAt(long index, MemorySegment value) { pStrides(this.segment(), index, value); return this; }

    /// {@return `usage` at the given index}
    /// @param index the index of the struct buffer
    public long usageAt(long index) { return usage(this.segment(), index); }
    /// Sets `usage` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorDescriptionARM usageAt(long index, long value) { usage(this.segment(), index, value); return this; }

}

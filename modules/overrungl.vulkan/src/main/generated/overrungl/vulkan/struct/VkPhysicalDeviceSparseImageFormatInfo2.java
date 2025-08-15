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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceSparseImageFormatInfo2`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceSparseImageFormatInfo2 {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkFormat format;
///     (int) VkImageType type;
///     (int) VkSampleCountFlagBits samples;
///     ((uint32_t) VkFlags) VkImageUsageFlags usage;
///     (int) VkImageTiling tiling;
/// };
/// ```
public final class VkPhysicalDeviceSparseImageFormatInfo2 extends GroupType {
    /// The struct layout of `VkPhysicalDeviceSparseImageFormatInfo2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("samples"),
        ValueLayout.JAVA_INT.withName("usage"),
        ValueLayout.JAVA_INT.withName("tiling")
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
    /// The byte offset of `format`.
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    /// The memory layout of `format`.
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    /// The byte offset of `type`.
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    /// The memory layout of `type`.
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The byte offset of `samples`.
    public static final long OFFSET_samples = LAYOUT.byteOffset(PathElement.groupElement("samples"));
    /// The memory layout of `samples`.
    public static final MemoryLayout LAYOUT_samples = LAYOUT.select(PathElement.groupElement("samples"));
    /// The [VarHandle] of `samples` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samples"));
    /// The byte offset of `usage`.
    public static final long OFFSET_usage = LAYOUT.byteOffset(PathElement.groupElement("usage"));
    /// The memory layout of `usage`.
    public static final MemoryLayout LAYOUT_usage = LAYOUT.select(PathElement.groupElement("usage"));
    /// The [VarHandle] of `usage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_usage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usage"));
    /// The byte offset of `tiling`.
    public static final long OFFSET_tiling = LAYOUT.byteOffset(PathElement.groupElement("tiling"));
    /// The memory layout of `tiling`.
    public static final MemoryLayout LAYOUT_tiling = LAYOUT.select(PathElement.groupElement("tiling"));
    /// The [VarHandle] of `tiling` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tiling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tiling"));

    /// Creates `VkPhysicalDeviceSparseImageFormatInfo2` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceSparseImageFormatInfo2(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceSparseImageFormatInfo2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSparseImageFormatInfo2 of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSparseImageFormatInfo2(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceSparseImageFormatInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSparseImageFormatInfo2 ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSparseImageFormatInfo2(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceSparseImageFormatInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSparseImageFormatInfo2 ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSparseImageFormatInfo2(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceSparseImageFormatInfo2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceSparseImageFormatInfo2`
    public static VkPhysicalDeviceSparseImageFormatInfo2 alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSparseImageFormatInfo2(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceSparseImageFormatInfo2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceSparseImageFormatInfo2`
    public static VkPhysicalDeviceSparseImageFormatInfo2 alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSparseImageFormatInfo2(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceSparseImageFormatInfo2 copyFrom(VkPhysicalDeviceSparseImageFormatInfo2 src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceSparseImageFormatInfo2 reinterpret(long count) { return new VkPhysicalDeviceSparseImageFormatInfo2(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceSparseImageFormatInfo2 sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceSparseImageFormatInfo2 pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceSparseImageFormatInfo2 format(int value) { format(this.segment(), 0L, value); return this; }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    public int type() { return type(this.segment(), 0L); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void type(MemorySegment segment, long index, int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseImageFormatInfo2 type(int value) { type(this.segment(), 0L, value); return this; }

    /// {@return `samples` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int samples(MemorySegment segment, long index) { return (int) VH_samples.get(segment, 0L, index); }
    /// {@return `samples`}
    public int samples() { return samples(this.segment(), 0L); }
    /// Sets `samples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void samples(MemorySegment segment, long index, int value) { VH_samples.set(segment, 0L, index, value); }
    /// Sets `samples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseImageFormatInfo2 samples(int value) { samples(this.segment(), 0L, value); return this; }

    /// {@return `usage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int usage(MemorySegment segment, long index) { return (int) VH_usage.get(segment, 0L, index); }
    /// {@return `usage`}
    public int usage() { return usage(this.segment(), 0L); }
    /// Sets `usage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void usage(MemorySegment segment, long index, int value) { VH_usage.set(segment, 0L, index, value); }
    /// Sets `usage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseImageFormatInfo2 usage(int value) { usage(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceSparseImageFormatInfo2 tiling(int value) { tiling(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceSparseImageFormatInfo2`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceSparseImageFormatInfo2`
    public VkPhysicalDeviceSparseImageFormatInfo2 asSlice(long index) { return new VkPhysicalDeviceSparseImageFormatInfo2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceSparseImageFormatInfo2`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceSparseImageFormatInfo2`
    public VkPhysicalDeviceSparseImageFormatInfo2 asSlice(long index, long count) { return new VkPhysicalDeviceSparseImageFormatInfo2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceSparseImageFormatInfo2` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceSparseImageFormatInfo2 at(long index, Consumer<VkPhysicalDeviceSparseImageFormatInfo2> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseImageFormatInfo2 sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseImageFormatInfo2 pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `format` at the given index}
    /// @param index the index of the struct buffer
    public int formatAt(long index) { return format(this.segment(), index); }
    /// Sets `format` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseImageFormatInfo2 formatAt(long index, int value) { format(this.segment(), index, value); return this; }

    /// {@return `type` at the given index}
    /// @param index the index of the struct buffer
    public int typeAt(long index) { return type(this.segment(), index); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseImageFormatInfo2 typeAt(long index, int value) { type(this.segment(), index, value); return this; }

    /// {@return `samples` at the given index}
    /// @param index the index of the struct buffer
    public int samplesAt(long index) { return samples(this.segment(), index); }
    /// Sets `samples` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseImageFormatInfo2 samplesAt(long index, int value) { samples(this.segment(), index, value); return this; }

    /// {@return `usage` at the given index}
    /// @param index the index of the struct buffer
    public int usageAt(long index) { return usage(this.segment(), index); }
    /// Sets `usage` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseImageFormatInfo2 usageAt(long index, int value) { usage(this.segment(), index, value); return this; }

    /// {@return `tiling` at the given index}
    /// @param index the index of the struct buffer
    public int tilingAt(long index) { return tiling(this.segment(), index); }
    /// Sets `tiling` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSparseImageFormatInfo2 tilingAt(long index, int value) { tiling(this.segment(), index, value); return this; }

}

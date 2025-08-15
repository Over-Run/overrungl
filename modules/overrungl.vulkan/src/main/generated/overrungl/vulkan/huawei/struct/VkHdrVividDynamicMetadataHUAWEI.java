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
package overrungl.vulkan.huawei.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkHdrVividDynamicMetadataHUAWEI`.
/// ## Layout
/// ```
/// struct VkHdrVividDynamicMetadataHUAWEI {
///     (int) VkStructureType sType;
///     const void* pNext;
///     size_t dynamicMetadataSize;
///     const void* pDynamicMetadata;
/// };
/// ```
public final class VkHdrVividDynamicMetadataHUAWEI extends GroupType {
    /// The struct layout of `VkHdrVividDynamicMetadataHUAWEI`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        CanonicalTypes.SIZE_T.withName("dynamicMetadataSize"),
        ValueLayout.ADDRESS.withName("pDynamicMetadata")
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
    /// The byte offset of `dynamicMetadataSize`.
    public static final long OFFSET_dynamicMetadataSize = LAYOUT.byteOffset(PathElement.groupElement("dynamicMetadataSize"));
    /// The memory layout of `dynamicMetadataSize`.
    public static final MemoryLayout LAYOUT_dynamicMetadataSize = LAYOUT.select(PathElement.groupElement("dynamicMetadataSize"));
    /// The [VarHandle] of `dynamicMetadataSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dynamicMetadataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicMetadataSize"));
    /// The byte offset of `pDynamicMetadata`.
    public static final long OFFSET_pDynamicMetadata = LAYOUT.byteOffset(PathElement.groupElement("pDynamicMetadata"));
    /// The memory layout of `pDynamicMetadata`.
    public static final MemoryLayout LAYOUT_pDynamicMetadata = LAYOUT.select(PathElement.groupElement("pDynamicMetadata"));
    /// The [VarHandle] of `pDynamicMetadata` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDynamicMetadata = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDynamicMetadata"));

    /// Creates `VkHdrVividDynamicMetadataHUAWEI` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkHdrVividDynamicMetadataHUAWEI(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkHdrVividDynamicMetadataHUAWEI` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkHdrVividDynamicMetadataHUAWEI of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkHdrVividDynamicMetadataHUAWEI(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkHdrVividDynamicMetadataHUAWEI` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkHdrVividDynamicMetadataHUAWEI ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkHdrVividDynamicMetadataHUAWEI(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkHdrVividDynamicMetadataHUAWEI` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkHdrVividDynamicMetadataHUAWEI ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkHdrVividDynamicMetadataHUAWEI(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkHdrVividDynamicMetadataHUAWEI` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkHdrVividDynamicMetadataHUAWEI`
    public static VkHdrVividDynamicMetadataHUAWEI alloc(SegmentAllocator allocator) { return new VkHdrVividDynamicMetadataHUAWEI(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkHdrVividDynamicMetadataHUAWEI` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkHdrVividDynamicMetadataHUAWEI`
    public static VkHdrVividDynamicMetadataHUAWEI alloc(SegmentAllocator allocator, long count) { return new VkHdrVividDynamicMetadataHUAWEI(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkHdrVividDynamicMetadataHUAWEI copyFrom(VkHdrVividDynamicMetadataHUAWEI src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkHdrVividDynamicMetadataHUAWEI reinterpret(long count) { return new VkHdrVividDynamicMetadataHUAWEI(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkHdrVividDynamicMetadataHUAWEI sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkHdrVividDynamicMetadataHUAWEI pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `dynamicMetadataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dynamicMetadataSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_dynamicMetadataSize.get(segment, 0L, index)); }
    /// {@return `dynamicMetadataSize`}
    public long dynamicMetadataSize() { return dynamicMetadataSize(this.segment(), 0L); }
    /// Sets `dynamicMetadataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dynamicMetadataSize(MemorySegment segment, long index, long value) { VH_dynamicMetadataSize.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `dynamicMetadataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHdrVividDynamicMetadataHUAWEI dynamicMetadataSize(long value) { dynamicMetadataSize(this.segment(), 0L, value); return this; }

    /// {@return `pDynamicMetadata` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDynamicMetadata(MemorySegment segment, long index) { return (MemorySegment) VH_pDynamicMetadata.get(segment, 0L, index); }
    /// {@return `pDynamicMetadata`}
    public MemorySegment pDynamicMetadata() { return pDynamicMetadata(this.segment(), 0L); }
    /// Sets `pDynamicMetadata` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDynamicMetadata(MemorySegment segment, long index, MemorySegment value) { VH_pDynamicMetadata.set(segment, 0L, index, value); }
    /// Sets `pDynamicMetadata` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHdrVividDynamicMetadataHUAWEI pDynamicMetadata(MemorySegment value) { pDynamicMetadata(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkHdrVividDynamicMetadataHUAWEI`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkHdrVividDynamicMetadataHUAWEI`
    public VkHdrVividDynamicMetadataHUAWEI asSlice(long index) { return new VkHdrVividDynamicMetadataHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkHdrVividDynamicMetadataHUAWEI`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkHdrVividDynamicMetadataHUAWEI`
    public VkHdrVividDynamicMetadataHUAWEI asSlice(long index, long count) { return new VkHdrVividDynamicMetadataHUAWEI(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkHdrVividDynamicMetadataHUAWEI` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkHdrVividDynamicMetadataHUAWEI at(long index, Consumer<VkHdrVividDynamicMetadataHUAWEI> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkHdrVividDynamicMetadataHUAWEI sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkHdrVividDynamicMetadataHUAWEI pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `dynamicMetadataSize` at the given index}
    /// @param index the index of the struct buffer
    public long dynamicMetadataSizeAt(long index) { return dynamicMetadataSize(this.segment(), index); }
    /// Sets `dynamicMetadataSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkHdrVividDynamicMetadataHUAWEI dynamicMetadataSizeAt(long index, long value) { dynamicMetadataSize(this.segment(), index, value); return this; }

    /// {@return `pDynamicMetadata` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDynamicMetadataAt(long index) { return pDynamicMetadata(this.segment(), index); }
    /// Sets `pDynamicMetadata` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkHdrVividDynamicMetadataHUAWEI pDynamicMetadataAt(long index, MemorySegment value) { pDynamicMetadata(this.segment(), index, value); return this; }

}

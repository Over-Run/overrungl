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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkVideoDecodeH264PictureInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     const StdVideoDecodeH264PictureInfo* pStdPictureInfo;
///     uint32_t sliceCount;
///     const uint32_t* pSliceOffsets;
/// };
/// ```
public final class VkVideoDecodeH264PictureInfoKHR extends GroupType {
    /// The struct layout of `VkVideoDecodeH264PictureInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pStdPictureInfo"),
        ValueLayout.JAVA_INT.withName("sliceCount"),
        ValueLayout.ADDRESS.withName("pSliceOffsets")
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
    /// The byte offset of `pStdPictureInfo`.
    public static final long OFFSET_pStdPictureInfo = LAYOUT.byteOffset(PathElement.groupElement("pStdPictureInfo"));
    /// The memory layout of `pStdPictureInfo`.
    public static final MemoryLayout LAYOUT_pStdPictureInfo = LAYOUT.select(PathElement.groupElement("pStdPictureInfo"));
    /// The [VarHandle] of `pStdPictureInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pStdPictureInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdPictureInfo"));
    /// The byte offset of `sliceCount`.
    public static final long OFFSET_sliceCount = LAYOUT.byteOffset(PathElement.groupElement("sliceCount"));
    /// The memory layout of `sliceCount`.
    public static final MemoryLayout LAYOUT_sliceCount = LAYOUT.select(PathElement.groupElement("sliceCount"));
    /// The [VarHandle] of `sliceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sliceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sliceCount"));
    /// The byte offset of `pSliceOffsets`.
    public static final long OFFSET_pSliceOffsets = LAYOUT.byteOffset(PathElement.groupElement("pSliceOffsets"));
    /// The memory layout of `pSliceOffsets`.
    public static final MemoryLayout LAYOUT_pSliceOffsets = LAYOUT.select(PathElement.groupElement("pSliceOffsets"));
    /// The [VarHandle] of `pSliceOffsets` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSliceOffsets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSliceOffsets"));

    /// Creates `VkVideoDecodeH264PictureInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoDecodeH264PictureInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoDecodeH264PictureInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH264PictureInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH264PictureInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoDecodeH264PictureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH264PictureInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH264PictureInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoDecodeH264PictureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH264PictureInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH264PictureInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoDecodeH264PictureInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeH264PictureInfoKHR`
    public static VkVideoDecodeH264PictureInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeH264PictureInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoDecodeH264PictureInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoDecodeH264PictureInfoKHR`
    public static VkVideoDecodeH264PictureInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeH264PictureInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoDecodeH264PictureInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pStdPictureInfo `pStdPictureInfo`
    /// @param sliceCount `sliceCount`
    /// @param pSliceOffsets `pSliceOffsets`
    /// @return the allocated `VkVideoDecodeH264PictureInfoKHR`
    public static VkVideoDecodeH264PictureInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pStdPictureInfo, int sliceCount, MemorySegment pSliceOffsets) {
        return alloc(allocator).sType(sType).pNext(pNext).pStdPictureInfo(pStdPictureInfo).sliceCount(sliceCount).pSliceOffsets(pSliceOffsets);
    }

    /// Allocates a `VkVideoDecodeH264PictureInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pStdPictureInfo `pStdPictureInfo`
    /// @param sliceCount `sliceCount`
    /// @return the allocated `VkVideoDecodeH264PictureInfoKHR`
    public static VkVideoDecodeH264PictureInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pStdPictureInfo, int sliceCount) {
        return alloc(allocator).sType(sType).pNext(pNext).pStdPictureInfo(pStdPictureInfo).sliceCount(sliceCount);
    }

    /// Allocates a `VkVideoDecodeH264PictureInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pStdPictureInfo `pStdPictureInfo`
    /// @return the allocated `VkVideoDecodeH264PictureInfoKHR`
    public static VkVideoDecodeH264PictureInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pStdPictureInfo) {
        return alloc(allocator).sType(sType).pNext(pNext).pStdPictureInfo(pStdPictureInfo);
    }

    /// Allocates a `VkVideoDecodeH264PictureInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkVideoDecodeH264PictureInfoKHR`
    public static VkVideoDecodeH264PictureInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkVideoDecodeH264PictureInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkVideoDecodeH264PictureInfoKHR`
    public static VkVideoDecodeH264PictureInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoDecodeH264PictureInfoKHR copyFrom(VkVideoDecodeH264PictureInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoDecodeH264PictureInfoKHR reinterpret(long count) { return new VkVideoDecodeH264PictureInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoDecodeH264PictureInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoDecodeH264PictureInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pStdPictureInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pStdPictureInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pStdPictureInfo.get(segment, 0L, index); }
    /// {@return `pStdPictureInfo`}
    public MemorySegment pStdPictureInfo() { return pStdPictureInfo(this.segment(), 0L); }
    /// Sets `pStdPictureInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pStdPictureInfo(MemorySegment segment, long index, MemorySegment value) { VH_pStdPictureInfo.set(segment, 0L, index, value); }
    /// Sets `pStdPictureInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264PictureInfoKHR pStdPictureInfo(MemorySegment value) { pStdPictureInfo(this.segment(), 0L, value); return this; }

    /// {@return `sliceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sliceCount(MemorySegment segment, long index) { return (int) VH_sliceCount.get(segment, 0L, index); }
    /// {@return `sliceCount`}
    public int sliceCount() { return sliceCount(this.segment(), 0L); }
    /// Sets `sliceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sliceCount(MemorySegment segment, long index, int value) { VH_sliceCount.set(segment, 0L, index, value); }
    /// Sets `sliceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264PictureInfoKHR sliceCount(int value) { sliceCount(this.segment(), 0L, value); return this; }

    /// {@return `pSliceOffsets` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSliceOffsets(MemorySegment segment, long index) { return (MemorySegment) VH_pSliceOffsets.get(segment, 0L, index); }
    /// {@return `pSliceOffsets`}
    public MemorySegment pSliceOffsets() { return pSliceOffsets(this.segment(), 0L); }
    /// Sets `pSliceOffsets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSliceOffsets(MemorySegment segment, long index, MemorySegment value) { VH_pSliceOffsets.set(segment, 0L, index, value); }
    /// Sets `pSliceOffsets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264PictureInfoKHR pSliceOffsets(MemorySegment value) { pSliceOffsets(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoDecodeH264PictureInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoDecodeH264PictureInfoKHR`
    public VkVideoDecodeH264PictureInfoKHR asSlice(long index) { return new VkVideoDecodeH264PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoDecodeH264PictureInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoDecodeH264PictureInfoKHR`
    public VkVideoDecodeH264PictureInfoKHR asSlice(long index, long count) { return new VkVideoDecodeH264PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoDecodeH264PictureInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoDecodeH264PictureInfoKHR at(long index, Consumer<VkVideoDecodeH264PictureInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264PictureInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264PictureInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pStdPictureInfo` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pStdPictureInfoAt(long index) { return pStdPictureInfo(this.segment(), index); }
    /// Sets `pStdPictureInfo` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264PictureInfoKHR pStdPictureInfoAt(long index, MemorySegment value) { pStdPictureInfo(this.segment(), index, value); return this; }

    /// {@return `sliceCount` at the given index}
    /// @param index the index of the struct buffer
    public int sliceCountAt(long index) { return sliceCount(this.segment(), index); }
    /// Sets `sliceCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264PictureInfoKHR sliceCountAt(long index, int value) { sliceCount(this.segment(), index, value); return this; }

    /// {@return `pSliceOffsets` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pSliceOffsetsAt(long index) { return pSliceOffsets(this.segment(), index); }
    /// Sets `pSliceOffsets` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264PictureInfoKHR pSliceOffsetsAt(long index, MemorySegment value) { pSliceOffsets(this.segment(), index, value); return this; }

}

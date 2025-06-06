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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkVideoDecodeAV1PictureInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     const StdVideoDecodeAV1PictureInfo* pStdPictureInfo;
///     int32_t referenceNameSlotIndices[7];
///     uint32_t frameHeaderOffset;
///     uint32_t tileCount;
///     const uint32_t* pTileOffsets;
///     const uint32_t* pTileSizes;
/// };
/// ```
public sealed class VkVideoDecodeAV1PictureInfoKHR extends GroupType {
    /// The struct layout of `VkVideoDecodeAV1PictureInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pStdPictureInfo"),
        MemoryLayout.sequenceLayout(7, ValueLayout.JAVA_INT).withName("referenceNameSlotIndices"),
        ValueLayout.JAVA_INT.withName("frameHeaderOffset"),
        ValueLayout.JAVA_INT.withName("tileCount"),
        ValueLayout.ADDRESS.withName("pTileOffsets"),
        ValueLayout.ADDRESS.withName("pTileSizes")
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
    /// The byte offset of `referenceNameSlotIndices`.
    public static final long OFFSET_referenceNameSlotIndices = LAYOUT.byteOffset(PathElement.groupElement("referenceNameSlotIndices"));
    /// The memory layout of `referenceNameSlotIndices`.
    public static final MemoryLayout LAYOUT_referenceNameSlotIndices = LAYOUT.select(PathElement.groupElement("referenceNameSlotIndices"));
    /// The [VarHandle] of `referenceNameSlotIndices` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_referenceNameSlotIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("referenceNameSlotIndices"), PathElement.sequenceElement());
    /// The byte offset of `frameHeaderOffset`.
    public static final long OFFSET_frameHeaderOffset = LAYOUT.byteOffset(PathElement.groupElement("frameHeaderOffset"));
    /// The memory layout of `frameHeaderOffset`.
    public static final MemoryLayout LAYOUT_frameHeaderOffset = LAYOUT.select(PathElement.groupElement("frameHeaderOffset"));
    /// The [VarHandle] of `frameHeaderOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_frameHeaderOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frameHeaderOffset"));
    /// The byte offset of `tileCount`.
    public static final long OFFSET_tileCount = LAYOUT.byteOffset(PathElement.groupElement("tileCount"));
    /// The memory layout of `tileCount`.
    public static final MemoryLayout LAYOUT_tileCount = LAYOUT.select(PathElement.groupElement("tileCount"));
    /// The [VarHandle] of `tileCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tileCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileCount"));
    /// The byte offset of `pTileOffsets`.
    public static final long OFFSET_pTileOffsets = LAYOUT.byteOffset(PathElement.groupElement("pTileOffsets"));
    /// The memory layout of `pTileOffsets`.
    public static final MemoryLayout LAYOUT_pTileOffsets = LAYOUT.select(PathElement.groupElement("pTileOffsets"));
    /// The [VarHandle] of `pTileOffsets` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pTileOffsets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTileOffsets"));
    /// The byte offset of `pTileSizes`.
    public static final long OFFSET_pTileSizes = LAYOUT.byteOffset(PathElement.groupElement("pTileSizes"));
    /// The memory layout of `pTileSizes`.
    public static final MemoryLayout LAYOUT_pTileSizes = LAYOUT.select(PathElement.groupElement("pTileSizes"));
    /// The [VarHandle] of `pTileSizes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pTileSizes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTileSizes"));

    /// Creates `VkVideoDecodeAV1PictureInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoDecodeAV1PictureInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoDecodeAV1PictureInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoDecodeAV1PictureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeAV1PictureInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeAV1PictureInfoKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkVideoDecodeAV1PictureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoDecodeAV1PictureInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeAV1PictureInfoKHR`
    public static VkVideoDecodeAV1PictureInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeAV1PictureInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoDecodeAV1PictureInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoDecodeAV1PictureInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoDecodeAV1PictureInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pStdPictureInfo `pStdPictureInfo`
    /// @param referenceNameSlotIndices `referenceNameSlotIndices`
    /// @param frameHeaderOffset `frameHeaderOffset`
    /// @param tileCount `tileCount`
    /// @param pTileOffsets `pTileOffsets`
    /// @param pTileSizes `pTileSizes`
    /// @return the allocated `VkVideoDecodeAV1PictureInfoKHR`
    public static VkVideoDecodeAV1PictureInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pStdPictureInfo, MemorySegment referenceNameSlotIndices, int frameHeaderOffset, int tileCount, MemorySegment pTileOffsets, MemorySegment pTileSizes) {
        return alloc(allocator).sType(sType).pNext(pNext).pStdPictureInfo(pStdPictureInfo).referenceNameSlotIndices(referenceNameSlotIndices).frameHeaderOffset(frameHeaderOffset).tileCount(tileCount).pTileOffsets(pTileOffsets).pTileSizes(pTileSizes);
    }

    /// Allocates a `VkVideoDecodeAV1PictureInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pStdPictureInfo `pStdPictureInfo`
    /// @param referenceNameSlotIndices `referenceNameSlotIndices`
    /// @param frameHeaderOffset `frameHeaderOffset`
    /// @param tileCount `tileCount`
    /// @param pTileOffsets `pTileOffsets`
    /// @return the allocated `VkVideoDecodeAV1PictureInfoKHR`
    public static VkVideoDecodeAV1PictureInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pStdPictureInfo, MemorySegment referenceNameSlotIndices, int frameHeaderOffset, int tileCount, MemorySegment pTileOffsets) {
        return alloc(allocator).sType(sType).pNext(pNext).pStdPictureInfo(pStdPictureInfo).referenceNameSlotIndices(referenceNameSlotIndices).frameHeaderOffset(frameHeaderOffset).tileCount(tileCount).pTileOffsets(pTileOffsets);
    }

    /// Allocates a `VkVideoDecodeAV1PictureInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pStdPictureInfo `pStdPictureInfo`
    /// @param referenceNameSlotIndices `referenceNameSlotIndices`
    /// @param frameHeaderOffset `frameHeaderOffset`
    /// @param tileCount `tileCount`
    /// @return the allocated `VkVideoDecodeAV1PictureInfoKHR`
    public static VkVideoDecodeAV1PictureInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pStdPictureInfo, MemorySegment referenceNameSlotIndices, int frameHeaderOffset, int tileCount) {
        return alloc(allocator).sType(sType).pNext(pNext).pStdPictureInfo(pStdPictureInfo).referenceNameSlotIndices(referenceNameSlotIndices).frameHeaderOffset(frameHeaderOffset).tileCount(tileCount);
    }

    /// Allocates a `VkVideoDecodeAV1PictureInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pStdPictureInfo `pStdPictureInfo`
    /// @param referenceNameSlotIndices `referenceNameSlotIndices`
    /// @param frameHeaderOffset `frameHeaderOffset`
    /// @return the allocated `VkVideoDecodeAV1PictureInfoKHR`
    public static VkVideoDecodeAV1PictureInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pStdPictureInfo, MemorySegment referenceNameSlotIndices, int frameHeaderOffset) {
        return alloc(allocator).sType(sType).pNext(pNext).pStdPictureInfo(pStdPictureInfo).referenceNameSlotIndices(referenceNameSlotIndices).frameHeaderOffset(frameHeaderOffset);
    }

    /// Allocates a `VkVideoDecodeAV1PictureInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pStdPictureInfo `pStdPictureInfo`
    /// @param referenceNameSlotIndices `referenceNameSlotIndices`
    /// @return the allocated `VkVideoDecodeAV1PictureInfoKHR`
    public static VkVideoDecodeAV1PictureInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pStdPictureInfo, MemorySegment referenceNameSlotIndices) {
        return alloc(allocator).sType(sType).pNext(pNext).pStdPictureInfo(pStdPictureInfo).referenceNameSlotIndices(referenceNameSlotIndices);
    }

    /// Allocates a `VkVideoDecodeAV1PictureInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pStdPictureInfo `pStdPictureInfo`
    /// @return the allocated `VkVideoDecodeAV1PictureInfoKHR`
    public static VkVideoDecodeAV1PictureInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pStdPictureInfo) {
        return alloc(allocator).sType(sType).pNext(pNext).pStdPictureInfo(pStdPictureInfo);
    }

    /// Allocates a `VkVideoDecodeAV1PictureInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkVideoDecodeAV1PictureInfoKHR`
    public static VkVideoDecodeAV1PictureInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkVideoDecodeAV1PictureInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkVideoDecodeAV1PictureInfoKHR`
    public static VkVideoDecodeAV1PictureInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoDecodeAV1PictureInfoKHR copyFrom(VkVideoDecodeAV1PictureInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public VkVideoDecodeAV1PictureInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoDecodeAV1PictureInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkVideoDecodeAV1PictureInfoKHR pStdPictureInfo(MemorySegment value) { pStdPictureInfo(this.segment(), 0L, value); return this; }

    /// {@return `referenceNameSlotIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment referenceNameSlotIndices(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_referenceNameSlotIndices, index), LAYOUT_referenceNameSlotIndices); }
    /// {@return `referenceNameSlotIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static int referenceNameSlotIndices(MemorySegment segment, long index, long index0) { return (int) VH_referenceNameSlotIndices.get(segment, 0L, index, index0); }
    /// {@return `referenceNameSlotIndices`}
    public MemorySegment referenceNameSlotIndices() { return referenceNameSlotIndices(this.segment(), 0L); }
    /// {@return `referenceNameSlotIndices`}
    /// @param index0 the Index 0 of the array
    public int referenceNameSlotIndices(long index0) { return referenceNameSlotIndices(this.segment(), 0L, index0); }
    /// Sets `referenceNameSlotIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void referenceNameSlotIndices(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_referenceNameSlotIndices, index), LAYOUT_referenceNameSlotIndices.byteSize()); }
    /// Sets `referenceNameSlotIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void referenceNameSlotIndices(MemorySegment segment, long index, long index0, int value) { VH_referenceNameSlotIndices.set(segment, 0L, index, index0, value); }
    /// Sets `referenceNameSlotIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1PictureInfoKHR referenceNameSlotIndices(MemorySegment value) { referenceNameSlotIndices(this.segment(), 0L, value); return this; }
    /// Sets `referenceNameSlotIndices` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1PictureInfoKHR referenceNameSlotIndices(long index0, int value) { referenceNameSlotIndices(this.segment(), 0L, index0, value); return this; }

    /// {@return `frameHeaderOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int frameHeaderOffset(MemorySegment segment, long index) { return (int) VH_frameHeaderOffset.get(segment, 0L, index); }
    /// {@return `frameHeaderOffset`}
    public int frameHeaderOffset() { return frameHeaderOffset(this.segment(), 0L); }
    /// Sets `frameHeaderOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void frameHeaderOffset(MemorySegment segment, long index, int value) { VH_frameHeaderOffset.set(segment, 0L, index, value); }
    /// Sets `frameHeaderOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1PictureInfoKHR frameHeaderOffset(int value) { frameHeaderOffset(this.segment(), 0L, value); return this; }

    /// {@return `tileCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tileCount(MemorySegment segment, long index) { return (int) VH_tileCount.get(segment, 0L, index); }
    /// {@return `tileCount`}
    public int tileCount() { return tileCount(this.segment(), 0L); }
    /// Sets `tileCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tileCount(MemorySegment segment, long index, int value) { VH_tileCount.set(segment, 0L, index, value); }
    /// Sets `tileCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1PictureInfoKHR tileCount(int value) { tileCount(this.segment(), 0L, value); return this; }

    /// {@return `pTileOffsets` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pTileOffsets(MemorySegment segment, long index) { return (MemorySegment) VH_pTileOffsets.get(segment, 0L, index); }
    /// {@return `pTileOffsets`}
    public MemorySegment pTileOffsets() { return pTileOffsets(this.segment(), 0L); }
    /// Sets `pTileOffsets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pTileOffsets(MemorySegment segment, long index, MemorySegment value) { VH_pTileOffsets.set(segment, 0L, index, value); }
    /// Sets `pTileOffsets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1PictureInfoKHR pTileOffsets(MemorySegment value) { pTileOffsets(this.segment(), 0L, value); return this; }

    /// {@return `pTileSizes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pTileSizes(MemorySegment segment, long index) { return (MemorySegment) VH_pTileSizes.get(segment, 0L, index); }
    /// {@return `pTileSizes`}
    public MemorySegment pTileSizes() { return pTileSizes(this.segment(), 0L); }
    /// Sets `pTileSizes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pTileSizes(MemorySegment segment, long index, MemorySegment value) { VH_pTileSizes.set(segment, 0L, index, value); }
    /// Sets `pTileSizes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1PictureInfoKHR pTileSizes(MemorySegment value) { pTileSizes(this.segment(), 0L, value); return this; }

    /// A buffer of [VkVideoDecodeAV1PictureInfoKHR].
    public static final class Buffer extends VkVideoDecodeAV1PictureInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoDecodeAV1PictureInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoDecodeAV1PictureInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoDecodeAV1PictureInfoKHR`
        public VkVideoDecodeAV1PictureInfoKHR asSlice(long index) { return new VkVideoDecodeAV1PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoDecodeAV1PictureInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoDecodeAV1PictureInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `pStdPictureInfo` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pStdPictureInfoAt(long index) { return pStdPictureInfo(this.segment(), index); }
        /// Sets `pStdPictureInfo` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pStdPictureInfoAt(long index, MemorySegment value) { pStdPictureInfo(this.segment(), index, value); return this; }

        /// {@return `referenceNameSlotIndices` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment referenceNameSlotIndicesAt(long index) { return referenceNameSlotIndices(this.segment(), index); }
        /// {@return `referenceNameSlotIndices` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public int referenceNameSlotIndicesAt(long index, long index0) { return referenceNameSlotIndices(this.segment(), index, index0); }
        /// Sets `referenceNameSlotIndices` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer referenceNameSlotIndicesAt(long index, MemorySegment value) { referenceNameSlotIndices(this.segment(), index, value); return this; }
        /// Sets `referenceNameSlotIndices` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer referenceNameSlotIndicesAt(long index, long index0, int value) { referenceNameSlotIndices(this.segment(), index, index0, value); return this; }

        /// {@return `frameHeaderOffset` at the given index}
        /// @param index the index of the struct buffer
        public int frameHeaderOffsetAt(long index) { return frameHeaderOffset(this.segment(), index); }
        /// Sets `frameHeaderOffset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer frameHeaderOffsetAt(long index, int value) { frameHeaderOffset(this.segment(), index, value); return this; }

        /// {@return `tileCount` at the given index}
        /// @param index the index of the struct buffer
        public int tileCountAt(long index) { return tileCount(this.segment(), index); }
        /// Sets `tileCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer tileCountAt(long index, int value) { tileCount(this.segment(), index, value); return this; }

        /// {@return `pTileOffsets` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pTileOffsetsAt(long index) { return pTileOffsets(this.segment(), index); }
        /// Sets `pTileOffsets` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pTileOffsetsAt(long index, MemorySegment value) { pTileOffsets(this.segment(), index, value); return this; }

        /// {@return `pTileSizes` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pTileSizesAt(long index) { return pTileSizes(this.segment(), index); }
        /// Sets `pTileSizes` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pTileSizesAt(long index, MemorySegment value) { pTileSizes(this.segment(), index, value); return this; }

    }
}

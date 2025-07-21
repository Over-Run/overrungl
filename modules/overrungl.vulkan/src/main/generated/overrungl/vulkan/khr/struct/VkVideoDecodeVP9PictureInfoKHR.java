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
/// struct VkVideoDecodeVP9PictureInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     const StdVideoDecodeVP9PictureInfo* pStdPictureInfo;
///     int32_t referenceNameSlotIndices[3];
///     uint32_t uncompressedHeaderOffset;
///     uint32_t compressedHeaderOffset;
///     uint32_t tilesOffset;
/// };
/// ```
public final class VkVideoDecodeVP9PictureInfoKHR extends GroupType {
    /// The struct layout of `VkVideoDecodeVP9PictureInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pStdPictureInfo"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("referenceNameSlotIndices"),
        ValueLayout.JAVA_INT.withName("uncompressedHeaderOffset"),
        ValueLayout.JAVA_INT.withName("compressedHeaderOffset"),
        ValueLayout.JAVA_INT.withName("tilesOffset")
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
    /// The byte offset of `uncompressedHeaderOffset`.
    public static final long OFFSET_uncompressedHeaderOffset = LAYOUT.byteOffset(PathElement.groupElement("uncompressedHeaderOffset"));
    /// The memory layout of `uncompressedHeaderOffset`.
    public static final MemoryLayout LAYOUT_uncompressedHeaderOffset = LAYOUT.select(PathElement.groupElement("uncompressedHeaderOffset"));
    /// The [VarHandle] of `uncompressedHeaderOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_uncompressedHeaderOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uncompressedHeaderOffset"));
    /// The byte offset of `compressedHeaderOffset`.
    public static final long OFFSET_compressedHeaderOffset = LAYOUT.byteOffset(PathElement.groupElement("compressedHeaderOffset"));
    /// The memory layout of `compressedHeaderOffset`.
    public static final MemoryLayout LAYOUT_compressedHeaderOffset = LAYOUT.select(PathElement.groupElement("compressedHeaderOffset"));
    /// The [VarHandle] of `compressedHeaderOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_compressedHeaderOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("compressedHeaderOffset"));
    /// The byte offset of `tilesOffset`.
    public static final long OFFSET_tilesOffset = LAYOUT.byteOffset(PathElement.groupElement("tilesOffset"));
    /// The memory layout of `tilesOffset`.
    public static final MemoryLayout LAYOUT_tilesOffset = LAYOUT.select(PathElement.groupElement("tilesOffset"));
    /// The [VarHandle] of `tilesOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tilesOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tilesOffset"));

    /// Creates `VkVideoDecodeVP9PictureInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoDecodeVP9PictureInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoDecodeVP9PictureInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeVP9PictureInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeVP9PictureInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoDecodeVP9PictureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeVP9PictureInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeVP9PictureInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoDecodeVP9PictureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeVP9PictureInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeVP9PictureInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoDecodeVP9PictureInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeVP9PictureInfoKHR`
    public static VkVideoDecodeVP9PictureInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeVP9PictureInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoDecodeVP9PictureInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoDecodeVP9PictureInfoKHR`
    public static VkVideoDecodeVP9PictureInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeVP9PictureInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoDecodeVP9PictureInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pStdPictureInfo `pStdPictureInfo`
    /// @param referenceNameSlotIndices `referenceNameSlotIndices`
    /// @param uncompressedHeaderOffset `uncompressedHeaderOffset`
    /// @param compressedHeaderOffset `compressedHeaderOffset`
    /// @param tilesOffset `tilesOffset`
    /// @return the allocated `VkVideoDecodeVP9PictureInfoKHR`
    public static VkVideoDecodeVP9PictureInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pStdPictureInfo, MemorySegment referenceNameSlotIndices, int uncompressedHeaderOffset, int compressedHeaderOffset, int tilesOffset) {
        return alloc(allocator).sType(sType).pNext(pNext).pStdPictureInfo(pStdPictureInfo).referenceNameSlotIndices(referenceNameSlotIndices).uncompressedHeaderOffset(uncompressedHeaderOffset).compressedHeaderOffset(compressedHeaderOffset).tilesOffset(tilesOffset);
    }

    /// Allocates a `VkVideoDecodeVP9PictureInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pStdPictureInfo `pStdPictureInfo`
    /// @param referenceNameSlotIndices `referenceNameSlotIndices`
    /// @param uncompressedHeaderOffset `uncompressedHeaderOffset`
    /// @param compressedHeaderOffset `compressedHeaderOffset`
    /// @return the allocated `VkVideoDecodeVP9PictureInfoKHR`
    public static VkVideoDecodeVP9PictureInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pStdPictureInfo, MemorySegment referenceNameSlotIndices, int uncompressedHeaderOffset, int compressedHeaderOffset) {
        return alloc(allocator).sType(sType).pNext(pNext).pStdPictureInfo(pStdPictureInfo).referenceNameSlotIndices(referenceNameSlotIndices).uncompressedHeaderOffset(uncompressedHeaderOffset).compressedHeaderOffset(compressedHeaderOffset);
    }

    /// Allocates a `VkVideoDecodeVP9PictureInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pStdPictureInfo `pStdPictureInfo`
    /// @param referenceNameSlotIndices `referenceNameSlotIndices`
    /// @param uncompressedHeaderOffset `uncompressedHeaderOffset`
    /// @return the allocated `VkVideoDecodeVP9PictureInfoKHR`
    public static VkVideoDecodeVP9PictureInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pStdPictureInfo, MemorySegment referenceNameSlotIndices, int uncompressedHeaderOffset) {
        return alloc(allocator).sType(sType).pNext(pNext).pStdPictureInfo(pStdPictureInfo).referenceNameSlotIndices(referenceNameSlotIndices).uncompressedHeaderOffset(uncompressedHeaderOffset);
    }

    /// Allocates a `VkVideoDecodeVP9PictureInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pStdPictureInfo `pStdPictureInfo`
    /// @param referenceNameSlotIndices `referenceNameSlotIndices`
    /// @return the allocated `VkVideoDecodeVP9PictureInfoKHR`
    public static VkVideoDecodeVP9PictureInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pStdPictureInfo, MemorySegment referenceNameSlotIndices) {
        return alloc(allocator).sType(sType).pNext(pNext).pStdPictureInfo(pStdPictureInfo).referenceNameSlotIndices(referenceNameSlotIndices);
    }

    /// Allocates a `VkVideoDecodeVP9PictureInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pStdPictureInfo `pStdPictureInfo`
    /// @return the allocated `VkVideoDecodeVP9PictureInfoKHR`
    public static VkVideoDecodeVP9PictureInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pStdPictureInfo) {
        return alloc(allocator).sType(sType).pNext(pNext).pStdPictureInfo(pStdPictureInfo);
    }

    /// Allocates a `VkVideoDecodeVP9PictureInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkVideoDecodeVP9PictureInfoKHR`
    public static VkVideoDecodeVP9PictureInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkVideoDecodeVP9PictureInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkVideoDecodeVP9PictureInfoKHR`
    public static VkVideoDecodeVP9PictureInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoDecodeVP9PictureInfoKHR copyFrom(VkVideoDecodeVP9PictureInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoDecodeVP9PictureInfoKHR reinterpret(long count) { return new VkVideoDecodeVP9PictureInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoDecodeVP9PictureInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoDecodeVP9PictureInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkVideoDecodeVP9PictureInfoKHR pStdPictureInfo(MemorySegment value) { pStdPictureInfo(this.segment(), 0L, value); return this; }

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
    public VkVideoDecodeVP9PictureInfoKHR referenceNameSlotIndices(MemorySegment value) { referenceNameSlotIndices(this.segment(), 0L, value); return this; }
    /// Sets `referenceNameSlotIndices` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeVP9PictureInfoKHR referenceNameSlotIndices(long index0, int value) { referenceNameSlotIndices(this.segment(), 0L, index0, value); return this; }

    /// {@return `uncompressedHeaderOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int uncompressedHeaderOffset(MemorySegment segment, long index) { return (int) VH_uncompressedHeaderOffset.get(segment, 0L, index); }
    /// {@return `uncompressedHeaderOffset`}
    public int uncompressedHeaderOffset() { return uncompressedHeaderOffset(this.segment(), 0L); }
    /// Sets `uncompressedHeaderOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void uncompressedHeaderOffset(MemorySegment segment, long index, int value) { VH_uncompressedHeaderOffset.set(segment, 0L, index, value); }
    /// Sets `uncompressedHeaderOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeVP9PictureInfoKHR uncompressedHeaderOffset(int value) { uncompressedHeaderOffset(this.segment(), 0L, value); return this; }

    /// {@return `compressedHeaderOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int compressedHeaderOffset(MemorySegment segment, long index) { return (int) VH_compressedHeaderOffset.get(segment, 0L, index); }
    /// {@return `compressedHeaderOffset`}
    public int compressedHeaderOffset() { return compressedHeaderOffset(this.segment(), 0L); }
    /// Sets `compressedHeaderOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void compressedHeaderOffset(MemorySegment segment, long index, int value) { VH_compressedHeaderOffset.set(segment, 0L, index, value); }
    /// Sets `compressedHeaderOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeVP9PictureInfoKHR compressedHeaderOffset(int value) { compressedHeaderOffset(this.segment(), 0L, value); return this; }

    /// {@return `tilesOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tilesOffset(MemorySegment segment, long index) { return (int) VH_tilesOffset.get(segment, 0L, index); }
    /// {@return `tilesOffset`}
    public int tilesOffset() { return tilesOffset(this.segment(), 0L); }
    /// Sets `tilesOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tilesOffset(MemorySegment segment, long index, int value) { VH_tilesOffset.set(segment, 0L, index, value); }
    /// Sets `tilesOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeVP9PictureInfoKHR tilesOffset(int value) { tilesOffset(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoDecodeVP9PictureInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoDecodeVP9PictureInfoKHR`
    public VkVideoDecodeVP9PictureInfoKHR asSlice(long index) { return new VkVideoDecodeVP9PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoDecodeVP9PictureInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoDecodeVP9PictureInfoKHR`
    public VkVideoDecodeVP9PictureInfoKHR asSlice(long index, long count) { return new VkVideoDecodeVP9PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoDecodeVP9PictureInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoDecodeVP9PictureInfoKHR at(long index, Consumer<VkVideoDecodeVP9PictureInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeVP9PictureInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeVP9PictureInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pStdPictureInfo` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pStdPictureInfoAt(long index) { return pStdPictureInfo(this.segment(), index); }
    /// Sets `pStdPictureInfo` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeVP9PictureInfoKHR pStdPictureInfoAt(long index, MemorySegment value) { pStdPictureInfo(this.segment(), index, value); return this; }

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
    public VkVideoDecodeVP9PictureInfoKHR referenceNameSlotIndicesAt(long index, MemorySegment value) { referenceNameSlotIndices(this.segment(), index, value); return this; }
    /// Sets `referenceNameSlotIndices` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeVP9PictureInfoKHR referenceNameSlotIndicesAt(long index, long index0, int value) { referenceNameSlotIndices(this.segment(), index, index0, value); return this; }

    /// {@return `uncompressedHeaderOffset` at the given index}
    /// @param index the index of the struct buffer
    public int uncompressedHeaderOffsetAt(long index) { return uncompressedHeaderOffset(this.segment(), index); }
    /// Sets `uncompressedHeaderOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeVP9PictureInfoKHR uncompressedHeaderOffsetAt(long index, int value) { uncompressedHeaderOffset(this.segment(), index, value); return this; }

    /// {@return `compressedHeaderOffset` at the given index}
    /// @param index the index of the struct buffer
    public int compressedHeaderOffsetAt(long index) { return compressedHeaderOffset(this.segment(), index); }
    /// Sets `compressedHeaderOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeVP9PictureInfoKHR compressedHeaderOffsetAt(long index, int value) { compressedHeaderOffset(this.segment(), index, value); return this; }

    /// {@return `tilesOffset` at the given index}
    /// @param index the index of the struct buffer
    public int tilesOffsetAt(long index) { return tilesOffset(this.segment(), index); }
    /// Sets `tilesOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeVP9PictureInfoKHR tilesOffsetAt(long index, int value) { tilesOffset(this.segment(), index, value); return this; }

}

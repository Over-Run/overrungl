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
import static overrungl.vulkan.khr.VKKHRVideoDecodeAv1.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### pStdPictureInfo
/// [VarHandle][#VH_pStdPictureInfo] - [Getter][#pStdPictureInfo()] - [Setter][#pStdPictureInfo(java.lang.foreign.MemorySegment)]
/// ### referenceNameSlotIndices
/// [Byte offset][#OFFSET_referenceNameSlotIndices] - [Memory layout][#ML_referenceNameSlotIndices] - [Getter][#referenceNameSlotIndices()] - [Setter][#referenceNameSlotIndices(java.lang.foreign.MemorySegment)]
/// ### frameHeaderOffset
/// [VarHandle][#VH_frameHeaderOffset] - [Getter][#frameHeaderOffset()] - [Setter][#frameHeaderOffset(int)]
/// ### tileCount
/// [VarHandle][#VH_tileCount] - [Getter][#tileCount()] - [Setter][#tileCount(int)]
/// ### pTileOffsets
/// [VarHandle][#VH_pTileOffsets] - [Getter][#pTileOffsets()] - [Setter][#pTileOffsets(java.lang.foreign.MemorySegment)]
/// ### pTileSizes
/// [VarHandle][#VH_pTileSizes] - [Getter][#pTileSizes()] - [Setter][#pTileSizes(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoDecodeAV1PictureInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     const StdVideoDecodeAV1PictureInfo * pStdPictureInfo;
///     int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR] referenceNameSlotIndices;
///     uint32_t frameHeaderOffset;
///     uint32_t tileCount;
///     const uint32_t * pTileOffsets;
///     const uint32_t * pTileSizes;
/// } VkVideoDecodeAV1PictureInfoKHR;
/// ```
public final class VkVideoDecodeAV1PictureInfoKHR extends Struct {
    /// The struct layout of `VkVideoDecodeAV1PictureInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pStdPictureInfo"),
        MemoryLayout.sequenceLayout(VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR, ValueLayout.JAVA_INT).withName("referenceNameSlotIndices"),
        ValueLayout.JAVA_INT.withName("frameHeaderOffset"),
        ValueLayout.JAVA_INT.withName("tileCount"),
        ValueLayout.ADDRESS.withName("pTileOffsets"),
        ValueLayout.ADDRESS.withName("pTileSizes")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pStdPictureInfo` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pStdPictureInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdPictureInfo"));
    /// The byte offset of `referenceNameSlotIndices`.
    public static final long OFFSET_referenceNameSlotIndices = LAYOUT.byteOffset(PathElement.groupElement("referenceNameSlotIndices"));
    /// The memory layout of `referenceNameSlotIndices`.
    public static final MemoryLayout ML_referenceNameSlotIndices = LAYOUT.select(PathElement.groupElement("referenceNameSlotIndices"));
    /// The [VarHandle] of `frameHeaderOffset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_frameHeaderOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frameHeaderOffset"));
    /// The [VarHandle] of `tileCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_tileCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tileCount"));
    /// The [VarHandle] of `pTileOffsets` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pTileOffsets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTileOffsets"));
    /// The [VarHandle] of `pTileSizes` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pTileSizes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTileSizes"));

    /// Creates `VkVideoDecodeAV1PictureInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoDecodeAV1PictureInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoDecodeAV1PictureInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeAV1PictureInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeAV1PictureInfoKHR(segment); }

    /// Creates `VkVideoDecodeAV1PictureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeAV1PictureInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeAV1PictureInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoDecodeAV1PictureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeAV1PictureInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeAV1PictureInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoDecodeAV1PictureInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeAV1PictureInfoKHR`
    public static VkVideoDecodeAV1PictureInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeAV1PictureInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoDecodeAV1PictureInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoDecodeAV1PictureInfoKHR`
    public static VkVideoDecodeAV1PictureInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeAV1PictureInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkVideoDecodeAV1PictureInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoDecodeAV1PictureInfoKHR`
    public VkVideoDecodeAV1PictureInfoKHR asSlice(long index) { return new VkVideoDecodeAV1PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkVideoDecodeAV1PictureInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoDecodeAV1PictureInfoKHR`
    public VkVideoDecodeAV1PictureInfoKHR asSlice(long index, long count) { return new VkVideoDecodeAV1PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoDecodeAV1PictureInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoDecodeAV1PictureInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoDecodeAV1PictureInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoDecodeAV1PictureInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1PictureInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoDecodeAV1PictureInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1PictureInfoKHR sType(@CType("VkStructureType") int value) { VkVideoDecodeAV1PictureInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoDecodeAV1PictureInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoDecodeAV1PictureInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoDecodeAV1PictureInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1PictureInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1PictureInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1PictureInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1PictureInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1PictureInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `pStdPictureInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoDecodeAV1PictureInfo *") java.lang.foreign.MemorySegment get_pStdPictureInfo(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStdPictureInfo.get(segment, 0L, index); }
    /// {@return `pStdPictureInfo`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoDecodeAV1PictureInfo *") java.lang.foreign.MemorySegment get_pStdPictureInfo(MemorySegment segment) { return VkVideoDecodeAV1PictureInfoKHR.get_pStdPictureInfo(segment, 0L); }
    /// {@return `pStdPictureInfo` at the given index}
    /// @param index the index
    public @CType("const StdVideoDecodeAV1PictureInfo *") java.lang.foreign.MemorySegment pStdPictureInfoAt(long index) { return VkVideoDecodeAV1PictureInfoKHR.get_pStdPictureInfo(this.segment(), index); }
    /// {@return `pStdPictureInfo`}
    public @CType("const StdVideoDecodeAV1PictureInfo *") java.lang.foreign.MemorySegment pStdPictureInfo() { return VkVideoDecodeAV1PictureInfoKHR.get_pStdPictureInfo(this.segment()); }
    /// Sets `pStdPictureInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStdPictureInfo(MemorySegment segment, long index, @CType("const StdVideoDecodeAV1PictureInfo *") java.lang.foreign.MemorySegment value) { VH_pStdPictureInfo.set(segment, 0L, index, value); }
    /// Sets `pStdPictureInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStdPictureInfo(MemorySegment segment, @CType("const StdVideoDecodeAV1PictureInfo *") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1PictureInfoKHR.set_pStdPictureInfo(segment, 0L, value); }
    /// Sets `pStdPictureInfo` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1PictureInfoKHR pStdPictureInfoAt(long index, @CType("const StdVideoDecodeAV1PictureInfo *") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1PictureInfoKHR.set_pStdPictureInfo(this.segment(), index, value); return this; }
    /// Sets `pStdPictureInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1PictureInfoKHR pStdPictureInfo(@CType("const StdVideoDecodeAV1PictureInfo *") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1PictureInfoKHR.set_pStdPictureInfo(this.segment(), value); return this; }

    /// {@return `referenceNameSlotIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") java.lang.foreign.MemorySegment get_referenceNameSlotIndices(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_referenceNameSlotIndices, index), ML_referenceNameSlotIndices); }
    /// {@return `referenceNameSlotIndices`}
    /// @param segment the segment of the struct
    public static @CType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") java.lang.foreign.MemorySegment get_referenceNameSlotIndices(MemorySegment segment) { return VkVideoDecodeAV1PictureInfoKHR.get_referenceNameSlotIndices(segment, 0L); }
    /// {@return `referenceNameSlotIndices` at the given index}
    /// @param index the index
    public @CType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") java.lang.foreign.MemorySegment referenceNameSlotIndicesAt(long index) { return VkVideoDecodeAV1PictureInfoKHR.get_referenceNameSlotIndices(this.segment(), index); }
    /// {@return `referenceNameSlotIndices`}
    public @CType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") java.lang.foreign.MemorySegment referenceNameSlotIndices() { return VkVideoDecodeAV1PictureInfoKHR.get_referenceNameSlotIndices(this.segment()); }
    /// Sets `referenceNameSlotIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_referenceNameSlotIndices(MemorySegment segment, long index, @CType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_referenceNameSlotIndices, index), ML_referenceNameSlotIndices.byteSize()); }
    /// Sets `referenceNameSlotIndices` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_referenceNameSlotIndices(MemorySegment segment, @CType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1PictureInfoKHR.set_referenceNameSlotIndices(segment, 0L, value); }
    /// Sets `referenceNameSlotIndices` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1PictureInfoKHR referenceNameSlotIndicesAt(long index, @CType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1PictureInfoKHR.set_referenceNameSlotIndices(this.segment(), index, value); return this; }
    /// Sets `referenceNameSlotIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1PictureInfoKHR referenceNameSlotIndices(@CType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1PictureInfoKHR.set_referenceNameSlotIndices(this.segment(), value); return this; }

    /// {@return `frameHeaderOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_frameHeaderOffset(MemorySegment segment, long index) { return (int) VH_frameHeaderOffset.get(segment, 0L, index); }
    /// {@return `frameHeaderOffset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_frameHeaderOffset(MemorySegment segment) { return VkVideoDecodeAV1PictureInfoKHR.get_frameHeaderOffset(segment, 0L); }
    /// {@return `frameHeaderOffset` at the given index}
    /// @param index the index
    public @CType("uint32_t") int frameHeaderOffsetAt(long index) { return VkVideoDecodeAV1PictureInfoKHR.get_frameHeaderOffset(this.segment(), index); }
    /// {@return `frameHeaderOffset`}
    public @CType("uint32_t") int frameHeaderOffset() { return VkVideoDecodeAV1PictureInfoKHR.get_frameHeaderOffset(this.segment()); }
    /// Sets `frameHeaderOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_frameHeaderOffset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_frameHeaderOffset.set(segment, 0L, index, value); }
    /// Sets `frameHeaderOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_frameHeaderOffset(MemorySegment segment, @CType("uint32_t") int value) { VkVideoDecodeAV1PictureInfoKHR.set_frameHeaderOffset(segment, 0L, value); }
    /// Sets `frameHeaderOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1PictureInfoKHR frameHeaderOffsetAt(long index, @CType("uint32_t") int value) { VkVideoDecodeAV1PictureInfoKHR.set_frameHeaderOffset(this.segment(), index, value); return this; }
    /// Sets `frameHeaderOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1PictureInfoKHR frameHeaderOffset(@CType("uint32_t") int value) { VkVideoDecodeAV1PictureInfoKHR.set_frameHeaderOffset(this.segment(), value); return this; }

    /// {@return `tileCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_tileCount(MemorySegment segment, long index) { return (int) VH_tileCount.get(segment, 0L, index); }
    /// {@return `tileCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_tileCount(MemorySegment segment) { return VkVideoDecodeAV1PictureInfoKHR.get_tileCount(segment, 0L); }
    /// {@return `tileCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int tileCountAt(long index) { return VkVideoDecodeAV1PictureInfoKHR.get_tileCount(this.segment(), index); }
    /// {@return `tileCount`}
    public @CType("uint32_t") int tileCount() { return VkVideoDecodeAV1PictureInfoKHR.get_tileCount(this.segment()); }
    /// Sets `tileCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_tileCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_tileCount.set(segment, 0L, index, value); }
    /// Sets `tileCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_tileCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoDecodeAV1PictureInfoKHR.set_tileCount(segment, 0L, value); }
    /// Sets `tileCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1PictureInfoKHR tileCountAt(long index, @CType("uint32_t") int value) { VkVideoDecodeAV1PictureInfoKHR.set_tileCount(this.segment(), index, value); return this; }
    /// Sets `tileCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1PictureInfoKHR tileCount(@CType("uint32_t") int value) { VkVideoDecodeAV1PictureInfoKHR.set_tileCount(this.segment(), value); return this; }

    /// {@return `pTileOffsets` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pTileOffsets(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pTileOffsets.get(segment, 0L, index); }
    /// {@return `pTileOffsets`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pTileOffsets(MemorySegment segment) { return VkVideoDecodeAV1PictureInfoKHR.get_pTileOffsets(segment, 0L); }
    /// {@return `pTileOffsets` at the given index}
    /// @param index the index
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pTileOffsetsAt(long index) { return VkVideoDecodeAV1PictureInfoKHR.get_pTileOffsets(this.segment(), index); }
    /// {@return `pTileOffsets`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pTileOffsets() { return VkVideoDecodeAV1PictureInfoKHR.get_pTileOffsets(this.segment()); }
    /// Sets `pTileOffsets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pTileOffsets(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pTileOffsets.set(segment, 0L, index, value); }
    /// Sets `pTileOffsets` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pTileOffsets(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1PictureInfoKHR.set_pTileOffsets(segment, 0L, value); }
    /// Sets `pTileOffsets` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1PictureInfoKHR pTileOffsetsAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1PictureInfoKHR.set_pTileOffsets(this.segment(), index, value); return this; }
    /// Sets `pTileOffsets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1PictureInfoKHR pTileOffsets(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1PictureInfoKHR.set_pTileOffsets(this.segment(), value); return this; }

    /// {@return `pTileSizes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pTileSizes(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pTileSizes.get(segment, 0L, index); }
    /// {@return `pTileSizes`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pTileSizes(MemorySegment segment) { return VkVideoDecodeAV1PictureInfoKHR.get_pTileSizes(segment, 0L); }
    /// {@return `pTileSizes` at the given index}
    /// @param index the index
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pTileSizesAt(long index) { return VkVideoDecodeAV1PictureInfoKHR.get_pTileSizes(this.segment(), index); }
    /// {@return `pTileSizes`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pTileSizes() { return VkVideoDecodeAV1PictureInfoKHR.get_pTileSizes(this.segment()); }
    /// Sets `pTileSizes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pTileSizes(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pTileSizes.set(segment, 0L, index, value); }
    /// Sets `pTileSizes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pTileSizes(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1PictureInfoKHR.set_pTileSizes(segment, 0L, value); }
    /// Sets `pTileSizes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1PictureInfoKHR pTileSizesAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1PictureInfoKHR.set_pTileSizes(this.segment(), index, value); return this; }
    /// Sets `pTileSizes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1PictureInfoKHR pTileSizes(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1PictureInfoKHR.set_pTileSizes(this.segment(), value); return this; }

}

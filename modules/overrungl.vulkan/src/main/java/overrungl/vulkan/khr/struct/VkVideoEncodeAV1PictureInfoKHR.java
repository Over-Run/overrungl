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
/// ### predictionMode
/// [VarHandle][#VH_predictionMode] - [Getter][#predictionMode()] - [Setter][#predictionMode(int)]
/// ### rateControlGroup
/// [VarHandle][#VH_rateControlGroup] - [Getter][#rateControlGroup()] - [Setter][#rateControlGroup(int)]
/// ### constantQIndex
/// [VarHandle][#VH_constantQIndex] - [Getter][#constantQIndex()] - [Setter][#constantQIndex(int)]
/// ### pStdPictureInfo
/// [VarHandle][#VH_pStdPictureInfo] - [Getter][#pStdPictureInfo()] - [Setter][#pStdPictureInfo(java.lang.foreign.MemorySegment)]
/// ### referenceNameSlotIndices
/// [Byte offset handle][#MH_referenceNameSlotIndices] - [Memory layout][#ML_referenceNameSlotIndices] - [Getter][#referenceNameSlotIndices(long)] - [Setter][#referenceNameSlotIndices(long, java.lang.foreign.MemorySegment)]
/// ### primaryReferenceCdfOnly
/// [VarHandle][#VH_primaryReferenceCdfOnly] - [Getter][#primaryReferenceCdfOnly()] - [Setter][#primaryReferenceCdfOnly(int)]
/// ### generateObuExtensionHeader
/// [VarHandle][#VH_generateObuExtensionHeader] - [Getter][#generateObuExtensionHeader()] - [Setter][#generateObuExtensionHeader(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeAV1PictureInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkVideoEncodeAV1PredictionModeKHR predictionMode;
///     VkVideoEncodeAV1RateControlGroupKHR rateControlGroup;
///     uint32_t constantQIndex;
///     const StdVideoEncodeAV1PictureInfo * pStdPictureInfo;
///     int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR] referenceNameSlotIndices;
///     VkBool32 primaryReferenceCdfOnly;
///     VkBool32 generateObuExtensionHeader;
/// } VkVideoEncodeAV1PictureInfoKHR;
/// ```
public final class VkVideoEncodeAV1PictureInfoKHR extends Struct {
    /// The struct layout of `VkVideoEncodeAV1PictureInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("predictionMode"),
        ValueLayout.JAVA_INT.withName("rateControlGroup"),
        ValueLayout.JAVA_INT.withName("constantQIndex"),
        ValueLayout.ADDRESS.withName("pStdPictureInfo"),
        MemoryLayout.sequenceLayout(VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR, ValueLayout.JAVA_INT).withName("referenceNameSlotIndices"),
        ValueLayout.JAVA_INT.withName("primaryReferenceCdfOnly"),
        ValueLayout.JAVA_INT.withName("generateObuExtensionHeader")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `predictionMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_predictionMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("predictionMode"));
    /// The [VarHandle] of `rateControlGroup` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_rateControlGroup = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rateControlGroup"));
    /// The [VarHandle] of `constantQIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_constantQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("constantQIndex"));
    /// The [VarHandle] of `pStdPictureInfo` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pStdPictureInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdPictureInfo"));
    /// The byte offset handle of `referenceNameSlotIndices` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_referenceNameSlotIndices = LAYOUT.byteOffsetHandle(PathElement.groupElement("referenceNameSlotIndices"), PathElement.sequenceElement());
    /// The memory layout of `referenceNameSlotIndices`.
    public static final MemoryLayout ML_referenceNameSlotIndices = LAYOUT.select(PathElement.groupElement("referenceNameSlotIndices"));
    /// The [VarHandle] of `primaryReferenceCdfOnly` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_primaryReferenceCdfOnly = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primaryReferenceCdfOnly"));
    /// The [VarHandle] of `generateObuExtensionHeader` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_generateObuExtensionHeader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("generateObuExtensionHeader"));

    /// Creates `VkVideoEncodeAV1PictureInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeAV1PictureInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeAV1PictureInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1PictureInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeAV1PictureInfoKHR(segment); }

    /// Creates `VkVideoEncodeAV1PictureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1PictureInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeAV1PictureInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeAV1PictureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1PictureInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeAV1PictureInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoEncodeAV1PictureInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeAV1PictureInfoKHR`
    public static VkVideoEncodeAV1PictureInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1PictureInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeAV1PictureInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeAV1PictureInfoKHR`
    public static VkVideoEncodeAV1PictureInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeAV1PictureInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeAV1PictureInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeAV1PictureInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeAV1PictureInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeAV1PictureInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeAV1PictureInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeAV1PictureInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeAV1PictureInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeAV1PictureInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeAV1PictureInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1PictureInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1PictureInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1PictureInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `predictionMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeAV1PredictionModeKHR") int get_predictionMode(MemorySegment segment, long index) { return (int) VH_predictionMode.get(segment, 0L, index); }
    /// {@return `predictionMode`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeAV1PredictionModeKHR") int get_predictionMode(MemorySegment segment) { return VkVideoEncodeAV1PictureInfoKHR.get_predictionMode(segment, 0L); }
    /// {@return `predictionMode` at the given index}
    /// @param index the index
    public @CType("VkVideoEncodeAV1PredictionModeKHR") int predictionModeAt(long index) { return VkVideoEncodeAV1PictureInfoKHR.get_predictionMode(this.segment(), index); }
    /// {@return `predictionMode`}
    public @CType("VkVideoEncodeAV1PredictionModeKHR") int predictionMode() { return VkVideoEncodeAV1PictureInfoKHR.get_predictionMode(this.segment()); }
    /// Sets `predictionMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_predictionMode(MemorySegment segment, long index, @CType("VkVideoEncodeAV1PredictionModeKHR") int value) { VH_predictionMode.set(segment, 0L, index, value); }
    /// Sets `predictionMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_predictionMode(MemorySegment segment, @CType("VkVideoEncodeAV1PredictionModeKHR") int value) { VkVideoEncodeAV1PictureInfoKHR.set_predictionMode(segment, 0L, value); }
    /// Sets `predictionMode` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR predictionModeAt(long index, @CType("VkVideoEncodeAV1PredictionModeKHR") int value) { VkVideoEncodeAV1PictureInfoKHR.set_predictionMode(this.segment(), index, value); return this; }
    /// Sets `predictionMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR predictionMode(@CType("VkVideoEncodeAV1PredictionModeKHR") int value) { VkVideoEncodeAV1PictureInfoKHR.set_predictionMode(this.segment(), value); return this; }

    /// {@return `rateControlGroup` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeAV1RateControlGroupKHR") int get_rateControlGroup(MemorySegment segment, long index) { return (int) VH_rateControlGroup.get(segment, 0L, index); }
    /// {@return `rateControlGroup`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeAV1RateControlGroupKHR") int get_rateControlGroup(MemorySegment segment) { return VkVideoEncodeAV1PictureInfoKHR.get_rateControlGroup(segment, 0L); }
    /// {@return `rateControlGroup` at the given index}
    /// @param index the index
    public @CType("VkVideoEncodeAV1RateControlGroupKHR") int rateControlGroupAt(long index) { return VkVideoEncodeAV1PictureInfoKHR.get_rateControlGroup(this.segment(), index); }
    /// {@return `rateControlGroup`}
    public @CType("VkVideoEncodeAV1RateControlGroupKHR") int rateControlGroup() { return VkVideoEncodeAV1PictureInfoKHR.get_rateControlGroup(this.segment()); }
    /// Sets `rateControlGroup` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_rateControlGroup(MemorySegment segment, long index, @CType("VkVideoEncodeAV1RateControlGroupKHR") int value) { VH_rateControlGroup.set(segment, 0L, index, value); }
    /// Sets `rateControlGroup` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_rateControlGroup(MemorySegment segment, @CType("VkVideoEncodeAV1RateControlGroupKHR") int value) { VkVideoEncodeAV1PictureInfoKHR.set_rateControlGroup(segment, 0L, value); }
    /// Sets `rateControlGroup` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR rateControlGroupAt(long index, @CType("VkVideoEncodeAV1RateControlGroupKHR") int value) { VkVideoEncodeAV1PictureInfoKHR.set_rateControlGroup(this.segment(), index, value); return this; }
    /// Sets `rateControlGroup` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR rateControlGroup(@CType("VkVideoEncodeAV1RateControlGroupKHR") int value) { VkVideoEncodeAV1PictureInfoKHR.set_rateControlGroup(this.segment(), value); return this; }

    /// {@return `constantQIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_constantQIndex(MemorySegment segment, long index) { return (int) VH_constantQIndex.get(segment, 0L, index); }
    /// {@return `constantQIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_constantQIndex(MemorySegment segment) { return VkVideoEncodeAV1PictureInfoKHR.get_constantQIndex(segment, 0L); }
    /// {@return `constantQIndex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int constantQIndexAt(long index) { return VkVideoEncodeAV1PictureInfoKHR.get_constantQIndex(this.segment(), index); }
    /// {@return `constantQIndex`}
    public @CType("uint32_t") int constantQIndex() { return VkVideoEncodeAV1PictureInfoKHR.get_constantQIndex(this.segment()); }
    /// Sets `constantQIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_constantQIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_constantQIndex.set(segment, 0L, index, value); }
    /// Sets `constantQIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_constantQIndex(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1PictureInfoKHR.set_constantQIndex(segment, 0L, value); }
    /// Sets `constantQIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR constantQIndexAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1PictureInfoKHR.set_constantQIndex(this.segment(), index, value); return this; }
    /// Sets `constantQIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR constantQIndex(@CType("uint32_t") int value) { VkVideoEncodeAV1PictureInfoKHR.set_constantQIndex(this.segment(), value); return this; }

    /// {@return `pStdPictureInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoEncodeAV1PictureInfo *") java.lang.foreign.MemorySegment get_pStdPictureInfo(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStdPictureInfo.get(segment, 0L, index); }
    /// {@return `pStdPictureInfo`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoEncodeAV1PictureInfo *") java.lang.foreign.MemorySegment get_pStdPictureInfo(MemorySegment segment) { return VkVideoEncodeAV1PictureInfoKHR.get_pStdPictureInfo(segment, 0L); }
    /// {@return `pStdPictureInfo` at the given index}
    /// @param index the index
    public @CType("const StdVideoEncodeAV1PictureInfo *") java.lang.foreign.MemorySegment pStdPictureInfoAt(long index) { return VkVideoEncodeAV1PictureInfoKHR.get_pStdPictureInfo(this.segment(), index); }
    /// {@return `pStdPictureInfo`}
    public @CType("const StdVideoEncodeAV1PictureInfo *") java.lang.foreign.MemorySegment pStdPictureInfo() { return VkVideoEncodeAV1PictureInfoKHR.get_pStdPictureInfo(this.segment()); }
    /// Sets `pStdPictureInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStdPictureInfo(MemorySegment segment, long index, @CType("const StdVideoEncodeAV1PictureInfo *") java.lang.foreign.MemorySegment value) { VH_pStdPictureInfo.set(segment, 0L, index, value); }
    /// Sets `pStdPictureInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStdPictureInfo(MemorySegment segment, @CType("const StdVideoEncodeAV1PictureInfo *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1PictureInfoKHR.set_pStdPictureInfo(segment, 0L, value); }
    /// Sets `pStdPictureInfo` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR pStdPictureInfoAt(long index, @CType("const StdVideoEncodeAV1PictureInfo *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1PictureInfoKHR.set_pStdPictureInfo(this.segment(), index, value); return this; }
    /// Sets `pStdPictureInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR pStdPictureInfo(@CType("const StdVideoEncodeAV1PictureInfo *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1PictureInfoKHR.set_pStdPictureInfo(this.segment(), value); return this; }

    /// {@return `referenceNameSlotIndices` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") java.lang.foreign.MemorySegment get_referenceNameSlotIndices(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_referenceNameSlotIndices.invokeExact(0L, elementIndex), index), ML_referenceNameSlotIndices); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `referenceNameSlotIndices`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") java.lang.foreign.MemorySegment get_referenceNameSlotIndices(MemorySegment segment, long elementIndex) { return VkVideoEncodeAV1PictureInfoKHR.get_referenceNameSlotIndices(segment, 0L, elementIndex); }
    /// {@return `referenceNameSlotIndices` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") java.lang.foreign.MemorySegment referenceNameSlotIndicesAt(long index, long elementIndex) { return VkVideoEncodeAV1PictureInfoKHR.get_referenceNameSlotIndices(this.segment(), index, elementIndex); }
    /// {@return `referenceNameSlotIndices`}
    /// @param elementIndex the index of the element
    public @CType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") java.lang.foreign.MemorySegment referenceNameSlotIndices(long elementIndex) { return VkVideoEncodeAV1PictureInfoKHR.get_referenceNameSlotIndices(this.segment(), elementIndex); }
    /// Sets `referenceNameSlotIndices` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_referenceNameSlotIndices(MemorySegment segment, long index, long elementIndex, @CType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_referenceNameSlotIndices.invokeExact(0L, elementIndex), index), ML_referenceNameSlotIndices.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `referenceNameSlotIndices` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_referenceNameSlotIndices(MemorySegment segment, long elementIndex, @CType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1PictureInfoKHR.set_referenceNameSlotIndices(segment, 0L, elementIndex, value); }
    /// Sets `referenceNameSlotIndices` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR referenceNameSlotIndicesAt(long index, long elementIndex, @CType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1PictureInfoKHR.set_referenceNameSlotIndices(this.segment(), index, elementIndex, value); return this; }
    /// Sets `referenceNameSlotIndices` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR referenceNameSlotIndices(long elementIndex, @CType("int32_t[VK_MAX_VIDEO_AV1_REFERENCES_PER_FRAME_KHR]") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1PictureInfoKHR.set_referenceNameSlotIndices(this.segment(), elementIndex, value); return this; }

    /// {@return `primaryReferenceCdfOnly` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_primaryReferenceCdfOnly(MemorySegment segment, long index) { return (int) VH_primaryReferenceCdfOnly.get(segment, 0L, index); }
    /// {@return `primaryReferenceCdfOnly`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_primaryReferenceCdfOnly(MemorySegment segment) { return VkVideoEncodeAV1PictureInfoKHR.get_primaryReferenceCdfOnly(segment, 0L); }
    /// {@return `primaryReferenceCdfOnly` at the given index}
    /// @param index the index
    public @CType("VkBool32") int primaryReferenceCdfOnlyAt(long index) { return VkVideoEncodeAV1PictureInfoKHR.get_primaryReferenceCdfOnly(this.segment(), index); }
    /// {@return `primaryReferenceCdfOnly`}
    public @CType("VkBool32") int primaryReferenceCdfOnly() { return VkVideoEncodeAV1PictureInfoKHR.get_primaryReferenceCdfOnly(this.segment()); }
    /// Sets `primaryReferenceCdfOnly` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_primaryReferenceCdfOnly(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_primaryReferenceCdfOnly.set(segment, 0L, index, value); }
    /// Sets `primaryReferenceCdfOnly` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_primaryReferenceCdfOnly(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeAV1PictureInfoKHR.set_primaryReferenceCdfOnly(segment, 0L, value); }
    /// Sets `primaryReferenceCdfOnly` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR primaryReferenceCdfOnlyAt(long index, @CType("VkBool32") int value) { VkVideoEncodeAV1PictureInfoKHR.set_primaryReferenceCdfOnly(this.segment(), index, value); return this; }
    /// Sets `primaryReferenceCdfOnly` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR primaryReferenceCdfOnly(@CType("VkBool32") int value) { VkVideoEncodeAV1PictureInfoKHR.set_primaryReferenceCdfOnly(this.segment(), value); return this; }

    /// {@return `generateObuExtensionHeader` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_generateObuExtensionHeader(MemorySegment segment, long index) { return (int) VH_generateObuExtensionHeader.get(segment, 0L, index); }
    /// {@return `generateObuExtensionHeader`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_generateObuExtensionHeader(MemorySegment segment) { return VkVideoEncodeAV1PictureInfoKHR.get_generateObuExtensionHeader(segment, 0L); }
    /// {@return `generateObuExtensionHeader` at the given index}
    /// @param index the index
    public @CType("VkBool32") int generateObuExtensionHeaderAt(long index) { return VkVideoEncodeAV1PictureInfoKHR.get_generateObuExtensionHeader(this.segment(), index); }
    /// {@return `generateObuExtensionHeader`}
    public @CType("VkBool32") int generateObuExtensionHeader() { return VkVideoEncodeAV1PictureInfoKHR.get_generateObuExtensionHeader(this.segment()); }
    /// Sets `generateObuExtensionHeader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_generateObuExtensionHeader(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_generateObuExtensionHeader.set(segment, 0L, index, value); }
    /// Sets `generateObuExtensionHeader` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_generateObuExtensionHeader(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeAV1PictureInfoKHR.set_generateObuExtensionHeader(segment, 0L, value); }
    /// Sets `generateObuExtensionHeader` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR generateObuExtensionHeaderAt(long index, @CType("VkBool32") int value) { VkVideoEncodeAV1PictureInfoKHR.set_generateObuExtensionHeader(this.segment(), index, value); return this; }
    /// Sets `generateObuExtensionHeader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR generateObuExtensionHeader(@CType("VkBool32") int value) { VkVideoEncodeAV1PictureInfoKHR.set_generateObuExtensionHeader(this.segment(), value); return this; }

}
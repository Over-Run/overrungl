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

/// Represents `VkVideoEncodeAV1PictureInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoEncodeAV1PictureInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkVideoEncodeAV1PredictionModeKHR predictionMode;
///     (int) VkVideoEncodeAV1RateControlGroupKHR rateControlGroup;
///     uint32_t constantQIndex;
///     const StdVideoEncodeAV1PictureInfo* pStdPictureInfo;
///     int32_t referenceNameSlotIndices[7];
///     (uint32_t) VkBool32 primaryReferenceCdfOnly;
///     (uint32_t) VkBool32 generateObuExtensionHeader;
/// };
/// ```
public final class VkVideoEncodeAV1PictureInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeAV1PictureInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("predictionMode"),
        ValueLayout.JAVA_INT.withName("rateControlGroup"),
        ValueLayout.JAVA_INT.withName("constantQIndex"),
        ValueLayout.ADDRESS.withName("pStdPictureInfo"),
        MemoryLayout.sequenceLayout(7, ValueLayout.JAVA_INT).withName("referenceNameSlotIndices"),
        ValueLayout.JAVA_INT.withName("primaryReferenceCdfOnly"),
        ValueLayout.JAVA_INT.withName("generateObuExtensionHeader")
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
    /// The byte offset of `predictionMode`.
    public static final long OFFSET_predictionMode = LAYOUT.byteOffset(PathElement.groupElement("predictionMode"));
    /// The memory layout of `predictionMode`.
    public static final MemoryLayout LAYOUT_predictionMode = LAYOUT.select(PathElement.groupElement("predictionMode"));
    /// The [VarHandle] of `predictionMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_predictionMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("predictionMode"));
    /// The byte offset of `rateControlGroup`.
    public static final long OFFSET_rateControlGroup = LAYOUT.byteOffset(PathElement.groupElement("rateControlGroup"));
    /// The memory layout of `rateControlGroup`.
    public static final MemoryLayout LAYOUT_rateControlGroup = LAYOUT.select(PathElement.groupElement("rateControlGroup"));
    /// The [VarHandle] of `rateControlGroup` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_rateControlGroup = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rateControlGroup"));
    /// The byte offset of `constantQIndex`.
    public static final long OFFSET_constantQIndex = LAYOUT.byteOffset(PathElement.groupElement("constantQIndex"));
    /// The memory layout of `constantQIndex`.
    public static final MemoryLayout LAYOUT_constantQIndex = LAYOUT.select(PathElement.groupElement("constantQIndex"));
    /// The [VarHandle] of `constantQIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_constantQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("constantQIndex"));
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
    /// The byte offset of `primaryReferenceCdfOnly`.
    public static final long OFFSET_primaryReferenceCdfOnly = LAYOUT.byteOffset(PathElement.groupElement("primaryReferenceCdfOnly"));
    /// The memory layout of `primaryReferenceCdfOnly`.
    public static final MemoryLayout LAYOUT_primaryReferenceCdfOnly = LAYOUT.select(PathElement.groupElement("primaryReferenceCdfOnly"));
    /// The [VarHandle] of `primaryReferenceCdfOnly` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_primaryReferenceCdfOnly = LAYOUT.arrayElementVarHandle(PathElement.groupElement("primaryReferenceCdfOnly"));
    /// The byte offset of `generateObuExtensionHeader`.
    public static final long OFFSET_generateObuExtensionHeader = LAYOUT.byteOffset(PathElement.groupElement("generateObuExtensionHeader"));
    /// The memory layout of `generateObuExtensionHeader`.
    public static final MemoryLayout LAYOUT_generateObuExtensionHeader = LAYOUT.select(PathElement.groupElement("generateObuExtensionHeader"));
    /// The [VarHandle] of `generateObuExtensionHeader` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_generateObuExtensionHeader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("generateObuExtensionHeader"));

    /// Creates `VkVideoEncodeAV1PictureInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeAV1PictureInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeAV1PictureInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1PictureInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1PictureInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeAV1PictureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1PictureInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1PictureInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeAV1PictureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1PictureInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1PictureInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeAV1PictureInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeAV1PictureInfoKHR`
    public static VkVideoEncodeAV1PictureInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1PictureInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeAV1PictureInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeAV1PictureInfoKHR`
    public static VkVideoEncodeAV1PictureInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeAV1PictureInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR copyFrom(VkVideoEncodeAV1PictureInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeAV1PictureInfoKHR reinterpret(long count) { return new VkVideoEncodeAV1PictureInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoEncodeAV1PictureInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeAV1PictureInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `predictionMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int predictionMode(MemorySegment segment, long index) { return (int) VH_predictionMode.get(segment, 0L, index); }
    /// {@return `predictionMode`}
    public int predictionMode() { return predictionMode(this.segment(), 0L); }
    /// Sets `predictionMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void predictionMode(MemorySegment segment, long index, int value) { VH_predictionMode.set(segment, 0L, index, value); }
    /// Sets `predictionMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR predictionMode(int value) { predictionMode(this.segment(), 0L, value); return this; }

    /// {@return `rateControlGroup` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int rateControlGroup(MemorySegment segment, long index) { return (int) VH_rateControlGroup.get(segment, 0L, index); }
    /// {@return `rateControlGroup`}
    public int rateControlGroup() { return rateControlGroup(this.segment(), 0L); }
    /// Sets `rateControlGroup` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void rateControlGroup(MemorySegment segment, long index, int value) { VH_rateControlGroup.set(segment, 0L, index, value); }
    /// Sets `rateControlGroup` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR rateControlGroup(int value) { rateControlGroup(this.segment(), 0L, value); return this; }

    /// {@return `constantQIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int constantQIndex(MemorySegment segment, long index) { return (int) VH_constantQIndex.get(segment, 0L, index); }
    /// {@return `constantQIndex`}
    public int constantQIndex() { return constantQIndex(this.segment(), 0L); }
    /// Sets `constantQIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void constantQIndex(MemorySegment segment, long index, int value) { VH_constantQIndex.set(segment, 0L, index, value); }
    /// Sets `constantQIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR constantQIndex(int value) { constantQIndex(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeAV1PictureInfoKHR pStdPictureInfo(MemorySegment value) { pStdPictureInfo(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeAV1PictureInfoKHR referenceNameSlotIndices(MemorySegment value) { referenceNameSlotIndices(this.segment(), 0L, value); return this; }
    /// Sets `referenceNameSlotIndices` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR referenceNameSlotIndices(long index0, int value) { referenceNameSlotIndices(this.segment(), 0L, index0, value); return this; }

    /// {@return `primaryReferenceCdfOnly` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int primaryReferenceCdfOnly(MemorySegment segment, long index) { return (int) VH_primaryReferenceCdfOnly.get(segment, 0L, index); }
    /// {@return `primaryReferenceCdfOnly`}
    public int primaryReferenceCdfOnly() { return primaryReferenceCdfOnly(this.segment(), 0L); }
    /// Sets `primaryReferenceCdfOnly` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void primaryReferenceCdfOnly(MemorySegment segment, long index, int value) { VH_primaryReferenceCdfOnly.set(segment, 0L, index, value); }
    /// Sets `primaryReferenceCdfOnly` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR primaryReferenceCdfOnly(int value) { primaryReferenceCdfOnly(this.segment(), 0L, value); return this; }

    /// {@return `generateObuExtensionHeader` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int generateObuExtensionHeader(MemorySegment segment, long index) { return (int) VH_generateObuExtensionHeader.get(segment, 0L, index); }
    /// {@return `generateObuExtensionHeader`}
    public int generateObuExtensionHeader() { return generateObuExtensionHeader(this.segment(), 0L); }
    /// Sets `generateObuExtensionHeader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void generateObuExtensionHeader(MemorySegment segment, long index, int value) { VH_generateObuExtensionHeader.set(segment, 0L, index, value); }
    /// Sets `generateObuExtensionHeader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR generateObuExtensionHeader(int value) { generateObuExtensionHeader(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoEncodeAV1PictureInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeAV1PictureInfoKHR`
    public VkVideoEncodeAV1PictureInfoKHR asSlice(long index) { return new VkVideoEncodeAV1PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeAV1PictureInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeAV1PictureInfoKHR`
    public VkVideoEncodeAV1PictureInfoKHR asSlice(long index, long count) { return new VkVideoEncodeAV1PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeAV1PictureInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR at(long index, Consumer<VkVideoEncodeAV1PictureInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `predictionMode` at the given index}
    /// @param index the index of the struct buffer
    public int predictionModeAt(long index) { return predictionMode(this.segment(), index); }
    /// Sets `predictionMode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR predictionModeAt(long index, int value) { predictionMode(this.segment(), index, value); return this; }

    /// {@return `rateControlGroup` at the given index}
    /// @param index the index of the struct buffer
    public int rateControlGroupAt(long index) { return rateControlGroup(this.segment(), index); }
    /// Sets `rateControlGroup` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR rateControlGroupAt(long index, int value) { rateControlGroup(this.segment(), index, value); return this; }

    /// {@return `constantQIndex` at the given index}
    /// @param index the index of the struct buffer
    public int constantQIndexAt(long index) { return constantQIndex(this.segment(), index); }
    /// Sets `constantQIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR constantQIndexAt(long index, int value) { constantQIndex(this.segment(), index, value); return this; }

    /// {@return `pStdPictureInfo` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pStdPictureInfoAt(long index) { return pStdPictureInfo(this.segment(), index); }
    /// Sets `pStdPictureInfo` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR pStdPictureInfoAt(long index, MemorySegment value) { pStdPictureInfo(this.segment(), index, value); return this; }

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
    public VkVideoEncodeAV1PictureInfoKHR referenceNameSlotIndicesAt(long index, MemorySegment value) { referenceNameSlotIndices(this.segment(), index, value); return this; }
    /// Sets `referenceNameSlotIndices` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR referenceNameSlotIndicesAt(long index, long index0, int value) { referenceNameSlotIndices(this.segment(), index, index0, value); return this; }

    /// {@return `primaryReferenceCdfOnly` at the given index}
    /// @param index the index of the struct buffer
    public int primaryReferenceCdfOnlyAt(long index) { return primaryReferenceCdfOnly(this.segment(), index); }
    /// Sets `primaryReferenceCdfOnly` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR primaryReferenceCdfOnlyAt(long index, int value) { primaryReferenceCdfOnly(this.segment(), index, value); return this; }

    /// {@return `generateObuExtensionHeader` at the given index}
    /// @param index the index of the struct buffer
    public int generateObuExtensionHeaderAt(long index) { return generateObuExtensionHeader(this.segment(), index); }
    /// Sets `generateObuExtensionHeader` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1PictureInfoKHR generateObuExtensionHeaderAt(long index, int value) { generateObuExtensionHeader(this.segment(), index, value); return this; }

}

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
/// struct VkVideoDecodeH265SessionParametersAddInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t stdVPSCount;
///     const StdVideoH265VideoParameterSet* pStdVPSs;
///     uint32_t stdSPSCount;
///     const StdVideoH265SequenceParameterSet* pStdSPSs;
///     uint32_t stdPPSCount;
///     const StdVideoH265PictureParameterSet* pStdPPSs;
/// };
/// ```
public final class VkVideoDecodeH265SessionParametersAddInfoKHR extends GroupType {
    /// The struct layout of `VkVideoDecodeH265SessionParametersAddInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stdVPSCount"),
        ValueLayout.ADDRESS.withName("pStdVPSs"),
        ValueLayout.JAVA_INT.withName("stdSPSCount"),
        ValueLayout.ADDRESS.withName("pStdSPSs"),
        ValueLayout.JAVA_INT.withName("stdPPSCount"),
        ValueLayout.ADDRESS.withName("pStdPPSs")
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
    /// The byte offset of `stdVPSCount`.
    public static final long OFFSET_stdVPSCount = LAYOUT.byteOffset(PathElement.groupElement("stdVPSCount"));
    /// The memory layout of `stdVPSCount`.
    public static final MemoryLayout LAYOUT_stdVPSCount = LAYOUT.select(PathElement.groupElement("stdVPSCount"));
    /// The [VarHandle] of `stdVPSCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stdVPSCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdVPSCount"));
    /// The byte offset of `pStdVPSs`.
    public static final long OFFSET_pStdVPSs = LAYOUT.byteOffset(PathElement.groupElement("pStdVPSs"));
    /// The memory layout of `pStdVPSs`.
    public static final MemoryLayout LAYOUT_pStdVPSs = LAYOUT.select(PathElement.groupElement("pStdVPSs"));
    /// The [VarHandle] of `pStdVPSs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pStdVPSs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdVPSs"));
    /// The byte offset of `stdSPSCount`.
    public static final long OFFSET_stdSPSCount = LAYOUT.byteOffset(PathElement.groupElement("stdSPSCount"));
    /// The memory layout of `stdSPSCount`.
    public static final MemoryLayout LAYOUT_stdSPSCount = LAYOUT.select(PathElement.groupElement("stdSPSCount"));
    /// The [VarHandle] of `stdSPSCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stdSPSCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdSPSCount"));
    /// The byte offset of `pStdSPSs`.
    public static final long OFFSET_pStdSPSs = LAYOUT.byteOffset(PathElement.groupElement("pStdSPSs"));
    /// The memory layout of `pStdSPSs`.
    public static final MemoryLayout LAYOUT_pStdSPSs = LAYOUT.select(PathElement.groupElement("pStdSPSs"));
    /// The [VarHandle] of `pStdSPSs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pStdSPSs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdSPSs"));
    /// The byte offset of `stdPPSCount`.
    public static final long OFFSET_stdPPSCount = LAYOUT.byteOffset(PathElement.groupElement("stdPPSCount"));
    /// The memory layout of `stdPPSCount`.
    public static final MemoryLayout LAYOUT_stdPPSCount = LAYOUT.select(PathElement.groupElement("stdPPSCount"));
    /// The [VarHandle] of `stdPPSCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stdPPSCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdPPSCount"));
    /// The byte offset of `pStdPPSs`.
    public static final long OFFSET_pStdPPSs = LAYOUT.byteOffset(PathElement.groupElement("pStdPPSs"));
    /// The memory layout of `pStdPPSs`.
    public static final MemoryLayout LAYOUT_pStdPPSs = LAYOUT.select(PathElement.groupElement("pStdPPSs"));
    /// The [VarHandle] of `pStdPPSs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pStdPPSs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdPPSs"));

    /// Creates `VkVideoDecodeH265SessionParametersAddInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoDecodeH265SessionParametersAddInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoDecodeH265SessionParametersAddInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH265SessionParametersAddInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH265SessionParametersAddInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoDecodeH265SessionParametersAddInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH265SessionParametersAddInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH265SessionParametersAddInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoDecodeH265SessionParametersAddInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH265SessionParametersAddInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH265SessionParametersAddInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoDecodeH265SessionParametersAddInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeH265SessionParametersAddInfoKHR`
    public static VkVideoDecodeH265SessionParametersAddInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeH265SessionParametersAddInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoDecodeH265SessionParametersAddInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoDecodeH265SessionParametersAddInfoKHR`
    public static VkVideoDecodeH265SessionParametersAddInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeH265SessionParametersAddInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoDecodeH265SessionParametersAddInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param stdVPSCount `stdVPSCount`
    /// @param pStdVPSs `pStdVPSs`
    /// @param stdSPSCount `stdSPSCount`
    /// @param pStdSPSs `pStdSPSs`
    /// @param stdPPSCount `stdPPSCount`
    /// @param pStdPPSs `pStdPPSs`
    /// @return the allocated `VkVideoDecodeH265SessionParametersAddInfoKHR`
    public static VkVideoDecodeH265SessionParametersAddInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int stdVPSCount, MemorySegment pStdVPSs, int stdSPSCount, MemorySegment pStdSPSs, int stdPPSCount, MemorySegment pStdPPSs) {
        return alloc(allocator).sType(sType).pNext(pNext).stdVPSCount(stdVPSCount).pStdVPSs(pStdVPSs).stdSPSCount(stdSPSCount).pStdSPSs(pStdSPSs).stdPPSCount(stdPPSCount).pStdPPSs(pStdPPSs);
    }

    /// Allocates a `VkVideoDecodeH265SessionParametersAddInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param stdVPSCount `stdVPSCount`
    /// @param pStdVPSs `pStdVPSs`
    /// @param stdSPSCount `stdSPSCount`
    /// @param pStdSPSs `pStdSPSs`
    /// @param stdPPSCount `stdPPSCount`
    /// @return the allocated `VkVideoDecodeH265SessionParametersAddInfoKHR`
    public static VkVideoDecodeH265SessionParametersAddInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int stdVPSCount, MemorySegment pStdVPSs, int stdSPSCount, MemorySegment pStdSPSs, int stdPPSCount) {
        return alloc(allocator).sType(sType).pNext(pNext).stdVPSCount(stdVPSCount).pStdVPSs(pStdVPSs).stdSPSCount(stdSPSCount).pStdSPSs(pStdSPSs).stdPPSCount(stdPPSCount);
    }

    /// Allocates a `VkVideoDecodeH265SessionParametersAddInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param stdVPSCount `stdVPSCount`
    /// @param pStdVPSs `pStdVPSs`
    /// @param stdSPSCount `stdSPSCount`
    /// @param pStdSPSs `pStdSPSs`
    /// @return the allocated `VkVideoDecodeH265SessionParametersAddInfoKHR`
    public static VkVideoDecodeH265SessionParametersAddInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int stdVPSCount, MemorySegment pStdVPSs, int stdSPSCount, MemorySegment pStdSPSs) {
        return alloc(allocator).sType(sType).pNext(pNext).stdVPSCount(stdVPSCount).pStdVPSs(pStdVPSs).stdSPSCount(stdSPSCount).pStdSPSs(pStdSPSs);
    }

    /// Allocates a `VkVideoDecodeH265SessionParametersAddInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param stdVPSCount `stdVPSCount`
    /// @param pStdVPSs `pStdVPSs`
    /// @param stdSPSCount `stdSPSCount`
    /// @return the allocated `VkVideoDecodeH265SessionParametersAddInfoKHR`
    public static VkVideoDecodeH265SessionParametersAddInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int stdVPSCount, MemorySegment pStdVPSs, int stdSPSCount) {
        return alloc(allocator).sType(sType).pNext(pNext).stdVPSCount(stdVPSCount).pStdVPSs(pStdVPSs).stdSPSCount(stdSPSCount);
    }

    /// Allocates a `VkVideoDecodeH265SessionParametersAddInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param stdVPSCount `stdVPSCount`
    /// @param pStdVPSs `pStdVPSs`
    /// @return the allocated `VkVideoDecodeH265SessionParametersAddInfoKHR`
    public static VkVideoDecodeH265SessionParametersAddInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int stdVPSCount, MemorySegment pStdVPSs) {
        return alloc(allocator).sType(sType).pNext(pNext).stdVPSCount(stdVPSCount).pStdVPSs(pStdVPSs);
    }

    /// Allocates a `VkVideoDecodeH265SessionParametersAddInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param stdVPSCount `stdVPSCount`
    /// @return the allocated `VkVideoDecodeH265SessionParametersAddInfoKHR`
    public static VkVideoDecodeH265SessionParametersAddInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int stdVPSCount) {
        return alloc(allocator).sType(sType).pNext(pNext).stdVPSCount(stdVPSCount);
    }

    /// Allocates a `VkVideoDecodeH265SessionParametersAddInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkVideoDecodeH265SessionParametersAddInfoKHR`
    public static VkVideoDecodeH265SessionParametersAddInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkVideoDecodeH265SessionParametersAddInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkVideoDecodeH265SessionParametersAddInfoKHR`
    public static VkVideoDecodeH265SessionParametersAddInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR copyFrom(VkVideoDecodeH265SessionParametersAddInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoDecodeH265SessionParametersAddInfoKHR reinterpret(long count) { return new VkVideoDecodeH265SessionParametersAddInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoDecodeH265SessionParametersAddInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoDecodeH265SessionParametersAddInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `stdVPSCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stdVPSCount(MemorySegment segment, long index) { return (int) VH_stdVPSCount.get(segment, 0L, index); }
    /// {@return `stdVPSCount`}
    public int stdVPSCount() { return stdVPSCount(this.segment(), 0L); }
    /// Sets `stdVPSCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stdVPSCount(MemorySegment segment, long index, int value) { VH_stdVPSCount.set(segment, 0L, index, value); }
    /// Sets `stdVPSCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR stdVPSCount(int value) { stdVPSCount(this.segment(), 0L, value); return this; }

    /// {@return `pStdVPSs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pStdVPSs(MemorySegment segment, long index) { return (MemorySegment) VH_pStdVPSs.get(segment, 0L, index); }
    /// {@return `pStdVPSs`}
    public MemorySegment pStdVPSs() { return pStdVPSs(this.segment(), 0L); }
    /// Sets `pStdVPSs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pStdVPSs(MemorySegment segment, long index, MemorySegment value) { VH_pStdVPSs.set(segment, 0L, index, value); }
    /// Sets `pStdVPSs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR pStdVPSs(MemorySegment value) { pStdVPSs(this.segment(), 0L, value); return this; }

    /// {@return `stdSPSCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stdSPSCount(MemorySegment segment, long index) { return (int) VH_stdSPSCount.get(segment, 0L, index); }
    /// {@return `stdSPSCount`}
    public int stdSPSCount() { return stdSPSCount(this.segment(), 0L); }
    /// Sets `stdSPSCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stdSPSCount(MemorySegment segment, long index, int value) { VH_stdSPSCount.set(segment, 0L, index, value); }
    /// Sets `stdSPSCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR stdSPSCount(int value) { stdSPSCount(this.segment(), 0L, value); return this; }

    /// {@return `pStdSPSs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pStdSPSs(MemorySegment segment, long index) { return (MemorySegment) VH_pStdSPSs.get(segment, 0L, index); }
    /// {@return `pStdSPSs`}
    public MemorySegment pStdSPSs() { return pStdSPSs(this.segment(), 0L); }
    /// Sets `pStdSPSs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pStdSPSs(MemorySegment segment, long index, MemorySegment value) { VH_pStdSPSs.set(segment, 0L, index, value); }
    /// Sets `pStdSPSs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR pStdSPSs(MemorySegment value) { pStdSPSs(this.segment(), 0L, value); return this; }

    /// {@return `stdPPSCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stdPPSCount(MemorySegment segment, long index) { return (int) VH_stdPPSCount.get(segment, 0L, index); }
    /// {@return `stdPPSCount`}
    public int stdPPSCount() { return stdPPSCount(this.segment(), 0L); }
    /// Sets `stdPPSCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stdPPSCount(MemorySegment segment, long index, int value) { VH_stdPPSCount.set(segment, 0L, index, value); }
    /// Sets `stdPPSCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR stdPPSCount(int value) { stdPPSCount(this.segment(), 0L, value); return this; }

    /// {@return `pStdPPSs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pStdPPSs(MemorySegment segment, long index) { return (MemorySegment) VH_pStdPPSs.get(segment, 0L, index); }
    /// {@return `pStdPPSs`}
    public MemorySegment pStdPPSs() { return pStdPPSs(this.segment(), 0L); }
    /// Sets `pStdPPSs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pStdPPSs(MemorySegment segment, long index, MemorySegment value) { VH_pStdPPSs.set(segment, 0L, index, value); }
    /// Sets `pStdPPSs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR pStdPPSs(MemorySegment value) { pStdPPSs(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoDecodeH265SessionParametersAddInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoDecodeH265SessionParametersAddInfoKHR`
    public VkVideoDecodeH265SessionParametersAddInfoKHR asSlice(long index) { return new VkVideoDecodeH265SessionParametersAddInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoDecodeH265SessionParametersAddInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoDecodeH265SessionParametersAddInfoKHR`
    public VkVideoDecodeH265SessionParametersAddInfoKHR asSlice(long index, long count) { return new VkVideoDecodeH265SessionParametersAddInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoDecodeH265SessionParametersAddInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR at(long index, Consumer<VkVideoDecodeH265SessionParametersAddInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `stdVPSCount` at the given index}
    /// @param index the index of the struct buffer
    public int stdVPSCountAt(long index) { return stdVPSCount(this.segment(), index); }
    /// Sets `stdVPSCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR stdVPSCountAt(long index, int value) { stdVPSCount(this.segment(), index, value); return this; }

    /// {@return `pStdVPSs` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pStdVPSsAt(long index) { return pStdVPSs(this.segment(), index); }
    /// Sets `pStdVPSs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR pStdVPSsAt(long index, MemorySegment value) { pStdVPSs(this.segment(), index, value); return this; }

    /// {@return `stdSPSCount` at the given index}
    /// @param index the index of the struct buffer
    public int stdSPSCountAt(long index) { return stdSPSCount(this.segment(), index); }
    /// Sets `stdSPSCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR stdSPSCountAt(long index, int value) { stdSPSCount(this.segment(), index, value); return this; }

    /// {@return `pStdSPSs` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pStdSPSsAt(long index) { return pStdSPSs(this.segment(), index); }
    /// Sets `pStdSPSs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR pStdSPSsAt(long index, MemorySegment value) { pStdSPSs(this.segment(), index, value); return this; }

    /// {@return `stdPPSCount` at the given index}
    /// @param index the index of the struct buffer
    public int stdPPSCountAt(long index) { return stdPPSCount(this.segment(), index); }
    /// Sets `stdPPSCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR stdPPSCountAt(long index, int value) { stdPPSCount(this.segment(), index, value); return this; }

    /// {@return `pStdPPSs` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pStdPPSsAt(long index) { return pStdPPSs(this.segment(), index); }
    /// Sets `pStdPPSs` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH265SessionParametersAddInfoKHR pStdPPSsAt(long index, MemorySegment value) { pStdPPSs(this.segment(), index, value); return this; }

}

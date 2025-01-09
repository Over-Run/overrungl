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

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### pStdSequenceHeader
/// [VarHandle][#VH_pStdSequenceHeader] - [Getter][#pStdSequenceHeader()] - [Setter][#pStdSequenceHeader(java.lang.foreign.MemorySegment)]
/// ### pStdDecoderModelInfo
/// [VarHandle][#VH_pStdDecoderModelInfo] - [Getter][#pStdDecoderModelInfo()] - [Setter][#pStdDecoderModelInfo(java.lang.foreign.MemorySegment)]
/// ### stdOperatingPointCount
/// [VarHandle][#VH_stdOperatingPointCount] - [Getter][#stdOperatingPointCount()] - [Setter][#stdOperatingPointCount(int)]
/// ### pStdOperatingPoints
/// [VarHandle][#VH_pStdOperatingPoints] - [Getter][#pStdOperatingPoints()] - [Setter][#pStdOperatingPoints(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeAV1SessionParametersCreateInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     const StdVideoAV1SequenceHeader * pStdSequenceHeader;
///     const StdVideoEncodeAV1DecoderModelInfo * pStdDecoderModelInfo;
///     uint32_t stdOperatingPointCount;
///     const StdVideoEncodeAV1OperatingPointInfo * pStdOperatingPoints;
/// } VkVideoEncodeAV1SessionParametersCreateInfoKHR;
/// ```
public final class VkVideoEncodeAV1SessionParametersCreateInfoKHR extends Struct {
    /// The struct layout of `VkVideoEncodeAV1SessionParametersCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pStdSequenceHeader"),
        ValueLayout.ADDRESS.withName("pStdDecoderModelInfo"),
        ValueLayout.JAVA_INT.withName("stdOperatingPointCount"),
        ValueLayout.ADDRESS.withName("pStdOperatingPoints")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pStdSequenceHeader` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pStdSequenceHeader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdSequenceHeader"));
    /// The [VarHandle] of `pStdDecoderModelInfo` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pStdDecoderModelInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdDecoderModelInfo"));
    /// The [VarHandle] of `stdOperatingPointCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stdOperatingPointCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdOperatingPointCount"));
    /// The [VarHandle] of `pStdOperatingPoints` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pStdOperatingPoints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdOperatingPoints"));

    /// Creates `VkVideoEncodeAV1SessionParametersCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeAV1SessionParametersCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeAV1SessionParametersCreateInfoKHR(segment); }

    /// Creates `VkVideoEncodeAV1SessionParametersCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeAV1SessionParametersCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeAV1SessionParametersCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeAV1SessionParametersCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoEncodeAV1SessionParametersCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeAV1SessionParametersCreateInfoKHR`
    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1SessionParametersCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeAV1SessionParametersCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeAV1SessionParametersCreateInfoKHR`
    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeAV1SessionParametersCreateInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeAV1SessionParametersCreateInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeAV1SessionParametersCreateInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeAV1SessionParametersCreateInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeAV1SessionParametersCreateInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeAV1SessionParametersCreateInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeAV1SessionParametersCreateInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeAV1SessionParametersCreateInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeAV1SessionParametersCreateInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeAV1SessionParametersCreateInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1SessionParametersCreateInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1SessionParametersCreateInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1SessionParametersCreateInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `pStdSequenceHeader` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoAV1SequenceHeader *") java.lang.foreign.MemorySegment get_pStdSequenceHeader(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStdSequenceHeader.get(segment, 0L, index); }
    /// {@return `pStdSequenceHeader`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoAV1SequenceHeader *") java.lang.foreign.MemorySegment get_pStdSequenceHeader(MemorySegment segment) { return VkVideoEncodeAV1SessionParametersCreateInfoKHR.get_pStdSequenceHeader(segment, 0L); }
    /// {@return `pStdSequenceHeader` at the given index}
    /// @param index the index
    public @CType("const StdVideoAV1SequenceHeader *") java.lang.foreign.MemorySegment pStdSequenceHeaderAt(long index) { return VkVideoEncodeAV1SessionParametersCreateInfoKHR.get_pStdSequenceHeader(this.segment(), index); }
    /// {@return `pStdSequenceHeader`}
    public @CType("const StdVideoAV1SequenceHeader *") java.lang.foreign.MemorySegment pStdSequenceHeader() { return VkVideoEncodeAV1SessionParametersCreateInfoKHR.get_pStdSequenceHeader(this.segment()); }
    /// Sets `pStdSequenceHeader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStdSequenceHeader(MemorySegment segment, long index, @CType("const StdVideoAV1SequenceHeader *") java.lang.foreign.MemorySegment value) { VH_pStdSequenceHeader.set(segment, 0L, index, value); }
    /// Sets `pStdSequenceHeader` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStdSequenceHeader(MemorySegment segment, @CType("const StdVideoAV1SequenceHeader *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1SessionParametersCreateInfoKHR.set_pStdSequenceHeader(segment, 0L, value); }
    /// Sets `pStdSequenceHeader` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pStdSequenceHeaderAt(long index, @CType("const StdVideoAV1SequenceHeader *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1SessionParametersCreateInfoKHR.set_pStdSequenceHeader(this.segment(), index, value); return this; }
    /// Sets `pStdSequenceHeader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pStdSequenceHeader(@CType("const StdVideoAV1SequenceHeader *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1SessionParametersCreateInfoKHR.set_pStdSequenceHeader(this.segment(), value); return this; }

    /// {@return `pStdDecoderModelInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoEncodeAV1DecoderModelInfo *") java.lang.foreign.MemorySegment get_pStdDecoderModelInfo(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStdDecoderModelInfo.get(segment, 0L, index); }
    /// {@return `pStdDecoderModelInfo`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoEncodeAV1DecoderModelInfo *") java.lang.foreign.MemorySegment get_pStdDecoderModelInfo(MemorySegment segment) { return VkVideoEncodeAV1SessionParametersCreateInfoKHR.get_pStdDecoderModelInfo(segment, 0L); }
    /// {@return `pStdDecoderModelInfo` at the given index}
    /// @param index the index
    public @CType("const StdVideoEncodeAV1DecoderModelInfo *") java.lang.foreign.MemorySegment pStdDecoderModelInfoAt(long index) { return VkVideoEncodeAV1SessionParametersCreateInfoKHR.get_pStdDecoderModelInfo(this.segment(), index); }
    /// {@return `pStdDecoderModelInfo`}
    public @CType("const StdVideoEncodeAV1DecoderModelInfo *") java.lang.foreign.MemorySegment pStdDecoderModelInfo() { return VkVideoEncodeAV1SessionParametersCreateInfoKHR.get_pStdDecoderModelInfo(this.segment()); }
    /// Sets `pStdDecoderModelInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStdDecoderModelInfo(MemorySegment segment, long index, @CType("const StdVideoEncodeAV1DecoderModelInfo *") java.lang.foreign.MemorySegment value) { VH_pStdDecoderModelInfo.set(segment, 0L, index, value); }
    /// Sets `pStdDecoderModelInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStdDecoderModelInfo(MemorySegment segment, @CType("const StdVideoEncodeAV1DecoderModelInfo *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1SessionParametersCreateInfoKHR.set_pStdDecoderModelInfo(segment, 0L, value); }
    /// Sets `pStdDecoderModelInfo` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pStdDecoderModelInfoAt(long index, @CType("const StdVideoEncodeAV1DecoderModelInfo *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1SessionParametersCreateInfoKHR.set_pStdDecoderModelInfo(this.segment(), index, value); return this; }
    /// Sets `pStdDecoderModelInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pStdDecoderModelInfo(@CType("const StdVideoEncodeAV1DecoderModelInfo *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1SessionParametersCreateInfoKHR.set_pStdDecoderModelInfo(this.segment(), value); return this; }

    /// {@return `stdOperatingPointCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_stdOperatingPointCount(MemorySegment segment, long index) { return (int) VH_stdOperatingPointCount.get(segment, 0L, index); }
    /// {@return `stdOperatingPointCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_stdOperatingPointCount(MemorySegment segment) { return VkVideoEncodeAV1SessionParametersCreateInfoKHR.get_stdOperatingPointCount(segment, 0L); }
    /// {@return `stdOperatingPointCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int stdOperatingPointCountAt(long index) { return VkVideoEncodeAV1SessionParametersCreateInfoKHR.get_stdOperatingPointCount(this.segment(), index); }
    /// {@return `stdOperatingPointCount`}
    public @CType("uint32_t") int stdOperatingPointCount() { return VkVideoEncodeAV1SessionParametersCreateInfoKHR.get_stdOperatingPointCount(this.segment()); }
    /// Sets `stdOperatingPointCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stdOperatingPointCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_stdOperatingPointCount.set(segment, 0L, index, value); }
    /// Sets `stdOperatingPointCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stdOperatingPointCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1SessionParametersCreateInfoKHR.set_stdOperatingPointCount(segment, 0L, value); }
    /// Sets `stdOperatingPointCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR stdOperatingPointCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1SessionParametersCreateInfoKHR.set_stdOperatingPointCount(this.segment(), index, value); return this; }
    /// Sets `stdOperatingPointCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR stdOperatingPointCount(@CType("uint32_t") int value) { VkVideoEncodeAV1SessionParametersCreateInfoKHR.set_stdOperatingPointCount(this.segment(), value); return this; }

    /// {@return `pStdOperatingPoints` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoEncodeAV1OperatingPointInfo *") java.lang.foreign.MemorySegment get_pStdOperatingPoints(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStdOperatingPoints.get(segment, 0L, index); }
    /// {@return `pStdOperatingPoints`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoEncodeAV1OperatingPointInfo *") java.lang.foreign.MemorySegment get_pStdOperatingPoints(MemorySegment segment) { return VkVideoEncodeAV1SessionParametersCreateInfoKHR.get_pStdOperatingPoints(segment, 0L); }
    /// {@return `pStdOperatingPoints` at the given index}
    /// @param index the index
    public @CType("const StdVideoEncodeAV1OperatingPointInfo *") java.lang.foreign.MemorySegment pStdOperatingPointsAt(long index) { return VkVideoEncodeAV1SessionParametersCreateInfoKHR.get_pStdOperatingPoints(this.segment(), index); }
    /// {@return `pStdOperatingPoints`}
    public @CType("const StdVideoEncodeAV1OperatingPointInfo *") java.lang.foreign.MemorySegment pStdOperatingPoints() { return VkVideoEncodeAV1SessionParametersCreateInfoKHR.get_pStdOperatingPoints(this.segment()); }
    /// Sets `pStdOperatingPoints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStdOperatingPoints(MemorySegment segment, long index, @CType("const StdVideoEncodeAV1OperatingPointInfo *") java.lang.foreign.MemorySegment value) { VH_pStdOperatingPoints.set(segment, 0L, index, value); }
    /// Sets `pStdOperatingPoints` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStdOperatingPoints(MemorySegment segment, @CType("const StdVideoEncodeAV1OperatingPointInfo *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1SessionParametersCreateInfoKHR.set_pStdOperatingPoints(segment, 0L, value); }
    /// Sets `pStdOperatingPoints` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pStdOperatingPointsAt(long index, @CType("const StdVideoEncodeAV1OperatingPointInfo *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1SessionParametersCreateInfoKHR.set_pStdOperatingPoints(this.segment(), index, value); return this; }
    /// Sets `pStdOperatingPoints` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pStdOperatingPoints(@CType("const StdVideoEncodeAV1OperatingPointInfo *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1SessionParametersCreateInfoKHR.set_pStdOperatingPoints(this.segment(), value); return this; }

}

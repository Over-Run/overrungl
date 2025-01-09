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
/// ### naluSliceSegmentEntryCount
/// [VarHandle][#VH_naluSliceSegmentEntryCount] - [Getter][#naluSliceSegmentEntryCount()] - [Setter][#naluSliceSegmentEntryCount(int)]
/// ### pNaluSliceSegmentEntries
/// [VarHandle][#VH_pNaluSliceSegmentEntries] - [Getter][#pNaluSliceSegmentEntries()] - [Setter][#pNaluSliceSegmentEntries(java.lang.foreign.MemorySegment)]
/// ### pStdPictureInfo
/// [VarHandle][#VH_pStdPictureInfo] - [Getter][#pStdPictureInfo()] - [Setter][#pStdPictureInfo(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeH265PictureInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t naluSliceSegmentEntryCount;
///     const VkVideoEncodeH265NaluSliceSegmentInfoKHR * pNaluSliceSegmentEntries;
///     const StdVideoEncodeH265PictureInfo * pStdPictureInfo;
/// } VkVideoEncodeH265PictureInfoKHR;
/// ```
public final class VkVideoEncodeH265PictureInfoKHR extends Struct {
    /// The struct layout of `VkVideoEncodeH265PictureInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("naluSliceSegmentEntryCount"),
        ValueLayout.ADDRESS.withName("pNaluSliceSegmentEntries"),
        ValueLayout.ADDRESS.withName("pStdPictureInfo")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `naluSliceSegmentEntryCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_naluSliceSegmentEntryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("naluSliceSegmentEntryCount"));
    /// The [VarHandle] of `pNaluSliceSegmentEntries` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNaluSliceSegmentEntries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNaluSliceSegmentEntries"));
    /// The [VarHandle] of `pStdPictureInfo` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pStdPictureInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdPictureInfo"));

    /// Creates `VkVideoEncodeH265PictureInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH265PictureInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH265PictureInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265PictureInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265PictureInfoKHR(segment); }

    /// Creates `VkVideoEncodeH265PictureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265PictureInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265PictureInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH265PictureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265PictureInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265PictureInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoEncodeH265PictureInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265PictureInfoKHR`
    public static VkVideoEncodeH265PictureInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265PictureInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH265PictureInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH265PictureInfoKHR`
    public static VkVideoEncodeH265PictureInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH265PictureInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeH265PictureInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeH265PictureInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeH265PictureInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeH265PictureInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265PictureInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeH265PictureInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265PictureInfoKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeH265PictureInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeH265PictureInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeH265PictureInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeH265PictureInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265PictureInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265PictureInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265PictureInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265PictureInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265PictureInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `naluSliceSegmentEntryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_naluSliceSegmentEntryCount(MemorySegment segment, long index) { return (int) VH_naluSliceSegmentEntryCount.get(segment, 0L, index); }
    /// {@return `naluSliceSegmentEntryCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_naluSliceSegmentEntryCount(MemorySegment segment) { return VkVideoEncodeH265PictureInfoKHR.get_naluSliceSegmentEntryCount(segment, 0L); }
    /// {@return `naluSliceSegmentEntryCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int naluSliceSegmentEntryCountAt(long index) { return VkVideoEncodeH265PictureInfoKHR.get_naluSliceSegmentEntryCount(this.segment(), index); }
    /// {@return `naluSliceSegmentEntryCount`}
    public @CType("uint32_t") int naluSliceSegmentEntryCount() { return VkVideoEncodeH265PictureInfoKHR.get_naluSliceSegmentEntryCount(this.segment()); }
    /// Sets `naluSliceSegmentEntryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_naluSliceSegmentEntryCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_naluSliceSegmentEntryCount.set(segment, 0L, index, value); }
    /// Sets `naluSliceSegmentEntryCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_naluSliceSegmentEntryCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH265PictureInfoKHR.set_naluSliceSegmentEntryCount(segment, 0L, value); }
    /// Sets `naluSliceSegmentEntryCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265PictureInfoKHR naluSliceSegmentEntryCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH265PictureInfoKHR.set_naluSliceSegmentEntryCount(this.segment(), index, value); return this; }
    /// Sets `naluSliceSegmentEntryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265PictureInfoKHR naluSliceSegmentEntryCount(@CType("uint32_t") int value) { VkVideoEncodeH265PictureInfoKHR.set_naluSliceSegmentEntryCount(this.segment(), value); return this; }

    /// {@return `pNaluSliceSegmentEntries` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkVideoEncodeH265NaluSliceSegmentInfoKHR *") java.lang.foreign.MemorySegment get_pNaluSliceSegmentEntries(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNaluSliceSegmentEntries.get(segment, 0L, index); }
    /// {@return `pNaluSliceSegmentEntries`}
    /// @param segment the segment of the struct
    public static @CType("const VkVideoEncodeH265NaluSliceSegmentInfoKHR *") java.lang.foreign.MemorySegment get_pNaluSliceSegmentEntries(MemorySegment segment) { return VkVideoEncodeH265PictureInfoKHR.get_pNaluSliceSegmentEntries(segment, 0L); }
    /// {@return `pNaluSliceSegmentEntries` at the given index}
    /// @param index the index
    public @CType("const VkVideoEncodeH265NaluSliceSegmentInfoKHR *") java.lang.foreign.MemorySegment pNaluSliceSegmentEntriesAt(long index) { return VkVideoEncodeH265PictureInfoKHR.get_pNaluSliceSegmentEntries(this.segment(), index); }
    /// {@return `pNaluSliceSegmentEntries`}
    public @CType("const VkVideoEncodeH265NaluSliceSegmentInfoKHR *") java.lang.foreign.MemorySegment pNaluSliceSegmentEntries() { return VkVideoEncodeH265PictureInfoKHR.get_pNaluSliceSegmentEntries(this.segment()); }
    /// Sets `pNaluSliceSegmentEntries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNaluSliceSegmentEntries(MemorySegment segment, long index, @CType("const VkVideoEncodeH265NaluSliceSegmentInfoKHR *") java.lang.foreign.MemorySegment value) { VH_pNaluSliceSegmentEntries.set(segment, 0L, index, value); }
    /// Sets `pNaluSliceSegmentEntries` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNaluSliceSegmentEntries(MemorySegment segment, @CType("const VkVideoEncodeH265NaluSliceSegmentInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265PictureInfoKHR.set_pNaluSliceSegmentEntries(segment, 0L, value); }
    /// Sets `pNaluSliceSegmentEntries` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265PictureInfoKHR pNaluSliceSegmentEntriesAt(long index, @CType("const VkVideoEncodeH265NaluSliceSegmentInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265PictureInfoKHR.set_pNaluSliceSegmentEntries(this.segment(), index, value); return this; }
    /// Sets `pNaluSliceSegmentEntries` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265PictureInfoKHR pNaluSliceSegmentEntries(@CType("const VkVideoEncodeH265NaluSliceSegmentInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265PictureInfoKHR.set_pNaluSliceSegmentEntries(this.segment(), value); return this; }

    /// {@return `pStdPictureInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoEncodeH265PictureInfo *") java.lang.foreign.MemorySegment get_pStdPictureInfo(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStdPictureInfo.get(segment, 0L, index); }
    /// {@return `pStdPictureInfo`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoEncodeH265PictureInfo *") java.lang.foreign.MemorySegment get_pStdPictureInfo(MemorySegment segment) { return VkVideoEncodeH265PictureInfoKHR.get_pStdPictureInfo(segment, 0L); }
    /// {@return `pStdPictureInfo` at the given index}
    /// @param index the index
    public @CType("const StdVideoEncodeH265PictureInfo *") java.lang.foreign.MemorySegment pStdPictureInfoAt(long index) { return VkVideoEncodeH265PictureInfoKHR.get_pStdPictureInfo(this.segment(), index); }
    /// {@return `pStdPictureInfo`}
    public @CType("const StdVideoEncodeH265PictureInfo *") java.lang.foreign.MemorySegment pStdPictureInfo() { return VkVideoEncodeH265PictureInfoKHR.get_pStdPictureInfo(this.segment()); }
    /// Sets `pStdPictureInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStdPictureInfo(MemorySegment segment, long index, @CType("const StdVideoEncodeH265PictureInfo *") java.lang.foreign.MemorySegment value) { VH_pStdPictureInfo.set(segment, 0L, index, value); }
    /// Sets `pStdPictureInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStdPictureInfo(MemorySegment segment, @CType("const StdVideoEncodeH265PictureInfo *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265PictureInfoKHR.set_pStdPictureInfo(segment, 0L, value); }
    /// Sets `pStdPictureInfo` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265PictureInfoKHR pStdPictureInfoAt(long index, @CType("const StdVideoEncodeH265PictureInfo *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265PictureInfoKHR.set_pStdPictureInfo(this.segment(), index, value); return this; }
    /// Sets `pStdPictureInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265PictureInfoKHR pStdPictureInfo(@CType("const StdVideoEncodeH265PictureInfo *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265PictureInfoKHR.set_pStdPictureInfo(this.segment(), value); return this; }

}

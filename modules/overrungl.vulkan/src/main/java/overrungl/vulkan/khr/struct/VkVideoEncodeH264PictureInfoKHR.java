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
/// ### naluSliceEntryCount
/// [VarHandle][#VH_naluSliceEntryCount] - [Getter][#naluSliceEntryCount()] - [Setter][#naluSliceEntryCount(int)]
/// ### pNaluSliceEntries
/// [VarHandle][#VH_pNaluSliceEntries] - [Getter][#pNaluSliceEntries()] - [Setter][#pNaluSliceEntries(java.lang.foreign.MemorySegment)]
/// ### pStdPictureInfo
/// [VarHandle][#VH_pStdPictureInfo] - [Getter][#pStdPictureInfo()] - [Setter][#pStdPictureInfo(java.lang.foreign.MemorySegment)]
/// ### generatePrefixNalu
/// [VarHandle][#VH_generatePrefixNalu] - [Getter][#generatePrefixNalu()] - [Setter][#generatePrefixNalu(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeH264PictureInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t naluSliceEntryCount;
///     const VkVideoEncodeH264NaluSliceInfoKHR * pNaluSliceEntries;
///     const StdVideoEncodeH264PictureInfo * pStdPictureInfo;
///     VkBool32 generatePrefixNalu;
/// } VkVideoEncodeH264PictureInfoKHR;
/// ```
public final class VkVideoEncodeH264PictureInfoKHR extends Struct {
    /// The struct layout of `VkVideoEncodeH264PictureInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("naluSliceEntryCount"),
        ValueLayout.ADDRESS.withName("pNaluSliceEntries"),
        ValueLayout.ADDRESS.withName("pStdPictureInfo"),
        ValueLayout.JAVA_INT.withName("generatePrefixNalu")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `naluSliceEntryCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_naluSliceEntryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("naluSliceEntryCount"));
    /// The [VarHandle] of `pNaluSliceEntries` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNaluSliceEntries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNaluSliceEntries"));
    /// The [VarHandle] of `pStdPictureInfo` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pStdPictureInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdPictureInfo"));
    /// The [VarHandle] of `generatePrefixNalu` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_generatePrefixNalu = LAYOUT.arrayElementVarHandle(PathElement.groupElement("generatePrefixNalu"));

    /// Creates `VkVideoEncodeH264PictureInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH264PictureInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH264PictureInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264PictureInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264PictureInfoKHR(segment); }

    /// Creates `VkVideoEncodeH264PictureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264PictureInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264PictureInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH264PictureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264PictureInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264PictureInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoEncodeH264PictureInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH264PictureInfoKHR`
    public static VkVideoEncodeH264PictureInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264PictureInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH264PictureInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH264PictureInfoKHR`
    public static VkVideoEncodeH264PictureInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH264PictureInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeH264PictureInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeH264PictureInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeH264PictureInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeH264PictureInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264PictureInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeH264PictureInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264PictureInfoKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeH264PictureInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeH264PictureInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeH264PictureInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeH264PictureInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264PictureInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264PictureInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264PictureInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264PictureInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264PictureInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `naluSliceEntryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_naluSliceEntryCount(MemorySegment segment, long index) { return (int) VH_naluSliceEntryCount.get(segment, 0L, index); }
    /// {@return `naluSliceEntryCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_naluSliceEntryCount(MemorySegment segment) { return VkVideoEncodeH264PictureInfoKHR.get_naluSliceEntryCount(segment, 0L); }
    /// {@return `naluSliceEntryCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int naluSliceEntryCountAt(long index) { return VkVideoEncodeH264PictureInfoKHR.get_naluSliceEntryCount(this.segment(), index); }
    /// {@return `naluSliceEntryCount`}
    public @CType("uint32_t") int naluSliceEntryCount() { return VkVideoEncodeH264PictureInfoKHR.get_naluSliceEntryCount(this.segment()); }
    /// Sets `naluSliceEntryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_naluSliceEntryCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_naluSliceEntryCount.set(segment, 0L, index, value); }
    /// Sets `naluSliceEntryCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_naluSliceEntryCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH264PictureInfoKHR.set_naluSliceEntryCount(segment, 0L, value); }
    /// Sets `naluSliceEntryCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264PictureInfoKHR naluSliceEntryCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH264PictureInfoKHR.set_naluSliceEntryCount(this.segment(), index, value); return this; }
    /// Sets `naluSliceEntryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264PictureInfoKHR naluSliceEntryCount(@CType("uint32_t") int value) { VkVideoEncodeH264PictureInfoKHR.set_naluSliceEntryCount(this.segment(), value); return this; }

    /// {@return `pNaluSliceEntries` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkVideoEncodeH264NaluSliceInfoKHR *") java.lang.foreign.MemorySegment get_pNaluSliceEntries(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNaluSliceEntries.get(segment, 0L, index); }
    /// {@return `pNaluSliceEntries`}
    /// @param segment the segment of the struct
    public static @CType("const VkVideoEncodeH264NaluSliceInfoKHR *") java.lang.foreign.MemorySegment get_pNaluSliceEntries(MemorySegment segment) { return VkVideoEncodeH264PictureInfoKHR.get_pNaluSliceEntries(segment, 0L); }
    /// {@return `pNaluSliceEntries` at the given index}
    /// @param index the index
    public @CType("const VkVideoEncodeH264NaluSliceInfoKHR *") java.lang.foreign.MemorySegment pNaluSliceEntriesAt(long index) { return VkVideoEncodeH264PictureInfoKHR.get_pNaluSliceEntries(this.segment(), index); }
    /// {@return `pNaluSliceEntries`}
    public @CType("const VkVideoEncodeH264NaluSliceInfoKHR *") java.lang.foreign.MemorySegment pNaluSliceEntries() { return VkVideoEncodeH264PictureInfoKHR.get_pNaluSliceEntries(this.segment()); }
    /// Sets `pNaluSliceEntries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNaluSliceEntries(MemorySegment segment, long index, @CType("const VkVideoEncodeH264NaluSliceInfoKHR *") java.lang.foreign.MemorySegment value) { VH_pNaluSliceEntries.set(segment, 0L, index, value); }
    /// Sets `pNaluSliceEntries` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNaluSliceEntries(MemorySegment segment, @CType("const VkVideoEncodeH264NaluSliceInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264PictureInfoKHR.set_pNaluSliceEntries(segment, 0L, value); }
    /// Sets `pNaluSliceEntries` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264PictureInfoKHR pNaluSliceEntriesAt(long index, @CType("const VkVideoEncodeH264NaluSliceInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264PictureInfoKHR.set_pNaluSliceEntries(this.segment(), index, value); return this; }
    /// Sets `pNaluSliceEntries` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264PictureInfoKHR pNaluSliceEntries(@CType("const VkVideoEncodeH264NaluSliceInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264PictureInfoKHR.set_pNaluSliceEntries(this.segment(), value); return this; }

    /// {@return `pStdPictureInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoEncodeH264PictureInfo *") java.lang.foreign.MemorySegment get_pStdPictureInfo(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStdPictureInfo.get(segment, 0L, index); }
    /// {@return `pStdPictureInfo`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoEncodeH264PictureInfo *") java.lang.foreign.MemorySegment get_pStdPictureInfo(MemorySegment segment) { return VkVideoEncodeH264PictureInfoKHR.get_pStdPictureInfo(segment, 0L); }
    /// {@return `pStdPictureInfo` at the given index}
    /// @param index the index
    public @CType("const StdVideoEncodeH264PictureInfo *") java.lang.foreign.MemorySegment pStdPictureInfoAt(long index) { return VkVideoEncodeH264PictureInfoKHR.get_pStdPictureInfo(this.segment(), index); }
    /// {@return `pStdPictureInfo`}
    public @CType("const StdVideoEncodeH264PictureInfo *") java.lang.foreign.MemorySegment pStdPictureInfo() { return VkVideoEncodeH264PictureInfoKHR.get_pStdPictureInfo(this.segment()); }
    /// Sets `pStdPictureInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStdPictureInfo(MemorySegment segment, long index, @CType("const StdVideoEncodeH264PictureInfo *") java.lang.foreign.MemorySegment value) { VH_pStdPictureInfo.set(segment, 0L, index, value); }
    /// Sets `pStdPictureInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStdPictureInfo(MemorySegment segment, @CType("const StdVideoEncodeH264PictureInfo *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264PictureInfoKHR.set_pStdPictureInfo(segment, 0L, value); }
    /// Sets `pStdPictureInfo` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264PictureInfoKHR pStdPictureInfoAt(long index, @CType("const StdVideoEncodeH264PictureInfo *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264PictureInfoKHR.set_pStdPictureInfo(this.segment(), index, value); return this; }
    /// Sets `pStdPictureInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264PictureInfoKHR pStdPictureInfo(@CType("const StdVideoEncodeH264PictureInfo *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264PictureInfoKHR.set_pStdPictureInfo(this.segment(), value); return this; }

    /// {@return `generatePrefixNalu` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_generatePrefixNalu(MemorySegment segment, long index) { return (int) VH_generatePrefixNalu.get(segment, 0L, index); }
    /// {@return `generatePrefixNalu`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_generatePrefixNalu(MemorySegment segment) { return VkVideoEncodeH264PictureInfoKHR.get_generatePrefixNalu(segment, 0L); }
    /// {@return `generatePrefixNalu` at the given index}
    /// @param index the index
    public @CType("VkBool32") int generatePrefixNaluAt(long index) { return VkVideoEncodeH264PictureInfoKHR.get_generatePrefixNalu(this.segment(), index); }
    /// {@return `generatePrefixNalu`}
    public @CType("VkBool32") int generatePrefixNalu() { return VkVideoEncodeH264PictureInfoKHR.get_generatePrefixNalu(this.segment()); }
    /// Sets `generatePrefixNalu` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_generatePrefixNalu(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_generatePrefixNalu.set(segment, 0L, index, value); }
    /// Sets `generatePrefixNalu` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_generatePrefixNalu(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeH264PictureInfoKHR.set_generatePrefixNalu(segment, 0L, value); }
    /// Sets `generatePrefixNalu` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264PictureInfoKHR generatePrefixNaluAt(long index, @CType("VkBool32") int value) { VkVideoEncodeH264PictureInfoKHR.set_generatePrefixNalu(this.segment(), index, value); return this; }
    /// Sets `generatePrefixNalu` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264PictureInfoKHR generatePrefixNalu(@CType("VkBool32") int value) { VkVideoEncodeH264PictureInfoKHR.set_generatePrefixNalu(this.segment(), value); return this; }

}

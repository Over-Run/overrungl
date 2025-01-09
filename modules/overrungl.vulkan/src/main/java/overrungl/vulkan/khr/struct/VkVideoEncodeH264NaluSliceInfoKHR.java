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
/// ### constantQp
/// [VarHandle][#VH_constantQp] - [Getter][#constantQp()] - [Setter][#constantQp(int)]
/// ### pStdSliceHeader
/// [VarHandle][#VH_pStdSliceHeader] - [Getter][#pStdSliceHeader()] - [Setter][#pStdSliceHeader(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeH264NaluSliceInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     int32_t constantQp;
///     const StdVideoEncodeH264SliceHeader * pStdSliceHeader;
/// } VkVideoEncodeH264NaluSliceInfoKHR;
/// ```
public final class VkVideoEncodeH264NaluSliceInfoKHR extends Struct {
    /// The struct layout of `VkVideoEncodeH264NaluSliceInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("constantQp"),
        ValueLayout.ADDRESS.withName("pStdSliceHeader")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `constantQp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_constantQp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("constantQp"));
    /// The [VarHandle] of `pStdSliceHeader` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pStdSliceHeader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdSliceHeader"));

    /// Creates `VkVideoEncodeH264NaluSliceInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH264NaluSliceInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH264NaluSliceInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264NaluSliceInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264NaluSliceInfoKHR(segment); }

    /// Creates `VkVideoEncodeH264NaluSliceInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264NaluSliceInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264NaluSliceInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH264NaluSliceInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264NaluSliceInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264NaluSliceInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoEncodeH264NaluSliceInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH264NaluSliceInfoKHR`
    public static VkVideoEncodeH264NaluSliceInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264NaluSliceInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH264NaluSliceInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH264NaluSliceInfoKHR`
    public static VkVideoEncodeH264NaluSliceInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH264NaluSliceInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkVideoEncodeH264NaluSliceInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeH264NaluSliceInfoKHR`
    public VkVideoEncodeH264NaluSliceInfoKHR asSlice(long index) { return new VkVideoEncodeH264NaluSliceInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkVideoEncodeH264NaluSliceInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeH264NaluSliceInfoKHR`
    public VkVideoEncodeH264NaluSliceInfoKHR asSlice(long index, long count) { return new VkVideoEncodeH264NaluSliceInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeH264NaluSliceInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeH264NaluSliceInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeH264NaluSliceInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeH264NaluSliceInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264NaluSliceInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeH264NaluSliceInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264NaluSliceInfoKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeH264NaluSliceInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeH264NaluSliceInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeH264NaluSliceInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeH264NaluSliceInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264NaluSliceInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264NaluSliceInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264NaluSliceInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264NaluSliceInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264NaluSliceInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `constantQp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_constantQp(MemorySegment segment, long index) { return (int) VH_constantQp.get(segment, 0L, index); }
    /// {@return `constantQp`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_constantQp(MemorySegment segment) { return VkVideoEncodeH264NaluSliceInfoKHR.get_constantQp(segment, 0L); }
    /// {@return `constantQp` at the given index}
    /// @param index the index
    public @CType("int32_t") int constantQpAt(long index) { return VkVideoEncodeH264NaluSliceInfoKHR.get_constantQp(this.segment(), index); }
    /// {@return `constantQp`}
    public @CType("int32_t") int constantQp() { return VkVideoEncodeH264NaluSliceInfoKHR.get_constantQp(this.segment()); }
    /// Sets `constantQp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_constantQp(MemorySegment segment, long index, @CType("int32_t") int value) { VH_constantQp.set(segment, 0L, index, value); }
    /// Sets `constantQp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_constantQp(MemorySegment segment, @CType("int32_t") int value) { VkVideoEncodeH264NaluSliceInfoKHR.set_constantQp(segment, 0L, value); }
    /// Sets `constantQp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264NaluSliceInfoKHR constantQpAt(long index, @CType("int32_t") int value) { VkVideoEncodeH264NaluSliceInfoKHR.set_constantQp(this.segment(), index, value); return this; }
    /// Sets `constantQp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264NaluSliceInfoKHR constantQp(@CType("int32_t") int value) { VkVideoEncodeH264NaluSliceInfoKHR.set_constantQp(this.segment(), value); return this; }

    /// {@return `pStdSliceHeader` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoEncodeH264SliceHeader *") java.lang.foreign.MemorySegment get_pStdSliceHeader(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStdSliceHeader.get(segment, 0L, index); }
    /// {@return `pStdSliceHeader`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoEncodeH264SliceHeader *") java.lang.foreign.MemorySegment get_pStdSliceHeader(MemorySegment segment) { return VkVideoEncodeH264NaluSliceInfoKHR.get_pStdSliceHeader(segment, 0L); }
    /// {@return `pStdSliceHeader` at the given index}
    /// @param index the index
    public @CType("const StdVideoEncodeH264SliceHeader *") java.lang.foreign.MemorySegment pStdSliceHeaderAt(long index) { return VkVideoEncodeH264NaluSliceInfoKHR.get_pStdSliceHeader(this.segment(), index); }
    /// {@return `pStdSliceHeader`}
    public @CType("const StdVideoEncodeH264SliceHeader *") java.lang.foreign.MemorySegment pStdSliceHeader() { return VkVideoEncodeH264NaluSliceInfoKHR.get_pStdSliceHeader(this.segment()); }
    /// Sets `pStdSliceHeader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStdSliceHeader(MemorySegment segment, long index, @CType("const StdVideoEncodeH264SliceHeader *") java.lang.foreign.MemorySegment value) { VH_pStdSliceHeader.set(segment, 0L, index, value); }
    /// Sets `pStdSliceHeader` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStdSliceHeader(MemorySegment segment, @CType("const StdVideoEncodeH264SliceHeader *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264NaluSliceInfoKHR.set_pStdSliceHeader(segment, 0L, value); }
    /// Sets `pStdSliceHeader` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264NaluSliceInfoKHR pStdSliceHeaderAt(long index, @CType("const StdVideoEncodeH264SliceHeader *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264NaluSliceInfoKHR.set_pStdSliceHeader(this.segment(), index, value); return this; }
    /// Sets `pStdSliceHeader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264NaluSliceInfoKHR pStdSliceHeader(@CType("const StdVideoEncodeH264SliceHeader *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264NaluSliceInfoKHR.set_pStdSliceHeader(this.segment(), value); return this; }

}

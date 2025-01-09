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
/// ### pStdReferenceInfo
/// [VarHandle][#VH_pStdReferenceInfo] - [Getter][#pStdReferenceInfo()] - [Setter][#pStdReferenceInfo(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoDecodeAV1DpbSlotInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     const StdVideoDecodeAV1ReferenceInfo * pStdReferenceInfo;
/// } VkVideoDecodeAV1DpbSlotInfoKHR;
/// ```
public final class VkVideoDecodeAV1DpbSlotInfoKHR extends Struct {
    /// The struct layout of `VkVideoDecodeAV1DpbSlotInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pStdReferenceInfo")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pStdReferenceInfo` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pStdReferenceInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdReferenceInfo"));

    /// Creates `VkVideoDecodeAV1DpbSlotInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoDecodeAV1DpbSlotInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoDecodeAV1DpbSlotInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeAV1DpbSlotInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeAV1DpbSlotInfoKHR(segment); }

    /// Creates `VkVideoDecodeAV1DpbSlotInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeAV1DpbSlotInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeAV1DpbSlotInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoDecodeAV1DpbSlotInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeAV1DpbSlotInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoDecodeAV1DpbSlotInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoDecodeAV1DpbSlotInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeAV1DpbSlotInfoKHR`
    public static VkVideoDecodeAV1DpbSlotInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeAV1DpbSlotInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoDecodeAV1DpbSlotInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoDecodeAV1DpbSlotInfoKHR`
    public static VkVideoDecodeAV1DpbSlotInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoDecodeAV1DpbSlotInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoDecodeAV1DpbSlotInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoDecodeAV1DpbSlotInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoDecodeAV1DpbSlotInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoDecodeAV1DpbSlotInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1DpbSlotInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoDecodeAV1DpbSlotInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1DpbSlotInfoKHR sType(@CType("VkStructureType") int value) { VkVideoDecodeAV1DpbSlotInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoDecodeAV1DpbSlotInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoDecodeAV1DpbSlotInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoDecodeAV1DpbSlotInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1DpbSlotInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1DpbSlotInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1DpbSlotInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1DpbSlotInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1DpbSlotInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `pStdReferenceInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const StdVideoDecodeAV1ReferenceInfo *") java.lang.foreign.MemorySegment get_pStdReferenceInfo(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pStdReferenceInfo.get(segment, 0L, index); }
    /// {@return `pStdReferenceInfo`}
    /// @param segment the segment of the struct
    public static @CType("const StdVideoDecodeAV1ReferenceInfo *") java.lang.foreign.MemorySegment get_pStdReferenceInfo(MemorySegment segment) { return VkVideoDecodeAV1DpbSlotInfoKHR.get_pStdReferenceInfo(segment, 0L); }
    /// {@return `pStdReferenceInfo` at the given index}
    /// @param index the index
    public @CType("const StdVideoDecodeAV1ReferenceInfo *") java.lang.foreign.MemorySegment pStdReferenceInfoAt(long index) { return VkVideoDecodeAV1DpbSlotInfoKHR.get_pStdReferenceInfo(this.segment(), index); }
    /// {@return `pStdReferenceInfo`}
    public @CType("const StdVideoDecodeAV1ReferenceInfo *") java.lang.foreign.MemorySegment pStdReferenceInfo() { return VkVideoDecodeAV1DpbSlotInfoKHR.get_pStdReferenceInfo(this.segment()); }
    /// Sets `pStdReferenceInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pStdReferenceInfo(MemorySegment segment, long index, @CType("const StdVideoDecodeAV1ReferenceInfo *") java.lang.foreign.MemorySegment value) { VH_pStdReferenceInfo.set(segment, 0L, index, value); }
    /// Sets `pStdReferenceInfo` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pStdReferenceInfo(MemorySegment segment, @CType("const StdVideoDecodeAV1ReferenceInfo *") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1DpbSlotInfoKHR.set_pStdReferenceInfo(segment, 0L, value); }
    /// Sets `pStdReferenceInfo` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1DpbSlotInfoKHR pStdReferenceInfoAt(long index, @CType("const StdVideoDecodeAV1ReferenceInfo *") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1DpbSlotInfoKHR.set_pStdReferenceInfo(this.segment(), index, value); return this; }
    /// Sets `pStdReferenceInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeAV1DpbSlotInfoKHR pStdReferenceInfo(@CType("const StdVideoDecodeAV1ReferenceInfo *") java.lang.foreign.MemorySegment value) { VkVideoDecodeAV1DpbSlotInfoKHR.set_pStdReferenceInfo(this.segment(), value); return this; }

}
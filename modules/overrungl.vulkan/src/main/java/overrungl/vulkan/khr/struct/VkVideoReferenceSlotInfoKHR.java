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
/// ### slotIndex
/// [VarHandle][#VH_slotIndex] - [Getter][#slotIndex()] - [Setter][#slotIndex(int)]
/// ### pPictureResource
/// [VarHandle][#VH_pPictureResource] - [Getter][#pPictureResource()] - [Setter][#pPictureResource(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoReferenceSlotInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     int32_t slotIndex;
///     const VkVideoPictureResourceInfoKHR * pPictureResource;
/// } VkVideoReferenceSlotInfoKHR;
/// ```
public final class VkVideoReferenceSlotInfoKHR extends Struct {
    /// The struct layout of `VkVideoReferenceSlotInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("slotIndex"),
        ValueLayout.ADDRESS.withName("pPictureResource")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `slotIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_slotIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("slotIndex"));
    /// The [VarHandle] of `pPictureResource` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pPictureResource = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPictureResource"));

    /// Creates `VkVideoReferenceSlotInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoReferenceSlotInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoReferenceSlotInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoReferenceSlotInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoReferenceSlotInfoKHR(segment); }

    /// Creates `VkVideoReferenceSlotInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoReferenceSlotInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoReferenceSlotInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoReferenceSlotInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoReferenceSlotInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoReferenceSlotInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoReferenceSlotInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoReferenceSlotInfoKHR`
    public static VkVideoReferenceSlotInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoReferenceSlotInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoReferenceSlotInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoReferenceSlotInfoKHR`
    public static VkVideoReferenceSlotInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoReferenceSlotInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkVideoReferenceSlotInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoReferenceSlotInfoKHR`
    public VkVideoReferenceSlotInfoKHR asSlice(long index) { return new VkVideoReferenceSlotInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkVideoReferenceSlotInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoReferenceSlotInfoKHR`
    public VkVideoReferenceSlotInfoKHR asSlice(long index, long count) { return new VkVideoReferenceSlotInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoReferenceSlotInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoReferenceSlotInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoReferenceSlotInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoReferenceSlotInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoReferenceSlotInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoReferenceSlotInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoReferenceSlotInfoKHR sType(@CType("VkStructureType") int value) { VkVideoReferenceSlotInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoReferenceSlotInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoReferenceSlotInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoReferenceSlotInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoReferenceSlotInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoReferenceSlotInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoReferenceSlotInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoReferenceSlotInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoReferenceSlotInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `slotIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_slotIndex(MemorySegment segment, long index) { return (int) VH_slotIndex.get(segment, 0L, index); }
    /// {@return `slotIndex`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_slotIndex(MemorySegment segment) { return VkVideoReferenceSlotInfoKHR.get_slotIndex(segment, 0L); }
    /// {@return `slotIndex` at the given index}
    /// @param index the index
    public @CType("int32_t") int slotIndexAt(long index) { return VkVideoReferenceSlotInfoKHR.get_slotIndex(this.segment(), index); }
    /// {@return `slotIndex`}
    public @CType("int32_t") int slotIndex() { return VkVideoReferenceSlotInfoKHR.get_slotIndex(this.segment()); }
    /// Sets `slotIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_slotIndex(MemorySegment segment, long index, @CType("int32_t") int value) { VH_slotIndex.set(segment, 0L, index, value); }
    /// Sets `slotIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_slotIndex(MemorySegment segment, @CType("int32_t") int value) { VkVideoReferenceSlotInfoKHR.set_slotIndex(segment, 0L, value); }
    /// Sets `slotIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoReferenceSlotInfoKHR slotIndexAt(long index, @CType("int32_t") int value) { VkVideoReferenceSlotInfoKHR.set_slotIndex(this.segment(), index, value); return this; }
    /// Sets `slotIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoReferenceSlotInfoKHR slotIndex(@CType("int32_t") int value) { VkVideoReferenceSlotInfoKHR.set_slotIndex(this.segment(), value); return this; }

    /// {@return `pPictureResource` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkVideoPictureResourceInfoKHR *") java.lang.foreign.MemorySegment get_pPictureResource(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pPictureResource.get(segment, 0L, index); }
    /// {@return `pPictureResource`}
    /// @param segment the segment of the struct
    public static @CType("const VkVideoPictureResourceInfoKHR *") java.lang.foreign.MemorySegment get_pPictureResource(MemorySegment segment) { return VkVideoReferenceSlotInfoKHR.get_pPictureResource(segment, 0L); }
    /// {@return `pPictureResource` at the given index}
    /// @param index the index
    public @CType("const VkVideoPictureResourceInfoKHR *") java.lang.foreign.MemorySegment pPictureResourceAt(long index) { return VkVideoReferenceSlotInfoKHR.get_pPictureResource(this.segment(), index); }
    /// {@return `pPictureResource`}
    public @CType("const VkVideoPictureResourceInfoKHR *") java.lang.foreign.MemorySegment pPictureResource() { return VkVideoReferenceSlotInfoKHR.get_pPictureResource(this.segment()); }
    /// Sets `pPictureResource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pPictureResource(MemorySegment segment, long index, @CType("const VkVideoPictureResourceInfoKHR *") java.lang.foreign.MemorySegment value) { VH_pPictureResource.set(segment, 0L, index, value); }
    /// Sets `pPictureResource` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pPictureResource(MemorySegment segment, @CType("const VkVideoPictureResourceInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoReferenceSlotInfoKHR.set_pPictureResource(segment, 0L, value); }
    /// Sets `pPictureResource` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoReferenceSlotInfoKHR pPictureResourceAt(long index, @CType("const VkVideoPictureResourceInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoReferenceSlotInfoKHR.set_pPictureResource(this.segment(), index, value); return this; }
    /// Sets `pPictureResource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoReferenceSlotInfoKHR pPictureResource(@CType("const VkVideoPictureResourceInfoKHR *") java.lang.foreign.MemorySegment value) { VkVideoReferenceSlotInfoKHR.set_pPictureResource(this.segment(), value); return this; }

}

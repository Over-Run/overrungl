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
package overrungl.vulkan.nv.struct;

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
/// ### pAttributes
/// [VarHandle][#VH_pAttributes] - [Getter][#pAttributes()] - [Setter][#pAttributes(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkExportSemaphoreSciSyncInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     NvSciSyncAttrList pAttributes;
/// } VkExportSemaphoreSciSyncInfoNV;
/// ```
public final class VkExportSemaphoreSciSyncInfoNV extends Struct {
    /// The struct layout of `VkExportSemaphoreSciSyncInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pAttributes")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pAttributes` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pAttributes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pAttributes"));

    /// Creates `VkExportSemaphoreSciSyncInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkExportSemaphoreSciSyncInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkExportSemaphoreSciSyncInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportSemaphoreSciSyncInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExportSemaphoreSciSyncInfoNV(segment); }

    /// Creates `VkExportSemaphoreSciSyncInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportSemaphoreSciSyncInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExportSemaphoreSciSyncInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkExportSemaphoreSciSyncInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExportSemaphoreSciSyncInfoNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkExportSemaphoreSciSyncInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkExportSemaphoreSciSyncInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExportSemaphoreSciSyncInfoNV`
    public static VkExportSemaphoreSciSyncInfoNV alloc(SegmentAllocator allocator) { return new VkExportSemaphoreSciSyncInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkExportSemaphoreSciSyncInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExportSemaphoreSciSyncInfoNV`
    public static VkExportSemaphoreSciSyncInfoNV alloc(SegmentAllocator allocator, long count) { return new VkExportSemaphoreSciSyncInfoNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkExportSemaphoreSciSyncInfoNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkExportSemaphoreSciSyncInfoNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkExportSemaphoreSciSyncInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkExportSemaphoreSciSyncInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExportSemaphoreSciSyncInfoNV sTypeAt(long index, @CType("VkStructureType") int value) { VkExportSemaphoreSciSyncInfoNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportSemaphoreSciSyncInfoNV sType(@CType("VkStructureType") int value) { VkExportSemaphoreSciSyncInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkExportSemaphoreSciSyncInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkExportSemaphoreSciSyncInfoNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkExportSemaphoreSciSyncInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkExportSemaphoreSciSyncInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExportSemaphoreSciSyncInfoNV pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkExportSemaphoreSciSyncInfoNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportSemaphoreSciSyncInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkExportSemaphoreSciSyncInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `pAttributes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("NvSciSyncAttrList") java.lang.foreign.MemorySegment get_pAttributes(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pAttributes.get(segment, 0L, index); }
    /// {@return `pAttributes`}
    /// @param segment the segment of the struct
    public static @CType("NvSciSyncAttrList") java.lang.foreign.MemorySegment get_pAttributes(MemorySegment segment) { return VkExportSemaphoreSciSyncInfoNV.get_pAttributes(segment, 0L); }
    /// {@return `pAttributes` at the given index}
    /// @param index the index
    public @CType("NvSciSyncAttrList") java.lang.foreign.MemorySegment pAttributesAt(long index) { return VkExportSemaphoreSciSyncInfoNV.get_pAttributes(this.segment(), index); }
    /// {@return `pAttributes`}
    public @CType("NvSciSyncAttrList") java.lang.foreign.MemorySegment pAttributes() { return VkExportSemaphoreSciSyncInfoNV.get_pAttributes(this.segment()); }
    /// Sets `pAttributes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pAttributes(MemorySegment segment, long index, @CType("NvSciSyncAttrList") java.lang.foreign.MemorySegment value) { VH_pAttributes.set(segment, 0L, index, value); }
    /// Sets `pAttributes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pAttributes(MemorySegment segment, @CType("NvSciSyncAttrList") java.lang.foreign.MemorySegment value) { VkExportSemaphoreSciSyncInfoNV.set_pAttributes(segment, 0L, value); }
    /// Sets `pAttributes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExportSemaphoreSciSyncInfoNV pAttributesAt(long index, @CType("NvSciSyncAttrList") java.lang.foreign.MemorySegment value) { VkExportSemaphoreSciSyncInfoNV.set_pAttributes(this.segment(), index, value); return this; }
    /// Sets `pAttributes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExportSemaphoreSciSyncInfoNV pAttributes(@CType("NvSciSyncAttrList") java.lang.foreign.MemorySegment value) { VkExportSemaphoreSciSyncInfoNV.set_pAttributes(this.segment(), value); return this; }

}

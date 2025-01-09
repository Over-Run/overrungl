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
/// ### stereoType
/// [VarHandle][#VH_stereoType] - [Getter][#stereoType()] - [Setter][#stereoType(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDisplaySurfaceStereoCreateInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkDisplaySurfaceStereoTypeNV stereoType;
/// } VkDisplaySurfaceStereoCreateInfoNV;
/// ```
public final class VkDisplaySurfaceStereoCreateInfoNV extends Struct {
    /// The struct layout of `VkDisplaySurfaceStereoCreateInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stereoType")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `stereoType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stereoType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stereoType"));

    /// Creates `VkDisplaySurfaceStereoCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkDisplaySurfaceStereoCreateInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDisplaySurfaceStereoCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplaySurfaceStereoCreateInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplaySurfaceStereoCreateInfoNV(segment); }

    /// Creates `VkDisplaySurfaceStereoCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplaySurfaceStereoCreateInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplaySurfaceStereoCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDisplaySurfaceStereoCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplaySurfaceStereoCreateInfoNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplaySurfaceStereoCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDisplaySurfaceStereoCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplaySurfaceStereoCreateInfoNV`
    public static VkDisplaySurfaceStereoCreateInfoNV alloc(SegmentAllocator allocator) { return new VkDisplaySurfaceStereoCreateInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDisplaySurfaceStereoCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDisplaySurfaceStereoCreateInfoNV`
    public static VkDisplaySurfaceStereoCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkDisplaySurfaceStereoCreateInfoNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDisplaySurfaceStereoCreateInfoNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkDisplaySurfaceStereoCreateInfoNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDisplaySurfaceStereoCreateInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDisplaySurfaceStereoCreateInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplaySurfaceStereoCreateInfoNV sTypeAt(long index, @CType("VkStructureType") int value) { VkDisplaySurfaceStereoCreateInfoNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplaySurfaceStereoCreateInfoNV sType(@CType("VkStructureType") int value) { VkDisplaySurfaceStereoCreateInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDisplaySurfaceStereoCreateInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDisplaySurfaceStereoCreateInfoNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDisplaySurfaceStereoCreateInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDisplaySurfaceStereoCreateInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplaySurfaceStereoCreateInfoNV pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDisplaySurfaceStereoCreateInfoNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplaySurfaceStereoCreateInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDisplaySurfaceStereoCreateInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `stereoType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDisplaySurfaceStereoTypeNV") int get_stereoType(MemorySegment segment, long index) { return (int) VH_stereoType.get(segment, 0L, index); }
    /// {@return `stereoType`}
    /// @param segment the segment of the struct
    public static @CType("VkDisplaySurfaceStereoTypeNV") int get_stereoType(MemorySegment segment) { return VkDisplaySurfaceStereoCreateInfoNV.get_stereoType(segment, 0L); }
    /// {@return `stereoType` at the given index}
    /// @param index the index
    public @CType("VkDisplaySurfaceStereoTypeNV") int stereoTypeAt(long index) { return VkDisplaySurfaceStereoCreateInfoNV.get_stereoType(this.segment(), index); }
    /// {@return `stereoType`}
    public @CType("VkDisplaySurfaceStereoTypeNV") int stereoType() { return VkDisplaySurfaceStereoCreateInfoNV.get_stereoType(this.segment()); }
    /// Sets `stereoType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stereoType(MemorySegment segment, long index, @CType("VkDisplaySurfaceStereoTypeNV") int value) { VH_stereoType.set(segment, 0L, index, value); }
    /// Sets `stereoType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stereoType(MemorySegment segment, @CType("VkDisplaySurfaceStereoTypeNV") int value) { VkDisplaySurfaceStereoCreateInfoNV.set_stereoType(segment, 0L, value); }
    /// Sets `stereoType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplaySurfaceStereoCreateInfoNV stereoTypeAt(long index, @CType("VkDisplaySurfaceStereoTypeNV") int value) { VkDisplaySurfaceStereoCreateInfoNV.set_stereoType(this.segment(), index, value); return this; }
    /// Sets `stereoType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplaySurfaceStereoCreateInfoNV stereoType(@CType("VkDisplaySurfaceStereoTypeNV") int value) { VkDisplaySurfaceStereoCreateInfoNV.set_stereoType(this.segment(), value); return this; }

}

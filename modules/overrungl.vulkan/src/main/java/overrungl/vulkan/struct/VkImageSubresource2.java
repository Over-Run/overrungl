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
package overrungl.vulkan.struct;

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
/// ### imageSubresource
/// [Byte offset][#OFFSET_imageSubresource] - [Memory layout][#ML_imageSubresource] - [Getter][#imageSubresource()] - [Setter][#imageSubresource(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImageSubresource2 {
///     VkStructureType sType;
///     void * pNext;
///     VkImageSubresource imageSubresource;
/// } VkImageSubresource2;
/// ```
public final class VkImageSubresource2 extends Struct {
    /// The struct layout of `VkImageSubresource2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkImageSubresource.LAYOUT.withName("imageSubresource")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `imageSubresource`.
    public static final long OFFSET_imageSubresource = LAYOUT.byteOffset(PathElement.groupElement("imageSubresource"));
    /// The memory layout of `imageSubresource`.
    public static final MemoryLayout ML_imageSubresource = LAYOUT.select(PathElement.groupElement("imageSubresource"));

    /// Creates `VkImageSubresource2` with the given segment.
    /// @param segment the memory segment
    public VkImageSubresource2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageSubresource2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageSubresource2 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageSubresource2(segment); }

    /// Creates `VkImageSubresource2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageSubresource2 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageSubresource2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageSubresource2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageSubresource2 ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkImageSubresource2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkImageSubresource2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageSubresource2`
    public static VkImageSubresource2 alloc(SegmentAllocator allocator) { return new VkImageSubresource2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageSubresource2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageSubresource2`
    public static VkImageSubresource2 alloc(SegmentAllocator allocator, long count) { return new VkImageSubresource2(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImageSubresource2.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkImageSubresource2.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImageSubresource2.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImageSubresource2.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageSubresource2 sTypeAt(long index, @CType("VkStructureType") int value) { VkImageSubresource2.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSubresource2 sType(@CType("VkStructureType") int value) { VkImageSubresource2.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkImageSubresource2.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkImageSubresource2.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkImageSubresource2.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkImageSubresource2.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageSubresource2 pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkImageSubresource2.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSubresource2 pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkImageSubresource2.set_pNext(this.segment(), value); return this; }

    /// {@return `imageSubresource` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageSubresource") java.lang.foreign.MemorySegment get_imageSubresource(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageSubresource, index), ML_imageSubresource); }
    /// {@return `imageSubresource`}
    /// @param segment the segment of the struct
    public static @CType("VkImageSubresource") java.lang.foreign.MemorySegment get_imageSubresource(MemorySegment segment) { return VkImageSubresource2.get_imageSubresource(segment, 0L); }
    /// {@return `imageSubresource` at the given index}
    /// @param index the index
    public @CType("VkImageSubresource") java.lang.foreign.MemorySegment imageSubresourceAt(long index) { return VkImageSubresource2.get_imageSubresource(this.segment(), index); }
    /// {@return `imageSubresource`}
    public @CType("VkImageSubresource") java.lang.foreign.MemorySegment imageSubresource() { return VkImageSubresource2.get_imageSubresource(this.segment()); }
    /// Sets `imageSubresource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageSubresource(MemorySegment segment, long index, @CType("VkImageSubresource") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageSubresource, index), ML_imageSubresource.byteSize()); }
    /// Sets `imageSubresource` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageSubresource(MemorySegment segment, @CType("VkImageSubresource") java.lang.foreign.MemorySegment value) { VkImageSubresource2.set_imageSubresource(segment, 0L, value); }
    /// Sets `imageSubresource` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageSubresource2 imageSubresourceAt(long index, @CType("VkImageSubresource") java.lang.foreign.MemorySegment value) { VkImageSubresource2.set_imageSubresource(this.segment(), index, value); return this; }
    /// Sets `imageSubresource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSubresource2 imageSubresource(@CType("VkImageSubresource") java.lang.foreign.MemorySegment value) { VkImageSubresource2.set_imageSubresource(this.segment(), value); return this; }

}

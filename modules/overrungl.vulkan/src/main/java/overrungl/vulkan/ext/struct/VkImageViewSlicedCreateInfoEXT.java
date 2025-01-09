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
package overrungl.vulkan.ext.struct;

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
/// ### sliceOffset
/// [VarHandle][#VH_sliceOffset] - [Getter][#sliceOffset()] - [Setter][#sliceOffset(int)]
/// ### sliceCount
/// [VarHandle][#VH_sliceCount] - [Getter][#sliceCount()] - [Setter][#sliceCount(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImageViewSlicedCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t sliceOffset;
///     uint32_t sliceCount;
/// } VkImageViewSlicedCreateInfoEXT;
/// ```
public final class VkImageViewSlicedCreateInfoEXT extends Struct {
    /// The struct layout of `VkImageViewSlicedCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sliceOffset"),
        ValueLayout.JAVA_INT.withName("sliceCount")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `sliceOffset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sliceOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sliceOffset"));
    /// The [VarHandle] of `sliceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sliceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sliceCount"));

    /// Creates `VkImageViewSlicedCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkImageViewSlicedCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageViewSlicedCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageViewSlicedCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageViewSlicedCreateInfoEXT(segment); }

    /// Creates `VkImageViewSlicedCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageViewSlicedCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageViewSlicedCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageViewSlicedCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageViewSlicedCreateInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkImageViewSlicedCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkImageViewSlicedCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageViewSlicedCreateInfoEXT`
    public static VkImageViewSlicedCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkImageViewSlicedCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageViewSlicedCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageViewSlicedCreateInfoEXT`
    public static VkImageViewSlicedCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkImageViewSlicedCreateInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkImageViewSlicedCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImageViewSlicedCreateInfoEXT`
    public VkImageViewSlicedCreateInfoEXT asSlice(long index) { return new VkImageViewSlicedCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkImageViewSlicedCreateInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImageViewSlicedCreateInfoEXT`
    public VkImageViewSlicedCreateInfoEXT asSlice(long index, long count) { return new VkImageViewSlicedCreateInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImageViewSlicedCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkImageViewSlicedCreateInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImageViewSlicedCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImageViewSlicedCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageViewSlicedCreateInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkImageViewSlicedCreateInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewSlicedCreateInfoEXT sType(@CType("VkStructureType") int value) { VkImageViewSlicedCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkImageViewSlicedCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkImageViewSlicedCreateInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkImageViewSlicedCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImageViewSlicedCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageViewSlicedCreateInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImageViewSlicedCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewSlicedCreateInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkImageViewSlicedCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `sliceOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_sliceOffset(MemorySegment segment, long index) { return (int) VH_sliceOffset.get(segment, 0L, index); }
    /// {@return `sliceOffset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_sliceOffset(MemorySegment segment) { return VkImageViewSlicedCreateInfoEXT.get_sliceOffset(segment, 0L); }
    /// {@return `sliceOffset` at the given index}
    /// @param index the index
    public @CType("uint32_t") int sliceOffsetAt(long index) { return VkImageViewSlicedCreateInfoEXT.get_sliceOffset(this.segment(), index); }
    /// {@return `sliceOffset`}
    public @CType("uint32_t") int sliceOffset() { return VkImageViewSlicedCreateInfoEXT.get_sliceOffset(this.segment()); }
    /// Sets `sliceOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sliceOffset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_sliceOffset.set(segment, 0L, index, value); }
    /// Sets `sliceOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sliceOffset(MemorySegment segment, @CType("uint32_t") int value) { VkImageViewSlicedCreateInfoEXT.set_sliceOffset(segment, 0L, value); }
    /// Sets `sliceOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageViewSlicedCreateInfoEXT sliceOffsetAt(long index, @CType("uint32_t") int value) { VkImageViewSlicedCreateInfoEXT.set_sliceOffset(this.segment(), index, value); return this; }
    /// Sets `sliceOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewSlicedCreateInfoEXT sliceOffset(@CType("uint32_t") int value) { VkImageViewSlicedCreateInfoEXT.set_sliceOffset(this.segment(), value); return this; }

    /// {@return `sliceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_sliceCount(MemorySegment segment, long index) { return (int) VH_sliceCount.get(segment, 0L, index); }
    /// {@return `sliceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_sliceCount(MemorySegment segment) { return VkImageViewSlicedCreateInfoEXT.get_sliceCount(segment, 0L); }
    /// {@return `sliceCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int sliceCountAt(long index) { return VkImageViewSlicedCreateInfoEXT.get_sliceCount(this.segment(), index); }
    /// {@return `sliceCount`}
    public @CType("uint32_t") int sliceCount() { return VkImageViewSlicedCreateInfoEXT.get_sliceCount(this.segment()); }
    /// Sets `sliceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sliceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_sliceCount.set(segment, 0L, index, value); }
    /// Sets `sliceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sliceCount(MemorySegment segment, @CType("uint32_t") int value) { VkImageViewSlicedCreateInfoEXT.set_sliceCount(segment, 0L, value); }
    /// Sets `sliceCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageViewSlicedCreateInfoEXT sliceCountAt(long index, @CType("uint32_t") int value) { VkImageViewSlicedCreateInfoEXT.set_sliceCount(this.segment(), index, value); return this; }
    /// Sets `sliceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewSlicedCreateInfoEXT sliceCount(@CType("uint32_t") int value) { VkImageViewSlicedCreateInfoEXT.set_sliceCount(this.segment(), value); return this; }

}

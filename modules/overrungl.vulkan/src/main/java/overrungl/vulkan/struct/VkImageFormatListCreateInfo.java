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
/// ### viewFormatCount
/// [VarHandle][#VH_viewFormatCount] - [Getter][#viewFormatCount()] - [Setter][#viewFormatCount(int)]
/// ### pViewFormats
/// [VarHandle][#VH_pViewFormats] - [Getter][#pViewFormats()] - [Setter][#pViewFormats(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImageFormatListCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t viewFormatCount;
///     const VkFormat * pViewFormats;
/// } VkImageFormatListCreateInfo;
/// ```
public final class VkImageFormatListCreateInfo extends Struct {
    /// The struct layout of `VkImageFormatListCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("viewFormatCount"),
        ValueLayout.ADDRESS.withName("pViewFormats")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `viewFormatCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_viewFormatCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewFormatCount"));
    /// The [VarHandle] of `pViewFormats` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pViewFormats = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pViewFormats"));

    /// Creates `VkImageFormatListCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkImageFormatListCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageFormatListCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageFormatListCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageFormatListCreateInfo(segment); }

    /// Creates `VkImageFormatListCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageFormatListCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageFormatListCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageFormatListCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageFormatListCreateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkImageFormatListCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkImageFormatListCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageFormatListCreateInfo`
    public static VkImageFormatListCreateInfo alloc(SegmentAllocator allocator) { return new VkImageFormatListCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageFormatListCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageFormatListCreateInfo`
    public static VkImageFormatListCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkImageFormatListCreateInfo(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkImageFormatListCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImageFormatListCreateInfo`
    public VkImageFormatListCreateInfo asSlice(long index) { return new VkImageFormatListCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkImageFormatListCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImageFormatListCreateInfo`
    public VkImageFormatListCreateInfo asSlice(long index, long count) { return new VkImageFormatListCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImageFormatListCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkImageFormatListCreateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImageFormatListCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImageFormatListCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageFormatListCreateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkImageFormatListCreateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatListCreateInfo sType(@CType("VkStructureType") int value) { VkImageFormatListCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkImageFormatListCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkImageFormatListCreateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkImageFormatListCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImageFormatListCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageFormatListCreateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImageFormatListCreateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatListCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkImageFormatListCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `viewFormatCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_viewFormatCount(MemorySegment segment, long index) { return (int) VH_viewFormatCount.get(segment, 0L, index); }
    /// {@return `viewFormatCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_viewFormatCount(MemorySegment segment) { return VkImageFormatListCreateInfo.get_viewFormatCount(segment, 0L); }
    /// {@return `viewFormatCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int viewFormatCountAt(long index) { return VkImageFormatListCreateInfo.get_viewFormatCount(this.segment(), index); }
    /// {@return `viewFormatCount`}
    public @CType("uint32_t") int viewFormatCount() { return VkImageFormatListCreateInfo.get_viewFormatCount(this.segment()); }
    /// Sets `viewFormatCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_viewFormatCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_viewFormatCount.set(segment, 0L, index, value); }
    /// Sets `viewFormatCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_viewFormatCount(MemorySegment segment, @CType("uint32_t") int value) { VkImageFormatListCreateInfo.set_viewFormatCount(segment, 0L, value); }
    /// Sets `viewFormatCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageFormatListCreateInfo viewFormatCountAt(long index, @CType("uint32_t") int value) { VkImageFormatListCreateInfo.set_viewFormatCount(this.segment(), index, value); return this; }
    /// Sets `viewFormatCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatListCreateInfo viewFormatCount(@CType("uint32_t") int value) { VkImageFormatListCreateInfo.set_viewFormatCount(this.segment(), value); return this; }

    /// {@return `pViewFormats` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkFormat *") java.lang.foreign.MemorySegment get_pViewFormats(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pViewFormats.get(segment, 0L, index); }
    /// {@return `pViewFormats`}
    /// @param segment the segment of the struct
    public static @CType("const VkFormat *") java.lang.foreign.MemorySegment get_pViewFormats(MemorySegment segment) { return VkImageFormatListCreateInfo.get_pViewFormats(segment, 0L); }
    /// {@return `pViewFormats` at the given index}
    /// @param index the index
    public @CType("const VkFormat *") java.lang.foreign.MemorySegment pViewFormatsAt(long index) { return VkImageFormatListCreateInfo.get_pViewFormats(this.segment(), index); }
    /// {@return `pViewFormats`}
    public @CType("const VkFormat *") java.lang.foreign.MemorySegment pViewFormats() { return VkImageFormatListCreateInfo.get_pViewFormats(this.segment()); }
    /// Sets `pViewFormats` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pViewFormats(MemorySegment segment, long index, @CType("const VkFormat *") java.lang.foreign.MemorySegment value) { VH_pViewFormats.set(segment, 0L, index, value); }
    /// Sets `pViewFormats` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pViewFormats(MemorySegment segment, @CType("const VkFormat *") java.lang.foreign.MemorySegment value) { VkImageFormatListCreateInfo.set_pViewFormats(segment, 0L, value); }
    /// Sets `pViewFormats` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageFormatListCreateInfo pViewFormatsAt(long index, @CType("const VkFormat *") java.lang.foreign.MemorySegment value) { VkImageFormatListCreateInfo.set_pViewFormats(this.segment(), index, value); return this; }
    /// Sets `pViewFormats` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageFormatListCreateInfo pViewFormats(@CType("const VkFormat *") java.lang.foreign.MemorySegment value) { VkImageFormatListCreateInfo.set_pViewFormats(this.segment(), value); return this; }

}

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
/// ### image
/// [VarHandle][#VH_image] - [Getter][#image()] - [Setter][#image(java.lang.foreign.MemorySegment)]
/// ### oldLayout
/// [VarHandle][#VH_oldLayout] - [Getter][#oldLayout()] - [Setter][#oldLayout(int)]
/// ### newLayout
/// [VarHandle][#VH_newLayout] - [Getter][#newLayout()] - [Setter][#newLayout(int)]
/// ### subresourceRange
/// [Byte offset][#OFFSET_subresourceRange] - [Memory layout][#ML_subresourceRange] - [Getter][#subresourceRange()] - [Setter][#subresourceRange(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkHostImageLayoutTransitionInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkImage image;
///     VkImageLayout oldLayout;
///     VkImageLayout newLayout;
///     VkImageSubresourceRange subresourceRange;
/// } VkHostImageLayoutTransitionInfo;
/// ```
public final class VkHostImageLayoutTransitionInfo extends Struct {
    /// The struct layout of `VkHostImageLayoutTransitionInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("image"),
        ValueLayout.JAVA_INT.withName("oldLayout"),
        ValueLayout.JAVA_INT.withName("newLayout"),
        overrungl.vulkan.struct.VkImageSubresourceRange.LAYOUT.withName("subresourceRange")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `image` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_image = LAYOUT.arrayElementVarHandle(PathElement.groupElement("image"));
    /// The [VarHandle] of `oldLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_oldLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("oldLayout"));
    /// The [VarHandle] of `newLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_newLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("newLayout"));
    /// The byte offset of `subresourceRange`.
    public static final long OFFSET_subresourceRange = LAYOUT.byteOffset(PathElement.groupElement("subresourceRange"));
    /// The memory layout of `subresourceRange`.
    public static final MemoryLayout ML_subresourceRange = LAYOUT.select(PathElement.groupElement("subresourceRange"));

    /// Creates `VkHostImageLayoutTransitionInfo` with the given segment.
    /// @param segment the memory segment
    public VkHostImageLayoutTransitionInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkHostImageLayoutTransitionInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkHostImageLayoutTransitionInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkHostImageLayoutTransitionInfo(segment); }

    /// Creates `VkHostImageLayoutTransitionInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkHostImageLayoutTransitionInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkHostImageLayoutTransitionInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkHostImageLayoutTransitionInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkHostImageLayoutTransitionInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkHostImageLayoutTransitionInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkHostImageLayoutTransitionInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkHostImageLayoutTransitionInfo`
    public static VkHostImageLayoutTransitionInfo alloc(SegmentAllocator allocator) { return new VkHostImageLayoutTransitionInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkHostImageLayoutTransitionInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkHostImageLayoutTransitionInfo`
    public static VkHostImageLayoutTransitionInfo alloc(SegmentAllocator allocator, long count) { return new VkHostImageLayoutTransitionInfo(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkHostImageLayoutTransitionInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkHostImageLayoutTransitionInfo`
    public VkHostImageLayoutTransitionInfo asSlice(long index) { return new VkHostImageLayoutTransitionInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkHostImageLayoutTransitionInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkHostImageLayoutTransitionInfo`
    public VkHostImageLayoutTransitionInfo asSlice(long index, long count) { return new VkHostImageLayoutTransitionInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkHostImageLayoutTransitionInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkHostImageLayoutTransitionInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkHostImageLayoutTransitionInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkHostImageLayoutTransitionInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkHostImageLayoutTransitionInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkHostImageLayoutTransitionInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHostImageLayoutTransitionInfo sType(@CType("VkStructureType") int value) { VkHostImageLayoutTransitionInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkHostImageLayoutTransitionInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkHostImageLayoutTransitionInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkHostImageLayoutTransitionInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkHostImageLayoutTransitionInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkHostImageLayoutTransitionInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkHostImageLayoutTransitionInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHostImageLayoutTransitionInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkHostImageLayoutTransitionInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `image` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImage") java.lang.foreign.MemorySegment get_image(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_image.get(segment, 0L, index); }
    /// {@return `image`}
    /// @param segment the segment of the struct
    public static @CType("VkImage") java.lang.foreign.MemorySegment get_image(MemorySegment segment) { return VkHostImageLayoutTransitionInfo.get_image(segment, 0L); }
    /// {@return `image` at the given index}
    /// @param index the index
    public @CType("VkImage") java.lang.foreign.MemorySegment imageAt(long index) { return VkHostImageLayoutTransitionInfo.get_image(this.segment(), index); }
    /// {@return `image`}
    public @CType("VkImage") java.lang.foreign.MemorySegment image() { return VkHostImageLayoutTransitionInfo.get_image(this.segment()); }
    /// Sets `image` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_image(MemorySegment segment, long index, @CType("VkImage") java.lang.foreign.MemorySegment value) { VH_image.set(segment, 0L, index, value); }
    /// Sets `image` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_image(MemorySegment segment, @CType("VkImage") java.lang.foreign.MemorySegment value) { VkHostImageLayoutTransitionInfo.set_image(segment, 0L, value); }
    /// Sets `image` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkHostImageLayoutTransitionInfo imageAt(long index, @CType("VkImage") java.lang.foreign.MemorySegment value) { VkHostImageLayoutTransitionInfo.set_image(this.segment(), index, value); return this; }
    /// Sets `image` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHostImageLayoutTransitionInfo image(@CType("VkImage") java.lang.foreign.MemorySegment value) { VkHostImageLayoutTransitionInfo.set_image(this.segment(), value); return this; }

    /// {@return `oldLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageLayout") int get_oldLayout(MemorySegment segment, long index) { return (int) VH_oldLayout.get(segment, 0L, index); }
    /// {@return `oldLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkImageLayout") int get_oldLayout(MemorySegment segment) { return VkHostImageLayoutTransitionInfo.get_oldLayout(segment, 0L); }
    /// {@return `oldLayout` at the given index}
    /// @param index the index
    public @CType("VkImageLayout") int oldLayoutAt(long index) { return VkHostImageLayoutTransitionInfo.get_oldLayout(this.segment(), index); }
    /// {@return `oldLayout`}
    public @CType("VkImageLayout") int oldLayout() { return VkHostImageLayoutTransitionInfo.get_oldLayout(this.segment()); }
    /// Sets `oldLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_oldLayout(MemorySegment segment, long index, @CType("VkImageLayout") int value) { VH_oldLayout.set(segment, 0L, index, value); }
    /// Sets `oldLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_oldLayout(MemorySegment segment, @CType("VkImageLayout") int value) { VkHostImageLayoutTransitionInfo.set_oldLayout(segment, 0L, value); }
    /// Sets `oldLayout` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkHostImageLayoutTransitionInfo oldLayoutAt(long index, @CType("VkImageLayout") int value) { VkHostImageLayoutTransitionInfo.set_oldLayout(this.segment(), index, value); return this; }
    /// Sets `oldLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHostImageLayoutTransitionInfo oldLayout(@CType("VkImageLayout") int value) { VkHostImageLayoutTransitionInfo.set_oldLayout(this.segment(), value); return this; }

    /// {@return `newLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageLayout") int get_newLayout(MemorySegment segment, long index) { return (int) VH_newLayout.get(segment, 0L, index); }
    /// {@return `newLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkImageLayout") int get_newLayout(MemorySegment segment) { return VkHostImageLayoutTransitionInfo.get_newLayout(segment, 0L); }
    /// {@return `newLayout` at the given index}
    /// @param index the index
    public @CType("VkImageLayout") int newLayoutAt(long index) { return VkHostImageLayoutTransitionInfo.get_newLayout(this.segment(), index); }
    /// {@return `newLayout`}
    public @CType("VkImageLayout") int newLayout() { return VkHostImageLayoutTransitionInfo.get_newLayout(this.segment()); }
    /// Sets `newLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_newLayout(MemorySegment segment, long index, @CType("VkImageLayout") int value) { VH_newLayout.set(segment, 0L, index, value); }
    /// Sets `newLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_newLayout(MemorySegment segment, @CType("VkImageLayout") int value) { VkHostImageLayoutTransitionInfo.set_newLayout(segment, 0L, value); }
    /// Sets `newLayout` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkHostImageLayoutTransitionInfo newLayoutAt(long index, @CType("VkImageLayout") int value) { VkHostImageLayoutTransitionInfo.set_newLayout(this.segment(), index, value); return this; }
    /// Sets `newLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHostImageLayoutTransitionInfo newLayout(@CType("VkImageLayout") int value) { VkHostImageLayoutTransitionInfo.set_newLayout(this.segment(), value); return this; }

    /// {@return `subresourceRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageSubresourceRange") java.lang.foreign.MemorySegment get_subresourceRange(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_subresourceRange, index), ML_subresourceRange); }
    /// {@return `subresourceRange`}
    /// @param segment the segment of the struct
    public static @CType("VkImageSubresourceRange") java.lang.foreign.MemorySegment get_subresourceRange(MemorySegment segment) { return VkHostImageLayoutTransitionInfo.get_subresourceRange(segment, 0L); }
    /// {@return `subresourceRange` at the given index}
    /// @param index the index
    public @CType("VkImageSubresourceRange") java.lang.foreign.MemorySegment subresourceRangeAt(long index) { return VkHostImageLayoutTransitionInfo.get_subresourceRange(this.segment(), index); }
    /// {@return `subresourceRange`}
    public @CType("VkImageSubresourceRange") java.lang.foreign.MemorySegment subresourceRange() { return VkHostImageLayoutTransitionInfo.get_subresourceRange(this.segment()); }
    /// Sets `subresourceRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subresourceRange(MemorySegment segment, long index, @CType("VkImageSubresourceRange") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_subresourceRange, index), ML_subresourceRange.byteSize()); }
    /// Sets `subresourceRange` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subresourceRange(MemorySegment segment, @CType("VkImageSubresourceRange") java.lang.foreign.MemorySegment value) { VkHostImageLayoutTransitionInfo.set_subresourceRange(segment, 0L, value); }
    /// Sets `subresourceRange` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkHostImageLayoutTransitionInfo subresourceRangeAt(long index, @CType("VkImageSubresourceRange") java.lang.foreign.MemorySegment value) { VkHostImageLayoutTransitionInfo.set_subresourceRange(this.segment(), index, value); return this; }
    /// Sets `subresourceRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkHostImageLayoutTransitionInfo subresourceRange(@CType("VkImageSubresourceRange") java.lang.foreign.MemorySegment value) { VkHostImageLayoutTransitionInfo.set_subresourceRange(this.segment(), value); return this; }

}

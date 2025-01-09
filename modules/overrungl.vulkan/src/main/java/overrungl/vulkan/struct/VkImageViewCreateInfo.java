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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### image
/// [VarHandle][#VH_image] - [Getter][#image()] - [Setter][#image(java.lang.foreign.MemorySegment)]
/// ### viewType
/// [VarHandle][#VH_viewType] - [Getter][#viewType()] - [Setter][#viewType(int)]
/// ### format
/// [VarHandle][#VH_format] - [Getter][#format()] - [Setter][#format(int)]
/// ### components
/// [Byte offset][#OFFSET_components] - [Memory layout][#ML_components] - [Getter][#components()] - [Setter][#components(java.lang.foreign.MemorySegment)]
/// ### subresourceRange
/// [Byte offset][#OFFSET_subresourceRange] - [Memory layout][#ML_subresourceRange] - [Getter][#subresourceRange()] - [Setter][#subresourceRange(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImageViewCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkImageViewCreateFlags flags;
///     VkImage image;
///     VkImageViewType viewType;
///     VkFormat format;
///     VkComponentMapping components;
///     VkImageSubresourceRange subresourceRange;
/// } VkImageViewCreateInfo;
/// ```
public final class VkImageViewCreateInfo extends Struct {
    /// The struct layout of `VkImageViewCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("image"),
        ValueLayout.JAVA_INT.withName("viewType"),
        ValueLayout.JAVA_INT.withName("format"),
        overrungl.vulkan.struct.VkComponentMapping.LAYOUT.withName("components"),
        overrungl.vulkan.struct.VkImageSubresourceRange.LAYOUT.withName("subresourceRange")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `image` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_image = LAYOUT.arrayElementVarHandle(PathElement.groupElement("image"));
    /// The [VarHandle] of `viewType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_viewType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewType"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    /// The byte offset of `components`.
    public static final long OFFSET_components = LAYOUT.byteOffset(PathElement.groupElement("components"));
    /// The memory layout of `components`.
    public static final MemoryLayout ML_components = LAYOUT.select(PathElement.groupElement("components"));
    /// The byte offset of `subresourceRange`.
    public static final long OFFSET_subresourceRange = LAYOUT.byteOffset(PathElement.groupElement("subresourceRange"));
    /// The memory layout of `subresourceRange`.
    public static final MemoryLayout ML_subresourceRange = LAYOUT.select(PathElement.groupElement("subresourceRange"));

    /// Creates `VkImageViewCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkImageViewCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageViewCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageViewCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageViewCreateInfo(segment); }

    /// Creates `VkImageViewCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageViewCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageViewCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageViewCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageViewCreateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkImageViewCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkImageViewCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageViewCreateInfo`
    public static VkImageViewCreateInfo alloc(SegmentAllocator allocator) { return new VkImageViewCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageViewCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageViewCreateInfo`
    public static VkImageViewCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkImageViewCreateInfo(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkImageViewCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImageViewCreateInfo`
    public VkImageViewCreateInfo asSlice(long index) { return new VkImageViewCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkImageViewCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImageViewCreateInfo`
    public VkImageViewCreateInfo asSlice(long index, long count) { return new VkImageViewCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImageViewCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkImageViewCreateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImageViewCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImageViewCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageViewCreateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkImageViewCreateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewCreateInfo sType(@CType("VkStructureType") int value) { VkImageViewCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkImageViewCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkImageViewCreateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkImageViewCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImageViewCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageViewCreateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImageViewCreateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkImageViewCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageViewCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkImageViewCreateFlags") int get_flags(MemorySegment segment) { return VkImageViewCreateInfo.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkImageViewCreateFlags") int flagsAt(long index) { return VkImageViewCreateInfo.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkImageViewCreateFlags") int flags() { return VkImageViewCreateInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkImageViewCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkImageViewCreateFlags") int value) { VkImageViewCreateInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageViewCreateInfo flagsAt(long index, @CType("VkImageViewCreateFlags") int value) { VkImageViewCreateInfo.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewCreateInfo flags(@CType("VkImageViewCreateFlags") int value) { VkImageViewCreateInfo.set_flags(this.segment(), value); return this; }

    /// {@return `image` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImage") java.lang.foreign.MemorySegment get_image(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_image.get(segment, 0L, index); }
    /// {@return `image`}
    /// @param segment the segment of the struct
    public static @CType("VkImage") java.lang.foreign.MemorySegment get_image(MemorySegment segment) { return VkImageViewCreateInfo.get_image(segment, 0L); }
    /// {@return `image` at the given index}
    /// @param index the index
    public @CType("VkImage") java.lang.foreign.MemorySegment imageAt(long index) { return VkImageViewCreateInfo.get_image(this.segment(), index); }
    /// {@return `image`}
    public @CType("VkImage") java.lang.foreign.MemorySegment image() { return VkImageViewCreateInfo.get_image(this.segment()); }
    /// Sets `image` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_image(MemorySegment segment, long index, @CType("VkImage") java.lang.foreign.MemorySegment value) { VH_image.set(segment, 0L, index, value); }
    /// Sets `image` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_image(MemorySegment segment, @CType("VkImage") java.lang.foreign.MemorySegment value) { VkImageViewCreateInfo.set_image(segment, 0L, value); }
    /// Sets `image` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageViewCreateInfo imageAt(long index, @CType("VkImage") java.lang.foreign.MemorySegment value) { VkImageViewCreateInfo.set_image(this.segment(), index, value); return this; }
    /// Sets `image` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewCreateInfo image(@CType("VkImage") java.lang.foreign.MemorySegment value) { VkImageViewCreateInfo.set_image(this.segment(), value); return this; }

    /// {@return `viewType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageViewType") int get_viewType(MemorySegment segment, long index) { return (int) VH_viewType.get(segment, 0L, index); }
    /// {@return `viewType`}
    /// @param segment the segment of the struct
    public static @CType("VkImageViewType") int get_viewType(MemorySegment segment) { return VkImageViewCreateInfo.get_viewType(segment, 0L); }
    /// {@return `viewType` at the given index}
    /// @param index the index
    public @CType("VkImageViewType") int viewTypeAt(long index) { return VkImageViewCreateInfo.get_viewType(this.segment(), index); }
    /// {@return `viewType`}
    public @CType("VkImageViewType") int viewType() { return VkImageViewCreateInfo.get_viewType(this.segment()); }
    /// Sets `viewType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_viewType(MemorySegment segment, long index, @CType("VkImageViewType") int value) { VH_viewType.set(segment, 0L, index, value); }
    /// Sets `viewType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_viewType(MemorySegment segment, @CType("VkImageViewType") int value) { VkImageViewCreateInfo.set_viewType(segment, 0L, value); }
    /// Sets `viewType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageViewCreateInfo viewTypeAt(long index, @CType("VkImageViewType") int value) { VkImageViewCreateInfo.set_viewType(this.segment(), index, value); return this; }
    /// Sets `viewType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewCreateInfo viewType(@CType("VkImageViewType") int value) { VkImageViewCreateInfo.set_viewType(this.segment(), value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_format(MemorySegment segment) { return VkImageViewCreateInfo.get_format(segment, 0L); }
    /// {@return `format` at the given index}
    /// @param index the index
    public @CType("VkFormat") int formatAt(long index) { return VkImageViewCreateInfo.get_format(this.segment(), index); }
    /// {@return `format`}
    public @CType("VkFormat") int format() { return VkImageViewCreateInfo.get_format(this.segment()); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_format(MemorySegment segment, long index, @CType("VkFormat") int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_format(MemorySegment segment, @CType("VkFormat") int value) { VkImageViewCreateInfo.set_format(segment, 0L, value); }
    /// Sets `format` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageViewCreateInfo formatAt(long index, @CType("VkFormat") int value) { VkImageViewCreateInfo.set_format(this.segment(), index, value); return this; }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewCreateInfo format(@CType("VkFormat") int value) { VkImageViewCreateInfo.set_format(this.segment(), value); return this; }

    /// {@return `components` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkComponentMapping") java.lang.foreign.MemorySegment get_components(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_components, index), ML_components); }
    /// {@return `components`}
    /// @param segment the segment of the struct
    public static @CType("VkComponentMapping") java.lang.foreign.MemorySegment get_components(MemorySegment segment) { return VkImageViewCreateInfo.get_components(segment, 0L); }
    /// {@return `components` at the given index}
    /// @param index the index
    public @CType("VkComponentMapping") java.lang.foreign.MemorySegment componentsAt(long index) { return VkImageViewCreateInfo.get_components(this.segment(), index); }
    /// {@return `components`}
    public @CType("VkComponentMapping") java.lang.foreign.MemorySegment components() { return VkImageViewCreateInfo.get_components(this.segment()); }
    /// Sets `components` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_components(MemorySegment segment, long index, @CType("VkComponentMapping") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_components, index), ML_components.byteSize()); }
    /// Sets `components` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_components(MemorySegment segment, @CType("VkComponentMapping") java.lang.foreign.MemorySegment value) { VkImageViewCreateInfo.set_components(segment, 0L, value); }
    /// Sets `components` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageViewCreateInfo componentsAt(long index, @CType("VkComponentMapping") java.lang.foreign.MemorySegment value) { VkImageViewCreateInfo.set_components(this.segment(), index, value); return this; }
    /// Sets `components` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewCreateInfo components(@CType("VkComponentMapping") java.lang.foreign.MemorySegment value) { VkImageViewCreateInfo.set_components(this.segment(), value); return this; }

    /// {@return `subresourceRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageSubresourceRange") java.lang.foreign.MemorySegment get_subresourceRange(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_subresourceRange, index), ML_subresourceRange); }
    /// {@return `subresourceRange`}
    /// @param segment the segment of the struct
    public static @CType("VkImageSubresourceRange") java.lang.foreign.MemorySegment get_subresourceRange(MemorySegment segment) { return VkImageViewCreateInfo.get_subresourceRange(segment, 0L); }
    /// {@return `subresourceRange` at the given index}
    /// @param index the index
    public @CType("VkImageSubresourceRange") java.lang.foreign.MemorySegment subresourceRangeAt(long index) { return VkImageViewCreateInfo.get_subresourceRange(this.segment(), index); }
    /// {@return `subresourceRange`}
    public @CType("VkImageSubresourceRange") java.lang.foreign.MemorySegment subresourceRange() { return VkImageViewCreateInfo.get_subresourceRange(this.segment()); }
    /// Sets `subresourceRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subresourceRange(MemorySegment segment, long index, @CType("VkImageSubresourceRange") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_subresourceRange, index), ML_subresourceRange.byteSize()); }
    /// Sets `subresourceRange` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subresourceRange(MemorySegment segment, @CType("VkImageSubresourceRange") java.lang.foreign.MemorySegment value) { VkImageViewCreateInfo.set_subresourceRange(segment, 0L, value); }
    /// Sets `subresourceRange` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageViewCreateInfo subresourceRangeAt(long index, @CType("VkImageSubresourceRange") java.lang.foreign.MemorySegment value) { VkImageViewCreateInfo.set_subresourceRange(this.segment(), index, value); return this; }
    /// Sets `subresourceRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageViewCreateInfo subresourceRange(@CType("VkImageSubresourceRange") java.lang.foreign.MemorySegment value) { VkImageViewCreateInfo.set_subresourceRange(this.segment(), value); return this; }

}

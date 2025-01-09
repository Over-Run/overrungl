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
/// ### usage
/// [VarHandle][#VH_usage] - [Getter][#usage()] - [Setter][#usage(int)]
/// ### width
/// [VarHandle][#VH_width] - [Getter][#width()] - [Setter][#width(int)]
/// ### height
/// [VarHandle][#VH_height] - [Getter][#height()] - [Setter][#height(int)]
/// ### layerCount
/// [VarHandle][#VH_layerCount] - [Getter][#layerCount()] - [Setter][#layerCount(int)]
/// ### viewFormatCount
/// [VarHandle][#VH_viewFormatCount] - [Getter][#viewFormatCount()] - [Setter][#viewFormatCount(int)]
/// ### pViewFormats
/// [VarHandle][#VH_pViewFormats] - [Getter][#pViewFormats()] - [Setter][#pViewFormats(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkFramebufferAttachmentImageInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkImageCreateFlags flags;
///     VkImageUsageFlags usage;
///     uint32_t width;
///     uint32_t height;
///     uint32_t layerCount;
///     uint32_t viewFormatCount;
///     const VkFormat * pViewFormats;
/// } VkFramebufferAttachmentImageInfo;
/// ```
public final class VkFramebufferAttachmentImageInfo extends Struct {
    /// The struct layout of `VkFramebufferAttachmentImageInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("usage"),
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("layerCount"),
        ValueLayout.JAVA_INT.withName("viewFormatCount"),
        ValueLayout.ADDRESS.withName("pViewFormats")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `usage` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_usage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usage"));
    /// The [VarHandle] of `width` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("width"));
    /// The [VarHandle] of `height` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("height"));
    /// The [VarHandle] of `layerCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_layerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layerCount"));
    /// The [VarHandle] of `viewFormatCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_viewFormatCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewFormatCount"));
    /// The [VarHandle] of `pViewFormats` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pViewFormats = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pViewFormats"));

    /// Creates `VkFramebufferAttachmentImageInfo` with the given segment.
    /// @param segment the memory segment
    public VkFramebufferAttachmentImageInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkFramebufferAttachmentImageInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFramebufferAttachmentImageInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkFramebufferAttachmentImageInfo(segment); }

    /// Creates `VkFramebufferAttachmentImageInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFramebufferAttachmentImageInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkFramebufferAttachmentImageInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkFramebufferAttachmentImageInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFramebufferAttachmentImageInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkFramebufferAttachmentImageInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkFramebufferAttachmentImageInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFramebufferAttachmentImageInfo`
    public static VkFramebufferAttachmentImageInfo alloc(SegmentAllocator allocator) { return new VkFramebufferAttachmentImageInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkFramebufferAttachmentImageInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkFramebufferAttachmentImageInfo`
    public static VkFramebufferAttachmentImageInfo alloc(SegmentAllocator allocator, long count) { return new VkFramebufferAttachmentImageInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkFramebufferAttachmentImageInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkFramebufferAttachmentImageInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkFramebufferAttachmentImageInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkFramebufferAttachmentImageInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentImageInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkFramebufferAttachmentImageInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentImageInfo sType(@CType("VkStructureType") int value) { VkFramebufferAttachmentImageInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkFramebufferAttachmentImageInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkFramebufferAttachmentImageInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkFramebufferAttachmentImageInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkFramebufferAttachmentImageInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentImageInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkFramebufferAttachmentImageInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentImageInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkFramebufferAttachmentImageInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkImageCreateFlags") int get_flags(MemorySegment segment) { return VkFramebufferAttachmentImageInfo.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkImageCreateFlags") int flagsAt(long index) { return VkFramebufferAttachmentImageInfo.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkImageCreateFlags") int flags() { return VkFramebufferAttachmentImageInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkImageCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkImageCreateFlags") int value) { VkFramebufferAttachmentImageInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentImageInfo flagsAt(long index, @CType("VkImageCreateFlags") int value) { VkFramebufferAttachmentImageInfo.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentImageInfo flags(@CType("VkImageCreateFlags") int value) { VkFramebufferAttachmentImageInfo.set_flags(this.segment(), value); return this; }

    /// {@return `usage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageUsageFlags") int get_usage(MemorySegment segment, long index) { return (int) VH_usage.get(segment, 0L, index); }
    /// {@return `usage`}
    /// @param segment the segment of the struct
    public static @CType("VkImageUsageFlags") int get_usage(MemorySegment segment) { return VkFramebufferAttachmentImageInfo.get_usage(segment, 0L); }
    /// {@return `usage` at the given index}
    /// @param index the index
    public @CType("VkImageUsageFlags") int usageAt(long index) { return VkFramebufferAttachmentImageInfo.get_usage(this.segment(), index); }
    /// {@return `usage`}
    public @CType("VkImageUsageFlags") int usage() { return VkFramebufferAttachmentImageInfo.get_usage(this.segment()); }
    /// Sets `usage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_usage(MemorySegment segment, long index, @CType("VkImageUsageFlags") int value) { VH_usage.set(segment, 0L, index, value); }
    /// Sets `usage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_usage(MemorySegment segment, @CType("VkImageUsageFlags") int value) { VkFramebufferAttachmentImageInfo.set_usage(segment, 0L, value); }
    /// Sets `usage` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentImageInfo usageAt(long index, @CType("VkImageUsageFlags") int value) { VkFramebufferAttachmentImageInfo.set_usage(this.segment(), index, value); return this; }
    /// Sets `usage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentImageInfo usage(@CType("VkImageUsageFlags") int value) { VkFramebufferAttachmentImageInfo.set_usage(this.segment(), value); return this; }

    /// {@return `width` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_width(MemorySegment segment, long index) { return (int) VH_width.get(segment, 0L, index); }
    /// {@return `width`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_width(MemorySegment segment) { return VkFramebufferAttachmentImageInfo.get_width(segment, 0L); }
    /// {@return `width` at the given index}
    /// @param index the index
    public @CType("uint32_t") int widthAt(long index) { return VkFramebufferAttachmentImageInfo.get_width(this.segment(), index); }
    /// {@return `width`}
    public @CType("uint32_t") int width() { return VkFramebufferAttachmentImageInfo.get_width(this.segment()); }
    /// Sets `width` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_width(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_width.set(segment, 0L, index, value); }
    /// Sets `width` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_width(MemorySegment segment, @CType("uint32_t") int value) { VkFramebufferAttachmentImageInfo.set_width(segment, 0L, value); }
    /// Sets `width` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentImageInfo widthAt(long index, @CType("uint32_t") int value) { VkFramebufferAttachmentImageInfo.set_width(this.segment(), index, value); return this; }
    /// Sets `width` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentImageInfo width(@CType("uint32_t") int value) { VkFramebufferAttachmentImageInfo.set_width(this.segment(), value); return this; }

    /// {@return `height` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_height(MemorySegment segment, long index) { return (int) VH_height.get(segment, 0L, index); }
    /// {@return `height`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_height(MemorySegment segment) { return VkFramebufferAttachmentImageInfo.get_height(segment, 0L); }
    /// {@return `height` at the given index}
    /// @param index the index
    public @CType("uint32_t") int heightAt(long index) { return VkFramebufferAttachmentImageInfo.get_height(this.segment(), index); }
    /// {@return `height`}
    public @CType("uint32_t") int height() { return VkFramebufferAttachmentImageInfo.get_height(this.segment()); }
    /// Sets `height` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_height(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_height.set(segment, 0L, index, value); }
    /// Sets `height` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_height(MemorySegment segment, @CType("uint32_t") int value) { VkFramebufferAttachmentImageInfo.set_height(segment, 0L, value); }
    /// Sets `height` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentImageInfo heightAt(long index, @CType("uint32_t") int value) { VkFramebufferAttachmentImageInfo.set_height(this.segment(), index, value); return this; }
    /// Sets `height` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentImageInfo height(@CType("uint32_t") int value) { VkFramebufferAttachmentImageInfo.set_height(this.segment(), value); return this; }

    /// {@return `layerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_layerCount(MemorySegment segment, long index) { return (int) VH_layerCount.get(segment, 0L, index); }
    /// {@return `layerCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_layerCount(MemorySegment segment) { return VkFramebufferAttachmentImageInfo.get_layerCount(segment, 0L); }
    /// {@return `layerCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int layerCountAt(long index) { return VkFramebufferAttachmentImageInfo.get_layerCount(this.segment(), index); }
    /// {@return `layerCount`}
    public @CType("uint32_t") int layerCount() { return VkFramebufferAttachmentImageInfo.get_layerCount(this.segment()); }
    /// Sets `layerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_layerCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_layerCount.set(segment, 0L, index, value); }
    /// Sets `layerCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_layerCount(MemorySegment segment, @CType("uint32_t") int value) { VkFramebufferAttachmentImageInfo.set_layerCount(segment, 0L, value); }
    /// Sets `layerCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentImageInfo layerCountAt(long index, @CType("uint32_t") int value) { VkFramebufferAttachmentImageInfo.set_layerCount(this.segment(), index, value); return this; }
    /// Sets `layerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentImageInfo layerCount(@CType("uint32_t") int value) { VkFramebufferAttachmentImageInfo.set_layerCount(this.segment(), value); return this; }

    /// {@return `viewFormatCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_viewFormatCount(MemorySegment segment, long index) { return (int) VH_viewFormatCount.get(segment, 0L, index); }
    /// {@return `viewFormatCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_viewFormatCount(MemorySegment segment) { return VkFramebufferAttachmentImageInfo.get_viewFormatCount(segment, 0L); }
    /// {@return `viewFormatCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int viewFormatCountAt(long index) { return VkFramebufferAttachmentImageInfo.get_viewFormatCount(this.segment(), index); }
    /// {@return `viewFormatCount`}
    public @CType("uint32_t") int viewFormatCount() { return VkFramebufferAttachmentImageInfo.get_viewFormatCount(this.segment()); }
    /// Sets `viewFormatCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_viewFormatCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_viewFormatCount.set(segment, 0L, index, value); }
    /// Sets `viewFormatCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_viewFormatCount(MemorySegment segment, @CType("uint32_t") int value) { VkFramebufferAttachmentImageInfo.set_viewFormatCount(segment, 0L, value); }
    /// Sets `viewFormatCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentImageInfo viewFormatCountAt(long index, @CType("uint32_t") int value) { VkFramebufferAttachmentImageInfo.set_viewFormatCount(this.segment(), index, value); return this; }
    /// Sets `viewFormatCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentImageInfo viewFormatCount(@CType("uint32_t") int value) { VkFramebufferAttachmentImageInfo.set_viewFormatCount(this.segment(), value); return this; }

    /// {@return `pViewFormats` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkFormat *") java.lang.foreign.MemorySegment get_pViewFormats(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pViewFormats.get(segment, 0L, index); }
    /// {@return `pViewFormats`}
    /// @param segment the segment of the struct
    public static @CType("const VkFormat *") java.lang.foreign.MemorySegment get_pViewFormats(MemorySegment segment) { return VkFramebufferAttachmentImageInfo.get_pViewFormats(segment, 0L); }
    /// {@return `pViewFormats` at the given index}
    /// @param index the index
    public @CType("const VkFormat *") java.lang.foreign.MemorySegment pViewFormatsAt(long index) { return VkFramebufferAttachmentImageInfo.get_pViewFormats(this.segment(), index); }
    /// {@return `pViewFormats`}
    public @CType("const VkFormat *") java.lang.foreign.MemorySegment pViewFormats() { return VkFramebufferAttachmentImageInfo.get_pViewFormats(this.segment()); }
    /// Sets `pViewFormats` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pViewFormats(MemorySegment segment, long index, @CType("const VkFormat *") java.lang.foreign.MemorySegment value) { VH_pViewFormats.set(segment, 0L, index, value); }
    /// Sets `pViewFormats` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pViewFormats(MemorySegment segment, @CType("const VkFormat *") java.lang.foreign.MemorySegment value) { VkFramebufferAttachmentImageInfo.set_pViewFormats(segment, 0L, value); }
    /// Sets `pViewFormats` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentImageInfo pViewFormatsAt(long index, @CType("const VkFormat *") java.lang.foreign.MemorySegment value) { VkFramebufferAttachmentImageInfo.set_pViewFormats(this.segment(), index, value); return this; }
    /// Sets `pViewFormats` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFramebufferAttachmentImageInfo pViewFormats(@CType("const VkFormat *") java.lang.foreign.MemorySegment value) { VkFramebufferAttachmentImageInfo.set_pViewFormats(this.segment(), value); return this; }

}

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
/// ### imageType
/// [VarHandle][#VH_imageType] - [Getter][#imageType()] - [Setter][#imageType(int)]
/// ### format
/// [VarHandle][#VH_format] - [Getter][#format()] - [Setter][#format(int)]
/// ### extent
/// [Byte offset][#OFFSET_extent] - [Memory layout][#ML_extent] - [Getter][#extent()] - [Setter][#extent(java.lang.foreign.MemorySegment)]
/// ### mipLevels
/// [VarHandle][#VH_mipLevels] - [Getter][#mipLevels()] - [Setter][#mipLevels(int)]
/// ### arrayLayers
/// [VarHandle][#VH_arrayLayers] - [Getter][#arrayLayers()] - [Setter][#arrayLayers(int)]
/// ### samples
/// [VarHandle][#VH_samples] - [Getter][#samples()] - [Setter][#samples(int)]
/// ### tiling
/// [VarHandle][#VH_tiling] - [Getter][#tiling()] - [Setter][#tiling(int)]
/// ### usage
/// [VarHandle][#VH_usage] - [Getter][#usage()] - [Setter][#usage(int)]
/// ### sharingMode
/// [VarHandle][#VH_sharingMode] - [Getter][#sharingMode()] - [Setter][#sharingMode(int)]
/// ### queueFamilyIndexCount
/// [VarHandle][#VH_queueFamilyIndexCount] - [Getter][#queueFamilyIndexCount()] - [Setter][#queueFamilyIndexCount(int)]
/// ### pQueueFamilyIndices
/// [VarHandle][#VH_pQueueFamilyIndices] - [Getter][#pQueueFamilyIndices()] - [Setter][#pQueueFamilyIndices(java.lang.foreign.MemorySegment)]
/// ### initialLayout
/// [VarHandle][#VH_initialLayout] - [Getter][#initialLayout()] - [Setter][#initialLayout(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImageCreateInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkImageCreateFlags flags;
///     VkImageType imageType;
///     VkFormat format;
///     VkExtent3D extent;
///     uint32_t mipLevels;
///     uint32_t arrayLayers;
///     VkSampleCountFlagBits samples;
///     VkImageTiling tiling;
///     VkImageUsageFlags usage;
///     VkSharingMode sharingMode;
///     uint32_t queueFamilyIndexCount;
///     const uint32_t * pQueueFamilyIndices;
///     VkImageLayout initialLayout;
/// } VkImageCreateInfo;
/// ```
public final class VkImageCreateInfo extends Struct {
    /// The struct layout of `VkImageCreateInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("imageType"),
        ValueLayout.JAVA_INT.withName("format"),
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("extent"),
        ValueLayout.JAVA_INT.withName("mipLevels"),
        ValueLayout.JAVA_INT.withName("arrayLayers"),
        ValueLayout.JAVA_INT.withName("samples"),
        ValueLayout.JAVA_INT.withName("tiling"),
        ValueLayout.JAVA_INT.withName("usage"),
        ValueLayout.JAVA_INT.withName("sharingMode"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndexCount"),
        ValueLayout.ADDRESS.withName("pQueueFamilyIndices"),
        ValueLayout.JAVA_INT.withName("initialLayout")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `imageType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_imageType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageType"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    /// The byte offset of `extent`.
    public static final long OFFSET_extent = LAYOUT.byteOffset(PathElement.groupElement("extent"));
    /// The memory layout of `extent`.
    public static final MemoryLayout ML_extent = LAYOUT.select(PathElement.groupElement("extent"));
    /// The [VarHandle] of `mipLevels` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_mipLevels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mipLevels"));
    /// The [VarHandle] of `arrayLayers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_arrayLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("arrayLayers"));
    /// The [VarHandle] of `samples` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samples"));
    /// The [VarHandle] of `tiling` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_tiling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tiling"));
    /// The [VarHandle] of `usage` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_usage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usage"));
    /// The [VarHandle] of `sharingMode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sharingMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sharingMode"));
    /// The [VarHandle] of `queueFamilyIndexCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_queueFamilyIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyIndexCount"));
    /// The [VarHandle] of `pQueueFamilyIndices` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pQueueFamilyIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pQueueFamilyIndices"));
    /// The [VarHandle] of `initialLayout` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_initialLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initialLayout"));

    /// Creates `VkImageCreateInfo` with the given segment.
    /// @param segment the memory segment
    public VkImageCreateInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImageCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageCreateInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageCreateInfo(segment); }

    /// Creates `VkImageCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageCreateInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImageCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImageCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageCreateInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkImageCreateInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkImageCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageCreateInfo`
    public static VkImageCreateInfo alloc(SegmentAllocator allocator) { return new VkImageCreateInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImageCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageCreateInfo`
    public static VkImageCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkImageCreateInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImageCreateInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkImageCreateInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImageCreateInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImageCreateInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkImageCreateInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo sType(@CType("VkStructureType") int value) { VkImageCreateInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkImageCreateInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkImageCreateInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkImageCreateInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImageCreateInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImageCreateInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkImageCreateInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageCreateFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkImageCreateFlags") int get_flags(MemorySegment segment) { return VkImageCreateInfo.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkImageCreateFlags") int flagsAt(long index) { return VkImageCreateInfo.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkImageCreateFlags") int flags() { return VkImageCreateInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkImageCreateFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkImageCreateFlags") int value) { VkImageCreateInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo flagsAt(long index, @CType("VkImageCreateFlags") int value) { VkImageCreateInfo.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo flags(@CType("VkImageCreateFlags") int value) { VkImageCreateInfo.set_flags(this.segment(), value); return this; }

    /// {@return `imageType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageType") int get_imageType(MemorySegment segment, long index) { return (int) VH_imageType.get(segment, 0L, index); }
    /// {@return `imageType`}
    /// @param segment the segment of the struct
    public static @CType("VkImageType") int get_imageType(MemorySegment segment) { return VkImageCreateInfo.get_imageType(segment, 0L); }
    /// {@return `imageType` at the given index}
    /// @param index the index
    public @CType("VkImageType") int imageTypeAt(long index) { return VkImageCreateInfo.get_imageType(this.segment(), index); }
    /// {@return `imageType`}
    public @CType("VkImageType") int imageType() { return VkImageCreateInfo.get_imageType(this.segment()); }
    /// Sets `imageType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_imageType(MemorySegment segment, long index, @CType("VkImageType") int value) { VH_imageType.set(segment, 0L, index, value); }
    /// Sets `imageType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_imageType(MemorySegment segment, @CType("VkImageType") int value) { VkImageCreateInfo.set_imageType(segment, 0L, value); }
    /// Sets `imageType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo imageTypeAt(long index, @CType("VkImageType") int value) { VkImageCreateInfo.set_imageType(this.segment(), index, value); return this; }
    /// Sets `imageType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo imageType(@CType("VkImageType") int value) { VkImageCreateInfo.set_imageType(this.segment(), value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_format(MemorySegment segment) { return VkImageCreateInfo.get_format(segment, 0L); }
    /// {@return `format` at the given index}
    /// @param index the index
    public @CType("VkFormat") int formatAt(long index) { return VkImageCreateInfo.get_format(this.segment(), index); }
    /// {@return `format`}
    public @CType("VkFormat") int format() { return VkImageCreateInfo.get_format(this.segment()); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_format(MemorySegment segment, long index, @CType("VkFormat") int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_format(MemorySegment segment, @CType("VkFormat") int value) { VkImageCreateInfo.set_format(segment, 0L, value); }
    /// Sets `format` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo formatAt(long index, @CType("VkFormat") int value) { VkImageCreateInfo.set_format(this.segment(), index, value); return this; }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo format(@CType("VkFormat") int value) { VkImageCreateInfo.set_format(this.segment(), value); return this; }

    /// {@return `extent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent3D") java.lang.foreign.MemorySegment get_extent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_extent, index), ML_extent); }
    /// {@return `extent`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent3D") java.lang.foreign.MemorySegment get_extent(MemorySegment segment) { return VkImageCreateInfo.get_extent(segment, 0L); }
    /// {@return `extent` at the given index}
    /// @param index the index
    public @CType("VkExtent3D") java.lang.foreign.MemorySegment extentAt(long index) { return VkImageCreateInfo.get_extent(this.segment(), index); }
    /// {@return `extent`}
    public @CType("VkExtent3D") java.lang.foreign.MemorySegment extent() { return VkImageCreateInfo.get_extent(this.segment()); }
    /// Sets `extent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_extent(MemorySegment segment, long index, @CType("VkExtent3D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_extent, index), ML_extent.byteSize()); }
    /// Sets `extent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_extent(MemorySegment segment, @CType("VkExtent3D") java.lang.foreign.MemorySegment value) { VkImageCreateInfo.set_extent(segment, 0L, value); }
    /// Sets `extent` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo extentAt(long index, @CType("VkExtent3D") java.lang.foreign.MemorySegment value) { VkImageCreateInfo.set_extent(this.segment(), index, value); return this; }
    /// Sets `extent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo extent(@CType("VkExtent3D") java.lang.foreign.MemorySegment value) { VkImageCreateInfo.set_extent(this.segment(), value); return this; }

    /// {@return `mipLevels` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_mipLevels(MemorySegment segment, long index) { return (int) VH_mipLevels.get(segment, 0L, index); }
    /// {@return `mipLevels`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_mipLevels(MemorySegment segment) { return VkImageCreateInfo.get_mipLevels(segment, 0L); }
    /// {@return `mipLevels` at the given index}
    /// @param index the index
    public @CType("uint32_t") int mipLevelsAt(long index) { return VkImageCreateInfo.get_mipLevels(this.segment(), index); }
    /// {@return `mipLevels`}
    public @CType("uint32_t") int mipLevels() { return VkImageCreateInfo.get_mipLevels(this.segment()); }
    /// Sets `mipLevels` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mipLevels(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_mipLevels.set(segment, 0L, index, value); }
    /// Sets `mipLevels` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mipLevels(MemorySegment segment, @CType("uint32_t") int value) { VkImageCreateInfo.set_mipLevels(segment, 0L, value); }
    /// Sets `mipLevels` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo mipLevelsAt(long index, @CType("uint32_t") int value) { VkImageCreateInfo.set_mipLevels(this.segment(), index, value); return this; }
    /// Sets `mipLevels` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo mipLevels(@CType("uint32_t") int value) { VkImageCreateInfo.set_mipLevels(this.segment(), value); return this; }

    /// {@return `arrayLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_arrayLayers(MemorySegment segment, long index) { return (int) VH_arrayLayers.get(segment, 0L, index); }
    /// {@return `arrayLayers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_arrayLayers(MemorySegment segment) { return VkImageCreateInfo.get_arrayLayers(segment, 0L); }
    /// {@return `arrayLayers` at the given index}
    /// @param index the index
    public @CType("uint32_t") int arrayLayersAt(long index) { return VkImageCreateInfo.get_arrayLayers(this.segment(), index); }
    /// {@return `arrayLayers`}
    public @CType("uint32_t") int arrayLayers() { return VkImageCreateInfo.get_arrayLayers(this.segment()); }
    /// Sets `arrayLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_arrayLayers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_arrayLayers.set(segment, 0L, index, value); }
    /// Sets `arrayLayers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_arrayLayers(MemorySegment segment, @CType("uint32_t") int value) { VkImageCreateInfo.set_arrayLayers(segment, 0L, value); }
    /// Sets `arrayLayers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo arrayLayersAt(long index, @CType("uint32_t") int value) { VkImageCreateInfo.set_arrayLayers(this.segment(), index, value); return this; }
    /// Sets `arrayLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo arrayLayers(@CType("uint32_t") int value) { VkImageCreateInfo.set_arrayLayers(this.segment(), value); return this; }

    /// {@return `samples` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampleCountFlagBits") int get_samples(MemorySegment segment, long index) { return (int) VH_samples.get(segment, 0L, index); }
    /// {@return `samples`}
    /// @param segment the segment of the struct
    public static @CType("VkSampleCountFlagBits") int get_samples(MemorySegment segment) { return VkImageCreateInfo.get_samples(segment, 0L); }
    /// {@return `samples` at the given index}
    /// @param index the index
    public @CType("VkSampleCountFlagBits") int samplesAt(long index) { return VkImageCreateInfo.get_samples(this.segment(), index); }
    /// {@return `samples`}
    public @CType("VkSampleCountFlagBits") int samples() { return VkImageCreateInfo.get_samples(this.segment()); }
    /// Sets `samples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_samples(MemorySegment segment, long index, @CType("VkSampleCountFlagBits") int value) { VH_samples.set(segment, 0L, index, value); }
    /// Sets `samples` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_samples(MemorySegment segment, @CType("VkSampleCountFlagBits") int value) { VkImageCreateInfo.set_samples(segment, 0L, value); }
    /// Sets `samples` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo samplesAt(long index, @CType("VkSampleCountFlagBits") int value) { VkImageCreateInfo.set_samples(this.segment(), index, value); return this; }
    /// Sets `samples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo samples(@CType("VkSampleCountFlagBits") int value) { VkImageCreateInfo.set_samples(this.segment(), value); return this; }

    /// {@return `tiling` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageTiling") int get_tiling(MemorySegment segment, long index) { return (int) VH_tiling.get(segment, 0L, index); }
    /// {@return `tiling`}
    /// @param segment the segment of the struct
    public static @CType("VkImageTiling") int get_tiling(MemorySegment segment) { return VkImageCreateInfo.get_tiling(segment, 0L); }
    /// {@return `tiling` at the given index}
    /// @param index the index
    public @CType("VkImageTiling") int tilingAt(long index) { return VkImageCreateInfo.get_tiling(this.segment(), index); }
    /// {@return `tiling`}
    public @CType("VkImageTiling") int tiling() { return VkImageCreateInfo.get_tiling(this.segment()); }
    /// Sets `tiling` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_tiling(MemorySegment segment, long index, @CType("VkImageTiling") int value) { VH_tiling.set(segment, 0L, index, value); }
    /// Sets `tiling` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_tiling(MemorySegment segment, @CType("VkImageTiling") int value) { VkImageCreateInfo.set_tiling(segment, 0L, value); }
    /// Sets `tiling` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo tilingAt(long index, @CType("VkImageTiling") int value) { VkImageCreateInfo.set_tiling(this.segment(), index, value); return this; }
    /// Sets `tiling` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo tiling(@CType("VkImageTiling") int value) { VkImageCreateInfo.set_tiling(this.segment(), value); return this; }

    /// {@return `usage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageUsageFlags") int get_usage(MemorySegment segment, long index) { return (int) VH_usage.get(segment, 0L, index); }
    /// {@return `usage`}
    /// @param segment the segment of the struct
    public static @CType("VkImageUsageFlags") int get_usage(MemorySegment segment) { return VkImageCreateInfo.get_usage(segment, 0L); }
    /// {@return `usage` at the given index}
    /// @param index the index
    public @CType("VkImageUsageFlags") int usageAt(long index) { return VkImageCreateInfo.get_usage(this.segment(), index); }
    /// {@return `usage`}
    public @CType("VkImageUsageFlags") int usage() { return VkImageCreateInfo.get_usage(this.segment()); }
    /// Sets `usage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_usage(MemorySegment segment, long index, @CType("VkImageUsageFlags") int value) { VH_usage.set(segment, 0L, index, value); }
    /// Sets `usage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_usage(MemorySegment segment, @CType("VkImageUsageFlags") int value) { VkImageCreateInfo.set_usage(segment, 0L, value); }
    /// Sets `usage` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo usageAt(long index, @CType("VkImageUsageFlags") int value) { VkImageCreateInfo.set_usage(this.segment(), index, value); return this; }
    /// Sets `usage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo usage(@CType("VkImageUsageFlags") int value) { VkImageCreateInfo.set_usage(this.segment(), value); return this; }

    /// {@return `sharingMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSharingMode") int get_sharingMode(MemorySegment segment, long index) { return (int) VH_sharingMode.get(segment, 0L, index); }
    /// {@return `sharingMode`}
    /// @param segment the segment of the struct
    public static @CType("VkSharingMode") int get_sharingMode(MemorySegment segment) { return VkImageCreateInfo.get_sharingMode(segment, 0L); }
    /// {@return `sharingMode` at the given index}
    /// @param index the index
    public @CType("VkSharingMode") int sharingModeAt(long index) { return VkImageCreateInfo.get_sharingMode(this.segment(), index); }
    /// {@return `sharingMode`}
    public @CType("VkSharingMode") int sharingMode() { return VkImageCreateInfo.get_sharingMode(this.segment()); }
    /// Sets `sharingMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sharingMode(MemorySegment segment, long index, @CType("VkSharingMode") int value) { VH_sharingMode.set(segment, 0L, index, value); }
    /// Sets `sharingMode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sharingMode(MemorySegment segment, @CType("VkSharingMode") int value) { VkImageCreateInfo.set_sharingMode(segment, 0L, value); }
    /// Sets `sharingMode` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo sharingModeAt(long index, @CType("VkSharingMode") int value) { VkImageCreateInfo.set_sharingMode(this.segment(), index, value); return this; }
    /// Sets `sharingMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo sharingMode(@CType("VkSharingMode") int value) { VkImageCreateInfo.set_sharingMode(this.segment(), value); return this; }

    /// {@return `queueFamilyIndexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_queueFamilyIndexCount(MemorySegment segment, long index) { return (int) VH_queueFamilyIndexCount.get(segment, 0L, index); }
    /// {@return `queueFamilyIndexCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_queueFamilyIndexCount(MemorySegment segment) { return VkImageCreateInfo.get_queueFamilyIndexCount(segment, 0L); }
    /// {@return `queueFamilyIndexCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int queueFamilyIndexCountAt(long index) { return VkImageCreateInfo.get_queueFamilyIndexCount(this.segment(), index); }
    /// {@return `queueFamilyIndexCount`}
    public @CType("uint32_t") int queueFamilyIndexCount() { return VkImageCreateInfo.get_queueFamilyIndexCount(this.segment()); }
    /// Sets `queueFamilyIndexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_queueFamilyIndexCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_queueFamilyIndexCount.set(segment, 0L, index, value); }
    /// Sets `queueFamilyIndexCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_queueFamilyIndexCount(MemorySegment segment, @CType("uint32_t") int value) { VkImageCreateInfo.set_queueFamilyIndexCount(segment, 0L, value); }
    /// Sets `queueFamilyIndexCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo queueFamilyIndexCountAt(long index, @CType("uint32_t") int value) { VkImageCreateInfo.set_queueFamilyIndexCount(this.segment(), index, value); return this; }
    /// Sets `queueFamilyIndexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo queueFamilyIndexCount(@CType("uint32_t") int value) { VkImageCreateInfo.set_queueFamilyIndexCount(this.segment(), value); return this; }

    /// {@return `pQueueFamilyIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pQueueFamilyIndices(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pQueueFamilyIndices.get(segment, 0L, index); }
    /// {@return `pQueueFamilyIndices`}
    /// @param segment the segment of the struct
    public static @CType("const uint32_t *") java.lang.foreign.MemorySegment get_pQueueFamilyIndices(MemorySegment segment) { return VkImageCreateInfo.get_pQueueFamilyIndices(segment, 0L); }
    /// {@return `pQueueFamilyIndices` at the given index}
    /// @param index the index
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pQueueFamilyIndicesAt(long index) { return VkImageCreateInfo.get_pQueueFamilyIndices(this.segment(), index); }
    /// {@return `pQueueFamilyIndices`}
    public @CType("const uint32_t *") java.lang.foreign.MemorySegment pQueueFamilyIndices() { return VkImageCreateInfo.get_pQueueFamilyIndices(this.segment()); }
    /// Sets `pQueueFamilyIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pQueueFamilyIndices(MemorySegment segment, long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VH_pQueueFamilyIndices.set(segment, 0L, index, value); }
    /// Sets `pQueueFamilyIndices` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pQueueFamilyIndices(MemorySegment segment, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkImageCreateInfo.set_pQueueFamilyIndices(segment, 0L, value); }
    /// Sets `pQueueFamilyIndices` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo pQueueFamilyIndicesAt(long index, @CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkImageCreateInfo.set_pQueueFamilyIndices(this.segment(), index, value); return this; }
    /// Sets `pQueueFamilyIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo pQueueFamilyIndices(@CType("const uint32_t *") java.lang.foreign.MemorySegment value) { VkImageCreateInfo.set_pQueueFamilyIndices(this.segment(), value); return this; }

    /// {@return `initialLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageLayout") int get_initialLayout(MemorySegment segment, long index) { return (int) VH_initialLayout.get(segment, 0L, index); }
    /// {@return `initialLayout`}
    /// @param segment the segment of the struct
    public static @CType("VkImageLayout") int get_initialLayout(MemorySegment segment) { return VkImageCreateInfo.get_initialLayout(segment, 0L); }
    /// {@return `initialLayout` at the given index}
    /// @param index the index
    public @CType("VkImageLayout") int initialLayoutAt(long index) { return VkImageCreateInfo.get_initialLayout(this.segment(), index); }
    /// {@return `initialLayout`}
    public @CType("VkImageLayout") int initialLayout() { return VkImageCreateInfo.get_initialLayout(this.segment()); }
    /// Sets `initialLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_initialLayout(MemorySegment segment, long index, @CType("VkImageLayout") int value) { VH_initialLayout.set(segment, 0L, index, value); }
    /// Sets `initialLayout` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_initialLayout(MemorySegment segment, @CType("VkImageLayout") int value) { VkImageCreateInfo.set_initialLayout(segment, 0L, value); }
    /// Sets `initialLayout` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo initialLayoutAt(long index, @CType("VkImageLayout") int value) { VkImageCreateInfo.set_initialLayout(this.segment(), index, value); return this; }
    /// Sets `initialLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo initialLayout(@CType("VkImageLayout") int value) { VkImageCreateInfo.set_initialLayout(this.segment(), value); return this; }

}

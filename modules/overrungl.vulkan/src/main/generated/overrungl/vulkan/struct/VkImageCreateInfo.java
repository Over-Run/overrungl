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
//@formatter:off
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkImageCreateInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     ((uint32_t) VkFlags) VkImageCreateFlags flags;
///     (int) VkImageType imageType;
///     (int) VkFormat format;
///     (struct VkExtent3D) VkExtent3D extent;
///     uint32_t mipLevels;
///     uint32_t arrayLayers;
///     (int) VkSampleCountFlagBits samples;
///     (int) VkImageTiling tiling;
///     ((uint32_t) VkFlags) VkImageUsageFlags usage;
///     (int) VkSharingMode sharingMode;
///     uint32_t queueFamilyIndexCount;
///     const uint32_t* pQueueFamilyIndices;
///     (int) VkImageLayout initialLayout;
/// };
/// ```
public final class VkImageCreateInfo extends GroupType {
    /// The struct layout of `VkImageCreateInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
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
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `imageType`.
    public static final long OFFSET_imageType = LAYOUT.byteOffset(PathElement.groupElement("imageType"));
    /// The memory layout of `imageType`.
    public static final MemoryLayout LAYOUT_imageType = LAYOUT.select(PathElement.groupElement("imageType"));
    /// The [VarHandle] of `imageType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageType"));
    /// The byte offset of `format`.
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    /// The memory layout of `format`.
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    /// The byte offset of `extent`.
    public static final long OFFSET_extent = LAYOUT.byteOffset(PathElement.groupElement("extent"));
    /// The memory layout of `extent`.
    public static final MemoryLayout LAYOUT_extent = LAYOUT.select(PathElement.groupElement("extent"));
    /// The byte offset of `mipLevels`.
    public static final long OFFSET_mipLevels = LAYOUT.byteOffset(PathElement.groupElement("mipLevels"));
    /// The memory layout of `mipLevels`.
    public static final MemoryLayout LAYOUT_mipLevels = LAYOUT.select(PathElement.groupElement("mipLevels"));
    /// The [VarHandle] of `mipLevels` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_mipLevels = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mipLevels"));
    /// The byte offset of `arrayLayers`.
    public static final long OFFSET_arrayLayers = LAYOUT.byteOffset(PathElement.groupElement("arrayLayers"));
    /// The memory layout of `arrayLayers`.
    public static final MemoryLayout LAYOUT_arrayLayers = LAYOUT.select(PathElement.groupElement("arrayLayers"));
    /// The [VarHandle] of `arrayLayers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_arrayLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("arrayLayers"));
    /// The byte offset of `samples`.
    public static final long OFFSET_samples = LAYOUT.byteOffset(PathElement.groupElement("samples"));
    /// The memory layout of `samples`.
    public static final MemoryLayout LAYOUT_samples = LAYOUT.select(PathElement.groupElement("samples"));
    /// The [VarHandle] of `samples` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_samples = LAYOUT.arrayElementVarHandle(PathElement.groupElement("samples"));
    /// The byte offset of `tiling`.
    public static final long OFFSET_tiling = LAYOUT.byteOffset(PathElement.groupElement("tiling"));
    /// The memory layout of `tiling`.
    public static final MemoryLayout LAYOUT_tiling = LAYOUT.select(PathElement.groupElement("tiling"));
    /// The [VarHandle] of `tiling` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tiling = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tiling"));
    /// The byte offset of `usage`.
    public static final long OFFSET_usage = LAYOUT.byteOffset(PathElement.groupElement("usage"));
    /// The memory layout of `usage`.
    public static final MemoryLayout LAYOUT_usage = LAYOUT.select(PathElement.groupElement("usage"));
    /// The [VarHandle] of `usage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_usage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("usage"));
    /// The byte offset of `sharingMode`.
    public static final long OFFSET_sharingMode = LAYOUT.byteOffset(PathElement.groupElement("sharingMode"));
    /// The memory layout of `sharingMode`.
    public static final MemoryLayout LAYOUT_sharingMode = LAYOUT.select(PathElement.groupElement("sharingMode"));
    /// The [VarHandle] of `sharingMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sharingMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sharingMode"));
    /// The byte offset of `queueFamilyIndexCount`.
    public static final long OFFSET_queueFamilyIndexCount = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyIndexCount"));
    /// The memory layout of `queueFamilyIndexCount`.
    public static final MemoryLayout LAYOUT_queueFamilyIndexCount = LAYOUT.select(PathElement.groupElement("queueFamilyIndexCount"));
    /// The [VarHandle] of `queueFamilyIndexCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_queueFamilyIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("queueFamilyIndexCount"));
    /// The byte offset of `pQueueFamilyIndices`.
    public static final long OFFSET_pQueueFamilyIndices = LAYOUT.byteOffset(PathElement.groupElement("pQueueFamilyIndices"));
    /// The memory layout of `pQueueFamilyIndices`.
    public static final MemoryLayout LAYOUT_pQueueFamilyIndices = LAYOUT.select(PathElement.groupElement("pQueueFamilyIndices"));
    /// The [VarHandle] of `pQueueFamilyIndices` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pQueueFamilyIndices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pQueueFamilyIndices"));
    /// The byte offset of `initialLayout`.
    public static final long OFFSET_initialLayout = LAYOUT.byteOffset(PathElement.groupElement("initialLayout"));
    /// The memory layout of `initialLayout`.
    public static final MemoryLayout LAYOUT_initialLayout = LAYOUT.select(PathElement.groupElement("initialLayout"));
    /// The [VarHandle] of `initialLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_initialLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initialLayout"));

    /// Creates `VkImageCreateInfo` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkImageCreateInfo(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkImageCreateInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageCreateInfo of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageCreateInfo(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageCreateInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageCreateInfo(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkImageCreateInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageCreateInfo ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageCreateInfo(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImageCreateInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageCreateInfo`
    public static VkImageCreateInfo alloc(SegmentAllocator allocator) { return new VkImageCreateInfo(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkImageCreateInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageCreateInfo`
    public static VkImageCreateInfo alloc(SegmentAllocator allocator, long count) { return new VkImageCreateInfo(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImageCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param imageType `imageType`
    /// @param format `format`
    /// @param extent `extent`
    /// @param mipLevels `mipLevels`
    /// @param arrayLayers `arrayLayers`
    /// @param samples `samples`
    /// @param tiling `tiling`
    /// @param usage `usage`
    /// @param sharingMode `sharingMode`
    /// @param queueFamilyIndexCount `queueFamilyIndexCount`
    /// @param pQueueFamilyIndices `pQueueFamilyIndices`
    /// @param initialLayout `initialLayout`
    /// @return the allocated `VkImageCreateInfo`
    public static VkImageCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int imageType, int format, MemorySegment extent, int mipLevels, int arrayLayers, int samples, int tiling, int usage, int sharingMode, int queueFamilyIndexCount, MemorySegment pQueueFamilyIndices, int initialLayout) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).imageType(imageType).format(format).extent(extent).mipLevels(mipLevels).arrayLayers(arrayLayers).samples(samples).tiling(tiling).usage(usage).sharingMode(sharingMode).queueFamilyIndexCount(queueFamilyIndexCount).pQueueFamilyIndices(pQueueFamilyIndices).initialLayout(initialLayout);
    }

    /// Allocates a `VkImageCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param imageType `imageType`
    /// @param format `format`
    /// @param extent `extent`
    /// @param mipLevels `mipLevels`
    /// @param arrayLayers `arrayLayers`
    /// @param samples `samples`
    /// @param tiling `tiling`
    /// @param usage `usage`
    /// @param sharingMode `sharingMode`
    /// @param queueFamilyIndexCount `queueFamilyIndexCount`
    /// @param pQueueFamilyIndices `pQueueFamilyIndices`
    /// @return the allocated `VkImageCreateInfo`
    public static VkImageCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int imageType, int format, MemorySegment extent, int mipLevels, int arrayLayers, int samples, int tiling, int usage, int sharingMode, int queueFamilyIndexCount, MemorySegment pQueueFamilyIndices) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).imageType(imageType).format(format).extent(extent).mipLevels(mipLevels).arrayLayers(arrayLayers).samples(samples).tiling(tiling).usage(usage).sharingMode(sharingMode).queueFamilyIndexCount(queueFamilyIndexCount).pQueueFamilyIndices(pQueueFamilyIndices);
    }

    /// Allocates a `VkImageCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param imageType `imageType`
    /// @param format `format`
    /// @param extent `extent`
    /// @param mipLevels `mipLevels`
    /// @param arrayLayers `arrayLayers`
    /// @param samples `samples`
    /// @param tiling `tiling`
    /// @param usage `usage`
    /// @param sharingMode `sharingMode`
    /// @param queueFamilyIndexCount `queueFamilyIndexCount`
    /// @return the allocated `VkImageCreateInfo`
    public static VkImageCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int imageType, int format, MemorySegment extent, int mipLevels, int arrayLayers, int samples, int tiling, int usage, int sharingMode, int queueFamilyIndexCount) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).imageType(imageType).format(format).extent(extent).mipLevels(mipLevels).arrayLayers(arrayLayers).samples(samples).tiling(tiling).usage(usage).sharingMode(sharingMode).queueFamilyIndexCount(queueFamilyIndexCount);
    }

    /// Allocates a `VkImageCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param imageType `imageType`
    /// @param format `format`
    /// @param extent `extent`
    /// @param mipLevels `mipLevels`
    /// @param arrayLayers `arrayLayers`
    /// @param samples `samples`
    /// @param tiling `tiling`
    /// @param usage `usage`
    /// @param sharingMode `sharingMode`
    /// @return the allocated `VkImageCreateInfo`
    public static VkImageCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int imageType, int format, MemorySegment extent, int mipLevels, int arrayLayers, int samples, int tiling, int usage, int sharingMode) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).imageType(imageType).format(format).extent(extent).mipLevels(mipLevels).arrayLayers(arrayLayers).samples(samples).tiling(tiling).usage(usage).sharingMode(sharingMode);
    }

    /// Allocates a `VkImageCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param imageType `imageType`
    /// @param format `format`
    /// @param extent `extent`
    /// @param mipLevels `mipLevels`
    /// @param arrayLayers `arrayLayers`
    /// @param samples `samples`
    /// @param tiling `tiling`
    /// @param usage `usage`
    /// @return the allocated `VkImageCreateInfo`
    public static VkImageCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int imageType, int format, MemorySegment extent, int mipLevels, int arrayLayers, int samples, int tiling, int usage) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).imageType(imageType).format(format).extent(extent).mipLevels(mipLevels).arrayLayers(arrayLayers).samples(samples).tiling(tiling).usage(usage);
    }

    /// Allocates a `VkImageCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param imageType `imageType`
    /// @param format `format`
    /// @param extent `extent`
    /// @param mipLevels `mipLevels`
    /// @param arrayLayers `arrayLayers`
    /// @param samples `samples`
    /// @param tiling `tiling`
    /// @return the allocated `VkImageCreateInfo`
    public static VkImageCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int imageType, int format, MemorySegment extent, int mipLevels, int arrayLayers, int samples, int tiling) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).imageType(imageType).format(format).extent(extent).mipLevels(mipLevels).arrayLayers(arrayLayers).samples(samples).tiling(tiling);
    }

    /// Allocates a `VkImageCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param imageType `imageType`
    /// @param format `format`
    /// @param extent `extent`
    /// @param mipLevels `mipLevels`
    /// @param arrayLayers `arrayLayers`
    /// @param samples `samples`
    /// @return the allocated `VkImageCreateInfo`
    public static VkImageCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int imageType, int format, MemorySegment extent, int mipLevels, int arrayLayers, int samples) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).imageType(imageType).format(format).extent(extent).mipLevels(mipLevels).arrayLayers(arrayLayers).samples(samples);
    }

    /// Allocates a `VkImageCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param imageType `imageType`
    /// @param format `format`
    /// @param extent `extent`
    /// @param mipLevels `mipLevels`
    /// @param arrayLayers `arrayLayers`
    /// @return the allocated `VkImageCreateInfo`
    public static VkImageCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int imageType, int format, MemorySegment extent, int mipLevels, int arrayLayers) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).imageType(imageType).format(format).extent(extent).mipLevels(mipLevels).arrayLayers(arrayLayers);
    }

    /// Allocates a `VkImageCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param imageType `imageType`
    /// @param format `format`
    /// @param extent `extent`
    /// @param mipLevels `mipLevels`
    /// @return the allocated `VkImageCreateInfo`
    public static VkImageCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int imageType, int format, MemorySegment extent, int mipLevels) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).imageType(imageType).format(format).extent(extent).mipLevels(mipLevels);
    }

    /// Allocates a `VkImageCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param imageType `imageType`
    /// @param format `format`
    /// @param extent `extent`
    /// @return the allocated `VkImageCreateInfo`
    public static VkImageCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int imageType, int format, MemorySegment extent) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).imageType(imageType).format(format).extent(extent);
    }

    /// Allocates a `VkImageCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param imageType `imageType`
    /// @param format `format`
    /// @return the allocated `VkImageCreateInfo`
    public static VkImageCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int imageType, int format) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).imageType(imageType).format(format);
    }

    /// Allocates a `VkImageCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @param imageType `imageType`
    /// @return the allocated `VkImageCreateInfo`
    public static VkImageCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags, int imageType) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags).imageType(imageType);
    }

    /// Allocates a `VkImageCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param flags `flags`
    /// @return the allocated `VkImageCreateInfo`
    public static VkImageCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int flags) {
        return alloc(allocator).sType(sType).pNext(pNext).flags(flags);
    }

    /// Allocates a `VkImageCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkImageCreateInfo`
    public static VkImageCreateInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkImageCreateInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkImageCreateInfo`
    public static VkImageCreateInfo allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageCreateInfo copyFrom(VkImageCreateInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkImageCreateInfo reinterpret(long count) { return new VkImageCreateInfo(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `imageType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageType(MemorySegment segment, long index) { return (int) VH_imageType.get(segment, 0L, index); }
    /// {@return `imageType`}
    public int imageType() { return imageType(this.segment(), 0L); }
    /// Sets `imageType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageType(MemorySegment segment, long index, int value) { VH_imageType.set(segment, 0L, index, value); }
    /// Sets `imageType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo imageType(int value) { imageType(this.segment(), 0L, value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    public int format() { return format(this.segment(), 0L); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void format(MemorySegment segment, long index, int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo format(int value) { format(this.segment(), 0L, value); return this; }

    /// {@return `extent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment extent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_extent, index), LAYOUT_extent); }
    /// {@return `extent`}
    public MemorySegment extent() { return extent(this.segment(), 0L); }
    /// Sets `extent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void extent(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_extent, index), LAYOUT_extent.byteSize()); }
    /// Sets `extent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo extent(MemorySegment value) { extent(this.segment(), 0L, value); return this; }
    /// Accepts `extent` with the given function.
    /// @param func the function
    /// @return `this`
    public VkImageCreateInfo extent(Consumer<overrungl.vulkan.struct.VkExtent3D> func) { func.accept(overrungl.vulkan.struct.VkExtent3D.of(extent())); return this; }

    /// {@return `mipLevels` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int mipLevels(MemorySegment segment, long index) { return (int) VH_mipLevels.get(segment, 0L, index); }
    /// {@return `mipLevels`}
    public int mipLevels() { return mipLevels(this.segment(), 0L); }
    /// Sets `mipLevels` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void mipLevels(MemorySegment segment, long index, int value) { VH_mipLevels.set(segment, 0L, index, value); }
    /// Sets `mipLevels` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo mipLevels(int value) { mipLevels(this.segment(), 0L, value); return this; }

    /// {@return `arrayLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int arrayLayers(MemorySegment segment, long index) { return (int) VH_arrayLayers.get(segment, 0L, index); }
    /// {@return `arrayLayers`}
    public int arrayLayers() { return arrayLayers(this.segment(), 0L); }
    /// Sets `arrayLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void arrayLayers(MemorySegment segment, long index, int value) { VH_arrayLayers.set(segment, 0L, index, value); }
    /// Sets `arrayLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo arrayLayers(int value) { arrayLayers(this.segment(), 0L, value); return this; }

    /// {@return `samples` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int samples(MemorySegment segment, long index) { return (int) VH_samples.get(segment, 0L, index); }
    /// {@return `samples`}
    public int samples() { return samples(this.segment(), 0L); }
    /// Sets `samples` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void samples(MemorySegment segment, long index, int value) { VH_samples.set(segment, 0L, index, value); }
    /// Sets `samples` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo samples(int value) { samples(this.segment(), 0L, value); return this; }

    /// {@return `tiling` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tiling(MemorySegment segment, long index) { return (int) VH_tiling.get(segment, 0L, index); }
    /// {@return `tiling`}
    public int tiling() { return tiling(this.segment(), 0L); }
    /// Sets `tiling` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tiling(MemorySegment segment, long index, int value) { VH_tiling.set(segment, 0L, index, value); }
    /// Sets `tiling` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo tiling(int value) { tiling(this.segment(), 0L, value); return this; }

    /// {@return `usage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int usage(MemorySegment segment, long index) { return (int) VH_usage.get(segment, 0L, index); }
    /// {@return `usage`}
    public int usage() { return usage(this.segment(), 0L); }
    /// Sets `usage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void usage(MemorySegment segment, long index, int value) { VH_usage.set(segment, 0L, index, value); }
    /// Sets `usage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo usage(int value) { usage(this.segment(), 0L, value); return this; }

    /// {@return `sharingMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sharingMode(MemorySegment segment, long index) { return (int) VH_sharingMode.get(segment, 0L, index); }
    /// {@return `sharingMode`}
    public int sharingMode() { return sharingMode(this.segment(), 0L); }
    /// Sets `sharingMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sharingMode(MemorySegment segment, long index, int value) { VH_sharingMode.set(segment, 0L, index, value); }
    /// Sets `sharingMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo sharingMode(int value) { sharingMode(this.segment(), 0L, value); return this; }

    /// {@return `queueFamilyIndexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int queueFamilyIndexCount(MemorySegment segment, long index) { return (int) VH_queueFamilyIndexCount.get(segment, 0L, index); }
    /// {@return `queueFamilyIndexCount`}
    public int queueFamilyIndexCount() { return queueFamilyIndexCount(this.segment(), 0L); }
    /// Sets `queueFamilyIndexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void queueFamilyIndexCount(MemorySegment segment, long index, int value) { VH_queueFamilyIndexCount.set(segment, 0L, index, value); }
    /// Sets `queueFamilyIndexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo queueFamilyIndexCount(int value) { queueFamilyIndexCount(this.segment(), 0L, value); return this; }

    /// {@return `pQueueFamilyIndices` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pQueueFamilyIndices(MemorySegment segment, long index) { return (MemorySegment) VH_pQueueFamilyIndices.get(segment, 0L, index); }
    /// {@return `pQueueFamilyIndices`}
    public MemorySegment pQueueFamilyIndices() { return pQueueFamilyIndices(this.segment(), 0L); }
    /// Sets `pQueueFamilyIndices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pQueueFamilyIndices(MemorySegment segment, long index, MemorySegment value) { VH_pQueueFamilyIndices.set(segment, 0L, index, value); }
    /// Sets `pQueueFamilyIndices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo pQueueFamilyIndices(MemorySegment value) { pQueueFamilyIndices(this.segment(), 0L, value); return this; }

    /// {@return `initialLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int initialLayout(MemorySegment segment, long index) { return (int) VH_initialLayout.get(segment, 0L, index); }
    /// {@return `initialLayout`}
    public int initialLayout() { return initialLayout(this.segment(), 0L); }
    /// Sets `initialLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void initialLayout(MemorySegment segment, long index, int value) { VH_initialLayout.set(segment, 0L, index, value); }
    /// Sets `initialLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo initialLayout(int value) { initialLayout(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkImageCreateInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImageCreateInfo`
    public VkImageCreateInfo asSlice(long index) { return new VkImageCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkImageCreateInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImageCreateInfo`
    public VkImageCreateInfo asSlice(long index, long count) { return new VkImageCreateInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkImageCreateInfo` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkImageCreateInfo at(long index, Consumer<VkImageCreateInfo> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `flags` at the given index}
    /// @param index the index of the struct buffer
    public int flagsAt(long index) { return flags(this.segment(), index); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

    /// {@return `imageType` at the given index}
    /// @param index the index of the struct buffer
    public int imageTypeAt(long index) { return imageType(this.segment(), index); }
    /// Sets `imageType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo imageTypeAt(long index, int value) { imageType(this.segment(), index, value); return this; }

    /// {@return `format` at the given index}
    /// @param index the index of the struct buffer
    public int formatAt(long index) { return format(this.segment(), index); }
    /// Sets `format` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo formatAt(long index, int value) { format(this.segment(), index, value); return this; }

    /// {@return `extent` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment extentAt(long index) { return extent(this.segment(), index); }
    /// Sets `extent` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo extentAt(long index, MemorySegment value) { extent(this.segment(), index, value); return this; }
    /// Accepts `extent` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkImageCreateInfo extentAt(long index, Consumer<overrungl.vulkan.struct.VkExtent3D> func) { func.accept(overrungl.vulkan.struct.VkExtent3D.of(extentAt(index))); return this; }

    /// {@return `mipLevels` at the given index}
    /// @param index the index of the struct buffer
    public int mipLevelsAt(long index) { return mipLevels(this.segment(), index); }
    /// Sets `mipLevels` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo mipLevelsAt(long index, int value) { mipLevels(this.segment(), index, value); return this; }

    /// {@return `arrayLayers` at the given index}
    /// @param index the index of the struct buffer
    public int arrayLayersAt(long index) { return arrayLayers(this.segment(), index); }
    /// Sets `arrayLayers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo arrayLayersAt(long index, int value) { arrayLayers(this.segment(), index, value); return this; }

    /// {@return `samples` at the given index}
    /// @param index the index of the struct buffer
    public int samplesAt(long index) { return samples(this.segment(), index); }
    /// Sets `samples` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo samplesAt(long index, int value) { samples(this.segment(), index, value); return this; }

    /// {@return `tiling` at the given index}
    /// @param index the index of the struct buffer
    public int tilingAt(long index) { return tiling(this.segment(), index); }
    /// Sets `tiling` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo tilingAt(long index, int value) { tiling(this.segment(), index, value); return this; }

    /// {@return `usage` at the given index}
    /// @param index the index of the struct buffer
    public int usageAt(long index) { return usage(this.segment(), index); }
    /// Sets `usage` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo usageAt(long index, int value) { usage(this.segment(), index, value); return this; }

    /// {@return `sharingMode` at the given index}
    /// @param index the index of the struct buffer
    public int sharingModeAt(long index) { return sharingMode(this.segment(), index); }
    /// Sets `sharingMode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo sharingModeAt(long index, int value) { sharingMode(this.segment(), index, value); return this; }

    /// {@return `queueFamilyIndexCount` at the given index}
    /// @param index the index of the struct buffer
    public int queueFamilyIndexCountAt(long index) { return queueFamilyIndexCount(this.segment(), index); }
    /// Sets `queueFamilyIndexCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo queueFamilyIndexCountAt(long index, int value) { queueFamilyIndexCount(this.segment(), index, value); return this; }

    /// {@return `pQueueFamilyIndices` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pQueueFamilyIndicesAt(long index) { return pQueueFamilyIndices(this.segment(), index); }
    /// Sets `pQueueFamilyIndices` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo pQueueFamilyIndicesAt(long index, MemorySegment value) { pQueueFamilyIndices(this.segment(), index, value); return this; }

    /// {@return `initialLayout` at the given index}
    /// @param index the index of the struct buffer
    public int initialLayoutAt(long index) { return initialLayout(this.segment(), index); }
    /// Sets `initialLayout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageCreateInfo initialLayoutAt(long index, int value) { initialLayout(this.segment(), index, value); return this; }

}

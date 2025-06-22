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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;
import java.util.function.*;

/// ## Layout
/// ```
/// struct VkSurfaceCapabilities2EXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t minImageCount;
///     uint32_t maxImageCount;
///     (struct VkExtent2D) VkExtent2D currentExtent;
///     (struct VkExtent2D) VkExtent2D minImageExtent;
///     (struct VkExtent2D) VkExtent2D maxImageExtent;
///     uint32_t maxImageArrayLayers;
///     ((uint32_t) VkFlags) VkSurfaceTransformFlagsKHR supportedTransforms;
///     (int) VkSurfaceTransformFlagBitsKHR currentTransform;
///     ((uint32_t) VkFlags) VkCompositeAlphaFlagsKHR supportedCompositeAlpha;
///     ((uint32_t) VkFlags) VkImageUsageFlags supportedUsageFlags;
///     ((uint32_t) VkFlags) VkSurfaceCounterFlagsEXT supportedSurfaceCounters;
/// };
/// ```
public sealed class VkSurfaceCapabilities2EXT extends GroupType {
    /// The struct layout of `VkSurfaceCapabilities2EXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("minImageCount"),
        ValueLayout.JAVA_INT.withName("maxImageCount"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("currentExtent"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("minImageExtent"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxImageExtent"),
        ValueLayout.JAVA_INT.withName("maxImageArrayLayers"),
        ValueLayout.JAVA_INT.withName("supportedTransforms"),
        ValueLayout.JAVA_INT.withName("currentTransform"),
        ValueLayout.JAVA_INT.withName("supportedCompositeAlpha"),
        ValueLayout.JAVA_INT.withName("supportedUsageFlags"),
        ValueLayout.JAVA_INT.withName("supportedSurfaceCounters")
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
    /// The byte offset of `minImageCount`.
    public static final long OFFSET_minImageCount = LAYOUT.byteOffset(PathElement.groupElement("minImageCount"));
    /// The memory layout of `minImageCount`.
    public static final MemoryLayout LAYOUT_minImageCount = LAYOUT.select(PathElement.groupElement("minImageCount"));
    /// The [VarHandle] of `minImageCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minImageCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minImageCount"));
    /// The byte offset of `maxImageCount`.
    public static final long OFFSET_maxImageCount = LAYOUT.byteOffset(PathElement.groupElement("maxImageCount"));
    /// The memory layout of `maxImageCount`.
    public static final MemoryLayout LAYOUT_maxImageCount = LAYOUT.select(PathElement.groupElement("maxImageCount"));
    /// The [VarHandle] of `maxImageCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxImageCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImageCount"));
    /// The byte offset of `currentExtent`.
    public static final long OFFSET_currentExtent = LAYOUT.byteOffset(PathElement.groupElement("currentExtent"));
    /// The memory layout of `currentExtent`.
    public static final MemoryLayout LAYOUT_currentExtent = LAYOUT.select(PathElement.groupElement("currentExtent"));
    /// The byte offset of `minImageExtent`.
    public static final long OFFSET_minImageExtent = LAYOUT.byteOffset(PathElement.groupElement("minImageExtent"));
    /// The memory layout of `minImageExtent`.
    public static final MemoryLayout LAYOUT_minImageExtent = LAYOUT.select(PathElement.groupElement("minImageExtent"));
    /// The byte offset of `maxImageExtent`.
    public static final long OFFSET_maxImageExtent = LAYOUT.byteOffset(PathElement.groupElement("maxImageExtent"));
    /// The memory layout of `maxImageExtent`.
    public static final MemoryLayout LAYOUT_maxImageExtent = LAYOUT.select(PathElement.groupElement("maxImageExtent"));
    /// The byte offset of `maxImageArrayLayers`.
    public static final long OFFSET_maxImageArrayLayers = LAYOUT.byteOffset(PathElement.groupElement("maxImageArrayLayers"));
    /// The memory layout of `maxImageArrayLayers`.
    public static final MemoryLayout LAYOUT_maxImageArrayLayers = LAYOUT.select(PathElement.groupElement("maxImageArrayLayers"));
    /// The [VarHandle] of `maxImageArrayLayers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxImageArrayLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImageArrayLayers"));
    /// The byte offset of `supportedTransforms`.
    public static final long OFFSET_supportedTransforms = LAYOUT.byteOffset(PathElement.groupElement("supportedTransforms"));
    /// The memory layout of `supportedTransforms`.
    public static final MemoryLayout LAYOUT_supportedTransforms = LAYOUT.select(PathElement.groupElement("supportedTransforms"));
    /// The [VarHandle] of `supportedTransforms` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_supportedTransforms = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedTransforms"));
    /// The byte offset of `currentTransform`.
    public static final long OFFSET_currentTransform = LAYOUT.byteOffset(PathElement.groupElement("currentTransform"));
    /// The memory layout of `currentTransform`.
    public static final MemoryLayout LAYOUT_currentTransform = LAYOUT.select(PathElement.groupElement("currentTransform"));
    /// The [VarHandle] of `currentTransform` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_currentTransform = LAYOUT.arrayElementVarHandle(PathElement.groupElement("currentTransform"));
    /// The byte offset of `supportedCompositeAlpha`.
    public static final long OFFSET_supportedCompositeAlpha = LAYOUT.byteOffset(PathElement.groupElement("supportedCompositeAlpha"));
    /// The memory layout of `supportedCompositeAlpha`.
    public static final MemoryLayout LAYOUT_supportedCompositeAlpha = LAYOUT.select(PathElement.groupElement("supportedCompositeAlpha"));
    /// The [VarHandle] of `supportedCompositeAlpha` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_supportedCompositeAlpha = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedCompositeAlpha"));
    /// The byte offset of `supportedUsageFlags`.
    public static final long OFFSET_supportedUsageFlags = LAYOUT.byteOffset(PathElement.groupElement("supportedUsageFlags"));
    /// The memory layout of `supportedUsageFlags`.
    public static final MemoryLayout LAYOUT_supportedUsageFlags = LAYOUT.select(PathElement.groupElement("supportedUsageFlags"));
    /// The [VarHandle] of `supportedUsageFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_supportedUsageFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedUsageFlags"));
    /// The byte offset of `supportedSurfaceCounters`.
    public static final long OFFSET_supportedSurfaceCounters = LAYOUT.byteOffset(PathElement.groupElement("supportedSurfaceCounters"));
    /// The memory layout of `supportedSurfaceCounters`.
    public static final MemoryLayout LAYOUT_supportedSurfaceCounters = LAYOUT.select(PathElement.groupElement("supportedSurfaceCounters"));
    /// The [VarHandle] of `supportedSurfaceCounters` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_supportedSurfaceCounters = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedSurfaceCounters"));

    /// Creates `VkSurfaceCapabilities2EXT` with the given segment.
    /// @param segment the memory segment
    public VkSurfaceCapabilities2EXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSurfaceCapabilities2EXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSurfaceCapabilities2EXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfaceCapabilities2EXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceCapabilities2EXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkSurfaceCapabilities2EXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSurfaceCapabilities2EXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSurfaceCapabilities2EXT`
    public static VkSurfaceCapabilities2EXT alloc(SegmentAllocator allocator) { return new VkSurfaceCapabilities2EXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSurfaceCapabilities2EXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSurfaceCapabilities2EXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSurfaceCapabilities2EXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param minImageCount `minImageCount`
    /// @param maxImageCount `maxImageCount`
    /// @param currentExtent `currentExtent`
    /// @param minImageExtent `minImageExtent`
    /// @param maxImageExtent `maxImageExtent`
    /// @param maxImageArrayLayers `maxImageArrayLayers`
    /// @param supportedTransforms `supportedTransforms`
    /// @param currentTransform `currentTransform`
    /// @param supportedCompositeAlpha `supportedCompositeAlpha`
    /// @param supportedUsageFlags `supportedUsageFlags`
    /// @param supportedSurfaceCounters `supportedSurfaceCounters`
    /// @return the allocated `VkSurfaceCapabilities2EXT`
    public static VkSurfaceCapabilities2EXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int minImageCount, int maxImageCount, MemorySegment currentExtent, MemorySegment minImageExtent, MemorySegment maxImageExtent, int maxImageArrayLayers, int supportedTransforms, int currentTransform, int supportedCompositeAlpha, int supportedUsageFlags, int supportedSurfaceCounters) {
        return alloc(allocator).sType(sType).pNext(pNext).minImageCount(minImageCount).maxImageCount(maxImageCount).currentExtent(currentExtent).minImageExtent(minImageExtent).maxImageExtent(maxImageExtent).maxImageArrayLayers(maxImageArrayLayers).supportedTransforms(supportedTransforms).currentTransform(currentTransform).supportedCompositeAlpha(supportedCompositeAlpha).supportedUsageFlags(supportedUsageFlags).supportedSurfaceCounters(supportedSurfaceCounters);
    }

    /// Allocates a `VkSurfaceCapabilities2EXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param minImageCount `minImageCount`
    /// @param maxImageCount `maxImageCount`
    /// @param currentExtent `currentExtent`
    /// @param minImageExtent `minImageExtent`
    /// @param maxImageExtent `maxImageExtent`
    /// @param maxImageArrayLayers `maxImageArrayLayers`
    /// @param supportedTransforms `supportedTransforms`
    /// @param currentTransform `currentTransform`
    /// @param supportedCompositeAlpha `supportedCompositeAlpha`
    /// @param supportedUsageFlags `supportedUsageFlags`
    /// @return the allocated `VkSurfaceCapabilities2EXT`
    public static VkSurfaceCapabilities2EXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int minImageCount, int maxImageCount, MemorySegment currentExtent, MemorySegment minImageExtent, MemorySegment maxImageExtent, int maxImageArrayLayers, int supportedTransforms, int currentTransform, int supportedCompositeAlpha, int supportedUsageFlags) {
        return alloc(allocator).sType(sType).pNext(pNext).minImageCount(minImageCount).maxImageCount(maxImageCount).currentExtent(currentExtent).minImageExtent(minImageExtent).maxImageExtent(maxImageExtent).maxImageArrayLayers(maxImageArrayLayers).supportedTransforms(supportedTransforms).currentTransform(currentTransform).supportedCompositeAlpha(supportedCompositeAlpha).supportedUsageFlags(supportedUsageFlags);
    }

    /// Allocates a `VkSurfaceCapabilities2EXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param minImageCount `minImageCount`
    /// @param maxImageCount `maxImageCount`
    /// @param currentExtent `currentExtent`
    /// @param minImageExtent `minImageExtent`
    /// @param maxImageExtent `maxImageExtent`
    /// @param maxImageArrayLayers `maxImageArrayLayers`
    /// @param supportedTransforms `supportedTransforms`
    /// @param currentTransform `currentTransform`
    /// @param supportedCompositeAlpha `supportedCompositeAlpha`
    /// @return the allocated `VkSurfaceCapabilities2EXT`
    public static VkSurfaceCapabilities2EXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int minImageCount, int maxImageCount, MemorySegment currentExtent, MemorySegment minImageExtent, MemorySegment maxImageExtent, int maxImageArrayLayers, int supportedTransforms, int currentTransform, int supportedCompositeAlpha) {
        return alloc(allocator).sType(sType).pNext(pNext).minImageCount(minImageCount).maxImageCount(maxImageCount).currentExtent(currentExtent).minImageExtent(minImageExtent).maxImageExtent(maxImageExtent).maxImageArrayLayers(maxImageArrayLayers).supportedTransforms(supportedTransforms).currentTransform(currentTransform).supportedCompositeAlpha(supportedCompositeAlpha);
    }

    /// Allocates a `VkSurfaceCapabilities2EXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param minImageCount `minImageCount`
    /// @param maxImageCount `maxImageCount`
    /// @param currentExtent `currentExtent`
    /// @param minImageExtent `minImageExtent`
    /// @param maxImageExtent `maxImageExtent`
    /// @param maxImageArrayLayers `maxImageArrayLayers`
    /// @param supportedTransforms `supportedTransforms`
    /// @param currentTransform `currentTransform`
    /// @return the allocated `VkSurfaceCapabilities2EXT`
    public static VkSurfaceCapabilities2EXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int minImageCount, int maxImageCount, MemorySegment currentExtent, MemorySegment minImageExtent, MemorySegment maxImageExtent, int maxImageArrayLayers, int supportedTransforms, int currentTransform) {
        return alloc(allocator).sType(sType).pNext(pNext).minImageCount(minImageCount).maxImageCount(maxImageCount).currentExtent(currentExtent).minImageExtent(minImageExtent).maxImageExtent(maxImageExtent).maxImageArrayLayers(maxImageArrayLayers).supportedTransforms(supportedTransforms).currentTransform(currentTransform);
    }

    /// Allocates a `VkSurfaceCapabilities2EXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param minImageCount `minImageCount`
    /// @param maxImageCount `maxImageCount`
    /// @param currentExtent `currentExtent`
    /// @param minImageExtent `minImageExtent`
    /// @param maxImageExtent `maxImageExtent`
    /// @param maxImageArrayLayers `maxImageArrayLayers`
    /// @param supportedTransforms `supportedTransforms`
    /// @return the allocated `VkSurfaceCapabilities2EXT`
    public static VkSurfaceCapabilities2EXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int minImageCount, int maxImageCount, MemorySegment currentExtent, MemorySegment minImageExtent, MemorySegment maxImageExtent, int maxImageArrayLayers, int supportedTransforms) {
        return alloc(allocator).sType(sType).pNext(pNext).minImageCount(minImageCount).maxImageCount(maxImageCount).currentExtent(currentExtent).minImageExtent(minImageExtent).maxImageExtent(maxImageExtent).maxImageArrayLayers(maxImageArrayLayers).supportedTransforms(supportedTransforms);
    }

    /// Allocates a `VkSurfaceCapabilities2EXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param minImageCount `minImageCount`
    /// @param maxImageCount `maxImageCount`
    /// @param currentExtent `currentExtent`
    /// @param minImageExtent `minImageExtent`
    /// @param maxImageExtent `maxImageExtent`
    /// @param maxImageArrayLayers `maxImageArrayLayers`
    /// @return the allocated `VkSurfaceCapabilities2EXT`
    public static VkSurfaceCapabilities2EXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int minImageCount, int maxImageCount, MemorySegment currentExtent, MemorySegment minImageExtent, MemorySegment maxImageExtent, int maxImageArrayLayers) {
        return alloc(allocator).sType(sType).pNext(pNext).minImageCount(minImageCount).maxImageCount(maxImageCount).currentExtent(currentExtent).minImageExtent(minImageExtent).maxImageExtent(maxImageExtent).maxImageArrayLayers(maxImageArrayLayers);
    }

    /// Allocates a `VkSurfaceCapabilities2EXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param minImageCount `minImageCount`
    /// @param maxImageCount `maxImageCount`
    /// @param currentExtent `currentExtent`
    /// @param minImageExtent `minImageExtent`
    /// @param maxImageExtent `maxImageExtent`
    /// @return the allocated `VkSurfaceCapabilities2EXT`
    public static VkSurfaceCapabilities2EXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int minImageCount, int maxImageCount, MemorySegment currentExtent, MemorySegment minImageExtent, MemorySegment maxImageExtent) {
        return alloc(allocator).sType(sType).pNext(pNext).minImageCount(minImageCount).maxImageCount(maxImageCount).currentExtent(currentExtent).minImageExtent(minImageExtent).maxImageExtent(maxImageExtent);
    }

    /// Allocates a `VkSurfaceCapabilities2EXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param minImageCount `minImageCount`
    /// @param maxImageCount `maxImageCount`
    /// @param currentExtent `currentExtent`
    /// @param minImageExtent `minImageExtent`
    /// @return the allocated `VkSurfaceCapabilities2EXT`
    public static VkSurfaceCapabilities2EXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int minImageCount, int maxImageCount, MemorySegment currentExtent, MemorySegment minImageExtent) {
        return alloc(allocator).sType(sType).pNext(pNext).minImageCount(minImageCount).maxImageCount(maxImageCount).currentExtent(currentExtent).minImageExtent(minImageExtent);
    }

    /// Allocates a `VkSurfaceCapabilities2EXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param minImageCount `minImageCount`
    /// @param maxImageCount `maxImageCount`
    /// @param currentExtent `currentExtent`
    /// @return the allocated `VkSurfaceCapabilities2EXT`
    public static VkSurfaceCapabilities2EXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int minImageCount, int maxImageCount, MemorySegment currentExtent) {
        return alloc(allocator).sType(sType).pNext(pNext).minImageCount(minImageCount).maxImageCount(maxImageCount).currentExtent(currentExtent);
    }

    /// Allocates a `VkSurfaceCapabilities2EXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param minImageCount `minImageCount`
    /// @param maxImageCount `maxImageCount`
    /// @return the allocated `VkSurfaceCapabilities2EXT`
    public static VkSurfaceCapabilities2EXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int minImageCount, int maxImageCount) {
        return alloc(allocator).sType(sType).pNext(pNext).minImageCount(minImageCount).maxImageCount(maxImageCount);
    }

    /// Allocates a `VkSurfaceCapabilities2EXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param minImageCount `minImageCount`
    /// @return the allocated `VkSurfaceCapabilities2EXT`
    public static VkSurfaceCapabilities2EXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int minImageCount) {
        return alloc(allocator).sType(sType).pNext(pNext).minImageCount(minImageCount);
    }

    /// Allocates a `VkSurfaceCapabilities2EXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkSurfaceCapabilities2EXT`
    public static VkSurfaceCapabilities2EXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkSurfaceCapabilities2EXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkSurfaceCapabilities2EXT`
    public static VkSurfaceCapabilities2EXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSurfaceCapabilities2EXT copyFrom(VkSurfaceCapabilities2EXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public VkSurfaceCapabilities2EXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSurfaceCapabilities2EXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `minImageCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int minImageCount(MemorySegment segment, long index) { return (int) VH_minImageCount.get(segment, 0L, index); }
    /// {@return `minImageCount`}
    public int minImageCount() { return minImageCount(this.segment(), 0L); }
    /// Sets `minImageCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minImageCount(MemorySegment segment, long index, int value) { VH_minImageCount.set(segment, 0L, index, value); }
    /// Sets `minImageCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT minImageCount(int value) { minImageCount(this.segment(), 0L, value); return this; }

    /// {@return `maxImageCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxImageCount(MemorySegment segment, long index) { return (int) VH_maxImageCount.get(segment, 0L, index); }
    /// {@return `maxImageCount`}
    public int maxImageCount() { return maxImageCount(this.segment(), 0L); }
    /// Sets `maxImageCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxImageCount(MemorySegment segment, long index, int value) { VH_maxImageCount.set(segment, 0L, index, value); }
    /// Sets `maxImageCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT maxImageCount(int value) { maxImageCount(this.segment(), 0L, value); return this; }

    /// {@return `currentExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment currentExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_currentExtent, index), LAYOUT_currentExtent); }
    /// {@return `currentExtent`}
    public MemorySegment currentExtent() { return currentExtent(this.segment(), 0L); }
    /// Sets `currentExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void currentExtent(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_currentExtent, index), LAYOUT_currentExtent.byteSize()); }
    /// Sets `currentExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT currentExtent(MemorySegment value) { currentExtent(this.segment(), 0L, value); return this; }
    /// Accepts `currentExtent` with the given function.
    /// @param func the function
    /// @return `this`
    public VkSurfaceCapabilities2EXT currentExtent(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(currentExtent())); return this; }

    /// {@return `minImageExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment minImageExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_minImageExtent, index), LAYOUT_minImageExtent); }
    /// {@return `minImageExtent`}
    public MemorySegment minImageExtent() { return minImageExtent(this.segment(), 0L); }
    /// Sets `minImageExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minImageExtent(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_minImageExtent, index), LAYOUT_minImageExtent.byteSize()); }
    /// Sets `minImageExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT minImageExtent(MemorySegment value) { minImageExtent(this.segment(), 0L, value); return this; }
    /// Accepts `minImageExtent` with the given function.
    /// @param func the function
    /// @return `this`
    public VkSurfaceCapabilities2EXT minImageExtent(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(minImageExtent())); return this; }

    /// {@return `maxImageExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxImageExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxImageExtent, index), LAYOUT_maxImageExtent); }
    /// {@return `maxImageExtent`}
    public MemorySegment maxImageExtent() { return maxImageExtent(this.segment(), 0L); }
    /// Sets `maxImageExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxImageExtent(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxImageExtent, index), LAYOUT_maxImageExtent.byteSize()); }
    /// Sets `maxImageExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT maxImageExtent(MemorySegment value) { maxImageExtent(this.segment(), 0L, value); return this; }
    /// Accepts `maxImageExtent` with the given function.
    /// @param func the function
    /// @return `this`
    public VkSurfaceCapabilities2EXT maxImageExtent(Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxImageExtent())); return this; }

    /// {@return `maxImageArrayLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxImageArrayLayers(MemorySegment segment, long index) { return (int) VH_maxImageArrayLayers.get(segment, 0L, index); }
    /// {@return `maxImageArrayLayers`}
    public int maxImageArrayLayers() { return maxImageArrayLayers(this.segment(), 0L); }
    /// Sets `maxImageArrayLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxImageArrayLayers(MemorySegment segment, long index, int value) { VH_maxImageArrayLayers.set(segment, 0L, index, value); }
    /// Sets `maxImageArrayLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT maxImageArrayLayers(int value) { maxImageArrayLayers(this.segment(), 0L, value); return this; }

    /// {@return `supportedTransforms` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int supportedTransforms(MemorySegment segment, long index) { return (int) VH_supportedTransforms.get(segment, 0L, index); }
    /// {@return `supportedTransforms`}
    public int supportedTransforms() { return supportedTransforms(this.segment(), 0L); }
    /// Sets `supportedTransforms` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void supportedTransforms(MemorySegment segment, long index, int value) { VH_supportedTransforms.set(segment, 0L, index, value); }
    /// Sets `supportedTransforms` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT supportedTransforms(int value) { supportedTransforms(this.segment(), 0L, value); return this; }

    /// {@return `currentTransform` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int currentTransform(MemorySegment segment, long index) { return (int) VH_currentTransform.get(segment, 0L, index); }
    /// {@return `currentTransform`}
    public int currentTransform() { return currentTransform(this.segment(), 0L); }
    /// Sets `currentTransform` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void currentTransform(MemorySegment segment, long index, int value) { VH_currentTransform.set(segment, 0L, index, value); }
    /// Sets `currentTransform` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT currentTransform(int value) { currentTransform(this.segment(), 0L, value); return this; }

    /// {@return `supportedCompositeAlpha` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int supportedCompositeAlpha(MemorySegment segment, long index) { return (int) VH_supportedCompositeAlpha.get(segment, 0L, index); }
    /// {@return `supportedCompositeAlpha`}
    public int supportedCompositeAlpha() { return supportedCompositeAlpha(this.segment(), 0L); }
    /// Sets `supportedCompositeAlpha` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void supportedCompositeAlpha(MemorySegment segment, long index, int value) { VH_supportedCompositeAlpha.set(segment, 0L, index, value); }
    /// Sets `supportedCompositeAlpha` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT supportedCompositeAlpha(int value) { supportedCompositeAlpha(this.segment(), 0L, value); return this; }

    /// {@return `supportedUsageFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int supportedUsageFlags(MemorySegment segment, long index) { return (int) VH_supportedUsageFlags.get(segment, 0L, index); }
    /// {@return `supportedUsageFlags`}
    public int supportedUsageFlags() { return supportedUsageFlags(this.segment(), 0L); }
    /// Sets `supportedUsageFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void supportedUsageFlags(MemorySegment segment, long index, int value) { VH_supportedUsageFlags.set(segment, 0L, index, value); }
    /// Sets `supportedUsageFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT supportedUsageFlags(int value) { supportedUsageFlags(this.segment(), 0L, value); return this; }

    /// {@return `supportedSurfaceCounters` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int supportedSurfaceCounters(MemorySegment segment, long index) { return (int) VH_supportedSurfaceCounters.get(segment, 0L, index); }
    /// {@return `supportedSurfaceCounters`}
    public int supportedSurfaceCounters() { return supportedSurfaceCounters(this.segment(), 0L); }
    /// Sets `supportedSurfaceCounters` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void supportedSurfaceCounters(MemorySegment segment, long index, int value) { VH_supportedSurfaceCounters.set(segment, 0L, index, value); }
    /// Sets `supportedSurfaceCounters` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilities2EXT supportedSurfaceCounters(int value) { supportedSurfaceCounters(this.segment(), 0L, value); return this; }

    /// A buffer of [VkSurfaceCapabilities2EXT].
    public static final class Buffer extends VkSurfaceCapabilities2EXT {
        private final long elementCount;

        /// Creates `VkSurfaceCapabilities2EXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSurfaceCapabilities2EXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSurfaceCapabilities2EXT`
        public VkSurfaceCapabilities2EXT asSlice(long index) { return new VkSurfaceCapabilities2EXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSurfaceCapabilities2EXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSurfaceCapabilities2EXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `minImageCount` at the given index}
        /// @param index the index of the struct buffer
        public int minImageCountAt(long index) { return minImageCount(this.segment(), index); }
        /// Sets `minImageCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer minImageCountAt(long index, int value) { minImageCount(this.segment(), index, value); return this; }

        /// {@return `maxImageCount` at the given index}
        /// @param index the index of the struct buffer
        public int maxImageCountAt(long index) { return maxImageCount(this.segment(), index); }
        /// Sets `maxImageCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxImageCountAt(long index, int value) { maxImageCount(this.segment(), index, value); return this; }

        /// {@return `currentExtent` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment currentExtentAt(long index) { return currentExtent(this.segment(), index); }
        /// Sets `currentExtent` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer currentExtentAt(long index, MemorySegment value) { currentExtent(this.segment(), index, value); return this; }
        /// Accepts `currentExtent` with the given function.
        /// @param index the index of the struct buffer
        /// @param func the function
        /// @return `this`
        public Buffer currentExtentAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(currentExtentAt(index))); return this; }

        /// {@return `minImageExtent` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment minImageExtentAt(long index) { return minImageExtent(this.segment(), index); }
        /// Sets `minImageExtent` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer minImageExtentAt(long index, MemorySegment value) { minImageExtent(this.segment(), index, value); return this; }
        /// Accepts `minImageExtent` with the given function.
        /// @param index the index of the struct buffer
        /// @param func the function
        /// @return `this`
        public Buffer minImageExtentAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(minImageExtentAt(index))); return this; }

        /// {@return `maxImageExtent` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment maxImageExtentAt(long index) { return maxImageExtent(this.segment(), index); }
        /// Sets `maxImageExtent` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxImageExtentAt(long index, MemorySegment value) { maxImageExtent(this.segment(), index, value); return this; }
        /// Accepts `maxImageExtent` with the given function.
        /// @param index the index of the struct buffer
        /// @param func the function
        /// @return `this`
        public Buffer maxImageExtentAt(long index, Consumer<overrungl.vulkan.struct.VkExtent2D> func) { func.accept(overrungl.vulkan.struct.VkExtent2D.of(maxImageExtentAt(index))); return this; }

        /// {@return `maxImageArrayLayers` at the given index}
        /// @param index the index of the struct buffer
        public int maxImageArrayLayersAt(long index) { return maxImageArrayLayers(this.segment(), index); }
        /// Sets `maxImageArrayLayers` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxImageArrayLayersAt(long index, int value) { maxImageArrayLayers(this.segment(), index, value); return this; }

        /// {@return `supportedTransforms` at the given index}
        /// @param index the index of the struct buffer
        public int supportedTransformsAt(long index) { return supportedTransforms(this.segment(), index); }
        /// Sets `supportedTransforms` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer supportedTransformsAt(long index, int value) { supportedTransforms(this.segment(), index, value); return this; }

        /// {@return `currentTransform` at the given index}
        /// @param index the index of the struct buffer
        public int currentTransformAt(long index) { return currentTransform(this.segment(), index); }
        /// Sets `currentTransform` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer currentTransformAt(long index, int value) { currentTransform(this.segment(), index, value); return this; }

        /// {@return `supportedCompositeAlpha` at the given index}
        /// @param index the index of the struct buffer
        public int supportedCompositeAlphaAt(long index) { return supportedCompositeAlpha(this.segment(), index); }
        /// Sets `supportedCompositeAlpha` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer supportedCompositeAlphaAt(long index, int value) { supportedCompositeAlpha(this.segment(), index, value); return this; }

        /// {@return `supportedUsageFlags` at the given index}
        /// @param index the index of the struct buffer
        public int supportedUsageFlagsAt(long index) { return supportedUsageFlags(this.segment(), index); }
        /// Sets `supportedUsageFlags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer supportedUsageFlagsAt(long index, int value) { supportedUsageFlags(this.segment(), index, value); return this; }

        /// {@return `supportedSurfaceCounters` at the given index}
        /// @param index the index of the struct buffer
        public int supportedSurfaceCountersAt(long index) { return supportedSurfaceCounters(this.segment(), index); }
        /// Sets `supportedSurfaceCounters` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer supportedSurfaceCountersAt(long index, int value) { supportedSurfaceCounters(this.segment(), index, value); return this; }

    }
}

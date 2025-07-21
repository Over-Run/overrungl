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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceOpticalFlowPropertiesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     ((uint32_t) VkFlags) VkOpticalFlowGridSizeFlagsNV supportedOutputGridSizes;
///     ((uint32_t) VkFlags) VkOpticalFlowGridSizeFlagsNV supportedHintGridSizes;
///     (uint32_t) VkBool32 hintSupported;
///     (uint32_t) VkBool32 costSupported;
///     (uint32_t) VkBool32 bidirectionalFlowSupported;
///     (uint32_t) VkBool32 globalFlowSupported;
///     uint32_t minWidth;
///     uint32_t minHeight;
///     uint32_t maxWidth;
///     uint32_t maxHeight;
///     uint32_t maxNumRegionsOfInterest;
/// };
/// ```
public final class VkPhysicalDeviceOpticalFlowPropertiesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceOpticalFlowPropertiesNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("supportedOutputGridSizes"),
        ValueLayout.JAVA_INT.withName("supportedHintGridSizes"),
        ValueLayout.JAVA_INT.withName("hintSupported"),
        ValueLayout.JAVA_INT.withName("costSupported"),
        ValueLayout.JAVA_INT.withName("bidirectionalFlowSupported"),
        ValueLayout.JAVA_INT.withName("globalFlowSupported"),
        ValueLayout.JAVA_INT.withName("minWidth"),
        ValueLayout.JAVA_INT.withName("minHeight"),
        ValueLayout.JAVA_INT.withName("maxWidth"),
        ValueLayout.JAVA_INT.withName("maxHeight"),
        ValueLayout.JAVA_INT.withName("maxNumRegionsOfInterest")
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
    /// The byte offset of `supportedOutputGridSizes`.
    public static final long OFFSET_supportedOutputGridSizes = LAYOUT.byteOffset(PathElement.groupElement("supportedOutputGridSizes"));
    /// The memory layout of `supportedOutputGridSizes`.
    public static final MemoryLayout LAYOUT_supportedOutputGridSizes = LAYOUT.select(PathElement.groupElement("supportedOutputGridSizes"));
    /// The [VarHandle] of `supportedOutputGridSizes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_supportedOutputGridSizes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedOutputGridSizes"));
    /// The byte offset of `supportedHintGridSizes`.
    public static final long OFFSET_supportedHintGridSizes = LAYOUT.byteOffset(PathElement.groupElement("supportedHintGridSizes"));
    /// The memory layout of `supportedHintGridSizes`.
    public static final MemoryLayout LAYOUT_supportedHintGridSizes = LAYOUT.select(PathElement.groupElement("supportedHintGridSizes"));
    /// The [VarHandle] of `supportedHintGridSizes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_supportedHintGridSizes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportedHintGridSizes"));
    /// The byte offset of `hintSupported`.
    public static final long OFFSET_hintSupported = LAYOUT.byteOffset(PathElement.groupElement("hintSupported"));
    /// The memory layout of `hintSupported`.
    public static final MemoryLayout LAYOUT_hintSupported = LAYOUT.select(PathElement.groupElement("hintSupported"));
    /// The [VarHandle] of `hintSupported` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_hintSupported = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hintSupported"));
    /// The byte offset of `costSupported`.
    public static final long OFFSET_costSupported = LAYOUT.byteOffset(PathElement.groupElement("costSupported"));
    /// The memory layout of `costSupported`.
    public static final MemoryLayout LAYOUT_costSupported = LAYOUT.select(PathElement.groupElement("costSupported"));
    /// The [VarHandle] of `costSupported` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_costSupported = LAYOUT.arrayElementVarHandle(PathElement.groupElement("costSupported"));
    /// The byte offset of `bidirectionalFlowSupported`.
    public static final long OFFSET_bidirectionalFlowSupported = LAYOUT.byteOffset(PathElement.groupElement("bidirectionalFlowSupported"));
    /// The memory layout of `bidirectionalFlowSupported`.
    public static final MemoryLayout LAYOUT_bidirectionalFlowSupported = LAYOUT.select(PathElement.groupElement("bidirectionalFlowSupported"));
    /// The [VarHandle] of `bidirectionalFlowSupported` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bidirectionalFlowSupported = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bidirectionalFlowSupported"));
    /// The byte offset of `globalFlowSupported`.
    public static final long OFFSET_globalFlowSupported = LAYOUT.byteOffset(PathElement.groupElement("globalFlowSupported"));
    /// The memory layout of `globalFlowSupported`.
    public static final MemoryLayout LAYOUT_globalFlowSupported = LAYOUT.select(PathElement.groupElement("globalFlowSupported"));
    /// The [VarHandle] of `globalFlowSupported` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_globalFlowSupported = LAYOUT.arrayElementVarHandle(PathElement.groupElement("globalFlowSupported"));
    /// The byte offset of `minWidth`.
    public static final long OFFSET_minWidth = LAYOUT.byteOffset(PathElement.groupElement("minWidth"));
    /// The memory layout of `minWidth`.
    public static final MemoryLayout LAYOUT_minWidth = LAYOUT.select(PathElement.groupElement("minWidth"));
    /// The [VarHandle] of `minWidth` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minWidth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minWidth"));
    /// The byte offset of `minHeight`.
    public static final long OFFSET_minHeight = LAYOUT.byteOffset(PathElement.groupElement("minHeight"));
    /// The memory layout of `minHeight`.
    public static final MemoryLayout LAYOUT_minHeight = LAYOUT.select(PathElement.groupElement("minHeight"));
    /// The [VarHandle] of `minHeight` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minHeight = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minHeight"));
    /// The byte offset of `maxWidth`.
    public static final long OFFSET_maxWidth = LAYOUT.byteOffset(PathElement.groupElement("maxWidth"));
    /// The memory layout of `maxWidth`.
    public static final MemoryLayout LAYOUT_maxWidth = LAYOUT.select(PathElement.groupElement("maxWidth"));
    /// The [VarHandle] of `maxWidth` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxWidth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxWidth"));
    /// The byte offset of `maxHeight`.
    public static final long OFFSET_maxHeight = LAYOUT.byteOffset(PathElement.groupElement("maxHeight"));
    /// The memory layout of `maxHeight`.
    public static final MemoryLayout LAYOUT_maxHeight = LAYOUT.select(PathElement.groupElement("maxHeight"));
    /// The [VarHandle] of `maxHeight` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxHeight = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxHeight"));
    /// The byte offset of `maxNumRegionsOfInterest`.
    public static final long OFFSET_maxNumRegionsOfInterest = LAYOUT.byteOffset(PathElement.groupElement("maxNumRegionsOfInterest"));
    /// The memory layout of `maxNumRegionsOfInterest`.
    public static final MemoryLayout LAYOUT_maxNumRegionsOfInterest = LAYOUT.select(PathElement.groupElement("maxNumRegionsOfInterest"));
    /// The [VarHandle] of `maxNumRegionsOfInterest` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxNumRegionsOfInterest = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxNumRegionsOfInterest"));

    /// Creates `VkPhysicalDeviceOpticalFlowPropertiesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceOpticalFlowPropertiesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceOpticalFlowPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceOpticalFlowPropertiesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceOpticalFlowPropertiesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceOpticalFlowPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceOpticalFlowPropertiesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceOpticalFlowPropertiesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceOpticalFlowPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceOpticalFlowPropertiesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceOpticalFlowPropertiesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceOpticalFlowPropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceOpticalFlowPropertiesNV`
    public static VkPhysicalDeviceOpticalFlowPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceOpticalFlowPropertiesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceOpticalFlowPropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceOpticalFlowPropertiesNV`
    public static VkPhysicalDeviceOpticalFlowPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceOpticalFlowPropertiesNV(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceOpticalFlowPropertiesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param supportedOutputGridSizes `supportedOutputGridSizes`
    /// @param supportedHintGridSizes `supportedHintGridSizes`
    /// @param hintSupported `hintSupported`
    /// @param costSupported `costSupported`
    /// @param bidirectionalFlowSupported `bidirectionalFlowSupported`
    /// @param globalFlowSupported `globalFlowSupported`
    /// @param minWidth `minWidth`
    /// @param minHeight `minHeight`
    /// @param maxWidth `maxWidth`
    /// @param maxHeight `maxHeight`
    /// @param maxNumRegionsOfInterest `maxNumRegionsOfInterest`
    /// @return the allocated `VkPhysicalDeviceOpticalFlowPropertiesNV`
    public static VkPhysicalDeviceOpticalFlowPropertiesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int supportedOutputGridSizes, int supportedHintGridSizes, int hintSupported, int costSupported, int bidirectionalFlowSupported, int globalFlowSupported, int minWidth, int minHeight, int maxWidth, int maxHeight, int maxNumRegionsOfInterest) {
        return alloc(allocator).sType(sType).pNext(pNext).supportedOutputGridSizes(supportedOutputGridSizes).supportedHintGridSizes(supportedHintGridSizes).hintSupported(hintSupported).costSupported(costSupported).bidirectionalFlowSupported(bidirectionalFlowSupported).globalFlowSupported(globalFlowSupported).minWidth(minWidth).minHeight(minHeight).maxWidth(maxWidth).maxHeight(maxHeight).maxNumRegionsOfInterest(maxNumRegionsOfInterest);
    }

    /// Allocates a `VkPhysicalDeviceOpticalFlowPropertiesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param supportedOutputGridSizes `supportedOutputGridSizes`
    /// @param supportedHintGridSizes `supportedHintGridSizes`
    /// @param hintSupported `hintSupported`
    /// @param costSupported `costSupported`
    /// @param bidirectionalFlowSupported `bidirectionalFlowSupported`
    /// @param globalFlowSupported `globalFlowSupported`
    /// @param minWidth `minWidth`
    /// @param minHeight `minHeight`
    /// @param maxWidth `maxWidth`
    /// @param maxHeight `maxHeight`
    /// @return the allocated `VkPhysicalDeviceOpticalFlowPropertiesNV`
    public static VkPhysicalDeviceOpticalFlowPropertiesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int supportedOutputGridSizes, int supportedHintGridSizes, int hintSupported, int costSupported, int bidirectionalFlowSupported, int globalFlowSupported, int minWidth, int minHeight, int maxWidth, int maxHeight) {
        return alloc(allocator).sType(sType).pNext(pNext).supportedOutputGridSizes(supportedOutputGridSizes).supportedHintGridSizes(supportedHintGridSizes).hintSupported(hintSupported).costSupported(costSupported).bidirectionalFlowSupported(bidirectionalFlowSupported).globalFlowSupported(globalFlowSupported).minWidth(minWidth).minHeight(minHeight).maxWidth(maxWidth).maxHeight(maxHeight);
    }

    /// Allocates a `VkPhysicalDeviceOpticalFlowPropertiesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param supportedOutputGridSizes `supportedOutputGridSizes`
    /// @param supportedHintGridSizes `supportedHintGridSizes`
    /// @param hintSupported `hintSupported`
    /// @param costSupported `costSupported`
    /// @param bidirectionalFlowSupported `bidirectionalFlowSupported`
    /// @param globalFlowSupported `globalFlowSupported`
    /// @param minWidth `minWidth`
    /// @param minHeight `minHeight`
    /// @param maxWidth `maxWidth`
    /// @return the allocated `VkPhysicalDeviceOpticalFlowPropertiesNV`
    public static VkPhysicalDeviceOpticalFlowPropertiesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int supportedOutputGridSizes, int supportedHintGridSizes, int hintSupported, int costSupported, int bidirectionalFlowSupported, int globalFlowSupported, int minWidth, int minHeight, int maxWidth) {
        return alloc(allocator).sType(sType).pNext(pNext).supportedOutputGridSizes(supportedOutputGridSizes).supportedHintGridSizes(supportedHintGridSizes).hintSupported(hintSupported).costSupported(costSupported).bidirectionalFlowSupported(bidirectionalFlowSupported).globalFlowSupported(globalFlowSupported).minWidth(minWidth).minHeight(minHeight).maxWidth(maxWidth);
    }

    /// Allocates a `VkPhysicalDeviceOpticalFlowPropertiesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param supportedOutputGridSizes `supportedOutputGridSizes`
    /// @param supportedHintGridSizes `supportedHintGridSizes`
    /// @param hintSupported `hintSupported`
    /// @param costSupported `costSupported`
    /// @param bidirectionalFlowSupported `bidirectionalFlowSupported`
    /// @param globalFlowSupported `globalFlowSupported`
    /// @param minWidth `minWidth`
    /// @param minHeight `minHeight`
    /// @return the allocated `VkPhysicalDeviceOpticalFlowPropertiesNV`
    public static VkPhysicalDeviceOpticalFlowPropertiesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int supportedOutputGridSizes, int supportedHintGridSizes, int hintSupported, int costSupported, int bidirectionalFlowSupported, int globalFlowSupported, int minWidth, int minHeight) {
        return alloc(allocator).sType(sType).pNext(pNext).supportedOutputGridSizes(supportedOutputGridSizes).supportedHintGridSizes(supportedHintGridSizes).hintSupported(hintSupported).costSupported(costSupported).bidirectionalFlowSupported(bidirectionalFlowSupported).globalFlowSupported(globalFlowSupported).minWidth(minWidth).minHeight(minHeight);
    }

    /// Allocates a `VkPhysicalDeviceOpticalFlowPropertiesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param supportedOutputGridSizes `supportedOutputGridSizes`
    /// @param supportedHintGridSizes `supportedHintGridSizes`
    /// @param hintSupported `hintSupported`
    /// @param costSupported `costSupported`
    /// @param bidirectionalFlowSupported `bidirectionalFlowSupported`
    /// @param globalFlowSupported `globalFlowSupported`
    /// @param minWidth `minWidth`
    /// @return the allocated `VkPhysicalDeviceOpticalFlowPropertiesNV`
    public static VkPhysicalDeviceOpticalFlowPropertiesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int supportedOutputGridSizes, int supportedHintGridSizes, int hintSupported, int costSupported, int bidirectionalFlowSupported, int globalFlowSupported, int minWidth) {
        return alloc(allocator).sType(sType).pNext(pNext).supportedOutputGridSizes(supportedOutputGridSizes).supportedHintGridSizes(supportedHintGridSizes).hintSupported(hintSupported).costSupported(costSupported).bidirectionalFlowSupported(bidirectionalFlowSupported).globalFlowSupported(globalFlowSupported).minWidth(minWidth);
    }

    /// Allocates a `VkPhysicalDeviceOpticalFlowPropertiesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param supportedOutputGridSizes `supportedOutputGridSizes`
    /// @param supportedHintGridSizes `supportedHintGridSizes`
    /// @param hintSupported `hintSupported`
    /// @param costSupported `costSupported`
    /// @param bidirectionalFlowSupported `bidirectionalFlowSupported`
    /// @param globalFlowSupported `globalFlowSupported`
    /// @return the allocated `VkPhysicalDeviceOpticalFlowPropertiesNV`
    public static VkPhysicalDeviceOpticalFlowPropertiesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int supportedOutputGridSizes, int supportedHintGridSizes, int hintSupported, int costSupported, int bidirectionalFlowSupported, int globalFlowSupported) {
        return alloc(allocator).sType(sType).pNext(pNext).supportedOutputGridSizes(supportedOutputGridSizes).supportedHintGridSizes(supportedHintGridSizes).hintSupported(hintSupported).costSupported(costSupported).bidirectionalFlowSupported(bidirectionalFlowSupported).globalFlowSupported(globalFlowSupported);
    }

    /// Allocates a `VkPhysicalDeviceOpticalFlowPropertiesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param supportedOutputGridSizes `supportedOutputGridSizes`
    /// @param supportedHintGridSizes `supportedHintGridSizes`
    /// @param hintSupported `hintSupported`
    /// @param costSupported `costSupported`
    /// @param bidirectionalFlowSupported `bidirectionalFlowSupported`
    /// @return the allocated `VkPhysicalDeviceOpticalFlowPropertiesNV`
    public static VkPhysicalDeviceOpticalFlowPropertiesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int supportedOutputGridSizes, int supportedHintGridSizes, int hintSupported, int costSupported, int bidirectionalFlowSupported) {
        return alloc(allocator).sType(sType).pNext(pNext).supportedOutputGridSizes(supportedOutputGridSizes).supportedHintGridSizes(supportedHintGridSizes).hintSupported(hintSupported).costSupported(costSupported).bidirectionalFlowSupported(bidirectionalFlowSupported);
    }

    /// Allocates a `VkPhysicalDeviceOpticalFlowPropertiesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param supportedOutputGridSizes `supportedOutputGridSizes`
    /// @param supportedHintGridSizes `supportedHintGridSizes`
    /// @param hintSupported `hintSupported`
    /// @param costSupported `costSupported`
    /// @return the allocated `VkPhysicalDeviceOpticalFlowPropertiesNV`
    public static VkPhysicalDeviceOpticalFlowPropertiesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int supportedOutputGridSizes, int supportedHintGridSizes, int hintSupported, int costSupported) {
        return alloc(allocator).sType(sType).pNext(pNext).supportedOutputGridSizes(supportedOutputGridSizes).supportedHintGridSizes(supportedHintGridSizes).hintSupported(hintSupported).costSupported(costSupported);
    }

    /// Allocates a `VkPhysicalDeviceOpticalFlowPropertiesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param supportedOutputGridSizes `supportedOutputGridSizes`
    /// @param supportedHintGridSizes `supportedHintGridSizes`
    /// @param hintSupported `hintSupported`
    /// @return the allocated `VkPhysicalDeviceOpticalFlowPropertiesNV`
    public static VkPhysicalDeviceOpticalFlowPropertiesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int supportedOutputGridSizes, int supportedHintGridSizes, int hintSupported) {
        return alloc(allocator).sType(sType).pNext(pNext).supportedOutputGridSizes(supportedOutputGridSizes).supportedHintGridSizes(supportedHintGridSizes).hintSupported(hintSupported);
    }

    /// Allocates a `VkPhysicalDeviceOpticalFlowPropertiesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param supportedOutputGridSizes `supportedOutputGridSizes`
    /// @param supportedHintGridSizes `supportedHintGridSizes`
    /// @return the allocated `VkPhysicalDeviceOpticalFlowPropertiesNV`
    public static VkPhysicalDeviceOpticalFlowPropertiesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int supportedOutputGridSizes, int supportedHintGridSizes) {
        return alloc(allocator).sType(sType).pNext(pNext).supportedOutputGridSizes(supportedOutputGridSizes).supportedHintGridSizes(supportedHintGridSizes);
    }

    /// Allocates a `VkPhysicalDeviceOpticalFlowPropertiesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param supportedOutputGridSizes `supportedOutputGridSizes`
    /// @return the allocated `VkPhysicalDeviceOpticalFlowPropertiesNV`
    public static VkPhysicalDeviceOpticalFlowPropertiesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int supportedOutputGridSizes) {
        return alloc(allocator).sType(sType).pNext(pNext).supportedOutputGridSizes(supportedOutputGridSizes);
    }

    /// Allocates a `VkPhysicalDeviceOpticalFlowPropertiesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceOpticalFlowPropertiesNV`
    public static VkPhysicalDeviceOpticalFlowPropertiesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceOpticalFlowPropertiesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceOpticalFlowPropertiesNV`
    public static VkPhysicalDeviceOpticalFlowPropertiesNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV copyFrom(VkPhysicalDeviceOpticalFlowPropertiesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceOpticalFlowPropertiesNV reinterpret(long count) { return new VkPhysicalDeviceOpticalFlowPropertiesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceOpticalFlowPropertiesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceOpticalFlowPropertiesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `supportedOutputGridSizes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int supportedOutputGridSizes(MemorySegment segment, long index) { return (int) VH_supportedOutputGridSizes.get(segment, 0L, index); }
    /// {@return `supportedOutputGridSizes`}
    public int supportedOutputGridSizes() { return supportedOutputGridSizes(this.segment(), 0L); }
    /// Sets `supportedOutputGridSizes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void supportedOutputGridSizes(MemorySegment segment, long index, int value) { VH_supportedOutputGridSizes.set(segment, 0L, index, value); }
    /// Sets `supportedOutputGridSizes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV supportedOutputGridSizes(int value) { supportedOutputGridSizes(this.segment(), 0L, value); return this; }

    /// {@return `supportedHintGridSizes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int supportedHintGridSizes(MemorySegment segment, long index) { return (int) VH_supportedHintGridSizes.get(segment, 0L, index); }
    /// {@return `supportedHintGridSizes`}
    public int supportedHintGridSizes() { return supportedHintGridSizes(this.segment(), 0L); }
    /// Sets `supportedHintGridSizes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void supportedHintGridSizes(MemorySegment segment, long index, int value) { VH_supportedHintGridSizes.set(segment, 0L, index, value); }
    /// Sets `supportedHintGridSizes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV supportedHintGridSizes(int value) { supportedHintGridSizes(this.segment(), 0L, value); return this; }

    /// {@return `hintSupported` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int hintSupported(MemorySegment segment, long index) { return (int) VH_hintSupported.get(segment, 0L, index); }
    /// {@return `hintSupported`}
    public int hintSupported() { return hintSupported(this.segment(), 0L); }
    /// Sets `hintSupported` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void hintSupported(MemorySegment segment, long index, int value) { VH_hintSupported.set(segment, 0L, index, value); }
    /// Sets `hintSupported` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV hintSupported(int value) { hintSupported(this.segment(), 0L, value); return this; }

    /// {@return `costSupported` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int costSupported(MemorySegment segment, long index) { return (int) VH_costSupported.get(segment, 0L, index); }
    /// {@return `costSupported`}
    public int costSupported() { return costSupported(this.segment(), 0L); }
    /// Sets `costSupported` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void costSupported(MemorySegment segment, long index, int value) { VH_costSupported.set(segment, 0L, index, value); }
    /// Sets `costSupported` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV costSupported(int value) { costSupported(this.segment(), 0L, value); return this; }

    /// {@return `bidirectionalFlowSupported` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bidirectionalFlowSupported(MemorySegment segment, long index) { return (int) VH_bidirectionalFlowSupported.get(segment, 0L, index); }
    /// {@return `bidirectionalFlowSupported`}
    public int bidirectionalFlowSupported() { return bidirectionalFlowSupported(this.segment(), 0L); }
    /// Sets `bidirectionalFlowSupported` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bidirectionalFlowSupported(MemorySegment segment, long index, int value) { VH_bidirectionalFlowSupported.set(segment, 0L, index, value); }
    /// Sets `bidirectionalFlowSupported` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV bidirectionalFlowSupported(int value) { bidirectionalFlowSupported(this.segment(), 0L, value); return this; }

    /// {@return `globalFlowSupported` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int globalFlowSupported(MemorySegment segment, long index) { return (int) VH_globalFlowSupported.get(segment, 0L, index); }
    /// {@return `globalFlowSupported`}
    public int globalFlowSupported() { return globalFlowSupported(this.segment(), 0L); }
    /// Sets `globalFlowSupported` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void globalFlowSupported(MemorySegment segment, long index, int value) { VH_globalFlowSupported.set(segment, 0L, index, value); }
    /// Sets `globalFlowSupported` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV globalFlowSupported(int value) { globalFlowSupported(this.segment(), 0L, value); return this; }

    /// {@return `minWidth` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int minWidth(MemorySegment segment, long index) { return (int) VH_minWidth.get(segment, 0L, index); }
    /// {@return `minWidth`}
    public int minWidth() { return minWidth(this.segment(), 0L); }
    /// Sets `minWidth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minWidth(MemorySegment segment, long index, int value) { VH_minWidth.set(segment, 0L, index, value); }
    /// Sets `minWidth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV minWidth(int value) { minWidth(this.segment(), 0L, value); return this; }

    /// {@return `minHeight` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int minHeight(MemorySegment segment, long index) { return (int) VH_minHeight.get(segment, 0L, index); }
    /// {@return `minHeight`}
    public int minHeight() { return minHeight(this.segment(), 0L); }
    /// Sets `minHeight` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minHeight(MemorySegment segment, long index, int value) { VH_minHeight.set(segment, 0L, index, value); }
    /// Sets `minHeight` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV minHeight(int value) { minHeight(this.segment(), 0L, value); return this; }

    /// {@return `maxWidth` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxWidth(MemorySegment segment, long index) { return (int) VH_maxWidth.get(segment, 0L, index); }
    /// {@return `maxWidth`}
    public int maxWidth() { return maxWidth(this.segment(), 0L); }
    /// Sets `maxWidth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxWidth(MemorySegment segment, long index, int value) { VH_maxWidth.set(segment, 0L, index, value); }
    /// Sets `maxWidth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV maxWidth(int value) { maxWidth(this.segment(), 0L, value); return this; }

    /// {@return `maxHeight` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxHeight(MemorySegment segment, long index) { return (int) VH_maxHeight.get(segment, 0L, index); }
    /// {@return `maxHeight`}
    public int maxHeight() { return maxHeight(this.segment(), 0L); }
    /// Sets `maxHeight` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxHeight(MemorySegment segment, long index, int value) { VH_maxHeight.set(segment, 0L, index, value); }
    /// Sets `maxHeight` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV maxHeight(int value) { maxHeight(this.segment(), 0L, value); return this; }

    /// {@return `maxNumRegionsOfInterest` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxNumRegionsOfInterest(MemorySegment segment, long index) { return (int) VH_maxNumRegionsOfInterest.get(segment, 0L, index); }
    /// {@return `maxNumRegionsOfInterest`}
    public int maxNumRegionsOfInterest() { return maxNumRegionsOfInterest(this.segment(), 0L); }
    /// Sets `maxNumRegionsOfInterest` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxNumRegionsOfInterest(MemorySegment segment, long index, int value) { VH_maxNumRegionsOfInterest.set(segment, 0L, index, value); }
    /// Sets `maxNumRegionsOfInterest` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV maxNumRegionsOfInterest(int value) { maxNumRegionsOfInterest(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceOpticalFlowPropertiesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceOpticalFlowPropertiesNV`
    public VkPhysicalDeviceOpticalFlowPropertiesNV asSlice(long index) { return new VkPhysicalDeviceOpticalFlowPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceOpticalFlowPropertiesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceOpticalFlowPropertiesNV`
    public VkPhysicalDeviceOpticalFlowPropertiesNV asSlice(long index, long count) { return new VkPhysicalDeviceOpticalFlowPropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceOpticalFlowPropertiesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV at(long index, Consumer<VkPhysicalDeviceOpticalFlowPropertiesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `supportedOutputGridSizes` at the given index}
    /// @param index the index of the struct buffer
    public int supportedOutputGridSizesAt(long index) { return supportedOutputGridSizes(this.segment(), index); }
    /// Sets `supportedOutputGridSizes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV supportedOutputGridSizesAt(long index, int value) { supportedOutputGridSizes(this.segment(), index, value); return this; }

    /// {@return `supportedHintGridSizes` at the given index}
    /// @param index the index of the struct buffer
    public int supportedHintGridSizesAt(long index) { return supportedHintGridSizes(this.segment(), index); }
    /// Sets `supportedHintGridSizes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV supportedHintGridSizesAt(long index, int value) { supportedHintGridSizes(this.segment(), index, value); return this; }

    /// {@return `hintSupported` at the given index}
    /// @param index the index of the struct buffer
    public int hintSupportedAt(long index) { return hintSupported(this.segment(), index); }
    /// Sets `hintSupported` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV hintSupportedAt(long index, int value) { hintSupported(this.segment(), index, value); return this; }

    /// {@return `costSupported` at the given index}
    /// @param index the index of the struct buffer
    public int costSupportedAt(long index) { return costSupported(this.segment(), index); }
    /// Sets `costSupported` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV costSupportedAt(long index, int value) { costSupported(this.segment(), index, value); return this; }

    /// {@return `bidirectionalFlowSupported` at the given index}
    /// @param index the index of the struct buffer
    public int bidirectionalFlowSupportedAt(long index) { return bidirectionalFlowSupported(this.segment(), index); }
    /// Sets `bidirectionalFlowSupported` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV bidirectionalFlowSupportedAt(long index, int value) { bidirectionalFlowSupported(this.segment(), index, value); return this; }

    /// {@return `globalFlowSupported` at the given index}
    /// @param index the index of the struct buffer
    public int globalFlowSupportedAt(long index) { return globalFlowSupported(this.segment(), index); }
    /// Sets `globalFlowSupported` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV globalFlowSupportedAt(long index, int value) { globalFlowSupported(this.segment(), index, value); return this; }

    /// {@return `minWidth` at the given index}
    /// @param index the index of the struct buffer
    public int minWidthAt(long index) { return minWidth(this.segment(), index); }
    /// Sets `minWidth` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV minWidthAt(long index, int value) { minWidth(this.segment(), index, value); return this; }

    /// {@return `minHeight` at the given index}
    /// @param index the index of the struct buffer
    public int minHeightAt(long index) { return minHeight(this.segment(), index); }
    /// Sets `minHeight` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV minHeightAt(long index, int value) { minHeight(this.segment(), index, value); return this; }

    /// {@return `maxWidth` at the given index}
    /// @param index the index of the struct buffer
    public int maxWidthAt(long index) { return maxWidth(this.segment(), index); }
    /// Sets `maxWidth` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV maxWidthAt(long index, int value) { maxWidth(this.segment(), index, value); return this; }

    /// {@return `maxHeight` at the given index}
    /// @param index the index of the struct buffer
    public int maxHeightAt(long index) { return maxHeight(this.segment(), index); }
    /// Sets `maxHeight` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV maxHeightAt(long index, int value) { maxHeight(this.segment(), index, value); return this; }

    /// {@return `maxNumRegionsOfInterest` at the given index}
    /// @param index the index of the struct buffer
    public int maxNumRegionsOfInterestAt(long index) { return maxNumRegionsOfInterest(this.segment(), index); }
    /// Sets `maxNumRegionsOfInterest` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowPropertiesNV maxNumRegionsOfInterestAt(long index, int value) { maxNumRegionsOfInterest(this.segment(), index, value); return this; }

}

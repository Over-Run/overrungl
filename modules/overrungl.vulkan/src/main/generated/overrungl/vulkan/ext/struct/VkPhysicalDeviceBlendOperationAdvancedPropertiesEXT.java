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

/// ## Layout
/// ```
/// struct VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t advancedBlendMaxColorAttachments;
///     (uint32_t) VkBool32 advancedBlendIndependentBlend;
///     (uint32_t) VkBool32 advancedBlendNonPremultipliedSrcColor;
///     (uint32_t) VkBool32 advancedBlendNonPremultipliedDstColor;
///     (uint32_t) VkBool32 advancedBlendCorrelatedOverlap;
///     (uint32_t) VkBool32 advancedBlendAllOperations;
/// };
/// ```
public sealed class VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT extends GroupType {
    /// The struct layout of `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("advancedBlendMaxColorAttachments"),
        ValueLayout.JAVA_INT.withName("advancedBlendIndependentBlend"),
        ValueLayout.JAVA_INT.withName("advancedBlendNonPremultipliedSrcColor"),
        ValueLayout.JAVA_INT.withName("advancedBlendNonPremultipliedDstColor"),
        ValueLayout.JAVA_INT.withName("advancedBlendCorrelatedOverlap"),
        ValueLayout.JAVA_INT.withName("advancedBlendAllOperations")
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
    /// The byte offset of `advancedBlendMaxColorAttachments`.
    public static final long OFFSET_advancedBlendMaxColorAttachments = LAYOUT.byteOffset(PathElement.groupElement("advancedBlendMaxColorAttachments"));
    /// The memory layout of `advancedBlendMaxColorAttachments`.
    public static final MemoryLayout LAYOUT_advancedBlendMaxColorAttachments = LAYOUT.select(PathElement.groupElement("advancedBlendMaxColorAttachments"));
    /// The [VarHandle] of `advancedBlendMaxColorAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_advancedBlendMaxColorAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("advancedBlendMaxColorAttachments"));
    /// The byte offset of `advancedBlendIndependentBlend`.
    public static final long OFFSET_advancedBlendIndependentBlend = LAYOUT.byteOffset(PathElement.groupElement("advancedBlendIndependentBlend"));
    /// The memory layout of `advancedBlendIndependentBlend`.
    public static final MemoryLayout LAYOUT_advancedBlendIndependentBlend = LAYOUT.select(PathElement.groupElement("advancedBlendIndependentBlend"));
    /// The [VarHandle] of `advancedBlendIndependentBlend` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_advancedBlendIndependentBlend = LAYOUT.arrayElementVarHandle(PathElement.groupElement("advancedBlendIndependentBlend"));
    /// The byte offset of `advancedBlendNonPremultipliedSrcColor`.
    public static final long OFFSET_advancedBlendNonPremultipliedSrcColor = LAYOUT.byteOffset(PathElement.groupElement("advancedBlendNonPremultipliedSrcColor"));
    /// The memory layout of `advancedBlendNonPremultipliedSrcColor`.
    public static final MemoryLayout LAYOUT_advancedBlendNonPremultipliedSrcColor = LAYOUT.select(PathElement.groupElement("advancedBlendNonPremultipliedSrcColor"));
    /// The [VarHandle] of `advancedBlendNonPremultipliedSrcColor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_advancedBlendNonPremultipliedSrcColor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("advancedBlendNonPremultipliedSrcColor"));
    /// The byte offset of `advancedBlendNonPremultipliedDstColor`.
    public static final long OFFSET_advancedBlendNonPremultipliedDstColor = LAYOUT.byteOffset(PathElement.groupElement("advancedBlendNonPremultipliedDstColor"));
    /// The memory layout of `advancedBlendNonPremultipliedDstColor`.
    public static final MemoryLayout LAYOUT_advancedBlendNonPremultipliedDstColor = LAYOUT.select(PathElement.groupElement("advancedBlendNonPremultipliedDstColor"));
    /// The [VarHandle] of `advancedBlendNonPremultipliedDstColor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_advancedBlendNonPremultipliedDstColor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("advancedBlendNonPremultipliedDstColor"));
    /// The byte offset of `advancedBlendCorrelatedOverlap`.
    public static final long OFFSET_advancedBlendCorrelatedOverlap = LAYOUT.byteOffset(PathElement.groupElement("advancedBlendCorrelatedOverlap"));
    /// The memory layout of `advancedBlendCorrelatedOverlap`.
    public static final MemoryLayout LAYOUT_advancedBlendCorrelatedOverlap = LAYOUT.select(PathElement.groupElement("advancedBlendCorrelatedOverlap"));
    /// The [VarHandle] of `advancedBlendCorrelatedOverlap` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_advancedBlendCorrelatedOverlap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("advancedBlendCorrelatedOverlap"));
    /// The byte offset of `advancedBlendAllOperations`.
    public static final long OFFSET_advancedBlendAllOperations = LAYOUT.byteOffset(PathElement.groupElement("advancedBlendAllOperations"));
    /// The memory layout of `advancedBlendAllOperations`.
    public static final MemoryLayout LAYOUT_advancedBlendAllOperations = LAYOUT.select(PathElement.groupElement("advancedBlendAllOperations"));
    /// The [VarHandle] of `advancedBlendAllOperations` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_advancedBlendAllOperations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("advancedBlendAllOperations"));

    /// Creates `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT`
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param advancedBlendMaxColorAttachments `advancedBlendMaxColorAttachments`
    /// @param advancedBlendIndependentBlend `advancedBlendIndependentBlend`
    /// @param advancedBlendNonPremultipliedSrcColor `advancedBlendNonPremultipliedSrcColor`
    /// @param advancedBlendNonPremultipliedDstColor `advancedBlendNonPremultipliedDstColor`
    /// @param advancedBlendCorrelatedOverlap `advancedBlendCorrelatedOverlap`
    /// @param advancedBlendAllOperations `advancedBlendAllOperations`
    /// @return the allocated `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT`
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int advancedBlendMaxColorAttachments, int advancedBlendIndependentBlend, int advancedBlendNonPremultipliedSrcColor, int advancedBlendNonPremultipliedDstColor, int advancedBlendCorrelatedOverlap, int advancedBlendAllOperations) {
        return alloc(allocator).sType(sType).pNext(pNext).advancedBlendMaxColorAttachments(advancedBlendMaxColorAttachments).advancedBlendIndependentBlend(advancedBlendIndependentBlend).advancedBlendNonPremultipliedSrcColor(advancedBlendNonPremultipliedSrcColor).advancedBlendNonPremultipliedDstColor(advancedBlendNonPremultipliedDstColor).advancedBlendCorrelatedOverlap(advancedBlendCorrelatedOverlap).advancedBlendAllOperations(advancedBlendAllOperations);
    }

    /// Allocates a `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param advancedBlendMaxColorAttachments `advancedBlendMaxColorAttachments`
    /// @param advancedBlendIndependentBlend `advancedBlendIndependentBlend`
    /// @param advancedBlendNonPremultipliedSrcColor `advancedBlendNonPremultipliedSrcColor`
    /// @param advancedBlendNonPremultipliedDstColor `advancedBlendNonPremultipliedDstColor`
    /// @param advancedBlendCorrelatedOverlap `advancedBlendCorrelatedOverlap`
    /// @return the allocated `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT`
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int advancedBlendMaxColorAttachments, int advancedBlendIndependentBlend, int advancedBlendNonPremultipliedSrcColor, int advancedBlendNonPremultipliedDstColor, int advancedBlendCorrelatedOverlap) {
        return alloc(allocator).sType(sType).pNext(pNext).advancedBlendMaxColorAttachments(advancedBlendMaxColorAttachments).advancedBlendIndependentBlend(advancedBlendIndependentBlend).advancedBlendNonPremultipliedSrcColor(advancedBlendNonPremultipliedSrcColor).advancedBlendNonPremultipliedDstColor(advancedBlendNonPremultipliedDstColor).advancedBlendCorrelatedOverlap(advancedBlendCorrelatedOverlap);
    }

    /// Allocates a `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param advancedBlendMaxColorAttachments `advancedBlendMaxColorAttachments`
    /// @param advancedBlendIndependentBlend `advancedBlendIndependentBlend`
    /// @param advancedBlendNonPremultipliedSrcColor `advancedBlendNonPremultipliedSrcColor`
    /// @param advancedBlendNonPremultipliedDstColor `advancedBlendNonPremultipliedDstColor`
    /// @return the allocated `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT`
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int advancedBlendMaxColorAttachments, int advancedBlendIndependentBlend, int advancedBlendNonPremultipliedSrcColor, int advancedBlendNonPremultipliedDstColor) {
        return alloc(allocator).sType(sType).pNext(pNext).advancedBlendMaxColorAttachments(advancedBlendMaxColorAttachments).advancedBlendIndependentBlend(advancedBlendIndependentBlend).advancedBlendNonPremultipliedSrcColor(advancedBlendNonPremultipliedSrcColor).advancedBlendNonPremultipliedDstColor(advancedBlendNonPremultipliedDstColor);
    }

    /// Allocates a `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param advancedBlendMaxColorAttachments `advancedBlendMaxColorAttachments`
    /// @param advancedBlendIndependentBlend `advancedBlendIndependentBlend`
    /// @param advancedBlendNonPremultipliedSrcColor `advancedBlendNonPremultipliedSrcColor`
    /// @return the allocated `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT`
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int advancedBlendMaxColorAttachments, int advancedBlendIndependentBlend, int advancedBlendNonPremultipliedSrcColor) {
        return alloc(allocator).sType(sType).pNext(pNext).advancedBlendMaxColorAttachments(advancedBlendMaxColorAttachments).advancedBlendIndependentBlend(advancedBlendIndependentBlend).advancedBlendNonPremultipliedSrcColor(advancedBlendNonPremultipliedSrcColor);
    }

    /// Allocates a `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param advancedBlendMaxColorAttachments `advancedBlendMaxColorAttachments`
    /// @param advancedBlendIndependentBlend `advancedBlendIndependentBlend`
    /// @return the allocated `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT`
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int advancedBlendMaxColorAttachments, int advancedBlendIndependentBlend) {
        return alloc(allocator).sType(sType).pNext(pNext).advancedBlendMaxColorAttachments(advancedBlendMaxColorAttachments).advancedBlendIndependentBlend(advancedBlendIndependentBlend);
    }

    /// Allocates a `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param advancedBlendMaxColorAttachments `advancedBlendMaxColorAttachments`
    /// @return the allocated `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT`
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int advancedBlendMaxColorAttachments) {
        return alloc(allocator).sType(sType).pNext(pNext).advancedBlendMaxColorAttachments(advancedBlendMaxColorAttachments);
    }

    /// Allocates a `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT`
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT`
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT copyFrom(VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `advancedBlendMaxColorAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int advancedBlendMaxColorAttachments(MemorySegment segment, long index) { return (int) VH_advancedBlendMaxColorAttachments.get(segment, 0L, index); }
    /// {@return `advancedBlendMaxColorAttachments`}
    public int advancedBlendMaxColorAttachments() { return advancedBlendMaxColorAttachments(this.segment(), 0L); }
    /// Sets `advancedBlendMaxColorAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void advancedBlendMaxColorAttachments(MemorySegment segment, long index, int value) { VH_advancedBlendMaxColorAttachments.set(segment, 0L, index, value); }
    /// Sets `advancedBlendMaxColorAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendMaxColorAttachments(int value) { advancedBlendMaxColorAttachments(this.segment(), 0L, value); return this; }

    /// {@return `advancedBlendIndependentBlend` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int advancedBlendIndependentBlend(MemorySegment segment, long index) { return (int) VH_advancedBlendIndependentBlend.get(segment, 0L, index); }
    /// {@return `advancedBlendIndependentBlend`}
    public int advancedBlendIndependentBlend() { return advancedBlendIndependentBlend(this.segment(), 0L); }
    /// Sets `advancedBlendIndependentBlend` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void advancedBlendIndependentBlend(MemorySegment segment, long index, int value) { VH_advancedBlendIndependentBlend.set(segment, 0L, index, value); }
    /// Sets `advancedBlendIndependentBlend` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendIndependentBlend(int value) { advancedBlendIndependentBlend(this.segment(), 0L, value); return this; }

    /// {@return `advancedBlendNonPremultipliedSrcColor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int advancedBlendNonPremultipliedSrcColor(MemorySegment segment, long index) { return (int) VH_advancedBlendNonPremultipliedSrcColor.get(segment, 0L, index); }
    /// {@return `advancedBlendNonPremultipliedSrcColor`}
    public int advancedBlendNonPremultipliedSrcColor() { return advancedBlendNonPremultipliedSrcColor(this.segment(), 0L); }
    /// Sets `advancedBlendNonPremultipliedSrcColor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void advancedBlendNonPremultipliedSrcColor(MemorySegment segment, long index, int value) { VH_advancedBlendNonPremultipliedSrcColor.set(segment, 0L, index, value); }
    /// Sets `advancedBlendNonPremultipliedSrcColor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendNonPremultipliedSrcColor(int value) { advancedBlendNonPremultipliedSrcColor(this.segment(), 0L, value); return this; }

    /// {@return `advancedBlendNonPremultipliedDstColor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int advancedBlendNonPremultipliedDstColor(MemorySegment segment, long index) { return (int) VH_advancedBlendNonPremultipliedDstColor.get(segment, 0L, index); }
    /// {@return `advancedBlendNonPremultipliedDstColor`}
    public int advancedBlendNonPremultipliedDstColor() { return advancedBlendNonPremultipliedDstColor(this.segment(), 0L); }
    /// Sets `advancedBlendNonPremultipliedDstColor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void advancedBlendNonPremultipliedDstColor(MemorySegment segment, long index, int value) { VH_advancedBlendNonPremultipliedDstColor.set(segment, 0L, index, value); }
    /// Sets `advancedBlendNonPremultipliedDstColor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendNonPremultipliedDstColor(int value) { advancedBlendNonPremultipliedDstColor(this.segment(), 0L, value); return this; }

    /// {@return `advancedBlendCorrelatedOverlap` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int advancedBlendCorrelatedOverlap(MemorySegment segment, long index) { return (int) VH_advancedBlendCorrelatedOverlap.get(segment, 0L, index); }
    /// {@return `advancedBlendCorrelatedOverlap`}
    public int advancedBlendCorrelatedOverlap() { return advancedBlendCorrelatedOverlap(this.segment(), 0L); }
    /// Sets `advancedBlendCorrelatedOverlap` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void advancedBlendCorrelatedOverlap(MemorySegment segment, long index, int value) { VH_advancedBlendCorrelatedOverlap.set(segment, 0L, index, value); }
    /// Sets `advancedBlendCorrelatedOverlap` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendCorrelatedOverlap(int value) { advancedBlendCorrelatedOverlap(this.segment(), 0L, value); return this; }

    /// {@return `advancedBlendAllOperations` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int advancedBlendAllOperations(MemorySegment segment, long index) { return (int) VH_advancedBlendAllOperations.get(segment, 0L, index); }
    /// {@return `advancedBlendAllOperations`}
    public int advancedBlendAllOperations() { return advancedBlendAllOperations(this.segment(), 0L); }
    /// Sets `advancedBlendAllOperations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void advancedBlendAllOperations(MemorySegment segment, long index, int value) { VH_advancedBlendAllOperations.set(segment, 0L, index, value); }
    /// Sets `advancedBlendAllOperations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT advancedBlendAllOperations(int value) { advancedBlendAllOperations(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT].
    public static final class Buffer extends VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT`
        public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT asSlice(long index) { return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT`
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

        /// {@return `advancedBlendMaxColorAttachments` at the given index}
        /// @param index the index of the struct buffer
        public int advancedBlendMaxColorAttachmentsAt(long index) { return advancedBlendMaxColorAttachments(this.segment(), index); }
        /// Sets `advancedBlendMaxColorAttachments` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer advancedBlendMaxColorAttachmentsAt(long index, int value) { advancedBlendMaxColorAttachments(this.segment(), index, value); return this; }

        /// {@return `advancedBlendIndependentBlend` at the given index}
        /// @param index the index of the struct buffer
        public int advancedBlendIndependentBlendAt(long index) { return advancedBlendIndependentBlend(this.segment(), index); }
        /// Sets `advancedBlendIndependentBlend` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer advancedBlendIndependentBlendAt(long index, int value) { advancedBlendIndependentBlend(this.segment(), index, value); return this; }

        /// {@return `advancedBlendNonPremultipliedSrcColor` at the given index}
        /// @param index the index of the struct buffer
        public int advancedBlendNonPremultipliedSrcColorAt(long index) { return advancedBlendNonPremultipliedSrcColor(this.segment(), index); }
        /// Sets `advancedBlendNonPremultipliedSrcColor` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer advancedBlendNonPremultipliedSrcColorAt(long index, int value) { advancedBlendNonPremultipliedSrcColor(this.segment(), index, value); return this; }

        /// {@return `advancedBlendNonPremultipliedDstColor` at the given index}
        /// @param index the index of the struct buffer
        public int advancedBlendNonPremultipliedDstColorAt(long index) { return advancedBlendNonPremultipliedDstColor(this.segment(), index); }
        /// Sets `advancedBlendNonPremultipliedDstColor` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer advancedBlendNonPremultipliedDstColorAt(long index, int value) { advancedBlendNonPremultipliedDstColor(this.segment(), index, value); return this; }

        /// {@return `advancedBlendCorrelatedOverlap` at the given index}
        /// @param index the index of the struct buffer
        public int advancedBlendCorrelatedOverlapAt(long index) { return advancedBlendCorrelatedOverlap(this.segment(), index); }
        /// Sets `advancedBlendCorrelatedOverlap` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer advancedBlendCorrelatedOverlapAt(long index, int value) { advancedBlendCorrelatedOverlap(this.segment(), index, value); return this; }

        /// {@return `advancedBlendAllOperations` at the given index}
        /// @param index the index of the struct buffer
        public int advancedBlendAllOperationsAt(long index) { return advancedBlendAllOperations(this.segment(), index); }
        /// Sets `advancedBlendAllOperations` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer advancedBlendAllOperationsAt(long index, int value) { advancedBlendAllOperations(this.segment(), index, value); return this; }

    }
}

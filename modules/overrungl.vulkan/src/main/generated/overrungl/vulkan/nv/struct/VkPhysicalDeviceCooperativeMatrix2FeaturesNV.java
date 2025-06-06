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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceCooperativeMatrix2FeaturesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 cooperativeMatrixWorkgroupScope;
///     (uint32_t) VkBool32 cooperativeMatrixFlexibleDimensions;
///     (uint32_t) VkBool32 cooperativeMatrixReductions;
///     (uint32_t) VkBool32 cooperativeMatrixConversions;
///     (uint32_t) VkBool32 cooperativeMatrixPerElementOperations;
///     (uint32_t) VkBool32 cooperativeMatrixTensorAddressing;
///     (uint32_t) VkBool32 cooperativeMatrixBlockLoads;
/// };
/// ```
public sealed class VkPhysicalDeviceCooperativeMatrix2FeaturesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceCooperativeMatrix2FeaturesNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixWorkgroupScope"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixFlexibleDimensions"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixReductions"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixConversions"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixPerElementOperations"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixTensorAddressing"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixBlockLoads")
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
    /// The byte offset of `cooperativeMatrixWorkgroupScope`.
    public static final long OFFSET_cooperativeMatrixWorkgroupScope = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixWorkgroupScope"));
    /// The memory layout of `cooperativeMatrixWorkgroupScope`.
    public static final MemoryLayout LAYOUT_cooperativeMatrixWorkgroupScope = LAYOUT.select(PathElement.groupElement("cooperativeMatrixWorkgroupScope"));
    /// The [VarHandle] of `cooperativeMatrixWorkgroupScope` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_cooperativeMatrixWorkgroupScope = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixWorkgroupScope"));
    /// The byte offset of `cooperativeMatrixFlexibleDimensions`.
    public static final long OFFSET_cooperativeMatrixFlexibleDimensions = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixFlexibleDimensions"));
    /// The memory layout of `cooperativeMatrixFlexibleDimensions`.
    public static final MemoryLayout LAYOUT_cooperativeMatrixFlexibleDimensions = LAYOUT.select(PathElement.groupElement("cooperativeMatrixFlexibleDimensions"));
    /// The [VarHandle] of `cooperativeMatrixFlexibleDimensions` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_cooperativeMatrixFlexibleDimensions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixFlexibleDimensions"));
    /// The byte offset of `cooperativeMatrixReductions`.
    public static final long OFFSET_cooperativeMatrixReductions = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixReductions"));
    /// The memory layout of `cooperativeMatrixReductions`.
    public static final MemoryLayout LAYOUT_cooperativeMatrixReductions = LAYOUT.select(PathElement.groupElement("cooperativeMatrixReductions"));
    /// The [VarHandle] of `cooperativeMatrixReductions` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_cooperativeMatrixReductions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixReductions"));
    /// The byte offset of `cooperativeMatrixConversions`.
    public static final long OFFSET_cooperativeMatrixConversions = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixConversions"));
    /// The memory layout of `cooperativeMatrixConversions`.
    public static final MemoryLayout LAYOUT_cooperativeMatrixConversions = LAYOUT.select(PathElement.groupElement("cooperativeMatrixConversions"));
    /// The [VarHandle] of `cooperativeMatrixConversions` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_cooperativeMatrixConversions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixConversions"));
    /// The byte offset of `cooperativeMatrixPerElementOperations`.
    public static final long OFFSET_cooperativeMatrixPerElementOperations = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixPerElementOperations"));
    /// The memory layout of `cooperativeMatrixPerElementOperations`.
    public static final MemoryLayout LAYOUT_cooperativeMatrixPerElementOperations = LAYOUT.select(PathElement.groupElement("cooperativeMatrixPerElementOperations"));
    /// The [VarHandle] of `cooperativeMatrixPerElementOperations` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_cooperativeMatrixPerElementOperations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixPerElementOperations"));
    /// The byte offset of `cooperativeMatrixTensorAddressing`.
    public static final long OFFSET_cooperativeMatrixTensorAddressing = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixTensorAddressing"));
    /// The memory layout of `cooperativeMatrixTensorAddressing`.
    public static final MemoryLayout LAYOUT_cooperativeMatrixTensorAddressing = LAYOUT.select(PathElement.groupElement("cooperativeMatrixTensorAddressing"));
    /// The [VarHandle] of `cooperativeMatrixTensorAddressing` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_cooperativeMatrixTensorAddressing = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixTensorAddressing"));
    /// The byte offset of `cooperativeMatrixBlockLoads`.
    public static final long OFFSET_cooperativeMatrixBlockLoads = LAYOUT.byteOffset(PathElement.groupElement("cooperativeMatrixBlockLoads"));
    /// The memory layout of `cooperativeMatrixBlockLoads`.
    public static final MemoryLayout LAYOUT_cooperativeMatrixBlockLoads = LAYOUT.select(PathElement.groupElement("cooperativeMatrixBlockLoads"));
    /// The [VarHandle] of `cooperativeMatrixBlockLoads` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_cooperativeMatrixBlockLoads = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixBlockLoads"));

    /// Creates `VkPhysicalDeviceCooperativeMatrix2FeaturesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceCooperativeMatrix2FeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceCooperativeMatrix2FeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceCooperativeMatrix2FeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrix2FeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrix2FeaturesNV`
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrix2FeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrix2FeaturesNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrix2FeaturesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param cooperativeMatrixWorkgroupScope `cooperativeMatrixWorkgroupScope`
    /// @param cooperativeMatrixFlexibleDimensions `cooperativeMatrixFlexibleDimensions`
    /// @param cooperativeMatrixReductions `cooperativeMatrixReductions`
    /// @param cooperativeMatrixConversions `cooperativeMatrixConversions`
    /// @param cooperativeMatrixPerElementOperations `cooperativeMatrixPerElementOperations`
    /// @param cooperativeMatrixTensorAddressing `cooperativeMatrixTensorAddressing`
    /// @param cooperativeMatrixBlockLoads `cooperativeMatrixBlockLoads`
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrix2FeaturesNV`
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int cooperativeMatrixWorkgroupScope, int cooperativeMatrixFlexibleDimensions, int cooperativeMatrixReductions, int cooperativeMatrixConversions, int cooperativeMatrixPerElementOperations, int cooperativeMatrixTensorAddressing, int cooperativeMatrixBlockLoads) {
        return alloc(allocator).sType(sType).pNext(pNext).cooperativeMatrixWorkgroupScope(cooperativeMatrixWorkgroupScope).cooperativeMatrixFlexibleDimensions(cooperativeMatrixFlexibleDimensions).cooperativeMatrixReductions(cooperativeMatrixReductions).cooperativeMatrixConversions(cooperativeMatrixConversions).cooperativeMatrixPerElementOperations(cooperativeMatrixPerElementOperations).cooperativeMatrixTensorAddressing(cooperativeMatrixTensorAddressing).cooperativeMatrixBlockLoads(cooperativeMatrixBlockLoads);
    }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrix2FeaturesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param cooperativeMatrixWorkgroupScope `cooperativeMatrixWorkgroupScope`
    /// @param cooperativeMatrixFlexibleDimensions `cooperativeMatrixFlexibleDimensions`
    /// @param cooperativeMatrixReductions `cooperativeMatrixReductions`
    /// @param cooperativeMatrixConversions `cooperativeMatrixConversions`
    /// @param cooperativeMatrixPerElementOperations `cooperativeMatrixPerElementOperations`
    /// @param cooperativeMatrixTensorAddressing `cooperativeMatrixTensorAddressing`
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrix2FeaturesNV`
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int cooperativeMatrixWorkgroupScope, int cooperativeMatrixFlexibleDimensions, int cooperativeMatrixReductions, int cooperativeMatrixConversions, int cooperativeMatrixPerElementOperations, int cooperativeMatrixTensorAddressing) {
        return alloc(allocator).sType(sType).pNext(pNext).cooperativeMatrixWorkgroupScope(cooperativeMatrixWorkgroupScope).cooperativeMatrixFlexibleDimensions(cooperativeMatrixFlexibleDimensions).cooperativeMatrixReductions(cooperativeMatrixReductions).cooperativeMatrixConversions(cooperativeMatrixConversions).cooperativeMatrixPerElementOperations(cooperativeMatrixPerElementOperations).cooperativeMatrixTensorAddressing(cooperativeMatrixTensorAddressing);
    }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrix2FeaturesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param cooperativeMatrixWorkgroupScope `cooperativeMatrixWorkgroupScope`
    /// @param cooperativeMatrixFlexibleDimensions `cooperativeMatrixFlexibleDimensions`
    /// @param cooperativeMatrixReductions `cooperativeMatrixReductions`
    /// @param cooperativeMatrixConversions `cooperativeMatrixConversions`
    /// @param cooperativeMatrixPerElementOperations `cooperativeMatrixPerElementOperations`
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrix2FeaturesNV`
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int cooperativeMatrixWorkgroupScope, int cooperativeMatrixFlexibleDimensions, int cooperativeMatrixReductions, int cooperativeMatrixConversions, int cooperativeMatrixPerElementOperations) {
        return alloc(allocator).sType(sType).pNext(pNext).cooperativeMatrixWorkgroupScope(cooperativeMatrixWorkgroupScope).cooperativeMatrixFlexibleDimensions(cooperativeMatrixFlexibleDimensions).cooperativeMatrixReductions(cooperativeMatrixReductions).cooperativeMatrixConversions(cooperativeMatrixConversions).cooperativeMatrixPerElementOperations(cooperativeMatrixPerElementOperations);
    }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrix2FeaturesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param cooperativeMatrixWorkgroupScope `cooperativeMatrixWorkgroupScope`
    /// @param cooperativeMatrixFlexibleDimensions `cooperativeMatrixFlexibleDimensions`
    /// @param cooperativeMatrixReductions `cooperativeMatrixReductions`
    /// @param cooperativeMatrixConversions `cooperativeMatrixConversions`
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrix2FeaturesNV`
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int cooperativeMatrixWorkgroupScope, int cooperativeMatrixFlexibleDimensions, int cooperativeMatrixReductions, int cooperativeMatrixConversions) {
        return alloc(allocator).sType(sType).pNext(pNext).cooperativeMatrixWorkgroupScope(cooperativeMatrixWorkgroupScope).cooperativeMatrixFlexibleDimensions(cooperativeMatrixFlexibleDimensions).cooperativeMatrixReductions(cooperativeMatrixReductions).cooperativeMatrixConversions(cooperativeMatrixConversions);
    }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrix2FeaturesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param cooperativeMatrixWorkgroupScope `cooperativeMatrixWorkgroupScope`
    /// @param cooperativeMatrixFlexibleDimensions `cooperativeMatrixFlexibleDimensions`
    /// @param cooperativeMatrixReductions `cooperativeMatrixReductions`
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrix2FeaturesNV`
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int cooperativeMatrixWorkgroupScope, int cooperativeMatrixFlexibleDimensions, int cooperativeMatrixReductions) {
        return alloc(allocator).sType(sType).pNext(pNext).cooperativeMatrixWorkgroupScope(cooperativeMatrixWorkgroupScope).cooperativeMatrixFlexibleDimensions(cooperativeMatrixFlexibleDimensions).cooperativeMatrixReductions(cooperativeMatrixReductions);
    }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrix2FeaturesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param cooperativeMatrixWorkgroupScope `cooperativeMatrixWorkgroupScope`
    /// @param cooperativeMatrixFlexibleDimensions `cooperativeMatrixFlexibleDimensions`
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrix2FeaturesNV`
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int cooperativeMatrixWorkgroupScope, int cooperativeMatrixFlexibleDimensions) {
        return alloc(allocator).sType(sType).pNext(pNext).cooperativeMatrixWorkgroupScope(cooperativeMatrixWorkgroupScope).cooperativeMatrixFlexibleDimensions(cooperativeMatrixFlexibleDimensions);
    }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrix2FeaturesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param cooperativeMatrixWorkgroupScope `cooperativeMatrixWorkgroupScope`
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrix2FeaturesNV`
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int cooperativeMatrixWorkgroupScope) {
        return alloc(allocator).sType(sType).pNext(pNext).cooperativeMatrixWorkgroupScope(cooperativeMatrixWorkgroupScope);
    }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrix2FeaturesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrix2FeaturesNV`
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrix2FeaturesNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrix2FeaturesNV`
    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV copyFrom(VkPhysicalDeviceCooperativeMatrix2FeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `cooperativeMatrixWorkgroupScope` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int cooperativeMatrixWorkgroupScope(MemorySegment segment, long index) { return (int) VH_cooperativeMatrixWorkgroupScope.get(segment, 0L, index); }
    /// {@return `cooperativeMatrixWorkgroupScope`}
    public int cooperativeMatrixWorkgroupScope() { return cooperativeMatrixWorkgroupScope(this.segment(), 0L); }
    /// Sets `cooperativeMatrixWorkgroupScope` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cooperativeMatrixWorkgroupScope(MemorySegment segment, long index, int value) { VH_cooperativeMatrixWorkgroupScope.set(segment, 0L, index, value); }
    /// Sets `cooperativeMatrixWorkgroupScope` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixWorkgroupScope(int value) { cooperativeMatrixWorkgroupScope(this.segment(), 0L, value); return this; }

    /// {@return `cooperativeMatrixFlexibleDimensions` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int cooperativeMatrixFlexibleDimensions(MemorySegment segment, long index) { return (int) VH_cooperativeMatrixFlexibleDimensions.get(segment, 0L, index); }
    /// {@return `cooperativeMatrixFlexibleDimensions`}
    public int cooperativeMatrixFlexibleDimensions() { return cooperativeMatrixFlexibleDimensions(this.segment(), 0L); }
    /// Sets `cooperativeMatrixFlexibleDimensions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cooperativeMatrixFlexibleDimensions(MemorySegment segment, long index, int value) { VH_cooperativeMatrixFlexibleDimensions.set(segment, 0L, index, value); }
    /// Sets `cooperativeMatrixFlexibleDimensions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixFlexibleDimensions(int value) { cooperativeMatrixFlexibleDimensions(this.segment(), 0L, value); return this; }

    /// {@return `cooperativeMatrixReductions` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int cooperativeMatrixReductions(MemorySegment segment, long index) { return (int) VH_cooperativeMatrixReductions.get(segment, 0L, index); }
    /// {@return `cooperativeMatrixReductions`}
    public int cooperativeMatrixReductions() { return cooperativeMatrixReductions(this.segment(), 0L); }
    /// Sets `cooperativeMatrixReductions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cooperativeMatrixReductions(MemorySegment segment, long index, int value) { VH_cooperativeMatrixReductions.set(segment, 0L, index, value); }
    /// Sets `cooperativeMatrixReductions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixReductions(int value) { cooperativeMatrixReductions(this.segment(), 0L, value); return this; }

    /// {@return `cooperativeMatrixConversions` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int cooperativeMatrixConversions(MemorySegment segment, long index) { return (int) VH_cooperativeMatrixConversions.get(segment, 0L, index); }
    /// {@return `cooperativeMatrixConversions`}
    public int cooperativeMatrixConversions() { return cooperativeMatrixConversions(this.segment(), 0L); }
    /// Sets `cooperativeMatrixConversions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cooperativeMatrixConversions(MemorySegment segment, long index, int value) { VH_cooperativeMatrixConversions.set(segment, 0L, index, value); }
    /// Sets `cooperativeMatrixConversions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixConversions(int value) { cooperativeMatrixConversions(this.segment(), 0L, value); return this; }

    /// {@return `cooperativeMatrixPerElementOperations` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int cooperativeMatrixPerElementOperations(MemorySegment segment, long index) { return (int) VH_cooperativeMatrixPerElementOperations.get(segment, 0L, index); }
    /// {@return `cooperativeMatrixPerElementOperations`}
    public int cooperativeMatrixPerElementOperations() { return cooperativeMatrixPerElementOperations(this.segment(), 0L); }
    /// Sets `cooperativeMatrixPerElementOperations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cooperativeMatrixPerElementOperations(MemorySegment segment, long index, int value) { VH_cooperativeMatrixPerElementOperations.set(segment, 0L, index, value); }
    /// Sets `cooperativeMatrixPerElementOperations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixPerElementOperations(int value) { cooperativeMatrixPerElementOperations(this.segment(), 0L, value); return this; }

    /// {@return `cooperativeMatrixTensorAddressing` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int cooperativeMatrixTensorAddressing(MemorySegment segment, long index) { return (int) VH_cooperativeMatrixTensorAddressing.get(segment, 0L, index); }
    /// {@return `cooperativeMatrixTensorAddressing`}
    public int cooperativeMatrixTensorAddressing() { return cooperativeMatrixTensorAddressing(this.segment(), 0L); }
    /// Sets `cooperativeMatrixTensorAddressing` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cooperativeMatrixTensorAddressing(MemorySegment segment, long index, int value) { VH_cooperativeMatrixTensorAddressing.set(segment, 0L, index, value); }
    /// Sets `cooperativeMatrixTensorAddressing` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixTensorAddressing(int value) { cooperativeMatrixTensorAddressing(this.segment(), 0L, value); return this; }

    /// {@return `cooperativeMatrixBlockLoads` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int cooperativeMatrixBlockLoads(MemorySegment segment, long index) { return (int) VH_cooperativeMatrixBlockLoads.get(segment, 0L, index); }
    /// {@return `cooperativeMatrixBlockLoads`}
    public int cooperativeMatrixBlockLoads() { return cooperativeMatrixBlockLoads(this.segment(), 0L); }
    /// Sets `cooperativeMatrixBlockLoads` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void cooperativeMatrixBlockLoads(MemorySegment segment, long index, int value) { VH_cooperativeMatrixBlockLoads.set(segment, 0L, index, value); }
    /// Sets `cooperativeMatrixBlockLoads` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2FeaturesNV cooperativeMatrixBlockLoads(int value) { cooperativeMatrixBlockLoads(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceCooperativeMatrix2FeaturesNV].
    public static final class Buffer extends VkPhysicalDeviceCooperativeMatrix2FeaturesNV {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceCooperativeMatrix2FeaturesNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceCooperativeMatrix2FeaturesNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceCooperativeMatrix2FeaturesNV`
        public VkPhysicalDeviceCooperativeMatrix2FeaturesNV asSlice(long index) { return new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceCooperativeMatrix2FeaturesNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceCooperativeMatrix2FeaturesNV`
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

        /// {@return `cooperativeMatrixWorkgroupScope` at the given index}
        /// @param index the index of the struct buffer
        public int cooperativeMatrixWorkgroupScopeAt(long index) { return cooperativeMatrixWorkgroupScope(this.segment(), index); }
        /// Sets `cooperativeMatrixWorkgroupScope` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer cooperativeMatrixWorkgroupScopeAt(long index, int value) { cooperativeMatrixWorkgroupScope(this.segment(), index, value); return this; }

        /// {@return `cooperativeMatrixFlexibleDimensions` at the given index}
        /// @param index the index of the struct buffer
        public int cooperativeMatrixFlexibleDimensionsAt(long index) { return cooperativeMatrixFlexibleDimensions(this.segment(), index); }
        /// Sets `cooperativeMatrixFlexibleDimensions` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer cooperativeMatrixFlexibleDimensionsAt(long index, int value) { cooperativeMatrixFlexibleDimensions(this.segment(), index, value); return this; }

        /// {@return `cooperativeMatrixReductions` at the given index}
        /// @param index the index of the struct buffer
        public int cooperativeMatrixReductionsAt(long index) { return cooperativeMatrixReductions(this.segment(), index); }
        /// Sets `cooperativeMatrixReductions` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer cooperativeMatrixReductionsAt(long index, int value) { cooperativeMatrixReductions(this.segment(), index, value); return this; }

        /// {@return `cooperativeMatrixConversions` at the given index}
        /// @param index the index of the struct buffer
        public int cooperativeMatrixConversionsAt(long index) { return cooperativeMatrixConversions(this.segment(), index); }
        /// Sets `cooperativeMatrixConversions` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer cooperativeMatrixConversionsAt(long index, int value) { cooperativeMatrixConversions(this.segment(), index, value); return this; }

        /// {@return `cooperativeMatrixPerElementOperations` at the given index}
        /// @param index the index of the struct buffer
        public int cooperativeMatrixPerElementOperationsAt(long index) { return cooperativeMatrixPerElementOperations(this.segment(), index); }
        /// Sets `cooperativeMatrixPerElementOperations` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer cooperativeMatrixPerElementOperationsAt(long index, int value) { cooperativeMatrixPerElementOperations(this.segment(), index, value); return this; }

        /// {@return `cooperativeMatrixTensorAddressing` at the given index}
        /// @param index the index of the struct buffer
        public int cooperativeMatrixTensorAddressingAt(long index) { return cooperativeMatrixTensorAddressing(this.segment(), index); }
        /// Sets `cooperativeMatrixTensorAddressing` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer cooperativeMatrixTensorAddressingAt(long index, int value) { cooperativeMatrixTensorAddressing(this.segment(), index, value); return this; }

        /// {@return `cooperativeMatrixBlockLoads` at the given index}
        /// @param index the index of the struct buffer
        public int cooperativeMatrixBlockLoadsAt(long index) { return cooperativeMatrixBlockLoads(this.segment(), index); }
        /// Sets `cooperativeMatrixBlockLoads` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer cooperativeMatrixBlockLoadsAt(long index, int value) { cooperativeMatrixBlockLoads(this.segment(), index, value); return this; }

    }
}

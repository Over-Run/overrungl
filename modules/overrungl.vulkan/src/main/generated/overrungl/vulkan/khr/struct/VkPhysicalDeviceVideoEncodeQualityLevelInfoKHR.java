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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     const VkVideoProfileInfoKHR* pVideoProfile;
///     uint32_t qualityLevel;
/// };
/// ```
public final class VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pVideoProfile"),
        ValueLayout.JAVA_INT.withName("qualityLevel")
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
    /// The byte offset of `pVideoProfile`.
    public static final long OFFSET_pVideoProfile = LAYOUT.byteOffset(PathElement.groupElement("pVideoProfile"));
    /// The memory layout of `pVideoProfile`.
    public static final MemoryLayout LAYOUT_pVideoProfile = LAYOUT.select(PathElement.groupElement("pVideoProfile"));
    /// The [VarHandle] of `pVideoProfile` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pVideoProfile = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pVideoProfile"));
    /// The byte offset of `qualityLevel`.
    public static final long OFFSET_qualityLevel = LAYOUT.byteOffset(PathElement.groupElement("qualityLevel"));
    /// The memory layout of `qualityLevel`.
    public static final MemoryLayout LAYOUT_qualityLevel = LAYOUT.select(PathElement.groupElement("qualityLevel"));
    /// The [VarHandle] of `qualityLevel` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_qualityLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("qualityLevel"));

    /// Creates `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR`
    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR`
    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pVideoProfile `pVideoProfile`
    /// @param qualityLevel `qualityLevel`
    /// @return the allocated `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR`
    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pVideoProfile, int qualityLevel) {
        return alloc(allocator).sType(sType).pNext(pNext).pVideoProfile(pVideoProfile).qualityLevel(qualityLevel);
    }

    /// Allocates a `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param pVideoProfile `pVideoProfile`
    /// @return the allocated `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR`
    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment pVideoProfile) {
        return alloc(allocator).sType(sType).pNext(pNext).pVideoProfile(pVideoProfile);
    }

    /// Allocates a `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR`
    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR`
    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR copyFrom(VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR reinterpret(long count) { return new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pVideoProfile` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pVideoProfile(MemorySegment segment, long index) { return (MemorySegment) VH_pVideoProfile.get(segment, 0L, index); }
    /// {@return `pVideoProfile`}
    public MemorySegment pVideoProfile() { return pVideoProfile(this.segment(), 0L); }
    /// Sets `pVideoProfile` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pVideoProfile(MemorySegment segment, long index, MemorySegment value) { VH_pVideoProfile.set(segment, 0L, index, value); }
    /// Sets `pVideoProfile` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR pVideoProfile(MemorySegment value) { pVideoProfile(this.segment(), 0L, value); return this; }

    /// {@return `qualityLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int qualityLevel(MemorySegment segment, long index) { return (int) VH_qualityLevel.get(segment, 0L, index); }
    /// {@return `qualityLevel`}
    public int qualityLevel() { return qualityLevel(this.segment(), 0L); }
    /// Sets `qualityLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void qualityLevel(MemorySegment segment, long index, int value) { VH_qualityLevel.set(segment, 0L, index, value); }
    /// Sets `qualityLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR qualityLevel(int value) { qualityLevel(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR`
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR asSlice(long index) { return new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR`
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR asSlice(long index, long count) { return new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR at(long index, Consumer<VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `pVideoProfile` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pVideoProfileAt(long index) { return pVideoProfile(this.segment(), index); }
    /// Sets `pVideoProfile` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR pVideoProfileAt(long index, MemorySegment value) { pVideoProfile(this.segment(), index, value); return this; }

    /// {@return `qualityLevel` at the given index}
    /// @param index the index of the struct buffer
    public int qualityLevelAt(long index) { return qualityLevel(this.segment(), index); }
    /// Sets `qualityLevel` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR qualityLevelAt(long index, int value) { qualityLevel(this.segment(), index, value); return this; }

}

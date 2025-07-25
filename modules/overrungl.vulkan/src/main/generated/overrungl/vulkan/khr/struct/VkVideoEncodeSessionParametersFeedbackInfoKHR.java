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
/// struct VkVideoEncodeSessionParametersFeedbackInfoKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 hasOverrides;
/// };
/// ```
public final class VkVideoEncodeSessionParametersFeedbackInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeSessionParametersFeedbackInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("hasOverrides")
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
    /// The byte offset of `hasOverrides`.
    public static final long OFFSET_hasOverrides = LAYOUT.byteOffset(PathElement.groupElement("hasOverrides"));
    /// The memory layout of `hasOverrides`.
    public static final MemoryLayout LAYOUT_hasOverrides = LAYOUT.select(PathElement.groupElement("hasOverrides"));
    /// The [VarHandle] of `hasOverrides` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_hasOverrides = LAYOUT.arrayElementVarHandle(PathElement.groupElement("hasOverrides"));

    /// Creates `VkVideoEncodeSessionParametersFeedbackInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeSessionParametersFeedbackInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeSessionParametersFeedbackInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeSessionParametersFeedbackInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeSessionParametersFeedbackInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeSessionParametersFeedbackInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeSessionParametersFeedbackInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeSessionParametersFeedbackInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeSessionParametersFeedbackInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeSessionParametersFeedbackInfoKHR`
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeSessionParametersFeedbackInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeSessionParametersFeedbackInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeSessionParametersFeedbackInfoKHR`
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeSessionParametersFeedbackInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoEncodeSessionParametersFeedbackInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param hasOverrides `hasOverrides`
    /// @return the allocated `VkVideoEncodeSessionParametersFeedbackInfoKHR`
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int hasOverrides) {
        return alloc(allocator).sType(sType).pNext(pNext).hasOverrides(hasOverrides);
    }

    /// Allocates a `VkVideoEncodeSessionParametersFeedbackInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkVideoEncodeSessionParametersFeedbackInfoKHR`
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkVideoEncodeSessionParametersFeedbackInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkVideoEncodeSessionParametersFeedbackInfoKHR`
    public static VkVideoEncodeSessionParametersFeedbackInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeSessionParametersFeedbackInfoKHR copyFrom(VkVideoEncodeSessionParametersFeedbackInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeSessionParametersFeedbackInfoKHR reinterpret(long count) { return new VkVideoEncodeSessionParametersFeedbackInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoEncodeSessionParametersFeedbackInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeSessionParametersFeedbackInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `hasOverrides` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int hasOverrides(MemorySegment segment, long index) { return (int) VH_hasOverrides.get(segment, 0L, index); }
    /// {@return `hasOverrides`}
    public int hasOverrides() { return hasOverrides(this.segment(), 0L); }
    /// Sets `hasOverrides` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void hasOverrides(MemorySegment segment, long index, int value) { VH_hasOverrides.set(segment, 0L, index, value); }
    /// Sets `hasOverrides` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeSessionParametersFeedbackInfoKHR hasOverrides(int value) { hasOverrides(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoEncodeSessionParametersFeedbackInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeSessionParametersFeedbackInfoKHR`
    public VkVideoEncodeSessionParametersFeedbackInfoKHR asSlice(long index) { return new VkVideoEncodeSessionParametersFeedbackInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeSessionParametersFeedbackInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeSessionParametersFeedbackInfoKHR`
    public VkVideoEncodeSessionParametersFeedbackInfoKHR asSlice(long index, long count) { return new VkVideoEncodeSessionParametersFeedbackInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeSessionParametersFeedbackInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeSessionParametersFeedbackInfoKHR at(long index, Consumer<VkVideoEncodeSessionParametersFeedbackInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeSessionParametersFeedbackInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeSessionParametersFeedbackInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `hasOverrides` at the given index}
    /// @param index the index of the struct buffer
    public int hasOverridesAt(long index) { return hasOverrides(this.segment(), index); }
    /// Sets `hasOverrides` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeSessionParametersFeedbackInfoKHR hasOverridesAt(long index, int value) { hasOverrides(this.segment(), index, value); return this; }

}

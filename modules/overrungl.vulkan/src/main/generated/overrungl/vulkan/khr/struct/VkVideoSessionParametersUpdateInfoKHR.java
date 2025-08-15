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
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkVideoSessionParametersUpdateInfoKHR`.
/// ## Layout
/// ```
/// struct VkVideoSessionParametersUpdateInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t updateSequenceCount;
/// };
/// ```
public final class VkVideoSessionParametersUpdateInfoKHR extends GroupType {
    /// The struct layout of `VkVideoSessionParametersUpdateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("updateSequenceCount")
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
    /// The byte offset of `updateSequenceCount`.
    public static final long OFFSET_updateSequenceCount = LAYOUT.byteOffset(PathElement.groupElement("updateSequenceCount"));
    /// The memory layout of `updateSequenceCount`.
    public static final MemoryLayout LAYOUT_updateSequenceCount = LAYOUT.select(PathElement.groupElement("updateSequenceCount"));
    /// The [VarHandle] of `updateSequenceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_updateSequenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("updateSequenceCount"));

    /// Creates `VkVideoSessionParametersUpdateInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoSessionParametersUpdateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoSessionParametersUpdateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoSessionParametersUpdateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoSessionParametersUpdateInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoSessionParametersUpdateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoSessionParametersUpdateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoSessionParametersUpdateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoSessionParametersUpdateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoSessionParametersUpdateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoSessionParametersUpdateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoSessionParametersUpdateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoSessionParametersUpdateInfoKHR`
    public static VkVideoSessionParametersUpdateInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoSessionParametersUpdateInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoSessionParametersUpdateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoSessionParametersUpdateInfoKHR`
    public static VkVideoSessionParametersUpdateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoSessionParametersUpdateInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoSessionParametersUpdateInfoKHR copyFrom(VkVideoSessionParametersUpdateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoSessionParametersUpdateInfoKHR reinterpret(long count) { return new VkVideoSessionParametersUpdateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoSessionParametersUpdateInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoSessionParametersUpdateInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `updateSequenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int updateSequenceCount(MemorySegment segment, long index) { return (int) VH_updateSequenceCount.get(segment, 0L, index); }
    /// {@return `updateSequenceCount`}
    public int updateSequenceCount() { return updateSequenceCount(this.segment(), 0L); }
    /// Sets `updateSequenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void updateSequenceCount(MemorySegment segment, long index, int value) { VH_updateSequenceCount.set(segment, 0L, index, value); }
    /// Sets `updateSequenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoSessionParametersUpdateInfoKHR updateSequenceCount(int value) { updateSequenceCount(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoSessionParametersUpdateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoSessionParametersUpdateInfoKHR`
    public VkVideoSessionParametersUpdateInfoKHR asSlice(long index) { return new VkVideoSessionParametersUpdateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoSessionParametersUpdateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoSessionParametersUpdateInfoKHR`
    public VkVideoSessionParametersUpdateInfoKHR asSlice(long index, long count) { return new VkVideoSessionParametersUpdateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoSessionParametersUpdateInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoSessionParametersUpdateInfoKHR at(long index, Consumer<VkVideoSessionParametersUpdateInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoSessionParametersUpdateInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoSessionParametersUpdateInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `updateSequenceCount` at the given index}
    /// @param index the index of the struct buffer
    public int updateSequenceCountAt(long index) { return updateSequenceCount(this.segment(), index); }
    /// Sets `updateSequenceCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoSessionParametersUpdateInfoKHR updateSequenceCountAt(long index, int value) { updateSequenceCount(this.segment(), index, value); return this; }

}

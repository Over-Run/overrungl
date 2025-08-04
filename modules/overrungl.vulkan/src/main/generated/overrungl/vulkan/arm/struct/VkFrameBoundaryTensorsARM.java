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
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkFrameBoundaryTensorsARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t tensorCount;
///     const VkTensorARM* pTensors;
/// };
/// ```
public final class VkFrameBoundaryTensorsARM extends GroupType {
    /// The struct layout of `VkFrameBoundaryTensorsARM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("tensorCount"),
        ValueLayout.ADDRESS.withName("pTensors")
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
    /// The byte offset of `tensorCount`.
    public static final long OFFSET_tensorCount = LAYOUT.byteOffset(PathElement.groupElement("tensorCount"));
    /// The memory layout of `tensorCount`.
    public static final MemoryLayout LAYOUT_tensorCount = LAYOUT.select(PathElement.groupElement("tensorCount"));
    /// The [VarHandle] of `tensorCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tensorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tensorCount"));
    /// The byte offset of `pTensors`.
    public static final long OFFSET_pTensors = LAYOUT.byteOffset(PathElement.groupElement("pTensors"));
    /// The memory layout of `pTensors`.
    public static final MemoryLayout LAYOUT_pTensors = LAYOUT.select(PathElement.groupElement("pTensors"));
    /// The [VarHandle] of `pTensors` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pTensors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTensors"));

    /// Creates `VkFrameBoundaryTensorsARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkFrameBoundaryTensorsARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkFrameBoundaryTensorsARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFrameBoundaryTensorsARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFrameBoundaryTensorsARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkFrameBoundaryTensorsARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFrameBoundaryTensorsARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFrameBoundaryTensorsARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkFrameBoundaryTensorsARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFrameBoundaryTensorsARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkFrameBoundaryTensorsARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkFrameBoundaryTensorsARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFrameBoundaryTensorsARM`
    public static VkFrameBoundaryTensorsARM alloc(SegmentAllocator allocator) { return new VkFrameBoundaryTensorsARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkFrameBoundaryTensorsARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkFrameBoundaryTensorsARM`
    public static VkFrameBoundaryTensorsARM alloc(SegmentAllocator allocator, long count) { return new VkFrameBoundaryTensorsARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkFrameBoundaryTensorsARM copyFrom(VkFrameBoundaryTensorsARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkFrameBoundaryTensorsARM reinterpret(long count) { return new VkFrameBoundaryTensorsARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkFrameBoundaryTensorsARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkFrameBoundaryTensorsARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `tensorCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tensorCount(MemorySegment segment, long index) { return (int) VH_tensorCount.get(segment, 0L, index); }
    /// {@return `tensorCount`}
    public int tensorCount() { return tensorCount(this.segment(), 0L); }
    /// Sets `tensorCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tensorCount(MemorySegment segment, long index, int value) { VH_tensorCount.set(segment, 0L, index, value); }
    /// Sets `tensorCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFrameBoundaryTensorsARM tensorCount(int value) { tensorCount(this.segment(), 0L, value); return this; }

    /// {@return `pTensors` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pTensors(MemorySegment segment, long index) { return (MemorySegment) VH_pTensors.get(segment, 0L, index); }
    /// {@return `pTensors`}
    public MemorySegment pTensors() { return pTensors(this.segment(), 0L); }
    /// Sets `pTensors` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pTensors(MemorySegment segment, long index, MemorySegment value) { VH_pTensors.set(segment, 0L, index, value); }
    /// Sets `pTensors` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFrameBoundaryTensorsARM pTensors(MemorySegment value) { pTensors(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkFrameBoundaryTensorsARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkFrameBoundaryTensorsARM`
    public VkFrameBoundaryTensorsARM asSlice(long index) { return new VkFrameBoundaryTensorsARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkFrameBoundaryTensorsARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkFrameBoundaryTensorsARM`
    public VkFrameBoundaryTensorsARM asSlice(long index, long count) { return new VkFrameBoundaryTensorsARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkFrameBoundaryTensorsARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkFrameBoundaryTensorsARM at(long index, Consumer<VkFrameBoundaryTensorsARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFrameBoundaryTensorsARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFrameBoundaryTensorsARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `tensorCount` at the given index}
    /// @param index the index of the struct buffer
    public int tensorCountAt(long index) { return tensorCount(this.segment(), index); }
    /// Sets `tensorCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFrameBoundaryTensorsARM tensorCountAt(long index, int value) { tensorCount(this.segment(), index, value); return this; }

    /// {@return `pTensors` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pTensorsAt(long index) { return pTensors(this.segment(), index); }
    /// Sets `pTensors` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkFrameBoundaryTensorsARM pTensorsAt(long index, MemorySegment value) { pTensors(this.segment(), index, value); return this; }

}

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
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkClusterAccelerationStructureMoveObjectsInputNV`.
/// ## Layout
/// ```
/// struct VkClusterAccelerationStructureMoveObjectsInputNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (int) VkClusterAccelerationStructureTypeNV type;
///     (uint32_t) VkBool32 noMoveOverlap;
///     (uint64_t) VkDeviceSize maxMovedBytes;
/// };
/// ```
public final class VkClusterAccelerationStructureMoveObjectsInputNV extends GroupType {
    /// The struct layout of `VkClusterAccelerationStructureMoveObjectsInputNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("noMoveOverlap"),
        ValueLayout.JAVA_LONG.withName("maxMovedBytes")
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
    /// The byte offset of `type`.
    public static final long OFFSET_type = LAYOUT.byteOffset(PathElement.groupElement("type"));
    /// The memory layout of `type`.
    public static final MemoryLayout LAYOUT_type = LAYOUT.select(PathElement.groupElement("type"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The byte offset of `noMoveOverlap`.
    public static final long OFFSET_noMoveOverlap = LAYOUT.byteOffset(PathElement.groupElement("noMoveOverlap"));
    /// The memory layout of `noMoveOverlap`.
    public static final MemoryLayout LAYOUT_noMoveOverlap = LAYOUT.select(PathElement.groupElement("noMoveOverlap"));
    /// The [VarHandle] of `noMoveOverlap` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_noMoveOverlap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("noMoveOverlap"));
    /// The byte offset of `maxMovedBytes`.
    public static final long OFFSET_maxMovedBytes = LAYOUT.byteOffset(PathElement.groupElement("maxMovedBytes"));
    /// The memory layout of `maxMovedBytes`.
    public static final MemoryLayout LAYOUT_maxMovedBytes = LAYOUT.select(PathElement.groupElement("maxMovedBytes"));
    /// The [VarHandle] of `maxMovedBytes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxMovedBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMovedBytes"));

    /// Creates `VkClusterAccelerationStructureMoveObjectsInputNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkClusterAccelerationStructureMoveObjectsInputNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkClusterAccelerationStructureMoveObjectsInputNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureMoveObjectsInputNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureMoveObjectsInputNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkClusterAccelerationStructureMoveObjectsInputNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureMoveObjectsInputNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureMoveObjectsInputNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkClusterAccelerationStructureMoveObjectsInputNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClusterAccelerationStructureMoveObjectsInputNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkClusterAccelerationStructureMoveObjectsInputNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkClusterAccelerationStructureMoveObjectsInputNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkClusterAccelerationStructureMoveObjectsInputNV`
    public static VkClusterAccelerationStructureMoveObjectsInputNV alloc(SegmentAllocator allocator) { return new VkClusterAccelerationStructureMoveObjectsInputNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkClusterAccelerationStructureMoveObjectsInputNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkClusterAccelerationStructureMoveObjectsInputNV`
    public static VkClusterAccelerationStructureMoveObjectsInputNV alloc(SegmentAllocator allocator, long count) { return new VkClusterAccelerationStructureMoveObjectsInputNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkClusterAccelerationStructureMoveObjectsInputNV copyFrom(VkClusterAccelerationStructureMoveObjectsInputNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkClusterAccelerationStructureMoveObjectsInputNV reinterpret(long count) { return new VkClusterAccelerationStructureMoveObjectsInputNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkClusterAccelerationStructureMoveObjectsInputNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkClusterAccelerationStructureMoveObjectsInputNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    public int type() { return type(this.segment(), 0L); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void type(MemorySegment segment, long index, int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureMoveObjectsInputNV type(int value) { type(this.segment(), 0L, value); return this; }

    /// {@return `noMoveOverlap` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int noMoveOverlap(MemorySegment segment, long index) { return (int) VH_noMoveOverlap.get(segment, 0L, index); }
    /// {@return `noMoveOverlap`}
    public int noMoveOverlap() { return noMoveOverlap(this.segment(), 0L); }
    /// Sets `noMoveOverlap` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void noMoveOverlap(MemorySegment segment, long index, int value) { VH_noMoveOverlap.set(segment, 0L, index, value); }
    /// Sets `noMoveOverlap` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureMoveObjectsInputNV noMoveOverlap(int value) { noMoveOverlap(this.segment(), 0L, value); return this; }

    /// {@return `maxMovedBytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long maxMovedBytes(MemorySegment segment, long index) { return (long) VH_maxMovedBytes.get(segment, 0L, index); }
    /// {@return `maxMovedBytes`}
    public long maxMovedBytes() { return maxMovedBytes(this.segment(), 0L); }
    /// Sets `maxMovedBytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxMovedBytes(MemorySegment segment, long index, long value) { VH_maxMovedBytes.set(segment, 0L, index, value); }
    /// Sets `maxMovedBytes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureMoveObjectsInputNV maxMovedBytes(long value) { maxMovedBytes(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkClusterAccelerationStructureMoveObjectsInputNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkClusterAccelerationStructureMoveObjectsInputNV`
    public VkClusterAccelerationStructureMoveObjectsInputNV asSlice(long index) { return new VkClusterAccelerationStructureMoveObjectsInputNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkClusterAccelerationStructureMoveObjectsInputNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkClusterAccelerationStructureMoveObjectsInputNV`
    public VkClusterAccelerationStructureMoveObjectsInputNV asSlice(long index, long count) { return new VkClusterAccelerationStructureMoveObjectsInputNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkClusterAccelerationStructureMoveObjectsInputNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkClusterAccelerationStructureMoveObjectsInputNV at(long index, Consumer<VkClusterAccelerationStructureMoveObjectsInputNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureMoveObjectsInputNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureMoveObjectsInputNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `type` at the given index}
    /// @param index the index of the struct buffer
    public int typeAt(long index) { return type(this.segment(), index); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureMoveObjectsInputNV typeAt(long index, int value) { type(this.segment(), index, value); return this; }

    /// {@return `noMoveOverlap` at the given index}
    /// @param index the index of the struct buffer
    public int noMoveOverlapAt(long index) { return noMoveOverlap(this.segment(), index); }
    /// Sets `noMoveOverlap` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureMoveObjectsInputNV noMoveOverlapAt(long index, int value) { noMoveOverlap(this.segment(), index, value); return this; }

    /// {@return `maxMovedBytes` at the given index}
    /// @param index the index of the struct buffer
    public long maxMovedBytesAt(long index) { return maxMovedBytes(this.segment(), index); }
    /// Sets `maxMovedBytes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkClusterAccelerationStructureMoveObjectsInputNV maxMovedBytesAt(long index, long value) { maxMovedBytes(this.segment(), index, value); return this; }

}

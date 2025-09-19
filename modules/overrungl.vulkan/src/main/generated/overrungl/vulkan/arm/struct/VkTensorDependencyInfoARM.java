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
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkTensorDependencyInfoARM`.
/// ## Layout
/// ```
/// struct VkTensorDependencyInfoARM {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t tensorMemoryBarrierCount;
///     const VkTensorMemoryBarrierARM* pTensorMemoryBarriers;
/// };
/// ```
public final class VkTensorDependencyInfoARM extends GroupType {
    /// The struct layout of `VkTensorDependencyInfoARM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("tensorMemoryBarrierCount"),
        ValueLayout.ADDRESS.withName("pTensorMemoryBarriers")
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
    /// The byte offset of `tensorMemoryBarrierCount`.
    public static final long OFFSET_tensorMemoryBarrierCount = LAYOUT.byteOffset(PathElement.groupElement("tensorMemoryBarrierCount"));
    /// The memory layout of `tensorMemoryBarrierCount`.
    public static final MemoryLayout LAYOUT_tensorMemoryBarrierCount = LAYOUT.select(PathElement.groupElement("tensorMemoryBarrierCount"));
    /// The [VarHandle] of `tensorMemoryBarrierCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tensorMemoryBarrierCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tensorMemoryBarrierCount"));
    /// The byte offset of `pTensorMemoryBarriers`.
    public static final long OFFSET_pTensorMemoryBarriers = LAYOUT.byteOffset(PathElement.groupElement("pTensorMemoryBarriers"));
    /// The memory layout of `pTensorMemoryBarriers`.
    public static final MemoryLayout LAYOUT_pTensorMemoryBarriers = LAYOUT.select(PathElement.groupElement("pTensorMemoryBarriers"));
    /// The [VarHandle] of `pTensorMemoryBarriers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pTensorMemoryBarriers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTensorMemoryBarriers"));

    /// Creates `VkTensorDependencyInfoARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkTensorDependencyInfoARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkTensorDependencyInfoARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTensorDependencyInfoARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorDependencyInfoARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkTensorDependencyInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTensorDependencyInfoARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorDependencyInfoARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkTensorDependencyInfoARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTensorDependencyInfoARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkTensorDependencyInfoARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkTensorDependencyInfoARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkTensorDependencyInfoARM`
    public static VkTensorDependencyInfoARM alloc(SegmentAllocator allocator) { return new VkTensorDependencyInfoARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkTensorDependencyInfoARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkTensorDependencyInfoARM`
    public static VkTensorDependencyInfoARM alloc(SegmentAllocator allocator, long count) { return new VkTensorDependencyInfoARM(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkTensorDependencyInfoARM copyFrom(VkTensorDependencyInfoARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkTensorDependencyInfoARM reinterpret(long count) { return new VkTensorDependencyInfoARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkTensorDependencyInfoARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkTensorDependencyInfoARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `tensorMemoryBarrierCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int tensorMemoryBarrierCount(MemorySegment segment, long index) { return (int) VH_tensorMemoryBarrierCount.get(segment, 0L, index); }
    /// {@return `tensorMemoryBarrierCount`}
    public int tensorMemoryBarrierCount() { return tensorMemoryBarrierCount(this.segment(), 0L); }
    /// Sets `tensorMemoryBarrierCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tensorMemoryBarrierCount(MemorySegment segment, long index, int value) { VH_tensorMemoryBarrierCount.set(segment, 0L, index, value); }
    /// Sets `tensorMemoryBarrierCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTensorDependencyInfoARM tensorMemoryBarrierCount(int value) { tensorMemoryBarrierCount(this.segment(), 0L, value); return this; }

    /// {@return `pTensorMemoryBarriers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pTensorMemoryBarriers(MemorySegment segment, long index) { return (MemorySegment) VH_pTensorMemoryBarriers.get(segment, 0L, index); }
    /// {@return `pTensorMemoryBarriers`}
    public MemorySegment pTensorMemoryBarriers() { return pTensorMemoryBarriers(this.segment(), 0L); }
    /// Sets `pTensorMemoryBarriers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pTensorMemoryBarriers(MemorySegment segment, long index, MemorySegment value) { VH_pTensorMemoryBarriers.set(segment, 0L, index, value); }
    /// Sets `pTensorMemoryBarriers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTensorDependencyInfoARM pTensorMemoryBarriers(MemorySegment value) { pTensorMemoryBarriers(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkTensorDependencyInfoARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkTensorDependencyInfoARM`
    public VkTensorDependencyInfoARM asSlice(long index) { return new VkTensorDependencyInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkTensorDependencyInfoARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkTensorDependencyInfoARM`
    public VkTensorDependencyInfoARM asSlice(long index, long count) { return new VkTensorDependencyInfoARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkTensorDependencyInfoARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkTensorDependencyInfoARM at(long index, Consumer<VkTensorDependencyInfoARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorDependencyInfoARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorDependencyInfoARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `tensorMemoryBarrierCount` at the given index}
    /// @param index the index of the struct buffer
    public int tensorMemoryBarrierCountAt(long index) { return tensorMemoryBarrierCount(this.segment(), index); }
    /// Sets `tensorMemoryBarrierCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorDependencyInfoARM tensorMemoryBarrierCountAt(long index, int value) { tensorMemoryBarrierCount(this.segment(), index, value); return this; }

    /// {@return `pTensorMemoryBarriers` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pTensorMemoryBarriersAt(long index) { return pTensorMemoryBarriers(this.segment(), index); }
    /// Sets `pTensorMemoryBarriers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkTensorDependencyInfoARM pTensorMemoryBarriersAt(long index, MemorySegment value) { pTensorMemoryBarriers(this.segment(), index, value); return this; }

}

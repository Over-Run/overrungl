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
/// struct VkCheckpointData2NV {
///     (int) VkStructureType sType;
///     void* pNext;
///     ((uint64_t) VkFlags64) VkPipelineStageFlags2 stage;
///     void* pCheckpointMarker;
/// };
/// ```
public final class VkCheckpointData2NV extends GroupType {
    /// The struct layout of `VkCheckpointData2NV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("stage"),
        ValueLayout.ADDRESS.withName("pCheckpointMarker")
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
    /// The byte offset of `stage`.
    public static final long OFFSET_stage = LAYOUT.byteOffset(PathElement.groupElement("stage"));
    /// The memory layout of `stage`.
    public static final MemoryLayout LAYOUT_stage = LAYOUT.select(PathElement.groupElement("stage"));
    /// The [VarHandle] of `stage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stage"));
    /// The byte offset of `pCheckpointMarker`.
    public static final long OFFSET_pCheckpointMarker = LAYOUT.byteOffset(PathElement.groupElement("pCheckpointMarker"));
    /// The memory layout of `pCheckpointMarker`.
    public static final MemoryLayout LAYOUT_pCheckpointMarker = LAYOUT.select(PathElement.groupElement("pCheckpointMarker"));
    /// The [VarHandle] of `pCheckpointMarker` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pCheckpointMarker = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCheckpointMarker"));

    /// Creates `VkCheckpointData2NV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkCheckpointData2NV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkCheckpointData2NV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCheckpointData2NV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCheckpointData2NV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCheckpointData2NV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCheckpointData2NV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkCheckpointData2NV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkCheckpointData2NV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCheckpointData2NV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkCheckpointData2NV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkCheckpointData2NV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCheckpointData2NV`
    public static VkCheckpointData2NV alloc(SegmentAllocator allocator) { return new VkCheckpointData2NV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkCheckpointData2NV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCheckpointData2NV`
    public static VkCheckpointData2NV alloc(SegmentAllocator allocator, long count) { return new VkCheckpointData2NV(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkCheckpointData2NV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param stage `stage`
    /// @param pCheckpointMarker `pCheckpointMarker`
    /// @return the allocated `VkCheckpointData2NV`
    public static VkCheckpointData2NV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long stage, MemorySegment pCheckpointMarker) {
        return alloc(allocator).sType(sType).pNext(pNext).stage(stage).pCheckpointMarker(pCheckpointMarker);
    }

    /// Allocates a `VkCheckpointData2NV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param stage `stage`
    /// @return the allocated `VkCheckpointData2NV`
    public static VkCheckpointData2NV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long stage) {
        return alloc(allocator).sType(sType).pNext(pNext).stage(stage);
    }

    /// Allocates a `VkCheckpointData2NV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkCheckpointData2NV`
    public static VkCheckpointData2NV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkCheckpointData2NV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkCheckpointData2NV`
    public static VkCheckpointData2NV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCheckpointData2NV copyFrom(VkCheckpointData2NV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkCheckpointData2NV reinterpret(long count) { return new VkCheckpointData2NV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkCheckpointData2NV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkCheckpointData2NV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `stage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long stage(MemorySegment segment, long index) { return (long) VH_stage.get(segment, 0L, index); }
    /// {@return `stage`}
    public long stage() { return stage(this.segment(), 0L); }
    /// Sets `stage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stage(MemorySegment segment, long index, long value) { VH_stage.set(segment, 0L, index, value); }
    /// Sets `stage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCheckpointData2NV stage(long value) { stage(this.segment(), 0L, value); return this; }

    /// {@return `pCheckpointMarker` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pCheckpointMarker(MemorySegment segment, long index) { return (MemorySegment) VH_pCheckpointMarker.get(segment, 0L, index); }
    /// {@return `pCheckpointMarker`}
    public MemorySegment pCheckpointMarker() { return pCheckpointMarker(this.segment(), 0L); }
    /// Sets `pCheckpointMarker` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pCheckpointMarker(MemorySegment segment, long index, MemorySegment value) { VH_pCheckpointMarker.set(segment, 0L, index, value); }
    /// Sets `pCheckpointMarker` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCheckpointData2NV pCheckpointMarker(MemorySegment value) { pCheckpointMarker(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkCheckpointData2NV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkCheckpointData2NV`
    public VkCheckpointData2NV asSlice(long index) { return new VkCheckpointData2NV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkCheckpointData2NV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkCheckpointData2NV`
    public VkCheckpointData2NV asSlice(long index, long count) { return new VkCheckpointData2NV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkCheckpointData2NV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkCheckpointData2NV at(long index, Consumer<VkCheckpointData2NV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCheckpointData2NV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCheckpointData2NV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `stage` at the given index}
    /// @param index the index of the struct buffer
    public long stageAt(long index) { return stage(this.segment(), index); }
    /// Sets `stage` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCheckpointData2NV stageAt(long index, long value) { stage(this.segment(), index, value); return this; }

    /// {@return `pCheckpointMarker` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pCheckpointMarkerAt(long index) { return pCheckpointMarker(this.segment(), index); }
    /// Sets `pCheckpointMarker` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkCheckpointData2NV pCheckpointMarkerAt(long index, MemorySegment value) { pCheckpointMarker(this.segment(), index, value); return this; }

}

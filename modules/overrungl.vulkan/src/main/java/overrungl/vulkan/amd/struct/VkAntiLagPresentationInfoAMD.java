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
package overrungl.vulkan.amd.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### stage
/// [VarHandle][#VH_stage] - [Getter][#stage()] - [Setter][#stage(int)]
/// ### frameIndex
/// [VarHandle][#VH_frameIndex] - [Getter][#frameIndex()] - [Setter][#frameIndex(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAntiLagPresentationInfoAMD {
///     VkStructureType sType;
///     void * pNext;
///     VkAntiLagStageAMD stage;
///     uint64_t frameIndex;
/// } VkAntiLagPresentationInfoAMD;
/// ```
public final class VkAntiLagPresentationInfoAMD extends Struct {
    /// The struct layout of `VkAntiLagPresentationInfoAMD`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stage"),
        ValueLayout.JAVA_LONG.withName("frameIndex")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `stage` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stage"));
    /// The [VarHandle] of `frameIndex` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_frameIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frameIndex"));

    /// Creates `VkAntiLagPresentationInfoAMD` with the given segment.
    /// @param segment the memory segment
    public VkAntiLagPresentationInfoAMD(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAntiLagPresentationInfoAMD` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAntiLagPresentationInfoAMD of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAntiLagPresentationInfoAMD(segment); }

    /// Creates `VkAntiLagPresentationInfoAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAntiLagPresentationInfoAMD ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAntiLagPresentationInfoAMD(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAntiLagPresentationInfoAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAntiLagPresentationInfoAMD ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkAntiLagPresentationInfoAMD(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkAntiLagPresentationInfoAMD` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAntiLagPresentationInfoAMD`
    public static VkAntiLagPresentationInfoAMD alloc(SegmentAllocator allocator) { return new VkAntiLagPresentationInfoAMD(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAntiLagPresentationInfoAMD` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAntiLagPresentationInfoAMD`
    public static VkAntiLagPresentationInfoAMD alloc(SegmentAllocator allocator, long count) { return new VkAntiLagPresentationInfoAMD(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkAntiLagPresentationInfoAMD.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkAntiLagPresentationInfoAMD.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkAntiLagPresentationInfoAMD.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkAntiLagPresentationInfoAMD.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAntiLagPresentationInfoAMD sTypeAt(long index, @CType("VkStructureType") int value) { VkAntiLagPresentationInfoAMD.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAntiLagPresentationInfoAMD sType(@CType("VkStructureType") int value) { VkAntiLagPresentationInfoAMD.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkAntiLagPresentationInfoAMD.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkAntiLagPresentationInfoAMD.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkAntiLagPresentationInfoAMD.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkAntiLagPresentationInfoAMD.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAntiLagPresentationInfoAMD pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkAntiLagPresentationInfoAMD.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAntiLagPresentationInfoAMD pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkAntiLagPresentationInfoAMD.set_pNext(this.segment(), value); return this; }

    /// {@return `stage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAntiLagStageAMD") int get_stage(MemorySegment segment, long index) { return (int) VH_stage.get(segment, 0L, index); }
    /// {@return `stage`}
    /// @param segment the segment of the struct
    public static @CType("VkAntiLagStageAMD") int get_stage(MemorySegment segment) { return VkAntiLagPresentationInfoAMD.get_stage(segment, 0L); }
    /// {@return `stage` at the given index}
    /// @param index the index
    public @CType("VkAntiLagStageAMD") int stageAt(long index) { return VkAntiLagPresentationInfoAMD.get_stage(this.segment(), index); }
    /// {@return `stage`}
    public @CType("VkAntiLagStageAMD") int stage() { return VkAntiLagPresentationInfoAMD.get_stage(this.segment()); }
    /// Sets `stage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stage(MemorySegment segment, long index, @CType("VkAntiLagStageAMD") int value) { VH_stage.set(segment, 0L, index, value); }
    /// Sets `stage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stage(MemorySegment segment, @CType("VkAntiLagStageAMD") int value) { VkAntiLagPresentationInfoAMD.set_stage(segment, 0L, value); }
    /// Sets `stage` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAntiLagPresentationInfoAMD stageAt(long index, @CType("VkAntiLagStageAMD") int value) { VkAntiLagPresentationInfoAMD.set_stage(this.segment(), index, value); return this; }
    /// Sets `stage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAntiLagPresentationInfoAMD stage(@CType("VkAntiLagStageAMD") int value) { VkAntiLagPresentationInfoAMD.set_stage(this.segment(), value); return this; }

    /// {@return `frameIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_frameIndex(MemorySegment segment, long index) { return (long) VH_frameIndex.get(segment, 0L, index); }
    /// {@return `frameIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_frameIndex(MemorySegment segment) { return VkAntiLagPresentationInfoAMD.get_frameIndex(segment, 0L); }
    /// {@return `frameIndex` at the given index}
    /// @param index the index
    public @CType("uint64_t") long frameIndexAt(long index) { return VkAntiLagPresentationInfoAMD.get_frameIndex(this.segment(), index); }
    /// {@return `frameIndex`}
    public @CType("uint64_t") long frameIndex() { return VkAntiLagPresentationInfoAMD.get_frameIndex(this.segment()); }
    /// Sets `frameIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_frameIndex(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_frameIndex.set(segment, 0L, index, value); }
    /// Sets `frameIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_frameIndex(MemorySegment segment, @CType("uint64_t") long value) { VkAntiLagPresentationInfoAMD.set_frameIndex(segment, 0L, value); }
    /// Sets `frameIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAntiLagPresentationInfoAMD frameIndexAt(long index, @CType("uint64_t") long value) { VkAntiLagPresentationInfoAMD.set_frameIndex(this.segment(), index, value); return this; }
    /// Sets `frameIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAntiLagPresentationInfoAMD frameIndex(@CType("uint64_t") long value) { VkAntiLagPresentationInfoAMD.set_frameIndex(this.segment(), value); return this; }

}

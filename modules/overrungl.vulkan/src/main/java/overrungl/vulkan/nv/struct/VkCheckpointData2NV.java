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
package overrungl.vulkan.nv.struct;

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
/// [VarHandle][#VH_stage] - [Getter][#stage()] - [Setter][#stage(long)]
/// ### pCheckpointMarker
/// [VarHandle][#VH_pCheckpointMarker] - [Getter][#pCheckpointMarker()] - [Setter][#pCheckpointMarker(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCheckpointData2NV {
///     VkStructureType sType;
///     void * pNext;
///     VkPipelineStageFlags2 stage;
///     void * pCheckpointMarker;
/// } VkCheckpointData2NV;
/// ```
public final class VkCheckpointData2NV extends Struct {
    /// The struct layout of `VkCheckpointData2NV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("stage"),
        ValueLayout.ADDRESS.withName("pCheckpointMarker")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `stage` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_stage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stage"));
    /// The [VarHandle] of `pCheckpointMarker` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pCheckpointMarker = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCheckpointMarker"));

    /// Creates `VkCheckpointData2NV` with the given segment.
    /// @param segment the memory segment
    public VkCheckpointData2NV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCheckpointData2NV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCheckpointData2NV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCheckpointData2NV(segment); }

    /// Creates `VkCheckpointData2NV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCheckpointData2NV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCheckpointData2NV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCheckpointData2NV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCheckpointData2NV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkCheckpointData2NV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkCheckpointData2NV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCheckpointData2NV`
    public static VkCheckpointData2NV alloc(SegmentAllocator allocator) { return new VkCheckpointData2NV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCheckpointData2NV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCheckpointData2NV`
    public static VkCheckpointData2NV alloc(SegmentAllocator allocator, long count) { return new VkCheckpointData2NV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkCheckpointData2NV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkCheckpointData2NV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkCheckpointData2NV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkCheckpointData2NV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCheckpointData2NV sTypeAt(long index, @CType("VkStructureType") int value) { VkCheckpointData2NV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCheckpointData2NV sType(@CType("VkStructureType") int value) { VkCheckpointData2NV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkCheckpointData2NV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkCheckpointData2NV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkCheckpointData2NV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkCheckpointData2NV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCheckpointData2NV pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkCheckpointData2NV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCheckpointData2NV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkCheckpointData2NV.set_pNext(this.segment(), value); return this; }

    /// {@return `stage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineStageFlags2") long get_stage(MemorySegment segment, long index) { return (long) VH_stage.get(segment, 0L, index); }
    /// {@return `stage`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineStageFlags2") long get_stage(MemorySegment segment) { return VkCheckpointData2NV.get_stage(segment, 0L); }
    /// {@return `stage` at the given index}
    /// @param index the index
    public @CType("VkPipelineStageFlags2") long stageAt(long index) { return VkCheckpointData2NV.get_stage(this.segment(), index); }
    /// {@return `stage`}
    public @CType("VkPipelineStageFlags2") long stage() { return VkCheckpointData2NV.get_stage(this.segment()); }
    /// Sets `stage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stage(MemorySegment segment, long index, @CType("VkPipelineStageFlags2") long value) { VH_stage.set(segment, 0L, index, value); }
    /// Sets `stage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stage(MemorySegment segment, @CType("VkPipelineStageFlags2") long value) { VkCheckpointData2NV.set_stage(segment, 0L, value); }
    /// Sets `stage` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCheckpointData2NV stageAt(long index, @CType("VkPipelineStageFlags2") long value) { VkCheckpointData2NV.set_stage(this.segment(), index, value); return this; }
    /// Sets `stage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCheckpointData2NV stage(@CType("VkPipelineStageFlags2") long value) { VkCheckpointData2NV.set_stage(this.segment(), value); return this; }

    /// {@return `pCheckpointMarker` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pCheckpointMarker(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pCheckpointMarker.get(segment, 0L, index); }
    /// {@return `pCheckpointMarker`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pCheckpointMarker(MemorySegment segment) { return VkCheckpointData2NV.get_pCheckpointMarker(segment, 0L); }
    /// {@return `pCheckpointMarker` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pCheckpointMarkerAt(long index) { return VkCheckpointData2NV.get_pCheckpointMarker(this.segment(), index); }
    /// {@return `pCheckpointMarker`}
    public @CType("void *") java.lang.foreign.MemorySegment pCheckpointMarker() { return VkCheckpointData2NV.get_pCheckpointMarker(this.segment()); }
    /// Sets `pCheckpointMarker` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pCheckpointMarker(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pCheckpointMarker.set(segment, 0L, index, value); }
    /// Sets `pCheckpointMarker` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pCheckpointMarker(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkCheckpointData2NV.set_pCheckpointMarker(segment, 0L, value); }
    /// Sets `pCheckpointMarker` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkCheckpointData2NV pCheckpointMarkerAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkCheckpointData2NV.set_pCheckpointMarker(this.segment(), index, value); return this; }
    /// Sets `pCheckpointMarker` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCheckpointData2NV pCheckpointMarker(@CType("void *") java.lang.foreign.MemorySegment value) { VkCheckpointData2NV.set_pCheckpointMarker(this.segment(), value); return this; }

}

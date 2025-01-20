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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### stage
/// [VarHandle][#VH_stage] - [Getter][#stage()] - [Setter][#stage(int)]
/// ### pCheckpointMarker
/// [VarHandle][#VH_pCheckpointMarker] - [Getter][#pCheckpointMarker()] - [Setter][#pCheckpointMarker(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCheckpointDataNV {
///     VkStructureType sType;
///     void * pNext;
///     VkPipelineStageFlagBits stage;
///     void * pCheckpointMarker;
/// } VkCheckpointDataNV;
/// ```
public sealed class VkCheckpointDataNV extends Struct {
    /// The struct layout of `VkCheckpointDataNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stage"),
        ValueLayout.ADDRESS.withName("pCheckpointMarker")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `stage` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stage"));
    /// The [VarHandle] of `pCheckpointMarker` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pCheckpointMarker = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCheckpointMarker"));

    /// Creates `VkCheckpointDataNV` with the given segment.
    /// @param segment the memory segment
    public VkCheckpointDataNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCheckpointDataNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCheckpointDataNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCheckpointDataNV(segment); }

    /// Creates `VkCheckpointDataNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCheckpointDataNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCheckpointDataNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCheckpointDataNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCheckpointDataNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkCheckpointDataNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCheckpointDataNV`
    public static VkCheckpointDataNV alloc(SegmentAllocator allocator) { return new VkCheckpointDataNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCheckpointDataNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCheckpointDataNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkCheckpointDataNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCheckpointDataNV`
    public static VkCheckpointDataNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkPipelineStageFlagBits") int stage, @CType("void *") MemorySegment pCheckpointMarker) { return alloc(allocator).sType(sType).pNext(pNext).stage(stage).pCheckpointMarker(pCheckpointMarker); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCheckpointDataNV copyFrom(VkCheckpointDataNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkCheckpointDataNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkCheckpointDataNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkCheckpointDataNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCheckpointDataNV sType(@CType("VkStructureType") int value) { VkCheckpointDataNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkCheckpointDataNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkCheckpointDataNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkCheckpointDataNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCheckpointDataNV pNext(@CType("void *") MemorySegment value) { VkCheckpointDataNV.set_pNext(this.segment(), value); return this; }

    /// {@return `stage` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineStageFlagBits") int get_stage(MemorySegment segment, long index) { return (int) VH_stage.get(segment, 0L, index); }
    /// {@return `stage`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineStageFlagBits") int get_stage(MemorySegment segment) { return VkCheckpointDataNV.get_stage(segment, 0L); }
    /// {@return `stage`}
    public @CType("VkPipelineStageFlagBits") int stage() { return VkCheckpointDataNV.get_stage(this.segment()); }
    /// Sets `stage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stage(MemorySegment segment, long index, @CType("VkPipelineStageFlagBits") int value) { VH_stage.set(segment, 0L, index, value); }
    /// Sets `stage` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stage(MemorySegment segment, @CType("VkPipelineStageFlagBits") int value) { VkCheckpointDataNV.set_stage(segment, 0L, value); }
    /// Sets `stage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCheckpointDataNV stage(@CType("VkPipelineStageFlagBits") int value) { VkCheckpointDataNV.set_stage(this.segment(), value); return this; }

    /// {@return `pCheckpointMarker` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pCheckpointMarker(MemorySegment segment, long index) { return (MemorySegment) VH_pCheckpointMarker.get(segment, 0L, index); }
    /// {@return `pCheckpointMarker`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pCheckpointMarker(MemorySegment segment) { return VkCheckpointDataNV.get_pCheckpointMarker(segment, 0L); }
    /// {@return `pCheckpointMarker`}
    public @CType("void *") MemorySegment pCheckpointMarker() { return VkCheckpointDataNV.get_pCheckpointMarker(this.segment()); }
    /// Sets `pCheckpointMarker` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pCheckpointMarker(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pCheckpointMarker.set(segment, 0L, index, value); }
    /// Sets `pCheckpointMarker` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pCheckpointMarker(MemorySegment segment, @CType("void *") MemorySegment value) { VkCheckpointDataNV.set_pCheckpointMarker(segment, 0L, value); }
    /// Sets `pCheckpointMarker` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCheckpointDataNV pCheckpointMarker(@CType("void *") MemorySegment value) { VkCheckpointDataNV.set_pCheckpointMarker(this.segment(), value); return this; }

    /// A buffer of [VkCheckpointDataNV].
    public static final class Buffer extends VkCheckpointDataNV {
        private final long elementCount;

        /// Creates `VkCheckpointDataNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkCheckpointDataNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkCheckpointDataNV`
        public VkCheckpointDataNV asSlice(long index) { return new VkCheckpointDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkCheckpointDataNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkCheckpointDataNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkCheckpointDataNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkCheckpointDataNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkCheckpointDataNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkCheckpointDataNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `stage` at the given index}
        /// @param index the index
        public @CType("VkPipelineStageFlagBits") int stageAt(long index) { return VkCheckpointDataNV.get_stage(this.segment(), index); }
        /// Sets `stage` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer stageAt(long index, @CType("VkPipelineStageFlagBits") int value) { VkCheckpointDataNV.set_stage(this.segment(), index, value); return this; }

        /// {@return `pCheckpointMarker` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pCheckpointMarkerAt(long index) { return VkCheckpointDataNV.get_pCheckpointMarker(this.segment(), index); }
        /// Sets `pCheckpointMarker` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pCheckpointMarkerAt(long index, @CType("void *") MemorySegment value) { VkCheckpointDataNV.set_pCheckpointMarker(this.segment(), index, value); return this; }

    }
}

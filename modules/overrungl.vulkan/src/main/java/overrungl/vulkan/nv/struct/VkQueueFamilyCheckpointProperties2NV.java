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
/// ### checkpointExecutionStageMask
/// [VarHandle][#VH_checkpointExecutionStageMask] - [Getter][#checkpointExecutionStageMask()] - [Setter][#checkpointExecutionStageMask(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkQueueFamilyCheckpointProperties2NV {
///     VkStructureType sType;
///     void * pNext;
///     VkPipelineStageFlags2 checkpointExecutionStageMask;
/// } VkQueueFamilyCheckpointProperties2NV;
/// ```
public sealed class VkQueueFamilyCheckpointProperties2NV extends Struct {
    /// The struct layout of `VkQueueFamilyCheckpointProperties2NV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("checkpointExecutionStageMask")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `checkpointExecutionStageMask` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_checkpointExecutionStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("checkpointExecutionStageMask"));

    /// Creates `VkQueueFamilyCheckpointProperties2NV` with the given segment.
    /// @param segment the memory segment
    public VkQueueFamilyCheckpointProperties2NV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkQueueFamilyCheckpointProperties2NV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyCheckpointProperties2NV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkQueueFamilyCheckpointProperties2NV(segment); }

    /// Creates `VkQueueFamilyCheckpointProperties2NV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkQueueFamilyCheckpointProperties2NV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyCheckpointProperties2NV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkQueueFamilyCheckpointProperties2NV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkQueueFamilyCheckpointProperties2NV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkQueueFamilyCheckpointProperties2NV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkQueueFamilyCheckpointProperties2NV`
    public static VkQueueFamilyCheckpointProperties2NV alloc(SegmentAllocator allocator) { return new VkQueueFamilyCheckpointProperties2NV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkQueueFamilyCheckpointProperties2NV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkQueueFamilyCheckpointProperties2NV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkQueueFamilyCheckpointProperties2NV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkQueueFamilyCheckpointProperties2NV`
    public static VkQueueFamilyCheckpointProperties2NV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("VkPipelineStageFlags2") long checkpointExecutionStageMask) { return alloc(allocator).sType(sType).pNext(pNext).checkpointExecutionStageMask(checkpointExecutionStageMask); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkQueueFamilyCheckpointProperties2NV copyFrom(VkQueueFamilyCheckpointProperties2NV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkQueueFamilyCheckpointProperties2NV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkQueueFamilyCheckpointProperties2NV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkQueueFamilyCheckpointProperties2NV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyCheckpointProperties2NV sType(@CType("VkStructureType") int value) { VkQueueFamilyCheckpointProperties2NV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkQueueFamilyCheckpointProperties2NV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkQueueFamilyCheckpointProperties2NV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkQueueFamilyCheckpointProperties2NV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyCheckpointProperties2NV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkQueueFamilyCheckpointProperties2NV.set_pNext(this.segment(), value); return this; }

    /// {@return `checkpointExecutionStageMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineStageFlags2") long get_checkpointExecutionStageMask(MemorySegment segment, long index) { return (long) VH_checkpointExecutionStageMask.get(segment, 0L, index); }
    /// {@return `checkpointExecutionStageMask`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineStageFlags2") long get_checkpointExecutionStageMask(MemorySegment segment) { return VkQueueFamilyCheckpointProperties2NV.get_checkpointExecutionStageMask(segment, 0L); }
    /// {@return `checkpointExecutionStageMask`}
    public @CType("VkPipelineStageFlags2") long checkpointExecutionStageMask() { return VkQueueFamilyCheckpointProperties2NV.get_checkpointExecutionStageMask(this.segment()); }
    /// Sets `checkpointExecutionStageMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_checkpointExecutionStageMask(MemorySegment segment, long index, @CType("VkPipelineStageFlags2") long value) { VH_checkpointExecutionStageMask.set(segment, 0L, index, value); }
    /// Sets `checkpointExecutionStageMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_checkpointExecutionStageMask(MemorySegment segment, @CType("VkPipelineStageFlags2") long value) { VkQueueFamilyCheckpointProperties2NV.set_checkpointExecutionStageMask(segment, 0L, value); }
    /// Sets `checkpointExecutionStageMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyCheckpointProperties2NV checkpointExecutionStageMask(@CType("VkPipelineStageFlags2") long value) { VkQueueFamilyCheckpointProperties2NV.set_checkpointExecutionStageMask(this.segment(), value); return this; }

    /// A buffer of [VkQueueFamilyCheckpointProperties2NV].
    public static final class Buffer extends VkQueueFamilyCheckpointProperties2NV {
        private final long elementCount;

        /// Creates `VkQueueFamilyCheckpointProperties2NV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkQueueFamilyCheckpointProperties2NV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkQueueFamilyCheckpointProperties2NV`
        public VkQueueFamilyCheckpointProperties2NV asSlice(long index) { return new VkQueueFamilyCheckpointProperties2NV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkQueueFamilyCheckpointProperties2NV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkQueueFamilyCheckpointProperties2NV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkQueueFamilyCheckpointProperties2NV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkQueueFamilyCheckpointProperties2NV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkQueueFamilyCheckpointProperties2NV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkQueueFamilyCheckpointProperties2NV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `checkpointExecutionStageMask` at the given index}
        /// @param index the index
        public @CType("VkPipelineStageFlags2") long checkpointExecutionStageMaskAt(long index) { return VkQueueFamilyCheckpointProperties2NV.get_checkpointExecutionStageMask(this.segment(), index); }
        /// Sets `checkpointExecutionStageMask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer checkpointExecutionStageMaskAt(long index, @CType("VkPipelineStageFlags2") long value) { VkQueueFamilyCheckpointProperties2NV.set_checkpointExecutionStageMask(this.segment(), index, value); return this; }

    }
}

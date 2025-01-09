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
/// [VarHandle][#VH_checkpointExecutionStageMask] - [Getter][#checkpointExecutionStageMask()] - [Setter][#checkpointExecutionStageMask(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkQueueFamilyCheckpointPropertiesNV {
///     VkStructureType sType;
///     void * pNext;
///     VkPipelineStageFlags checkpointExecutionStageMask;
/// } VkQueueFamilyCheckpointPropertiesNV;
/// ```
public final class VkQueueFamilyCheckpointPropertiesNV extends Struct {
    /// The struct layout of `VkQueueFamilyCheckpointPropertiesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("checkpointExecutionStageMask")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `checkpointExecutionStageMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_checkpointExecutionStageMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("checkpointExecutionStageMask"));

    /// Creates `VkQueueFamilyCheckpointPropertiesNV` with the given segment.
    /// @param segment the memory segment
    public VkQueueFamilyCheckpointPropertiesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkQueueFamilyCheckpointPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyCheckpointPropertiesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkQueueFamilyCheckpointPropertiesNV(segment); }

    /// Creates `VkQueueFamilyCheckpointPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyCheckpointPropertiesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkQueueFamilyCheckpointPropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkQueueFamilyCheckpointPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyCheckpointPropertiesNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkQueueFamilyCheckpointPropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkQueueFamilyCheckpointPropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkQueueFamilyCheckpointPropertiesNV`
    public static VkQueueFamilyCheckpointPropertiesNV alloc(SegmentAllocator allocator) { return new VkQueueFamilyCheckpointPropertiesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkQueueFamilyCheckpointPropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkQueueFamilyCheckpointPropertiesNV`
    public static VkQueueFamilyCheckpointPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkQueueFamilyCheckpointPropertiesNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkQueueFamilyCheckpointPropertiesNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkQueueFamilyCheckpointPropertiesNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkQueueFamilyCheckpointPropertiesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkQueueFamilyCheckpointPropertiesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyCheckpointPropertiesNV sTypeAt(long index, @CType("VkStructureType") int value) { VkQueueFamilyCheckpointPropertiesNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyCheckpointPropertiesNV sType(@CType("VkStructureType") int value) { VkQueueFamilyCheckpointPropertiesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkQueueFamilyCheckpointPropertiesNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkQueueFamilyCheckpointPropertiesNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkQueueFamilyCheckpointPropertiesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkQueueFamilyCheckpointPropertiesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyCheckpointPropertiesNV pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkQueueFamilyCheckpointPropertiesNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyCheckpointPropertiesNV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkQueueFamilyCheckpointPropertiesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `checkpointExecutionStageMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineStageFlags") int get_checkpointExecutionStageMask(MemorySegment segment, long index) { return (int) VH_checkpointExecutionStageMask.get(segment, 0L, index); }
    /// {@return `checkpointExecutionStageMask`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineStageFlags") int get_checkpointExecutionStageMask(MemorySegment segment) { return VkQueueFamilyCheckpointPropertiesNV.get_checkpointExecutionStageMask(segment, 0L); }
    /// {@return `checkpointExecutionStageMask` at the given index}
    /// @param index the index
    public @CType("VkPipelineStageFlags") int checkpointExecutionStageMaskAt(long index) { return VkQueueFamilyCheckpointPropertiesNV.get_checkpointExecutionStageMask(this.segment(), index); }
    /// {@return `checkpointExecutionStageMask`}
    public @CType("VkPipelineStageFlags") int checkpointExecutionStageMask() { return VkQueueFamilyCheckpointPropertiesNV.get_checkpointExecutionStageMask(this.segment()); }
    /// Sets `checkpointExecutionStageMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_checkpointExecutionStageMask(MemorySegment segment, long index, @CType("VkPipelineStageFlags") int value) { VH_checkpointExecutionStageMask.set(segment, 0L, index, value); }
    /// Sets `checkpointExecutionStageMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_checkpointExecutionStageMask(MemorySegment segment, @CType("VkPipelineStageFlags") int value) { VkQueueFamilyCheckpointPropertiesNV.set_checkpointExecutionStageMask(segment, 0L, value); }
    /// Sets `checkpointExecutionStageMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyCheckpointPropertiesNV checkpointExecutionStageMaskAt(long index, @CType("VkPipelineStageFlags") int value) { VkQueueFamilyCheckpointPropertiesNV.set_checkpointExecutionStageMask(this.segment(), index, value); return this; }
    /// Sets `checkpointExecutionStageMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyCheckpointPropertiesNV checkpointExecutionStageMask(@CType("VkPipelineStageFlags") int value) { VkQueueFamilyCheckpointPropertiesNV.set_checkpointExecutionStageMask(this.segment(), value); return this; }

}

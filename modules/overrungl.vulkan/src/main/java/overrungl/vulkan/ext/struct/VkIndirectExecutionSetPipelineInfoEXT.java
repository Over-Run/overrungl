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
package overrungl.vulkan.ext.struct;

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
/// ### initialPipeline
/// [VarHandle][#VH_initialPipeline] - [Getter][#initialPipeline()] - [Setter][#initialPipeline(java.lang.foreign.MemorySegment)]
/// ### maxPipelineCount
/// [VarHandle][#VH_maxPipelineCount] - [Getter][#maxPipelineCount()] - [Setter][#maxPipelineCount(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkIndirectExecutionSetPipelineInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipeline initialPipeline;
///     uint32_t maxPipelineCount;
/// } VkIndirectExecutionSetPipelineInfoEXT;
/// ```
public final class VkIndirectExecutionSetPipelineInfoEXT extends Struct {
    /// The struct layout of `VkIndirectExecutionSetPipelineInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("initialPipeline"),
        ValueLayout.JAVA_INT.withName("maxPipelineCount")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `initialPipeline` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_initialPipeline = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initialPipeline"));
    /// The [VarHandle] of `maxPipelineCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPipelineCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPipelineCount"));

    /// Creates `VkIndirectExecutionSetPipelineInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkIndirectExecutionSetPipelineInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkIndirectExecutionSetPipelineInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectExecutionSetPipelineInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectExecutionSetPipelineInfoEXT(segment); }

    /// Creates `VkIndirectExecutionSetPipelineInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectExecutionSetPipelineInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectExecutionSetPipelineInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkIndirectExecutionSetPipelineInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectExecutionSetPipelineInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectExecutionSetPipelineInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkIndirectExecutionSetPipelineInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectExecutionSetPipelineInfoEXT`
    public static VkIndirectExecutionSetPipelineInfoEXT alloc(SegmentAllocator allocator) { return new VkIndirectExecutionSetPipelineInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkIndirectExecutionSetPipelineInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectExecutionSetPipelineInfoEXT`
    public static VkIndirectExecutionSetPipelineInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkIndirectExecutionSetPipelineInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkIndirectExecutionSetPipelineInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkIndirectExecutionSetPipelineInfoEXT`
    public VkIndirectExecutionSetPipelineInfoEXT asSlice(long index) { return new VkIndirectExecutionSetPipelineInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkIndirectExecutionSetPipelineInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkIndirectExecutionSetPipelineInfoEXT`
    public VkIndirectExecutionSetPipelineInfoEXT asSlice(long index, long count) { return new VkIndirectExecutionSetPipelineInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkIndirectExecutionSetPipelineInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkIndirectExecutionSetPipelineInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkIndirectExecutionSetPipelineInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkIndirectExecutionSetPipelineInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetPipelineInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkIndirectExecutionSetPipelineInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetPipelineInfoEXT sType(@CType("VkStructureType") int value) { VkIndirectExecutionSetPipelineInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkIndirectExecutionSetPipelineInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkIndirectExecutionSetPipelineInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkIndirectExecutionSetPipelineInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetPipelineInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetPipelineInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetPipelineInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetPipelineInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetPipelineInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `initialPipeline` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipeline") java.lang.foreign.MemorySegment get_initialPipeline(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_initialPipeline.get(segment, 0L, index); }
    /// {@return `initialPipeline`}
    /// @param segment the segment of the struct
    public static @CType("VkPipeline") java.lang.foreign.MemorySegment get_initialPipeline(MemorySegment segment) { return VkIndirectExecutionSetPipelineInfoEXT.get_initialPipeline(segment, 0L); }
    /// {@return `initialPipeline` at the given index}
    /// @param index the index
    public @CType("VkPipeline") java.lang.foreign.MemorySegment initialPipelineAt(long index) { return VkIndirectExecutionSetPipelineInfoEXT.get_initialPipeline(this.segment(), index); }
    /// {@return `initialPipeline`}
    public @CType("VkPipeline") java.lang.foreign.MemorySegment initialPipeline() { return VkIndirectExecutionSetPipelineInfoEXT.get_initialPipeline(this.segment()); }
    /// Sets `initialPipeline` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_initialPipeline(MemorySegment segment, long index, @CType("VkPipeline") java.lang.foreign.MemorySegment value) { VH_initialPipeline.set(segment, 0L, index, value); }
    /// Sets `initialPipeline` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_initialPipeline(MemorySegment segment, @CType("VkPipeline") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetPipelineInfoEXT.set_initialPipeline(segment, 0L, value); }
    /// Sets `initialPipeline` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetPipelineInfoEXT initialPipelineAt(long index, @CType("VkPipeline") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetPipelineInfoEXT.set_initialPipeline(this.segment(), index, value); return this; }
    /// Sets `initialPipeline` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetPipelineInfoEXT initialPipeline(@CType("VkPipeline") java.lang.foreign.MemorySegment value) { VkIndirectExecutionSetPipelineInfoEXT.set_initialPipeline(this.segment(), value); return this; }

    /// {@return `maxPipelineCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPipelineCount(MemorySegment segment, long index) { return (int) VH_maxPipelineCount.get(segment, 0L, index); }
    /// {@return `maxPipelineCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPipelineCount(MemorySegment segment) { return VkIndirectExecutionSetPipelineInfoEXT.get_maxPipelineCount(segment, 0L); }
    /// {@return `maxPipelineCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxPipelineCountAt(long index) { return VkIndirectExecutionSetPipelineInfoEXT.get_maxPipelineCount(this.segment(), index); }
    /// {@return `maxPipelineCount`}
    public @CType("uint32_t") int maxPipelineCount() { return VkIndirectExecutionSetPipelineInfoEXT.get_maxPipelineCount(this.segment()); }
    /// Sets `maxPipelineCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPipelineCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPipelineCount.set(segment, 0L, index, value); }
    /// Sets `maxPipelineCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPipelineCount(MemorySegment segment, @CType("uint32_t") int value) { VkIndirectExecutionSetPipelineInfoEXT.set_maxPipelineCount(segment, 0L, value); }
    /// Sets `maxPipelineCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetPipelineInfoEXT maxPipelineCountAt(long index, @CType("uint32_t") int value) { VkIndirectExecutionSetPipelineInfoEXT.set_maxPipelineCount(this.segment(), index, value); return this; }
    /// Sets `maxPipelineCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectExecutionSetPipelineInfoEXT maxPipelineCount(@CType("uint32_t") int value) { VkIndirectExecutionSetPipelineInfoEXT.set_maxPipelineCount(this.segment(), value); return this; }

}

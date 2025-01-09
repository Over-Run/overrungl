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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### rasterizationStream
/// [VarHandle][#VH_rasterizationStream] - [Getter][#rasterizationStream()] - [Setter][#rasterizationStream(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineRasterizationStateStreamCreateInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkPipelineRasterizationStateStreamCreateFlagsEXT flags;
///     uint32_t rasterizationStream;
/// } VkPipelineRasterizationStateStreamCreateInfoEXT;
/// ```
public final class VkPipelineRasterizationStateStreamCreateInfoEXT extends Struct {
    /// The struct layout of `VkPipelineRasterizationStateStreamCreateInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("rasterizationStream")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `rasterizationStream` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_rasterizationStream = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rasterizationStream"));

    /// Creates `VkPipelineRasterizationStateStreamCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkPipelineRasterizationStateStreamCreateInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineRasterizationStateStreamCreateInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRasterizationStateStreamCreateInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineRasterizationStateStreamCreateInfoEXT(segment); }

    /// Creates `VkPipelineRasterizationStateStreamCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRasterizationStateStreamCreateInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineRasterizationStateStreamCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineRasterizationStateStreamCreateInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRasterizationStateStreamCreateInfoEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineRasterizationStateStreamCreateInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineRasterizationStateStreamCreateInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineRasterizationStateStreamCreateInfoEXT`
    public static VkPipelineRasterizationStateStreamCreateInfoEXT alloc(SegmentAllocator allocator) { return new VkPipelineRasterizationStateStreamCreateInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineRasterizationStateStreamCreateInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineRasterizationStateStreamCreateInfoEXT`
    public static VkPipelineRasterizationStateStreamCreateInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkPipelineRasterizationStateStreamCreateInfoEXT(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineRasterizationStateStreamCreateInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineRasterizationStateStreamCreateInfoEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineRasterizationStateStreamCreateInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineRasterizationStateStreamCreateInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateStreamCreateInfoEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineRasterizationStateStreamCreateInfoEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateStreamCreateInfoEXT sType(@CType("VkStructureType") int value) { VkPipelineRasterizationStateStreamCreateInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineRasterizationStateStreamCreateInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineRasterizationStateStreamCreateInfoEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineRasterizationStateStreamCreateInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineRasterizationStateStreamCreateInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateStreamCreateInfoEXT pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineRasterizationStateStreamCreateInfoEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateStreamCreateInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineRasterizationStateStreamCreateInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineRasterizationStateStreamCreateFlagsEXT") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineRasterizationStateStreamCreateFlagsEXT") int get_flags(MemorySegment segment) { return VkPipelineRasterizationStateStreamCreateInfoEXT.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkPipelineRasterizationStateStreamCreateFlagsEXT") int flagsAt(long index) { return VkPipelineRasterizationStateStreamCreateInfoEXT.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkPipelineRasterizationStateStreamCreateFlagsEXT") int flags() { return VkPipelineRasterizationStateStreamCreateInfoEXT.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkPipelineRasterizationStateStreamCreateFlagsEXT") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkPipelineRasterizationStateStreamCreateFlagsEXT") int value) { VkPipelineRasterizationStateStreamCreateInfoEXT.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateStreamCreateInfoEXT flagsAt(long index, @CType("VkPipelineRasterizationStateStreamCreateFlagsEXT") int value) { VkPipelineRasterizationStateStreamCreateInfoEXT.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateStreamCreateInfoEXT flags(@CType("VkPipelineRasterizationStateStreamCreateFlagsEXT") int value) { VkPipelineRasterizationStateStreamCreateInfoEXT.set_flags(this.segment(), value); return this; }

    /// {@return `rasterizationStream` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_rasterizationStream(MemorySegment segment, long index) { return (int) VH_rasterizationStream.get(segment, 0L, index); }
    /// {@return `rasterizationStream`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_rasterizationStream(MemorySegment segment) { return VkPipelineRasterizationStateStreamCreateInfoEXT.get_rasterizationStream(segment, 0L); }
    /// {@return `rasterizationStream` at the given index}
    /// @param index the index
    public @CType("uint32_t") int rasterizationStreamAt(long index) { return VkPipelineRasterizationStateStreamCreateInfoEXT.get_rasterizationStream(this.segment(), index); }
    /// {@return `rasterizationStream`}
    public @CType("uint32_t") int rasterizationStream() { return VkPipelineRasterizationStateStreamCreateInfoEXT.get_rasterizationStream(this.segment()); }
    /// Sets `rasterizationStream` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_rasterizationStream(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_rasterizationStream.set(segment, 0L, index, value); }
    /// Sets `rasterizationStream` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_rasterizationStream(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineRasterizationStateStreamCreateInfoEXT.set_rasterizationStream(segment, 0L, value); }
    /// Sets `rasterizationStream` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateStreamCreateInfoEXT rasterizationStreamAt(long index, @CType("uint32_t") int value) { VkPipelineRasterizationStateStreamCreateInfoEXT.set_rasterizationStream(this.segment(), index, value); return this; }
    /// Sets `rasterizationStream` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateStreamCreateInfoEXT rasterizationStream(@CType("uint32_t") int value) { VkPipelineRasterizationStateStreamCreateInfoEXT.set_rasterizationStream(this.segment(), value); return this; }

}

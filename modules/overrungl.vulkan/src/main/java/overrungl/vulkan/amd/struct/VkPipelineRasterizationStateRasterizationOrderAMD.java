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
/// ### rasterizationOrder
/// [VarHandle][#VH_rasterizationOrder] - [Getter][#rasterizationOrder()] - [Setter][#rasterizationOrder(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineRasterizationStateRasterizationOrderAMD {
///     VkStructureType sType;
///     const void * pNext;
///     VkRasterizationOrderAMD rasterizationOrder;
/// } VkPipelineRasterizationStateRasterizationOrderAMD;
/// ```
public final class VkPipelineRasterizationStateRasterizationOrderAMD extends Struct {
    /// The struct layout of `VkPipelineRasterizationStateRasterizationOrderAMD`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rasterizationOrder")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `rasterizationOrder` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_rasterizationOrder = LAYOUT.arrayElementVarHandle(PathElement.groupElement("rasterizationOrder"));

    /// Creates `VkPipelineRasterizationStateRasterizationOrderAMD` with the given segment.
    /// @param segment the memory segment
    public VkPipelineRasterizationStateRasterizationOrderAMD(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineRasterizationStateRasterizationOrderAMD` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRasterizationStateRasterizationOrderAMD of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineRasterizationStateRasterizationOrderAMD(segment); }

    /// Creates `VkPipelineRasterizationStateRasterizationOrderAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRasterizationStateRasterizationOrderAMD ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineRasterizationStateRasterizationOrderAMD(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineRasterizationStateRasterizationOrderAMD` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineRasterizationStateRasterizationOrderAMD ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineRasterizationStateRasterizationOrderAMD(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineRasterizationStateRasterizationOrderAMD` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineRasterizationStateRasterizationOrderAMD`
    public static VkPipelineRasterizationStateRasterizationOrderAMD alloc(SegmentAllocator allocator) { return new VkPipelineRasterizationStateRasterizationOrderAMD(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineRasterizationStateRasterizationOrderAMD` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineRasterizationStateRasterizationOrderAMD`
    public static VkPipelineRasterizationStateRasterizationOrderAMD alloc(SegmentAllocator allocator, long count) { return new VkPipelineRasterizationStateRasterizationOrderAMD(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPipelineRasterizationStateRasterizationOrderAMD`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPipelineRasterizationStateRasterizationOrderAMD`
    public VkPipelineRasterizationStateRasterizationOrderAMD asSlice(long index) { return new VkPipelineRasterizationStateRasterizationOrderAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPipelineRasterizationStateRasterizationOrderAMD`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPipelineRasterizationStateRasterizationOrderAMD`
    public VkPipelineRasterizationStateRasterizationOrderAMD asSlice(long index, long count) { return new VkPipelineRasterizationStateRasterizationOrderAMD(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineRasterizationStateRasterizationOrderAMD.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineRasterizationStateRasterizationOrderAMD.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineRasterizationStateRasterizationOrderAMD.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineRasterizationStateRasterizationOrderAMD.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateRasterizationOrderAMD sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineRasterizationStateRasterizationOrderAMD.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateRasterizationOrderAMD sType(@CType("VkStructureType") int value) { VkPipelineRasterizationStateRasterizationOrderAMD.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineRasterizationStateRasterizationOrderAMD.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineRasterizationStateRasterizationOrderAMD.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineRasterizationStateRasterizationOrderAMD.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineRasterizationStateRasterizationOrderAMD.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateRasterizationOrderAMD pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineRasterizationStateRasterizationOrderAMD.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateRasterizationOrderAMD pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineRasterizationStateRasterizationOrderAMD.set_pNext(this.segment(), value); return this; }

    /// {@return `rasterizationOrder` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkRasterizationOrderAMD") int get_rasterizationOrder(MemorySegment segment, long index) { return (int) VH_rasterizationOrder.get(segment, 0L, index); }
    /// {@return `rasterizationOrder`}
    /// @param segment the segment of the struct
    public static @CType("VkRasterizationOrderAMD") int get_rasterizationOrder(MemorySegment segment) { return VkPipelineRasterizationStateRasterizationOrderAMD.get_rasterizationOrder(segment, 0L); }
    /// {@return `rasterizationOrder` at the given index}
    /// @param index the index
    public @CType("VkRasterizationOrderAMD") int rasterizationOrderAt(long index) { return VkPipelineRasterizationStateRasterizationOrderAMD.get_rasterizationOrder(this.segment(), index); }
    /// {@return `rasterizationOrder`}
    public @CType("VkRasterizationOrderAMD") int rasterizationOrder() { return VkPipelineRasterizationStateRasterizationOrderAMD.get_rasterizationOrder(this.segment()); }
    /// Sets `rasterizationOrder` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_rasterizationOrder(MemorySegment segment, long index, @CType("VkRasterizationOrderAMD") int value) { VH_rasterizationOrder.set(segment, 0L, index, value); }
    /// Sets `rasterizationOrder` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_rasterizationOrder(MemorySegment segment, @CType("VkRasterizationOrderAMD") int value) { VkPipelineRasterizationStateRasterizationOrderAMD.set_rasterizationOrder(segment, 0L, value); }
    /// Sets `rasterizationOrder` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateRasterizationOrderAMD rasterizationOrderAt(long index, @CType("VkRasterizationOrderAMD") int value) { VkPipelineRasterizationStateRasterizationOrderAMD.set_rasterizationOrder(this.segment(), index, value); return this; }
    /// Sets `rasterizationOrder` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineRasterizationStateRasterizationOrderAMD rasterizationOrder(@CType("VkRasterizationOrderAMD") int value) { VkPipelineRasterizationStateRasterizationOrderAMD.set_rasterizationOrder(this.segment(), value); return this; }

}

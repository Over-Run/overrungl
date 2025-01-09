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
/// ### sampleOrderType
/// [VarHandle][#VH_sampleOrderType] - [Getter][#sampleOrderType()] - [Setter][#sampleOrderType(int)]
/// ### customSampleOrderCount
/// [VarHandle][#VH_customSampleOrderCount] - [Getter][#customSampleOrderCount()] - [Setter][#customSampleOrderCount(int)]
/// ### pCustomSampleOrders
/// [VarHandle][#VH_pCustomSampleOrders] - [Getter][#pCustomSampleOrders()] - [Setter][#pCustomSampleOrders(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineViewportCoarseSampleOrderStateCreateInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkCoarseSampleOrderTypeNV sampleOrderType;
///     uint32_t customSampleOrderCount;
///     const VkCoarseSampleOrderCustomNV * pCustomSampleOrders;
/// } VkPipelineViewportCoarseSampleOrderStateCreateInfoNV;
/// ```
public final class VkPipelineViewportCoarseSampleOrderStateCreateInfoNV extends Struct {
    /// The struct layout of `VkPipelineViewportCoarseSampleOrderStateCreateInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sampleOrderType"),
        ValueLayout.JAVA_INT.withName("customSampleOrderCount"),
        ValueLayout.ADDRESS.withName("pCustomSampleOrders")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `sampleOrderType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sampleOrderType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleOrderType"));
    /// The [VarHandle] of `customSampleOrderCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_customSampleOrderCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("customSampleOrderCount"));
    /// The [VarHandle] of `pCustomSampleOrders` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pCustomSampleOrders = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCustomSampleOrders"));

    /// Creates `VkPipelineViewportCoarseSampleOrderStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineViewportCoarseSampleOrderStateCreateInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(segment); }

    /// Creates `VkPipelineViewportCoarseSampleOrderStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineViewportCoarseSampleOrderStateCreateInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineViewportCoarseSampleOrderStateCreateInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineViewportCoarseSampleOrderStateCreateInfoNV`
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV alloc(SegmentAllocator allocator) { return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineViewportCoarseSampleOrderStateCreateInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineViewportCoarseSampleOrderStateCreateInfoNV`
    public static VkPipelineViewportCoarseSampleOrderStateCreateInfoNV alloc(SegmentAllocator allocator, long count) { return new VkPipelineViewportCoarseSampleOrderStateCreateInfoNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV sType(@CType("VkStructureType") int value) { VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `sampleOrderType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkCoarseSampleOrderTypeNV") int get_sampleOrderType(MemorySegment segment, long index) { return (int) VH_sampleOrderType.get(segment, 0L, index); }
    /// {@return `sampleOrderType`}
    /// @param segment the segment of the struct
    public static @CType("VkCoarseSampleOrderTypeNV") int get_sampleOrderType(MemorySegment segment) { return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.get_sampleOrderType(segment, 0L); }
    /// {@return `sampleOrderType` at the given index}
    /// @param index the index
    public @CType("VkCoarseSampleOrderTypeNV") int sampleOrderTypeAt(long index) { return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.get_sampleOrderType(this.segment(), index); }
    /// {@return `sampleOrderType`}
    public @CType("VkCoarseSampleOrderTypeNV") int sampleOrderType() { return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.get_sampleOrderType(this.segment()); }
    /// Sets `sampleOrderType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sampleOrderType(MemorySegment segment, long index, @CType("VkCoarseSampleOrderTypeNV") int value) { VH_sampleOrderType.set(segment, 0L, index, value); }
    /// Sets `sampleOrderType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sampleOrderType(MemorySegment segment, @CType("VkCoarseSampleOrderTypeNV") int value) { VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.set_sampleOrderType(segment, 0L, value); }
    /// Sets `sampleOrderType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV sampleOrderTypeAt(long index, @CType("VkCoarseSampleOrderTypeNV") int value) { VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.set_sampleOrderType(this.segment(), index, value); return this; }
    /// Sets `sampleOrderType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV sampleOrderType(@CType("VkCoarseSampleOrderTypeNV") int value) { VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.set_sampleOrderType(this.segment(), value); return this; }

    /// {@return `customSampleOrderCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_customSampleOrderCount(MemorySegment segment, long index) { return (int) VH_customSampleOrderCount.get(segment, 0L, index); }
    /// {@return `customSampleOrderCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_customSampleOrderCount(MemorySegment segment) { return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.get_customSampleOrderCount(segment, 0L); }
    /// {@return `customSampleOrderCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int customSampleOrderCountAt(long index) { return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.get_customSampleOrderCount(this.segment(), index); }
    /// {@return `customSampleOrderCount`}
    public @CType("uint32_t") int customSampleOrderCount() { return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.get_customSampleOrderCount(this.segment()); }
    /// Sets `customSampleOrderCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_customSampleOrderCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_customSampleOrderCount.set(segment, 0L, index, value); }
    /// Sets `customSampleOrderCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_customSampleOrderCount(MemorySegment segment, @CType("uint32_t") int value) { VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.set_customSampleOrderCount(segment, 0L, value); }
    /// Sets `customSampleOrderCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV customSampleOrderCountAt(long index, @CType("uint32_t") int value) { VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.set_customSampleOrderCount(this.segment(), index, value); return this; }
    /// Sets `customSampleOrderCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV customSampleOrderCount(@CType("uint32_t") int value) { VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.set_customSampleOrderCount(this.segment(), value); return this; }

    /// {@return `pCustomSampleOrders` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkCoarseSampleOrderCustomNV *") java.lang.foreign.MemorySegment get_pCustomSampleOrders(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pCustomSampleOrders.get(segment, 0L, index); }
    /// {@return `pCustomSampleOrders`}
    /// @param segment the segment of the struct
    public static @CType("const VkCoarseSampleOrderCustomNV *") java.lang.foreign.MemorySegment get_pCustomSampleOrders(MemorySegment segment) { return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.get_pCustomSampleOrders(segment, 0L); }
    /// {@return `pCustomSampleOrders` at the given index}
    /// @param index the index
    public @CType("const VkCoarseSampleOrderCustomNV *") java.lang.foreign.MemorySegment pCustomSampleOrdersAt(long index) { return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.get_pCustomSampleOrders(this.segment(), index); }
    /// {@return `pCustomSampleOrders`}
    public @CType("const VkCoarseSampleOrderCustomNV *") java.lang.foreign.MemorySegment pCustomSampleOrders() { return VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.get_pCustomSampleOrders(this.segment()); }
    /// Sets `pCustomSampleOrders` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pCustomSampleOrders(MemorySegment segment, long index, @CType("const VkCoarseSampleOrderCustomNV *") java.lang.foreign.MemorySegment value) { VH_pCustomSampleOrders.set(segment, 0L, index, value); }
    /// Sets `pCustomSampleOrders` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pCustomSampleOrders(MemorySegment segment, @CType("const VkCoarseSampleOrderCustomNV *") java.lang.foreign.MemorySegment value) { VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.set_pCustomSampleOrders(segment, 0L, value); }
    /// Sets `pCustomSampleOrders` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV pCustomSampleOrdersAt(long index, @CType("const VkCoarseSampleOrderCustomNV *") java.lang.foreign.MemorySegment value) { VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.set_pCustomSampleOrders(this.segment(), index, value); return this; }
    /// Sets `pCustomSampleOrders` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV pCustomSampleOrders(@CType("const VkCoarseSampleOrderCustomNV *") java.lang.foreign.MemorySegment value) { VkPipelineViewportCoarseSampleOrderStateCreateInfoNV.set_pCustomSampleOrders(this.segment(), value); return this; }

}

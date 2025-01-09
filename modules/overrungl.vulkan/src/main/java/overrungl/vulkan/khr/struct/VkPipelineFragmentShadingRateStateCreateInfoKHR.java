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
package overrungl.vulkan.khr.struct;

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
/// ### fragmentSize
/// [Byte offset][#OFFSET_fragmentSize] - [Memory layout][#ML_fragmentSize] - [Getter][#fragmentSize()] - [Setter][#fragmentSize(java.lang.foreign.MemorySegment)]
/// ### combinerOps
/// [VarHandle][#VH_combinerOps] - [Getter][#combinerOps()] - [Setter][#combinerOps(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPipelineFragmentShadingRateStateCreateInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkExtent2D fragmentSize;
///     VkFragmentShadingRateCombinerOpKHR combinerOps;
/// } VkPipelineFragmentShadingRateStateCreateInfoKHR;
/// ```
public final class VkPipelineFragmentShadingRateStateCreateInfoKHR extends Struct {
    /// The struct layout of `VkPipelineFragmentShadingRateStateCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("fragmentSize"),
        ValueLayout.JAVA_INT.withName("combinerOps")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `fragmentSize`.
    public static final long OFFSET_fragmentSize = LAYOUT.byteOffset(PathElement.groupElement("fragmentSize"));
    /// The memory layout of `fragmentSize`.
    public static final MemoryLayout ML_fragmentSize = LAYOUT.select(PathElement.groupElement("fragmentSize"));
    /// The [VarHandle] of `combinerOps` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_combinerOps = LAYOUT.arrayElementVarHandle(PathElement.groupElement("combinerOps"));

    /// Creates `VkPipelineFragmentShadingRateStateCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkPipelineFragmentShadingRateStateCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineFragmentShadingRateStateCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineFragmentShadingRateStateCreateInfoKHR(segment); }

    /// Creates `VkPipelineFragmentShadingRateStateCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineFragmentShadingRateStateCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPipelineFragmentShadingRateStateCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPipelineFragmentShadingRateStateCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPipelineFragmentShadingRateStateCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineFragmentShadingRateStateCreateInfoKHR`
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkPipelineFragmentShadingRateStateCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineFragmentShadingRateStateCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineFragmentShadingRateStateCreateInfoKHR`
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPipelineFragmentShadingRateStateCreateInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPipelineFragmentShadingRateStateCreateInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPipelineFragmentShadingRateStateCreateInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPipelineFragmentShadingRateStateCreateInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPipelineFragmentShadingRateStateCreateInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateStateCreateInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkPipelineFragmentShadingRateStateCreateInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateStateCreateInfoKHR sType(@CType("VkStructureType") int value) { VkPipelineFragmentShadingRateStateCreateInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPipelineFragmentShadingRateStateCreateInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPipelineFragmentShadingRateStateCreateInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkPipelineFragmentShadingRateStateCreateInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineFragmentShadingRateStateCreateInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateStateCreateInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineFragmentShadingRateStateCreateInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateStateCreateInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkPipelineFragmentShadingRateStateCreateInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `fragmentSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_fragmentSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_fragmentSize, index), ML_fragmentSize); }
    /// {@return `fragmentSize`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_fragmentSize(MemorySegment segment) { return VkPipelineFragmentShadingRateStateCreateInfoKHR.get_fragmentSize(segment, 0L); }
    /// {@return `fragmentSize` at the given index}
    /// @param index the index
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment fragmentSizeAt(long index) { return VkPipelineFragmentShadingRateStateCreateInfoKHR.get_fragmentSize(this.segment(), index); }
    /// {@return `fragmentSize`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment fragmentSize() { return VkPipelineFragmentShadingRateStateCreateInfoKHR.get_fragmentSize(this.segment()); }
    /// Sets `fragmentSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fragmentSize(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_fragmentSize, index), ML_fragmentSize.byteSize()); }
    /// Sets `fragmentSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fragmentSize(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPipelineFragmentShadingRateStateCreateInfoKHR.set_fragmentSize(segment, 0L, value); }
    /// Sets `fragmentSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateStateCreateInfoKHR fragmentSizeAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPipelineFragmentShadingRateStateCreateInfoKHR.set_fragmentSize(this.segment(), index, value); return this; }
    /// Sets `fragmentSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateStateCreateInfoKHR fragmentSize(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPipelineFragmentShadingRateStateCreateInfoKHR.set_fragmentSize(this.segment(), value); return this; }

    /// {@return `combinerOps` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFragmentShadingRateCombinerOpKHR") int get_combinerOps(MemorySegment segment, long index) { return (int) VH_combinerOps.get(segment, 0L, index); }
    /// {@return `combinerOps`}
    /// @param segment the segment of the struct
    public static @CType("VkFragmentShadingRateCombinerOpKHR") int get_combinerOps(MemorySegment segment) { return VkPipelineFragmentShadingRateStateCreateInfoKHR.get_combinerOps(segment, 0L); }
    /// {@return `combinerOps` at the given index}
    /// @param index the index
    public @CType("VkFragmentShadingRateCombinerOpKHR") int combinerOpsAt(long index) { return VkPipelineFragmentShadingRateStateCreateInfoKHR.get_combinerOps(this.segment(), index); }
    /// {@return `combinerOps`}
    public @CType("VkFragmentShadingRateCombinerOpKHR") int combinerOps() { return VkPipelineFragmentShadingRateStateCreateInfoKHR.get_combinerOps(this.segment()); }
    /// Sets `combinerOps` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_combinerOps(MemorySegment segment, long index, @CType("VkFragmentShadingRateCombinerOpKHR") int value) { VH_combinerOps.set(segment, 0L, index, value); }
    /// Sets `combinerOps` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_combinerOps(MemorySegment segment, @CType("VkFragmentShadingRateCombinerOpKHR") int value) { VkPipelineFragmentShadingRateStateCreateInfoKHR.set_combinerOps(segment, 0L, value); }
    /// Sets `combinerOps` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateStateCreateInfoKHR combinerOpsAt(long index, @CType("VkFragmentShadingRateCombinerOpKHR") int value) { VkPipelineFragmentShadingRateStateCreateInfoKHR.set_combinerOps(this.segment(), index, value); return this; }
    /// Sets `combinerOps` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineFragmentShadingRateStateCreateInfoKHR combinerOps(@CType("VkFragmentShadingRateCombinerOpKHR") int value) { VkPipelineFragmentShadingRateStateCreateInfoKHR.set_combinerOps(this.segment(), value); return this; }

}

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
/// ### quantizationMapTexelSize
/// [Byte offset][#OFFSET_quantizationMapTexelSize] - [Memory layout][#ML_quantizationMapTexelSize] - [Getter][#quantizationMapTexelSize()] - [Setter][#quantizationMapTexelSize(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkExtent2D quantizationMapTexelSize;
/// } VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR;
/// ```
public final class VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR extends Struct {
    /// The struct layout of `VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("quantizationMapTexelSize")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `quantizationMapTexelSize`.
    public static final long OFFSET_quantizationMapTexelSize = LAYOUT.byteOffset(PathElement.groupElement("quantizationMapTexelSize"));
    /// The memory layout of `quantizationMapTexelSize`.
    public static final MemoryLayout ML_quantizationMapTexelSize = LAYOUT.select(PathElement.groupElement("quantizationMapTexelSize"));

    /// Creates `VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(segment); }

    /// Creates `VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR`
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR`
    public static VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `quantizationMapTexelSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_quantizationMapTexelSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_quantizationMapTexelSize, index), ML_quantizationMapTexelSize); }
    /// {@return `quantizationMapTexelSize`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_quantizationMapTexelSize(MemorySegment segment) { return VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.get_quantizationMapTexelSize(segment, 0L); }
    /// {@return `quantizationMapTexelSize` at the given index}
    /// @param index the index
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment quantizationMapTexelSizeAt(long index) { return VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.get_quantizationMapTexelSize(this.segment(), index); }
    /// {@return `quantizationMapTexelSize`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment quantizationMapTexelSize() { return VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.get_quantizationMapTexelSize(this.segment()); }
    /// Sets `quantizationMapTexelSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_quantizationMapTexelSize(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_quantizationMapTexelSize, index), ML_quantizationMapTexelSize.byteSize()); }
    /// Sets `quantizationMapTexelSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_quantizationMapTexelSize(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.set_quantizationMapTexelSize(segment, 0L, value); }
    /// Sets `quantizationMapTexelSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR quantizationMapTexelSizeAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.set_quantizationMapTexelSize(this.segment(), index, value); return this; }
    /// Sets `quantizationMapTexelSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR quantizationMapTexelSize(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoEncodeQuantizationMapSessionParametersCreateInfoKHR.set_quantizationMapTexelSize(this.segment(), value); return this; }

}
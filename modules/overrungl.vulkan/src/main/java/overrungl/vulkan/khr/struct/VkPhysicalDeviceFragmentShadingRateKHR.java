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
/// ### sampleCounts
/// [VarHandle][#VH_sampleCounts] - [Getter][#sampleCounts()] - [Setter][#sampleCounts(int)]
/// ### fragmentSize
/// [Byte offset][#OFFSET_fragmentSize] - [Memory layout][#ML_fragmentSize] - [Getter][#fragmentSize()] - [Setter][#fragmentSize(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceFragmentShadingRateKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkSampleCountFlags sampleCounts;
///     VkExtent2D fragmentSize;
/// } VkPhysicalDeviceFragmentShadingRateKHR;
/// ```
public final class VkPhysicalDeviceFragmentShadingRateKHR extends Struct {
    /// The struct layout of `VkPhysicalDeviceFragmentShadingRateKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sampleCounts"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("fragmentSize")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `sampleCounts` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampleCounts"));
    /// The byte offset of `fragmentSize`.
    public static final long OFFSET_fragmentSize = LAYOUT.byteOffset(PathElement.groupElement("fragmentSize"));
    /// The memory layout of `fragmentSize`.
    public static final MemoryLayout ML_fragmentSize = LAYOUT.select(PathElement.groupElement("fragmentSize"));

    /// Creates `VkPhysicalDeviceFragmentShadingRateKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceFragmentShadingRateKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceFragmentShadingRateKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShadingRateKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateKHR(segment); }

    /// Creates `VkPhysicalDeviceFragmentShadingRateKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShadingRateKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceFragmentShadingRateKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentShadingRateKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentShadingRateKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceFragmentShadingRateKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentShadingRateKHR`
    public static VkPhysicalDeviceFragmentShadingRateKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentShadingRateKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceFragmentShadingRateKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFragmentShadingRateKHR`
    public static VkPhysicalDeviceFragmentShadingRateKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentShadingRateKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceFragmentShadingRateKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceFragmentShadingRateKHR`
    public VkPhysicalDeviceFragmentShadingRateKHR asSlice(long index) { return new VkPhysicalDeviceFragmentShadingRateKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceFragmentShadingRateKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceFragmentShadingRateKHR`
    public VkPhysicalDeviceFragmentShadingRateKHR asSlice(long index, long count) { return new VkPhysicalDeviceFragmentShadingRateKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRateKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceFragmentShadingRateKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceFragmentShadingRateKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceFragmentShadingRateKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceFragmentShadingRateKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateKHR sType(@CType("VkStructureType") int value) { VkPhysicalDeviceFragmentShadingRateKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRateKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceFragmentShadingRateKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceFragmentShadingRateKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentShadingRateKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentShadingRateKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentShadingRateKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `sampleCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampleCountFlags") int get_sampleCounts(MemorySegment segment, long index) { return (int) VH_sampleCounts.get(segment, 0L, index); }
    /// {@return `sampleCounts`}
    /// @param segment the segment of the struct
    public static @CType("VkSampleCountFlags") int get_sampleCounts(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRateKHR.get_sampleCounts(segment, 0L); }
    /// {@return `sampleCounts` at the given index}
    /// @param index the index
    public @CType("VkSampleCountFlags") int sampleCountsAt(long index) { return VkPhysicalDeviceFragmentShadingRateKHR.get_sampleCounts(this.segment(), index); }
    /// {@return `sampleCounts`}
    public @CType("VkSampleCountFlags") int sampleCounts() { return VkPhysicalDeviceFragmentShadingRateKHR.get_sampleCounts(this.segment()); }
    /// Sets `sampleCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sampleCounts(MemorySegment segment, long index, @CType("VkSampleCountFlags") int value) { VH_sampleCounts.set(segment, 0L, index, value); }
    /// Sets `sampleCounts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sampleCounts(MemorySegment segment, @CType("VkSampleCountFlags") int value) { VkPhysicalDeviceFragmentShadingRateKHR.set_sampleCounts(segment, 0L, value); }
    /// Sets `sampleCounts` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateKHR sampleCountsAt(long index, @CType("VkSampleCountFlags") int value) { VkPhysicalDeviceFragmentShadingRateKHR.set_sampleCounts(this.segment(), index, value); return this; }
    /// Sets `sampleCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateKHR sampleCounts(@CType("VkSampleCountFlags") int value) { VkPhysicalDeviceFragmentShadingRateKHR.set_sampleCounts(this.segment(), value); return this; }

    /// {@return `fragmentSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_fragmentSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_fragmentSize, index), ML_fragmentSize); }
    /// {@return `fragmentSize`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_fragmentSize(MemorySegment segment) { return VkPhysicalDeviceFragmentShadingRateKHR.get_fragmentSize(segment, 0L); }
    /// {@return `fragmentSize` at the given index}
    /// @param index the index
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment fragmentSizeAt(long index) { return VkPhysicalDeviceFragmentShadingRateKHR.get_fragmentSize(this.segment(), index); }
    /// {@return `fragmentSize`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment fragmentSize() { return VkPhysicalDeviceFragmentShadingRateKHR.get_fragmentSize(this.segment()); }
    /// Sets `fragmentSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fragmentSize(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_fragmentSize, index), ML_fragmentSize.byteSize()); }
    /// Sets `fragmentSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fragmentSize(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentShadingRateKHR.set_fragmentSize(segment, 0L, value); }
    /// Sets `fragmentSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateKHR fragmentSizeAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentShadingRateKHR.set_fragmentSize(this.segment(), index, value); return this; }
    /// Sets `fragmentSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentShadingRateKHR fragmentSize(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentShadingRateKHR.set_fragmentSize(this.segment(), value); return this; }

}

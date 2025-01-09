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
/// ### cooperativeMatrixWorkgroupScopeMaxWorkgroupSize
/// [VarHandle][#VH_cooperativeMatrixWorkgroupScopeMaxWorkgroupSize] - [Getter][#cooperativeMatrixWorkgroupScopeMaxWorkgroupSize()] - [Setter][#cooperativeMatrixWorkgroupScopeMaxWorkgroupSize(int)]
/// ### cooperativeMatrixFlexibleDimensionsMaxDimension
/// [VarHandle][#VH_cooperativeMatrixFlexibleDimensionsMaxDimension] - [Getter][#cooperativeMatrixFlexibleDimensionsMaxDimension()] - [Setter][#cooperativeMatrixFlexibleDimensionsMaxDimension(int)]
/// ### cooperativeMatrixWorkgroupScopeReservedSharedMemory
/// [VarHandle][#VH_cooperativeMatrixWorkgroupScopeReservedSharedMemory] - [Getter][#cooperativeMatrixWorkgroupScopeReservedSharedMemory()] - [Setter][#cooperativeMatrixWorkgroupScopeReservedSharedMemory(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceCooperativeMatrix2PropertiesNV {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t cooperativeMatrixWorkgroupScopeMaxWorkgroupSize;
///     uint32_t cooperativeMatrixFlexibleDimensionsMaxDimension;
///     uint32_t cooperativeMatrixWorkgroupScopeReservedSharedMemory;
/// } VkPhysicalDeviceCooperativeMatrix2PropertiesNV;
/// ```
public final class VkPhysicalDeviceCooperativeMatrix2PropertiesNV extends Struct {
    /// The struct layout of `VkPhysicalDeviceCooperativeMatrix2PropertiesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixWorkgroupScopeMaxWorkgroupSize"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixFlexibleDimensionsMaxDimension"),
        ValueLayout.JAVA_INT.withName("cooperativeMatrixWorkgroupScopeReservedSharedMemory")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `cooperativeMatrixWorkgroupScopeMaxWorkgroupSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cooperativeMatrixWorkgroupScopeMaxWorkgroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixWorkgroupScopeMaxWorkgroupSize"));
    /// The [VarHandle] of `cooperativeMatrixFlexibleDimensionsMaxDimension` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cooperativeMatrixFlexibleDimensionsMaxDimension = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixFlexibleDimensionsMaxDimension"));
    /// The [VarHandle] of `cooperativeMatrixWorkgroupScopeReservedSharedMemory` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cooperativeMatrixWorkgroupScopeReservedSharedMemory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cooperativeMatrixWorkgroupScopeReservedSharedMemory"));

    /// Creates `VkPhysicalDeviceCooperativeMatrix2PropertiesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceCooperativeMatrix2PropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(segment); }

    /// Creates `VkPhysicalDeviceCooperativeMatrix2PropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceCooperativeMatrix2PropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrix2PropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrix2PropertiesNV`
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceCooperativeMatrix2PropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceCooperativeMatrix2PropertiesNV`
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceCooperativeMatrix2PropertiesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceCooperativeMatrix2PropertiesNV`
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV asSlice(long index) { return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceCooperativeMatrix2PropertiesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceCooperativeMatrix2PropertiesNV`
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV asSlice(long index, long count) { return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceCooperativeMatrix2PropertiesNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceCooperativeMatrix2PropertiesNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceCooperativeMatrix2PropertiesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceCooperativeMatrix2PropertiesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceCooperativeMatrix2PropertiesNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV sType(@CType("VkStructureType") int value) { VkPhysicalDeviceCooperativeMatrix2PropertiesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceCooperativeMatrix2PropertiesNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceCooperativeMatrix2PropertiesNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceCooperativeMatrix2PropertiesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceCooperativeMatrix2PropertiesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceCooperativeMatrix2PropertiesNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceCooperativeMatrix2PropertiesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `cooperativeMatrixWorkgroupScopeMaxWorkgroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_cooperativeMatrixWorkgroupScopeMaxWorkgroupSize(MemorySegment segment, long index) { return (int) VH_cooperativeMatrixWorkgroupScopeMaxWorkgroupSize.get(segment, 0L, index); }
    /// {@return `cooperativeMatrixWorkgroupScopeMaxWorkgroupSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_cooperativeMatrixWorkgroupScopeMaxWorkgroupSize(MemorySegment segment) { return VkPhysicalDeviceCooperativeMatrix2PropertiesNV.get_cooperativeMatrixWorkgroupScopeMaxWorkgroupSize(segment, 0L); }
    /// {@return `cooperativeMatrixWorkgroupScopeMaxWorkgroupSize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int cooperativeMatrixWorkgroupScopeMaxWorkgroupSizeAt(long index) { return VkPhysicalDeviceCooperativeMatrix2PropertiesNV.get_cooperativeMatrixWorkgroupScopeMaxWorkgroupSize(this.segment(), index); }
    /// {@return `cooperativeMatrixWorkgroupScopeMaxWorkgroupSize`}
    public @CType("uint32_t") int cooperativeMatrixWorkgroupScopeMaxWorkgroupSize() { return VkPhysicalDeviceCooperativeMatrix2PropertiesNV.get_cooperativeMatrixWorkgroupScopeMaxWorkgroupSize(this.segment()); }
    /// Sets `cooperativeMatrixWorkgroupScopeMaxWorkgroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cooperativeMatrixWorkgroupScopeMaxWorkgroupSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_cooperativeMatrixWorkgroupScopeMaxWorkgroupSize.set(segment, 0L, index, value); }
    /// Sets `cooperativeMatrixWorkgroupScopeMaxWorkgroupSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cooperativeMatrixWorkgroupScopeMaxWorkgroupSize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceCooperativeMatrix2PropertiesNV.set_cooperativeMatrixWorkgroupScopeMaxWorkgroupSize(segment, 0L, value); }
    /// Sets `cooperativeMatrixWorkgroupScopeMaxWorkgroupSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV cooperativeMatrixWorkgroupScopeMaxWorkgroupSizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceCooperativeMatrix2PropertiesNV.set_cooperativeMatrixWorkgroupScopeMaxWorkgroupSize(this.segment(), index, value); return this; }
    /// Sets `cooperativeMatrixWorkgroupScopeMaxWorkgroupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV cooperativeMatrixWorkgroupScopeMaxWorkgroupSize(@CType("uint32_t") int value) { VkPhysicalDeviceCooperativeMatrix2PropertiesNV.set_cooperativeMatrixWorkgroupScopeMaxWorkgroupSize(this.segment(), value); return this; }

    /// {@return `cooperativeMatrixFlexibleDimensionsMaxDimension` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_cooperativeMatrixFlexibleDimensionsMaxDimension(MemorySegment segment, long index) { return (int) VH_cooperativeMatrixFlexibleDimensionsMaxDimension.get(segment, 0L, index); }
    /// {@return `cooperativeMatrixFlexibleDimensionsMaxDimension`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_cooperativeMatrixFlexibleDimensionsMaxDimension(MemorySegment segment) { return VkPhysicalDeviceCooperativeMatrix2PropertiesNV.get_cooperativeMatrixFlexibleDimensionsMaxDimension(segment, 0L); }
    /// {@return `cooperativeMatrixFlexibleDimensionsMaxDimension` at the given index}
    /// @param index the index
    public @CType("uint32_t") int cooperativeMatrixFlexibleDimensionsMaxDimensionAt(long index) { return VkPhysicalDeviceCooperativeMatrix2PropertiesNV.get_cooperativeMatrixFlexibleDimensionsMaxDimension(this.segment(), index); }
    /// {@return `cooperativeMatrixFlexibleDimensionsMaxDimension`}
    public @CType("uint32_t") int cooperativeMatrixFlexibleDimensionsMaxDimension() { return VkPhysicalDeviceCooperativeMatrix2PropertiesNV.get_cooperativeMatrixFlexibleDimensionsMaxDimension(this.segment()); }
    /// Sets `cooperativeMatrixFlexibleDimensionsMaxDimension` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cooperativeMatrixFlexibleDimensionsMaxDimension(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_cooperativeMatrixFlexibleDimensionsMaxDimension.set(segment, 0L, index, value); }
    /// Sets `cooperativeMatrixFlexibleDimensionsMaxDimension` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cooperativeMatrixFlexibleDimensionsMaxDimension(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceCooperativeMatrix2PropertiesNV.set_cooperativeMatrixFlexibleDimensionsMaxDimension(segment, 0L, value); }
    /// Sets `cooperativeMatrixFlexibleDimensionsMaxDimension` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV cooperativeMatrixFlexibleDimensionsMaxDimensionAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceCooperativeMatrix2PropertiesNV.set_cooperativeMatrixFlexibleDimensionsMaxDimension(this.segment(), index, value); return this; }
    /// Sets `cooperativeMatrixFlexibleDimensionsMaxDimension` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV cooperativeMatrixFlexibleDimensionsMaxDimension(@CType("uint32_t") int value) { VkPhysicalDeviceCooperativeMatrix2PropertiesNV.set_cooperativeMatrixFlexibleDimensionsMaxDimension(this.segment(), value); return this; }

    /// {@return `cooperativeMatrixWorkgroupScopeReservedSharedMemory` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_cooperativeMatrixWorkgroupScopeReservedSharedMemory(MemorySegment segment, long index) { return (int) VH_cooperativeMatrixWorkgroupScopeReservedSharedMemory.get(segment, 0L, index); }
    /// {@return `cooperativeMatrixWorkgroupScopeReservedSharedMemory`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_cooperativeMatrixWorkgroupScopeReservedSharedMemory(MemorySegment segment) { return VkPhysicalDeviceCooperativeMatrix2PropertiesNV.get_cooperativeMatrixWorkgroupScopeReservedSharedMemory(segment, 0L); }
    /// {@return `cooperativeMatrixWorkgroupScopeReservedSharedMemory` at the given index}
    /// @param index the index
    public @CType("uint32_t") int cooperativeMatrixWorkgroupScopeReservedSharedMemoryAt(long index) { return VkPhysicalDeviceCooperativeMatrix2PropertiesNV.get_cooperativeMatrixWorkgroupScopeReservedSharedMemory(this.segment(), index); }
    /// {@return `cooperativeMatrixWorkgroupScopeReservedSharedMemory`}
    public @CType("uint32_t") int cooperativeMatrixWorkgroupScopeReservedSharedMemory() { return VkPhysicalDeviceCooperativeMatrix2PropertiesNV.get_cooperativeMatrixWorkgroupScopeReservedSharedMemory(this.segment()); }
    /// Sets `cooperativeMatrixWorkgroupScopeReservedSharedMemory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cooperativeMatrixWorkgroupScopeReservedSharedMemory(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_cooperativeMatrixWorkgroupScopeReservedSharedMemory.set(segment, 0L, index, value); }
    /// Sets `cooperativeMatrixWorkgroupScopeReservedSharedMemory` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cooperativeMatrixWorkgroupScopeReservedSharedMemory(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceCooperativeMatrix2PropertiesNV.set_cooperativeMatrixWorkgroupScopeReservedSharedMemory(segment, 0L, value); }
    /// Sets `cooperativeMatrixWorkgroupScopeReservedSharedMemory` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV cooperativeMatrixWorkgroupScopeReservedSharedMemoryAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceCooperativeMatrix2PropertiesNV.set_cooperativeMatrixWorkgroupScopeReservedSharedMemory(this.segment(), index, value); return this; }
    /// Sets `cooperativeMatrixWorkgroupScopeReservedSharedMemory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV cooperativeMatrixWorkgroupScopeReservedSharedMemory(@CType("uint32_t") int value) { VkPhysicalDeviceCooperativeMatrix2PropertiesNV.set_cooperativeMatrixWorkgroupScopeReservedSharedMemory(this.segment(), value); return this; }

}

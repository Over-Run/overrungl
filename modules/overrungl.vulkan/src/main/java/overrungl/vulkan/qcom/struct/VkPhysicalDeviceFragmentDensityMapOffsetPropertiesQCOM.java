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
package overrungl.vulkan.qcom.struct;

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
/// ### fragmentDensityOffsetGranularity
/// [Byte offset][#OFFSET_fragmentDensityOffsetGranularity] - [Memory layout][#ML_fragmentDensityOffsetGranularity] - [Getter][#fragmentDensityOffsetGranularity()] - [Setter][#fragmentDensityOffsetGranularity(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM {
///     VkStructureType sType;
///     void * pNext;
///     VkExtent2D fragmentDensityOffsetGranularity;
/// } VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM;
/// ```
public final class VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM extends Struct {
    /// The struct layout of `VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("fragmentDensityOffsetGranularity")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `fragmentDensityOffsetGranularity`.
    public static final long OFFSET_fragmentDensityOffsetGranularity = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityOffsetGranularity"));
    /// The memory layout of `fragmentDensityOffsetGranularity`.
    public static final MemoryLayout ML_fragmentDensityOffsetGranularity = LAYOUT.select(PathElement.groupElement("fragmentDensityOffsetGranularity"));

    /// Creates `VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM(segment); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM`
    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM`
    public static VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM`
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM asSlice(long index) { return new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM`
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM asSlice(long index, long count) { return new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM sType(@CType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.set_pNext(this.segment(), value); return this; }

    /// {@return `fragmentDensityOffsetGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_fragmentDensityOffsetGranularity(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_fragmentDensityOffsetGranularity, index), ML_fragmentDensityOffsetGranularity); }
    /// {@return `fragmentDensityOffsetGranularity`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_fragmentDensityOffsetGranularity(MemorySegment segment) { return VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.get_fragmentDensityOffsetGranularity(segment, 0L); }
    /// {@return `fragmentDensityOffsetGranularity` at the given index}
    /// @param index the index
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment fragmentDensityOffsetGranularityAt(long index) { return VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.get_fragmentDensityOffsetGranularity(this.segment(), index); }
    /// {@return `fragmentDensityOffsetGranularity`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment fragmentDensityOffsetGranularity() { return VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.get_fragmentDensityOffsetGranularity(this.segment()); }
    /// Sets `fragmentDensityOffsetGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fragmentDensityOffsetGranularity(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_fragmentDensityOffsetGranularity, index), ML_fragmentDensityOffsetGranularity.byteSize()); }
    /// Sets `fragmentDensityOffsetGranularity` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fragmentDensityOffsetGranularity(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.set_fragmentDensityOffsetGranularity(segment, 0L, value); }
    /// Sets `fragmentDensityOffsetGranularity` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM fragmentDensityOffsetGranularityAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.set_fragmentDensityOffsetGranularity(this.segment(), index, value); return this; }
    /// Sets `fragmentDensityOffsetGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM fragmentDensityOffsetGranularity(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.set_fragmentDensityOffsetGranularity(this.segment(), value); return this; }

}

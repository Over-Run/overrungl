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
/// ### maxDisplacementMicromapSubdivisionLevel
/// [VarHandle][#VH_maxDisplacementMicromapSubdivisionLevel] - [Getter][#maxDisplacementMicromapSubdivisionLevel()] - [Setter][#maxDisplacementMicromapSubdivisionLevel(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceDisplacementMicromapPropertiesNV {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t maxDisplacementMicromapSubdivisionLevel;
/// } VkPhysicalDeviceDisplacementMicromapPropertiesNV;
/// ```
public final class VkPhysicalDeviceDisplacementMicromapPropertiesNV extends Struct {
    /// The struct layout of `VkPhysicalDeviceDisplacementMicromapPropertiesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxDisplacementMicromapSubdivisionLevel")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `maxDisplacementMicromapSubdivisionLevel` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDisplacementMicromapSubdivisionLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDisplacementMicromapSubdivisionLevel"));

    /// Creates `VkPhysicalDeviceDisplacementMicromapPropertiesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceDisplacementMicromapPropertiesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDisplacementMicromapPropertiesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDisplacementMicromapPropertiesNV(segment); }

    /// Creates `VkPhysicalDeviceDisplacementMicromapPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDisplacementMicromapPropertiesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDisplacementMicromapPropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceDisplacementMicromapPropertiesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDisplacementMicromapPropertiesNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDisplacementMicromapPropertiesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceDisplacementMicromapPropertiesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDisplacementMicromapPropertiesNV`
    public static VkPhysicalDeviceDisplacementMicromapPropertiesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDisplacementMicromapPropertiesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceDisplacementMicromapPropertiesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDisplacementMicromapPropertiesNV`
    public static VkPhysicalDeviceDisplacementMicromapPropertiesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDisplacementMicromapPropertiesNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceDisplacementMicromapPropertiesNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceDisplacementMicromapPropertiesNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceDisplacementMicromapPropertiesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceDisplacementMicromapPropertiesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceDisplacementMicromapPropertiesNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV sType(@CType("VkStructureType") int value) { VkPhysicalDeviceDisplacementMicromapPropertiesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceDisplacementMicromapPropertiesNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceDisplacementMicromapPropertiesNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceDisplacementMicromapPropertiesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDisplacementMicromapPropertiesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDisplacementMicromapPropertiesNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDisplacementMicromapPropertiesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `maxDisplacementMicromapSubdivisionLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDisplacementMicromapSubdivisionLevel(MemorySegment segment, long index) { return (int) VH_maxDisplacementMicromapSubdivisionLevel.get(segment, 0L, index); }
    /// {@return `maxDisplacementMicromapSubdivisionLevel`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDisplacementMicromapSubdivisionLevel(MemorySegment segment) { return VkPhysicalDeviceDisplacementMicromapPropertiesNV.get_maxDisplacementMicromapSubdivisionLevel(segment, 0L); }
    /// {@return `maxDisplacementMicromapSubdivisionLevel` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxDisplacementMicromapSubdivisionLevelAt(long index) { return VkPhysicalDeviceDisplacementMicromapPropertiesNV.get_maxDisplacementMicromapSubdivisionLevel(this.segment(), index); }
    /// {@return `maxDisplacementMicromapSubdivisionLevel`}
    public @CType("uint32_t") int maxDisplacementMicromapSubdivisionLevel() { return VkPhysicalDeviceDisplacementMicromapPropertiesNV.get_maxDisplacementMicromapSubdivisionLevel(this.segment()); }
    /// Sets `maxDisplacementMicromapSubdivisionLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDisplacementMicromapSubdivisionLevel(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDisplacementMicromapSubdivisionLevel.set(segment, 0L, index, value); }
    /// Sets `maxDisplacementMicromapSubdivisionLevel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDisplacementMicromapSubdivisionLevel(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceDisplacementMicromapPropertiesNV.set_maxDisplacementMicromapSubdivisionLevel(segment, 0L, value); }
    /// Sets `maxDisplacementMicromapSubdivisionLevel` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV maxDisplacementMicromapSubdivisionLevelAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceDisplacementMicromapPropertiesNV.set_maxDisplacementMicromapSubdivisionLevel(this.segment(), index, value); return this; }
    /// Sets `maxDisplacementMicromapSubdivisionLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDisplacementMicromapPropertiesNV maxDisplacementMicromapSubdivisionLevel(@CType("uint32_t") int value) { VkPhysicalDeviceDisplacementMicromapPropertiesNV.set_maxDisplacementMicromapSubdivisionLevel(this.segment(), value); return this; }

}

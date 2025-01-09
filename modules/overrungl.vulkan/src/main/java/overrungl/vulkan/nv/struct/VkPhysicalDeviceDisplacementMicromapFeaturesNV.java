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
/// ### displacementMicromap
/// [VarHandle][#VH_displacementMicromap] - [Getter][#displacementMicromap()] - [Setter][#displacementMicromap(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceDisplacementMicromapFeaturesNV {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 displacementMicromap;
/// } VkPhysicalDeviceDisplacementMicromapFeaturesNV;
/// ```
public final class VkPhysicalDeviceDisplacementMicromapFeaturesNV extends Struct {
    /// The struct layout of `VkPhysicalDeviceDisplacementMicromapFeaturesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("displacementMicromap")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `displacementMicromap` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_displacementMicromap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("displacementMicromap"));

    /// Creates `VkPhysicalDeviceDisplacementMicromapFeaturesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceDisplacementMicromapFeaturesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceDisplacementMicromapFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDisplacementMicromapFeaturesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDisplacementMicromapFeaturesNV(segment); }

    /// Creates `VkPhysicalDeviceDisplacementMicromapFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDisplacementMicromapFeaturesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDisplacementMicromapFeaturesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceDisplacementMicromapFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceDisplacementMicromapFeaturesNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceDisplacementMicromapFeaturesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceDisplacementMicromapFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceDisplacementMicromapFeaturesNV`
    public static VkPhysicalDeviceDisplacementMicromapFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceDisplacementMicromapFeaturesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceDisplacementMicromapFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceDisplacementMicromapFeaturesNV`
    public static VkPhysicalDeviceDisplacementMicromapFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceDisplacementMicromapFeaturesNV(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceDisplacementMicromapFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceDisplacementMicromapFeaturesNV`
    public VkPhysicalDeviceDisplacementMicromapFeaturesNV asSlice(long index) { return new VkPhysicalDeviceDisplacementMicromapFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceDisplacementMicromapFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceDisplacementMicromapFeaturesNV`
    public VkPhysicalDeviceDisplacementMicromapFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceDisplacementMicromapFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceDisplacementMicromapFeaturesNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceDisplacementMicromapFeaturesNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceDisplacementMicromapFeaturesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceDisplacementMicromapFeaturesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDisplacementMicromapFeaturesNV sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceDisplacementMicromapFeaturesNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDisplacementMicromapFeaturesNV sType(@CType("VkStructureType") int value) { VkPhysicalDeviceDisplacementMicromapFeaturesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceDisplacementMicromapFeaturesNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceDisplacementMicromapFeaturesNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceDisplacementMicromapFeaturesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDisplacementMicromapFeaturesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDisplacementMicromapFeaturesNV pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDisplacementMicromapFeaturesNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDisplacementMicromapFeaturesNV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceDisplacementMicromapFeaturesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `displacementMicromap` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_displacementMicromap(MemorySegment segment, long index) { return (int) VH_displacementMicromap.get(segment, 0L, index); }
    /// {@return `displacementMicromap`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_displacementMicromap(MemorySegment segment) { return VkPhysicalDeviceDisplacementMicromapFeaturesNV.get_displacementMicromap(segment, 0L); }
    /// {@return `displacementMicromap` at the given index}
    /// @param index the index
    public @CType("VkBool32") int displacementMicromapAt(long index) { return VkPhysicalDeviceDisplacementMicromapFeaturesNV.get_displacementMicromap(this.segment(), index); }
    /// {@return `displacementMicromap`}
    public @CType("VkBool32") int displacementMicromap() { return VkPhysicalDeviceDisplacementMicromapFeaturesNV.get_displacementMicromap(this.segment()); }
    /// Sets `displacementMicromap` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_displacementMicromap(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_displacementMicromap.set(segment, 0L, index, value); }
    /// Sets `displacementMicromap` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_displacementMicromap(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceDisplacementMicromapFeaturesNV.set_displacementMicromap(segment, 0L, value); }
    /// Sets `displacementMicromap` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDisplacementMicromapFeaturesNV displacementMicromapAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceDisplacementMicromapFeaturesNV.set_displacementMicromap(this.segment(), index, value); return this; }
    /// Sets `displacementMicromap` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceDisplacementMicromapFeaturesNV displacementMicromap(@CType("VkBool32") int value) { VkPhysicalDeviceDisplacementMicromapFeaturesNV.set_displacementMicromap(this.segment(), value); return this; }

}

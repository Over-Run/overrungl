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
/// ### cubicRangeClamp
/// [VarHandle][#VH_cubicRangeClamp] - [Getter][#cubicRangeClamp()] - [Setter][#cubicRangeClamp(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceCubicClampFeaturesQCOM {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 cubicRangeClamp;
/// } VkPhysicalDeviceCubicClampFeaturesQCOM;
/// ```
public final class VkPhysicalDeviceCubicClampFeaturesQCOM extends Struct {
    /// The struct layout of `VkPhysicalDeviceCubicClampFeaturesQCOM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cubicRangeClamp")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `cubicRangeClamp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_cubicRangeClamp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("cubicRangeClamp"));

    /// Creates `VkPhysicalDeviceCubicClampFeaturesQCOM` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceCubicClampFeaturesQCOM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceCubicClampFeaturesQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCubicClampFeaturesQCOM of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceCubicClampFeaturesQCOM(segment); }

    /// Creates `VkPhysicalDeviceCubicClampFeaturesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCubicClampFeaturesQCOM ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceCubicClampFeaturesQCOM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceCubicClampFeaturesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCubicClampFeaturesQCOM ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceCubicClampFeaturesQCOM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceCubicClampFeaturesQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceCubicClampFeaturesQCOM`
    public static VkPhysicalDeviceCubicClampFeaturesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCubicClampFeaturesQCOM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceCubicClampFeaturesQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceCubicClampFeaturesQCOM`
    public static VkPhysicalDeviceCubicClampFeaturesQCOM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCubicClampFeaturesQCOM(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceCubicClampFeaturesQCOM.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceCubicClampFeaturesQCOM.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceCubicClampFeaturesQCOM.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceCubicClampFeaturesQCOM.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCubicClampFeaturesQCOM sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceCubicClampFeaturesQCOM.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCubicClampFeaturesQCOM sType(@CType("VkStructureType") int value) { VkPhysicalDeviceCubicClampFeaturesQCOM.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceCubicClampFeaturesQCOM.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceCubicClampFeaturesQCOM.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceCubicClampFeaturesQCOM.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceCubicClampFeaturesQCOM.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCubicClampFeaturesQCOM pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceCubicClampFeaturesQCOM.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCubicClampFeaturesQCOM pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceCubicClampFeaturesQCOM.set_pNext(this.segment(), value); return this; }

    /// {@return `cubicRangeClamp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_cubicRangeClamp(MemorySegment segment, long index) { return (int) VH_cubicRangeClamp.get(segment, 0L, index); }
    /// {@return `cubicRangeClamp`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_cubicRangeClamp(MemorySegment segment) { return VkPhysicalDeviceCubicClampFeaturesQCOM.get_cubicRangeClamp(segment, 0L); }
    /// {@return `cubicRangeClamp` at the given index}
    /// @param index the index
    public @CType("VkBool32") int cubicRangeClampAt(long index) { return VkPhysicalDeviceCubicClampFeaturesQCOM.get_cubicRangeClamp(this.segment(), index); }
    /// {@return `cubicRangeClamp`}
    public @CType("VkBool32") int cubicRangeClamp() { return VkPhysicalDeviceCubicClampFeaturesQCOM.get_cubicRangeClamp(this.segment()); }
    /// Sets `cubicRangeClamp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_cubicRangeClamp(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_cubicRangeClamp.set(segment, 0L, index, value); }
    /// Sets `cubicRangeClamp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_cubicRangeClamp(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceCubicClampFeaturesQCOM.set_cubicRangeClamp(segment, 0L, value); }
    /// Sets `cubicRangeClamp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCubicClampFeaturesQCOM cubicRangeClampAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceCubicClampFeaturesQCOM.set_cubicRangeClamp(this.segment(), index, value); return this; }
    /// Sets `cubicRangeClamp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCubicClampFeaturesQCOM cubicRangeClamp(@CType("VkBool32") int value) { VkPhysicalDeviceCubicClampFeaturesQCOM.set_cubicRangeClamp(this.segment(), value); return this; }

}

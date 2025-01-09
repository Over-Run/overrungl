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
/// ### multiviewPerViewViewports
/// [VarHandle][#VH_multiviewPerViewViewports] - [Getter][#multiviewPerViewViewports()] - [Setter][#multiviewPerViewViewports(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 multiviewPerViewViewports;
/// } VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM;
/// ```
public final class VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM extends Struct {
    /// The struct layout of `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("multiviewPerViewViewports")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `multiviewPerViewViewports` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_multiviewPerViewViewports = LAYOUT.arrayElementVarHandle(PathElement.groupElement("multiviewPerViewViewports"));

    /// Creates `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(segment); }

    /// Creates `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM`
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM`
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM`
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM asSlice(long index) { return new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM`
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM asSlice(long index, long count) { return new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM sType(@CType("VkStructureType") int value) { VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.set_pNext(this.segment(), value); return this; }

    /// {@return `multiviewPerViewViewports` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_multiviewPerViewViewports(MemorySegment segment, long index) { return (int) VH_multiviewPerViewViewports.get(segment, 0L, index); }
    /// {@return `multiviewPerViewViewports`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_multiviewPerViewViewports(MemorySegment segment) { return VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.get_multiviewPerViewViewports(segment, 0L); }
    /// {@return `multiviewPerViewViewports` at the given index}
    /// @param index the index
    public @CType("VkBool32") int multiviewPerViewViewportsAt(long index) { return VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.get_multiviewPerViewViewports(this.segment(), index); }
    /// {@return `multiviewPerViewViewports`}
    public @CType("VkBool32") int multiviewPerViewViewports() { return VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.get_multiviewPerViewViewports(this.segment()); }
    /// Sets `multiviewPerViewViewports` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_multiviewPerViewViewports(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_multiviewPerViewViewports.set(segment, 0L, index, value); }
    /// Sets `multiviewPerViewViewports` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_multiviewPerViewViewports(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.set_multiviewPerViewViewports(segment, 0L, value); }
    /// Sets `multiviewPerViewViewports` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM multiviewPerViewViewportsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.set_multiviewPerViewViewports(this.segment(), index, value); return this; }
    /// Sets `multiviewPerViewViewports` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM multiviewPerViewViewports(@CType("VkBool32") int value) { VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.set_multiviewPerViewViewports(this.segment(), value); return this; }

}

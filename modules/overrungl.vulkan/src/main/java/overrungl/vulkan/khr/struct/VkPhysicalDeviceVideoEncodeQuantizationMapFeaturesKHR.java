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
/// ### videoEncodeQuantizationMap
/// [VarHandle][#VH_videoEncodeQuantizationMap] - [Getter][#videoEncodeQuantizationMap()] - [Setter][#videoEncodeQuantizationMap(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 videoEncodeQuantizationMap;
/// } VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR;
/// ```
public final class VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR extends Struct {
    /// The struct layout of `VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("videoEncodeQuantizationMap")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `videoEncodeQuantizationMap` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_videoEncodeQuantizationMap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoEncodeQuantizationMap"));

    /// Creates `VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(segment); }

    /// Creates `VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR`
    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR`
    public static VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR`
    public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR asSlice(long index) { return new VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR`
    public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR asSlice(long index, long count) { return new VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR sType(@CType("VkStructureType") int value) { VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `videoEncodeQuantizationMap` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_videoEncodeQuantizationMap(MemorySegment segment, long index) { return (int) VH_videoEncodeQuantizationMap.get(segment, 0L, index); }
    /// {@return `videoEncodeQuantizationMap`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_videoEncodeQuantizationMap(MemorySegment segment) { return VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.get_videoEncodeQuantizationMap(segment, 0L); }
    /// {@return `videoEncodeQuantizationMap` at the given index}
    /// @param index the index
    public @CType("VkBool32") int videoEncodeQuantizationMapAt(long index) { return VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.get_videoEncodeQuantizationMap(this.segment(), index); }
    /// {@return `videoEncodeQuantizationMap`}
    public @CType("VkBool32") int videoEncodeQuantizationMap() { return VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.get_videoEncodeQuantizationMap(this.segment()); }
    /// Sets `videoEncodeQuantizationMap` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_videoEncodeQuantizationMap(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_videoEncodeQuantizationMap.set(segment, 0L, index, value); }
    /// Sets `videoEncodeQuantizationMap` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_videoEncodeQuantizationMap(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.set_videoEncodeQuantizationMap(segment, 0L, value); }
    /// Sets `videoEncodeQuantizationMap` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR videoEncodeQuantizationMapAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.set_videoEncodeQuantizationMap(this.segment(), index, value); return this; }
    /// Sets `videoEncodeQuantizationMap` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR videoEncodeQuantizationMap(@CType("VkBool32") int value) { VkPhysicalDeviceVideoEncodeQuantizationMapFeaturesKHR.set_videoEncodeQuantizationMap(this.segment(), value); return this; }

}

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
/// ### opticalFlow
/// [VarHandle][#VH_opticalFlow] - [Getter][#opticalFlow()] - [Setter][#opticalFlow(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceOpticalFlowFeaturesNV {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 opticalFlow;
/// } VkPhysicalDeviceOpticalFlowFeaturesNV;
/// ```
public final class VkPhysicalDeviceOpticalFlowFeaturesNV extends Struct {
    /// The struct layout of `VkPhysicalDeviceOpticalFlowFeaturesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("opticalFlow")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `opticalFlow` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_opticalFlow = LAYOUT.arrayElementVarHandle(PathElement.groupElement("opticalFlow"));

    /// Creates `VkPhysicalDeviceOpticalFlowFeaturesNV` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceOpticalFlowFeaturesNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceOpticalFlowFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceOpticalFlowFeaturesNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceOpticalFlowFeaturesNV(segment); }

    /// Creates `VkPhysicalDeviceOpticalFlowFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceOpticalFlowFeaturesNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceOpticalFlowFeaturesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceOpticalFlowFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceOpticalFlowFeaturesNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceOpticalFlowFeaturesNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceOpticalFlowFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceOpticalFlowFeaturesNV`
    public static VkPhysicalDeviceOpticalFlowFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceOpticalFlowFeaturesNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceOpticalFlowFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceOpticalFlowFeaturesNV`
    public static VkPhysicalDeviceOpticalFlowFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceOpticalFlowFeaturesNV(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceOpticalFlowFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceOpticalFlowFeaturesNV`
    public VkPhysicalDeviceOpticalFlowFeaturesNV asSlice(long index) { return new VkPhysicalDeviceOpticalFlowFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceOpticalFlowFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceOpticalFlowFeaturesNV`
    public VkPhysicalDeviceOpticalFlowFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceOpticalFlowFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceOpticalFlowFeaturesNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceOpticalFlowFeaturesNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceOpticalFlowFeaturesNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceOpticalFlowFeaturesNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowFeaturesNV sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceOpticalFlowFeaturesNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowFeaturesNV sType(@CType("VkStructureType") int value) { VkPhysicalDeviceOpticalFlowFeaturesNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceOpticalFlowFeaturesNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceOpticalFlowFeaturesNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceOpticalFlowFeaturesNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceOpticalFlowFeaturesNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowFeaturesNV pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceOpticalFlowFeaturesNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowFeaturesNV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceOpticalFlowFeaturesNV.set_pNext(this.segment(), value); return this; }

    /// {@return `opticalFlow` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_opticalFlow(MemorySegment segment, long index) { return (int) VH_opticalFlow.get(segment, 0L, index); }
    /// {@return `opticalFlow`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_opticalFlow(MemorySegment segment) { return VkPhysicalDeviceOpticalFlowFeaturesNV.get_opticalFlow(segment, 0L); }
    /// {@return `opticalFlow` at the given index}
    /// @param index the index
    public @CType("VkBool32") int opticalFlowAt(long index) { return VkPhysicalDeviceOpticalFlowFeaturesNV.get_opticalFlow(this.segment(), index); }
    /// {@return `opticalFlow`}
    public @CType("VkBool32") int opticalFlow() { return VkPhysicalDeviceOpticalFlowFeaturesNV.get_opticalFlow(this.segment()); }
    /// Sets `opticalFlow` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_opticalFlow(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_opticalFlow.set(segment, 0L, index, value); }
    /// Sets `opticalFlow` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_opticalFlow(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceOpticalFlowFeaturesNV.set_opticalFlow(segment, 0L, value); }
    /// Sets `opticalFlow` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowFeaturesNV opticalFlowAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceOpticalFlowFeaturesNV.set_opticalFlow(this.segment(), index, value); return this; }
    /// Sets `opticalFlow` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceOpticalFlowFeaturesNV opticalFlow(@CType("VkBool32") int value) { VkPhysicalDeviceOpticalFlowFeaturesNV.set_opticalFlow(this.segment(), value); return this; }

}

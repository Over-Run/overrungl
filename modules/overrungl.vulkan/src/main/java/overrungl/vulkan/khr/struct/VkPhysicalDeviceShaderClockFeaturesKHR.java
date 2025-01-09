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
/// ### shaderSubgroupClock
/// [VarHandle][#VH_shaderSubgroupClock] - [Getter][#shaderSubgroupClock()] - [Setter][#shaderSubgroupClock(int)]
/// ### shaderDeviceClock
/// [VarHandle][#VH_shaderDeviceClock] - [Getter][#shaderDeviceClock()] - [Setter][#shaderDeviceClock(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceShaderClockFeaturesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 shaderSubgroupClock;
///     VkBool32 shaderDeviceClock;
/// } VkPhysicalDeviceShaderClockFeaturesKHR;
/// ```
public final class VkPhysicalDeviceShaderClockFeaturesKHR extends Struct {
    /// The struct layout of `VkPhysicalDeviceShaderClockFeaturesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderSubgroupClock"),
        ValueLayout.JAVA_INT.withName("shaderDeviceClock")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `shaderSubgroupClock` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderSubgroupClock = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderSubgroupClock"));
    /// The [VarHandle] of `shaderDeviceClock` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_shaderDeviceClock = LAYOUT.arrayElementVarHandle(PathElement.groupElement("shaderDeviceClock"));

    /// Creates `VkPhysicalDeviceShaderClockFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceShaderClockFeaturesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceShaderClockFeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderClockFeaturesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderClockFeaturesKHR(segment); }

    /// Creates `VkPhysicalDeviceShaderClockFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderClockFeaturesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderClockFeaturesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceShaderClockFeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceShaderClockFeaturesKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceShaderClockFeaturesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceShaderClockFeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceShaderClockFeaturesKHR`
    public static VkPhysicalDeviceShaderClockFeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceShaderClockFeaturesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceShaderClockFeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceShaderClockFeaturesKHR`
    public static VkPhysicalDeviceShaderClockFeaturesKHR alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceShaderClockFeaturesKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceShaderClockFeaturesKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceShaderClockFeaturesKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceShaderClockFeaturesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderClockFeaturesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderClockFeaturesKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceShaderClockFeaturesKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderClockFeaturesKHR sType(@CType("VkStructureType") int value) { VkPhysicalDeviceShaderClockFeaturesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceShaderClockFeaturesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceShaderClockFeaturesKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceShaderClockFeaturesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderClockFeaturesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderClockFeaturesKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderClockFeaturesKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderClockFeaturesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceShaderClockFeaturesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `shaderSubgroupClock` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderSubgroupClock(MemorySegment segment, long index) { return (int) VH_shaderSubgroupClock.get(segment, 0L, index); }
    /// {@return `shaderSubgroupClock`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderSubgroupClock(MemorySegment segment) { return VkPhysicalDeviceShaderClockFeaturesKHR.get_shaderSubgroupClock(segment, 0L); }
    /// {@return `shaderSubgroupClock` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderSubgroupClockAt(long index) { return VkPhysicalDeviceShaderClockFeaturesKHR.get_shaderSubgroupClock(this.segment(), index); }
    /// {@return `shaderSubgroupClock`}
    public @CType("VkBool32") int shaderSubgroupClock() { return VkPhysicalDeviceShaderClockFeaturesKHR.get_shaderSubgroupClock(this.segment()); }
    /// Sets `shaderSubgroupClock` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderSubgroupClock(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderSubgroupClock.set(segment, 0L, index, value); }
    /// Sets `shaderSubgroupClock` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderSubgroupClock(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderClockFeaturesKHR.set_shaderSubgroupClock(segment, 0L, value); }
    /// Sets `shaderSubgroupClock` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderClockFeaturesKHR shaderSubgroupClockAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderClockFeaturesKHR.set_shaderSubgroupClock(this.segment(), index, value); return this; }
    /// Sets `shaderSubgroupClock` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderClockFeaturesKHR shaderSubgroupClock(@CType("VkBool32") int value) { VkPhysicalDeviceShaderClockFeaturesKHR.set_shaderSubgroupClock(this.segment(), value); return this; }

    /// {@return `shaderDeviceClock` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_shaderDeviceClock(MemorySegment segment, long index) { return (int) VH_shaderDeviceClock.get(segment, 0L, index); }
    /// {@return `shaderDeviceClock`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_shaderDeviceClock(MemorySegment segment) { return VkPhysicalDeviceShaderClockFeaturesKHR.get_shaderDeviceClock(segment, 0L); }
    /// {@return `shaderDeviceClock` at the given index}
    /// @param index the index
    public @CType("VkBool32") int shaderDeviceClockAt(long index) { return VkPhysicalDeviceShaderClockFeaturesKHR.get_shaderDeviceClock(this.segment(), index); }
    /// {@return `shaderDeviceClock`}
    public @CType("VkBool32") int shaderDeviceClock() { return VkPhysicalDeviceShaderClockFeaturesKHR.get_shaderDeviceClock(this.segment()); }
    /// Sets `shaderDeviceClock` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_shaderDeviceClock(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_shaderDeviceClock.set(segment, 0L, index, value); }
    /// Sets `shaderDeviceClock` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_shaderDeviceClock(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceShaderClockFeaturesKHR.set_shaderDeviceClock(segment, 0L, value); }
    /// Sets `shaderDeviceClock` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderClockFeaturesKHR shaderDeviceClockAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceShaderClockFeaturesKHR.set_shaderDeviceClock(this.segment(), index, value); return this; }
    /// Sets `shaderDeviceClock` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceShaderClockFeaturesKHR shaderDeviceClock(@CType("VkBool32") int value) { VkPhysicalDeviceShaderClockFeaturesKHR.set_shaderDeviceClock(this.segment(), value); return this; }

}

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
package overrungl.vulkan.struct;

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
/// ### deviceMask
/// [VarHandle][#VH_deviceMask] - [Getter][#deviceMask()] - [Setter][#deviceMask(int)]
/// ### deviceRenderAreaCount
/// [VarHandle][#VH_deviceRenderAreaCount] - [Getter][#deviceRenderAreaCount()] - [Setter][#deviceRenderAreaCount(int)]
/// ### pDeviceRenderAreas
/// [VarHandle][#VH_pDeviceRenderAreas] - [Getter][#pDeviceRenderAreas()] - [Setter][#pDeviceRenderAreas(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDeviceGroupRenderPassBeginInfo {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t deviceMask;
///     uint32_t deviceRenderAreaCount;
///     const VkRect2D * pDeviceRenderAreas;
/// } VkDeviceGroupRenderPassBeginInfo;
/// ```
public final class VkDeviceGroupRenderPassBeginInfo extends Struct {
    /// The struct layout of `VkDeviceGroupRenderPassBeginInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceMask"),
        ValueLayout.JAVA_INT.withName("deviceRenderAreaCount"),
        ValueLayout.ADDRESS.withName("pDeviceRenderAreas")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `deviceMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceMask"));
    /// The [VarHandle] of `deviceRenderAreaCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_deviceRenderAreaCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("deviceRenderAreaCount"));
    /// The [VarHandle] of `pDeviceRenderAreas` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pDeviceRenderAreas = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDeviceRenderAreas"));

    /// Creates `VkDeviceGroupRenderPassBeginInfo` with the given segment.
    /// @param segment the memory segment
    public VkDeviceGroupRenderPassBeginInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDeviceGroupRenderPassBeginInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupRenderPassBeginInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceGroupRenderPassBeginInfo(segment); }

    /// Creates `VkDeviceGroupRenderPassBeginInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupRenderPassBeginInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceGroupRenderPassBeginInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDeviceGroupRenderPassBeginInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDeviceGroupRenderPassBeginInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDeviceGroupRenderPassBeginInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDeviceGroupRenderPassBeginInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDeviceGroupRenderPassBeginInfo`
    public static VkDeviceGroupRenderPassBeginInfo alloc(SegmentAllocator allocator) { return new VkDeviceGroupRenderPassBeginInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDeviceGroupRenderPassBeginInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDeviceGroupRenderPassBeginInfo`
    public static VkDeviceGroupRenderPassBeginInfo alloc(SegmentAllocator allocator, long count) { return new VkDeviceGroupRenderPassBeginInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDeviceGroupRenderPassBeginInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkDeviceGroupRenderPassBeginInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDeviceGroupRenderPassBeginInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDeviceGroupRenderPassBeginInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupRenderPassBeginInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkDeviceGroupRenderPassBeginInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupRenderPassBeginInfo sType(@CType("VkStructureType") int value) { VkDeviceGroupRenderPassBeginInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDeviceGroupRenderPassBeginInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDeviceGroupRenderPassBeginInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDeviceGroupRenderPassBeginInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceGroupRenderPassBeginInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupRenderPassBeginInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceGroupRenderPassBeginInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupRenderPassBeginInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDeviceGroupRenderPassBeginInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `deviceMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_deviceMask(MemorySegment segment, long index) { return (int) VH_deviceMask.get(segment, 0L, index); }
    /// {@return `deviceMask`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_deviceMask(MemorySegment segment) { return VkDeviceGroupRenderPassBeginInfo.get_deviceMask(segment, 0L); }
    /// {@return `deviceMask` at the given index}
    /// @param index the index
    public @CType("uint32_t") int deviceMaskAt(long index) { return VkDeviceGroupRenderPassBeginInfo.get_deviceMask(this.segment(), index); }
    /// {@return `deviceMask`}
    public @CType("uint32_t") int deviceMask() { return VkDeviceGroupRenderPassBeginInfo.get_deviceMask(this.segment()); }
    /// Sets `deviceMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceMask(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_deviceMask.set(segment, 0L, index, value); }
    /// Sets `deviceMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceMask(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceGroupRenderPassBeginInfo.set_deviceMask(segment, 0L, value); }
    /// Sets `deviceMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupRenderPassBeginInfo deviceMaskAt(long index, @CType("uint32_t") int value) { VkDeviceGroupRenderPassBeginInfo.set_deviceMask(this.segment(), index, value); return this; }
    /// Sets `deviceMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupRenderPassBeginInfo deviceMask(@CType("uint32_t") int value) { VkDeviceGroupRenderPassBeginInfo.set_deviceMask(this.segment(), value); return this; }

    /// {@return `deviceRenderAreaCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_deviceRenderAreaCount(MemorySegment segment, long index) { return (int) VH_deviceRenderAreaCount.get(segment, 0L, index); }
    /// {@return `deviceRenderAreaCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_deviceRenderAreaCount(MemorySegment segment) { return VkDeviceGroupRenderPassBeginInfo.get_deviceRenderAreaCount(segment, 0L); }
    /// {@return `deviceRenderAreaCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int deviceRenderAreaCountAt(long index) { return VkDeviceGroupRenderPassBeginInfo.get_deviceRenderAreaCount(this.segment(), index); }
    /// {@return `deviceRenderAreaCount`}
    public @CType("uint32_t") int deviceRenderAreaCount() { return VkDeviceGroupRenderPassBeginInfo.get_deviceRenderAreaCount(this.segment()); }
    /// Sets `deviceRenderAreaCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_deviceRenderAreaCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_deviceRenderAreaCount.set(segment, 0L, index, value); }
    /// Sets `deviceRenderAreaCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_deviceRenderAreaCount(MemorySegment segment, @CType("uint32_t") int value) { VkDeviceGroupRenderPassBeginInfo.set_deviceRenderAreaCount(segment, 0L, value); }
    /// Sets `deviceRenderAreaCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupRenderPassBeginInfo deviceRenderAreaCountAt(long index, @CType("uint32_t") int value) { VkDeviceGroupRenderPassBeginInfo.set_deviceRenderAreaCount(this.segment(), index, value); return this; }
    /// Sets `deviceRenderAreaCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupRenderPassBeginInfo deviceRenderAreaCount(@CType("uint32_t") int value) { VkDeviceGroupRenderPassBeginInfo.set_deviceRenderAreaCount(this.segment(), value); return this; }

    /// {@return `pDeviceRenderAreas` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkRect2D *") java.lang.foreign.MemorySegment get_pDeviceRenderAreas(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pDeviceRenderAreas.get(segment, 0L, index); }
    /// {@return `pDeviceRenderAreas`}
    /// @param segment the segment of the struct
    public static @CType("const VkRect2D *") java.lang.foreign.MemorySegment get_pDeviceRenderAreas(MemorySegment segment) { return VkDeviceGroupRenderPassBeginInfo.get_pDeviceRenderAreas(segment, 0L); }
    /// {@return `pDeviceRenderAreas` at the given index}
    /// @param index the index
    public @CType("const VkRect2D *") java.lang.foreign.MemorySegment pDeviceRenderAreasAt(long index) { return VkDeviceGroupRenderPassBeginInfo.get_pDeviceRenderAreas(this.segment(), index); }
    /// {@return `pDeviceRenderAreas`}
    public @CType("const VkRect2D *") java.lang.foreign.MemorySegment pDeviceRenderAreas() { return VkDeviceGroupRenderPassBeginInfo.get_pDeviceRenderAreas(this.segment()); }
    /// Sets `pDeviceRenderAreas` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDeviceRenderAreas(MemorySegment segment, long index, @CType("const VkRect2D *") java.lang.foreign.MemorySegment value) { VH_pDeviceRenderAreas.set(segment, 0L, index, value); }
    /// Sets `pDeviceRenderAreas` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDeviceRenderAreas(MemorySegment segment, @CType("const VkRect2D *") java.lang.foreign.MemorySegment value) { VkDeviceGroupRenderPassBeginInfo.set_pDeviceRenderAreas(segment, 0L, value); }
    /// Sets `pDeviceRenderAreas` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupRenderPassBeginInfo pDeviceRenderAreasAt(long index, @CType("const VkRect2D *") java.lang.foreign.MemorySegment value) { VkDeviceGroupRenderPassBeginInfo.set_pDeviceRenderAreas(this.segment(), index, value); return this; }
    /// Sets `pDeviceRenderAreas` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDeviceGroupRenderPassBeginInfo pDeviceRenderAreas(@CType("const VkRect2D *") java.lang.foreign.MemorySegment value) { VkDeviceGroupRenderPassBeginInfo.set_pDeviceRenderAreas(this.segment(), value); return this; }

}

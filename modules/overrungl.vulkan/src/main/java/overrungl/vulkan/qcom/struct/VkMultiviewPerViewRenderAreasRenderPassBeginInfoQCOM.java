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
/// ### perViewRenderAreaCount
/// [VarHandle][#VH_perViewRenderAreaCount] - [Getter][#perViewRenderAreaCount()] - [Setter][#perViewRenderAreaCount(int)]
/// ### pPerViewRenderAreas
/// [VarHandle][#VH_pPerViewRenderAreas] - [Getter][#pPerViewRenderAreas()] - [Setter][#pPerViewRenderAreas(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t perViewRenderAreaCount;
///     const VkRect2D * pPerViewRenderAreas;
/// } VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM;
/// ```
public final class VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM extends Struct {
    /// The struct layout of `VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("perViewRenderAreaCount"),
        ValueLayout.ADDRESS.withName("pPerViewRenderAreas")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `perViewRenderAreaCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_perViewRenderAreaCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("perViewRenderAreaCount"));
    /// The [VarHandle] of `pPerViewRenderAreas` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pPerViewRenderAreas = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPerViewRenderAreas"));

    /// Creates `VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM` with the given segment.
    /// @param segment the memory segment
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(segment); }

    /// Creates `VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM`
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM alloc(SegmentAllocator allocator) { return new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM`
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM alloc(SegmentAllocator allocator, long count) { return new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM sTypeAt(long index, @CType("VkStructureType") int value) { VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM sType(@CType("VkStructureType") int value) { VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.set_pNext(this.segment(), value); return this; }

    /// {@return `perViewRenderAreaCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_perViewRenderAreaCount(MemorySegment segment, long index) { return (int) VH_perViewRenderAreaCount.get(segment, 0L, index); }
    /// {@return `perViewRenderAreaCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_perViewRenderAreaCount(MemorySegment segment) { return VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.get_perViewRenderAreaCount(segment, 0L); }
    /// {@return `perViewRenderAreaCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int perViewRenderAreaCountAt(long index) { return VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.get_perViewRenderAreaCount(this.segment(), index); }
    /// {@return `perViewRenderAreaCount`}
    public @CType("uint32_t") int perViewRenderAreaCount() { return VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.get_perViewRenderAreaCount(this.segment()); }
    /// Sets `perViewRenderAreaCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_perViewRenderAreaCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_perViewRenderAreaCount.set(segment, 0L, index, value); }
    /// Sets `perViewRenderAreaCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_perViewRenderAreaCount(MemorySegment segment, @CType("uint32_t") int value) { VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.set_perViewRenderAreaCount(segment, 0L, value); }
    /// Sets `perViewRenderAreaCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM perViewRenderAreaCountAt(long index, @CType("uint32_t") int value) { VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.set_perViewRenderAreaCount(this.segment(), index, value); return this; }
    /// Sets `perViewRenderAreaCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM perViewRenderAreaCount(@CType("uint32_t") int value) { VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.set_perViewRenderAreaCount(this.segment(), value); return this; }

    /// {@return `pPerViewRenderAreas` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkRect2D *") java.lang.foreign.MemorySegment get_pPerViewRenderAreas(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pPerViewRenderAreas.get(segment, 0L, index); }
    /// {@return `pPerViewRenderAreas`}
    /// @param segment the segment of the struct
    public static @CType("const VkRect2D *") java.lang.foreign.MemorySegment get_pPerViewRenderAreas(MemorySegment segment) { return VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.get_pPerViewRenderAreas(segment, 0L); }
    /// {@return `pPerViewRenderAreas` at the given index}
    /// @param index the index
    public @CType("const VkRect2D *") java.lang.foreign.MemorySegment pPerViewRenderAreasAt(long index) { return VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.get_pPerViewRenderAreas(this.segment(), index); }
    /// {@return `pPerViewRenderAreas`}
    public @CType("const VkRect2D *") java.lang.foreign.MemorySegment pPerViewRenderAreas() { return VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.get_pPerViewRenderAreas(this.segment()); }
    /// Sets `pPerViewRenderAreas` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pPerViewRenderAreas(MemorySegment segment, long index, @CType("const VkRect2D *") java.lang.foreign.MemorySegment value) { VH_pPerViewRenderAreas.set(segment, 0L, index, value); }
    /// Sets `pPerViewRenderAreas` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pPerViewRenderAreas(MemorySegment segment, @CType("const VkRect2D *") java.lang.foreign.MemorySegment value) { VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.set_pPerViewRenderAreas(segment, 0L, value); }
    /// Sets `pPerViewRenderAreas` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM pPerViewRenderAreasAt(long index, @CType("const VkRect2D *") java.lang.foreign.MemorySegment value) { VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.set_pPerViewRenderAreas(this.segment(), index, value); return this; }
    /// Sets `pPerViewRenderAreas` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM pPerViewRenderAreas(@CType("const VkRect2D *") java.lang.foreign.MemorySegment value) { VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.set_pPerViewRenderAreas(this.segment(), value); return this; }

}

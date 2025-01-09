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
/// ### timingCount
/// [VarHandle][#VH_timingCount] - [Getter][#timingCount()] - [Setter][#timingCount(int)]
/// ### pTimings
/// [VarHandle][#VH_pTimings] - [Getter][#pTimings()] - [Setter][#pTimings(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkGetLatencyMarkerInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t timingCount;
///     VkLatencyTimingsFrameReportNV * pTimings;
/// } VkGetLatencyMarkerInfoNV;
/// ```
public final class VkGetLatencyMarkerInfoNV extends Struct {
    /// The struct layout of `VkGetLatencyMarkerInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("timingCount"),
        ValueLayout.ADDRESS.withName("pTimings")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `timingCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_timingCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timingCount"));
    /// The [VarHandle] of `pTimings` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pTimings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTimings"));

    /// Creates `VkGetLatencyMarkerInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkGetLatencyMarkerInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkGetLatencyMarkerInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGetLatencyMarkerInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkGetLatencyMarkerInfoNV(segment); }

    /// Creates `VkGetLatencyMarkerInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGetLatencyMarkerInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkGetLatencyMarkerInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkGetLatencyMarkerInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGetLatencyMarkerInfoNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkGetLatencyMarkerInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkGetLatencyMarkerInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGetLatencyMarkerInfoNV`
    public static VkGetLatencyMarkerInfoNV alloc(SegmentAllocator allocator) { return new VkGetLatencyMarkerInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkGetLatencyMarkerInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkGetLatencyMarkerInfoNV`
    public static VkGetLatencyMarkerInfoNV alloc(SegmentAllocator allocator, long count) { return new VkGetLatencyMarkerInfoNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkGetLatencyMarkerInfoNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkGetLatencyMarkerInfoNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkGetLatencyMarkerInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkGetLatencyMarkerInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGetLatencyMarkerInfoNV sTypeAt(long index, @CType("VkStructureType") int value) { VkGetLatencyMarkerInfoNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGetLatencyMarkerInfoNV sType(@CType("VkStructureType") int value) { VkGetLatencyMarkerInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkGetLatencyMarkerInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkGetLatencyMarkerInfoNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkGetLatencyMarkerInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkGetLatencyMarkerInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGetLatencyMarkerInfoNV pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkGetLatencyMarkerInfoNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGetLatencyMarkerInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkGetLatencyMarkerInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `timingCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_timingCount(MemorySegment segment, long index) { return (int) VH_timingCount.get(segment, 0L, index); }
    /// {@return `timingCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_timingCount(MemorySegment segment) { return VkGetLatencyMarkerInfoNV.get_timingCount(segment, 0L); }
    /// {@return `timingCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int timingCountAt(long index) { return VkGetLatencyMarkerInfoNV.get_timingCount(this.segment(), index); }
    /// {@return `timingCount`}
    public @CType("uint32_t") int timingCount() { return VkGetLatencyMarkerInfoNV.get_timingCount(this.segment()); }
    /// Sets `timingCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_timingCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_timingCount.set(segment, 0L, index, value); }
    /// Sets `timingCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_timingCount(MemorySegment segment, @CType("uint32_t") int value) { VkGetLatencyMarkerInfoNV.set_timingCount(segment, 0L, value); }
    /// Sets `timingCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGetLatencyMarkerInfoNV timingCountAt(long index, @CType("uint32_t") int value) { VkGetLatencyMarkerInfoNV.set_timingCount(this.segment(), index, value); return this; }
    /// Sets `timingCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGetLatencyMarkerInfoNV timingCount(@CType("uint32_t") int value) { VkGetLatencyMarkerInfoNV.set_timingCount(this.segment(), value); return this; }

    /// {@return `pTimings` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkLatencyTimingsFrameReportNV *") java.lang.foreign.MemorySegment get_pTimings(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pTimings.get(segment, 0L, index); }
    /// {@return `pTimings`}
    /// @param segment the segment of the struct
    public static @CType("VkLatencyTimingsFrameReportNV *") java.lang.foreign.MemorySegment get_pTimings(MemorySegment segment) { return VkGetLatencyMarkerInfoNV.get_pTimings(segment, 0L); }
    /// {@return `pTimings` at the given index}
    /// @param index the index
    public @CType("VkLatencyTimingsFrameReportNV *") java.lang.foreign.MemorySegment pTimingsAt(long index) { return VkGetLatencyMarkerInfoNV.get_pTimings(this.segment(), index); }
    /// {@return `pTimings`}
    public @CType("VkLatencyTimingsFrameReportNV *") java.lang.foreign.MemorySegment pTimings() { return VkGetLatencyMarkerInfoNV.get_pTimings(this.segment()); }
    /// Sets `pTimings` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pTimings(MemorySegment segment, long index, @CType("VkLatencyTimingsFrameReportNV *") java.lang.foreign.MemorySegment value) { VH_pTimings.set(segment, 0L, index, value); }
    /// Sets `pTimings` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pTimings(MemorySegment segment, @CType("VkLatencyTimingsFrameReportNV *") java.lang.foreign.MemorySegment value) { VkGetLatencyMarkerInfoNV.set_pTimings(segment, 0L, value); }
    /// Sets `pTimings` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGetLatencyMarkerInfoNV pTimingsAt(long index, @CType("VkLatencyTimingsFrameReportNV *") java.lang.foreign.MemorySegment value) { VkGetLatencyMarkerInfoNV.set_pTimings(this.segment(), index, value); return this; }
    /// Sets `pTimings` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGetLatencyMarkerInfoNV pTimings(@CType("VkLatencyTimingsFrameReportNV *") java.lang.foreign.MemorySegment value) { VkGetLatencyMarkerInfoNV.set_pTimings(this.segment(), value); return this; }

}
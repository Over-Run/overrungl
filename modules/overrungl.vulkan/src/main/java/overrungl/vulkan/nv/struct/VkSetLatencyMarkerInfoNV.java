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
/// ### presentID
/// [VarHandle][#VH_presentID] - [Getter][#presentID()] - [Setter][#presentID(long)]
/// ### marker
/// [VarHandle][#VH_marker] - [Getter][#marker()] - [Setter][#marker(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSetLatencyMarkerInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     uint64_t presentID;
///     VkLatencyMarkerNV marker;
/// } VkSetLatencyMarkerInfoNV;
/// ```
public final class VkSetLatencyMarkerInfoNV extends Struct {
    /// The struct layout of `VkSetLatencyMarkerInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("presentID"),
        ValueLayout.JAVA_INT.withName("marker")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `presentID` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_presentID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentID"));
    /// The [VarHandle] of `marker` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_marker = LAYOUT.arrayElementVarHandle(PathElement.groupElement("marker"));

    /// Creates `VkSetLatencyMarkerInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkSetLatencyMarkerInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSetLatencyMarkerInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSetLatencyMarkerInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSetLatencyMarkerInfoNV(segment); }

    /// Creates `VkSetLatencyMarkerInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSetLatencyMarkerInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSetLatencyMarkerInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSetLatencyMarkerInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSetLatencyMarkerInfoNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSetLatencyMarkerInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSetLatencyMarkerInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSetLatencyMarkerInfoNV`
    public static VkSetLatencyMarkerInfoNV alloc(SegmentAllocator allocator) { return new VkSetLatencyMarkerInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSetLatencyMarkerInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSetLatencyMarkerInfoNV`
    public static VkSetLatencyMarkerInfoNV alloc(SegmentAllocator allocator, long count) { return new VkSetLatencyMarkerInfoNV(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkSetLatencyMarkerInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSetLatencyMarkerInfoNV`
    public VkSetLatencyMarkerInfoNV asSlice(long index) { return new VkSetLatencyMarkerInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkSetLatencyMarkerInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSetLatencyMarkerInfoNV`
    public VkSetLatencyMarkerInfoNV asSlice(long index, long count) { return new VkSetLatencyMarkerInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSetLatencyMarkerInfoNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkSetLatencyMarkerInfoNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSetLatencyMarkerInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSetLatencyMarkerInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSetLatencyMarkerInfoNV sTypeAt(long index, @CType("VkStructureType") int value) { VkSetLatencyMarkerInfoNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetLatencyMarkerInfoNV sType(@CType("VkStructureType") int value) { VkSetLatencyMarkerInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSetLatencyMarkerInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSetLatencyMarkerInfoNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkSetLatencyMarkerInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSetLatencyMarkerInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSetLatencyMarkerInfoNV pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSetLatencyMarkerInfoNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetLatencyMarkerInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkSetLatencyMarkerInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `presentID` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_presentID(MemorySegment segment, long index) { return (long) VH_presentID.get(segment, 0L, index); }
    /// {@return `presentID`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_presentID(MemorySegment segment) { return VkSetLatencyMarkerInfoNV.get_presentID(segment, 0L); }
    /// {@return `presentID` at the given index}
    /// @param index the index
    public @CType("uint64_t") long presentIDAt(long index) { return VkSetLatencyMarkerInfoNV.get_presentID(this.segment(), index); }
    /// {@return `presentID`}
    public @CType("uint64_t") long presentID() { return VkSetLatencyMarkerInfoNV.get_presentID(this.segment()); }
    /// Sets `presentID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_presentID(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_presentID.set(segment, 0L, index, value); }
    /// Sets `presentID` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_presentID(MemorySegment segment, @CType("uint64_t") long value) { VkSetLatencyMarkerInfoNV.set_presentID(segment, 0L, value); }
    /// Sets `presentID` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSetLatencyMarkerInfoNV presentIDAt(long index, @CType("uint64_t") long value) { VkSetLatencyMarkerInfoNV.set_presentID(this.segment(), index, value); return this; }
    /// Sets `presentID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetLatencyMarkerInfoNV presentID(@CType("uint64_t") long value) { VkSetLatencyMarkerInfoNV.set_presentID(this.segment(), value); return this; }

    /// {@return `marker` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkLatencyMarkerNV") int get_marker(MemorySegment segment, long index) { return (int) VH_marker.get(segment, 0L, index); }
    /// {@return `marker`}
    /// @param segment the segment of the struct
    public static @CType("VkLatencyMarkerNV") int get_marker(MemorySegment segment) { return VkSetLatencyMarkerInfoNV.get_marker(segment, 0L); }
    /// {@return `marker` at the given index}
    /// @param index the index
    public @CType("VkLatencyMarkerNV") int markerAt(long index) { return VkSetLatencyMarkerInfoNV.get_marker(this.segment(), index); }
    /// {@return `marker`}
    public @CType("VkLatencyMarkerNV") int marker() { return VkSetLatencyMarkerInfoNV.get_marker(this.segment()); }
    /// Sets `marker` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_marker(MemorySegment segment, long index, @CType("VkLatencyMarkerNV") int value) { VH_marker.set(segment, 0L, index, value); }
    /// Sets `marker` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_marker(MemorySegment segment, @CType("VkLatencyMarkerNV") int value) { VkSetLatencyMarkerInfoNV.set_marker(segment, 0L, value); }
    /// Sets `marker` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSetLatencyMarkerInfoNV markerAt(long index, @CType("VkLatencyMarkerNV") int value) { VkSetLatencyMarkerInfoNV.set_marker(this.segment(), index, value); return this; }
    /// Sets `marker` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetLatencyMarkerInfoNV marker(@CType("VkLatencyMarkerNV") int value) { VkSetLatencyMarkerInfoNV.set_marker(this.segment(), value); return this; }

}

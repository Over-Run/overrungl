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
/// ### mode
/// [VarHandle][#VH_mode] - [Getter][#mode()] - [Setter][#mode(java.lang.foreign.MemorySegment)]
/// ### planeIndex
/// [VarHandle][#VH_planeIndex] - [Getter][#planeIndex()] - [Setter][#planeIndex(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDisplayPlaneInfo2KHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkDisplayModeKHR mode;
///     uint32_t planeIndex;
/// } VkDisplayPlaneInfo2KHR;
/// ```
public final class VkDisplayPlaneInfo2KHR extends Struct {
    /// The struct layout of `VkDisplayPlaneInfo2KHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("mode"),
        ValueLayout.JAVA_INT.withName("planeIndex")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `mode` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));
    /// The [VarHandle] of `planeIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_planeIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("planeIndex"));

    /// Creates `VkDisplayPlaneInfo2KHR` with the given segment.
    /// @param segment the memory segment
    public VkDisplayPlaneInfo2KHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDisplayPlaneInfo2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayPlaneInfo2KHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayPlaneInfo2KHR(segment); }

    /// Creates `VkDisplayPlaneInfo2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayPlaneInfo2KHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayPlaneInfo2KHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDisplayPlaneInfo2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDisplayPlaneInfo2KHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDisplayPlaneInfo2KHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDisplayPlaneInfo2KHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDisplayPlaneInfo2KHR`
    public static VkDisplayPlaneInfo2KHR alloc(SegmentAllocator allocator) { return new VkDisplayPlaneInfo2KHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDisplayPlaneInfo2KHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDisplayPlaneInfo2KHR`
    public static VkDisplayPlaneInfo2KHR alloc(SegmentAllocator allocator, long count) { return new VkDisplayPlaneInfo2KHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDisplayPlaneInfo2KHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkDisplayPlaneInfo2KHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDisplayPlaneInfo2KHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDisplayPlaneInfo2KHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneInfo2KHR sTypeAt(long index, @CType("VkStructureType") int value) { VkDisplayPlaneInfo2KHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneInfo2KHR sType(@CType("VkStructureType") int value) { VkDisplayPlaneInfo2KHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDisplayPlaneInfo2KHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDisplayPlaneInfo2KHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDisplayPlaneInfo2KHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDisplayPlaneInfo2KHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneInfo2KHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDisplayPlaneInfo2KHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneInfo2KHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDisplayPlaneInfo2KHR.set_pNext(this.segment(), value); return this; }

    /// {@return `mode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDisplayModeKHR") java.lang.foreign.MemorySegment get_mode(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_mode.get(segment, 0L, index); }
    /// {@return `mode`}
    /// @param segment the segment of the struct
    public static @CType("VkDisplayModeKHR") java.lang.foreign.MemorySegment get_mode(MemorySegment segment) { return VkDisplayPlaneInfo2KHR.get_mode(segment, 0L); }
    /// {@return `mode` at the given index}
    /// @param index the index
    public @CType("VkDisplayModeKHR") java.lang.foreign.MemorySegment modeAt(long index) { return VkDisplayPlaneInfo2KHR.get_mode(this.segment(), index); }
    /// {@return `mode`}
    public @CType("VkDisplayModeKHR") java.lang.foreign.MemorySegment mode() { return VkDisplayPlaneInfo2KHR.get_mode(this.segment()); }
    /// Sets `mode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mode(MemorySegment segment, long index, @CType("VkDisplayModeKHR") java.lang.foreign.MemorySegment value) { VH_mode.set(segment, 0L, index, value); }
    /// Sets `mode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mode(MemorySegment segment, @CType("VkDisplayModeKHR") java.lang.foreign.MemorySegment value) { VkDisplayPlaneInfo2KHR.set_mode(segment, 0L, value); }
    /// Sets `mode` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneInfo2KHR modeAt(long index, @CType("VkDisplayModeKHR") java.lang.foreign.MemorySegment value) { VkDisplayPlaneInfo2KHR.set_mode(this.segment(), index, value); return this; }
    /// Sets `mode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneInfo2KHR mode(@CType("VkDisplayModeKHR") java.lang.foreign.MemorySegment value) { VkDisplayPlaneInfo2KHR.set_mode(this.segment(), value); return this; }

    /// {@return `planeIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_planeIndex(MemorySegment segment, long index) { return (int) VH_planeIndex.get(segment, 0L, index); }
    /// {@return `planeIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_planeIndex(MemorySegment segment) { return VkDisplayPlaneInfo2KHR.get_planeIndex(segment, 0L); }
    /// {@return `planeIndex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int planeIndexAt(long index) { return VkDisplayPlaneInfo2KHR.get_planeIndex(this.segment(), index); }
    /// {@return `planeIndex`}
    public @CType("uint32_t") int planeIndex() { return VkDisplayPlaneInfo2KHR.get_planeIndex(this.segment()); }
    /// Sets `planeIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_planeIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_planeIndex.set(segment, 0L, index, value); }
    /// Sets `planeIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_planeIndex(MemorySegment segment, @CType("uint32_t") int value) { VkDisplayPlaneInfo2KHR.set_planeIndex(segment, 0L, value); }
    /// Sets `planeIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneInfo2KHR planeIndexAt(long index, @CType("uint32_t") int value) { VkDisplayPlaneInfo2KHR.set_planeIndex(this.segment(), index, value); return this; }
    /// Sets `planeIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDisplayPlaneInfo2KHR planeIndex(@CType("uint32_t") int value) { VkDisplayPlaneInfo2KHR.set_planeIndex(this.segment(), value); return this; }

}

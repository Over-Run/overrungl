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
package overrungl.vulkan.lunarg.struct;

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
/// [VarHandle][#VH_mode] - [Getter][#mode()] - [Setter][#mode(int)]
/// ### driverCount
/// [VarHandle][#VH_driverCount] - [Getter][#driverCount()] - [Setter][#driverCount(int)]
/// ### pDrivers
/// [VarHandle][#VH_pDrivers] - [Getter][#pDrivers()] - [Setter][#pDrivers(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDirectDriverLoadingListLUNARG {
///     VkStructureType sType;
///     const void * pNext;
///     VkDirectDriverLoadingModeLUNARG mode;
///     uint32_t driverCount;
///     const VkDirectDriverLoadingInfoLUNARG * pDrivers;
/// } VkDirectDriverLoadingListLUNARG;
/// ```
public final class VkDirectDriverLoadingListLUNARG extends Struct {
    /// The struct layout of `VkDirectDriverLoadingListLUNARG`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("mode"),
        ValueLayout.JAVA_INT.withName("driverCount"),
        ValueLayout.ADDRESS.withName("pDrivers")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `mode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));
    /// The [VarHandle] of `driverCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_driverCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverCount"));
    /// The [VarHandle] of `pDrivers` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pDrivers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDrivers"));

    /// Creates `VkDirectDriverLoadingListLUNARG` with the given segment.
    /// @param segment the memory segment
    public VkDirectDriverLoadingListLUNARG(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDirectDriverLoadingListLUNARG` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDirectDriverLoadingListLUNARG of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDirectDriverLoadingListLUNARG(segment); }

    /// Creates `VkDirectDriverLoadingListLUNARG` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDirectDriverLoadingListLUNARG ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDirectDriverLoadingListLUNARG(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDirectDriverLoadingListLUNARG` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDirectDriverLoadingListLUNARG ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDirectDriverLoadingListLUNARG(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDirectDriverLoadingListLUNARG` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDirectDriverLoadingListLUNARG`
    public static VkDirectDriverLoadingListLUNARG alloc(SegmentAllocator allocator) { return new VkDirectDriverLoadingListLUNARG(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDirectDriverLoadingListLUNARG` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDirectDriverLoadingListLUNARG`
    public static VkDirectDriverLoadingListLUNARG alloc(SegmentAllocator allocator, long count) { return new VkDirectDriverLoadingListLUNARG(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkDirectDriverLoadingListLUNARG`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDirectDriverLoadingListLUNARG`
    public VkDirectDriverLoadingListLUNARG asSlice(long index) { return new VkDirectDriverLoadingListLUNARG(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkDirectDriverLoadingListLUNARG`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDirectDriverLoadingListLUNARG`
    public VkDirectDriverLoadingListLUNARG asSlice(long index, long count) { return new VkDirectDriverLoadingListLUNARG(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkDirectDriverLoadingListLUNARG.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkDirectDriverLoadingListLUNARG.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkDirectDriverLoadingListLUNARG.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkDirectDriverLoadingListLUNARG.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingListLUNARG sTypeAt(long index, @CType("VkStructureType") int value) { VkDirectDriverLoadingListLUNARG.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingListLUNARG sType(@CType("VkStructureType") int value) { VkDirectDriverLoadingListLUNARG.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkDirectDriverLoadingListLUNARG.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkDirectDriverLoadingListLUNARG.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkDirectDriverLoadingListLUNARG.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDirectDriverLoadingListLUNARG.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingListLUNARG pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkDirectDriverLoadingListLUNARG.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingListLUNARG pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkDirectDriverLoadingListLUNARG.set_pNext(this.segment(), value); return this; }

    /// {@return `mode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDirectDriverLoadingModeLUNARG") int get_mode(MemorySegment segment, long index) { return (int) VH_mode.get(segment, 0L, index); }
    /// {@return `mode`}
    /// @param segment the segment of the struct
    public static @CType("VkDirectDriverLoadingModeLUNARG") int get_mode(MemorySegment segment) { return VkDirectDriverLoadingListLUNARG.get_mode(segment, 0L); }
    /// {@return `mode` at the given index}
    /// @param index the index
    public @CType("VkDirectDriverLoadingModeLUNARG") int modeAt(long index) { return VkDirectDriverLoadingListLUNARG.get_mode(this.segment(), index); }
    /// {@return `mode`}
    public @CType("VkDirectDriverLoadingModeLUNARG") int mode() { return VkDirectDriverLoadingListLUNARG.get_mode(this.segment()); }
    /// Sets `mode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mode(MemorySegment segment, long index, @CType("VkDirectDriverLoadingModeLUNARG") int value) { VH_mode.set(segment, 0L, index, value); }
    /// Sets `mode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mode(MemorySegment segment, @CType("VkDirectDriverLoadingModeLUNARG") int value) { VkDirectDriverLoadingListLUNARG.set_mode(segment, 0L, value); }
    /// Sets `mode` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingListLUNARG modeAt(long index, @CType("VkDirectDriverLoadingModeLUNARG") int value) { VkDirectDriverLoadingListLUNARG.set_mode(this.segment(), index, value); return this; }
    /// Sets `mode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingListLUNARG mode(@CType("VkDirectDriverLoadingModeLUNARG") int value) { VkDirectDriverLoadingListLUNARG.set_mode(this.segment(), value); return this; }

    /// {@return `driverCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_driverCount(MemorySegment segment, long index) { return (int) VH_driverCount.get(segment, 0L, index); }
    /// {@return `driverCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_driverCount(MemorySegment segment) { return VkDirectDriverLoadingListLUNARG.get_driverCount(segment, 0L); }
    /// {@return `driverCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int driverCountAt(long index) { return VkDirectDriverLoadingListLUNARG.get_driverCount(this.segment(), index); }
    /// {@return `driverCount`}
    public @CType("uint32_t") int driverCount() { return VkDirectDriverLoadingListLUNARG.get_driverCount(this.segment()); }
    /// Sets `driverCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_driverCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_driverCount.set(segment, 0L, index, value); }
    /// Sets `driverCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_driverCount(MemorySegment segment, @CType("uint32_t") int value) { VkDirectDriverLoadingListLUNARG.set_driverCount(segment, 0L, value); }
    /// Sets `driverCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingListLUNARG driverCountAt(long index, @CType("uint32_t") int value) { VkDirectDriverLoadingListLUNARG.set_driverCount(this.segment(), index, value); return this; }
    /// Sets `driverCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingListLUNARG driverCount(@CType("uint32_t") int value) { VkDirectDriverLoadingListLUNARG.set_driverCount(this.segment(), value); return this; }

    /// {@return `pDrivers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkDirectDriverLoadingInfoLUNARG *") java.lang.foreign.MemorySegment get_pDrivers(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pDrivers.get(segment, 0L, index); }
    /// {@return `pDrivers`}
    /// @param segment the segment of the struct
    public static @CType("const VkDirectDriverLoadingInfoLUNARG *") java.lang.foreign.MemorySegment get_pDrivers(MemorySegment segment) { return VkDirectDriverLoadingListLUNARG.get_pDrivers(segment, 0L); }
    /// {@return `pDrivers` at the given index}
    /// @param index the index
    public @CType("const VkDirectDriverLoadingInfoLUNARG *") java.lang.foreign.MemorySegment pDriversAt(long index) { return VkDirectDriverLoadingListLUNARG.get_pDrivers(this.segment(), index); }
    /// {@return `pDrivers`}
    public @CType("const VkDirectDriverLoadingInfoLUNARG *") java.lang.foreign.MemorySegment pDrivers() { return VkDirectDriverLoadingListLUNARG.get_pDrivers(this.segment()); }
    /// Sets `pDrivers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pDrivers(MemorySegment segment, long index, @CType("const VkDirectDriverLoadingInfoLUNARG *") java.lang.foreign.MemorySegment value) { VH_pDrivers.set(segment, 0L, index, value); }
    /// Sets `pDrivers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pDrivers(MemorySegment segment, @CType("const VkDirectDriverLoadingInfoLUNARG *") java.lang.foreign.MemorySegment value) { VkDirectDriverLoadingListLUNARG.set_pDrivers(segment, 0L, value); }
    /// Sets `pDrivers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingListLUNARG pDriversAt(long index, @CType("const VkDirectDriverLoadingInfoLUNARG *") java.lang.foreign.MemorySegment value) { VkDirectDriverLoadingListLUNARG.set_pDrivers(this.segment(), index, value); return this; }
    /// Sets `pDrivers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingListLUNARG pDrivers(@CType("const VkDirectDriverLoadingInfoLUNARG *") java.lang.foreign.MemorySegment value) { VkDirectDriverLoadingListLUNARG.set_pDrivers(this.segment(), value); return this; }

}

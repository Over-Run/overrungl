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
/// ### geometryType
/// [VarHandle][#VH_geometryType] - [Getter][#geometryType()] - [Setter][#geometryType(int)]
/// ### geometry
/// [Byte offset][#OFFSET_geometry] - [Memory layout][#ML_geometry] - [Getter][#geometry()] - [Setter][#geometry(java.lang.foreign.MemorySegment)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkGeometryNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkGeometryTypeKHR geometryType;
///     VkGeometryDataNV geometry;
///     VkGeometryFlagsKHR flags;
/// } VkGeometryNV;
/// ```
public final class VkGeometryNV extends Struct {
    /// The struct layout of `VkGeometryNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("geometryType"),
        overrungl.vulkan.nv.struct.VkGeometryDataNV.LAYOUT.withName("geometry"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `geometryType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_geometryType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometryType"));
    /// The byte offset of `geometry`.
    public static final long OFFSET_geometry = LAYOUT.byteOffset(PathElement.groupElement("geometry"));
    /// The memory layout of `geometry`.
    public static final MemoryLayout ML_geometry = LAYOUT.select(PathElement.groupElement("geometry"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    /// Creates `VkGeometryNV` with the given segment.
    /// @param segment the memory segment
    public VkGeometryNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkGeometryNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeometryNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkGeometryNV(segment); }

    /// Creates `VkGeometryNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeometryNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkGeometryNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkGeometryNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkGeometryNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkGeometryNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkGeometryNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkGeometryNV`
    public static VkGeometryNV alloc(SegmentAllocator allocator) { return new VkGeometryNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkGeometryNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkGeometryNV`
    public static VkGeometryNV alloc(SegmentAllocator allocator, long count) { return new VkGeometryNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkGeometryNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkGeometryNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkGeometryNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkGeometryNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGeometryNV sTypeAt(long index, @CType("VkStructureType") int value) { VkGeometryNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryNV sType(@CType("VkStructureType") int value) { VkGeometryNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkGeometryNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkGeometryNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkGeometryNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkGeometryNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGeometryNV pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkGeometryNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkGeometryNV.set_pNext(this.segment(), value); return this; }

    /// {@return `geometryType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkGeometryTypeKHR") int get_geometryType(MemorySegment segment, long index) { return (int) VH_geometryType.get(segment, 0L, index); }
    /// {@return `geometryType`}
    /// @param segment the segment of the struct
    public static @CType("VkGeometryTypeKHR") int get_geometryType(MemorySegment segment) { return VkGeometryNV.get_geometryType(segment, 0L); }
    /// {@return `geometryType` at the given index}
    /// @param index the index
    public @CType("VkGeometryTypeKHR") int geometryTypeAt(long index) { return VkGeometryNV.get_geometryType(this.segment(), index); }
    /// {@return `geometryType`}
    public @CType("VkGeometryTypeKHR") int geometryType() { return VkGeometryNV.get_geometryType(this.segment()); }
    /// Sets `geometryType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_geometryType(MemorySegment segment, long index, @CType("VkGeometryTypeKHR") int value) { VH_geometryType.set(segment, 0L, index, value); }
    /// Sets `geometryType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_geometryType(MemorySegment segment, @CType("VkGeometryTypeKHR") int value) { VkGeometryNV.set_geometryType(segment, 0L, value); }
    /// Sets `geometryType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGeometryNV geometryTypeAt(long index, @CType("VkGeometryTypeKHR") int value) { VkGeometryNV.set_geometryType(this.segment(), index, value); return this; }
    /// Sets `geometryType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryNV geometryType(@CType("VkGeometryTypeKHR") int value) { VkGeometryNV.set_geometryType(this.segment(), value); return this; }

    /// {@return `geometry` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkGeometryDataNV") java.lang.foreign.MemorySegment get_geometry(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_geometry, index), ML_geometry); }
    /// {@return `geometry`}
    /// @param segment the segment of the struct
    public static @CType("VkGeometryDataNV") java.lang.foreign.MemorySegment get_geometry(MemorySegment segment) { return VkGeometryNV.get_geometry(segment, 0L); }
    /// {@return `geometry` at the given index}
    /// @param index the index
    public @CType("VkGeometryDataNV") java.lang.foreign.MemorySegment geometryAt(long index) { return VkGeometryNV.get_geometry(this.segment(), index); }
    /// {@return `geometry`}
    public @CType("VkGeometryDataNV") java.lang.foreign.MemorySegment geometry() { return VkGeometryNV.get_geometry(this.segment()); }
    /// Sets `geometry` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_geometry(MemorySegment segment, long index, @CType("VkGeometryDataNV") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_geometry, index), ML_geometry.byteSize()); }
    /// Sets `geometry` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_geometry(MemorySegment segment, @CType("VkGeometryDataNV") java.lang.foreign.MemorySegment value) { VkGeometryNV.set_geometry(segment, 0L, value); }
    /// Sets `geometry` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGeometryNV geometryAt(long index, @CType("VkGeometryDataNV") java.lang.foreign.MemorySegment value) { VkGeometryNV.set_geometry(this.segment(), index, value); return this; }
    /// Sets `geometry` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryNV geometry(@CType("VkGeometryDataNV") java.lang.foreign.MemorySegment value) { VkGeometryNV.set_geometry(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkGeometryFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkGeometryFlagsKHR") int get_flags(MemorySegment segment) { return VkGeometryNV.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkGeometryFlagsKHR") int flagsAt(long index) { return VkGeometryNV.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkGeometryFlagsKHR") int flags() { return VkGeometryNV.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkGeometryFlagsKHR") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkGeometryFlagsKHR") int value) { VkGeometryNV.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkGeometryNV flagsAt(long index, @CType("VkGeometryFlagsKHR") int value) { VkGeometryNV.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkGeometryNV flags(@CType("VkGeometryFlagsKHR") int value) { VkGeometryNV.set_flags(this.segment(), value); return this; }

}

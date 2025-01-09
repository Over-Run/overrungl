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
/// ### type
/// [VarHandle][#VH_type] - [Getter][#type()] - [Setter][#type(int)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### instanceCount
/// [VarHandle][#VH_instanceCount] - [Getter][#instanceCount()] - [Setter][#instanceCount(int)]
/// ### geometryCount
/// [VarHandle][#VH_geometryCount] - [Getter][#geometryCount()] - [Setter][#geometryCount(int)]
/// ### pGeometries
/// [VarHandle][#VH_pGeometries] - [Getter][#pGeometries()] - [Setter][#pGeometries(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAccelerationStructureInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkAccelerationStructureTypeNV type;
///     VkBuildAccelerationStructureFlagsNV flags;
///     uint32_t instanceCount;
///     uint32_t geometryCount;
///     const VkGeometryNV * pGeometries;
/// } VkAccelerationStructureInfoNV;
/// ```
public final class VkAccelerationStructureInfoNV extends Struct {
    /// The struct layout of `VkAccelerationStructureInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("instanceCount"),
        ValueLayout.JAVA_INT.withName("geometryCount"),
        ValueLayout.ADDRESS.withName("pGeometries")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `instanceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_instanceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instanceCount"));
    /// The [VarHandle] of `geometryCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_geometryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometryCount"));
    /// The [VarHandle] of `pGeometries` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pGeometries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pGeometries"));

    /// Creates `VkAccelerationStructureInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkAccelerationStructureInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAccelerationStructureInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureInfoNV(segment); }

    /// Creates `VkAccelerationStructureInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAccelerationStructureInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureInfoNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkAccelerationStructureInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureInfoNV`
    public static VkAccelerationStructureInfoNV alloc(SegmentAllocator allocator) { return new VkAccelerationStructureInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAccelerationStructureInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureInfoNV`
    public static VkAccelerationStructureInfoNV alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureInfoNV(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkAccelerationStructureInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAccelerationStructureInfoNV`
    public VkAccelerationStructureInfoNV asSlice(long index) { return new VkAccelerationStructureInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkAccelerationStructureInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAccelerationStructureInfoNV`
    public VkAccelerationStructureInfoNV asSlice(long index, long count) { return new VkAccelerationStructureInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkAccelerationStructureInfoNV.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkAccelerationStructureInfoNV.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkAccelerationStructureInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkAccelerationStructureInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInfoNV sTypeAt(long index, @CType("VkStructureType") int value) { VkAccelerationStructureInfoNV.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInfoNV sType(@CType("VkStructureType") int value) { VkAccelerationStructureInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkAccelerationStructureInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkAccelerationStructureInfoNV.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkAccelerationStructureInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInfoNV pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureInfoNV.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccelerationStructureTypeNV") int get_type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    /// @param segment the segment of the struct
    public static @CType("VkAccelerationStructureTypeNV") int get_type(MemorySegment segment) { return VkAccelerationStructureInfoNV.get_type(segment, 0L); }
    /// {@return `type` at the given index}
    /// @param index the index
    public @CType("VkAccelerationStructureTypeNV") int typeAt(long index) { return VkAccelerationStructureInfoNV.get_type(this.segment(), index); }
    /// {@return `type`}
    public @CType("VkAccelerationStructureTypeNV") int type() { return VkAccelerationStructureInfoNV.get_type(this.segment()); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_type(MemorySegment segment, long index, @CType("VkAccelerationStructureTypeNV") int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_type(MemorySegment segment, @CType("VkAccelerationStructureTypeNV") int value) { VkAccelerationStructureInfoNV.set_type(segment, 0L, value); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInfoNV typeAt(long index, @CType("VkAccelerationStructureTypeNV") int value) { VkAccelerationStructureInfoNV.set_type(this.segment(), index, value); return this; }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInfoNV type(@CType("VkAccelerationStructureTypeNV") int value) { VkAccelerationStructureInfoNV.set_type(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBuildAccelerationStructureFlagsNV") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkBuildAccelerationStructureFlagsNV") int get_flags(MemorySegment segment) { return VkAccelerationStructureInfoNV.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkBuildAccelerationStructureFlagsNV") int flagsAt(long index) { return VkAccelerationStructureInfoNV.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkBuildAccelerationStructureFlagsNV") int flags() { return VkAccelerationStructureInfoNV.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkBuildAccelerationStructureFlagsNV") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkBuildAccelerationStructureFlagsNV") int value) { VkAccelerationStructureInfoNV.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInfoNV flagsAt(long index, @CType("VkBuildAccelerationStructureFlagsNV") int value) { VkAccelerationStructureInfoNV.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInfoNV flags(@CType("VkBuildAccelerationStructureFlagsNV") int value) { VkAccelerationStructureInfoNV.set_flags(this.segment(), value); return this; }

    /// {@return `instanceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_instanceCount(MemorySegment segment, long index) { return (int) VH_instanceCount.get(segment, 0L, index); }
    /// {@return `instanceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_instanceCount(MemorySegment segment) { return VkAccelerationStructureInfoNV.get_instanceCount(segment, 0L); }
    /// {@return `instanceCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int instanceCountAt(long index) { return VkAccelerationStructureInfoNV.get_instanceCount(this.segment(), index); }
    /// {@return `instanceCount`}
    public @CType("uint32_t") int instanceCount() { return VkAccelerationStructureInfoNV.get_instanceCount(this.segment()); }
    /// Sets `instanceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_instanceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_instanceCount.set(segment, 0L, index, value); }
    /// Sets `instanceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_instanceCount(MemorySegment segment, @CType("uint32_t") int value) { VkAccelerationStructureInfoNV.set_instanceCount(segment, 0L, value); }
    /// Sets `instanceCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInfoNV instanceCountAt(long index, @CType("uint32_t") int value) { VkAccelerationStructureInfoNV.set_instanceCount(this.segment(), index, value); return this; }
    /// Sets `instanceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInfoNV instanceCount(@CType("uint32_t") int value) { VkAccelerationStructureInfoNV.set_instanceCount(this.segment(), value); return this; }

    /// {@return `geometryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_geometryCount(MemorySegment segment, long index) { return (int) VH_geometryCount.get(segment, 0L, index); }
    /// {@return `geometryCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_geometryCount(MemorySegment segment) { return VkAccelerationStructureInfoNV.get_geometryCount(segment, 0L); }
    /// {@return `geometryCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int geometryCountAt(long index) { return VkAccelerationStructureInfoNV.get_geometryCount(this.segment(), index); }
    /// {@return `geometryCount`}
    public @CType("uint32_t") int geometryCount() { return VkAccelerationStructureInfoNV.get_geometryCount(this.segment()); }
    /// Sets `geometryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_geometryCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_geometryCount.set(segment, 0L, index, value); }
    /// Sets `geometryCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_geometryCount(MemorySegment segment, @CType("uint32_t") int value) { VkAccelerationStructureInfoNV.set_geometryCount(segment, 0L, value); }
    /// Sets `geometryCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInfoNV geometryCountAt(long index, @CType("uint32_t") int value) { VkAccelerationStructureInfoNV.set_geometryCount(this.segment(), index, value); return this; }
    /// Sets `geometryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInfoNV geometryCount(@CType("uint32_t") int value) { VkAccelerationStructureInfoNV.set_geometryCount(this.segment(), value); return this; }

    /// {@return `pGeometries` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkGeometryNV *") java.lang.foreign.MemorySegment get_pGeometries(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pGeometries.get(segment, 0L, index); }
    /// {@return `pGeometries`}
    /// @param segment the segment of the struct
    public static @CType("const VkGeometryNV *") java.lang.foreign.MemorySegment get_pGeometries(MemorySegment segment) { return VkAccelerationStructureInfoNV.get_pGeometries(segment, 0L); }
    /// {@return `pGeometries` at the given index}
    /// @param index the index
    public @CType("const VkGeometryNV *") java.lang.foreign.MemorySegment pGeometriesAt(long index) { return VkAccelerationStructureInfoNV.get_pGeometries(this.segment(), index); }
    /// {@return `pGeometries`}
    public @CType("const VkGeometryNV *") java.lang.foreign.MemorySegment pGeometries() { return VkAccelerationStructureInfoNV.get_pGeometries(this.segment()); }
    /// Sets `pGeometries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pGeometries(MemorySegment segment, long index, @CType("const VkGeometryNV *") java.lang.foreign.MemorySegment value) { VH_pGeometries.set(segment, 0L, index, value); }
    /// Sets `pGeometries` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pGeometries(MemorySegment segment, @CType("const VkGeometryNV *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureInfoNV.set_pGeometries(segment, 0L, value); }
    /// Sets `pGeometries` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInfoNV pGeometriesAt(long index, @CType("const VkGeometryNV *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureInfoNV.set_pGeometries(this.segment(), index, value); return this; }
    /// Sets `pGeometries` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInfoNV pGeometries(@CType("const VkGeometryNV *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureInfoNV.set_pGeometries(this.segment(), value); return this; }

}

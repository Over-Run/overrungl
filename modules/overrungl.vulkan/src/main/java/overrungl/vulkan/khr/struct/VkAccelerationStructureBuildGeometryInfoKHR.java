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
/// ### type
/// [VarHandle][#VH_type] - [Getter][#type()] - [Setter][#type(int)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### mode
/// [VarHandle][#VH_mode] - [Getter][#mode()] - [Setter][#mode(int)]
/// ### srcAccelerationStructure
/// [VarHandle][#VH_srcAccelerationStructure] - [Getter][#srcAccelerationStructure()] - [Setter][#srcAccelerationStructure(java.lang.foreign.MemorySegment)]
/// ### dstAccelerationStructure
/// [VarHandle][#VH_dstAccelerationStructure] - [Getter][#dstAccelerationStructure()] - [Setter][#dstAccelerationStructure(java.lang.foreign.MemorySegment)]
/// ### geometryCount
/// [VarHandle][#VH_geometryCount] - [Getter][#geometryCount()] - [Setter][#geometryCount(int)]
/// ### pGeometries
/// [VarHandle][#VH_pGeometries] - [Getter][#pGeometries()] - [Setter][#pGeometries(java.lang.foreign.MemorySegment)]
/// ### ppGeometries
/// [VarHandle][#VH_ppGeometries] - [Getter][#ppGeometries()] - [Setter][#ppGeometries(java.lang.foreign.MemorySegment)]
/// ### scratchData
/// [Byte offset][#OFFSET_scratchData] - [Memory layout][#ML_scratchData] - [Getter][#scratchData()] - [Setter][#scratchData(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAccelerationStructureBuildGeometryInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkAccelerationStructureTypeKHR type;
///     VkBuildAccelerationStructureFlagsKHR flags;
///     VkBuildAccelerationStructureModeKHR mode;
///     VkAccelerationStructureKHR srcAccelerationStructure;
///     VkAccelerationStructureKHR dstAccelerationStructure;
///     uint32_t geometryCount;
///     const VkAccelerationStructureGeometryKHR * pGeometries;
///     const VkAccelerationStructureGeometryKHR * const* ppGeometries;
///     VkDeviceOrHostAddressKHR scratchData;
/// } VkAccelerationStructureBuildGeometryInfoKHR;
/// ```
public final class VkAccelerationStructureBuildGeometryInfoKHR extends Struct {
    /// The struct layout of `VkAccelerationStructureBuildGeometryInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("mode"),
        ValueLayout.ADDRESS.withName("srcAccelerationStructure"),
        ValueLayout.ADDRESS.withName("dstAccelerationStructure"),
        ValueLayout.JAVA_INT.withName("geometryCount"),
        ValueLayout.ADDRESS.withName("pGeometries"),
        ValueLayout.ADDRESS.withName("ppGeometries"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressKHR.LAYOUT.withName("scratchData")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `mode` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));
    /// The [VarHandle] of `srcAccelerationStructure` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_srcAccelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAccelerationStructure"));
    /// The [VarHandle] of `dstAccelerationStructure` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_dstAccelerationStructure = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAccelerationStructure"));
    /// The [VarHandle] of `geometryCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_geometryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("geometryCount"));
    /// The [VarHandle] of `pGeometries` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pGeometries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pGeometries"));
    /// The [VarHandle] of `ppGeometries` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_ppGeometries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ppGeometries"));
    /// The byte offset of `scratchData`.
    public static final long OFFSET_scratchData = LAYOUT.byteOffset(PathElement.groupElement("scratchData"));
    /// The memory layout of `scratchData`.
    public static final MemoryLayout ML_scratchData = LAYOUT.select(PathElement.groupElement("scratchData"));

    /// Creates `VkAccelerationStructureBuildGeometryInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkAccelerationStructureBuildGeometryInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAccelerationStructureBuildGeometryInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureBuildGeometryInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureBuildGeometryInfoKHR(segment); }

    /// Creates `VkAccelerationStructureBuildGeometryInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureBuildGeometryInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureBuildGeometryInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAccelerationStructureBuildGeometryInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureBuildGeometryInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureBuildGeometryInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkAccelerationStructureBuildGeometryInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureBuildGeometryInfoKHR`
    public static VkAccelerationStructureBuildGeometryInfoKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureBuildGeometryInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAccelerationStructureBuildGeometryInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureBuildGeometryInfoKHR`
    public static VkAccelerationStructureBuildGeometryInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureBuildGeometryInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkAccelerationStructureBuildGeometryInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAccelerationStructureBuildGeometryInfoKHR`
    public VkAccelerationStructureBuildGeometryInfoKHR asSlice(long index) { return new VkAccelerationStructureBuildGeometryInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkAccelerationStructureBuildGeometryInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAccelerationStructureBuildGeometryInfoKHR`
    public VkAccelerationStructureBuildGeometryInfoKHR asSlice(long index, long count) { return new VkAccelerationStructureBuildGeometryInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkAccelerationStructureBuildGeometryInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkAccelerationStructureBuildGeometryInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkAccelerationStructureBuildGeometryInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkAccelerationStructureBuildGeometryInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkAccelerationStructureBuildGeometryInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR sType(@CType("VkStructureType") int value) { VkAccelerationStructureBuildGeometryInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkAccelerationStructureBuildGeometryInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkAccelerationStructureBuildGeometryInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkAccelerationStructureBuildGeometryInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureBuildGeometryInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureBuildGeometryInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureBuildGeometryInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccelerationStructureTypeKHR") int get_type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    /// @param segment the segment of the struct
    public static @CType("VkAccelerationStructureTypeKHR") int get_type(MemorySegment segment) { return VkAccelerationStructureBuildGeometryInfoKHR.get_type(segment, 0L); }
    /// {@return `type` at the given index}
    /// @param index the index
    public @CType("VkAccelerationStructureTypeKHR") int typeAt(long index) { return VkAccelerationStructureBuildGeometryInfoKHR.get_type(this.segment(), index); }
    /// {@return `type`}
    public @CType("VkAccelerationStructureTypeKHR") int type() { return VkAccelerationStructureBuildGeometryInfoKHR.get_type(this.segment()); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_type(MemorySegment segment, long index, @CType("VkAccelerationStructureTypeKHR") int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_type(MemorySegment segment, @CType("VkAccelerationStructureTypeKHR") int value) { VkAccelerationStructureBuildGeometryInfoKHR.set_type(segment, 0L, value); }
    /// Sets `type` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR typeAt(long index, @CType("VkAccelerationStructureTypeKHR") int value) { VkAccelerationStructureBuildGeometryInfoKHR.set_type(this.segment(), index, value); return this; }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR type(@CType("VkAccelerationStructureTypeKHR") int value) { VkAccelerationStructureBuildGeometryInfoKHR.set_type(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBuildAccelerationStructureFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkBuildAccelerationStructureFlagsKHR") int get_flags(MemorySegment segment) { return VkAccelerationStructureBuildGeometryInfoKHR.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkBuildAccelerationStructureFlagsKHR") int flagsAt(long index) { return VkAccelerationStructureBuildGeometryInfoKHR.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkBuildAccelerationStructureFlagsKHR") int flags() { return VkAccelerationStructureBuildGeometryInfoKHR.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkBuildAccelerationStructureFlagsKHR") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkBuildAccelerationStructureFlagsKHR") int value) { VkAccelerationStructureBuildGeometryInfoKHR.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR flagsAt(long index, @CType("VkBuildAccelerationStructureFlagsKHR") int value) { VkAccelerationStructureBuildGeometryInfoKHR.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR flags(@CType("VkBuildAccelerationStructureFlagsKHR") int value) { VkAccelerationStructureBuildGeometryInfoKHR.set_flags(this.segment(), value); return this; }

    /// {@return `mode` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBuildAccelerationStructureModeKHR") int get_mode(MemorySegment segment, long index) { return (int) VH_mode.get(segment, 0L, index); }
    /// {@return `mode`}
    /// @param segment the segment of the struct
    public static @CType("VkBuildAccelerationStructureModeKHR") int get_mode(MemorySegment segment) { return VkAccelerationStructureBuildGeometryInfoKHR.get_mode(segment, 0L); }
    /// {@return `mode` at the given index}
    /// @param index the index
    public @CType("VkBuildAccelerationStructureModeKHR") int modeAt(long index) { return VkAccelerationStructureBuildGeometryInfoKHR.get_mode(this.segment(), index); }
    /// {@return `mode`}
    public @CType("VkBuildAccelerationStructureModeKHR") int mode() { return VkAccelerationStructureBuildGeometryInfoKHR.get_mode(this.segment()); }
    /// Sets `mode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mode(MemorySegment segment, long index, @CType("VkBuildAccelerationStructureModeKHR") int value) { VH_mode.set(segment, 0L, index, value); }
    /// Sets `mode` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mode(MemorySegment segment, @CType("VkBuildAccelerationStructureModeKHR") int value) { VkAccelerationStructureBuildGeometryInfoKHR.set_mode(segment, 0L, value); }
    /// Sets `mode` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR modeAt(long index, @CType("VkBuildAccelerationStructureModeKHR") int value) { VkAccelerationStructureBuildGeometryInfoKHR.set_mode(this.segment(), index, value); return this; }
    /// Sets `mode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR mode(@CType("VkBuildAccelerationStructureModeKHR") int value) { VkAccelerationStructureBuildGeometryInfoKHR.set_mode(this.segment(), value); return this; }

    /// {@return `srcAccelerationStructure` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment get_srcAccelerationStructure(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_srcAccelerationStructure.get(segment, 0L, index); }
    /// {@return `srcAccelerationStructure`}
    /// @param segment the segment of the struct
    public static @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment get_srcAccelerationStructure(MemorySegment segment) { return VkAccelerationStructureBuildGeometryInfoKHR.get_srcAccelerationStructure(segment, 0L); }
    /// {@return `srcAccelerationStructure` at the given index}
    /// @param index the index
    public @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment srcAccelerationStructureAt(long index) { return VkAccelerationStructureBuildGeometryInfoKHR.get_srcAccelerationStructure(this.segment(), index); }
    /// {@return `srcAccelerationStructure`}
    public @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment srcAccelerationStructure() { return VkAccelerationStructureBuildGeometryInfoKHR.get_srcAccelerationStructure(this.segment()); }
    /// Sets `srcAccelerationStructure` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcAccelerationStructure(MemorySegment segment, long index, @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment value) { VH_srcAccelerationStructure.set(segment, 0L, index, value); }
    /// Sets `srcAccelerationStructure` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcAccelerationStructure(MemorySegment segment, @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureBuildGeometryInfoKHR.set_srcAccelerationStructure(segment, 0L, value); }
    /// Sets `srcAccelerationStructure` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR srcAccelerationStructureAt(long index, @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureBuildGeometryInfoKHR.set_srcAccelerationStructure(this.segment(), index, value); return this; }
    /// Sets `srcAccelerationStructure` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR srcAccelerationStructure(@CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureBuildGeometryInfoKHR.set_srcAccelerationStructure(this.segment(), value); return this; }

    /// {@return `dstAccelerationStructure` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment get_dstAccelerationStructure(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_dstAccelerationStructure.get(segment, 0L, index); }
    /// {@return `dstAccelerationStructure`}
    /// @param segment the segment of the struct
    public static @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment get_dstAccelerationStructure(MemorySegment segment) { return VkAccelerationStructureBuildGeometryInfoKHR.get_dstAccelerationStructure(segment, 0L); }
    /// {@return `dstAccelerationStructure` at the given index}
    /// @param index the index
    public @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment dstAccelerationStructureAt(long index) { return VkAccelerationStructureBuildGeometryInfoKHR.get_dstAccelerationStructure(this.segment(), index); }
    /// {@return `dstAccelerationStructure`}
    public @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment dstAccelerationStructure() { return VkAccelerationStructureBuildGeometryInfoKHR.get_dstAccelerationStructure(this.segment()); }
    /// Sets `dstAccelerationStructure` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstAccelerationStructure(MemorySegment segment, long index, @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment value) { VH_dstAccelerationStructure.set(segment, 0L, index, value); }
    /// Sets `dstAccelerationStructure` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstAccelerationStructure(MemorySegment segment, @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureBuildGeometryInfoKHR.set_dstAccelerationStructure(segment, 0L, value); }
    /// Sets `dstAccelerationStructure` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR dstAccelerationStructureAt(long index, @CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureBuildGeometryInfoKHR.set_dstAccelerationStructure(this.segment(), index, value); return this; }
    /// Sets `dstAccelerationStructure` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR dstAccelerationStructure(@CType("VkAccelerationStructureKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureBuildGeometryInfoKHR.set_dstAccelerationStructure(this.segment(), value); return this; }

    /// {@return `geometryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_geometryCount(MemorySegment segment, long index) { return (int) VH_geometryCount.get(segment, 0L, index); }
    /// {@return `geometryCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_geometryCount(MemorySegment segment) { return VkAccelerationStructureBuildGeometryInfoKHR.get_geometryCount(segment, 0L); }
    /// {@return `geometryCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int geometryCountAt(long index) { return VkAccelerationStructureBuildGeometryInfoKHR.get_geometryCount(this.segment(), index); }
    /// {@return `geometryCount`}
    public @CType("uint32_t") int geometryCount() { return VkAccelerationStructureBuildGeometryInfoKHR.get_geometryCount(this.segment()); }
    /// Sets `geometryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_geometryCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_geometryCount.set(segment, 0L, index, value); }
    /// Sets `geometryCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_geometryCount(MemorySegment segment, @CType("uint32_t") int value) { VkAccelerationStructureBuildGeometryInfoKHR.set_geometryCount(segment, 0L, value); }
    /// Sets `geometryCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR geometryCountAt(long index, @CType("uint32_t") int value) { VkAccelerationStructureBuildGeometryInfoKHR.set_geometryCount(this.segment(), index, value); return this; }
    /// Sets `geometryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR geometryCount(@CType("uint32_t") int value) { VkAccelerationStructureBuildGeometryInfoKHR.set_geometryCount(this.segment(), value); return this; }

    /// {@return `pGeometries` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkAccelerationStructureGeometryKHR *") java.lang.foreign.MemorySegment get_pGeometries(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pGeometries.get(segment, 0L, index); }
    /// {@return `pGeometries`}
    /// @param segment the segment of the struct
    public static @CType("const VkAccelerationStructureGeometryKHR *") java.lang.foreign.MemorySegment get_pGeometries(MemorySegment segment) { return VkAccelerationStructureBuildGeometryInfoKHR.get_pGeometries(segment, 0L); }
    /// {@return `pGeometries` at the given index}
    /// @param index the index
    public @CType("const VkAccelerationStructureGeometryKHR *") java.lang.foreign.MemorySegment pGeometriesAt(long index) { return VkAccelerationStructureBuildGeometryInfoKHR.get_pGeometries(this.segment(), index); }
    /// {@return `pGeometries`}
    public @CType("const VkAccelerationStructureGeometryKHR *") java.lang.foreign.MemorySegment pGeometries() { return VkAccelerationStructureBuildGeometryInfoKHR.get_pGeometries(this.segment()); }
    /// Sets `pGeometries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pGeometries(MemorySegment segment, long index, @CType("const VkAccelerationStructureGeometryKHR *") java.lang.foreign.MemorySegment value) { VH_pGeometries.set(segment, 0L, index, value); }
    /// Sets `pGeometries` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pGeometries(MemorySegment segment, @CType("const VkAccelerationStructureGeometryKHR *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureBuildGeometryInfoKHR.set_pGeometries(segment, 0L, value); }
    /// Sets `pGeometries` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR pGeometriesAt(long index, @CType("const VkAccelerationStructureGeometryKHR *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureBuildGeometryInfoKHR.set_pGeometries(this.segment(), index, value); return this; }
    /// Sets `pGeometries` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR pGeometries(@CType("const VkAccelerationStructureGeometryKHR *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureBuildGeometryInfoKHR.set_pGeometries(this.segment(), value); return this; }

    /// {@return `ppGeometries` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkAccelerationStructureGeometryKHR * const*") java.lang.foreign.MemorySegment get_ppGeometries(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_ppGeometries.get(segment, 0L, index); }
    /// {@return `ppGeometries`}
    /// @param segment the segment of the struct
    public static @CType("const VkAccelerationStructureGeometryKHR * const*") java.lang.foreign.MemorySegment get_ppGeometries(MemorySegment segment) { return VkAccelerationStructureBuildGeometryInfoKHR.get_ppGeometries(segment, 0L); }
    /// {@return `ppGeometries` at the given index}
    /// @param index the index
    public @CType("const VkAccelerationStructureGeometryKHR * const*") java.lang.foreign.MemorySegment ppGeometriesAt(long index) { return VkAccelerationStructureBuildGeometryInfoKHR.get_ppGeometries(this.segment(), index); }
    /// {@return `ppGeometries`}
    public @CType("const VkAccelerationStructureGeometryKHR * const*") java.lang.foreign.MemorySegment ppGeometries() { return VkAccelerationStructureBuildGeometryInfoKHR.get_ppGeometries(this.segment()); }
    /// Sets `ppGeometries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ppGeometries(MemorySegment segment, long index, @CType("const VkAccelerationStructureGeometryKHR * const*") java.lang.foreign.MemorySegment value) { VH_ppGeometries.set(segment, 0L, index, value); }
    /// Sets `ppGeometries` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ppGeometries(MemorySegment segment, @CType("const VkAccelerationStructureGeometryKHR * const*") java.lang.foreign.MemorySegment value) { VkAccelerationStructureBuildGeometryInfoKHR.set_ppGeometries(segment, 0L, value); }
    /// Sets `ppGeometries` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR ppGeometriesAt(long index, @CType("const VkAccelerationStructureGeometryKHR * const*") java.lang.foreign.MemorySegment value) { VkAccelerationStructureBuildGeometryInfoKHR.set_ppGeometries(this.segment(), index, value); return this; }
    /// Sets `ppGeometries` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR ppGeometries(@CType("const VkAccelerationStructureGeometryKHR * const*") java.lang.foreign.MemorySegment value) { VkAccelerationStructureBuildGeometryInfoKHR.set_ppGeometries(this.segment(), value); return this; }

    /// {@return `scratchData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceOrHostAddressKHR") java.lang.foreign.MemorySegment get_scratchData(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_scratchData, index), ML_scratchData); }
    /// {@return `scratchData`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceOrHostAddressKHR") java.lang.foreign.MemorySegment get_scratchData(MemorySegment segment) { return VkAccelerationStructureBuildGeometryInfoKHR.get_scratchData(segment, 0L); }
    /// {@return `scratchData` at the given index}
    /// @param index the index
    public @CType("VkDeviceOrHostAddressKHR") java.lang.foreign.MemorySegment scratchDataAt(long index) { return VkAccelerationStructureBuildGeometryInfoKHR.get_scratchData(this.segment(), index); }
    /// {@return `scratchData`}
    public @CType("VkDeviceOrHostAddressKHR") java.lang.foreign.MemorySegment scratchData() { return VkAccelerationStructureBuildGeometryInfoKHR.get_scratchData(this.segment()); }
    /// Sets `scratchData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_scratchData(MemorySegment segment, long index, @CType("VkDeviceOrHostAddressKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_scratchData, index), ML_scratchData.byteSize()); }
    /// Sets `scratchData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_scratchData(MemorySegment segment, @CType("VkDeviceOrHostAddressKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureBuildGeometryInfoKHR.set_scratchData(segment, 0L, value); }
    /// Sets `scratchData` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR scratchDataAt(long index, @CType("VkDeviceOrHostAddressKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureBuildGeometryInfoKHR.set_scratchData(this.segment(), index, value); return this; }
    /// Sets `scratchData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildGeometryInfoKHR scratchData(@CType("VkDeviceOrHostAddressKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureBuildGeometryInfoKHR.set_scratchData(this.segment(), value); return this; }

}

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
/// ### function
/// [VarHandle][#VH_function] - [Getter][#function()] - [Setter][#function(java.lang.foreign.MemorySegment)]
/// ### gridDimX
/// [VarHandle][#VH_gridDimX] - [Getter][#gridDimX()] - [Setter][#gridDimX(int)]
/// ### gridDimY
/// [VarHandle][#VH_gridDimY] - [Getter][#gridDimY()] - [Setter][#gridDimY(int)]
/// ### gridDimZ
/// [VarHandle][#VH_gridDimZ] - [Getter][#gridDimZ()] - [Setter][#gridDimZ(int)]
/// ### blockDimX
/// [VarHandle][#VH_blockDimX] - [Getter][#blockDimX()] - [Setter][#blockDimX(int)]
/// ### blockDimY
/// [VarHandle][#VH_blockDimY] - [Getter][#blockDimY()] - [Setter][#blockDimY(int)]
/// ### blockDimZ
/// [VarHandle][#VH_blockDimZ] - [Getter][#blockDimZ()] - [Setter][#blockDimZ(int)]
/// ### sharedMemBytes
/// [VarHandle][#VH_sharedMemBytes] - [Getter][#sharedMemBytes()] - [Setter][#sharedMemBytes(int)]
/// ### paramCount
/// [VarHandle][#VH_paramCount] - [Getter][#paramCount()] - [Setter][#paramCount(long)]
/// ### pParams
/// [VarHandle][#VH_pParams] - [Getter][#pParams()] - [Setter][#pParams(java.lang.foreign.MemorySegment)]
/// ### extraCount
/// [VarHandle][#VH_extraCount] - [Getter][#extraCount()] - [Setter][#extraCount(long)]
/// ### pExtras
/// [VarHandle][#VH_pExtras] - [Getter][#pExtras()] - [Setter][#pExtras(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkCudaLaunchInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkCudaFunctionNV function;
///     uint32_t gridDimX;
///     uint32_t gridDimY;
///     uint32_t gridDimZ;
///     uint32_t blockDimX;
///     uint32_t blockDimY;
///     uint32_t blockDimZ;
///     uint32_t sharedMemBytes;
///     size_t paramCount;
///     const void * const * pParams;
///     size_t extraCount;
///     const void * const * pExtras;
/// } VkCudaLaunchInfoNV;
/// ```
public sealed class VkCudaLaunchInfoNV extends Struct {
    /// The struct layout of `VkCudaLaunchInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("function"),
        ValueLayout.JAVA_INT.withName("gridDimX"),
        ValueLayout.JAVA_INT.withName("gridDimY"),
        ValueLayout.JAVA_INT.withName("gridDimZ"),
        ValueLayout.JAVA_INT.withName("blockDimX"),
        ValueLayout.JAVA_INT.withName("blockDimY"),
        ValueLayout.JAVA_INT.withName("blockDimZ"),
        ValueLayout.JAVA_INT.withName("sharedMemBytes"),
        ValueLayout.JAVA_LONG.withName("paramCount"),
        ValueLayout.ADDRESS.withName("pParams"),
        ValueLayout.JAVA_LONG.withName("extraCount"),
        ValueLayout.ADDRESS.withName("pExtras")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `function` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_function = LAYOUT.arrayElementVarHandle(PathElement.groupElement("function"));
    /// The [VarHandle] of `gridDimX` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_gridDimX = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gridDimX"));
    /// The [VarHandle] of `gridDimY` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_gridDimY = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gridDimY"));
    /// The [VarHandle] of `gridDimZ` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_gridDimZ = LAYOUT.arrayElementVarHandle(PathElement.groupElement("gridDimZ"));
    /// The [VarHandle] of `blockDimX` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_blockDimX = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blockDimX"));
    /// The [VarHandle] of `blockDimY` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_blockDimY = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blockDimY"));
    /// The [VarHandle] of `blockDimZ` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_blockDimZ = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blockDimZ"));
    /// The [VarHandle] of `sharedMemBytes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sharedMemBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sharedMemBytes"));
    /// The [VarHandle] of `paramCount` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_paramCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("paramCount"));
    /// The [VarHandle] of `pParams` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pParams = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pParams"));
    /// The [VarHandle] of `extraCount` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_extraCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("extraCount"));
    /// The [VarHandle] of `pExtras` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pExtras = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pExtras"));

    /// Creates `VkCudaLaunchInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkCudaLaunchInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkCudaLaunchInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCudaLaunchInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCudaLaunchInfoNV(segment); }

    /// Creates `VkCudaLaunchInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkCudaLaunchInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkCudaLaunchInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkCudaLaunchInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkCudaLaunchInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkCudaLaunchInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCudaLaunchInfoNV`
    public static VkCudaLaunchInfoNV alloc(SegmentAllocator allocator) { return new VkCudaLaunchInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkCudaLaunchInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkCudaLaunchInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkCudaLaunchInfoNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkCudaLaunchInfoNV`
    public static VkCudaLaunchInfoNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkCudaFunctionNV") java.lang.foreign.MemorySegment function, @CType("uint32_t") int gridDimX, @CType("uint32_t") int gridDimY, @CType("uint32_t") int gridDimZ, @CType("uint32_t") int blockDimX, @CType("uint32_t") int blockDimY, @CType("uint32_t") int blockDimZ, @CType("uint32_t") int sharedMemBytes, @CType("size_t") long paramCount, @CType("const void * const *") java.lang.foreign.MemorySegment pParams, @CType("size_t") long extraCount, @CType("const void * const *") java.lang.foreign.MemorySegment pExtras) { return alloc(allocator).sType(sType).pNext(pNext).function(function).gridDimX(gridDimX).gridDimY(gridDimY).gridDimZ(gridDimZ).blockDimX(blockDimX).blockDimY(blockDimY).blockDimZ(blockDimZ).sharedMemBytes(sharedMemBytes).paramCount(paramCount).pParams(pParams).extraCount(extraCount).pExtras(pExtras); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkCudaLaunchInfoNV copyFrom(VkCudaLaunchInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkCudaLaunchInfoNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkCudaLaunchInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkCudaLaunchInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaLaunchInfoNV sType(@CType("VkStructureType") int value) { VkCudaLaunchInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkCudaLaunchInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkCudaLaunchInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkCudaLaunchInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaLaunchInfoNV pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkCudaLaunchInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `function` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkCudaFunctionNV") java.lang.foreign.MemorySegment get_function(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_function.get(segment, 0L, index); }
    /// {@return `function`}
    /// @param segment the segment of the struct
    public static @CType("VkCudaFunctionNV") java.lang.foreign.MemorySegment get_function(MemorySegment segment) { return VkCudaLaunchInfoNV.get_function(segment, 0L); }
    /// {@return `function`}
    public @CType("VkCudaFunctionNV") java.lang.foreign.MemorySegment function() { return VkCudaLaunchInfoNV.get_function(this.segment()); }
    /// Sets `function` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_function(MemorySegment segment, long index, @CType("VkCudaFunctionNV") java.lang.foreign.MemorySegment value) { VH_function.set(segment, 0L, index, value); }
    /// Sets `function` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_function(MemorySegment segment, @CType("VkCudaFunctionNV") java.lang.foreign.MemorySegment value) { VkCudaLaunchInfoNV.set_function(segment, 0L, value); }
    /// Sets `function` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaLaunchInfoNV function(@CType("VkCudaFunctionNV") java.lang.foreign.MemorySegment value) { VkCudaLaunchInfoNV.set_function(this.segment(), value); return this; }

    /// {@return `gridDimX` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_gridDimX(MemorySegment segment, long index) { return (int) VH_gridDimX.get(segment, 0L, index); }
    /// {@return `gridDimX`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_gridDimX(MemorySegment segment) { return VkCudaLaunchInfoNV.get_gridDimX(segment, 0L); }
    /// {@return `gridDimX`}
    public @CType("uint32_t") int gridDimX() { return VkCudaLaunchInfoNV.get_gridDimX(this.segment()); }
    /// Sets `gridDimX` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_gridDimX(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_gridDimX.set(segment, 0L, index, value); }
    /// Sets `gridDimX` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_gridDimX(MemorySegment segment, @CType("uint32_t") int value) { VkCudaLaunchInfoNV.set_gridDimX(segment, 0L, value); }
    /// Sets `gridDimX` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaLaunchInfoNV gridDimX(@CType("uint32_t") int value) { VkCudaLaunchInfoNV.set_gridDimX(this.segment(), value); return this; }

    /// {@return `gridDimY` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_gridDimY(MemorySegment segment, long index) { return (int) VH_gridDimY.get(segment, 0L, index); }
    /// {@return `gridDimY`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_gridDimY(MemorySegment segment) { return VkCudaLaunchInfoNV.get_gridDimY(segment, 0L); }
    /// {@return `gridDimY`}
    public @CType("uint32_t") int gridDimY() { return VkCudaLaunchInfoNV.get_gridDimY(this.segment()); }
    /// Sets `gridDimY` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_gridDimY(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_gridDimY.set(segment, 0L, index, value); }
    /// Sets `gridDimY` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_gridDimY(MemorySegment segment, @CType("uint32_t") int value) { VkCudaLaunchInfoNV.set_gridDimY(segment, 0L, value); }
    /// Sets `gridDimY` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaLaunchInfoNV gridDimY(@CType("uint32_t") int value) { VkCudaLaunchInfoNV.set_gridDimY(this.segment(), value); return this; }

    /// {@return `gridDimZ` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_gridDimZ(MemorySegment segment, long index) { return (int) VH_gridDimZ.get(segment, 0L, index); }
    /// {@return `gridDimZ`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_gridDimZ(MemorySegment segment) { return VkCudaLaunchInfoNV.get_gridDimZ(segment, 0L); }
    /// {@return `gridDimZ`}
    public @CType("uint32_t") int gridDimZ() { return VkCudaLaunchInfoNV.get_gridDimZ(this.segment()); }
    /// Sets `gridDimZ` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_gridDimZ(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_gridDimZ.set(segment, 0L, index, value); }
    /// Sets `gridDimZ` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_gridDimZ(MemorySegment segment, @CType("uint32_t") int value) { VkCudaLaunchInfoNV.set_gridDimZ(segment, 0L, value); }
    /// Sets `gridDimZ` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaLaunchInfoNV gridDimZ(@CType("uint32_t") int value) { VkCudaLaunchInfoNV.set_gridDimZ(this.segment(), value); return this; }

    /// {@return `blockDimX` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_blockDimX(MemorySegment segment, long index) { return (int) VH_blockDimX.get(segment, 0L, index); }
    /// {@return `blockDimX`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_blockDimX(MemorySegment segment) { return VkCudaLaunchInfoNV.get_blockDimX(segment, 0L); }
    /// {@return `blockDimX`}
    public @CType("uint32_t") int blockDimX() { return VkCudaLaunchInfoNV.get_blockDimX(this.segment()); }
    /// Sets `blockDimX` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_blockDimX(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_blockDimX.set(segment, 0L, index, value); }
    /// Sets `blockDimX` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_blockDimX(MemorySegment segment, @CType("uint32_t") int value) { VkCudaLaunchInfoNV.set_blockDimX(segment, 0L, value); }
    /// Sets `blockDimX` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaLaunchInfoNV blockDimX(@CType("uint32_t") int value) { VkCudaLaunchInfoNV.set_blockDimX(this.segment(), value); return this; }

    /// {@return `blockDimY` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_blockDimY(MemorySegment segment, long index) { return (int) VH_blockDimY.get(segment, 0L, index); }
    /// {@return `blockDimY`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_blockDimY(MemorySegment segment) { return VkCudaLaunchInfoNV.get_blockDimY(segment, 0L); }
    /// {@return `blockDimY`}
    public @CType("uint32_t") int blockDimY() { return VkCudaLaunchInfoNV.get_blockDimY(this.segment()); }
    /// Sets `blockDimY` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_blockDimY(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_blockDimY.set(segment, 0L, index, value); }
    /// Sets `blockDimY` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_blockDimY(MemorySegment segment, @CType("uint32_t") int value) { VkCudaLaunchInfoNV.set_blockDimY(segment, 0L, value); }
    /// Sets `blockDimY` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaLaunchInfoNV blockDimY(@CType("uint32_t") int value) { VkCudaLaunchInfoNV.set_blockDimY(this.segment(), value); return this; }

    /// {@return `blockDimZ` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_blockDimZ(MemorySegment segment, long index) { return (int) VH_blockDimZ.get(segment, 0L, index); }
    /// {@return `blockDimZ`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_blockDimZ(MemorySegment segment) { return VkCudaLaunchInfoNV.get_blockDimZ(segment, 0L); }
    /// {@return `blockDimZ`}
    public @CType("uint32_t") int blockDimZ() { return VkCudaLaunchInfoNV.get_blockDimZ(this.segment()); }
    /// Sets `blockDimZ` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_blockDimZ(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_blockDimZ.set(segment, 0L, index, value); }
    /// Sets `blockDimZ` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_blockDimZ(MemorySegment segment, @CType("uint32_t") int value) { VkCudaLaunchInfoNV.set_blockDimZ(segment, 0L, value); }
    /// Sets `blockDimZ` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaLaunchInfoNV blockDimZ(@CType("uint32_t") int value) { VkCudaLaunchInfoNV.set_blockDimZ(this.segment(), value); return this; }

    /// {@return `sharedMemBytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_sharedMemBytes(MemorySegment segment, long index) { return (int) VH_sharedMemBytes.get(segment, 0L, index); }
    /// {@return `sharedMemBytes`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_sharedMemBytes(MemorySegment segment) { return VkCudaLaunchInfoNV.get_sharedMemBytes(segment, 0L); }
    /// {@return `sharedMemBytes`}
    public @CType("uint32_t") int sharedMemBytes() { return VkCudaLaunchInfoNV.get_sharedMemBytes(this.segment()); }
    /// Sets `sharedMemBytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sharedMemBytes(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_sharedMemBytes.set(segment, 0L, index, value); }
    /// Sets `sharedMemBytes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sharedMemBytes(MemorySegment segment, @CType("uint32_t") int value) { VkCudaLaunchInfoNV.set_sharedMemBytes(segment, 0L, value); }
    /// Sets `sharedMemBytes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaLaunchInfoNV sharedMemBytes(@CType("uint32_t") int value) { VkCudaLaunchInfoNV.set_sharedMemBytes(this.segment(), value); return this; }

    /// {@return `paramCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_paramCount(MemorySegment segment, long index) { return (long) VH_paramCount.get(segment, 0L, index); }
    /// {@return `paramCount`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_paramCount(MemorySegment segment) { return VkCudaLaunchInfoNV.get_paramCount(segment, 0L); }
    /// {@return `paramCount`}
    public @CType("size_t") long paramCount() { return VkCudaLaunchInfoNV.get_paramCount(this.segment()); }
    /// Sets `paramCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_paramCount(MemorySegment segment, long index, @CType("size_t") long value) { VH_paramCount.set(segment, 0L, index, value); }
    /// Sets `paramCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_paramCount(MemorySegment segment, @CType("size_t") long value) { VkCudaLaunchInfoNV.set_paramCount(segment, 0L, value); }
    /// Sets `paramCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaLaunchInfoNV paramCount(@CType("size_t") long value) { VkCudaLaunchInfoNV.set_paramCount(this.segment(), value); return this; }

    /// {@return `pParams` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void * const *") java.lang.foreign.MemorySegment get_pParams(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pParams.get(segment, 0L, index); }
    /// {@return `pParams`}
    /// @param segment the segment of the struct
    public static @CType("const void * const *") java.lang.foreign.MemorySegment get_pParams(MemorySegment segment) { return VkCudaLaunchInfoNV.get_pParams(segment, 0L); }
    /// {@return `pParams`}
    public @CType("const void * const *") java.lang.foreign.MemorySegment pParams() { return VkCudaLaunchInfoNV.get_pParams(this.segment()); }
    /// Sets `pParams` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pParams(MemorySegment segment, long index, @CType("const void * const *") java.lang.foreign.MemorySegment value) { VH_pParams.set(segment, 0L, index, value); }
    /// Sets `pParams` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pParams(MemorySegment segment, @CType("const void * const *") java.lang.foreign.MemorySegment value) { VkCudaLaunchInfoNV.set_pParams(segment, 0L, value); }
    /// Sets `pParams` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaLaunchInfoNV pParams(@CType("const void * const *") java.lang.foreign.MemorySegment value) { VkCudaLaunchInfoNV.set_pParams(this.segment(), value); return this; }

    /// {@return `extraCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_extraCount(MemorySegment segment, long index) { return (long) VH_extraCount.get(segment, 0L, index); }
    /// {@return `extraCount`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_extraCount(MemorySegment segment) { return VkCudaLaunchInfoNV.get_extraCount(segment, 0L); }
    /// {@return `extraCount`}
    public @CType("size_t") long extraCount() { return VkCudaLaunchInfoNV.get_extraCount(this.segment()); }
    /// Sets `extraCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_extraCount(MemorySegment segment, long index, @CType("size_t") long value) { VH_extraCount.set(segment, 0L, index, value); }
    /// Sets `extraCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_extraCount(MemorySegment segment, @CType("size_t") long value) { VkCudaLaunchInfoNV.set_extraCount(segment, 0L, value); }
    /// Sets `extraCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaLaunchInfoNV extraCount(@CType("size_t") long value) { VkCudaLaunchInfoNV.set_extraCount(this.segment(), value); return this; }

    /// {@return `pExtras` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void * const *") java.lang.foreign.MemorySegment get_pExtras(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pExtras.get(segment, 0L, index); }
    /// {@return `pExtras`}
    /// @param segment the segment of the struct
    public static @CType("const void * const *") java.lang.foreign.MemorySegment get_pExtras(MemorySegment segment) { return VkCudaLaunchInfoNV.get_pExtras(segment, 0L); }
    /// {@return `pExtras`}
    public @CType("const void * const *") java.lang.foreign.MemorySegment pExtras() { return VkCudaLaunchInfoNV.get_pExtras(this.segment()); }
    /// Sets `pExtras` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pExtras(MemorySegment segment, long index, @CType("const void * const *") java.lang.foreign.MemorySegment value) { VH_pExtras.set(segment, 0L, index, value); }
    /// Sets `pExtras` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pExtras(MemorySegment segment, @CType("const void * const *") java.lang.foreign.MemorySegment value) { VkCudaLaunchInfoNV.set_pExtras(segment, 0L, value); }
    /// Sets `pExtras` with the given value.
    /// @param value the value
    /// @return `this`
    public VkCudaLaunchInfoNV pExtras(@CType("const void * const *") java.lang.foreign.MemorySegment value) { VkCudaLaunchInfoNV.set_pExtras(this.segment(), value); return this; }

    /// A buffer of [VkCudaLaunchInfoNV].
    public static final class Buffer extends VkCudaLaunchInfoNV {
        private final long elementCount;

        /// Creates `VkCudaLaunchInfoNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkCudaLaunchInfoNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkCudaLaunchInfoNV`
        public VkCudaLaunchInfoNV asSlice(long index) { return new VkCudaLaunchInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkCudaLaunchInfoNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkCudaLaunchInfoNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkCudaLaunchInfoNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkCudaLaunchInfoNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkCudaLaunchInfoNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkCudaLaunchInfoNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `function` at the given index}
        /// @param index the index
        public @CType("VkCudaFunctionNV") java.lang.foreign.MemorySegment functionAt(long index) { return VkCudaLaunchInfoNV.get_function(this.segment(), index); }
        /// Sets `function` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer functionAt(long index, @CType("VkCudaFunctionNV") java.lang.foreign.MemorySegment value) { VkCudaLaunchInfoNV.set_function(this.segment(), index, value); return this; }

        /// {@return `gridDimX` at the given index}
        /// @param index the index
        public @CType("uint32_t") int gridDimXAt(long index) { return VkCudaLaunchInfoNV.get_gridDimX(this.segment(), index); }
        /// Sets `gridDimX` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer gridDimXAt(long index, @CType("uint32_t") int value) { VkCudaLaunchInfoNV.set_gridDimX(this.segment(), index, value); return this; }

        /// {@return `gridDimY` at the given index}
        /// @param index the index
        public @CType("uint32_t") int gridDimYAt(long index) { return VkCudaLaunchInfoNV.get_gridDimY(this.segment(), index); }
        /// Sets `gridDimY` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer gridDimYAt(long index, @CType("uint32_t") int value) { VkCudaLaunchInfoNV.set_gridDimY(this.segment(), index, value); return this; }

        /// {@return `gridDimZ` at the given index}
        /// @param index the index
        public @CType("uint32_t") int gridDimZAt(long index) { return VkCudaLaunchInfoNV.get_gridDimZ(this.segment(), index); }
        /// Sets `gridDimZ` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer gridDimZAt(long index, @CType("uint32_t") int value) { VkCudaLaunchInfoNV.set_gridDimZ(this.segment(), index, value); return this; }

        /// {@return `blockDimX` at the given index}
        /// @param index the index
        public @CType("uint32_t") int blockDimXAt(long index) { return VkCudaLaunchInfoNV.get_blockDimX(this.segment(), index); }
        /// Sets `blockDimX` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer blockDimXAt(long index, @CType("uint32_t") int value) { VkCudaLaunchInfoNV.set_blockDimX(this.segment(), index, value); return this; }

        /// {@return `blockDimY` at the given index}
        /// @param index the index
        public @CType("uint32_t") int blockDimYAt(long index) { return VkCudaLaunchInfoNV.get_blockDimY(this.segment(), index); }
        /// Sets `blockDimY` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer blockDimYAt(long index, @CType("uint32_t") int value) { VkCudaLaunchInfoNV.set_blockDimY(this.segment(), index, value); return this; }

        /// {@return `blockDimZ` at the given index}
        /// @param index the index
        public @CType("uint32_t") int blockDimZAt(long index) { return VkCudaLaunchInfoNV.get_blockDimZ(this.segment(), index); }
        /// Sets `blockDimZ` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer blockDimZAt(long index, @CType("uint32_t") int value) { VkCudaLaunchInfoNV.set_blockDimZ(this.segment(), index, value); return this; }

        /// {@return `sharedMemBytes` at the given index}
        /// @param index the index
        public @CType("uint32_t") int sharedMemBytesAt(long index) { return VkCudaLaunchInfoNV.get_sharedMemBytes(this.segment(), index); }
        /// Sets `sharedMemBytes` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sharedMemBytesAt(long index, @CType("uint32_t") int value) { VkCudaLaunchInfoNV.set_sharedMemBytes(this.segment(), index, value); return this; }

        /// {@return `paramCount` at the given index}
        /// @param index the index
        public @CType("size_t") long paramCountAt(long index) { return VkCudaLaunchInfoNV.get_paramCount(this.segment(), index); }
        /// Sets `paramCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer paramCountAt(long index, @CType("size_t") long value) { VkCudaLaunchInfoNV.set_paramCount(this.segment(), index, value); return this; }

        /// {@return `pParams` at the given index}
        /// @param index the index
        public @CType("const void * const *") java.lang.foreign.MemorySegment pParamsAt(long index) { return VkCudaLaunchInfoNV.get_pParams(this.segment(), index); }
        /// Sets `pParams` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pParamsAt(long index, @CType("const void * const *") java.lang.foreign.MemorySegment value) { VkCudaLaunchInfoNV.set_pParams(this.segment(), index, value); return this; }

        /// {@return `extraCount` at the given index}
        /// @param index the index
        public @CType("size_t") long extraCountAt(long index) { return VkCudaLaunchInfoNV.get_extraCount(this.segment(), index); }
        /// Sets `extraCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer extraCountAt(long index, @CType("size_t") long value) { VkCudaLaunchInfoNV.set_extraCount(this.segment(), index, value); return this; }

        /// {@return `pExtras` at the given index}
        /// @param index the index
        public @CType("const void * const *") java.lang.foreign.MemorySegment pExtrasAt(long index) { return VkCudaLaunchInfoNV.get_pExtras(this.segment(), index); }
        /// Sets `pExtras` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pExtrasAt(long index, @CType("const void * const *") java.lang.foreign.MemorySegment value) { VkCudaLaunchInfoNV.set_pExtras(this.segment(), index, value); return this; }

    }
}

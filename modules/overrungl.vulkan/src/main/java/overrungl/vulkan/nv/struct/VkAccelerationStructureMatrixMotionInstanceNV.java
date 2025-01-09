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
/// ### transformT0
/// [Byte offset][#OFFSET_transformT0] - [Memory layout][#ML_transformT0] - [Getter][#transformT0()] - [Setter][#transformT0(java.lang.foreign.MemorySegment)]
/// ### transformT1
/// [Byte offset][#OFFSET_transformT1] - [Memory layout][#ML_transformT1] - [Getter][#transformT1()] - [Setter][#transformT1(java.lang.foreign.MemorySegment)]
/// ### instanceCustomIndex
/// [VarHandle][#VH_instanceCustomIndex] - [Getter][#instanceCustomIndex()] - [Setter][#instanceCustomIndex(int)]
/// ### mask
/// [VarHandle][#VH_mask] - [Getter][#mask()] - [Setter][#mask(int)]
/// ### instanceShaderBindingTableRecordOffset
/// [VarHandle][#VH_instanceShaderBindingTableRecordOffset] - [Getter][#instanceShaderBindingTableRecordOffset()] - [Setter][#instanceShaderBindingTableRecordOffset(int)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### accelerationStructureReference
/// [VarHandle][#VH_accelerationStructureReference] - [Getter][#accelerationStructureReference()] - [Setter][#accelerationStructureReference(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAccelerationStructureMatrixMotionInstanceNV {
///     VkTransformMatrixKHR transformT0;
///     VkTransformMatrixKHR transformT1;
///     uint32_t instanceCustomIndex;
///     uint32_t mask;
///     uint32_t instanceShaderBindingTableRecordOffset;
///     VkGeometryInstanceFlagsKHR flags;
///     uint64_t accelerationStructureReference;
/// } VkAccelerationStructureMatrixMotionInstanceNV;
/// ```
public final class VkAccelerationStructureMatrixMotionInstanceNV extends Struct {
    /// The struct layout of `VkAccelerationStructureMatrixMotionInstanceNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.khr.struct.VkTransformMatrixKHR.LAYOUT.withName("transformT0"),
        overrungl.vulkan.khr.struct.VkTransformMatrixKHR.LAYOUT.withName("transformT1"),
        ValueLayout.JAVA_INT.withName("instanceCustomIndex"),
        ValueLayout.JAVA_INT.withName("mask"),
        ValueLayout.JAVA_INT.withName("instanceShaderBindingTableRecordOffset"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("accelerationStructureReference")
    );
    /// The byte offset of `transformT0`.
    public static final long OFFSET_transformT0 = LAYOUT.byteOffset(PathElement.groupElement("transformT0"));
    /// The memory layout of `transformT0`.
    public static final MemoryLayout ML_transformT0 = LAYOUT.select(PathElement.groupElement("transformT0"));
    /// The byte offset of `transformT1`.
    public static final long OFFSET_transformT1 = LAYOUT.byteOffset(PathElement.groupElement("transformT1"));
    /// The memory layout of `transformT1`.
    public static final MemoryLayout ML_transformT1 = LAYOUT.select(PathElement.groupElement("transformT1"));
    /// The [VarHandle] of `instanceCustomIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_instanceCustomIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instanceCustomIndex"));
    /// The [VarHandle] of `mask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_mask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mask"));
    /// The [VarHandle] of `instanceShaderBindingTableRecordOffset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_instanceShaderBindingTableRecordOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("instanceShaderBindingTableRecordOffset"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `accelerationStructureReference` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_accelerationStructureReference = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureReference"));

    /// Creates `VkAccelerationStructureMatrixMotionInstanceNV` with the given segment.
    /// @param segment the memory segment
    public VkAccelerationStructureMatrixMotionInstanceNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAccelerationStructureMatrixMotionInstanceNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureMatrixMotionInstanceNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureMatrixMotionInstanceNV(segment); }

    /// Creates `VkAccelerationStructureMatrixMotionInstanceNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureMatrixMotionInstanceNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureMatrixMotionInstanceNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAccelerationStructureMatrixMotionInstanceNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureMatrixMotionInstanceNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureMatrixMotionInstanceNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkAccelerationStructureMatrixMotionInstanceNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureMatrixMotionInstanceNV`
    public static VkAccelerationStructureMatrixMotionInstanceNV alloc(SegmentAllocator allocator) { return new VkAccelerationStructureMatrixMotionInstanceNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAccelerationStructureMatrixMotionInstanceNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureMatrixMotionInstanceNV`
    public static VkAccelerationStructureMatrixMotionInstanceNV alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureMatrixMotionInstanceNV(allocator.allocate(LAYOUT, count)); }

    /// {@return `transformT0` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkTransformMatrixKHR") java.lang.foreign.MemorySegment get_transformT0(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_transformT0, index), ML_transformT0); }
    /// {@return `transformT0`}
    /// @param segment the segment of the struct
    public static @CType("VkTransformMatrixKHR") java.lang.foreign.MemorySegment get_transformT0(MemorySegment segment) { return VkAccelerationStructureMatrixMotionInstanceNV.get_transformT0(segment, 0L); }
    /// {@return `transformT0` at the given index}
    /// @param index the index
    public @CType("VkTransformMatrixKHR") java.lang.foreign.MemorySegment transformT0At(long index) { return VkAccelerationStructureMatrixMotionInstanceNV.get_transformT0(this.segment(), index); }
    /// {@return `transformT0`}
    public @CType("VkTransformMatrixKHR") java.lang.foreign.MemorySegment transformT0() { return VkAccelerationStructureMatrixMotionInstanceNV.get_transformT0(this.segment()); }
    /// Sets `transformT0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transformT0(MemorySegment segment, long index, @CType("VkTransformMatrixKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_transformT0, index), ML_transformT0.byteSize()); }
    /// Sets `transformT0` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transformT0(MemorySegment segment, @CType("VkTransformMatrixKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureMatrixMotionInstanceNV.set_transformT0(segment, 0L, value); }
    /// Sets `transformT0` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMatrixMotionInstanceNV transformT0At(long index, @CType("VkTransformMatrixKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureMatrixMotionInstanceNV.set_transformT0(this.segment(), index, value); return this; }
    /// Sets `transformT0` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMatrixMotionInstanceNV transformT0(@CType("VkTransformMatrixKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureMatrixMotionInstanceNV.set_transformT0(this.segment(), value); return this; }

    /// {@return `transformT1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkTransformMatrixKHR") java.lang.foreign.MemorySegment get_transformT1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_transformT1, index), ML_transformT1); }
    /// {@return `transformT1`}
    /// @param segment the segment of the struct
    public static @CType("VkTransformMatrixKHR") java.lang.foreign.MemorySegment get_transformT1(MemorySegment segment) { return VkAccelerationStructureMatrixMotionInstanceNV.get_transformT1(segment, 0L); }
    /// {@return `transformT1` at the given index}
    /// @param index the index
    public @CType("VkTransformMatrixKHR") java.lang.foreign.MemorySegment transformT1At(long index) { return VkAccelerationStructureMatrixMotionInstanceNV.get_transformT1(this.segment(), index); }
    /// {@return `transformT1`}
    public @CType("VkTransformMatrixKHR") java.lang.foreign.MemorySegment transformT1() { return VkAccelerationStructureMatrixMotionInstanceNV.get_transformT1(this.segment()); }
    /// Sets `transformT1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transformT1(MemorySegment segment, long index, @CType("VkTransformMatrixKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_transformT1, index), ML_transformT1.byteSize()); }
    /// Sets `transformT1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transformT1(MemorySegment segment, @CType("VkTransformMatrixKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureMatrixMotionInstanceNV.set_transformT1(segment, 0L, value); }
    /// Sets `transformT1` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMatrixMotionInstanceNV transformT1At(long index, @CType("VkTransformMatrixKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureMatrixMotionInstanceNV.set_transformT1(this.segment(), index, value); return this; }
    /// Sets `transformT1` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMatrixMotionInstanceNV transformT1(@CType("VkTransformMatrixKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureMatrixMotionInstanceNV.set_transformT1(this.segment(), value); return this; }

    /// {@return `instanceCustomIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_instanceCustomIndex(MemorySegment segment, long index) { return (int) VH_instanceCustomIndex.get(segment, 0L, index); }
    /// {@return `instanceCustomIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_instanceCustomIndex(MemorySegment segment) { return VkAccelerationStructureMatrixMotionInstanceNV.get_instanceCustomIndex(segment, 0L); }
    /// {@return `instanceCustomIndex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int instanceCustomIndexAt(long index) { return VkAccelerationStructureMatrixMotionInstanceNV.get_instanceCustomIndex(this.segment(), index); }
    /// {@return `instanceCustomIndex`}
    public @CType("uint32_t") int instanceCustomIndex() { return VkAccelerationStructureMatrixMotionInstanceNV.get_instanceCustomIndex(this.segment()); }
    /// Sets `instanceCustomIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_instanceCustomIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_instanceCustomIndex.set(segment, 0L, index, value); }
    /// Sets `instanceCustomIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_instanceCustomIndex(MemorySegment segment, @CType("uint32_t") int value) { VkAccelerationStructureMatrixMotionInstanceNV.set_instanceCustomIndex(segment, 0L, value); }
    /// Sets `instanceCustomIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMatrixMotionInstanceNV instanceCustomIndexAt(long index, @CType("uint32_t") int value) { VkAccelerationStructureMatrixMotionInstanceNV.set_instanceCustomIndex(this.segment(), index, value); return this; }
    /// Sets `instanceCustomIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMatrixMotionInstanceNV instanceCustomIndex(@CType("uint32_t") int value) { VkAccelerationStructureMatrixMotionInstanceNV.set_instanceCustomIndex(this.segment(), value); return this; }

    /// {@return `mask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_mask(MemorySegment segment, long index) { return (int) VH_mask.get(segment, 0L, index); }
    /// {@return `mask`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_mask(MemorySegment segment) { return VkAccelerationStructureMatrixMotionInstanceNV.get_mask(segment, 0L); }
    /// {@return `mask` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maskAt(long index) { return VkAccelerationStructureMatrixMotionInstanceNV.get_mask(this.segment(), index); }
    /// {@return `mask`}
    public @CType("uint32_t") int mask() { return VkAccelerationStructureMatrixMotionInstanceNV.get_mask(this.segment()); }
    /// Sets `mask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mask(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_mask.set(segment, 0L, index, value); }
    /// Sets `mask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mask(MemorySegment segment, @CType("uint32_t") int value) { VkAccelerationStructureMatrixMotionInstanceNV.set_mask(segment, 0L, value); }
    /// Sets `mask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMatrixMotionInstanceNV maskAt(long index, @CType("uint32_t") int value) { VkAccelerationStructureMatrixMotionInstanceNV.set_mask(this.segment(), index, value); return this; }
    /// Sets `mask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMatrixMotionInstanceNV mask(@CType("uint32_t") int value) { VkAccelerationStructureMatrixMotionInstanceNV.set_mask(this.segment(), value); return this; }

    /// {@return `instanceShaderBindingTableRecordOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_instanceShaderBindingTableRecordOffset(MemorySegment segment, long index) { return (int) VH_instanceShaderBindingTableRecordOffset.get(segment, 0L, index); }
    /// {@return `instanceShaderBindingTableRecordOffset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_instanceShaderBindingTableRecordOffset(MemorySegment segment) { return VkAccelerationStructureMatrixMotionInstanceNV.get_instanceShaderBindingTableRecordOffset(segment, 0L); }
    /// {@return `instanceShaderBindingTableRecordOffset` at the given index}
    /// @param index the index
    public @CType("uint32_t") int instanceShaderBindingTableRecordOffsetAt(long index) { return VkAccelerationStructureMatrixMotionInstanceNV.get_instanceShaderBindingTableRecordOffset(this.segment(), index); }
    /// {@return `instanceShaderBindingTableRecordOffset`}
    public @CType("uint32_t") int instanceShaderBindingTableRecordOffset() { return VkAccelerationStructureMatrixMotionInstanceNV.get_instanceShaderBindingTableRecordOffset(this.segment()); }
    /// Sets `instanceShaderBindingTableRecordOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_instanceShaderBindingTableRecordOffset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_instanceShaderBindingTableRecordOffset.set(segment, 0L, index, value); }
    /// Sets `instanceShaderBindingTableRecordOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_instanceShaderBindingTableRecordOffset(MemorySegment segment, @CType("uint32_t") int value) { VkAccelerationStructureMatrixMotionInstanceNV.set_instanceShaderBindingTableRecordOffset(segment, 0L, value); }
    /// Sets `instanceShaderBindingTableRecordOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMatrixMotionInstanceNV instanceShaderBindingTableRecordOffsetAt(long index, @CType("uint32_t") int value) { VkAccelerationStructureMatrixMotionInstanceNV.set_instanceShaderBindingTableRecordOffset(this.segment(), index, value); return this; }
    /// Sets `instanceShaderBindingTableRecordOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMatrixMotionInstanceNV instanceShaderBindingTableRecordOffset(@CType("uint32_t") int value) { VkAccelerationStructureMatrixMotionInstanceNV.set_instanceShaderBindingTableRecordOffset(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkGeometryInstanceFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkGeometryInstanceFlagsKHR") int get_flags(MemorySegment segment) { return VkAccelerationStructureMatrixMotionInstanceNV.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkGeometryInstanceFlagsKHR") int flagsAt(long index) { return VkAccelerationStructureMatrixMotionInstanceNV.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkGeometryInstanceFlagsKHR") int flags() { return VkAccelerationStructureMatrixMotionInstanceNV.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkGeometryInstanceFlagsKHR") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkGeometryInstanceFlagsKHR") int value) { VkAccelerationStructureMatrixMotionInstanceNV.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMatrixMotionInstanceNV flagsAt(long index, @CType("VkGeometryInstanceFlagsKHR") int value) { VkAccelerationStructureMatrixMotionInstanceNV.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMatrixMotionInstanceNV flags(@CType("VkGeometryInstanceFlagsKHR") int value) { VkAccelerationStructureMatrixMotionInstanceNV.set_flags(this.segment(), value); return this; }

    /// {@return `accelerationStructureReference` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_accelerationStructureReference(MemorySegment segment, long index) { return (long) VH_accelerationStructureReference.get(segment, 0L, index); }
    /// {@return `accelerationStructureReference`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_accelerationStructureReference(MemorySegment segment) { return VkAccelerationStructureMatrixMotionInstanceNV.get_accelerationStructureReference(segment, 0L); }
    /// {@return `accelerationStructureReference` at the given index}
    /// @param index the index
    public @CType("uint64_t") long accelerationStructureReferenceAt(long index) { return VkAccelerationStructureMatrixMotionInstanceNV.get_accelerationStructureReference(this.segment(), index); }
    /// {@return `accelerationStructureReference`}
    public @CType("uint64_t") long accelerationStructureReference() { return VkAccelerationStructureMatrixMotionInstanceNV.get_accelerationStructureReference(this.segment()); }
    /// Sets `accelerationStructureReference` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_accelerationStructureReference(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_accelerationStructureReference.set(segment, 0L, index, value); }
    /// Sets `accelerationStructureReference` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_accelerationStructureReference(MemorySegment segment, @CType("uint64_t") long value) { VkAccelerationStructureMatrixMotionInstanceNV.set_accelerationStructureReference(segment, 0L, value); }
    /// Sets `accelerationStructureReference` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMatrixMotionInstanceNV accelerationStructureReferenceAt(long index, @CType("uint64_t") long value) { VkAccelerationStructureMatrixMotionInstanceNV.set_accelerationStructureReference(this.segment(), index, value); return this; }
    /// Sets `accelerationStructureReference` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMatrixMotionInstanceNV accelerationStructureReference(@CType("uint64_t") long value) { VkAccelerationStructureMatrixMotionInstanceNV.set_accelerationStructureReference(this.segment(), value); return this; }

}

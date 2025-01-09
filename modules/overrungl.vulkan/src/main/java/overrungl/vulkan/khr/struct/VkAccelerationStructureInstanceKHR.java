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
/// ### transform
/// [Byte offset][#OFFSET_transform] - [Memory layout][#ML_transform] - [Getter][#transform()] - [Setter][#transform(java.lang.foreign.MemorySegment)]
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
/// typedef struct VkAccelerationStructureInstanceKHR {
///     VkTransformMatrixKHR transform;
///     uint32_t instanceCustomIndex;
///     uint32_t mask;
///     uint32_t instanceShaderBindingTableRecordOffset;
///     VkGeometryInstanceFlagsKHR flags;
///     uint64_t accelerationStructureReference;
/// } VkAccelerationStructureInstanceKHR;
/// ```
public final class VkAccelerationStructureInstanceKHR extends Struct {
    /// The struct layout of `VkAccelerationStructureInstanceKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.khr.struct.VkTransformMatrixKHR.LAYOUT.withName("transform"),
        ValueLayout.JAVA_INT.withName("instanceCustomIndex"),
        ValueLayout.JAVA_INT.withName("mask"),
        ValueLayout.JAVA_INT.withName("instanceShaderBindingTableRecordOffset"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("accelerationStructureReference")
    );
    /// The byte offset of `transform`.
    public static final long OFFSET_transform = LAYOUT.byteOffset(PathElement.groupElement("transform"));
    /// The memory layout of `transform`.
    public static final MemoryLayout ML_transform = LAYOUT.select(PathElement.groupElement("transform"));
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

    /// Creates `VkAccelerationStructureInstanceKHR` with the given segment.
    /// @param segment the memory segment
    public VkAccelerationStructureInstanceKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAccelerationStructureInstanceKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureInstanceKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureInstanceKHR(segment); }

    /// Creates `VkAccelerationStructureInstanceKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureInstanceKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureInstanceKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAccelerationStructureInstanceKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureInstanceKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureInstanceKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkAccelerationStructureInstanceKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureInstanceKHR`
    public static VkAccelerationStructureInstanceKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureInstanceKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAccelerationStructureInstanceKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureInstanceKHR`
    public static VkAccelerationStructureInstanceKHR alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureInstanceKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `transform` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkTransformMatrixKHR") java.lang.foreign.MemorySegment get_transform(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_transform, index), ML_transform); }
    /// {@return `transform`}
    /// @param segment the segment of the struct
    public static @CType("VkTransformMatrixKHR") java.lang.foreign.MemorySegment get_transform(MemorySegment segment) { return VkAccelerationStructureInstanceKHR.get_transform(segment, 0L); }
    /// {@return `transform` at the given index}
    /// @param index the index
    public @CType("VkTransformMatrixKHR") java.lang.foreign.MemorySegment transformAt(long index) { return VkAccelerationStructureInstanceKHR.get_transform(this.segment(), index); }
    /// {@return `transform`}
    public @CType("VkTransformMatrixKHR") java.lang.foreign.MemorySegment transform() { return VkAccelerationStructureInstanceKHR.get_transform(this.segment()); }
    /// Sets `transform` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transform(MemorySegment segment, long index, @CType("VkTransformMatrixKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_transform, index), ML_transform.byteSize()); }
    /// Sets `transform` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transform(MemorySegment segment, @CType("VkTransformMatrixKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureInstanceKHR.set_transform(segment, 0L, value); }
    /// Sets `transform` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInstanceKHR transformAt(long index, @CType("VkTransformMatrixKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureInstanceKHR.set_transform(this.segment(), index, value); return this; }
    /// Sets `transform` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInstanceKHR transform(@CType("VkTransformMatrixKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureInstanceKHR.set_transform(this.segment(), value); return this; }

    /// {@return `instanceCustomIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_instanceCustomIndex(MemorySegment segment, long index) { return (int) VH_instanceCustomIndex.get(segment, 0L, index); }
    /// {@return `instanceCustomIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_instanceCustomIndex(MemorySegment segment) { return VkAccelerationStructureInstanceKHR.get_instanceCustomIndex(segment, 0L); }
    /// {@return `instanceCustomIndex` at the given index}
    /// @param index the index
    public @CType("uint32_t") int instanceCustomIndexAt(long index) { return VkAccelerationStructureInstanceKHR.get_instanceCustomIndex(this.segment(), index); }
    /// {@return `instanceCustomIndex`}
    public @CType("uint32_t") int instanceCustomIndex() { return VkAccelerationStructureInstanceKHR.get_instanceCustomIndex(this.segment()); }
    /// Sets `instanceCustomIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_instanceCustomIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_instanceCustomIndex.set(segment, 0L, index, value); }
    /// Sets `instanceCustomIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_instanceCustomIndex(MemorySegment segment, @CType("uint32_t") int value) { VkAccelerationStructureInstanceKHR.set_instanceCustomIndex(segment, 0L, value); }
    /// Sets `instanceCustomIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInstanceKHR instanceCustomIndexAt(long index, @CType("uint32_t") int value) { VkAccelerationStructureInstanceKHR.set_instanceCustomIndex(this.segment(), index, value); return this; }
    /// Sets `instanceCustomIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInstanceKHR instanceCustomIndex(@CType("uint32_t") int value) { VkAccelerationStructureInstanceKHR.set_instanceCustomIndex(this.segment(), value); return this; }

    /// {@return `mask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_mask(MemorySegment segment, long index) { return (int) VH_mask.get(segment, 0L, index); }
    /// {@return `mask`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_mask(MemorySegment segment) { return VkAccelerationStructureInstanceKHR.get_mask(segment, 0L); }
    /// {@return `mask` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maskAt(long index) { return VkAccelerationStructureInstanceKHR.get_mask(this.segment(), index); }
    /// {@return `mask`}
    public @CType("uint32_t") int mask() { return VkAccelerationStructureInstanceKHR.get_mask(this.segment()); }
    /// Sets `mask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mask(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_mask.set(segment, 0L, index, value); }
    /// Sets `mask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mask(MemorySegment segment, @CType("uint32_t") int value) { VkAccelerationStructureInstanceKHR.set_mask(segment, 0L, value); }
    /// Sets `mask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInstanceKHR maskAt(long index, @CType("uint32_t") int value) { VkAccelerationStructureInstanceKHR.set_mask(this.segment(), index, value); return this; }
    /// Sets `mask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInstanceKHR mask(@CType("uint32_t") int value) { VkAccelerationStructureInstanceKHR.set_mask(this.segment(), value); return this; }

    /// {@return `instanceShaderBindingTableRecordOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_instanceShaderBindingTableRecordOffset(MemorySegment segment, long index) { return (int) VH_instanceShaderBindingTableRecordOffset.get(segment, 0L, index); }
    /// {@return `instanceShaderBindingTableRecordOffset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_instanceShaderBindingTableRecordOffset(MemorySegment segment) { return VkAccelerationStructureInstanceKHR.get_instanceShaderBindingTableRecordOffset(segment, 0L); }
    /// {@return `instanceShaderBindingTableRecordOffset` at the given index}
    /// @param index the index
    public @CType("uint32_t") int instanceShaderBindingTableRecordOffsetAt(long index) { return VkAccelerationStructureInstanceKHR.get_instanceShaderBindingTableRecordOffset(this.segment(), index); }
    /// {@return `instanceShaderBindingTableRecordOffset`}
    public @CType("uint32_t") int instanceShaderBindingTableRecordOffset() { return VkAccelerationStructureInstanceKHR.get_instanceShaderBindingTableRecordOffset(this.segment()); }
    /// Sets `instanceShaderBindingTableRecordOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_instanceShaderBindingTableRecordOffset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_instanceShaderBindingTableRecordOffset.set(segment, 0L, index, value); }
    /// Sets `instanceShaderBindingTableRecordOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_instanceShaderBindingTableRecordOffset(MemorySegment segment, @CType("uint32_t") int value) { VkAccelerationStructureInstanceKHR.set_instanceShaderBindingTableRecordOffset(segment, 0L, value); }
    /// Sets `instanceShaderBindingTableRecordOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInstanceKHR instanceShaderBindingTableRecordOffsetAt(long index, @CType("uint32_t") int value) { VkAccelerationStructureInstanceKHR.set_instanceShaderBindingTableRecordOffset(this.segment(), index, value); return this; }
    /// Sets `instanceShaderBindingTableRecordOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInstanceKHR instanceShaderBindingTableRecordOffset(@CType("uint32_t") int value) { VkAccelerationStructureInstanceKHR.set_instanceShaderBindingTableRecordOffset(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkGeometryInstanceFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkGeometryInstanceFlagsKHR") int get_flags(MemorySegment segment) { return VkAccelerationStructureInstanceKHR.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkGeometryInstanceFlagsKHR") int flagsAt(long index) { return VkAccelerationStructureInstanceKHR.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkGeometryInstanceFlagsKHR") int flags() { return VkAccelerationStructureInstanceKHR.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkGeometryInstanceFlagsKHR") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkGeometryInstanceFlagsKHR") int value) { VkAccelerationStructureInstanceKHR.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInstanceKHR flagsAt(long index, @CType("VkGeometryInstanceFlagsKHR") int value) { VkAccelerationStructureInstanceKHR.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInstanceKHR flags(@CType("VkGeometryInstanceFlagsKHR") int value) { VkAccelerationStructureInstanceKHR.set_flags(this.segment(), value); return this; }

    /// {@return `accelerationStructureReference` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_accelerationStructureReference(MemorySegment segment, long index) { return (long) VH_accelerationStructureReference.get(segment, 0L, index); }
    /// {@return `accelerationStructureReference`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_accelerationStructureReference(MemorySegment segment) { return VkAccelerationStructureInstanceKHR.get_accelerationStructureReference(segment, 0L); }
    /// {@return `accelerationStructureReference` at the given index}
    /// @param index the index
    public @CType("uint64_t") long accelerationStructureReferenceAt(long index) { return VkAccelerationStructureInstanceKHR.get_accelerationStructureReference(this.segment(), index); }
    /// {@return `accelerationStructureReference`}
    public @CType("uint64_t") long accelerationStructureReference() { return VkAccelerationStructureInstanceKHR.get_accelerationStructureReference(this.segment()); }
    /// Sets `accelerationStructureReference` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_accelerationStructureReference(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_accelerationStructureReference.set(segment, 0L, index, value); }
    /// Sets `accelerationStructureReference` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_accelerationStructureReference(MemorySegment segment, @CType("uint64_t") long value) { VkAccelerationStructureInstanceKHR.set_accelerationStructureReference(segment, 0L, value); }
    /// Sets `accelerationStructureReference` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInstanceKHR accelerationStructureReferenceAt(long index, @CType("uint64_t") long value) { VkAccelerationStructureInstanceKHR.set_accelerationStructureReference(this.segment(), index, value); return this; }
    /// Sets `accelerationStructureReference` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureInstanceKHR accelerationStructureReference(@CType("uint64_t") long value) { VkAccelerationStructureInstanceKHR.set_accelerationStructureReference(this.segment(), value); return this; }

}

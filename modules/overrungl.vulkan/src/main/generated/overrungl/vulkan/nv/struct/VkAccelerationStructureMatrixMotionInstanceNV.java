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
//@formatter:off
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkAccelerationStructureMatrixMotionInstanceNV {
///     (struct VkTransformMatrixKHR) VkTransformMatrixKHR transformT0;
///     (struct VkTransformMatrixKHR) VkTransformMatrixKHR transformT1;
///     uint32_t instanceCustomIndex : 24;
///     uint32_t mask : 8;
///     uint32_t instanceShaderBindingTableRecordOffset : 24;
///     ((uint32_t) VkFlags) VkGeometryInstanceFlagsKHR flags : 8;
///     uint64_t accelerationStructureReference;
/// };
/// ```
public final class VkAccelerationStructureMatrixMotionInstanceNV extends GroupType {
    /// The struct layout of `VkAccelerationStructureMatrixMotionInstanceNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.bitfields(
        overrungl.vulkan.khr.struct.VkTransformMatrixKHR.LAYOUT.withName("transformT0"), -1,
        overrungl.vulkan.khr.struct.VkTransformMatrixKHR.LAYOUT.withName("transformT1"), -1,
        ValueLayout.JAVA_INT.withName("instanceCustomIndex"), 24,
        ValueLayout.JAVA_INT.withName("mask"), 8,
        ValueLayout.JAVA_INT.withName("instanceShaderBindingTableRecordOffset"), 24,
        ValueLayout.JAVA_INT.withName("flags"), 8,
        ValueLayout.JAVA_LONG.withName("accelerationStructureReference"), -1
    );
    /// The byte offset of `transformT0`.
    public static final long OFFSET_transformT0 = LAYOUT.byteOffset(PathElement.groupElement("transformT0"));
    /// The memory layout of `transformT0`.
    public static final MemoryLayout LAYOUT_transformT0 = LAYOUT.select(PathElement.groupElement("transformT0"));
    /// The byte offset of `transformT1`.
    public static final long OFFSET_transformT1 = LAYOUT.byteOffset(PathElement.groupElement("transformT1"));
    /// The memory layout of `transformT1`.
    public static final MemoryLayout LAYOUT_transformT1 = LAYOUT.select(PathElement.groupElement("transformT1"));
    /// The byte offset of `accelerationStructureReference`.
    public static final long OFFSET_accelerationStructureReference = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureReference"));
    /// The memory layout of `accelerationStructureReference`.
    public static final MemoryLayout LAYOUT_accelerationStructureReference = LAYOUT.select(PathElement.groupElement("accelerationStructureReference"));
    /// The [VarHandle] of `accelerationStructureReference` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_accelerationStructureReference = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureReference"));

    /// Creates `VkAccelerationStructureMatrixMotionInstanceNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkAccelerationStructureMatrixMotionInstanceNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkAccelerationStructureMatrixMotionInstanceNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureMatrixMotionInstanceNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureMatrixMotionInstanceNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureMatrixMotionInstanceNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureMatrixMotionInstanceNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureMatrixMotionInstanceNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkAccelerationStructureMatrixMotionInstanceNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureMatrixMotionInstanceNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureMatrixMotionInstanceNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAccelerationStructureMatrixMotionInstanceNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureMatrixMotionInstanceNV`
    public static VkAccelerationStructureMatrixMotionInstanceNV alloc(SegmentAllocator allocator) { return new VkAccelerationStructureMatrixMotionInstanceNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkAccelerationStructureMatrixMotionInstanceNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureMatrixMotionInstanceNV`
    public static VkAccelerationStructureMatrixMotionInstanceNV alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureMatrixMotionInstanceNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureMatrixMotionInstanceNV copyFrom(VkAccelerationStructureMatrixMotionInstanceNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkAccelerationStructureMatrixMotionInstanceNV reinterpret(long count) { return new VkAccelerationStructureMatrixMotionInstanceNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `transformT0` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment transformT0(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_transformT0, index), LAYOUT_transformT0); }
    /// {@return `transformT0`}
    public MemorySegment transformT0() { return transformT0(this.segment(), 0L); }
    /// Sets `transformT0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void transformT0(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_transformT0, index), LAYOUT_transformT0.byteSize()); }
    /// Sets `transformT0` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMatrixMotionInstanceNV transformT0(MemorySegment value) { transformT0(this.segment(), 0L, value); return this; }
    /// Accepts `transformT0` with the given function.
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureMatrixMotionInstanceNV transformT0(Consumer<overrungl.vulkan.khr.struct.VkTransformMatrixKHR> func) { func.accept(overrungl.vulkan.khr.struct.VkTransformMatrixKHR.of(transformT0())); return this; }

    /// {@return `transformT1` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment transformT1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_transformT1, index), LAYOUT_transformT1); }
    /// {@return `transformT1`}
    public MemorySegment transformT1() { return transformT1(this.segment(), 0L); }
    /// Sets `transformT1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void transformT1(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_transformT1, index), LAYOUT_transformT1.byteSize()); }
    /// Sets `transformT1` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMatrixMotionInstanceNV transformT1(MemorySegment value) { transformT1(this.segment(), 0L, value); return this; }
    /// Accepts `transformT1` with the given function.
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureMatrixMotionInstanceNV transformT1(Consumer<overrungl.vulkan.khr.struct.VkTransformMatrixKHR> func) { func.accept(overrungl.vulkan.khr.struct.VkTransformMatrixKHR.of(transformT1())); return this; }

    /// {@return `accelerationStructureReference` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long accelerationStructureReference(MemorySegment segment, long index) { return (long) VH_accelerationStructureReference.get(segment, 0L, index); }
    /// {@return `accelerationStructureReference`}
    public long accelerationStructureReference() { return accelerationStructureReference(this.segment(), 0L); }
    /// Sets `accelerationStructureReference` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void accelerationStructureReference(MemorySegment segment, long index, long value) { VH_accelerationStructureReference.set(segment, 0L, index, value); }
    /// Sets `accelerationStructureReference` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMatrixMotionInstanceNV accelerationStructureReference(long value) { accelerationStructureReference(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkAccelerationStructureMatrixMotionInstanceNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAccelerationStructureMatrixMotionInstanceNV`
    public VkAccelerationStructureMatrixMotionInstanceNV asSlice(long index) { return new VkAccelerationStructureMatrixMotionInstanceNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkAccelerationStructureMatrixMotionInstanceNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAccelerationStructureMatrixMotionInstanceNV`
    public VkAccelerationStructureMatrixMotionInstanceNV asSlice(long index, long count) { return new VkAccelerationStructureMatrixMotionInstanceNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkAccelerationStructureMatrixMotionInstanceNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkAccelerationStructureMatrixMotionInstanceNV at(long index, Consumer<VkAccelerationStructureMatrixMotionInstanceNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `transformT0` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment transformT0At(long index) { return transformT0(this.segment(), index); }
    /// Sets `transformT0` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMatrixMotionInstanceNV transformT0At(long index, MemorySegment value) { transformT0(this.segment(), index, value); return this; }
    /// Accepts `transformT0` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureMatrixMotionInstanceNV transformT0At(long index, Consumer<overrungl.vulkan.khr.struct.VkTransformMatrixKHR> func) { func.accept(overrungl.vulkan.khr.struct.VkTransformMatrixKHR.of(transformT0At(index))); return this; }

    /// {@return `transformT1` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment transformT1At(long index) { return transformT1(this.segment(), index); }
    /// Sets `transformT1` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMatrixMotionInstanceNV transformT1At(long index, MemorySegment value) { transformT1(this.segment(), index, value); return this; }
    /// Accepts `transformT1` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureMatrixMotionInstanceNV transformT1At(long index, Consumer<overrungl.vulkan.khr.struct.VkTransformMatrixKHR> func) { func.accept(overrungl.vulkan.khr.struct.VkTransformMatrixKHR.of(transformT1At(index))); return this; }

    /// {@return `accelerationStructureReference` at the given index}
    /// @param index the index of the struct buffer
    public long accelerationStructureReferenceAt(long index) { return accelerationStructureReference(this.segment(), index); }
    /// Sets `accelerationStructureReference` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMatrixMotionInstanceNV accelerationStructureReferenceAt(long index, long value) { accelerationStructureReference(this.segment(), index, value); return this; }

}

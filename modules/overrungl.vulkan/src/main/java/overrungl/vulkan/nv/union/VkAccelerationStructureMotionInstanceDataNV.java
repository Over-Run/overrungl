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
package overrungl.vulkan.nv.union;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### staticInstance
/// [Byte offset][#OFFSET_staticInstance] - [Memory layout][#ML_staticInstance] - [Getter][#staticInstance()] - [Setter][#staticInstance(java.lang.foreign.MemorySegment)]
/// ### matrixMotionInstance
/// [Byte offset][#OFFSET_matrixMotionInstance] - [Memory layout][#ML_matrixMotionInstance] - [Getter][#matrixMotionInstance()] - [Setter][#matrixMotionInstance(java.lang.foreign.MemorySegment)]
/// ### srtMotionInstance
/// [Byte offset][#OFFSET_srtMotionInstance] - [Memory layout][#ML_srtMotionInstance] - [Getter][#srtMotionInstance()] - [Setter][#srtMotionInstance(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef union VkAccelerationStructureMotionInstanceDataNV {
///     VkAccelerationStructureInstanceKHR staticInstance;
///     VkAccelerationStructureMatrixMotionInstanceNV matrixMotionInstance;
///     VkAccelerationStructureSRTMotionInstanceNV srtMotionInstance;
/// } VkAccelerationStructureMotionInstanceDataNV;
/// ```
public final class VkAccelerationStructureMotionInstanceDataNV extends Union {
    /// The union layout of `VkAccelerationStructureMotionInstanceDataNV`.
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        overrungl.vulkan.khr.struct.VkAccelerationStructureInstanceKHR.LAYOUT.withName("staticInstance"),
        overrungl.vulkan.nv.struct.VkAccelerationStructureMatrixMotionInstanceNV.LAYOUT.withName("matrixMotionInstance"),
        overrungl.vulkan.nv.struct.VkAccelerationStructureSRTMotionInstanceNV.LAYOUT.withName("srtMotionInstance")
    );
    /// The byte offset of `staticInstance`.
    public static final long OFFSET_staticInstance = LAYOUT.byteOffset(PathElement.groupElement("staticInstance"));
    /// The memory layout of `staticInstance`.
    public static final MemoryLayout ML_staticInstance = LAYOUT.select(PathElement.groupElement("staticInstance"));
    /// The byte offset of `matrixMotionInstance`.
    public static final long OFFSET_matrixMotionInstance = LAYOUT.byteOffset(PathElement.groupElement("matrixMotionInstance"));
    /// The memory layout of `matrixMotionInstance`.
    public static final MemoryLayout ML_matrixMotionInstance = LAYOUT.select(PathElement.groupElement("matrixMotionInstance"));
    /// The byte offset of `srtMotionInstance`.
    public static final long OFFSET_srtMotionInstance = LAYOUT.byteOffset(PathElement.groupElement("srtMotionInstance"));
    /// The memory layout of `srtMotionInstance`.
    public static final MemoryLayout ML_srtMotionInstance = LAYOUT.select(PathElement.groupElement("srtMotionInstance"));

    /// Creates `VkAccelerationStructureMotionInstanceDataNV` with the given segment.
    /// @param segment the memory segment
    public VkAccelerationStructureMotionInstanceDataNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAccelerationStructureMotionInstanceDataNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureMotionInstanceDataNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureMotionInstanceDataNV(segment); }

    /// Creates `VkAccelerationStructureMotionInstanceDataNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureMotionInstanceDataNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureMotionInstanceDataNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAccelerationStructureMotionInstanceDataNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureMotionInstanceDataNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureMotionInstanceDataNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkAccelerationStructureMotionInstanceDataNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureMotionInstanceDataNV`
    public static VkAccelerationStructureMotionInstanceDataNV alloc(SegmentAllocator allocator) { return new VkAccelerationStructureMotionInstanceDataNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAccelerationStructureMotionInstanceDataNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureMotionInstanceDataNV`
    public static VkAccelerationStructureMotionInstanceDataNV alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureMotionInstanceDataNV(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkAccelerationStructureMotionInstanceDataNV`.
    /// @param index the index of the union buffer
    /// @return the slice of `VkAccelerationStructureMotionInstanceDataNV`
    public VkAccelerationStructureMotionInstanceDataNV asSlice(long index) { return new VkAccelerationStructureMotionInstanceDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkAccelerationStructureMotionInstanceDataNV`.
    /// @param index the index of the union buffer
    /// @param count the count
    /// @return the slice of `VkAccelerationStructureMotionInstanceDataNV`
    public VkAccelerationStructureMotionInstanceDataNV asSlice(long index, long count) { return new VkAccelerationStructureMotionInstanceDataNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `staticInstance` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("VkAccelerationStructureInstanceKHR") java.lang.foreign.MemorySegment get_staticInstance(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_staticInstance, index), ML_staticInstance); }
    /// {@return `staticInstance`}
    /// @param segment the segment of the union
    public static @CType("VkAccelerationStructureInstanceKHR") java.lang.foreign.MemorySegment get_staticInstance(MemorySegment segment) { return VkAccelerationStructureMotionInstanceDataNV.get_staticInstance(segment, 0L); }
    /// {@return `staticInstance` at the given index}
    /// @param index the index
    public @CType("VkAccelerationStructureInstanceKHR") java.lang.foreign.MemorySegment staticInstanceAt(long index) { return VkAccelerationStructureMotionInstanceDataNV.get_staticInstance(this.segment(), index); }
    /// {@return `staticInstance`}
    public @CType("VkAccelerationStructureInstanceKHR") java.lang.foreign.MemorySegment staticInstance() { return VkAccelerationStructureMotionInstanceDataNV.get_staticInstance(this.segment()); }
    /// Sets `staticInstance` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_staticInstance(MemorySegment segment, long index, @CType("VkAccelerationStructureInstanceKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_staticInstance, index), ML_staticInstance.byteSize()); }
    /// Sets `staticInstance` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_staticInstance(MemorySegment segment, @CType("VkAccelerationStructureInstanceKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureMotionInstanceDataNV.set_staticInstance(segment, 0L, value); }
    /// Sets `staticInstance` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMotionInstanceDataNV staticInstanceAt(long index, @CType("VkAccelerationStructureInstanceKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureMotionInstanceDataNV.set_staticInstance(this.segment(), index, value); return this; }
    /// Sets `staticInstance` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMotionInstanceDataNV staticInstance(@CType("VkAccelerationStructureInstanceKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureMotionInstanceDataNV.set_staticInstance(this.segment(), value); return this; }

    /// {@return `matrixMotionInstance` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("VkAccelerationStructureMatrixMotionInstanceNV") java.lang.foreign.MemorySegment get_matrixMotionInstance(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_matrixMotionInstance, index), ML_matrixMotionInstance); }
    /// {@return `matrixMotionInstance`}
    /// @param segment the segment of the union
    public static @CType("VkAccelerationStructureMatrixMotionInstanceNV") java.lang.foreign.MemorySegment get_matrixMotionInstance(MemorySegment segment) { return VkAccelerationStructureMotionInstanceDataNV.get_matrixMotionInstance(segment, 0L); }
    /// {@return `matrixMotionInstance` at the given index}
    /// @param index the index
    public @CType("VkAccelerationStructureMatrixMotionInstanceNV") java.lang.foreign.MemorySegment matrixMotionInstanceAt(long index) { return VkAccelerationStructureMotionInstanceDataNV.get_matrixMotionInstance(this.segment(), index); }
    /// {@return `matrixMotionInstance`}
    public @CType("VkAccelerationStructureMatrixMotionInstanceNV") java.lang.foreign.MemorySegment matrixMotionInstance() { return VkAccelerationStructureMotionInstanceDataNV.get_matrixMotionInstance(this.segment()); }
    /// Sets `matrixMotionInstance` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_matrixMotionInstance(MemorySegment segment, long index, @CType("VkAccelerationStructureMatrixMotionInstanceNV") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_matrixMotionInstance, index), ML_matrixMotionInstance.byteSize()); }
    /// Sets `matrixMotionInstance` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_matrixMotionInstance(MemorySegment segment, @CType("VkAccelerationStructureMatrixMotionInstanceNV") java.lang.foreign.MemorySegment value) { VkAccelerationStructureMotionInstanceDataNV.set_matrixMotionInstance(segment, 0L, value); }
    /// Sets `matrixMotionInstance` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMotionInstanceDataNV matrixMotionInstanceAt(long index, @CType("VkAccelerationStructureMatrixMotionInstanceNV") java.lang.foreign.MemorySegment value) { VkAccelerationStructureMotionInstanceDataNV.set_matrixMotionInstance(this.segment(), index, value); return this; }
    /// Sets `matrixMotionInstance` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMotionInstanceDataNV matrixMotionInstance(@CType("VkAccelerationStructureMatrixMotionInstanceNV") java.lang.foreign.MemorySegment value) { VkAccelerationStructureMotionInstanceDataNV.set_matrixMotionInstance(this.segment(), value); return this; }

    /// {@return `srtMotionInstance` at the given index}
    /// @param segment the segment of the union
    /// @param index   the index
    public static @CType("VkAccelerationStructureSRTMotionInstanceNV") java.lang.foreign.MemorySegment get_srtMotionInstance(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_srtMotionInstance, index), ML_srtMotionInstance); }
    /// {@return `srtMotionInstance`}
    /// @param segment the segment of the union
    public static @CType("VkAccelerationStructureSRTMotionInstanceNV") java.lang.foreign.MemorySegment get_srtMotionInstance(MemorySegment segment) { return VkAccelerationStructureMotionInstanceDataNV.get_srtMotionInstance(segment, 0L); }
    /// {@return `srtMotionInstance` at the given index}
    /// @param index the index
    public @CType("VkAccelerationStructureSRTMotionInstanceNV") java.lang.foreign.MemorySegment srtMotionInstanceAt(long index) { return VkAccelerationStructureMotionInstanceDataNV.get_srtMotionInstance(this.segment(), index); }
    /// {@return `srtMotionInstance`}
    public @CType("VkAccelerationStructureSRTMotionInstanceNV") java.lang.foreign.MemorySegment srtMotionInstance() { return VkAccelerationStructureMotionInstanceDataNV.get_srtMotionInstance(this.segment()); }
    /// Sets `srtMotionInstance` with the given value at the given index.
    /// @param segment the segment of the union
    /// @param index   the index
    /// @param value   the value
    public static void set_srtMotionInstance(MemorySegment segment, long index, @CType("VkAccelerationStructureSRTMotionInstanceNV") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_srtMotionInstance, index), ML_srtMotionInstance.byteSize()); }
    /// Sets `srtMotionInstance` with the given value.
    /// @param segment the segment of the union
    /// @param value   the value
    public static void set_srtMotionInstance(MemorySegment segment, @CType("VkAccelerationStructureSRTMotionInstanceNV") java.lang.foreign.MemorySegment value) { VkAccelerationStructureMotionInstanceDataNV.set_srtMotionInstance(segment, 0L, value); }
    /// Sets `srtMotionInstance` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMotionInstanceDataNV srtMotionInstanceAt(long index, @CType("VkAccelerationStructureSRTMotionInstanceNV") java.lang.foreign.MemorySegment value) { VkAccelerationStructureMotionInstanceDataNV.set_srtMotionInstance(this.segment(), index, value); return this; }
    /// Sets `srtMotionInstance` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureMotionInstanceDataNV srtMotionInstance(@CType("VkAccelerationStructureSRTMotionInstanceNV") java.lang.foreign.MemorySegment value) { VkAccelerationStructureMotionInstanceDataNV.set_srtMotionInstance(this.segment(), value); return this; }

}

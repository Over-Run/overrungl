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
/// [Byte offset][#OFFSET_transformT0] - [Memory layout][#ML_transformT0] - [Getter][#transformT0()] - [Setter][#transformT0(MemorySegment)]
/// ### transformT1
/// [Byte offset][#OFFSET_transformT1] - [Memory layout][#ML_transformT1] - [Getter][#transformT1()] - [Setter][#transformT1(MemorySegment)]
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
/// typedef struct VkAccelerationStructureSRTMotionInstanceNV {
///     VkSRTDataNV transformT0;
///     VkSRTDataNV transformT1;
///     uint32_t instanceCustomIndex;
///     uint32_t mask;
///     uint32_t instanceShaderBindingTableRecordOffset;
///     VkGeometryInstanceFlagsKHR flags;
///     uint64_t accelerationStructureReference;
/// } VkAccelerationStructureSRTMotionInstanceNV;
/// ```
public sealed class VkAccelerationStructureSRTMotionInstanceNV extends Struct {
    /// The struct layout of `VkAccelerationStructureSRTMotionInstanceNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.nv.struct.VkSRTDataNV.LAYOUT.withName("transformT0"),
        overrungl.vulkan.nv.struct.VkSRTDataNV.LAYOUT.withName("transformT1"),
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

    /// Creates `VkAccelerationStructureSRTMotionInstanceNV` with the given segment.
    /// @param segment the memory segment
    public VkAccelerationStructureSRTMotionInstanceNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAccelerationStructureSRTMotionInstanceNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureSRTMotionInstanceNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureSRTMotionInstanceNV(segment); }

    /// Creates `VkAccelerationStructureSRTMotionInstanceNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureSRTMotionInstanceNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureSRTMotionInstanceNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureSRTMotionInstanceNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAccelerationStructureSRTMotionInstanceNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkAccelerationStructureSRTMotionInstanceNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureSRTMotionInstanceNV`
    public static VkAccelerationStructureSRTMotionInstanceNV alloc(SegmentAllocator allocator) { return new VkAccelerationStructureSRTMotionInstanceNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAccelerationStructureSRTMotionInstanceNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureSRTMotionInstanceNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAccelerationStructureSRTMotionInstanceNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureSRTMotionInstanceNV`
    public static VkAccelerationStructureSRTMotionInstanceNV allocInit(SegmentAllocator allocator, @CType("VkSRTDataNV") MemorySegment transformT0, @CType("VkSRTDataNV") MemorySegment transformT1, @CType("uint32_t") int instanceCustomIndex, @CType("uint32_t") int mask, @CType("uint32_t") int instanceShaderBindingTableRecordOffset, @CType("VkGeometryInstanceFlagsKHR") int flags, @CType("uint64_t") long accelerationStructureReference) { return alloc(allocator).transformT0(transformT0).transformT1(transformT1).instanceCustomIndex(instanceCustomIndex).mask(mask).instanceShaderBindingTableRecordOffset(instanceShaderBindingTableRecordOffset).flags(flags).accelerationStructureReference(accelerationStructureReference); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureSRTMotionInstanceNV copyFrom(VkAccelerationStructureSRTMotionInstanceNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `transformT0` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSRTDataNV") MemorySegment get_transformT0(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_transformT0, index), ML_transformT0); }
    /// {@return `transformT0`}
    /// @param segment the segment of the struct
    public static @CType("VkSRTDataNV") MemorySegment get_transformT0(MemorySegment segment) { return VkAccelerationStructureSRTMotionInstanceNV.get_transformT0(segment, 0L); }
    /// {@return `transformT0`}
    public @CType("VkSRTDataNV") MemorySegment transformT0() { return VkAccelerationStructureSRTMotionInstanceNV.get_transformT0(this.segment()); }
    /// Sets `transformT0` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transformT0(MemorySegment segment, long index, @CType("VkSRTDataNV") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_transformT0, index), ML_transformT0.byteSize()); }
    /// Sets `transformT0` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transformT0(MemorySegment segment, @CType("VkSRTDataNV") MemorySegment value) { VkAccelerationStructureSRTMotionInstanceNV.set_transformT0(segment, 0L, value); }
    /// Sets `transformT0` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureSRTMotionInstanceNV transformT0(@CType("VkSRTDataNV") MemorySegment value) { VkAccelerationStructureSRTMotionInstanceNV.set_transformT0(this.segment(), value); return this; }

    /// {@return `transformT1` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSRTDataNV") MemorySegment get_transformT1(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_transformT1, index), ML_transformT1); }
    /// {@return `transformT1`}
    /// @param segment the segment of the struct
    public static @CType("VkSRTDataNV") MemorySegment get_transformT1(MemorySegment segment) { return VkAccelerationStructureSRTMotionInstanceNV.get_transformT1(segment, 0L); }
    /// {@return `transformT1`}
    public @CType("VkSRTDataNV") MemorySegment transformT1() { return VkAccelerationStructureSRTMotionInstanceNV.get_transformT1(this.segment()); }
    /// Sets `transformT1` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transformT1(MemorySegment segment, long index, @CType("VkSRTDataNV") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_transformT1, index), ML_transformT1.byteSize()); }
    /// Sets `transformT1` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transformT1(MemorySegment segment, @CType("VkSRTDataNV") MemorySegment value) { VkAccelerationStructureSRTMotionInstanceNV.set_transformT1(segment, 0L, value); }
    /// Sets `transformT1` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureSRTMotionInstanceNV transformT1(@CType("VkSRTDataNV") MemorySegment value) { VkAccelerationStructureSRTMotionInstanceNV.set_transformT1(this.segment(), value); return this; }

    /// {@return `instanceCustomIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_instanceCustomIndex(MemorySegment segment, long index) { return (int) VH_instanceCustomIndex.get(segment, 0L, index); }
    /// {@return `instanceCustomIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_instanceCustomIndex(MemorySegment segment) { return VkAccelerationStructureSRTMotionInstanceNV.get_instanceCustomIndex(segment, 0L); }
    /// {@return `instanceCustomIndex`}
    public @CType("uint32_t") int instanceCustomIndex() { return VkAccelerationStructureSRTMotionInstanceNV.get_instanceCustomIndex(this.segment()); }
    /// Sets `instanceCustomIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_instanceCustomIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_instanceCustomIndex.set(segment, 0L, index, value); }
    /// Sets `instanceCustomIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_instanceCustomIndex(MemorySegment segment, @CType("uint32_t") int value) { VkAccelerationStructureSRTMotionInstanceNV.set_instanceCustomIndex(segment, 0L, value); }
    /// Sets `instanceCustomIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureSRTMotionInstanceNV instanceCustomIndex(@CType("uint32_t") int value) { VkAccelerationStructureSRTMotionInstanceNV.set_instanceCustomIndex(this.segment(), value); return this; }

    /// {@return `mask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_mask(MemorySegment segment, long index) { return (int) VH_mask.get(segment, 0L, index); }
    /// {@return `mask`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_mask(MemorySegment segment) { return VkAccelerationStructureSRTMotionInstanceNV.get_mask(segment, 0L); }
    /// {@return `mask`}
    public @CType("uint32_t") int mask() { return VkAccelerationStructureSRTMotionInstanceNV.get_mask(this.segment()); }
    /// Sets `mask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mask(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_mask.set(segment, 0L, index, value); }
    /// Sets `mask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mask(MemorySegment segment, @CType("uint32_t") int value) { VkAccelerationStructureSRTMotionInstanceNV.set_mask(segment, 0L, value); }
    /// Sets `mask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureSRTMotionInstanceNV mask(@CType("uint32_t") int value) { VkAccelerationStructureSRTMotionInstanceNV.set_mask(this.segment(), value); return this; }

    /// {@return `instanceShaderBindingTableRecordOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_instanceShaderBindingTableRecordOffset(MemorySegment segment, long index) { return (int) VH_instanceShaderBindingTableRecordOffset.get(segment, 0L, index); }
    /// {@return `instanceShaderBindingTableRecordOffset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_instanceShaderBindingTableRecordOffset(MemorySegment segment) { return VkAccelerationStructureSRTMotionInstanceNV.get_instanceShaderBindingTableRecordOffset(segment, 0L); }
    /// {@return `instanceShaderBindingTableRecordOffset`}
    public @CType("uint32_t") int instanceShaderBindingTableRecordOffset() { return VkAccelerationStructureSRTMotionInstanceNV.get_instanceShaderBindingTableRecordOffset(this.segment()); }
    /// Sets `instanceShaderBindingTableRecordOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_instanceShaderBindingTableRecordOffset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_instanceShaderBindingTableRecordOffset.set(segment, 0L, index, value); }
    /// Sets `instanceShaderBindingTableRecordOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_instanceShaderBindingTableRecordOffset(MemorySegment segment, @CType("uint32_t") int value) { VkAccelerationStructureSRTMotionInstanceNV.set_instanceShaderBindingTableRecordOffset(segment, 0L, value); }
    /// Sets `instanceShaderBindingTableRecordOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureSRTMotionInstanceNV instanceShaderBindingTableRecordOffset(@CType("uint32_t") int value) { VkAccelerationStructureSRTMotionInstanceNV.set_instanceShaderBindingTableRecordOffset(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkGeometryInstanceFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkGeometryInstanceFlagsKHR") int get_flags(MemorySegment segment) { return VkAccelerationStructureSRTMotionInstanceNV.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkGeometryInstanceFlagsKHR") int flags() { return VkAccelerationStructureSRTMotionInstanceNV.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkGeometryInstanceFlagsKHR") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkGeometryInstanceFlagsKHR") int value) { VkAccelerationStructureSRTMotionInstanceNV.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureSRTMotionInstanceNV flags(@CType("VkGeometryInstanceFlagsKHR") int value) { VkAccelerationStructureSRTMotionInstanceNV.set_flags(this.segment(), value); return this; }

    /// {@return `accelerationStructureReference` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_accelerationStructureReference(MemorySegment segment, long index) { return (long) VH_accelerationStructureReference.get(segment, 0L, index); }
    /// {@return `accelerationStructureReference`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_accelerationStructureReference(MemorySegment segment) { return VkAccelerationStructureSRTMotionInstanceNV.get_accelerationStructureReference(segment, 0L); }
    /// {@return `accelerationStructureReference`}
    public @CType("uint64_t") long accelerationStructureReference() { return VkAccelerationStructureSRTMotionInstanceNV.get_accelerationStructureReference(this.segment()); }
    /// Sets `accelerationStructureReference` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_accelerationStructureReference(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_accelerationStructureReference.set(segment, 0L, index, value); }
    /// Sets `accelerationStructureReference` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_accelerationStructureReference(MemorySegment segment, @CType("uint64_t") long value) { VkAccelerationStructureSRTMotionInstanceNV.set_accelerationStructureReference(segment, 0L, value); }
    /// Sets `accelerationStructureReference` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureSRTMotionInstanceNV accelerationStructureReference(@CType("uint64_t") long value) { VkAccelerationStructureSRTMotionInstanceNV.set_accelerationStructureReference(this.segment(), value); return this; }

    /// A buffer of [VkAccelerationStructureSRTMotionInstanceNV].
    public static final class Buffer extends VkAccelerationStructureSRTMotionInstanceNV {
        private final long elementCount;

        /// Creates `VkAccelerationStructureSRTMotionInstanceNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAccelerationStructureSRTMotionInstanceNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkAccelerationStructureSRTMotionInstanceNV`
        public VkAccelerationStructureSRTMotionInstanceNV asSlice(long index) { return new VkAccelerationStructureSRTMotionInstanceNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAccelerationStructureSRTMotionInstanceNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkAccelerationStructureSRTMotionInstanceNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `transformT0` at the given index}
        /// @param index the index
        public @CType("VkSRTDataNV") MemorySegment transformT0At(long index) { return VkAccelerationStructureSRTMotionInstanceNV.get_transformT0(this.segment(), index); }
        /// Sets `transformT0` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer transformT0At(long index, @CType("VkSRTDataNV") MemorySegment value) { VkAccelerationStructureSRTMotionInstanceNV.set_transformT0(this.segment(), index, value); return this; }

        /// {@return `transformT1` at the given index}
        /// @param index the index
        public @CType("VkSRTDataNV") MemorySegment transformT1At(long index) { return VkAccelerationStructureSRTMotionInstanceNV.get_transformT1(this.segment(), index); }
        /// Sets `transformT1` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer transformT1At(long index, @CType("VkSRTDataNV") MemorySegment value) { VkAccelerationStructureSRTMotionInstanceNV.set_transformT1(this.segment(), index, value); return this; }

        /// {@return `instanceCustomIndex` at the given index}
        /// @param index the index
        public @CType("uint32_t") int instanceCustomIndexAt(long index) { return VkAccelerationStructureSRTMotionInstanceNV.get_instanceCustomIndex(this.segment(), index); }
        /// Sets `instanceCustomIndex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer instanceCustomIndexAt(long index, @CType("uint32_t") int value) { VkAccelerationStructureSRTMotionInstanceNV.set_instanceCustomIndex(this.segment(), index, value); return this; }

        /// {@return `mask` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maskAt(long index) { return VkAccelerationStructureSRTMotionInstanceNV.get_mask(this.segment(), index); }
        /// Sets `mask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maskAt(long index, @CType("uint32_t") int value) { VkAccelerationStructureSRTMotionInstanceNV.set_mask(this.segment(), index, value); return this; }

        /// {@return `instanceShaderBindingTableRecordOffset` at the given index}
        /// @param index the index
        public @CType("uint32_t") int instanceShaderBindingTableRecordOffsetAt(long index) { return VkAccelerationStructureSRTMotionInstanceNV.get_instanceShaderBindingTableRecordOffset(this.segment(), index); }
        /// Sets `instanceShaderBindingTableRecordOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer instanceShaderBindingTableRecordOffsetAt(long index, @CType("uint32_t") int value) { VkAccelerationStructureSRTMotionInstanceNV.set_instanceShaderBindingTableRecordOffset(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkGeometryInstanceFlagsKHR") int flagsAt(long index) { return VkAccelerationStructureSRTMotionInstanceNV.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkGeometryInstanceFlagsKHR") int value) { VkAccelerationStructureSRTMotionInstanceNV.set_flags(this.segment(), index, value); return this; }

        /// {@return `accelerationStructureReference` at the given index}
        /// @param index the index
        public @CType("uint64_t") long accelerationStructureReferenceAt(long index) { return VkAccelerationStructureSRTMotionInstanceNV.get_accelerationStructureReference(this.segment(), index); }
        /// Sets `accelerationStructureReference` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer accelerationStructureReferenceAt(long index, @CType("uint64_t") long value) { VkAccelerationStructureSRTMotionInstanceNV.set_accelerationStructureReference(this.segment(), index, value); return this; }

    }
}

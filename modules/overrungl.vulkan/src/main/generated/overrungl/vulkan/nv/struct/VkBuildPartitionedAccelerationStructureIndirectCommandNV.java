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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkBuildPartitionedAccelerationStructureIndirectCommandNV {
///     (int) VkPartitionedAccelerationStructureOpTypeNV opType;
///     uint32_t argCount;
///     (struct VkStridedDeviceAddressNV) VkStridedDeviceAddressNV argData;
/// };
/// ```
public sealed class VkBuildPartitionedAccelerationStructureIndirectCommandNV extends GroupType {
    /// The struct layout of `VkBuildPartitionedAccelerationStructureIndirectCommandNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("opType"),
        ValueLayout.JAVA_INT.withName("argCount"),
        overrungl.vulkan.nv.struct.VkStridedDeviceAddressNV.LAYOUT.withName("argData")
    );
    /// The byte offset of `opType`.
    public static final long OFFSET_opType = LAYOUT.byteOffset(PathElement.groupElement("opType"));
    /// The memory layout of `opType`.
    public static final MemoryLayout LAYOUT_opType = LAYOUT.select(PathElement.groupElement("opType"));
    /// The [VarHandle] of `opType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_opType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("opType"));
    /// The byte offset of `argCount`.
    public static final long OFFSET_argCount = LAYOUT.byteOffset(PathElement.groupElement("argCount"));
    /// The memory layout of `argCount`.
    public static final MemoryLayout LAYOUT_argCount = LAYOUT.select(PathElement.groupElement("argCount"));
    /// The [VarHandle] of `argCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_argCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("argCount"));
    /// The byte offset of `argData`.
    public static final long OFFSET_argData = LAYOUT.byteOffset(PathElement.groupElement("argData"));
    /// The memory layout of `argData`.
    public static final MemoryLayout LAYOUT_argData = LAYOUT.select(PathElement.groupElement("argData"));

    /// Creates `VkBuildPartitionedAccelerationStructureIndirectCommandNV` with the given segment.
    /// @param segment the memory segment
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBuildPartitionedAccelerationStructureIndirectCommandNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBuildPartitionedAccelerationStructureIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBuildPartitionedAccelerationStructureIndirectCommandNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkBuildPartitionedAccelerationStructureIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBuildPartitionedAccelerationStructureIndirectCommandNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBuildPartitionedAccelerationStructureIndirectCommandNV`
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV alloc(SegmentAllocator allocator) { return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBuildPartitionedAccelerationStructureIndirectCommandNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBuildPartitionedAccelerationStructureIndirectCommandNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkBuildPartitionedAccelerationStructureIndirectCommandNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param opType `opType`
    /// @param argCount `argCount`
    /// @param argData `argData`
    /// @return the allocated `VkBuildPartitionedAccelerationStructureIndirectCommandNV`
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV allocInit(SegmentAllocator allocator, int opType, int argCount, MemorySegment argData) {
        return alloc(allocator).opType(opType).argCount(argCount).argData(argData);
    }

    /// Allocates a `VkBuildPartitionedAccelerationStructureIndirectCommandNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param opType `opType`
    /// @param argCount `argCount`
    /// @return the allocated `VkBuildPartitionedAccelerationStructureIndirectCommandNV`
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV allocInit(SegmentAllocator allocator, int opType, int argCount) {
        return alloc(allocator).opType(opType).argCount(argCount);
    }

    /// Allocates a `VkBuildPartitionedAccelerationStructureIndirectCommandNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param opType `opType`
    /// @return the allocated `VkBuildPartitionedAccelerationStructureIndirectCommandNV`
    public static VkBuildPartitionedAccelerationStructureIndirectCommandNV allocInit(SegmentAllocator allocator, int opType) {
        return alloc(allocator).opType(opType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV copyFrom(VkBuildPartitionedAccelerationStructureIndirectCommandNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `opType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int opType(MemorySegment segment, long index) { return (int) VH_opType.get(segment, 0L, index); }
    /// {@return `opType`}
    public int opType() { return opType(this.segment(), 0L); }
    /// Sets `opType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void opType(MemorySegment segment, long index, int value) { VH_opType.set(segment, 0L, index, value); }
    /// Sets `opType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV opType(int value) { opType(this.segment(), 0L, value); return this; }

    /// {@return `argCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int argCount(MemorySegment segment, long index) { return (int) VH_argCount.get(segment, 0L, index); }
    /// {@return `argCount`}
    public int argCount() { return argCount(this.segment(), 0L); }
    /// Sets `argCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void argCount(MemorySegment segment, long index, int value) { VH_argCount.set(segment, 0L, index, value); }
    /// Sets `argCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV argCount(int value) { argCount(this.segment(), 0L, value); return this; }

    /// {@return `argData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment argData(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_argData, index), LAYOUT_argData); }
    /// {@return `argData`}
    public MemorySegment argData() { return argData(this.segment(), 0L); }
    /// Sets `argData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void argData(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_argData, index), LAYOUT_argData.byteSize()); }
    /// Sets `argData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV argData(MemorySegment value) { argData(this.segment(), 0L, value); return this; }

    /// A buffer of [VkBuildPartitionedAccelerationStructureIndirectCommandNV].
    public static final class Buffer extends VkBuildPartitionedAccelerationStructureIndirectCommandNV {
        private final long elementCount;

        /// Creates `VkBuildPartitionedAccelerationStructureIndirectCommandNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkBuildPartitionedAccelerationStructureIndirectCommandNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkBuildPartitionedAccelerationStructureIndirectCommandNV`
        public VkBuildPartitionedAccelerationStructureIndirectCommandNV asSlice(long index) { return new VkBuildPartitionedAccelerationStructureIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkBuildPartitionedAccelerationStructureIndirectCommandNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkBuildPartitionedAccelerationStructureIndirectCommandNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `opType` at the given index}
        /// @param index the index of the struct buffer
        public int opTypeAt(long index) { return opType(this.segment(), index); }
        /// Sets `opType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer opTypeAt(long index, int value) { opType(this.segment(), index, value); return this; }

        /// {@return `argCount` at the given index}
        /// @param index the index of the struct buffer
        public int argCountAt(long index) { return argCount(this.segment(), index); }
        /// Sets `argCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer argCountAt(long index, int value) { argCount(this.segment(), index, value); return this; }

        /// {@return `argData` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment argDataAt(long index) { return argData(this.segment(), index); }
        /// Sets `argData` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer argDataAt(long index, MemorySegment value) { argData(this.segment(), index, value); return this; }

    }
}

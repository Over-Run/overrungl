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
/// ### accelerationStructureSize
/// [VarHandle][#VH_accelerationStructureSize] - [Getter][#accelerationStructureSize()] - [Setter][#accelerationStructureSize(long)]
/// ### updateScratchSize
/// [VarHandle][#VH_updateScratchSize] - [Getter][#updateScratchSize()] - [Setter][#updateScratchSize(long)]
/// ### buildScratchSize
/// [VarHandle][#VH_buildScratchSize] - [Getter][#buildScratchSize()] - [Setter][#buildScratchSize(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAccelerationStructureBuildSizesInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkDeviceSize accelerationStructureSize;
///     VkDeviceSize updateScratchSize;
///     VkDeviceSize buildScratchSize;
/// } VkAccelerationStructureBuildSizesInfoKHR;
/// ```
public sealed class VkAccelerationStructureBuildSizesInfoKHR extends Struct {
    /// The struct layout of `VkAccelerationStructureBuildSizesInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("accelerationStructureSize"),
        ValueLayout.JAVA_LONG.withName("updateScratchSize"),
        ValueLayout.JAVA_LONG.withName("buildScratchSize")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `accelerationStructureSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_accelerationStructureSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("accelerationStructureSize"));
    /// The [VarHandle] of `updateScratchSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_updateScratchSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("updateScratchSize"));
    /// The [VarHandle] of `buildScratchSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_buildScratchSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buildScratchSize"));

    /// Creates `VkAccelerationStructureBuildSizesInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkAccelerationStructureBuildSizesInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAccelerationStructureBuildSizesInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureBuildSizesInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureBuildSizesInfoKHR(segment); }

    /// Creates `VkAccelerationStructureBuildSizesInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureBuildSizesInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureBuildSizesInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureBuildSizesInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAccelerationStructureBuildSizesInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkAccelerationStructureBuildSizesInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureBuildSizesInfoKHR`
    public static VkAccelerationStructureBuildSizesInfoKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureBuildSizesInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAccelerationStructureBuildSizesInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureBuildSizesInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAccelerationStructureBuildSizesInfoKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureBuildSizesInfoKHR`
    public static VkAccelerationStructureBuildSizesInfoKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkDeviceSize") long accelerationStructureSize, @CType("VkDeviceSize") long updateScratchSize, @CType("VkDeviceSize") long buildScratchSize) { return alloc(allocator).sType(sType).pNext(pNext).accelerationStructureSize(accelerationStructureSize).updateScratchSize(updateScratchSize).buildScratchSize(buildScratchSize); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureBuildSizesInfoKHR copyFrom(VkAccelerationStructureBuildSizesInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkAccelerationStructureBuildSizesInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkAccelerationStructureBuildSizesInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkAccelerationStructureBuildSizesInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildSizesInfoKHR sType(@CType("VkStructureType") int value) { VkAccelerationStructureBuildSizesInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkAccelerationStructureBuildSizesInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkAccelerationStructureBuildSizesInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureBuildSizesInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildSizesInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureBuildSizesInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `accelerationStructureSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_accelerationStructureSize(MemorySegment segment, long index) { return (long) VH_accelerationStructureSize.get(segment, 0L, index); }
    /// {@return `accelerationStructureSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_accelerationStructureSize(MemorySegment segment) { return VkAccelerationStructureBuildSizesInfoKHR.get_accelerationStructureSize(segment, 0L); }
    /// {@return `accelerationStructureSize`}
    public @CType("VkDeviceSize") long accelerationStructureSize() { return VkAccelerationStructureBuildSizesInfoKHR.get_accelerationStructureSize(this.segment()); }
    /// Sets `accelerationStructureSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_accelerationStructureSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_accelerationStructureSize.set(segment, 0L, index, value); }
    /// Sets `accelerationStructureSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_accelerationStructureSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkAccelerationStructureBuildSizesInfoKHR.set_accelerationStructureSize(segment, 0L, value); }
    /// Sets `accelerationStructureSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildSizesInfoKHR accelerationStructureSize(@CType("VkDeviceSize") long value) { VkAccelerationStructureBuildSizesInfoKHR.set_accelerationStructureSize(this.segment(), value); return this; }

    /// {@return `updateScratchSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_updateScratchSize(MemorySegment segment, long index) { return (long) VH_updateScratchSize.get(segment, 0L, index); }
    /// {@return `updateScratchSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_updateScratchSize(MemorySegment segment) { return VkAccelerationStructureBuildSizesInfoKHR.get_updateScratchSize(segment, 0L); }
    /// {@return `updateScratchSize`}
    public @CType("VkDeviceSize") long updateScratchSize() { return VkAccelerationStructureBuildSizesInfoKHR.get_updateScratchSize(this.segment()); }
    /// Sets `updateScratchSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_updateScratchSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_updateScratchSize.set(segment, 0L, index, value); }
    /// Sets `updateScratchSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_updateScratchSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkAccelerationStructureBuildSizesInfoKHR.set_updateScratchSize(segment, 0L, value); }
    /// Sets `updateScratchSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildSizesInfoKHR updateScratchSize(@CType("VkDeviceSize") long value) { VkAccelerationStructureBuildSizesInfoKHR.set_updateScratchSize(this.segment(), value); return this; }

    /// {@return `buildScratchSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_buildScratchSize(MemorySegment segment, long index) { return (long) VH_buildScratchSize.get(segment, 0L, index); }
    /// {@return `buildScratchSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_buildScratchSize(MemorySegment segment) { return VkAccelerationStructureBuildSizesInfoKHR.get_buildScratchSize(segment, 0L); }
    /// {@return `buildScratchSize`}
    public @CType("VkDeviceSize") long buildScratchSize() { return VkAccelerationStructureBuildSizesInfoKHR.get_buildScratchSize(this.segment()); }
    /// Sets `buildScratchSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_buildScratchSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_buildScratchSize.set(segment, 0L, index, value); }
    /// Sets `buildScratchSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_buildScratchSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkAccelerationStructureBuildSizesInfoKHR.set_buildScratchSize(segment, 0L, value); }
    /// Sets `buildScratchSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureBuildSizesInfoKHR buildScratchSize(@CType("VkDeviceSize") long value) { VkAccelerationStructureBuildSizesInfoKHR.set_buildScratchSize(this.segment(), value); return this; }

    /// A buffer of [VkAccelerationStructureBuildSizesInfoKHR].
    public static final class Buffer extends VkAccelerationStructureBuildSizesInfoKHR {
        private final long elementCount;

        /// Creates `VkAccelerationStructureBuildSizesInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAccelerationStructureBuildSizesInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkAccelerationStructureBuildSizesInfoKHR`
        public VkAccelerationStructureBuildSizesInfoKHR asSlice(long index) { return new VkAccelerationStructureBuildSizesInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAccelerationStructureBuildSizesInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkAccelerationStructureBuildSizesInfoKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkAccelerationStructureBuildSizesInfoKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkAccelerationStructureBuildSizesInfoKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkAccelerationStructureBuildSizesInfoKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureBuildSizesInfoKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `accelerationStructureSize` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long accelerationStructureSizeAt(long index) { return VkAccelerationStructureBuildSizesInfoKHR.get_accelerationStructureSize(this.segment(), index); }
        /// Sets `accelerationStructureSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer accelerationStructureSizeAt(long index, @CType("VkDeviceSize") long value) { VkAccelerationStructureBuildSizesInfoKHR.set_accelerationStructureSize(this.segment(), index, value); return this; }

        /// {@return `updateScratchSize` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long updateScratchSizeAt(long index) { return VkAccelerationStructureBuildSizesInfoKHR.get_updateScratchSize(this.segment(), index); }
        /// Sets `updateScratchSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer updateScratchSizeAt(long index, @CType("VkDeviceSize") long value) { VkAccelerationStructureBuildSizesInfoKHR.set_updateScratchSize(this.segment(), index, value); return this; }

        /// {@return `buildScratchSize` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long buildScratchSizeAt(long index) { return VkAccelerationStructureBuildSizesInfoKHR.get_buildScratchSize(this.segment(), index); }
        /// Sets `buildScratchSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer buildScratchSizeAt(long index, @CType("VkDeviceSize") long value) { VkAccelerationStructureBuildSizesInfoKHR.set_buildScratchSize(this.segment(), index, value); return this; }

    }
}

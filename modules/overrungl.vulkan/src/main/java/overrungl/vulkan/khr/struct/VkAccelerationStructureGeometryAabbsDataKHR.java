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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### data
/// [Byte offset][#OFFSET_data] - [Memory layout][#ML_data] - [Getter][#data()] - [Setter][#data(MemorySegment)]
/// ### stride
/// [VarHandle][#VH_stride] - [Getter][#stride()] - [Setter][#stride(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAccelerationStructureGeometryAabbsDataKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkDeviceOrHostAddressConstKHR data;
///     VkDeviceSize stride;
/// } VkAccelerationStructureGeometryAabbsDataKHR;
/// ```
public sealed class VkAccelerationStructureGeometryAabbsDataKHR extends Struct {
    /// The struct layout of `VkAccelerationStructureGeometryAabbsDataKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("data"),
        ValueLayout.JAVA_LONG.withName("stride")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `data`.
    public static final long OFFSET_data = LAYOUT.byteOffset(PathElement.groupElement("data"));
    /// The memory layout of `data`.
    public static final MemoryLayout ML_data = LAYOUT.select(PathElement.groupElement("data"));
    /// The [VarHandle] of `stride` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_stride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stride"));

    /// Creates `VkAccelerationStructureGeometryAabbsDataKHR` with the given segment.
    /// @param segment the memory segment
    public VkAccelerationStructureGeometryAabbsDataKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAccelerationStructureGeometryAabbsDataKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureGeometryAabbsDataKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryAabbsDataKHR(segment); }

    /// Creates `VkAccelerationStructureGeometryAabbsDataKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureGeometryAabbsDataKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureGeometryAabbsDataKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryAabbsDataKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAccelerationStructureGeometryAabbsDataKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkAccelerationStructureGeometryAabbsDataKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureGeometryAabbsDataKHR`
    public static VkAccelerationStructureGeometryAabbsDataKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureGeometryAabbsDataKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAccelerationStructureGeometryAabbsDataKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureGeometryAabbsDataKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAccelerationStructureGeometryAabbsDataKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureGeometryAabbsDataKHR`
    public static VkAccelerationStructureGeometryAabbsDataKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment data, @CType("VkDeviceSize") long stride) { return alloc(allocator).sType(sType).pNext(pNext).data(data).stride(stride); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureGeometryAabbsDataKHR copyFrom(VkAccelerationStructureGeometryAabbsDataKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkAccelerationStructureGeometryAabbsDataKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkAccelerationStructureGeometryAabbsDataKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkAccelerationStructureGeometryAabbsDataKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryAabbsDataKHR sType(@CType("VkStructureType") int value) { VkAccelerationStructureGeometryAabbsDataKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkAccelerationStructureGeometryAabbsDataKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkAccelerationStructureGeometryAabbsDataKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkAccelerationStructureGeometryAabbsDataKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryAabbsDataKHR pNext(@CType("const void *") MemorySegment value) { VkAccelerationStructureGeometryAabbsDataKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `data` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceOrHostAddressConstKHR") MemorySegment get_data(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_data, index), ML_data); }
    /// {@return `data`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceOrHostAddressConstKHR") MemorySegment get_data(MemorySegment segment) { return VkAccelerationStructureGeometryAabbsDataKHR.get_data(segment, 0L); }
    /// {@return `data`}
    public @CType("VkDeviceOrHostAddressConstKHR") MemorySegment data() { return VkAccelerationStructureGeometryAabbsDataKHR.get_data(this.segment()); }
    /// Sets `data` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_data(MemorySegment segment, long index, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_data, index), ML_data.byteSize()); }
    /// Sets `data` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_data(MemorySegment segment, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { VkAccelerationStructureGeometryAabbsDataKHR.set_data(segment, 0L, value); }
    /// Sets `data` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryAabbsDataKHR data(@CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { VkAccelerationStructureGeometryAabbsDataKHR.set_data(this.segment(), value); return this; }

    /// {@return `stride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_stride(MemorySegment segment, long index) { return (long) VH_stride.get(segment, 0L, index); }
    /// {@return `stride`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_stride(MemorySegment segment) { return VkAccelerationStructureGeometryAabbsDataKHR.get_stride(segment, 0L); }
    /// {@return `stride`}
    public @CType("VkDeviceSize") long stride() { return VkAccelerationStructureGeometryAabbsDataKHR.get_stride(this.segment()); }
    /// Sets `stride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stride(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_stride.set(segment, 0L, index, value); }
    /// Sets `stride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stride(MemorySegment segment, @CType("VkDeviceSize") long value) { VkAccelerationStructureGeometryAabbsDataKHR.set_stride(segment, 0L, value); }
    /// Sets `stride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryAabbsDataKHR stride(@CType("VkDeviceSize") long value) { VkAccelerationStructureGeometryAabbsDataKHR.set_stride(this.segment(), value); return this; }

    /// A buffer of [VkAccelerationStructureGeometryAabbsDataKHR].
    public static final class Buffer extends VkAccelerationStructureGeometryAabbsDataKHR {
        private final long elementCount;

        /// Creates `VkAccelerationStructureGeometryAabbsDataKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAccelerationStructureGeometryAabbsDataKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkAccelerationStructureGeometryAabbsDataKHR`
        public VkAccelerationStructureGeometryAabbsDataKHR asSlice(long index) { return new VkAccelerationStructureGeometryAabbsDataKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAccelerationStructureGeometryAabbsDataKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkAccelerationStructureGeometryAabbsDataKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkAccelerationStructureGeometryAabbsDataKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkAccelerationStructureGeometryAabbsDataKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkAccelerationStructureGeometryAabbsDataKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkAccelerationStructureGeometryAabbsDataKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `data` at the given index}
        /// @param index the index
        public @CType("VkDeviceOrHostAddressConstKHR") MemorySegment dataAt(long index) { return VkAccelerationStructureGeometryAabbsDataKHR.get_data(this.segment(), index); }
        /// Sets `data` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dataAt(long index, @CType("VkDeviceOrHostAddressConstKHR") MemorySegment value) { VkAccelerationStructureGeometryAabbsDataKHR.set_data(this.segment(), index, value); return this; }

        /// {@return `stride` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long strideAt(long index) { return VkAccelerationStructureGeometryAabbsDataKHR.get_stride(this.segment(), index); }
        /// Sets `stride` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer strideAt(long index, @CType("VkDeviceSize") long value) { VkAccelerationStructureGeometryAabbsDataKHR.set_stride(this.segment(), index, value); return this; }

    }
}

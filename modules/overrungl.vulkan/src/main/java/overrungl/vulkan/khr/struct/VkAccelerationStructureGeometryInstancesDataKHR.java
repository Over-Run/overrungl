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
/// ### arrayOfPointers
/// [VarHandle][#VH_arrayOfPointers] - [Getter][#arrayOfPointers()] - [Setter][#arrayOfPointers(int)]
/// ### data
/// [Byte offset][#OFFSET_data] - [Memory layout][#ML_data] - [Getter][#data()] - [Setter][#data(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkAccelerationStructureGeometryInstancesDataKHR {
///     VkStructureType sType;
///     const void * pNext;
///     VkBool32 arrayOfPointers;
///     VkDeviceOrHostAddressConstKHR data;
/// } VkAccelerationStructureGeometryInstancesDataKHR;
/// ```
public sealed class VkAccelerationStructureGeometryInstancesDataKHR extends Struct {
    /// The struct layout of `VkAccelerationStructureGeometryInstancesDataKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("arrayOfPointers"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("data")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `arrayOfPointers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_arrayOfPointers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("arrayOfPointers"));
    /// The byte offset of `data`.
    public static final long OFFSET_data = LAYOUT.byteOffset(PathElement.groupElement("data"));
    /// The memory layout of `data`.
    public static final MemoryLayout ML_data = LAYOUT.select(PathElement.groupElement("data"));

    /// Creates `VkAccelerationStructureGeometryInstancesDataKHR` with the given segment.
    /// @param segment the memory segment
    public VkAccelerationStructureGeometryInstancesDataKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkAccelerationStructureGeometryInstancesDataKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureGeometryInstancesDataKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryInstancesDataKHR(segment); }

    /// Creates `VkAccelerationStructureGeometryInstancesDataKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureGeometryInstancesDataKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureGeometryInstancesDataKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryInstancesDataKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkAccelerationStructureGeometryInstancesDataKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkAccelerationStructureGeometryInstancesDataKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureGeometryInstancesDataKHR`
    public static VkAccelerationStructureGeometryInstancesDataKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureGeometryInstancesDataKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkAccelerationStructureGeometryInstancesDataKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureGeometryInstancesDataKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAccelerationStructureGeometryInstancesDataKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureGeometryInstancesDataKHR`
    public static VkAccelerationStructureGeometryInstancesDataKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkBool32") int arrayOfPointers, @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment data) { return alloc(allocator).sType(sType).pNext(pNext).arrayOfPointers(arrayOfPointers).data(data); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureGeometryInstancesDataKHR copyFrom(VkAccelerationStructureGeometryInstancesDataKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkAccelerationStructureGeometryInstancesDataKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkAccelerationStructureGeometryInstancesDataKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkAccelerationStructureGeometryInstancesDataKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryInstancesDataKHR sType(@CType("VkStructureType") int value) { VkAccelerationStructureGeometryInstancesDataKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkAccelerationStructureGeometryInstancesDataKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkAccelerationStructureGeometryInstancesDataKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureGeometryInstancesDataKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryInstancesDataKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureGeometryInstancesDataKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `arrayOfPointers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_arrayOfPointers(MemorySegment segment, long index) { return (int) VH_arrayOfPointers.get(segment, 0L, index); }
    /// {@return `arrayOfPointers`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_arrayOfPointers(MemorySegment segment) { return VkAccelerationStructureGeometryInstancesDataKHR.get_arrayOfPointers(segment, 0L); }
    /// {@return `arrayOfPointers`}
    public @CType("VkBool32") int arrayOfPointers() { return VkAccelerationStructureGeometryInstancesDataKHR.get_arrayOfPointers(this.segment()); }
    /// Sets `arrayOfPointers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_arrayOfPointers(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_arrayOfPointers.set(segment, 0L, index, value); }
    /// Sets `arrayOfPointers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_arrayOfPointers(MemorySegment segment, @CType("VkBool32") int value) { VkAccelerationStructureGeometryInstancesDataKHR.set_arrayOfPointers(segment, 0L, value); }
    /// Sets `arrayOfPointers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryInstancesDataKHR arrayOfPointers(@CType("VkBool32") int value) { VkAccelerationStructureGeometryInstancesDataKHR.set_arrayOfPointers(this.segment(), value); return this; }

    /// {@return `data` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment get_data(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_data, index), ML_data); }
    /// {@return `data`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment get_data(MemorySegment segment) { return VkAccelerationStructureGeometryInstancesDataKHR.get_data(segment, 0L); }
    /// {@return `data`}
    public @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment data() { return VkAccelerationStructureGeometryInstancesDataKHR.get_data(this.segment()); }
    /// Sets `data` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_data(MemorySegment segment, long index, @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_data, index), ML_data.byteSize()); }
    /// Sets `data` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_data(MemorySegment segment, @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureGeometryInstancesDataKHR.set_data(segment, 0L, value); }
    /// Sets `data` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryInstancesDataKHR data(@CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureGeometryInstancesDataKHR.set_data(this.segment(), value); return this; }

    /// A buffer of [VkAccelerationStructureGeometryInstancesDataKHR].
    public static final class Buffer extends VkAccelerationStructureGeometryInstancesDataKHR {
        private final long elementCount;

        /// Creates `VkAccelerationStructureGeometryInstancesDataKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkAccelerationStructureGeometryInstancesDataKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkAccelerationStructureGeometryInstancesDataKHR`
        public VkAccelerationStructureGeometryInstancesDataKHR asSlice(long index) { return new VkAccelerationStructureGeometryInstancesDataKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkAccelerationStructureGeometryInstancesDataKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkAccelerationStructureGeometryInstancesDataKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkAccelerationStructureGeometryInstancesDataKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkAccelerationStructureGeometryInstancesDataKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkAccelerationStructureGeometryInstancesDataKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkAccelerationStructureGeometryInstancesDataKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `arrayOfPointers` at the given index}
        /// @param index the index
        public @CType("VkBool32") int arrayOfPointersAt(long index) { return VkAccelerationStructureGeometryInstancesDataKHR.get_arrayOfPointers(this.segment(), index); }
        /// Sets `arrayOfPointers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer arrayOfPointersAt(long index, @CType("VkBool32") int value) { VkAccelerationStructureGeometryInstancesDataKHR.set_arrayOfPointers(this.segment(), index, value); return this; }

        /// {@return `data` at the given index}
        /// @param index the index
        public @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment dataAt(long index) { return VkAccelerationStructureGeometryInstancesDataKHR.get_data(this.segment(), index); }
        /// Sets `data` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dataAt(long index, @CType("VkDeviceOrHostAddressConstKHR") java.lang.foreign.MemorySegment value) { VkAccelerationStructureGeometryInstancesDataKHR.set_data(this.segment(), index, value); return this; }

    }
}

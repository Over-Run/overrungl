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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkAccelerationStructureGeometryInstancesDataKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint32_t) VkBool32 arrayOfPointers;
///     (union VkDeviceOrHostAddressConstKHR) VkDeviceOrHostAddressConstKHR data;
/// };
/// ```
public final class VkAccelerationStructureGeometryInstancesDataKHR extends GroupType {
    /// The struct layout of `VkAccelerationStructureGeometryInstancesDataKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("arrayOfPointers"),
        overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.LAYOUT.withName("data")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `arrayOfPointers`.
    public static final long OFFSET_arrayOfPointers = LAYOUT.byteOffset(PathElement.groupElement("arrayOfPointers"));
    /// The memory layout of `arrayOfPointers`.
    public static final MemoryLayout LAYOUT_arrayOfPointers = LAYOUT.select(PathElement.groupElement("arrayOfPointers"));
    /// The [VarHandle] of `arrayOfPointers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_arrayOfPointers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("arrayOfPointers"));
    /// The byte offset of `data`.
    public static final long OFFSET_data = LAYOUT.byteOffset(PathElement.groupElement("data"));
    /// The memory layout of `data`.
    public static final MemoryLayout LAYOUT_data = LAYOUT.select(PathElement.groupElement("data"));

    /// Creates `VkAccelerationStructureGeometryInstancesDataKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkAccelerationStructureGeometryInstancesDataKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkAccelerationStructureGeometryInstancesDataKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureGeometryInstancesDataKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryInstancesDataKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAccelerationStructureGeometryInstancesDataKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureGeometryInstancesDataKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryInstancesDataKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkAccelerationStructureGeometryInstancesDataKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAccelerationStructureGeometryInstancesDataKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAccelerationStructureGeometryInstancesDataKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAccelerationStructureGeometryInstancesDataKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAccelerationStructureGeometryInstancesDataKHR`
    public static VkAccelerationStructureGeometryInstancesDataKHR alloc(SegmentAllocator allocator) { return new VkAccelerationStructureGeometryInstancesDataKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkAccelerationStructureGeometryInstancesDataKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAccelerationStructureGeometryInstancesDataKHR`
    public static VkAccelerationStructureGeometryInstancesDataKHR alloc(SegmentAllocator allocator, long count) { return new VkAccelerationStructureGeometryInstancesDataKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkAccelerationStructureGeometryInstancesDataKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param arrayOfPointers `arrayOfPointers`
    /// @param data `data`
    /// @return the allocated `VkAccelerationStructureGeometryInstancesDataKHR`
    public static VkAccelerationStructureGeometryInstancesDataKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int arrayOfPointers, MemorySegment data) {
        return alloc(allocator).sType(sType).pNext(pNext).arrayOfPointers(arrayOfPointers).data(data);
    }

    /// Allocates a `VkAccelerationStructureGeometryInstancesDataKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param arrayOfPointers `arrayOfPointers`
    /// @return the allocated `VkAccelerationStructureGeometryInstancesDataKHR`
    public static VkAccelerationStructureGeometryInstancesDataKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int arrayOfPointers) {
        return alloc(allocator).sType(sType).pNext(pNext).arrayOfPointers(arrayOfPointers);
    }

    /// Allocates a `VkAccelerationStructureGeometryInstancesDataKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkAccelerationStructureGeometryInstancesDataKHR`
    public static VkAccelerationStructureGeometryInstancesDataKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkAccelerationStructureGeometryInstancesDataKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkAccelerationStructureGeometryInstancesDataKHR`
    public static VkAccelerationStructureGeometryInstancesDataKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAccelerationStructureGeometryInstancesDataKHR copyFrom(VkAccelerationStructureGeometryInstancesDataKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkAccelerationStructureGeometryInstancesDataKHR reinterpret(long count) { return new VkAccelerationStructureGeometryInstancesDataKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryInstancesDataKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryInstancesDataKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `arrayOfPointers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int arrayOfPointers(MemorySegment segment, long index) { return (int) VH_arrayOfPointers.get(segment, 0L, index); }
    /// {@return `arrayOfPointers`}
    public int arrayOfPointers() { return arrayOfPointers(this.segment(), 0L); }
    /// Sets `arrayOfPointers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void arrayOfPointers(MemorySegment segment, long index, int value) { VH_arrayOfPointers.set(segment, 0L, index, value); }
    /// Sets `arrayOfPointers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryInstancesDataKHR arrayOfPointers(int value) { arrayOfPointers(this.segment(), 0L, value); return this; }

    /// {@return `data` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment data(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_data, index), LAYOUT_data); }
    /// {@return `data`}
    public MemorySegment data() { return data(this.segment(), 0L); }
    /// Sets `data` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void data(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_data, index), LAYOUT_data.byteSize()); }
    /// Sets `data` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryInstancesDataKHR data(MemorySegment value) { data(this.segment(), 0L, value); return this; }
    /// Accepts `data` with the given function.
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureGeometryInstancesDataKHR data(Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(data())); return this; }

    /// Creates a slice of `VkAccelerationStructureGeometryInstancesDataKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAccelerationStructureGeometryInstancesDataKHR`
    public VkAccelerationStructureGeometryInstancesDataKHR asSlice(long index) { return new VkAccelerationStructureGeometryInstancesDataKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkAccelerationStructureGeometryInstancesDataKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAccelerationStructureGeometryInstancesDataKHR`
    public VkAccelerationStructureGeometryInstancesDataKHR asSlice(long index, long count) { return new VkAccelerationStructureGeometryInstancesDataKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkAccelerationStructureGeometryInstancesDataKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkAccelerationStructureGeometryInstancesDataKHR at(long index, Consumer<VkAccelerationStructureGeometryInstancesDataKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryInstancesDataKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryInstancesDataKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `arrayOfPointers` at the given index}
    /// @param index the index of the struct buffer
    public int arrayOfPointersAt(long index) { return arrayOfPointers(this.segment(), index); }
    /// Sets `arrayOfPointers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryInstancesDataKHR arrayOfPointersAt(long index, int value) { arrayOfPointers(this.segment(), index, value); return this; }

    /// {@return `data` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment dataAt(long index) { return data(this.segment(), index); }
    /// Sets `data` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAccelerationStructureGeometryInstancesDataKHR dataAt(long index, MemorySegment value) { data(this.segment(), index, value); return this; }
    /// Accepts `data` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkAccelerationStructureGeometryInstancesDataKHR dataAt(long index, Consumer<overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR> func) { func.accept(overrungl.vulkan.khr.union.VkDeviceOrHostAddressConstKHR.of(dataAt(index))); return this; }

}

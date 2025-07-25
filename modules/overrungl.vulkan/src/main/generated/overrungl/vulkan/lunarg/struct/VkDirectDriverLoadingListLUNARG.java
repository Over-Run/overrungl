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
package overrungl.vulkan.lunarg.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkDirectDriverLoadingListLUNARG {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkDirectDriverLoadingModeLUNARG mode;
///     uint32_t driverCount;
///     const VkDirectDriverLoadingInfoLUNARG* pDrivers;
/// };
/// ```
public final class VkDirectDriverLoadingListLUNARG extends GroupType {
    /// The struct layout of `VkDirectDriverLoadingListLUNARG`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("mode"),
        ValueLayout.JAVA_INT.withName("driverCount"),
        ValueLayout.ADDRESS.withName("pDrivers")
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
    /// The byte offset of `mode`.
    public static final long OFFSET_mode = LAYOUT.byteOffset(PathElement.groupElement("mode"));
    /// The memory layout of `mode`.
    public static final MemoryLayout LAYOUT_mode = LAYOUT.select(PathElement.groupElement("mode"));
    /// The [VarHandle] of `mode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_mode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mode"));
    /// The byte offset of `driverCount`.
    public static final long OFFSET_driverCount = LAYOUT.byteOffset(PathElement.groupElement("driverCount"));
    /// The memory layout of `driverCount`.
    public static final MemoryLayout LAYOUT_driverCount = LAYOUT.select(PathElement.groupElement("driverCount"));
    /// The [VarHandle] of `driverCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_driverCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("driverCount"));
    /// The byte offset of `pDrivers`.
    public static final long OFFSET_pDrivers = LAYOUT.byteOffset(PathElement.groupElement("pDrivers"));
    /// The memory layout of `pDrivers`.
    public static final MemoryLayout LAYOUT_pDrivers = LAYOUT.select(PathElement.groupElement("pDrivers"));
    /// The [VarHandle] of `pDrivers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDrivers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDrivers"));

    /// Creates `VkDirectDriverLoadingListLUNARG` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkDirectDriverLoadingListLUNARG(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkDirectDriverLoadingListLUNARG` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDirectDriverLoadingListLUNARG of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDirectDriverLoadingListLUNARG(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkDirectDriverLoadingListLUNARG` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDirectDriverLoadingListLUNARG ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkDirectDriverLoadingListLUNARG(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkDirectDriverLoadingListLUNARG` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDirectDriverLoadingListLUNARG ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkDirectDriverLoadingListLUNARG(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkDirectDriverLoadingListLUNARG` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDirectDriverLoadingListLUNARG`
    public static VkDirectDriverLoadingListLUNARG alloc(SegmentAllocator allocator) { return new VkDirectDriverLoadingListLUNARG(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkDirectDriverLoadingListLUNARG` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDirectDriverLoadingListLUNARG`
    public static VkDirectDriverLoadingListLUNARG alloc(SegmentAllocator allocator, long count) { return new VkDirectDriverLoadingListLUNARG(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkDirectDriverLoadingListLUNARG` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param mode `mode`
    /// @param driverCount `driverCount`
    /// @param pDrivers `pDrivers`
    /// @return the allocated `VkDirectDriverLoadingListLUNARG`
    public static VkDirectDriverLoadingListLUNARG allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int mode, int driverCount, MemorySegment pDrivers) {
        return alloc(allocator).sType(sType).pNext(pNext).mode(mode).driverCount(driverCount).pDrivers(pDrivers);
    }

    /// Allocates a `VkDirectDriverLoadingListLUNARG` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param mode `mode`
    /// @param driverCount `driverCount`
    /// @return the allocated `VkDirectDriverLoadingListLUNARG`
    public static VkDirectDriverLoadingListLUNARG allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int mode, int driverCount) {
        return alloc(allocator).sType(sType).pNext(pNext).mode(mode).driverCount(driverCount);
    }

    /// Allocates a `VkDirectDriverLoadingListLUNARG` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param mode `mode`
    /// @return the allocated `VkDirectDriverLoadingListLUNARG`
    public static VkDirectDriverLoadingListLUNARG allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int mode) {
        return alloc(allocator).sType(sType).pNext(pNext).mode(mode);
    }

    /// Allocates a `VkDirectDriverLoadingListLUNARG` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkDirectDriverLoadingListLUNARG`
    public static VkDirectDriverLoadingListLUNARG allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkDirectDriverLoadingListLUNARG` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkDirectDriverLoadingListLUNARG`
    public static VkDirectDriverLoadingListLUNARG allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkDirectDriverLoadingListLUNARG copyFrom(VkDirectDriverLoadingListLUNARG src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkDirectDriverLoadingListLUNARG reinterpret(long count) { return new VkDirectDriverLoadingListLUNARG(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkDirectDriverLoadingListLUNARG sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkDirectDriverLoadingListLUNARG pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `mode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int mode(MemorySegment segment, long index) { return (int) VH_mode.get(segment, 0L, index); }
    /// {@return `mode`}
    public int mode() { return mode(this.segment(), 0L); }
    /// Sets `mode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void mode(MemorySegment segment, long index, int value) { VH_mode.set(segment, 0L, index, value); }
    /// Sets `mode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingListLUNARG mode(int value) { mode(this.segment(), 0L, value); return this; }

    /// {@return `driverCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int driverCount(MemorySegment segment, long index) { return (int) VH_driverCount.get(segment, 0L, index); }
    /// {@return `driverCount`}
    public int driverCount() { return driverCount(this.segment(), 0L); }
    /// Sets `driverCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void driverCount(MemorySegment segment, long index, int value) { VH_driverCount.set(segment, 0L, index, value); }
    /// Sets `driverCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingListLUNARG driverCount(int value) { driverCount(this.segment(), 0L, value); return this; }

    /// {@return `pDrivers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDrivers(MemorySegment segment, long index) { return (MemorySegment) VH_pDrivers.get(segment, 0L, index); }
    /// {@return `pDrivers`}
    public MemorySegment pDrivers() { return pDrivers(this.segment(), 0L); }
    /// Sets `pDrivers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDrivers(MemorySegment segment, long index, MemorySegment value) { VH_pDrivers.set(segment, 0L, index, value); }
    /// Sets `pDrivers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingListLUNARG pDrivers(MemorySegment value) { pDrivers(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkDirectDriverLoadingListLUNARG`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDirectDriverLoadingListLUNARG`
    public VkDirectDriverLoadingListLUNARG asSlice(long index) { return new VkDirectDriverLoadingListLUNARG(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkDirectDriverLoadingListLUNARG`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDirectDriverLoadingListLUNARG`
    public VkDirectDriverLoadingListLUNARG asSlice(long index, long count) { return new VkDirectDriverLoadingListLUNARG(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkDirectDriverLoadingListLUNARG` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkDirectDriverLoadingListLUNARG at(long index, Consumer<VkDirectDriverLoadingListLUNARG> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingListLUNARG sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingListLUNARG pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `mode` at the given index}
    /// @param index the index of the struct buffer
    public int modeAt(long index) { return mode(this.segment(), index); }
    /// Sets `mode` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingListLUNARG modeAt(long index, int value) { mode(this.segment(), index, value); return this; }

    /// {@return `driverCount` at the given index}
    /// @param index the index of the struct buffer
    public int driverCountAt(long index) { return driverCount(this.segment(), index); }
    /// Sets `driverCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingListLUNARG driverCountAt(long index, int value) { driverCount(this.segment(), index, value); return this; }

    /// {@return `pDrivers` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDriversAt(long index) { return pDrivers(this.segment(), index); }
    /// Sets `pDrivers` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkDirectDriverLoadingListLUNARG pDriversAt(long index, MemorySegment value) { pDrivers(this.segment(), index, value); return this; }

}

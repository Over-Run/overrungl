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
package overrungl.vulkan.arm.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceSchedulingControlsFeaturesARM {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 schedulingControls;
/// };
/// ```
public final class VkPhysicalDeviceSchedulingControlsFeaturesARM extends GroupType {
    /// The struct layout of `VkPhysicalDeviceSchedulingControlsFeaturesARM`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("schedulingControls")
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
    /// The byte offset of `schedulingControls`.
    public static final long OFFSET_schedulingControls = LAYOUT.byteOffset(PathElement.groupElement("schedulingControls"));
    /// The memory layout of `schedulingControls`.
    public static final MemoryLayout LAYOUT_schedulingControls = LAYOUT.select(PathElement.groupElement("schedulingControls"));
    /// The [VarHandle] of `schedulingControls` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_schedulingControls = LAYOUT.arrayElementVarHandle(PathElement.groupElement("schedulingControls"));

    /// Creates `VkPhysicalDeviceSchedulingControlsFeaturesARM` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceSchedulingControlsFeaturesARM(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceSchedulingControlsFeaturesARM` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSchedulingControlsFeaturesARM(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceSchedulingControlsFeaturesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSchedulingControlsFeaturesARM(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceSchedulingControlsFeaturesARM` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceSchedulingControlsFeaturesARM(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceSchedulingControlsFeaturesARM` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceSchedulingControlsFeaturesARM`
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceSchedulingControlsFeaturesARM(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceSchedulingControlsFeaturesARM` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceSchedulingControlsFeaturesARM`
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceSchedulingControlsFeaturesARM(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceSchedulingControlsFeaturesARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param schedulingControls `schedulingControls`
    /// @return the allocated `VkPhysicalDeviceSchedulingControlsFeaturesARM`
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int schedulingControls) {
        return alloc(allocator).sType(sType).pNext(pNext).schedulingControls(schedulingControls);
    }

    /// Allocates a `VkPhysicalDeviceSchedulingControlsFeaturesARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceSchedulingControlsFeaturesARM`
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceSchedulingControlsFeaturesARM` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceSchedulingControlsFeaturesARM`
    public static VkPhysicalDeviceSchedulingControlsFeaturesARM allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceSchedulingControlsFeaturesARM copyFrom(VkPhysicalDeviceSchedulingControlsFeaturesARM src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceSchedulingControlsFeaturesARM reinterpret(long count) { return new VkPhysicalDeviceSchedulingControlsFeaturesARM(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceSchedulingControlsFeaturesARM sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceSchedulingControlsFeaturesARM pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `schedulingControls` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int schedulingControls(MemorySegment segment, long index) { return (int) VH_schedulingControls.get(segment, 0L, index); }
    /// {@return `schedulingControls`}
    public int schedulingControls() { return schedulingControls(this.segment(), 0L); }
    /// Sets `schedulingControls` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void schedulingControls(MemorySegment segment, long index, int value) { VH_schedulingControls.set(segment, 0L, index, value); }
    /// Sets `schedulingControls` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSchedulingControlsFeaturesARM schedulingControls(int value) { schedulingControls(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceSchedulingControlsFeaturesARM`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceSchedulingControlsFeaturesARM`
    public VkPhysicalDeviceSchedulingControlsFeaturesARM asSlice(long index) { return new VkPhysicalDeviceSchedulingControlsFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceSchedulingControlsFeaturesARM`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceSchedulingControlsFeaturesARM`
    public VkPhysicalDeviceSchedulingControlsFeaturesARM asSlice(long index, long count) { return new VkPhysicalDeviceSchedulingControlsFeaturesARM(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceSchedulingControlsFeaturesARM` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceSchedulingControlsFeaturesARM at(long index, Consumer<VkPhysicalDeviceSchedulingControlsFeaturesARM> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSchedulingControlsFeaturesARM sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSchedulingControlsFeaturesARM pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `schedulingControls` at the given index}
    /// @param index the index of the struct buffer
    public int schedulingControlsAt(long index) { return schedulingControls(this.segment(), index); }
    /// Sets `schedulingControls` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceSchedulingControlsFeaturesARM schedulingControlsAt(long index, int value) { schedulingControls(this.segment(), index, value); return this; }

}

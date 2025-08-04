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
package overrungl.vulkan.mesa.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceImageAlignmentControlFeaturesMESA {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 imageAlignmentControl;
/// };
/// ```
public final class VkPhysicalDeviceImageAlignmentControlFeaturesMESA extends GroupType {
    /// The struct layout of `VkPhysicalDeviceImageAlignmentControlFeaturesMESA`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("imageAlignmentControl")
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
    /// The byte offset of `imageAlignmentControl`.
    public static final long OFFSET_imageAlignmentControl = LAYOUT.byteOffset(PathElement.groupElement("imageAlignmentControl"));
    /// The memory layout of `imageAlignmentControl`.
    public static final MemoryLayout LAYOUT_imageAlignmentControl = LAYOUT.select(PathElement.groupElement("imageAlignmentControl"));
    /// The [VarHandle] of `imageAlignmentControl` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageAlignmentControl = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageAlignmentControl"));

    /// Creates `VkPhysicalDeviceImageAlignmentControlFeaturesMESA` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceImageAlignmentControlFeaturesMESA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageAlignmentControlFeaturesMESA of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageAlignmentControlFeaturesMESA(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceImageAlignmentControlFeaturesMESA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageAlignmentControlFeaturesMESA ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageAlignmentControlFeaturesMESA(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceImageAlignmentControlFeaturesMESA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceImageAlignmentControlFeaturesMESA ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceImageAlignmentControlFeaturesMESA(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceImageAlignmentControlFeaturesMESA` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceImageAlignmentControlFeaturesMESA`
    public static VkPhysicalDeviceImageAlignmentControlFeaturesMESA alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceImageAlignmentControlFeaturesMESA(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceImageAlignmentControlFeaturesMESA` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceImageAlignmentControlFeaturesMESA`
    public static VkPhysicalDeviceImageAlignmentControlFeaturesMESA alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceImageAlignmentControlFeaturesMESA(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA copyFrom(VkPhysicalDeviceImageAlignmentControlFeaturesMESA src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA reinterpret(long count) { return new VkPhysicalDeviceImageAlignmentControlFeaturesMESA(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `imageAlignmentControl` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageAlignmentControl(MemorySegment segment, long index) { return (int) VH_imageAlignmentControl.get(segment, 0L, index); }
    /// {@return `imageAlignmentControl`}
    public int imageAlignmentControl() { return imageAlignmentControl(this.segment(), 0L); }
    /// Sets `imageAlignmentControl` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageAlignmentControl(MemorySegment segment, long index, int value) { VH_imageAlignmentControl.set(segment, 0L, index, value); }
    /// Sets `imageAlignmentControl` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA imageAlignmentControl(int value) { imageAlignmentControl(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceImageAlignmentControlFeaturesMESA`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceImageAlignmentControlFeaturesMESA`
    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA asSlice(long index) { return new VkPhysicalDeviceImageAlignmentControlFeaturesMESA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceImageAlignmentControlFeaturesMESA`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceImageAlignmentControlFeaturesMESA`
    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA asSlice(long index, long count) { return new VkPhysicalDeviceImageAlignmentControlFeaturesMESA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceImageAlignmentControlFeaturesMESA` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA at(long index, Consumer<VkPhysicalDeviceImageAlignmentControlFeaturesMESA> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `imageAlignmentControl` at the given index}
    /// @param index the index of the struct buffer
    public int imageAlignmentControlAt(long index) { return imageAlignmentControl(this.segment(), index); }
    /// Sets `imageAlignmentControl` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA imageAlignmentControlAt(long index, int value) { imageAlignmentControl(this.segment(), index, value); return this; }

}

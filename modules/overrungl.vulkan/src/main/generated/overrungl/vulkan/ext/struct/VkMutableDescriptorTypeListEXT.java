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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkMutableDescriptorTypeListEXT {
///     uint32_t descriptorTypeCount;
///     const VkDescriptorType* pDescriptorTypes;
/// };
/// ```
public final class VkMutableDescriptorTypeListEXT extends GroupType {
    /// The struct layout of `VkMutableDescriptorTypeListEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("descriptorTypeCount"),
        ValueLayout.ADDRESS.withName("pDescriptorTypes")
    );
    /// The byte offset of `descriptorTypeCount`.
    public static final long OFFSET_descriptorTypeCount = LAYOUT.byteOffset(PathElement.groupElement("descriptorTypeCount"));
    /// The memory layout of `descriptorTypeCount`.
    public static final MemoryLayout LAYOUT_descriptorTypeCount = LAYOUT.select(PathElement.groupElement("descriptorTypeCount"));
    /// The [VarHandle] of `descriptorTypeCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_descriptorTypeCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("descriptorTypeCount"));
    /// The byte offset of `pDescriptorTypes`.
    public static final long OFFSET_pDescriptorTypes = LAYOUT.byteOffset(PathElement.groupElement("pDescriptorTypes"));
    /// The memory layout of `pDescriptorTypes`.
    public static final MemoryLayout LAYOUT_pDescriptorTypes = LAYOUT.select(PathElement.groupElement("pDescriptorTypes"));
    /// The [VarHandle] of `pDescriptorTypes` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pDescriptorTypes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pDescriptorTypes"));

    /// Creates `VkMutableDescriptorTypeListEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkMutableDescriptorTypeListEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkMutableDescriptorTypeListEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMutableDescriptorTypeListEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMutableDescriptorTypeListEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMutableDescriptorTypeListEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMutableDescriptorTypeListEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkMutableDescriptorTypeListEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkMutableDescriptorTypeListEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMutableDescriptorTypeListEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkMutableDescriptorTypeListEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkMutableDescriptorTypeListEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMutableDescriptorTypeListEXT`
    public static VkMutableDescriptorTypeListEXT alloc(SegmentAllocator allocator) { return new VkMutableDescriptorTypeListEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkMutableDescriptorTypeListEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMutableDescriptorTypeListEXT`
    public static VkMutableDescriptorTypeListEXT alloc(SegmentAllocator allocator, long count) { return new VkMutableDescriptorTypeListEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkMutableDescriptorTypeListEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param descriptorTypeCount `descriptorTypeCount`
    /// @param pDescriptorTypes `pDescriptorTypes`
    /// @return the allocated `VkMutableDescriptorTypeListEXT`
    public static VkMutableDescriptorTypeListEXT allocInit(SegmentAllocator allocator, int descriptorTypeCount, MemorySegment pDescriptorTypes) {
        return alloc(allocator).descriptorTypeCount(descriptorTypeCount).pDescriptorTypes(pDescriptorTypes);
    }

    /// Allocates a `VkMutableDescriptorTypeListEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param descriptorTypeCount `descriptorTypeCount`
    /// @return the allocated `VkMutableDescriptorTypeListEXT`
    public static VkMutableDescriptorTypeListEXT allocInit(SegmentAllocator allocator, int descriptorTypeCount) {
        return alloc(allocator).descriptorTypeCount(descriptorTypeCount);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMutableDescriptorTypeListEXT copyFrom(VkMutableDescriptorTypeListEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkMutableDescriptorTypeListEXT reinterpret(long count) { return new VkMutableDescriptorTypeListEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

    /// {@return `descriptorTypeCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int descriptorTypeCount(MemorySegment segment, long index) { return (int) VH_descriptorTypeCount.get(segment, 0L, index); }
    /// {@return `descriptorTypeCount`}
    public int descriptorTypeCount() { return descriptorTypeCount(this.segment(), 0L); }
    /// Sets `descriptorTypeCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void descriptorTypeCount(MemorySegment segment, long index, int value) { VH_descriptorTypeCount.set(segment, 0L, index, value); }
    /// Sets `descriptorTypeCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMutableDescriptorTypeListEXT descriptorTypeCount(int value) { descriptorTypeCount(this.segment(), 0L, value); return this; }

    /// {@return `pDescriptorTypes` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pDescriptorTypes(MemorySegment segment, long index) { return (MemorySegment) VH_pDescriptorTypes.get(segment, 0L, index); }
    /// {@return `pDescriptorTypes`}
    public MemorySegment pDescriptorTypes() { return pDescriptorTypes(this.segment(), 0L); }
    /// Sets `pDescriptorTypes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pDescriptorTypes(MemorySegment segment, long index, MemorySegment value) { VH_pDescriptorTypes.set(segment, 0L, index, value); }
    /// Sets `pDescriptorTypes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMutableDescriptorTypeListEXT pDescriptorTypes(MemorySegment value) { pDescriptorTypes(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkMutableDescriptorTypeListEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkMutableDescriptorTypeListEXT`
    public VkMutableDescriptorTypeListEXT asSlice(long index) { return new VkMutableDescriptorTypeListEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkMutableDescriptorTypeListEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkMutableDescriptorTypeListEXT`
    public VkMutableDescriptorTypeListEXT asSlice(long index, long count) { return new VkMutableDescriptorTypeListEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkMutableDescriptorTypeListEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkMutableDescriptorTypeListEXT at(long index, Consumer<VkMutableDescriptorTypeListEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `descriptorTypeCount` at the given index}
    /// @param index the index of the struct buffer
    public int descriptorTypeCountAt(long index) { return descriptorTypeCount(this.segment(), index); }
    /// Sets `descriptorTypeCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMutableDescriptorTypeListEXT descriptorTypeCountAt(long index, int value) { descriptorTypeCount(this.segment(), index, value); return this; }

    /// {@return `pDescriptorTypes` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pDescriptorTypesAt(long index) { return pDescriptorTypes(this.segment(), index); }
    /// Sets `pDescriptorTypes` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkMutableDescriptorTypeListEXT pDescriptorTypesAt(long index, MemorySegment value) { pDescriptorTypes(this.segment(), index, value); return this; }

}

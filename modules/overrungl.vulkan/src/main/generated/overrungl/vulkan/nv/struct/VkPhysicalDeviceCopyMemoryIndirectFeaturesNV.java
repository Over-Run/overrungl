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
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkPhysicalDeviceCopyMemoryIndirectFeaturesNV`.
/// ## Layout
/// ```
/// struct VkPhysicalDeviceCopyMemoryIndirectFeaturesNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 indirectCopy;
/// };
/// ```
public final class VkPhysicalDeviceCopyMemoryIndirectFeaturesNV extends GroupType {
    /// The struct layout of `VkPhysicalDeviceCopyMemoryIndirectFeaturesNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("indirectCopy")
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
    /// The byte offset of `indirectCopy`.
    public static final long OFFSET_indirectCopy = LAYOUT.byteOffset(PathElement.groupElement("indirectCopy"));
    /// The memory layout of `indirectCopy`.
    public static final MemoryLayout LAYOUT_indirectCopy = LAYOUT.select(PathElement.groupElement("indirectCopy"));
    /// The [VarHandle] of `indirectCopy` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_indirectCopy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("indirectCopy"));

    /// Creates `VkPhysicalDeviceCopyMemoryIndirectFeaturesNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPhysicalDeviceCopyMemoryIndirectFeaturesNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCopyMemoryIndirectFeaturesNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceCopyMemoryIndirectFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCopyMemoryIndirectFeaturesNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPhysicalDeviceCopyMemoryIndirectFeaturesNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceCopyMemoryIndirectFeaturesNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceCopyMemoryIndirectFeaturesNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceCopyMemoryIndirectFeaturesNV`
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesNV alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceCopyMemoryIndirectFeaturesNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPhysicalDeviceCopyMemoryIndirectFeaturesNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceCopyMemoryIndirectFeaturesNV`
    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesNV alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceCopyMemoryIndirectFeaturesNV(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV copyFrom(VkPhysicalDeviceCopyMemoryIndirectFeaturesNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV reinterpret(long count) { return new VkPhysicalDeviceCopyMemoryIndirectFeaturesNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `indirectCopy` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int indirectCopy(MemorySegment segment, long index) { return (int) VH_indirectCopy.get(segment, 0L, index); }
    /// {@return `indirectCopy`}
    public int indirectCopy() { return indirectCopy(this.segment(), 0L); }
    /// Sets `indirectCopy` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void indirectCopy(MemorySegment segment, long index, int value) { VH_indirectCopy.set(segment, 0L, index, value); }
    /// Sets `indirectCopy` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV indirectCopy(int value) { indirectCopy(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPhysicalDeviceCopyMemoryIndirectFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceCopyMemoryIndirectFeaturesNV`
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV asSlice(long index) { return new VkPhysicalDeviceCopyMemoryIndirectFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPhysicalDeviceCopyMemoryIndirectFeaturesNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceCopyMemoryIndirectFeaturesNV`
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV asSlice(long index, long count) { return new VkPhysicalDeviceCopyMemoryIndirectFeaturesNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPhysicalDeviceCopyMemoryIndirectFeaturesNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV at(long index, Consumer<VkPhysicalDeviceCopyMemoryIndirectFeaturesNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `indirectCopy` at the given index}
    /// @param index the index of the struct buffer
    public int indirectCopyAt(long index) { return indirectCopy(this.segment(), index); }
    /// Sets `indirectCopy` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesNV indirectCopyAt(long index, int value) { indirectCopy(this.segment(), index, value); return this; }

}

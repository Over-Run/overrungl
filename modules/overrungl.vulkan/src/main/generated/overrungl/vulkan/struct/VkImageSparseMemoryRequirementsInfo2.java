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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkImageSparseMemoryRequirementsInfo2 {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkImage image;
/// };
/// ```
public final class VkImageSparseMemoryRequirementsInfo2 extends GroupType {
    /// The struct layout of `VkImageSparseMemoryRequirementsInfo2`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("image")
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
    /// The byte offset of `image`.
    public static final long OFFSET_image = LAYOUT.byteOffset(PathElement.groupElement("image"));
    /// The memory layout of `image`.
    public static final MemoryLayout LAYOUT_image = LAYOUT.select(PathElement.groupElement("image"));
    /// The [VarHandle] of `image` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_image = LAYOUT.arrayElementVarHandle(PathElement.groupElement("image"));

    /// Creates `VkImageSparseMemoryRequirementsInfo2` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkImageSparseMemoryRequirementsInfo2(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkImageSparseMemoryRequirementsInfo2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageSparseMemoryRequirementsInfo2 of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSparseMemoryRequirementsInfo2(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageSparseMemoryRequirementsInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageSparseMemoryRequirementsInfo2 ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSparseMemoryRequirementsInfo2(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkImageSparseMemoryRequirementsInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageSparseMemoryRequirementsInfo2 ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSparseMemoryRequirementsInfo2(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImageSparseMemoryRequirementsInfo2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageSparseMemoryRequirementsInfo2`
    public static VkImageSparseMemoryRequirementsInfo2 alloc(SegmentAllocator allocator) { return new VkImageSparseMemoryRequirementsInfo2(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkImageSparseMemoryRequirementsInfo2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageSparseMemoryRequirementsInfo2`
    public static VkImageSparseMemoryRequirementsInfo2 alloc(SegmentAllocator allocator, long count) { return new VkImageSparseMemoryRequirementsInfo2(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImageSparseMemoryRequirementsInfo2` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param image `image`
    /// @return the allocated `VkImageSparseMemoryRequirementsInfo2`
    public static VkImageSparseMemoryRequirementsInfo2 allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long image) {
        return alloc(allocator).sType(sType).pNext(pNext).image(image);
    }

    /// Allocates a `VkImageSparseMemoryRequirementsInfo2` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkImageSparseMemoryRequirementsInfo2`
    public static VkImageSparseMemoryRequirementsInfo2 allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkImageSparseMemoryRequirementsInfo2` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkImageSparseMemoryRequirementsInfo2`
    public static VkImageSparseMemoryRequirementsInfo2 allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageSparseMemoryRequirementsInfo2 copyFrom(VkImageSparseMemoryRequirementsInfo2 src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkImageSparseMemoryRequirementsInfo2 reinterpret(long count) { return new VkImageSparseMemoryRequirementsInfo2(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkImageSparseMemoryRequirementsInfo2 sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkImageSparseMemoryRequirementsInfo2 pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `image` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long image(MemorySegment segment, long index) { return (long) VH_image.get(segment, 0L, index); }
    /// {@return `image`}
    public long image() { return image(this.segment(), 0L); }
    /// Sets `image` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void image(MemorySegment segment, long index, long value) { VH_image.set(segment, 0L, index, value); }
    /// Sets `image` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSparseMemoryRequirementsInfo2 image(long value) { image(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkImageSparseMemoryRequirementsInfo2`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImageSparseMemoryRequirementsInfo2`
    public VkImageSparseMemoryRequirementsInfo2 asSlice(long index) { return new VkImageSparseMemoryRequirementsInfo2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkImageSparseMemoryRequirementsInfo2`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImageSparseMemoryRequirementsInfo2`
    public VkImageSparseMemoryRequirementsInfo2 asSlice(long index, long count) { return new VkImageSparseMemoryRequirementsInfo2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkImageSparseMemoryRequirementsInfo2` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkImageSparseMemoryRequirementsInfo2 at(long index, Consumer<VkImageSparseMemoryRequirementsInfo2> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageSparseMemoryRequirementsInfo2 sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageSparseMemoryRequirementsInfo2 pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `image` at the given index}
    /// @param index the index of the struct buffer
    public long imageAt(long index) { return image(this.segment(), index); }
    /// Sets `image` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageSparseMemoryRequirementsInfo2 imageAt(long index, long value) { image(this.segment(), index, value); return this; }

}

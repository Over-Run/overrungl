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
/// struct VkImageSubresource2KHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (struct VkImageSubresource) VkImageSubresource imageSubresource;
/// };
/// ```
public final class VkImageSubresource2KHR extends GroupType {
    /// The struct layout of `VkImageSubresource2KHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkImageSubresource.LAYOUT.withName("imageSubresource")
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
    /// The byte offset of `imageSubresource`.
    public static final long OFFSET_imageSubresource = LAYOUT.byteOffset(PathElement.groupElement("imageSubresource"));
    /// The memory layout of `imageSubresource`.
    public static final MemoryLayout LAYOUT_imageSubresource = LAYOUT.select(PathElement.groupElement("imageSubresource"));

    /// Creates `VkImageSubresource2KHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkImageSubresource2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkImageSubresource2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageSubresource2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSubresource2KHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageSubresource2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageSubresource2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSubresource2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkImageSubresource2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageSubresource2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageSubresource2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImageSubresource2KHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageSubresource2KHR`
    public static VkImageSubresource2KHR alloc(SegmentAllocator allocator) { return new VkImageSubresource2KHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkImageSubresource2KHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageSubresource2KHR`
    public static VkImageSubresource2KHR alloc(SegmentAllocator allocator, long count) { return new VkImageSubresource2KHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImageSubresource2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param imageSubresource `imageSubresource`
    /// @return the allocated `VkImageSubresource2KHR`
    public static VkImageSubresource2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment imageSubresource) {
        return alloc(allocator).sType(sType).pNext(pNext).imageSubresource(imageSubresource);
    }

    /// Allocates a `VkImageSubresource2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkImageSubresource2KHR`
    public static VkImageSubresource2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkImageSubresource2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkImageSubresource2KHR`
    public static VkImageSubresource2KHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageSubresource2KHR copyFrom(VkImageSubresource2KHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkImageSubresource2KHR reinterpret(long count) { return new VkImageSubresource2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkImageSubresource2KHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkImageSubresource2KHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `imageSubresource` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment imageSubresource(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageSubresource, index), LAYOUT_imageSubresource); }
    /// {@return `imageSubresource`}
    public MemorySegment imageSubresource() { return imageSubresource(this.segment(), 0L); }
    /// Sets `imageSubresource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageSubresource(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageSubresource, index), LAYOUT_imageSubresource.byteSize()); }
    /// Sets `imageSubresource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageSubresource2KHR imageSubresource(MemorySegment value) { imageSubresource(this.segment(), 0L, value); return this; }
    /// Accepts `imageSubresource` with the given function.
    /// @param func the function
    /// @return `this`
    public VkImageSubresource2KHR imageSubresource(Consumer<overrungl.vulkan.struct.VkImageSubresource> func) { func.accept(overrungl.vulkan.struct.VkImageSubresource.of(imageSubresource())); return this; }

    /// Creates a slice of `VkImageSubresource2KHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImageSubresource2KHR`
    public VkImageSubresource2KHR asSlice(long index) { return new VkImageSubresource2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkImageSubresource2KHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImageSubresource2KHR`
    public VkImageSubresource2KHR asSlice(long index, long count) { return new VkImageSubresource2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkImageSubresource2KHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkImageSubresource2KHR at(long index, Consumer<VkImageSubresource2KHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageSubresource2KHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageSubresource2KHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `imageSubresource` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment imageSubresourceAt(long index) { return imageSubresource(this.segment(), index); }
    /// Sets `imageSubresource` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageSubresource2KHR imageSubresourceAt(long index, MemorySegment value) { imageSubresource(this.segment(), index, value); return this; }
    /// Accepts `imageSubresource` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkImageSubresource2KHR imageSubresourceAt(long index, Consumer<overrungl.vulkan.struct.VkImageSubresource> func) { func.accept(overrungl.vulkan.struct.VkImageSubresource.of(imageSubresourceAt(index))); return this; }

}

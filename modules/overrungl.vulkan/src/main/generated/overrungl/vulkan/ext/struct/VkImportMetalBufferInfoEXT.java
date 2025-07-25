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
/// struct VkImportMetalBufferInfoEXT {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (void*) MTLBuffer_id mtlBuffer;
/// };
/// ```
public final class VkImportMetalBufferInfoEXT extends GroupType {
    /// The struct layout of `VkImportMetalBufferInfoEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("mtlBuffer")
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
    /// The byte offset of `mtlBuffer`.
    public static final long OFFSET_mtlBuffer = LAYOUT.byteOffset(PathElement.groupElement("mtlBuffer"));
    /// The memory layout of `mtlBuffer`.
    public static final MemoryLayout LAYOUT_mtlBuffer = LAYOUT.select(PathElement.groupElement("mtlBuffer"));
    /// The [VarHandle] of `mtlBuffer` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_mtlBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mtlBuffer"));

    /// Creates `VkImportMetalBufferInfoEXT` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkImportMetalBufferInfoEXT(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkImportMetalBufferInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMetalBufferInfoEXT of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMetalBufferInfoEXT(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImportMetalBufferInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMetalBufferInfoEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMetalBufferInfoEXT(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkImportMetalBufferInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMetalBufferInfoEXT ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImportMetalBufferInfoEXT(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImportMetalBufferInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImportMetalBufferInfoEXT`
    public static VkImportMetalBufferInfoEXT alloc(SegmentAllocator allocator) { return new VkImportMetalBufferInfoEXT(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkImportMetalBufferInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImportMetalBufferInfoEXT`
    public static VkImportMetalBufferInfoEXT alloc(SegmentAllocator allocator, long count) { return new VkImportMetalBufferInfoEXT(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImportMetalBufferInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param mtlBuffer `mtlBuffer`
    /// @return the allocated `VkImportMetalBufferInfoEXT`
    public static VkImportMetalBufferInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment mtlBuffer) {
        return alloc(allocator).sType(sType).pNext(pNext).mtlBuffer(mtlBuffer);
    }

    /// Allocates a `VkImportMetalBufferInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkImportMetalBufferInfoEXT`
    public static VkImportMetalBufferInfoEXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkImportMetalBufferInfoEXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkImportMetalBufferInfoEXT`
    public static VkImportMetalBufferInfoEXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImportMetalBufferInfoEXT copyFrom(VkImportMetalBufferInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkImportMetalBufferInfoEXT reinterpret(long count) { return new VkImportMetalBufferInfoEXT(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkImportMetalBufferInfoEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkImportMetalBufferInfoEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `mtlBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment mtlBuffer(MemorySegment segment, long index) { return (MemorySegment) VH_mtlBuffer.get(segment, 0L, index); }
    /// {@return `mtlBuffer`}
    public MemorySegment mtlBuffer() { return mtlBuffer(this.segment(), 0L); }
    /// Sets `mtlBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void mtlBuffer(MemorySegment segment, long index, MemorySegment value) { VH_mtlBuffer.set(segment, 0L, index, value); }
    /// Sets `mtlBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMetalBufferInfoEXT mtlBuffer(MemorySegment value) { mtlBuffer(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkImportMetalBufferInfoEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImportMetalBufferInfoEXT`
    public VkImportMetalBufferInfoEXT asSlice(long index) { return new VkImportMetalBufferInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkImportMetalBufferInfoEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImportMetalBufferInfoEXT`
    public VkImportMetalBufferInfoEXT asSlice(long index, long count) { return new VkImportMetalBufferInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkImportMetalBufferInfoEXT` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkImportMetalBufferInfoEXT at(long index, Consumer<VkImportMetalBufferInfoEXT> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImportMetalBufferInfoEXT sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImportMetalBufferInfoEXT pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `mtlBuffer` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment mtlBufferAt(long index) { return mtlBuffer(this.segment(), index); }
    /// Sets `mtlBuffer` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImportMetalBufferInfoEXT mtlBufferAt(long index, MemorySegment value) { mtlBuffer(this.segment(), index, value); return this; }

}

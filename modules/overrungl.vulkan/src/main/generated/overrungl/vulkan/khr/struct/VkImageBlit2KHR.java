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
/// struct VkImageBlit2KHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (struct VkImageSubresourceLayers) VkImageSubresourceLayers srcSubresource;
///     (struct VkOffset3D) VkOffset3D srcOffsets[2];
///     (struct VkImageSubresourceLayers) VkImageSubresourceLayers dstSubresource;
///     (struct VkOffset3D) VkOffset3D dstOffsets[2];
/// };
/// ```
public final class VkImageBlit2KHR extends GroupType {
    /// The struct layout of `VkImageBlit2KHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkImageSubresourceLayers.LAYOUT.withName("srcSubresource"),
        MemoryLayout.sequenceLayout(2, overrungl.vulkan.struct.VkOffset3D.LAYOUT).withName("srcOffsets"),
        overrungl.vulkan.struct.VkImageSubresourceLayers.LAYOUT.withName("dstSubresource"),
        MemoryLayout.sequenceLayout(2, overrungl.vulkan.struct.VkOffset3D.LAYOUT).withName("dstOffsets")
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
    /// The byte offset of `srcSubresource`.
    public static final long OFFSET_srcSubresource = LAYOUT.byteOffset(PathElement.groupElement("srcSubresource"));
    /// The memory layout of `srcSubresource`.
    public static final MemoryLayout LAYOUT_srcSubresource = LAYOUT.select(PathElement.groupElement("srcSubresource"));
    /// The byte offset of `srcOffsets`.
    public static final long OFFSET_srcOffsets = LAYOUT.byteOffset(PathElement.groupElement("srcOffsets"));
    /// The memory layout of `srcOffsets`.
    public static final MemoryLayout LAYOUT_srcOffsets = LAYOUT.select(PathElement.groupElement("srcOffsets"));
    /// The byte offset of `dstSubresource`.
    public static final long OFFSET_dstSubresource = LAYOUT.byteOffset(PathElement.groupElement("dstSubresource"));
    /// The memory layout of `dstSubresource`.
    public static final MemoryLayout LAYOUT_dstSubresource = LAYOUT.select(PathElement.groupElement("dstSubresource"));
    /// The byte offset of `dstOffsets`.
    public static final long OFFSET_dstOffsets = LAYOUT.byteOffset(PathElement.groupElement("dstOffsets"));
    /// The memory layout of `dstOffsets`.
    public static final MemoryLayout LAYOUT_dstOffsets = LAYOUT.select(PathElement.groupElement("dstOffsets"));

    /// Creates `VkImageBlit2KHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkImageBlit2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkImageBlit2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageBlit2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageBlit2KHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImageBlit2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageBlit2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageBlit2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkImageBlit2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImageBlit2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkImageBlit2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkImageBlit2KHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImageBlit2KHR`
    public static VkImageBlit2KHR alloc(SegmentAllocator allocator) { return new VkImageBlit2KHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkImageBlit2KHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImageBlit2KHR`
    public static VkImageBlit2KHR alloc(SegmentAllocator allocator, long count) { return new VkImageBlit2KHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImageBlit2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcSubresource `srcSubresource`
    /// @param srcOffsets `srcOffsets`
    /// @param dstSubresource `dstSubresource`
    /// @param dstOffsets `dstOffsets`
    /// @return the allocated `VkImageBlit2KHR`
    public static VkImageBlit2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment srcSubresource, MemorySegment srcOffsets, MemorySegment dstSubresource, MemorySegment dstOffsets) {
        return alloc(allocator).sType(sType).pNext(pNext).srcSubresource(srcSubresource).srcOffsets(srcOffsets).dstSubresource(dstSubresource).dstOffsets(dstOffsets);
    }

    /// Allocates a `VkImageBlit2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcSubresource `srcSubresource`
    /// @param srcOffsets `srcOffsets`
    /// @param dstSubresource `dstSubresource`
    /// @return the allocated `VkImageBlit2KHR`
    public static VkImageBlit2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment srcSubresource, MemorySegment srcOffsets, MemorySegment dstSubresource) {
        return alloc(allocator).sType(sType).pNext(pNext).srcSubresource(srcSubresource).srcOffsets(srcOffsets).dstSubresource(dstSubresource);
    }

    /// Allocates a `VkImageBlit2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcSubresource `srcSubresource`
    /// @param srcOffsets `srcOffsets`
    /// @return the allocated `VkImageBlit2KHR`
    public static VkImageBlit2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment srcSubresource, MemorySegment srcOffsets) {
        return alloc(allocator).sType(sType).pNext(pNext).srcSubresource(srcSubresource).srcOffsets(srcOffsets);
    }

    /// Allocates a `VkImageBlit2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param srcSubresource `srcSubresource`
    /// @return the allocated `VkImageBlit2KHR`
    public static VkImageBlit2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment srcSubresource) {
        return alloc(allocator).sType(sType).pNext(pNext).srcSubresource(srcSubresource);
    }

    /// Allocates a `VkImageBlit2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkImageBlit2KHR`
    public static VkImageBlit2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkImageBlit2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkImageBlit2KHR`
    public static VkImageBlit2KHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImageBlit2KHR copyFrom(VkImageBlit2KHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkImageBlit2KHR reinterpret(long count) { return new VkImageBlit2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkImageBlit2KHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkImageBlit2KHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `srcSubresource` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment srcSubresource(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_srcSubresource, index), LAYOUT_srcSubresource); }
    /// {@return `srcSubresource`}
    public MemorySegment srcSubresource() { return srcSubresource(this.segment(), 0L); }
    /// Sets `srcSubresource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcSubresource(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_srcSubresource, index), LAYOUT_srcSubresource.byteSize()); }
    /// Sets `srcSubresource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageBlit2KHR srcSubresource(MemorySegment value) { srcSubresource(this.segment(), 0L, value); return this; }
    /// Accepts `srcSubresource` with the given function.
    /// @param func the function
    /// @return `this`
    public VkImageBlit2KHR srcSubresource(Consumer<overrungl.vulkan.struct.VkImageSubresourceLayers> func) { func.accept(overrungl.vulkan.struct.VkImageSubresourceLayers.of(srcSubresource())); return this; }

    /// {@return `srcOffsets` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment srcOffsets(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_srcOffsets, index), LAYOUT_srcOffsets); }
    /// {@return `srcOffsets`}
    public MemorySegment srcOffsets() { return srcOffsets(this.segment(), 0L); }
    /// Sets `srcOffsets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcOffsets(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_srcOffsets, index), LAYOUT_srcOffsets.byteSize()); }
    /// Sets `srcOffsets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageBlit2KHR srcOffsets(MemorySegment value) { srcOffsets(this.segment(), 0L, value); return this; }
    /// Accepts `srcOffsets` with the given function.
    /// @param func the function
    /// @return `this`
    public VkImageBlit2KHR srcOffsets(Consumer<overrungl.vulkan.struct.VkOffset3D> func) { func.accept(overrungl.vulkan.struct.VkOffset3D.of(srcOffsets())); return this; }

    /// {@return `dstSubresource` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment dstSubresource(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_dstSubresource, index), LAYOUT_dstSubresource); }
    /// {@return `dstSubresource`}
    public MemorySegment dstSubresource() { return dstSubresource(this.segment(), 0L); }
    /// Sets `dstSubresource` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstSubresource(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_dstSubresource, index), LAYOUT_dstSubresource.byteSize()); }
    /// Sets `dstSubresource` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageBlit2KHR dstSubresource(MemorySegment value) { dstSubresource(this.segment(), 0L, value); return this; }
    /// Accepts `dstSubresource` with the given function.
    /// @param func the function
    /// @return `this`
    public VkImageBlit2KHR dstSubresource(Consumer<overrungl.vulkan.struct.VkImageSubresourceLayers> func) { func.accept(overrungl.vulkan.struct.VkImageSubresourceLayers.of(dstSubresource())); return this; }

    /// {@return `dstOffsets` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment dstOffsets(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_dstOffsets, index), LAYOUT_dstOffsets); }
    /// {@return `dstOffsets`}
    public MemorySegment dstOffsets() { return dstOffsets(this.segment(), 0L); }
    /// Sets `dstOffsets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstOffsets(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_dstOffsets, index), LAYOUT_dstOffsets.byteSize()); }
    /// Sets `dstOffsets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImageBlit2KHR dstOffsets(MemorySegment value) { dstOffsets(this.segment(), 0L, value); return this; }
    /// Accepts `dstOffsets` with the given function.
    /// @param func the function
    /// @return `this`
    public VkImageBlit2KHR dstOffsets(Consumer<overrungl.vulkan.struct.VkOffset3D> func) { func.accept(overrungl.vulkan.struct.VkOffset3D.of(dstOffsets())); return this; }

    /// Creates a slice of `VkImageBlit2KHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkImageBlit2KHR`
    public VkImageBlit2KHR asSlice(long index) { return new VkImageBlit2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkImageBlit2KHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkImageBlit2KHR`
    public VkImageBlit2KHR asSlice(long index, long count) { return new VkImageBlit2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkImageBlit2KHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkImageBlit2KHR at(long index, Consumer<VkImageBlit2KHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageBlit2KHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageBlit2KHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `srcSubresource` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment srcSubresourceAt(long index) { return srcSubresource(this.segment(), index); }
    /// Sets `srcSubresource` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageBlit2KHR srcSubresourceAt(long index, MemorySegment value) { srcSubresource(this.segment(), index, value); return this; }
    /// Accepts `srcSubresource` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkImageBlit2KHR srcSubresourceAt(long index, Consumer<overrungl.vulkan.struct.VkImageSubresourceLayers> func) { func.accept(overrungl.vulkan.struct.VkImageSubresourceLayers.of(srcSubresourceAt(index))); return this; }

    /// {@return `srcOffsets` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment srcOffsetsAt(long index) { return srcOffsets(this.segment(), index); }
    /// Sets `srcOffsets` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageBlit2KHR srcOffsetsAt(long index, MemorySegment value) { srcOffsets(this.segment(), index, value); return this; }
    /// Accepts `srcOffsets` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkImageBlit2KHR srcOffsetsAt(long index, Consumer<overrungl.vulkan.struct.VkOffset3D> func) { func.accept(overrungl.vulkan.struct.VkOffset3D.of(srcOffsetsAt(index))); return this; }

    /// {@return `dstSubresource` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment dstSubresourceAt(long index) { return dstSubresource(this.segment(), index); }
    /// Sets `dstSubresource` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageBlit2KHR dstSubresourceAt(long index, MemorySegment value) { dstSubresource(this.segment(), index, value); return this; }
    /// Accepts `dstSubresource` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkImageBlit2KHR dstSubresourceAt(long index, Consumer<overrungl.vulkan.struct.VkImageSubresourceLayers> func) { func.accept(overrungl.vulkan.struct.VkImageSubresourceLayers.of(dstSubresourceAt(index))); return this; }

    /// {@return `dstOffsets` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment dstOffsetsAt(long index) { return dstOffsets(this.segment(), index); }
    /// Sets `dstOffsets` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkImageBlit2KHR dstOffsetsAt(long index, MemorySegment value) { dstOffsets(this.segment(), index, value); return this; }
    /// Accepts `dstOffsets` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkImageBlit2KHR dstOffsetsAt(long index, Consumer<overrungl.vulkan.struct.VkOffset3D> func) { func.accept(overrungl.vulkan.struct.VkOffset3D.of(dstOffsetsAt(index))); return this; }

}

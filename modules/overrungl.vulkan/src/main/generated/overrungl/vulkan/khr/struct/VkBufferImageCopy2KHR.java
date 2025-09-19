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
import org.jspecify.annotations.*;
import overrungl.struct.*;
import overrungl.util.*;

/// Represents `VkBufferImageCopy2KHR`.
/// ## Layout
/// ```
/// struct VkBufferImageCopy2KHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkDeviceSize bufferOffset;
///     uint32_t bufferRowLength;
///     uint32_t bufferImageHeight;
///     (struct VkImageSubresourceLayers) VkImageSubresourceLayers imageSubresource;
///     (struct VkOffset3D) VkOffset3D imageOffset;
///     (struct VkExtent3D) VkExtent3D imageExtent;
/// };
/// ```
public final class VkBufferImageCopy2KHR extends GroupType {
    /// The struct layout of `VkBufferImageCopy2KHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("bufferOffset"),
        ValueLayout.JAVA_INT.withName("bufferRowLength"),
        ValueLayout.JAVA_INT.withName("bufferImageHeight"),
        overrungl.vulkan.struct.VkImageSubresourceLayers.LAYOUT.withName("imageSubresource"),
        overrungl.vulkan.struct.VkOffset3D.LAYOUT.withName("imageOffset"),
        overrungl.vulkan.struct.VkExtent3D.LAYOUT.withName("imageExtent")
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
    /// The byte offset of `bufferOffset`.
    public static final long OFFSET_bufferOffset = LAYOUT.byteOffset(PathElement.groupElement("bufferOffset"));
    /// The memory layout of `bufferOffset`.
    public static final MemoryLayout LAYOUT_bufferOffset = LAYOUT.select(PathElement.groupElement("bufferOffset"));
    /// The [VarHandle] of `bufferOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bufferOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferOffset"));
    /// The byte offset of `bufferRowLength`.
    public static final long OFFSET_bufferRowLength = LAYOUT.byteOffset(PathElement.groupElement("bufferRowLength"));
    /// The memory layout of `bufferRowLength`.
    public static final MemoryLayout LAYOUT_bufferRowLength = LAYOUT.select(PathElement.groupElement("bufferRowLength"));
    /// The [VarHandle] of `bufferRowLength` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bufferRowLength = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferRowLength"));
    /// The byte offset of `bufferImageHeight`.
    public static final long OFFSET_bufferImageHeight = LAYOUT.byteOffset(PathElement.groupElement("bufferImageHeight"));
    /// The memory layout of `bufferImageHeight`.
    public static final MemoryLayout LAYOUT_bufferImageHeight = LAYOUT.select(PathElement.groupElement("bufferImageHeight"));
    /// The [VarHandle] of `bufferImageHeight` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bufferImageHeight = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferImageHeight"));
    /// The byte offset of `imageSubresource`.
    public static final long OFFSET_imageSubresource = LAYOUT.byteOffset(PathElement.groupElement("imageSubresource"));
    /// The memory layout of `imageSubresource`.
    public static final MemoryLayout LAYOUT_imageSubresource = LAYOUT.select(PathElement.groupElement("imageSubresource"));
    /// The byte offset of `imageOffset`.
    public static final long OFFSET_imageOffset = LAYOUT.byteOffset(PathElement.groupElement("imageOffset"));
    /// The memory layout of `imageOffset`.
    public static final MemoryLayout LAYOUT_imageOffset = LAYOUT.select(PathElement.groupElement("imageOffset"));
    /// The byte offset of `imageExtent`.
    public static final long OFFSET_imageExtent = LAYOUT.byteOffset(PathElement.groupElement("imageExtent"));
    /// The memory layout of `imageExtent`.
    public static final MemoryLayout LAYOUT_imageExtent = LAYOUT.select(PathElement.groupElement("imageExtent"));

    /// Creates `VkBufferImageCopy2KHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkBufferImageCopy2KHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkBufferImageCopy2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferImageCopy2KHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferImageCopy2KHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBufferImageCopy2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferImageCopy2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferImageCopy2KHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkBufferImageCopy2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBufferImageCopy2KHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkBufferImageCopy2KHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBufferImageCopy2KHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBufferImageCopy2KHR`
    public static VkBufferImageCopy2KHR alloc(SegmentAllocator allocator) { return new VkBufferImageCopy2KHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkBufferImageCopy2KHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBufferImageCopy2KHR`
    public static VkBufferImageCopy2KHR alloc(SegmentAllocator allocator, long count) { return new VkBufferImageCopy2KHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBufferImageCopy2KHR copyFrom(VkBufferImageCopy2KHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkBufferImageCopy2KHR reinterpret(long count) { return new VkBufferImageCopy2KHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkBufferImageCopy2KHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkBufferImageCopy2KHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `bufferOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long bufferOffset(MemorySegment segment, long index) { return (long) VH_bufferOffset.get(segment, 0L, index); }
    /// {@return `bufferOffset`}
    public long bufferOffset() { return bufferOffset(this.segment(), 0L); }
    /// Sets `bufferOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferOffset(MemorySegment segment, long index, long value) { VH_bufferOffset.set(segment, 0L, index, value); }
    /// Sets `bufferOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferImageCopy2KHR bufferOffset(long value) { bufferOffset(this.segment(), 0L, value); return this; }

    /// {@return `bufferRowLength` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bufferRowLength(MemorySegment segment, long index) { return (int) VH_bufferRowLength.get(segment, 0L, index); }
    /// {@return `bufferRowLength`}
    public int bufferRowLength() { return bufferRowLength(this.segment(), 0L); }
    /// Sets `bufferRowLength` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferRowLength(MemorySegment segment, long index, int value) { VH_bufferRowLength.set(segment, 0L, index, value); }
    /// Sets `bufferRowLength` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferImageCopy2KHR bufferRowLength(int value) { bufferRowLength(this.segment(), 0L, value); return this; }

    /// {@return `bufferImageHeight` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bufferImageHeight(MemorySegment segment, long index) { return (int) VH_bufferImageHeight.get(segment, 0L, index); }
    /// {@return `bufferImageHeight`}
    public int bufferImageHeight() { return bufferImageHeight(this.segment(), 0L); }
    /// Sets `bufferImageHeight` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferImageHeight(MemorySegment segment, long index, int value) { VH_bufferImageHeight.set(segment, 0L, index, value); }
    /// Sets `bufferImageHeight` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferImageCopy2KHR bufferImageHeight(int value) { bufferImageHeight(this.segment(), 0L, value); return this; }

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
    public VkBufferImageCopy2KHR imageSubresource(MemorySegment value) { imageSubresource(this.segment(), 0L, value); return this; }
    /// Accepts `imageSubresource` with the given function.
    /// @param func the function
    /// @return `this`
    public VkBufferImageCopy2KHR imageSubresource(Consumer<overrungl.vulkan.struct.VkImageSubresourceLayers> func) { func.accept(overrungl.vulkan.struct.VkImageSubresourceLayers.of(imageSubresource())); return this; }

    /// {@return `imageOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment imageOffset(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageOffset, index), LAYOUT_imageOffset); }
    /// {@return `imageOffset`}
    public MemorySegment imageOffset() { return imageOffset(this.segment(), 0L); }
    /// Sets `imageOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageOffset(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageOffset, index), LAYOUT_imageOffset.byteSize()); }
    /// Sets `imageOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferImageCopy2KHR imageOffset(MemorySegment value) { imageOffset(this.segment(), 0L, value); return this; }
    /// Accepts `imageOffset` with the given function.
    /// @param func the function
    /// @return `this`
    public VkBufferImageCopy2KHR imageOffset(Consumer<overrungl.vulkan.struct.VkOffset3D> func) { func.accept(overrungl.vulkan.struct.VkOffset3D.of(imageOffset())); return this; }

    /// {@return `imageExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment imageExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_imageExtent, index), LAYOUT_imageExtent); }
    /// {@return `imageExtent`}
    public MemorySegment imageExtent() { return imageExtent(this.segment(), 0L); }
    /// Sets `imageExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageExtent(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_imageExtent, index), LAYOUT_imageExtent.byteSize()); }
    /// Sets `imageExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBufferImageCopy2KHR imageExtent(MemorySegment value) { imageExtent(this.segment(), 0L, value); return this; }
    /// Accepts `imageExtent` with the given function.
    /// @param func the function
    /// @return `this`
    public VkBufferImageCopy2KHR imageExtent(Consumer<overrungl.vulkan.struct.VkExtent3D> func) { func.accept(overrungl.vulkan.struct.VkExtent3D.of(imageExtent())); return this; }

    /// Creates a slice of `VkBufferImageCopy2KHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkBufferImageCopy2KHR`
    public VkBufferImageCopy2KHR asSlice(long index) { return new VkBufferImageCopy2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkBufferImageCopy2KHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkBufferImageCopy2KHR`
    public VkBufferImageCopy2KHR asSlice(long index, long count) { return new VkBufferImageCopy2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkBufferImageCopy2KHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkBufferImageCopy2KHR at(long index, Consumer<VkBufferImageCopy2KHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferImageCopy2KHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferImageCopy2KHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `bufferOffset` at the given index}
    /// @param index the index of the struct buffer
    public long bufferOffsetAt(long index) { return bufferOffset(this.segment(), index); }
    /// Sets `bufferOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferImageCopy2KHR bufferOffsetAt(long index, long value) { bufferOffset(this.segment(), index, value); return this; }

    /// {@return `bufferRowLength` at the given index}
    /// @param index the index of the struct buffer
    public int bufferRowLengthAt(long index) { return bufferRowLength(this.segment(), index); }
    /// Sets `bufferRowLength` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferImageCopy2KHR bufferRowLengthAt(long index, int value) { bufferRowLength(this.segment(), index, value); return this; }

    /// {@return `bufferImageHeight` at the given index}
    /// @param index the index of the struct buffer
    public int bufferImageHeightAt(long index) { return bufferImageHeight(this.segment(), index); }
    /// Sets `bufferImageHeight` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferImageCopy2KHR bufferImageHeightAt(long index, int value) { bufferImageHeight(this.segment(), index, value); return this; }

    /// {@return `imageSubresource` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment imageSubresourceAt(long index) { return imageSubresource(this.segment(), index); }
    /// Sets `imageSubresource` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferImageCopy2KHR imageSubresourceAt(long index, MemorySegment value) { imageSubresource(this.segment(), index, value); return this; }
    /// Accepts `imageSubresource` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkBufferImageCopy2KHR imageSubresourceAt(long index, Consumer<overrungl.vulkan.struct.VkImageSubresourceLayers> func) { func.accept(overrungl.vulkan.struct.VkImageSubresourceLayers.of(imageSubresourceAt(index))); return this; }

    /// {@return `imageOffset` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment imageOffsetAt(long index) { return imageOffset(this.segment(), index); }
    /// Sets `imageOffset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferImageCopy2KHR imageOffsetAt(long index, MemorySegment value) { imageOffset(this.segment(), index, value); return this; }
    /// Accepts `imageOffset` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkBufferImageCopy2KHR imageOffsetAt(long index, Consumer<overrungl.vulkan.struct.VkOffset3D> func) { func.accept(overrungl.vulkan.struct.VkOffset3D.of(imageOffsetAt(index))); return this; }

    /// {@return `imageExtent` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment imageExtentAt(long index) { return imageExtent(this.segment(), index); }
    /// Sets `imageExtent` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkBufferImageCopy2KHR imageExtentAt(long index, MemorySegment value) { imageExtent(this.segment(), index, value); return this; }
    /// Accepts `imageExtent` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkBufferImageCopy2KHR imageExtentAt(long index, Consumer<overrungl.vulkan.struct.VkExtent3D> func) { func.accept(overrungl.vulkan.struct.VkExtent3D.of(imageExtentAt(index))); return this; }

}

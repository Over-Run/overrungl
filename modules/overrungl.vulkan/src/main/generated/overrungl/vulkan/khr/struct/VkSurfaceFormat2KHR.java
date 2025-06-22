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
import overrungl.struct.*;
import overrungl.util.*;
import java.util.function.*;

/// ## Layout
/// ```
/// struct VkSurfaceFormat2KHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (struct VkSurfaceFormatKHR) VkSurfaceFormatKHR surfaceFormat;
/// };
/// ```
public sealed class VkSurfaceFormat2KHR extends GroupType {
    /// The struct layout of `VkSurfaceFormat2KHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.khr.struct.VkSurfaceFormatKHR.LAYOUT.withName("surfaceFormat")
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
    /// The byte offset of `surfaceFormat`.
    public static final long OFFSET_surfaceFormat = LAYOUT.byteOffset(PathElement.groupElement("surfaceFormat"));
    /// The memory layout of `surfaceFormat`.
    public static final MemoryLayout LAYOUT_surfaceFormat = LAYOUT.select(PathElement.groupElement("surfaceFormat"));

    /// Creates `VkSurfaceFormat2KHR` with the given segment.
    /// @param segment the memory segment
    public VkSurfaceFormat2KHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSurfaceFormat2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSurfaceFormat2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfaceFormat2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceFormat2KHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkSurfaceFormat2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSurfaceFormat2KHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSurfaceFormat2KHR`
    public static VkSurfaceFormat2KHR alloc(SegmentAllocator allocator) { return new VkSurfaceFormat2KHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSurfaceFormat2KHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSurfaceFormat2KHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSurfaceFormat2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param surfaceFormat `surfaceFormat`
    /// @return the allocated `VkSurfaceFormat2KHR`
    public static VkSurfaceFormat2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment surfaceFormat) {
        return alloc(allocator).sType(sType).pNext(pNext).surfaceFormat(surfaceFormat);
    }

    /// Allocates a `VkSurfaceFormat2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkSurfaceFormat2KHR`
    public static VkSurfaceFormat2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkSurfaceFormat2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkSurfaceFormat2KHR`
    public static VkSurfaceFormat2KHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSurfaceFormat2KHR copyFrom(VkSurfaceFormat2KHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public VkSurfaceFormat2KHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSurfaceFormat2KHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `surfaceFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment surfaceFormat(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_surfaceFormat, index), LAYOUT_surfaceFormat); }
    /// {@return `surfaceFormat`}
    public MemorySegment surfaceFormat() { return surfaceFormat(this.segment(), 0L); }
    /// Sets `surfaceFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void surfaceFormat(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_surfaceFormat, index), LAYOUT_surfaceFormat.byteSize()); }
    /// Sets `surfaceFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceFormat2KHR surfaceFormat(MemorySegment value) { surfaceFormat(this.segment(), 0L, value); return this; }
    /// Accepts `surfaceFormat` with the given function.
    /// @param func the function
    /// @return `this`
    public VkSurfaceFormat2KHR surfaceFormat(Consumer<overrungl.vulkan.khr.struct.VkSurfaceFormatKHR> func) { func.accept(overrungl.vulkan.khr.struct.VkSurfaceFormatKHR.of(surfaceFormat())); return this; }

    /// A buffer of [VkSurfaceFormat2KHR].
    public static final class Buffer extends VkSurfaceFormat2KHR {
        private final long elementCount;

        /// Creates `VkSurfaceFormat2KHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSurfaceFormat2KHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSurfaceFormat2KHR`
        public VkSurfaceFormat2KHR asSlice(long index) { return new VkSurfaceFormat2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSurfaceFormat2KHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSurfaceFormat2KHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `surfaceFormat` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment surfaceFormatAt(long index) { return surfaceFormat(this.segment(), index); }
        /// Sets `surfaceFormat` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer surfaceFormatAt(long index, MemorySegment value) { surfaceFormat(this.segment(), index, value); return this; }
        /// Accepts `surfaceFormat` with the given function.
        /// @param index the index of the struct buffer
        /// @param func the function
        /// @return `this`
        public Buffer surfaceFormatAt(long index, Consumer<overrungl.vulkan.khr.struct.VkSurfaceFormatKHR> func) { func.accept(overrungl.vulkan.khr.struct.VkSurfaceFormatKHR.of(surfaceFormatAt(index))); return this; }

    }
}

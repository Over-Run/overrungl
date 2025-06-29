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

/// ## Layout
/// ```
/// struct VkSurfaceCapabilitiesPresentId2KHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 presentId2Supported;
/// };
/// ```
public sealed class VkSurfaceCapabilitiesPresentId2KHR extends GroupType {
    /// The struct layout of `VkSurfaceCapabilitiesPresentId2KHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("presentId2Supported")
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
    /// The byte offset of `presentId2Supported`.
    public static final long OFFSET_presentId2Supported = LAYOUT.byteOffset(PathElement.groupElement("presentId2Supported"));
    /// The memory layout of `presentId2Supported`.
    public static final MemoryLayout LAYOUT_presentId2Supported = LAYOUT.select(PathElement.groupElement("presentId2Supported"));
    /// The [VarHandle] of `presentId2Supported` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_presentId2Supported = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentId2Supported"));

    /// Creates `VkSurfaceCapabilitiesPresentId2KHR` with the given segment.
    /// @param segment the memory segment
    public VkSurfaceCapabilitiesPresentId2KHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSurfaceCapabilitiesPresentId2KHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSurfaceCapabilitiesPresentId2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSurfaceCapabilitiesPresentId2KHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSurfaceCapabilitiesPresentId2KHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkSurfaceCapabilitiesPresentId2KHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSurfaceCapabilitiesPresentId2KHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSurfaceCapabilitiesPresentId2KHR`
    public static VkSurfaceCapabilitiesPresentId2KHR alloc(SegmentAllocator allocator) { return new VkSurfaceCapabilitiesPresentId2KHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSurfaceCapabilitiesPresentId2KHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSurfaceCapabilitiesPresentId2KHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSurfaceCapabilitiesPresentId2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param presentId2Supported `presentId2Supported`
    /// @return the allocated `VkSurfaceCapabilitiesPresentId2KHR`
    public static VkSurfaceCapabilitiesPresentId2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int presentId2Supported) {
        return alloc(allocator).sType(sType).pNext(pNext).presentId2Supported(presentId2Supported);
    }

    /// Allocates a `VkSurfaceCapabilitiesPresentId2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkSurfaceCapabilitiesPresentId2KHR`
    public static VkSurfaceCapabilitiesPresentId2KHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkSurfaceCapabilitiesPresentId2KHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkSurfaceCapabilitiesPresentId2KHR`
    public static VkSurfaceCapabilitiesPresentId2KHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSurfaceCapabilitiesPresentId2KHR copyFrom(VkSurfaceCapabilitiesPresentId2KHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkSurfaceCapabilitiesPresentId2KHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSurfaceCapabilitiesPresentId2KHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `presentId2Supported` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int presentId2Supported(MemorySegment segment, long index) { return (int) VH_presentId2Supported.get(segment, 0L, index); }
    /// {@return `presentId2Supported`}
    public int presentId2Supported() { return presentId2Supported(this.segment(), 0L); }
    /// Sets `presentId2Supported` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void presentId2Supported(MemorySegment segment, long index, int value) { VH_presentId2Supported.set(segment, 0L, index, value); }
    /// Sets `presentId2Supported` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSurfaceCapabilitiesPresentId2KHR presentId2Supported(int value) { presentId2Supported(this.segment(), 0L, value); return this; }

    /// A buffer of [VkSurfaceCapabilitiesPresentId2KHR].
    public static final class Buffer extends VkSurfaceCapabilitiesPresentId2KHR {
        private final long elementCount;

        /// Creates `VkSurfaceCapabilitiesPresentId2KHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSurfaceCapabilitiesPresentId2KHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSurfaceCapabilitiesPresentId2KHR`
        public VkSurfaceCapabilitiesPresentId2KHR asSlice(long index) { return new VkSurfaceCapabilitiesPresentId2KHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSurfaceCapabilitiesPresentId2KHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSurfaceCapabilitiesPresentId2KHR`
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

        /// {@return `presentId2Supported` at the given index}
        /// @param index the index of the struct buffer
        public int presentId2SupportedAt(long index) { return presentId2Supported(this.segment(), index); }
        /// Sets `presentId2Supported` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer presentId2SupportedAt(long index, int value) { presentId2Supported(this.segment(), index, value); return this; }

    }
}

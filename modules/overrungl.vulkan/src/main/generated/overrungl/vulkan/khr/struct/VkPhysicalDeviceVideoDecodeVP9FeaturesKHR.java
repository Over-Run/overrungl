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
/// struct VkPhysicalDeviceVideoDecodeVP9FeaturesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (uint32_t) VkBool32 videoDecodeVP9;
/// };
/// ```
public sealed class VkPhysicalDeviceVideoDecodeVP9FeaturesKHR extends GroupType {
    /// The struct layout of `VkPhysicalDeviceVideoDecodeVP9FeaturesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("videoDecodeVP9")
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
    /// The byte offset of `videoDecodeVP9`.
    public static final long OFFSET_videoDecodeVP9 = LAYOUT.byteOffset(PathElement.groupElement("videoDecodeVP9"));
    /// The memory layout of `videoDecodeVP9`.
    public static final MemoryLayout LAYOUT_videoDecodeVP9 = LAYOUT.select(PathElement.groupElement("videoDecodeVP9"));
    /// The [VarHandle] of `videoDecodeVP9` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_videoDecodeVP9 = LAYOUT.arrayElementVarHandle(PathElement.groupElement("videoDecodeVP9"));

    /// Creates `VkPhysicalDeviceVideoDecodeVP9FeaturesKHR` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceVideoDecodeVP9FeaturesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceVideoDecodeVP9FeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVideoDecodeVP9FeaturesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVideoDecodeVP9FeaturesKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceVideoDecodeVP9FeaturesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceVideoDecodeVP9FeaturesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVideoDecodeVP9FeaturesKHR`
    public static VkPhysicalDeviceVideoDecodeVP9FeaturesKHR alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVideoDecodeVP9FeaturesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceVideoDecodeVP9FeaturesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVideoDecodeVP9FeaturesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceVideoDecodeVP9FeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param videoDecodeVP9 `videoDecodeVP9`
    /// @return the allocated `VkPhysicalDeviceVideoDecodeVP9FeaturesKHR`
    public static VkPhysicalDeviceVideoDecodeVP9FeaturesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int videoDecodeVP9) {
        return alloc(allocator).sType(sType).pNext(pNext).videoDecodeVP9(videoDecodeVP9);
    }

    /// Allocates a `VkPhysicalDeviceVideoDecodeVP9FeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPhysicalDeviceVideoDecodeVP9FeaturesKHR`
    public static VkPhysicalDeviceVideoDecodeVP9FeaturesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPhysicalDeviceVideoDecodeVP9FeaturesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPhysicalDeviceVideoDecodeVP9FeaturesKHR`
    public static VkPhysicalDeviceVideoDecodeVP9FeaturesKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR copyFrom(VkPhysicalDeviceVideoDecodeVP9FeaturesKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `videoDecodeVP9` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int videoDecodeVP9(MemorySegment segment, long index) { return (int) VH_videoDecodeVP9.get(segment, 0L, index); }
    /// {@return `videoDecodeVP9`}
    public int videoDecodeVP9() { return videoDecodeVP9(this.segment(), 0L); }
    /// Sets `videoDecodeVP9` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void videoDecodeVP9(MemorySegment segment, long index, int value) { VH_videoDecodeVP9.set(segment, 0L, index, value); }
    /// Sets `videoDecodeVP9` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR videoDecodeVP9(int value) { videoDecodeVP9(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceVideoDecodeVP9FeaturesKHR].
    public static final class Buffer extends VkPhysicalDeviceVideoDecodeVP9FeaturesKHR {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceVideoDecodeVP9FeaturesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceVideoDecodeVP9FeaturesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceVideoDecodeVP9FeaturesKHR`
        public VkPhysicalDeviceVideoDecodeVP9FeaturesKHR asSlice(long index) { return new VkPhysicalDeviceVideoDecodeVP9FeaturesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceVideoDecodeVP9FeaturesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceVideoDecodeVP9FeaturesKHR`
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

        /// {@return `videoDecodeVP9` at the given index}
        /// @param index the index of the struct buffer
        public int videoDecodeVP9At(long index) { return videoDecodeVP9(this.segment(), index); }
        /// Sets `videoDecodeVP9` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer videoDecodeVP9At(long index, int value) { videoDecodeVP9(this.segment(), index, value); return this; }

    }
}

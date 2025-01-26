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
/// struct VkVideoDecodeH264SessionParametersCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t maxStdSPSCount;
///     uint32_t maxStdPPSCount;
///     const VkVideoDecodeH264SessionParametersAddInfoKHR* pParametersAddInfo;
/// };
/// ```
public sealed class VkVideoDecodeH264SessionParametersCreateInfoKHR extends GroupType {
    /// The struct layout of `VkVideoDecodeH264SessionParametersCreateInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxStdSPSCount"),
        ValueLayout.JAVA_INT.withName("maxStdPPSCount"),
        ValueLayout.ADDRESS.withName("pParametersAddInfo")
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
    /// The byte offset of `maxStdSPSCount`.
    public static final long OFFSET_maxStdSPSCount = LAYOUT.byteOffset(PathElement.groupElement("maxStdSPSCount"));
    /// The memory layout of `maxStdSPSCount`.
    public static final MemoryLayout LAYOUT_maxStdSPSCount = LAYOUT.select(PathElement.groupElement("maxStdSPSCount"));
    /// The [VarHandle] of `maxStdSPSCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxStdSPSCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxStdSPSCount"));
    /// The byte offset of `maxStdPPSCount`.
    public static final long OFFSET_maxStdPPSCount = LAYOUT.byteOffset(PathElement.groupElement("maxStdPPSCount"));
    /// The memory layout of `maxStdPPSCount`.
    public static final MemoryLayout LAYOUT_maxStdPPSCount = LAYOUT.select(PathElement.groupElement("maxStdPPSCount"));
    /// The [VarHandle] of `maxStdPPSCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxStdPPSCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxStdPPSCount"));
    /// The byte offset of `pParametersAddInfo`.
    public static final long OFFSET_pParametersAddInfo = LAYOUT.byteOffset(PathElement.groupElement("pParametersAddInfo"));
    /// The memory layout of `pParametersAddInfo`.
    public static final MemoryLayout LAYOUT_pParametersAddInfo = LAYOUT.select(PathElement.groupElement("pParametersAddInfo"));
    /// The [VarHandle] of `pParametersAddInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pParametersAddInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pParametersAddInfo"));

    /// Creates `VkVideoDecodeH264SessionParametersCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoDecodeH264SessionParametersCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoDecodeH264SessionParametersCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoDecodeH264SessionParametersCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoDecodeH264SessionParametersCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoDecodeH264SessionParametersCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoDecodeH264SessionParametersCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoDecodeH264SessionParametersCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoDecodeH264SessionParametersCreateInfoKHR`
    public static VkVideoDecodeH264SessionParametersCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoDecodeH264SessionParametersCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoDecodeH264SessionParametersCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoDecodeH264SessionParametersCreateInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoDecodeH264SessionParametersCreateInfoKHR copyFrom(VkVideoDecodeH264SessionParametersCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkVideoDecodeH264SessionParametersCreateInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoDecodeH264SessionParametersCreateInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `maxStdSPSCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxStdSPSCount(MemorySegment segment, long index) { return (int) VH_maxStdSPSCount.get(segment, 0L, index); }
    /// {@return `maxStdSPSCount`}
    public int maxStdSPSCount() { return maxStdSPSCount(this.segment(), 0L); }
    /// Sets `maxStdSPSCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxStdSPSCount(MemorySegment segment, long index, int value) { VH_maxStdSPSCount.set(segment, 0L, index, value); }
    /// Sets `maxStdSPSCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264SessionParametersCreateInfoKHR maxStdSPSCount(int value) { maxStdSPSCount(this.segment(), 0L, value); return this; }

    /// {@return `maxStdPPSCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxStdPPSCount(MemorySegment segment, long index) { return (int) VH_maxStdPPSCount.get(segment, 0L, index); }
    /// {@return `maxStdPPSCount`}
    public int maxStdPPSCount() { return maxStdPPSCount(this.segment(), 0L); }
    /// Sets `maxStdPPSCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxStdPPSCount(MemorySegment segment, long index, int value) { VH_maxStdPPSCount.set(segment, 0L, index, value); }
    /// Sets `maxStdPPSCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264SessionParametersCreateInfoKHR maxStdPPSCount(int value) { maxStdPPSCount(this.segment(), 0L, value); return this; }

    /// {@return `pParametersAddInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pParametersAddInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pParametersAddInfo.get(segment, 0L, index); }
    /// {@return `pParametersAddInfo`}
    public MemorySegment pParametersAddInfo() { return pParametersAddInfo(this.segment(), 0L); }
    /// Sets `pParametersAddInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pParametersAddInfo(MemorySegment segment, long index, MemorySegment value) { VH_pParametersAddInfo.set(segment, 0L, index, value); }
    /// Sets `pParametersAddInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoDecodeH264SessionParametersCreateInfoKHR pParametersAddInfo(MemorySegment value) { pParametersAddInfo(this.segment(), 0L, value); return this; }

    /// A buffer of [VkVideoDecodeH264SessionParametersCreateInfoKHR].
    public static final class Buffer extends VkVideoDecodeH264SessionParametersCreateInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoDecodeH264SessionParametersCreateInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoDecodeH264SessionParametersCreateInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoDecodeH264SessionParametersCreateInfoKHR`
        public VkVideoDecodeH264SessionParametersCreateInfoKHR asSlice(long index) { return new VkVideoDecodeH264SessionParametersCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoDecodeH264SessionParametersCreateInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoDecodeH264SessionParametersCreateInfoKHR`
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

        /// {@return `maxStdSPSCount` at the given index}
        /// @param index the index of the struct buffer
        public int maxStdSPSCountAt(long index) { return maxStdSPSCount(this.segment(), index); }
        /// Sets `maxStdSPSCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxStdSPSCountAt(long index, int value) { maxStdSPSCount(this.segment(), index, value); return this; }

        /// {@return `maxStdPPSCount` at the given index}
        /// @param index the index of the struct buffer
        public int maxStdPPSCountAt(long index) { return maxStdPPSCount(this.segment(), index); }
        /// Sets `maxStdPPSCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxStdPPSCountAt(long index, int value) { maxStdPPSCount(this.segment(), index, value); return this; }

        /// {@return `pParametersAddInfo` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pParametersAddInfoAt(long index) { return pParametersAddInfo(this.segment(), index); }
        /// Sets `pParametersAddInfo` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pParametersAddInfoAt(long index, MemorySegment value) { pParametersAddInfo(this.segment(), index, value); return this; }

    }
}

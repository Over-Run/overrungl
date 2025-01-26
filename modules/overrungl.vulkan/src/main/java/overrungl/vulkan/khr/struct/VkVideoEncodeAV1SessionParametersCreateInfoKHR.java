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
/// struct VkVideoEncodeAV1SessionParametersCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     const StdVideoAV1SequenceHeader* pStdSequenceHeader;
///     const StdVideoEncodeAV1DecoderModelInfo* pStdDecoderModelInfo;
///     uint32_t stdOperatingPointCount;
///     const StdVideoEncodeAV1OperatingPointInfo* pStdOperatingPoints;
/// };
/// ```
public sealed class VkVideoEncodeAV1SessionParametersCreateInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeAV1SessionParametersCreateInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pStdSequenceHeader"),
        ValueLayout.ADDRESS.withName("pStdDecoderModelInfo"),
        ValueLayout.JAVA_INT.withName("stdOperatingPointCount"),
        ValueLayout.ADDRESS.withName("pStdOperatingPoints")
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
    /// The byte offset of `pStdSequenceHeader`.
    public static final long OFFSET_pStdSequenceHeader = LAYOUT.byteOffset(PathElement.groupElement("pStdSequenceHeader"));
    /// The memory layout of `pStdSequenceHeader`.
    public static final MemoryLayout LAYOUT_pStdSequenceHeader = LAYOUT.select(PathElement.groupElement("pStdSequenceHeader"));
    /// The [VarHandle] of `pStdSequenceHeader` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pStdSequenceHeader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdSequenceHeader"));
    /// The byte offset of `pStdDecoderModelInfo`.
    public static final long OFFSET_pStdDecoderModelInfo = LAYOUT.byteOffset(PathElement.groupElement("pStdDecoderModelInfo"));
    /// The memory layout of `pStdDecoderModelInfo`.
    public static final MemoryLayout LAYOUT_pStdDecoderModelInfo = LAYOUT.select(PathElement.groupElement("pStdDecoderModelInfo"));
    /// The [VarHandle] of `pStdDecoderModelInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pStdDecoderModelInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdDecoderModelInfo"));
    /// The byte offset of `stdOperatingPointCount`.
    public static final long OFFSET_stdOperatingPointCount = LAYOUT.byteOffset(PathElement.groupElement("stdOperatingPointCount"));
    /// The memory layout of `stdOperatingPointCount`.
    public static final MemoryLayout LAYOUT_stdOperatingPointCount = LAYOUT.select(PathElement.groupElement("stdOperatingPointCount"));
    /// The [VarHandle] of `stdOperatingPointCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stdOperatingPointCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdOperatingPointCount"));
    /// The byte offset of `pStdOperatingPoints`.
    public static final long OFFSET_pStdOperatingPoints = LAYOUT.byteOffset(PathElement.groupElement("pStdOperatingPoints"));
    /// The memory layout of `pStdOperatingPoints`.
    public static final MemoryLayout LAYOUT_pStdOperatingPoints = LAYOUT.select(PathElement.groupElement("pStdOperatingPoints"));
    /// The [VarHandle] of `pStdOperatingPoints` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pStdOperatingPoints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdOperatingPoints"));

    /// Creates `VkVideoEncodeAV1SessionParametersCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeAV1SessionParametersCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeAV1SessionParametersCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1SessionParametersCreateInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeAV1SessionParametersCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoEncodeAV1SessionParametersCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeAV1SessionParametersCreateInfoKHR`
    public static VkVideoEncodeAV1SessionParametersCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1SessionParametersCreateInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeAV1SessionParametersCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeAV1SessionParametersCreateInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR copyFrom(VkVideoEncodeAV1SessionParametersCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `pStdSequenceHeader` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pStdSequenceHeader(MemorySegment segment, long index) { return (MemorySegment) VH_pStdSequenceHeader.get(segment, 0L, index); }
    /// {@return `pStdSequenceHeader`}
    public MemorySegment pStdSequenceHeader() { return pStdSequenceHeader(this.segment(), 0L); }
    /// Sets `pStdSequenceHeader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pStdSequenceHeader(MemorySegment segment, long index, MemorySegment value) { VH_pStdSequenceHeader.set(segment, 0L, index, value); }
    /// Sets `pStdSequenceHeader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pStdSequenceHeader(MemorySegment value) { pStdSequenceHeader(this.segment(), 0L, value); return this; }

    /// {@return `pStdDecoderModelInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pStdDecoderModelInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pStdDecoderModelInfo.get(segment, 0L, index); }
    /// {@return `pStdDecoderModelInfo`}
    public MemorySegment pStdDecoderModelInfo() { return pStdDecoderModelInfo(this.segment(), 0L); }
    /// Sets `pStdDecoderModelInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pStdDecoderModelInfo(MemorySegment segment, long index, MemorySegment value) { VH_pStdDecoderModelInfo.set(segment, 0L, index, value); }
    /// Sets `pStdDecoderModelInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pStdDecoderModelInfo(MemorySegment value) { pStdDecoderModelInfo(this.segment(), 0L, value); return this; }

    /// {@return `stdOperatingPointCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stdOperatingPointCount(MemorySegment segment, long index) { return (int) VH_stdOperatingPointCount.get(segment, 0L, index); }
    /// {@return `stdOperatingPointCount`}
    public int stdOperatingPointCount() { return stdOperatingPointCount(this.segment(), 0L); }
    /// Sets `stdOperatingPointCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stdOperatingPointCount(MemorySegment segment, long index, int value) { VH_stdOperatingPointCount.set(segment, 0L, index, value); }
    /// Sets `stdOperatingPointCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR stdOperatingPointCount(int value) { stdOperatingPointCount(this.segment(), 0L, value); return this; }

    /// {@return `pStdOperatingPoints` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pStdOperatingPoints(MemorySegment segment, long index) { return (MemorySegment) VH_pStdOperatingPoints.get(segment, 0L, index); }
    /// {@return `pStdOperatingPoints`}
    public MemorySegment pStdOperatingPoints() { return pStdOperatingPoints(this.segment(), 0L); }
    /// Sets `pStdOperatingPoints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pStdOperatingPoints(MemorySegment segment, long index, MemorySegment value) { VH_pStdOperatingPoints.set(segment, 0L, index, value); }
    /// Sets `pStdOperatingPoints` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1SessionParametersCreateInfoKHR pStdOperatingPoints(MemorySegment value) { pStdOperatingPoints(this.segment(), 0L, value); return this; }

    /// A buffer of [VkVideoEncodeAV1SessionParametersCreateInfoKHR].
    public static final class Buffer extends VkVideoEncodeAV1SessionParametersCreateInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeAV1SessionParametersCreateInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeAV1SessionParametersCreateInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeAV1SessionParametersCreateInfoKHR`
        public VkVideoEncodeAV1SessionParametersCreateInfoKHR asSlice(long index) { return new VkVideoEncodeAV1SessionParametersCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeAV1SessionParametersCreateInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeAV1SessionParametersCreateInfoKHR`
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

        /// {@return `pStdSequenceHeader` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pStdSequenceHeaderAt(long index) { return pStdSequenceHeader(this.segment(), index); }
        /// Sets `pStdSequenceHeader` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pStdSequenceHeaderAt(long index, MemorySegment value) { pStdSequenceHeader(this.segment(), index, value); return this; }

        /// {@return `pStdDecoderModelInfo` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pStdDecoderModelInfoAt(long index) { return pStdDecoderModelInfo(this.segment(), index); }
        /// Sets `pStdDecoderModelInfo` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pStdDecoderModelInfoAt(long index, MemorySegment value) { pStdDecoderModelInfo(this.segment(), index, value); return this; }

        /// {@return `stdOperatingPointCount` at the given index}
        /// @param index the index of the struct buffer
        public int stdOperatingPointCountAt(long index) { return stdOperatingPointCount(this.segment(), index); }
        /// Sets `stdOperatingPointCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer stdOperatingPointCountAt(long index, int value) { stdOperatingPointCount(this.segment(), index, value); return this; }

        /// {@return `pStdOperatingPoints` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pStdOperatingPointsAt(long index) { return pStdOperatingPoints(this.segment(), index); }
        /// Sets `pStdOperatingPoints` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pStdOperatingPointsAt(long index, MemorySegment value) { pStdOperatingPoints(this.segment(), index, value); return this; }

    }
}

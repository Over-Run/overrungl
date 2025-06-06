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
/// struct VkVideoEncodeH264SessionParametersAddInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t stdSPSCount;
///     const StdVideoH264SequenceParameterSet* pStdSPSs;
///     uint32_t stdPPSCount;
///     const StdVideoH264PictureParameterSet* pStdPPSs;
/// };
/// ```
public sealed class VkVideoEncodeH264SessionParametersAddInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeH264SessionParametersAddInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stdSPSCount"),
        ValueLayout.ADDRESS.withName("pStdSPSs"),
        ValueLayout.JAVA_INT.withName("stdPPSCount"),
        ValueLayout.ADDRESS.withName("pStdPPSs")
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
    /// The byte offset of `stdSPSCount`.
    public static final long OFFSET_stdSPSCount = LAYOUT.byteOffset(PathElement.groupElement("stdSPSCount"));
    /// The memory layout of `stdSPSCount`.
    public static final MemoryLayout LAYOUT_stdSPSCount = LAYOUT.select(PathElement.groupElement("stdSPSCount"));
    /// The [VarHandle] of `stdSPSCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stdSPSCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdSPSCount"));
    /// The byte offset of `pStdSPSs`.
    public static final long OFFSET_pStdSPSs = LAYOUT.byteOffset(PathElement.groupElement("pStdSPSs"));
    /// The memory layout of `pStdSPSs`.
    public static final MemoryLayout LAYOUT_pStdSPSs = LAYOUT.select(PathElement.groupElement("pStdSPSs"));
    /// The [VarHandle] of `pStdSPSs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pStdSPSs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdSPSs"));
    /// The byte offset of `stdPPSCount`.
    public static final long OFFSET_stdPPSCount = LAYOUT.byteOffset(PathElement.groupElement("stdPPSCount"));
    /// The memory layout of `stdPPSCount`.
    public static final MemoryLayout LAYOUT_stdPPSCount = LAYOUT.select(PathElement.groupElement("stdPPSCount"));
    /// The [VarHandle] of `stdPPSCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_stdPPSCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdPPSCount"));
    /// The byte offset of `pStdPPSs`.
    public static final long OFFSET_pStdPPSs = LAYOUT.byteOffset(PathElement.groupElement("pStdPPSs"));
    /// The memory layout of `pStdPPSs`.
    public static final MemoryLayout LAYOUT_pStdPPSs = LAYOUT.select(PathElement.groupElement("pStdPPSs"));
    /// The [VarHandle] of `pStdPPSs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pStdPPSs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdPPSs"));

    /// Creates `VkVideoEncodeH264SessionParametersAddInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH264SessionParametersAddInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH264SessionParametersAddInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH264SessionParametersAddInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264SessionParametersAddInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264SessionParametersAddInfoKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkVideoEncodeH264SessionParametersAddInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeH264SessionParametersAddInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH264SessionParametersAddInfoKHR`
    public static VkVideoEncodeH264SessionParametersAddInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264SessionParametersAddInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH264SessionParametersAddInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH264SessionParametersAddInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoEncodeH264SessionParametersAddInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param stdSPSCount `stdSPSCount`
    /// @param pStdSPSs `pStdSPSs`
    /// @param stdPPSCount `stdPPSCount`
    /// @param pStdPPSs `pStdPPSs`
    /// @return the allocated `VkVideoEncodeH264SessionParametersAddInfoKHR`
    public static VkVideoEncodeH264SessionParametersAddInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int stdSPSCount, MemorySegment pStdSPSs, int stdPPSCount, MemorySegment pStdPPSs) {
        return alloc(allocator).sType(sType).pNext(pNext).stdSPSCount(stdSPSCount).pStdSPSs(pStdSPSs).stdPPSCount(stdPPSCount).pStdPPSs(pStdPPSs);
    }

    /// Allocates a `VkVideoEncodeH264SessionParametersAddInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param stdSPSCount `stdSPSCount`
    /// @param pStdSPSs `pStdSPSs`
    /// @param stdPPSCount `stdPPSCount`
    /// @return the allocated `VkVideoEncodeH264SessionParametersAddInfoKHR`
    public static VkVideoEncodeH264SessionParametersAddInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int stdSPSCount, MemorySegment pStdSPSs, int stdPPSCount) {
        return alloc(allocator).sType(sType).pNext(pNext).stdSPSCount(stdSPSCount).pStdSPSs(pStdSPSs).stdPPSCount(stdPPSCount);
    }

    /// Allocates a `VkVideoEncodeH264SessionParametersAddInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param stdSPSCount `stdSPSCount`
    /// @param pStdSPSs `pStdSPSs`
    /// @return the allocated `VkVideoEncodeH264SessionParametersAddInfoKHR`
    public static VkVideoEncodeH264SessionParametersAddInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int stdSPSCount, MemorySegment pStdSPSs) {
        return alloc(allocator).sType(sType).pNext(pNext).stdSPSCount(stdSPSCount).pStdSPSs(pStdSPSs);
    }

    /// Allocates a `VkVideoEncodeH264SessionParametersAddInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param stdSPSCount `stdSPSCount`
    /// @return the allocated `VkVideoEncodeH264SessionParametersAddInfoKHR`
    public static VkVideoEncodeH264SessionParametersAddInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int stdSPSCount) {
        return alloc(allocator).sType(sType).pNext(pNext).stdSPSCount(stdSPSCount);
    }

    /// Allocates a `VkVideoEncodeH264SessionParametersAddInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkVideoEncodeH264SessionParametersAddInfoKHR`
    public static VkVideoEncodeH264SessionParametersAddInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkVideoEncodeH264SessionParametersAddInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkVideoEncodeH264SessionParametersAddInfoKHR`
    public static VkVideoEncodeH264SessionParametersAddInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH264SessionParametersAddInfoKHR copyFrom(VkVideoEncodeH264SessionParametersAddInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkVideoEncodeH264SessionParametersAddInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH264SessionParametersAddInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `stdSPSCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stdSPSCount(MemorySegment segment, long index) { return (int) VH_stdSPSCount.get(segment, 0L, index); }
    /// {@return `stdSPSCount`}
    public int stdSPSCount() { return stdSPSCount(this.segment(), 0L); }
    /// Sets `stdSPSCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stdSPSCount(MemorySegment segment, long index, int value) { VH_stdSPSCount.set(segment, 0L, index, value); }
    /// Sets `stdSPSCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersAddInfoKHR stdSPSCount(int value) { stdSPSCount(this.segment(), 0L, value); return this; }

    /// {@return `pStdSPSs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pStdSPSs(MemorySegment segment, long index) { return (MemorySegment) VH_pStdSPSs.get(segment, 0L, index); }
    /// {@return `pStdSPSs`}
    public MemorySegment pStdSPSs() { return pStdSPSs(this.segment(), 0L); }
    /// Sets `pStdSPSs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pStdSPSs(MemorySegment segment, long index, MemorySegment value) { VH_pStdSPSs.set(segment, 0L, index, value); }
    /// Sets `pStdSPSs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersAddInfoKHR pStdSPSs(MemorySegment value) { pStdSPSs(this.segment(), 0L, value); return this; }

    /// {@return `stdPPSCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int stdPPSCount(MemorySegment segment, long index) { return (int) VH_stdPPSCount.get(segment, 0L, index); }
    /// {@return `stdPPSCount`}
    public int stdPPSCount() { return stdPPSCount(this.segment(), 0L); }
    /// Sets `stdPPSCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void stdPPSCount(MemorySegment segment, long index, int value) { VH_stdPPSCount.set(segment, 0L, index, value); }
    /// Sets `stdPPSCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersAddInfoKHR stdPPSCount(int value) { stdPPSCount(this.segment(), 0L, value); return this; }

    /// {@return `pStdPPSs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pStdPPSs(MemorySegment segment, long index) { return (MemorySegment) VH_pStdPPSs.get(segment, 0L, index); }
    /// {@return `pStdPPSs`}
    public MemorySegment pStdPPSs() { return pStdPPSs(this.segment(), 0L); }
    /// Sets `pStdPPSs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pStdPPSs(MemorySegment segment, long index, MemorySegment value) { VH_pStdPPSs.set(segment, 0L, index, value); }
    /// Sets `pStdPPSs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264SessionParametersAddInfoKHR pStdPPSs(MemorySegment value) { pStdPPSs(this.segment(), 0L, value); return this; }

    /// A buffer of [VkVideoEncodeH264SessionParametersAddInfoKHR].
    public static final class Buffer extends VkVideoEncodeH264SessionParametersAddInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeH264SessionParametersAddInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeH264SessionParametersAddInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeH264SessionParametersAddInfoKHR`
        public VkVideoEncodeH264SessionParametersAddInfoKHR asSlice(long index) { return new VkVideoEncodeH264SessionParametersAddInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeH264SessionParametersAddInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeH264SessionParametersAddInfoKHR`
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

        /// {@return `stdSPSCount` at the given index}
        /// @param index the index of the struct buffer
        public int stdSPSCountAt(long index) { return stdSPSCount(this.segment(), index); }
        /// Sets `stdSPSCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer stdSPSCountAt(long index, int value) { stdSPSCount(this.segment(), index, value); return this; }

        /// {@return `pStdSPSs` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pStdSPSsAt(long index) { return pStdSPSs(this.segment(), index); }
        /// Sets `pStdSPSs` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pStdSPSsAt(long index, MemorySegment value) { pStdSPSs(this.segment(), index, value); return this; }

        /// {@return `stdPPSCount` at the given index}
        /// @param index the index of the struct buffer
        public int stdPPSCountAt(long index) { return stdPPSCount(this.segment(), index); }
        /// Sets `stdPPSCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer stdPPSCountAt(long index, int value) { stdPPSCount(this.segment(), index, value); return this; }

        /// {@return `pStdPPSs` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pStdPPSsAt(long index) { return pStdPPSs(this.segment(), index); }
        /// Sets `pStdPPSs` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pStdPPSsAt(long index, MemorySegment value) { pStdPPSs(this.segment(), index, value); return this; }

    }
}

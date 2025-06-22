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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;
import java.util.function.*;

/// ## Layout
/// ```
/// struct VkPipelineCacheHeaderVersionSafetyCriticalOne {
///     (struct VkPipelineCacheHeaderVersionOne) VkPipelineCacheHeaderVersionOne headerVersionOne;
///     (int) VkPipelineCacheValidationVersion validationVersion;
///     uint32_t implementationData;
///     uint32_t pipelineIndexCount;
///     uint32_t pipelineIndexStride;
///     uint64_t pipelineIndexOffset;
/// };
/// ```
public sealed class VkPipelineCacheHeaderVersionSafetyCriticalOne extends GroupType {
    /// The struct layout of `VkPipelineCacheHeaderVersionSafetyCriticalOne`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkPipelineCacheHeaderVersionOne.LAYOUT.withName("headerVersionOne"),
        ValueLayout.JAVA_INT.withName("validationVersion"),
        ValueLayout.JAVA_INT.withName("implementationData"),
        ValueLayout.JAVA_INT.withName("pipelineIndexCount"),
        ValueLayout.JAVA_INT.withName("pipelineIndexStride"),
        ValueLayout.JAVA_LONG.withName("pipelineIndexOffset")
    );
    /// The byte offset of `headerVersionOne`.
    public static final long OFFSET_headerVersionOne = LAYOUT.byteOffset(PathElement.groupElement("headerVersionOne"));
    /// The memory layout of `headerVersionOne`.
    public static final MemoryLayout LAYOUT_headerVersionOne = LAYOUT.select(PathElement.groupElement("headerVersionOne"));
    /// The byte offset of `validationVersion`.
    public static final long OFFSET_validationVersion = LAYOUT.byteOffset(PathElement.groupElement("validationVersion"));
    /// The memory layout of `validationVersion`.
    public static final MemoryLayout LAYOUT_validationVersion = LAYOUT.select(PathElement.groupElement("validationVersion"));
    /// The [VarHandle] of `validationVersion` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_validationVersion = LAYOUT.arrayElementVarHandle(PathElement.groupElement("validationVersion"));
    /// The byte offset of `implementationData`.
    public static final long OFFSET_implementationData = LAYOUT.byteOffset(PathElement.groupElement("implementationData"));
    /// The memory layout of `implementationData`.
    public static final MemoryLayout LAYOUT_implementationData = LAYOUT.select(PathElement.groupElement("implementationData"));
    /// The [VarHandle] of `implementationData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_implementationData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("implementationData"));
    /// The byte offset of `pipelineIndexCount`.
    public static final long OFFSET_pipelineIndexCount = LAYOUT.byteOffset(PathElement.groupElement("pipelineIndexCount"));
    /// The memory layout of `pipelineIndexCount`.
    public static final MemoryLayout LAYOUT_pipelineIndexCount = LAYOUT.select(PathElement.groupElement("pipelineIndexCount"));
    /// The [VarHandle] of `pipelineIndexCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineIndexCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineIndexCount"));
    /// The byte offset of `pipelineIndexStride`.
    public static final long OFFSET_pipelineIndexStride = LAYOUT.byteOffset(PathElement.groupElement("pipelineIndexStride"));
    /// The memory layout of `pipelineIndexStride`.
    public static final MemoryLayout LAYOUT_pipelineIndexStride = LAYOUT.select(PathElement.groupElement("pipelineIndexStride"));
    /// The [VarHandle] of `pipelineIndexStride` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineIndexStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineIndexStride"));
    /// The byte offset of `pipelineIndexOffset`.
    public static final long OFFSET_pipelineIndexOffset = LAYOUT.byteOffset(PathElement.groupElement("pipelineIndexOffset"));
    /// The memory layout of `pipelineIndexOffset`.
    public static final MemoryLayout LAYOUT_pipelineIndexOffset = LAYOUT.select(PathElement.groupElement("pipelineIndexOffset"));
    /// The [VarHandle] of `pipelineIndexOffset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pipelineIndexOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pipelineIndexOffset"));

    /// Creates `VkPipelineCacheHeaderVersionSafetyCriticalOne` with the given segment.
    /// @param segment the memory segment
    public VkPipelineCacheHeaderVersionSafetyCriticalOne(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPipelineCacheHeaderVersionSafetyCriticalOne` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPipelineCacheHeaderVersionSafetyCriticalOne` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPipelineCacheHeaderVersionSafetyCriticalOne ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPipelineCacheHeaderVersionSafetyCriticalOne(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPipelineCacheHeaderVersionSafetyCriticalOne` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPipelineCacheHeaderVersionSafetyCriticalOne` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPipelineCacheHeaderVersionSafetyCriticalOne`
    public static VkPipelineCacheHeaderVersionSafetyCriticalOne alloc(SegmentAllocator allocator) { return new VkPipelineCacheHeaderVersionSafetyCriticalOne(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPipelineCacheHeaderVersionSafetyCriticalOne` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPipelineCacheHeaderVersionSafetyCriticalOne`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPipelineCacheHeaderVersionSafetyCriticalOne` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param headerVersionOne `headerVersionOne`
    /// @param validationVersion `validationVersion`
    /// @param implementationData `implementationData`
    /// @param pipelineIndexCount `pipelineIndexCount`
    /// @param pipelineIndexStride `pipelineIndexStride`
    /// @param pipelineIndexOffset `pipelineIndexOffset`
    /// @return the allocated `VkPipelineCacheHeaderVersionSafetyCriticalOne`
    public static VkPipelineCacheHeaderVersionSafetyCriticalOne allocInit(SegmentAllocator allocator, MemorySegment headerVersionOne, int validationVersion, int implementationData, int pipelineIndexCount, int pipelineIndexStride, long pipelineIndexOffset) {
        return alloc(allocator).headerVersionOne(headerVersionOne).validationVersion(validationVersion).implementationData(implementationData).pipelineIndexCount(pipelineIndexCount).pipelineIndexStride(pipelineIndexStride).pipelineIndexOffset(pipelineIndexOffset);
    }

    /// Allocates a `VkPipelineCacheHeaderVersionSafetyCriticalOne` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param headerVersionOne `headerVersionOne`
    /// @param validationVersion `validationVersion`
    /// @param implementationData `implementationData`
    /// @param pipelineIndexCount `pipelineIndexCount`
    /// @param pipelineIndexStride `pipelineIndexStride`
    /// @return the allocated `VkPipelineCacheHeaderVersionSafetyCriticalOne`
    public static VkPipelineCacheHeaderVersionSafetyCriticalOne allocInit(SegmentAllocator allocator, MemorySegment headerVersionOne, int validationVersion, int implementationData, int pipelineIndexCount, int pipelineIndexStride) {
        return alloc(allocator).headerVersionOne(headerVersionOne).validationVersion(validationVersion).implementationData(implementationData).pipelineIndexCount(pipelineIndexCount).pipelineIndexStride(pipelineIndexStride);
    }

    /// Allocates a `VkPipelineCacheHeaderVersionSafetyCriticalOne` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param headerVersionOne `headerVersionOne`
    /// @param validationVersion `validationVersion`
    /// @param implementationData `implementationData`
    /// @param pipelineIndexCount `pipelineIndexCount`
    /// @return the allocated `VkPipelineCacheHeaderVersionSafetyCriticalOne`
    public static VkPipelineCacheHeaderVersionSafetyCriticalOne allocInit(SegmentAllocator allocator, MemorySegment headerVersionOne, int validationVersion, int implementationData, int pipelineIndexCount) {
        return alloc(allocator).headerVersionOne(headerVersionOne).validationVersion(validationVersion).implementationData(implementationData).pipelineIndexCount(pipelineIndexCount);
    }

    /// Allocates a `VkPipelineCacheHeaderVersionSafetyCriticalOne` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param headerVersionOne `headerVersionOne`
    /// @param validationVersion `validationVersion`
    /// @param implementationData `implementationData`
    /// @return the allocated `VkPipelineCacheHeaderVersionSafetyCriticalOne`
    public static VkPipelineCacheHeaderVersionSafetyCriticalOne allocInit(SegmentAllocator allocator, MemorySegment headerVersionOne, int validationVersion, int implementationData) {
        return alloc(allocator).headerVersionOne(headerVersionOne).validationVersion(validationVersion).implementationData(implementationData);
    }

    /// Allocates a `VkPipelineCacheHeaderVersionSafetyCriticalOne` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param headerVersionOne `headerVersionOne`
    /// @param validationVersion `validationVersion`
    /// @return the allocated `VkPipelineCacheHeaderVersionSafetyCriticalOne`
    public static VkPipelineCacheHeaderVersionSafetyCriticalOne allocInit(SegmentAllocator allocator, MemorySegment headerVersionOne, int validationVersion) {
        return alloc(allocator).headerVersionOne(headerVersionOne).validationVersion(validationVersion);
    }

    /// Allocates a `VkPipelineCacheHeaderVersionSafetyCriticalOne` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param headerVersionOne `headerVersionOne`
    /// @return the allocated `VkPipelineCacheHeaderVersionSafetyCriticalOne`
    public static VkPipelineCacheHeaderVersionSafetyCriticalOne allocInit(SegmentAllocator allocator, MemorySegment headerVersionOne) {
        return alloc(allocator).headerVersionOne(headerVersionOne);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPipelineCacheHeaderVersionSafetyCriticalOne copyFrom(VkPipelineCacheHeaderVersionSafetyCriticalOne src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `headerVersionOne` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment headerVersionOne(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_headerVersionOne, index), LAYOUT_headerVersionOne); }
    /// {@return `headerVersionOne`}
    public MemorySegment headerVersionOne() { return headerVersionOne(this.segment(), 0L); }
    /// Sets `headerVersionOne` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void headerVersionOne(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_headerVersionOne, index), LAYOUT_headerVersionOne.byteSize()); }
    /// Sets `headerVersionOne` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionSafetyCriticalOne headerVersionOne(MemorySegment value) { headerVersionOne(this.segment(), 0L, value); return this; }
    /// Accepts `headerVersionOne` with the given function.
    /// @param func the function
    /// @return `this`
    public VkPipelineCacheHeaderVersionSafetyCriticalOne headerVersionOne(Consumer<overrungl.vulkan.struct.VkPipelineCacheHeaderVersionOne> func) { func.accept(overrungl.vulkan.struct.VkPipelineCacheHeaderVersionOne.of(headerVersionOne())); return this; }

    /// {@return `validationVersion` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int validationVersion(MemorySegment segment, long index) { return (int) VH_validationVersion.get(segment, 0L, index); }
    /// {@return `validationVersion`}
    public int validationVersion() { return validationVersion(this.segment(), 0L); }
    /// Sets `validationVersion` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void validationVersion(MemorySegment segment, long index, int value) { VH_validationVersion.set(segment, 0L, index, value); }
    /// Sets `validationVersion` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionSafetyCriticalOne validationVersion(int value) { validationVersion(this.segment(), 0L, value); return this; }

    /// {@return `implementationData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int implementationData(MemorySegment segment, long index) { return (int) VH_implementationData.get(segment, 0L, index); }
    /// {@return `implementationData`}
    public int implementationData() { return implementationData(this.segment(), 0L); }
    /// Sets `implementationData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void implementationData(MemorySegment segment, long index, int value) { VH_implementationData.set(segment, 0L, index, value); }
    /// Sets `implementationData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionSafetyCriticalOne implementationData(int value) { implementationData(this.segment(), 0L, value); return this; }

    /// {@return `pipelineIndexCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelineIndexCount(MemorySegment segment, long index) { return (int) VH_pipelineIndexCount.get(segment, 0L, index); }
    /// {@return `pipelineIndexCount`}
    public int pipelineIndexCount() { return pipelineIndexCount(this.segment(), 0L); }
    /// Sets `pipelineIndexCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineIndexCount(MemorySegment segment, long index, int value) { VH_pipelineIndexCount.set(segment, 0L, index, value); }
    /// Sets `pipelineIndexCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionSafetyCriticalOne pipelineIndexCount(int value) { pipelineIndexCount(this.segment(), 0L, value); return this; }

    /// {@return `pipelineIndexStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int pipelineIndexStride(MemorySegment segment, long index) { return (int) VH_pipelineIndexStride.get(segment, 0L, index); }
    /// {@return `pipelineIndexStride`}
    public int pipelineIndexStride() { return pipelineIndexStride(this.segment(), 0L); }
    /// Sets `pipelineIndexStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineIndexStride(MemorySegment segment, long index, int value) { VH_pipelineIndexStride.set(segment, 0L, index, value); }
    /// Sets `pipelineIndexStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionSafetyCriticalOne pipelineIndexStride(int value) { pipelineIndexStride(this.segment(), 0L, value); return this; }

    /// {@return `pipelineIndexOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long pipelineIndexOffset(MemorySegment segment, long index) { return (long) VH_pipelineIndexOffset.get(segment, 0L, index); }
    /// {@return `pipelineIndexOffset`}
    public long pipelineIndexOffset() { return pipelineIndexOffset(this.segment(), 0L); }
    /// Sets `pipelineIndexOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pipelineIndexOffset(MemorySegment segment, long index, long value) { VH_pipelineIndexOffset.set(segment, 0L, index, value); }
    /// Sets `pipelineIndexOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPipelineCacheHeaderVersionSafetyCriticalOne pipelineIndexOffset(long value) { pipelineIndexOffset(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPipelineCacheHeaderVersionSafetyCriticalOne].
    public static final class Buffer extends VkPipelineCacheHeaderVersionSafetyCriticalOne {
        private final long elementCount;

        /// Creates `VkPipelineCacheHeaderVersionSafetyCriticalOne.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPipelineCacheHeaderVersionSafetyCriticalOne`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPipelineCacheHeaderVersionSafetyCriticalOne`
        public VkPipelineCacheHeaderVersionSafetyCriticalOne asSlice(long index) { return new VkPipelineCacheHeaderVersionSafetyCriticalOne(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPipelineCacheHeaderVersionSafetyCriticalOne`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPipelineCacheHeaderVersionSafetyCriticalOne`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `headerVersionOne` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment headerVersionOneAt(long index) { return headerVersionOne(this.segment(), index); }
        /// Sets `headerVersionOne` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer headerVersionOneAt(long index, MemorySegment value) { headerVersionOne(this.segment(), index, value); return this; }
        /// Accepts `headerVersionOne` with the given function.
        /// @param index the index of the struct buffer
        /// @param func the function
        /// @return `this`
        public Buffer headerVersionOneAt(long index, Consumer<overrungl.vulkan.struct.VkPipelineCacheHeaderVersionOne> func) { func.accept(overrungl.vulkan.struct.VkPipelineCacheHeaderVersionOne.of(headerVersionOneAt(index))); return this; }

        /// {@return `validationVersion` at the given index}
        /// @param index the index of the struct buffer
        public int validationVersionAt(long index) { return validationVersion(this.segment(), index); }
        /// Sets `validationVersion` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer validationVersionAt(long index, int value) { validationVersion(this.segment(), index, value); return this; }

        /// {@return `implementationData` at the given index}
        /// @param index the index of the struct buffer
        public int implementationDataAt(long index) { return implementationData(this.segment(), index); }
        /// Sets `implementationData` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer implementationDataAt(long index, int value) { implementationData(this.segment(), index, value); return this; }

        /// {@return `pipelineIndexCount` at the given index}
        /// @param index the index of the struct buffer
        public int pipelineIndexCountAt(long index) { return pipelineIndexCount(this.segment(), index); }
        /// Sets `pipelineIndexCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pipelineIndexCountAt(long index, int value) { pipelineIndexCount(this.segment(), index, value); return this; }

        /// {@return `pipelineIndexStride` at the given index}
        /// @param index the index of the struct buffer
        public int pipelineIndexStrideAt(long index) { return pipelineIndexStride(this.segment(), index); }
        /// Sets `pipelineIndexStride` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pipelineIndexStrideAt(long index, int value) { pipelineIndexStride(this.segment(), index, value); return this; }

        /// {@return `pipelineIndexOffset` at the given index}
        /// @param index the index of the struct buffer
        public long pipelineIndexOffsetAt(long index) { return pipelineIndexOffset(this.segment(), index); }
        /// Sets `pipelineIndexOffset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pipelineIndexOffsetAt(long index, long value) { pipelineIndexOffset(this.segment(), index, value); return this; }

    }
}

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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;
import java.util.function.*;

/// ## Layout
/// ```
/// struct VkBuildPartitionedAccelerationStructureInfoNV {
///     (int) VkStructureType sType;
///     void* pNext;
///     (struct VkPartitionedAccelerationStructureInstancesInputNV) VkPartitionedAccelerationStructureInstancesInputNV input;
///     (uint64_t) VkDeviceAddress srcAccelerationStructureData;
///     (uint64_t) VkDeviceAddress dstAccelerationStructureData;
///     (uint64_t) VkDeviceAddress scratchData;
///     (uint64_t) VkDeviceAddress srcInfos;
///     (uint64_t) VkDeviceAddress srcInfosCount;
/// };
/// ```
public sealed class VkBuildPartitionedAccelerationStructureInfoNV extends GroupType {
    /// The struct layout of `VkBuildPartitionedAccelerationStructureInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.nv.struct.VkPartitionedAccelerationStructureInstancesInputNV.LAYOUT.withName("input"),
        ValueLayout.JAVA_LONG.withName("srcAccelerationStructureData"),
        ValueLayout.JAVA_LONG.withName("dstAccelerationStructureData"),
        ValueLayout.JAVA_LONG.withName("scratchData"),
        ValueLayout.JAVA_LONG.withName("srcInfos"),
        ValueLayout.JAVA_LONG.withName("srcInfosCount")
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
    /// The byte offset of `input`.
    public static final long OFFSET_input = LAYOUT.byteOffset(PathElement.groupElement("input"));
    /// The memory layout of `input`.
    public static final MemoryLayout LAYOUT_input = LAYOUT.select(PathElement.groupElement("input"));
    /// The byte offset of `srcAccelerationStructureData`.
    public static final long OFFSET_srcAccelerationStructureData = LAYOUT.byteOffset(PathElement.groupElement("srcAccelerationStructureData"));
    /// The memory layout of `srcAccelerationStructureData`.
    public static final MemoryLayout LAYOUT_srcAccelerationStructureData = LAYOUT.select(PathElement.groupElement("srcAccelerationStructureData"));
    /// The [VarHandle] of `srcAccelerationStructureData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcAccelerationStructureData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAccelerationStructureData"));
    /// The byte offset of `dstAccelerationStructureData`.
    public static final long OFFSET_dstAccelerationStructureData = LAYOUT.byteOffset(PathElement.groupElement("dstAccelerationStructureData"));
    /// The memory layout of `dstAccelerationStructureData`.
    public static final MemoryLayout LAYOUT_dstAccelerationStructureData = LAYOUT.select(PathElement.groupElement("dstAccelerationStructureData"));
    /// The [VarHandle] of `dstAccelerationStructureData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstAccelerationStructureData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAccelerationStructureData"));
    /// The byte offset of `scratchData`.
    public static final long OFFSET_scratchData = LAYOUT.byteOffset(PathElement.groupElement("scratchData"));
    /// The memory layout of `scratchData`.
    public static final MemoryLayout LAYOUT_scratchData = LAYOUT.select(PathElement.groupElement("scratchData"));
    /// The [VarHandle] of `scratchData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_scratchData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("scratchData"));
    /// The byte offset of `srcInfos`.
    public static final long OFFSET_srcInfos = LAYOUT.byteOffset(PathElement.groupElement("srcInfos"));
    /// The memory layout of `srcInfos`.
    public static final MemoryLayout LAYOUT_srcInfos = LAYOUT.select(PathElement.groupElement("srcInfos"));
    /// The [VarHandle] of `srcInfos` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcInfos = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcInfos"));
    /// The byte offset of `srcInfosCount`.
    public static final long OFFSET_srcInfosCount = LAYOUT.byteOffset(PathElement.groupElement("srcInfosCount"));
    /// The memory layout of `srcInfosCount`.
    public static final MemoryLayout LAYOUT_srcInfosCount = LAYOUT.select(PathElement.groupElement("srcInfosCount"));
    /// The [VarHandle] of `srcInfosCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcInfosCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcInfosCount"));

    /// Creates `VkBuildPartitionedAccelerationStructureInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkBuildPartitionedAccelerationStructureInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBuildPartitionedAccelerationStructureInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBuildPartitionedAccelerationStructureInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBuildPartitionedAccelerationStructureInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBuildPartitionedAccelerationStructureInfoNV(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkBuildPartitionedAccelerationStructureInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkBuildPartitionedAccelerationStructureInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBuildPartitionedAccelerationStructureInfoNV`
    public static VkBuildPartitionedAccelerationStructureInfoNV alloc(SegmentAllocator allocator) { return new VkBuildPartitionedAccelerationStructureInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBuildPartitionedAccelerationStructureInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBuildPartitionedAccelerationStructureInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkBuildPartitionedAccelerationStructureInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param input `input`
    /// @param srcAccelerationStructureData `srcAccelerationStructureData`
    /// @param dstAccelerationStructureData `dstAccelerationStructureData`
    /// @param scratchData `scratchData`
    /// @param srcInfos `srcInfos`
    /// @param srcInfosCount `srcInfosCount`
    /// @return the allocated `VkBuildPartitionedAccelerationStructureInfoNV`
    public static VkBuildPartitionedAccelerationStructureInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment input, long srcAccelerationStructureData, long dstAccelerationStructureData, long scratchData, long srcInfos, long srcInfosCount) {
        return alloc(allocator).sType(sType).pNext(pNext).input(input).srcAccelerationStructureData(srcAccelerationStructureData).dstAccelerationStructureData(dstAccelerationStructureData).scratchData(scratchData).srcInfos(srcInfos).srcInfosCount(srcInfosCount);
    }

    /// Allocates a `VkBuildPartitionedAccelerationStructureInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param input `input`
    /// @param srcAccelerationStructureData `srcAccelerationStructureData`
    /// @param dstAccelerationStructureData `dstAccelerationStructureData`
    /// @param scratchData `scratchData`
    /// @param srcInfos `srcInfos`
    /// @return the allocated `VkBuildPartitionedAccelerationStructureInfoNV`
    public static VkBuildPartitionedAccelerationStructureInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment input, long srcAccelerationStructureData, long dstAccelerationStructureData, long scratchData, long srcInfos) {
        return alloc(allocator).sType(sType).pNext(pNext).input(input).srcAccelerationStructureData(srcAccelerationStructureData).dstAccelerationStructureData(dstAccelerationStructureData).scratchData(scratchData).srcInfos(srcInfos);
    }

    /// Allocates a `VkBuildPartitionedAccelerationStructureInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param input `input`
    /// @param srcAccelerationStructureData `srcAccelerationStructureData`
    /// @param dstAccelerationStructureData `dstAccelerationStructureData`
    /// @param scratchData `scratchData`
    /// @return the allocated `VkBuildPartitionedAccelerationStructureInfoNV`
    public static VkBuildPartitionedAccelerationStructureInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment input, long srcAccelerationStructureData, long dstAccelerationStructureData, long scratchData) {
        return alloc(allocator).sType(sType).pNext(pNext).input(input).srcAccelerationStructureData(srcAccelerationStructureData).dstAccelerationStructureData(dstAccelerationStructureData).scratchData(scratchData);
    }

    /// Allocates a `VkBuildPartitionedAccelerationStructureInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param input `input`
    /// @param srcAccelerationStructureData `srcAccelerationStructureData`
    /// @param dstAccelerationStructureData `dstAccelerationStructureData`
    /// @return the allocated `VkBuildPartitionedAccelerationStructureInfoNV`
    public static VkBuildPartitionedAccelerationStructureInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment input, long srcAccelerationStructureData, long dstAccelerationStructureData) {
        return alloc(allocator).sType(sType).pNext(pNext).input(input).srcAccelerationStructureData(srcAccelerationStructureData).dstAccelerationStructureData(dstAccelerationStructureData);
    }

    /// Allocates a `VkBuildPartitionedAccelerationStructureInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param input `input`
    /// @param srcAccelerationStructureData `srcAccelerationStructureData`
    /// @return the allocated `VkBuildPartitionedAccelerationStructureInfoNV`
    public static VkBuildPartitionedAccelerationStructureInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment input, long srcAccelerationStructureData) {
        return alloc(allocator).sType(sType).pNext(pNext).input(input).srcAccelerationStructureData(srcAccelerationStructureData);
    }

    /// Allocates a `VkBuildPartitionedAccelerationStructureInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param input `input`
    /// @return the allocated `VkBuildPartitionedAccelerationStructureInfoNV`
    public static VkBuildPartitionedAccelerationStructureInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, MemorySegment input) {
        return alloc(allocator).sType(sType).pNext(pNext).input(input);
    }

    /// Allocates a `VkBuildPartitionedAccelerationStructureInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkBuildPartitionedAccelerationStructureInfoNV`
    public static VkBuildPartitionedAccelerationStructureInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkBuildPartitionedAccelerationStructureInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkBuildPartitionedAccelerationStructureInfoNV`
    public static VkBuildPartitionedAccelerationStructureInfoNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBuildPartitionedAccelerationStructureInfoNV copyFrom(VkBuildPartitionedAccelerationStructureInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkBuildPartitionedAccelerationStructureInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkBuildPartitionedAccelerationStructureInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `input` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment input(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_input, index), LAYOUT_input); }
    /// {@return `input`}
    public MemorySegment input() { return input(this.segment(), 0L); }
    /// Sets `input` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void input(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_input, index), LAYOUT_input.byteSize()); }
    /// Sets `input` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBuildPartitionedAccelerationStructureInfoNV input(MemorySegment value) { input(this.segment(), 0L, value); return this; }
    /// Accepts `input` with the given function.
    /// @param func the function
    /// @return `this`
    public VkBuildPartitionedAccelerationStructureInfoNV input(Consumer<overrungl.vulkan.nv.struct.VkPartitionedAccelerationStructureInstancesInputNV> func) { func.accept(overrungl.vulkan.nv.struct.VkPartitionedAccelerationStructureInstancesInputNV.of(input())); return this; }

    /// {@return `srcAccelerationStructureData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long srcAccelerationStructureData(MemorySegment segment, long index) { return (long) VH_srcAccelerationStructureData.get(segment, 0L, index); }
    /// {@return `srcAccelerationStructureData`}
    public long srcAccelerationStructureData() { return srcAccelerationStructureData(this.segment(), 0L); }
    /// Sets `srcAccelerationStructureData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcAccelerationStructureData(MemorySegment segment, long index, long value) { VH_srcAccelerationStructureData.set(segment, 0L, index, value); }
    /// Sets `srcAccelerationStructureData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBuildPartitionedAccelerationStructureInfoNV srcAccelerationStructureData(long value) { srcAccelerationStructureData(this.segment(), 0L, value); return this; }

    /// {@return `dstAccelerationStructureData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dstAccelerationStructureData(MemorySegment segment, long index) { return (long) VH_dstAccelerationStructureData.get(segment, 0L, index); }
    /// {@return `dstAccelerationStructureData`}
    public long dstAccelerationStructureData() { return dstAccelerationStructureData(this.segment(), 0L); }
    /// Sets `dstAccelerationStructureData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstAccelerationStructureData(MemorySegment segment, long index, long value) { VH_dstAccelerationStructureData.set(segment, 0L, index, value); }
    /// Sets `dstAccelerationStructureData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBuildPartitionedAccelerationStructureInfoNV dstAccelerationStructureData(long value) { dstAccelerationStructureData(this.segment(), 0L, value); return this; }

    /// {@return `scratchData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long scratchData(MemorySegment segment, long index) { return (long) VH_scratchData.get(segment, 0L, index); }
    /// {@return `scratchData`}
    public long scratchData() { return scratchData(this.segment(), 0L); }
    /// Sets `scratchData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void scratchData(MemorySegment segment, long index, long value) { VH_scratchData.set(segment, 0L, index, value); }
    /// Sets `scratchData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBuildPartitionedAccelerationStructureInfoNV scratchData(long value) { scratchData(this.segment(), 0L, value); return this; }

    /// {@return `srcInfos` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long srcInfos(MemorySegment segment, long index) { return (long) VH_srcInfos.get(segment, 0L, index); }
    /// {@return `srcInfos`}
    public long srcInfos() { return srcInfos(this.segment(), 0L); }
    /// Sets `srcInfos` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcInfos(MemorySegment segment, long index, long value) { VH_srcInfos.set(segment, 0L, index, value); }
    /// Sets `srcInfos` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBuildPartitionedAccelerationStructureInfoNV srcInfos(long value) { srcInfos(this.segment(), 0L, value); return this; }

    /// {@return `srcInfosCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long srcInfosCount(MemorySegment segment, long index) { return (long) VH_srcInfosCount.get(segment, 0L, index); }
    /// {@return `srcInfosCount`}
    public long srcInfosCount() { return srcInfosCount(this.segment(), 0L); }
    /// Sets `srcInfosCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcInfosCount(MemorySegment segment, long index, long value) { VH_srcInfosCount.set(segment, 0L, index, value); }
    /// Sets `srcInfosCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBuildPartitionedAccelerationStructureInfoNV srcInfosCount(long value) { srcInfosCount(this.segment(), 0L, value); return this; }

    /// A buffer of [VkBuildPartitionedAccelerationStructureInfoNV].
    public static final class Buffer extends VkBuildPartitionedAccelerationStructureInfoNV {
        private final long elementCount;

        /// Creates `VkBuildPartitionedAccelerationStructureInfoNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkBuildPartitionedAccelerationStructureInfoNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkBuildPartitionedAccelerationStructureInfoNV`
        public VkBuildPartitionedAccelerationStructureInfoNV asSlice(long index) { return new VkBuildPartitionedAccelerationStructureInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkBuildPartitionedAccelerationStructureInfoNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkBuildPartitionedAccelerationStructureInfoNV`
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

        /// {@return `input` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment inputAt(long index) { return input(this.segment(), index); }
        /// Sets `input` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer inputAt(long index, MemorySegment value) { input(this.segment(), index, value); return this; }
        /// Accepts `input` with the given function.
        /// @param index the index of the struct buffer
        /// @param func the function
        /// @return `this`
        public Buffer inputAt(long index, Consumer<overrungl.vulkan.nv.struct.VkPartitionedAccelerationStructureInstancesInputNV> func) { func.accept(overrungl.vulkan.nv.struct.VkPartitionedAccelerationStructureInstancesInputNV.of(inputAt(index))); return this; }

        /// {@return `srcAccelerationStructureData` at the given index}
        /// @param index the index of the struct buffer
        public long srcAccelerationStructureDataAt(long index) { return srcAccelerationStructureData(this.segment(), index); }
        /// Sets `srcAccelerationStructureData` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcAccelerationStructureDataAt(long index, long value) { srcAccelerationStructureData(this.segment(), index, value); return this; }

        /// {@return `dstAccelerationStructureData` at the given index}
        /// @param index the index of the struct buffer
        public long dstAccelerationStructureDataAt(long index) { return dstAccelerationStructureData(this.segment(), index); }
        /// Sets `dstAccelerationStructureData` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstAccelerationStructureDataAt(long index, long value) { dstAccelerationStructureData(this.segment(), index, value); return this; }

        /// {@return `scratchData` at the given index}
        /// @param index the index of the struct buffer
        public long scratchDataAt(long index) { return scratchData(this.segment(), index); }
        /// Sets `scratchData` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer scratchDataAt(long index, long value) { scratchData(this.segment(), index, value); return this; }

        /// {@return `srcInfos` at the given index}
        /// @param index the index of the struct buffer
        public long srcInfosAt(long index) { return srcInfos(this.segment(), index); }
        /// Sets `srcInfos` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcInfosAt(long index, long value) { srcInfos(this.segment(), index, value); return this; }

        /// {@return `srcInfosCount` at the given index}
        /// @param index the index of the struct buffer
        public long srcInfosCountAt(long index) { return srcInfosCount(this.segment(), index); }
        /// Sets `srcInfosCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcInfosCountAt(long index, long value) { srcInfosCount(this.segment(), index, value); return this; }

    }
}

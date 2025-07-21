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
/// struct VkVideoEncodeAV1RateControlLayerInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint32_t) VkBool32 useMinQIndex;
///     (struct VkVideoEncodeAV1QIndexKHR) VkVideoEncodeAV1QIndexKHR minQIndex;
///     (uint32_t) VkBool32 useMaxQIndex;
///     (struct VkVideoEncodeAV1QIndexKHR) VkVideoEncodeAV1QIndexKHR maxQIndex;
///     (uint32_t) VkBool32 useMaxFrameSize;
///     (struct VkVideoEncodeAV1FrameSizeKHR) VkVideoEncodeAV1FrameSizeKHR maxFrameSize;
/// };
/// ```
public final class VkVideoEncodeAV1RateControlLayerInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeAV1RateControlLayerInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("useMinQIndex"),
        overrungl.vulkan.khr.struct.VkVideoEncodeAV1QIndexKHR.LAYOUT.withName("minQIndex"),
        ValueLayout.JAVA_INT.withName("useMaxQIndex"),
        overrungl.vulkan.khr.struct.VkVideoEncodeAV1QIndexKHR.LAYOUT.withName("maxQIndex"),
        ValueLayout.JAVA_INT.withName("useMaxFrameSize"),
        overrungl.vulkan.khr.struct.VkVideoEncodeAV1FrameSizeKHR.LAYOUT.withName("maxFrameSize")
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
    /// The byte offset of `useMinQIndex`.
    public static final long OFFSET_useMinQIndex = LAYOUT.byteOffset(PathElement.groupElement("useMinQIndex"));
    /// The memory layout of `useMinQIndex`.
    public static final MemoryLayout LAYOUT_useMinQIndex = LAYOUT.select(PathElement.groupElement("useMinQIndex"));
    /// The [VarHandle] of `useMinQIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_useMinQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("useMinQIndex"));
    /// The byte offset of `minQIndex`.
    public static final long OFFSET_minQIndex = LAYOUT.byteOffset(PathElement.groupElement("minQIndex"));
    /// The memory layout of `minQIndex`.
    public static final MemoryLayout LAYOUT_minQIndex = LAYOUT.select(PathElement.groupElement("minQIndex"));
    /// The byte offset of `useMaxQIndex`.
    public static final long OFFSET_useMaxQIndex = LAYOUT.byteOffset(PathElement.groupElement("useMaxQIndex"));
    /// The memory layout of `useMaxQIndex`.
    public static final MemoryLayout LAYOUT_useMaxQIndex = LAYOUT.select(PathElement.groupElement("useMaxQIndex"));
    /// The [VarHandle] of `useMaxQIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_useMaxQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("useMaxQIndex"));
    /// The byte offset of `maxQIndex`.
    public static final long OFFSET_maxQIndex = LAYOUT.byteOffset(PathElement.groupElement("maxQIndex"));
    /// The memory layout of `maxQIndex`.
    public static final MemoryLayout LAYOUT_maxQIndex = LAYOUT.select(PathElement.groupElement("maxQIndex"));
    /// The byte offset of `useMaxFrameSize`.
    public static final long OFFSET_useMaxFrameSize = LAYOUT.byteOffset(PathElement.groupElement("useMaxFrameSize"));
    /// The memory layout of `useMaxFrameSize`.
    public static final MemoryLayout LAYOUT_useMaxFrameSize = LAYOUT.select(PathElement.groupElement("useMaxFrameSize"));
    /// The [VarHandle] of `useMaxFrameSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_useMaxFrameSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("useMaxFrameSize"));
    /// The byte offset of `maxFrameSize`.
    public static final long OFFSET_maxFrameSize = LAYOUT.byteOffset(PathElement.groupElement("maxFrameSize"));
    /// The memory layout of `maxFrameSize`.
    public static final MemoryLayout LAYOUT_maxFrameSize = LAYOUT.select(PathElement.groupElement("maxFrameSize"));

    /// Creates `VkVideoEncodeAV1RateControlLayerInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeAV1RateControlLayerInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeAV1RateControlLayerInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1RateControlLayerInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1RateControlLayerInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeAV1RateControlLayerInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1RateControlLayerInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1RateControlLayerInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeAV1RateControlLayerInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1RateControlLayerInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1RateControlLayerInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeAV1RateControlLayerInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeAV1RateControlLayerInfoKHR`
    public static VkVideoEncodeAV1RateControlLayerInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1RateControlLayerInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeAV1RateControlLayerInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeAV1RateControlLayerInfoKHR`
    public static VkVideoEncodeAV1RateControlLayerInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeAV1RateControlLayerInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoEncodeAV1RateControlLayerInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param useMinQIndex `useMinQIndex`
    /// @param minQIndex `minQIndex`
    /// @param useMaxQIndex `useMaxQIndex`
    /// @param maxQIndex `maxQIndex`
    /// @param useMaxFrameSize `useMaxFrameSize`
    /// @param maxFrameSize `maxFrameSize`
    /// @return the allocated `VkVideoEncodeAV1RateControlLayerInfoKHR`
    public static VkVideoEncodeAV1RateControlLayerInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int useMinQIndex, MemorySegment minQIndex, int useMaxQIndex, MemorySegment maxQIndex, int useMaxFrameSize, MemorySegment maxFrameSize) {
        return alloc(allocator).sType(sType).pNext(pNext).useMinQIndex(useMinQIndex).minQIndex(minQIndex).useMaxQIndex(useMaxQIndex).maxQIndex(maxQIndex).useMaxFrameSize(useMaxFrameSize).maxFrameSize(maxFrameSize);
    }

    /// Allocates a `VkVideoEncodeAV1RateControlLayerInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param useMinQIndex `useMinQIndex`
    /// @param minQIndex `minQIndex`
    /// @param useMaxQIndex `useMaxQIndex`
    /// @param maxQIndex `maxQIndex`
    /// @param useMaxFrameSize `useMaxFrameSize`
    /// @return the allocated `VkVideoEncodeAV1RateControlLayerInfoKHR`
    public static VkVideoEncodeAV1RateControlLayerInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int useMinQIndex, MemorySegment minQIndex, int useMaxQIndex, MemorySegment maxQIndex, int useMaxFrameSize) {
        return alloc(allocator).sType(sType).pNext(pNext).useMinQIndex(useMinQIndex).minQIndex(minQIndex).useMaxQIndex(useMaxQIndex).maxQIndex(maxQIndex).useMaxFrameSize(useMaxFrameSize);
    }

    /// Allocates a `VkVideoEncodeAV1RateControlLayerInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param useMinQIndex `useMinQIndex`
    /// @param minQIndex `minQIndex`
    /// @param useMaxQIndex `useMaxQIndex`
    /// @param maxQIndex `maxQIndex`
    /// @return the allocated `VkVideoEncodeAV1RateControlLayerInfoKHR`
    public static VkVideoEncodeAV1RateControlLayerInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int useMinQIndex, MemorySegment minQIndex, int useMaxQIndex, MemorySegment maxQIndex) {
        return alloc(allocator).sType(sType).pNext(pNext).useMinQIndex(useMinQIndex).minQIndex(minQIndex).useMaxQIndex(useMaxQIndex).maxQIndex(maxQIndex);
    }

    /// Allocates a `VkVideoEncodeAV1RateControlLayerInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param useMinQIndex `useMinQIndex`
    /// @param minQIndex `minQIndex`
    /// @param useMaxQIndex `useMaxQIndex`
    /// @return the allocated `VkVideoEncodeAV1RateControlLayerInfoKHR`
    public static VkVideoEncodeAV1RateControlLayerInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int useMinQIndex, MemorySegment minQIndex, int useMaxQIndex) {
        return alloc(allocator).sType(sType).pNext(pNext).useMinQIndex(useMinQIndex).minQIndex(minQIndex).useMaxQIndex(useMaxQIndex);
    }

    /// Allocates a `VkVideoEncodeAV1RateControlLayerInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param useMinQIndex `useMinQIndex`
    /// @param minQIndex `minQIndex`
    /// @return the allocated `VkVideoEncodeAV1RateControlLayerInfoKHR`
    public static VkVideoEncodeAV1RateControlLayerInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int useMinQIndex, MemorySegment minQIndex) {
        return alloc(allocator).sType(sType).pNext(pNext).useMinQIndex(useMinQIndex).minQIndex(minQIndex);
    }

    /// Allocates a `VkVideoEncodeAV1RateControlLayerInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param useMinQIndex `useMinQIndex`
    /// @return the allocated `VkVideoEncodeAV1RateControlLayerInfoKHR`
    public static VkVideoEncodeAV1RateControlLayerInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int useMinQIndex) {
        return alloc(allocator).sType(sType).pNext(pNext).useMinQIndex(useMinQIndex);
    }

    /// Allocates a `VkVideoEncodeAV1RateControlLayerInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkVideoEncodeAV1RateControlLayerInfoKHR`
    public static VkVideoEncodeAV1RateControlLayerInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkVideoEncodeAV1RateControlLayerInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkVideoEncodeAV1RateControlLayerInfoKHR`
    public static VkVideoEncodeAV1RateControlLayerInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR copyFrom(VkVideoEncodeAV1RateControlLayerInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeAV1RateControlLayerInfoKHR reinterpret(long count) { return new VkVideoEncodeAV1RateControlLayerInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoEncodeAV1RateControlLayerInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeAV1RateControlLayerInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `useMinQIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int useMinQIndex(MemorySegment segment, long index) { return (int) VH_useMinQIndex.get(segment, 0L, index); }
    /// {@return `useMinQIndex`}
    public int useMinQIndex() { return useMinQIndex(this.segment(), 0L); }
    /// Sets `useMinQIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void useMinQIndex(MemorySegment segment, long index, int value) { VH_useMinQIndex.set(segment, 0L, index, value); }
    /// Sets `useMinQIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR useMinQIndex(int value) { useMinQIndex(this.segment(), 0L, value); return this; }

    /// {@return `minQIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment minQIndex(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_minQIndex, index), LAYOUT_minQIndex); }
    /// {@return `minQIndex`}
    public MemorySegment minQIndex() { return minQIndex(this.segment(), 0L); }
    /// Sets `minQIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minQIndex(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_minQIndex, index), LAYOUT_minQIndex.byteSize()); }
    /// Sets `minQIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR minQIndex(MemorySegment value) { minQIndex(this.segment(), 0L, value); return this; }
    /// Accepts `minQIndex` with the given function.
    /// @param func the function
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR minQIndex(Consumer<overrungl.vulkan.khr.struct.VkVideoEncodeAV1QIndexKHR> func) { func.accept(overrungl.vulkan.khr.struct.VkVideoEncodeAV1QIndexKHR.of(minQIndex())); return this; }

    /// {@return `useMaxQIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int useMaxQIndex(MemorySegment segment, long index) { return (int) VH_useMaxQIndex.get(segment, 0L, index); }
    /// {@return `useMaxQIndex`}
    public int useMaxQIndex() { return useMaxQIndex(this.segment(), 0L); }
    /// Sets `useMaxQIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void useMaxQIndex(MemorySegment segment, long index, int value) { VH_useMaxQIndex.set(segment, 0L, index, value); }
    /// Sets `useMaxQIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR useMaxQIndex(int value) { useMaxQIndex(this.segment(), 0L, value); return this; }

    /// {@return `maxQIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxQIndex(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxQIndex, index), LAYOUT_maxQIndex); }
    /// {@return `maxQIndex`}
    public MemorySegment maxQIndex() { return maxQIndex(this.segment(), 0L); }
    /// Sets `maxQIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxQIndex(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxQIndex, index), LAYOUT_maxQIndex.byteSize()); }
    /// Sets `maxQIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxQIndex(MemorySegment value) { maxQIndex(this.segment(), 0L, value); return this; }
    /// Accepts `maxQIndex` with the given function.
    /// @param func the function
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxQIndex(Consumer<overrungl.vulkan.khr.struct.VkVideoEncodeAV1QIndexKHR> func) { func.accept(overrungl.vulkan.khr.struct.VkVideoEncodeAV1QIndexKHR.of(maxQIndex())); return this; }

    /// {@return `useMaxFrameSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int useMaxFrameSize(MemorySegment segment, long index) { return (int) VH_useMaxFrameSize.get(segment, 0L, index); }
    /// {@return `useMaxFrameSize`}
    public int useMaxFrameSize() { return useMaxFrameSize(this.segment(), 0L); }
    /// Sets `useMaxFrameSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void useMaxFrameSize(MemorySegment segment, long index, int value) { VH_useMaxFrameSize.set(segment, 0L, index, value); }
    /// Sets `useMaxFrameSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR useMaxFrameSize(int value) { useMaxFrameSize(this.segment(), 0L, value); return this; }

    /// {@return `maxFrameSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment maxFrameSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxFrameSize, index), LAYOUT_maxFrameSize); }
    /// {@return `maxFrameSize`}
    public MemorySegment maxFrameSize() { return maxFrameSize(this.segment(), 0L); }
    /// Sets `maxFrameSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxFrameSize(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxFrameSize, index), LAYOUT_maxFrameSize.byteSize()); }
    /// Sets `maxFrameSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxFrameSize(MemorySegment value) { maxFrameSize(this.segment(), 0L, value); return this; }
    /// Accepts `maxFrameSize` with the given function.
    /// @param func the function
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxFrameSize(Consumer<overrungl.vulkan.khr.struct.VkVideoEncodeAV1FrameSizeKHR> func) { func.accept(overrungl.vulkan.khr.struct.VkVideoEncodeAV1FrameSizeKHR.of(maxFrameSize())); return this; }

    /// Creates a slice of `VkVideoEncodeAV1RateControlLayerInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeAV1RateControlLayerInfoKHR`
    public VkVideoEncodeAV1RateControlLayerInfoKHR asSlice(long index) { return new VkVideoEncodeAV1RateControlLayerInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeAV1RateControlLayerInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeAV1RateControlLayerInfoKHR`
    public VkVideoEncodeAV1RateControlLayerInfoKHR asSlice(long index, long count) { return new VkVideoEncodeAV1RateControlLayerInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeAV1RateControlLayerInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR at(long index, Consumer<VkVideoEncodeAV1RateControlLayerInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `useMinQIndex` at the given index}
    /// @param index the index of the struct buffer
    public int useMinQIndexAt(long index) { return useMinQIndex(this.segment(), index); }
    /// Sets `useMinQIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR useMinQIndexAt(long index, int value) { useMinQIndex(this.segment(), index, value); return this; }

    /// {@return `minQIndex` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment minQIndexAt(long index) { return minQIndex(this.segment(), index); }
    /// Sets `minQIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR minQIndexAt(long index, MemorySegment value) { minQIndex(this.segment(), index, value); return this; }
    /// Accepts `minQIndex` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR minQIndexAt(long index, Consumer<overrungl.vulkan.khr.struct.VkVideoEncodeAV1QIndexKHR> func) { func.accept(overrungl.vulkan.khr.struct.VkVideoEncodeAV1QIndexKHR.of(minQIndexAt(index))); return this; }

    /// {@return `useMaxQIndex` at the given index}
    /// @param index the index of the struct buffer
    public int useMaxQIndexAt(long index) { return useMaxQIndex(this.segment(), index); }
    /// Sets `useMaxQIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR useMaxQIndexAt(long index, int value) { useMaxQIndex(this.segment(), index, value); return this; }

    /// {@return `maxQIndex` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment maxQIndexAt(long index) { return maxQIndex(this.segment(), index); }
    /// Sets `maxQIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxQIndexAt(long index, MemorySegment value) { maxQIndex(this.segment(), index, value); return this; }
    /// Accepts `maxQIndex` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxQIndexAt(long index, Consumer<overrungl.vulkan.khr.struct.VkVideoEncodeAV1QIndexKHR> func) { func.accept(overrungl.vulkan.khr.struct.VkVideoEncodeAV1QIndexKHR.of(maxQIndexAt(index))); return this; }

    /// {@return `useMaxFrameSize` at the given index}
    /// @param index the index of the struct buffer
    public int useMaxFrameSizeAt(long index) { return useMaxFrameSize(this.segment(), index); }
    /// Sets `useMaxFrameSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR useMaxFrameSizeAt(long index, int value) { useMaxFrameSize(this.segment(), index, value); return this; }

    /// {@return `maxFrameSize` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment maxFrameSizeAt(long index) { return maxFrameSize(this.segment(), index); }
    /// Sets `maxFrameSize` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxFrameSizeAt(long index, MemorySegment value) { maxFrameSize(this.segment(), index, value); return this; }
    /// Accepts `maxFrameSize` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxFrameSizeAt(long index, Consumer<overrungl.vulkan.khr.struct.VkVideoEncodeAV1FrameSizeKHR> func) { func.accept(overrungl.vulkan.khr.struct.VkVideoEncodeAV1FrameSizeKHR.of(maxFrameSizeAt(index))); return this; }

}

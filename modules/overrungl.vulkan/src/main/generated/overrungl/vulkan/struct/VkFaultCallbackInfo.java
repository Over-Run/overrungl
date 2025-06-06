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

/// ## Layout
/// ```
/// struct VkFaultCallbackInfo {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t faultCount;
///     VkFaultData* pFaults;
///     (void (*VkFaultCallbackFunction)((uint32_t) VkBool32 unrecordedFaults, uint32_t faultCount, const VkFaultData* pFaults)) PFN_vkFaultCallbackFunction pfnFaultCallback;
/// };
/// ```
public sealed class VkFaultCallbackInfo extends GroupType {
    /// The struct layout of `VkFaultCallbackInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("faultCount"),
        ValueLayout.ADDRESS.withName("pFaults"),
        ValueLayout.ADDRESS.withName("pfnFaultCallback")
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
    /// The byte offset of `faultCount`.
    public static final long OFFSET_faultCount = LAYOUT.byteOffset(PathElement.groupElement("faultCount"));
    /// The memory layout of `faultCount`.
    public static final MemoryLayout LAYOUT_faultCount = LAYOUT.select(PathElement.groupElement("faultCount"));
    /// The [VarHandle] of `faultCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_faultCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("faultCount"));
    /// The byte offset of `pFaults`.
    public static final long OFFSET_pFaults = LAYOUT.byteOffset(PathElement.groupElement("pFaults"));
    /// The memory layout of `pFaults`.
    public static final MemoryLayout LAYOUT_pFaults = LAYOUT.select(PathElement.groupElement("pFaults"));
    /// The [VarHandle] of `pFaults` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pFaults = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pFaults"));
    /// The byte offset of `pfnFaultCallback`.
    public static final long OFFSET_pfnFaultCallback = LAYOUT.byteOffset(PathElement.groupElement("pfnFaultCallback"));
    /// The memory layout of `pfnFaultCallback`.
    public static final MemoryLayout LAYOUT_pfnFaultCallback = LAYOUT.select(PathElement.groupElement("pfnFaultCallback"));
    /// The [VarHandle] of `pfnFaultCallback` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pfnFaultCallback = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnFaultCallback"));

    /// Creates `VkFaultCallbackInfo` with the given segment.
    /// @param segment the memory segment
    public VkFaultCallbackInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkFaultCallbackInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkFaultCallbackInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFaultCallbackInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFaultCallbackInfo(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkFaultCallbackInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkFaultCallbackInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFaultCallbackInfo`
    public static VkFaultCallbackInfo alloc(SegmentAllocator allocator) { return new VkFaultCallbackInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkFaultCallbackInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkFaultCallbackInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkFaultCallbackInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param faultCount `faultCount`
    /// @param pFaults `pFaults`
    /// @param pfnFaultCallback `pfnFaultCallback`
    /// @return the allocated `VkFaultCallbackInfo`
    public static VkFaultCallbackInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int faultCount, MemorySegment pFaults, MemorySegment pfnFaultCallback) {
        return alloc(allocator).sType(sType).pNext(pNext).faultCount(faultCount).pFaults(pFaults).pfnFaultCallback(pfnFaultCallback);
    }

    /// Allocates a `VkFaultCallbackInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param faultCount `faultCount`
    /// @param pFaults `pFaults`
    /// @return the allocated `VkFaultCallbackInfo`
    public static VkFaultCallbackInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int faultCount, MemorySegment pFaults) {
        return alloc(allocator).sType(sType).pNext(pNext).faultCount(faultCount).pFaults(pFaults);
    }

    /// Allocates a `VkFaultCallbackInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param faultCount `faultCount`
    /// @return the allocated `VkFaultCallbackInfo`
    public static VkFaultCallbackInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int faultCount) {
        return alloc(allocator).sType(sType).pNext(pNext).faultCount(faultCount);
    }

    /// Allocates a `VkFaultCallbackInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkFaultCallbackInfo`
    public static VkFaultCallbackInfo allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkFaultCallbackInfo` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkFaultCallbackInfo`
    public static VkFaultCallbackInfo allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkFaultCallbackInfo copyFrom(VkFaultCallbackInfo src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkFaultCallbackInfo sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkFaultCallbackInfo pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `faultCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int faultCount(MemorySegment segment, long index) { return (int) VH_faultCount.get(segment, 0L, index); }
    /// {@return `faultCount`}
    public int faultCount() { return faultCount(this.segment(), 0L); }
    /// Sets `faultCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void faultCount(MemorySegment segment, long index, int value) { VH_faultCount.set(segment, 0L, index, value); }
    /// Sets `faultCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFaultCallbackInfo faultCount(int value) { faultCount(this.segment(), 0L, value); return this; }

    /// {@return `pFaults` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pFaults(MemorySegment segment, long index) { return (MemorySegment) VH_pFaults.get(segment, 0L, index); }
    /// {@return `pFaults`}
    public MemorySegment pFaults() { return pFaults(this.segment(), 0L); }
    /// Sets `pFaults` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pFaults(MemorySegment segment, long index, MemorySegment value) { VH_pFaults.set(segment, 0L, index, value); }
    /// Sets `pFaults` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFaultCallbackInfo pFaults(MemorySegment value) { pFaults(this.segment(), 0L, value); return this; }

    /// {@return `pfnFaultCallback` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pfnFaultCallback(MemorySegment segment, long index) { return (MemorySegment) VH_pfnFaultCallback.get(segment, 0L, index); }
    /// {@return `pfnFaultCallback`}
    public MemorySegment pfnFaultCallback() { return pfnFaultCallback(this.segment(), 0L); }
    /// Sets `pfnFaultCallback` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pfnFaultCallback(MemorySegment segment, long index, MemorySegment value) { VH_pfnFaultCallback.set(segment, 0L, index, value); }
    /// Sets `pfnFaultCallback` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFaultCallbackInfo pfnFaultCallback(MemorySegment value) { pfnFaultCallback(this.segment(), 0L, value); return this; }

    /// A buffer of [VkFaultCallbackInfo].
    public static final class Buffer extends VkFaultCallbackInfo {
        private final long elementCount;

        /// Creates `VkFaultCallbackInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkFaultCallbackInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkFaultCallbackInfo`
        public VkFaultCallbackInfo asSlice(long index) { return new VkFaultCallbackInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkFaultCallbackInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkFaultCallbackInfo`
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

        /// {@return `faultCount` at the given index}
        /// @param index the index of the struct buffer
        public int faultCountAt(long index) { return faultCount(this.segment(), index); }
        /// Sets `faultCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer faultCountAt(long index, int value) { faultCount(this.segment(), index, value); return this; }

        /// {@return `pFaults` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pFaultsAt(long index) { return pFaults(this.segment(), index); }
        /// Sets `pFaults` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pFaultsAt(long index, MemorySegment value) { pFaults(this.segment(), index, value); return this; }

        /// {@return `pfnFaultCallback` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pfnFaultCallbackAt(long index) { return pfnFaultCallback(this.segment(), index); }
        /// Sets `pfnFaultCallback` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pfnFaultCallbackAt(long index, MemorySegment value) { pfnFaultCallback(this.segment(), index, value); return this; }

    }
}

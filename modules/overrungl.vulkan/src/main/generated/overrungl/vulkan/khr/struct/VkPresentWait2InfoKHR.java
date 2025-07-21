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
/// struct VkPresentWait2InfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint64_t presentId;
///     uint64_t timeout;
/// };
/// ```
public final class VkPresentWait2InfoKHR extends GroupType {
    /// The struct layout of `VkPresentWait2InfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("presentId"),
        ValueLayout.JAVA_LONG.withName("timeout")
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
    /// The byte offset of `presentId`.
    public static final long OFFSET_presentId = LAYOUT.byteOffset(PathElement.groupElement("presentId"));
    /// The memory layout of `presentId`.
    public static final MemoryLayout LAYOUT_presentId = LAYOUT.select(PathElement.groupElement("presentId"));
    /// The [VarHandle] of `presentId` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_presentId = LAYOUT.arrayElementVarHandle(PathElement.groupElement("presentId"));
    /// The byte offset of `timeout`.
    public static final long OFFSET_timeout = LAYOUT.byteOffset(PathElement.groupElement("timeout"));
    /// The memory layout of `timeout`.
    public static final MemoryLayout LAYOUT_timeout = LAYOUT.select(PathElement.groupElement("timeout"));
    /// The [VarHandle] of `timeout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_timeout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timeout"));

    /// Creates `VkPresentWait2InfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkPresentWait2InfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkPresentWait2InfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentWait2InfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentWait2InfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPresentWait2InfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentWait2InfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentWait2InfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkPresentWait2InfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPresentWait2InfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkPresentWait2InfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPresentWait2InfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPresentWait2InfoKHR`
    public static VkPresentWait2InfoKHR alloc(SegmentAllocator allocator) { return new VkPresentWait2InfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkPresentWait2InfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPresentWait2InfoKHR`
    public static VkPresentWait2InfoKHR alloc(SegmentAllocator allocator, long count) { return new VkPresentWait2InfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPresentWait2InfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param presentId `presentId`
    /// @param timeout `timeout`
    /// @return the allocated `VkPresentWait2InfoKHR`
    public static VkPresentWait2InfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long presentId, long timeout) {
        return alloc(allocator).sType(sType).pNext(pNext).presentId(presentId).timeout(timeout);
    }

    /// Allocates a `VkPresentWait2InfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param presentId `presentId`
    /// @return the allocated `VkPresentWait2InfoKHR`
    public static VkPresentWait2InfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long presentId) {
        return alloc(allocator).sType(sType).pNext(pNext).presentId(presentId);
    }

    /// Allocates a `VkPresentWait2InfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkPresentWait2InfoKHR`
    public static VkPresentWait2InfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkPresentWait2InfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkPresentWait2InfoKHR`
    public static VkPresentWait2InfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPresentWait2InfoKHR copyFrom(VkPresentWait2InfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkPresentWait2InfoKHR reinterpret(long count) { return new VkPresentWait2InfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkPresentWait2InfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPresentWait2InfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `presentId` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long presentId(MemorySegment segment, long index) { return (long) VH_presentId.get(segment, 0L, index); }
    /// {@return `presentId`}
    public long presentId() { return presentId(this.segment(), 0L); }
    /// Sets `presentId` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void presentId(MemorySegment segment, long index, long value) { VH_presentId.set(segment, 0L, index, value); }
    /// Sets `presentId` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentWait2InfoKHR presentId(long value) { presentId(this.segment(), 0L, value); return this; }

    /// {@return `timeout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long timeout(MemorySegment segment, long index) { return (long) VH_timeout.get(segment, 0L, index); }
    /// {@return `timeout`}
    public long timeout() { return timeout(this.segment(), 0L); }
    /// Sets `timeout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void timeout(MemorySegment segment, long index, long value) { VH_timeout.set(segment, 0L, index, value); }
    /// Sets `timeout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPresentWait2InfoKHR timeout(long value) { timeout(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkPresentWait2InfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPresentWait2InfoKHR`
    public VkPresentWait2InfoKHR asSlice(long index) { return new VkPresentWait2InfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkPresentWait2InfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPresentWait2InfoKHR`
    public VkPresentWait2InfoKHR asSlice(long index, long count) { return new VkPresentWait2InfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkPresentWait2InfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkPresentWait2InfoKHR at(long index, Consumer<VkPresentWait2InfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPresentWait2InfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPresentWait2InfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `presentId` at the given index}
    /// @param index the index of the struct buffer
    public long presentIdAt(long index) { return presentId(this.segment(), index); }
    /// Sets `presentId` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPresentWait2InfoKHR presentIdAt(long index, long value) { presentId(this.segment(), index, value); return this; }

    /// {@return `timeout` at the given index}
    /// @param index the index of the struct buffer
    public long timeoutAt(long index) { return timeout(this.segment(), index); }
    /// Sets `timeout` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkPresentWait2InfoKHR timeoutAt(long index, long value) { timeout(this.segment(), index, value); return this; }

}

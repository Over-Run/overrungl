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
/// struct VkVideoEncodeIntraRefreshInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t intraRefreshCycleDuration;
///     uint32_t intraRefreshIndex;
/// };
/// ```
public final class VkVideoEncodeIntraRefreshInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeIntraRefreshInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("intraRefreshCycleDuration"),
        ValueLayout.JAVA_INT.withName("intraRefreshIndex")
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
    /// The byte offset of `intraRefreshCycleDuration`.
    public static final long OFFSET_intraRefreshCycleDuration = LAYOUT.byteOffset(PathElement.groupElement("intraRefreshCycleDuration"));
    /// The memory layout of `intraRefreshCycleDuration`.
    public static final MemoryLayout LAYOUT_intraRefreshCycleDuration = LAYOUT.select(PathElement.groupElement("intraRefreshCycleDuration"));
    /// The [VarHandle] of `intraRefreshCycleDuration` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_intraRefreshCycleDuration = LAYOUT.arrayElementVarHandle(PathElement.groupElement("intraRefreshCycleDuration"));
    /// The byte offset of `intraRefreshIndex`.
    public static final long OFFSET_intraRefreshIndex = LAYOUT.byteOffset(PathElement.groupElement("intraRefreshIndex"));
    /// The memory layout of `intraRefreshIndex`.
    public static final MemoryLayout LAYOUT_intraRefreshIndex = LAYOUT.select(PathElement.groupElement("intraRefreshIndex"));
    /// The [VarHandle] of `intraRefreshIndex` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_intraRefreshIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("intraRefreshIndex"));

    /// Creates `VkVideoEncodeIntraRefreshInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeIntraRefreshInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeIntraRefreshInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeIntraRefreshInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeIntraRefreshInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeIntraRefreshInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeIntraRefreshInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeIntraRefreshInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeIntraRefreshInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeIntraRefreshInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeIntraRefreshInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeIntraRefreshInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeIntraRefreshInfoKHR`
    public static VkVideoEncodeIntraRefreshInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeIntraRefreshInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeIntraRefreshInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeIntraRefreshInfoKHR`
    public static VkVideoEncodeIntraRefreshInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeIntraRefreshInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeIntraRefreshInfoKHR copyFrom(VkVideoEncodeIntraRefreshInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeIntraRefreshInfoKHR reinterpret(long count) { return new VkVideoEncodeIntraRefreshInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoEncodeIntraRefreshInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeIntraRefreshInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `intraRefreshCycleDuration` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int intraRefreshCycleDuration(MemorySegment segment, long index) { return (int) VH_intraRefreshCycleDuration.get(segment, 0L, index); }
    /// {@return `intraRefreshCycleDuration`}
    public int intraRefreshCycleDuration() { return intraRefreshCycleDuration(this.segment(), 0L); }
    /// Sets `intraRefreshCycleDuration` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void intraRefreshCycleDuration(MemorySegment segment, long index, int value) { VH_intraRefreshCycleDuration.set(segment, 0L, index, value); }
    /// Sets `intraRefreshCycleDuration` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeIntraRefreshInfoKHR intraRefreshCycleDuration(int value) { intraRefreshCycleDuration(this.segment(), 0L, value); return this; }

    /// {@return `intraRefreshIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int intraRefreshIndex(MemorySegment segment, long index) { return (int) VH_intraRefreshIndex.get(segment, 0L, index); }
    /// {@return `intraRefreshIndex`}
    public int intraRefreshIndex() { return intraRefreshIndex(this.segment(), 0L); }
    /// Sets `intraRefreshIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void intraRefreshIndex(MemorySegment segment, long index, int value) { VH_intraRefreshIndex.set(segment, 0L, index, value); }
    /// Sets `intraRefreshIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeIntraRefreshInfoKHR intraRefreshIndex(int value) { intraRefreshIndex(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoEncodeIntraRefreshInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeIntraRefreshInfoKHR`
    public VkVideoEncodeIntraRefreshInfoKHR asSlice(long index) { return new VkVideoEncodeIntraRefreshInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeIntraRefreshInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeIntraRefreshInfoKHR`
    public VkVideoEncodeIntraRefreshInfoKHR asSlice(long index, long count) { return new VkVideoEncodeIntraRefreshInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeIntraRefreshInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeIntraRefreshInfoKHR at(long index, Consumer<VkVideoEncodeIntraRefreshInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeIntraRefreshInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeIntraRefreshInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `intraRefreshCycleDuration` at the given index}
    /// @param index the index of the struct buffer
    public int intraRefreshCycleDurationAt(long index) { return intraRefreshCycleDuration(this.segment(), index); }
    /// Sets `intraRefreshCycleDuration` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeIntraRefreshInfoKHR intraRefreshCycleDurationAt(long index, int value) { intraRefreshCycleDuration(this.segment(), index, value); return this; }

    /// {@return `intraRefreshIndex` at the given index}
    /// @param index the index of the struct buffer
    public int intraRefreshIndexAt(long index) { return intraRefreshIndex(this.segment(), index); }
    /// Sets `intraRefreshIndex` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeIntraRefreshInfoKHR intraRefreshIndexAt(long index, int value) { intraRefreshIndex(this.segment(), index, value); return this; }

}

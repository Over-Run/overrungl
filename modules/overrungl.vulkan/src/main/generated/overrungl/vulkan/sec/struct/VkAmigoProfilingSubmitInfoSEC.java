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
package overrungl.vulkan.sec.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkAmigoProfilingSubmitInfoSEC {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint64_t firstDrawTimestamp;
///     uint64_t swapBufferTimestamp;
/// };
/// ```
public final class VkAmigoProfilingSubmitInfoSEC extends GroupType {
    /// The struct layout of `VkAmigoProfilingSubmitInfoSEC`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("firstDrawTimestamp"),
        ValueLayout.JAVA_LONG.withName("swapBufferTimestamp")
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
    /// The byte offset of `firstDrawTimestamp`.
    public static final long OFFSET_firstDrawTimestamp = LAYOUT.byteOffset(PathElement.groupElement("firstDrawTimestamp"));
    /// The memory layout of `firstDrawTimestamp`.
    public static final MemoryLayout LAYOUT_firstDrawTimestamp = LAYOUT.select(PathElement.groupElement("firstDrawTimestamp"));
    /// The [VarHandle] of `firstDrawTimestamp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_firstDrawTimestamp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("firstDrawTimestamp"));
    /// The byte offset of `swapBufferTimestamp`.
    public static final long OFFSET_swapBufferTimestamp = LAYOUT.byteOffset(PathElement.groupElement("swapBufferTimestamp"));
    /// The memory layout of `swapBufferTimestamp`.
    public static final MemoryLayout LAYOUT_swapBufferTimestamp = LAYOUT.select(PathElement.groupElement("swapBufferTimestamp"));
    /// The [VarHandle] of `swapBufferTimestamp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_swapBufferTimestamp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("swapBufferTimestamp"));

    /// Creates `VkAmigoProfilingSubmitInfoSEC` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkAmigoProfilingSubmitInfoSEC(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkAmigoProfilingSubmitInfoSEC` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAmigoProfilingSubmitInfoSEC of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAmigoProfilingSubmitInfoSEC(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkAmigoProfilingSubmitInfoSEC` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAmigoProfilingSubmitInfoSEC ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkAmigoProfilingSubmitInfoSEC(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkAmigoProfilingSubmitInfoSEC` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkAmigoProfilingSubmitInfoSEC ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkAmigoProfilingSubmitInfoSEC(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkAmigoProfilingSubmitInfoSEC` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkAmigoProfilingSubmitInfoSEC`
    public static VkAmigoProfilingSubmitInfoSEC alloc(SegmentAllocator allocator) { return new VkAmigoProfilingSubmitInfoSEC(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkAmigoProfilingSubmitInfoSEC` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkAmigoProfilingSubmitInfoSEC`
    public static VkAmigoProfilingSubmitInfoSEC alloc(SegmentAllocator allocator, long count) { return new VkAmigoProfilingSubmitInfoSEC(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkAmigoProfilingSubmitInfoSEC copyFrom(VkAmigoProfilingSubmitInfoSEC src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkAmigoProfilingSubmitInfoSEC reinterpret(long count) { return new VkAmigoProfilingSubmitInfoSEC(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkAmigoProfilingSubmitInfoSEC sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkAmigoProfilingSubmitInfoSEC pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `firstDrawTimestamp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long firstDrawTimestamp(MemorySegment segment, long index) { return (long) VH_firstDrawTimestamp.get(segment, 0L, index); }
    /// {@return `firstDrawTimestamp`}
    public long firstDrawTimestamp() { return firstDrawTimestamp(this.segment(), 0L); }
    /// Sets `firstDrawTimestamp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void firstDrawTimestamp(MemorySegment segment, long index, long value) { VH_firstDrawTimestamp.set(segment, 0L, index, value); }
    /// Sets `firstDrawTimestamp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAmigoProfilingSubmitInfoSEC firstDrawTimestamp(long value) { firstDrawTimestamp(this.segment(), 0L, value); return this; }

    /// {@return `swapBufferTimestamp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long swapBufferTimestamp(MemorySegment segment, long index) { return (long) VH_swapBufferTimestamp.get(segment, 0L, index); }
    /// {@return `swapBufferTimestamp`}
    public long swapBufferTimestamp() { return swapBufferTimestamp(this.segment(), 0L); }
    /// Sets `swapBufferTimestamp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void swapBufferTimestamp(MemorySegment segment, long index, long value) { VH_swapBufferTimestamp.set(segment, 0L, index, value); }
    /// Sets `swapBufferTimestamp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkAmigoProfilingSubmitInfoSEC swapBufferTimestamp(long value) { swapBufferTimestamp(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkAmigoProfilingSubmitInfoSEC`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkAmigoProfilingSubmitInfoSEC`
    public VkAmigoProfilingSubmitInfoSEC asSlice(long index) { return new VkAmigoProfilingSubmitInfoSEC(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkAmigoProfilingSubmitInfoSEC`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkAmigoProfilingSubmitInfoSEC`
    public VkAmigoProfilingSubmitInfoSEC asSlice(long index, long count) { return new VkAmigoProfilingSubmitInfoSEC(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkAmigoProfilingSubmitInfoSEC` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkAmigoProfilingSubmitInfoSEC at(long index, Consumer<VkAmigoProfilingSubmitInfoSEC> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAmigoProfilingSubmitInfoSEC sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAmigoProfilingSubmitInfoSEC pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `firstDrawTimestamp` at the given index}
    /// @param index the index of the struct buffer
    public long firstDrawTimestampAt(long index) { return firstDrawTimestamp(this.segment(), index); }
    /// Sets `firstDrawTimestamp` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAmigoProfilingSubmitInfoSEC firstDrawTimestampAt(long index, long value) { firstDrawTimestamp(this.segment(), index, value); return this; }

    /// {@return `swapBufferTimestamp` at the given index}
    /// @param index the index of the struct buffer
    public long swapBufferTimestampAt(long index) { return swapBufferTimestamp(this.segment(), index); }
    /// Sets `swapBufferTimestamp` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkAmigoProfilingSubmitInfoSEC swapBufferTimestampAt(long index, long value) { swapBufferTimestamp(this.segment(), index, value); return this; }

}

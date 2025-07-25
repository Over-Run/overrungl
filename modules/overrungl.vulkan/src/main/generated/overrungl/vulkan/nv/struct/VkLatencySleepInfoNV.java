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
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkLatencySleepInfoNV {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkSemaphore signalSemaphore;
///     uint64_t value;
/// };
/// ```
public final class VkLatencySleepInfoNV extends GroupType {
    /// The struct layout of `VkLatencySleepInfoNV`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("signalSemaphore"),
        ValueLayout.JAVA_LONG.withName("value")
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
    /// The byte offset of `signalSemaphore`.
    public static final long OFFSET_signalSemaphore = LAYOUT.byteOffset(PathElement.groupElement("signalSemaphore"));
    /// The memory layout of `signalSemaphore`.
    public static final MemoryLayout LAYOUT_signalSemaphore = LAYOUT.select(PathElement.groupElement("signalSemaphore"));
    /// The [VarHandle] of `signalSemaphore` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_signalSemaphore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("signalSemaphore"));
    /// The byte offset of `value`.
    public static final long OFFSET_value = LAYOUT.byteOffset(PathElement.groupElement("value"));
    /// The memory layout of `value`.
    public static final MemoryLayout LAYOUT_value = LAYOUT.select(PathElement.groupElement("value"));
    /// The [VarHandle] of `value` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_value = LAYOUT.arrayElementVarHandle(PathElement.groupElement("value"));

    /// Creates `VkLatencySleepInfoNV` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkLatencySleepInfoNV(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkLatencySleepInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLatencySleepInfoNV of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkLatencySleepInfoNV(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkLatencySleepInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLatencySleepInfoNV ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkLatencySleepInfoNV(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkLatencySleepInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkLatencySleepInfoNV ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkLatencySleepInfoNV(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkLatencySleepInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkLatencySleepInfoNV`
    public static VkLatencySleepInfoNV alloc(SegmentAllocator allocator) { return new VkLatencySleepInfoNV(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkLatencySleepInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkLatencySleepInfoNV`
    public static VkLatencySleepInfoNV alloc(SegmentAllocator allocator, long count) { return new VkLatencySleepInfoNV(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkLatencySleepInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param signalSemaphore `signalSemaphore`
    /// @param value `value`
    /// @return the allocated `VkLatencySleepInfoNV`
    public static VkLatencySleepInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long signalSemaphore, long value) {
        return alloc(allocator).sType(sType).pNext(pNext).signalSemaphore(signalSemaphore).value(value);
    }

    /// Allocates a `VkLatencySleepInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param signalSemaphore `signalSemaphore`
    /// @return the allocated `VkLatencySleepInfoNV`
    public static VkLatencySleepInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, long signalSemaphore) {
        return alloc(allocator).sType(sType).pNext(pNext).signalSemaphore(signalSemaphore);
    }

    /// Allocates a `VkLatencySleepInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkLatencySleepInfoNV`
    public static VkLatencySleepInfoNV allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkLatencySleepInfoNV` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkLatencySleepInfoNV`
    public static VkLatencySleepInfoNV allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkLatencySleepInfoNV copyFrom(VkLatencySleepInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkLatencySleepInfoNV reinterpret(long count) { return new VkLatencySleepInfoNV(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkLatencySleepInfoNV sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkLatencySleepInfoNV pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `signalSemaphore` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long signalSemaphore(MemorySegment segment, long index) { return (long) VH_signalSemaphore.get(segment, 0L, index); }
    /// {@return `signalSemaphore`}
    public long signalSemaphore() { return signalSemaphore(this.segment(), 0L); }
    /// Sets `signalSemaphore` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void signalSemaphore(MemorySegment segment, long index, long value) { VH_signalSemaphore.set(segment, 0L, index, value); }
    /// Sets `signalSemaphore` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencySleepInfoNV signalSemaphore(long value) { signalSemaphore(this.segment(), 0L, value); return this; }

    /// {@return `value` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long value(MemorySegment segment, long index) { return (long) VH_value.get(segment, 0L, index); }
    /// {@return `value`}
    public long value() { return value(this.segment(), 0L); }
    /// Sets `value` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void value(MemorySegment segment, long index, long value) { VH_value.set(segment, 0L, index, value); }
    /// Sets `value` with the given value.
    /// @param value the value
    /// @return `this`
    public VkLatencySleepInfoNV value(long value) { value(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkLatencySleepInfoNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkLatencySleepInfoNV`
    public VkLatencySleepInfoNV asSlice(long index) { return new VkLatencySleepInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkLatencySleepInfoNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkLatencySleepInfoNV`
    public VkLatencySleepInfoNV asSlice(long index, long count) { return new VkLatencySleepInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkLatencySleepInfoNV` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkLatencySleepInfoNV at(long index, Consumer<VkLatencySleepInfoNV> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLatencySleepInfoNV sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLatencySleepInfoNV pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `signalSemaphore` at the given index}
    /// @param index the index of the struct buffer
    public long signalSemaphoreAt(long index) { return signalSemaphore(this.segment(), index); }
    /// Sets `signalSemaphore` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLatencySleepInfoNV signalSemaphoreAt(long index, long value) { signalSemaphore(this.segment(), index, value); return this; }

    /// {@return `value` at the given index}
    /// @param index the index of the struct buffer
    public long valueAt(long index) { return value(this.segment(), index); }
    /// Sets `value` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkLatencySleepInfoNV valueAt(long index, long value) { value(this.segment(), index, value); return this; }

}

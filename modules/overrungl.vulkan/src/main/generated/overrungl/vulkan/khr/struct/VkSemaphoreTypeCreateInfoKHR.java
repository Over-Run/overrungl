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
/// struct VkSemaphoreTypeCreateInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (int) VkSemaphoreType semaphoreType;
///     uint64_t initialValue;
/// };
/// ```
public final class VkSemaphoreTypeCreateInfoKHR extends GroupType {
    /// The struct layout of `VkSemaphoreTypeCreateInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("semaphoreType"),
        ValueLayout.JAVA_LONG.withName("initialValue")
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
    /// The byte offset of `semaphoreType`.
    public static final long OFFSET_semaphoreType = LAYOUT.byteOffset(PathElement.groupElement("semaphoreType"));
    /// The memory layout of `semaphoreType`.
    public static final MemoryLayout LAYOUT_semaphoreType = LAYOUT.select(PathElement.groupElement("semaphoreType"));
    /// The [VarHandle] of `semaphoreType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_semaphoreType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphoreType"));
    /// The byte offset of `initialValue`.
    public static final long OFFSET_initialValue = LAYOUT.byteOffset(PathElement.groupElement("initialValue"));
    /// The memory layout of `initialValue`.
    public static final MemoryLayout LAYOUT_initialValue = LAYOUT.select(PathElement.groupElement("initialValue"));
    /// The [VarHandle] of `initialValue` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_initialValue = LAYOUT.arrayElementVarHandle(PathElement.groupElement("initialValue"));

    /// Creates `VkSemaphoreTypeCreateInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkSemaphoreTypeCreateInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkSemaphoreTypeCreateInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreTypeCreateInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreTypeCreateInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSemaphoreTypeCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreTypeCreateInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreTypeCreateInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkSemaphoreTypeCreateInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreTypeCreateInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkSemaphoreTypeCreateInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkSemaphoreTypeCreateInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSemaphoreTypeCreateInfoKHR`
    public static VkSemaphoreTypeCreateInfoKHR alloc(SegmentAllocator allocator) { return new VkSemaphoreTypeCreateInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkSemaphoreTypeCreateInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSemaphoreTypeCreateInfoKHR`
    public static VkSemaphoreTypeCreateInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkSemaphoreTypeCreateInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSemaphoreTypeCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param semaphoreType `semaphoreType`
    /// @param initialValue `initialValue`
    /// @return the allocated `VkSemaphoreTypeCreateInfoKHR`
    public static VkSemaphoreTypeCreateInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int semaphoreType, long initialValue) {
        return alloc(allocator).sType(sType).pNext(pNext).semaphoreType(semaphoreType).initialValue(initialValue);
    }

    /// Allocates a `VkSemaphoreTypeCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param semaphoreType `semaphoreType`
    /// @return the allocated `VkSemaphoreTypeCreateInfoKHR`
    public static VkSemaphoreTypeCreateInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int semaphoreType) {
        return alloc(allocator).sType(sType).pNext(pNext).semaphoreType(semaphoreType);
    }

    /// Allocates a `VkSemaphoreTypeCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkSemaphoreTypeCreateInfoKHR`
    public static VkSemaphoreTypeCreateInfoKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkSemaphoreTypeCreateInfoKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkSemaphoreTypeCreateInfoKHR`
    public static VkSemaphoreTypeCreateInfoKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSemaphoreTypeCreateInfoKHR copyFrom(VkSemaphoreTypeCreateInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkSemaphoreTypeCreateInfoKHR reinterpret(long count) { return new VkSemaphoreTypeCreateInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkSemaphoreTypeCreateInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkSemaphoreTypeCreateInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `semaphoreType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int semaphoreType(MemorySegment segment, long index) { return (int) VH_semaphoreType.get(segment, 0L, index); }
    /// {@return `semaphoreType`}
    public int semaphoreType() { return semaphoreType(this.segment(), 0L); }
    /// Sets `semaphoreType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void semaphoreType(MemorySegment segment, long index, int value) { VH_semaphoreType.set(segment, 0L, index, value); }
    /// Sets `semaphoreType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreTypeCreateInfoKHR semaphoreType(int value) { semaphoreType(this.segment(), 0L, value); return this; }

    /// {@return `initialValue` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long initialValue(MemorySegment segment, long index) { return (long) VH_initialValue.get(segment, 0L, index); }
    /// {@return `initialValue`}
    public long initialValue() { return initialValue(this.segment(), 0L); }
    /// Sets `initialValue` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void initialValue(MemorySegment segment, long index, long value) { VH_initialValue.set(segment, 0L, index, value); }
    /// Sets `initialValue` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreTypeCreateInfoKHR initialValue(long value) { initialValue(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkSemaphoreTypeCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSemaphoreTypeCreateInfoKHR`
    public VkSemaphoreTypeCreateInfoKHR asSlice(long index) { return new VkSemaphoreTypeCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkSemaphoreTypeCreateInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSemaphoreTypeCreateInfoKHR`
    public VkSemaphoreTypeCreateInfoKHR asSlice(long index, long count) { return new VkSemaphoreTypeCreateInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkSemaphoreTypeCreateInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkSemaphoreTypeCreateInfoKHR at(long index, Consumer<VkSemaphoreTypeCreateInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSemaphoreTypeCreateInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSemaphoreTypeCreateInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `semaphoreType` at the given index}
    /// @param index the index of the struct buffer
    public int semaphoreTypeAt(long index) { return semaphoreType(this.segment(), index); }
    /// Sets `semaphoreType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSemaphoreTypeCreateInfoKHR semaphoreTypeAt(long index, int value) { semaphoreType(this.segment(), index, value); return this; }

    /// {@return `initialValue` at the given index}
    /// @param index the index of the struct buffer
    public long initialValueAt(long index) { return initialValue(this.segment(), index); }
    /// Sets `initialValue` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkSemaphoreTypeCreateInfoKHR initialValueAt(long index, long value) { initialValue(this.segment(), index, value); return this; }

}

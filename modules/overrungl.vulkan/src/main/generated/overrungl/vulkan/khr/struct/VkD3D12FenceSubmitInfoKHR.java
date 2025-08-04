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
/// struct VkD3D12FenceSubmitInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t waitSemaphoreValuesCount;
///     const uint64_t* pWaitSemaphoreValues;
///     uint32_t signalSemaphoreValuesCount;
///     const uint64_t* pSignalSemaphoreValues;
/// };
/// ```
public final class VkD3D12FenceSubmitInfoKHR extends GroupType {
    /// The struct layout of `VkD3D12FenceSubmitInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreValuesCount"),
        ValueLayout.ADDRESS.withName("pWaitSemaphoreValues"),
        ValueLayout.JAVA_INT.withName("signalSemaphoreValuesCount"),
        ValueLayout.ADDRESS.withName("pSignalSemaphoreValues")
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
    /// The byte offset of `waitSemaphoreValuesCount`.
    public static final long OFFSET_waitSemaphoreValuesCount = LAYOUT.byteOffset(PathElement.groupElement("waitSemaphoreValuesCount"));
    /// The memory layout of `waitSemaphoreValuesCount`.
    public static final MemoryLayout LAYOUT_waitSemaphoreValuesCount = LAYOUT.select(PathElement.groupElement("waitSemaphoreValuesCount"));
    /// The [VarHandle] of `waitSemaphoreValuesCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_waitSemaphoreValuesCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("waitSemaphoreValuesCount"));
    /// The byte offset of `pWaitSemaphoreValues`.
    public static final long OFFSET_pWaitSemaphoreValues = LAYOUT.byteOffset(PathElement.groupElement("pWaitSemaphoreValues"));
    /// The memory layout of `pWaitSemaphoreValues`.
    public static final MemoryLayout LAYOUT_pWaitSemaphoreValues = LAYOUT.select(PathElement.groupElement("pWaitSemaphoreValues"));
    /// The [VarHandle] of `pWaitSemaphoreValues` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pWaitSemaphoreValues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pWaitSemaphoreValues"));
    /// The byte offset of `signalSemaphoreValuesCount`.
    public static final long OFFSET_signalSemaphoreValuesCount = LAYOUT.byteOffset(PathElement.groupElement("signalSemaphoreValuesCount"));
    /// The memory layout of `signalSemaphoreValuesCount`.
    public static final MemoryLayout LAYOUT_signalSemaphoreValuesCount = LAYOUT.select(PathElement.groupElement("signalSemaphoreValuesCount"));
    /// The [VarHandle] of `signalSemaphoreValuesCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_signalSemaphoreValuesCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("signalSemaphoreValuesCount"));
    /// The byte offset of `pSignalSemaphoreValues`.
    public static final long OFFSET_pSignalSemaphoreValues = LAYOUT.byteOffset(PathElement.groupElement("pSignalSemaphoreValues"));
    /// The memory layout of `pSignalSemaphoreValues`.
    public static final MemoryLayout LAYOUT_pSignalSemaphoreValues = LAYOUT.select(PathElement.groupElement("pSignalSemaphoreValues"));
    /// The [VarHandle] of `pSignalSemaphoreValues` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pSignalSemaphoreValues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSignalSemaphoreValues"));

    /// Creates `VkD3D12FenceSubmitInfoKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkD3D12FenceSubmitInfoKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkD3D12FenceSubmitInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkD3D12FenceSubmitInfoKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkD3D12FenceSubmitInfoKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkD3D12FenceSubmitInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkD3D12FenceSubmitInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkD3D12FenceSubmitInfoKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkD3D12FenceSubmitInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkD3D12FenceSubmitInfoKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkD3D12FenceSubmitInfoKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkD3D12FenceSubmitInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkD3D12FenceSubmitInfoKHR`
    public static VkD3D12FenceSubmitInfoKHR alloc(SegmentAllocator allocator) { return new VkD3D12FenceSubmitInfoKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkD3D12FenceSubmitInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkD3D12FenceSubmitInfoKHR`
    public static VkD3D12FenceSubmitInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkD3D12FenceSubmitInfoKHR(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkD3D12FenceSubmitInfoKHR copyFrom(VkD3D12FenceSubmitInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkD3D12FenceSubmitInfoKHR reinterpret(long count) { return new VkD3D12FenceSubmitInfoKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkD3D12FenceSubmitInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkD3D12FenceSubmitInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `waitSemaphoreValuesCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int waitSemaphoreValuesCount(MemorySegment segment, long index) { return (int) VH_waitSemaphoreValuesCount.get(segment, 0L, index); }
    /// {@return `waitSemaphoreValuesCount`}
    public int waitSemaphoreValuesCount() { return waitSemaphoreValuesCount(this.segment(), 0L); }
    /// Sets `waitSemaphoreValuesCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void waitSemaphoreValuesCount(MemorySegment segment, long index, int value) { VH_waitSemaphoreValuesCount.set(segment, 0L, index, value); }
    /// Sets `waitSemaphoreValuesCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkD3D12FenceSubmitInfoKHR waitSemaphoreValuesCount(int value) { waitSemaphoreValuesCount(this.segment(), 0L, value); return this; }

    /// {@return `pWaitSemaphoreValues` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pWaitSemaphoreValues(MemorySegment segment, long index) { return (MemorySegment) VH_pWaitSemaphoreValues.get(segment, 0L, index); }
    /// {@return `pWaitSemaphoreValues`}
    public MemorySegment pWaitSemaphoreValues() { return pWaitSemaphoreValues(this.segment(), 0L); }
    /// Sets `pWaitSemaphoreValues` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pWaitSemaphoreValues(MemorySegment segment, long index, MemorySegment value) { VH_pWaitSemaphoreValues.set(segment, 0L, index, value); }
    /// Sets `pWaitSemaphoreValues` with the given value.
    /// @param value the value
    /// @return `this`
    public VkD3D12FenceSubmitInfoKHR pWaitSemaphoreValues(MemorySegment value) { pWaitSemaphoreValues(this.segment(), 0L, value); return this; }

    /// {@return `signalSemaphoreValuesCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int signalSemaphoreValuesCount(MemorySegment segment, long index) { return (int) VH_signalSemaphoreValuesCount.get(segment, 0L, index); }
    /// {@return `signalSemaphoreValuesCount`}
    public int signalSemaphoreValuesCount() { return signalSemaphoreValuesCount(this.segment(), 0L); }
    /// Sets `signalSemaphoreValuesCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void signalSemaphoreValuesCount(MemorySegment segment, long index, int value) { VH_signalSemaphoreValuesCount.set(segment, 0L, index, value); }
    /// Sets `signalSemaphoreValuesCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkD3D12FenceSubmitInfoKHR signalSemaphoreValuesCount(int value) { signalSemaphoreValuesCount(this.segment(), 0L, value); return this; }

    /// {@return `pSignalSemaphoreValues` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pSignalSemaphoreValues(MemorySegment segment, long index) { return (MemorySegment) VH_pSignalSemaphoreValues.get(segment, 0L, index); }
    /// {@return `pSignalSemaphoreValues`}
    public MemorySegment pSignalSemaphoreValues() { return pSignalSemaphoreValues(this.segment(), 0L); }
    /// Sets `pSignalSemaphoreValues` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pSignalSemaphoreValues(MemorySegment segment, long index, MemorySegment value) { VH_pSignalSemaphoreValues.set(segment, 0L, index, value); }
    /// Sets `pSignalSemaphoreValues` with the given value.
    /// @param value the value
    /// @return `this`
    public VkD3D12FenceSubmitInfoKHR pSignalSemaphoreValues(MemorySegment value) { pSignalSemaphoreValues(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkD3D12FenceSubmitInfoKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkD3D12FenceSubmitInfoKHR`
    public VkD3D12FenceSubmitInfoKHR asSlice(long index) { return new VkD3D12FenceSubmitInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkD3D12FenceSubmitInfoKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkD3D12FenceSubmitInfoKHR`
    public VkD3D12FenceSubmitInfoKHR asSlice(long index, long count) { return new VkD3D12FenceSubmitInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkD3D12FenceSubmitInfoKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkD3D12FenceSubmitInfoKHR at(long index, Consumer<VkD3D12FenceSubmitInfoKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkD3D12FenceSubmitInfoKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkD3D12FenceSubmitInfoKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `waitSemaphoreValuesCount` at the given index}
    /// @param index the index of the struct buffer
    public int waitSemaphoreValuesCountAt(long index) { return waitSemaphoreValuesCount(this.segment(), index); }
    /// Sets `waitSemaphoreValuesCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkD3D12FenceSubmitInfoKHR waitSemaphoreValuesCountAt(long index, int value) { waitSemaphoreValuesCount(this.segment(), index, value); return this; }

    /// {@return `pWaitSemaphoreValues` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pWaitSemaphoreValuesAt(long index) { return pWaitSemaphoreValues(this.segment(), index); }
    /// Sets `pWaitSemaphoreValues` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkD3D12FenceSubmitInfoKHR pWaitSemaphoreValuesAt(long index, MemorySegment value) { pWaitSemaphoreValues(this.segment(), index, value); return this; }

    /// {@return `signalSemaphoreValuesCount` at the given index}
    /// @param index the index of the struct buffer
    public int signalSemaphoreValuesCountAt(long index) { return signalSemaphoreValuesCount(this.segment(), index); }
    /// Sets `signalSemaphoreValuesCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkD3D12FenceSubmitInfoKHR signalSemaphoreValuesCountAt(long index, int value) { signalSemaphoreValuesCount(this.segment(), index, value); return this; }

    /// {@return `pSignalSemaphoreValues` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pSignalSemaphoreValuesAt(long index) { return pSignalSemaphoreValues(this.segment(), index); }
    /// Sets `pSignalSemaphoreValues` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkD3D12FenceSubmitInfoKHR pSignalSemaphoreValuesAt(long index, MemorySegment value) { pSignalSemaphoreValues(this.segment(), index, value); return this; }

}

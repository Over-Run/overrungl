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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### waitSemaphoreValuesCount
/// [VarHandle][#VH_waitSemaphoreValuesCount] - [Getter][#waitSemaphoreValuesCount()] - [Setter][#waitSemaphoreValuesCount(int)]
/// ### pWaitSemaphoreValues
/// [VarHandle][#VH_pWaitSemaphoreValues] - [Getter][#pWaitSemaphoreValues()] - [Setter][#pWaitSemaphoreValues(java.lang.foreign.MemorySegment)]
/// ### signalSemaphoreValuesCount
/// [VarHandle][#VH_signalSemaphoreValuesCount] - [Getter][#signalSemaphoreValuesCount()] - [Setter][#signalSemaphoreValuesCount(int)]
/// ### pSignalSemaphoreValues
/// [VarHandle][#VH_pSignalSemaphoreValues] - [Getter][#pSignalSemaphoreValues()] - [Setter][#pSignalSemaphoreValues(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkD3D12FenceSubmitInfoKHR {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t waitSemaphoreValuesCount;
///     const uint64_t * pWaitSemaphoreValues;
///     uint32_t signalSemaphoreValuesCount;
///     const uint64_t * pSignalSemaphoreValues;
/// } VkD3D12FenceSubmitInfoKHR;
/// ```
public final class VkD3D12FenceSubmitInfoKHR extends Struct {
    /// The struct layout of `VkD3D12FenceSubmitInfoKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreValuesCount"),
        ValueLayout.ADDRESS.withName("pWaitSemaphoreValues"),
        ValueLayout.JAVA_INT.withName("signalSemaphoreValuesCount"),
        ValueLayout.ADDRESS.withName("pSignalSemaphoreValues")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `waitSemaphoreValuesCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_waitSemaphoreValuesCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("waitSemaphoreValuesCount"));
    /// The [VarHandle] of `pWaitSemaphoreValues` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pWaitSemaphoreValues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pWaitSemaphoreValues"));
    /// The [VarHandle] of `signalSemaphoreValuesCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_signalSemaphoreValuesCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("signalSemaphoreValuesCount"));
    /// The [VarHandle] of `pSignalSemaphoreValues` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pSignalSemaphoreValues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSignalSemaphoreValues"));

    /// Creates `VkD3D12FenceSubmitInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkD3D12FenceSubmitInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkD3D12FenceSubmitInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkD3D12FenceSubmitInfoKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkD3D12FenceSubmitInfoKHR(segment); }

    /// Creates `VkD3D12FenceSubmitInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkD3D12FenceSubmitInfoKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkD3D12FenceSubmitInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkD3D12FenceSubmitInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkD3D12FenceSubmitInfoKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkD3D12FenceSubmitInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkD3D12FenceSubmitInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkD3D12FenceSubmitInfoKHR`
    public static VkD3D12FenceSubmitInfoKHR alloc(SegmentAllocator allocator) { return new VkD3D12FenceSubmitInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkD3D12FenceSubmitInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkD3D12FenceSubmitInfoKHR`
    public static VkD3D12FenceSubmitInfoKHR alloc(SegmentAllocator allocator, long count) { return new VkD3D12FenceSubmitInfoKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkD3D12FenceSubmitInfoKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkD3D12FenceSubmitInfoKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkD3D12FenceSubmitInfoKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkD3D12FenceSubmitInfoKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkD3D12FenceSubmitInfoKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkD3D12FenceSubmitInfoKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkD3D12FenceSubmitInfoKHR sType(@CType("VkStructureType") int value) { VkD3D12FenceSubmitInfoKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkD3D12FenceSubmitInfoKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkD3D12FenceSubmitInfoKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkD3D12FenceSubmitInfoKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkD3D12FenceSubmitInfoKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkD3D12FenceSubmitInfoKHR pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkD3D12FenceSubmitInfoKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkD3D12FenceSubmitInfoKHR pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkD3D12FenceSubmitInfoKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `waitSemaphoreValuesCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_waitSemaphoreValuesCount(MemorySegment segment, long index) { return (int) VH_waitSemaphoreValuesCount.get(segment, 0L, index); }
    /// {@return `waitSemaphoreValuesCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_waitSemaphoreValuesCount(MemorySegment segment) { return VkD3D12FenceSubmitInfoKHR.get_waitSemaphoreValuesCount(segment, 0L); }
    /// {@return `waitSemaphoreValuesCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int waitSemaphoreValuesCountAt(long index) { return VkD3D12FenceSubmitInfoKHR.get_waitSemaphoreValuesCount(this.segment(), index); }
    /// {@return `waitSemaphoreValuesCount`}
    public @CType("uint32_t") int waitSemaphoreValuesCount() { return VkD3D12FenceSubmitInfoKHR.get_waitSemaphoreValuesCount(this.segment()); }
    /// Sets `waitSemaphoreValuesCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_waitSemaphoreValuesCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_waitSemaphoreValuesCount.set(segment, 0L, index, value); }
    /// Sets `waitSemaphoreValuesCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_waitSemaphoreValuesCount(MemorySegment segment, @CType("uint32_t") int value) { VkD3D12FenceSubmitInfoKHR.set_waitSemaphoreValuesCount(segment, 0L, value); }
    /// Sets `waitSemaphoreValuesCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkD3D12FenceSubmitInfoKHR waitSemaphoreValuesCountAt(long index, @CType("uint32_t") int value) { VkD3D12FenceSubmitInfoKHR.set_waitSemaphoreValuesCount(this.segment(), index, value); return this; }
    /// Sets `waitSemaphoreValuesCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkD3D12FenceSubmitInfoKHR waitSemaphoreValuesCount(@CType("uint32_t") int value) { VkD3D12FenceSubmitInfoKHR.set_waitSemaphoreValuesCount(this.segment(), value); return this; }

    /// {@return `pWaitSemaphoreValues` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint64_t *") java.lang.foreign.MemorySegment get_pWaitSemaphoreValues(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pWaitSemaphoreValues.get(segment, 0L, index); }
    /// {@return `pWaitSemaphoreValues`}
    /// @param segment the segment of the struct
    public static @CType("const uint64_t *") java.lang.foreign.MemorySegment get_pWaitSemaphoreValues(MemorySegment segment) { return VkD3D12FenceSubmitInfoKHR.get_pWaitSemaphoreValues(segment, 0L); }
    /// {@return `pWaitSemaphoreValues` at the given index}
    /// @param index the index
    public @CType("const uint64_t *") java.lang.foreign.MemorySegment pWaitSemaphoreValuesAt(long index) { return VkD3D12FenceSubmitInfoKHR.get_pWaitSemaphoreValues(this.segment(), index); }
    /// {@return `pWaitSemaphoreValues`}
    public @CType("const uint64_t *") java.lang.foreign.MemorySegment pWaitSemaphoreValues() { return VkD3D12FenceSubmitInfoKHR.get_pWaitSemaphoreValues(this.segment()); }
    /// Sets `pWaitSemaphoreValues` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pWaitSemaphoreValues(MemorySegment segment, long index, @CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VH_pWaitSemaphoreValues.set(segment, 0L, index, value); }
    /// Sets `pWaitSemaphoreValues` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pWaitSemaphoreValues(MemorySegment segment, @CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VkD3D12FenceSubmitInfoKHR.set_pWaitSemaphoreValues(segment, 0L, value); }
    /// Sets `pWaitSemaphoreValues` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkD3D12FenceSubmitInfoKHR pWaitSemaphoreValuesAt(long index, @CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VkD3D12FenceSubmitInfoKHR.set_pWaitSemaphoreValues(this.segment(), index, value); return this; }
    /// Sets `pWaitSemaphoreValues` with the given value.
    /// @param value the value
    /// @return `this`
    public VkD3D12FenceSubmitInfoKHR pWaitSemaphoreValues(@CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VkD3D12FenceSubmitInfoKHR.set_pWaitSemaphoreValues(this.segment(), value); return this; }

    /// {@return `signalSemaphoreValuesCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_signalSemaphoreValuesCount(MemorySegment segment, long index) { return (int) VH_signalSemaphoreValuesCount.get(segment, 0L, index); }
    /// {@return `signalSemaphoreValuesCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_signalSemaphoreValuesCount(MemorySegment segment) { return VkD3D12FenceSubmitInfoKHR.get_signalSemaphoreValuesCount(segment, 0L); }
    /// {@return `signalSemaphoreValuesCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int signalSemaphoreValuesCountAt(long index) { return VkD3D12FenceSubmitInfoKHR.get_signalSemaphoreValuesCount(this.segment(), index); }
    /// {@return `signalSemaphoreValuesCount`}
    public @CType("uint32_t") int signalSemaphoreValuesCount() { return VkD3D12FenceSubmitInfoKHR.get_signalSemaphoreValuesCount(this.segment()); }
    /// Sets `signalSemaphoreValuesCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_signalSemaphoreValuesCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_signalSemaphoreValuesCount.set(segment, 0L, index, value); }
    /// Sets `signalSemaphoreValuesCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_signalSemaphoreValuesCount(MemorySegment segment, @CType("uint32_t") int value) { VkD3D12FenceSubmitInfoKHR.set_signalSemaphoreValuesCount(segment, 0L, value); }
    /// Sets `signalSemaphoreValuesCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkD3D12FenceSubmitInfoKHR signalSemaphoreValuesCountAt(long index, @CType("uint32_t") int value) { VkD3D12FenceSubmitInfoKHR.set_signalSemaphoreValuesCount(this.segment(), index, value); return this; }
    /// Sets `signalSemaphoreValuesCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkD3D12FenceSubmitInfoKHR signalSemaphoreValuesCount(@CType("uint32_t") int value) { VkD3D12FenceSubmitInfoKHR.set_signalSemaphoreValuesCount(this.segment(), value); return this; }

    /// {@return `pSignalSemaphoreValues` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint64_t *") java.lang.foreign.MemorySegment get_pSignalSemaphoreValues(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pSignalSemaphoreValues.get(segment, 0L, index); }
    /// {@return `pSignalSemaphoreValues`}
    /// @param segment the segment of the struct
    public static @CType("const uint64_t *") java.lang.foreign.MemorySegment get_pSignalSemaphoreValues(MemorySegment segment) { return VkD3D12FenceSubmitInfoKHR.get_pSignalSemaphoreValues(segment, 0L); }
    /// {@return `pSignalSemaphoreValues` at the given index}
    /// @param index the index
    public @CType("const uint64_t *") java.lang.foreign.MemorySegment pSignalSemaphoreValuesAt(long index) { return VkD3D12FenceSubmitInfoKHR.get_pSignalSemaphoreValues(this.segment(), index); }
    /// {@return `pSignalSemaphoreValues`}
    public @CType("const uint64_t *") java.lang.foreign.MemorySegment pSignalSemaphoreValues() { return VkD3D12FenceSubmitInfoKHR.get_pSignalSemaphoreValues(this.segment()); }
    /// Sets `pSignalSemaphoreValues` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSignalSemaphoreValues(MemorySegment segment, long index, @CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VH_pSignalSemaphoreValues.set(segment, 0L, index, value); }
    /// Sets `pSignalSemaphoreValues` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSignalSemaphoreValues(MemorySegment segment, @CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VkD3D12FenceSubmitInfoKHR.set_pSignalSemaphoreValues(segment, 0L, value); }
    /// Sets `pSignalSemaphoreValues` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkD3D12FenceSubmitInfoKHR pSignalSemaphoreValuesAt(long index, @CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VkD3D12FenceSubmitInfoKHR.set_pSignalSemaphoreValues(this.segment(), index, value); return this; }
    /// Sets `pSignalSemaphoreValues` with the given value.
    /// @param value the value
    /// @return `this`
    public VkD3D12FenceSubmitInfoKHR pSignalSemaphoreValues(@CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VkD3D12FenceSubmitInfoKHR.set_pSignalSemaphoreValues(this.segment(), value); return this; }

}

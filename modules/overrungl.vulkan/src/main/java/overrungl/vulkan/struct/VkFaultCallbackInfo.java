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
package overrungl.vulkan.struct;

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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### faultCount
/// [VarHandle][#VH_faultCount] - [Getter][#faultCount()] - [Setter][#faultCount(int)]
/// ### pFaults
/// [VarHandle][#VH_pFaults] - [Getter][#pFaults()] - [Setter][#pFaults(MemorySegment)]
/// ### pfnFaultCallback
/// [VarHandle][#VH_pfnFaultCallback] - [Getter][#pfnFaultCallback()] - [Setter][#pfnFaultCallback(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkFaultCallbackInfo {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t faultCount;
///     VkFaultData * pFaults;
///     PFN_vkFaultCallbackFunction pfnFaultCallback;
/// } VkFaultCallbackInfo;
/// ```
public sealed class VkFaultCallbackInfo extends Struct {
    /// The struct layout of `VkFaultCallbackInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("faultCount"),
        ValueLayout.ADDRESS.withName("pFaults"),
        ValueLayout.ADDRESS.withName("pfnFaultCallback")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `faultCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_faultCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("faultCount"));
    /// The [VarHandle] of `pFaults` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pFaults = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pFaults"));
    /// The [VarHandle] of `pfnFaultCallback` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pfnFaultCallback = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pfnFaultCallback"));

    /// Creates `VkFaultCallbackInfo` with the given segment.
    /// @param segment the memory segment
    public VkFaultCallbackInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkFaultCallbackInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFaultCallbackInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkFaultCallbackInfo(segment); }

    /// Creates `VkFaultCallbackInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkFaultCallbackInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFaultCallbackInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkFaultCallbackInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkFaultCallbackInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkFaultCallbackInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFaultCallbackInfo`
    public static VkFaultCallbackInfo alloc(SegmentAllocator allocator) { return new VkFaultCallbackInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkFaultCallbackInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkFaultCallbackInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkFaultCallbackInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFaultCallbackInfo`
    public static VkFaultCallbackInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("uint32_t") int faultCount, @CType("VkFaultData *") MemorySegment pFaults, @CType("PFN_vkFaultCallbackFunction") MemorySegment pfnFaultCallback) { return alloc(allocator).sType(sType).pNext(pNext).faultCount(faultCount).pFaults(pFaults).pfnFaultCallback(pfnFaultCallback); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkFaultCallbackInfo copyFrom(VkFaultCallbackInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkFaultCallbackInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkFaultCallbackInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkFaultCallbackInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFaultCallbackInfo sType(@CType("VkStructureType") int value) { VkFaultCallbackInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkFaultCallbackInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkFaultCallbackInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkFaultCallbackInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFaultCallbackInfo pNext(@CType("const void *") MemorySegment value) { VkFaultCallbackInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `faultCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_faultCount(MemorySegment segment, long index) { return (int) VH_faultCount.get(segment, 0L, index); }
    /// {@return `faultCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_faultCount(MemorySegment segment) { return VkFaultCallbackInfo.get_faultCount(segment, 0L); }
    /// {@return `faultCount`}
    public @CType("uint32_t") int faultCount() { return VkFaultCallbackInfo.get_faultCount(this.segment()); }
    /// Sets `faultCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_faultCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_faultCount.set(segment, 0L, index, value); }
    /// Sets `faultCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_faultCount(MemorySegment segment, @CType("uint32_t") int value) { VkFaultCallbackInfo.set_faultCount(segment, 0L, value); }
    /// Sets `faultCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFaultCallbackInfo faultCount(@CType("uint32_t") int value) { VkFaultCallbackInfo.set_faultCount(this.segment(), value); return this; }

    /// {@return `pFaults` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFaultData *") MemorySegment get_pFaults(MemorySegment segment, long index) { return (MemorySegment) VH_pFaults.get(segment, 0L, index); }
    /// {@return `pFaults`}
    /// @param segment the segment of the struct
    public static @CType("VkFaultData *") MemorySegment get_pFaults(MemorySegment segment) { return VkFaultCallbackInfo.get_pFaults(segment, 0L); }
    /// {@return `pFaults`}
    public @CType("VkFaultData *") MemorySegment pFaults() { return VkFaultCallbackInfo.get_pFaults(this.segment()); }
    /// Sets `pFaults` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pFaults(MemorySegment segment, long index, @CType("VkFaultData *") MemorySegment value) { VH_pFaults.set(segment, 0L, index, value); }
    /// Sets `pFaults` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pFaults(MemorySegment segment, @CType("VkFaultData *") MemorySegment value) { VkFaultCallbackInfo.set_pFaults(segment, 0L, value); }
    /// Sets `pFaults` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFaultCallbackInfo pFaults(@CType("VkFaultData *") MemorySegment value) { VkFaultCallbackInfo.set_pFaults(this.segment(), value); return this; }

    /// {@return `pfnFaultCallback` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("PFN_vkFaultCallbackFunction") MemorySegment get_pfnFaultCallback(MemorySegment segment, long index) { return (MemorySegment) VH_pfnFaultCallback.get(segment, 0L, index); }
    /// {@return `pfnFaultCallback`}
    /// @param segment the segment of the struct
    public static @CType("PFN_vkFaultCallbackFunction") MemorySegment get_pfnFaultCallback(MemorySegment segment) { return VkFaultCallbackInfo.get_pfnFaultCallback(segment, 0L); }
    /// {@return `pfnFaultCallback`}
    public @CType("PFN_vkFaultCallbackFunction") MemorySegment pfnFaultCallback() { return VkFaultCallbackInfo.get_pfnFaultCallback(this.segment()); }
    /// Sets `pfnFaultCallback` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pfnFaultCallback(MemorySegment segment, long index, @CType("PFN_vkFaultCallbackFunction") MemorySegment value) { VH_pfnFaultCallback.set(segment, 0L, index, value); }
    /// Sets `pfnFaultCallback` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pfnFaultCallback(MemorySegment segment, @CType("PFN_vkFaultCallbackFunction") MemorySegment value) { VkFaultCallbackInfo.set_pfnFaultCallback(segment, 0L, value); }
    /// Sets `pfnFaultCallback` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFaultCallbackInfo pfnFaultCallback(@CType("PFN_vkFaultCallbackFunction") MemorySegment value) { VkFaultCallbackInfo.set_pfnFaultCallback(this.segment(), value); return this; }

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
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkFaultCallbackInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkFaultCallbackInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkFaultCallbackInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkFaultCallbackInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `faultCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int faultCountAt(long index) { return VkFaultCallbackInfo.get_faultCount(this.segment(), index); }
        /// Sets `faultCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer faultCountAt(long index, @CType("uint32_t") int value) { VkFaultCallbackInfo.set_faultCount(this.segment(), index, value); return this; }

        /// {@return `pFaults` at the given index}
        /// @param index the index
        public @CType("VkFaultData *") MemorySegment pFaultsAt(long index) { return VkFaultCallbackInfo.get_pFaults(this.segment(), index); }
        /// Sets `pFaults` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pFaultsAt(long index, @CType("VkFaultData *") MemorySegment value) { VkFaultCallbackInfo.set_pFaults(this.segment(), index, value); return this; }

        /// {@return `pfnFaultCallback` at the given index}
        /// @param index the index
        public @CType("PFN_vkFaultCallbackFunction") MemorySegment pfnFaultCallbackAt(long index) { return VkFaultCallbackInfo.get_pfnFaultCallback(this.segment(), index); }
        /// Sets `pfnFaultCallback` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pfnFaultCallbackAt(long index, @CType("PFN_vkFaultCallbackFunction") MemorySegment value) { VkFaultCallbackInfo.set_pfnFaultCallback(this.segment(), index, value); return this; }

    }
}

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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### waitSemaphoreValueCount
/// [VarHandle][#VH_waitSemaphoreValueCount] - [Getter][#waitSemaphoreValueCount()] - [Setter][#waitSemaphoreValueCount(int)]
/// ### pWaitSemaphoreValues
/// [VarHandle][#VH_pWaitSemaphoreValues] - [Getter][#pWaitSemaphoreValues()] - [Setter][#pWaitSemaphoreValues(java.lang.foreign.MemorySegment)]
/// ### signalSemaphoreValueCount
/// [VarHandle][#VH_signalSemaphoreValueCount] - [Getter][#signalSemaphoreValueCount()] - [Setter][#signalSemaphoreValueCount(int)]
/// ### pSignalSemaphoreValues
/// [VarHandle][#VH_pSignalSemaphoreValues] - [Getter][#pSignalSemaphoreValues()] - [Setter][#pSignalSemaphoreValues(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkTimelineSemaphoreSubmitInfo {
///     VkStructureType sType;
///     const void * pNext;
///     uint32_t waitSemaphoreValueCount;
///     const uint64_t * pWaitSemaphoreValues;
///     uint32_t signalSemaphoreValueCount;
///     const uint64_t * pSignalSemaphoreValues;
/// } VkTimelineSemaphoreSubmitInfo;
/// ```
public sealed class VkTimelineSemaphoreSubmitInfo extends Struct {
    /// The struct layout of `VkTimelineSemaphoreSubmitInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreValueCount"),
        ValueLayout.ADDRESS.withName("pWaitSemaphoreValues"),
        ValueLayout.JAVA_INT.withName("signalSemaphoreValueCount"),
        ValueLayout.ADDRESS.withName("pSignalSemaphoreValues")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `waitSemaphoreValueCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_waitSemaphoreValueCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("waitSemaphoreValueCount"));
    /// The [VarHandle] of `pWaitSemaphoreValues` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pWaitSemaphoreValues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pWaitSemaphoreValues"));
    /// The [VarHandle] of `signalSemaphoreValueCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_signalSemaphoreValueCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("signalSemaphoreValueCount"));
    /// The [VarHandle] of `pSignalSemaphoreValues` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pSignalSemaphoreValues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSignalSemaphoreValues"));

    /// Creates `VkTimelineSemaphoreSubmitInfo` with the given segment.
    /// @param segment the memory segment
    public VkTimelineSemaphoreSubmitInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkTimelineSemaphoreSubmitInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTimelineSemaphoreSubmitInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkTimelineSemaphoreSubmitInfo(segment); }

    /// Creates `VkTimelineSemaphoreSubmitInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkTimelineSemaphoreSubmitInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTimelineSemaphoreSubmitInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkTimelineSemaphoreSubmitInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkTimelineSemaphoreSubmitInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkTimelineSemaphoreSubmitInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkTimelineSemaphoreSubmitInfo`
    public static VkTimelineSemaphoreSubmitInfo alloc(SegmentAllocator allocator) { return new VkTimelineSemaphoreSubmitInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkTimelineSemaphoreSubmitInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkTimelineSemaphoreSubmitInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkTimelineSemaphoreSubmitInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkTimelineSemaphoreSubmitInfo`
    public static VkTimelineSemaphoreSubmitInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int waitSemaphoreValueCount, @CType("const uint64_t *") java.lang.foreign.MemorySegment pWaitSemaphoreValues, @CType("uint32_t") int signalSemaphoreValueCount, @CType("const uint64_t *") java.lang.foreign.MemorySegment pSignalSemaphoreValues) { return alloc(allocator).sType(sType).pNext(pNext).waitSemaphoreValueCount(waitSemaphoreValueCount).pWaitSemaphoreValues(pWaitSemaphoreValues).signalSemaphoreValueCount(signalSemaphoreValueCount).pSignalSemaphoreValues(pSignalSemaphoreValues); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkTimelineSemaphoreSubmitInfo copyFrom(VkTimelineSemaphoreSubmitInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkTimelineSemaphoreSubmitInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkTimelineSemaphoreSubmitInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkTimelineSemaphoreSubmitInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTimelineSemaphoreSubmitInfo sType(@CType("VkStructureType") int value) { VkTimelineSemaphoreSubmitInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkTimelineSemaphoreSubmitInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkTimelineSemaphoreSubmitInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkTimelineSemaphoreSubmitInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTimelineSemaphoreSubmitInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkTimelineSemaphoreSubmitInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `waitSemaphoreValueCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_waitSemaphoreValueCount(MemorySegment segment, long index) { return (int) VH_waitSemaphoreValueCount.get(segment, 0L, index); }
    /// {@return `waitSemaphoreValueCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_waitSemaphoreValueCount(MemorySegment segment) { return VkTimelineSemaphoreSubmitInfo.get_waitSemaphoreValueCount(segment, 0L); }
    /// {@return `waitSemaphoreValueCount`}
    public @CType("uint32_t") int waitSemaphoreValueCount() { return VkTimelineSemaphoreSubmitInfo.get_waitSemaphoreValueCount(this.segment()); }
    /// Sets `waitSemaphoreValueCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_waitSemaphoreValueCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_waitSemaphoreValueCount.set(segment, 0L, index, value); }
    /// Sets `waitSemaphoreValueCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_waitSemaphoreValueCount(MemorySegment segment, @CType("uint32_t") int value) { VkTimelineSemaphoreSubmitInfo.set_waitSemaphoreValueCount(segment, 0L, value); }
    /// Sets `waitSemaphoreValueCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTimelineSemaphoreSubmitInfo waitSemaphoreValueCount(@CType("uint32_t") int value) { VkTimelineSemaphoreSubmitInfo.set_waitSemaphoreValueCount(this.segment(), value); return this; }

    /// {@return `pWaitSemaphoreValues` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint64_t *") java.lang.foreign.MemorySegment get_pWaitSemaphoreValues(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pWaitSemaphoreValues.get(segment, 0L, index); }
    /// {@return `pWaitSemaphoreValues`}
    /// @param segment the segment of the struct
    public static @CType("const uint64_t *") java.lang.foreign.MemorySegment get_pWaitSemaphoreValues(MemorySegment segment) { return VkTimelineSemaphoreSubmitInfo.get_pWaitSemaphoreValues(segment, 0L); }
    /// {@return `pWaitSemaphoreValues`}
    public @CType("const uint64_t *") java.lang.foreign.MemorySegment pWaitSemaphoreValues() { return VkTimelineSemaphoreSubmitInfo.get_pWaitSemaphoreValues(this.segment()); }
    /// Sets `pWaitSemaphoreValues` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pWaitSemaphoreValues(MemorySegment segment, long index, @CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VH_pWaitSemaphoreValues.set(segment, 0L, index, value); }
    /// Sets `pWaitSemaphoreValues` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pWaitSemaphoreValues(MemorySegment segment, @CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VkTimelineSemaphoreSubmitInfo.set_pWaitSemaphoreValues(segment, 0L, value); }
    /// Sets `pWaitSemaphoreValues` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTimelineSemaphoreSubmitInfo pWaitSemaphoreValues(@CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VkTimelineSemaphoreSubmitInfo.set_pWaitSemaphoreValues(this.segment(), value); return this; }

    /// {@return `signalSemaphoreValueCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_signalSemaphoreValueCount(MemorySegment segment, long index) { return (int) VH_signalSemaphoreValueCount.get(segment, 0L, index); }
    /// {@return `signalSemaphoreValueCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_signalSemaphoreValueCount(MemorySegment segment) { return VkTimelineSemaphoreSubmitInfo.get_signalSemaphoreValueCount(segment, 0L); }
    /// {@return `signalSemaphoreValueCount`}
    public @CType("uint32_t") int signalSemaphoreValueCount() { return VkTimelineSemaphoreSubmitInfo.get_signalSemaphoreValueCount(this.segment()); }
    /// Sets `signalSemaphoreValueCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_signalSemaphoreValueCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_signalSemaphoreValueCount.set(segment, 0L, index, value); }
    /// Sets `signalSemaphoreValueCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_signalSemaphoreValueCount(MemorySegment segment, @CType("uint32_t") int value) { VkTimelineSemaphoreSubmitInfo.set_signalSemaphoreValueCount(segment, 0L, value); }
    /// Sets `signalSemaphoreValueCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTimelineSemaphoreSubmitInfo signalSemaphoreValueCount(@CType("uint32_t") int value) { VkTimelineSemaphoreSubmitInfo.set_signalSemaphoreValueCount(this.segment(), value); return this; }

    /// {@return `pSignalSemaphoreValues` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint64_t *") java.lang.foreign.MemorySegment get_pSignalSemaphoreValues(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pSignalSemaphoreValues.get(segment, 0L, index); }
    /// {@return `pSignalSemaphoreValues`}
    /// @param segment the segment of the struct
    public static @CType("const uint64_t *") java.lang.foreign.MemorySegment get_pSignalSemaphoreValues(MemorySegment segment) { return VkTimelineSemaphoreSubmitInfo.get_pSignalSemaphoreValues(segment, 0L); }
    /// {@return `pSignalSemaphoreValues`}
    public @CType("const uint64_t *") java.lang.foreign.MemorySegment pSignalSemaphoreValues() { return VkTimelineSemaphoreSubmitInfo.get_pSignalSemaphoreValues(this.segment()); }
    /// Sets `pSignalSemaphoreValues` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSignalSemaphoreValues(MemorySegment segment, long index, @CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VH_pSignalSemaphoreValues.set(segment, 0L, index, value); }
    /// Sets `pSignalSemaphoreValues` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSignalSemaphoreValues(MemorySegment segment, @CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VkTimelineSemaphoreSubmitInfo.set_pSignalSemaphoreValues(segment, 0L, value); }
    /// Sets `pSignalSemaphoreValues` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTimelineSemaphoreSubmitInfo pSignalSemaphoreValues(@CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VkTimelineSemaphoreSubmitInfo.set_pSignalSemaphoreValues(this.segment(), value); return this; }

    /// A buffer of [VkTimelineSemaphoreSubmitInfo].
    public static final class Buffer extends VkTimelineSemaphoreSubmitInfo {
        private final long elementCount;

        /// Creates `VkTimelineSemaphoreSubmitInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkTimelineSemaphoreSubmitInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkTimelineSemaphoreSubmitInfo`
        public VkTimelineSemaphoreSubmitInfo asSlice(long index) { return new VkTimelineSemaphoreSubmitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkTimelineSemaphoreSubmitInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkTimelineSemaphoreSubmitInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkTimelineSemaphoreSubmitInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkTimelineSemaphoreSubmitInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkTimelineSemaphoreSubmitInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkTimelineSemaphoreSubmitInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `waitSemaphoreValueCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int waitSemaphoreValueCountAt(long index) { return VkTimelineSemaphoreSubmitInfo.get_waitSemaphoreValueCount(this.segment(), index); }
        /// Sets `waitSemaphoreValueCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer waitSemaphoreValueCountAt(long index, @CType("uint32_t") int value) { VkTimelineSemaphoreSubmitInfo.set_waitSemaphoreValueCount(this.segment(), index, value); return this; }

        /// {@return `pWaitSemaphoreValues` at the given index}
        /// @param index the index
        public @CType("const uint64_t *") java.lang.foreign.MemorySegment pWaitSemaphoreValuesAt(long index) { return VkTimelineSemaphoreSubmitInfo.get_pWaitSemaphoreValues(this.segment(), index); }
        /// Sets `pWaitSemaphoreValues` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pWaitSemaphoreValuesAt(long index, @CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VkTimelineSemaphoreSubmitInfo.set_pWaitSemaphoreValues(this.segment(), index, value); return this; }

        /// {@return `signalSemaphoreValueCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int signalSemaphoreValueCountAt(long index) { return VkTimelineSemaphoreSubmitInfo.get_signalSemaphoreValueCount(this.segment(), index); }
        /// Sets `signalSemaphoreValueCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer signalSemaphoreValueCountAt(long index, @CType("uint32_t") int value) { VkTimelineSemaphoreSubmitInfo.set_signalSemaphoreValueCount(this.segment(), index, value); return this; }

        /// {@return `pSignalSemaphoreValues` at the given index}
        /// @param index the index
        public @CType("const uint64_t *") java.lang.foreign.MemorySegment pSignalSemaphoreValuesAt(long index) { return VkTimelineSemaphoreSubmitInfo.get_pSignalSemaphoreValues(this.segment(), index); }
        /// Sets `pSignalSemaphoreValues` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pSignalSemaphoreValuesAt(long index, @CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VkTimelineSemaphoreSubmitInfo.set_pSignalSemaphoreValues(this.segment(), index, value); return this; }

    }
}

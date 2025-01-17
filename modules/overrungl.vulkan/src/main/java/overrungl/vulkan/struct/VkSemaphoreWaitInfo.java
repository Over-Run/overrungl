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
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### semaphoreCount
/// [VarHandle][#VH_semaphoreCount] - [Getter][#semaphoreCount()] - [Setter][#semaphoreCount(int)]
/// ### pSemaphores
/// [VarHandle][#VH_pSemaphores] - [Getter][#pSemaphores()] - [Setter][#pSemaphores(java.lang.foreign.MemorySegment)]
/// ### pValues
/// [VarHandle][#VH_pValues] - [Getter][#pValues()] - [Setter][#pValues(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSemaphoreWaitInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkSemaphoreWaitFlags flags;
///     uint32_t semaphoreCount;
///     const VkSemaphore * pSemaphores;
///     const uint64_t * pValues;
/// } VkSemaphoreWaitInfo;
/// ```
public sealed class VkSemaphoreWaitInfo extends Struct {
    /// The struct layout of `VkSemaphoreWaitInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("semaphoreCount"),
        ValueLayout.ADDRESS.withName("pSemaphores"),
        ValueLayout.ADDRESS.withName("pValues")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `semaphoreCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_semaphoreCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphoreCount"));
    /// The [VarHandle] of `pSemaphores` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pSemaphores = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pSemaphores"));
    /// The [VarHandle] of `pValues` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pValues = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pValues"));

    /// Creates `VkSemaphoreWaitInfo` with the given segment.
    /// @param segment the memory segment
    public VkSemaphoreWaitInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSemaphoreWaitInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreWaitInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSemaphoreWaitInfo(segment); }

    /// Creates `VkSemaphoreWaitInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSemaphoreWaitInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreWaitInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSemaphoreWaitInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSemaphoreWaitInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSemaphoreWaitInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSemaphoreWaitInfo`
    public static VkSemaphoreWaitInfo alloc(SegmentAllocator allocator) { return new VkSemaphoreWaitInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSemaphoreWaitInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSemaphoreWaitInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSemaphoreWaitInfo` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSemaphoreWaitInfo`
    public static VkSemaphoreWaitInfo allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkSemaphoreWaitFlags") int flags, @CType("uint32_t") int semaphoreCount, @CType("const VkSemaphore *") java.lang.foreign.MemorySegment pSemaphores, @CType("const uint64_t *") java.lang.foreign.MemorySegment pValues) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).semaphoreCount(semaphoreCount).pSemaphores(pSemaphores).pValues(pValues); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSemaphoreWaitInfo copyFrom(VkSemaphoreWaitInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSemaphoreWaitInfo.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSemaphoreWaitInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSemaphoreWaitInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreWaitInfo sType(@CType("VkStructureType") int value) { VkSemaphoreWaitInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSemaphoreWaitInfo.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkSemaphoreWaitInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSemaphoreWaitInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreWaitInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkSemaphoreWaitInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSemaphoreWaitFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkSemaphoreWaitFlags") int get_flags(MemorySegment segment) { return VkSemaphoreWaitInfo.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkSemaphoreWaitFlags") int flags() { return VkSemaphoreWaitInfo.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkSemaphoreWaitFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkSemaphoreWaitFlags") int value) { VkSemaphoreWaitInfo.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreWaitInfo flags(@CType("VkSemaphoreWaitFlags") int value) { VkSemaphoreWaitInfo.set_flags(this.segment(), value); return this; }

    /// {@return `semaphoreCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_semaphoreCount(MemorySegment segment, long index) { return (int) VH_semaphoreCount.get(segment, 0L, index); }
    /// {@return `semaphoreCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_semaphoreCount(MemorySegment segment) { return VkSemaphoreWaitInfo.get_semaphoreCount(segment, 0L); }
    /// {@return `semaphoreCount`}
    public @CType("uint32_t") int semaphoreCount() { return VkSemaphoreWaitInfo.get_semaphoreCount(this.segment()); }
    /// Sets `semaphoreCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_semaphoreCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_semaphoreCount.set(segment, 0L, index, value); }
    /// Sets `semaphoreCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_semaphoreCount(MemorySegment segment, @CType("uint32_t") int value) { VkSemaphoreWaitInfo.set_semaphoreCount(segment, 0L, value); }
    /// Sets `semaphoreCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreWaitInfo semaphoreCount(@CType("uint32_t") int value) { VkSemaphoreWaitInfo.set_semaphoreCount(this.segment(), value); return this; }

    /// {@return `pSemaphores` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSemaphore *") java.lang.foreign.MemorySegment get_pSemaphores(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pSemaphores.get(segment, 0L, index); }
    /// {@return `pSemaphores`}
    /// @param segment the segment of the struct
    public static @CType("const VkSemaphore *") java.lang.foreign.MemorySegment get_pSemaphores(MemorySegment segment) { return VkSemaphoreWaitInfo.get_pSemaphores(segment, 0L); }
    /// {@return `pSemaphores`}
    public @CType("const VkSemaphore *") java.lang.foreign.MemorySegment pSemaphores() { return VkSemaphoreWaitInfo.get_pSemaphores(this.segment()); }
    /// Sets `pSemaphores` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pSemaphores(MemorySegment segment, long index, @CType("const VkSemaphore *") java.lang.foreign.MemorySegment value) { VH_pSemaphores.set(segment, 0L, index, value); }
    /// Sets `pSemaphores` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pSemaphores(MemorySegment segment, @CType("const VkSemaphore *") java.lang.foreign.MemorySegment value) { VkSemaphoreWaitInfo.set_pSemaphores(segment, 0L, value); }
    /// Sets `pSemaphores` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreWaitInfo pSemaphores(@CType("const VkSemaphore *") java.lang.foreign.MemorySegment value) { VkSemaphoreWaitInfo.set_pSemaphores(this.segment(), value); return this; }

    /// {@return `pValues` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const uint64_t *") java.lang.foreign.MemorySegment get_pValues(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pValues.get(segment, 0L, index); }
    /// {@return `pValues`}
    /// @param segment the segment of the struct
    public static @CType("const uint64_t *") java.lang.foreign.MemorySegment get_pValues(MemorySegment segment) { return VkSemaphoreWaitInfo.get_pValues(segment, 0L); }
    /// {@return `pValues`}
    public @CType("const uint64_t *") java.lang.foreign.MemorySegment pValues() { return VkSemaphoreWaitInfo.get_pValues(this.segment()); }
    /// Sets `pValues` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pValues(MemorySegment segment, long index, @CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VH_pValues.set(segment, 0L, index, value); }
    /// Sets `pValues` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pValues(MemorySegment segment, @CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VkSemaphoreWaitInfo.set_pValues(segment, 0L, value); }
    /// Sets `pValues` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreWaitInfo pValues(@CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VkSemaphoreWaitInfo.set_pValues(this.segment(), value); return this; }

    /// A buffer of [VkSemaphoreWaitInfo].
    public static final class Buffer extends VkSemaphoreWaitInfo {
        private final long elementCount;

        /// Creates `VkSemaphoreWaitInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSemaphoreWaitInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSemaphoreWaitInfo`
        public VkSemaphoreWaitInfo asSlice(long index) { return new VkSemaphoreWaitInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSemaphoreWaitInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSemaphoreWaitInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkSemaphoreWaitInfo.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkSemaphoreWaitInfo.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSemaphoreWaitInfo.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSemaphoreWaitInfo.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkSemaphoreWaitFlags") int flagsAt(long index) { return VkSemaphoreWaitInfo.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkSemaphoreWaitFlags") int value) { VkSemaphoreWaitInfo.set_flags(this.segment(), index, value); return this; }

        /// {@return `semaphoreCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int semaphoreCountAt(long index) { return VkSemaphoreWaitInfo.get_semaphoreCount(this.segment(), index); }
        /// Sets `semaphoreCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer semaphoreCountAt(long index, @CType("uint32_t") int value) { VkSemaphoreWaitInfo.set_semaphoreCount(this.segment(), index, value); return this; }

        /// {@return `pSemaphores` at the given index}
        /// @param index the index
        public @CType("const VkSemaphore *") java.lang.foreign.MemorySegment pSemaphoresAt(long index) { return VkSemaphoreWaitInfo.get_pSemaphores(this.segment(), index); }
        /// Sets `pSemaphores` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pSemaphoresAt(long index, @CType("const VkSemaphore *") java.lang.foreign.MemorySegment value) { VkSemaphoreWaitInfo.set_pSemaphores(this.segment(), index, value); return this; }

        /// {@return `pValues` at the given index}
        /// @param index the index
        public @CType("const uint64_t *") java.lang.foreign.MemorySegment pValuesAt(long index) { return VkSemaphoreWaitInfo.get_pValues(this.segment(), index); }
        /// Sets `pValues` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pValuesAt(long index, @CType("const uint64_t *") java.lang.foreign.MemorySegment value) { VkSemaphoreWaitInfo.set_pValues(this.segment(), index, value); return this; }

    }
}

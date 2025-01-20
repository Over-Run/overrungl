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
package overrungl.vulkan.nv.struct;

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
/// ### semaphore
/// [VarHandle][#VH_semaphore] - [Getter][#semaphore()] - [Setter][#semaphore(MemorySegment)]
/// ### handleType
/// [VarHandle][#VH_handleType] - [Getter][#handleType()] - [Setter][#handleType(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSemaphoreGetSciSyncInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkSemaphore semaphore;
///     VkExternalSemaphoreHandleTypeFlagBits handleType;
/// } VkSemaphoreGetSciSyncInfoNV;
/// ```
public sealed class VkSemaphoreGetSciSyncInfoNV extends Struct {
    /// The struct layout of `VkSemaphoreGetSciSyncInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("semaphore"),
        ValueLayout.JAVA_INT.withName("handleType")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `semaphore` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_semaphore = LAYOUT.arrayElementVarHandle(PathElement.groupElement("semaphore"));
    /// The [VarHandle] of `handleType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_handleType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handleType"));

    /// Creates `VkSemaphoreGetSciSyncInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkSemaphoreGetSciSyncInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSemaphoreGetSciSyncInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreGetSciSyncInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSemaphoreGetSciSyncInfoNV(segment); }

    /// Creates `VkSemaphoreGetSciSyncInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSemaphoreGetSciSyncInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSemaphoreGetSciSyncInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSemaphoreGetSciSyncInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSemaphoreGetSciSyncInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSemaphoreGetSciSyncInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSemaphoreGetSciSyncInfoNV`
    public static VkSemaphoreGetSciSyncInfoNV alloc(SegmentAllocator allocator) { return new VkSemaphoreGetSciSyncInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSemaphoreGetSciSyncInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSemaphoreGetSciSyncInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkSemaphoreGetSciSyncInfoNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSemaphoreGetSciSyncInfoNV`
    public static VkSemaphoreGetSciSyncInfoNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkSemaphore") MemorySegment semaphore, @CType("VkExternalSemaphoreHandleTypeFlagBits") int handleType) { return alloc(allocator).sType(sType).pNext(pNext).semaphore(semaphore).handleType(handleType); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSemaphoreGetSciSyncInfoNV copyFrom(VkSemaphoreGetSciSyncInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSemaphoreGetSciSyncInfoNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSemaphoreGetSciSyncInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSemaphoreGetSciSyncInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreGetSciSyncInfoNV sType(@CType("VkStructureType") int value) { VkSemaphoreGetSciSyncInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkSemaphoreGetSciSyncInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkSemaphoreGetSciSyncInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkSemaphoreGetSciSyncInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreGetSciSyncInfoNV pNext(@CType("const void *") MemorySegment value) { VkSemaphoreGetSciSyncInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `semaphore` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSemaphore") MemorySegment get_semaphore(MemorySegment segment, long index) { return (MemorySegment) VH_semaphore.get(segment, 0L, index); }
    /// {@return `semaphore`}
    /// @param segment the segment of the struct
    public static @CType("VkSemaphore") MemorySegment get_semaphore(MemorySegment segment) { return VkSemaphoreGetSciSyncInfoNV.get_semaphore(segment, 0L); }
    /// {@return `semaphore`}
    public @CType("VkSemaphore") MemorySegment semaphore() { return VkSemaphoreGetSciSyncInfoNV.get_semaphore(this.segment()); }
    /// Sets `semaphore` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_semaphore(MemorySegment segment, long index, @CType("VkSemaphore") MemorySegment value) { VH_semaphore.set(segment, 0L, index, value); }
    /// Sets `semaphore` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_semaphore(MemorySegment segment, @CType("VkSemaphore") MemorySegment value) { VkSemaphoreGetSciSyncInfoNV.set_semaphore(segment, 0L, value); }
    /// Sets `semaphore` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreGetSciSyncInfoNV semaphore(@CType("VkSemaphore") MemorySegment value) { VkSemaphoreGetSciSyncInfoNV.set_semaphore(this.segment(), value); return this; }

    /// {@return `handleType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExternalSemaphoreHandleTypeFlagBits") int get_handleType(MemorySegment segment, long index) { return (int) VH_handleType.get(segment, 0L, index); }
    /// {@return `handleType`}
    /// @param segment the segment of the struct
    public static @CType("VkExternalSemaphoreHandleTypeFlagBits") int get_handleType(MemorySegment segment) { return VkSemaphoreGetSciSyncInfoNV.get_handleType(segment, 0L); }
    /// {@return `handleType`}
    public @CType("VkExternalSemaphoreHandleTypeFlagBits") int handleType() { return VkSemaphoreGetSciSyncInfoNV.get_handleType(this.segment()); }
    /// Sets `handleType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_handleType(MemorySegment segment, long index, @CType("VkExternalSemaphoreHandleTypeFlagBits") int value) { VH_handleType.set(segment, 0L, index, value); }
    /// Sets `handleType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_handleType(MemorySegment segment, @CType("VkExternalSemaphoreHandleTypeFlagBits") int value) { VkSemaphoreGetSciSyncInfoNV.set_handleType(segment, 0L, value); }
    /// Sets `handleType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSemaphoreGetSciSyncInfoNV handleType(@CType("VkExternalSemaphoreHandleTypeFlagBits") int value) { VkSemaphoreGetSciSyncInfoNV.set_handleType(this.segment(), value); return this; }

    /// A buffer of [VkSemaphoreGetSciSyncInfoNV].
    public static final class Buffer extends VkSemaphoreGetSciSyncInfoNV {
        private final long elementCount;

        /// Creates `VkSemaphoreGetSciSyncInfoNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSemaphoreGetSciSyncInfoNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSemaphoreGetSciSyncInfoNV`
        public VkSemaphoreGetSciSyncInfoNV asSlice(long index) { return new VkSemaphoreGetSciSyncInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSemaphoreGetSciSyncInfoNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSemaphoreGetSciSyncInfoNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkSemaphoreGetSciSyncInfoNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkSemaphoreGetSciSyncInfoNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkSemaphoreGetSciSyncInfoNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkSemaphoreGetSciSyncInfoNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `semaphore` at the given index}
        /// @param index the index
        public @CType("VkSemaphore") MemorySegment semaphoreAt(long index) { return VkSemaphoreGetSciSyncInfoNV.get_semaphore(this.segment(), index); }
        /// Sets `semaphore` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer semaphoreAt(long index, @CType("VkSemaphore") MemorySegment value) { VkSemaphoreGetSciSyncInfoNV.set_semaphore(this.segment(), index, value); return this; }

        /// {@return `handleType` at the given index}
        /// @param index the index
        public @CType("VkExternalSemaphoreHandleTypeFlagBits") int handleTypeAt(long index) { return VkSemaphoreGetSciSyncInfoNV.get_handleType(this.segment(), index); }
        /// Sets `handleType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer handleTypeAt(long index, @CType("VkExternalSemaphoreHandleTypeFlagBits") int value) { VkSemaphoreGetSciSyncInfoNV.set_handleType(this.segment(), index, value); return this; }

    }
}

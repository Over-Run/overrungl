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
/// ### fence
/// [VarHandle][#VH_fence] - [Getter][#fence()] - [Setter][#fence(MemorySegment)]
/// ### handleType
/// [VarHandle][#VH_handleType] - [Getter][#handleType()] - [Setter][#handleType(int)]
/// ### handle
/// [VarHandle][#VH_handle] - [Getter][#handle()] - [Setter][#handle(MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImportFenceSciSyncInfoNV {
///     VkStructureType sType;
///     const void * pNext;
///     VkFence fence;
///     VkExternalFenceHandleTypeFlagBits handleType;
///     void * handle;
/// } VkImportFenceSciSyncInfoNV;
/// ```
public sealed class VkImportFenceSciSyncInfoNV extends Struct {
    /// The struct layout of `VkImportFenceSciSyncInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("fence"),
        ValueLayout.JAVA_INT.withName("handleType"),
        ValueLayout.ADDRESS.withName("handle")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `fence` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fence = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fence"));
    /// The [VarHandle] of `handleType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_handleType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handleType"));
    /// The [VarHandle] of `handle` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_handle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handle"));

    /// Creates `VkImportFenceSciSyncInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkImportFenceSciSyncInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImportFenceSciSyncInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportFenceSciSyncInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImportFenceSciSyncInfoNV(segment); }

    /// Creates `VkImportFenceSciSyncInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImportFenceSciSyncInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportFenceSciSyncInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImportFenceSciSyncInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImportFenceSciSyncInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkImportFenceSciSyncInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImportFenceSciSyncInfoNV`
    public static VkImportFenceSciSyncInfoNV alloc(SegmentAllocator allocator) { return new VkImportFenceSciSyncInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImportFenceSciSyncInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImportFenceSciSyncInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImportFenceSciSyncInfoNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImportFenceSciSyncInfoNV`
    public static VkImportFenceSciSyncInfoNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkFence") MemorySegment fence, @CType("VkExternalFenceHandleTypeFlagBits") int handleType, @CType("void *") MemorySegment handle) { return alloc(allocator).sType(sType).pNext(pNext).fence(fence).handleType(handleType).handle(handle); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImportFenceSciSyncInfoNV copyFrom(VkImportFenceSciSyncInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImportFenceSciSyncInfoNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImportFenceSciSyncInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImportFenceSciSyncInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportFenceSciSyncInfoNV sType(@CType("VkStructureType") int value) { VkImportFenceSciSyncInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkImportFenceSciSyncInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkImportFenceSciSyncInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkImportFenceSciSyncInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportFenceSciSyncInfoNV pNext(@CType("const void *") MemorySegment value) { VkImportFenceSciSyncInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `fence` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFence") MemorySegment get_fence(MemorySegment segment, long index) { return (MemorySegment) VH_fence.get(segment, 0L, index); }
    /// {@return `fence`}
    /// @param segment the segment of the struct
    public static @CType("VkFence") MemorySegment get_fence(MemorySegment segment) { return VkImportFenceSciSyncInfoNV.get_fence(segment, 0L); }
    /// {@return `fence`}
    public @CType("VkFence") MemorySegment fence() { return VkImportFenceSciSyncInfoNV.get_fence(this.segment()); }
    /// Sets `fence` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fence(MemorySegment segment, long index, @CType("VkFence") MemorySegment value) { VH_fence.set(segment, 0L, index, value); }
    /// Sets `fence` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fence(MemorySegment segment, @CType("VkFence") MemorySegment value) { VkImportFenceSciSyncInfoNV.set_fence(segment, 0L, value); }
    /// Sets `fence` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportFenceSciSyncInfoNV fence(@CType("VkFence") MemorySegment value) { VkImportFenceSciSyncInfoNV.set_fence(this.segment(), value); return this; }

    /// {@return `handleType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExternalFenceHandleTypeFlagBits") int get_handleType(MemorySegment segment, long index) { return (int) VH_handleType.get(segment, 0L, index); }
    /// {@return `handleType`}
    /// @param segment the segment of the struct
    public static @CType("VkExternalFenceHandleTypeFlagBits") int get_handleType(MemorySegment segment) { return VkImportFenceSciSyncInfoNV.get_handleType(segment, 0L); }
    /// {@return `handleType`}
    public @CType("VkExternalFenceHandleTypeFlagBits") int handleType() { return VkImportFenceSciSyncInfoNV.get_handleType(this.segment()); }
    /// Sets `handleType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_handleType(MemorySegment segment, long index, @CType("VkExternalFenceHandleTypeFlagBits") int value) { VH_handleType.set(segment, 0L, index, value); }
    /// Sets `handleType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_handleType(MemorySegment segment, @CType("VkExternalFenceHandleTypeFlagBits") int value) { VkImportFenceSciSyncInfoNV.set_handleType(segment, 0L, value); }
    /// Sets `handleType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportFenceSciSyncInfoNV handleType(@CType("VkExternalFenceHandleTypeFlagBits") int value) { VkImportFenceSciSyncInfoNV.set_handleType(this.segment(), value); return this; }

    /// {@return `handle` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_handle(MemorySegment segment, long index) { return (MemorySegment) VH_handle.get(segment, 0L, index); }
    /// {@return `handle`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_handle(MemorySegment segment) { return VkImportFenceSciSyncInfoNV.get_handle(segment, 0L); }
    /// {@return `handle`}
    public @CType("void *") MemorySegment handle() { return VkImportFenceSciSyncInfoNV.get_handle(this.segment()); }
    /// Sets `handle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_handle(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_handle.set(segment, 0L, index, value); }
    /// Sets `handle` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_handle(MemorySegment segment, @CType("void *") MemorySegment value) { VkImportFenceSciSyncInfoNV.set_handle(segment, 0L, value); }
    /// Sets `handle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportFenceSciSyncInfoNV handle(@CType("void *") MemorySegment value) { VkImportFenceSciSyncInfoNV.set_handle(this.segment(), value); return this; }

    /// A buffer of [VkImportFenceSciSyncInfoNV].
    public static final class Buffer extends VkImportFenceSciSyncInfoNV {
        private final long elementCount;

        /// Creates `VkImportFenceSciSyncInfoNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImportFenceSciSyncInfoNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImportFenceSciSyncInfoNV`
        public VkImportFenceSciSyncInfoNV asSlice(long index) { return new VkImportFenceSciSyncInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImportFenceSciSyncInfoNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImportFenceSciSyncInfoNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkImportFenceSciSyncInfoNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkImportFenceSciSyncInfoNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkImportFenceSciSyncInfoNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkImportFenceSciSyncInfoNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `fence` at the given index}
        /// @param index the index
        public @CType("VkFence") MemorySegment fenceAt(long index) { return VkImportFenceSciSyncInfoNV.get_fence(this.segment(), index); }
        /// Sets `fence` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer fenceAt(long index, @CType("VkFence") MemorySegment value) { VkImportFenceSciSyncInfoNV.set_fence(this.segment(), index, value); return this; }

        /// {@return `handleType` at the given index}
        /// @param index the index
        public @CType("VkExternalFenceHandleTypeFlagBits") int handleTypeAt(long index) { return VkImportFenceSciSyncInfoNV.get_handleType(this.segment(), index); }
        /// Sets `handleType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer handleTypeAt(long index, @CType("VkExternalFenceHandleTypeFlagBits") int value) { VkImportFenceSciSyncInfoNV.set_handleType(this.segment(), index, value); return this; }

        /// {@return `handle` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment handleAt(long index) { return VkImportFenceSciSyncInfoNV.get_handle(this.segment(), index); }
        /// Sets `handle` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer handleAt(long index, @CType("void *") MemorySegment value) { VkImportFenceSciSyncInfoNV.set_handle(this.segment(), index, value); return this; }

    }
}

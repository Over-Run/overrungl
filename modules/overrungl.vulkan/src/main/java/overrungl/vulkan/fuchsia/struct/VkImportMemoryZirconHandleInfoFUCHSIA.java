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
package overrungl.vulkan.fuchsia.struct;

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
/// ### handleType
/// [VarHandle][#VH_handleType] - [Getter][#handleType()] - [Setter][#handleType(int)]
/// ### handle
/// [VarHandle][#VH_handle] - [Getter][#handle()] - [Setter][#handle(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImportMemoryZirconHandleInfoFUCHSIA {
///     VkStructureType sType;
///     const void * pNext;
///     VkExternalMemoryHandleTypeFlagBits handleType;
///     zx_handle_t handle;
/// } VkImportMemoryZirconHandleInfoFUCHSIA;
/// ```
public sealed class VkImportMemoryZirconHandleInfoFUCHSIA extends Struct {
    /// The struct layout of `VkImportMemoryZirconHandleInfoFUCHSIA`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("handleType"),
        ValueLayout.JAVA_INT.withName("handle")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `handleType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_handleType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handleType"));
    /// The [VarHandle] of `handle` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_handle = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handle"));

    /// Creates `VkImportMemoryZirconHandleInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    public VkImportMemoryZirconHandleInfoFUCHSIA(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImportMemoryZirconHandleInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMemoryZirconHandleInfoFUCHSIA of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImportMemoryZirconHandleInfoFUCHSIA(segment); }

    /// Creates `VkImportMemoryZirconHandleInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImportMemoryZirconHandleInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMemoryZirconHandleInfoFUCHSIA ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImportMemoryZirconHandleInfoFUCHSIA(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImportMemoryZirconHandleInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkImportMemoryZirconHandleInfoFUCHSIA` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImportMemoryZirconHandleInfoFUCHSIA`
    public static VkImportMemoryZirconHandleInfoFUCHSIA alloc(SegmentAllocator allocator) { return new VkImportMemoryZirconHandleInfoFUCHSIA(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImportMemoryZirconHandleInfoFUCHSIA` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImportMemoryZirconHandleInfoFUCHSIA`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImportMemoryZirconHandleInfoFUCHSIA` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImportMemoryZirconHandleInfoFUCHSIA`
    public static VkImportMemoryZirconHandleInfoFUCHSIA allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkExternalMemoryHandleTypeFlagBits") int handleType, @CType("zx_handle_t") int handle) { return alloc(allocator).sType(sType).pNext(pNext).handleType(handleType).handle(handle); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImportMemoryZirconHandleInfoFUCHSIA copyFrom(VkImportMemoryZirconHandleInfoFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImportMemoryZirconHandleInfoFUCHSIA.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImportMemoryZirconHandleInfoFUCHSIA.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImportMemoryZirconHandleInfoFUCHSIA.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMemoryZirconHandleInfoFUCHSIA sType(@CType("VkStructureType") int value) { VkImportMemoryZirconHandleInfoFUCHSIA.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkImportMemoryZirconHandleInfoFUCHSIA.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkImportMemoryZirconHandleInfoFUCHSIA.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkImportMemoryZirconHandleInfoFUCHSIA.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMemoryZirconHandleInfoFUCHSIA pNext(@CType("const void *") MemorySegment value) { VkImportMemoryZirconHandleInfoFUCHSIA.set_pNext(this.segment(), value); return this; }

    /// {@return `handleType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExternalMemoryHandleTypeFlagBits") int get_handleType(MemorySegment segment, long index) { return (int) VH_handleType.get(segment, 0L, index); }
    /// {@return `handleType`}
    /// @param segment the segment of the struct
    public static @CType("VkExternalMemoryHandleTypeFlagBits") int get_handleType(MemorySegment segment) { return VkImportMemoryZirconHandleInfoFUCHSIA.get_handleType(segment, 0L); }
    /// {@return `handleType`}
    public @CType("VkExternalMemoryHandleTypeFlagBits") int handleType() { return VkImportMemoryZirconHandleInfoFUCHSIA.get_handleType(this.segment()); }
    /// Sets `handleType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_handleType(MemorySegment segment, long index, @CType("VkExternalMemoryHandleTypeFlagBits") int value) { VH_handleType.set(segment, 0L, index, value); }
    /// Sets `handleType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_handleType(MemorySegment segment, @CType("VkExternalMemoryHandleTypeFlagBits") int value) { VkImportMemoryZirconHandleInfoFUCHSIA.set_handleType(segment, 0L, value); }
    /// Sets `handleType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMemoryZirconHandleInfoFUCHSIA handleType(@CType("VkExternalMemoryHandleTypeFlagBits") int value) { VkImportMemoryZirconHandleInfoFUCHSIA.set_handleType(this.segment(), value); return this; }

    /// {@return `handle` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("zx_handle_t") int get_handle(MemorySegment segment, long index) { return (int) VH_handle.get(segment, 0L, index); }
    /// {@return `handle`}
    /// @param segment the segment of the struct
    public static @CType("zx_handle_t") int get_handle(MemorySegment segment) { return VkImportMemoryZirconHandleInfoFUCHSIA.get_handle(segment, 0L); }
    /// {@return `handle`}
    public @CType("zx_handle_t") int handle() { return VkImportMemoryZirconHandleInfoFUCHSIA.get_handle(this.segment()); }
    /// Sets `handle` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_handle(MemorySegment segment, long index, @CType("zx_handle_t") int value) { VH_handle.set(segment, 0L, index, value); }
    /// Sets `handle` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_handle(MemorySegment segment, @CType("zx_handle_t") int value) { VkImportMemoryZirconHandleInfoFUCHSIA.set_handle(segment, 0L, value); }
    /// Sets `handle` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMemoryZirconHandleInfoFUCHSIA handle(@CType("zx_handle_t") int value) { VkImportMemoryZirconHandleInfoFUCHSIA.set_handle(this.segment(), value); return this; }

    /// A buffer of [VkImportMemoryZirconHandleInfoFUCHSIA].
    public static final class Buffer extends VkImportMemoryZirconHandleInfoFUCHSIA {
        private final long elementCount;

        /// Creates `VkImportMemoryZirconHandleInfoFUCHSIA.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImportMemoryZirconHandleInfoFUCHSIA`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImportMemoryZirconHandleInfoFUCHSIA`
        public VkImportMemoryZirconHandleInfoFUCHSIA asSlice(long index) { return new VkImportMemoryZirconHandleInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImportMemoryZirconHandleInfoFUCHSIA`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImportMemoryZirconHandleInfoFUCHSIA`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkImportMemoryZirconHandleInfoFUCHSIA.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkImportMemoryZirconHandleInfoFUCHSIA.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkImportMemoryZirconHandleInfoFUCHSIA.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkImportMemoryZirconHandleInfoFUCHSIA.set_pNext(this.segment(), index, value); return this; }

        /// {@return `handleType` at the given index}
        /// @param index the index
        public @CType("VkExternalMemoryHandleTypeFlagBits") int handleTypeAt(long index) { return VkImportMemoryZirconHandleInfoFUCHSIA.get_handleType(this.segment(), index); }
        /// Sets `handleType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer handleTypeAt(long index, @CType("VkExternalMemoryHandleTypeFlagBits") int value) { VkImportMemoryZirconHandleInfoFUCHSIA.set_handleType(this.segment(), index, value); return this; }

        /// {@return `handle` at the given index}
        /// @param index the index
        public @CType("zx_handle_t") int handleAt(long index) { return VkImportMemoryZirconHandleInfoFUCHSIA.get_handle(this.segment(), index); }
        /// Sets `handle` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer handleAt(long index, @CType("zx_handle_t") int value) { VkImportMemoryZirconHandleInfoFUCHSIA.set_handle(this.segment(), index, value); return this; }

    }
}

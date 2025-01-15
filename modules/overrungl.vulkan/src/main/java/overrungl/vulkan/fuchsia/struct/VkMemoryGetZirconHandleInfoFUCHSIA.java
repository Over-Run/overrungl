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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### memory
/// [VarHandle][#VH_memory] - [Getter][#memory()] - [Setter][#memory(java.lang.foreign.MemorySegment)]
/// ### handleType
/// [VarHandle][#VH_handleType] - [Getter][#handleType()] - [Setter][#handleType(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMemoryGetZirconHandleInfoFUCHSIA {
///     VkStructureType sType;
///     const void * pNext;
///     VkDeviceMemory memory;
///     VkExternalMemoryHandleTypeFlagBits handleType;
/// } VkMemoryGetZirconHandleInfoFUCHSIA;
/// ```
public sealed class VkMemoryGetZirconHandleInfoFUCHSIA extends Struct {
    /// The struct layout of `VkMemoryGetZirconHandleInfoFUCHSIA`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("memory"),
        ValueLayout.JAVA_INT.withName("handleType")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `memory` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_memory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memory"));
    /// The [VarHandle] of `handleType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_handleType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("handleType"));

    /// Creates `VkMemoryGetZirconHandleInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    public VkMemoryGetZirconHandleInfoFUCHSIA(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMemoryGetZirconHandleInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryGetZirconHandleInfoFUCHSIA of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryGetZirconHandleInfoFUCHSIA(segment); }

    /// Creates `VkMemoryGetZirconHandleInfoFUCHSIA` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkMemoryGetZirconHandleInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryGetZirconHandleInfoFUCHSIA ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryGetZirconHandleInfoFUCHSIA(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMemoryGetZirconHandleInfoFUCHSIA` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkMemoryGetZirconHandleInfoFUCHSIA` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryGetZirconHandleInfoFUCHSIA`
    public static VkMemoryGetZirconHandleInfoFUCHSIA alloc(SegmentAllocator allocator) { return new VkMemoryGetZirconHandleInfoFUCHSIA(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMemoryGetZirconHandleInfoFUCHSIA` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMemoryGetZirconHandleInfoFUCHSIA`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkMemoryGetZirconHandleInfoFUCHSIA` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryGetZirconHandleInfoFUCHSIA`
    public static VkMemoryGetZirconHandleInfoFUCHSIA allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("VkDeviceMemory") java.lang.foreign.MemorySegment memory, @CType("VkExternalMemoryHandleTypeFlagBits") int handleType) { return alloc(allocator).sType(sType).pNext(pNext).memory(memory).handleType(handleType); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkMemoryGetZirconHandleInfoFUCHSIA copyFrom(VkMemoryGetZirconHandleInfoFUCHSIA src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkMemoryGetZirconHandleInfoFUCHSIA.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkMemoryGetZirconHandleInfoFUCHSIA.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkMemoryGetZirconHandleInfoFUCHSIA.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryGetZirconHandleInfoFUCHSIA sType(@CType("VkStructureType") int value) { VkMemoryGetZirconHandleInfoFUCHSIA.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkMemoryGetZirconHandleInfoFUCHSIA.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkMemoryGetZirconHandleInfoFUCHSIA.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMemoryGetZirconHandleInfoFUCHSIA.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryGetZirconHandleInfoFUCHSIA pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkMemoryGetZirconHandleInfoFUCHSIA.set_pNext(this.segment(), value); return this; }

    /// {@return `memory` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceMemory") java.lang.foreign.MemorySegment get_memory(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_memory.get(segment, 0L, index); }
    /// {@return `memory`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceMemory") java.lang.foreign.MemorySegment get_memory(MemorySegment segment) { return VkMemoryGetZirconHandleInfoFUCHSIA.get_memory(segment, 0L); }
    /// {@return `memory`}
    public @CType("VkDeviceMemory") java.lang.foreign.MemorySegment memory() { return VkMemoryGetZirconHandleInfoFUCHSIA.get_memory(this.segment()); }
    /// Sets `memory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memory(MemorySegment segment, long index, @CType("VkDeviceMemory") java.lang.foreign.MemorySegment value) { VH_memory.set(segment, 0L, index, value); }
    /// Sets `memory` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memory(MemorySegment segment, @CType("VkDeviceMemory") java.lang.foreign.MemorySegment value) { VkMemoryGetZirconHandleInfoFUCHSIA.set_memory(segment, 0L, value); }
    /// Sets `memory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryGetZirconHandleInfoFUCHSIA memory(@CType("VkDeviceMemory") java.lang.foreign.MemorySegment value) { VkMemoryGetZirconHandleInfoFUCHSIA.set_memory(this.segment(), value); return this; }

    /// {@return `handleType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExternalMemoryHandleTypeFlagBits") int get_handleType(MemorySegment segment, long index) { return (int) VH_handleType.get(segment, 0L, index); }
    /// {@return `handleType`}
    /// @param segment the segment of the struct
    public static @CType("VkExternalMemoryHandleTypeFlagBits") int get_handleType(MemorySegment segment) { return VkMemoryGetZirconHandleInfoFUCHSIA.get_handleType(segment, 0L); }
    /// {@return `handleType`}
    public @CType("VkExternalMemoryHandleTypeFlagBits") int handleType() { return VkMemoryGetZirconHandleInfoFUCHSIA.get_handleType(this.segment()); }
    /// Sets `handleType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_handleType(MemorySegment segment, long index, @CType("VkExternalMemoryHandleTypeFlagBits") int value) { VH_handleType.set(segment, 0L, index, value); }
    /// Sets `handleType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_handleType(MemorySegment segment, @CType("VkExternalMemoryHandleTypeFlagBits") int value) { VkMemoryGetZirconHandleInfoFUCHSIA.set_handleType(segment, 0L, value); }
    /// Sets `handleType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryGetZirconHandleInfoFUCHSIA handleType(@CType("VkExternalMemoryHandleTypeFlagBits") int value) { VkMemoryGetZirconHandleInfoFUCHSIA.set_handleType(this.segment(), value); return this; }

    /// A buffer of [VkMemoryGetZirconHandleInfoFUCHSIA].
    public static final class Buffer extends VkMemoryGetZirconHandleInfoFUCHSIA {
        private final long elementCount;

        /// Creates `VkMemoryGetZirconHandleInfoFUCHSIA.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkMemoryGetZirconHandleInfoFUCHSIA`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkMemoryGetZirconHandleInfoFUCHSIA`
        public VkMemoryGetZirconHandleInfoFUCHSIA asSlice(long index) { return new VkMemoryGetZirconHandleInfoFUCHSIA(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkMemoryGetZirconHandleInfoFUCHSIA`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkMemoryGetZirconHandleInfoFUCHSIA`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkMemoryGetZirconHandleInfoFUCHSIA.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkMemoryGetZirconHandleInfoFUCHSIA.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkMemoryGetZirconHandleInfoFUCHSIA.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMemoryGetZirconHandleInfoFUCHSIA.set_pNext(this.segment(), index, value); return this; }

        /// {@return `memory` at the given index}
        /// @param index the index
        public @CType("VkDeviceMemory") java.lang.foreign.MemorySegment memoryAt(long index) { return VkMemoryGetZirconHandleInfoFUCHSIA.get_memory(this.segment(), index); }
        /// Sets `memory` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer memoryAt(long index, @CType("VkDeviceMemory") java.lang.foreign.MemorySegment value) { VkMemoryGetZirconHandleInfoFUCHSIA.set_memory(this.segment(), index, value); return this; }

        /// {@return `handleType` at the given index}
        /// @param index the index
        public @CType("VkExternalMemoryHandleTypeFlagBits") int handleTypeAt(long index) { return VkMemoryGetZirconHandleInfoFUCHSIA.get_handleType(this.segment(), index); }
        /// Sets `handleType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer handleTypeAt(long index, @CType("VkExternalMemoryHandleTypeFlagBits") int value) { VkMemoryGetZirconHandleInfoFUCHSIA.set_handleType(this.segment(), index, value); return this; }

    }
}

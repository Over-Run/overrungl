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
package overrungl.vulkan.ext.struct;

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
/// ### mtlBuffer
/// [VarHandle][#VH_mtlBuffer] - [Getter][#mtlBuffer()] - [Setter][#mtlBuffer(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkImportMetalBufferInfoEXT {
///     VkStructureType sType;
///     const void * pNext;
///     MTLBuffer_id mtlBuffer;
/// } VkImportMetalBufferInfoEXT;
/// ```
public sealed class VkImportMetalBufferInfoEXT extends Struct {
    /// The struct layout of `VkImportMetalBufferInfoEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("mtlBuffer")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `mtlBuffer` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_mtlBuffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mtlBuffer"));

    /// Creates `VkImportMetalBufferInfoEXT` with the given segment.
    /// @param segment the memory segment
    public VkImportMetalBufferInfoEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkImportMetalBufferInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMetalBufferInfoEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImportMetalBufferInfoEXT(segment); }

    /// Creates `VkImportMetalBufferInfoEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkImportMetalBufferInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkImportMetalBufferInfoEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkImportMetalBufferInfoEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkImportMetalBufferInfoEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkImportMetalBufferInfoEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImportMetalBufferInfoEXT`
    public static VkImportMetalBufferInfoEXT alloc(SegmentAllocator allocator) { return new VkImportMetalBufferInfoEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkImportMetalBufferInfoEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkImportMetalBufferInfoEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkImportMetalBufferInfoEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkImportMetalBufferInfoEXT`
    public static VkImportMetalBufferInfoEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") java.lang.foreign.MemorySegment pNext, @CType("MTLBuffer_id") java.lang.foreign.MemorySegment mtlBuffer) { return alloc(allocator).sType(sType).pNext(pNext).mtlBuffer(mtlBuffer); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkImportMetalBufferInfoEXT copyFrom(VkImportMetalBufferInfoEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkImportMetalBufferInfoEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkImportMetalBufferInfoEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkImportMetalBufferInfoEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMetalBufferInfoEXT sType(@CType("VkStructureType") int value) { VkImportMetalBufferInfoEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkImportMetalBufferInfoEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkImportMetalBufferInfoEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImportMetalBufferInfoEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMetalBufferInfoEXT pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkImportMetalBufferInfoEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `mtlBuffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("MTLBuffer_id") java.lang.foreign.MemorySegment get_mtlBuffer(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_mtlBuffer.get(segment, 0L, index); }
    /// {@return `mtlBuffer`}
    /// @param segment the segment of the struct
    public static @CType("MTLBuffer_id") java.lang.foreign.MemorySegment get_mtlBuffer(MemorySegment segment) { return VkImportMetalBufferInfoEXT.get_mtlBuffer(segment, 0L); }
    /// {@return `mtlBuffer`}
    public @CType("MTLBuffer_id") java.lang.foreign.MemorySegment mtlBuffer() { return VkImportMetalBufferInfoEXT.get_mtlBuffer(this.segment()); }
    /// Sets `mtlBuffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mtlBuffer(MemorySegment segment, long index, @CType("MTLBuffer_id") java.lang.foreign.MemorySegment value) { VH_mtlBuffer.set(segment, 0L, index, value); }
    /// Sets `mtlBuffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mtlBuffer(MemorySegment segment, @CType("MTLBuffer_id") java.lang.foreign.MemorySegment value) { VkImportMetalBufferInfoEXT.set_mtlBuffer(segment, 0L, value); }
    /// Sets `mtlBuffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkImportMetalBufferInfoEXT mtlBuffer(@CType("MTLBuffer_id") java.lang.foreign.MemorySegment value) { VkImportMetalBufferInfoEXT.set_mtlBuffer(this.segment(), value); return this; }

    /// A buffer of [VkImportMetalBufferInfoEXT].
    public static final class Buffer extends VkImportMetalBufferInfoEXT {
        private final long elementCount;

        /// Creates `VkImportMetalBufferInfoEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkImportMetalBufferInfoEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkImportMetalBufferInfoEXT`
        public VkImportMetalBufferInfoEXT asSlice(long index) { return new VkImportMetalBufferInfoEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkImportMetalBufferInfoEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkImportMetalBufferInfoEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkImportMetalBufferInfoEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkImportMetalBufferInfoEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkImportMetalBufferInfoEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkImportMetalBufferInfoEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `mtlBuffer` at the given index}
        /// @param index the index
        public @CType("MTLBuffer_id") java.lang.foreign.MemorySegment mtlBufferAt(long index) { return VkImportMetalBufferInfoEXT.get_mtlBuffer(this.segment(), index); }
        /// Sets `mtlBuffer` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer mtlBufferAt(long index, @CType("MTLBuffer_id") java.lang.foreign.MemorySegment value) { VkImportMetalBufferInfoEXT.set_mtlBuffer(this.segment(), index, value); return this; }

    }
}

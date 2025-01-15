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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### id
/// [VarHandle][#VH_id] - [Getter][#id()] - [Setter][#id(int)]
/// ### size
/// [VarHandle][#VH_size] - [Getter][#size()] - [Setter][#size(int)]
/// ### pPrivateData
/// [VarHandle][#VH_pPrivateData] - [Getter][#pPrivateData()] - [Setter][#pPrivateData(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkOpticalFlowSessionCreatePrivateDataInfoNV {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t id;
///     uint32_t size;
///     const void * pPrivateData;
/// } VkOpticalFlowSessionCreatePrivateDataInfoNV;
/// ```
public sealed class VkOpticalFlowSessionCreatePrivateDataInfoNV extends Struct {
    /// The struct layout of `VkOpticalFlowSessionCreatePrivateDataInfoNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("id"),
        ValueLayout.JAVA_INT.withName("size"),
        ValueLayout.ADDRESS.withName("pPrivateData")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `id` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_id = LAYOUT.arrayElementVarHandle(PathElement.groupElement("id"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    /// The [VarHandle] of `pPrivateData` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pPrivateData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pPrivateData"));

    /// Creates `VkOpticalFlowSessionCreatePrivateDataInfoNV` with the given segment.
    /// @param segment the memory segment
    public VkOpticalFlowSessionCreatePrivateDataInfoNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkOpticalFlowSessionCreatePrivateDataInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkOpticalFlowSessionCreatePrivateDataInfoNV(segment); }

    /// Creates `VkOpticalFlowSessionCreatePrivateDataInfoNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkOpticalFlowSessionCreatePrivateDataInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkOpticalFlowSessionCreatePrivateDataInfoNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkOpticalFlowSessionCreatePrivateDataInfoNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkOpticalFlowSessionCreatePrivateDataInfoNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkOpticalFlowSessionCreatePrivateDataInfoNV`
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV alloc(SegmentAllocator allocator) { return new VkOpticalFlowSessionCreatePrivateDataInfoNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkOpticalFlowSessionCreatePrivateDataInfoNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkOpticalFlowSessionCreatePrivateDataInfoNV`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkOpticalFlowSessionCreatePrivateDataInfoNV` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkOpticalFlowSessionCreatePrivateDataInfoNV`
    public static VkOpticalFlowSessionCreatePrivateDataInfoNV allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int id, @CType("uint32_t") int size, @CType("const void *") java.lang.foreign.MemorySegment pPrivateData) { return alloc(allocator).sType(sType).pNext(pNext).id(id).size(size).pPrivateData(pPrivateData); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkOpticalFlowSessionCreatePrivateDataInfoNV copyFrom(VkOpticalFlowSessionCreatePrivateDataInfoNV src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkOpticalFlowSessionCreatePrivateDataInfoNV.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkOpticalFlowSessionCreatePrivateDataInfoNV.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkOpticalFlowSessionCreatePrivateDataInfoNV.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreatePrivateDataInfoNV sType(@CType("VkStructureType") int value) { VkOpticalFlowSessionCreatePrivateDataInfoNV.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkOpticalFlowSessionCreatePrivateDataInfoNV.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkOpticalFlowSessionCreatePrivateDataInfoNV.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkOpticalFlowSessionCreatePrivateDataInfoNV.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreatePrivateDataInfoNV pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkOpticalFlowSessionCreatePrivateDataInfoNV.set_pNext(this.segment(), value); return this; }

    /// {@return `id` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_id(MemorySegment segment, long index) { return (int) VH_id.get(segment, 0L, index); }
    /// {@return `id`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_id(MemorySegment segment) { return VkOpticalFlowSessionCreatePrivateDataInfoNV.get_id(segment, 0L); }
    /// {@return `id`}
    public @CType("uint32_t") int id() { return VkOpticalFlowSessionCreatePrivateDataInfoNV.get_id(this.segment()); }
    /// Sets `id` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_id(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_id.set(segment, 0L, index, value); }
    /// Sets `id` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_id(MemorySegment segment, @CType("uint32_t") int value) { VkOpticalFlowSessionCreatePrivateDataInfoNV.set_id(segment, 0L, value); }
    /// Sets `id` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreatePrivateDataInfoNV id(@CType("uint32_t") int value) { VkOpticalFlowSessionCreatePrivateDataInfoNV.set_id(this.segment(), value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_size(MemorySegment segment, long index) { return (int) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_size(MemorySegment segment) { return VkOpticalFlowSessionCreatePrivateDataInfoNV.get_size(segment, 0L); }
    /// {@return `size`}
    public @CType("uint32_t") int size() { return VkOpticalFlowSessionCreatePrivateDataInfoNV.get_size(this.segment()); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_size(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_size(MemorySegment segment, @CType("uint32_t") int value) { VkOpticalFlowSessionCreatePrivateDataInfoNV.set_size(segment, 0L, value); }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreatePrivateDataInfoNV size(@CType("uint32_t") int value) { VkOpticalFlowSessionCreatePrivateDataInfoNV.set_size(this.segment(), value); return this; }

    /// {@return `pPrivateData` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pPrivateData(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pPrivateData.get(segment, 0L, index); }
    /// {@return `pPrivateData`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pPrivateData(MemorySegment segment) { return VkOpticalFlowSessionCreatePrivateDataInfoNV.get_pPrivateData(segment, 0L); }
    /// {@return `pPrivateData`}
    public @CType("const void *") java.lang.foreign.MemorySegment pPrivateData() { return VkOpticalFlowSessionCreatePrivateDataInfoNV.get_pPrivateData(this.segment()); }
    /// Sets `pPrivateData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pPrivateData(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pPrivateData.set(segment, 0L, index, value); }
    /// Sets `pPrivateData` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pPrivateData(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkOpticalFlowSessionCreatePrivateDataInfoNV.set_pPrivateData(segment, 0L, value); }
    /// Sets `pPrivateData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkOpticalFlowSessionCreatePrivateDataInfoNV pPrivateData(@CType("const void *") java.lang.foreign.MemorySegment value) { VkOpticalFlowSessionCreatePrivateDataInfoNV.set_pPrivateData(this.segment(), value); return this; }

    /// A buffer of [VkOpticalFlowSessionCreatePrivateDataInfoNV].
    public static final class Buffer extends VkOpticalFlowSessionCreatePrivateDataInfoNV {
        private final long elementCount;

        /// Creates `VkOpticalFlowSessionCreatePrivateDataInfoNV.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkOpticalFlowSessionCreatePrivateDataInfoNV`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkOpticalFlowSessionCreatePrivateDataInfoNV`
        public VkOpticalFlowSessionCreatePrivateDataInfoNV asSlice(long index) { return new VkOpticalFlowSessionCreatePrivateDataInfoNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkOpticalFlowSessionCreatePrivateDataInfoNV`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkOpticalFlowSessionCreatePrivateDataInfoNV`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkOpticalFlowSessionCreatePrivateDataInfoNV.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkOpticalFlowSessionCreatePrivateDataInfoNV.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkOpticalFlowSessionCreatePrivateDataInfoNV.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkOpticalFlowSessionCreatePrivateDataInfoNV.set_pNext(this.segment(), index, value); return this; }

        /// {@return `id` at the given index}
        /// @param index the index
        public @CType("uint32_t") int idAt(long index) { return VkOpticalFlowSessionCreatePrivateDataInfoNV.get_id(this.segment(), index); }
        /// Sets `id` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer idAt(long index, @CType("uint32_t") int value) { VkOpticalFlowSessionCreatePrivateDataInfoNV.set_id(this.segment(), index, value); return this; }

        /// {@return `size` at the given index}
        /// @param index the index
        public @CType("uint32_t") int sizeAt(long index) { return VkOpticalFlowSessionCreatePrivateDataInfoNV.get_size(this.segment(), index); }
        /// Sets `size` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sizeAt(long index, @CType("uint32_t") int value) { VkOpticalFlowSessionCreatePrivateDataInfoNV.set_size(this.segment(), index, value); return this; }

        /// {@return `pPrivateData` at the given index}
        /// @param index the index
        public @CType("const void *") java.lang.foreign.MemorySegment pPrivateDataAt(long index) { return VkOpticalFlowSessionCreatePrivateDataInfoNV.get_pPrivateData(this.segment(), index); }
        /// Sets `pPrivateData` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pPrivateDataAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkOpticalFlowSessionCreatePrivateDataInfoNV.set_pPrivateData(this.segment(), index, value); return this; }

    }
}

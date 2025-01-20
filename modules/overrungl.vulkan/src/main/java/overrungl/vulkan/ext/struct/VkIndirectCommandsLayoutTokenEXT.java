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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### type
/// [VarHandle][#VH_type] - [Getter][#type()] - [Setter][#type(int)]
/// ### data
/// [Byte offset][#OFFSET_data] - [Memory layout][#ML_data] - [Getter][#data()] - [Setter][#data(MemorySegment)]
/// ### offset
/// [VarHandle][#VH_offset] - [Getter][#offset()] - [Setter][#offset(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkIndirectCommandsLayoutTokenEXT {
///     VkStructureType sType;
///     const void * pNext;
///     VkIndirectCommandsTokenTypeEXT type;
///     VkIndirectCommandsTokenDataEXT data;
///     uint32_t offset;
/// } VkIndirectCommandsLayoutTokenEXT;
/// ```
public sealed class VkIndirectCommandsLayoutTokenEXT extends Struct {
    /// The struct layout of `VkIndirectCommandsLayoutTokenEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        overrungl.vulkan.ext.union.VkIndirectCommandsTokenDataEXT.LAYOUT.withName("data"),
        ValueLayout.JAVA_INT.withName("offset")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `type` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_type = LAYOUT.arrayElementVarHandle(PathElement.groupElement("type"));
    /// The byte offset of `data`.
    public static final long OFFSET_data = LAYOUT.byteOffset(PathElement.groupElement("data"));
    /// The memory layout of `data`.
    public static final MemoryLayout ML_data = LAYOUT.select(PathElement.groupElement("data"));
    /// The [VarHandle] of `offset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));

    /// Creates `VkIndirectCommandsLayoutTokenEXT` with the given segment.
    /// @param segment the memory segment
    public VkIndirectCommandsLayoutTokenEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkIndirectCommandsLayoutTokenEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsLayoutTokenEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutTokenEXT(segment); }

    /// Creates `VkIndirectCommandsLayoutTokenEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkIndirectCommandsLayoutTokenEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkIndirectCommandsLayoutTokenEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkIndirectCommandsLayoutTokenEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkIndirectCommandsLayoutTokenEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkIndirectCommandsLayoutTokenEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectCommandsLayoutTokenEXT`
    public static VkIndirectCommandsLayoutTokenEXT alloc(SegmentAllocator allocator) { return new VkIndirectCommandsLayoutTokenEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkIndirectCommandsLayoutTokenEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkIndirectCommandsLayoutTokenEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkIndirectCommandsLayoutTokenEXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkIndirectCommandsLayoutTokenEXT`
    public static VkIndirectCommandsLayoutTokenEXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("const void *") MemorySegment pNext, @CType("VkIndirectCommandsTokenTypeEXT") int type, @CType("VkIndirectCommandsTokenDataEXT") MemorySegment data, @CType("uint32_t") int offset) { return alloc(allocator).sType(sType).pNext(pNext).type(type).data(data).offset(offset); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkIndirectCommandsLayoutTokenEXT copyFrom(VkIndirectCommandsLayoutTokenEXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkIndirectCommandsLayoutTokenEXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkIndirectCommandsLayoutTokenEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkIndirectCommandsLayoutTokenEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenEXT sType(@CType("VkStructureType") int value) { VkIndirectCommandsLayoutTokenEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") MemorySegment get_pNext(MemorySegment segment) { return VkIndirectCommandsLayoutTokenEXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("const void *") MemorySegment pNext() { return VkIndirectCommandsLayoutTokenEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") MemorySegment value) { VkIndirectCommandsLayoutTokenEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenEXT pNext(@CType("const void *") MemorySegment value) { VkIndirectCommandsLayoutTokenEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `type` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkIndirectCommandsTokenTypeEXT") int get_type(MemorySegment segment, long index) { return (int) VH_type.get(segment, 0L, index); }
    /// {@return `type`}
    /// @param segment the segment of the struct
    public static @CType("VkIndirectCommandsTokenTypeEXT") int get_type(MemorySegment segment) { return VkIndirectCommandsLayoutTokenEXT.get_type(segment, 0L); }
    /// {@return `type`}
    public @CType("VkIndirectCommandsTokenTypeEXT") int type() { return VkIndirectCommandsLayoutTokenEXT.get_type(this.segment()); }
    /// Sets `type` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_type(MemorySegment segment, long index, @CType("VkIndirectCommandsTokenTypeEXT") int value) { VH_type.set(segment, 0L, index, value); }
    /// Sets `type` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_type(MemorySegment segment, @CType("VkIndirectCommandsTokenTypeEXT") int value) { VkIndirectCommandsLayoutTokenEXT.set_type(segment, 0L, value); }
    /// Sets `type` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenEXT type(@CType("VkIndirectCommandsTokenTypeEXT") int value) { VkIndirectCommandsLayoutTokenEXT.set_type(this.segment(), value); return this; }

    /// {@return `data` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkIndirectCommandsTokenDataEXT") MemorySegment get_data(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_data, index), ML_data); }
    /// {@return `data`}
    /// @param segment the segment of the struct
    public static @CType("VkIndirectCommandsTokenDataEXT") MemorySegment get_data(MemorySegment segment) { return VkIndirectCommandsLayoutTokenEXT.get_data(segment, 0L); }
    /// {@return `data`}
    public @CType("VkIndirectCommandsTokenDataEXT") MemorySegment data() { return VkIndirectCommandsLayoutTokenEXT.get_data(this.segment()); }
    /// Sets `data` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_data(MemorySegment segment, long index, @CType("VkIndirectCommandsTokenDataEXT") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_data, index), ML_data.byteSize()); }
    /// Sets `data` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_data(MemorySegment segment, @CType("VkIndirectCommandsTokenDataEXT") MemorySegment value) { VkIndirectCommandsLayoutTokenEXT.set_data(segment, 0L, value); }
    /// Sets `data` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenEXT data(@CType("VkIndirectCommandsTokenDataEXT") MemorySegment value) { VkIndirectCommandsLayoutTokenEXT.set_data(this.segment(), value); return this; }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_offset(MemorySegment segment, long index) { return (int) VH_offset.get(segment, 0L, index); }
    /// {@return `offset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_offset(MemorySegment segment) { return VkIndirectCommandsLayoutTokenEXT.get_offset(segment, 0L); }
    /// {@return `offset`}
    public @CType("uint32_t") int offset() { return VkIndirectCommandsLayoutTokenEXT.get_offset(this.segment()); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_offset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_offset.set(segment, 0L, index, value); }
    /// Sets `offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_offset(MemorySegment segment, @CType("uint32_t") int value) { VkIndirectCommandsLayoutTokenEXT.set_offset(segment, 0L, value); }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkIndirectCommandsLayoutTokenEXT offset(@CType("uint32_t") int value) { VkIndirectCommandsLayoutTokenEXT.set_offset(this.segment(), value); return this; }

    /// A buffer of [VkIndirectCommandsLayoutTokenEXT].
    public static final class Buffer extends VkIndirectCommandsLayoutTokenEXT {
        private final long elementCount;

        /// Creates `VkIndirectCommandsLayoutTokenEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkIndirectCommandsLayoutTokenEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkIndirectCommandsLayoutTokenEXT`
        public VkIndirectCommandsLayoutTokenEXT asSlice(long index) { return new VkIndirectCommandsLayoutTokenEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkIndirectCommandsLayoutTokenEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkIndirectCommandsLayoutTokenEXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkIndirectCommandsLayoutTokenEXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkIndirectCommandsLayoutTokenEXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("const void *") MemorySegment pNextAt(long index) { return VkIndirectCommandsLayoutTokenEXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("const void *") MemorySegment value) { VkIndirectCommandsLayoutTokenEXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `type` at the given index}
        /// @param index the index
        public @CType("VkIndirectCommandsTokenTypeEXT") int typeAt(long index) { return VkIndirectCommandsLayoutTokenEXT.get_type(this.segment(), index); }
        /// Sets `type` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer typeAt(long index, @CType("VkIndirectCommandsTokenTypeEXT") int value) { VkIndirectCommandsLayoutTokenEXT.set_type(this.segment(), index, value); return this; }

        /// {@return `data` at the given index}
        /// @param index the index
        public @CType("VkIndirectCommandsTokenDataEXT") MemorySegment dataAt(long index) { return VkIndirectCommandsLayoutTokenEXT.get_data(this.segment(), index); }
        /// Sets `data` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer dataAt(long index, @CType("VkIndirectCommandsTokenDataEXT") MemorySegment value) { VkIndirectCommandsLayoutTokenEXT.set_data(this.segment(), index, value); return this; }

        /// {@return `offset` at the given index}
        /// @param index the index
        public @CType("uint32_t") int offsetAt(long index) { return VkIndirectCommandsLayoutTokenEXT.get_offset(this.segment(), index); }
        /// Sets `offset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer offsetAt(long index, @CType("uint32_t") int value) { VkIndirectCommandsLayoutTokenEXT.set_offset(this.segment(), index, value); return this; }

    }
}

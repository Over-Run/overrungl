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
/// ### location
/// [VarHandle][#VH_location] - [Getter][#location()] - [Setter][#location(int)]
/// ### binding
/// [VarHandle][#VH_binding] - [Getter][#binding()] - [Setter][#binding(int)]
/// ### format
/// [VarHandle][#VH_format] - [Getter][#format()] - [Setter][#format(int)]
/// ### offset
/// [VarHandle][#VH_offset] - [Getter][#offset()] - [Setter][#offset(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVertexInputAttributeDescription2EXT {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t location;
///     uint32_t binding;
///     VkFormat format;
///     uint32_t offset;
/// } VkVertexInputAttributeDescription2EXT;
/// ```
public sealed class VkVertexInputAttributeDescription2EXT extends Struct {
    /// The struct layout of `VkVertexInputAttributeDescription2EXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("location"),
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("offset")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `location` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_location = LAYOUT.arrayElementVarHandle(PathElement.groupElement("location"));
    /// The [VarHandle] of `binding` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_binding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("binding"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    /// The [VarHandle] of `offset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));

    /// Creates `VkVertexInputAttributeDescription2EXT` with the given segment.
    /// @param segment the memory segment
    public VkVertexInputAttributeDescription2EXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVertexInputAttributeDescription2EXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVertexInputAttributeDescription2EXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVertexInputAttributeDescription2EXT(segment); }

    /// Creates `VkVertexInputAttributeDescription2EXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVertexInputAttributeDescription2EXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVertexInputAttributeDescription2EXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVertexInputAttributeDescription2EXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVertexInputAttributeDescription2EXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVertexInputAttributeDescription2EXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVertexInputAttributeDescription2EXT`
    public static VkVertexInputAttributeDescription2EXT alloc(SegmentAllocator allocator) { return new VkVertexInputAttributeDescription2EXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVertexInputAttributeDescription2EXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVertexInputAttributeDescription2EXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVertexInputAttributeDescription2EXT` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVertexInputAttributeDescription2EXT`
    public static VkVertexInputAttributeDescription2EXT allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") java.lang.foreign.MemorySegment pNext, @CType("uint32_t") int location, @CType("uint32_t") int binding, @CType("VkFormat") int format, @CType("uint32_t") int offset) { return alloc(allocator).sType(sType).pNext(pNext).location(location).binding(binding).format(format).offset(offset); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVertexInputAttributeDescription2EXT copyFrom(VkVertexInputAttributeDescription2EXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVertexInputAttributeDescription2EXT.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVertexInputAttributeDescription2EXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVertexInputAttributeDescription2EXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputAttributeDescription2EXT sType(@CType("VkStructureType") int value) { VkVertexInputAttributeDescription2EXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVertexInputAttributeDescription2EXT.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkVertexInputAttributeDescription2EXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkVertexInputAttributeDescription2EXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputAttributeDescription2EXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkVertexInputAttributeDescription2EXT.set_pNext(this.segment(), value); return this; }

    /// {@return `location` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_location(MemorySegment segment, long index) { return (int) VH_location.get(segment, 0L, index); }
    /// {@return `location`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_location(MemorySegment segment) { return VkVertexInputAttributeDescription2EXT.get_location(segment, 0L); }
    /// {@return `location`}
    public @CType("uint32_t") int location() { return VkVertexInputAttributeDescription2EXT.get_location(this.segment()); }
    /// Sets `location` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_location(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_location.set(segment, 0L, index, value); }
    /// Sets `location` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_location(MemorySegment segment, @CType("uint32_t") int value) { VkVertexInputAttributeDescription2EXT.set_location(segment, 0L, value); }
    /// Sets `location` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputAttributeDescription2EXT location(@CType("uint32_t") int value) { VkVertexInputAttributeDescription2EXT.set_location(this.segment(), value); return this; }

    /// {@return `binding` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_binding(MemorySegment segment, long index) { return (int) VH_binding.get(segment, 0L, index); }
    /// {@return `binding`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_binding(MemorySegment segment) { return VkVertexInputAttributeDescription2EXT.get_binding(segment, 0L); }
    /// {@return `binding`}
    public @CType("uint32_t") int binding() { return VkVertexInputAttributeDescription2EXT.get_binding(this.segment()); }
    /// Sets `binding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_binding(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_binding.set(segment, 0L, index, value); }
    /// Sets `binding` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_binding(MemorySegment segment, @CType("uint32_t") int value) { VkVertexInputAttributeDescription2EXT.set_binding(segment, 0L, value); }
    /// Sets `binding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputAttributeDescription2EXT binding(@CType("uint32_t") int value) { VkVertexInputAttributeDescription2EXT.set_binding(this.segment(), value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_format(MemorySegment segment) { return VkVertexInputAttributeDescription2EXT.get_format(segment, 0L); }
    /// {@return `format`}
    public @CType("VkFormat") int format() { return VkVertexInputAttributeDescription2EXT.get_format(this.segment()); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_format(MemorySegment segment, long index, @CType("VkFormat") int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_format(MemorySegment segment, @CType("VkFormat") int value) { VkVertexInputAttributeDescription2EXT.set_format(segment, 0L, value); }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputAttributeDescription2EXT format(@CType("VkFormat") int value) { VkVertexInputAttributeDescription2EXT.set_format(this.segment(), value); return this; }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_offset(MemorySegment segment, long index) { return (int) VH_offset.get(segment, 0L, index); }
    /// {@return `offset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_offset(MemorySegment segment) { return VkVertexInputAttributeDescription2EXT.get_offset(segment, 0L); }
    /// {@return `offset`}
    public @CType("uint32_t") int offset() { return VkVertexInputAttributeDescription2EXT.get_offset(this.segment()); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_offset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_offset.set(segment, 0L, index, value); }
    /// Sets `offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_offset(MemorySegment segment, @CType("uint32_t") int value) { VkVertexInputAttributeDescription2EXT.set_offset(segment, 0L, value); }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputAttributeDescription2EXT offset(@CType("uint32_t") int value) { VkVertexInputAttributeDescription2EXT.set_offset(this.segment(), value); return this; }

    /// A buffer of [VkVertexInputAttributeDescription2EXT].
    public static final class Buffer extends VkVertexInputAttributeDescription2EXT {
        private final long elementCount;

        /// Creates `VkVertexInputAttributeDescription2EXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVertexInputAttributeDescription2EXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVertexInputAttributeDescription2EXT`
        public VkVertexInputAttributeDescription2EXT asSlice(long index) { return new VkVertexInputAttributeDescription2EXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVertexInputAttributeDescription2EXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVertexInputAttributeDescription2EXT`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkVertexInputAttributeDescription2EXT.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkVertexInputAttributeDescription2EXT.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVertexInputAttributeDescription2EXT.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkVertexInputAttributeDescription2EXT.set_pNext(this.segment(), index, value); return this; }

        /// {@return `location` at the given index}
        /// @param index the index
        public @CType("uint32_t") int locationAt(long index) { return VkVertexInputAttributeDescription2EXT.get_location(this.segment(), index); }
        /// Sets `location` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer locationAt(long index, @CType("uint32_t") int value) { VkVertexInputAttributeDescription2EXT.set_location(this.segment(), index, value); return this; }

        /// {@return `binding` at the given index}
        /// @param index the index
        public @CType("uint32_t") int bindingAt(long index) { return VkVertexInputAttributeDescription2EXT.get_binding(this.segment(), index); }
        /// Sets `binding` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bindingAt(long index, @CType("uint32_t") int value) { VkVertexInputAttributeDescription2EXT.set_binding(this.segment(), index, value); return this; }

        /// {@return `format` at the given index}
        /// @param index the index
        public @CType("VkFormat") int formatAt(long index) { return VkVertexInputAttributeDescription2EXT.get_format(this.segment(), index); }
        /// Sets `format` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer formatAt(long index, @CType("VkFormat") int value) { VkVertexInputAttributeDescription2EXT.set_format(this.segment(), index, value); return this; }

        /// {@return `offset` at the given index}
        /// @param index the index
        public @CType("uint32_t") int offsetAt(long index) { return VkVertexInputAttributeDescription2EXT.get_offset(this.segment(), index); }
        /// Sets `offset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer offsetAt(long index, @CType("uint32_t") int value) { VkVertexInputAttributeDescription2EXT.set_offset(this.segment(), index, value); return this; }

    }
}

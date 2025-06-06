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
//@formatter:off
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkVertexInputAttributeDescription2EXT {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t location;
///     uint32_t binding;
///     (int) VkFormat format;
///     uint32_t offset;
/// };
/// ```
public sealed class VkVertexInputAttributeDescription2EXT extends GroupType {
    /// The struct layout of `VkVertexInputAttributeDescription2EXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("location"),
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("offset")
    );
    /// The byte offset of `sType`.
    public static final long OFFSET_sType = LAYOUT.byteOffset(PathElement.groupElement("sType"));
    /// The memory layout of `sType`.
    public static final MemoryLayout LAYOUT_sType = LAYOUT.select(PathElement.groupElement("sType"));
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The byte offset of `pNext`.
    public static final long OFFSET_pNext = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
    /// The memory layout of `pNext`.
    public static final MemoryLayout LAYOUT_pNext = LAYOUT.select(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `location`.
    public static final long OFFSET_location = LAYOUT.byteOffset(PathElement.groupElement("location"));
    /// The memory layout of `location`.
    public static final MemoryLayout LAYOUT_location = LAYOUT.select(PathElement.groupElement("location"));
    /// The [VarHandle] of `location` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_location = LAYOUT.arrayElementVarHandle(PathElement.groupElement("location"));
    /// The byte offset of `binding`.
    public static final long OFFSET_binding = LAYOUT.byteOffset(PathElement.groupElement("binding"));
    /// The memory layout of `binding`.
    public static final MemoryLayout LAYOUT_binding = LAYOUT.select(PathElement.groupElement("binding"));
    /// The [VarHandle] of `binding` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_binding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("binding"));
    /// The byte offset of `format`.
    public static final long OFFSET_format = LAYOUT.byteOffset(PathElement.groupElement("format"));
    /// The memory layout of `format`.
    public static final MemoryLayout LAYOUT_format = LAYOUT.select(PathElement.groupElement("format"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    /// The byte offset of `offset`.
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    /// The memory layout of `offset`.
    public static final MemoryLayout LAYOUT_offset = LAYOUT.select(PathElement.groupElement("offset"));
    /// The [VarHandle] of `offset` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));

    /// Creates `VkVertexInputAttributeDescription2EXT` with the given segment.
    /// @param segment the memory segment
    public VkVertexInputAttributeDescription2EXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVertexInputAttributeDescription2EXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVertexInputAttributeDescription2EXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVertexInputAttributeDescription2EXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputAttributeDescription2EXT(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkVertexInputAttributeDescription2EXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVertexInputAttributeDescription2EXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVertexInputAttributeDescription2EXT`
    public static VkVertexInputAttributeDescription2EXT alloc(SegmentAllocator allocator) { return new VkVertexInputAttributeDescription2EXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVertexInputAttributeDescription2EXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVertexInputAttributeDescription2EXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVertexInputAttributeDescription2EXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param location `location`
    /// @param binding `binding`
    /// @param format `format`
    /// @param offset `offset`
    /// @return the allocated `VkVertexInputAttributeDescription2EXT`
    public static VkVertexInputAttributeDescription2EXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int location, int binding, int format, int offset) {
        return alloc(allocator).sType(sType).pNext(pNext).location(location).binding(binding).format(format).offset(offset);
    }

    /// Allocates a `VkVertexInputAttributeDescription2EXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param location `location`
    /// @param binding `binding`
    /// @param format `format`
    /// @return the allocated `VkVertexInputAttributeDescription2EXT`
    public static VkVertexInputAttributeDescription2EXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int location, int binding, int format) {
        return alloc(allocator).sType(sType).pNext(pNext).location(location).binding(binding).format(format);
    }

    /// Allocates a `VkVertexInputAttributeDescription2EXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param location `location`
    /// @param binding `binding`
    /// @return the allocated `VkVertexInputAttributeDescription2EXT`
    public static VkVertexInputAttributeDescription2EXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int location, int binding) {
        return alloc(allocator).sType(sType).pNext(pNext).location(location).binding(binding);
    }

    /// Allocates a `VkVertexInputAttributeDescription2EXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param location `location`
    /// @return the allocated `VkVertexInputAttributeDescription2EXT`
    public static VkVertexInputAttributeDescription2EXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int location) {
        return alloc(allocator).sType(sType).pNext(pNext).location(location);
    }

    /// Allocates a `VkVertexInputAttributeDescription2EXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkVertexInputAttributeDescription2EXT`
    public static VkVertexInputAttributeDescription2EXT allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkVertexInputAttributeDescription2EXT` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkVertexInputAttributeDescription2EXT`
    public static VkVertexInputAttributeDescription2EXT allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVertexInputAttributeDescription2EXT copyFrom(VkVertexInputAttributeDescription2EXT src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    public int sType() { return sType(this.segment(), 0L); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void sType(MemorySegment segment, long index, int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputAttributeDescription2EXT sType(int value) { sType(this.segment(), 0L, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    public MemorySegment pNext() { return pNext(this.segment(), 0L); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNext(MemorySegment segment, long index, MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputAttributeDescription2EXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `location` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int location(MemorySegment segment, long index) { return (int) VH_location.get(segment, 0L, index); }
    /// {@return `location`}
    public int location() { return location(this.segment(), 0L); }
    /// Sets `location` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void location(MemorySegment segment, long index, int value) { VH_location.set(segment, 0L, index, value); }
    /// Sets `location` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputAttributeDescription2EXT location(int value) { location(this.segment(), 0L, value); return this; }

    /// {@return `binding` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int binding(MemorySegment segment, long index) { return (int) VH_binding.get(segment, 0L, index); }
    /// {@return `binding`}
    public int binding() { return binding(this.segment(), 0L); }
    /// Sets `binding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void binding(MemorySegment segment, long index, int value) { VH_binding.set(segment, 0L, index, value); }
    /// Sets `binding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputAttributeDescription2EXT binding(int value) { binding(this.segment(), 0L, value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    public int format() { return format(this.segment(), 0L); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void format(MemorySegment segment, long index, int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputAttributeDescription2EXT format(int value) { format(this.segment(), 0L, value); return this; }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int offset(MemorySegment segment, long index) { return (int) VH_offset.get(segment, 0L, index); }
    /// {@return `offset`}
    public int offset() { return offset(this.segment(), 0L); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void offset(MemorySegment segment, long index, int value) { VH_offset.set(segment, 0L, index, value); }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputAttributeDescription2EXT offset(int value) { offset(this.segment(), 0L, value); return this; }

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
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `location` at the given index}
        /// @param index the index of the struct buffer
        public int locationAt(long index) { return location(this.segment(), index); }
        /// Sets `location` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer locationAt(long index, int value) { location(this.segment(), index, value); return this; }

        /// {@return `binding` at the given index}
        /// @param index the index of the struct buffer
        public int bindingAt(long index) { return binding(this.segment(), index); }
        /// Sets `binding` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer bindingAt(long index, int value) { binding(this.segment(), index, value); return this; }

        /// {@return `format` at the given index}
        /// @param index the index of the struct buffer
        public int formatAt(long index) { return format(this.segment(), index); }
        /// Sets `format` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer formatAt(long index, int value) { format(this.segment(), index, value); return this; }

        /// {@return `offset` at the given index}
        /// @param index the index of the struct buffer
        public int offsetAt(long index) { return offset(this.segment(), index); }
        /// Sets `offset` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer offsetAt(long index, int value) { offset(this.segment(), index, value); return this; }

    }
}

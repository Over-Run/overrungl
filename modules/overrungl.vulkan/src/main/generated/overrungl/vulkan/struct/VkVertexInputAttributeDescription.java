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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkVertexInputAttributeDescription {
///     uint32_t location;
///     uint32_t binding;
///     (int) VkFormat format;
///     uint32_t offset;
/// };
/// ```
public final class VkVertexInputAttributeDescription extends GroupType {
    /// The struct layout of `VkVertexInputAttributeDescription`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("location"),
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("offset")
    );
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

    /// Creates `VkVertexInputAttributeDescription` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVertexInputAttributeDescription(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVertexInputAttributeDescription` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVertexInputAttributeDescription of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputAttributeDescription(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVertexInputAttributeDescription` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVertexInputAttributeDescription ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputAttributeDescription(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVertexInputAttributeDescription` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVertexInputAttributeDescription ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVertexInputAttributeDescription(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVertexInputAttributeDescription` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVertexInputAttributeDescription`
    public static VkVertexInputAttributeDescription alloc(SegmentAllocator allocator) { return new VkVertexInputAttributeDescription(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVertexInputAttributeDescription` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVertexInputAttributeDescription`
    public static VkVertexInputAttributeDescription alloc(SegmentAllocator allocator, long count) { return new VkVertexInputAttributeDescription(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVertexInputAttributeDescription` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param location `location`
    /// @param binding `binding`
    /// @param format `format`
    /// @param offset `offset`
    /// @return the allocated `VkVertexInputAttributeDescription`
    public static VkVertexInputAttributeDescription allocInit(SegmentAllocator allocator, int location, int binding, int format, int offset) {
        return alloc(allocator).location(location).binding(binding).format(format).offset(offset);
    }

    /// Allocates a `VkVertexInputAttributeDescription` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param location `location`
    /// @param binding `binding`
    /// @param format `format`
    /// @return the allocated `VkVertexInputAttributeDescription`
    public static VkVertexInputAttributeDescription allocInit(SegmentAllocator allocator, int location, int binding, int format) {
        return alloc(allocator).location(location).binding(binding).format(format);
    }

    /// Allocates a `VkVertexInputAttributeDescription` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param location `location`
    /// @param binding `binding`
    /// @return the allocated `VkVertexInputAttributeDescription`
    public static VkVertexInputAttributeDescription allocInit(SegmentAllocator allocator, int location, int binding) {
        return alloc(allocator).location(location).binding(binding);
    }

    /// Allocates a `VkVertexInputAttributeDescription` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param location `location`
    /// @return the allocated `VkVertexInputAttributeDescription`
    public static VkVertexInputAttributeDescription allocInit(SegmentAllocator allocator, int location) {
        return alloc(allocator).location(location);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVertexInputAttributeDescription copyFrom(VkVertexInputAttributeDescription src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVertexInputAttributeDescription reinterpret(long count) { return new VkVertexInputAttributeDescription(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVertexInputAttributeDescription location(int value) { location(this.segment(), 0L, value); return this; }

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
    public VkVertexInputAttributeDescription binding(int value) { binding(this.segment(), 0L, value); return this; }

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
    public VkVertexInputAttributeDescription format(int value) { format(this.segment(), 0L, value); return this; }

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
    public VkVertexInputAttributeDescription offset(int value) { offset(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVertexInputAttributeDescription`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVertexInputAttributeDescription`
    public VkVertexInputAttributeDescription asSlice(long index) { return new VkVertexInputAttributeDescription(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVertexInputAttributeDescription`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVertexInputAttributeDescription`
    public VkVertexInputAttributeDescription asSlice(long index, long count) { return new VkVertexInputAttributeDescription(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVertexInputAttributeDescription` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVertexInputAttributeDescription at(long index, Consumer<VkVertexInputAttributeDescription> func) { func.accept(asSlice(index)); return this; }

    /// {@return `location` at the given index}
    /// @param index the index of the struct buffer
    public int locationAt(long index) { return location(this.segment(), index); }
    /// Sets `location` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVertexInputAttributeDescription locationAt(long index, int value) { location(this.segment(), index, value); return this; }

    /// {@return `binding` at the given index}
    /// @param index the index of the struct buffer
    public int bindingAt(long index) { return binding(this.segment(), index); }
    /// Sets `binding` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVertexInputAttributeDescription bindingAt(long index, int value) { binding(this.segment(), index, value); return this; }

    /// {@return `format` at the given index}
    /// @param index the index of the struct buffer
    public int formatAt(long index) { return format(this.segment(), index); }
    /// Sets `format` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVertexInputAttributeDescription formatAt(long index, int value) { format(this.segment(), index, value); return this; }

    /// {@return `offset` at the given index}
    /// @param index the index of the struct buffer
    public int offsetAt(long index) { return offset(this.segment(), index); }
    /// Sets `offset` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVertexInputAttributeDescription offsetAt(long index, int value) { offset(this.segment(), index, value); return this; }

}

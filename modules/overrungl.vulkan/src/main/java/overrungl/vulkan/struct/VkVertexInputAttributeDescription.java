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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
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
/// typedef struct VkVertexInputAttributeDescription {
///     uint32_t location;
///     uint32_t binding;
///     VkFormat format;
///     uint32_t offset;
/// } VkVertexInputAttributeDescription;
/// ```
public final class VkVertexInputAttributeDescription extends Struct {
    /// The struct layout of `VkVertexInputAttributeDescription`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("location"),
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("offset")
    );
    /// The [VarHandle] of `location` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_location = LAYOUT.arrayElementVarHandle(PathElement.groupElement("location"));
    /// The [VarHandle] of `binding` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_binding = LAYOUT.arrayElementVarHandle(PathElement.groupElement("binding"));
    /// The [VarHandle] of `format` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_format = LAYOUT.arrayElementVarHandle(PathElement.groupElement("format"));
    /// The [VarHandle] of `offset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_offset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("offset"));

    /// Creates `VkVertexInputAttributeDescription` with the given segment.
    /// @param segment the memory segment
    public VkVertexInputAttributeDescription(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVertexInputAttributeDescription` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVertexInputAttributeDescription of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVertexInputAttributeDescription(segment); }

    /// Creates `VkVertexInputAttributeDescription` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVertexInputAttributeDescription ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVertexInputAttributeDescription(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVertexInputAttributeDescription` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVertexInputAttributeDescription ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVertexInputAttributeDescription(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVertexInputAttributeDescription` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVertexInputAttributeDescription`
    public static VkVertexInputAttributeDescription alloc(SegmentAllocator allocator) { return new VkVertexInputAttributeDescription(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVertexInputAttributeDescription` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVertexInputAttributeDescription`
    public static VkVertexInputAttributeDescription alloc(SegmentAllocator allocator, long count) { return new VkVertexInputAttributeDescription(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkVertexInputAttributeDescription`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVertexInputAttributeDescription`
    public VkVertexInputAttributeDescription asSlice(long index) { return new VkVertexInputAttributeDescription(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkVertexInputAttributeDescription`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVertexInputAttributeDescription`
    public VkVertexInputAttributeDescription asSlice(long index, long count) { return new VkVertexInputAttributeDescription(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `location` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_location(MemorySegment segment, long index) { return (int) VH_location.get(segment, 0L, index); }
    /// {@return `location`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_location(MemorySegment segment) { return VkVertexInputAttributeDescription.get_location(segment, 0L); }
    /// {@return `location` at the given index}
    /// @param index the index
    public @CType("uint32_t") int locationAt(long index) { return VkVertexInputAttributeDescription.get_location(this.segment(), index); }
    /// {@return `location`}
    public @CType("uint32_t") int location() { return VkVertexInputAttributeDescription.get_location(this.segment()); }
    /// Sets `location` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_location(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_location.set(segment, 0L, index, value); }
    /// Sets `location` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_location(MemorySegment segment, @CType("uint32_t") int value) { VkVertexInputAttributeDescription.set_location(segment, 0L, value); }
    /// Sets `location` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVertexInputAttributeDescription locationAt(long index, @CType("uint32_t") int value) { VkVertexInputAttributeDescription.set_location(this.segment(), index, value); return this; }
    /// Sets `location` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputAttributeDescription location(@CType("uint32_t") int value) { VkVertexInputAttributeDescription.set_location(this.segment(), value); return this; }

    /// {@return `binding` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_binding(MemorySegment segment, long index) { return (int) VH_binding.get(segment, 0L, index); }
    /// {@return `binding`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_binding(MemorySegment segment) { return VkVertexInputAttributeDescription.get_binding(segment, 0L); }
    /// {@return `binding` at the given index}
    /// @param index the index
    public @CType("uint32_t") int bindingAt(long index) { return VkVertexInputAttributeDescription.get_binding(this.segment(), index); }
    /// {@return `binding`}
    public @CType("uint32_t") int binding() { return VkVertexInputAttributeDescription.get_binding(this.segment()); }
    /// Sets `binding` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_binding(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_binding.set(segment, 0L, index, value); }
    /// Sets `binding` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_binding(MemorySegment segment, @CType("uint32_t") int value) { VkVertexInputAttributeDescription.set_binding(segment, 0L, value); }
    /// Sets `binding` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVertexInputAttributeDescription bindingAt(long index, @CType("uint32_t") int value) { VkVertexInputAttributeDescription.set_binding(this.segment(), index, value); return this; }
    /// Sets `binding` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputAttributeDescription binding(@CType("uint32_t") int value) { VkVertexInputAttributeDescription.set_binding(this.segment(), value); return this; }

    /// {@return `format` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkFormat") int get_format(MemorySegment segment, long index) { return (int) VH_format.get(segment, 0L, index); }
    /// {@return `format`}
    /// @param segment the segment of the struct
    public static @CType("VkFormat") int get_format(MemorySegment segment) { return VkVertexInputAttributeDescription.get_format(segment, 0L); }
    /// {@return `format` at the given index}
    /// @param index the index
    public @CType("VkFormat") int formatAt(long index) { return VkVertexInputAttributeDescription.get_format(this.segment(), index); }
    /// {@return `format`}
    public @CType("VkFormat") int format() { return VkVertexInputAttributeDescription.get_format(this.segment()); }
    /// Sets `format` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_format(MemorySegment segment, long index, @CType("VkFormat") int value) { VH_format.set(segment, 0L, index, value); }
    /// Sets `format` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_format(MemorySegment segment, @CType("VkFormat") int value) { VkVertexInputAttributeDescription.set_format(segment, 0L, value); }
    /// Sets `format` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVertexInputAttributeDescription formatAt(long index, @CType("VkFormat") int value) { VkVertexInputAttributeDescription.set_format(this.segment(), index, value); return this; }
    /// Sets `format` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputAttributeDescription format(@CType("VkFormat") int value) { VkVertexInputAttributeDescription.set_format(this.segment(), value); return this; }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_offset(MemorySegment segment, long index) { return (int) VH_offset.get(segment, 0L, index); }
    /// {@return `offset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_offset(MemorySegment segment) { return VkVertexInputAttributeDescription.get_offset(segment, 0L); }
    /// {@return `offset` at the given index}
    /// @param index the index
    public @CType("uint32_t") int offsetAt(long index) { return VkVertexInputAttributeDescription.get_offset(this.segment(), index); }
    /// {@return `offset`}
    public @CType("uint32_t") int offset() { return VkVertexInputAttributeDescription.get_offset(this.segment()); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_offset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_offset.set(segment, 0L, index, value); }
    /// Sets `offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_offset(MemorySegment segment, @CType("uint32_t") int value) { VkVertexInputAttributeDescription.set_offset(segment, 0L, value); }
    /// Sets `offset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVertexInputAttributeDescription offsetAt(long index, @CType("uint32_t") int value) { VkVertexInputAttributeDescription.set_offset(this.segment(), index, value); return this; }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVertexInputAttributeDescription offset(@CType("uint32_t") int value) { VkVertexInputAttributeDescription.set_offset(this.segment(), value); return this; }

}

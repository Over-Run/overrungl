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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### offset
/// [Byte offset][#OFFSET_offset] - [Memory layout][#ML_offset] - [Getter][#offset()] - [Setter][#offset(java.lang.foreign.MemorySegment)]
/// ### extent
/// [Byte offset][#OFFSET_extent] - [Memory layout][#ML_extent] - [Getter][#extent()] - [Setter][#extent(java.lang.foreign.MemorySegment)]
/// ### layer
/// [VarHandle][#VH_layer] - [Getter][#layer()] - [Setter][#layer(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkRectLayerKHR {
///     VkOffset2D offset;
///     VkExtent2D extent;
///     uint32_t layer;
/// } VkRectLayerKHR;
/// ```
public final class VkRectLayerKHR extends Struct {
    /// The struct layout of `VkRectLayerKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        overrungl.vulkan.struct.VkOffset2D.LAYOUT.withName("offset"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("extent"),
        ValueLayout.JAVA_INT.withName("layer")
    );
    /// The byte offset of `offset`.
    public static final long OFFSET_offset = LAYOUT.byteOffset(PathElement.groupElement("offset"));
    /// The memory layout of `offset`.
    public static final MemoryLayout ML_offset = LAYOUT.select(PathElement.groupElement("offset"));
    /// The byte offset of `extent`.
    public static final long OFFSET_extent = LAYOUT.byteOffset(PathElement.groupElement("extent"));
    /// The memory layout of `extent`.
    public static final MemoryLayout ML_extent = LAYOUT.select(PathElement.groupElement("extent"));
    /// The [VarHandle] of `layer` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_layer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("layer"));

    /// Creates `VkRectLayerKHR` with the given segment.
    /// @param segment the memory segment
    public VkRectLayerKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkRectLayerKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRectLayerKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRectLayerKHR(segment); }

    /// Creates `VkRectLayerKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRectLayerKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkRectLayerKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkRectLayerKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkRectLayerKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkRectLayerKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkRectLayerKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkRectLayerKHR`
    public static VkRectLayerKHR alloc(SegmentAllocator allocator) { return new VkRectLayerKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkRectLayerKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkRectLayerKHR`
    public static VkRectLayerKHR alloc(SegmentAllocator allocator, long count) { return new VkRectLayerKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkRectLayerKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkRectLayerKHR`
    public VkRectLayerKHR asSlice(long index) { return new VkRectLayerKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkRectLayerKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkRectLayerKHR`
    public VkRectLayerKHR asSlice(long index, long count) { return new VkRectLayerKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `offset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkOffset2D") java.lang.foreign.MemorySegment get_offset(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_offset, index), ML_offset); }
    /// {@return `offset`}
    /// @param segment the segment of the struct
    public static @CType("VkOffset2D") java.lang.foreign.MemorySegment get_offset(MemorySegment segment) { return VkRectLayerKHR.get_offset(segment, 0L); }
    /// {@return `offset` at the given index}
    /// @param index the index
    public @CType("VkOffset2D") java.lang.foreign.MemorySegment offsetAt(long index) { return VkRectLayerKHR.get_offset(this.segment(), index); }
    /// {@return `offset`}
    public @CType("VkOffset2D") java.lang.foreign.MemorySegment offset() { return VkRectLayerKHR.get_offset(this.segment()); }
    /// Sets `offset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_offset(MemorySegment segment, long index, @CType("VkOffset2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_offset, index), ML_offset.byteSize()); }
    /// Sets `offset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_offset(MemorySegment segment, @CType("VkOffset2D") java.lang.foreign.MemorySegment value) { VkRectLayerKHR.set_offset(segment, 0L, value); }
    /// Sets `offset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRectLayerKHR offsetAt(long index, @CType("VkOffset2D") java.lang.foreign.MemorySegment value) { VkRectLayerKHR.set_offset(this.segment(), index, value); return this; }
    /// Sets `offset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRectLayerKHR offset(@CType("VkOffset2D") java.lang.foreign.MemorySegment value) { VkRectLayerKHR.set_offset(this.segment(), value); return this; }

    /// {@return `extent` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_extent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_extent, index), ML_extent); }
    /// {@return `extent`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_extent(MemorySegment segment) { return VkRectLayerKHR.get_extent(segment, 0L); }
    /// {@return `extent` at the given index}
    /// @param index the index
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment extentAt(long index) { return VkRectLayerKHR.get_extent(this.segment(), index); }
    /// {@return `extent`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment extent() { return VkRectLayerKHR.get_extent(this.segment()); }
    /// Sets `extent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_extent(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_extent, index), ML_extent.byteSize()); }
    /// Sets `extent` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_extent(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkRectLayerKHR.set_extent(segment, 0L, value); }
    /// Sets `extent` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRectLayerKHR extentAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkRectLayerKHR.set_extent(this.segment(), index, value); return this; }
    /// Sets `extent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRectLayerKHR extent(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkRectLayerKHR.set_extent(this.segment(), value); return this; }

    /// {@return `layer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_layer(MemorySegment segment, long index) { return (int) VH_layer.get(segment, 0L, index); }
    /// {@return `layer`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_layer(MemorySegment segment) { return VkRectLayerKHR.get_layer(segment, 0L); }
    /// {@return `layer` at the given index}
    /// @param index the index
    public @CType("uint32_t") int layerAt(long index) { return VkRectLayerKHR.get_layer(this.segment(), index); }
    /// {@return `layer`}
    public @CType("uint32_t") int layer() { return VkRectLayerKHR.get_layer(this.segment()); }
    /// Sets `layer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_layer(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_layer.set(segment, 0L, index, value); }
    /// Sets `layer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_layer(MemorySegment segment, @CType("uint32_t") int value) { VkRectLayerKHR.set_layer(segment, 0L, value); }
    /// Sets `layer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkRectLayerKHR layerAt(long index, @CType("uint32_t") int value) { VkRectLayerKHR.set_layer(this.segment(), index, value); return this; }
    /// Sets `layer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkRectLayerKHR layer(@CType("uint32_t") int value) { VkRectLayerKHR.set_layer(this.segment(), value); return this; }

}

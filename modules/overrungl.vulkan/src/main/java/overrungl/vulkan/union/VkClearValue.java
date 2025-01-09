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
package overrungl.vulkan.union;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### color
/// [Byte offset][#OFFSET_color] - [Memory layout][#ML_color] - [Getter][#color()] - [Setter][#color(java.lang.foreign.MemorySegment)]
/// ### depthStencil
/// [Byte offset][#OFFSET_depthStencil] - [Memory layout][#ML_depthStencil] - [Getter][#depthStencil()] - [Setter][#depthStencil(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef union VkClearValue {
///     VkClearColorValue color;
///     VkClearDepthStencilValue depthStencil;
/// } VkClearValue;
/// ```
public final class VkClearValue extends Union {
    /// The union layout of `VkClearValue`.
    public static final UnionLayout LAYOUT = MemoryLayout.unionLayout(
        overrungl.vulkan.union.VkClearColorValue.LAYOUT.withName("color"),
        overrungl.vulkan.struct.VkClearDepthStencilValue.LAYOUT.withName("depthStencil")
    );
    /// The byte offset of `color`.
    public static final long OFFSET_color = LAYOUT.byteOffset(PathElement.groupElement("color"));
    /// The memory layout of `color`.
    public static final MemoryLayout ML_color = LAYOUT.select(PathElement.groupElement("color"));
    /// The byte offset of `depthStencil`.
    public static final long OFFSET_depthStencil = LAYOUT.byteOffset(PathElement.groupElement("depthStencil"));
    /// The memory layout of `depthStencil`.
    public static final MemoryLayout ML_depthStencil = LAYOUT.select(PathElement.groupElement("depthStencil"));

    /// Creates `VkClearValue` with the given segment.
    /// @param segment the memory segment
    public VkClearValue(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkClearValue` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClearValue of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkClearValue(segment); }

    /// Creates `VkClearValue` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClearValue ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkClearValue(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkClearValue` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkClearValue ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkClearValue(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkClearValue` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkClearValue`
    public static VkClearValue alloc(SegmentAllocator allocator) { return new VkClearValue(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkClearValue` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkClearValue`
    public static VkClearValue alloc(SegmentAllocator allocator, long count) { return new VkClearValue(allocator.allocate(LAYOUT, count)); }

    /// {@return `color` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkClearColorValue") java.lang.foreign.MemorySegment get_color(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_color, index), ML_color); }
    /// {@return `color`}
    /// @param segment the segment of the struct
    public static @CType("VkClearColorValue") java.lang.foreign.MemorySegment get_color(MemorySegment segment) { return VkClearValue.get_color(segment, 0L); }
    /// {@return `color` at the given index}
    /// @param index the index
    public @CType("VkClearColorValue") java.lang.foreign.MemorySegment colorAt(long index) { return VkClearValue.get_color(this.segment(), index); }
    /// {@return `color`}
    public @CType("VkClearColorValue") java.lang.foreign.MemorySegment color() { return VkClearValue.get_color(this.segment()); }
    /// Sets `color` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_color(MemorySegment segment, long index, @CType("VkClearColorValue") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_color, index), ML_color.byteSize()); }
    /// Sets `color` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_color(MemorySegment segment, @CType("VkClearColorValue") java.lang.foreign.MemorySegment value) { VkClearValue.set_color(segment, 0L, value); }
    /// Sets `color` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkClearValue colorAt(long index, @CType("VkClearColorValue") java.lang.foreign.MemorySegment value) { VkClearValue.set_color(this.segment(), index, value); return this; }
    /// Sets `color` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearValue color(@CType("VkClearColorValue") java.lang.foreign.MemorySegment value) { VkClearValue.set_color(this.segment(), value); return this; }

    /// {@return `depthStencil` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkClearDepthStencilValue") java.lang.foreign.MemorySegment get_depthStencil(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_depthStencil, index), ML_depthStencil); }
    /// {@return `depthStencil`}
    /// @param segment the segment of the struct
    public static @CType("VkClearDepthStencilValue") java.lang.foreign.MemorySegment get_depthStencil(MemorySegment segment) { return VkClearValue.get_depthStencil(segment, 0L); }
    /// {@return `depthStencil` at the given index}
    /// @param index the index
    public @CType("VkClearDepthStencilValue") java.lang.foreign.MemorySegment depthStencilAt(long index) { return VkClearValue.get_depthStencil(this.segment(), index); }
    /// {@return `depthStencil`}
    public @CType("VkClearDepthStencilValue") java.lang.foreign.MemorySegment depthStencil() { return VkClearValue.get_depthStencil(this.segment()); }
    /// Sets `depthStencil` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthStencil(MemorySegment segment, long index, @CType("VkClearDepthStencilValue") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_depthStencil, index), ML_depthStencil.byteSize()); }
    /// Sets `depthStencil` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthStencil(MemorySegment segment, @CType("VkClearDepthStencilValue") java.lang.foreign.MemorySegment value) { VkClearValue.set_depthStencil(segment, 0L, value); }
    /// Sets `depthStencil` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkClearValue depthStencilAt(long index, @CType("VkClearDepthStencilValue") java.lang.foreign.MemorySegment value) { VkClearValue.set_depthStencil(this.segment(), index, value); return this; }
    /// Sets `depthStencil` with the given value.
    /// @param value the value
    /// @return `this`
    public VkClearValue depthStencil(@CType("VkClearDepthStencilValue") java.lang.foreign.MemorySegment value) { VkClearValue.set_depthStencil(this.segment(), value); return this; }

}

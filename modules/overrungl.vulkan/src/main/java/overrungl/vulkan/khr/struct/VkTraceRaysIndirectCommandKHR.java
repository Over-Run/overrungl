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
/// ### width
/// [VarHandle][#VH_width] - [Getter][#width()] - [Setter][#width(int)]
/// ### height
/// [VarHandle][#VH_height] - [Getter][#height()] - [Setter][#height(int)]
/// ### depth
/// [VarHandle][#VH_depth] - [Getter][#depth()] - [Setter][#depth(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkTraceRaysIndirectCommandKHR {
///     uint32_t width;
///     uint32_t height;
///     uint32_t depth;
/// } VkTraceRaysIndirectCommandKHR;
/// ```
public final class VkTraceRaysIndirectCommandKHR extends Struct {
    /// The struct layout of `VkTraceRaysIndirectCommandKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("depth")
    );
    /// The [VarHandle] of `width` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("width"));
    /// The [VarHandle] of `height` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("height"));
    /// The [VarHandle] of `depth` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_depth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depth"));

    /// Creates `VkTraceRaysIndirectCommandKHR` with the given segment.
    /// @param segment the memory segment
    public VkTraceRaysIndirectCommandKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkTraceRaysIndirectCommandKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTraceRaysIndirectCommandKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkTraceRaysIndirectCommandKHR(segment); }

    /// Creates `VkTraceRaysIndirectCommandKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTraceRaysIndirectCommandKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkTraceRaysIndirectCommandKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkTraceRaysIndirectCommandKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkTraceRaysIndirectCommandKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkTraceRaysIndirectCommandKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkTraceRaysIndirectCommandKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkTraceRaysIndirectCommandKHR`
    public static VkTraceRaysIndirectCommandKHR alloc(SegmentAllocator allocator) { return new VkTraceRaysIndirectCommandKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkTraceRaysIndirectCommandKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkTraceRaysIndirectCommandKHR`
    public static VkTraceRaysIndirectCommandKHR alloc(SegmentAllocator allocator, long count) { return new VkTraceRaysIndirectCommandKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkTraceRaysIndirectCommandKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkTraceRaysIndirectCommandKHR`
    public VkTraceRaysIndirectCommandKHR asSlice(long index) { return new VkTraceRaysIndirectCommandKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkTraceRaysIndirectCommandKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkTraceRaysIndirectCommandKHR`
    public VkTraceRaysIndirectCommandKHR asSlice(long index, long count) { return new VkTraceRaysIndirectCommandKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `width` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_width(MemorySegment segment, long index) { return (int) VH_width.get(segment, 0L, index); }
    /// {@return `width`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_width(MemorySegment segment) { return VkTraceRaysIndirectCommandKHR.get_width(segment, 0L); }
    /// {@return `width` at the given index}
    /// @param index the index
    public @CType("uint32_t") int widthAt(long index) { return VkTraceRaysIndirectCommandKHR.get_width(this.segment(), index); }
    /// {@return `width`}
    public @CType("uint32_t") int width() { return VkTraceRaysIndirectCommandKHR.get_width(this.segment()); }
    /// Sets `width` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_width(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_width.set(segment, 0L, index, value); }
    /// Sets `width` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_width(MemorySegment segment, @CType("uint32_t") int value) { VkTraceRaysIndirectCommandKHR.set_width(segment, 0L, value); }
    /// Sets `width` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommandKHR widthAt(long index, @CType("uint32_t") int value) { VkTraceRaysIndirectCommandKHR.set_width(this.segment(), index, value); return this; }
    /// Sets `width` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommandKHR width(@CType("uint32_t") int value) { VkTraceRaysIndirectCommandKHR.set_width(this.segment(), value); return this; }

    /// {@return `height` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_height(MemorySegment segment, long index) { return (int) VH_height.get(segment, 0L, index); }
    /// {@return `height`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_height(MemorySegment segment) { return VkTraceRaysIndirectCommandKHR.get_height(segment, 0L); }
    /// {@return `height` at the given index}
    /// @param index the index
    public @CType("uint32_t") int heightAt(long index) { return VkTraceRaysIndirectCommandKHR.get_height(this.segment(), index); }
    /// {@return `height`}
    public @CType("uint32_t") int height() { return VkTraceRaysIndirectCommandKHR.get_height(this.segment()); }
    /// Sets `height` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_height(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_height.set(segment, 0L, index, value); }
    /// Sets `height` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_height(MemorySegment segment, @CType("uint32_t") int value) { VkTraceRaysIndirectCommandKHR.set_height(segment, 0L, value); }
    /// Sets `height` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommandKHR heightAt(long index, @CType("uint32_t") int value) { VkTraceRaysIndirectCommandKHR.set_height(this.segment(), index, value); return this; }
    /// Sets `height` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommandKHR height(@CType("uint32_t") int value) { VkTraceRaysIndirectCommandKHR.set_height(this.segment(), value); return this; }

    /// {@return `depth` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_depth(MemorySegment segment, long index) { return (int) VH_depth.get(segment, 0L, index); }
    /// {@return `depth`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_depth(MemorySegment segment) { return VkTraceRaysIndirectCommandKHR.get_depth(segment, 0L); }
    /// {@return `depth` at the given index}
    /// @param index the index
    public @CType("uint32_t") int depthAt(long index) { return VkTraceRaysIndirectCommandKHR.get_depth(this.segment(), index); }
    /// {@return `depth`}
    public @CType("uint32_t") int depth() { return VkTraceRaysIndirectCommandKHR.get_depth(this.segment()); }
    /// Sets `depth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depth(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_depth.set(segment, 0L, index, value); }
    /// Sets `depth` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depth(MemorySegment segment, @CType("uint32_t") int value) { VkTraceRaysIndirectCommandKHR.set_depth(segment, 0L, value); }
    /// Sets `depth` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommandKHR depthAt(long index, @CType("uint32_t") int value) { VkTraceRaysIndirectCommandKHR.set_depth(this.segment(), index, value); return this; }
    /// Sets `depth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkTraceRaysIndirectCommandKHR depth(@CType("uint32_t") int value) { VkTraceRaysIndirectCommandKHR.set_depth(this.segment(), value); return this; }

}

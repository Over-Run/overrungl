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
/// ### x
/// [VarHandle][#VH_x] - [Getter][#x()] - [Setter][#x(float)]
/// ### y
/// [VarHandle][#VH_y] - [Getter][#y()] - [Setter][#y(float)]
/// ### width
/// [VarHandle][#VH_width] - [Getter][#width()] - [Setter][#width(float)]
/// ### height
/// [VarHandle][#VH_height] - [Getter][#height()] - [Setter][#height(float)]
/// ### minDepth
/// [VarHandle][#VH_minDepth] - [Getter][#minDepth()] - [Setter][#minDepth(float)]
/// ### maxDepth
/// [VarHandle][#VH_maxDepth] - [Getter][#maxDepth()] - [Setter][#maxDepth(float)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkViewport {
///     float x;
///     float y;
///     float width;
///     float height;
///     float minDepth;
///     float maxDepth;
/// } VkViewport;
/// ```
public final class VkViewport extends Struct {
    /// The struct layout of `VkViewport`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_FLOAT.withName("x"),
        ValueLayout.JAVA_FLOAT.withName("y"),
        ValueLayout.JAVA_FLOAT.withName("width"),
        ValueLayout.JAVA_FLOAT.withName("height"),
        ValueLayout.JAVA_FLOAT.withName("minDepth"),
        ValueLayout.JAVA_FLOAT.withName("maxDepth")
    );
    /// The [VarHandle] of `x` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_x = LAYOUT.arrayElementVarHandle(PathElement.groupElement("x"));
    /// The [VarHandle] of `y` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_y = LAYOUT.arrayElementVarHandle(PathElement.groupElement("y"));
    /// The [VarHandle] of `width` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_width = LAYOUT.arrayElementVarHandle(PathElement.groupElement("width"));
    /// The [VarHandle] of `height` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_height = LAYOUT.arrayElementVarHandle(PathElement.groupElement("height"));
    /// The [VarHandle] of `minDepth` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_minDepth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minDepth"));
    /// The [VarHandle] of `maxDepth` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_maxDepth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDepth"));

    /// Creates `VkViewport` with the given segment.
    /// @param segment the memory segment
    public VkViewport(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkViewport` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkViewport of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkViewport(segment); }

    /// Creates `VkViewport` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkViewport ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkViewport(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkViewport` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkViewport ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkViewport(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkViewport` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkViewport`
    public static VkViewport alloc(SegmentAllocator allocator) { return new VkViewport(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkViewport` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkViewport`
    public static VkViewport alloc(SegmentAllocator allocator, long count) { return new VkViewport(allocator.allocate(LAYOUT, count)); }

    /// {@return `x` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_x(MemorySegment segment, long index) { return (float) VH_x.get(segment, 0L, index); }
    /// {@return `x`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_x(MemorySegment segment) { return VkViewport.get_x(segment, 0L); }
    /// {@return `x` at the given index}
    /// @param index the index
    public @CType("float") float xAt(long index) { return VkViewport.get_x(this.segment(), index); }
    /// {@return `x`}
    public @CType("float") float x() { return VkViewport.get_x(this.segment()); }
    /// Sets `x` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_x(MemorySegment segment, long index, @CType("float") float value) { VH_x.set(segment, 0L, index, value); }
    /// Sets `x` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_x(MemorySegment segment, @CType("float") float value) { VkViewport.set_x(segment, 0L, value); }
    /// Sets `x` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkViewport xAt(long index, @CType("float") float value) { VkViewport.set_x(this.segment(), index, value); return this; }
    /// Sets `x` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViewport x(@CType("float") float value) { VkViewport.set_x(this.segment(), value); return this; }

    /// {@return `y` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_y(MemorySegment segment, long index) { return (float) VH_y.get(segment, 0L, index); }
    /// {@return `y`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_y(MemorySegment segment) { return VkViewport.get_y(segment, 0L); }
    /// {@return `y` at the given index}
    /// @param index the index
    public @CType("float") float yAt(long index) { return VkViewport.get_y(this.segment(), index); }
    /// {@return `y`}
    public @CType("float") float y() { return VkViewport.get_y(this.segment()); }
    /// Sets `y` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_y(MemorySegment segment, long index, @CType("float") float value) { VH_y.set(segment, 0L, index, value); }
    /// Sets `y` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_y(MemorySegment segment, @CType("float") float value) { VkViewport.set_y(segment, 0L, value); }
    /// Sets `y` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkViewport yAt(long index, @CType("float") float value) { VkViewport.set_y(this.segment(), index, value); return this; }
    /// Sets `y` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViewport y(@CType("float") float value) { VkViewport.set_y(this.segment(), value); return this; }

    /// {@return `width` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_width(MemorySegment segment, long index) { return (float) VH_width.get(segment, 0L, index); }
    /// {@return `width`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_width(MemorySegment segment) { return VkViewport.get_width(segment, 0L); }
    /// {@return `width` at the given index}
    /// @param index the index
    public @CType("float") float widthAt(long index) { return VkViewport.get_width(this.segment(), index); }
    /// {@return `width`}
    public @CType("float") float width() { return VkViewport.get_width(this.segment()); }
    /// Sets `width` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_width(MemorySegment segment, long index, @CType("float") float value) { VH_width.set(segment, 0L, index, value); }
    /// Sets `width` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_width(MemorySegment segment, @CType("float") float value) { VkViewport.set_width(segment, 0L, value); }
    /// Sets `width` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkViewport widthAt(long index, @CType("float") float value) { VkViewport.set_width(this.segment(), index, value); return this; }
    /// Sets `width` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViewport width(@CType("float") float value) { VkViewport.set_width(this.segment(), value); return this; }

    /// {@return `height` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_height(MemorySegment segment, long index) { return (float) VH_height.get(segment, 0L, index); }
    /// {@return `height`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_height(MemorySegment segment) { return VkViewport.get_height(segment, 0L); }
    /// {@return `height` at the given index}
    /// @param index the index
    public @CType("float") float heightAt(long index) { return VkViewport.get_height(this.segment(), index); }
    /// {@return `height`}
    public @CType("float") float height() { return VkViewport.get_height(this.segment()); }
    /// Sets `height` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_height(MemorySegment segment, long index, @CType("float") float value) { VH_height.set(segment, 0L, index, value); }
    /// Sets `height` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_height(MemorySegment segment, @CType("float") float value) { VkViewport.set_height(segment, 0L, value); }
    /// Sets `height` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkViewport heightAt(long index, @CType("float") float value) { VkViewport.set_height(this.segment(), index, value); return this; }
    /// Sets `height` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViewport height(@CType("float") float value) { VkViewport.set_height(this.segment(), value); return this; }

    /// {@return `minDepth` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_minDepth(MemorySegment segment, long index) { return (float) VH_minDepth.get(segment, 0L, index); }
    /// {@return `minDepth`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_minDepth(MemorySegment segment) { return VkViewport.get_minDepth(segment, 0L); }
    /// {@return `minDepth` at the given index}
    /// @param index the index
    public @CType("float") float minDepthAt(long index) { return VkViewport.get_minDepth(this.segment(), index); }
    /// {@return `minDepth`}
    public @CType("float") float minDepth() { return VkViewport.get_minDepth(this.segment()); }
    /// Sets `minDepth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minDepth(MemorySegment segment, long index, @CType("float") float value) { VH_minDepth.set(segment, 0L, index, value); }
    /// Sets `minDepth` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minDepth(MemorySegment segment, @CType("float") float value) { VkViewport.set_minDepth(segment, 0L, value); }
    /// Sets `minDepth` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkViewport minDepthAt(long index, @CType("float") float value) { VkViewport.set_minDepth(this.segment(), index, value); return this; }
    /// Sets `minDepth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViewport minDepth(@CType("float") float value) { VkViewport.set_minDepth(this.segment(), value); return this; }

    /// {@return `maxDepth` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_maxDepth(MemorySegment segment, long index) { return (float) VH_maxDepth.get(segment, 0L, index); }
    /// {@return `maxDepth`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_maxDepth(MemorySegment segment) { return VkViewport.get_maxDepth(segment, 0L); }
    /// {@return `maxDepth` at the given index}
    /// @param index the index
    public @CType("float") float maxDepthAt(long index) { return VkViewport.get_maxDepth(this.segment(), index); }
    /// {@return `maxDepth`}
    public @CType("float") float maxDepth() { return VkViewport.get_maxDepth(this.segment()); }
    /// Sets `maxDepth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDepth(MemorySegment segment, long index, @CType("float") float value) { VH_maxDepth.set(segment, 0L, index, value); }
    /// Sets `maxDepth` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDepth(MemorySegment segment, @CType("float") float value) { VkViewport.set_maxDepth(segment, 0L, value); }
    /// Sets `maxDepth` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkViewport maxDepthAt(long index, @CType("float") float value) { VkViewport.set_maxDepth(this.segment(), index, value); return this; }
    /// Sets `maxDepth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkViewport maxDepth(@CType("float") float value) { VkViewport.set_maxDepth(this.segment(), value); return this; }

}

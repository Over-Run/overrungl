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
/// ### minDepthClamp
/// [VarHandle][#VH_minDepthClamp] - [Getter][#minDepthClamp()] - [Setter][#minDepthClamp(float)]
/// ### maxDepthClamp
/// [VarHandle][#VH_maxDepthClamp] - [Getter][#maxDepthClamp()] - [Setter][#maxDepthClamp(float)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkDepthClampRangeEXT {
///     float minDepthClamp;
///     float maxDepthClamp;
/// } VkDepthClampRangeEXT;
/// ```
public final class VkDepthClampRangeEXT extends Struct {
    /// The struct layout of `VkDepthClampRangeEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_FLOAT.withName("minDepthClamp"),
        ValueLayout.JAVA_FLOAT.withName("maxDepthClamp")
    );
    /// The [VarHandle] of `minDepthClamp` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_minDepthClamp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minDepthClamp"));
    /// The [VarHandle] of `maxDepthClamp` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_maxDepthClamp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDepthClamp"));

    /// Creates `VkDepthClampRangeEXT` with the given segment.
    /// @param segment the memory segment
    public VkDepthClampRangeEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkDepthClampRangeEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDepthClampRangeEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDepthClampRangeEXT(segment); }

    /// Creates `VkDepthClampRangeEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDepthClampRangeEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkDepthClampRangeEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkDepthClampRangeEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkDepthClampRangeEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkDepthClampRangeEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkDepthClampRangeEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkDepthClampRangeEXT`
    public static VkDepthClampRangeEXT alloc(SegmentAllocator allocator) { return new VkDepthClampRangeEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkDepthClampRangeEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkDepthClampRangeEXT`
    public static VkDepthClampRangeEXT alloc(SegmentAllocator allocator, long count) { return new VkDepthClampRangeEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkDepthClampRangeEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkDepthClampRangeEXT`
    public VkDepthClampRangeEXT asSlice(long index) { return new VkDepthClampRangeEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkDepthClampRangeEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkDepthClampRangeEXT`
    public VkDepthClampRangeEXT asSlice(long index, long count) { return new VkDepthClampRangeEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `minDepthClamp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_minDepthClamp(MemorySegment segment, long index) { return (float) VH_minDepthClamp.get(segment, 0L, index); }
    /// {@return `minDepthClamp`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_minDepthClamp(MemorySegment segment) { return VkDepthClampRangeEXT.get_minDepthClamp(segment, 0L); }
    /// {@return `minDepthClamp` at the given index}
    /// @param index the index
    public @CType("float") float minDepthClampAt(long index) { return VkDepthClampRangeEXT.get_minDepthClamp(this.segment(), index); }
    /// {@return `minDepthClamp`}
    public @CType("float") float minDepthClamp() { return VkDepthClampRangeEXT.get_minDepthClamp(this.segment()); }
    /// Sets `minDepthClamp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minDepthClamp(MemorySegment segment, long index, @CType("float") float value) { VH_minDepthClamp.set(segment, 0L, index, value); }
    /// Sets `minDepthClamp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minDepthClamp(MemorySegment segment, @CType("float") float value) { VkDepthClampRangeEXT.set_minDepthClamp(segment, 0L, value); }
    /// Sets `minDepthClamp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDepthClampRangeEXT minDepthClampAt(long index, @CType("float") float value) { VkDepthClampRangeEXT.set_minDepthClamp(this.segment(), index, value); return this; }
    /// Sets `minDepthClamp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDepthClampRangeEXT minDepthClamp(@CType("float") float value) { VkDepthClampRangeEXT.set_minDepthClamp(this.segment(), value); return this; }

    /// {@return `maxDepthClamp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_maxDepthClamp(MemorySegment segment, long index) { return (float) VH_maxDepthClamp.get(segment, 0L, index); }
    /// {@return `maxDepthClamp`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_maxDepthClamp(MemorySegment segment) { return VkDepthClampRangeEXT.get_maxDepthClamp(segment, 0L); }
    /// {@return `maxDepthClamp` at the given index}
    /// @param index the index
    public @CType("float") float maxDepthClampAt(long index) { return VkDepthClampRangeEXT.get_maxDepthClamp(this.segment(), index); }
    /// {@return `maxDepthClamp`}
    public @CType("float") float maxDepthClamp() { return VkDepthClampRangeEXT.get_maxDepthClamp(this.segment()); }
    /// Sets `maxDepthClamp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDepthClamp(MemorySegment segment, long index, @CType("float") float value) { VH_maxDepthClamp.set(segment, 0L, index, value); }
    /// Sets `maxDepthClamp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDepthClamp(MemorySegment segment, @CType("float") float value) { VkDepthClampRangeEXT.set_maxDepthClamp(segment, 0L, value); }
    /// Sets `maxDepthClamp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkDepthClampRangeEXT maxDepthClampAt(long index, @CType("float") float value) { VkDepthClampRangeEXT.set_maxDepthClamp(this.segment(), index, value); return this; }
    /// Sets `maxDepthClamp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkDepthClampRangeEXT maxDepthClamp(@CType("float") float value) { VkDepthClampRangeEXT.set_maxDepthClamp(this.segment(), value); return this; }

}

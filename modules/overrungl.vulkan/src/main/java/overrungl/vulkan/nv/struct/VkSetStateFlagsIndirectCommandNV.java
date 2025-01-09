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
package overrungl.vulkan.nv.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### data
/// [VarHandle][#VH_data] - [Getter][#data()] - [Setter][#data(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSetStateFlagsIndirectCommandNV {
///     uint32_t data;
/// } VkSetStateFlagsIndirectCommandNV;
/// ```
public final class VkSetStateFlagsIndirectCommandNV extends Struct {
    /// The struct layout of `VkSetStateFlagsIndirectCommandNV`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("data")
    );
    /// The [VarHandle] of `data` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_data = LAYOUT.arrayElementVarHandle(PathElement.groupElement("data"));

    /// Creates `VkSetStateFlagsIndirectCommandNV` with the given segment.
    /// @param segment the memory segment
    public VkSetStateFlagsIndirectCommandNV(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSetStateFlagsIndirectCommandNV` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSetStateFlagsIndirectCommandNV of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSetStateFlagsIndirectCommandNV(segment); }

    /// Creates `VkSetStateFlagsIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSetStateFlagsIndirectCommandNV ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSetStateFlagsIndirectCommandNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSetStateFlagsIndirectCommandNV` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSetStateFlagsIndirectCommandNV ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSetStateFlagsIndirectCommandNV(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSetStateFlagsIndirectCommandNV` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSetStateFlagsIndirectCommandNV`
    public static VkSetStateFlagsIndirectCommandNV alloc(SegmentAllocator allocator) { return new VkSetStateFlagsIndirectCommandNV(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSetStateFlagsIndirectCommandNV` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSetStateFlagsIndirectCommandNV`
    public static VkSetStateFlagsIndirectCommandNV alloc(SegmentAllocator allocator, long count) { return new VkSetStateFlagsIndirectCommandNV(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkSetStateFlagsIndirectCommandNV`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSetStateFlagsIndirectCommandNV`
    public VkSetStateFlagsIndirectCommandNV asSlice(long index) { return new VkSetStateFlagsIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkSetStateFlagsIndirectCommandNV`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSetStateFlagsIndirectCommandNV`
    public VkSetStateFlagsIndirectCommandNV asSlice(long index, long count) { return new VkSetStateFlagsIndirectCommandNV(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `data` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_data(MemorySegment segment, long index) { return (int) VH_data.get(segment, 0L, index); }
    /// {@return `data`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_data(MemorySegment segment) { return VkSetStateFlagsIndirectCommandNV.get_data(segment, 0L); }
    /// {@return `data` at the given index}
    /// @param index the index
    public @CType("uint32_t") int dataAt(long index) { return VkSetStateFlagsIndirectCommandNV.get_data(this.segment(), index); }
    /// {@return `data`}
    public @CType("uint32_t") int data() { return VkSetStateFlagsIndirectCommandNV.get_data(this.segment()); }
    /// Sets `data` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_data(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_data.set(segment, 0L, index, value); }
    /// Sets `data` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_data(MemorySegment segment, @CType("uint32_t") int value) { VkSetStateFlagsIndirectCommandNV.set_data(segment, 0L, value); }
    /// Sets `data` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSetStateFlagsIndirectCommandNV dataAt(long index, @CType("uint32_t") int value) { VkSetStateFlagsIndirectCommandNV.set_data(this.segment(), index, value); return this; }
    /// Sets `data` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSetStateFlagsIndirectCommandNV data(@CType("uint32_t") int value) { VkSetStateFlagsIndirectCommandNV.set_data(this.segment(), value); return this; }

}

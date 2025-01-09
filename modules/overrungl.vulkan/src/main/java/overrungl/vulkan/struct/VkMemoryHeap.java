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
/// ### size
/// [VarHandle][#VH_size] - [Getter][#size()] - [Setter][#size(long)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMemoryHeap {
///     VkDeviceSize size;
///     VkMemoryHeapFlags flags;
/// } VkMemoryHeap;
/// ```
public final class VkMemoryHeap extends Struct {
    /// The struct layout of `VkMemoryHeap`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    /// Creates `VkMemoryHeap` with the given segment.
    /// @param segment the memory segment
    public VkMemoryHeap(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMemoryHeap` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryHeap of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryHeap(segment); }

    /// Creates `VkMemoryHeap` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryHeap ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryHeap(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMemoryHeap` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryHeap ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryHeap(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkMemoryHeap` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryHeap`
    public static VkMemoryHeap alloc(SegmentAllocator allocator) { return new VkMemoryHeap(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMemoryHeap` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMemoryHeap`
    public static VkMemoryHeap alloc(SegmentAllocator allocator, long count) { return new VkMemoryHeap(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkMemoryHeap`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkMemoryHeap`
    public VkMemoryHeap asSlice(long index) { return new VkMemoryHeap(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkMemoryHeap`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkMemoryHeap`
    public VkMemoryHeap asSlice(long index, long count) { return new VkMemoryHeap(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment, long index) { return (long) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment) { return VkMemoryHeap.get_size(segment, 0L); }
    /// {@return `size` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long sizeAt(long index) { return VkMemoryHeap.get_size(this.segment(), index); }
    /// {@return `size`}
    public @CType("VkDeviceSize") long size() { return VkMemoryHeap.get_size(this.segment()); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_size(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_size(MemorySegment segment, @CType("VkDeviceSize") long value) { VkMemoryHeap.set_size(segment, 0L, value); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMemoryHeap sizeAt(long index, @CType("VkDeviceSize") long value) { VkMemoryHeap.set_size(this.segment(), index, value); return this; }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryHeap size(@CType("VkDeviceSize") long value) { VkMemoryHeap.set_size(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkMemoryHeapFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkMemoryHeapFlags") int get_flags(MemorySegment segment) { return VkMemoryHeap.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkMemoryHeapFlags") int flagsAt(long index) { return VkMemoryHeap.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkMemoryHeapFlags") int flags() { return VkMemoryHeap.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkMemoryHeapFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkMemoryHeapFlags") int value) { VkMemoryHeap.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMemoryHeap flagsAt(long index, @CType("VkMemoryHeapFlags") int value) { VkMemoryHeap.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryHeap flags(@CType("VkMemoryHeapFlags") int value) { VkMemoryHeap.set_flags(this.segment(), value); return this; }

}

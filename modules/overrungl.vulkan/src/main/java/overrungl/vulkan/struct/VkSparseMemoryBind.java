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
/// ### resourceOffset
/// [VarHandle][#VH_resourceOffset] - [Getter][#resourceOffset()] - [Setter][#resourceOffset(long)]
/// ### size
/// [VarHandle][#VH_size] - [Getter][#size()] - [Setter][#size(long)]
/// ### memory
/// [VarHandle][#VH_memory] - [Getter][#memory()] - [Setter][#memory(java.lang.foreign.MemorySegment)]
/// ### memoryOffset
/// [VarHandle][#VH_memoryOffset] - [Getter][#memoryOffset()] - [Setter][#memoryOffset(long)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSparseMemoryBind {
///     VkDeviceSize resourceOffset;
///     VkDeviceSize size;
///     VkDeviceMemory memory;
///     VkDeviceSize memoryOffset;
///     VkSparseMemoryBindFlags flags;
/// } VkSparseMemoryBind;
/// ```
public final class VkSparseMemoryBind extends Struct {
    /// The struct layout of `VkSparseMemoryBind`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_LONG.withName("resourceOffset"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.ADDRESS.withName("memory"),
        ValueLayout.JAVA_LONG.withName("memoryOffset"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    /// The [VarHandle] of `resourceOffset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_resourceOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("resourceOffset"));
    /// The [VarHandle] of `size` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_size = LAYOUT.arrayElementVarHandle(PathElement.groupElement("size"));
    /// The [VarHandle] of `memory` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_memory = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memory"));
    /// The [VarHandle] of `memoryOffset` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_memoryOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryOffset"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));

    /// Creates `VkSparseMemoryBind` with the given segment.
    /// @param segment the memory segment
    public VkSparseMemoryBind(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSparseMemoryBind` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseMemoryBind of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSparseMemoryBind(segment); }

    /// Creates `VkSparseMemoryBind` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseMemoryBind ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSparseMemoryBind(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSparseMemoryBind` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseMemoryBind ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSparseMemoryBind(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSparseMemoryBind` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSparseMemoryBind`
    public static VkSparseMemoryBind alloc(SegmentAllocator allocator) { return new VkSparseMemoryBind(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSparseMemoryBind` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSparseMemoryBind`
    public static VkSparseMemoryBind alloc(SegmentAllocator allocator, long count) { return new VkSparseMemoryBind(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkSparseMemoryBind`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSparseMemoryBind`
    public VkSparseMemoryBind asSlice(long index) { return new VkSparseMemoryBind(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkSparseMemoryBind`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSparseMemoryBind`
    public VkSparseMemoryBind asSlice(long index, long count) { return new VkSparseMemoryBind(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `resourceOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_resourceOffset(MemorySegment segment, long index) { return (long) VH_resourceOffset.get(segment, 0L, index); }
    /// {@return `resourceOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_resourceOffset(MemorySegment segment) { return VkSparseMemoryBind.get_resourceOffset(segment, 0L); }
    /// {@return `resourceOffset` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long resourceOffsetAt(long index) { return VkSparseMemoryBind.get_resourceOffset(this.segment(), index); }
    /// {@return `resourceOffset`}
    public @CType("VkDeviceSize") long resourceOffset() { return VkSparseMemoryBind.get_resourceOffset(this.segment()); }
    /// Sets `resourceOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_resourceOffset(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_resourceOffset.set(segment, 0L, index, value); }
    /// Sets `resourceOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_resourceOffset(MemorySegment segment, @CType("VkDeviceSize") long value) { VkSparseMemoryBind.set_resourceOffset(segment, 0L, value); }
    /// Sets `resourceOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSparseMemoryBind resourceOffsetAt(long index, @CType("VkDeviceSize") long value) { VkSparseMemoryBind.set_resourceOffset(this.segment(), index, value); return this; }
    /// Sets `resourceOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseMemoryBind resourceOffset(@CType("VkDeviceSize") long value) { VkSparseMemoryBind.set_resourceOffset(this.segment(), value); return this; }

    /// {@return `size` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment, long index) { return (long) VH_size.get(segment, 0L, index); }
    /// {@return `size`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_size(MemorySegment segment) { return VkSparseMemoryBind.get_size(segment, 0L); }
    /// {@return `size` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long sizeAt(long index) { return VkSparseMemoryBind.get_size(this.segment(), index); }
    /// {@return `size`}
    public @CType("VkDeviceSize") long size() { return VkSparseMemoryBind.get_size(this.segment()); }
    /// Sets `size` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_size(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_size.set(segment, 0L, index, value); }
    /// Sets `size` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_size(MemorySegment segment, @CType("VkDeviceSize") long value) { VkSparseMemoryBind.set_size(segment, 0L, value); }
    /// Sets `size` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSparseMemoryBind sizeAt(long index, @CType("VkDeviceSize") long value) { VkSparseMemoryBind.set_size(this.segment(), index, value); return this; }
    /// Sets `size` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseMemoryBind size(@CType("VkDeviceSize") long value) { VkSparseMemoryBind.set_size(this.segment(), value); return this; }

    /// {@return `memory` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceMemory") java.lang.foreign.MemorySegment get_memory(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_memory.get(segment, 0L, index); }
    /// {@return `memory`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceMemory") java.lang.foreign.MemorySegment get_memory(MemorySegment segment) { return VkSparseMemoryBind.get_memory(segment, 0L); }
    /// {@return `memory` at the given index}
    /// @param index the index
    public @CType("VkDeviceMemory") java.lang.foreign.MemorySegment memoryAt(long index) { return VkSparseMemoryBind.get_memory(this.segment(), index); }
    /// {@return `memory`}
    public @CType("VkDeviceMemory") java.lang.foreign.MemorySegment memory() { return VkSparseMemoryBind.get_memory(this.segment()); }
    /// Sets `memory` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memory(MemorySegment segment, long index, @CType("VkDeviceMemory") java.lang.foreign.MemorySegment value) { VH_memory.set(segment, 0L, index, value); }
    /// Sets `memory` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memory(MemorySegment segment, @CType("VkDeviceMemory") java.lang.foreign.MemorySegment value) { VkSparseMemoryBind.set_memory(segment, 0L, value); }
    /// Sets `memory` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSparseMemoryBind memoryAt(long index, @CType("VkDeviceMemory") java.lang.foreign.MemorySegment value) { VkSparseMemoryBind.set_memory(this.segment(), index, value); return this; }
    /// Sets `memory` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseMemoryBind memory(@CType("VkDeviceMemory") java.lang.foreign.MemorySegment value) { VkSparseMemoryBind.set_memory(this.segment(), value); return this; }

    /// {@return `memoryOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_memoryOffset(MemorySegment segment, long index) { return (long) VH_memoryOffset.get(segment, 0L, index); }
    /// {@return `memoryOffset`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_memoryOffset(MemorySegment segment) { return VkSparseMemoryBind.get_memoryOffset(segment, 0L); }
    /// {@return `memoryOffset` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long memoryOffsetAt(long index) { return VkSparseMemoryBind.get_memoryOffset(this.segment(), index); }
    /// {@return `memoryOffset`}
    public @CType("VkDeviceSize") long memoryOffset() { return VkSparseMemoryBind.get_memoryOffset(this.segment()); }
    /// Sets `memoryOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memoryOffset(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_memoryOffset.set(segment, 0L, index, value); }
    /// Sets `memoryOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memoryOffset(MemorySegment segment, @CType("VkDeviceSize") long value) { VkSparseMemoryBind.set_memoryOffset(segment, 0L, value); }
    /// Sets `memoryOffset` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSparseMemoryBind memoryOffsetAt(long index, @CType("VkDeviceSize") long value) { VkSparseMemoryBind.set_memoryOffset(this.segment(), index, value); return this; }
    /// Sets `memoryOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseMemoryBind memoryOffset(@CType("VkDeviceSize") long value) { VkSparseMemoryBind.set_memoryOffset(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSparseMemoryBindFlags") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkSparseMemoryBindFlags") int get_flags(MemorySegment segment) { return VkSparseMemoryBind.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkSparseMemoryBindFlags") int flagsAt(long index) { return VkSparseMemoryBind.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkSparseMemoryBindFlags") int flags() { return VkSparseMemoryBind.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkSparseMemoryBindFlags") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkSparseMemoryBindFlags") int value) { VkSparseMemoryBind.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSparseMemoryBind flagsAt(long index, @CType("VkSparseMemoryBindFlags") int value) { VkSparseMemoryBind.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseMemoryBind flags(@CType("VkSparseMemoryBindFlags") int value) { VkSparseMemoryBind.set_flags(this.segment(), value); return this; }

}

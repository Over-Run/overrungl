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
/// ### buffer
/// [VarHandle][#VH_buffer] - [Getter][#buffer()] - [Setter][#buffer(java.lang.foreign.MemorySegment)]
/// ### bindCount
/// [VarHandle][#VH_bindCount] - [Getter][#bindCount()] - [Setter][#bindCount(int)]
/// ### pBinds
/// [VarHandle][#VH_pBinds] - [Getter][#pBinds()] - [Setter][#pBinds(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSparseBufferMemoryBindInfo {
///     VkBuffer buffer;
///     uint32_t bindCount;
///     const VkSparseMemoryBind * pBinds;
/// } VkSparseBufferMemoryBindInfo;
/// ```
public final class VkSparseBufferMemoryBindInfo extends Struct {
    /// The struct layout of `VkSparseBufferMemoryBindInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.ADDRESS.withName("buffer"),
        ValueLayout.JAVA_INT.withName("bindCount"),
        ValueLayout.ADDRESS.withName("pBinds")
    );
    /// The [VarHandle] of `buffer` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_buffer = LAYOUT.arrayElementVarHandle(PathElement.groupElement("buffer"));
    /// The [VarHandle] of `bindCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bindCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bindCount"));
    /// The [VarHandle] of `pBinds` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pBinds = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBinds"));

    /// Creates `VkSparseBufferMemoryBindInfo` with the given segment.
    /// @param segment the memory segment
    public VkSparseBufferMemoryBindInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSparseBufferMemoryBindInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseBufferMemoryBindInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSparseBufferMemoryBindInfo(segment); }

    /// Creates `VkSparseBufferMemoryBindInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseBufferMemoryBindInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSparseBufferMemoryBindInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSparseBufferMemoryBindInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseBufferMemoryBindInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSparseBufferMemoryBindInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSparseBufferMemoryBindInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSparseBufferMemoryBindInfo`
    public static VkSparseBufferMemoryBindInfo alloc(SegmentAllocator allocator) { return new VkSparseBufferMemoryBindInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSparseBufferMemoryBindInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSparseBufferMemoryBindInfo`
    public static VkSparseBufferMemoryBindInfo alloc(SegmentAllocator allocator, long count) { return new VkSparseBufferMemoryBindInfo(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkSparseBufferMemoryBindInfo`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkSparseBufferMemoryBindInfo`
    public VkSparseBufferMemoryBindInfo asSlice(long index) { return new VkSparseBufferMemoryBindInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkSparseBufferMemoryBindInfo`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkSparseBufferMemoryBindInfo`
    public VkSparseBufferMemoryBindInfo asSlice(long index, long count) { return new VkSparseBufferMemoryBindInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `buffer` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBuffer") java.lang.foreign.MemorySegment get_buffer(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_buffer.get(segment, 0L, index); }
    /// {@return `buffer`}
    /// @param segment the segment of the struct
    public static @CType("VkBuffer") java.lang.foreign.MemorySegment get_buffer(MemorySegment segment) { return VkSparseBufferMemoryBindInfo.get_buffer(segment, 0L); }
    /// {@return `buffer` at the given index}
    /// @param index the index
    public @CType("VkBuffer") java.lang.foreign.MemorySegment bufferAt(long index) { return VkSparseBufferMemoryBindInfo.get_buffer(this.segment(), index); }
    /// {@return `buffer`}
    public @CType("VkBuffer") java.lang.foreign.MemorySegment buffer() { return VkSparseBufferMemoryBindInfo.get_buffer(this.segment()); }
    /// Sets `buffer` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_buffer(MemorySegment segment, long index, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VH_buffer.set(segment, 0L, index, value); }
    /// Sets `buffer` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_buffer(MemorySegment segment, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkSparseBufferMemoryBindInfo.set_buffer(segment, 0L, value); }
    /// Sets `buffer` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSparseBufferMemoryBindInfo bufferAt(long index, @CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkSparseBufferMemoryBindInfo.set_buffer(this.segment(), index, value); return this; }
    /// Sets `buffer` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseBufferMemoryBindInfo buffer(@CType("VkBuffer") java.lang.foreign.MemorySegment value) { VkSparseBufferMemoryBindInfo.set_buffer(this.segment(), value); return this; }

    /// {@return `bindCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_bindCount(MemorySegment segment, long index) { return (int) VH_bindCount.get(segment, 0L, index); }
    /// {@return `bindCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_bindCount(MemorySegment segment) { return VkSparseBufferMemoryBindInfo.get_bindCount(segment, 0L); }
    /// {@return `bindCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int bindCountAt(long index) { return VkSparseBufferMemoryBindInfo.get_bindCount(this.segment(), index); }
    /// {@return `bindCount`}
    public @CType("uint32_t") int bindCount() { return VkSparseBufferMemoryBindInfo.get_bindCount(this.segment()); }
    /// Sets `bindCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bindCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_bindCount.set(segment, 0L, index, value); }
    /// Sets `bindCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bindCount(MemorySegment segment, @CType("uint32_t") int value) { VkSparseBufferMemoryBindInfo.set_bindCount(segment, 0L, value); }
    /// Sets `bindCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSparseBufferMemoryBindInfo bindCountAt(long index, @CType("uint32_t") int value) { VkSparseBufferMemoryBindInfo.set_bindCount(this.segment(), index, value); return this; }
    /// Sets `bindCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseBufferMemoryBindInfo bindCount(@CType("uint32_t") int value) { VkSparseBufferMemoryBindInfo.set_bindCount(this.segment(), value); return this; }

    /// {@return `pBinds` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const VkSparseMemoryBind *") java.lang.foreign.MemorySegment get_pBinds(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pBinds.get(segment, 0L, index); }
    /// {@return `pBinds`}
    /// @param segment the segment of the struct
    public static @CType("const VkSparseMemoryBind *") java.lang.foreign.MemorySegment get_pBinds(MemorySegment segment) { return VkSparseBufferMemoryBindInfo.get_pBinds(segment, 0L); }
    /// {@return `pBinds` at the given index}
    /// @param index the index
    public @CType("const VkSparseMemoryBind *") java.lang.foreign.MemorySegment pBindsAt(long index) { return VkSparseBufferMemoryBindInfo.get_pBinds(this.segment(), index); }
    /// {@return `pBinds`}
    public @CType("const VkSparseMemoryBind *") java.lang.foreign.MemorySegment pBinds() { return VkSparseBufferMemoryBindInfo.get_pBinds(this.segment()); }
    /// Sets `pBinds` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pBinds(MemorySegment segment, long index, @CType("const VkSparseMemoryBind *") java.lang.foreign.MemorySegment value) { VH_pBinds.set(segment, 0L, index, value); }
    /// Sets `pBinds` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pBinds(MemorySegment segment, @CType("const VkSparseMemoryBind *") java.lang.foreign.MemorySegment value) { VkSparseBufferMemoryBindInfo.set_pBinds(segment, 0L, value); }
    /// Sets `pBinds` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSparseBufferMemoryBindInfo pBindsAt(long index, @CType("const VkSparseMemoryBind *") java.lang.foreign.MemorySegment value) { VkSparseBufferMemoryBindInfo.set_pBinds(this.segment(), index, value); return this; }
    /// Sets `pBinds` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseBufferMemoryBindInfo pBinds(@CType("const VkSparseMemoryBind *") java.lang.foreign.MemorySegment value) { VkSparseBufferMemoryBindInfo.set_pBinds(this.segment(), value); return this; }

}

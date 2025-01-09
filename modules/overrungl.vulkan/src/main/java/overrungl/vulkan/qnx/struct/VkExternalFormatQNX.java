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
package overrungl.vulkan.qnx.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### externalFormat
/// [VarHandle][#VH_externalFormat] - [Getter][#externalFormat()] - [Setter][#externalFormat(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkExternalFormatQNX {
///     VkStructureType sType;
///     void * pNext;
///     uint64_t externalFormat;
/// } VkExternalFormatQNX;
/// ```
public final class VkExternalFormatQNX extends Struct {
    /// The struct layout of `VkExternalFormatQNX`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("externalFormat")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `externalFormat` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_externalFormat = LAYOUT.arrayElementVarHandle(PathElement.groupElement("externalFormat"));

    /// Creates `VkExternalFormatQNX` with the given segment.
    /// @param segment the memory segment
    public VkExternalFormatQNX(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkExternalFormatQNX` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalFormatQNX of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExternalFormatQNX(segment); }

    /// Creates `VkExternalFormatQNX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalFormatQNX ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkExternalFormatQNX(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkExternalFormatQNX` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkExternalFormatQNX ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkExternalFormatQNX(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkExternalFormatQNX` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkExternalFormatQNX`
    public static VkExternalFormatQNX alloc(SegmentAllocator allocator) { return new VkExternalFormatQNX(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkExternalFormatQNX` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkExternalFormatQNX`
    public static VkExternalFormatQNX alloc(SegmentAllocator allocator, long count) { return new VkExternalFormatQNX(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkExternalFormatQNX`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkExternalFormatQNX`
    public VkExternalFormatQNX asSlice(long index) { return new VkExternalFormatQNX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkExternalFormatQNX`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkExternalFormatQNX`
    public VkExternalFormatQNX asSlice(long index, long count) { return new VkExternalFormatQNX(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkExternalFormatQNX.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkExternalFormatQNX.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkExternalFormatQNX.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkExternalFormatQNX.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExternalFormatQNX sTypeAt(long index, @CType("VkStructureType") int value) { VkExternalFormatQNX.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalFormatQNX sType(@CType("VkStructureType") int value) { VkExternalFormatQNX.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkExternalFormatQNX.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkExternalFormatQNX.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkExternalFormatQNX.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkExternalFormatQNX.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExternalFormatQNX pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkExternalFormatQNX.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalFormatQNX pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkExternalFormatQNX.set_pNext(this.segment(), value); return this; }

    /// {@return `externalFormat` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint64_t") long get_externalFormat(MemorySegment segment, long index) { return (long) VH_externalFormat.get(segment, 0L, index); }
    /// {@return `externalFormat`}
    /// @param segment the segment of the struct
    public static @CType("uint64_t") long get_externalFormat(MemorySegment segment) { return VkExternalFormatQNX.get_externalFormat(segment, 0L); }
    /// {@return `externalFormat` at the given index}
    /// @param index the index
    public @CType("uint64_t") long externalFormatAt(long index) { return VkExternalFormatQNX.get_externalFormat(this.segment(), index); }
    /// {@return `externalFormat`}
    public @CType("uint64_t") long externalFormat() { return VkExternalFormatQNX.get_externalFormat(this.segment()); }
    /// Sets `externalFormat` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_externalFormat(MemorySegment segment, long index, @CType("uint64_t") long value) { VH_externalFormat.set(segment, 0L, index, value); }
    /// Sets `externalFormat` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_externalFormat(MemorySegment segment, @CType("uint64_t") long value) { VkExternalFormatQNX.set_externalFormat(segment, 0L, value); }
    /// Sets `externalFormat` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkExternalFormatQNX externalFormatAt(long index, @CType("uint64_t") long value) { VkExternalFormatQNX.set_externalFormat(this.segment(), index, value); return this; }
    /// Sets `externalFormat` with the given value.
    /// @param value the value
    /// @return `this`
    public VkExternalFormatQNX externalFormat(@CType("uint64_t") long value) { VkExternalFormatQNX.set_externalFormat(this.segment(), value); return this; }

}

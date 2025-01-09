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
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### srcAccessMask
/// [VarHandle][#VH_srcAccessMask] - [Getter][#srcAccessMask()] - [Setter][#srcAccessMask(int)]
/// ### dstAccessMask
/// [VarHandle][#VH_dstAccessMask] - [Getter][#dstAccessMask()] - [Setter][#dstAccessMask(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMemoryBarrier {
///     VkStructureType sType;
///     const void * pNext;
///     VkAccessFlags srcAccessMask;
///     VkAccessFlags dstAccessMask;
/// } VkMemoryBarrier;
/// ```
public final class VkMemoryBarrier extends Struct {
    /// The struct layout of `VkMemoryBarrier`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("srcAccessMask"),
        ValueLayout.JAVA_INT.withName("dstAccessMask")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `srcAccessMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_srcAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcAccessMask"));
    /// The [VarHandle] of `dstAccessMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dstAccessMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstAccessMask"));

    /// Creates `VkMemoryBarrier` with the given segment.
    /// @param segment the memory segment
    public VkMemoryBarrier(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMemoryBarrier` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryBarrier of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryBarrier(segment); }

    /// Creates `VkMemoryBarrier` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryBarrier ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryBarrier(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMemoryBarrier` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryBarrier ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryBarrier(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkMemoryBarrier` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryBarrier`
    public static VkMemoryBarrier alloc(SegmentAllocator allocator) { return new VkMemoryBarrier(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMemoryBarrier` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMemoryBarrier`
    public static VkMemoryBarrier alloc(SegmentAllocator allocator, long count) { return new VkMemoryBarrier(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkMemoryBarrier.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkMemoryBarrier.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkMemoryBarrier.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkMemoryBarrier.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrier sTypeAt(long index, @CType("VkStructureType") int value) { VkMemoryBarrier.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrier sType(@CType("VkStructureType") int value) { VkMemoryBarrier.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkMemoryBarrier.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkMemoryBarrier.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkMemoryBarrier.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMemoryBarrier.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrier pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkMemoryBarrier.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrier pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkMemoryBarrier.set_pNext(this.segment(), value); return this; }

    /// {@return `srcAccessMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccessFlags") int get_srcAccessMask(MemorySegment segment, long index) { return (int) VH_srcAccessMask.get(segment, 0L, index); }
    /// {@return `srcAccessMask`}
    /// @param segment the segment of the struct
    public static @CType("VkAccessFlags") int get_srcAccessMask(MemorySegment segment) { return VkMemoryBarrier.get_srcAccessMask(segment, 0L); }
    /// {@return `srcAccessMask` at the given index}
    /// @param index the index
    public @CType("VkAccessFlags") int srcAccessMaskAt(long index) { return VkMemoryBarrier.get_srcAccessMask(this.segment(), index); }
    /// {@return `srcAccessMask`}
    public @CType("VkAccessFlags") int srcAccessMask() { return VkMemoryBarrier.get_srcAccessMask(this.segment()); }
    /// Sets `srcAccessMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_srcAccessMask(MemorySegment segment, long index, @CType("VkAccessFlags") int value) { VH_srcAccessMask.set(segment, 0L, index, value); }
    /// Sets `srcAccessMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_srcAccessMask(MemorySegment segment, @CType("VkAccessFlags") int value) { VkMemoryBarrier.set_srcAccessMask(segment, 0L, value); }
    /// Sets `srcAccessMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrier srcAccessMaskAt(long index, @CType("VkAccessFlags") int value) { VkMemoryBarrier.set_srcAccessMask(this.segment(), index, value); return this; }
    /// Sets `srcAccessMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrier srcAccessMask(@CType("VkAccessFlags") int value) { VkMemoryBarrier.set_srcAccessMask(this.segment(), value); return this; }

    /// {@return `dstAccessMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkAccessFlags") int get_dstAccessMask(MemorySegment segment, long index) { return (int) VH_dstAccessMask.get(segment, 0L, index); }
    /// {@return `dstAccessMask`}
    /// @param segment the segment of the struct
    public static @CType("VkAccessFlags") int get_dstAccessMask(MemorySegment segment) { return VkMemoryBarrier.get_dstAccessMask(segment, 0L); }
    /// {@return `dstAccessMask` at the given index}
    /// @param index the index
    public @CType("VkAccessFlags") int dstAccessMaskAt(long index) { return VkMemoryBarrier.get_dstAccessMask(this.segment(), index); }
    /// {@return `dstAccessMask`}
    public @CType("VkAccessFlags") int dstAccessMask() { return VkMemoryBarrier.get_dstAccessMask(this.segment()); }
    /// Sets `dstAccessMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dstAccessMask(MemorySegment segment, long index, @CType("VkAccessFlags") int value) { VH_dstAccessMask.set(segment, 0L, index, value); }
    /// Sets `dstAccessMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dstAccessMask(MemorySegment segment, @CType("VkAccessFlags") int value) { VkMemoryBarrier.set_dstAccessMask(segment, 0L, value); }
    /// Sets `dstAccessMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrier dstAccessMaskAt(long index, @CType("VkAccessFlags") int value) { VkMemoryBarrier.set_dstAccessMask(this.segment(), index, value); return this; }
    /// Sets `dstAccessMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryBarrier dstAccessMask(@CType("VkAccessFlags") int value) { VkMemoryBarrier.set_dstAccessMask(this.segment(), value); return this; }

}

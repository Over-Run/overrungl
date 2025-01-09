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
/// ### contents
/// [VarHandle][#VH_contents] - [Getter][#contents()] - [Setter][#contents(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSubpassBeginInfo {
///     VkStructureType sType;
///     const void * pNext;
///     VkSubpassContents contents;
/// } VkSubpassBeginInfo;
/// ```
public final class VkSubpassBeginInfo extends Struct {
    /// The struct layout of `VkSubpassBeginInfo`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("contents")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `contents` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_contents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("contents"));

    /// Creates `VkSubpassBeginInfo` with the given segment.
    /// @param segment the memory segment
    public VkSubpassBeginInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSubpassBeginInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassBeginInfo of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSubpassBeginInfo(segment); }

    /// Creates `VkSubpassBeginInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassBeginInfo ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSubpassBeginInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSubpassBeginInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSubpassBeginInfo ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSubpassBeginInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSubpassBeginInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSubpassBeginInfo`
    public static VkSubpassBeginInfo alloc(SegmentAllocator allocator) { return new VkSubpassBeginInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSubpassBeginInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSubpassBeginInfo`
    public static VkSubpassBeginInfo alloc(SegmentAllocator allocator, long count) { return new VkSubpassBeginInfo(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSubpassBeginInfo.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkSubpassBeginInfo.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSubpassBeginInfo.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSubpassBeginInfo.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassBeginInfo sTypeAt(long index, @CType("VkStructureType") int value) { VkSubpassBeginInfo.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassBeginInfo sType(@CType("VkStructureType") int value) { VkSubpassBeginInfo.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("const void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSubpassBeginInfo.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("const void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSubpassBeginInfo.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("const void *") java.lang.foreign.MemorySegment pNext() { return VkSubpassBeginInfo.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSubpassBeginInfo.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassBeginInfo pNextAt(long index, @CType("const void *") java.lang.foreign.MemorySegment value) { VkSubpassBeginInfo.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassBeginInfo pNext(@CType("const void *") java.lang.foreign.MemorySegment value) { VkSubpassBeginInfo.set_pNext(this.segment(), value); return this; }

    /// {@return `contents` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSubpassContents") int get_contents(MemorySegment segment, long index) { return (int) VH_contents.get(segment, 0L, index); }
    /// {@return `contents`}
    /// @param segment the segment of the struct
    public static @CType("VkSubpassContents") int get_contents(MemorySegment segment) { return VkSubpassBeginInfo.get_contents(segment, 0L); }
    /// {@return `contents` at the given index}
    /// @param index the index
    public @CType("VkSubpassContents") int contentsAt(long index) { return VkSubpassBeginInfo.get_contents(this.segment(), index); }
    /// {@return `contents`}
    public @CType("VkSubpassContents") int contents() { return VkSubpassBeginInfo.get_contents(this.segment()); }
    /// Sets `contents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_contents(MemorySegment segment, long index, @CType("VkSubpassContents") int value) { VH_contents.set(segment, 0L, index, value); }
    /// Sets `contents` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_contents(MemorySegment segment, @CType("VkSubpassContents") int value) { VkSubpassBeginInfo.set_contents(segment, 0L, value); }
    /// Sets `contents` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSubpassBeginInfo contentsAt(long index, @CType("VkSubpassContents") int value) { VkSubpassBeginInfo.set_contents(this.segment(), index, value); return this; }
    /// Sets `contents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSubpassBeginInfo contents(@CType("VkSubpassContents") int value) { VkSubpassBeginInfo.set_contents(this.segment(), value); return this; }

}

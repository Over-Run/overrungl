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
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### memoryTypeBits
/// [VarHandle][#VH_memoryTypeBits] - [Getter][#memoryTypeBits()] - [Setter][#memoryTypeBits(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkMemoryHostPointerPropertiesEXT {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t memoryTypeBits;
/// } VkMemoryHostPointerPropertiesEXT;
/// ```
public final class VkMemoryHostPointerPropertiesEXT extends Struct {
    /// The struct layout of `VkMemoryHostPointerPropertiesEXT`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("memoryTypeBits")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `memoryTypeBits` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_memoryTypeBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("memoryTypeBits"));

    /// Creates `VkMemoryHostPointerPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    public VkMemoryHostPointerPropertiesEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkMemoryHostPointerPropertiesEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryHostPointerPropertiesEXT of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryHostPointerPropertiesEXT(segment); }

    /// Creates `VkMemoryHostPointerPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryHostPointerPropertiesEXT ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryHostPointerPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkMemoryHostPointerPropertiesEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkMemoryHostPointerPropertiesEXT ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkMemoryHostPointerPropertiesEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkMemoryHostPointerPropertiesEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkMemoryHostPointerPropertiesEXT`
    public static VkMemoryHostPointerPropertiesEXT alloc(SegmentAllocator allocator) { return new VkMemoryHostPointerPropertiesEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkMemoryHostPointerPropertiesEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkMemoryHostPointerPropertiesEXT`
    public static VkMemoryHostPointerPropertiesEXT alloc(SegmentAllocator allocator, long count) { return new VkMemoryHostPointerPropertiesEXT(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkMemoryHostPointerPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkMemoryHostPointerPropertiesEXT`
    public VkMemoryHostPointerPropertiesEXT asSlice(long index) { return new VkMemoryHostPointerPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkMemoryHostPointerPropertiesEXT`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkMemoryHostPointerPropertiesEXT`
    public VkMemoryHostPointerPropertiesEXT asSlice(long index, long count) { return new VkMemoryHostPointerPropertiesEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkMemoryHostPointerPropertiesEXT.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkMemoryHostPointerPropertiesEXT.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkMemoryHostPointerPropertiesEXT.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkMemoryHostPointerPropertiesEXT.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMemoryHostPointerPropertiesEXT sTypeAt(long index, @CType("VkStructureType") int value) { VkMemoryHostPointerPropertiesEXT.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryHostPointerPropertiesEXT sType(@CType("VkStructureType") int value) { VkMemoryHostPointerPropertiesEXT.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkMemoryHostPointerPropertiesEXT.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkMemoryHostPointerPropertiesEXT.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkMemoryHostPointerPropertiesEXT.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkMemoryHostPointerPropertiesEXT.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMemoryHostPointerPropertiesEXT pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkMemoryHostPointerPropertiesEXT.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryHostPointerPropertiesEXT pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkMemoryHostPointerPropertiesEXT.set_pNext(this.segment(), value); return this; }

    /// {@return `memoryTypeBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_memoryTypeBits(MemorySegment segment, long index) { return (int) VH_memoryTypeBits.get(segment, 0L, index); }
    /// {@return `memoryTypeBits`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_memoryTypeBits(MemorySegment segment) { return VkMemoryHostPointerPropertiesEXT.get_memoryTypeBits(segment, 0L); }
    /// {@return `memoryTypeBits` at the given index}
    /// @param index the index
    public @CType("uint32_t") int memoryTypeBitsAt(long index) { return VkMemoryHostPointerPropertiesEXT.get_memoryTypeBits(this.segment(), index); }
    /// {@return `memoryTypeBits`}
    public @CType("uint32_t") int memoryTypeBits() { return VkMemoryHostPointerPropertiesEXT.get_memoryTypeBits(this.segment()); }
    /// Sets `memoryTypeBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memoryTypeBits(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_memoryTypeBits.set(segment, 0L, index, value); }
    /// Sets `memoryTypeBits` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memoryTypeBits(MemorySegment segment, @CType("uint32_t") int value) { VkMemoryHostPointerPropertiesEXT.set_memoryTypeBits(segment, 0L, value); }
    /// Sets `memoryTypeBits` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkMemoryHostPointerPropertiesEXT memoryTypeBitsAt(long index, @CType("uint32_t") int value) { VkMemoryHostPointerPropertiesEXT.set_memoryTypeBits(this.segment(), index, value); return this; }
    /// Sets `memoryTypeBits` with the given value.
    /// @param value the value
    /// @return `this`
    public VkMemoryHostPointerPropertiesEXT memoryTypeBits(@CType("uint32_t") int value) { VkMemoryHostPointerPropertiesEXT.set_memoryTypeBits(this.segment(), value); return this; }

}

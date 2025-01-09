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
/// ### properties
/// [Byte offset][#OFFSET_properties] - [Memory layout][#ML_properties] - [Getter][#properties()] - [Setter][#properties(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkSparseImageFormatProperties2 {
///     VkStructureType sType;
///     void * pNext;
///     VkSparseImageFormatProperties properties;
/// } VkSparseImageFormatProperties2;
/// ```
public final class VkSparseImageFormatProperties2 extends Struct {
    /// The struct layout of `VkSparseImageFormatProperties2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkSparseImageFormatProperties.LAYOUT.withName("properties")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `properties`.
    public static final long OFFSET_properties = LAYOUT.byteOffset(PathElement.groupElement("properties"));
    /// The memory layout of `properties`.
    public static final MemoryLayout ML_properties = LAYOUT.select(PathElement.groupElement("properties"));

    /// Creates `VkSparseImageFormatProperties2` with the given segment.
    /// @param segment the memory segment
    public VkSparseImageFormatProperties2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSparseImageFormatProperties2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseImageFormatProperties2 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSparseImageFormatProperties2(segment); }

    /// Creates `VkSparseImageFormatProperties2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseImageFormatProperties2 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkSparseImageFormatProperties2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSparseImageFormatProperties2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSparseImageFormatProperties2 ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkSparseImageFormatProperties2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkSparseImageFormatProperties2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSparseImageFormatProperties2`
    public static VkSparseImageFormatProperties2 alloc(SegmentAllocator allocator) { return new VkSparseImageFormatProperties2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSparseImageFormatProperties2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSparseImageFormatProperties2`
    public static VkSparseImageFormatProperties2 alloc(SegmentAllocator allocator, long count) { return new VkSparseImageFormatProperties2(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkSparseImageFormatProperties2.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkSparseImageFormatProperties2.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkSparseImageFormatProperties2.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkSparseImageFormatProperties2.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSparseImageFormatProperties2 sTypeAt(long index, @CType("VkStructureType") int value) { VkSparseImageFormatProperties2.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageFormatProperties2 sType(@CType("VkStructureType") int value) { VkSparseImageFormatProperties2.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkSparseImageFormatProperties2.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkSparseImageFormatProperties2.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkSparseImageFormatProperties2.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkSparseImageFormatProperties2.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSparseImageFormatProperties2 pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkSparseImageFormatProperties2.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageFormatProperties2 pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkSparseImageFormatProperties2.set_pNext(this.segment(), value); return this; }

    /// {@return `properties` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSparseImageFormatProperties") java.lang.foreign.MemorySegment get_properties(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_properties, index), ML_properties); }
    /// {@return `properties`}
    /// @param segment the segment of the struct
    public static @CType("VkSparseImageFormatProperties") java.lang.foreign.MemorySegment get_properties(MemorySegment segment) { return VkSparseImageFormatProperties2.get_properties(segment, 0L); }
    /// {@return `properties` at the given index}
    /// @param index the index
    public @CType("VkSparseImageFormatProperties") java.lang.foreign.MemorySegment propertiesAt(long index) { return VkSparseImageFormatProperties2.get_properties(this.segment(), index); }
    /// {@return `properties`}
    public @CType("VkSparseImageFormatProperties") java.lang.foreign.MemorySegment properties() { return VkSparseImageFormatProperties2.get_properties(this.segment()); }
    /// Sets `properties` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_properties(MemorySegment segment, long index, @CType("VkSparseImageFormatProperties") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_properties, index), ML_properties.byteSize()); }
    /// Sets `properties` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_properties(MemorySegment segment, @CType("VkSparseImageFormatProperties") java.lang.foreign.MemorySegment value) { VkSparseImageFormatProperties2.set_properties(segment, 0L, value); }
    /// Sets `properties` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkSparseImageFormatProperties2 propertiesAt(long index, @CType("VkSparseImageFormatProperties") java.lang.foreign.MemorySegment value) { VkSparseImageFormatProperties2.set_properties(this.segment(), index, value); return this; }
    /// Sets `properties` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSparseImageFormatProperties2 properties(@CType("VkSparseImageFormatProperties") java.lang.foreign.MemorySegment value) { VkSparseImageFormatProperties2.set_properties(this.segment(), value); return this; }

}

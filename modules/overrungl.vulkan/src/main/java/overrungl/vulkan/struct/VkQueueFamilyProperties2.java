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
/// ### queueFamilyProperties
/// [Byte offset][#OFFSET_queueFamilyProperties] - [Memory layout][#ML_queueFamilyProperties] - [Getter][#queueFamilyProperties()] - [Setter][#queueFamilyProperties(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkQueueFamilyProperties2 {
///     VkStructureType sType;
///     void * pNext;
///     VkQueueFamilyProperties queueFamilyProperties;
/// } VkQueueFamilyProperties2;
/// ```
public final class VkQueueFamilyProperties2 extends Struct {
    /// The struct layout of `VkQueueFamilyProperties2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkQueueFamilyProperties.LAYOUT.withName("queueFamilyProperties")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `queueFamilyProperties`.
    public static final long OFFSET_queueFamilyProperties = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyProperties"));
    /// The memory layout of `queueFamilyProperties`.
    public static final MemoryLayout ML_queueFamilyProperties = LAYOUT.select(PathElement.groupElement("queueFamilyProperties"));

    /// Creates `VkQueueFamilyProperties2` with the given segment.
    /// @param segment the memory segment
    public VkQueueFamilyProperties2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkQueueFamilyProperties2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyProperties2 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkQueueFamilyProperties2(segment); }

    /// Creates `VkQueueFamilyProperties2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyProperties2 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkQueueFamilyProperties2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkQueueFamilyProperties2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkQueueFamilyProperties2 ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkQueueFamilyProperties2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkQueueFamilyProperties2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkQueueFamilyProperties2`
    public static VkQueueFamilyProperties2 alloc(SegmentAllocator allocator) { return new VkQueueFamilyProperties2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkQueueFamilyProperties2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkQueueFamilyProperties2`
    public static VkQueueFamilyProperties2 alloc(SegmentAllocator allocator, long count) { return new VkQueueFamilyProperties2(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkQueueFamilyProperties2`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkQueueFamilyProperties2`
    public VkQueueFamilyProperties2 asSlice(long index) { return new VkQueueFamilyProperties2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkQueueFamilyProperties2`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkQueueFamilyProperties2`
    public VkQueueFamilyProperties2 asSlice(long index, long count) { return new VkQueueFamilyProperties2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkQueueFamilyProperties2.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkQueueFamilyProperties2.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkQueueFamilyProperties2.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkQueueFamilyProperties2.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyProperties2 sTypeAt(long index, @CType("VkStructureType") int value) { VkQueueFamilyProperties2.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyProperties2 sType(@CType("VkStructureType") int value) { VkQueueFamilyProperties2.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkQueueFamilyProperties2.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkQueueFamilyProperties2.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkQueueFamilyProperties2.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkQueueFamilyProperties2.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyProperties2 pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkQueueFamilyProperties2.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyProperties2 pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkQueueFamilyProperties2.set_pNext(this.segment(), value); return this; }

    /// {@return `queueFamilyProperties` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkQueueFamilyProperties") java.lang.foreign.MemorySegment get_queueFamilyProperties(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_queueFamilyProperties, index), ML_queueFamilyProperties); }
    /// {@return `queueFamilyProperties`}
    /// @param segment the segment of the struct
    public static @CType("VkQueueFamilyProperties") java.lang.foreign.MemorySegment get_queueFamilyProperties(MemorySegment segment) { return VkQueueFamilyProperties2.get_queueFamilyProperties(segment, 0L); }
    /// {@return `queueFamilyProperties` at the given index}
    /// @param index the index
    public @CType("VkQueueFamilyProperties") java.lang.foreign.MemorySegment queueFamilyPropertiesAt(long index) { return VkQueueFamilyProperties2.get_queueFamilyProperties(this.segment(), index); }
    /// {@return `queueFamilyProperties`}
    public @CType("VkQueueFamilyProperties") java.lang.foreign.MemorySegment queueFamilyProperties() { return VkQueueFamilyProperties2.get_queueFamilyProperties(this.segment()); }
    /// Sets `queueFamilyProperties` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_queueFamilyProperties(MemorySegment segment, long index, @CType("VkQueueFamilyProperties") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_queueFamilyProperties, index), ML_queueFamilyProperties.byteSize()); }
    /// Sets `queueFamilyProperties` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_queueFamilyProperties(MemorySegment segment, @CType("VkQueueFamilyProperties") java.lang.foreign.MemorySegment value) { VkQueueFamilyProperties2.set_queueFamilyProperties(segment, 0L, value); }
    /// Sets `queueFamilyProperties` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyProperties2 queueFamilyPropertiesAt(long index, @CType("VkQueueFamilyProperties") java.lang.foreign.MemorySegment value) { VkQueueFamilyProperties2.set_queueFamilyProperties(this.segment(), index, value); return this; }
    /// Sets `queueFamilyProperties` with the given value.
    /// @param value the value
    /// @return `this`
    public VkQueueFamilyProperties2 queueFamilyProperties(@CType("VkQueueFamilyProperties") java.lang.foreign.MemorySegment value) { VkQueueFamilyProperties2.set_queueFamilyProperties(this.segment(), value); return this; }

}

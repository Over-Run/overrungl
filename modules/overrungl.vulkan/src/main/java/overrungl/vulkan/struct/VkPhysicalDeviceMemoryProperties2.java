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
/// ### memoryProperties
/// [Byte offset][#OFFSET_memoryProperties] - [Memory layout][#ML_memoryProperties] - [Getter][#memoryProperties()] - [Setter][#memoryProperties(java.lang.foreign.MemorySegment)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceMemoryProperties2 {
///     VkStructureType sType;
///     void * pNext;
///     VkPhysicalDeviceMemoryProperties memoryProperties;
/// } VkPhysicalDeviceMemoryProperties2;
/// ```
public final class VkPhysicalDeviceMemoryProperties2 extends Struct {
    /// The struct layout of `VkPhysicalDeviceMemoryProperties2`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        overrungl.vulkan.struct.VkPhysicalDeviceMemoryProperties.LAYOUT.withName("memoryProperties")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The byte offset of `memoryProperties`.
    public static final long OFFSET_memoryProperties = LAYOUT.byteOffset(PathElement.groupElement("memoryProperties"));
    /// The memory layout of `memoryProperties`.
    public static final MemoryLayout ML_memoryProperties = LAYOUT.select(PathElement.groupElement("memoryProperties"));

    /// Creates `VkPhysicalDeviceMemoryProperties2` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceMemoryProperties2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceMemoryProperties2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMemoryProperties2 of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryProperties2(segment); }

    /// Creates `VkPhysicalDeviceMemoryProperties2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMemoryProperties2 ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryProperties2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceMemoryProperties2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceMemoryProperties2 ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceMemoryProperties2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceMemoryProperties2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceMemoryProperties2`
    public static VkPhysicalDeviceMemoryProperties2 alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceMemoryProperties2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceMemoryProperties2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceMemoryProperties2`
    public static VkPhysicalDeviceMemoryProperties2 alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceMemoryProperties2(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceMemoryProperties2.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceMemoryProperties2.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceMemoryProperties2.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceMemoryProperties2.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties2 sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceMemoryProperties2.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties2 sType(@CType("VkStructureType") int value) { VkPhysicalDeviceMemoryProperties2.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceMemoryProperties2.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceMemoryProperties2.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceMemoryProperties2.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryProperties2.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties2 pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryProperties2.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties2 pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryProperties2.set_pNext(this.segment(), value); return this; }

    /// {@return `memoryProperties` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPhysicalDeviceMemoryProperties") java.lang.foreign.MemorySegment get_memoryProperties(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_memoryProperties, index), ML_memoryProperties); }
    /// {@return `memoryProperties`}
    /// @param segment the segment of the struct
    public static @CType("VkPhysicalDeviceMemoryProperties") java.lang.foreign.MemorySegment get_memoryProperties(MemorySegment segment) { return VkPhysicalDeviceMemoryProperties2.get_memoryProperties(segment, 0L); }
    /// {@return `memoryProperties` at the given index}
    /// @param index the index
    public @CType("VkPhysicalDeviceMemoryProperties") java.lang.foreign.MemorySegment memoryPropertiesAt(long index) { return VkPhysicalDeviceMemoryProperties2.get_memoryProperties(this.segment(), index); }
    /// {@return `memoryProperties`}
    public @CType("VkPhysicalDeviceMemoryProperties") java.lang.foreign.MemorySegment memoryProperties() { return VkPhysicalDeviceMemoryProperties2.get_memoryProperties(this.segment()); }
    /// Sets `memoryProperties` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_memoryProperties(MemorySegment segment, long index, @CType("VkPhysicalDeviceMemoryProperties") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_memoryProperties, index), ML_memoryProperties.byteSize()); }
    /// Sets `memoryProperties` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_memoryProperties(MemorySegment segment, @CType("VkPhysicalDeviceMemoryProperties") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryProperties2.set_memoryProperties(segment, 0L, value); }
    /// Sets `memoryProperties` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties2 memoryPropertiesAt(long index, @CType("VkPhysicalDeviceMemoryProperties") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryProperties2.set_memoryProperties(this.segment(), index, value); return this; }
    /// Sets `memoryProperties` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceMemoryProperties2 memoryProperties(@CType("VkPhysicalDeviceMemoryProperties") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceMemoryProperties2.set_memoryProperties(this.segment(), value); return this; }

}

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
/// ### vertexAttributeInstanceRateDivisor
/// [VarHandle][#VH_vertexAttributeInstanceRateDivisor] - [Getter][#vertexAttributeInstanceRateDivisor()] - [Setter][#vertexAttributeInstanceRateDivisor(int)]
/// ### vertexAttributeInstanceRateZeroDivisor
/// [VarHandle][#VH_vertexAttributeInstanceRateZeroDivisor] - [Getter][#vertexAttributeInstanceRateZeroDivisor()] - [Setter][#vertexAttributeInstanceRateZeroDivisor(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceVertexAttributeDivisorFeatures {
///     VkStructureType sType;
///     void * pNext;
///     VkBool32 vertexAttributeInstanceRateDivisor;
///     VkBool32 vertexAttributeInstanceRateZeroDivisor;
/// } VkPhysicalDeviceVertexAttributeDivisorFeatures;
/// ```
public final class VkPhysicalDeviceVertexAttributeDivisorFeatures extends Struct {
    /// The struct layout of `VkPhysicalDeviceVertexAttributeDivisorFeatures`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vertexAttributeInstanceRateDivisor"),
        ValueLayout.JAVA_INT.withName("vertexAttributeInstanceRateZeroDivisor")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `vertexAttributeInstanceRateDivisor` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vertexAttributeInstanceRateDivisor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexAttributeInstanceRateDivisor"));
    /// The [VarHandle] of `vertexAttributeInstanceRateZeroDivisor` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_vertexAttributeInstanceRateZeroDivisor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("vertexAttributeInstanceRateZeroDivisor"));

    /// Creates `VkPhysicalDeviceVertexAttributeDivisorFeatures` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceVertexAttributeDivisorFeatures(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceVertexAttributeDivisorFeatures` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVertexAttributeDivisorFeatures of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexAttributeDivisorFeatures(segment); }

    /// Creates `VkPhysicalDeviceVertexAttributeDivisorFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVertexAttributeDivisorFeatures ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexAttributeDivisorFeatures(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceVertexAttributeDivisorFeatures` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVertexAttributeDivisorFeatures ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVertexAttributeDivisorFeatures(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceVertexAttributeDivisorFeatures` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVertexAttributeDivisorFeatures`
    public static VkPhysicalDeviceVertexAttributeDivisorFeatures alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVertexAttributeDivisorFeatures(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceVertexAttributeDivisorFeatures` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVertexAttributeDivisorFeatures`
    public static VkPhysicalDeviceVertexAttributeDivisorFeatures alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVertexAttributeDivisorFeatures(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkPhysicalDeviceVertexAttributeDivisorFeatures`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkPhysicalDeviceVertexAttributeDivisorFeatures`
    public VkPhysicalDeviceVertexAttributeDivisorFeatures asSlice(long index) { return new VkPhysicalDeviceVertexAttributeDivisorFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkPhysicalDeviceVertexAttributeDivisorFeatures`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkPhysicalDeviceVertexAttributeDivisorFeatures`
    public VkPhysicalDeviceVertexAttributeDivisorFeatures asSlice(long index, long count) { return new VkPhysicalDeviceVertexAttributeDivisorFeatures(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceVertexAttributeDivisorFeatures.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceVertexAttributeDivisorFeatures.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceVertexAttributeDivisorFeatures.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceVertexAttributeDivisorFeatures.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorFeatures sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceVertexAttributeDivisorFeatures.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorFeatures sType(@CType("VkStructureType") int value) { VkPhysicalDeviceVertexAttributeDivisorFeatures.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceVertexAttributeDivisorFeatures.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceVertexAttributeDivisorFeatures.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceVertexAttributeDivisorFeatures.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVertexAttributeDivisorFeatures.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorFeatures pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVertexAttributeDivisorFeatures.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorFeatures pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVertexAttributeDivisorFeatures.set_pNext(this.segment(), value); return this; }

    /// {@return `vertexAttributeInstanceRateDivisor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_vertexAttributeInstanceRateDivisor(MemorySegment segment, long index) { return (int) VH_vertexAttributeInstanceRateDivisor.get(segment, 0L, index); }
    /// {@return `vertexAttributeInstanceRateDivisor`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_vertexAttributeInstanceRateDivisor(MemorySegment segment) { return VkPhysicalDeviceVertexAttributeDivisorFeatures.get_vertexAttributeInstanceRateDivisor(segment, 0L); }
    /// {@return `vertexAttributeInstanceRateDivisor` at the given index}
    /// @param index the index
    public @CType("VkBool32") int vertexAttributeInstanceRateDivisorAt(long index) { return VkPhysicalDeviceVertexAttributeDivisorFeatures.get_vertexAttributeInstanceRateDivisor(this.segment(), index); }
    /// {@return `vertexAttributeInstanceRateDivisor`}
    public @CType("VkBool32") int vertexAttributeInstanceRateDivisor() { return VkPhysicalDeviceVertexAttributeDivisorFeatures.get_vertexAttributeInstanceRateDivisor(this.segment()); }
    /// Sets `vertexAttributeInstanceRateDivisor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertexAttributeInstanceRateDivisor(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_vertexAttributeInstanceRateDivisor.set(segment, 0L, index, value); }
    /// Sets `vertexAttributeInstanceRateDivisor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertexAttributeInstanceRateDivisor(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVertexAttributeDivisorFeatures.set_vertexAttributeInstanceRateDivisor(segment, 0L, value); }
    /// Sets `vertexAttributeInstanceRateDivisor` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorFeatures vertexAttributeInstanceRateDivisorAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVertexAttributeDivisorFeatures.set_vertexAttributeInstanceRateDivisor(this.segment(), index, value); return this; }
    /// Sets `vertexAttributeInstanceRateDivisor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorFeatures vertexAttributeInstanceRateDivisor(@CType("VkBool32") int value) { VkPhysicalDeviceVertexAttributeDivisorFeatures.set_vertexAttributeInstanceRateDivisor(this.segment(), value); return this; }

    /// {@return `vertexAttributeInstanceRateZeroDivisor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_vertexAttributeInstanceRateZeroDivisor(MemorySegment segment, long index) { return (int) VH_vertexAttributeInstanceRateZeroDivisor.get(segment, 0L, index); }
    /// {@return `vertexAttributeInstanceRateZeroDivisor`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_vertexAttributeInstanceRateZeroDivisor(MemorySegment segment) { return VkPhysicalDeviceVertexAttributeDivisorFeatures.get_vertexAttributeInstanceRateZeroDivisor(segment, 0L); }
    /// {@return `vertexAttributeInstanceRateZeroDivisor` at the given index}
    /// @param index the index
    public @CType("VkBool32") int vertexAttributeInstanceRateZeroDivisorAt(long index) { return VkPhysicalDeviceVertexAttributeDivisorFeatures.get_vertexAttributeInstanceRateZeroDivisor(this.segment(), index); }
    /// {@return `vertexAttributeInstanceRateZeroDivisor`}
    public @CType("VkBool32") int vertexAttributeInstanceRateZeroDivisor() { return VkPhysicalDeviceVertexAttributeDivisorFeatures.get_vertexAttributeInstanceRateZeroDivisor(this.segment()); }
    /// Sets `vertexAttributeInstanceRateZeroDivisor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_vertexAttributeInstanceRateZeroDivisor(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_vertexAttributeInstanceRateZeroDivisor.set(segment, 0L, index, value); }
    /// Sets `vertexAttributeInstanceRateZeroDivisor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_vertexAttributeInstanceRateZeroDivisor(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVertexAttributeDivisorFeatures.set_vertexAttributeInstanceRateZeroDivisor(segment, 0L, value); }
    /// Sets `vertexAttributeInstanceRateZeroDivisor` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorFeatures vertexAttributeInstanceRateZeroDivisorAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVertexAttributeDivisorFeatures.set_vertexAttributeInstanceRateZeroDivisor(this.segment(), index, value); return this; }
    /// Sets `vertexAttributeInstanceRateZeroDivisor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVertexAttributeDivisorFeatures vertexAttributeInstanceRateZeroDivisor(@CType("VkBool32") int value) { VkPhysicalDeviceVertexAttributeDivisorFeatures.set_vertexAttributeInstanceRateZeroDivisor(this.segment(), value); return this; }

}
